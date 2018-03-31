package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class Sys_MenuRolePowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_MenuRolePowerExample() {
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

        public Criteria andRp_roleidIsNull() {
            addCriterion("rp_roleid is null");
            return (Criteria) this;
        }

        public Criteria andRp_roleidIsNotNull() {
            addCriterion("rp_roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRp_roleidEqualTo(Integer value) {
            addCriterion("rp_roleid =", value, "rp_roleid");
            return (Criteria) this;
        }

        public Criteria andRp_roleidNotEqualTo(Integer value) {
            addCriterion("rp_roleid <>", value, "rp_roleid");
            return (Criteria) this;
        }

        public Criteria andRp_roleidGreaterThan(Integer value) {
            addCriterion("rp_roleid >", value, "rp_roleid");
            return (Criteria) this;
        }

        public Criteria andRp_roleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rp_roleid >=", value, "rp_roleid");
            return (Criteria) this;
        }

        public Criteria andRp_roleidLessThan(Integer value) {
            addCriterion("rp_roleid <", value, "rp_roleid");
            return (Criteria) this;
        }

        public Criteria andRp_roleidLessThanOrEqualTo(Integer value) {
            addCriterion("rp_roleid <=", value, "rp_roleid");
            return (Criteria) this;
        }

        public Criteria andRp_roleidIn(List<Integer> values) {
            addCriterion("rp_roleid in", values, "rp_roleid");
            return (Criteria) this;
        }

        public Criteria andRp_roleidNotIn(List<Integer> values) {
            addCriterion("rp_roleid not in", values, "rp_roleid");
            return (Criteria) this;
        }

        public Criteria andRp_roleidBetween(Integer value1, Integer value2) {
            addCriterion("rp_roleid between", value1, value2, "rp_roleid");
            return (Criteria) this;
        }

        public Criteria andRp_roleidNotBetween(Integer value1, Integer value2) {
            addCriterion("rp_roleid not between", value1, value2, "rp_roleid");
            return (Criteria) this;
        }

        public Criteria andRp_menunoIsNull() {
            addCriterion("rp_menuno is null");
            return (Criteria) this;
        }

        public Criteria andRp_menunoIsNotNull() {
            addCriterion("rp_menuno is not null");
            return (Criteria) this;
        }

        public Criteria andRp_menunoEqualTo(String value) {
            addCriterion("rp_menuno =", value, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_menunoNotEqualTo(String value) {
            addCriterion("rp_menuno <>", value, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_menunoGreaterThan(String value) {
            addCriterion("rp_menuno >", value, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_menunoGreaterThanOrEqualTo(String value) {
            addCriterion("rp_menuno >=", value, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_menunoLessThan(String value) {
            addCriterion("rp_menuno <", value, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_menunoLessThanOrEqualTo(String value) {
            addCriterion("rp_menuno <=", value, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_menunoLike(String value) {
            addCriterion("rp_menuno like", value, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_menunoNotLike(String value) {
            addCriterion("rp_menuno not like", value, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_menunoIn(List<String> values) {
            addCriterion("rp_menuno in", values, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_menunoNotIn(List<String> values) {
            addCriterion("rp_menuno not in", values, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_menunoBetween(String value1, String value2) {
            addCriterion("rp_menuno between", value1, value2, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_menunoNotBetween(String value1, String value2) {
            addCriterion("rp_menuno not between", value1, value2, "rp_menuno");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagIsNull() {
            addCriterion("rp_allowflag is null");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagIsNotNull() {
            addCriterion("rp_allowflag is not null");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagEqualTo(Boolean value) {
            addCriterion("rp_allowflag =", value, "rp_allowflag");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagNotEqualTo(Boolean value) {
            addCriterion("rp_allowflag <>", value, "rp_allowflag");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagGreaterThan(Boolean value) {
            addCriterion("rp_allowflag >", value, "rp_allowflag");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rp_allowflag >=", value, "rp_allowflag");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagLessThan(Boolean value) {
            addCriterion("rp_allowflag <", value, "rp_allowflag");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagLessThanOrEqualTo(Boolean value) {
            addCriterion("rp_allowflag <=", value, "rp_allowflag");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagIn(List<Boolean> values) {
            addCriterion("rp_allowflag in", values, "rp_allowflag");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagNotIn(List<Boolean> values) {
            addCriterion("rp_allowflag not in", values, "rp_allowflag");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagBetween(Boolean value1, Boolean value2) {
            addCriterion("rp_allowflag between", value1, value2, "rp_allowflag");
            return (Criteria) this;
        }

        public Criteria andRp_allowflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rp_allowflag not between", value1, value2, "rp_allowflag");
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