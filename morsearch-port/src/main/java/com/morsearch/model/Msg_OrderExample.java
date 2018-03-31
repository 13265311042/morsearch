package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Msg_OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Msg_OrderExample() {
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

        public Criteria andMo_idIsNull() {
            addCriterion("mo_id is null");
            return (Criteria) this;
        }

        public Criteria andMo_idIsNotNull() {
            addCriterion("mo_id is not null");
            return (Criteria) this;
        }

        public Criteria andMo_idEqualTo(Long value) {
            addCriterion("mo_id =", value, "mo_id");
            return (Criteria) this;
        }

        public Criteria andMo_idNotEqualTo(Long value) {
            addCriterion("mo_id <>", value, "mo_id");
            return (Criteria) this;
        }

        public Criteria andMo_idGreaterThan(Long value) {
            addCriterion("mo_id >", value, "mo_id");
            return (Criteria) this;
        }

        public Criteria andMo_idGreaterThanOrEqualTo(Long value) {
            addCriterion("mo_id >=", value, "mo_id");
            return (Criteria) this;
        }

        public Criteria andMo_idLessThan(Long value) {
            addCriterion("mo_id <", value, "mo_id");
            return (Criteria) this;
        }

        public Criteria andMo_idLessThanOrEqualTo(Long value) {
            addCriterion("mo_id <=", value, "mo_id");
            return (Criteria) this;
        }

        public Criteria andMo_idIn(List<Long> values) {
            addCriterion("mo_id in", values, "mo_id");
            return (Criteria) this;
        }

        public Criteria andMo_idNotIn(List<Long> values) {
            addCriterion("mo_id not in", values, "mo_id");
            return (Criteria) this;
        }

        public Criteria andMo_idBetween(Long value1, Long value2) {
            addCriterion("mo_id between", value1, value2, "mo_id");
            return (Criteria) this;
        }

        public Criteria andMo_idNotBetween(Long value1, Long value2) {
            addCriterion("mo_id not between", value1, value2, "mo_id");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoIsNull() {
            addCriterion("mo_orderno is null");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoIsNotNull() {
            addCriterion("mo_orderno is not null");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoEqualTo(String value) {
            addCriterion("mo_orderno =", value, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoNotEqualTo(String value) {
            addCriterion("mo_orderno <>", value, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoGreaterThan(String value) {
            addCriterion("mo_orderno >", value, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoGreaterThanOrEqualTo(String value) {
            addCriterion("mo_orderno >=", value, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoLessThan(String value) {
            addCriterion("mo_orderno <", value, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoLessThanOrEqualTo(String value) {
            addCriterion("mo_orderno <=", value, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoLike(String value) {
            addCriterion("mo_orderno like", value, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoNotLike(String value) {
            addCriterion("mo_orderno not like", value, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoIn(List<String> values) {
            addCriterion("mo_orderno in", values, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoNotIn(List<String> values) {
            addCriterion("mo_orderno not in", values, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoBetween(String value1, String value2) {
            addCriterion("mo_orderno between", value1, value2, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_ordernoNotBetween(String value1, String value2) {
            addCriterion("mo_orderno not between", value1, value2, "mo_orderno");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusIsNull() {
            addCriterion("mo_orderstatus is null");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusIsNotNull() {
            addCriterion("mo_orderstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusEqualTo(Byte value) {
            addCriterion("mo_orderstatus =", value, "mo_orderstatus");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusNotEqualTo(Byte value) {
            addCriterion("mo_orderstatus <>", value, "mo_orderstatus");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusGreaterThan(Byte value) {
            addCriterion("mo_orderstatus >", value, "mo_orderstatus");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("mo_orderstatus >=", value, "mo_orderstatus");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusLessThan(Byte value) {
            addCriterion("mo_orderstatus <", value, "mo_orderstatus");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusLessThanOrEqualTo(Byte value) {
            addCriterion("mo_orderstatus <=", value, "mo_orderstatus");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusIn(List<Byte> values) {
            addCriterion("mo_orderstatus in", values, "mo_orderstatus");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusNotIn(List<Byte> values) {
            addCriterion("mo_orderstatus not in", values, "mo_orderstatus");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusBetween(Byte value1, Byte value2) {
            addCriterion("mo_orderstatus between", value1, value2, "mo_orderstatus");
            return (Criteria) this;
        }

        public Criteria andMo_orderstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("mo_orderstatus not between", value1, value2, "mo_orderstatus");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentIsNull() {
            addCriterion("mo_talkcontent is null");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentIsNotNull() {
            addCriterion("mo_talkcontent is not null");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentEqualTo(String value) {
            addCriterion("mo_talkcontent =", value, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentNotEqualTo(String value) {
            addCriterion("mo_talkcontent <>", value, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentGreaterThan(String value) {
            addCriterion("mo_talkcontent >", value, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentGreaterThanOrEqualTo(String value) {
            addCriterion("mo_talkcontent >=", value, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentLessThan(String value) {
            addCriterion("mo_talkcontent <", value, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentLessThanOrEqualTo(String value) {
            addCriterion("mo_talkcontent <=", value, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentLike(String value) {
            addCriterion("mo_talkcontent like", value, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentNotLike(String value) {
            addCriterion("mo_talkcontent not like", value, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentIn(List<String> values) {
            addCriterion("mo_talkcontent in", values, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentNotIn(List<String> values) {
            addCriterion("mo_talkcontent not in", values, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentBetween(String value1, String value2) {
            addCriterion("mo_talkcontent between", value1, value2, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_talkcontentNotBetween(String value1, String value2) {
            addCriterion("mo_talkcontent not between", value1, value2, "mo_talkcontent");
            return (Criteria) this;
        }

        public Criteria andMo_titleIsNull() {
            addCriterion("mo_title is null");
            return (Criteria) this;
        }

        public Criteria andMo_titleIsNotNull() {
            addCriterion("mo_title is not null");
            return (Criteria) this;
        }

        public Criteria andMo_titleEqualTo(String value) {
            addCriterion("mo_title =", value, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_titleNotEqualTo(String value) {
            addCriterion("mo_title <>", value, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_titleGreaterThan(String value) {
            addCriterion("mo_title >", value, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_titleGreaterThanOrEqualTo(String value) {
            addCriterion("mo_title >=", value, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_titleLessThan(String value) {
            addCriterion("mo_title <", value, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_titleLessThanOrEqualTo(String value) {
            addCriterion("mo_title <=", value, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_titleLike(String value) {
            addCriterion("mo_title like", value, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_titleNotLike(String value) {
            addCriterion("mo_title not like", value, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_titleIn(List<String> values) {
            addCriterion("mo_title in", values, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_titleNotIn(List<String> values) {
            addCriterion("mo_title not in", values, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_titleBetween(String value1, String value2) {
            addCriterion("mo_title between", value1, value2, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_titleNotBetween(String value1, String value2) {
            addCriterion("mo_title not between", value1, value2, "mo_title");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadIsNull() {
            addCriterion("mo_flagread is null");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadIsNotNull() {
            addCriterion("mo_flagread is not null");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadEqualTo(Boolean value) {
            addCriterion("mo_flagread =", value, "mo_flagread");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadNotEqualTo(Boolean value) {
            addCriterion("mo_flagread <>", value, "mo_flagread");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadGreaterThan(Boolean value) {
            addCriterion("mo_flagread >", value, "mo_flagread");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mo_flagread >=", value, "mo_flagread");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadLessThan(Boolean value) {
            addCriterion("mo_flagread <", value, "mo_flagread");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadLessThanOrEqualTo(Boolean value) {
            addCriterion("mo_flagread <=", value, "mo_flagread");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadIn(List<Boolean> values) {
            addCriterion("mo_flagread in", values, "mo_flagread");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadNotIn(List<Boolean> values) {
            addCriterion("mo_flagread not in", values, "mo_flagread");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadBetween(Boolean value1, Boolean value2) {
            addCriterion("mo_flagread between", value1, value2, "mo_flagread");
            return (Criteria) this;
        }

        public Criteria andMo_flagreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mo_flagread not between", value1, value2, "mo_flagread");
            return (Criteria) this;
        }

        public Criteria andMo_desigidIsNull() {
            addCriterion("mo_desigid is null");
            return (Criteria) this;
        }

        public Criteria andMo_desigidIsNotNull() {
            addCriterion("mo_desigid is not null");
            return (Criteria) this;
        }

        public Criteria andMo_desigidEqualTo(Long value) {
            addCriterion("mo_desigid =", value, "mo_desigid");
            return (Criteria) this;
        }

        public Criteria andMo_desigidNotEqualTo(Long value) {
            addCriterion("mo_desigid <>", value, "mo_desigid");
            return (Criteria) this;
        }

        public Criteria andMo_desigidGreaterThan(Long value) {
            addCriterion("mo_desigid >", value, "mo_desigid");
            return (Criteria) this;
        }

        public Criteria andMo_desigidGreaterThanOrEqualTo(Long value) {
            addCriterion("mo_desigid >=", value, "mo_desigid");
            return (Criteria) this;
        }

        public Criteria andMo_desigidLessThan(Long value) {
            addCriterion("mo_desigid <", value, "mo_desigid");
            return (Criteria) this;
        }

        public Criteria andMo_desigidLessThanOrEqualTo(Long value) {
            addCriterion("mo_desigid <=", value, "mo_desigid");
            return (Criteria) this;
        }

        public Criteria andMo_desigidIn(List<Long> values) {
            addCriterion("mo_desigid in", values, "mo_desigid");
            return (Criteria) this;
        }

        public Criteria andMo_desigidNotIn(List<Long> values) {
            addCriterion("mo_desigid not in", values, "mo_desigid");
            return (Criteria) this;
        }

        public Criteria andMo_desigidBetween(Long value1, Long value2) {
            addCriterion("mo_desigid between", value1, value2, "mo_desigid");
            return (Criteria) this;
        }

        public Criteria andMo_desigidNotBetween(Long value1, Long value2) {
            addCriterion("mo_desigid not between", value1, value2, "mo_desigid");
            return (Criteria) this;
        }

        public Criteria andMo_saleridIsNull() {
            addCriterion("mo_salerid is null");
            return (Criteria) this;
        }

        public Criteria andMo_saleridIsNotNull() {
            addCriterion("mo_salerid is not null");
            return (Criteria) this;
        }

        public Criteria andMo_saleridEqualTo(Long value) {
            addCriterion("mo_salerid =", value, "mo_salerid");
            return (Criteria) this;
        }

        public Criteria andMo_saleridNotEqualTo(Long value) {
            addCriterion("mo_salerid <>", value, "mo_salerid");
            return (Criteria) this;
        }

        public Criteria andMo_saleridGreaterThan(Long value) {
            addCriterion("mo_salerid >", value, "mo_salerid");
            return (Criteria) this;
        }

        public Criteria andMo_saleridGreaterThanOrEqualTo(Long value) {
            addCriterion("mo_salerid >=", value, "mo_salerid");
            return (Criteria) this;
        }

        public Criteria andMo_saleridLessThan(Long value) {
            addCriterion("mo_salerid <", value, "mo_salerid");
            return (Criteria) this;
        }

        public Criteria andMo_saleridLessThanOrEqualTo(Long value) {
            addCriterion("mo_salerid <=", value, "mo_salerid");
            return (Criteria) this;
        }

        public Criteria andMo_saleridIn(List<Long> values) {
            addCriterion("mo_salerid in", values, "mo_salerid");
            return (Criteria) this;
        }

        public Criteria andMo_saleridNotIn(List<Long> values) {
            addCriterion("mo_salerid not in", values, "mo_salerid");
            return (Criteria) this;
        }

        public Criteria andMo_saleridBetween(Long value1, Long value2) {
            addCriterion("mo_salerid between", value1, value2, "mo_salerid");
            return (Criteria) this;
        }

        public Criteria andMo_saleridNotBetween(Long value1, Long value2) {
            addCriterion("mo_salerid not between", value1, value2, "mo_salerid");
            return (Criteria) this;
        }

        public Criteria andMo_createdateIsNull() {
            addCriterion("mo_createdate is null");
            return (Criteria) this;
        }

        public Criteria andMo_createdateIsNotNull() {
            addCriterion("mo_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andMo_createdateEqualTo(Date value) {
            addCriterion("mo_createdate =", value, "mo_createdate");
            return (Criteria) this;
        }

        public Criteria andMo_createdateNotEqualTo(Date value) {
            addCriterion("mo_createdate <>", value, "mo_createdate");
            return (Criteria) this;
        }

        public Criteria andMo_createdateGreaterThan(Date value) {
            addCriterion("mo_createdate >", value, "mo_createdate");
            return (Criteria) this;
        }

        public Criteria andMo_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_createdate >=", value, "mo_createdate");
            return (Criteria) this;
        }

        public Criteria andMo_createdateLessThan(Date value) {
            addCriterion("mo_createdate <", value, "mo_createdate");
            return (Criteria) this;
        }

        public Criteria andMo_createdateLessThanOrEqualTo(Date value) {
            addCriterion("mo_createdate <=", value, "mo_createdate");
            return (Criteria) this;
        }

        public Criteria andMo_createdateIn(List<Date> values) {
            addCriterion("mo_createdate in", values, "mo_createdate");
            return (Criteria) this;
        }

        public Criteria andMo_createdateNotIn(List<Date> values) {
            addCriterion("mo_createdate not in", values, "mo_createdate");
            return (Criteria) this;
        }

        public Criteria andMo_createdateBetween(Date value1, Date value2) {
            addCriterion("mo_createdate between", value1, value2, "mo_createdate");
            return (Criteria) this;
        }

        public Criteria andMo_createdateNotBetween(Date value1, Date value2) {
            addCriterion("mo_createdate not between", value1, value2, "mo_createdate");
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