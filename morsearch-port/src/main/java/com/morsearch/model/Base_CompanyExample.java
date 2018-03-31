package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Base_CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Base_CompanyExample() {
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

        public Criteria andCy_useridIsNull() {
            addCriterion("cy_userid is null");
            return (Criteria) this;
        }

        public Criteria andCy_useridIsNotNull() {
            addCriterion("cy_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCy_useridEqualTo(Long value) {
            addCriterion("cy_userid =", value, "cy_userid");
            return (Criteria) this;
        }

        public Criteria andCy_useridNotEqualTo(Long value) {
            addCriterion("cy_userid <>", value, "cy_userid");
            return (Criteria) this;
        }

        public Criteria andCy_useridGreaterThan(Long value) {
            addCriterion("cy_userid >", value, "cy_userid");
            return (Criteria) this;
        }

        public Criteria andCy_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("cy_userid >=", value, "cy_userid");
            return (Criteria) this;
        }

        public Criteria andCy_useridLessThan(Long value) {
            addCriterion("cy_userid <", value, "cy_userid");
            return (Criteria) this;
        }

        public Criteria andCy_useridLessThanOrEqualTo(Long value) {
            addCriterion("cy_userid <=", value, "cy_userid");
            return (Criteria) this;
        }

        public Criteria andCy_useridIn(List<Long> values) {
            addCriterion("cy_userid in", values, "cy_userid");
            return (Criteria) this;
        }

        public Criteria andCy_useridNotIn(List<Long> values) {
            addCriterion("cy_userid not in", values, "cy_userid");
            return (Criteria) this;
        }

        public Criteria andCy_useridBetween(Long value1, Long value2) {
            addCriterion("cy_userid between", value1, value2, "cy_userid");
            return (Criteria) this;
        }

        public Criteria andCy_useridNotBetween(Long value1, Long value2) {
            addCriterion("cy_userid not between", value1, value2, "cy_userid");
            return (Criteria) this;
        }

        public Criteria andCy_tradeIsNull() {
            addCriterion("cy_trade is null");
            return (Criteria) this;
        }

        public Criteria andCy_tradeIsNotNull() {
            addCriterion("cy_trade is not null");
            return (Criteria) this;
        }

        public Criteria andCy_tradeEqualTo(String value) {
            addCriterion("cy_trade =", value, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tradeNotEqualTo(String value) {
            addCriterion("cy_trade <>", value, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tradeGreaterThan(String value) {
            addCriterion("cy_trade >", value, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tradeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_trade >=", value, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tradeLessThan(String value) {
            addCriterion("cy_trade <", value, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tradeLessThanOrEqualTo(String value) {
            addCriterion("cy_trade <=", value, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tradeLike(String value) {
            addCriterion("cy_trade like", value, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tradeNotLike(String value) {
            addCriterion("cy_trade not like", value, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tradeIn(List<String> values) {
            addCriterion("cy_trade in", values, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tradeNotIn(List<String> values) {
            addCriterion("cy_trade not in", values, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tradeBetween(String value1, String value2) {
            addCriterion("cy_trade between", value1, value2, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tradeNotBetween(String value1, String value2) {
            addCriterion("cy_trade not between", value1, value2, "cy_trade");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductIsNull() {
            addCriterion("cy_tagproduct is null");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductIsNotNull() {
            addCriterion("cy_tagproduct is not null");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductEqualTo(String value) {
            addCriterion("cy_tagproduct =", value, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductNotEqualTo(String value) {
            addCriterion("cy_tagproduct <>", value, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductGreaterThan(String value) {
            addCriterion("cy_tagproduct >", value, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductGreaterThanOrEqualTo(String value) {
            addCriterion("cy_tagproduct >=", value, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductLessThan(String value) {
            addCriterion("cy_tagproduct <", value, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductLessThanOrEqualTo(String value) {
            addCriterion("cy_tagproduct <=", value, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductLike(String value) {
            addCriterion("cy_tagproduct like", value, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductNotLike(String value) {
            addCriterion("cy_tagproduct not like", value, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductIn(List<String> values) {
            addCriterion("cy_tagproduct in", values, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductNotIn(List<String> values) {
            addCriterion("cy_tagproduct not in", values, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductBetween(String value1, String value2) {
            addCriterion("cy_tagproduct between", value1, value2, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_tagproductNotBetween(String value1, String value2) {
            addCriterion("cy_tagproduct not between", value1, value2, "cy_tagproduct");
            return (Criteria) this;
        }

        public Criteria andCy_remarkIsNull() {
            addCriterion("cy_remark is null");
            return (Criteria) this;
        }

        public Criteria andCy_remarkIsNotNull() {
            addCriterion("cy_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCy_remarkEqualTo(String value) {
            addCriterion("cy_remark =", value, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_remarkNotEqualTo(String value) {
            addCriterion("cy_remark <>", value, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_remarkGreaterThan(String value) {
            addCriterion("cy_remark >", value, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("cy_remark >=", value, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_remarkLessThan(String value) {
            addCriterion("cy_remark <", value, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_remarkLessThanOrEqualTo(String value) {
            addCriterion("cy_remark <=", value, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_remarkLike(String value) {
            addCriterion("cy_remark like", value, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_remarkNotLike(String value) {
            addCriterion("cy_remark not like", value, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_remarkIn(List<String> values) {
            addCriterion("cy_remark in", values, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_remarkNotIn(List<String> values) {
            addCriterion("cy_remark not in", values, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_remarkBetween(String value1, String value2) {
            addCriterion("cy_remark between", value1, value2, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_remarkNotBetween(String value1, String value2) {
            addCriterion("cy_remark not between", value1, value2, "cy_remark");
            return (Criteria) this;
        }

        public Criteria andCy_userid1IsNull() {
            addCriterion("cy_userid1 is null");
            return (Criteria) this;
        }

        public Criteria andCy_userid1IsNotNull() {
            addCriterion("cy_userid1 is not null");
            return (Criteria) this;
        }

        public Criteria andCy_userid1EqualTo(Long value) {
            addCriterion("cy_userid1 =", value, "cy_userid1");
            return (Criteria) this;
        }

        public Criteria andCy_userid1NotEqualTo(Long value) {
            addCriterion("cy_userid1 <>", value, "cy_userid1");
            return (Criteria) this;
        }

        public Criteria andCy_userid1GreaterThan(Long value) {
            addCriterion("cy_userid1 >", value, "cy_userid1");
            return (Criteria) this;
        }

        public Criteria andCy_userid1GreaterThanOrEqualTo(Long value) {
            addCriterion("cy_userid1 >=", value, "cy_userid1");
            return (Criteria) this;
        }

        public Criteria andCy_userid1LessThan(Long value) {
            addCriterion("cy_userid1 <", value, "cy_userid1");
            return (Criteria) this;
        }

        public Criteria andCy_userid1LessThanOrEqualTo(Long value) {
            addCriterion("cy_userid1 <=", value, "cy_userid1");
            return (Criteria) this;
        }

        public Criteria andCy_userid1In(List<Long> values) {
            addCriterion("cy_userid1 in", values, "cy_userid1");
            return (Criteria) this;
        }

        public Criteria andCy_userid1NotIn(List<Long> values) {
            addCriterion("cy_userid1 not in", values, "cy_userid1");
            return (Criteria) this;
        }

        public Criteria andCy_userid1Between(Long value1, Long value2) {
            addCriterion("cy_userid1 between", value1, value2, "cy_userid1");
            return (Criteria) this;
        }

        public Criteria andCy_userid1NotBetween(Long value1, Long value2) {
            addCriterion("cy_userid1 not between", value1, value2, "cy_userid1");
            return (Criteria) this;
        }

        public Criteria andCy_createdateIsNull() {
            addCriterion("cy_createdate is null");
            return (Criteria) this;
        }

        public Criteria andCy_createdateIsNotNull() {
            addCriterion("cy_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCy_createdateEqualTo(Date value) {
            addCriterion("cy_createdate =", value, "cy_createdate");
            return (Criteria) this;
        }

        public Criteria andCy_createdateNotEqualTo(Date value) {
            addCriterion("cy_createdate <>", value, "cy_createdate");
            return (Criteria) this;
        }

        public Criteria andCy_createdateGreaterThan(Date value) {
            addCriterion("cy_createdate >", value, "cy_createdate");
            return (Criteria) this;
        }

        public Criteria andCy_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_createdate >=", value, "cy_createdate");
            return (Criteria) this;
        }

        public Criteria andCy_createdateLessThan(Date value) {
            addCriterion("cy_createdate <", value, "cy_createdate");
            return (Criteria) this;
        }

        public Criteria andCy_createdateLessThanOrEqualTo(Date value) {
            addCriterion("cy_createdate <=", value, "cy_createdate");
            return (Criteria) this;
        }

        public Criteria andCy_createdateIn(List<Date> values) {
            addCriterion("cy_createdate in", values, "cy_createdate");
            return (Criteria) this;
        }

        public Criteria andCy_createdateNotIn(List<Date> values) {
            addCriterion("cy_createdate not in", values, "cy_createdate");
            return (Criteria) this;
        }

        public Criteria andCy_createdateBetween(Date value1, Date value2) {
            addCriterion("cy_createdate between", value1, value2, "cy_createdate");
            return (Criteria) this;
        }

        public Criteria andCy_createdateNotBetween(Date value1, Date value2) {
            addCriterion("cy_createdate not between", value1, value2, "cy_createdate");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateIsNull() {
            addCriterion("cy_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateIsNotNull() {
            addCriterion("cy_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateEqualTo(Date value) {
            addCriterion("cy_updatedate =", value, "cy_updatedate");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateNotEqualTo(Date value) {
            addCriterion("cy_updatedate <>", value, "cy_updatedate");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateGreaterThan(Date value) {
            addCriterion("cy_updatedate >", value, "cy_updatedate");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("cy_updatedate >=", value, "cy_updatedate");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateLessThan(Date value) {
            addCriterion("cy_updatedate <", value, "cy_updatedate");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("cy_updatedate <=", value, "cy_updatedate");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateIn(List<Date> values) {
            addCriterion("cy_updatedate in", values, "cy_updatedate");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateNotIn(List<Date> values) {
            addCriterion("cy_updatedate not in", values, "cy_updatedate");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateBetween(Date value1, Date value2) {
            addCriterion("cy_updatedate between", value1, value2, "cy_updatedate");
            return (Criteria) this;
        }

        public Criteria andCy_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("cy_updatedate not between", value1, value2, "cy_updatedate");
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