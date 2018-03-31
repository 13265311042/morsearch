package com.morsearch.service.impl;

import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.*;
import com.morsearch.dao.*;
import com.morsearch.model.Pm_Archives;
import com.morsearch.model.Pm_Attach;
import com.morsearch.model.SysV_UserFull;
import com.morsearch.model.Sys_User;
import com.morsearch.service.CommService;
import com.morsearch.service.PmArchivesService;
import com.morsearch.service.RedisService;
import com.morsearch.vo.AppResult;
import com.sun.org.apache.bcel.internal.generic.I2D;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSessionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by ywh on 2017-10-31.
 */

@Service("PmArchivesService")
public class PmArchivesServiceImpl implements PmArchivesService {
    @Resource
    private Pm_ArchivesMapper pmArchivesMapper;
    @Resource
    private Pm_AttachMapper pm_attachMapper;
    @Resource
    private SysV_UserFullMapper sysV_userFullMapper;
    @Resource
    private Sys_UserMapper sys_userMapper;
    @Resource
    private RedisService redisService;
    @Resource
    private CommService commService;

    //获取ip地址
    @Value("${FTP_ADDRESS}")
    private String FTP_ADDRESS;
    //端口号
    @Value("${FTP_PORT}")
    private String FTP_PORT;
    //用户名
    @Value("${FTP_USERNAME}")
    private String FTP_USERNAME;
    //密码
    @Value("${FTP_PASSWORD}")
    private String FTP_PASSWORD;
    //基本路径
    @Value("${FTP_BASEPATH}")
    private String FTP_BASEPATH;

    @Value("${FTP_FUJIAN}")
    private String FTP_FUJIAN;



    @Override
    public int insertSelective(Pm_Archives record) {
        return pmArchivesMapper.insertSelective(record);
    }

    @Override
    public List<Pm_Archives> getPmArchivesList(Map<String, Object> map) {
        return pmArchivesMapper.getPmArchivesList(map);
    }

    @Override
    public List<Pm_Archives> getPmarchives(String title) {
        return pmArchivesMapper.getPmarchives(title);
    }

