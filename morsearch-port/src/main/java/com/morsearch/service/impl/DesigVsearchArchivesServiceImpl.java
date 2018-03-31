package com.morsearch.service.impl;

import com.morsearch.dao.DesigV_Search_ArchivesMapper;
import com.morsearch.model.DesigV_Search_Archives;
import com.morsearch.service.DesigVsearchArchivesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-11-21.
 */

@Service("DesigVsearchArchivesService")
public class DesigVsearchArchivesServiceImpl implements DesigVsearchArchivesService {
    @Resource
    private DesigV_Search_ArchivesMapper desigV_search_archivesMapper;


    @Override
    public List<DesigV_Search_Archives> getDesigV_Search_ArchivesList(Map<String, Object> map) {
        return desigV_search_archivesMapper.getDesigV_Search_ArchivesList(map);
    }

    @Override
    public int getCountDesigV_Search_Archives(Map<String, Object> map) {
        return desigV_search_archivesMapper.getCountDesigV_Search_Archives(map);
    }
}
