package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Base_Company_UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Base_Company_UserExample() {
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

        public Criteria andBcu_idIsNull() {
            addCriterion("bcu_id is null");
            return (Criteria) this;
        }

        public Criteria andBcu_idIsNotNull() {
            addCriterion("bcu_id is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_idEqualTo(Long value) {
            addCriterion("bcu_id =", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idNotEqualTo(Long value) {
            addCriterion("bcu_id <>", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idGreaterThan(Long value) {
            addCriterion("bcu_id >", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idGreaterThanOrEqualTo(Long value) {
            addCriterion("bcu_id >=", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idLessThan(Long value) {
            addCriterion("bcu_id <", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idLessThanOrEqualTo(Long value) {
            addCriterion("bcu_id <=", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idIn(List<Long> values) {
            addCriterion("bcu_id in", values, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idNotIn(List<Long> values) {
            addCriterion("bcu_id not in", values, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idBetween(Long value1, Long value2) {
            addCriterion("bcu_id between", value1, value2, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idNotBetween(Long value1, Long value2) {
            addCriterion("bcu_id not between", value1, value2, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_useridIsNull() {
            addCriterion("bcu_userid is null");
            return (Criteria) this;
        }

        public Criteria andBcu_useridIsNotNull() {
            addCriterion("bcu_userid is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_useridEqualTo(Long value) {
            addCriterion("bcu_userid =", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridNotEqualTo(Long value) {
            addCriterion("bcu_userid <>", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridGreaterThan(Long value) {
            addCriterion("bcu_userid >", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("bcu_userid >=", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridLessThan(Long value) {
            addCriterion("bcu_userid <", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridLessThanOrEqualTo(Long value) {
            addCriterion("bcu_userid <=", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridIn(List<Long> values) {
            addCriterion("bcu_userid in", values, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridNotIn(List<Long> values) {
            addCriterion("bcu_userid not in", values, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridBetween(Long value1, Long value2) {
            addCriterion("bcu_userid between", value1, value2, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridNotBetween(Long value1, Long value2) {
            addCriterion("bcu_userid not between", value1, value2, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_typeIsNull() {
            addCriterion("bcu_type is null");
            return (Criteria) this;
        }

        public Criteria andBcu_typeIsNotNull() {
            addCriterion("bcu_type is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_typeEqualTo(Byte value) {
            addCriterion("bcu_type =", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeNotEqualTo(Byte value) {
            addCriterion("bcu_type <>", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeGreaterThan(Byte value) {
            addCriterion("bcu_type >", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeGreaterThanOrEqualTo(Byte value) {
            addCriterion("bcu_type >=", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeLessThan(Byte value) {
            addCriterion("bcu_type <", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeLessThanOrEqualTo(Byte value) {
            addCriterion("bcu_type <=", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeIn(List<Byte> values) {
            addCriterion("bcu_type in", values, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeNotIn(List<Byte> values) {
            addCriterion("bcu_type not in", values, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeBetween(Byte value1, Byte value2) {
            addCriterion("bcu_type between", value1, value2, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeNotBetween(Byte value1, Byte value2) {
            addCriterion("bcu_type not between", value1, value2, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridIsNull() {
            addCriterion("bcu_listuserid is null");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridIsNotNull() {
            addCriterion("bcu_listuserid is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridEqualTo(Long value) {
            addCriterion("bcu_listuserid =", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridNotEqualTo(Long value) {
            addCriterion("bcu_listuserid <>", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridGreaterThan(Long value) {
            addCriterion("bcu_listuserid >", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("bcu_listuserid >=", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridLessThan(Long value) {
            addCriterion("bcu_listuserid <", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridLessThanOrEqualTo(Long value) {
            addCriterion("bcu_listuserid <=", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridIn(List<Long> values) {
            addCriterion("bcu_listuserid in", values, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridNotIn(List<Long> values) {
            addCriterion("bcu_listuserid not in", values, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridBetween(Long value1, Long value2) {
            addCriterion("bcu_listuserid between", value1, value2, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridNotBetween(Long value1, Long value2) {
            addCriterion("bcu_listuserid not between", value1, value2, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1IsNull() {
            addCriterion("bcu_confirm1 is null");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1IsNotNull() {
            addCriterion("bcu_confirm1 is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1EqualTo(Boolean value) {
            addCriterion("bcu_confirm1 =", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1NotEqualTo(Boolean value) {
            addCriterion("bcu_confirm1 <>", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1GreaterThan(Boolean value) {
            addCriterion("bcu_confirm1 >", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("bcu_confirm1 >=", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1LessThan(Boolean value) {
            addCriterion("bcu_confirm1 <", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1LessThanOrEqualTo(Boolean value) {
            addCriterion("bcu_confirm1 <=", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1In(List<Boolean> values) {
            addCriterion("bcu_confirm1 in", values, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1NotIn(List<Boolean> values) {
            addCriterion("bcu_confirm1 not in", values, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1Between(Boolean value1, Boolean value2) {
            addCriterion("bcu_confirm1 between", value1, value2, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("bcu_confirm1 not between", value1, value2, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2IsNull() {
            addCriterion("bcu_confirm2 is null");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2IsNotNull() {
            addCriterion("bcu_confirm2 is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2EqualTo(Boolean value) {
            addCriterion("bcu_confirm2 =", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2NotEqualTo(Boolean value) {
            addCriterion("bcu_confirm2 <>", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2GreaterThan(Boolean value) {
            addCriterion("bcu_confirm2 >", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("bcu_confirm2 >=", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2LessThan(Boolean value) {
            addCriterion("bcu_confirm2 <", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2LessThanOrEqualTo(Boolean value) {
            addCriterion("bcu_confirm2 <=", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2In(List<Boolean> values) {
            addCriterion("bcu_confirm2 in", values, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2NotIn(List<Boolean> values) {
            addCriterion("bcu_confirm2 not in", values, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2Between(Boolean value1, Boolean value2) {
            addCriterion("bcu_confirm2 between", value1, value2, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("bcu_confirm2 not between", value1, value2, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateIsNull() {
            addCriterion("bcu_createdate is null");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateIsNotNull() {
            addCriterion("bcu_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateEqualTo(Date value) {
            addCriterion("bcu_createdate =", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateNotEqualTo(Date value) {
            addCriterion("bcu_createdate <>", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateGreaterThan(Date value) {
            addCriterion("bcu_createdate >", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("bcu_createdate >=", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateLessThan(Date value) {
            addCriterion("bcu_createdate <", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateLessThanOrEqualTo(Date value) {
            addCriterion("bcu_createdate <=", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateIn(List<Date> values) {
            addCriterion("bcu_createdate in", values, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateNotIn(List<Date> values) {
            addCriterion("bcu_createdate not in", values, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateBetween(Date value1, Date value2) {
            addCriterion("bcu_createdate between", value1, value2, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateNotBetween(Date value1, Date value2) {
            addCriterion("bcu_createdate not between", value1, value2, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateIsNull() {
            addCriterion("bcu_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateIsNotNull() {
            addCriterion("bcu_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateEqualTo(Date value) {
            addCriterion("bcu_updatedate =", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateNotEqualTo(Date value) {
            addCriterion("bcu_updatedate <>", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateGreaterThan(Date value) {
            addCriterion("bcu_updatedate >", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("bcu_updatedate >=", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateLessThan(Date value) {
            addCriterion("bcu_updatedate <", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("bcu_updatedate <=", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateIn(List<Date> values) {
            addCriterion("bcu_updatedate in", values, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateNotIn(List<Date> values) {
            addCriterion("bcu_updatedate not in", values, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateBetween(Date value1, Date value2) {
            addCriterion("bcu_updatedate between", value1, value2, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("bcu_updatedate not between", value1, value2, "bcu_updatedate");
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