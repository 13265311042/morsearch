package com.morsearch.vo;

import com.morsearch.model.Acc_MemoIntegral;

import java.math.BigDecimal;
import java.util.List;

/**
 * 用于设计师web魔币明细
 * Created by ywh on 2018-2-8.
 */
public class AccMemoIntegral {
    private BigDecimal wl_integral; //魔币数量

   private  List<Acc_MemoIntegral> list; //明细列表

    public BigDecimal getWl_integral() {
        return wl_integral;
    }

    public void setWl_integral(BigDecimal wl_integral) {
        this.wl_integral = wl_integral;
    }

    public List<Acc_MemoIntegral> getList() {
        return list;
    }

    public void setList(List<Acc_MemoIntegral> list) {
        this.list = list;
    }
}
