package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class Sys_MenuPowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_MenuPowerExample() {
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

        public Criteria andSm_noIsNull() {
            addCriterion("sm_no is null");
            return (Criteria) this;
        }

        public Criteria andSm_noIsNotNull() {
            addCriterion("sm_no is not null");
            return (Criteria) this;
        }

        public Criteria andSm_noEqualTo(String value) {
            addCriterion("sm_no =", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noNotEqualTo(String value) {
            addCriterion("sm_no <>", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noGreaterThan(String value) {
            addCriterion("sm_no >", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noGreaterThanOrEqualTo(String value) {
            addCriterion("sm_no >=", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noLessThan(String value) {
            addCriterion("sm_no <", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noLessThanOrEqualTo(String value) {
            addCriterion("sm_no <=", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noLike(String value) {
            addCriterion("sm_no like", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noNotLike(String value) {
            addCriterion("sm_no not like", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noIn(List<String> values) {
            addCriterion("sm_no in", values, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noNotIn(List<String> values) {
            addCriterion("sm_no not in", values, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noBetween(String value1, String value2) {
            addCriterion("sm_no between", value1, value2, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noNotBetween(String value1, String value2) {
            addCriterion("sm_no not between", value1, value2, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_nameIsNull() {
            addCriterion("sm_name is null");
            return (Criteria) this;
        }

        public Criteria andSm_nameIsNotNull() {
            addCriterion("sm_name is not null");
            return (Criteria) this;
        }

        public Criteria andSm_nameEqualTo(String value) {
            addCriterion("sm_name =", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameNotEqualTo(String value) {
            addCriterion("sm_name <>", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameGreaterThan(String value) {
            addCriterion("sm_name >", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sm_name >=", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameLessThan(String value) {
            addCriterion("sm_name <", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameLessThanOrEqualTo(String value) {
            addCriterion("sm_name <=", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameLike(String value) {
            addCriterion("sm_name like", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameNotLike(String value) {
            addCriterion("sm_name not like", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameIn(List<String> values) {
            addCriterion("sm_name in", values, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameNotIn(List<String> values) {
            addCriterion("sm_name not in", values, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameBetween(String value1, String value2) {
            addCriterion("sm_name between", value1, value2, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameNotBetween(String value1, String value2) {
            addCriterion("sm_name not between", value1, value2, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_parentidIsNull() {
            addCriterion("sm_parentid is null");
            return (Criteria) this;
        }

        public Criteria andSm_parentidIsNotNull() {
            addCriterion("sm_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andSm_parentidEqualTo(Long value) {
            addCriterion("sm_parentid =", value, "sm_parentid");
            return (Criteria) this;
        }

        public Criteria andSm_parentidNotEqualTo(Long value) {
            addCriterion("sm_parentid <>", value, "sm_parentid");
            return (Criteria) this;
        }

        public Criteria andSm_parentidGreaterThan(Long value) {
            addCriterion("sm_parentid >", value, "sm_parentid");
            return (Criteria) this;
        }

        public Criteria andSm_parentidGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_parentid >=", value, "sm_parentid");
            return (Criteria) this;
        }

        public Criteria andSm_parentidLessThan(Long value) {
            addCriterion("sm_parentid <", value, "sm_parentid");
            return (Criteria) this;
        }

        public Criteria andSm_parentidLessThanOrEqualTo(Long value) {
            addCriterion("sm_parentid <=", value, "sm_parentid");
            return (Criteria) this;
        }

        public Criteria andSm_parentidIn(List<Long> values) {
            addCriterion("sm_parentid in", values, "sm_parentid");
            return (Criteria) this;
        }

        public Criteria andSm_parentidNotIn(List<Long> values) {
            addCriterion("sm_parentid not in", values, "sm_parentid");
            return (Criteria) this;
        }

        public Criteria andSm_parentidBetween(Long value1, Long value2) {
            addCriterion("sm_parentid between", value1, value2, "sm_parentid");
            return (Criteria) this;
        }

        public Criteria andSm_parentidNotBetween(Long value1, Long value2) {
            addCriterion("sm_parentid not between", value1, value2, "sm_parentid");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuIsNull() {
            addCriterion("sm_ismenu is null");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuIsNotNull() {
            addCriterion("sm_ismenu is not null");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuEqualTo(Integer value) {
            addCriterion("sm_ismenu =", value, "sm_ismenu");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuNotEqualTo(Integer value) {
            addCriterion("sm_ismenu <>", value, "sm_ismenu");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuGreaterThan(Integer value) {
            addCriterion("sm_ismenu >", value, "sm_ismenu");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_ismenu >=", value, "sm_ismenu");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuLessThan(Integer value) {
            addCriterion("sm_ismenu <", value, "sm_ismenu");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuLessThanOrEqualTo(Integer value) {
            addCriterion("sm_ismenu <=", value, "sm_ismenu");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuIn(List<Integer> values) {
            addCriterion("sm_ismenu in", values, "sm_ismenu");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuNotIn(List<Integer> values) {
            addCriterion("sm_ismenu not in", values, "sm_ismenu");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuBetween(Integer value1, Integer value2) {
            addCriterion("sm_ismenu between", value1, value2, "sm_ismenu");
            return (Criteria) this;
        }

        public Criteria andSm_ismenuNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_ismenu not between", value1, value2, "sm_ismenu");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlIsNull() {
            addCriterion("sm_menuurl is null");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlIsNotNull() {
            addCriterion("sm_menuurl is not null");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlEqualTo(String value) {
            addCriterion("sm_menuurl =", value, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlNotEqualTo(String value) {
            addCriterion("sm_menuurl <>", value, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlGreaterThan(String value) {
            addCriterion("sm_menuurl >", value, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlGreaterThanOrEqualTo(String value) {
            addCriterion("sm_menuurl >=", value, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlLessThan(String value) {
            addCriterion("sm_menuurl <", value, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlLessThanOrEqualTo(String value) {
            addCriterion("sm_menuurl <=", value, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlLike(String value) {
            addCriterion("sm_menuurl like", value, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlNotLike(String value) {
            addCriterion("sm_menuurl not like", value, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlIn(List<String> values) {
            addCriterion("sm_menuurl in", values, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlNotIn(List<String> values) {
            addCriterion("sm_menuurl not in", values, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlBetween(String value1, String value2) {
            addCriterion("sm_menuurl between", value1, value2, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_menuurlNotBetween(String value1, String value2) {
            addCriterion("sm_menuurl not between", value1, value2, "sm_menuurl");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagIsNull() {
            addCriterion("sm_stopflag is null");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagIsNotNull() {
            addCriterion("sm_stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagEqualTo(Boolean value) {
            addCriterion("sm_stopflag =", value, "sm_stopflag");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagNotEqualTo(Boolean value) {
            addCriterion("sm_stopflag <>", value, "sm_stopflag");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagGreaterThan(Boolean value) {
            addCriterion("sm_stopflag >", value, "sm_stopflag");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sm_stopflag >=", value, "sm_stopflag");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagLessThan(Boolean value) {
            addCriterion("sm_stopflag <", value, "sm_stopflag");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("sm_stopflag <=", value, "sm_stopflag");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagIn(List<Boolean> values) {
            addCriterion("sm_stopflag in", values, "sm_stopflag");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagNotIn(List<Boolean> values) {
            addCriterion("sm_stopflag not in", values, "sm_stopflag");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("sm_stopflag between", value1, value2, "sm_stopflag");
            return (Criteria) this;
        }

        public Criteria andSm_stopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sm_stopflag not between", value1, value2, "sm_stopflag");
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