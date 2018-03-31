package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Desig_Collect_PmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Desig_Collect_PmExample() {
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

        public Criteria andDm_idIsNull() {
            addCriterion("dm_id is null");
            return (Criteria) this;
        }

        public Criteria andDm_idIsNotNull() {
            addCriterion("dm_id is not null");
            return (Criteria) this;
        }

        public Criteria andDm_idEqualTo(Long value) {
            addCriterion("dm_id =", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idNotEqualTo(Long value) {
            addCriterion("dm_id <>", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idGreaterThan(Long value) {
            addCriterion("dm_id >", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idGreaterThanOrEqualTo(Long value) {
            addCriterion("dm_id >=", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idLessThan(Long value) {
            addCriterion("dm_id <", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idLessThanOrEqualTo(Long value) {
            addCriterion("dm_id <=", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idIn(List<Long> values) {
            addCriterion("dm_id in", values, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idNotIn(List<Long> values) {
            addCriterion("dm_id not in", values, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idBetween(Long value1, Long value2) {
            addCriterion("dm_id between", value1, value2, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idNotBetween(Long value1, Long value2) {
            addCriterion("dm_id not between", value1, value2, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidIsNull() {
            addCriterion("dm_archivesid is null");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidIsNotNull() {
            addCriterion("dm_archivesid is not null");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidEqualTo(Long value) {
            addCriterion("dm_archivesid =", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidNotEqualTo(Long value) {
            addCriterion("dm_archivesid <>", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidGreaterThan(Long value) {
            addCriterion("dm_archivesid >", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidGreaterThanOrEqualTo(Long value) {
            addCriterion("dm_archivesid >=", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidLessThan(Long value) {
            addCriterion("dm_archivesid <", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidLessThanOrEqualTo(Long value) {
            addCriterion("dm_archivesid <=", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidIn(List<Long> values) {
            addCriterion("dm_archivesid in", values, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidNotIn(List<Long> values) {
            addCriterion("dm_archivesid not in", values, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidBetween(Long value1, Long value2) {
            addCriterion("dm_archivesid between", value1, value2, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidNotBetween(Long value1, Long value2) {
            addCriterion("dm_archivesid not between", value1, value2, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_createidIsNull() {
            addCriterion("dm_createid is null");
            return (Criteria) this;
        }

        public Criteria andDm_createidIsNotNull() {
            addCriterion("dm_createid is not null");
            return (Criteria) this;
        }

        public Criteria andDm_createidEqualTo(Long value) {
            addCriterion("dm_createid =", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidNotEqualTo(Long value) {
            addCriterion("dm_createid <>", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidGreaterThan(Long value) {
            addCriterion("dm_createid >", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("dm_createid >=", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidLessThan(Long value) {
            addCriterion("dm_createid <", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidLessThanOrEqualTo(Long value) {
            addCriterion("dm_createid <=", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidIn(List<Long> values) {
            addCriterion("dm_createid in", values, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidNotIn(List<Long> values) {
            addCriterion("dm_createid not in", values, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidBetween(Long value1, Long value2) {
            addCriterion("dm_createid between", value1, value2, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidNotBetween(Long value1, Long value2) {
            addCriterion("dm_createid not between", value1, value2, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createnoIsNull() {
            addCriterion("dm_createno is null");
            return (Criteria) this;
        }

        public Criteria andDm_createnoIsNotNull() {
            addCriterion("dm_createno is not null");
            return (Criteria) this;
        }

        public Criteria andDm_createnoEqualTo(String value) {
            addCriterion("dm_createno =", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoNotEqualTo(String value) {
            addCriterion("dm_createno <>", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoGreaterThan(String value) {
            addCriterion("dm_createno >", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("dm_createno >=", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoLessThan(String value) {
            addCriterion("dm_createno <", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoLessThanOrEqualTo(String value) {
            addCriterion("dm_createno <=", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoLike(String value) {
            addCriterion("dm_createno like", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoNotLike(String value) {
            addCriterion("dm_createno not like", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoIn(List<String> values) {
            addCriterion("dm_createno in", values, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoNotIn(List<String> values) {
            addCriterion("dm_createno not in", values, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoBetween(String value1, String value2) {
            addCriterion("dm_createno between", value1, value2, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoNotBetween(String value1, String value2) {
            addCriterion("dm_createno not between", value1, value2, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createdateIsNull() {
            addCriterion("dm_createdate is null");
            return (Criteria) this;
        }

        public Criteria andDm_createdateIsNotNull() {
            addCriterion("dm_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andDm_createdateEqualTo(Date value) {
            addCriterion("dm_createdate =", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateNotEqualTo(Date value) {
            addCriterion("dm_createdate <>", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateGreaterThan(Date value) {
            addCriterion("dm_createdate >", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("dm_createdate >=", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateLessThan(Date value) {
            addCriterion("dm_createdate <", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateLessThanOrEqualTo(Date value) {
            addCriterion("dm_createdate <=", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateIn(List<Date> values) {
            addCriterion("dm_createdate in", values, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateNotIn(List<Date> values) {
            addCriterion("dm_createdate not in", values, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateBetween(Date value1, Date value2) {
            addCriterion("dm_createdate between", value1, value2, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateNotBetween(Date value1, Date value2) {
            addCriterion("dm_createdate not between", value1, value2, "dm_createdate");
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