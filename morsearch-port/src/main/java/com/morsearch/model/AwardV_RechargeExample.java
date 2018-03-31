package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class AwardV_RechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AwardV_RechargeExample() {
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

        public Criteria andBa_idIsNull() {
            addCriterion("ba_id is null");
            return (Criteria) this;
        }

        public Criteria andBa_idIsNotNull() {
            addCriterion("ba_id is not null");
            return (Criteria) this;
        }

        public Criteria andBa_idEqualTo(Long value) {
            addCriterion("ba_id =", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idNotEqualTo(Long value) {
            addCriterion("ba_id <>", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idGreaterThan(Long value) {
            addCriterion("ba_id >", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ba_id >=", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idLessThan(Long value) {
            addCriterion("ba_id <", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idLessThanOrEqualTo(Long value) {
            addCriterion("ba_id <=", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idIn(List<Long> values) {
            addCriterion("ba_id in", values, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idNotIn(List<Long> values) {
            addCriterion("ba_id not in", values, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idBetween(Long value1, Long value2) {
            addCriterion("ba_id between", value1, value2, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idNotBetween(Long value1, Long value2) {
            addCriterion("ba_id not between", value1, value2, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_nameIsNull() {
            addCriterion("ba_name is null");
            return (Criteria) this;
        }

        public Criteria andBa_nameIsNotNull() {
            addCriterion("ba_name is not null");
            return (Criteria) this;
        }

        public Criteria andBa_nameEqualTo(String value) {
            addCriterion("ba_name =", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameNotEqualTo(String value) {
            addCriterion("ba_name <>", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameGreaterThan(String value) {
            addCriterion("ba_name >", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameGreaterThanOrEqualTo(String value) {
            addCriterion("ba_name >=", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameLessThan(String value) {
            addCriterion("ba_name <", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameLessThanOrEqualTo(String value) {
            addCriterion("ba_name <=", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameLike(String value) {
            addCriterion("ba_name like", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameNotLike(String value) {
            addCriterion("ba_name not like", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameIn(List<String> values) {
            addCriterion("ba_name in", values, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameNotIn(List<String> values) {
            addCriterion("ba_name not in", values, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameBetween(String value1, String value2) {
            addCriterion("ba_name between", value1, value2, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameNotBetween(String value1, String value2) {
            addCriterion("ba_name not between", value1, value2, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginIsNull() {
            addCriterion("ba_datebegin is null");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginIsNotNull() {
            addCriterion("ba_datebegin is not null");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginEqualTo(String value) {
            addCriterion("ba_datebegin =", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginNotEqualTo(String value) {
            addCriterion("ba_datebegin <>", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginGreaterThan(String value) {
            addCriterion("ba_datebegin >", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginGreaterThanOrEqualTo(String value) {
            addCriterion("ba_datebegin >=", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginLessThan(String value) {
            addCriterion("ba_datebegin <", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginLessThanOrEqualTo(String value) {
            addCriterion("ba_datebegin <=", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginLike(String value) {
            addCriterion("ba_datebegin like", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginNotLike(String value) {
            addCriterion("ba_datebegin not like", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginIn(List<String> values) {
            addCriterion("ba_datebegin in", values, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginNotIn(List<String> values) {
            addCriterion("ba_datebegin not in", values, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginBetween(String value1, String value2) {
            addCriterion("ba_datebegin between", value1, value2, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginNotBetween(String value1, String value2) {
            addCriterion("ba_datebegin not between", value1, value2, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_dateendIsNull() {
            addCriterion("ba_dateend is null");
            return (Criteria) this;
        }

        public Criteria andBa_dateendIsNotNull() {
            addCriterion("ba_dateend is not null");
            return (Criteria) this;
        }

        public Criteria andBa_dateendEqualTo(String value) {
            addCriterion("ba_dateend =", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendNotEqualTo(String value) {
            addCriterion("ba_dateend <>", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendGreaterThan(String value) {
            addCriterion("ba_dateend >", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendGreaterThanOrEqualTo(String value) {
            addCriterion("ba_dateend >=", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendLessThan(String value) {
            addCriterion("ba_dateend <", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendLessThanOrEqualTo(String value) {
            addCriterion("ba_dateend <=", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendLike(String value) {
            addCriterion("ba_dateend like", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendNotLike(String value) {
            addCriterion("ba_dateend not like", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendIn(List<String> values) {
            addCriterion("ba_dateend in", values, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendNotIn(List<String> values) {
            addCriterion("ba_dateend not in", values, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendBetween(String value1, String value2) {
            addCriterion("ba_dateend between", value1, value2, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendNotBetween(String value1, String value2) {
            addCriterion("ba_dateend not between", value1, value2, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_createidIsNull() {
            addCriterion("ba_createid is null");
            return (Criteria) this;
        }

        public Criteria andBa_createidIsNotNull() {
            addCriterion("ba_createid is not null");
            return (Criteria) this;
        }

        public Criteria andBa_createidEqualTo(Long value) {
            addCriterion("ba_createid =", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidNotEqualTo(Long value) {
            addCriterion("ba_createid <>", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidGreaterThan(Long value) {
            addCriterion("ba_createid >", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("ba_createid >=", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidLessThan(Long value) {
            addCriterion("ba_createid <", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidLessThanOrEqualTo(Long value) {
            addCriterion("ba_createid <=", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidIn(List<Long> values) {
            addCriterion("ba_createid in", values, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidNotIn(List<Long> values) {
            addCriterion("ba_createid not in", values, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidBetween(Long value1, Long value2) {
            addCriterion("ba_createid between", value1, value2, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidNotBetween(Long value1, Long value2) {
            addCriterion("ba_createid not between", value1, value2, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_statusIsNull() {
            addCriterion("ba_status is null");
            return (Criteria) this;
        }

        public Criteria andBa_statusIsNotNull() {
            addCriterion("ba_status is not null");
            return (Criteria) this;
        }

        public Criteria andBa_statusEqualTo(Byte value) {
            addCriterion("ba_status =", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusNotEqualTo(Byte value) {
            addCriterion("ba_status <>", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusGreaterThan(Byte value) {
            addCriterion("ba_status >", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ba_status >=", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusLessThan(Byte value) {
            addCriterion("ba_status <", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusLessThanOrEqualTo(Byte value) {
            addCriterion("ba_status <=", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusIn(List<Byte> values) {
            addCriterion("ba_status in", values, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusNotIn(List<Byte> values) {
            addCriterion("ba_status not in", values, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusBetween(Byte value1, Byte value2) {
            addCriterion("ba_status between", value1, value2, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("ba_status not between", value1, value2, "ba_status");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNull() {
            addCriterion("statusname is null");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNotNull() {
            addCriterion("statusname is not null");
            return (Criteria) this;
        }

        public Criteria andStatusnameEqualTo(String value) {
            addCriterion("statusname =", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotEqualTo(String value) {
            addCriterion("statusname <>", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThan(String value) {
            addCriterion("statusname >", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThanOrEqualTo(String value) {
            addCriterion("statusname >=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThan(String value) {
            addCriterion("statusname <", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThanOrEqualTo(String value) {
            addCriterion("statusname <=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLike(String value) {
            addCriterion("statusname like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotLike(String value) {
            addCriterion("statusname not like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameIn(List<String> values) {
            addCriterion("statusname in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotIn(List<String> values) {
            addCriterion("statusname not in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameBetween(String value1, String value2) {
            addCriterion("statusname between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotBetween(String value1, String value2) {
            addCriterion("statusname not between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andActivitynameIsNull() {
            addCriterion("activityname is null");
            return (Criteria) this;
        }

        public Criteria andActivitynameIsNotNull() {
            addCriterion("activityname is not null");
            return (Criteria) this;
        }

        public Criteria andActivitynameEqualTo(String value) {
            addCriterion("activityname =", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotEqualTo(String value) {
            addCriterion("activityname <>", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThan(String value) {
            addCriterion("activityname >", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThanOrEqualTo(String value) {
            addCriterion("activityname >=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThan(String value) {
            addCriterion("activityname <", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThanOrEqualTo(String value) {
            addCriterion("activityname <=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLike(String value) {
            addCriterion("activityname like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotLike(String value) {
            addCriterion("activityname not like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameIn(List<String> values) {
            addCriterion("activityname in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotIn(List<String> values) {
            addCriterion("activityname not in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameBetween(String value1, String value2) {
            addCriterion("activityname between", value1, value2, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotBetween(String value1, String value2) {
            addCriterion("activityname not between", value1, value2, "activityname");
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