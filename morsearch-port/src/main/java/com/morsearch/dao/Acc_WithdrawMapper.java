package com.morsearch.dao;

import com.morsearch.model.Acc_Withdraw;
import com.morsearch.model.Acc_WithdrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Acc_WithdrawMapper {
    int countByExample(Acc_WithdrawExample example);

    int deleteByExample(Acc_WithdrawExample example);

    int insert(Acc_Withdraw record);

    int insertSelective(Acc_Withdraw record);

    List<Acc_Withdraw> selectByExample(Acc_WithdrawExample example);

    int updateByExampleSelective(@Param("record") Acc_Withdraw record, @Param("example") Acc_WithdrawExample example);

    int updateByExample(@Param("record") Acc_Withdraw record, @Param("example") Acc_WithdrawExample example);
}