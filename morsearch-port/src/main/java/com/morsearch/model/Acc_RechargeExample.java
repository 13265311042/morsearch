package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Acc_RechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Acc_RechargeExample() {
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

        public Criteria andAr_idIsNull() {
            addCriterion("ar_id is null");
            return (Criteria) this;
        }

        public Criteria andAr_idIsNotNull() {
            addCriterion("ar_id is not null");
            return (Criteria) this;
        }

        public Criteria andAr_idEqualTo(Long value) {
            addCriterion("ar_id =", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idNotEqualTo(Long value) {
            addCriterion("ar_id <>", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idGreaterThan(Long value) {
            addCriterion("ar_id >", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ar_id >=", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idLessThan(Long value) {
            addCriterion("ar_id <", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idLessThanOrEqualTo(Long value) {
            addCriterion("ar_id <=", value, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idIn(List<Long> values) {
            addCriterion("ar_id in", values, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idNotIn(List<Long> values) {
            addCriterion("ar_id not in", values, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idBetween(Long value1, Long value2) {
            addCriterion("ar_id between", value1, value2, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_idNotBetween(Long value1, Long value2) {
            addCriterion("ar_id not between", value1, value2, "ar_id");
            return (Criteria) this;
        }

        public Criteria andAr_noIsNull() {
            addCriterion("ar_no is null");
            return (Criteria) this;
        }

        public Criteria andAr_noIsNotNull() {
            addCriterion("ar_no is not null");
            return (Criteria) this;
        }

        public Criteria andAr_noEqualTo(String value) {
            addCriterion("ar_no =", value, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_noNotEqualTo(String value) {
            addCriterion("ar_no <>", value, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_noGreaterThan(String value) {
            addCriterion("ar_no >", value, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_noGreaterThanOrEqualTo(String value) {
            addCriterion("ar_no >=", value, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_noLessThan(String value) {
            addCriterion("ar_no <", value, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_noLessThanOrEqualTo(String value) {
            addCriterion("ar_no <=", value, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_noLike(String value) {
            addCriterion("ar_no like", value, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_noNotLike(String value) {
            addCriterion("ar_no not like", value, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_noIn(List<String> values) {
            addCriterion("ar_no in", values, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_noNotIn(List<String> values) {
            addCriterion("ar_no not in", values, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_noBetween(String value1, String value2) {
            addCriterion("ar_no between", value1, value2, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_noNotBetween(String value1, String value2) {
            addCriterion("ar_no not between", value1, value2, "ar_no");
            return (Criteria) this;
        }

        public Criteria andAr_activityidIsNull() {
            addCriterion("ar_activityid is null");
            return (Criteria) this;
        }

        public Criteria andAr_activityidIsNotNull() {
            addCriterion("ar_activityid is not null");
            return (Criteria) this;
        }

        public Criteria andAr_activityidEqualTo(Long value) {
            addCriterion("ar_activityid =", value, "ar_activityid");
            return (Criteria) this;
        }

        public Criteria andAr_activityidNotEqualTo(Long value) {
            addCriterion("ar_activityid <>", value, "ar_activityid");
            return (Criteria) this;
        }

        public Criteria andAr_activityidGreaterThan(Long value) {
            addCriterion("ar_activityid >", value, "ar_activityid");
            return (Criteria) this;
        }

        public Criteria andAr_activityidGreaterThanOrEqualTo(Long value) {
            addCriterion("ar_activityid >=", value, "ar_activityid");
            return (Criteria) this;
        }

        public Criteria andAr_activityidLessThan(Long value) {
            addCriterion("ar_activityid <", value, "ar_activityid");
            return (Criteria) this;
        }

        public Criteria andAr_activityidLessThanOrEqualTo(Long value) {
            addCriterion("ar_activityid <=", value, "ar_activityid");
            return (Criteria) this;
        }

        public Criteria andAr_activityidIn(List<Long> values) {
            addCriterion("ar_activityid in", values, "ar_activityid");
            return (Criteria) this;
        }

        public Criteria andAr_activityidNotIn(List<Long> values) {
            addCriterion("ar_activityid not in", values, "ar_activityid");
            return (Criteria) this;
        }

        public Criteria andAr_activityidBetween(Long value1, Long value2) {
            addCriterion("ar_activityid between", value1, value2, "ar_activityid");
            return (Criteria) this;
        }

        public Criteria andAr_activityidNotBetween(Long value1, Long value2) {
            addCriterion("ar_activityid not between", value1, value2, "ar_activityid");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameIsNull() {
            addCriterion("ar_activityname is null");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameIsNotNull() {
            addCriterion("ar_activityname is not null");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameEqualTo(String value) {
            addCriterion("ar_activityname =", value, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameNotEqualTo(String value) {
            addCriterion("ar_activityname <>", value, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameGreaterThan(String value) {
            addCriterion("ar_activityname >", value, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameGreaterThanOrEqualTo(String value) {
            addCriterion("ar_activityname >=", value, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameLessThan(String value) {
            addCriterion("ar_activityname <", value, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameLessThanOrEqualTo(String value) {
            addCriterion("ar_activityname <=", value, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameLike(String value) {
            addCriterion("ar_activityname like", value, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameNotLike(String value) {
            addCriterion("ar_activityname not like", value, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameIn(List<String> values) {
            addCriterion("ar_activityname in", values, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameNotIn(List<String> values) {
            addCriterion("ar_activityname not in", values, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameBetween(String value1, String value2) {
            addCriterion("ar_activityname between", value1, value2, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_activitynameNotBetween(String value1, String value2) {
            addCriterion("ar_activityname not between", value1, value2, "ar_activityname");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeIsNull() {
            addCriterion("ar_typecode is null");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeIsNotNull() {
            addCriterion("ar_typecode is not null");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeEqualTo(String value) {
            addCriterion("ar_typecode =", value, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeNotEqualTo(String value) {
            addCriterion("ar_typecode <>", value, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeGreaterThan(String value) {
            addCriterion("ar_typecode >", value, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ar_typecode >=", value, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeLessThan(String value) {
            addCriterion("ar_typecode <", value, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeLessThanOrEqualTo(String value) {
            addCriterion("ar_typecode <=", value, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeLike(String value) {
            addCriterion("ar_typecode like", value, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeNotLike(String value) {
            addCriterion("ar_typecode not like", value, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeIn(List<String> values) {
            addCriterion("ar_typecode in", values, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeNotIn(List<String> values) {
            addCriterion("ar_typecode not in", values, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeBetween(String value1, String value2) {
            addCriterion("ar_typecode between", value1, value2, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typecodeNotBetween(String value1, String value2) {
            addCriterion("ar_typecode not between", value1, value2, "ar_typecode");
            return (Criteria) this;
        }

        public Criteria andAr_typenameIsNull() {
            addCriterion("ar_typename is null");
            return (Criteria) this;
        }

        public Criteria andAr_typenameIsNotNull() {
            addCriterion("ar_typename is not null");
            return (Criteria) this;
        }

        public Criteria andAr_typenameEqualTo(String value) {
            addCriterion("ar_typename =", value, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_typenameNotEqualTo(String value) {
            addCriterion("ar_typename <>", value, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_typenameGreaterThan(String value) {
            addCriterion("ar_typename >", value, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_typenameGreaterThanOrEqualTo(String value) {
            addCriterion("ar_typename >=", value, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_typenameLessThan(String value) {
            addCriterion("ar_typename <", value, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_typenameLessThanOrEqualTo(String value) {
            addCriterion("ar_typename <=", value, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_typenameLike(String value) {
            addCriterion("ar_typename like", value, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_typenameNotLike(String value) {
            addCriterion("ar_typename not like", value, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_typenameIn(List<String> values) {
            addCriterion("ar_typename in", values, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_typenameNotIn(List<String> values) {
            addCriterion("ar_typename not in", values, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_typenameBetween(String value1, String value2) {
            addCriterion("ar_typename between", value1, value2, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_typenameNotBetween(String value1, String value2) {
            addCriterion("ar_typename not between", value1, value2, "ar_typename");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderIsNull() {
            addCriterion("ar_priceorder is null");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderIsNotNull() {
            addCriterion("ar_priceorder is not null");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderEqualTo(BigDecimal value) {
            addCriterion("ar_priceorder =", value, "ar_priceorder");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderNotEqualTo(BigDecimal value) {
            addCriterion("ar_priceorder <>", value, "ar_priceorder");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderGreaterThan(BigDecimal value) {
            addCriterion("ar_priceorder >", value, "ar_priceorder");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_priceorder >=", value, "ar_priceorder");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderLessThan(BigDecimal value) {
            addCriterion("ar_priceorder <", value, "ar_priceorder");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_priceorder <=", value, "ar_priceorder");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderIn(List<BigDecimal> values) {
            addCriterion("ar_priceorder in", values, "ar_priceorder");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderNotIn(List<BigDecimal> values) {
            addCriterion("ar_priceorder not in", values, "ar_priceorder");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_priceorder between", value1, value2, "ar_priceorder");
            return (Criteria) this;
        }

        public Criteria andAr_priceorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_priceorder not between", value1, value2, "ar_priceorder");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualIsNull() {
            addCriterion("ar_priceactual is null");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualIsNotNull() {
            addCriterion("ar_priceactual is not null");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualEqualTo(BigDecimal value) {
            addCriterion("ar_priceactual =", value, "ar_priceactual");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualNotEqualTo(BigDecimal value) {
            addCriterion("ar_priceactual <>", value, "ar_priceactual");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualGreaterThan(BigDecimal value) {
            addCriterion("ar_priceactual >", value, "ar_priceactual");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_priceactual >=", value, "ar_priceactual");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualLessThan(BigDecimal value) {
            addCriterion("ar_priceactual <", value, "ar_priceactual");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_priceactual <=", value, "ar_priceactual");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualIn(List<BigDecimal> values) {
            addCriterion("ar_priceactual in", values, "ar_priceactual");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualNotIn(List<BigDecimal> values) {
            addCriterion("ar_priceactual not in", values, "ar_priceactual");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_priceactual between", value1, value2, "ar_priceactual");
            return (Criteria) this;
        }

        public Criteria andAr_priceactualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_priceactual not between", value1, value2, "ar_priceactual");
            return (Criteria) this;
        }

        public Criteria andAr_addamountIsNull() {
            addCriterion("ar_addamount is null");
            return (Criteria) this;
        }

        public Criteria andAr_addamountIsNotNull() {
            addCriterion("ar_addamount is not null");
            return (Criteria) this;
        }

        public Criteria andAr_addamountEqualTo(BigDecimal value) {
            addCriterion("ar_addamount =", value, "ar_addamount");
            return (Criteria) this;
        }

        public Criteria andAr_addamountNotEqualTo(BigDecimal value) {
            addCriterion("ar_addamount <>", value, "ar_addamount");
            return (Criteria) this;
        }

        public Criteria andAr_addamountGreaterThan(BigDecimal value) {
            addCriterion("ar_addamount >", value, "ar_addamount");
            return (Criteria) this;
        }

        public Criteria andAr_addamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_addamount >=", value, "ar_addamount");
            return (Criteria) this;
        }

        public Criteria andAr_addamountLessThan(BigDecimal value) {
            addCriterion("ar_addamount <", value, "ar_addamount");
            return (Criteria) this;
        }

        public Criteria andAr_addamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_addamount <=", value, "ar_addamount");
            return (Criteria) this;
        }

        public Criteria andAr_addamountIn(List<BigDecimal> values) {
            addCriterion("ar_addamount in", values, "ar_addamount");
            return (Criteria) this;
        }

        public Criteria andAr_addamountNotIn(List<BigDecimal> values) {
            addCriterion("ar_addamount not in", values, "ar_addamount");
            return (Criteria) this;
        }

        public Criteria andAr_addamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_addamount between", value1, value2, "ar_addamount");
            return (Criteria) this;
        }

        public Criteria andAr_addamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_addamount not between", value1, value2, "ar_addamount");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralIsNull() {
            addCriterion("ar_addintegral is null");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralIsNotNull() {
            addCriterion("ar_addintegral is not null");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralEqualTo(BigDecimal value) {
            addCriterion("ar_addintegral =", value, "ar_addintegral");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralNotEqualTo(BigDecimal value) {
            addCriterion("ar_addintegral <>", value, "ar_addintegral");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralGreaterThan(BigDecimal value) {
            addCriterion("ar_addintegral >", value, "ar_addintegral");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_addintegral >=", value, "ar_addintegral");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralLessThan(BigDecimal value) {
            addCriterion("ar_addintegral <", value, "ar_addintegral");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_addintegral <=", value, "ar_addintegral");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralIn(List<BigDecimal> values) {
            addCriterion("ar_addintegral in", values, "ar_addintegral");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralNotIn(List<BigDecimal> values) {
            addCriterion("ar_addintegral not in", values, "ar_addintegral");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_addintegral between", value1, value2, "ar_addintegral");
            return (Criteria) this;
        }

        public Criteria andAr_addintegralNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_addintegral not between", value1, value2, "ar_addintegral");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountIsNull() {
            addCriterion("ar_sumamount is null");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountIsNotNull() {
            addCriterion("ar_sumamount is not null");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountEqualTo(BigDecimal value) {
            addCriterion("ar_sumamount =", value, "ar_sumamount");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountNotEqualTo(BigDecimal value) {
            addCriterion("ar_sumamount <>", value, "ar_sumamount");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountGreaterThan(BigDecimal value) {
            addCriterion("ar_sumamount >", value, "ar_sumamount");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_sumamount >=", value, "ar_sumamount");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountLessThan(BigDecimal value) {
            addCriterion("ar_sumamount <", value, "ar_sumamount");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_sumamount <=", value, "ar_sumamount");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountIn(List<BigDecimal> values) {
            addCriterion("ar_sumamount in", values, "ar_sumamount");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountNotIn(List<BigDecimal> values) {
            addCriterion("ar_sumamount not in", values, "ar_sumamount");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_sumamount between", value1, value2, "ar_sumamount");
            return (Criteria) this;
        }

        public Criteria andAr_sumamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_sumamount not between", value1, value2, "ar_sumamount");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayIsNull() {
            addCriterion("ar_tradeway is null");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayIsNotNull() {
            addCriterion("ar_tradeway is not null");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayEqualTo(Byte value) {
            addCriterion("ar_tradeway =", value, "ar_tradeway");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayNotEqualTo(Byte value) {
            addCriterion("ar_tradeway <>", value, "ar_tradeway");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayGreaterThan(Byte value) {
            addCriterion("ar_tradeway >", value, "ar_tradeway");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayGreaterThanOrEqualTo(Byte value) {
            addCriterion("ar_tradeway >=", value, "ar_tradeway");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayLessThan(Byte value) {
            addCriterion("ar_tradeway <", value, "ar_tradeway");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayLessThanOrEqualTo(Byte value) {
            addCriterion("ar_tradeway <=", value, "ar_tradeway");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayIn(List<Byte> values) {
            addCriterion("ar_tradeway in", values, "ar_tradeway");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayNotIn(List<Byte> values) {
            addCriterion("ar_tradeway not in", values, "ar_tradeway");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayBetween(Byte value1, Byte value2) {
            addCriterion("ar_tradeway between", value1, value2, "ar_tradeway");
            return (Criteria) this;
        }

        public Criteria andAr_tradewayNotBetween(Byte value1, Byte value2) {
            addCriterion("ar_tradeway not between", value1, value2, "ar_tradeway");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameIsNull() {
            addCriterion("ar_tradename is null");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameIsNotNull() {
            addCriterion("ar_tradename is not null");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameEqualTo(String value) {
            addCriterion("ar_tradename =", value, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameNotEqualTo(String value) {
            addCriterion("ar_tradename <>", value, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameGreaterThan(String value) {
            addCriterion("ar_tradename >", value, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameGreaterThanOrEqualTo(String value) {
            addCriterion("ar_tradename >=", value, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameLessThan(String value) {
            addCriterion("ar_tradename <", value, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameLessThanOrEqualTo(String value) {
            addCriterion("ar_tradename <=", value, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameLike(String value) {
            addCriterion("ar_tradename like", value, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameNotLike(String value) {
            addCriterion("ar_tradename not like", value, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameIn(List<String> values) {
            addCriterion("ar_tradename in", values, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameNotIn(List<String> values) {
            addCriterion("ar_tradename not in", values, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameBetween(String value1, String value2) {
            addCriterion("ar_tradename between", value1, value2, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradenameNotBetween(String value1, String value2) {
            addCriterion("ar_tradename not between", value1, value2, "ar_tradename");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardIsNull() {
            addCriterion("ar_tradecard is null");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardIsNotNull() {
            addCriterion("ar_tradecard is not null");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardEqualTo(String value) {
            addCriterion("ar_tradecard =", value, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardNotEqualTo(String value) {
            addCriterion("ar_tradecard <>", value, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardGreaterThan(String value) {
            addCriterion("ar_tradecard >", value, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardGreaterThanOrEqualTo(String value) {
            addCriterion("ar_tradecard >=", value, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardLessThan(String value) {
            addCriterion("ar_tradecard <", value, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardLessThanOrEqualTo(String value) {
            addCriterion("ar_tradecard <=", value, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardLike(String value) {
            addCriterion("ar_tradecard like", value, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardNotLike(String value) {
            addCriterion("ar_tradecard not like", value, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardIn(List<String> values) {
            addCriterion("ar_tradecard in", values, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardNotIn(List<String> values) {
            addCriterion("ar_tradecard not in", values, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardBetween(String value1, String value2) {
            addCriterion("ar_tradecard between", value1, value2, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradecardNotBetween(String value1, String value2) {
            addCriterion("ar_tradecard not between", value1, value2, "ar_tradecard");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoIsNull() {
            addCriterion("ar_tradeorderno is null");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoIsNotNull() {
            addCriterion("ar_tradeorderno is not null");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoEqualTo(String value) {
            addCriterion("ar_tradeorderno =", value, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoNotEqualTo(String value) {
            addCriterion("ar_tradeorderno <>", value, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoGreaterThan(String value) {
            addCriterion("ar_tradeorderno >", value, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoGreaterThanOrEqualTo(String value) {
            addCriterion("ar_tradeorderno >=", value, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoLessThan(String value) {
            addCriterion("ar_tradeorderno <", value, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoLessThanOrEqualTo(String value) {
            addCriterion("ar_tradeorderno <=", value, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoLike(String value) {
            addCriterion("ar_tradeorderno like", value, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoNotLike(String value) {
            addCriterion("ar_tradeorderno not like", value, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoIn(List<String> values) {
            addCriterion("ar_tradeorderno in", values, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoNotIn(List<String> values) {
            addCriterion("ar_tradeorderno not in", values, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoBetween(String value1, String value2) {
            addCriterion("ar_tradeorderno between", value1, value2, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeordernoNotBetween(String value1, String value2) {
            addCriterion("ar_tradeorderno not between", value1, value2, "ar_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountIsNull() {
            addCriterion("ar_tradeamount is null");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountIsNotNull() {
            addCriterion("ar_tradeamount is not null");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountEqualTo(BigDecimal value) {
            addCriterion("ar_tradeamount =", value, "ar_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountNotEqualTo(BigDecimal value) {
            addCriterion("ar_tradeamount <>", value, "ar_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountGreaterThan(BigDecimal value) {
            addCriterion("ar_tradeamount >", value, "ar_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_tradeamount >=", value, "ar_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountLessThan(BigDecimal value) {
            addCriterion("ar_tradeamount <", value, "ar_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_tradeamount <=", value, "ar_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountIn(List<BigDecimal> values) {
            addCriterion("ar_tradeamount in", values, "ar_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountNotIn(List<BigDecimal> values) {
            addCriterion("ar_tradeamount not in", values, "ar_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_tradeamount between", value1, value2, "ar_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAr_tradeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_tradeamount not between", value1, value2, "ar_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateIsNull() {
            addCriterion("ar_tradeorderdate is null");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateIsNotNull() {
            addCriterion("ar_tradeorderdate is not null");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateEqualTo(Date value) {
            addCriterion("ar_tradeorderdate =", value, "ar_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateNotEqualTo(Date value) {
            addCriterion("ar_tradeorderdate <>", value, "ar_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateGreaterThan(Date value) {
            addCriterion("ar_tradeorderdate >", value, "ar_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ar_tradeorderdate >=", value, "ar_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateLessThan(Date value) {
            addCriterion("ar_tradeorderdate <", value, "ar_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateLessThanOrEqualTo(Date value) {
            addCriterion("ar_tradeorderdate <=", value, "ar_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateIn(List<Date> values) {
            addCriterion("ar_tradeorderdate in", values, "ar_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateNotIn(List<Date> values) {
            addCriterion("ar_tradeorderdate not in", values, "ar_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateBetween(Date value1, Date value2) {
            addCriterion("ar_tradeorderdate between", value1, value2, "ar_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAr_tradeorderdateNotBetween(Date value1, Date value2) {
            addCriterion("ar_tradeorderdate not between", value1, value2, "ar_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoIsNull() {
            addCriterion("ar_traderefundno is null");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoIsNotNull() {
            addCriterion("ar_traderefundno is not null");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoEqualTo(String value) {
            addCriterion("ar_traderefundno =", value, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoNotEqualTo(String value) {
            addCriterion("ar_traderefundno <>", value, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoGreaterThan(String value) {
            addCriterion("ar_traderefundno >", value, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoGreaterThanOrEqualTo(String value) {
            addCriterion("ar_traderefundno >=", value, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoLessThan(String value) {
            addCriterion("ar_traderefundno <", value, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoLessThanOrEqualTo(String value) {
            addCriterion("ar_traderefundno <=", value, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoLike(String value) {
            addCriterion("ar_traderefundno like", value, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoNotLike(String value) {
            addCriterion("ar_traderefundno not like", value, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoIn(List<String> values) {
            addCriterion("ar_traderefundno in", values, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoNotIn(List<String> values) {
            addCriterion("ar_traderefundno not in", values, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoBetween(String value1, String value2) {
            addCriterion("ar_traderefundno between", value1, value2, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundnoNotBetween(String value1, String value2) {
            addCriterion("ar_traderefundno not between", value1, value2, "ar_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateIsNull() {
            addCriterion("ar_traderefunddate is null");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateIsNotNull() {
            addCriterion("ar_traderefunddate is not null");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateEqualTo(Date value) {
            addCriterion("ar_traderefunddate =", value, "ar_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateNotEqualTo(Date value) {
            addCriterion("ar_traderefunddate <>", value, "ar_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateGreaterThan(Date value) {
            addCriterion("ar_traderefunddate >", value, "ar_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ar_traderefunddate >=", value, "ar_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateLessThan(Date value) {
            addCriterion("ar_traderefunddate <", value, "ar_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateLessThanOrEqualTo(Date value) {
            addCriterion("ar_traderefunddate <=", value, "ar_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateIn(List<Date> values) {
            addCriterion("ar_traderefunddate in", values, "ar_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateNotIn(List<Date> values) {
            addCriterion("ar_traderefunddate not in", values, "ar_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateBetween(Date value1, Date value2) {
            addCriterion("ar_traderefunddate between", value1, value2, "ar_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAr_traderefunddateNotBetween(Date value1, Date value2) {
            addCriterion("ar_traderefunddate not between", value1, value2, "ar_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountIsNull() {
            addCriterion("ar_traderefundamount is null");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountIsNotNull() {
            addCriterion("ar_traderefundamount is not null");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountEqualTo(BigDecimal value) {
            addCriterion("ar_traderefundamount =", value, "ar_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountNotEqualTo(BigDecimal value) {
            addCriterion("ar_traderefundamount <>", value, "ar_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountGreaterThan(BigDecimal value) {
            addCriterion("ar_traderefundamount >", value, "ar_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_traderefundamount >=", value, "ar_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountLessThan(BigDecimal value) {
            addCriterion("ar_traderefundamount <", value, "ar_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ar_traderefundamount <=", value, "ar_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountIn(List<BigDecimal> values) {
            addCriterion("ar_traderefundamount in", values, "ar_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountNotIn(List<BigDecimal> values) {
            addCriterion("ar_traderefundamount not in", values, "ar_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_traderefundamount between", value1, value2, "ar_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAr_traderefundamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ar_traderefundamount not between", value1, value2, "ar_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameIsNull() {
            addCriterion("ar_sourcename is null");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameIsNotNull() {
            addCriterion("ar_sourcename is not null");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameEqualTo(String value) {
            addCriterion("ar_sourcename =", value, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameNotEqualTo(String value) {
            addCriterion("ar_sourcename <>", value, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameGreaterThan(String value) {
            addCriterion("ar_sourcename >", value, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("ar_sourcename >=", value, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameLessThan(String value) {
            addCriterion("ar_sourcename <", value, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameLessThanOrEqualTo(String value) {
            addCriterion("ar_sourcename <=", value, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameLike(String value) {
            addCriterion("ar_sourcename like", value, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameNotLike(String value) {
            addCriterion("ar_sourcename not like", value, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameIn(List<String> values) {
            addCriterion("ar_sourcename in", values, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameNotIn(List<String> values) {
            addCriterion("ar_sourcename not in", values, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameBetween(String value1, String value2) {
            addCriterion("ar_sourcename between", value1, value2, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourcenameNotBetween(String value1, String value2) {
            addCriterion("ar_sourcename not between", value1, value2, "ar_sourcename");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionIsNull() {
            addCriterion("ar_sourceversion is null");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionIsNotNull() {
            addCriterion("ar_sourceversion is not null");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionEqualTo(String value) {
            addCriterion("ar_sourceversion =", value, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionNotEqualTo(String value) {
            addCriterion("ar_sourceversion <>", value, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionGreaterThan(String value) {
            addCriterion("ar_sourceversion >", value, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionGreaterThanOrEqualTo(String value) {
            addCriterion("ar_sourceversion >=", value, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionLessThan(String value) {
            addCriterion("ar_sourceversion <", value, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionLessThanOrEqualTo(String value) {
            addCriterion("ar_sourceversion <=", value, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionLike(String value) {
            addCriterion("ar_sourceversion like", value, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionNotLike(String value) {
            addCriterion("ar_sourceversion not like", value, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionIn(List<String> values) {
            addCriterion("ar_sourceversion in", values, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionNotIn(List<String> values) {
            addCriterion("ar_sourceversion not in", values, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionBetween(String value1, String value2) {
            addCriterion("ar_sourceversion between", value1, value2, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_sourceversionNotBetween(String value1, String value2) {
            addCriterion("ar_sourceversion not between", value1, value2, "ar_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAr_createidIsNull() {
            addCriterion("ar_createid is null");
            return (Criteria) this;
        }

        public Criteria andAr_createidIsNotNull() {
            addCriterion("ar_createid is not null");
            return (Criteria) this;
        }

        public Criteria andAr_createidEqualTo(Long value) {
            addCriterion("ar_createid =", value, "ar_createid");
            return (Criteria) this;
        }

        public Criteria andAr_createidNotEqualTo(Long value) {
            addCriterion("ar_createid <>", value, "ar_createid");
            return (Criteria) this;
        }

        public Criteria andAr_createidGreaterThan(Long value) {
            addCriterion("ar_createid >", value, "ar_createid");
            return (Criteria) this;
        }

        public Criteria andAr_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("ar_createid >=", value, "ar_createid");
            return (Criteria) this;
        }

        public Criteria andAr_createidLessThan(Long value) {
            addCriterion("ar_createid <", value, "ar_createid");
            return (Criteria) this;
        }

        public Criteria andAr_createidLessThanOrEqualTo(Long value) {
            addCriterion("ar_createid <=", value, "ar_createid");
            return (Criteria) this;
        }

        public Criteria andAr_createidIn(List<Long> values) {
            addCriterion("ar_createid in", values, "ar_createid");
            return (Criteria) this;
        }

        public Criteria andAr_createidNotIn(List<Long> values) {
            addCriterion("ar_createid not in", values, "ar_createid");
            return (Criteria) this;
        }

        public Criteria andAr_createidBetween(Long value1, Long value2) {
            addCriterion("ar_createid between", value1, value2, "ar_createid");
            return (Criteria) this;
        }

        public Criteria andAr_createidNotBetween(Long value1, Long value2) {
            addCriterion("ar_createid not between", value1, value2, "ar_createid");
            return (Criteria) this;
        }

        public Criteria andAr_createnoIsNull() {
            addCriterion("ar_createno is null");
            return (Criteria) this;
        }

        public Criteria andAr_createnoIsNotNull() {
            addCriterion("ar_createno is not null");
            return (Criteria) this;
        }

        public Criteria andAr_createnoEqualTo(String value) {
            addCriterion("ar_createno =", value, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createnoNotEqualTo(String value) {
            addCriterion("ar_createno <>", value, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createnoGreaterThan(String value) {
            addCriterion("ar_createno >", value, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("ar_createno >=", value, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createnoLessThan(String value) {
            addCriterion("ar_createno <", value, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createnoLessThanOrEqualTo(String value) {
            addCriterion("ar_createno <=", value, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createnoLike(String value) {
            addCriterion("ar_createno like", value, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createnoNotLike(String value) {
            addCriterion("ar_createno not like", value, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createnoIn(List<String> values) {
            addCriterion("ar_createno in", values, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createnoNotIn(List<String> values) {
            addCriterion("ar_createno not in", values, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createnoBetween(String value1, String value2) {
            addCriterion("ar_createno between", value1, value2, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createnoNotBetween(String value1, String value2) {
            addCriterion("ar_createno not between", value1, value2, "ar_createno");
            return (Criteria) this;
        }

        public Criteria andAr_createdateIsNull() {
            addCriterion("ar_createdate is null");
            return (Criteria) this;
        }

        public Criteria andAr_createdateIsNotNull() {
            addCriterion("ar_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andAr_createdateEqualTo(Date value) {
            addCriterion("ar_createdate =", value, "ar_createdate");
            return (Criteria) this;
        }

        public Criteria andAr_createdateNotEqualTo(Date value) {
            addCriterion("ar_createdate <>", value, "ar_createdate");
            return (Criteria) this;
        }

        public Criteria andAr_createdateGreaterThan(Date value) {
            addCriterion("ar_createdate >", value, "ar_createdate");
            return (Criteria) this;
        }

        public Criteria andAr_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ar_createdate >=", value, "ar_createdate");
            return (Criteria) this;
        }

        public Criteria andAr_createdateLessThan(Date value) {
            addCriterion("ar_createdate <", value, "ar_createdate");
            return (Criteria) this;
        }

        public Criteria andAr_createdateLessThanOrEqualTo(Date value) {
            addCriterion("ar_createdate <=", value, "ar_createdate");
            return (Criteria) this;
        }

        public Criteria andAr_createdateIn(List<Date> values) {
            addCriterion("ar_createdate in", values, "ar_createdate");
            return (Criteria) this;
        }

        public Criteria andAr_createdateNotIn(List<Date> values) {
            addCriterion("ar_createdate not in", values, "ar_createdate");
            return (Criteria) this;
        }

        public Criteria andAr_createdateBetween(Date value1, Date value2) {
            addCriterion("ar_createdate between", value1, value2, "ar_createdate");
            return (Criteria) this;
        }

        public Criteria andAr_createdateNotBetween(Date value1, Date value2) {
            addCriterion("ar_createdate not between", value1, value2, "ar_createdate");
            return (Criteria) this;
        }

        public Criteria andAr_statusIsNull() {
            addCriterion("ar_status is null");
            return (Criteria) this;
        }

        public Criteria andAr_statusIsNotNull() {
            addCriterion("ar_status is not null");
            return (Criteria) this;
        }

        public Criteria andAr_statusEqualTo(Byte value) {
            addCriterion("ar_status =", value, "ar_status");
            return (Criteria) this;
        }

        public Criteria andAr_statusNotEqualTo(Byte value) {
            addCriterion("ar_status <>", value, "ar_status");
            return (Criteria) this;
        }

        public Criteria andAr_statusGreaterThan(Byte value) {
            addCriterion("ar_status >", value, "ar_status");
            return (Criteria) this;
        }

        public Criteria andAr_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ar_status >=", value, "ar_status");
            return (Criteria) this;
        }

        public Criteria andAr_statusLessThan(Byte value) {
            addCriterion("ar_status <", value, "ar_status");
            return (Criteria) this;
        }

        public Criteria andAr_statusLessThanOrEqualTo(Byte value) {
            addCriterion("ar_status <=", value, "ar_status");
            return (Criteria) this;
        }

        public Criteria andAr_statusIn(List<Byte> values) {
            addCriterion("ar_status in", values, "ar_status");
            return (Criteria) this;
        }

        public Criteria andAr_statusNotIn(List<Byte> values) {
            addCriterion("ar_status not in", values, "ar_status");
            return (Criteria) this;
        }

        public Criteria andAr_statusBetween(Byte value1, Byte value2) {
            addCriterion("ar_status between", value1, value2, "ar_status");
            return (Criteria) this;
        }

        public Criteria andAr_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("ar_status not between", value1, value2, "ar_status");
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