package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class Sys_ConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_ConfigExample() {
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

        public Criteria andSc_codeIsNull() {
            addCriterion("sc_code is null");
            return (Criteria) this;
        }

        public Criteria andSc_codeIsNotNull() {
            addCriterion("sc_code is not null");
            return (Criteria) this;
        }

        public Criteria andSc_codeEqualTo(String value) {
            addCriterion("sc_code =", value, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_codeNotEqualTo(String value) {
            addCriterion("sc_code <>", value, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_codeGreaterThan(String value) {
            addCriterion("sc_code >", value, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_codeGreaterThanOrEqualTo(String value) {
            addCriterion("sc_code >=", value, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_codeLessThan(String value) {
            addCriterion("sc_code <", value, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_codeLessThanOrEqualTo(String value) {
            addCriterion("sc_code <=", value, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_codeLike(String value) {
            addCriterion("sc_code like", value, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_codeNotLike(String value) {
            addCriterion("sc_code not like", value, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_codeIn(List<String> values) {
            addCriterion("sc_code in", values, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_codeNotIn(List<String> values) {
            addCriterion("sc_code not in", values, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_codeBetween(String value1, String value2) {
            addCriterion("sc_code between", value1, value2, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_codeNotBetween(String value1, String value2) {
            addCriterion("sc_code not between", value1, value2, "sc_code");
            return (Criteria) this;
        }

        public Criteria andSc_nameIsNull() {
            addCriterion("sc_name is null");
            return (Criteria) this;
        }

        public Criteria andSc_nameIsNotNull() {
            addCriterion("sc_name is not null");
            return (Criteria) this;
        }

        public Criteria andSc_nameEqualTo(String value) {
            addCriterion("sc_name =", value, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_nameNotEqualTo(String value) {
            addCriterion("sc_name <>", value, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_nameGreaterThan(String value) {
            addCriterion("sc_name >", value, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sc_name >=", value, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_nameLessThan(String value) {
            addCriterion("sc_name <", value, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_nameLessThanOrEqualTo(String value) {
            addCriterion("sc_name <=", value, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_nameLike(String value) {
            addCriterion("sc_name like", value, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_nameNotLike(String value) {
            addCriterion("sc_name not like", value, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_nameIn(List<String> values) {
            addCriterion("sc_name in", values, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_nameNotIn(List<String> values) {
            addCriterion("sc_name not in", values, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_nameBetween(String value1, String value2) {
            addCriterion("sc_name between", value1, value2, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_nameNotBetween(String value1, String value2) {
            addCriterion("sc_name not between", value1, value2, "sc_name");
            return (Criteria) this;
        }

        public Criteria andSc_valueIsNull() {
            addCriterion("sc_value is null");
            return (Criteria) this;
        }

        public Criteria andSc_valueIsNotNull() {
            addCriterion("sc_value is not null");
            return (Criteria) this;
        }

        public Criteria andSc_valueEqualTo(String value) {
            addCriterion("sc_value =", value, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_valueNotEqualTo(String value) {
            addCriterion("sc_value <>", value, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_valueGreaterThan(String value) {
            addCriterion("sc_value >", value, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_valueGreaterThanOrEqualTo(String value) {
            addCriterion("sc_value >=", value, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_valueLessThan(String value) {
            addCriterion("sc_value <", value, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_valueLessThanOrEqualTo(String value) {
            addCriterion("sc_value <=", value, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_valueLike(String value) {
            addCriterion("sc_value like", value, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_valueNotLike(String value) {
            addCriterion("sc_value not like", value, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_valueIn(List<String> values) {
            addCriterion("sc_value in", values, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_valueNotIn(List<String> values) {
            addCriterion("sc_value not in", values, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_valueBetween(String value1, String value2) {
            addCriterion("sc_value between", value1, value2, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_valueNotBetween(String value1, String value2) {
            addCriterion("sc_value not between", value1, value2, "sc_value");
            return (Criteria) this;
        }

        public Criteria andSc_remarkIsNull() {
            addCriterion("sc_remark is null");
            return (Criteria) this;
        }

        public Criteria andSc_remarkIsNotNull() {
            addCriterion("sc_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSc_remarkEqualTo(String value) {
            addCriterion("sc_remark =", value, "sc_remark");
            return (Criteria) this;
        }

        public Criteria andSc_remarkNotEqualTo(String value) {
            addCriterion("sc_remark <>", value, "sc_remark");
            return (Criteria) this;
        }

        public Criteria andSc_remarkGreaterThan(String value) {
            addCriterion("sc_remark >", value, "sc_remark");
            return (Criteria) this;
        }

        public Criteria andSc_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("sc_remark >=", value, "sc_remark");
            return (Criteria) this;
        }

        public Criteria andSc_remarkLessThan(String value) {
            addCriterion("sc_remark <", value, "sc_remark");
            return (Criteria) this;
        }

        public Criteria andSc_remarkLessThanOrEqualTo(String value) {
            addCriterion("sc_remark <=", value, "sc_remark");
            return (Criteria) this;
        }

        public Criteria andSc_remarkLike(String value) {
            addCriterion("sc_remark like", value, "sc_remark");
            return (Criteria) this;
        }

        public Criteria andSc_remarkNotLike(String value) {
            addCriterion("sc_remark not like", value, "sc_remark");
            return (Criteria) this;
        }

        public Criteria andSc_remarkIn(List<String> values) {
            addCriterion("sc_remark in", values, "sc_remark");
            return (Criteria) this;
        }

        public Criteria andSc_remarkNotIn(List<String> values) {
            addCriterion("sc_remark not in", values, "sc_remark");
            return (Criteria) this;
        }

        public Criteria andSc_remarkBetween(String value1, String value2) {
            addCriterion("sc_remark between", value1, value2, "sc_remark");
            return (Criteria) this;
        }

        public Criteria andSc_remarkNotBetween(String value1, String value2) {
            addCriterion("sc_remark not between", value1, value2, "sc_remark");
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