package com.morsearch.service;

import com.morsearch.model.Pm_Style;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/8.
 */
public interface PmStyleService {

    List<Pm_Style> getPm_StyleList(Map<String, Object> map);//产品类型的列表

    int getCountPm_Style(Map<String, Object> map);//产品类型的总数

    Pm_Style getPm_Style(Long id);//根据id查询详细的信息

    int updatePm_Style(Pm_Style ps);//是否更新成功

    int addPm_Style(Pm_Style ps);//添加产品类型

    List<Pm_Style> getPm_StyleListname(Map<String, Object> map);//查询类型的名称

    int getPmStylenamelist(Long ps_majorid, String ps_name);//为了查询同一个名称的数量

    int deletePm_style(long l);//删除此产品类型
}
