package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class Base_CityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Base_CityExample() {
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

        public Criteria andBc_cityidIsNull() {
            addCriterion("bc_cityid is null");
            return (Criteria) this;
        }

        public Criteria andBc_cityidIsNotNull() {
            addCriterion("bc_cityid is not null");
            return (Criteria) this;
        }

        public Criteria andBc_cityidEqualTo(Integer value) {
            addCriterion("bc_cityid =", value, "bc_cityid");
            return (Criteria) this;
        }

        public Criteria andBc_cityidNotEqualTo(Integer value) {
            addCriterion("bc_cityid <>", value, "bc_cityid");
            return (Criteria) this;
        }

        public Criteria andBc_cityidGreaterThan(Integer value) {
            addCriterion("bc_cityid >", value, "bc_cityid");
            return (Criteria) this;
        }

        public Criteria andBc_cityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bc_cityid >=", value, "bc_cityid");
            return (Criteria) this;
        }

        public Criteria andBc_cityidLessThan(Integer value) {
            addCriterion("bc_cityid <", value, "bc_cityid");
            return (Criteria) this;
        }

        public Criteria andBc_cityidLessThanOrEqualTo(Integer value) {
            addCriterion("bc_cityid <=", value, "bc_cityid");
            return (Criteria) this;
        }

        public Criteria andBc_cityidIn(List<Integer> values) {
            addCriterion("bc_cityid in", values, "bc_cityid");
            return (Criteria) this;
        }

        public Criteria andBc_cityidNotIn(List<Integer> values) {
            addCriterion("bc_cityid not in", values, "bc_cityid");
            return (Criteria) this;
        }

        public Criteria andBc_cityidBetween(Integer value1, Integer value2) {
            addCriterion("bc_cityid between", value1, value2, "bc_cityid");
            return (Criteria) this;
        }

        public Criteria andBc_cityidNotBetween(Integer value1, Integer value2) {
            addCriterion("bc_cityid not between", value1, value2, "bc_cityid");
            return (Criteria) this;
        }

        public Criteria andBc_citynameIsNull() {
            addCriterion("bc_cityname is null");
            return (Criteria) this;
        }

        public Criteria andBc_citynameIsNotNull() {
            addCriterion("bc_cityname is not null");
            return (Criteria) this;
        }

        public Criteria andBc_citynameEqualTo(String value) {
            addCriterion("bc_cityname =", value, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_citynameNotEqualTo(String value) {
            addCriterion("bc_cityname <>", value, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_citynameGreaterThan(String value) {
            addCriterion("bc_cityname >", value, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_citynameGreaterThanOrEqualTo(String value) {
            addCriterion("bc_cityname >=", value, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_citynameLessThan(String value) {
            addCriterion("bc_cityname <", value, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_citynameLessThanOrEqualTo(String value) {
            addCriterion("bc_cityname <=", value, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_citynameLike(String value) {
            addCriterion("bc_cityname like", value, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_citynameNotLike(String value) {
            addCriterion("bc_cityname not like", value, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_citynameIn(List<String> values) {
            addCriterion("bc_cityname in", values, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_citynameNotIn(List<String> values) {
            addCriterion("bc_cityname not in", values, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_citynameBetween(String value1, String value2) {
            addCriterion("bc_cityname between", value1, value2, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_citynameNotBetween(String value1, String value2) {
            addCriterion("bc_cityname not between", value1, value2, "bc_cityname");
            return (Criteria) this;
        }

        public Criteria andBc_prvidIsNull() {
            addCriterion("bc_prvid is null");
            return (Criteria) this;
        }

        public Criteria andBc_prvidIsNotNull() {
            addCriterion("bc_prvid is not null");
            return (Criteria) this;
        }

        public Criteria andBc_prvidEqualTo(Integer value) {
            addCriterion("bc_prvid =", value, "bc_prvid");
            return (Criteria) this;
        }

        public Criteria andBc_prvidNotEqualTo(Integer value) {
            addCriterion("bc_prvid <>", value, "bc_prvid");
            return (Criteria) this;
        }

        public Criteria andBc_prvidGreaterThan(Integer value) {
            addCriterion("bc_prvid >", value, "bc_prvid");
            return (Criteria) this;
        }

        public Criteria andBc_prvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bc_prvid >=", value, "bc_prvid");
            return (Criteria) this;
        }

        public Criteria andBc_prvidLessThan(Integer value) {
            addCriterion("bc_prvid <", value, "bc_prvid");
            return (Criteria) this;
        }

        public Criteria andBc_prvidLessThanOrEqualTo(Integer value) {
            addCriterion("bc_prvid <=", value, "bc_prvid");
            return (Criteria) this;
        }

        public Criteria andBc_prvidIn(List<Integer> values) {
            addCriterion("bc_prvid in", values, "bc_prvid");
            return (Criteria) this;
        }

        public Criteria andBc_prvidNotIn(List<Integer> values) {
            addCriterion("bc_prvid not in", values, "bc_prvid");
            return (Criteria) this;
        }

        public Criteria andBc_prvidBetween(Integer value1, Integer value2) {
            addCriterion("bc_prvid between", value1, value2, "bc_prvid");
            return (Criteria) this;
        }

        public Criteria andBc_prvidNotBetween(Integer value1, Integer value2) {
            addCriterion("bc_prvid not between", value1, value2, "bc_prvid");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameIsNull() {
            addCriterion("bc_prvname is null");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameIsNotNull() {
            addCriterion("bc_prvname is not null");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameEqualTo(String value) {
            addCriterion("bc_prvname =", value, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameNotEqualTo(String value) {
            addCriterion("bc_prvname <>", value, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameGreaterThan(String value) {
            addCriterion("bc_prvname >", value, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameGreaterThanOrEqualTo(String value) {
            addCriterion("bc_prvname >=", value, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameLessThan(String value) {
            addCriterion("bc_prvname <", value, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameLessThanOrEqualTo(String value) {
            addCriterion("bc_prvname <=", value, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameLike(String value) {
            addCriterion("bc_prvname like", value, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameNotLike(String value) {
            addCriterion("bc_prvname not like", value, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameIn(List<String> values) {
            addCriterion("bc_prvname in", values, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameNotIn(List<String> values) {
            addCriterion("bc_prvname not in", values, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameBetween(String value1, String value2) {
            addCriterion("bc_prvname between", value1, value2, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_prvnameNotBetween(String value1, String value2) {
            addCriterion("bc_prvname not between", value1, value2, "bc_prvname");
            return (Criteria) this;
        }

        public Criteria andBc_codeIsNull() {
            addCriterion("bc_code is null");
            return (Criteria) this;
        }

        public Criteria andBc_codeIsNotNull() {
            addCriterion("bc_code is not null");
            return (Criteria) this;
        }

        public Criteria andBc_codeEqualTo(String value) {
            addCriterion("bc_code =", value, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_codeNotEqualTo(String value) {
            addCriterion("bc_code <>", value, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_codeGreaterThan(String value) {
            addCriterion("bc_code >", value, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_codeGreaterThanOrEqualTo(String value) {
            addCriterion("bc_code >=", value, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_codeLessThan(String value) {
            addCriterion("bc_code <", value, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_codeLessThanOrEqualTo(String value) {
            addCriterion("bc_code <=", value, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_codeLike(String value) {
            addCriterion("bc_code like", value, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_codeNotLike(String value) {
            addCriterion("bc_code not like", value, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_codeIn(List<String> values) {
            addCriterion("bc_code in", values, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_codeNotIn(List<String> values) {
            addCriterion("bc_code not in", values, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_codeBetween(String value1, String value2) {
            addCriterion("bc_code between", value1, value2, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_codeNotBetween(String value1, String value2) {
            addCriterion("bc_code not between", value1, value2, "bc_code");
            return (Criteria) this;
        }

        public Criteria andBc_delflagIsNull() {
            addCriterion("bc_delflag is null");
            return (Criteria) this;
        }

        public Criteria andBc_delflagIsNotNull() {
            addCriterion("bc_delflag is not null");
            return (Criteria) this;
        }

        public Criteria andBc_delflagEqualTo(Byte value) {
            addCriterion("bc_delflag =", value, "bc_delflag");
            return (Criteria) this;
        }

        public Criteria andBc_delflagNotEqualTo(Byte value) {
            addCriterion("bc_delflag <>", value, "bc_delflag");
            return (Criteria) this;
        }

        public Criteria andBc_delflagGreaterThan(Byte value) {
            addCriterion("bc_delflag >", value, "bc_delflag");
            return (Criteria) this;
        }

        public Criteria andBc_delflagGreaterThanOrEqualTo(Byte value) {
            addCriterion("bc_delflag >=", value, "bc_delflag");
            return (Criteria) this;
        }

        public Criteria andBc_delflagLessThan(Byte value) {
            addCriterion("bc_delflag <", value, "bc_delflag");
            return (Criteria) this;
        }

        public Criteria andBc_delflagLessThanOrEqualTo(Byte value) {
            addCriterion("bc_delflag <=", value, "bc_delflag");
            return (Criteria) this;
        }

        public Criteria andBc_delflagIn(List<Byte> values) {
            addCriterion("bc_delflag in", values, "bc_delflag");
            return (Criteria) this;
        }

        public Criteria andBc_delflagNotIn(List<Byte> values) {
            addCriterion("bc_delflag not in", values, "bc_delflag");
            return (Criteria) this;
        }

        public Criteria andBc_delflagBetween(Byte value1, Byte value2) {
            addCriterion("bc_delflag between", value1, value2, "bc_delflag");
            return (Criteria) this;
        }

        public Criteria andBc_delflagNotBetween(Byte value1, Byte value2) {
            addCriterion("bc_delflag not between", value1, value2, "bc_delflag");
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