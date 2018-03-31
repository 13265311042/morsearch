package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AwardV_Recharge_CountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AwardV_Recharge_CountExample() {
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

        public Criteria andSc_amountIsNull() {
            addCriterion("sc_amount is null");
            return (Criteria) this;
        }

        public Criteria andSc_amountIsNotNull() {
            addCriterion("sc_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSc_amountEqualTo(Integer value) {
            addCriterion("sc_amount =", value, "sc_amount");
            return (Criteria) this;
        }

        public Criteria andSc_amountNotEqualTo(Integer value) {
            addCriterion("sc_amount <>", value, "sc_amount");
            return (Criteria) this;
        }

        public Criteria andSc_amountGreaterThan(Integer value) {
            addCriterion("sc_amount >", value, "sc_amount");
            return (Criteria) this;
        }

        public Criteria andSc_amountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_amount >=", value, "sc_amount");
            return (Criteria) this;
        }

        public Criteria andSc_amountLessThan(Integer value) {
            addCriterion("sc_amount <", value, "sc_amount");
            return (Criteria) this;
        }

        public Criteria andSc_amountLessThanOrEqualTo(Integer value) {
            addCriterion("sc_amount <=", value, "sc_amount");
            return (Criteria) this;
        }

        public Criteria andSc_amountIn(List<Integer> values) {
            addCriterion("sc_amount in", values, "sc_amount");
            return (Criteria) this;
        }

        public Criteria andSc_amountNotIn(List<Integer> values) {
            addCriterion("sc_amount not in", values, "sc_amount");
            return (Criteria) this;
        }

        public Criteria andSc_amountBetween(Integer value1, Integer value2) {
            addCriterion("sc_amount between", value1, value2, "sc_amount");
            return (Criteria) this;
        }

        public Criteria andSc_amountNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_amount not between", value1, value2, "sc_amount");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralIsNull() {
            addCriterion("sc_addintegral is null");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralIsNotNull() {
            addCriterion("sc_addintegral is not null");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralEqualTo(Integer value) {
            addCriterion("sc_addintegral =", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralNotEqualTo(Integer value) {
            addCriterion("sc_addintegral <>", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralGreaterThan(Integer value) {
            addCriterion("sc_addintegral >", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_addintegral >=", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralLessThan(Integer value) {
            addCriterion("sc_addintegral <", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralLessThanOrEqualTo(Integer value) {
            addCriterion("sc_addintegral <=", value, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralIn(List<Integer> values) {
            addCriterion("sc_addintegral in", values, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralNotIn(List<Integer> values) {
            addCriterion("sc_addintegral not in", values, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralBetween(Integer value1, Integer value2) {
            addCriterion("sc_addintegral between", value1, value2, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_addintegral not between", value1, value2, "sc_addintegral");
            return (Criteria) this;
        }

        public Criteria andSc_addamountIsNull() {
            addCriterion("sc_addamount is null");
            return (Criteria) this;
        }

        public Criteria andSc_addamountIsNotNull() {
            addCriterion("sc_addamount is not null");
            return (Criteria) this;
        }

        public Criteria andSc_addamountEqualTo(Integer value) {
            addCriterion("sc_addamount =", value, "sc_addamount");
            return (Criteria) this;
        }

        public Criteria andSc_addamountNotEqualTo(Integer value) {
            addCriterion("sc_addamount <>", value, "sc_addamount");
            return (Criteria) this;
        }

        public Criteria andSc_addamountGreaterThan(Integer value) {
            addCriterion("sc_addamount >", value, "sc_addamount");
            return (Criteria) this;
        }

        public Criteria andSc_addamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_addamount >=", value, "sc_addamount");
            return (Criteria) this;
        }

        public Criteria andSc_addamountLessThan(Integer value) {
            addCriterion("sc_addamount <", value, "sc_addamount");
            return (Criteria) this;
        }

        public Criteria andSc_addamountLessThanOrEqualTo(Integer value) {
            addCriterion("sc_addamount <=", value, "sc_addamount");
            return (Criteria) this;
        }

        public Criteria andSc_addamountIn(List<Integer> values) {
            addCriterion("sc_addamount in", values, "sc_addamount");
            return (Criteria) this;
        }

        public Criteria andSc_addamountNotIn(List<Integer> values) {
            addCriterion("sc_addamount not in", values, "sc_addamount");
            return (Criteria) this;
        }

        public Criteria andSc_addamountBetween(Integer value1, Integer value2) {
            addCriterion("sc_addamount between", value1, value2, "sc_addamount");
            return (Criteria) this;
        }

        public Criteria andSc_addamountNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_addamount not between", value1, value2, "sc_addamount");
            return (Criteria) this;
        }

        public Criteria andSc_useridIsNull() {
            addCriterion("sc_userid is null");
            return (Criteria) this;
        }

        public Criteria andSc_useridIsNotNull() {
            addCriterion("sc_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSc_useridEqualTo(Long value) {
            addCriterion("sc_userid =", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridNotEqualTo(Long value) {
            addCriterion("sc_userid <>", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridGreaterThan(Long value) {
            addCriterion("sc_userid >", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_userid >=", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridLessThan(Long value) {
            addCriterion("sc_userid <", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridLessThanOrEqualTo(Long value) {
            addCriterion("sc_userid <=", value, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridIn(List<Long> values) {
            addCriterion("sc_userid in", values, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridNotIn(List<Long> values) {
            addCriterion("sc_userid not in", values, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridBetween(Long value1, Long value2) {
            addCriterion("sc_userid between", value1, value2, "sc_userid");
            return (Criteria) this;
        }

        public Criteria andSc_useridNotBetween(Long value1, Long value2) {
            addCriterion("sc_userid not between", value1, value2, "sc_userid");
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userphone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userphone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userphone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userphone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userphone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userphone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userphone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userphone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userphone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userphone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userphone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userphone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userphone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userphone not between", value1, value2, "userphone");
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