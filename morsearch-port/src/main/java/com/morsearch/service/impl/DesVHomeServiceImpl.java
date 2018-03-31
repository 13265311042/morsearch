package com.morsearch.service.impl;

import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.DesVHomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/22.
 */
@Service("desVHomeService")
public class DesVHomeServiceImpl implements DesVHomeService {
    @Resource
    private DesigV_Home_ArchivesMapper desigV_home_archivesMapper;

    @Resource
    private DesigV_Home_BrandMapper desigV_home_brandMapper;

    @Resource
    private DesigV_Home_MajobMapper desigV_home_majobMapper;

    @Resource
    private DesigV_Home_SalesMapper desigV_home_salesMapper;

    @Resource
    private Desig_HomeMapper desig_homeMapper;
    @Resource
    private DesigV_Home_Archives_ListMapper desigv_home_archives_listmapper;
    @Resource
    private DesigV_Home_Brand_ListMapper desigv_home_brand_listmapper;
    @Resource
    private DesigV_Home_Majob_ListMapper desigv_home_majob_listmapper;
    @Resource
    private DesigV_Home_Sales_ListMapper desigv_home_sales_listmapper;


    @Override
    public List<DesigV_Home_Archives> getDesigV_Home_ArchivesList(Map<String, Object> map) {
        return desigV_home_archivesMapper.getDesigV_Home_ArchivesList(map);
    }

    @Override
    public Integer getDesigV_Home_ArchivesListCount(Map<String, Object> map) {
        return desigV_home_archivesMapper.getDesigV_Home_ArchivesListCount(map);
    }

    @Override
    public List<DesigV_Home_Brand> getDesigV_Home_BrandList(Map<String, Object> map) {
        return desigV_home_brandMapper.getDesigV_Home_BrandList(map);
    }

    @Override
    public Integer getDesigV_Home_BrandListCount(Map<String, Object> map) {
        return desigV_home_brandMapper.getDesigV_Home_BrandListCount(map);
    }

    @Override
    public List<DesigV_Home_Majob> getDesigV_Home_MajobList(Map<String, Object> map) {
        return desigV_home_majobMapper.getDesigV_Home_MajobList(map);
    }

    @Override
    public Integer getDesigV_Home_MajobListCount(Map<String, Object> map) {
        return desigV_home_majobMapper.getDesigV_Home_MajobListCount(map);
    }

    @Override
    public List<DesigV_Home_Sales> getDesigV_Home_SalesList(Map<String, Object> map) {
        return desigV_home_salesMapper.getDesigV_Home_SalesList(map);
    }

    @Override
    public Integer getDesigV_Home_SalesListCount(Map<String, Object> map) {
        return desigV_home_salesMapper.getDesigV_Home_SalesListCount(map);
    }

    @Override
    public int addDesig_Home(Desig_Home dh) {
        return desig_homeMapper.insertSelective(dh);
    }

    @Override
    public int deleteDesig_HomeById(long l) {
        return desig_homeMapper.deleteByPrimaryKey(l);
    }

    @Override
    public Desig_Home getDesig_Homedetail(long l) {
        return desig_homeMapper.selectByPrimaryKey(l);
    }

    @Override
    public int updateDesig_Home(Desig_Home dh) {
        return desig_homeMapper.updateByPrimaryKeySelective(dh);
    }

    @Override
    public List<DesigV_Home_Archives_List> getDesHomePage_Archives() {
        DesigV_Home_Archives_ListExample ll=new DesigV_Home_Archives_ListExample();
        ll.setOrderByClause("dh_index asc");
        return desigv_home_archives_listmapper.selectByExample(ll);
    }

    @Override
    public List<DesigV_Home_Brand_List> getDesHomePage_Brand() {
        DesigV_Home_Brand_ListExample ll=new DesigV_Home_Brand_ListExample();
        ll.setOrderByClause("dh_index asc");
        return desigv_home_brand_listmapper.selectByExample(ll);
    }

    @Override
    public List<DesigV_Home_Majob_List> getDesHomePage_Majob() {
        DesigV_Home_Majob_ListExample ll=new DesigV_Home_Majob_ListExample();
        ll.setOrderByClause("dh_index asc");
        return desigv_home_majob_listmapper.selectByExample(ll);
    }

    @Override
    public List<DesigV_Home_Sales_List> getDesHomePage_Sales() {
        DesigV_Home_Sales_ListExample ll=new DesigV_Home_Sales_ListExample();
        ll.setOrderByClause("dh_index asc");
        return desigv_home_sales_listmapper.selectByExample(ll);
    }

    @Override
    public Long getDesHomePage_Archives_homeid(Long paid) {
        DesigV_Home_Archives_ListExample ll=new DesigV_Home_Archives_ListExample();
        DesigV_Home_Archives_ListExample.Criteria criteria = ll.createCriteria();
        criteria.andDh_dyidEqualTo(paid);
        List<DesigV_Home_Archives_List> hal=desigv_home_archives_listmapper.selectByExample(ll);
        if (hal!=null&&hal.size()>0){
            return  hal.get(0).getDh_id();
        };
        return 0L;
    }


}
