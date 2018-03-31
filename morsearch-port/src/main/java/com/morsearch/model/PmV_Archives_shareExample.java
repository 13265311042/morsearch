package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class PmV_Archives_shareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmV_Archives_shareExample() {
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

        public Criteria andPa_idIsNull() {
            addCriterion("pa_id is null");
            return (Criteria) this;
        }

        public Criteria andPa_idIsNotNull() {
            addCriterion("pa_id is not null");
            return (Criteria) this;
        }

        public Criteria andPa_idEqualTo(Long value) {
            addCriterion("pa_id =", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idNotEqualTo(Long value) {
            addCriterion("pa_id <>", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idGreaterThan(Long value) {
            addCriterion("pa_id >", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idGreaterThanOrEqualTo(Long value) {
            addCriterion("pa_id >=", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idLessThan(Long value) {
            addCriterion("pa_id <", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idLessThanOrEqualTo(Long value) {
            addCriterion("pa_id <=", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idIn(List<Long> values) {
            addCriterion("pa_id in", values, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idNotIn(List<Long> values) {
            addCriterion("pa_id not in", values, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idBetween(Long value1, Long value2) {
            addCriterion("pa_id between", value1, value2, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idNotBetween(Long value1, Long value2) {
            addCriterion("pa_id not between", value1, value2, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_titleIsNull() {
            addCriterion("pa_title is null");
            return (Criteria) this;
        }

        public Criteria andPa_titleIsNotNull() {
            addCriterion("pa_title is not null");
            return (Criteria) this;
        }

        public Criteria andPa_titleEqualTo(String value) {
            addCriterion("pa_title =", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotEqualTo(String value) {
            addCriterion("pa_title <>", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleGreaterThan(String value) {
            addCriterion("pa_title >", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleGreaterThanOrEqualTo(String value) {
            addCriterion("pa_title >=", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleLessThan(String value) {
            addCriterion("pa_title <", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleLessThanOrEqualTo(String value) {
            addCriterion("pa_title <=", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleLike(String value) {
            addCriterion("pa_title like", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotLike(String value) {
            addCriterion("pa_title not like", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleIn(List<String> values) {
            addCriterion("pa_title in", values, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotIn(List<String> values) {
            addCriterion("pa_title not in", values, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleBetween(String value1, String value2) {
            addCriterion("pa_title between", value1, value2, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotBetween(String value1, String value2) {
            addCriterion("pa_title not between", value1, value2, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectIsNull() {
            addCriterion("pa_flagselect is null");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectIsNotNull() {
            addCriterion("pa_flagselect is not null");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectEqualTo(Boolean value) {
            addCriterion("pa_flagselect =", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectNotEqualTo(Boolean value) {
            addCriterion("pa_flagselect <>", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectGreaterThan(Boolean value) {
            addCriterion("pa_flagselect >", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pa_flagselect >=", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectLessThan(Boolean value) {
            addCriterion("pa_flagselect <", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectLessThanOrEqualTo(Boolean value) {
            addCriterion("pa_flagselect <=", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectIn(List<Boolean> values) {
            addCriterion("pa_flagselect in", values, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectNotIn(List<Boolean> values) {
            addCriterion("pa_flagselect not in", values, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectBetween(Boolean value1, Boolean value2) {
            addCriterion("pa_flagselect between", value1, value2, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pa_flagselect not between", value1, value2, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_companyidIsNull() {
            addCriterion("pa_companyid is null");
            return (Criteria) this;
        }

        public Criteria andPa_companyidIsNotNull() {
            addCriterion("pa_companyid is not null");
            return (Criteria) this;
        }

        public Criteria andPa_companyidEqualTo(Integer value) {
            addCriterion("pa_companyid =", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidNotEqualTo(Integer value) {
            addCriterion("pa_companyid <>", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidGreaterThan(Integer value) {
            addCriterion("pa_companyid >", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_companyid >=", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidLessThan(Integer value) {
            addCriterion("pa_companyid <", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidLessThanOrEqualTo(Integer value) {
            addCriterion("pa_companyid <=", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidIn(List<Integer> values) {
            addCriterion("pa_companyid in", values, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidNotIn(List<Integer> values) {
            addCriterion("pa_companyid not in", values, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidBetween(Integer value1, Integer value2) {
            addCriterion("pa_companyid between", value1, value2, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_companyid not between", value1, value2, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companynameIsNull() {
            addCriterion("pa_companyname is null");
            return (Criteria) this;
        }

        public Criteria andPa_companynameIsNotNull() {
            addCriterion("pa_companyname is not null");
            return (Criteria) this;
        }

        public Criteria andPa_companynameEqualTo(String value) {
            addCriterion("pa_companyname =", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameNotEqualTo(String value) {
            addCriterion("pa_companyname <>", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameGreaterThan(String value) {
            addCriterion("pa_companyname >", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameGreaterThanOrEqualTo(String value) {
            addCriterion("pa_companyname >=", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameLessThan(String value) {
            addCriterion("pa_companyname <", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameLessThanOrEqualTo(String value) {
            addCriterion("pa_companyname <=", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameLike(String value) {
            addCriterion("pa_companyname like", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameNotLike(String value) {
            addCriterion("pa_companyname not like", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameIn(List<String> values) {
            addCriterion("pa_companyname in", values, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameNotIn(List<String> values) {
            addCriterion("pa_companyname not in", values, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameBetween(String value1, String value2) {
            addCriterion("pa_companyname between", value1, value2, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameNotBetween(String value1, String value2) {
            addCriterion("pa_companyname not between", value1, value2, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_createidIsNull() {
            addCriterion("pa_createid is null");
            return (Criteria) this;
        }

        public Criteria andPa_createidIsNotNull() {
            addCriterion("pa_createid is not null");
            return (Criteria) this;
        }

        public Criteria andPa_createidEqualTo(Long value) {
            addCriterion("pa_createid =", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidNotEqualTo(Long value) {
            addCriterion("pa_createid <>", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidGreaterThan(Long value) {
            addCriterion("pa_createid >", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("pa_createid >=", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidLessThan(Long value) {
            addCriterion("pa_createid <", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidLessThanOrEqualTo(Long value) {
            addCriterion("pa_createid <=", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidIn(List<Long> values) {
            addCriterion("pa_createid in", values, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidNotIn(List<Long> values) {
            addCriterion("pa_createid not in", values, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidBetween(Long value1, Long value2) {
            addCriterion("pa_createid between", value1, value2, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidNotBetween(Long value1, Long value2) {
            addCriterion("pa_createid not between", value1, value2, "pa_createid");
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