package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sales_Collect_PsnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sales_Collect_PsnExample() {
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

        public Criteria andSs_idIsNull() {
            addCriterion("ss_id is null");
            return (Criteria) this;
        }

        public Criteria andSs_idIsNotNull() {
            addCriterion("ss_id is not null");
            return (Criteria) this;
        }

        public Criteria andSs_idEqualTo(Long value) {
            addCriterion("ss_id =", value, "ss_id");
            return (Criteria) this;
        }

        public Criteria andSs_idNotEqualTo(Long value) {
            addCriterion("ss_id <>", value, "ss_id");
            return (Criteria) this;
        }

        public Criteria andSs_idGreaterThan(Long value) {
            addCriterion("ss_id >", value, "ss_id");
            return (Criteria) this;
        }

        public Criteria andSs_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ss_id >=", value, "ss_id");
            return (Criteria) this;
        }

        public Criteria andSs_idLessThan(Long value) {
            addCriterion("ss_id <", value, "ss_id");
            return (Criteria) this;
        }

        public Criteria andSs_idLessThanOrEqualTo(Long value) {
            addCriterion("ss_id <=", value, "ss_id");
            return (Criteria) this;
        }

        public Criteria andSs_idIn(List<Long> values) {
            addCriterion("ss_id in", values, "ss_id");
            return (Criteria) this;
        }

        public Criteria andSs_idNotIn(List<Long> values) {
            addCriterion("ss_id not in", values, "ss_id");
            return (Criteria) this;
        }

        public Criteria andSs_idBetween(Long value1, Long value2) {
            addCriterion("ss_id between", value1, value2, "ss_id");
            return (Criteria) this;
        }

        public Criteria andSs_idNotBetween(Long value1, Long value2) {
            addCriterion("ss_id not between", value1, value2, "ss_id");
            return (Criteria) this;
        }

        public Criteria andSs_designeridIsNull() {
            addCriterion("ss_designerid is null");
            return (Criteria) this;
        }

        public Criteria andSs_designeridIsNotNull() {
            addCriterion("ss_designerid is not null");
            return (Criteria) this;
        }

        public Criteria andSs_designeridEqualTo(Long value) {
            addCriterion("ss_designerid =", value, "ss_designerid");
            return (Criteria) this;
        }

        public Criteria andSs_designeridNotEqualTo(Long value) {
            addCriterion("ss_designerid <>", value, "ss_designerid");
            return (Criteria) this;
        }

        public Criteria andSs_designeridGreaterThan(Long value) {
            addCriterion("ss_designerid >", value, "ss_designerid");
            return (Criteria) this;
        }

        public Criteria andSs_designeridGreaterThanOrEqualTo(Long value) {
            addCriterion("ss_designerid >=", value, "ss_designerid");
            return (Criteria) this;
        }

        public Criteria andSs_designeridLessThan(Long value) {
            addCriterion("ss_designerid <", value, "ss_designerid");
            return (Criteria) this;
        }

        public Criteria andSs_designeridLessThanOrEqualTo(Long value) {
            addCriterion("ss_designerid <=", value, "ss_designerid");
            return (Criteria) this;
        }

        public Criteria andSs_designeridIn(List<Long> values) {
            addCriterion("ss_designerid in", values, "ss_designerid");
            return (Criteria) this;
        }

        public Criteria andSs_designeridNotIn(List<Long> values) {
            addCriterion("ss_designerid not in", values, "ss_designerid");
            return (Criteria) this;
        }

        public Criteria andSs_designeridBetween(Long value1, Long value2) {
            addCriterion("ss_designerid between", value1, value2, "ss_designerid");
            return (Criteria) this;
        }

        public Criteria andSs_designeridNotBetween(Long value1, Long value2) {
            addCriterion("ss_designerid not between", value1, value2, "ss_designerid");
            return (Criteria) this;
        }

        public Criteria andSs_createidIsNull() {
            addCriterion("ss_createid is null");
            return (Criteria) this;
        }

        public Criteria andSs_createidIsNotNull() {
            addCriterion("ss_createid is not null");
            return (Criteria) this;
        }

        public Criteria andSs_createidEqualTo(Long value) {
            addCriterion("ss_createid =", value, "ss_createid");
            return (Criteria) this;
        }

        public Criteria andSs_createidNotEqualTo(Long value) {
            addCriterion("ss_createid <>", value, "ss_createid");
            return (Criteria) this;
        }

        public Criteria andSs_createidGreaterThan(Long value) {
            addCriterion("ss_createid >", value, "ss_createid");
            return (Criteria) this;
        }

        public Criteria andSs_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("ss_createid >=", value, "ss_createid");
            return (Criteria) this;
        }

        public Criteria andSs_createidLessThan(Long value) {
            addCriterion("ss_createid <", value, "ss_createid");
            return (Criteria) this;
        }

        public Criteria andSs_createidLessThanOrEqualTo(Long value) {
            addCriterion("ss_createid <=", value, "ss_createid");
            return (Criteria) this;
        }

        public Criteria andSs_createidIn(List<Long> values) {
            addCriterion("ss_createid in", values, "ss_createid");
            return (Criteria) this;
        }

        public Criteria andSs_createidNotIn(List<Long> values) {
            addCriterion("ss_createid not in", values, "ss_createid");
            return (Criteria) this;
        }

        public Criteria andSs_createidBetween(Long value1, Long value2) {
            addCriterion("ss_createid between", value1, value2, "ss_createid");
            return (Criteria) this;
        }

        public Criteria andSs_createidNotBetween(Long value1, Long value2) {
            addCriterion("ss_createid not between", value1, value2, "ss_createid");
            return (Criteria) this;
        }

        public Criteria andSs_createnoIsNull() {
            addCriterion("ss_createno is null");
            return (Criteria) this;
        }

        public Criteria andSs_createnoIsNotNull() {
            addCriterion("ss_createno is not null");
            return (Criteria) this;
        }

        public Criteria andSs_createnoEqualTo(String value) {
            addCriterion("ss_createno =", value, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createnoNotEqualTo(String value) {
            addCriterion("ss_createno <>", value, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createnoGreaterThan(String value) {
            addCriterion("ss_createno >", value, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("ss_createno >=", value, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createnoLessThan(String value) {
            addCriterion("ss_createno <", value, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createnoLessThanOrEqualTo(String value) {
            addCriterion("ss_createno <=", value, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createnoLike(String value) {
            addCriterion("ss_createno like", value, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createnoNotLike(String value) {
            addCriterion("ss_createno not like", value, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createnoIn(List<String> values) {
            addCriterion("ss_createno in", values, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createnoNotIn(List<String> values) {
            addCriterion("ss_createno not in", values, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createnoBetween(String value1, String value2) {
            addCriterion("ss_createno between", value1, value2, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createnoNotBetween(String value1, String value2) {
            addCriterion("ss_createno not between", value1, value2, "ss_createno");
            return (Criteria) this;
        }

        public Criteria andSs_createdateIsNull() {
            addCriterion("ss_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSs_createdateIsNotNull() {
            addCriterion("ss_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSs_createdateEqualTo(Date value) {
            addCriterion("ss_createdate =", value, "ss_createdate");
            return (Criteria) this;
        }

        public Criteria andSs_createdateNotEqualTo(Date value) {
            addCriterion("ss_createdate <>", value, "ss_createdate");
            return (Criteria) this;
        }

        public Criteria andSs_createdateGreaterThan(Date value) {
            addCriterion("ss_createdate >", value, "ss_createdate");
            return (Criteria) this;
        }

        public Criteria andSs_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ss_createdate >=", value, "ss_createdate");
            return (Criteria) this;
        }

        public Criteria andSs_createdateLessThan(Date value) {
            addCriterion("ss_createdate <", value, "ss_createdate");
            return (Criteria) this;
        }

        public Criteria andSs_createdateLessThanOrEqualTo(Date value) {
            addCriterion("ss_createdate <=", value, "ss_createdate");
            return (Criteria) this;
        }

        public Criteria andSs_createdateIn(List<Date> values) {
            addCriterion("ss_createdate in", values, "ss_createdate");
            return (Criteria) this;
        }

        public Criteria andSs_createdateNotIn(List<Date> values) {
            addCriterion("ss_createdate not in", values, "ss_createdate");
            return (Criteria) this;
        }

        public Criteria andSs_createdateBetween(Date value1, Date value2) {
            addCriterion("ss_createdate between", value1, value2, "ss_createdate");
            return (Criteria) this;
        }

        public Criteria andSs_createdateNotBetween(Date value1, Date value2) {
            addCriterion("ss_createdate not between", value1, value2, "ss_createdate");
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