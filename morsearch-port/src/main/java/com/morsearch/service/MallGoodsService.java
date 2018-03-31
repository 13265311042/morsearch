package com.morsearch.service;

import com.morsearch.model.MallV_Goods_List;
import com.morsearch.model.Mall_Goods;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/12/19.
 */
public interface MallGoodsService {

    Mall_Goods getMall_Goodsdetail(long mg_id, int type);//查看商城商品详细信息

    String saveFile(MultipartFile file) throws IOException, Exception;//保存文件

    int addMall_Goods(Mall_Goods mg);//添加商品


    int updateMall_Goods(Mall_Goods mg);//更新商品

    List getfilenames(MultipartFile[] files) throws IOException, Exception;//得到添加商品时上传图片的地址

    List getupdatefilename(MultipartFile[] files, Mall_Goods mgd) throws IOException, Exception;//得到更新时上传图片的地址

    List<MallV_Goods_List> getMallV_Goods_ListList(Map<String, Object> map);//后台商品列表

    Integer getCountMallV_Goods_List(Map<String, Object> map);//后台商品数量

    int deleteMall_GoodsById(long l) throws IOException;//删除商品

    int updateMall_GoodsByStatus(Mall_Goods mg);//更新状态

    List<Mall_Goods> getMall_GoodsListid1(Map<String, Object> map);//详情mall_goods

    Integer getCountMall_Goodsid1(Map<String, Object> map);//数量

    List<Mall_Goods> getMall_GoodsListid2(Map<String, Object> map);//详情mall_goods

    Integer getCountMall_Goodsid2(Map<String, Object> map);//数量

}
