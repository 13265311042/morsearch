package com.morsearch.service;

import com.morsearch.model.Msg_News;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2018-3-13.
 */
public interface MsgNewsService {

    List<Msg_News> getMsg_NewsList(Map<String, Object> map);//列表

    int getCountMsg_News(Map<String, Object> map);//总数

    Msg_News getMsg_News(Long id);

    List<Msg_News> getBackMsg_NewsList(Map<String, Object> map);//后台列表

    Integer getBackCountMsg_News(Map<String, Object> map);//后台总数

    int addMsg_News(Msg_News mn);//添加资讯

    Msg_News getMsg_NewsDetail(long mn_id, int type);//得到资讯的详细信息

    int updateMsg_News(Msg_News mn);//更新资讯

    int deleteMsg_NewsById(long id);//删除资讯

    int addMsg_Newsmnclickqty(long id);//点击次数添加

    int uploadsmall(MultipartFile myfile, String NewName, String type,Integer compress) throws Exception;//可以上传压缩图片的方法
}
