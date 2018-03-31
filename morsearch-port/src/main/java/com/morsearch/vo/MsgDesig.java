package com.morsearch.vo;

/**
 * leoli
 * 2017.11.22
 * 个人中心，设计师,消息数量
 */
public class MsgDesig {
    private int dsg_baitietime; /*拜贴消息*/
    private int dsg_audittime; /*审核消息*/
    private int dsg_appealtime; /*投诉消息*/
    private int lookmetime; /*谁看了我次数*/
    private int interesttime; /*谁对我感兴趣*/
    private int ordermsgtime; /*订单消息次数*/

    public int getDsg_baitietime() {
        return dsg_baitietime;
    }

    public void setDsg_baitietime(int dsg_baitietime) {
        this.dsg_baitietime = dsg_baitietime;
    }

    public int getDsg_audittime() {
        return dsg_audittime;
    }

    public void setDsg_audittime(int dsg_audittime) {
        this.dsg_audittime = dsg_audittime;
    }

    public int getDsg_appealtime() {
        return dsg_appealtime;
    }

    public void setDsg_appealtime(int dsg_appealtime) {
        this.dsg_appealtime = dsg_appealtime;
    }

    public int getLookmetime() {
        return lookmetime;
    }

    public void setLookmetime(int lookmetime) {
        this.lookmetime = lookmetime;
    }

    public int getInteresttime() {
        return interesttime;
    }

    public void setInteresttime(int interesttime) {
        this.interesttime = interesttime;
    }

    public int getOrdermsgtime() {
        return ordermsgtime;
    }

    public void setOrdermsgtime(int ordermsgtime) {
        this.ordermsgtime = ordermsgtime;
    }
}
