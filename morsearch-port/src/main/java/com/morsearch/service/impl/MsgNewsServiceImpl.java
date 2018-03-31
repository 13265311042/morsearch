package com.morsearch.service.impl;

import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.FtpUtil;
import com.morsearch.common.util.HttpConnection;
import com.morsearch.dao.Msg_NewsMapper;
import com.morsearch.model.Msg_News;
import com.morsearch.service.CommService;
import com.morsearch.service.MsgNewsService;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by ywh on 2018-3-13.
 */
@Service("MsgNewsService")
public class MsgNewsServiceImpl implements MsgNewsService {

    @Resource
    private Msg_NewsMapper msgNewsMapper;

    @Resource
    private MsgNewsService msgNewsService;

    @Resource
    private CommService commService;

    @Override
    public List<Msg_News> getMsg_NewsList(Map<String, Object> map) {
        return msgNewsMapper.getMsg_NewsList(map);
    }

    @Override
    public int getCountMsg_News(Map<String, Object> map) {
        return msgNewsMapper.getCountMsg_News(map);
    }

    @Override
    public Msg_News getMsg_News(Long id) {
        return msgNewsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Msg_News> getBackMsg_NewsList(Map<String, Object> map) {
        return msgNewsMapper.getBackMsg_NewsList(map);
    }

    @Override
    public Integer getBackCountMsg_News(Map<String, Object> map) {
        return msgNewsMapper.getBackCountMsg_News(map);
    }

    @Override
    public int addMsg_News(Msg_News mn) {
        return msgNewsMapper.insertSelective(mn);
    }

    @Override
    public Msg_News getMsg_NewsDetail(long mn_id, int type) {
        return msgNewsMapper.getMsg_NewsDetail(mn_id, type);
    }

    @Override
    public int updateMsg_News(Msg_News mn) {
        return msgNewsMapper.updateByPrimaryKeySelective(mn);
    }

    @Override
    public int deleteMsg_NewsById(long id) {
        return msgNewsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addMsg_Newsmnclickqty(long id) {
        Msg_News msg_news = new Msg_News();
        Msg_News mn = msgNewsService.getMsg_NewsDetail(id, 1);//查询所有的信息
        msg_news.setMn_id(id);
        if (!CommonUtil.isNullOrEmpty(mn.getMn_clickqty())) {
            msg_news.setMn_clickqty(mn.getMn_clickqty() + 1);
        } else {
            msg_news.setMn_clickqty(1);//如果点击次数为null.就设置为1
        }
        msgNewsMapper.updateByPrimaryKeySelective(msg_news);
        return 0;
    }

    @Override
    public int uploadsmall(MultipartFile myfile, String NewName, String type,Integer compress) throws Exception {
        Properties p = new Properties();
        InputStream is = null;
        is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
        p.load(is);
        String ADDRESS = p.getProperty("FTP_ADDRESS");
        String PORT = p.getProperty("FTP_PORT");
        String USERNAME = p.getProperty("FTP_USERNAME");
        String PASSWORD = p.getProperty("FTP_PASSWORD");

        String LOCATION = "images";
        if ("1".equals(type)) {
            LOCATION = "images";
            if (!myfile.isEmpty()) {
                int port = Integer.parseInt(PORT);
                boolean b = FtpUtil.uploadFile(ADDRESS, port, USERNAME, PASSWORD, LOCATION, NewName, myfile.getInputStream());
                if (b) {
/*调用文档接口 leoli begin */
                    String httppath = commService.getSysConfigValue("pdf_api");
                    if (CommonUtil.isEmpty(httppath) == true) {
                        return 0;
                    }
                    ;/*没设置文档服务器*/
                    httppath = httppath + "/imagesapi?filename=" + NewName+"&compress="+compress;
                    JSONObject jsonObject = new JSONObject(HttpConnection.get(httppath));
                    if ("0".equals(jsonObject.get("status"))) {
                        return 0;
                    }
/*调用文档接口 end*/
                    return 1;
                }
                return 0;
            }
        }
        if ("2".equals(type)) {
            LOCATION = "video";
            if (!myfile.isEmpty()) {
                int port = Integer.parseInt(PORT);
                boolean b = FtpUtil.uploadFile(ADDRESS, port, USERNAME, PASSWORD, LOCATION, NewName, myfile.getInputStream());
                if (b) {
                    return 1;
                }
                return 0;
            }
        }
        return 0;//0表示上传失败,1表示上传成功
    }
}
