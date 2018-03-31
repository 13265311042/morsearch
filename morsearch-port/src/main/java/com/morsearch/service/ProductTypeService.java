package com.morsearch.service;

import com.morsearch.model.Pm_Style;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-10-27.
 */
public interface ProductTypeService {

    List<Pm_Style> getStyleList1(Map<String, Object> map);

   List<Pm_Style> getStyleList(String name);

    List<Pm_Style> getStyList(Long id);

    int getStyleListCount(Long ps_majorid, String ps_name);/*查询数量*/

    int insertSelective(Pm_Style record);

    Pm_Style getStyId(String name);
}
