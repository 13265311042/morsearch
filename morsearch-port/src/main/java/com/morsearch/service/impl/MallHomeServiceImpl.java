package com.morsearch.service.impl;

import com.morsearch.dao.MallV_HomeMapper;
import com.morsearch.dao.Mall_HomeMapper;
import com.morsearch.model.MallV_Home;
import com.morsearch.model.Mall_Goods;
import com.morsearch.model.Mall_Home;
import com.morsearch.service.MallHomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/12/25.
 */
@Service("MallHomeService")
public class MallHomeServiceImpl implements MallHomeService {
    @Resource
    private Mall_HomeMapper mall_homeMapper;

    @Resource
    private MallV_HomeMapper mallV_homeMapper;
    @Override
    public int addMall_Home(Mall_Home mh) {
        int iadd=mall_homeMapper.insertSelective(mh);
        return iadd;
    }

    @Override
    public List<MallV_Home> getMallV_HomeList(Map<String, Object> map) {
        return mallV_homeMapper.getMallV_HomeList(map);
    }

    @Override
    public Integer getCountMallV_Home(Map<String, Object> map) {
        return mallV_homeMapper.getCountMallV_Home(map);
    }

    @Override
    public int deleteMall_HomeById(long l) {
        return mall_homeMapper.deleteByPrimaryKey(l);
    }

    @Override
    public int updateMall_Home(Mall_Home mh) {
        return mall_homeMapper.updateByPrimaryKeySelective(mh);
    }

    @Override
    public Mall_Home getMall_Homedetail(long l) {
        return mall_homeMapper.selectByPrimaryKey(l);
    }

    @Override
    public List<MallV_Home> getMallV_Home_show(Integer type,Long mhid) {
        return mallV_homeMapper.getMallV_Home_show(type,mhid);
    }


}
