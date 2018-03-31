package com.morsearch.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.morsearch.common.constant.Constants;
import com.morsearch.dao.BaseV_RotationMapper;
import com.morsearch.dao.Base_RotationMapper;
import com.morsearch.model.BaseV_Rotation;
import com.morsearch.model.Base_Rotation;
import com.morsearch.model.Base_RotationExample;
import com.morsearch.service.BaseRotationService;
import com.morsearch.service.RedisService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/12/29.
 */
@Service("BaseRotationService")
public class BaseRotationServiceImpl implements BaseRotationService {

    @Resource
    private BaseV_RotationMapper baseV_rotationMapper;

    @Resource
    private Base_RotationMapper base_rotationMapper;
    @Resource
    private RedisService redisService;
    private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    @Override
    public List<BaseV_Rotation> getBaseV_RotationList(Map<String, Object> map) {
        return baseV_rotationMapper.getBaseV_RotationList(map);
    }

    @Override
    public Integer getCountBaseV_Rotation(Map<String, Object> map) {
        return baseV_rotationMapper.getCountBaseV_Rotation(map);
    }

    @Override
    public int addBase_Rotation(Base_Rotation br) {
        return base_rotationMapper.insertSelective(br);
    }

    @Override
    public int updateBase_Rotation(Base_Rotation br) {
        return base_rotationMapper.updateByPrimaryKeySelective(br);
    }

    @Override
    public Base_Rotation getBase_Rotationdetail(long rtid) {
        return base_rotationMapper.selectByPrimaryKey(rtid);
    }

    @Override
    public int deleteBase_RotationById(long rtid) {
        return base_rotationMapper.deleteByPrimaryKey(rtid);
    }

    @Override
    public List<Map<String,String>> getBase_Rotation_typelist() {
        return base_rotationMapper.getBase_Rotation_typelist();
    }

    @Override
/*isonlydb 只查数据表*/
    public List<Base_Rotation> getRotationListshow(String type,Boolean isonlydb) {
        List<Base_Rotation> brlist=new ArrayList<Base_Rotation>();
        if (isonlydb==false) { /*redis*/
            Map<String, String> mprt = redisService.getMapValue(Constants.REDIS_ROTATION + type);
            if (mprt != null && mprt.size() > 0) {
                for (String vv : mprt.values()) {
                    Base_Rotation dv = gson.fromJson(vv, Base_Rotation.class);
                    brlist.add(dv);
                }
            };
        };
        if (brlist==null||brlist.size()==0){ /*数据表*/
            brlist=base_rotationMapper.getBase_Rotation_list(type);
        };
        return brlist;
    }

    @Override
    public String getBase_Rotation_typecode(Long rtid) {
        return base_rotationMapper.getBase_Rotation_typecode(rtid);
    }


}
