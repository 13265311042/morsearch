package com.morsearch.service.impl;

import com.morsearch.common.util.CommonUtil;
import com.morsearch.dao.Pm_StyleMapper;
import com.morsearch.model.Pm_Style;
import com.morsearch.model.Pm_StyleExample;
import com.morsearch.service.ProductTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-10-27.
 */
@Service("ProductTypeService")
public class ProductTypeServiceImpl implements ProductTypeService{

    @Resource
    private Pm_StyleMapper pm_styleMapper;

    @Override
    public int insertSelective(Pm_Style record) {
        return pm_styleMapper.insertSelective(record);
    }

    @Override
    public List<Pm_Style> getStyList(Long id) {
        return pm_styleMapper.getStyList(id);
    }

    @Override
    public Pm_Style getStyId(String name) {
        return pm_styleMapper.getStyId(name);
    }

    @Override
    public int getStyleListCount(Long ps_majorid,String ps_name) {
        Pm_StyleExample ss = new Pm_StyleExample();

        Pm_StyleExample.Criteria criteria = ss.createCriteria();
		/*我添加的这个条件*/
        if (!CommonUtil.isNullOrEmpty(ps_majorid)) {
            criteria.andPs_majoridEqualTo(ps_majorid);
        }
        if (ps_name != null) {
            criteria.andPs_nameEqualTo(ps_name);
        }
        return pm_styleMapper.getStyleListCount(ps_majorid,ps_name);
        //return pm_styleMapper.getStyleListCount(ps_majorid,ps_name);

    }

    @Override
    public List<Pm_Style> getStyleList(String name) {
        return pm_styleMapper.getStyleList(name);
    }

    @Override
    public List<Pm_Style> getStyleList1(Map<String, Object> map) {
        return pm_styleMapper.getStyleList1(map);
    }
}
