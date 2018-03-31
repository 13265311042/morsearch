package com.morsearch.dao;

import com.morsearch.model.AccV_MemoAmt;
import com.morsearch.model.AccV_MemoAmtExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AccV_MemoAmtMapper {
    int countByExample(AccV_MemoAmtExample example);

    int deleteByExample(AccV_MemoAmtExample example);

    int insert(AccV_MemoAmt record);

    int insertSelective(AccV_MemoAmt record);

    List<AccV_MemoAmt> selectByExample(AccV_MemoAmtExample example);

    int updateByExampleSelective(@Param("record") AccV_MemoAmt record, @Param("example") AccV_MemoAmtExample example);

    int updateByExample(@Param("record") AccV_MemoAmt record, @Param("example") AccV_MemoAmtExample example);



    /*自定义*/

    List<AccV_MemoAmt> getAccV_MemoAmtlist(Map<String, Object> map);//列表

    int getCountAccV_MemoAmt(Map<String, Object> map);//总数
}