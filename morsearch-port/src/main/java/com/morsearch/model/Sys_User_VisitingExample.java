package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class Sys_User_VisitingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_User_VisitingExample() {
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

        public Criteria andUv_idIsNull() {
            addCriterion("uv_id is null");
            return (Criteria) this;
        }

        public Criteria andUv_idIsNotNull() {
            addCriterion("uv_id is not null");
            return (Criteria) this;
        }

        public Criteria andUv_idEqualTo(Long value) {
            addCriterion("uv_id =", value, "uv_id");
            return (Criteria) this;
        }

        public Criteria andUv_idNotEqualTo(Long value) {
            addCriterion("uv_id <>", value, "uv_id");
            return (Criteria) this;
        }

        public Criteria andUv_idGreaterThan(Long value) {
            addCriterion("uv_id >", value, "uv_id");
            return (Criteria) this;
        }

        public Criteria andUv_idGreaterThanOrEqualTo(Long value) {
            addCriterion("uv_id >=", value, "uv_id");
            return (Criteria) this;
        }

        public Criteria andUv_idLessThan(Long value) {
            addCriterion("uv_id <", value, "uv_id");
            return (Criteria) this;
        }

        public Criteria andUv_idLessThanOrEqualTo(Long value) {
            addCriterion("uv_id <=", value, "uv_id");
            return (Criteria) this;
        }

        public Criteria andUv_idIn(List<Long> values) {
            addCriterion("uv_id in", values, "uv_id");
            return (Criteria) this;
        }

        public Criteria andUv_idNotIn(List<Long> values) {
            addCriterion("uv_id not in", values, "uv_id");
            return (Criteria) this;
        }

        public Criteria andUv_idBetween(Long value1, Long value2) {
            addCriterion("uv_id between", value1, value2, "uv_id");
            return (Criteria) this;
        }

        public Criteria andUv_idNotBetween(Long value1, Long value2) {
            addCriterion("uv_id not between", value1, value2, "uv_id");
            return (Criteria) this;
        }

        public Criteria andUv_imageIsNull() {
            addCriterion("uv_image is null");
            return (Criteria) this;
        }

        public Criteria andUv_imageIsNotNull() {
            addCriterion("uv_image is not null");
            return (Criteria) this;
        }

        public Criteria andUv_imageEqualTo(String value) {
            addCriterion("uv_image =", value, "uv_image");
            return (Criteria) this;
        }

        public Criteria andUv_imageNotEqualTo(String value) {
            addCriterion("uv_image <>", value, "uv_image");
            return (Criteria) this;
        }

        public Criteria andUv_imageGreaterThan(String value) {
            addCriterion("uv_image >", value, "uv_image");
            return (Criteria) this;
        }

        public Criteria andUv_imageGreaterThanOrEqualTo(String value) {
            addCriterion("uv_image >=", value, "uv_image");
            return (Criteria) this;
        }

        public Criteria andUv_imageLessThan(String value) {
            addCriterion("uv_image <", value, "uv_image");
            return (Criteria) this;
        }

        public Criteria andUv_imageLessThanOrEqualTo(String value) {
            addCriterion("uv_image <=", value, "uv_image");
            return (Criteria) this;
        }

        public Criteria andUv_imageLike(String value) {
            addCriterion("uv_image like", value, "uv_image");
            return (Criteria) this;
        }

        public Criteria andUv_imageNotLike(String value) {
            addCriterion("uv_image not like", value, "uv_image");
            return (Criteria) this;
        }

        public Criteria andUv_imageIn(List<String> values) {
            addCriterion("uv_image in", values, "uv_image");
            return (Criteria) this;
        }

        public Criteria andUv_imageNotIn(List<String> values) {
            addCriterion("uv_image not in", values, "uv_image");
            return (Criteria) this;
        }

        public Criteria andUv_imageBetween(String value1, String value2) {
            addCriterion("uv_image between", value1, value2, "uv_image");
            return (Criteria) this;
        }

        public Criteria andUv_imageNotBetween(String value1, String value2) {
            addCriterion("uv_image not between", value1, value2, "uv_image");
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