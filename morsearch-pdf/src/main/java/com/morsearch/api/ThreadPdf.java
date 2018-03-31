package com.morsearch.api;

import com.morsearch.db.JdbcExec;
import com.morsearch.redis.RedisUtil;
import com.morsearch.util.Constants;
import com.morsearch.util.PdfboxUtil;

import java.io.File;

/**
 * Created by hyt on 2018/1/6.
 */
class ThreadPdf extends Thread {
    private String filename;
    private String fid;


    public ThreadPdf(String filename, String fid) {
        this.filename = filename;
        this.fid = fid;
    }
    public void run() {
        int pagecount = 0;
        boolean flag=true;
        try {

            PdfboxUtil app = new PdfboxUtil();
            if (filename.toString().contains(".pdf")==false){filename=filename+".pdf";};
            pagecount =app.PDF2ImagPDFbox(Constants.FILE_PDF+"/"+filename,Constants.FILE_IMAGES_PDF+"/",fid,app.IMG_TYPE_PNG)    ;
            if (pagecount>0){
                flag= JdbcExec.sqlexec("update Pm_Archives set pa_pagecount="+pagecount+" where pa_id="+fid);
                RedisUtil.removeMapRow(Constants.REDIS_ARCHIVES,fid);
            }else{
                flag=false;
            };
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ;
    }


}