    @Override
    public Pm_Attach getPmattch(Long id) {
        return pm_attachMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Pm_Archives> getList(Long Id) {
        return pmArchivesMapper.getList(Id);
    }

    @Override
    public Pm_Archives getPm_Archives1(Long id) {
        return pmArchivesMapper.getPm_Archives(id);
    }

    @Override
    public int getPm_Archives(String id,String userid,String createno) {
        String[] s ={id};
        if (id.indexOf("|")>0){
            s= id.split("\\|");};

        if (id.indexOf(";")>0){
            s=id.split("\\;");};
        Pm_Archives pmArchives = new Pm_Archives();
        Sys_User user = new Sys_User();
        Pm_Attach pmAttach = new Pm_Attach();
        for (int i = 0; i < s.length; i++) {
            String S = s[i];
            Pm_Archives pm = pmArchivesMapper.getPm_Archives(Long.valueOf(S));
            pmArchives.setPa_title(pm.getPa_title());
            pmArchives.setPa_major(pm.getPa_major());
            pmArchives.setPa_style(pm.getPa_style());
            pmArchives.setPa_filename(pm.getPa_filename());
            pmArchives.setPa_attachqty(pm.getPa_attachqty());
            pmArchives.setPa_sharepid(pm.getPa_id());
            pmArchives.setPa_flagstop(pm.getPa_flagstop());
            pmArchives.setPa_flagshare(pm.getPa_flagshare());
            pmArchives.setPa_confirmid(pm.getPa_confirmid());
            pmArchives.setPa_confirmno(pm.getPa_confirmno());
            pmArchives.setPa_confirmdate(pm.getPa_confirmdate());
            pmArchives.setPa_status(pm.getPa_status());
            pmArchives.setPa_content(pm.getPa_content());
            pmArchives.setPa_features(pm.getPa_features());
            pmArchives.setPa_companyname(pm.getPa_companyname());
            pmArchives.setPa_companyid(pm.getPa_companyid());
            pmArchives.setPa_createid(Long.valueOf(userid));
            pmArchives.setPa_createno(createno);
            pmArchives.setPa_createdate(new Date());
            pmArchives.setPa_flagnews(false);
            pmArchivesMapper.insertSelective(pmArchives);

            List<Pm_Attach> pm_attaches = pm_attachMapper.selectByPrimaryname(pm.getPa_id());
            for (int ii = 0; ii < pm_attaches.size(); ii++) {
                pmAttach.setAa_filename(pm_attaches.get(ii).getAa_filename());
                pmAttach.setAa_filetype(pm_attaches.get(ii).getAa_filetype());
                pmAttach.setAa_filetitle(pm_attaches.get(ii).getAa_filetitle());
                pmAttach.setAa_archivesid(pmArchives.getPa_id());
                pmAttach.setAa_pagecount(pm_attaches.get(ii).getAa_pagecount());
                pmAttach.setAa_createdate(pm_attaches.get(ii).getAa_createdate());
                pm_attachMapper.insertSelective(pmAttach);
                pmAttach.setAa_id(pmAttach.getAa_id()+1+ii);

            }
            pmArchives.setPa_id(pmArchives.getPa_id()+1+i);
        }
                   Sys_User ur =  sys_userMapper.selectByPrimaryKey(Long.valueOf(userid));
                    ur.setUr_msgflag3(true);
        return  sys_userMapper.updateByPrimaryKeySelective(ur);

    }

    @Override
    public int updateByPrimaryKeySelective(Long id, String title, String major, String style, String features, String content, List<MultipartFile> files) {

        Pm_Attach pmAttach = new Pm_Attach();
        AppResult appresult = new AppResult();
        Random ne=new Random();
        Pm_Archives pmArchives =  pmArchivesMapper.selectByPrimaryKey(id);
        pmArchives.setPa_major(major);
        pmArchives.setPa_title(title);
        pmArchives.setPa_style(style);
        pmArchives.setPa_features(features);
        pmArchives.setPa_content(content);
        pmArchives.setPa_flagstop(false);


        int rut = 0;
        rut = pmArchivesMapper.updateByPrimaryKeySelective(pmArchives);
        if (pmArchives != null) {
        };

       File f1 = new File(Constants.FILE_FUJIAN+"/");
        if (!f1.exists())
            f1.mkdirs();
        Long ii=0L;
        for (int i = 0; i < files.size(); i++) {
            //获得原始文件名
            String fileName1 = files.get(i).getOriginalFilename();
            String ext = fileName1.substring(fileName1.lastIndexOf(".") + 1).toUpperCase();
            // 新文件名
            String newFileName1 = SequenceCreator.createNewFileName()+(ne.nextInt(9999-1000+1)+1000);
            String newname1 = newFileName1 +"."+ext;
            if (fileName1.endsWith(".pdf") || fileName1.endsWith(".cad") || fileName1.endsWith(".bim")||fileName1.endsWith(".dwg") || fileName1.endsWith(".dxf") || fileName1.endsWith(".dgn")||fileName1.endsWith(".acis") || fileName1.endsWith(".fbx") || fileName1.endsWith(".nwc")||fileName1.endsWith(".rfa") || fileName1.endsWith(".rvt") || fileName1.endsWith(".sat")){
                pmAttach.setAa_filetype(fileName1.substring(fileName1.length()-4));
                pmAttach.setAa_filetitle(fileName1.substring(0,fileName1.length()-4));
            }
            pmAttach.setAa_filename(newFileName1);
            pmAttach.setAa_createdate(new Date());
            pmAttach.setAa_archivesid(id);
            if (ii != 0) {
                pmAttach.setAa_id(ii + 1);
            }
            if (pmAttach != null) {
                pmAttach.setAa_archivesid(pmArchives.getPa_id());
                rut += pm_attachMapper.insertSelective(pmAttach);
                ii = pmAttach.getAa_id()+i;
            }
            if (!files.get(i).isEmpty()) {
                try {
                    /*FileOutputStream fos = new FileOutputStream(Constants.FILE_FUJIAN+"/"
                            + newname1);
                    InputStream in = files.get(i).getInputStream();
                    int b = 0;
                    while ((b = in.read()) != -1) {
                        fos.write(b);
                    }
                    fos.close();
                    in.close();*/

                    int port = Integer.parseInt(FTP_PORT);
                    //调用方法，上传文件
                    boolean result = FtpUtil.uploadFile(FTP_ADDRESS,port,FTP_USERNAME,FTP_PASSWORD,"accessory", newname1, files.get(i).getInputStream());
                    //判断是否上传成功
                    if (!result) {
                        appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                        appresult.setMessage("附件上传");
                    }
                } catch (Exception e) {
                    appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                    appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
                }
            }
        }
        return  rut;
    }

    @Override
    public int updateByPrimaryKey(Pm_Archives record) {
        return pmArchivesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int addtPmArchives(ApplicationContext Context,String title, String major, String style, String features, String content
            , Long ur_id, String createno,CommonsMultipartFile file,List<MultipartFile> files) {
        Pm_Attach pmAttach = new Pm_Attach();
        AppResult appresult = new AppResult();
        Random ne=new Random();
        Date date = new Date();
        String imagePath ="";
        String path = Constants.FILE_PDF+"/";
        String fileName = file.getOriginalFilename();

        // 新文件名
        String newFileName = SequenceCreator.createNewFileName()+(ne.nextInt(9999-1000+1)+1000);
        String newName = newFileName+".pdf";
        Pm_Archives pmArchives = new Pm_Archives();
        pmArchives.setPa_title(title);
        pmArchives.setPa_style(style);
        pmArchives.setPa_major(major);
        pmArchives.setPa_content(content);
        pmArchives.setPa_features(features);
        pmArchives.setPa_filename(newFileName);
        pmArchives.setPa_createdate(new Date());
        pmArchives.setPa_createid(ur_id);
        pmArchives.setPa_createno(createno);
        File f = new File(path);
        String path1 = f.getAbsolutePath();
        if (!f.exists())
            f.mkdirs();
        if (!file.isEmpty()) {
            try {
                //端口号
               int port = Integer.parseInt(FTP_PORT);

               //调用方法，上传文件
              boolean result = FtpUtil.uploadFile(FTP_ADDRESS,port,
                       FTP_USERNAME, FTP_PASSWORD, "pdf",
                      newName, file.getInputStream());

               //判断是否上传成功
               if (!result) {
                   appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                  appresult.setMessage("主文件上传失败");

               }
            } catch (Exception e) {
                appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                appresult.setMessage("主文件上传失败");
                return 0;
            }
        }
        int rut = 0;
        if (pmArchives != null) {
            rut = pmArchivesMapper.insertSelective(pmArchives);
        };

/*
        PdfboxUtil app = new PdfboxUtil();
        new File(Constants.FILE_IMAGES_PDF+"/"+pmArchives.getPa_id()).mkdir();
        int x =  app.pdf2img(path+newName,Constants.FILE_IMAGES_PDF+"/"+pmArchives.getPa_id()+"/",app.IMG_TYPE_PNG);
        pmArchives.setPa_pagecount(x);
        pmArchivesMapper.updateByPrimaryKey(pmArchives);
*/

        File f1 = new File(Constants.FILE_FUJIAN+"/");
        if (!f1.exists()) {
            f1.mkdirs();
        }

            Long ii = 0L;
            int X = 0;
            for (int i = 0; i < files.size(); i++) {
                X=i+1;
                //获得原始文件名
                String fileName1 = files.get(i).getOriginalFilename();
                String ext = fileName1.substring(fileName1.lastIndexOf(".") + 1).toUpperCase();
                // 新文件名
                String newFileName1  = SequenceCreator.createNewFileName()+(ne.nextInt(9999-1000+1)+1000);
                String newname1 = newFileName1 +"."+ext;
                if (fileName1.endsWith(".pdf") || fileName1.endsWith(".cad") || fileName1.endsWith(".bim")||fileName1.endsWith(".dwg") || fileName1.endsWith(".dxf") || fileName1.endsWith(".dgn")||fileName1.endsWith(".acis") || fileName1.endsWith(".fbx") || fileName1.endsWith(".nwc")||fileName1.endsWith(".rfa") || fileName1.endsWith(".rvt") || fileName1.endsWith(".sat")) {
                    pmAttach.setAa_filetype(fileName1.substring(fileName1.length() - 4));
                    pmAttach.setAa_filetitle(fileName1.substring(0, fileName1.length() - 4));
                }
                pmAttach.setAa_filename(newFileName1);
                pmAttach.setAa_createdate(new Date());

                if (ii != 0) {
                    pmAttach.setAa_id(ii + 1);
                }
                if (pmAttach != null) {
                    pmAttach.setAa_archivesid(pmArchives.getPa_id());
                    rut += pm_attachMapper.insertSelective(pmAttach);
                    ii = pmAttach.getAa_id()+i;
                }
                if (!files.get(i).isEmpty()) {
                    try {
                       // path = Constants.FILE_FUJIAN + "/" + newname1;
                        int port = Integer.parseInt(FTP_PORT);
                        //调用方法，上传文件
                        boolean result = FtpUtil.uploadFile(FTP_ADDRESS,port,FTP_USERNAME,FTP_PASSWORD,"accessory", newname1, files.get(i).getInputStream());
                        //判断是否上传成功
                        if (!result) {
                            appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                            appresult.setMessage("附件上传");
                        }

                    } catch (Exception e) {
                        appresult.setStatus(Constants.RESULT_STATUS_FAIL);
                        appresult.setMessage(Constants.RESULT_MESSAGE_UNUSUAL);
                    }
                }
            }
        pmArchives.setPa_attachqty(X);
        pmArchivesMapper.updateByPrimaryKeySelective(pmArchives);

/*调用文档接口 leoli begin */
        try {
            String httppath = commService.getSysConfigValue("pdf_api");
            if (CommonUtil.isEmpty(httppath) == false) { /*设置文档服务器*/
                httppath = httppath + "/archivesapi?filename=" +pmArchives.getPa_filename()+ "&fid=" +pmArchives.getPa_id();
                JSONObject jsonObject =new JSONObject(HttpConnection.get(httppath));
                if ("0".equals(jsonObject.get("status"))) { /*页数在文档保存*/
                };
            }
        }catch (Exception e) {
                e.printStackTrace();
            }
/*调用文档接口 end*/
        return rut;
    }

    @Override
    public int getPmArchivesListCount(Map<String, Object> map) {
        return pmArchivesMapper.getPmArchivesListCount(map);
    }


    @Override
    public List<Pm_Archives> getPm_ArchivesList(Map<String, Object> map) {
        return pmArchivesMapper.getPm_ArchivesList(map);
    }

    @Override
    public int getCountPm_Archives(Map<String, Object> map) {
        return pmArchivesMapper.getCountPm_Archives(map);
    }

    @Override
    public int  updatePm_Archives(Pm_Archives record) {
        return pmArchivesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Pm_Archives getArchivesDetail(Long paid, int type) {
        return pmArchivesMapper.getArchivesDetail(paid,type);
    }

    @Override
    public List<Long> getPm_Archivesidlist() {
        return pmArchivesMapper.getPm_Archivesidlist();
    }

    @Override
    public List<Pm_Archives> getPm_ArchivesListid(Map<String, Object> map) {
        return pmArchivesMapper.getPm_ArchivesListid(map);
    }

    @Override
    public Integer getCountPm_Archivesid(Map<String, Object> map) {
        return pmArchivesMapper.getCountPm_Archivesid(map);
    }

    @Override
    public List<Map<String, Object>> getPm_Archivesidnocut() {
        return pmArchivesMapper.getPm_Archivesidnocut();
    }




};







