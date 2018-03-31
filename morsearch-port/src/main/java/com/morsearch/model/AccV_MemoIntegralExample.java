package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccV_MemoIntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccV_MemoIntegralExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMi_idIsNull() {
            addCriterion("mi_id is null");
            return (Criteria) this;
        }

        public Criteria andMi_idIsNotNull() {
            addCriterion("mi_id is not null");
            return (Criteria) this;
        }

        public Criteria andMi_idEqualTo(Long value) {
            addCriterion("mi_id =", value, "mi_id");
            return (Criteria) this;
        }

        public Criteria andMi_idNotEqualTo(Long value) {
            addCriterion("mi_id <>", value, "mi_id");
            return (Criteria) this;
        }

        public Criteria andMi_idGreaterThan(Long value) {
            addCriterion("mi_id >", value, "mi_id");
            return (Criteria) this;
        }

        public Criteria andMi_idGreaterThanOrEqualTo(Long value) {
            addCriterion("mi_id >=", value, "mi_id");
            return (Criteria) this;
        }

        public Criteria andMi_idLessThan(Long value) {
            addCriterion("mi_id <", value, "mi_id");
            return (Criteria) this;
        }

        public Criteria andMi_idLessThanOrEqualTo(Long value) {
            addCriterion("mi_id <=", value, "mi_id");
            return (Criteria) this;
        }

        public Criteria andMi_idIn(List<Long> values) {
            addCriterion("mi_id in", values, "mi_id");
            return (Criteria) this;
        }

        public Criteria andMi_idNotIn(List<Long> values) {
            addCriterion("mi_id not in", values, "mi_id");
            return (Criteria) this;
        }

        public Criteria andMi_idBetween(Long value1, Long value2) {
            addCriterion("mi_id between", value1, value2, "mi_id");
            return (Criteria) this;
        }

        public Criteria andMi_idNotBetween(Long value1, Long value2) {
            addCriterion("mi_id not between", value1, value2, "mi_id");
            return (Criteria) this;
        }

        public Criteria andMi_typeIsNull() {
            addCriterion("mi_type is null");
            return (Criteria) this;
        }

        public Criteria andMi_typeIsNotNull() {
            addCriterion("mi_type is not null");
            return (Criteria) this;
        }

        public Criteria andMi_typeEqualTo(String value) {
            addCriterion("mi_type =", value, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_typeNotEqualTo(String value) {
            addCriterion("mi_type <>", value, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_typeGreaterThan(String value) {
            addCriterion("mi_type >", value, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_typeGreaterThanOrEqualTo(String value) {
            addCriterion("mi_type >=", value, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_typeLessThan(String value) {
            addCriterion("mi_type <", value, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_typeLessThanOrEqualTo(String value) {
            addCriterion("mi_type <=", value, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_typeLike(String value) {
            addCriterion("mi_type like", value, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_typeNotLike(String value) {
            addCriterion("mi_type not like", value, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_typeIn(List<String> values) {
            addCriterion("mi_type in", values, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_typeNotIn(List<String> values) {
            addCriterion("mi_type not in", values, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_typeBetween(String value1, String value2) {
            addCriterion("mi_type between", value1, value2, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_typeNotBetween(String value1, String value2) {
            addCriterion("mi_type not between", value1, value2, "mi_type");
            return (Criteria) this;
        }

        public Criteria andMi_activityidIsNull() {
            addCriterion("mi_activityid is null");
            return (Criteria) this;
        }

        public Criteria andMi_activityidIsNotNull() {
            addCriterion("mi_activityid is not null");
            return (Criteria) this;
        }

        public Criteria andMi_activityidEqualTo(Long value) {
            addCriterion("mi_activityid =", value, "mi_activityid");
            return (Criteria) this;
        }

        public Criteria andMi_activityidNotEqualTo(Long value) {
            addCriterion("mi_activityid <>", value, "mi_activityid");
            return (Criteria) this;
        }

        public Criteria andMi_activityidGreaterThan(Long value) {
            addCriterion("mi_activityid >", value, "mi_activityid");
            return (Criteria) this;
        }

        public Criteria andMi_activityidGreaterThanOrEqualTo(Long value) {
            addCriterion("mi_activityid >=", value, "mi_activityid");
            return (Criteria) this;
        }

        public Criteria andMi_activityidLessThan(Long value) {
            addCriterion("mi_activityid <", value, "mi_activityid");
            return (Criteria) this;
        }

        public Criteria andMi_activityidLessThanOrEqualTo(Long value) {
            addCriterion("mi_activityid <=", value, "mi_activityid");
            return (Criteria) this;
        }

        public Criteria andMi_activityidIn(List<Long> values) {
            addCriterion("mi_activityid in", values, "mi_activityid");
            return (Criteria) this;
        }

        public Criteria andMi_activityidNotIn(List<Long> values) {
            addCriterion("mi_activityid not in", values, "mi_activityid");
            return (Criteria) this;
        }

        public Criteria andMi_activityidBetween(Long value1, Long value2) {
            addCriterion("mi_activityid between", value1, value2, "mi_activityid");
            return (Criteria) this;
        }

        public Criteria andMi_activityidNotBetween(Long value1, Long value2) {
            addCriterion("mi_activityid not between", value1, value2, "mi_activityid");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameIsNull() {
            addCriterion("mi_activityname is null");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameIsNotNull() {
            addCriterion("mi_activityname is not null");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameEqualTo(String value) {
            addCriterion("mi_activityname =", value, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameNotEqualTo(String value) {
            addCriterion("mi_activityname <>", value, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameGreaterThan(String value) {
            addCriterion("mi_activityname >", value, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameGreaterThanOrEqualTo(String value) {
            addCriterion("mi_activityname >=", value, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameLessThan(String value) {
            addCriterion("mi_activityname <", value, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameLessThanOrEqualTo(String value) {
            addCriterion("mi_activityname <=", value, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameLike(String value) {
            addCriterion("mi_activityname like", value, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameNotLike(String value) {
            addCriterion("mi_activityname not like", value, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameIn(List<String> values) {
            addCriterion("mi_activityname in", values, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameNotIn(List<String> values) {
            addCriterion("mi_activityname not in", values, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameBetween(String value1, String value2) {
            addCriterion("mi_activityname between", value1, value2, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_activitynameNotBetween(String value1, String value2) {
            addCriterion("mi_activityname not between", value1, value2, "mi_activityname");
            return (Criteria) this;
        }

        public Criteria andMi_typesignIsNull() {
            addCriterion("mi_typesign is null");
            return (Criteria) this;
        }

        public Criteria andMi_typesignIsNotNull() {
            addCriterion("mi_typesign is not null");
            return (Criteria) this;
        }

        public Criteria andMi_typesignEqualTo(String value) {
            addCriterion("mi_typesign =", value, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_typesignNotEqualTo(String value) {
            addCriterion("mi_typesign <>", value, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_typesignGreaterThan(String value) {
            addCriterion("mi_typesign >", value, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_typesignGreaterThanOrEqualTo(String value) {
            addCriterion("mi_typesign >=", value, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_typesignLessThan(String value) {
            addCriterion("mi_typesign <", value, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_typesignLessThanOrEqualTo(String value) {
            addCriterion("mi_typesign <=", value, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_typesignLike(String value) {
            addCriterion("mi_typesign like", value, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_typesignNotLike(String value) {
            addCriterion("mi_typesign not like", value, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_typesignIn(List<String> values) {
            addCriterion("mi_typesign in", values, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_typesignNotIn(List<String> values) {
            addCriterion("mi_typesign not in", values, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_typesignBetween(String value1, String value2) {
            addCriterion("mi_typesign between", value1, value2, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_typesignNotBetween(String value1, String value2) {
            addCriterion("mi_typesign not between", value1, value2, "mi_typesign");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoIsNull() {
            addCriterion("mi_sourceno is null");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoIsNotNull() {
            addCriterion("mi_sourceno is not null");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoEqualTo(String value) {
            addCriterion("mi_sourceno =", value, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoNotEqualTo(String value) {
            addCriterion("mi_sourceno <>", value, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoGreaterThan(String value) {
            addCriterion("mi_sourceno >", value, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoGreaterThanOrEqualTo(String value) {
            addCriterion("mi_sourceno >=", value, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoLessThan(String value) {
            addCriterion("mi_sourceno <", value, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoLessThanOrEqualTo(String value) {
            addCriterion("mi_sourceno <=", value, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoLike(String value) {
            addCriterion("mi_sourceno like", value, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoNotLike(String value) {
            addCriterion("mi_sourceno not like", value, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoIn(List<String> values) {
            addCriterion("mi_sourceno in", values, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoNotIn(List<String> values) {
            addCriterion("mi_sourceno not in", values, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoBetween(String value1, String value2) {
            addCriterion("mi_sourceno between", value1, value2, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_sourcenoNotBetween(String value1, String value2) {
            addCriterion("mi_sourceno not between", value1, value2, "mi_sourceno");
            return (Criteria) this;
        }

        public Criteria andMi_dateIsNull() {
            addCriterion("mi_date is null");
            return (Criteria) this;
        }

        public Criteria andMi_dateIsNotNull() {
            addCriterion("mi_date is not null");
            return (Criteria) this;
        }

        public Criteria andMi_dateEqualTo(Date value) {
            addCriterion("mi_date =", value, "mi_date");
            return (Criteria) this;
        }

        public Criteria andMi_dateNotEqualTo(Date value) {
            addCriterion("mi_date <>", value, "mi_date");
            return (Criteria) this;
        }

        public Criteria andMi_dateGreaterThan(Date value) {
            addCriterion("mi_date >", value, "mi_date");
            return (Criteria) this;
        }

        public Criteria andMi_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("mi_date >=", value, "mi_date");
            return (Criteria) this;
        }

        public Criteria andMi_dateLessThan(Date value) {
            addCriterion("mi_date <", value, "mi_date");
            return (Criteria) this;
        }

        public Criteria andMi_dateLessThanOrEqualTo(Date value) {
            addCriterion("mi_date <=", value, "mi_date");
            return (Criteria) this;
        }

        public Criteria andMi_dateIn(List<Date> values) {
            addCriterion("mi_date in", values, "mi_date");
            return (Criteria) this;
        }

        public Criteria andMi_dateNotIn(List<Date> values) {
            addCriterion("mi_date not in", values, "mi_date");
            return (Criteria) this;
        }

        public Criteria andMi_dateBetween(Date value1, Date value2) {
            addCriterion("mi_date between", value1, value2, "mi_date");
            return (Criteria) this;
        }

        public Criteria andMi_dateNotBetween(Date value1, Date value2) {
            addCriterion("mi_date not between", value1, value2, "mi_date");
            return (Criteria) this;
        }

        public Criteria andMi_integralIsNull() {
            addCriterion("mi_integral is null");
            return (Criteria) this;
        }

        public Criteria andMi_integralIsNotNull() {
            addCriterion("mi_integral is not null");
            return (Criteria) this;
        }

        public Criteria andMi_integralEqualTo(BigDecimal value) {
            addCriterion("mi_integral =", value, "mi_integral");
            return (Criteria) this;
        }

        public Criteria andMi_integralNotEqualTo(BigDecimal value) {
            addCriterion("mi_integral <>", value, "mi_integral");
            return (Criteria) this;
        }

        public Criteria andMi_integralGreaterThan(BigDecimal value) {
            addCriterion("mi_integral >", value, "mi_integral");
            return (Criteria) this;
        }

        public Criteria andMi_integralGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mi_integral >=", value, "mi_integral");
            return (Criteria) this;
        }

        public Criteria andMi_integralLessThan(BigDecimal value) {
            addCriterion("mi_integral <", value, "mi_integral");
            return (Criteria) this;
        }

        public Criteria andMi_integralLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mi_integral <=", value, "mi_integral");
            return (Criteria) this;
        }

        public Criteria andMi_integralIn(List<BigDecimal> values) {
            addCriterion("mi_integral in", values, "mi_integral");
            return (Criteria) this;
        }

        public Criteria andMi_integralNotIn(List<BigDecimal> values) {
            addCriterion("mi_integral not in", values, "mi_integral");
            return (Criteria) this;
        }

        public Criteria andMi_integralBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mi_integral between", value1, value2, "mi_integral");
            return (Criteria) this;
        }

        public Criteria andMi_integralNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mi_integral not between", value1, value2, "mi_integral");
            return (Criteria) this;
        }

        public Criteria andMi_accountidIsNull() {
            addCriterion("mi_accountid is null");
            return (Criteria) this;
        }

        public Criteria andMi_accountidIsNotNull() {
            addCriterion("mi_accountid is not null");
            return (Criteria) this;
        }

        public Criteria andMi_accountidEqualTo(Long value) {
            addCriterion("mi_accountid =", value, "mi_accountid");
            return (Criteria) this;
        }

        public Criteria andMi_accountidNotEqualTo(Long value) {
            addCriterion("mi_accountid <>", value, "mi_accountid");
            return (Criteria) this;
        }

        public Criteria andMi_accountidGreaterThan(Long value) {
            addCriterion("mi_accountid >", value, "mi_accountid");
            return (Criteria) this;
        }

        public Criteria andMi_accountidGreaterThanOrEqualTo(Long value) {
            addCriterion("mi_accountid >=", value, "mi_accountid");
            return (Criteria) this;
        }

        public Criteria andMi_accountidLessThan(Long value) {
            addCriterion("mi_accountid <", value, "mi_accountid");
            return (Criteria) this;
        }

        public Criteria andMi_accountidLessThanOrEqualTo(Long value) {
            addCriterion("mi_accountid <=", value, "mi_accountid");
            return (Criteria) this;
        }

        public Criteria andMi_accountidIn(List<Long> values) {
            addCriterion("mi_accountid in", values, "mi_accountid");
            return (Criteria) this;
        }

        public Criteria andMi_accountidNotIn(List<Long> values) {
            addCriterion("mi_accountid not in", values, "mi_accountid");
            return (Criteria) this;
        }

        public Criteria andMi_accountidBetween(Long value1, Long value2) {
            addCriterion("mi_accountid between", value1, value2, "mi_accountid");
            return (Criteria) this;
        }

        public Criteria andMi_accountidNotBetween(Long value1, Long value2) {
            addCriterion("mi_accountid not between", value1, value2, "mi_accountid");
            return (Criteria) this;
        }

        public Criteria andMi_createidIsNull() {
            addCriterion("mi_createid is null");
            return (Criteria) this;
        }

        public Criteria andMi_createidIsNotNull() {
            addCriterion("mi_createid is not null");
            return (Criteria) this;
        }

        public Criteria andMi_createidEqualTo(Long value) {
            addCriterion("mi_createid =", value, "mi_createid");
            return (Criteria) this;
        }

        public Criteria andMi_createidNotEqualTo(Long value) {
            addCriterion("mi_createid <>", value, "mi_createid");
            return (Criteria) this;
        }

        public Criteria andMi_createidGreaterThan(Long value) {
            addCriterion("mi_createid >", value, "mi_createid");
            return (Criteria) this;
        }

        public Criteria andMi_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("mi_createid >=", value, "mi_createid");
            return (Criteria) this;
        }

        public Criteria andMi_createidLessThan(Long value) {
            addCriterion("mi_createid <", value, "mi_createid");
            return (Criteria) this;
        }

        public Criteria andMi_createidLessThanOrEqualTo(Long value) {
            addCriterion("mi_createid <=", value, "mi_createid");
            return (Criteria) this;
        }

        public Criteria andMi_createidIn(List<Long> values) {
            addCriterion("mi_createid in", values, "mi_createid");
            return (Criteria) this;
        }

        public Criteria andMi_createidNotIn(List<Long> values) {
            addCriterion("mi_createid not in", values, "mi_createid");
            return (Criteria) this;
        }

        public Criteria andMi_createidBetween(Long value1, Long value2) {
            addCriterion("mi_createid between", value1, value2, "mi_createid");
            return (Criteria) this;
        }

        public Criteria andMi_createidNotBetween(Long value1, Long value2) {
            addCriterion("mi_createid not between", value1, value2, "mi_createid");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("accountname is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("accountname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("accountname =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("accountname <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("accountname >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("accountname >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("accountname <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("accountname <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("accountname like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("accountname not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("accountname in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("accountname not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("accountname between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("accountname not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNull() {
            addCriterion("createname is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("createname is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("createname =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("createname <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("createname >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("createname >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("createname <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("createname <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("createname like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("createname not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("createname in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("createname not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("createname between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("createname not between", value1, value2, "createname");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}