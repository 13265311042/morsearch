package com.morsearch.service.impl;

import com.morsearch.common.util.CommonUtil;
import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.DesCollectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by hyt on 2017/11/14.
 */
@Service("desCollectService")
public class DesCollectServiceImpl implements DesCollectService {

    @Resource
    private Desig_Collect_PmMapper desig_collect_pmMapper;

    @Resource
    private Desig_Collect_PsnMapper desig_collect_psnMapper;

    @Resource
    private Sales_Collect_PmMapper sales_collect_pmMapper;

    @Resource
    private Sales_Collect_PsnMapper sales_collect_psnMapper;

    @Resource
    private DesigV_Collect_PmMapper desigv_collect_pmMapper;

    @Resource
    private DesigV_Collect_PsnMapper desigv_collect_psnMapper;

    @Resource
    private SalesV_Collect_PmMapper salesV_collect_pmMapper;

    @Resource
    private SalesV_Collect_PsnMapper salesV_collect_psnMapper;

    @Resource
    private Pm_ArchivesMapper ArchivesMapper;

    @Override
    public int countDesig_Collect_PmByDm_archivesid(long dm_archivesid,long dm_createid) {//第一个list
        Desig_Collect_PmExample example = new Desig_Collect_PmExample();
        Desig_Collect_PmExample.Criteria criteria = example.createCriteria();
        criteria.andDm_archivesidEqualTo(dm_archivesid);
        criteria.andDm_createidEqualTo(dm_createid);
        return desig_collect_pmMapper.countByExample(example);
    }

    @Override
    public int addDesig_Collect_Pm(Desig_Collect_Pm dcp) {
        int iadd=0;
        Pm_Archives pa=ArchivesMapper.getArchivesDetail(dcp.getDm_archivesid(),2);
        if(pa.getPa_count_collect()==null){
            pa.setPa_count_collect(0);
        }
        pa.setPa_count_collect(pa.getPa_count_collect()+1);

        iadd=ArchivesMapper.updateByPrimaryKeySelective(pa);/*收藏次数+1*/
        iadd+=desig_collect_pmMapper.insertSelective(dcp );



        return iadd;
    }

    @Override
    public int deleteDesig_Collect_PmByDm_archivesid(long dm_archivesid,long dm_createid) {
        Pm_Archives pa=ArchivesMapper.getArchivesDetail(dm_archivesid,2);
        if(pa.getPa_count_collect()==null){pa.setPa_count_collect(0);}
        pa.setPa_count_collect(pa.getPa_count_collect()-1);
        if (pa.getPa_count_collect()<0){pa.setPa_count_collect(0);};
        ArchivesMapper.updateByPrimaryKeySelective(pa);/*收藏次数-1*/
        Desig_Collect_PmExample example = new Desig_Collect_PmExample();
        Desig_Collect_PmExample.Criteria criteria = example.createCriteria();
        criteria.andDm_archivesidEqualTo(dm_archivesid);
        criteria.andDm_createidEqualTo(dm_createid);
        return desig_collect_pmMapper.deleteByExample(example);
    }


    @Override
    public int countDesig_Collect_PsnByDm_archivesid(long ds_salerid,long ds_createid) {
        Desig_Collect_PsnExample example = new Desig_Collect_PsnExample();
        Desig_Collect_PsnExample.Criteria criteria = example.createCriteria();
        criteria.andDs_saleridEqualTo(ds_salerid);
        criteria.andDs_createidEqualTo(ds_createid);
        return desig_collect_psnMapper.countByExample(example);
    }
    @Override
    public int addDesig_Collect_Psn(Desig_Collect_Psn dcp) {
        return desig_collect_psnMapper.insertSelective(dcp);
    }

    @Override
    public int deleteDesig_Collect_PsnByByDs_salerid(Long ds_salerid,Long ds_createid) {
        Desig_Collect_PsnExample example = new Desig_Collect_PsnExample();
        Desig_Collect_PsnExample.Criteria criteria = example.createCriteria();
        criteria.andDs_saleridEqualTo( ds_salerid);
        criteria.andDs_createidEqualTo( ds_createid);
        return desig_collect_psnMapper.deleteByExample(example);
    }

    @Override
    public int countSales_Collect_PmBySm_archivesid(long sm_archivesid,long sm_createid) {
        Sales_Collect_PmExample example = new Sales_Collect_PmExample();
        Sales_Collect_PmExample.Criteria criteria = example.createCriteria();
        criteria.andSm_archivesidEqualTo(sm_archivesid);
        criteria.andSm_createidEqualTo(sm_createid);
        return sales_collect_pmMapper.countByExample(example);
    }

    @Override
    public int addSales_Collect_Pm(Sales_Collect_Pm scp) {
        Pm_Archives pa=ArchivesMapper.getArchivesDetail(scp.getSm_archivesid(),2);
        if(pa.getPa_count_collect()==null){
            pa.setPa_count_collect(0);
        }
        pa.setPa_count_collect(pa.getPa_count_collect()+1);

        ArchivesMapper.updateByPrimaryKeySelective(pa);/*收藏次数+1*/
        return sales_collect_pmMapper.insertSelective(scp);
    }

    @Override
    public int deleteSales_Collect_PmBySm_archivesid(long sm_archivesid,long sm_createid) {
        Pm_Archives pa=ArchivesMapper.getArchivesDetail(sm_archivesid,2);
        if(pa.getPa_count_collect()==null){
            pa.setPa_count_collect(0);
        }
        pa.setPa_count_collect(pa.getPa_count_collect()-1);
        if (pa.getPa_count_collect()<0){pa.setPa_count_collect(0);};
        ArchivesMapper.updateByPrimaryKeySelective(pa);/*收藏次数-1*/
        Sales_Collect_PmExample example = new Sales_Collect_PmExample();
        Sales_Collect_PmExample.Criteria criteria = example.createCriteria();
        criteria.andSm_archivesidEqualTo(sm_archivesid);
        criteria.andSm_createidEqualTo(sm_createid);
        return sales_collect_pmMapper.deleteByExample(example);
    }

