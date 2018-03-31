package com.morsearch.service;

import com.morsearch.model.BaseV_Rotation;
import com.morsearch.model.Base_Rotation;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/12/29.
 */
public interface BaseRotationService {
    List<BaseV_Rotation> getBaseV_RotationList(Map<String, Object> map);

    Integer getCountBaseV_Rotation(Map<String, Object> map);

    int addBase_Rotation(Base_Rotation br);//添加轮播图

    int updateBase_Rotation(Base_Rotation br);//修改轮播图

    Base_Rotation getBase_Rotationdetail(long rtid);//得到轮播图的详细信息

    int deleteBase_RotationById(long rtid);//删除轮播图

    List<Map<String,String>> getBase_Rotation_typelist(); /*获取类别*/

    List<Base_Rotation> getRotationListshow(String type,Boolean isonlydb);/*获取类型列表*/

   String getBase_Rotation_typecode(Long rtid); /*获取类别*/

}
