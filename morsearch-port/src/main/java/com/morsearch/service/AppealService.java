package com.morsearch.service;

import com.morsearch.model.Sales_Appeal;
import com.morsearch.model.Sales_AppealExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by ywh on 2017-10-25.
 */
public interface AppealService {

    int countByExample(Sales_AppealExample example);

    int deleteByExample(Sales_AppealExample example);

    int deleteByPrimaryKey(Long sp_id);

    int insert(Sales_Appeal record);

    int insertSelective(String no, String contentgroup, String contentvalue, Date Date, Long id, String createno);

    List<Sales_Appeal> selectByExample(Sales_AppealExample example);

    Sales_Appeal selectByPrimaryKey(Long sp_id);

    int updateByExampleSelective(@Param("record") Sales_Appeal record, @Param("example") Sales_AppealExample example);

    int updateByExample(@Param("record") Sales_Appeal record, @Param("example") Sales_AppealExample example);

    int updateByPrimaryKeySelective(Sales_Appeal record);

    int updateByPrimaryKey(Sales_Appeal record);

    Sales_Appeal selectByPrimaryNo(String orderno);
}