    @Override
    public int countSales_Collect_PsnBySales_designerid(long ss_designerid ,long ss_createid) {
        Sales_Collect_PsnExample example = new Sales_Collect_PsnExample();
        Sales_Collect_PsnExample.Criteria criteria = example.createCriteria();
        criteria.andSs_designeridEqualTo(ss_designerid);
        criteria.andSs_createidEqualTo(ss_createid);
        return sales_collect_psnMapper.countByExample(example);
    }

    @Override
    public int addSales_Collect_Psn(Sales_Collect_Psn scp) {
        return sales_collect_psnMapper.insertSelective(scp);
    }

    @Override
    public int deleteSales_Collect_PsnBySs_designerid(Long ss_designerid,Long ss_createid) {
        Sales_Collect_PsnExample example = new Sales_Collect_PsnExample();
        Sales_Collect_PsnExample.Criteria criteria = example.createCriteria();
        criteria.andSs_designeridEqualTo(ss_designerid);
        criteria.andSs_createidEqualTo(ss_createid);
        return sales_collect_psnMapper.deleteByExample(example);
    }

    @Override
    public int selectDesig_Collect_PmByDm_archivesid1(long dm_archivesid, long dm_createid) {
        Desig_Collect_PmExample example = new Desig_Collect_PmExample();
        Desig_Collect_PmExample.Criteria criteria = example.createCriteria();
        criteria.andDm_archivesidEqualTo(dm_archivesid);
        criteria.andDm_createidEqualTo(dm_createid);
        return desig_collect_pmMapper.countByExample(example);
    }

    @Override
    public int selectDesig_Collect_PsnByDs_salerid1(long ds_salerid, long ds_createid) {
        Desig_Collect_PsnExample example = new Desig_Collect_PsnExample();
        Desig_Collect_PsnExample.Criteria criteria = example.createCriteria();
        criteria.andDs_saleridEqualTo(ds_salerid);
        criteria.andDs_createidEqualTo(ds_createid);
        return desig_collect_psnMapper.countByExample(example);
    }

    @Override
    public int selectSales_Collect_PmBySm_archivesid1(long sm_archivesid, long sm_createid) {
        Sales_Collect_PmExample example = new Sales_Collect_PmExample();
        Sales_Collect_PmExample.Criteria criteria = example.createCriteria();
        criteria.andSm_archivesidEqualTo( sm_archivesid);
        criteria.andSm_createidEqualTo(sm_createid);
        return sales_collect_pmMapper.countByExample(example);
    }

    @Override
    public int selectSales_Collect_PsnBySales_designerid1(long ss_designerid, long ss_createid) {
        Sales_Collect_PsnExample example = new Sales_Collect_PsnExample();
        Sales_Collect_PsnExample.Criteria criteria = example.createCriteria();
        criteria.andSs_designeridEqualTo( ss_designerid);
        criteria.andSs_createidEqualTo( ss_createid);
        return sales_collect_psnMapper.countByExample(example);
    }

    @Override
    public List<DesigV_Collect_Pm> getDesigV_Collect_PmList(Map<String, Object> map) {
        return desigv_collect_pmMapper.getDesigV_Collect_PmList(map);
    }

    @Override
    public int getCountDesigV_Collect_Pm(Map<String, Object> map) {
        return desigv_collect_pmMapper.getCountDesigV_Collect_Pm(map);
    }

    @Override
    public List<DesigV_Collect_Psn> getDesigV_Collect_PsnList(Map<String, Object> map) {
        return desigv_collect_psnMapper.getDesigV_Collect_PsnList(map);
    }

    @Override
    public Integer getCountDesigV_Collect_Psn(Map<String, Object> map) {
        return desigv_collect_psnMapper.getCountDesigV_Collect_Psn(map);
    }

    @Override
    public List<SalesV_Collect_Pm> getSalesV_Collect_PmList(Map<String, Object> map) {
        return salesV_collect_pmMapper.getSalesV_Collect_PmList(map);
    }

    @Override
    public Integer getCountSalesV_Collect_Pm(Map<String, Object> map) {
        return salesV_collect_pmMapper.getCountSalesV_Collect_Pm(map);
    }

    @Override
    public List<SalesV_Collect_Psn> getSalesV_Collect_PsnList(Map<String, Object> map) {
        return salesV_collect_psnMapper.getSalesV_Collect_PsnList(map);
    }

    @Override
    public Integer getCountSalesV_Collect_Psn(Map<String, Object> map) {
        return salesV_collect_psnMapper.getCountSalesV_Collect_Psn(map);
    }

    @Override
    public Sales_Collect_Psn getSales_Collect_Psn(Long ss_designerid, Long ss_createid) {
        return sales_collect_psnMapper.getSales_Collect_Psn(ss_designerid,ss_createid);
    }

    @Override
    public Desig_Collect_Psn getDesig_Collect_Psn(Long ds_salerid, Long ds_createid) {
        return desig_collect_psnMapper.getDesig_Collect_Psn2(ds_salerid,ds_createid);
    }

    @Override
    public Desig_Collect_Pm getDesig_Collect_Pm(Long dm_archivesid, Long dm_createid) {
        return desig_collect_pmMapper.getDesig_Collect_Pm(dm_archivesid,dm_createid);
    }
}
