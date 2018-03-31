package com.morsearch.dao;

import com.morsearch.model.AccV_MemoAmt;
import com.morsearch.model.Acc_MemoAmt;
import com.morsearch.model.Acc_MemoAmtExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Acc_MemoAmtMapper {
    int countByExample(Acc_MemoAmtExample example);

    int deleteByExample(Acc_MemoAmtExample example);

    int deleteByPrimaryKey(Long orderid);

    int insert(Acc_MemoAmt record);

    int insertSelective(Acc_MemoAmt record);

    List<Acc_MemoAmt> selectByExample(Acc_MemoAmtExample example);

    Acc_MemoAmt selectByPrimaryKey(Long orderid);

    int updateByExampleSelective(@Param("record") Acc_MemoAmt record, @Param("example") Acc_MemoAmtExample example);

    int updateByExample(@Param("record") Acc_MemoAmt record, @Param("example") Acc_MemoAmtExample example);

    int updateByPrimaryKeySelective(Acc_MemoAmt record);

    int updateByPrimaryKey(Acc_MemoAmt record);


}