package com.morsearch.service;

import com.morsearch.model.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/14.
 * 收藏
 */
public interface DesCollectService {

    int countDesig_Collect_PmByDm_archivesid(long dm_archivesid, long dm_createid);//计算数量

    int addDesig_Collect_Pm(Desig_Collect_Pm dcp);//收藏

    int  deleteDesig_Collect_PmByDm_archivesid(long dm_archivesid, long dm_createid);//删除

    int countDesig_Collect_PsnByDm_archivesid(long ds_salerid, long ds_createid);

   int addDesig_Collect_Psn(Desig_Collect_Psn dcp);//收藏

   int  deleteDesig_Collect_PsnByByDs_salerid(Long ds_salerid, Long ds_createid);//删除

    int countSales_Collect_PmBySm_archivesid(long sm_archivesid, long sm_createid);


    int addSales_Collect_Pm(Sales_Collect_Pm scp);//收藏

    int deleteSales_Collect_PmBySm_archivesid(long sm_archivesid, long sm_createid);//删除

    int countSales_Collect_PsnBySales_designerid(long ss_designerid, long ss_createid);

    int addSales_Collect_Psn(Sales_Collect_Psn scp);//收藏

    int deleteSales_Collect_PsnBySs_designerid(Long ss_designerid, Long ss_createid);//删除

    int selectDesig_Collect_PmByDm_archivesid1(long dm_archivesid, long dm_createid);//条件查询

    int selectDesig_Collect_PsnByDs_salerid1(long ds_salerid, long ds_createid);//条件查询

    int selectSales_Collect_PmBySm_archivesid1(long sm_archivesid, long sm_createid);//条件查询

    int selectSales_Collect_PsnBySales_designerid1(long ss_designerid, long ss_createid);//条件查询


    List<DesigV_Collect_Pm> getDesigV_Collect_PmList(Map<String, Object> map);//列表

    int getCountDesigV_Collect_Pm(Map<String, Object> map);//总数

    List<DesigV_Collect_Psn> getDesigV_Collect_PsnList(Map<String, Object> map);

    Integer getCountDesigV_Collect_Psn(Map<String, Object> map);

    List<SalesV_Collect_Pm> getSalesV_Collect_PmList(Map<String, Object> map);

    Integer getCountSalesV_Collect_Pm(Map<String, Object> map);

    List<SalesV_Collect_Psn> getSalesV_Collect_PsnList(Map<String, Object> map);

    Integer getCountSalesV_Collect_Psn(Map<String, Object> map);

    Sales_Collect_Psn getSales_Collect_Psn(Long ss_designerid, Long ss_createid);

    Desig_Collect_Psn getDesig_Collect_Psn(Long ds_salerid, Long ds_createid);

    Desig_Collect_Pm  getDesig_Collect_Pm(Long dm_archivesid,Long dm_createid);

}
