package com.morsearch.vo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * 查询参数定义 标准类
 * Leoli
 * Created by hyt on 2017/9/30.
 */
public class parameter_std implements Serializable {
    private Integer pageindex;/*开始记录位*/
    private Integer pagesize;/*记录分页*/
    private String sno1; /*单号参数1*/
    private String sno2; /*单号参数2*/
    private Date sdt1; /*日期参数1*/
    private Date sdt2; /*日期参数2*/
    private BigInteger idb; /*ID为Big的参数*/
    private Long idl; /*ID为普通整形的参数*/
    private Integer ids; /*ID为普通整形的参数*/



    public Integer getPageindex() {
        return pageindex;
    }

    public void setPageindex(Integer pageindex) {
        this.pageindex = pageindex;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public String getSno1() {
        return sno1;
    }

    public void setSno1(String sno1) {
        this.sno1 = sno1;
    }

    public String getSno2() {
        return sno2;
    }

    public void setSno2(String sno2) {
        this.sno2 = sno2;
    }

    public Date getSdt1() {
        return sdt1;
    }

    public void setSdt1(Date sdt1) {
        this.sdt1 = sdt1;
    }

    public Date getSdt2() {
        return sdt2;
    }

    public void setSdt2(Date sdt2) {
        this.sdt2 = sdt2;
    }

    public BigInteger getIdb() {
        return idb;
    }

    public void setIdb(BigInteger idb) {
        this.idb = idb;
    }

    public Long getIdl() {
        return idl;
    }

    public void setIdl(Long idl) {
        this.idl = idl;
    }

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

}
