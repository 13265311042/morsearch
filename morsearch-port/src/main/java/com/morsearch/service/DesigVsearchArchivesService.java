package com.morsearch.service;

import com.morsearch.model.DesigV_Search_Archives;

import java.util.List;
import java.util.Map;

/**
 * Created by ywh on 2017-11-21.
 */
public interface DesigVsearchArchivesService {

    List<DesigV_Search_Archives> getDesigV_Search_ArchivesList(Map<String, Object> map);//列表

    int getCountDesigV_Search_Archives(Map<String, Object> map);//总数
}
