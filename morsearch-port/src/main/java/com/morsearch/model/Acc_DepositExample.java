package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Acc_DepositExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Acc_DepositExample() {
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

        public Criteria andAc_useridIsNull() {
            addCriterion("ac_userid is null");
            return (Criteria) this;
        }

        public Criteria andAc_useridIsNotNull() {
            addCriterion("ac_userid is not null");
            return (Criteria) this;
        }

        public Criteria andAc_useridEqualTo(Long value) {
            addCriterion("ac_userid =", value, "ac_userid");
            return (Criteria) this;
        }

        public Criteria andAc_useridNotEqualTo(Long value) {
            addCriterion("ac_userid <>", value, "ac_userid");
            return (Criteria) this;
        }

        public Criteria andAc_useridGreaterThan(Long value) {
            addCriterion("ac_userid >", value, "ac_userid");
            return (Criteria) this;
        }

        public Criteria andAc_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("ac_userid >=", value, "ac_userid");
            return (Criteria) this;
        }

        public Criteria andAc_useridLessThan(Long value) {
            addCriterion("ac_userid <", value, "ac_userid");
            return (Criteria) this;
        }

        public Criteria andAc_useridLessThanOrEqualTo(Long value) {
            addCriterion("ac_userid <=", value, "ac_userid");
            return (Criteria) this;
        }

        public Criteria andAc_useridIn(List<Long> values) {
            addCriterion("ac_userid in", values, "ac_userid");
            return (Criteria) this;
        }

        public Criteria andAc_useridNotIn(List<Long> values) {
            addCriterion("ac_userid not in", values, "ac_userid");
            return (Criteria) this;
        }

        public Criteria andAc_useridBetween(Long value1, Long value2) {
            addCriterion("ac_userid between", value1, value2, "ac_userid");
            return (Criteria) this;
        }

        public Criteria andAc_useridNotBetween(Long value1, Long value2) {
            addCriterion("ac_userid not between", value1, value2, "ac_userid");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeIsNull() {
            addCriterion("ac_typecode is null");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeIsNotNull() {
            addCriterion("ac_typecode is not null");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeEqualTo(String value) {
            addCriterion("ac_typecode =", value, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeNotEqualTo(String value) {
            addCriterion("ac_typecode <>", value, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeGreaterThan(String value) {
            addCriterion("ac_typecode >", value, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ac_typecode >=", value, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeLessThan(String value) {
            addCriterion("ac_typecode <", value, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeLessThanOrEqualTo(String value) {
            addCriterion("ac_typecode <=", value, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeLike(String value) {
            addCriterion("ac_typecode like", value, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeNotLike(String value) {
            addCriterion("ac_typecode not like", value, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeIn(List<String> values) {
            addCriterion("ac_typecode in", values, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeNotIn(List<String> values) {
            addCriterion("ac_typecode not in", values, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeBetween(String value1, String value2) {
            addCriterion("ac_typecode between", value1, value2, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_typecodeNotBetween(String value1, String value2) {
            addCriterion("ac_typecode not between", value1, value2, "ac_typecode");
            return (Criteria) this;
        }

        public Criteria andAc_depositIsNull() {
            addCriterion("ac_deposit is null");
            return (Criteria) this;
        }

        public Criteria andAc_depositIsNotNull() {
            addCriterion("ac_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andAc_depositEqualTo(BigDecimal value) {
            addCriterion("ac_deposit =", value, "ac_deposit");
            return (Criteria) this;
        }

        public Criteria andAc_depositNotEqualTo(BigDecimal value) {
            addCriterion("ac_deposit <>", value, "ac_deposit");
            return (Criteria) this;
        }

        public Criteria andAc_depositGreaterThan(BigDecimal value) {
            addCriterion("ac_deposit >", value, "ac_deposit");
            return (Criteria) this;
        }

        public Criteria andAc_depositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ac_deposit >=", value, "ac_deposit");
            return (Criteria) this;
        }

        public Criteria andAc_depositLessThan(BigDecimal value) {
            addCriterion("ac_deposit <", value, "ac_deposit");
            return (Criteria) this;
        }

        public Criteria andAc_depositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ac_deposit <=", value, "ac_deposit");
            return (Criteria) this;
        }

        public Criteria andAc_depositIn(List<BigDecimal> values) {
            addCriterion("ac_deposit in", values, "ac_deposit");
            return (Criteria) this;
        }

        public Criteria andAc_depositNotIn(List<BigDecimal> values) {
            addCriterion("ac_deposit not in", values, "ac_deposit");
            return (Criteria) this;
        }

        public Criteria andAc_depositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac_deposit between", value1, value2, "ac_deposit");
            return (Criteria) this;
        }

        public Criteria andAc_depositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac_deposit not between", value1, value2, "ac_deposit");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedIsNull() {
            addCriterion("ac_occupied is null");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedIsNotNull() {
            addCriterion("ac_occupied is not null");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedEqualTo(BigDecimal value) {
            addCriterion("ac_occupied =", value, "ac_occupied");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedNotEqualTo(BigDecimal value) {
            addCriterion("ac_occupied <>", value, "ac_occupied");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedGreaterThan(BigDecimal value) {
            addCriterion("ac_occupied >", value, "ac_occupied");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ac_occupied >=", value, "ac_occupied");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedLessThan(BigDecimal value) {
            addCriterion("ac_occupied <", value, "ac_occupied");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ac_occupied <=", value, "ac_occupied");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedIn(List<BigDecimal> values) {
            addCriterion("ac_occupied in", values, "ac_occupied");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedNotIn(List<BigDecimal> values) {
            addCriterion("ac_occupied not in", values, "ac_occupied");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac_occupied between", value1, value2, "ac_occupied");
            return (Criteria) this;
        }

        public Criteria andAc_occupiedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac_occupied not between", value1, value2, "ac_occupied");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyIsNull() {
            addCriterion("ac_receiveqty is null");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyIsNotNull() {
            addCriterion("ac_receiveqty is not null");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyEqualTo(BigDecimal value) {
            addCriterion("ac_receiveqty =", value, "ac_receiveqty");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyNotEqualTo(BigDecimal value) {
            addCriterion("ac_receiveqty <>", value, "ac_receiveqty");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyGreaterThan(BigDecimal value) {
            addCriterion("ac_receiveqty >", value, "ac_receiveqty");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ac_receiveqty >=", value, "ac_receiveqty");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyLessThan(BigDecimal value) {
            addCriterion("ac_receiveqty <", value, "ac_receiveqty");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ac_receiveqty <=", value, "ac_receiveqty");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyIn(List<BigDecimal> values) {
            addCriterion("ac_receiveqty in", values, "ac_receiveqty");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyNotIn(List<BigDecimal> values) {
            addCriterion("ac_receiveqty not in", values, "ac_receiveqty");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac_receiveqty between", value1, value2, "ac_receiveqty");
            return (Criteria) this;
        }

        public Criteria andAc_receiveqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac_receiveqty not between", value1, value2, "ac_receiveqty");
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