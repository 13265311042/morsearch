package com.morsearch.service;

import com.morsearch.model.MallV_Home;
import com.morsearch.model.Mall_Goods;
import com.morsearch.model.Mall_Home;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/12/25.
 */
public interface MallHomeService {

    int addMall_Home(Mall_Home mh);//商城首页商品添加


    List<MallV_Home> getMallV_HomeList(Map<String, Object> map);//热门商品还是品牌商品

    Integer getCountMallV_Home(Map<String, Object> map);//热门商品或者品牌商品的数量

    int deleteMall_HomeById(long l);//删除商城首页热门商品

    int updateMall_Home(Mall_Home mh);//更新商城首页热门商品

    Mall_Home getMall_Homedetail(long l);//得到商城首页热门商品的详细信息

    List<MallV_Home> getMallV_Home_show(Integer type,Long mhid);//*获取商品列表*/

}
