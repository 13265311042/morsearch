package com.morsearch.dao;

import com.morsearch.model.Acc_MemoCoin;
import com.morsearch.model.Acc_MemoCoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Acc_MemoCoinMapper {
    int countByExample(Acc_MemoCoinExample example);

    int deleteByExample(Acc_MemoCoinExample example);

    int deleteByPrimaryKey(Long orderid);

    int insert(Acc_MemoCoin record);

    int insertSelective(Acc_MemoCoin record);

    List<Acc_MemoCoin> selectByExample(Acc_MemoCoinExample example);

    Acc_MemoCoin selectByPrimaryKey(Long orderid);

    int updateByExampleSelective(@Param("record") Acc_MemoCoin record, @Param("example") Acc_MemoCoinExample example);

    int updateByExample(@Param("record") Acc_MemoCoin record, @Param("example") Acc_MemoCoinExample example);

    int updateByPrimaryKeySelective(Acc_MemoCoin record);

    int updateByPrimaryKey(Acc_MemoCoin record);
}