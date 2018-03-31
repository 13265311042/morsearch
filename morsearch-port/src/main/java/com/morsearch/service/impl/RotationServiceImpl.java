package com.morsearch.service.impl;

import com.morsearch.dao.Base_RotationMapper;
import com.morsearch.model.Base_Rotation;
import com.morsearch.service.RotationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ywh on 2018-3-30.
 */
@Service("RotationService")
public class RotationServiceImpl implements RotationService {
    @Resource
    private Base_RotationMapper base_rotationMapper;


    @Override
    public List<Base_Rotation> getRotationlist(String type) {
        return base_rotationMapper.getRotationlist(type);
    }
}
