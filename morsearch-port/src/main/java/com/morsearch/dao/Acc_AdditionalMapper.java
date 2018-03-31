package com.morsearch.dao;

import com.morsearch.model.Acc_Additional;
import com.morsearch.model.Acc_AdditionalExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Acc_AdditionalMapper {
    int countByExample(Acc_AdditionalExample example);

    int deleteByExample(Acc_AdditionalExample example);

    int deleteByPrimaryKey(Long aa_id);

    int insert(Acc_Additional record);

    int insertSelective(Acc_Additional record);

    List<Acc_Additional> selectByExample(Acc_AdditionalExample example);

    Acc_Additional selectByPrimaryKey(Long aa_id);

    int updateByExampleSelective(@Param("record") Acc_Additional record, @Param("example") Acc_AdditionalExample example);

    int updateByExample(@Param("record") Acc_Additional record, @Param("example") Acc_AdditionalExample example);

    int updateByPrimaryKeySelective(Acc_Additional record);

    int updateByPrimaryKey(Acc_Additional record);





    /*自定义*/
    List<Acc_Additional> getAcc_AdditionalList(Map<String, Object> map);//列表

    int getCountAcc_Additional(Map<String, Object> map);//总数

    Acc_Additional getAcc_AdditionalDesignDetail(@Param("aa_id") long aa_id, @Param("type") int type);
}







