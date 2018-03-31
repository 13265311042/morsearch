package com.morsearch.service;

import com.morsearch.model.DesigV_Project;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-11.
 */
public interface DesigVProjectService {


    List<DesigV_Project> getDesigV_ProjectBackList(Map<String, Object> map);//后台的查询,有一点点区别

    Integer getCountDesigV_ProjectBack(Map<String, Object> map);//后台的查询方法,有一点点区别

    DesigV_Project selectDesigV_Project(Long id);


}
