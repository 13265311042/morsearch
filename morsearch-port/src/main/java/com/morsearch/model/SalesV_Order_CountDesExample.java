package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalesV_Order_CountDesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesV_Order_CountDesExample() {
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

        public Criteria andDesignidIsNull() {
            addCriterion("designid is null");
            return (Criteria) this;
        }

        public Criteria andDesignidIsNotNull() {
            addCriterion("designid is not null");
            return (Criteria) this;
        }

        public Criteria andDesignidEqualTo(Long value) {
            addCriterion("designid =", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidNotEqualTo(Long value) {
            addCriterion("designid <>", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidGreaterThan(Long value) {
            addCriterion("designid >", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidGreaterThanOrEqualTo(Long value) {
            addCriterion("designid >=", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidLessThan(Long value) {
            addCriterion("designid <", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidLessThanOrEqualTo(Long value) {
            addCriterion("designid <=", value, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidIn(List<Long> values) {
            addCriterion("designid in", values, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidNotIn(List<Long> values) {
            addCriterion("designid not in", values, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidBetween(Long value1, Long value2) {
            addCriterion("designid between", value1, value2, "designid");
            return (Criteria) this;
        }

        public Criteria andDesignidNotBetween(Long value1, Long value2) {
            addCriterion("designid not between", value1, value2, "designid");
            return (Criteria) this;
        }

        public Criteria andDjtIsNull() {
            addCriterion("djt is null");
            return (Criteria) this;
        }

        public Criteria andDjtIsNotNull() {
            addCriterion("djt is not null");
            return (Criteria) this;
        }

        public Criteria andDjtEqualTo(BigDecimal value) {
            addCriterion("djt =", value, "djt");
            return (Criteria) this;
        }

        public Criteria andDjtNotEqualTo(BigDecimal value) {
            addCriterion("djt <>", value, "djt");
            return (Criteria) this;
        }

        public Criteria andDjtGreaterThan(BigDecimal value) {
            addCriterion("djt >", value, "djt");
            return (Criteria) this;
        }

        public Criteria andDjtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("djt >=", value, "djt");
            return (Criteria) this;
        }

        public Criteria andDjtLessThan(BigDecimal value) {
            addCriterion("djt <", value, "djt");
            return (Criteria) this;
        }

        public Criteria andDjtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("djt <=", value, "djt");
            return (Criteria) this;
        }

        public Criteria andDjtIn(List<BigDecimal> values) {
            addCriterion("djt in", values, "djt");
            return (Criteria) this;
        }

        public Criteria andDjtNotIn(List<BigDecimal> values) {
            addCriterion("djt not in", values, "djt");
            return (Criteria) this;
        }

        public Criteria andDjtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("djt between", value1, value2, "djt");
            return (Criteria) this;
        }

        public Criteria andDjtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("djt not between", value1, value2, "djt");
            return (Criteria) this;
        }

        public Criteria andDqrIsNull() {
            addCriterion("dqr is null");
            return (Criteria) this;
        }

        public Criteria andDqrIsNotNull() {
            addCriterion("dqr is not null");
            return (Criteria) this;
        }

        public Criteria andDqrEqualTo(BigDecimal value) {
            addCriterion("dqr =", value, "dqr");
            return (Criteria) this;
        }

        public Criteria andDqrNotEqualTo(BigDecimal value) {
            addCriterion("dqr <>", value, "dqr");
            return (Criteria) this;
        }

        public Criteria andDqrGreaterThan(BigDecimal value) {
            addCriterion("dqr >", value, "dqr");
            return (Criteria) this;
        }

        public Criteria andDqrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dqr >=", value, "dqr");
            return (Criteria) this;
        }

        public Criteria andDqrLessThan(BigDecimal value) {
            addCriterion("dqr <", value, "dqr");
            return (Criteria) this;
        }

        public Criteria andDqrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dqr <=", value, "dqr");
            return (Criteria) this;
        }

        public Criteria andDqrIn(List<BigDecimal> values) {
            addCriterion("dqr in", values, "dqr");
            return (Criteria) this;
        }

        public Criteria andDqrNotIn(List<BigDecimal> values) {
            addCriterion("dqr not in", values, "dqr");
            return (Criteria) this;
        }

        public Criteria andDqrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dqr between", value1, value2, "dqr");
            return (Criteria) this;
        }

        public Criteria andDqrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dqr not between", value1, value2, "dqr");
            return (Criteria) this;
        }

        public Criteria andDjjIsNull() {
            addCriterion("djj is null");
            return (Criteria) this;
        }

        public Criteria andDjjIsNotNull() {
            addCriterion("djj is not null");
            return (Criteria) this;
        }

        public Criteria andDjjEqualTo(BigDecimal value) {
            addCriterion("djj =", value, "djj");
            return (Criteria) this;
        }

        public Criteria andDjjNotEqualTo(BigDecimal value) {
            addCriterion("djj <>", value, "djj");
            return (Criteria) this;
        }

        public Criteria andDjjGreaterThan(BigDecimal value) {
            addCriterion("djj >", value, "djj");
            return (Criteria) this;
        }

        public Criteria andDjjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("djj >=", value, "djj");
            return (Criteria) this;
        }

        public Criteria andDjjLessThan(BigDecimal value) {
            addCriterion("djj <", value, "djj");
            return (Criteria) this;
        }

        public Criteria andDjjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("djj <=", value, "djj");
            return (Criteria) this;
        }

        public Criteria andDjjIn(List<BigDecimal> values) {
            addCriterion("djj in", values, "djj");
            return (Criteria) this;
        }

        public Criteria andDjjNotIn(List<BigDecimal> values) {
            addCriterion("djj not in", values, "djj");
            return (Criteria) this;
        }

        public Criteria andDjjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("djj between", value1, value2, "djj");
            return (Criteria) this;
        }

        public Criteria andDjjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("djj not between", value1, value2, "djj");
            return (Criteria) this;
        }

        public Criteria andDpjIsNull() {
            addCriterion("dpj is null");
            return (Criteria) this;
        }

        public Criteria andDpjIsNotNull() {
            addCriterion("dpj is not null");
            return (Criteria) this;
        }

        public Criteria andDpjEqualTo(BigDecimal value) {
            addCriterion("dpj =", value, "dpj");
            return (Criteria) this;
        }

        public Criteria andDpjNotEqualTo(BigDecimal value) {
            addCriterion("dpj <>", value, "dpj");
            return (Criteria) this;
        }

        public Criteria andDpjGreaterThan(BigDecimal value) {
            addCriterion("dpj >", value, "dpj");
            return (Criteria) this;
        }

        public Criteria andDpjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dpj >=", value, "dpj");
            return (Criteria) this;
        }

        public Criteria andDpjLessThan(BigDecimal value) {
            addCriterion("dpj <", value, "dpj");
            return (Criteria) this;
        }

        public Criteria andDpjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dpj <=", value, "dpj");
            return (Criteria) this;
        }

        public Criteria andDpjIn(List<BigDecimal> values) {
            addCriterion("dpj in", values, "dpj");
            return (Criteria) this;
        }

        public Criteria andDpjNotIn(List<BigDecimal> values) {
            addCriterion("dpj not in", values, "dpj");
            return (Criteria) this;
        }

        public Criteria andDpjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dpj between", value1, value2, "dpj");
            return (Criteria) this;
        }

        public Criteria andDpjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dpj not between", value1, value2, "dpj");
            return (Criteria) this;
        }

        public Criteria andYwcIsNull() {
            addCriterion("ywc is null");
            return (Criteria) this;
        }

        public Criteria andYwcIsNotNull() {
            addCriterion("ywc is not null");
            return (Criteria) this;
        }

        public Criteria andYwcEqualTo(BigDecimal value) {
            addCriterion("ywc =", value, "ywc");
            return (Criteria) this;
        }

        public Criteria andYwcNotEqualTo(BigDecimal value) {
            addCriterion("ywc <>", value, "ywc");
            return (Criteria) this;
        }

        public Criteria andYwcGreaterThan(BigDecimal value) {
            addCriterion("ywc >", value, "ywc");
            return (Criteria) this;
        }

        public Criteria andYwcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ywc >=", value, "ywc");
            return (Criteria) this;
        }

        public Criteria andYwcLessThan(BigDecimal value) {
            addCriterion("ywc <", value, "ywc");
            return (Criteria) this;
        }

        public Criteria andYwcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ywc <=", value, "ywc");
            return (Criteria) this;
        }

        public Criteria andYwcIn(List<BigDecimal> values) {
            addCriterion("ywc in", values, "ywc");
            return (Criteria) this;
        }

        public Criteria andYwcNotIn(List<BigDecimal> values) {
            addCriterion("ywc not in", values, "ywc");
            return (Criteria) this;
        }

        public Criteria andYwcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ywc between", value1, value2, "ywc");
            return (Criteria) this;
        }

        public Criteria andYwcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ywc not between", value1, value2, "ywc");
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