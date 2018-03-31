package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Award_Evaluate_CountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Award_Evaluate_CountExample() {
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

        public Criteria andSc_idIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andSc_idIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSc_idEqualTo(Long value) {
            addCriterion("sc_id =", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotEqualTo(Long value) {
            addCriterion("sc_id <>", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idGreaterThan(Long value) {
            addCriterion("sc_id >", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_id >=", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idLessThan(Long value) {
            addCriterion("sc_id <", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idLessThanOrEqualTo(Long value) {
            addCriterion("sc_id <=", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idIn(List<Long> values) {
            addCriterion("sc_id in", values, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotIn(List<Long> values) {
            addCriterion("sc_id not in", values, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idBetween(Long value1, Long value2) {
            addCriterion("sc_id between", value1, value2, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotBetween(Long value1, Long value2) {
            addCriterion("sc_id not between", value1, value2, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_activityidIsNull() {
            addCriterion("sc_activityid is null");
            return (Criteria) this;
        }

        public Criteria andSc_activityidIsNotNull() {
            addCriterion("sc_activityid is not null");
            return (Criteria) this;
        }

        public Criteria andSc_activityidEqualTo(Long value) {
            addCriterion("sc_activityid =", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidNotEqualTo(Long value) {
            addCriterion("sc_activityid <>", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidGreaterThan(Long value) {
            addCriterion("sc_activityid >", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_activityid >=", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidLessThan(Long value) {
            addCriterion("sc_activityid <", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidLessThanOrEqualTo(Long value) {
            addCriterion("sc_activityid <=", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidIn(List<Long> values) {
            addCriterion("sc_activityid in", values, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidNotIn(List<Long> values) {
            addCriterion("sc_activityid not in", values, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidBetween(Long value1, Long value2) {
            addCriterion("sc_activityid between", value1, value2, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidNotBetween(Long value1, Long value2) {
            addCriterion("sc_activityid not between", value1, value2, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoIsNull() {
            addCriterion("sc_orderno is null");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoIsNotNull() {
            addCriterion("sc_orderno is not null");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoEqualTo(String value) {
            addCriterion("sc_orderno =", value, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoNotEqualTo(String value) {
            addCriterion("sc_orderno <>", value, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoGreaterThan(String value) {
            addCriterion("sc_orderno >", value, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoGreaterThanOrEqualTo(String value) {
            addCriterion("sc_orderno >=", value, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoLessThan(String value) {
            addCriterion("sc_orderno <", value, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoLessThanOrEqualTo(String value) {
            addCriterion("sc_orderno <=", value, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoLike(String value) {
            addCriterion("sc_orderno like", value, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoNotLike(String value) {
            addCriterion("sc_orderno not like", value, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoIn(List<String> values) {
            addCriterion("sc_orderno in", values, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoNotIn(List<String> values) {
            addCriterion("sc_orderno not in", values, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoBetween(String value1, String value2) {
            addCriterion("sc_orderno between", value1, value2, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_ordernoNotBetween(String value1, String value2) {
            addCriterion("sc_orderno not between", value1, value2, "sc_orderno");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidIsNull() {
            addCriterion("sc_appraiseid is null");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidIsNotNull() {
            addCriterion("sc_appraiseid is not null");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidEqualTo(Long value) {
            addCriterion("sc_appraiseid =", value, "sc_appraiseid");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidNotEqualTo(Long value) {
            addCriterion("sc_appraiseid <>", value, "sc_appraiseid");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidGreaterThan(Long value) {
            addCriterion("sc_appraiseid >", value, "sc_appraiseid");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_appraiseid >=", value, "sc_appraiseid");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidLessThan(Long value) {
            addCriterion("sc_appraiseid <", value, "sc_appraiseid");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidLessThanOrEqualTo(Long value) {
            addCriterion("sc_appraiseid <=", value, "sc_appraiseid");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidIn(List<Long> values) {
            addCriterion("sc_appraiseid in", values, "sc_appraiseid");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidNotIn(List<Long> values) {
            addCriterion("sc_appraiseid not in", values, "sc_appraiseid");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidBetween(Long value1, Long value2) {
            addCriterion("sc_appraiseid between", value1, value2, "sc_appraiseid");
            return (Criteria) this;
        }

        public Criteria andSc_appraiseidNotBetween(Long value1, Long value2) {
            addCriterion("sc_appraiseid not between", value1, value2, "sc_appraiseid");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralIsNull() {
            addCriterion("sc_addintegral is null");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralIsNotNull() {
            addCriterion("sc_addintegral is not null");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralEqualTo(BigDecimal value) {
            addCriterion("sc_addintegral =", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralNotEqualTo(BigDecimal value) {
            addCriterion("sc_addintegral <>", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralGreaterThan(BigDecimal value) {
            addCriterion("sc_addintegral >", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sc_addintegral >=", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralLessThan(BigDecimal value) {
            addCriterion("sc_addintegral <", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sc_addintegral <=", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralIn(List<BigDecimal> values) {
            addCriterion("sc_addintegral in", values, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralNotIn(List<BigDecimal> values) {
            addCriterion("sc_addintegral not in", values, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sc_addintegral between", value1, value2, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sc_addintegral not between", value1, value2, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstIsNull() {
            addCriterion("sc_isfirst is null");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstIsNotNull() {
            addCriterion("sc_isfirst is not null");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstEqualTo(Boolean value) {
            addCriterion("sc_isfirst =", value, "sc_isfirst");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstNotEqualTo(Boolean value) {
            addCriterion("sc_isfirst <>", value, "sc_isfirst");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstGreaterThan(Boolean value) {
            addCriterion("sc_isfirst >", value, "sc_isfirst");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sc_isfirst >=", value, "sc_isfirst");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstLessThan(Boolean value) {
            addCriterion("sc_isfirst <", value, "sc_isfirst");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstLessThanOrEqualTo(Boolean value) {
            addCriterion("sc_isfirst <=", value, "sc_isfirst");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstIn(List<Boolean> values) {
            addCriterion("sc_isfirst in", values, "sc_isfirst");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstNotIn(List<Boolean> values) {
            addCriterion("sc_isfirst not in", values, "sc_isfirst");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstBetween(Boolean value1, Boolean value2) {
            addCriterion("sc_isfirst between", value1, value2, "sc_isfirst");
            return (Criteria) this;
        }

        public Criteria andSc_isfirstNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sc_isfirst not between", value1, value2, "sc_isfirst");
            return (Criteria) this;
        }

        public Criteria andSc_useridIsNull() {
            addCriterion("sc_userid is null");
            return (Criteria) this;
        }

        public Criteria andSc_useridIsNotNull() {
            addCriterion("sc_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSc_useridEqualTo(Long value) {
            addCriterion("sc_userid =", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridNotEqualTo(Long value) {
            addCriterion("sc_userid <>", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridGreaterThan(Long value) {
            addCriterion("sc_userid >", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_userid >=", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridLessThan(Long value) {
            addCriterion("sc_userid <", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridLessThanOrEqualTo(Long value) {
            addCriterion("sc_userid <=", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridIn(List<Long> values) {
            addCriterion("sc_userid in", values, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridNotIn(List<Long> values) {
            addCriterion("sc_userid not in", values, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridBetween(Long value1, Long value2) {
            addCriterion("sc_userid between", value1, value2, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridNotBetween(Long value1, Long value2) {
            addCriterion("sc_userid not between", value1, value2, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_createdateIsNull() {
            addCriterion("sc_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSc_createdateIsNotNull() {
            addCriterion("sc_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSc_createdateEqualTo(Date value) {
            addCriterion("sc_createdate =", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateNotEqualTo(Date value) {
            addCriterion("sc_createdate <>", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateGreaterThan(Date value) {
            addCriterion("sc_createdate >", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sc_createdate >=", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateLessThan(Date value) {
            addCriterion("sc_createdate <", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateLessThanOrEqualTo(Date value) {
            addCriterion("sc_createdate <=", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateIn(List<Date> values) {
            addCriterion("sc_createdate in", values, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateNotIn(List<Date> values) {
            addCriterion("sc_createdate not in", values, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateBetween(Date value1, Date value2) {
            addCriterion("sc_createdate between", value1, value2, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateNotBetween(Date value1, Date value2) {
            addCriterion("sc_createdate not between", value1, value2, "sc_createdate");
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