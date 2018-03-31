package com.morsearch.service;

import com.morsearch.model.Desig_Project;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-11-22.
 */
public interface DesigProjectService {

    int insertSelective(Desig_Project record);

    String  getWordTypeCode(String sw_name); //城市名称 获取 代码

    Desig_Project selectByDesig_Project(Long id);

    int updateByPrimaryKeySelective(Desig_Project record);

    int deleteByPrimaryKey(Long sp_id);

    List<Desig_Project> getDesig_ProjectList(Map<String, Object> map);//列表

    int getCountDesig_Project(Map<String, Object> map);//条数

    List<Desig_Project> getDesig_ProjectBackList(Map<String, Object> map);//后台的查询,有一点点区别

    Integer getCountDesig_ProjectBack(Map<String, Object> map);//后台的查询方法,有一点点区别

    Desig_Project getDesig_ProjectDetail(long l, int type);

    int updateDesig_Project(Desig_Project dd);
}
