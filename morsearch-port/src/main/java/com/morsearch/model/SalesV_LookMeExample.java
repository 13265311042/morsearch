package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesV_LookMeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesV_LookMeExample() {
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

        public Criteria andDesginer_nameIsNull() {
            addCriterion("desginer_name is null");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameIsNotNull() {
            addCriterion("desginer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameEqualTo(String value) {
            addCriterion("desginer_name =", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameNotEqualTo(String value) {
            addCriterion("desginer_name <>", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameGreaterThan(String value) {
            addCriterion("desginer_name >", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameGreaterThanOrEqualTo(String value) {
            addCriterion("desginer_name >=", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameLessThan(String value) {
            addCriterion("desginer_name <", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameLessThanOrEqualTo(String value) {
            addCriterion("desginer_name <=", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameLike(String value) {
            addCriterion("desginer_name like", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameNotLike(String value) {
            addCriterion("desginer_name not like", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameIn(List<String> values) {
            addCriterion("desginer_name in", values, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameNotIn(List<String> values) {
            addCriterion("desginer_name not in", values, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameBetween(String value1, String value2) {
            addCriterion("desginer_name between", value1, value2, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameNotBetween(String value1, String value2) {
            addCriterion("desginer_name not between", value1, value2, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobIsNull() {
            addCriterion("desginer_job is null");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobIsNotNull() {
            addCriterion("desginer_job is not null");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobEqualTo(String value) {
            addCriterion("desginer_job =", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobNotEqualTo(String value) {
            addCriterion("desginer_job <>", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobGreaterThan(String value) {
            addCriterion("desginer_job >", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobGreaterThanOrEqualTo(String value) {
            addCriterion("desginer_job >=", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobLessThan(String value) {
            addCriterion("desginer_job <", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobLessThanOrEqualTo(String value) {
            addCriterion("desginer_job <=", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobLike(String value) {
            addCriterion("desginer_job like", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobNotLike(String value) {
            addCriterion("desginer_job not like", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobIn(List<String> values) {
            addCriterion("desginer_job in", values, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobNotIn(List<String> values) {
            addCriterion("desginer_job not in", values, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobBetween(String value1, String value2) {
            addCriterion("desginer_job between", value1, value2, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobNotBetween(String value1, String value2) {
            addCriterion("desginer_job not between", value1, value2, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageIsNull() {
            addCriterion("desginer_message is null");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageIsNotNull() {
            addCriterion("desginer_message is not null");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageEqualTo(String value) {
            addCriterion("desginer_message =", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageNotEqualTo(String value) {
            addCriterion("desginer_message <>", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageGreaterThan(String value) {
            addCriterion("desginer_message >", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageGreaterThanOrEqualTo(String value) {
            addCriterion("desginer_message >=", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageLessThan(String value) {
            addCriterion("desginer_message <", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageLessThanOrEqualTo(String value) {
            addCriterion("desginer_message <=", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageLike(String value) {
            addCriterion("desginer_message like", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageNotLike(String value) {
            addCriterion("desginer_message not like", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageIn(List<String> values) {
            addCriterion("desginer_message in", values, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageNotIn(List<String> values) {
            addCriterion("desginer_message not in", values, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageBetween(String value1, String value2) {
            addCriterion("desginer_message between", value1, value2, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageNotBetween(String value1, String value2) {
            addCriterion("desginer_message not between", value1, value2, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlIsNull() {
            addCriterion("desginer_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlIsNotNull() {
            addCriterion("desginer_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlEqualTo(String value) {
            addCriterion("desginer_imageurl =", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlNotEqualTo(String value) {
            addCriterion("desginer_imageurl <>", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlGreaterThan(String value) {
            addCriterion("desginer_imageurl >", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlGreaterThanOrEqualTo(String value) {
            addCriterion("desginer_imageurl >=", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlLessThan(String value) {
            addCriterion("desginer_imageurl <", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlLessThanOrEqualTo(String value) {
            addCriterion("desginer_imageurl <=", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlLike(String value) {
            addCriterion("desginer_imageurl like", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlNotLike(String value) {
            addCriterion("desginer_imageurl not like", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlIn(List<String> values) {
            addCriterion("desginer_imageurl in", values, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlNotIn(List<String> values) {
            addCriterion("desginer_imageurl not in", values, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlBetween(String value1, String value2) {
            addCriterion("desginer_imageurl between", value1, value2, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlNotBetween(String value1, String value2) {
            addCriterion("desginer_imageurl not between", value1, value2, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDateshortIsNull() {
            addCriterion("dateshort is null");
            return (Criteria) this;
        }

        public Criteria andDateshortIsNotNull() {
            addCriterion("dateshort is not null");
            return (Criteria) this;
        }

        public Criteria andDateshortEqualTo(String value) {
            addCriterion("dateshort =", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotEqualTo(String value) {
            addCriterion("dateshort <>", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortGreaterThan(String value) {
            addCriterion("dateshort >", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortGreaterThanOrEqualTo(String value) {
            addCriterion("dateshort >=", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLessThan(String value) {
            addCriterion("dateshort <", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLessThanOrEqualTo(String value) {
            addCriterion("dateshort <=", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLike(String value) {
            addCriterion("dateshort like", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotLike(String value) {
            addCriterion("dateshort not like", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortIn(List<String> values) {
            addCriterion("dateshort in", values, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotIn(List<String> values) {
            addCriterion("dateshort not in", values, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortBetween(String value1, String value2) {
            addCriterion("dateshort between", value1, value2, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotBetween(String value1, String value2) {
            addCriterion("dateshort not between", value1, value2, "dateshort");
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