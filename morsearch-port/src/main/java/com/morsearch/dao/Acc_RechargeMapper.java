package com.morsearch.dao;

import com.morsearch.model.Acc_Recharge;
import com.morsearch.model.Acc_RechargeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Acc_RechargeMapper {
    int countByExample(Acc_RechargeExample example);

    int deleteByExample(Acc_RechargeExample example);

    int deleteByPrimaryKey(Long ar_id);

    int insert(Acc_Recharge record);

    int insertSelective(Acc_Recharge record);

    List<Acc_Recharge> selectByExample(Acc_RechargeExample example);

    Acc_Recharge selectByPrimaryKey(Long ar_id);

    int updateByExampleSelective(@Param("record") Acc_Recharge record, @Param("example") Acc_RechargeExample example);

    int updateByExample(@Param("record") Acc_Recharge record, @Param("example") Acc_RechargeExample example);

    int updateByPrimaryKeySelective(Acc_Recharge record);

    int updateByPrimaryKey(Acc_Recharge record);

    //自定义
    List<Acc_Recharge> getAcc_RechargeList(Map<String, Object> map);//余额充值列表

    int getCountAcc_Recharge(Map<String, Object> map);//余额充值数量
}