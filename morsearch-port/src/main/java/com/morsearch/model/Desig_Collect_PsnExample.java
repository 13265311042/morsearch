package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Desig_Collect_PsnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Desig_Collect_PsnExample() {
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

        public Criteria andDs_idIsNull() {
            addCriterion("ds_id is null");
            return (Criteria) this;
        }

        public Criteria andDs_idIsNotNull() {
            addCriterion("ds_id is not null");
            return (Criteria) this;
        }

        public Criteria andDs_idEqualTo(Long value) {
            addCriterion("ds_id =", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idNotEqualTo(Long value) {
            addCriterion("ds_id <>", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idGreaterThan(Long value) {
            addCriterion("ds_id >", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ds_id >=", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idLessThan(Long value) {
            addCriterion("ds_id <", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idLessThanOrEqualTo(Long value) {
            addCriterion("ds_id <=", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idIn(List<Long> values) {
            addCriterion("ds_id in", values, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idNotIn(List<Long> values) {
            addCriterion("ds_id not in", values, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idBetween(Long value1, Long value2) {
            addCriterion("ds_id between", value1, value2, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idNotBetween(Long value1, Long value2) {
            addCriterion("ds_id not between", value1, value2, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_saleridIsNull() {
            addCriterion("ds_salerid is null");
            return (Criteria) this;
        }

        public Criteria andDs_saleridIsNotNull() {
            addCriterion("ds_salerid is not null");
            return (Criteria) this;
        }

        public Criteria andDs_saleridEqualTo(Long value) {
            addCriterion("ds_salerid =", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridNotEqualTo(Long value) {
            addCriterion("ds_salerid <>", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridGreaterThan(Long value) {
            addCriterion("ds_salerid >", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridGreaterThanOrEqualTo(Long value) {
            addCriterion("ds_salerid >=", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridLessThan(Long value) {
            addCriterion("ds_salerid <", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridLessThanOrEqualTo(Long value) {
            addCriterion("ds_salerid <=", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridIn(List<Long> values) {
            addCriterion("ds_salerid in", values, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridNotIn(List<Long> values) {
            addCriterion("ds_salerid not in", values, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridBetween(Long value1, Long value2) {
            addCriterion("ds_salerid between", value1, value2, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridNotBetween(Long value1, Long value2) {
            addCriterion("ds_salerid not between", value1, value2, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_createidIsNull() {
            addCriterion("ds_createid is null");
            return (Criteria) this;
        }

        public Criteria andDs_createidIsNotNull() {
            addCriterion("ds_createid is not null");
            return (Criteria) this;
        }

        public Criteria andDs_createidEqualTo(Long value) {
            addCriterion("ds_createid =", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidNotEqualTo(Long value) {
            addCriterion("ds_createid <>", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidGreaterThan(Long value) {
            addCriterion("ds_createid >", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("ds_createid >=", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidLessThan(Long value) {
            addCriterion("ds_createid <", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidLessThanOrEqualTo(Long value) {
            addCriterion("ds_createid <=", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidIn(List<Long> values) {
            addCriterion("ds_createid in", values, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidNotIn(List<Long> values) {
            addCriterion("ds_createid not in", values, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidBetween(Long value1, Long value2) {
            addCriterion("ds_createid between", value1, value2, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidNotBetween(Long value1, Long value2) {
            addCriterion("ds_createid not between", value1, value2, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createnoIsNull() {
            addCriterion("ds_createno is null");
            return (Criteria) this;
        }

        public Criteria andDs_createnoIsNotNull() {
            addCriterion("ds_createno is not null");
            return (Criteria) this;
        }

        public Criteria andDs_createnoEqualTo(String value) {
            addCriterion("ds_createno =", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoNotEqualTo(String value) {
            addCriterion("ds_createno <>", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoGreaterThan(String value) {
            addCriterion("ds_createno >", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("ds_createno >=", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoLessThan(String value) {
            addCriterion("ds_createno <", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoLessThanOrEqualTo(String value) {
            addCriterion("ds_createno <=", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoLike(String value) {
            addCriterion("ds_createno like", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoNotLike(String value) {
            addCriterion("ds_createno not like", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoIn(List<String> values) {
            addCriterion("ds_createno in", values, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoNotIn(List<String> values) {
            addCriterion("ds_createno not in", values, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoBetween(String value1, String value2) {
            addCriterion("ds_createno between", value1, value2, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoNotBetween(String value1, String value2) {
            addCriterion("ds_createno not between", value1, value2, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createdateIsNull() {
            addCriterion("ds_createdate is null");
            return (Criteria) this;
        }

        public Criteria andDs_createdateIsNotNull() {
            addCriterion("ds_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andDs_createdateEqualTo(Date value) {
            addCriterion("ds_createdate =", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateNotEqualTo(Date value) {
            addCriterion("ds_createdate <>", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateGreaterThan(Date value) {
            addCriterion("ds_createdate >", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ds_createdate >=", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateLessThan(Date value) {
            addCriterion("ds_createdate <", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateLessThanOrEqualTo(Date value) {
            addCriterion("ds_createdate <=", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateIn(List<Date> values) {
            addCriterion("ds_createdate in", values, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateNotIn(List<Date> values) {
            addCriterion("ds_createdate not in", values, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateBetween(Date value1, Date value2) {
            addCriterion("ds_createdate between", value1, value2, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateNotBetween(Date value1, Date value2) {
            addCriterion("ds_createdate not between", value1, value2, "ds_createdate");
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