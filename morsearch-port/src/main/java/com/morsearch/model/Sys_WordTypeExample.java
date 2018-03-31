package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class Sys_WordTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_WordTypeExample() {
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

        public Criteria andSt_typeIsNull() {
            addCriterion("st_type is null");
            return (Criteria) this;
        }

        public Criteria andSt_typeIsNotNull() {
            addCriterion("st_type is not null");
            return (Criteria) this;
        }

        public Criteria andSt_typeEqualTo(String value) {
            addCriterion("st_type =", value, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_typeNotEqualTo(String value) {
            addCriterion("st_type <>", value, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_typeGreaterThan(String value) {
            addCriterion("st_type >", value, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_typeGreaterThanOrEqualTo(String value) {
            addCriterion("st_type >=", value, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_typeLessThan(String value) {
            addCriterion("st_type <", value, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_typeLessThanOrEqualTo(String value) {
            addCriterion("st_type <=", value, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_typeLike(String value) {
            addCriterion("st_type like", value, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_typeNotLike(String value) {
            addCriterion("st_type not like", value, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_typeIn(List<String> values) {
            addCriterion("st_type in", values, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_typeNotIn(List<String> values) {
            addCriterion("st_type not in", values, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_typeBetween(String value1, String value2) {
            addCriterion("st_type between", value1, value2, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_typeNotBetween(String value1, String value2) {
            addCriterion("st_type not between", value1, value2, "st_type");
            return (Criteria) this;
        }

        public Criteria andSt_nameIsNull() {
            addCriterion("st_name is null");
            return (Criteria) this;
        }

        public Criteria andSt_nameIsNotNull() {
            addCriterion("st_name is not null");
            return (Criteria) this;
        }

        public Criteria andSt_nameEqualTo(String value) {
            addCriterion("st_name =", value, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_nameNotEqualTo(String value) {
            addCriterion("st_name <>", value, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_nameGreaterThan(String value) {
            addCriterion("st_name >", value, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_nameGreaterThanOrEqualTo(String value) {
            addCriterion("st_name >=", value, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_nameLessThan(String value) {
            addCriterion("st_name <", value, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_nameLessThanOrEqualTo(String value) {
            addCriterion("st_name <=", value, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_nameLike(String value) {
            addCriterion("st_name like", value, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_nameNotLike(String value) {
            addCriterion("st_name not like", value, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_nameIn(List<String> values) {
            addCriterion("st_name in", values, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_nameNotIn(List<String> values) {
            addCriterion("st_name not in", values, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_nameBetween(String value1, String value2) {
            addCriterion("st_name between", value1, value2, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_nameNotBetween(String value1, String value2) {
            addCriterion("st_name not between", value1, value2, "st_name");
            return (Criteria) this;
        }

        public Criteria andSt_indexIsNull() {
            addCriterion("st_index is null");
            return (Criteria) this;
        }

        public Criteria andSt_indexIsNotNull() {
            addCriterion("st_index is not null");
            return (Criteria) this;
        }

        public Criteria andSt_indexEqualTo(Integer value) {
            addCriterion("st_index =", value, "st_index");
            return (Criteria) this;
        }

        public Criteria andSt_indexNotEqualTo(Integer value) {
            addCriterion("st_index <>", value, "st_index");
            return (Criteria) this;
        }

        public Criteria andSt_indexGreaterThan(Integer value) {
            addCriterion("st_index >", value, "st_index");
            return (Criteria) this;
        }

        public Criteria andSt_indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_index >=", value, "st_index");
            return (Criteria) this;
        }

        public Criteria andSt_indexLessThan(Integer value) {
            addCriterion("st_index <", value, "st_index");
            return (Criteria) this;
        }

        public Criteria andSt_indexLessThanOrEqualTo(Integer value) {
            addCriterion("st_index <=", value, "st_index");
            return (Criteria) this;
        }

        public Criteria andSt_indexIn(List<Integer> values) {
            addCriterion("st_index in", values, "st_index");
            return (Criteria) this;
        }

        public Criteria andSt_indexNotIn(List<Integer> values) {
            addCriterion("st_index not in", values, "st_index");
            return (Criteria) this;
        }

        public Criteria andSt_indexBetween(Integer value1, Integer value2) {
            addCriterion("st_index between", value1, value2, "st_index");
            return (Criteria) this;
        }

        public Criteria andSt_indexNotBetween(Integer value1, Integer value2) {
            addCriterion("st_index not between", value1, value2, "st_index");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagIsNull() {
            addCriterion("st_stopflag is null");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagIsNotNull() {
            addCriterion("st_stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagEqualTo(Boolean value) {
            addCriterion("st_stopflag =", value, "st_stopflag");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagNotEqualTo(Boolean value) {
            addCriterion("st_stopflag <>", value, "st_stopflag");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagGreaterThan(Boolean value) {
            addCriterion("st_stopflag >", value, "st_stopflag");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("st_stopflag >=", value, "st_stopflag");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagLessThan(Boolean value) {
            addCriterion("st_stopflag <", value, "st_stopflag");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("st_stopflag <=", value, "st_stopflag");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagIn(List<Boolean> values) {
            addCriterion("st_stopflag in", values, "st_stopflag");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagNotIn(List<Boolean> values) {
            addCriterion("st_stopflag not in", values, "st_stopflag");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("st_stopflag between", value1, value2, "st_stopflag");
            return (Criteria) this;
        }

        public Criteria andSt_stopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("st_stopflag not between", value1, value2, "st_stopflag");
            return (Criteria) this;
        }

        public Criteria andSt_remarkIsNull() {
            addCriterion("st_remark is null");
            return (Criteria) this;
        }

        public Criteria andSt_remarkIsNotNull() {
            addCriterion("st_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSt_remarkEqualTo(String value) {
            addCriterion("st_remark =", value, "st_remark");
            return (Criteria) this;
        }

        public Criteria andSt_remarkNotEqualTo(String value) {
            addCriterion("st_remark <>", value, "st_remark");
            return (Criteria) this;
        }

        public Criteria andSt_remarkGreaterThan(String value) {
            addCriterion("st_remark >", value, "st_remark");
            return (Criteria) this;
        }

        public Criteria andSt_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("st_remark >=", value, "st_remark");
            return (Criteria) this;
        }

        public Criteria andSt_remarkLessThan(String value) {
            addCriterion("st_remark <", value, "st_remark");
            return (Criteria) this;
        }

        public Criteria andSt_remarkLessThanOrEqualTo(String value) {
            addCriterion("st_remark <=", value, "st_remark");
            return (Criteria) this;
        }

        public Criteria andSt_remarkLike(String value) {
            addCriterion("st_remark like", value, "st_remark");
            return (Criteria) this;
        }

        public Criteria andSt_remarkNotLike(String value) {
            addCriterion("st_remark not like", value, "st_remark");
            return (Criteria) this;
        }

        public Criteria andSt_remarkIn(List<String> values) {
            addCriterion("st_remark in", values, "st_remark");
            return (Criteria) this;
        }

        public Criteria andSt_remarkNotIn(List<String> values) {
            addCriterion("st_remark not in", values, "st_remark");
            return (Criteria) this;
        }

        public Criteria andSt_remarkBetween(String value1, String value2) {
            addCriterion("st_remark between", value1, value2, "st_remark");
            return (Criteria) this;
        }

        public Criteria andSt_remarkNotBetween(String value1, String value2) {
            addCriterion("st_remark not between", value1, value2, "st_remark");
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