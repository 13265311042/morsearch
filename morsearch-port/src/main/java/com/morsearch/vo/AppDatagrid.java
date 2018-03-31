package com.morsearch.vo;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * easyui返回数据封闭
 * Created by leol on 2017-11-01.
 */

public class AppDatagrid implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer total;
    private List rows;
    private List footer;
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public List getRows() {
        return rows;
    }
    public void setRows(List rows) {
        this.rows = rows;
    }
    public List getFooter() {
        return footer;
    }
    public void setFooter(List footer) {
        this.footer = footer;
    }

}
