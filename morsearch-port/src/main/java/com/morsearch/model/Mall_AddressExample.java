package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mall_AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Mall_AddressExample() {
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

        public Criteria andMa_idIsNull() {
            addCriterion("ma_id is null");
            return (Criteria) this;
        }

        public Criteria andMa_idIsNotNull() {
            addCriterion("ma_id is not null");
            return (Criteria) this;
        }

        public Criteria andMa_idEqualTo(Long value) {
            addCriterion("ma_id =", value, "ma_id");
            return (Criteria) this;
        }

        public Criteria andMa_idNotEqualTo(Long value) {
            addCriterion("ma_id <>", value, "ma_id");
            return (Criteria) this;
        }

        public Criteria andMa_idGreaterThan(Long value) {
            addCriterion("ma_id >", value, "ma_id");
            return (Criteria) this;
        }

        public Criteria andMa_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ma_id >=", value, "ma_id");
            return (Criteria) this;
        }

        public Criteria andMa_idLessThan(Long value) {
            addCriterion("ma_id <", value, "ma_id");
            return (Criteria) this;
        }

        public Criteria andMa_idLessThanOrEqualTo(Long value) {
            addCriterion("ma_id <=", value, "ma_id");
            return (Criteria) this;
        }

        public Criteria andMa_idIn(List<Long> values) {
            addCriterion("ma_id in", values, "ma_id");
            return (Criteria) this;
        }

        public Criteria andMa_idNotIn(List<Long> values) {
            addCriterion("ma_id not in", values, "ma_id");
            return (Criteria) this;
        }

        public Criteria andMa_idBetween(Long value1, Long value2) {
            addCriterion("ma_id between", value1, value2, "ma_id");
            return (Criteria) this;
        }

        public Criteria andMa_idNotBetween(Long value1, Long value2) {
            addCriterion("ma_id not between", value1, value2, "ma_id");
            return (Criteria) this;
        }

        public Criteria andMa_useridIsNull() {
            addCriterion("ma_userid is null");
            return (Criteria) this;
        }

        public Criteria andMa_useridIsNotNull() {
            addCriterion("ma_userid is not null");
            return (Criteria) this;
        }

        public Criteria andMa_useridEqualTo(Long value) {
            addCriterion("ma_userid =", value, "ma_userid");
            return (Criteria) this;
        }

        public Criteria andMa_useridNotEqualTo(Long value) {
            addCriterion("ma_userid <>", value, "ma_userid");
            return (Criteria) this;
        }

        public Criteria andMa_useridGreaterThan(Long value) {
            addCriterion("ma_userid >", value, "ma_userid");
            return (Criteria) this;
        }

        public Criteria andMa_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("ma_userid >=", value, "ma_userid");
            return (Criteria) this;
        }

        public Criteria andMa_useridLessThan(Long value) {
            addCriterion("ma_userid <", value, "ma_userid");
            return (Criteria) this;
        }

        public Criteria andMa_useridLessThanOrEqualTo(Long value) {
            addCriterion("ma_userid <=", value, "ma_userid");
            return (Criteria) this;
        }

        public Criteria andMa_useridIn(List<Long> values) {
            addCriterion("ma_userid in", values, "ma_userid");
            return (Criteria) this;
        }

        public Criteria andMa_useridNotIn(List<Long> values) {
            addCriterion("ma_userid not in", values, "ma_userid");
            return (Criteria) this;
        }

        public Criteria andMa_useridBetween(Long value1, Long value2) {
            addCriterion("ma_userid between", value1, value2, "ma_userid");
            return (Criteria) this;
        }

        public Criteria andMa_useridNotBetween(Long value1, Long value2) {
            addCriterion("ma_userid not between", value1, value2, "ma_userid");
            return (Criteria) this;
        }

        public Criteria andMa_receiverIsNull() {
            addCriterion("ma_receiver is null");
            return (Criteria) this;
        }

        public Criteria andMa_receiverIsNotNull() {
            addCriterion("ma_receiver is not null");
            return (Criteria) this;
        }

        public Criteria andMa_receiverEqualTo(String value) {
            addCriterion("ma_receiver =", value, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_receiverNotEqualTo(String value) {
            addCriterion("ma_receiver <>", value, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_receiverGreaterThan(String value) {
            addCriterion("ma_receiver >", value, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_receiverGreaterThanOrEqualTo(String value) {
            addCriterion("ma_receiver >=", value, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_receiverLessThan(String value) {
            addCriterion("ma_receiver <", value, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_receiverLessThanOrEqualTo(String value) {
            addCriterion("ma_receiver <=", value, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_receiverLike(String value) {
            addCriterion("ma_receiver like", value, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_receiverNotLike(String value) {
            addCriterion("ma_receiver not like", value, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_receiverIn(List<String> values) {
            addCriterion("ma_receiver in", values, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_receiverNotIn(List<String> values) {
            addCriterion("ma_receiver not in", values, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_receiverBetween(String value1, String value2) {
            addCriterion("ma_receiver between", value1, value2, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_receiverNotBetween(String value1, String value2) {
            addCriterion("ma_receiver not between", value1, value2, "ma_receiver");
            return (Criteria) this;
        }

        public Criteria andMa_phoneIsNull() {
            addCriterion("ma_phone is null");
            return (Criteria) this;
        }

        public Criteria andMa_phoneIsNotNull() {
            addCriterion("ma_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMa_phoneEqualTo(String value) {
            addCriterion("ma_phone =", value, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_phoneNotEqualTo(String value) {
            addCriterion("ma_phone <>", value, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_phoneGreaterThan(String value) {
            addCriterion("ma_phone >", value, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("ma_phone >=", value, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_phoneLessThan(String value) {
            addCriterion("ma_phone <", value, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_phoneLessThanOrEqualTo(String value) {
            addCriterion("ma_phone <=", value, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_phoneLike(String value) {
            addCriterion("ma_phone like", value, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_phoneNotLike(String value) {
            addCriterion("ma_phone not like", value, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_phoneIn(List<String> values) {
            addCriterion("ma_phone in", values, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_phoneNotIn(List<String> values) {
            addCriterion("ma_phone not in", values, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_phoneBetween(String value1, String value2) {
            addCriterion("ma_phone between", value1, value2, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_phoneNotBetween(String value1, String value2) {
            addCriterion("ma_phone not between", value1, value2, "ma_phone");
            return (Criteria) this;
        }

        public Criteria andMa_addareaIsNull() {
            addCriterion("ma_addarea is null");
            return (Criteria) this;
        }

        public Criteria andMa_addareaIsNotNull() {
            addCriterion("ma_addarea is not null");
            return (Criteria) this;
        }

        public Criteria andMa_addareaEqualTo(String value) {
            addCriterion("ma_addarea =", value, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_addareaNotEqualTo(String value) {
            addCriterion("ma_addarea <>", value, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_addareaGreaterThan(String value) {
            addCriterion("ma_addarea >", value, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_addareaGreaterThanOrEqualTo(String value) {
            addCriterion("ma_addarea >=", value, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_addareaLessThan(String value) {
            addCriterion("ma_addarea <", value, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_addareaLessThanOrEqualTo(String value) {
            addCriterion("ma_addarea <=", value, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_addareaLike(String value) {
            addCriterion("ma_addarea like", value, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_addareaNotLike(String value) {
            addCriterion("ma_addarea not like", value, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_addareaIn(List<String> values) {
            addCriterion("ma_addarea in", values, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_addareaNotIn(List<String> values) {
            addCriterion("ma_addarea not in", values, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_addareaBetween(String value1, String value2) {
            addCriterion("ma_addarea between", value1, value2, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_addareaNotBetween(String value1, String value2) {
            addCriterion("ma_addarea not between", value1, value2, "ma_addarea");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedIsNull() {
            addCriterion("ma_adddetailed is null");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedIsNotNull() {
            addCriterion("ma_adddetailed is not null");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedEqualTo(String value) {
            addCriterion("ma_adddetailed =", value, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedNotEqualTo(String value) {
            addCriterion("ma_adddetailed <>", value, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedGreaterThan(String value) {
            addCriterion("ma_adddetailed >", value, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedGreaterThanOrEqualTo(String value) {
            addCriterion("ma_adddetailed >=", value, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedLessThan(String value) {
            addCriterion("ma_adddetailed <", value, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedLessThanOrEqualTo(String value) {
            addCriterion("ma_adddetailed <=", value, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedLike(String value) {
            addCriterion("ma_adddetailed like", value, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedNotLike(String value) {
            addCriterion("ma_adddetailed not like", value, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedIn(List<String> values) {
            addCriterion("ma_adddetailed in", values, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedNotIn(List<String> values) {
            addCriterion("ma_adddetailed not in", values, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedBetween(String value1, String value2) {
            addCriterion("ma_adddetailed between", value1, value2, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_adddetailedNotBetween(String value1, String value2) {
            addCriterion("ma_adddetailed not between", value1, value2, "ma_adddetailed");
            return (Criteria) this;
        }

        public Criteria andMa_defaultIsNull() {
            addCriterion("ma_default is null");
            return (Criteria) this;
        }

        public Criteria andMa_defaultIsNotNull() {
            addCriterion("ma_default is not null");
            return (Criteria) this;
        }

        public Criteria andMa_defaultEqualTo(Boolean value) {
            addCriterion("ma_default =", value, "ma_default");
            return (Criteria) this;
        }

        public Criteria andMa_defaultNotEqualTo(Boolean value) {
            addCriterion("ma_default <>", value, "ma_default");
            return (Criteria) this;
        }

        public Criteria andMa_defaultGreaterThan(Boolean value) {
            addCriterion("ma_default >", value, "ma_default");
            return (Criteria) this;
        }

        public Criteria andMa_defaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ma_default >=", value, "ma_default");
            return (Criteria) this;
        }

        public Criteria andMa_defaultLessThan(Boolean value) {
            addCriterion("ma_default <", value, "ma_default");
            return (Criteria) this;
        }

        public Criteria andMa_defaultLessThanOrEqualTo(Boolean value) {
            addCriterion("ma_default <=", value, "ma_default");
            return (Criteria) this;
        }

        public Criteria andMa_defaultIn(List<Boolean> values) {
            addCriterion("ma_default in", values, "ma_default");
            return (Criteria) this;
        }

        public Criteria andMa_defaultNotIn(List<Boolean> values) {
            addCriterion("ma_default not in", values, "ma_default");
            return (Criteria) this;
        }

        public Criteria andMa_defaultBetween(Boolean value1, Boolean value2) {
            addCriterion("ma_default between", value1, value2, "ma_default");
            return (Criteria) this;
        }

        public Criteria andMa_defaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ma_default not between", value1, value2, "ma_default");
            return (Criteria) this;
        }

        public Criteria andMa_createidIsNull() {
            addCriterion("ma_createid is null");
            return (Criteria) this;
        }

        public Criteria andMa_createidIsNotNull() {
            addCriterion("ma_createid is not null");
            return (Criteria) this;
        }

        public Criteria andMa_createidEqualTo(Long value) {
            addCriterion("ma_createid =", value, "ma_createid");
            return (Criteria) this;
        }

        public Criteria andMa_createidNotEqualTo(Long value) {
            addCriterion("ma_createid <>", value, "ma_createid");
            return (Criteria) this;
        }

        public Criteria andMa_createidGreaterThan(Long value) {
            addCriterion("ma_createid >", value, "ma_createid");
            return (Criteria) this;
        }

        public Criteria andMa_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("ma_createid >=", value, "ma_createid");
            return (Criteria) this;
        }

        public Criteria andMa_createidLessThan(Long value) {
            addCriterion("ma_createid <", value, "ma_createid");
            return (Criteria) this;
        }

        public Criteria andMa_createidLessThanOrEqualTo(Long value) {
            addCriterion("ma_createid <=", value, "ma_createid");
            return (Criteria) this;
        }

        public Criteria andMa_createidIn(List<Long> values) {
            addCriterion("ma_createid in", values, "ma_createid");
            return (Criteria) this;
        }

        public Criteria andMa_createidNotIn(List<Long> values) {
            addCriterion("ma_createid not in", values, "ma_createid");
            return (Criteria) this;
        }

        public Criteria andMa_createidBetween(Long value1, Long value2) {
            addCriterion("ma_createid between", value1, value2, "ma_createid");
            return (Criteria) this;
        }

        public Criteria andMa_createidNotBetween(Long value1, Long value2) {
            addCriterion("ma_createid not between", value1, value2, "ma_createid");
            return (Criteria) this;
        }

        public Criteria andMa_createnoIsNull() {
            addCriterion("ma_createno is null");
            return (Criteria) this;
        }

        public Criteria andMa_createnoIsNotNull() {
            addCriterion("ma_createno is not null");
            return (Criteria) this;
        }

        public Criteria andMa_createnoEqualTo(String value) {
            addCriterion("ma_createno =", value, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createnoNotEqualTo(String value) {
            addCriterion("ma_createno <>", value, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createnoGreaterThan(String value) {
            addCriterion("ma_createno >", value, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("ma_createno >=", value, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createnoLessThan(String value) {
            addCriterion("ma_createno <", value, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createnoLessThanOrEqualTo(String value) {
            addCriterion("ma_createno <=", value, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createnoLike(String value) {
            addCriterion("ma_createno like", value, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createnoNotLike(String value) {
            addCriterion("ma_createno not like", value, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createnoIn(List<String> values) {
            addCriterion("ma_createno in", values, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createnoNotIn(List<String> values) {
            addCriterion("ma_createno not in", values, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createnoBetween(String value1, String value2) {
            addCriterion("ma_createno between", value1, value2, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createnoNotBetween(String value1, String value2) {
            addCriterion("ma_createno not between", value1, value2, "ma_createno");
            return (Criteria) this;
        }

        public Criteria andMa_createdateIsNull() {
            addCriterion("ma_createdate is null");
            return (Criteria) this;
        }

        public Criteria andMa_createdateIsNotNull() {
            addCriterion("ma_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andMa_createdateEqualTo(Date value) {
            addCriterion("ma_createdate =", value, "ma_createdate");
            return (Criteria) this;
        }

        public Criteria andMa_createdateNotEqualTo(Date value) {
            addCriterion("ma_createdate <>", value, "ma_createdate");
            return (Criteria) this;
        }

        public Criteria andMa_createdateGreaterThan(Date value) {
            addCriterion("ma_createdate >", value, "ma_createdate");
            return (Criteria) this;
        }

        public Criteria andMa_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ma_createdate >=", value, "ma_createdate");
            return (Criteria) this;
        }

        public Criteria andMa_createdateLessThan(Date value) {
            addCriterion("ma_createdate <", value, "ma_createdate");
            return (Criteria) this;
        }

        public Criteria andMa_createdateLessThanOrEqualTo(Date value) {
            addCriterion("ma_createdate <=", value, "ma_createdate");
            return (Criteria) this;
        }

        public Criteria andMa_createdateIn(List<Date> values) {
            addCriterion("ma_createdate in", values, "ma_createdate");
            return (Criteria) this;
        }

        public Criteria andMa_createdateNotIn(List<Date> values) {
            addCriterion("ma_createdate not in", values, "ma_createdate");
            return (Criteria) this;
        }

        public Criteria andMa_createdateBetween(Date value1, Date value2) {
            addCriterion("ma_createdate between", value1, value2, "ma_createdate");
            return (Criteria) this;
        }

        public Criteria andMa_createdateNotBetween(Date value1, Date value2) {
            addCriterion("ma_createdate not between", value1, value2, "ma_createdate");
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