package com.morsearch.dao;

import com.morsearch.model.Acc_Largess;
import com.morsearch.model.Acc_LargessExample;
import com.morsearch.model.Acc_LargessKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Acc_LargessMapper {
    int countByExample(Acc_LargessExample example);

    int deleteByExample(Acc_LargessExample example);

    int deleteByPrimaryKey(Acc_LargessKey key);

    int insert(Acc_Largess record);

    int insertSelective(Acc_Largess record);

    List<Acc_Largess> selectByExample(Acc_LargessExample example);

    Acc_Largess selectByPrimaryKey(Acc_LargessKey key);

    int updateByExampleSelective(@Param("record") Acc_Largess record, @Param("example") Acc_LargessExample example);

    int updateByExample(@Param("record") Acc_Largess record, @Param("example") Acc_LargessExample example);

    int updateByPrimaryKeySelective(Acc_Largess record);

    int updateByPrimaryKey(Acc_Largess record);


    List<Acc_Largess> getAcc_LargessList(Map<String, Object> map); //列表

    int getCountAcc_Largess(Map<String, Object> map);//数量

    Acc_Largess getAcc_Largess(Long id);

    int deleteByAcc_Largess(int id);
}