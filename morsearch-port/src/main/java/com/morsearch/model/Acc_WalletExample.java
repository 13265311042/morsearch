package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Acc_WalletExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Acc_WalletExample() {
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

        public Criteria andWl_useridIsNull() {
            addCriterion("wl_userid is null");
            return (Criteria) this;
        }

        public Criteria andWl_useridIsNotNull() {
            addCriterion("wl_userid is not null");
            return (Criteria) this;
        }

        public Criteria andWl_useridEqualTo(Long value) {
            addCriterion("wl_userid =", value, "wl_userid");
            return (Criteria) this;
        }

        public Criteria andWl_useridNotEqualTo(Long value) {
            addCriterion("wl_userid <>", value, "wl_userid");
            return (Criteria) this;
        }

        public Criteria andWl_useridGreaterThan(Long value) {
            addCriterion("wl_userid >", value, "wl_userid");
            return (Criteria) this;
        }

        public Criteria andWl_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("wl_userid >=", value, "wl_userid");
            return (Criteria) this;
        }

        public Criteria andWl_useridLessThan(Long value) {
            addCriterion("wl_userid <", value, "wl_userid");
            return (Criteria) this;
        }

        public Criteria andWl_useridLessThanOrEqualTo(Long value) {
            addCriterion("wl_userid <=", value, "wl_userid");
            return (Criteria) this;
        }

        public Criteria andWl_useridIn(List<Long> values) {
            addCriterion("wl_userid in", values, "wl_userid");
            return (Criteria) this;
        }

        public Criteria andWl_useridNotIn(List<Long> values) {
            addCriterion("wl_userid not in", values, "wl_userid");
            return (Criteria) this;
        }

        public Criteria andWl_useridBetween(Long value1, Long value2) {
            addCriterion("wl_userid between", value1, value2, "wl_userid");
            return (Criteria) this;
        }

        public Criteria andWl_useridNotBetween(Long value1, Long value2) {
            addCriterion("wl_userid not between", value1, value2, "wl_userid");
            return (Criteria) this;
        }

        public Criteria andWl_accountIsNull() {
            addCriterion("wl_account is null");
            return (Criteria) this;
        }

        public Criteria andWl_accountIsNotNull() {
            addCriterion("wl_account is not null");
            return (Criteria) this;
        }

        public Criteria andWl_accountEqualTo(BigDecimal value) {
            addCriterion("wl_account =", value, "wl_account");
            return (Criteria) this;
        }

        public Criteria andWl_accountNotEqualTo(BigDecimal value) {
            addCriterion("wl_account <>", value, "wl_account");
            return (Criteria) this;
        }

        public Criteria andWl_accountGreaterThan(BigDecimal value) {
            addCriterion("wl_account >", value, "wl_account");
            return (Criteria) this;
        }

        public Criteria andWl_accountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wl_account >=", value, "wl_account");
            return (Criteria) this;
        }

        public Criteria andWl_accountLessThan(BigDecimal value) {
            addCriterion("wl_account <", value, "wl_account");
            return (Criteria) this;
        }

        public Criteria andWl_accountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wl_account <=", value, "wl_account");
            return (Criteria) this;
        }

        public Criteria andWl_accountIn(List<BigDecimal> values) {
            addCriterion("wl_account in", values, "wl_account");
            return (Criteria) this;
        }

        public Criteria andWl_accountNotIn(List<BigDecimal> values) {
            addCriterion("wl_account not in", values, "wl_account");
            return (Criteria) this;
        }

        public Criteria andWl_accountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wl_account between", value1, value2, "wl_account");
            return (Criteria) this;
        }

        public Criteria andWl_accountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wl_account not between", value1, value2, "wl_account");
            return (Criteria) this;
        }

        public Criteria andWl_integralIsNull() {
            addCriterion("wl_integral is null");
            return (Criteria) this;
        }

        public Criteria andWl_integralIsNotNull() {
            addCriterion("wl_integral is not null");
            return (Criteria) this;
        }

        public Criteria andWl_integralEqualTo(BigDecimal value) {
            addCriterion("wl_integral =", value, "wl_integral");
            return (Criteria) this;
        }

        public Criteria andWl_integralNotEqualTo(BigDecimal value) {
            addCriterion("wl_integral <>", value, "wl_integral");
            return (Criteria) this;
        }

        public Criteria andWl_integralGreaterThan(BigDecimal value) {
            addCriterion("wl_integral >", value, "wl_integral");
            return (Criteria) this;
        }

        public Criteria andWl_integralGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wl_integral >=", value, "wl_integral");
            return (Criteria) this;
        }

        public Criteria andWl_integralLessThan(BigDecimal value) {
            addCriterion("wl_integral <", value, "wl_integral");
            return (Criteria) this;
        }

        public Criteria andWl_integralLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wl_integral <=", value, "wl_integral");
            return (Criteria) this;
        }

        public Criteria andWl_integralIn(List<BigDecimal> values) {
            addCriterion("wl_integral in", values, "wl_integral");
            return (Criteria) this;
        }

        public Criteria andWl_integralNotIn(List<BigDecimal> values) {
            addCriterion("wl_integral not in", values, "wl_integral");
            return (Criteria) this;
        }

        public Criteria andWl_integralBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wl_integral between", value1, value2, "wl_integral");
            return (Criteria) this;
        }

        public Criteria andWl_integralNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wl_integral not between", value1, value2, "wl_integral");
            return (Criteria) this;
        }

        public Criteria andWl_depositIsNull() {
            addCriterion("wl_deposit is null");
            return (Criteria) this;
        }

        public Criteria andWl_depositIsNotNull() {
            addCriterion("wl_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andWl_depositEqualTo(BigDecimal value) {
            addCriterion("wl_deposit =", value, "wl_deposit");
            return (Criteria) this;
        }

        public Criteria andWl_depositNotEqualTo(BigDecimal value) {
            addCriterion("wl_deposit <>", value, "wl_deposit");
            return (Criteria) this;
        }

        public Criteria andWl_depositGreaterThan(BigDecimal value) {
            addCriterion("wl_deposit >", value, "wl_deposit");
            return (Criteria) this;
        }

        public Criteria andWl_depositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wl_deposit >=", value, "wl_deposit");
            return (Criteria) this;
        }

        public Criteria andWl_depositLessThan(BigDecimal value) {
            addCriterion("wl_deposit <", value, "wl_deposit");
            return (Criteria) this;
        }

        public Criteria andWl_depositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wl_deposit <=", value, "wl_deposit");
            return (Criteria) this;
        }

        public Criteria andWl_depositIn(List<BigDecimal> values) {
            addCriterion("wl_deposit in", values, "wl_deposit");
            return (Criteria) this;
        }

        public Criteria andWl_depositNotIn(List<BigDecimal> values) {
            addCriterion("wl_deposit not in", values, "wl_deposit");
            return (Criteria) this;
        }

        public Criteria andWl_depositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wl_deposit between", value1, value2, "wl_deposit");
            return (Criteria) this;
        }

        public Criteria andWl_depositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wl_deposit not between", value1, value2, "wl_deposit");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedIsNull() {
            addCriterion("wl_occupied is null");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedIsNotNull() {
            addCriterion("wl_occupied is not null");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedEqualTo(BigDecimal value) {
            addCriterion("wl_occupied =", value, "wl_occupied");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedNotEqualTo(BigDecimal value) {
            addCriterion("wl_occupied <>", value, "wl_occupied");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedGreaterThan(BigDecimal value) {
            addCriterion("wl_occupied >", value, "wl_occupied");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wl_occupied >=", value, "wl_occupied");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedLessThan(BigDecimal value) {
            addCriterion("wl_occupied <", value, "wl_occupied");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wl_occupied <=", value, "wl_occupied");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedIn(List<BigDecimal> values) {
            addCriterion("wl_occupied in", values, "wl_occupied");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedNotIn(List<BigDecimal> values) {
            addCriterion("wl_occupied not in", values, "wl_occupied");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wl_occupied between", value1, value2, "wl_occupied");
            return (Criteria) this;
        }

        public Criteria andWl_occupiedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wl_occupied not between", value1, value2, "wl_occupied");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyIsNull() {
            addCriterion("wl_receiveqty is null");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyIsNotNull() {
            addCriterion("wl_receiveqty is not null");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyEqualTo(BigDecimal value) {
            addCriterion("wl_receiveqty =", value, "wl_receiveqty");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyNotEqualTo(BigDecimal value) {
            addCriterion("wl_receiveqty <>", value, "wl_receiveqty");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyGreaterThan(BigDecimal value) {
            addCriterion("wl_receiveqty >", value, "wl_receiveqty");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wl_receiveqty >=", value, "wl_receiveqty");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyLessThan(BigDecimal value) {
            addCriterion("wl_receiveqty <", value, "wl_receiveqty");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wl_receiveqty <=", value, "wl_receiveqty");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyIn(List<BigDecimal> values) {
            addCriterion("wl_receiveqty in", values, "wl_receiveqty");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyNotIn(List<BigDecimal> values) {
            addCriterion("wl_receiveqty not in", values, "wl_receiveqty");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wl_receiveqty between", value1, value2, "wl_receiveqty");
            return (Criteria) this;
        }

        public Criteria andWl_receiveqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wl_receiveqty not between", value1, value2, "wl_receiveqty");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyIsNull() {
            addCriterion("wl_countbuy is null");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyIsNotNull() {
            addCriterion("wl_countbuy is not null");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyEqualTo(Integer value) {
            addCriterion("wl_countbuy =", value, "wl_countbuy");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyNotEqualTo(Integer value) {
            addCriterion("wl_countbuy <>", value, "wl_countbuy");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyGreaterThan(Integer value) {
            addCriterion("wl_countbuy >", value, "wl_countbuy");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("wl_countbuy >=", value, "wl_countbuy");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyLessThan(Integer value) {
            addCriterion("wl_countbuy <", value, "wl_countbuy");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyLessThanOrEqualTo(Integer value) {
            addCriterion("wl_countbuy <=", value, "wl_countbuy");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyIn(List<Integer> values) {
            addCriterion("wl_countbuy in", values, "wl_countbuy");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyNotIn(List<Integer> values) {
            addCriterion("wl_countbuy not in", values, "wl_countbuy");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyBetween(Integer value1, Integer value2) {
            addCriterion("wl_countbuy between", value1, value2, "wl_countbuy");
            return (Criteria) this;
        }

        public Criteria andWl_countbuyNotBetween(Integer value1, Integer value2) {
            addCriterion("wl_countbuy not between", value1, value2, "wl_countbuy");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeIsNull() {
            addCriterion("wl_countrecharge is null");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeIsNotNull() {
            addCriterion("wl_countrecharge is not null");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeEqualTo(Integer value) {
            addCriterion("wl_countrecharge =", value, "wl_countrecharge");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeNotEqualTo(Integer value) {
            addCriterion("wl_countrecharge <>", value, "wl_countrecharge");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeGreaterThan(Integer value) {
            addCriterion("wl_countrecharge >", value, "wl_countrecharge");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wl_countrecharge >=", value, "wl_countrecharge");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeLessThan(Integer value) {
            addCriterion("wl_countrecharge <", value, "wl_countrecharge");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeLessThanOrEqualTo(Integer value) {
            addCriterion("wl_countrecharge <=", value, "wl_countrecharge");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeIn(List<Integer> values) {
            addCriterion("wl_countrecharge in", values, "wl_countrecharge");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeNotIn(List<Integer> values) {
            addCriterion("wl_countrecharge not in", values, "wl_countrecharge");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeBetween(Integer value1, Integer value2) {
            addCriterion("wl_countrecharge between", value1, value2, "wl_countrecharge");
            return (Criteria) this;
        }

        public Criteria andWl_countrechargeNotBetween(Integer value1, Integer value2) {
            addCriterion("wl_countrecharge not between", value1, value2, "wl_countrecharge");
            return (Criteria) this;
        }

        public Criteria andWl_createdateIsNull() {
            addCriterion("wl_createdate is null");
            return (Criteria) this;
        }

        public Criteria andWl_createdateIsNotNull() {
            addCriterion("wl_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andWl_createdateEqualTo(Date value) {
            addCriterion("wl_createdate =", value, "wl_createdate");
            return (Criteria) this;
        }

        public Criteria andWl_createdateNotEqualTo(Date value) {
            addCriterion("wl_createdate <>", value, "wl_createdate");
            return (Criteria) this;
        }

        public Criteria andWl_createdateGreaterThan(Date value) {
            addCriterion("wl_createdate >", value, "wl_createdate");
            return (Criteria) this;
        }

        public Criteria andWl_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("wl_createdate >=", value, "wl_createdate");
            return (Criteria) this;
        }

        public Criteria andWl_createdateLessThan(Date value) {
            addCriterion("wl_createdate <", value, "wl_createdate");
            return (Criteria) this;
        }

        public Criteria andWl_createdateLessThanOrEqualTo(Date value) {
            addCriterion("wl_createdate <=", value, "wl_createdate");
            return (Criteria) this;
        }

        public Criteria andWl_createdateIn(List<Date> values) {
            addCriterion("wl_createdate in", values, "wl_createdate");
            return (Criteria) this;
        }

        public Criteria andWl_createdateNotIn(List<Date> values) {
            addCriterion("wl_createdate not in", values, "wl_createdate");
            return (Criteria) this;
        }

        public Criteria andWl_createdateBetween(Date value1, Date value2) {
            addCriterion("wl_createdate between", value1, value2, "wl_createdate");
            return (Criteria) this;
        }

        public Criteria andWl_createdateNotBetween(Date value1, Date value2) {
            addCriterion("wl_createdate not between", value1, value2, "wl_createdate");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateIsNull() {
            addCriterion("wl_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateIsNotNull() {
            addCriterion("wl_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateEqualTo(Date value) {
            addCriterion("wl_updatedate =", value, "wl_updatedate");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateNotEqualTo(Date value) {
            addCriterion("wl_updatedate <>", value, "wl_updatedate");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateGreaterThan(Date value) {
            addCriterion("wl_updatedate >", value, "wl_updatedate");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("wl_updatedate >=", value, "wl_updatedate");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateLessThan(Date value) {
            addCriterion("wl_updatedate <", value, "wl_updatedate");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("wl_updatedate <=", value, "wl_updatedate");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateIn(List<Date> values) {
            addCriterion("wl_updatedate in", values, "wl_updatedate");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateNotIn(List<Date> values) {
            addCriterion("wl_updatedate not in", values, "wl_updatedate");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateBetween(Date value1, Date value2) {
            addCriterion("wl_updatedate between", value1, value2, "wl_updatedate");
            return (Criteria) this;
        }

        public Criteria andWl_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("wl_updatedate not between", value1, value2, "wl_updatedate");
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