package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class Sys_MenuRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_MenuRoleExample() {
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

        public Criteria andRl_idIsNull() {
            addCriterion("rl_id is null");
            return (Criteria) this;
        }

        public Criteria andRl_idIsNotNull() {
            addCriterion("rl_id is not null");
            return (Criteria) this;
        }

        public Criteria andRl_idEqualTo(Integer value) {
            addCriterion("rl_id =", value, "rl_id");
            return (Criteria) this;
        }

        public Criteria andRl_idNotEqualTo(Integer value) {
            addCriterion("rl_id <>", value, "rl_id");
            return (Criteria) this;
        }

        public Criteria andRl_idGreaterThan(Integer value) {
            addCriterion("rl_id >", value, "rl_id");
            return (Criteria) this;
        }

        public Criteria andRl_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("rl_id >=", value, "rl_id");
            return (Criteria) this;
        }

        public Criteria andRl_idLessThan(Integer value) {
            addCriterion("rl_id <", value, "rl_id");
            return (Criteria) this;
        }

        public Criteria andRl_idLessThanOrEqualTo(Integer value) {
            addCriterion("rl_id <=", value, "rl_id");
            return (Criteria) this;
        }

        public Criteria andRl_idIn(List<Integer> values) {
            addCriterion("rl_id in", values, "rl_id");
            return (Criteria) this;
        }

        public Criteria andRl_idNotIn(List<Integer> values) {
            addCriterion("rl_id not in", values, "rl_id");
            return (Criteria) this;
        }

        public Criteria andRl_idBetween(Integer value1, Integer value2) {
            addCriterion("rl_id between", value1, value2, "rl_id");
            return (Criteria) this;
        }

        public Criteria andRl_idNotBetween(Integer value1, Integer value2) {
            addCriterion("rl_id not between", value1, value2, "rl_id");
            return (Criteria) this;
        }

        public Criteria andRl_nameIsNull() {
            addCriterion("rl_name is null");
            return (Criteria) this;
        }

        public Criteria andRl_nameIsNotNull() {
            addCriterion("rl_name is not null");
            return (Criteria) this;
        }

        public Criteria andRl_nameEqualTo(String value) {
            addCriterion("rl_name =", value, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_nameNotEqualTo(String value) {
            addCriterion("rl_name <>", value, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_nameGreaterThan(String value) {
            addCriterion("rl_name >", value, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_nameGreaterThanOrEqualTo(String value) {
            addCriterion("rl_name >=", value, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_nameLessThan(String value) {
            addCriterion("rl_name <", value, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_nameLessThanOrEqualTo(String value) {
            addCriterion("rl_name <=", value, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_nameLike(String value) {
            addCriterion("rl_name like", value, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_nameNotLike(String value) {
            addCriterion("rl_name not like", value, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_nameIn(List<String> values) {
            addCriterion("rl_name in", values, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_nameNotIn(List<String> values) {
            addCriterion("rl_name not in", values, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_nameBetween(String value1, String value2) {
            addCriterion("rl_name between", value1, value2, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_nameNotBetween(String value1, String value2) {
            addCriterion("rl_name not between", value1, value2, "rl_name");
            return (Criteria) this;
        }

        public Criteria andRl_remarkIsNull() {
            addCriterion("rl_remark is null");
            return (Criteria) this;
        }

        public Criteria andRl_remarkIsNotNull() {
            addCriterion("rl_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRl_remarkEqualTo(String value) {
            addCriterion("rl_remark =", value, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_remarkNotEqualTo(String value) {
            addCriterion("rl_remark <>", value, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_remarkGreaterThan(String value) {
            addCriterion("rl_remark >", value, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("rl_remark >=", value, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_remarkLessThan(String value) {
            addCriterion("rl_remark <", value, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_remarkLessThanOrEqualTo(String value) {
            addCriterion("rl_remark <=", value, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_remarkLike(String value) {
            addCriterion("rl_remark like", value, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_remarkNotLike(String value) {
            addCriterion("rl_remark not like", value, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_remarkIn(List<String> values) {
            addCriterion("rl_remark in", values, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_remarkNotIn(List<String> values) {
            addCriterion("rl_remark not in", values, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_remarkBetween(String value1, String value2) {
            addCriterion("rl_remark between", value1, value2, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_remarkNotBetween(String value1, String value2) {
            addCriterion("rl_remark not between", value1, value2, "rl_remark");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagIsNull() {
            addCriterion("rl_stopflag is null");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagIsNotNull() {
            addCriterion("rl_stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagEqualTo(Boolean value) {
            addCriterion("rl_stopflag =", value, "rl_stopflag");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagNotEqualTo(Boolean value) {
            addCriterion("rl_stopflag <>", value, "rl_stopflag");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagGreaterThan(Boolean value) {
            addCriterion("rl_stopflag >", value, "rl_stopflag");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rl_stopflag >=", value, "rl_stopflag");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagLessThan(Boolean value) {
            addCriterion("rl_stopflag <", value, "rl_stopflag");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("rl_stopflag <=", value, "rl_stopflag");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagIn(List<Boolean> values) {
            addCriterion("rl_stopflag in", values, "rl_stopflag");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagNotIn(List<Boolean> values) {
            addCriterion("rl_stopflag not in", values, "rl_stopflag");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("rl_stopflag between", value1, value2, "rl_stopflag");
            return (Criteria) this;
        }

        public Criteria andRl_stopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rl_stopflag not between", value1, value2, "rl_stopflag");
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