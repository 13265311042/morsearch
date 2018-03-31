package com.morsearch.service.impl;

import com.morsearch.dao.DesigV_ProjectMapper;
import com.morsearch.model.DesigV_Project;
import com.morsearch.service.DesigVProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-12-11.
 */
@Service("DesigVProjectService")
public class DesigVProjectServiceImpl implements DesigVProjectService {

    @Resource
    private DesigV_ProjectMapper desigV_projectMapper;

    @Override
    public List<DesigV_Project> getDesigV_ProjectBackList(Map<String, Object> map) {
        return desigV_projectMapper.getDesigV_ProjectBackList(map);
    }

    @Override
    public Integer getCountDesigV_ProjectBack(Map<String, Object> map) {
        return desigV_projectMapper.getCountDesigV_ProjectBack(map);
    }

    @Override
    public DesigV_Project selectDesigV_Project(Long id) {
        return desigV_projectMapper.selectDesigV_Project(id);
    }
}
