package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sales_LookMeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sales_LookMeExample() {
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

        public Criteria andSl_idIsNull() {
            addCriterion("sl_id is null");
            return (Criteria) this;
        }

        public Criteria andSl_idIsNotNull() {
            addCriterion("sl_id is not null");
            return (Criteria) this;
        }

        public Criteria andSl_idEqualTo(Long value) {
            addCriterion("sl_id =", value, "sl_id");
            return (Criteria) this;
        }

        public Criteria andSl_idNotEqualTo(Long value) {
            addCriterion("sl_id <>", value, "sl_id");
            return (Criteria) this;
        }

        public Criteria andSl_idGreaterThan(Long value) {
            addCriterion("sl_id >", value, "sl_id");
            return (Criteria) this;
        }

        public Criteria andSl_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sl_id >=", value, "sl_id");
            return (Criteria) this;
        }

        public Criteria andSl_idLessThan(Long value) {
            addCriterion("sl_id <", value, "sl_id");
            return (Criteria) this;
        }

        public Criteria andSl_idLessThanOrEqualTo(Long value) {
            addCriterion("sl_id <=", value, "sl_id");
            return (Criteria) this;
        }

        public Criteria andSl_idIn(List<Long> values) {
            addCriterion("sl_id in", values, "sl_id");
            return (Criteria) this;
        }

        public Criteria andSl_idNotIn(List<Long> values) {
            addCriterion("sl_id not in", values, "sl_id");
            return (Criteria) this;
        }

        public Criteria andSl_idBetween(Long value1, Long value2) {
            addCriterion("sl_id between", value1, value2, "sl_id");
            return (Criteria) this;
        }

        public Criteria andSl_idNotBetween(Long value1, Long value2) {
            addCriterion("sl_id not between", value1, value2, "sl_id");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidIsNull() {
            addCriterion("sl_salesmanid is null");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidIsNotNull() {
            addCriterion("sl_salesmanid is not null");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidEqualTo(Long value) {
            addCriterion("sl_salesmanid =", value, "sl_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidNotEqualTo(Long value) {
            addCriterion("sl_salesmanid <>", value, "sl_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidGreaterThan(Long value) {
            addCriterion("sl_salesmanid >", value, "sl_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidGreaterThanOrEqualTo(Long value) {
            addCriterion("sl_salesmanid >=", value, "sl_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidLessThan(Long value) {
            addCriterion("sl_salesmanid <", value, "sl_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidLessThanOrEqualTo(Long value) {
            addCriterion("sl_salesmanid <=", value, "sl_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidIn(List<Long> values) {
            addCriterion("sl_salesmanid in", values, "sl_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidNotIn(List<Long> values) {
            addCriterion("sl_salesmanid not in", values, "sl_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidBetween(Long value1, Long value2) {
            addCriterion("sl_salesmanid between", value1, value2, "sl_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSl_salesmanidNotBetween(Long value1, Long value2) {
            addCriterion("sl_salesmanid not between", value1, value2, "sl_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridIsNull() {
            addCriterion("sl_desginerid is null");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridIsNotNull() {
            addCriterion("sl_desginerid is not null");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridEqualTo(Long value) {
            addCriterion("sl_desginerid =", value, "sl_desginerid");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridNotEqualTo(Long value) {
            addCriterion("sl_desginerid <>", value, "sl_desginerid");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridGreaterThan(Long value) {
            addCriterion("sl_desginerid >", value, "sl_desginerid");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridGreaterThanOrEqualTo(Long value) {
            addCriterion("sl_desginerid >=", value, "sl_desginerid");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridLessThan(Long value) {
            addCriterion("sl_desginerid <", value, "sl_desginerid");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridLessThanOrEqualTo(Long value) {
            addCriterion("sl_desginerid <=", value, "sl_desginerid");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridIn(List<Long> values) {
            addCriterion("sl_desginerid in", values, "sl_desginerid");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridNotIn(List<Long> values) {
            addCriterion("sl_desginerid not in", values, "sl_desginerid");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridBetween(Long value1, Long value2) {
            addCriterion("sl_desginerid between", value1, value2, "sl_desginerid");
            return (Criteria) this;
        }

        public Criteria andSl_desgineridNotBetween(Long value1, Long value2) {
            addCriterion("sl_desginerid not between", value1, value2, "sl_desginerid");
            return (Criteria) this;
        }

        public Criteria andSl_createdateIsNull() {
            addCriterion("sl_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSl_createdateIsNotNull() {
            addCriterion("sl_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSl_createdateEqualTo(Date value) {
            addCriterion("sl_createdate =", value, "sl_createdate");
            return (Criteria) this;
        }

        public Criteria andSl_createdateNotEqualTo(Date value) {
            addCriterion("sl_createdate <>", value, "sl_createdate");
            return (Criteria) this;
        }

        public Criteria andSl_createdateGreaterThan(Date value) {
            addCriterion("sl_createdate >", value, "sl_createdate");
            return (Criteria) this;
        }

        public Criteria andSl_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sl_createdate >=", value, "sl_createdate");
            return (Criteria) this;
        }

        public Criteria andSl_createdateLessThan(Date value) {
            addCriterion("sl_createdate <", value, "sl_createdate");
            return (Criteria) this;
        }

        public Criteria andSl_createdateLessThanOrEqualTo(Date value) {
            addCriterion("sl_createdate <=", value, "sl_createdate");
            return (Criteria) this;
        }

        public Criteria andSl_createdateIn(List<Date> values) {
            addCriterion("sl_createdate in", values, "sl_createdate");
            return (Criteria) this;
        }

        public Criteria andSl_createdateNotIn(List<Date> values) {
            addCriterion("sl_createdate not in", values, "sl_createdate");
            return (Criteria) this;
        }

        public Criteria andSl_createdateBetween(Date value1, Date value2) {
            addCriterion("sl_createdate between", value1, value2, "sl_createdate");
            return (Criteria) this;
        }

        public Criteria andSl_createdateNotBetween(Date value1, Date value2) {
            addCriterion("sl_createdate not between", value1, value2, "sl_createdate");
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