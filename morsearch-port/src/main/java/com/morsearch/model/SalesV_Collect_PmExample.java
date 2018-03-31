package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesV_Collect_PmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesV_Collect_PmExample() {
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

        public Criteria andSm_idIsNull() {
            addCriterion("sm_id is null");
            return (Criteria) this;
        }

        public Criteria andSm_idIsNotNull() {
            addCriterion("sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSm_idEqualTo(Long value) {
            addCriterion("sm_id =", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotEqualTo(Long value) {
            addCriterion("sm_id <>", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idGreaterThan(Long value) {
            addCriterion("sm_id >", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_id >=", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idLessThan(Long value) {
            addCriterion("sm_id <", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idLessThanOrEqualTo(Long value) {
            addCriterion("sm_id <=", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idIn(List<Long> values) {
            addCriterion("sm_id in", values, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotIn(List<Long> values) {
            addCriterion("sm_id not in", values, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idBetween(Long value1, Long value2) {
            addCriterion("sm_id between", value1, value2, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotBetween(Long value1, Long value2) {
            addCriterion("sm_id not between", value1, value2, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidIsNull() {
            addCriterion("sm_archivesid is null");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidIsNotNull() {
            addCriterion("sm_archivesid is not null");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidEqualTo(Long value) {
            addCriterion("sm_archivesid =", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidNotEqualTo(Long value) {
            addCriterion("sm_archivesid <>", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidGreaterThan(Long value) {
            addCriterion("sm_archivesid >", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_archivesid >=", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidLessThan(Long value) {
            addCriterion("sm_archivesid <", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidLessThanOrEqualTo(Long value) {
            addCriterion("sm_archivesid <=", value, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidIn(List<Long> values) {
            addCriterion("sm_archivesid in", values, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidNotIn(List<Long> values) {
            addCriterion("sm_archivesid not in", values, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidBetween(Long value1, Long value2) {
            addCriterion("sm_archivesid between", value1, value2, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_archivesidNotBetween(Long value1, Long value2) {
            addCriterion("sm_archivesid not between", value1, value2, "sm_archivesid");
            return (Criteria) this;
        }

        public Criteria andSm_createidIsNull() {
            addCriterion("sm_createid is null");
            return (Criteria) this;
        }

        public Criteria andSm_createidIsNotNull() {
            addCriterion("sm_createid is not null");
            return (Criteria) this;
        }

        public Criteria andSm_createidEqualTo(Long value) {
            addCriterion("sm_createid =", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidNotEqualTo(Long value) {
            addCriterion("sm_createid <>", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidGreaterThan(Long value) {
            addCriterion("sm_createid >", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_createid >=", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidLessThan(Long value) {
            addCriterion("sm_createid <", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidLessThanOrEqualTo(Long value) {
            addCriterion("sm_createid <=", value, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidIn(List<Long> values) {
            addCriterion("sm_createid in", values, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidNotIn(List<Long> values) {
            addCriterion("sm_createid not in", values, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidBetween(Long value1, Long value2) {
            addCriterion("sm_createid between", value1, value2, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createidNotBetween(Long value1, Long value2) {
            addCriterion("sm_createid not between", value1, value2, "sm_createid");
            return (Criteria) this;
        }

        public Criteria andSm_createnoIsNull() {
            addCriterion("sm_createno is null");
            return (Criteria) this;
        }

        public Criteria andSm_createnoIsNotNull() {
            addCriterion("sm_createno is not null");
            return (Criteria) this;
        }

        public Criteria andSm_createnoEqualTo(String value) {
            addCriterion("sm_createno =", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotEqualTo(String value) {
            addCriterion("sm_createno <>", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoGreaterThan(String value) {
            addCriterion("sm_createno >", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("sm_createno >=", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoLessThan(String value) {
            addCriterion("sm_createno <", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoLessThanOrEqualTo(String value) {
            addCriterion("sm_createno <=", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoLike(String value) {
            addCriterion("sm_createno like", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotLike(String value) {
            addCriterion("sm_createno not like", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoIn(List<String> values) {
            addCriterion("sm_createno in", values, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotIn(List<String> values) {
            addCriterion("sm_createno not in", values, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoBetween(String value1, String value2) {
            addCriterion("sm_createno between", value1, value2, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotBetween(String value1, String value2) {
            addCriterion("sm_createno not between", value1, value2, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIsNull() {
            addCriterion("sm_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIsNotNull() {
            addCriterion("sm_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSm_createdateEqualTo(Date value) {
            addCriterion("sm_createdate =", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotEqualTo(Date value) {
            addCriterion("sm_createdate <>", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateGreaterThan(Date value) {
            addCriterion("sm_createdate >", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sm_createdate >=", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateLessThan(Date value) {
            addCriterion("sm_createdate <", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateLessThanOrEqualTo(Date value) {
            addCriterion("sm_createdate <=", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIn(List<Date> values) {
            addCriterion("sm_createdate in", values, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotIn(List<Date> values) {
            addCriterion("sm_createdate not in", values, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateBetween(Date value1, Date value2) {
            addCriterion("sm_createdate between", value1, value2, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotBetween(Date value1, Date value2) {
            addCriterion("sm_createdate not between", value1, value2, "sm_createdate");
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

        public Criteria andDateshortEqualTo(Date value) {
            addCriterion("dateshort =", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotEqualTo(Date value) {
            addCriterion("dateshort <>", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortGreaterThan(Date value) {
            addCriterion("dateshort >", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortGreaterThanOrEqualTo(Date value) {
            addCriterion("dateshort >=", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLessThan(Date value) {
            addCriterion("dateshort <", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLessThanOrEqualTo(Date value) {
            addCriterion("dateshort <=", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortIn(List<Date> values) {
            addCriterion("dateshort in", values, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotIn(List<Date> values) {
            addCriterion("dateshort not in", values, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortBetween(Date value1, Date value2) {
            addCriterion("dateshort between", value1, value2, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotBetween(Date value1, Date value2) {
            addCriterion("dateshort not between", value1, value2, "dateshort");
            return (Criteria) this;
        }

        public Criteria andPa_titleIsNull() {
            addCriterion("pa_title is null");
            return (Criteria) this;
        }

        public Criteria andPa_titleIsNotNull() {
            addCriterion("pa_title is not null");
            return (Criteria) this;
        }

        public Criteria andPa_titleEqualTo(String value) {
            addCriterion("pa_title =", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotEqualTo(String value) {
            addCriterion("pa_title <>", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleGreaterThan(String value) {
            addCriterion("pa_title >", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleGreaterThanOrEqualTo(String value) {
            addCriterion("pa_title >=", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleLessThan(String value) {
            addCriterion("pa_title <", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleLessThanOrEqualTo(String value) {
            addCriterion("pa_title <=", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleLike(String value) {
            addCriterion("pa_title like", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotLike(String value) {
            addCriterion("pa_title not like", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleIn(List<String> values) {
            addCriterion("pa_title in", values, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotIn(List<String> values) {
            addCriterion("pa_title not in", values, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleBetween(String value1, String value2) {
            addCriterion("pa_title between", value1, value2, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotBetween(String value1, String value2) {
            addCriterion("pa_title not between", value1, value2, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_useridIsNull() {
            addCriterion("pa_userid is null");
            return (Criteria) this;
        }

        public Criteria andPa_useridIsNotNull() {
            addCriterion("pa_userid is not null");
            return (Criteria) this;
        }

        public Criteria andPa_useridEqualTo(Long value) {
            addCriterion("pa_userid =", value, "pa_userid");
            return (Criteria) this;
        }

        public Criteria andPa_useridNotEqualTo(Long value) {
            addCriterion("pa_userid <>", value, "pa_userid");
            return (Criteria) this;
        }

        public Criteria andPa_useridGreaterThan(Long value) {
            addCriterion("pa_userid >", value, "pa_userid");
            return (Criteria) this;
        }

        public Criteria andPa_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("pa_userid >=", value, "pa_userid");
            return (Criteria) this;
        }

        public Criteria andPa_useridLessThan(Long value) {
            addCriterion("pa_userid <", value, "pa_userid");
            return (Criteria) this;
        }

        public Criteria andPa_useridLessThanOrEqualTo(Long value) {
            addCriterion("pa_userid <=", value, "pa_userid");
            return (Criteria) this;
        }

        public Criteria andPa_useridIn(List<Long> values) {
            addCriterion("pa_userid in", values, "pa_userid");
            return (Criteria) this;
        }

        public Criteria andPa_useridNotIn(List<Long> values) {
            addCriterion("pa_userid not in", values, "pa_userid");
            return (Criteria) this;
        }

        public Criteria andPa_useridBetween(Long value1, Long value2) {
            addCriterion("pa_userid between", value1, value2, "pa_userid");
            return (Criteria) this;
        }

        public Criteria andPa_useridNotBetween(Long value1, Long value2) {
            addCriterion("pa_userid not between", value1, value2, "pa_userid");
            return (Criteria) this;
        }

        public Criteria andPa_usernameIsNull() {
            addCriterion("pa_username is null");
            return (Criteria) this;
        }

        public Criteria andPa_usernameIsNotNull() {
            addCriterion("pa_username is not null");
            return (Criteria) this;
        }

        public Criteria andPa_usernameEqualTo(String value) {
            addCriterion("pa_username =", value, "pa_username");
            return (Criteria) this;
        }

        public Criteria andPa_usernameNotEqualTo(String value) {
            addCriterion("pa_username <>", value, "pa_username");
            return (Criteria) this;
        }

        public Criteria andPa_usernameGreaterThan(String value) {
            addCriterion("pa_username >", value, "pa_username");
            return (Criteria) this;
        }

        public Criteria andPa_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("pa_username >=", value, "pa_username");
            return (Criteria) this;
        }

        public Criteria andPa_usernameLessThan(String value) {
            addCriterion("pa_username <", value, "pa_username");
            return (Criteria) this;
        }

        public Criteria andPa_usernameLessThanOrEqualTo(String value) {
            addCriterion("pa_username <=", value, "pa_username");
            return (Criteria) this;
        }

        public Criteria andPa_usernameLike(String value) {
            addCriterion("pa_username like", value, "pa_username");
            return (Criteria) this;
        }

        public Criteria andPa_usernameNotLike(String value) {
            addCriterion("pa_username not like", value, "pa_username");
            return (Criteria) this;
        }

        public Criteria andPa_usernameIn(List<String> values) {
            addCriterion("pa_username in", values, "pa_username");
            return (Criteria) this;
        }

        public Criteria andPa_usernameNotIn(List<String> values) {
            addCriterion("pa_username not in", values, "pa_username");
            return (Criteria) this;
        }

        public Criteria andPa_usernameBetween(String value1, String value2) {
            addCriterion("pa_username between", value1, value2, "pa_username");
            return (Criteria) this;
        }

        public Criteria andPa_usernameNotBetween(String value1, String value2) {
            addCriterion("pa_username not between", value1, value2, "pa_username");
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