package com.morsearch.dao;

import com.morsearch.model.Pm_Style;
import com.morsearch.model.Pm_StyleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Pm_StyleMapper {
    int countByExample(Pm_StyleExample example);

    int deleteByExample(Pm_StyleExample example);

    int deleteByPrimaryKey(Long ps_id);

    int insert(Pm_Style record);

    int insertSelective(Pm_Style record);

    List<Pm_Style> selectByExample(Pm_StyleExample example);

    Pm_Style selectByPrimaryKey(Long ps_id);

    int updateByExampleSelective(@Param("record") Pm_Style record, @Param("example") Pm_StyleExample example);

    int updateByExample(@Param("record") Pm_Style record, @Param("example") Pm_StyleExample example);

    int updateByPrimaryKeySelective(Pm_Style record);

    int updateByPrimaryKey(Pm_Style record);

    List<Pm_Style> getStyleList1(Map<String, Object> map);

    List<Pm_Style> getStyleList(String ps_majorname);

    List<Pm_Style> getStyList(Long id);
    //int getStyleListCount(Long ps_majorid,String ps_name);/*查询数量*/

    int getStyleListCount(@Param("ps_majorid") Long ps_majorid, @Param("ps_name") String ps_name);/*查询标签类型数量*/

    Pm_Style getStyId(String name);


    List<Pm_Style> getPm_StyleList(Map<String, Object> map);//产品类型的列表

    int getCountPm_Style(Map<String, Object> map);//产品类型的总数


    List<Pm_Style> getPm_StyleListname(Map<String, Object> map);
}