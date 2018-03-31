package com.morsearch.service;




import com.morsearch.model.SalesV_LookMe;



import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/10/24.
 */
public interface SalesVLookMeService {

    List<SalesV_LookMe> getLookList(Map<String, Object> map);//得到评价列表

    int getLookListCount(Map<String, Object> map);


}
