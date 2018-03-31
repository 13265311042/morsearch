package com.morsearch.dao;

import com.morsearch.model.Msg_News;
import com.morsearch.model.Msg_NewsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Msg_NewsMapper {
    int countByExample(Msg_NewsExample example);

    int deleteByExample(Msg_NewsExample example);

    int deleteByPrimaryKey(Long mn_id);

    int insert(Msg_News record);

    int insertSelective(Msg_News record);

    List<Msg_News> selectByExampleWithBLOBs(Msg_NewsExample example);

    List<Msg_News> selectByExample(Msg_NewsExample example);

    Msg_News selectByPrimaryKey(Long mn_id);

    int updateByExampleSelective(@Param("record") Msg_News record, @Param("example") Msg_NewsExample example);

    int updateByExampleWithBLOBs(@Param("record") Msg_News record, @Param("example") Msg_NewsExample example);

    int updateByExample(@Param("record") Msg_News record, @Param("example") Msg_NewsExample example);

    int updateByPrimaryKeySelective(Msg_News record);

    int updateByPrimaryKeyWithBLOBs(Msg_News record);

    int updateByPrimaryKey(Msg_News record);


/*自定义*/
    List<Msg_News> getMsg_NewsList(Map<String, Object> map);//列表

    int getCountMsg_News(Map<String, Object> map);//总数

    List<Msg_News> getBackMsg_NewsList(Map<String, Object> map);//后台列表

    Integer getBackCountMsg_News(Map<String, Object> map);//后台总数

    Msg_News getMsg_NewsDetail(@Param("mn_id") Long mn_id, @Param("type") int type);/*获取资讯的明细,type=1,获取* */
}