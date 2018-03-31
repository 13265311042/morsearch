package com.morsearch.service.impl;

import com.morsearch.common.util.CommonUtil;
import com.morsearch.dao.Pm_StyleMapper;
import com.morsearch.model.Pm_Style;
import com.morsearch.model.Pm_StyleExample;
import com.morsearch.service.PmStyleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/8.
 */
@Service("pmStyleService")
public class PmStyleServiceImpl implements PmStyleService {

    @Resource
    private Pm_StyleMapper pm_styleMapper;

    @Override
    public List<Pm_Style> getPm_StyleList(Map<String, Object> map) {
        return pm_styleMapper.getPm_StyleList(map);
    }

    @Override
    public int getCountPm_Style(Map<String, Object> map) {
        return pm_styleMapper.getCountPm_Style(map);
    }

    @Override
    public Pm_Style getPm_Style(Long id) {
        return pm_styleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updatePm_Style(Pm_Style ps) {
        return pm_styleMapper.updateByPrimaryKeySelective(ps);
    }

    @Override
    public int addPm_Style(Pm_Style ps) {
        return pm_styleMapper.insertSelective(ps);
    }

    @Override
    public List<Pm_Style> getPm_StyleListname(Map<String, Object> map) {
        return pm_styleMapper.getPm_StyleListname(map);
    }

    @Override
    public int getPmStylenamelist(Long ps_majorid, String ps_name) {
        Pm_StyleExample example = new Pm_StyleExample();
        Pm_StyleExample.Criteria criteria = example.createCriteria();

        //我添加的这个条件
        if (!CommonUtil.isNullOrEmpty(ps_majorid)) {
            criteria.andPs_majoridEqualTo(ps_majorid);
        }
        if (ps_name != null) {
            criteria.andPs_nameEqualTo(ps_name);
        }
        List<Pm_Style> list = pm_styleMapper.selectByExample(example);
        if(!CommonUtil.isNullOrEmpty(list)){
            return list.size();
        }
        return 0;
    }

    @Override
    public int deletePm_style(long l) {
        return pm_styleMapper.deleteByPrimaryKey(l);
    }
}
