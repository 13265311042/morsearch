package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesigV_Collect_PmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesigV_Collect_PmExample() {
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

        public Criteria andDm_idIsNull() {
            addCriterion("dm_id is null");
            return (Criteria) this;
        }

        public Criteria andDm_idIsNotNull() {
            addCriterion("dm_id is not null");
            return (Criteria) this;
        }

        public Criteria andDm_idEqualTo(Long value) {
            addCriterion("dm_id =", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idNotEqualTo(Long value) {
            addCriterion("dm_id <>", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idGreaterThan(Long value) {
            addCriterion("dm_id >", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idGreaterThanOrEqualTo(Long value) {
            addCriterion("dm_id >=", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idLessThan(Long value) {
            addCriterion("dm_id <", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idLessThanOrEqualTo(Long value) {
            addCriterion("dm_id <=", value, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idIn(List<Long> values) {
            addCriterion("dm_id in", values, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idNotIn(List<Long> values) {
            addCriterion("dm_id not in", values, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idBetween(Long value1, Long value2) {
            addCriterion("dm_id between", value1, value2, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_idNotBetween(Long value1, Long value2) {
            addCriterion("dm_id not between", value1, value2, "dm_id");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidIsNull() {
            addCriterion("dm_archivesid is null");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidIsNotNull() {
            addCriterion("dm_archivesid is not null");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidEqualTo(Long value) {
            addCriterion("dm_archivesid =", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidNotEqualTo(Long value) {
            addCriterion("dm_archivesid <>", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidGreaterThan(Long value) {
            addCriterion("dm_archivesid >", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidGreaterThanOrEqualTo(Long value) {
            addCriterion("dm_archivesid >=", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidLessThan(Long value) {
            addCriterion("dm_archivesid <", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidLessThanOrEqualTo(Long value) {
            addCriterion("dm_archivesid <=", value, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidIn(List<Long> values) {
            addCriterion("dm_archivesid in", values, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidNotIn(List<Long> values) {
            addCriterion("dm_archivesid not in", values, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidBetween(Long value1, Long value2) {
            addCriterion("dm_archivesid between", value1, value2, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_archivesidNotBetween(Long value1, Long value2) {
            addCriterion("dm_archivesid not between", value1, value2, "dm_archivesid");
            return (Criteria) this;
        }

        public Criteria andDm_createidIsNull() {
            addCriterion("dm_createid is null");
            return (Criteria) this;
        }

        public Criteria andDm_createidIsNotNull() {
            addCriterion("dm_createid is not null");
            return (Criteria) this;
        }

        public Criteria andDm_createidEqualTo(Long value) {
            addCriterion("dm_createid =", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidNotEqualTo(Long value) {
            addCriterion("dm_createid <>", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidGreaterThan(Long value) {
            addCriterion("dm_createid >", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("dm_createid >=", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidLessThan(Long value) {
            addCriterion("dm_createid <", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidLessThanOrEqualTo(Long value) {
            addCriterion("dm_createid <=", value, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidIn(List<Long> values) {
            addCriterion("dm_createid in", values, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidNotIn(List<Long> values) {
            addCriterion("dm_createid not in", values, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidBetween(Long value1, Long value2) {
            addCriterion("dm_createid between", value1, value2, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createidNotBetween(Long value1, Long value2) {
            addCriterion("dm_createid not between", value1, value2, "dm_createid");
            return (Criteria) this;
        }

        public Criteria andDm_createnoIsNull() {
            addCriterion("dm_createno is null");
            return (Criteria) this;
        }

        public Criteria andDm_createnoIsNotNull() {
            addCriterion("dm_createno is not null");
            return (Criteria) this;
        }

        public Criteria andDm_createnoEqualTo(String value) {
            addCriterion("dm_createno =", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoNotEqualTo(String value) {
            addCriterion("dm_createno <>", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoGreaterThan(String value) {
            addCriterion("dm_createno >", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("dm_createno >=", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoLessThan(String value) {
            addCriterion("dm_createno <", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoLessThanOrEqualTo(String value) {
            addCriterion("dm_createno <=", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoLike(String value) {
            addCriterion("dm_createno like", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoNotLike(String value) {
            addCriterion("dm_createno not like", value, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoIn(List<String> values) {
            addCriterion("dm_createno in", values, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoNotIn(List<String> values) {
            addCriterion("dm_createno not in", values, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoBetween(String value1, String value2) {
            addCriterion("dm_createno between", value1, value2, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createnoNotBetween(String value1, String value2) {
            addCriterion("dm_createno not between", value1, value2, "dm_createno");
            return (Criteria) this;
        }

        public Criteria andDm_createdateIsNull() {
            addCriterion("dm_createdate is null");
            return (Criteria) this;
        }

        public Criteria andDm_createdateIsNotNull() {
            addCriterion("dm_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andDm_createdateEqualTo(Date value) {
            addCriterion("dm_createdate =", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateNotEqualTo(Date value) {
            addCriterion("dm_createdate <>", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateGreaterThan(Date value) {
            addCriterion("dm_createdate >", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("dm_createdate >=", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateLessThan(Date value) {
            addCriterion("dm_createdate <", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateLessThanOrEqualTo(Date value) {
            addCriterion("dm_createdate <=", value, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateIn(List<Date> values) {
            addCriterion("dm_createdate in", values, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateNotIn(List<Date> values) {
            addCriterion("dm_createdate not in", values, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateBetween(Date value1, Date value2) {
            addCriterion("dm_createdate between", value1, value2, "dm_createdate");
            return (Criteria) this;
        }

        public Criteria andDm_createdateNotBetween(Date value1, Date value2) {
            addCriterion("dm_createdate not between", value1, value2, "dm_createdate");
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