package com.morsearch.dao;

import com.morsearch.model.AccV_Deposit;
import com.morsearch.model.AccV_DepositExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccV_DepositMapper {
    int countByExample(AccV_DepositExample example);

    int deleteByExample(AccV_DepositExample example);

    int insert(AccV_Deposit record);

    int insertSelective(AccV_Deposit record);

    List<AccV_Deposit> selectByExample(AccV_DepositExample example);

    int updateByExampleSelective(@Param("record") AccV_Deposit record, @Param("example") AccV_DepositExample example);

    int updateByExample(@Param("record") AccV_Deposit record, @Param("example") AccV_DepositExample example);
}