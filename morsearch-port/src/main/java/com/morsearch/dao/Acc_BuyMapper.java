package com.morsearch.dao;

import com.morsearch.model.Acc_Buy;
import com.morsearch.model.Acc_BuyExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Acc_BuyMapper {
    int countByExample(Acc_BuyExample example);

    int deleteByExample(Acc_BuyExample example);

    int deleteByPrimaryKey(Long ab_id);

    int insert(Acc_Buy record);

    int insertSelective(Acc_Buy record);

    List<Acc_Buy> selectByExample(Acc_BuyExample example);

    Acc_Buy selectByPrimaryKey(Long ab_id);

    Acc_Buy selectByNo(@Param("ab_no") String ab_no);/*根据订单号获取明细*/

    int updateByExampleSelective(@Param("record") Acc_Buy record, @Param("example") Acc_BuyExample example);

    int updateByExample(@Param("record") Acc_Buy record, @Param("example") Acc_BuyExample example);

    int updateByPrimaryKeySelective(Acc_Buy record);

    int updateByPrimaryKey(Acc_Buy record);

    /*自定义*/
    List<Acc_Buy> getAcc_BuyList(Map<String, Object> map);

    int getCountAcc_Buy(Map<String, Object> map);
}