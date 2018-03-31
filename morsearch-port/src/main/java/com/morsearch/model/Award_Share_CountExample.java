package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Award_Share_CountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Award_Share_CountExample() {
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

        public Criteria andSc_idIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andSc_idIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSc_idEqualTo(Long value) {
            addCriterion("sc_id =", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotEqualTo(Long value) {
            addCriterion("sc_id <>", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idGreaterThan(Long value) {
            addCriterion("sc_id >", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_id >=", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idLessThan(Long value) {
            addCriterion("sc_id <", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idLessThanOrEqualTo(Long value) {
            addCriterion("sc_id <=", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idIn(List<Long> values) {
            addCriterion("sc_id in", values, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotIn(List<Long> values) {
            addCriterion("sc_id not in", values, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idBetween(Long value1, Long value2) {
            addCriterion("sc_id between", value1, value2, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotBetween(Long value1, Long value2) {
            addCriterion("sc_id not between", value1, value2, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_activityidIsNull() {
            addCriterion("sc_activityid is null");
            return (Criteria) this;
        }

        public Criteria andSc_activityidIsNotNull() {
            addCriterion("sc_activityid is not null");
            return (Criteria) this;
        }

        public Criteria andSc_activityidEqualTo(Long value) {
            addCriterion("sc_activityid =", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidNotEqualTo(Long value) {
            addCriterion("sc_activityid <>", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidGreaterThan(Long value) {
            addCriterion("sc_activityid >", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_activityid >=", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidLessThan(Long value) {
            addCriterion("sc_activityid <", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidLessThanOrEqualTo(Long value) {
            addCriterion("sc_activityid <=", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidIn(List<Long> values) {
            addCriterion("sc_activityid in", values, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidNotIn(List<Long> values) {
            addCriterion("sc_activityid not in", values, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidBetween(Long value1, Long value2) {
            addCriterion("sc_activityid between", value1, value2, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidNotBetween(Long value1, Long value2) {
            addCriterion("sc_activityid not between", value1, value2, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridIsNull() {
            addCriterion("sc_share_userid is null");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridIsNotNull() {
            addCriterion("sc_share_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridEqualTo(Long value) {
            addCriterion("sc_share_userid =", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridNotEqualTo(Long value) {
            addCriterion("sc_share_userid <>", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridGreaterThan(Long value) {
            addCriterion("sc_share_userid >", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_share_userid >=", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridLessThan(Long value) {
            addCriterion("sc_share_userid <", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridLessThanOrEqualTo(Long value) {
            addCriterion("sc_share_userid <=", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridIn(List<Long> values) {
            addCriterion("sc_share_userid in", values, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridNotIn(List<Long> values) {
            addCriterion("sc_share_userid not in", values, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridBetween(Long value1, Long value2) {
            addCriterion("sc_share_userid between", value1, value2, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridNotBetween(Long value1, Long value2) {
            addCriterion("sc_share_userid not between", value1, value2, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardIsNull() {
            addCriterion("sc_share_award is null");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardIsNotNull() {
            addCriterion("sc_share_award is not null");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardEqualTo(Integer value) {
            addCriterion("sc_share_award =", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardNotEqualTo(Integer value) {
            addCriterion("sc_share_award <>", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardGreaterThan(Integer value) {
            addCriterion("sc_share_award >", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_share_award >=", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardLessThan(Integer value) {
            addCriterion("sc_share_award <", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardLessThanOrEqualTo(Integer value) {
            addCriterion("sc_share_award <=", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardIn(List<Integer> values) {
            addCriterion("sc_share_award in", values, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardNotIn(List<Integer> values) {
            addCriterion("sc_share_award not in", values, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardBetween(Integer value1, Integer value2) {
            addCriterion("sc_share_award between", value1, value2, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_share_award not between", value1, value2, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridIsNull() {
            addCriterion("sc_receive_userid is null");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridIsNotNull() {
            addCriterion("sc_receive_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridEqualTo(Long value) {
            addCriterion("sc_receive_userid =", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridNotEqualTo(Long value) {
            addCriterion("sc_receive_userid <>", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridGreaterThan(Long value) {
            addCriterion("sc_receive_userid >", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_receive_userid >=", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridLessThan(Long value) {
            addCriterion("sc_receive_userid <", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridLessThanOrEqualTo(Long value) {
            addCriterion("sc_receive_userid <=", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridIn(List<Long> values) {
            addCriterion("sc_receive_userid in", values, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridNotIn(List<Long> values) {
            addCriterion("sc_receive_userid not in", values, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridBetween(Long value1, Long value2) {
            addCriterion("sc_receive_userid between", value1, value2, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridNotBetween(Long value1, Long value2) {
            addCriterion("sc_receive_userid not between", value1, value2, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardIsNull() {
            addCriterion("sc_receive_award is null");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardIsNotNull() {
            addCriterion("sc_receive_award is not null");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardEqualTo(Integer value) {
            addCriterion("sc_receive_award =", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardNotEqualTo(Integer value) {
            addCriterion("sc_receive_award <>", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardGreaterThan(Integer value) {
            addCriterion("sc_receive_award >", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_receive_award >=", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardLessThan(Integer value) {
            addCriterion("sc_receive_award <", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardLessThanOrEqualTo(Integer value) {
            addCriterion("sc_receive_award <=", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardIn(List<Integer> values) {
            addCriterion("sc_receive_award in", values, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardNotIn(List<Integer> values) {
            addCriterion("sc_receive_award not in", values, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardBetween(Integer value1, Integer value2) {
            addCriterion("sc_receive_award between", value1, value2, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_receive_award not between", value1, value2, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_createdateIsNull() {
            addCriterion("sc_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSc_createdateIsNotNull() {
            addCriterion("sc_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSc_createdateEqualTo(Date value) {
            addCriterion("sc_createdate =", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateNotEqualTo(Date value) {
            addCriterion("sc_createdate <>", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateGreaterThan(Date value) {
            addCriterion("sc_createdate >", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sc_createdate >=", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateLessThan(Date value) {
            addCriterion("sc_createdate <", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateLessThanOrEqualTo(Date value) {
            addCriterion("sc_createdate <=", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateIn(List<Date> values) {
            addCriterion("sc_createdate in", values, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateNotIn(List<Date> values) {
            addCriterion("sc_createdate not in", values, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateBetween(Date value1, Date value2) {
            addCriterion("sc_createdate between", value1, value2, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateNotBetween(Date value1, Date value2) {
            addCriterion("sc_createdate not between", value1, value2, "sc_createdate");
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