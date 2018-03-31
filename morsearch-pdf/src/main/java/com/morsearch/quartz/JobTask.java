package com.morsearch.quartz;

import com.morsearch.db.JdbcExec;
import com.morsearch.redis.RedisUtil;
import com.morsearch.util.Constants;
import com.morsearch.util.DateTimeUtil;
import com.morsearch.util.ImageTools;
import com.morsearch.util.PdfboxUtil;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * Created by hyt on 2017/12/28.
 */
public class JobTask {
   // private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
   private Boolean bing=false;


    public void saveSaleOrderStatus() {
        Date date_now= DateTimeUtil.longconvertdate(System.currentTimeMillis()/1000);
    //    testjdbc.test();
        if (bing==true){ return;}else{bing=true;};/*处理异步时的选择*/

/*处理文档切割*/
     //   RedisUtil.saveListRow(Constants.REDIS_ARCHIVES,"2018010215352725502021.pdf,3833");
        List<String> lsv=RedisUtil.getListValue(Constants.REDIS_ARCHIVES);/*读取明细*/
        if (lsv.size()>0){
            System.out.println(DateTimeUtil.getStrFormat(DateTimeUtil.addDay(date_now,1),"yyyy-MM-dd")+","+Constants.REDIS_ARCHIVES);
            fn_prs_archives(lsv);/*处理文档*/
        };
/*处理个人图像切割*/
        //   RedisUtil.saveListRow(Constants.REDIS_ARCHIVES,"2018010215352725502021.pdf,3833");
        List<String> lsp=RedisUtil.getListValue(Constants.REDIS_PERSONIMAGE);/*读取明细*/
        if (lsp.size()>0){
            System.out.println(DateTimeUtil.getStrFormat(DateTimeUtil.addDay(date_now,1),"yyyy-MM-dd")+","+Constants.REDIS_PERSONIMAGE);
            fn_prs_images(lsp);
        };




        bing=false;



    };

/*处理切割*/
    private  void fn_prs_archives(List<String> lsv){
        int icount=lsv.size();
        String svalue="";
        String sid="";
        String sfilename="";
        PdfboxUtil app = new PdfboxUtil();
        for (int ii=0;ii<icount;ii++) {
            svalue=lsv.get(ii);
            sid=svalue.split(",")[1];
            sfilename=svalue.split(",")[0];
            if (sfilename.toString().contains(".pdf")==false){sfilename=sfilename+".pdf";};
            new File(Constants.FILE_IMAGES_PDF+"/"+sid).mkdir();
            int pagecount =app.PDF2ImagPDFbox(Constants.FILE_PDF+"/"+sfilename,Constants.FILE_IMAGES_PDF+"/",sid+"/",app.IMG_TYPE_PNG);
            if (pagecount>0){
                Boolean rut=JdbcExec.sqlexec("update Pm_Archives set pa_pagecount="+pagecount+" where pa_id="+sid);
                if (rut==true){RedisUtil.removeListRow(Constants.REDIS_ARCHIVES,svalue);};
            }else{
                RedisUtil.removeListRow(Constants.REDIS_ARCHIVES,svalue);
                RedisUtil.saveListRow(Constants.REDIS_ARCHIVES+"_fail",svalue);
            };
//            System.out.println(lsv.get(ii));
        };

    };


    /*处理切割*/
    private  void fn_prs_images(List<String> lsp) {
        int icountp = lsp.size();
        String svaluep = "";
        String sidp = "";
        String sfilenamep = "";
        for (int ii = 0; ii < icountp; ii++) {
            svaluep = lsp.get(ii);
            sidp = svaluep.split(",")[1];
            sfilenamep = svaluep.split(",")[0];
            String itrut = ImageTools.scaleImageL(Constants.FILE_IMAGES + "/" + sfilenamep, Constants.FILE_IMAGES + "/small/" + sfilenamep, 30);
            RedisUtil.removeListRow(Constants.REDIS_PERSONIMAGE, svaluep);
            if (!"succ".equals(itrut)) {
                RedisUtil.saveListRow(Constants.REDIS_PERSONIMAGE + "_fail", svaluep);
            };
        };
    };



    }
