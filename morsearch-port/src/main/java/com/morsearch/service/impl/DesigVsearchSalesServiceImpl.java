package com.morsearch.service.impl;

import com.morsearch.dao.DesigV_Search_SalesMapper;
import com.morsearch.model.DesigV_Search_Archives;
import com.morsearch.model.DesigV_Search_Sales;
import com.morsearch.service.DesigVsearchArchivesService;
import com.morsearch.service.DesigVsearchSalesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017-11-21.
 */

@Service("DesigVsearchSalesService")
public class DesigVsearchSalesServiceImpl implements DesigVsearchSalesService {

    @Resource
    private DesigV_Search_SalesMapper desigV_search_salesMapper;


    @Override
    public List<DesigV_Search_Sales> getDesigV_Search_SalesList(Map<String, Object> map) {
        return desigV_search_salesMapper.getDesigV_Search_SalesList(map);
    }

    @Override
    public int getCountDesigV_Search_Sales(Map<String, Object> map) {
        return desigV_search_salesMapper.getCountDesigV_Search_Sales(map);
    }
}
