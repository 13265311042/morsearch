package com.morsearch.service;

import com.morsearch.model.DesigV_Demand;
import com.morsearch.model.Desig_Demand;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/10/19.
 */
public interface DesigDemandService {

    Desig_Demand selectByPrimaryID(Long dd_id);

    int insertSelective(Desig_Demand record);

    Desig_Demand selectByPrimaryKey(Long dd_id);

    int updateByPrimaryKeySelective(Desig_Demand record);

    /*自定义*/

    List<Desig_Demand> getDesig_DemandList(Map<String, Object> map);//列表

    int getCountDesig_Demand(Map<String, Object> map);

    Desig_Demand getDesig_DemandDetail(Long dd_id, int type);


    List<Desig_Demand> getDesig_DemandBackList(Map<String, Object> map);//后台查询

    Integer getCountDesig_DemandBack(Map<String, Object> map);//后台查询

    int updateDesig_Demand(Desig_Demand dd);//更新

    List<DesigV_Demand> getDesigV_DemandList(Map<String, Object> map);

    Integer getCountDesigV_Demand(Map<String, Object> map);

    DesigV_Demand getDesigV_DemandDetail(long l);

}
