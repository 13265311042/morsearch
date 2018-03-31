package com.morsearch.dao;

import com.morsearch.model.Acc_MemoIntegral;
import com.morsearch.model.Acc_MemoIntegralExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Acc_MemoIntegralMapper {
    int countByExample(Acc_MemoIntegralExample example);

    int deleteByExample(Acc_MemoIntegralExample example);

    int deleteByPrimaryKey(Long mi_id);

    int insert(Acc_MemoIntegral record);

    int insertSelective(Acc_MemoIntegral record);

    List<Acc_MemoIntegral> selectByExample(Acc_MemoIntegralExample example);

    Acc_MemoIntegral selectByPrimaryKey(Long mi_id);

    int updateByExampleSelective(@Param("record") Acc_MemoIntegral record, @Param("example") Acc_MemoIntegralExample example);

    int updateByExample(@Param("record") Acc_MemoIntegral record, @Param("example") Acc_MemoIntegralExample example);

    int updateByPrimaryKeySelective(Acc_MemoIntegral record);

    int updateByPrimaryKey(Acc_MemoIntegral record);



/*自定义*/
    List<Acc_MemoIntegral> getAcc_MemoIntegralList(Map<String, Object> map); //列表

    int getCountAcc_MemoIntegral(Map<String, Object> map);//数量
}