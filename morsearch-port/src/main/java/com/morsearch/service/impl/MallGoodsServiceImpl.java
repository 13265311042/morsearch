package com.morsearch.service.impl;

import com.morsearch.common.constant.Constants;
import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.FtpUtil;
import com.morsearch.common.util.HttpConnection;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.dao.MallV_Goods_ListMapper;
import com.morsearch.dao.Mall_GoodsMapper;
import com.morsearch.model.MallV_Goods_List;
import com.morsearch.model.Mall_Goods;
import com.morsearch.service.CommService;
import com.morsearch.service.MallGoodsService;
import com.mysql.jdbc.Security;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by hyt on 2017/12/19.
 */
@Service("MallGoodsService")
public class MallGoodsServiceImpl implements MallGoodsService {

    @Resource
    private Mall_GoodsMapper mall_goodsMapper;

    @Resource
    private MallGoodsService mallGoodsService;

    @Resource
    private MallV_Goods_ListMapper mallV_goods_listMapper;

    @Resource
    private CommService commService;
    @Override
    public Mall_Goods getMall_Goodsdetail(long mg_id, int type) {//type=1,查询部分,type=2查询所有
        return mall_goodsMapper.getMall_Goodsdetail(mg_id, type);
    }

    @Override
    public String saveFile(MultipartFile file) throws Exception  {
        Properties p = new Properties();
        InputStream is = null;
        is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
        p.load(is);
        String ADDRESS = p.getProperty("FTP_ADDRESS");
        String PORT = p.getProperty("FTP_PORT");
        String USERNAME = p.getProperty("FTP_USERNAME");
        String PASSWORD = p.getProperty("FTP_PASSWORD");
        String filename = SequenceCreator.createNewFileName()+".jpg";
        if (!file.isEmpty()) {
            int port = Integer.parseInt(PORT);
            FtpUtil.uploadFile(ADDRESS, port, USERNAME, PASSWORD, "images", filename, file.getInputStream());
        }

        	/*调用图片切割接口 leoli begin */
        String httppath=commService.getSysConfigValue("pdf_api");
        if (CommonUtil.isEmpty(httppath)==true){return  null;};/*没设置文档服务器*/
        httppath=httppath+"/imagesapi?filename="+filename;
        JSONObject jsonObject =new JSONObject(HttpConnection.get(httppath));
        if ("0".equals(jsonObject.get("status"))){return  filename;};

        return filename;
    }

    @Override
    public int addMall_Goods(Mall_Goods mg) {
        return mall_goodsMapper.insertSelective(mg);
    }


    @Override
    public int updateMall_Goods(Mall_Goods mg) {
        return mall_goodsMapper.updateByPrimaryKeySelective(mg);
    }

    @Override
    public List getfilenames(MultipartFile[] files) throws Exception{
        String filename1=null;
        String filename2=null;
        String filename3=null;
        String filename4=null;
        String filename5=null;

        if(files!=null&&files.length<=5){
            System.out.println(files.length);
            if(files.length==5){
                if(files[0].getSize()!=0){
                    MultipartFile file1 = files[0];
                    filename1 = mallGoodsService.saveFile(file1);
                }
                if(files[1].getSize()!=0){
                    MultipartFile file2 = files[1];
                    filename2 = mallGoodsService.saveFile(file2);
                }
                if(files[2].getSize()!=0){
                    MultipartFile file3 = files[2];
                    filename3 = mallGoodsService.saveFile(file3);
                }
                if(files[3].getSize()!=0){
                    MultipartFile file4 = files[3];
                    filename4 = mallGoodsService.saveFile(file4);
                }
                if(files[4].getSize()!=0){
                    MultipartFile file5 = files[4];
                    filename5 = mallGoodsService.saveFile(file5);
                }
            } else{

            }

        }
        List<Object> listfilename = new ArrayList<>();
        listfilename.add(filename1);
        listfilename.add(filename2);
        listfilename.add(filename3);
        listfilename.add(filename4);
        listfilename.add(filename5);

        return listfilename;

    }

