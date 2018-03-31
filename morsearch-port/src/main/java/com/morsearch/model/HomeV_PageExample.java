package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HomeV_PageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeV_PageExample() {
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

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andUserqtyIsNull() {
            addCriterion("userqty is null");
            return (Criteria) this;
        }

        public Criteria andUserqtyIsNotNull() {
            addCriterion("userqty is not null");
            return (Criteria) this;
        }

        public Criteria andUserqtyEqualTo(Long value) {
            addCriterion("userqty =", value, "userqty");
            return (Criteria) this;
        }

        public Criteria andUserqtyNotEqualTo(Long value) {
            addCriterion("userqty <>", value, "userqty");
            return (Criteria) this;
        }

        public Criteria andUserqtyGreaterThan(Long value) {
            addCriterion("userqty >", value, "userqty");
            return (Criteria) this;
        }

        public Criteria andUserqtyGreaterThanOrEqualTo(Long value) {
            addCriterion("userqty >=", value, "userqty");
            return (Criteria) this;
        }

        public Criteria andUserqtyLessThan(Long value) {
            addCriterion("userqty <", value, "userqty");
            return (Criteria) this;
        }

        public Criteria andUserqtyLessThanOrEqualTo(Long value) {
            addCriterion("userqty <=", value, "userqty");
            return (Criteria) this;
        }

        public Criteria andUserqtyIn(List<Long> values) {
            addCriterion("userqty in", values, "userqty");
            return (Criteria) this;
        }

        public Criteria andUserqtyNotIn(List<Long> values) {
            addCriterion("userqty not in", values, "userqty");
            return (Criteria) this;
        }

        public Criteria andUserqtyBetween(Long value1, Long value2) {
            addCriterion("userqty between", value1, value2, "userqty");
            return (Criteria) this;
        }

        public Criteria andUserqtyNotBetween(Long value1, Long value2) {
            addCriterion("userqty not between", value1, value2, "userqty");
            return (Criteria) this;
        }

        public Criteria andCountneedIsNull() {
            addCriterion("countneed is null");
            return (Criteria) this;
        }

        public Criteria andCountneedIsNotNull() {
            addCriterion("countneed is not null");
            return (Criteria) this;
        }

        public Criteria andCountneedEqualTo(BigDecimal value) {
            addCriterion("countneed =", value, "countneed");
            return (Criteria) this;
        }

        public Criteria andCountneedNotEqualTo(BigDecimal value) {
            addCriterion("countneed <>", value, "countneed");
            return (Criteria) this;
        }

        public Criteria andCountneedGreaterThan(BigDecimal value) {
            addCriterion("countneed >", value, "countneed");
            return (Criteria) this;
        }

        public Criteria andCountneedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("countneed >=", value, "countneed");
            return (Criteria) this;
        }

        public Criteria andCountneedLessThan(BigDecimal value) {
            addCriterion("countneed <", value, "countneed");
            return (Criteria) this;
        }

        public Criteria andCountneedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("countneed <=", value, "countneed");
            return (Criteria) this;
        }

        public Criteria andCountneedIn(List<BigDecimal> values) {
            addCriterion("countneed in", values, "countneed");
            return (Criteria) this;
        }

        public Criteria andCountneedNotIn(List<BigDecimal> values) {
            addCriterion("countneed not in", values, "countneed");
            return (Criteria) this;
        }

        public Criteria andCountneedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("countneed between", value1, value2, "countneed");
            return (Criteria) this;
        }

        public Criteria andCountneedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("countneed not between", value1, value2, "countneed");
            return (Criteria) this;
        }

        public Criteria andCountorderIsNull() {
            addCriterion("countorder is null");
            return (Criteria) this;
        }

        public Criteria andCountorderIsNotNull() {
            addCriterion("countorder is not null");
            return (Criteria) this;
        }

        public Criteria andCountorderEqualTo(BigDecimal value) {
            addCriterion("countorder =", value, "countorder");
            return (Criteria) this;
        }

        public Criteria andCountorderNotEqualTo(BigDecimal value) {
            addCriterion("countorder <>", value, "countorder");
            return (Criteria) this;
        }

        public Criteria andCountorderGreaterThan(BigDecimal value) {
            addCriterion("countorder >", value, "countorder");
            return (Criteria) this;
        }

        public Criteria andCountorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("countorder >=", value, "countorder");
            return (Criteria) this;
        }

        public Criteria andCountorderLessThan(BigDecimal value) {
            addCriterion("countorder <", value, "countorder");
            return (Criteria) this;
        }

        public Criteria andCountorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("countorder <=", value, "countorder");
            return (Criteria) this;
        }

        public Criteria andCountorderIn(List<BigDecimal> values) {
            addCriterion("countorder in", values, "countorder");
            return (Criteria) this;
        }

        public Criteria andCountorderNotIn(List<BigDecimal> values) {
            addCriterion("countorder not in", values, "countorder");
            return (Criteria) this;
        }

        public Criteria andCountorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("countorder between", value1, value2, "countorder");
            return (Criteria) this;
        }

        public Criteria andCountorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("countorder not between", value1, value2, "countorder");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIsNull() {
            addCriterion("companyaddr is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIsNotNull() {
            addCriterion("companyaddr is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrEqualTo(String value) {
            addCriterion("companyaddr =", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotEqualTo(String value) {
            addCriterion("companyaddr <>", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrGreaterThan(String value) {
            addCriterion("companyaddr >", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("companyaddr >=", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrLessThan(String value) {
            addCriterion("companyaddr <", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrLessThanOrEqualTo(String value) {
            addCriterion("companyaddr <=", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrLike(String value) {
            addCriterion("companyaddr like", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotLike(String value) {
            addCriterion("companyaddr not like", value, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIn(List<String> values) {
            addCriterion("companyaddr in", values, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotIn(List<String> values) {
            addCriterion("companyaddr not in", values, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrBetween(String value1, String value2) {
            addCriterion("companyaddr between", value1, value2, "companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotBetween(String value1, String value2) {
            addCriterion("companyaddr not between", value1, value2, "companyaddr");
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