package com.morsearch.dao;

import com.morsearch.model.Acc_Deposit;
import com.morsearch.model.Acc_DepositExample;
import com.morsearch.model.Acc_DepositKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Acc_DepositMapper {
    int countByExample(Acc_DepositExample example);

    int deleteByExample(Acc_DepositExample example);

    int deleteByPrimaryKey(Acc_DepositKey key);

    int insert(Acc_Deposit record);

    int insertSelective(Acc_Deposit record);

    List<Acc_Deposit> selectByExample(Acc_DepositExample example);

    Acc_Deposit selectByPrimaryKey(Acc_DepositKey key);

    int updateByExampleSelective(@Param("record") Acc_Deposit record, @Param("example") Acc_DepositExample example);

    int updateByExample(@Param("record") Acc_Deposit record, @Param("example") Acc_DepositExample example);

    int updateByPrimaryKeySelective(Acc_Deposit record);

    int updateByPrimaryKey(Acc_Deposit record);

}