    @Override
    public List getupdatefilename(MultipartFile[] files, Mall_Goods mgd) throws Exception{
        //先查出来这几个filename,查询详细信息
        String filename1=mgd.getMg_img1();//求出文件的原始名称
        String filename2=mgd.getMg_img2();
        String filename3=mgd.getMg_img3();
        String filename4=mgd.getMg_img4();//有可能是null
        String filename5=mgd.getMg_img5();

        if(files!=null&&files.length<=5){
            if(files.length==5){
                if(files[0].getSize()!=0){
                    MultipartFile file1 = files[0];
                    filename1 = mallGoodsService.saveFile(file1);
                }
                if(files[1].getSize()!=0){
                    MultipartFile file2 = files[1];
                    filename2 = mallGoodsService.saveFile(file2);
                }
                if(files[2].getSize()!=0){
                    MultipartFile file3 = files[2];
                    filename3 = mallGoodsService.saveFile(file3);
                }
                if(files[3].getSize()!=0){
                    MultipartFile file4 = files[3];
                    filename4 = mallGoodsService.saveFile(file4);
                }
                if(files[4].getSize()!=0){
                    MultipartFile file5 = files[4];
                    filename5 = mallGoodsService.saveFile(file5);
                }
            } else{

            }

        }

        List<Object> list = new ArrayList<>();
        list.add(filename1);
        list.add(filename2);
        list.add(filename3);
        list.add(filename4);
        list.add(filename5);
        return list;
    }

    @Override
    public List<MallV_Goods_List> getMallV_Goods_ListList(Map<String, Object> map) {
        return mallV_goods_listMapper.getMallV_Goods_ListList(map);
    }

    @Override
    public Integer getCountMallV_Goods_List(Map<String, Object> map) {
        return mallV_goods_listMapper.getCountMallV_Goods_List(map);
    }

    @Override
    public int deleteMall_GoodsById(long mg_id) throws IOException{
        //在这里要删除文件
        //这个是假删除
        Mall_Goods mg = mallGoodsService.getMall_Goodsdetail(mg_id, 1);
        Properties p = new Properties();
        int reply;
        InputStream is = null;
        is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
        p.load(is);
        String ADDRESS = p.getProperty("FTP_ADDRESS");
        String PORT = p.getProperty("FTP_PORT");
        String USERNAME = p.getProperty("FTP_USERNAME");
        String PASSWORD = p.getProperty("FTP_PASSWORD");
        FTPClient ftp = new FTPClient();
        ftp.connect(ADDRESS, Integer.valueOf(PORT));// 连接FTP服务器
        // 如果采用默认端口，可以使用ftp.connect(host)的方式直接连接FTP服务器
        ftp.login(USERNAME, PASSWORD);// 登录
        reply = ftp.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            ftp.disconnect();
        }
        String remotePath="images";
        ftp.changeWorkingDirectory(remotePath);// 转移到FTP服务器目录
        //使用流来删除
        if(!CommonUtil.isEmpty( mg.getMg_img1())){//先删掉这些文件
            File file11 = new File("images"+"/" + mg.getMg_img1());
            file11.delete();//删除
        }
        if(!CommonUtil.isEmpty( mg.getMg_img2())){//先删掉这些文件
            File file11 = new File("images"+"/" + mg.getMg_img2());
            file11.delete();//删除
        }
        if(!CommonUtil.isEmpty( mg.getMg_img3())){//先删掉这些文件
            File file11 = new File("images"+"/" + mg.getMg_img3());
            file11.delete();//删除
        }
        if(!CommonUtil.isEmpty( mg.getMg_img4())){//先删掉这些文件
            File file11 = new File("images"+"/" + mg.getMg_img4());
            file11.delete();//删除
        }
        if(!CommonUtil.isEmpty( mg.getMg_img5())){//先删掉这些文件
            File file11 = new File("images"+"/" + mg.getMg_img5());
            file11.delete();//删除
        }
        return mall_goodsMapper.deleteByPrimaryKey(mg_id);
    }

    @Override
    public int updateMall_GoodsByStatus(Mall_Goods mg) {
        return mall_goodsMapper.updateByPrimaryKeySelective(mg);
    }

    @Override
    public List<Mall_Goods> getMall_GoodsListid1(Map<String, Object> map) {
        return mall_goodsMapper.getMall_GoodsListid1(map);
    }

    @Override
    public Integer getCountMall_Goodsid1(Map<String, Object> map) {
        return mall_goodsMapper.getCountMall_Goodsid1(map);
    }

    @Override
    public List<Mall_Goods> getMall_GoodsListid2(Map<String, Object> map) {
        return mall_goodsMapper.getMall_GoodsListid2(map);
    }

    @Override
    public Integer getCountMall_Goodsid2(Map<String, Object> map) {
        return mall_goodsMapper.getCountMall_Goodsid2(map);
    }

}
