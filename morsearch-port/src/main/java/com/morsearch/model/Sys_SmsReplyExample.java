package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sys_SmsReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_SmsReplyExample() {
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

        public Criteria andSr_idIsNull() {
            addCriterion("sr_id is null");
            return (Criteria) this;
        }

        public Criteria andSr_idIsNotNull() {
            addCriterion("sr_id is not null");
            return (Criteria) this;
        }

        public Criteria andSr_idEqualTo(Long value) {
            addCriterion("sr_id =", value, "sr_id");
            return (Criteria) this;
        }

        public Criteria andSr_idNotEqualTo(Long value) {
            addCriterion("sr_id <>", value, "sr_id");
            return (Criteria) this;
        }

        public Criteria andSr_idGreaterThan(Long value) {
            addCriterion("sr_id >", value, "sr_id");
            return (Criteria) this;
        }

        public Criteria andSr_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sr_id >=", value, "sr_id");
            return (Criteria) this;
        }

        public Criteria andSr_idLessThan(Long value) {
            addCriterion("sr_id <", value, "sr_id");
            return (Criteria) this;
        }

        public Criteria andSr_idLessThanOrEqualTo(Long value) {
            addCriterion("sr_id <=", value, "sr_id");
            return (Criteria) this;
        }

        public Criteria andSr_idIn(List<Long> values) {
            addCriterion("sr_id in", values, "sr_id");
            return (Criteria) this;
        }

        public Criteria andSr_idNotIn(List<Long> values) {
            addCriterion("sr_id not in", values, "sr_id");
            return (Criteria) this;
        }

        public Criteria andSr_idBetween(Long value1, Long value2) {
            addCriterion("sr_id between", value1, value2, "sr_id");
            return (Criteria) this;
        }

        public Criteria andSr_idNotBetween(Long value1, Long value2) {
            addCriterion("sr_id not between", value1, value2, "sr_id");
            return (Criteria) this;
        }

        public Criteria andSr_phoneIsNull() {
            addCriterion("sr_phone is null");
            return (Criteria) this;
        }

        public Criteria andSr_phoneIsNotNull() {
            addCriterion("sr_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSr_phoneEqualTo(String value) {
            addCriterion("sr_phone =", value, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_phoneNotEqualTo(String value) {
            addCriterion("sr_phone <>", value, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_phoneGreaterThan(String value) {
            addCriterion("sr_phone >", value, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("sr_phone >=", value, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_phoneLessThan(String value) {
            addCriterion("sr_phone <", value, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_phoneLessThanOrEqualTo(String value) {
            addCriterion("sr_phone <=", value, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_phoneLike(String value) {
            addCriterion("sr_phone like", value, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_phoneNotLike(String value) {
            addCriterion("sr_phone not like", value, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_phoneIn(List<String> values) {
            addCriterion("sr_phone in", values, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_phoneNotIn(List<String> values) {
            addCriterion("sr_phone not in", values, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_phoneBetween(String value1, String value2) {
            addCriterion("sr_phone between", value1, value2, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_phoneNotBetween(String value1, String value2) {
            addCriterion("sr_phone not between", value1, value2, "sr_phone");
            return (Criteria) this;
        }

        public Criteria andSr_contentIsNull() {
            addCriterion("sr_content is null");
            return (Criteria) this;
        }

        public Criteria andSr_contentIsNotNull() {
            addCriterion("sr_content is not null");
            return (Criteria) this;
        }

        public Criteria andSr_contentEqualTo(String value) {
            addCriterion("sr_content =", value, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_contentNotEqualTo(String value) {
            addCriterion("sr_content <>", value, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_contentGreaterThan(String value) {
            addCriterion("sr_content >", value, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_contentGreaterThanOrEqualTo(String value) {
            addCriterion("sr_content >=", value, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_contentLessThan(String value) {
            addCriterion("sr_content <", value, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_contentLessThanOrEqualTo(String value) {
            addCriterion("sr_content <=", value, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_contentLike(String value) {
            addCriterion("sr_content like", value, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_contentNotLike(String value) {
            addCriterion("sr_content not like", value, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_contentIn(List<String> values) {
            addCriterion("sr_content in", values, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_contentNotIn(List<String> values) {
            addCriterion("sr_content not in", values, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_contentBetween(String value1, String value2) {
            addCriterion("sr_content between", value1, value2, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_contentNotBetween(String value1, String value2) {
            addCriterion("sr_content not between", value1, value2, "sr_content");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeIsNull() {
            addCriterion("sr_sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeIsNotNull() {
            addCriterion("sr_sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeEqualTo(Date value) {
            addCriterion("sr_sendtime =", value, "sr_sendtime");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeNotEqualTo(Date value) {
            addCriterion("sr_sendtime <>", value, "sr_sendtime");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeGreaterThan(Date value) {
            addCriterion("sr_sendtime >", value, "sr_sendtime");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sr_sendtime >=", value, "sr_sendtime");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeLessThan(Date value) {
            addCriterion("sr_sendtime <", value, "sr_sendtime");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sr_sendtime <=", value, "sr_sendtime");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeIn(List<Date> values) {
            addCriterion("sr_sendtime in", values, "sr_sendtime");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeNotIn(List<Date> values) {
            addCriterion("sr_sendtime not in", values, "sr_sendtime");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeBetween(Date value1, Date value2) {
            addCriterion("sr_sendtime between", value1, value2, "sr_sendtime");
            return (Criteria) this;
        }

        public Criteria andSr_sendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sr_sendtime not between", value1, value2, "sr_sendtime");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeIsNull() {
            addCriterion("sr_processtime is null");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeIsNotNull() {
            addCriterion("sr_processtime is not null");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeEqualTo(Date value) {
            addCriterion("sr_processtime =", value, "sr_processtime");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeNotEqualTo(Date value) {
            addCriterion("sr_processtime <>", value, "sr_processtime");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeGreaterThan(Date value) {
            addCriterion("sr_processtime >", value, "sr_processtime");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sr_processtime >=", value, "sr_processtime");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeLessThan(Date value) {
            addCriterion("sr_processtime <", value, "sr_processtime");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeLessThanOrEqualTo(Date value) {
            addCriterion("sr_processtime <=", value, "sr_processtime");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeIn(List<Date> values) {
            addCriterion("sr_processtime in", values, "sr_processtime");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeNotIn(List<Date> values) {
            addCriterion("sr_processtime not in", values, "sr_processtime");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeBetween(Date value1, Date value2) {
            addCriterion("sr_processtime between", value1, value2, "sr_processtime");
            return (Criteria) this;
        }

        public Criteria andSr_processtimeNotBetween(Date value1, Date value2) {
            addCriterion("sr_processtime not between", value1, value2, "sr_processtime");
            return (Criteria) this;
        }

        public Criteria andSr_remarkIsNull() {
            addCriterion("sr_remark is null");
            return (Criteria) this;
        }

        public Criteria andSr_remarkIsNotNull() {
            addCriterion("sr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSr_remarkEqualTo(String value) {
            addCriterion("sr_remark =", value, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_remarkNotEqualTo(String value) {
            addCriterion("sr_remark <>", value, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_remarkGreaterThan(String value) {
            addCriterion("sr_remark >", value, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("sr_remark >=", value, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_remarkLessThan(String value) {
            addCriterion("sr_remark <", value, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_remarkLessThanOrEqualTo(String value) {
            addCriterion("sr_remark <=", value, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_remarkLike(String value) {
            addCriterion("sr_remark like", value, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_remarkNotLike(String value) {
            addCriterion("sr_remark not like", value, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_remarkIn(List<String> values) {
            addCriterion("sr_remark in", values, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_remarkNotIn(List<String> values) {
            addCriterion("sr_remark not in", values, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_remarkBetween(String value1, String value2) {
            addCriterion("sr_remark between", value1, value2, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_remarkNotBetween(String value1, String value2) {
            addCriterion("sr_remark not between", value1, value2, "sr_remark");
            return (Criteria) this;
        }

        public Criteria andSr_statusIsNull() {
            addCriterion("sr_status is null");
            return (Criteria) this;
        }

        public Criteria andSr_statusIsNotNull() {
            addCriterion("sr_status is not null");
            return (Criteria) this;
        }

        public Criteria andSr_statusEqualTo(Byte value) {
            addCriterion("sr_status =", value, "sr_status");
            return (Criteria) this;
        }

        public Criteria andSr_statusNotEqualTo(Byte value) {
            addCriterion("sr_status <>", value, "sr_status");
            return (Criteria) this;
        }

        public Criteria andSr_statusGreaterThan(Byte value) {
            addCriterion("sr_status >", value, "sr_status");
            return (Criteria) this;
        }

        public Criteria andSr_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sr_status >=", value, "sr_status");
            return (Criteria) this;
        }

        public Criteria andSr_statusLessThan(Byte value) {
            addCriterion("sr_status <", value, "sr_status");
            return (Criteria) this;
        }

        public Criteria andSr_statusLessThanOrEqualTo(Byte value) {
            addCriterion("sr_status <=", value, "sr_status");
            return (Criteria) this;
        }

        public Criteria andSr_statusIn(List<Byte> values) {
            addCriterion("sr_status in", values, "sr_status");
            return (Criteria) this;
        }

        public Criteria andSr_statusNotIn(List<Byte> values) {
            addCriterion("sr_status not in", values, "sr_status");
            return (Criteria) this;
        }

        public Criteria andSr_statusBetween(Byte value1, Byte value2) {
            addCriterion("sr_status between", value1, value2, "sr_status");
            return (Criteria) this;
        }

        public Criteria andSr_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("sr_status not between", value1, value2, "sr_status");
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