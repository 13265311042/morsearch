package com.morsearch.model;

import java.math.BigDecimal;

public class Award_Recharge_Rule extends Award_Recharge_RuleKey {
    private Integer arm_valuemin;

    private Integer arm_valuemax;

    private BigDecimal arm_discount;

    private Integer arm_addbase;

    private Byte arm_addmode;

    private Integer arm_addintegral;

    private Integer arm_addamount;

    public Integer getArm_valuemin() {
        return arm_valuemin;
    }

    public void setArm_valuemin(Integer arm_valuemin) {
        this.arm_valuemin = arm_valuemin;
    }

    public Integer getArm_valuemax() {
        return arm_valuemax;
    }

    public void setArm_valuemax(Integer arm_valuemax) {
        this.arm_valuemax = arm_valuemax;
    }

    public BigDecimal getArm_discount() {
        return arm_discount;
    }

    public void setArm_discount(BigDecimal arm_discount) {
        this.arm_discount = arm_discount;
    }

    public Integer getArm_addbase() {
        return arm_addbase;
    }

    public void setArm_addbase(Integer arm_addbase) {
        this.arm_addbase = arm_addbase;
    }

    public Byte getArm_addmode() {
        return arm_addmode;
    }

    public void setArm_addmode(Byte arm_addmode) {
        this.arm_addmode = arm_addmode;
    }

    public Integer getArm_addintegral() {
        return arm_addintegral;
    }

    public void setArm_addintegral(Integer arm_addintegral) {
        this.arm_addintegral = arm_addintegral;
    }

    public Integer getArm_addamount() {
        return arm_addamount;
    }

    public void setArm_addamount(Integer arm_addamount) {
        this.arm_addamount = arm_addamount;
    }
}