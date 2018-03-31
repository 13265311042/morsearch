package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class Sys_WordListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_WordListExample() {
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

        public Criteria andSw_typeIsNull() {
            addCriterion("sw_type is null");
            return (Criteria) this;
        }

        public Criteria andSw_typeIsNotNull() {
            addCriterion("sw_type is not null");
            return (Criteria) this;
        }

        public Criteria andSw_typeEqualTo(String value) {
            addCriterion("sw_type =", value, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_typeNotEqualTo(String value) {
            addCriterion("sw_type <>", value, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_typeGreaterThan(String value) {
            addCriterion("sw_type >", value, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_typeGreaterThanOrEqualTo(String value) {
            addCriterion("sw_type >=", value, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_typeLessThan(String value) {
            addCriterion("sw_type <", value, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_typeLessThanOrEqualTo(String value) {
            addCriterion("sw_type <=", value, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_typeLike(String value) {
            addCriterion("sw_type like", value, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_typeNotLike(String value) {
            addCriterion("sw_type not like", value, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_typeIn(List<String> values) {
            addCriterion("sw_type in", values, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_typeNotIn(List<String> values) {
            addCriterion("sw_type not in", values, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_typeBetween(String value1, String value2) {
            addCriterion("sw_type between", value1, value2, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_typeNotBetween(String value1, String value2) {
            addCriterion("sw_type not between", value1, value2, "sw_type");
            return (Criteria) this;
        }

        public Criteria andSw_indexIsNull() {
            addCriterion("sw_index is null");
            return (Criteria) this;
        }

        public Criteria andSw_indexIsNotNull() {
            addCriterion("sw_index is not null");
            return (Criteria) this;
        }

        public Criteria andSw_indexEqualTo(Integer value) {
            addCriterion("sw_index =", value, "sw_index");
            return (Criteria) this;
        }

        public Criteria andSw_indexNotEqualTo(Integer value) {
            addCriterion("sw_index <>", value, "sw_index");
            return (Criteria) this;
        }

        public Criteria andSw_indexGreaterThan(Integer value) {
            addCriterion("sw_index >", value, "sw_index");
            return (Criteria) this;
        }

        public Criteria andSw_indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sw_index >=", value, "sw_index");
            return (Criteria) this;
        }

        public Criteria andSw_indexLessThan(Integer value) {
            addCriterion("sw_index <", value, "sw_index");
            return (Criteria) this;
        }

        public Criteria andSw_indexLessThanOrEqualTo(Integer value) {
            addCriterion("sw_index <=", value, "sw_index");
            return (Criteria) this;
        }

        public Criteria andSw_indexIn(List<Integer> values) {
            addCriterion("sw_index in", values, "sw_index");
            return (Criteria) this;
        }

        public Criteria andSw_indexNotIn(List<Integer> values) {
            addCriterion("sw_index not in", values, "sw_index");
            return (Criteria) this;
        }

        public Criteria andSw_indexBetween(Integer value1, Integer value2) {
            addCriterion("sw_index between", value1, value2, "sw_index");
            return (Criteria) this;
        }

        public Criteria andSw_indexNotBetween(Integer value1, Integer value2) {
            addCriterion("sw_index not between", value1, value2, "sw_index");
            return (Criteria) this;
        }

        public Criteria andSw_nameIsNull() {
            addCriterion("sw_name is null");
            return (Criteria) this;
        }

        public Criteria andSw_nameIsNotNull() {
            addCriterion("sw_name is not null");
            return (Criteria) this;
        }

        public Criteria andSw_nameEqualTo(String value) {
            addCriterion("sw_name =", value, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_nameNotEqualTo(String value) {
            addCriterion("sw_name <>", value, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_nameGreaterThan(String value) {
            addCriterion("sw_name >", value, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sw_name >=", value, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_nameLessThan(String value) {
            addCriterion("sw_name <", value, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_nameLessThanOrEqualTo(String value) {
            addCriterion("sw_name <=", value, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_nameLike(String value) {
            addCriterion("sw_name like", value, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_nameNotLike(String value) {
            addCriterion("sw_name not like", value, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_nameIn(List<String> values) {
            addCriterion("sw_name in", values, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_nameNotIn(List<String> values) {
            addCriterion("sw_name not in", values, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_nameBetween(String value1, String value2) {
            addCriterion("sw_name between", value1, value2, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_nameNotBetween(String value1, String value2) {
            addCriterion("sw_name not between", value1, value2, "sw_name");
            return (Criteria) this;
        }

        public Criteria andSw_codeIsNull() {
            addCriterion("sw_code is null");
            return (Criteria) this;
        }

        public Criteria andSw_codeIsNotNull() {
            addCriterion("sw_code is not null");
            return (Criteria) this;
        }

        public Criteria andSw_codeEqualTo(String value) {
            addCriterion("sw_code =", value, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_codeNotEqualTo(String value) {
            addCriterion("sw_code <>", value, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_codeGreaterThan(String value) {
            addCriterion("sw_code >", value, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_codeGreaterThanOrEqualTo(String value) {
            addCriterion("sw_code >=", value, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_codeLessThan(String value) {
            addCriterion("sw_code <", value, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_codeLessThanOrEqualTo(String value) {
            addCriterion("sw_code <=", value, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_codeLike(String value) {
            addCriterion("sw_code like", value, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_codeNotLike(String value) {
            addCriterion("sw_code not like", value, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_codeIn(List<String> values) {
            addCriterion("sw_code in", values, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_codeNotIn(List<String> values) {
            addCriterion("sw_code not in", values, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_codeBetween(String value1, String value2) {
            addCriterion("sw_code between", value1, value2, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_codeNotBetween(String value1, String value2) {
            addCriterion("sw_code not between", value1, value2, "sw_code");
            return (Criteria) this;
        }

        public Criteria andSw_valueIsNull() {
            addCriterion("sw_value is null");
            return (Criteria) this;
        }

        public Criteria andSw_valueIsNotNull() {
            addCriterion("sw_value is not null");
            return (Criteria) this;
        }

        public Criteria andSw_valueEqualTo(String value) {
            addCriterion("sw_value =", value, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_valueNotEqualTo(String value) {
            addCriterion("sw_value <>", value, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_valueGreaterThan(String value) {
            addCriterion("sw_value >", value, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_valueGreaterThanOrEqualTo(String value) {
            addCriterion("sw_value >=", value, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_valueLessThan(String value) {
            addCriterion("sw_value <", value, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_valueLessThanOrEqualTo(String value) {
            addCriterion("sw_value <=", value, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_valueLike(String value) {
            addCriterion("sw_value like", value, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_valueNotLike(String value) {
            addCriterion("sw_value not like", value, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_valueIn(List<String> values) {
            addCriterion("sw_value in", values, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_valueNotIn(List<String> values) {
            addCriterion("sw_value not in", values, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_valueBetween(String value1, String value2) {
            addCriterion("sw_value between", value1, value2, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_valueNotBetween(String value1, String value2) {
            addCriterion("sw_value not between", value1, value2, "sw_value");
            return (Criteria) this;
        }

        public Criteria andSw_includeIsNull() {
            addCriterion("sw_include is null");
            return (Criteria) this;
        }

        public Criteria andSw_includeIsNotNull() {
            addCriterion("sw_include is not null");
            return (Criteria) this;
        }

        public Criteria andSw_includeEqualTo(String value) {
            addCriterion("sw_include =", value, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_includeNotEqualTo(String value) {
            addCriterion("sw_include <>", value, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_includeGreaterThan(String value) {
            addCriterion("sw_include >", value, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_includeGreaterThanOrEqualTo(String value) {
            addCriterion("sw_include >=", value, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_includeLessThan(String value) {
            addCriterion("sw_include <", value, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_includeLessThanOrEqualTo(String value) {
            addCriterion("sw_include <=", value, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_includeLike(String value) {
            addCriterion("sw_include like", value, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_includeNotLike(String value) {
            addCriterion("sw_include not like", value, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_includeIn(List<String> values) {
            addCriterion("sw_include in", values, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_includeNotIn(List<String> values) {
            addCriterion("sw_include not in", values, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_includeBetween(String value1, String value2) {
            addCriterion("sw_include between", value1, value2, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_includeNotBetween(String value1, String value2) {
            addCriterion("sw_include not between", value1, value2, "sw_include");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlIsNull() {
            addCriterion("sw_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlIsNotNull() {
            addCriterion("sw_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlEqualTo(String value) {
            addCriterion("sw_imageurl =", value, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlNotEqualTo(String value) {
            addCriterion("sw_imageurl <>", value, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlGreaterThan(String value) {
            addCriterion("sw_imageurl >", value, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlGreaterThanOrEqualTo(String value) {
            addCriterion("sw_imageurl >=", value, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlLessThan(String value) {
            addCriterion("sw_imageurl <", value, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlLessThanOrEqualTo(String value) {
            addCriterion("sw_imageurl <=", value, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlLike(String value) {
            addCriterion("sw_imageurl like", value, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlNotLike(String value) {
            addCriterion("sw_imageurl not like", value, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlIn(List<String> values) {
            addCriterion("sw_imageurl in", values, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlNotIn(List<String> values) {
            addCriterion("sw_imageurl not in", values, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlBetween(String value1, String value2) {
            addCriterion("sw_imageurl between", value1, value2, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_imageurlNotBetween(String value1, String value2) {
            addCriterion("sw_imageurl not between", value1, value2, "sw_imageurl");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagIsNull() {
            addCriterion("sw_stopflag is null");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagIsNotNull() {
            addCriterion("sw_stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagEqualTo(Boolean value) {
            addCriterion("sw_stopflag =", value, "sw_stopflag");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagNotEqualTo(Boolean value) {
            addCriterion("sw_stopflag <>", value, "sw_stopflag");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagGreaterThan(Boolean value) {
            addCriterion("sw_stopflag >", value, "sw_stopflag");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sw_stopflag >=", value, "sw_stopflag");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagLessThan(Boolean value) {
            addCriterion("sw_stopflag <", value, "sw_stopflag");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("sw_stopflag <=", value, "sw_stopflag");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagIn(List<Boolean> values) {
            addCriterion("sw_stopflag in", values, "sw_stopflag");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagNotIn(List<Boolean> values) {
            addCriterion("sw_stopflag not in", values, "sw_stopflag");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("sw_stopflag between", value1, value2, "sw_stopflag");
            return (Criteria) this;
        }

        public Criteria andSw_stopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sw_stopflag not between", value1, value2, "sw_stopflag");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagIsNull() {
            addCriterion("sw_selectflag is null");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagIsNotNull() {
            addCriterion("sw_selectflag is not null");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagEqualTo(Boolean value) {
            addCriterion("sw_selectflag =", value, "sw_selectflag");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagNotEqualTo(Boolean value) {
            addCriterion("sw_selectflag <>", value, "sw_selectflag");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagGreaterThan(Boolean value) {
            addCriterion("sw_selectflag >", value, "sw_selectflag");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sw_selectflag >=", value, "sw_selectflag");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagLessThan(Boolean value) {
            addCriterion("sw_selectflag <", value, "sw_selectflag");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagLessThanOrEqualTo(Boolean value) {
            addCriterion("sw_selectflag <=", value, "sw_selectflag");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagIn(List<Boolean> values) {
            addCriterion("sw_selectflag in", values, "sw_selectflag");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagNotIn(List<Boolean> values) {
            addCriterion("sw_selectflag not in", values, "sw_selectflag");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagBetween(Boolean value1, Boolean value2) {
            addCriterion("sw_selectflag between", value1, value2, "sw_selectflag");
            return (Criteria) this;
        }

        public Criteria andSw_selectflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sw_selectflag not between", value1, value2, "sw_selectflag");
            return (Criteria) this;
        }

        public Criteria andSw_remarkIsNull() {
            addCriterion("sw_remark is null");
            return (Criteria) this;
        }

        public Criteria andSw_remarkIsNotNull() {
            addCriterion("sw_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSw_remarkEqualTo(String value) {
            addCriterion("sw_remark =", value, "sw_remark");
            return (Criteria) this;
        }

        public Criteria andSw_remarkNotEqualTo(String value) {
            addCriterion("sw_remark <>", value, "sw_remark");
            return (Criteria) this;
        }

        public Criteria andSw_remarkGreaterThan(String value) {
            addCriterion("sw_remark >", value, "sw_remark");
            return (Criteria) this;
        }

        public Criteria andSw_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("sw_remark >=", value, "sw_remark");
            return (Criteria) this;
        }

        public Criteria andSw_remarkLessThan(String value) {
            addCriterion("sw_remark <", value, "sw_remark");
            return (Criteria) this;
        }

        public Criteria andSw_remarkLessThanOrEqualTo(String value) {
            addCriterion("sw_remark <=", value, "sw_remark");
            return (Criteria) this;
        }

        public Criteria andSw_remarkLike(String value) {
            addCriterion("sw_remark like", value, "sw_remark");
            return (Criteria) this;
        }

        public Criteria andSw_remarkNotLike(String value) {
            addCriterion("sw_remark not like", value, "sw_remark");
            return (Criteria) this;
        }

        public Criteria andSw_remarkIn(List<String> values) {
            addCriterion("sw_remark in", values, "sw_remark");
            return (Criteria) this;
        }

        public Criteria andSw_remarkNotIn(List<String> values) {
            addCriterion("sw_remark not in", values, "sw_remark");
            return (Criteria) this;
        }

        public Criteria andSw_remarkBetween(String value1, String value2) {
            addCriterion("sw_remark between", value1, value2, "sw_remark");
            return (Criteria) this;
        }

        public Criteria andSw_remarkNotBetween(String value1, String value2) {
            addCriterion("sw_remark not between", value1, value2, "sw_remark");
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