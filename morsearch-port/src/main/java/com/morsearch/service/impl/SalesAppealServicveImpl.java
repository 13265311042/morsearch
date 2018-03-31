package com.morsearch.service.impl;

import com.morsearch.dao.Sales_AppealMapper;
import com.morsearch.model.Sales_Appeal;
import com.morsearch.service.SalesAppealServicve;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/13.
 */
@Service("salesAppealServicve")
public class SalesAppealServicveImpl implements SalesAppealServicve {
    @Resource
    private Sales_AppealMapper sales_appealMapper;

    @Override
    public List<Sales_Appeal> getSales_AppealList(Map<String, Object> map) {
        return sales_appealMapper.getSales_AppealList(map);
    }

    @Override
    public int getCountSales_Appeal(Map<String, Object> map) {
        return sales_appealMapper.getCountSales_Appeal(map);
    }

    @Override
    public int updateSales_Appealstatus(Sales_Appeal sa) {
        return sales_appealMapper.updateByPrimaryKeySelective(sa);
    }

    @Override
    public Sales_Appeal getSales_Appealdetail(long l) {
        return sales_appealMapper.selectByPrimaryKey(l);
    }
}
