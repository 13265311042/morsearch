package com.morsearch.dao;

import com.morsearch.model.Base_LableList;
import com.morsearch.model.Base_LableListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Base_LableListMapper {
    int countByExample(Base_LableListExample example);

    int deleteByExample(Base_LableListExample example);

    int deleteByPrimaryKey(Long bl_id);

    int insert(Base_LableList record);

    int insertSelective(Base_LableList record);

    List<Base_LableList> selectByExample(Base_LableListExample example);

    Base_LableList selectByPrimaryKey(Long bl_id);

    int updateByExampleSelective(@Param("record") Base_LableList record, @Param("example") Base_LableListExample example);

    int updateByExample(@Param("record") Base_LableList record, @Param("example") Base_LableListExample example);

    int updateByPrimaryKeySelective(Base_LableList record);

    int updateByPrimaryKey(Base_LableList record);

    /*自定义*/
    List<Base_LableList> getLableList(@Param("bl_type") String bl_type, @Param("showflag") Boolean showflag);/*按类别获取标签列表*/

    int getLableListCount(@Param("bl_type") String bl_type, @Param("bl_name") String bl_name);/*查询标签类型数量*/

    List<Base_LableList> getLableListlist(Map<String, Object> map);
    int getLableListCountList(Map<String, Object> map);

    int getCountlistlist(String bl_type);

    Base_LableList getLableID(String name);

    List<Base_LableList>  getLableName(String bl_type);

    Base_LableList  getName(String bl_type);

    List<Long> getLableList1idlist(String bl_type);//查找出所有bl_type=1007的id

    List<Base_LableList> getBl_name(String bl_type);

    List<Base_LableList> getLableListidfirst(Map<String, Object> map);///首页品牌添加的除去id的方法

    Integer getCountLableListidfirst(Map<String, Object> map);//首页品牌添加的除去id的方法

    List<Base_LableList> getLableListidlast(Map<String, Object> map);//首页专业添加的除去ID的方法

    Integer getCountLableListidlast(Map<String, Object> map);//首页专业添加的除去ID的方法

    List<Base_LableList> getLableListaudit(Map<String, Object> map);//显示需要审核的列表

    List<Base_LableList> getLableList1(Map<String, Object> map);//审核标签列表

    Integer getCountlable1(Map<String, Object> map);//审核标签列表条数

    List<Base_LableList> getCountIndex();

    List<Base_LableList> getLableListname(Map<String, Object> map);

    List<Base_LableList> getjorListname();

    List<Base_LableList> getbrandListname();

    List<Base_LableList> getworkageListname();
}