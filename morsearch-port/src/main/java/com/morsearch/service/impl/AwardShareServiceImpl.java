package com.morsearch.service.impl;

import com.morsearch.dao.AwardV_Share_ListMapper;
import com.morsearch.dao.AwardV_Share_CountMapper;
import com.morsearch.dao.Award_ShareMapper;
import com.morsearch.model.AwardV_Share_List;
import com.morsearch.model.AwardV_Share_Count;
import com.morsearch.model.Award_Share;
import com.morsearch.service.AwardShareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/30.
 */
@Service("AwardShareService")
public class AwardShareServiceImpl implements AwardShareService {

    @Resource
    private AwardV_Share_ListMapper AwardV_Share_ListMapper;

    @Resource
    private Award_ShareMapper Award_ShareMapper;

    @Resource
    private AwardV_Share_CountMapper AwardV_Share_CountMapper;

    @Override
    public List<AwardV_Share_List> getAwardV_Share_ListList(Map<String, Object> map) {
        return AwardV_Share_ListMapper.getAwardV_Share_ListList(map);
    }

    @Override
    public Integer getCountAwardV_Share_List(Map<String, Object> map) {
        return AwardV_Share_ListMapper.getCountAwardV_Share_List(map);
    }

    @Override
    public int addAward_Share(Award_Share ba) {
        return Award_ShareMapper.insertSelective(ba);
    }

    @Override
    public int deleteAward_Share(long l) {
        return Award_ShareMapper.deleteByPrimaryKey(l);
    }

    @Override
    public Award_Share getAward_Sharedetail(long l) {
        return Award_ShareMapper.selectByPrimaryKey(l);
    }

    @Override
    public int updateAward_Share(Award_Share ba) {
        return Award_ShareMapper.updateByPrimaryKeySelective(ba);
    }

    @Override
    public List<AwardV_Share_Count> getAwardV_Share_CountList(Map<String, Object> map) {
        return AwardV_Share_CountMapper.getAwardV_Share_CountList(map) ;
    }

    @Override
    public Integer getCountAwardV_Share_Count(Map<String, Object> map) {
        return AwardV_Share_CountMapper.getCountAwardV_Share_Count(map);
    }

    @Override
    public List<AwardV_Share_Count> getAwardVShareCountList(Map<String, Object> map) {
        return AwardV_Share_CountMapper.getAwardVShareCountList(map);
    }

    @Override
    public int getCountAwardVShareCount(Map<String, Object> map) {
        return AwardV_Share_CountMapper.getCountAwardVShareCount(map);
    }
}
