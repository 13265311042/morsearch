package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sales_Collect_PmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sales_Collect_PmExample() {
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

        public Criteria andSm_idIsNull() {
            addCriterion("sm_id is null");
            return (Criteria) this;
        }

        public Criteria andSm_idIsNotNull() {
            addCriterion("sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSm_idEqualTo(Long value) {
            addCriterion("sm_id =", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotEqualTo(Long value) {
            addCriterion("sm_id <>", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idGreaterThan(Long value) {
            addCriterion("sm_id >", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_id >=", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idLessThan(Long value) {
            addCriterion("sm_id <", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idLessThanOrEqualTo(Long value) {
            addCriterion("sm_id <=", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idIn(List<Long> values) {
            addCriterion("sm_id in", values, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotIn(List<Long> values) {
            addCriterion("sm_id not in", values, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idBetween(Long value1, Long value2) {
            addCriterion("sm_id between", value1, value2, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotBetween(Long value1, Long value2) {
            addCriterion("sm_id not between", value1, value2, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidIsNull() {
            addCriterion("sm_archivesid is null");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidIsNotNull() {
            addCriterion("sm_archivesid is not null");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidEqualTo(Long value) {
            addCriterion("sm_archivesid =", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidNotEqualTo(Long value) {
            addCriterion("sm_archivesid <>", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidGreaterThan(Long value) {
            addCriterion("sm_archivesid >", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_archivesid >=", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidLessThan(Long value) {
            addCriterion("sm_archivesid <", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidLessThanOrEqualTo(Long value) {
            addCriterion("sm_archivesid <=", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidIn(List<Long> values) {
            addCriterion("sm_archivesid in", values, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidNotIn(List<Long> values) {
            addCriterion("sm_archivesid not in", values, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidBetween(Long value1, Long value2) {
            addCriterion("sm_archivesid between", value1, value2, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidNotBetween(Long value1, Long value2) {
            addCriterion("sm_archivesid not between", value1, value2, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_createidIsNull() {
            addCriterion("sm_createid is null");
            return (Criteria) this;
        }

        public Criteria andSm_createidIsNotNull() {
            addCriterion("sm_createid is not null");
            return (Criteria) this;
        }

        public Criteria andSm_createidEqualTo(Long value) {
            addCriterion("sm_createid =", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidNotEqualTo(Long value) {
            addCriterion("sm_createid <>", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidGreaterThan(Long value) {
            addCriterion("sm_createid >", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_createid >=", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidLessThan(Long value) {
            addCriterion("sm_createid <", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidLessThanOrEqualTo(Long value) {
            addCriterion("sm_createid <=", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidIn(List<Long> values) {
            addCriterion("sm_createid in", values, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidNotIn(List<Long> values) {
            addCriterion("sm_createid not in", values, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidBetween(Long value1, Long value2) {
            addCriterion("sm_createid between", value1, value2, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidNotBetween(Long value1, Long value2) {
            addCriterion("sm_createid not between", value1, value2, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createnoIsNull() {
            addCriterion("sm_createno is null");
            return (Criteria) this;
        }

        public Criteria andSm_createnoIsNotNull() {
            addCriterion("sm_createno is not null");
            return (Criteria) this;
        }

        public Criteria andSm_createnoEqualTo(String value) {
            addCriterion("sm_createno =", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotEqualTo(String value) {
            addCriterion("sm_createno <>", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoGreaterThan(String value) {
            addCriterion("sm_createno >", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("sm_createno >=", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoLessThan(String value) {
            addCriterion("sm_createno <", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoLessThanOrEqualTo(String value) {
            addCriterion("sm_createno <=", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoLike(String value) {
            addCriterion("sm_createno like", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotLike(String value) {
            addCriterion("sm_createno not like", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoIn(List<String> values) {
            addCriterion("sm_createno in", values, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotIn(List<String> values) {
            addCriterion("sm_createno not in", values, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoBetween(String value1, String value2) {
            addCriterion("sm_createno between", value1, value2, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotBetween(String value1, String value2) {
            addCriterion("sm_createno not between", value1, value2, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIsNull() {
            addCriterion("sm_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIsNotNull() {
            addCriterion("sm_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSm_createdateEqualTo(Date value) {
            addCriterion("sm_createdate =", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotEqualTo(Date value) {
            addCriterion("sm_createdate <>", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateGreaterThan(Date value) {
            addCriterion("sm_createdate >", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sm_createdate >=", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateLessThan(Date value) {
            addCriterion("sm_createdate <", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateLessThanOrEqualTo(Date value) {
            addCriterion("sm_createdate <=", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIn(List<Date> values) {
            addCriterion("sm_createdate in", values, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotIn(List<Date> values) {
            addCriterion("sm_createdate not in", values, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateBetween(Date value1, Date value2) {
            addCriterion("sm_createdate between", value1, value2, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotBetween(Date value1, Date value2) {
            addCriterion("sm_createdate not between", value1, value2, "sm_createdate");
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