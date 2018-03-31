package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class Sys_SmsTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_SmsTemplateExample() {
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

        public Criteria andSt_idIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andSt_idIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andSt_idEqualTo(Integer value) {
            addCriterion("st_id =", value, "st_id");
            return (Criteria) this;
        }

        public Criteria andSt_idNotEqualTo(Integer value) {
            addCriterion("st_id <>", value, "st_id");
            return (Criteria) this;
        }

        public Criteria andSt_idGreaterThan(Integer value) {
            addCriterion("st_id >", value, "st_id");
            return (Criteria) this;
        }

        public Criteria andSt_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_id >=", value, "st_id");
            return (Criteria) this;
        }

        public Criteria andSt_idLessThan(Integer value) {
            addCriterion("st_id <", value, "st_id");
            return (Criteria) this;
        }

        public Criteria andSt_idLessThanOrEqualTo(Integer value) {
            addCriterion("st_id <=", value, "st_id");
            return (Criteria) this;
        }

        public Criteria andSt_idIn(List<Integer> values) {
            addCriterion("st_id in", values, "st_id");
            return (Criteria) this;
        }

        public Criteria andSt_idNotIn(List<Integer> values) {
            addCriterion("st_id not in", values, "st_id");
            return (Criteria) this;
        }

        public Criteria andSt_idBetween(Integer value1, Integer value2) {
            addCriterion("st_id between", value1, value2, "st_id");
            return (Criteria) this;
        }

        public Criteria andSt_idNotBetween(Integer value1, Integer value2) {
            addCriterion("st_id not between", value1, value2, "st_id");
            return (Criteria) this;
        }

        public Criteria andSt_noIsNull() {
            addCriterion("st_no is null");
            return (Criteria) this;
        }

        public Criteria andSt_noIsNotNull() {
            addCriterion("st_no is not null");
            return (Criteria) this;
        }

        public Criteria andSt_noEqualTo(String value) {
            addCriterion("st_no =", value, "st_no");
            return (Criteria) this;
        }

        public Criteria andSt_noNotEqualTo(String value) {
            addCriterion("st_no <>", value, "st_no");
            return (Criteria) this;
        }

        public Criteria andSt_noGreaterThan(String value) {
            addCriterion("st_no >", value, "st_no");
            return (Criteria) this;
        }

        public Criteria andSt_noGreaterThanOrEqualTo(String value) {
            addCriterion("st_no >=", value, "st_no");
            return (Criteria) this;
        }

        public Criteria andSt_noLessThan(String value) {
            addCriterion("st_no <", value, "st_no");
            return (Criteria) this;
        }

        public Criteria andSt_noLessThanOrEqualTo(String value) {
            addCriterion("st_no <=", value, "st_no");
            return (Criteria) this;
        }

        public Criteria andSt_noLike(String value) {
            addCriterion("st_no like", value, "st_no");
            return (Criteria) this;
        }

        public Criteria andSt_noNotLike(String value) {
            addCriterion("st_no not like", value, "st_no");
            return (Criteria) this;
        }

        public Criteria andSt_noIn(List<String> values) {
            addCriterion("st_no in", values, "st_no");
            return (Criteria) this;
        }

        public Criteria andSt_noNotIn(List<String> values) {
            addCriterion("st_no not in", values, "st_no");
            return (Criteria) this;
        }

        public Criteria andSt_noBetween(String value1, String value2) {
            addCriterion("st_no between", value1, value2, "st_no");
            return (Criteria) this;
        }

        public Criteria andSt_noNotBetween(String value1, String value2) {
            addCriterion("st_no not between", value1, value2, "st_no");
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