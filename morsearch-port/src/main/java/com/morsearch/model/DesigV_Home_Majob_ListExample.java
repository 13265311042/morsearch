package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class DesigV_Home_Majob_ListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesigV_Home_Majob_ListExample() {
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

        public Criteria andDh_idIsNull() {
            addCriterion("dh_id is null");
            return (Criteria) this;
        }

        public Criteria andDh_idIsNotNull() {
            addCriterion("dh_id is not null");
            return (Criteria) this;
        }

        public Criteria andDh_idEqualTo(Long value) {
            addCriterion("dh_id =", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idNotEqualTo(Long value) {
            addCriterion("dh_id <>", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idGreaterThan(Long value) {
            addCriterion("dh_id >", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idGreaterThanOrEqualTo(Long value) {
            addCriterion("dh_id >=", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idLessThan(Long value) {
            addCriterion("dh_id <", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idLessThanOrEqualTo(Long value) {
            addCriterion("dh_id <=", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idIn(List<Long> values) {
            addCriterion("dh_id in", values, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idNotIn(List<Long> values) {
            addCriterion("dh_id not in", values, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idBetween(Long value1, Long value2) {
            addCriterion("dh_id between", value1, value2, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idNotBetween(Long value1, Long value2) {
            addCriterion("dh_id not between", value1, value2, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_dyidIsNull() {
            addCriterion("dh_dyid is null");
            return (Criteria) this;
        }

        public Criteria andDh_dyidIsNotNull() {
            addCriterion("dh_dyid is not null");
            return (Criteria) this;
        }

        public Criteria andDh_dyidEqualTo(Long value) {
            addCriterion("dh_dyid =", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidNotEqualTo(Long value) {
            addCriterion("dh_dyid <>", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidGreaterThan(Long value) {
            addCriterion("dh_dyid >", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidGreaterThanOrEqualTo(Long value) {
            addCriterion("dh_dyid >=", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidLessThan(Long value) {
            addCriterion("dh_dyid <", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidLessThanOrEqualTo(Long value) {
            addCriterion("dh_dyid <=", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidIn(List<Long> values) {
            addCriterion("dh_dyid in", values, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidNotIn(List<Long> values) {
            addCriterion("dh_dyid not in", values, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidBetween(Long value1, Long value2) {
            addCriterion("dh_dyid between", value1, value2, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidNotBetween(Long value1, Long value2) {
            addCriterion("dh_dyid not between", value1, value2, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_indexIsNull() {
            addCriterion("dh_index is null");
            return (Criteria) this;
        }

        public Criteria andDh_indexIsNotNull() {
            addCriterion("dh_index is not null");
            return (Criteria) this;
        }

        public Criteria andDh_indexEqualTo(Integer value) {
            addCriterion("dh_index =", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexNotEqualTo(Integer value) {
            addCriterion("dh_index <>", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexGreaterThan(Integer value) {
            addCriterion("dh_index >", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("dh_index >=", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexLessThan(Integer value) {
            addCriterion("dh_index <", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexLessThanOrEqualTo(Integer value) {
            addCriterion("dh_index <=", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexIn(List<Integer> values) {
            addCriterion("dh_index in", values, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexNotIn(List<Integer> values) {
            addCriterion("dh_index not in", values, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexBetween(Integer value1, Integer value2) {
            addCriterion("dh_index between", value1, value2, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexNotBetween(Integer value1, Integer value2) {
            addCriterion("dh_index not between", value1, value2, "dh_index");
            return (Criteria) this;
        }

        public Criteria andBl_nameIsNull() {
            addCriterion("bl_name is null");
            return (Criteria) this;
        }

        public Criteria andBl_nameIsNotNull() {
            addCriterion("bl_name is not null");
            return (Criteria) this;
        }

        public Criteria andBl_nameEqualTo(String value) {
            addCriterion("bl_name =", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameNotEqualTo(String value) {
            addCriterion("bl_name <>", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameGreaterThan(String value) {
            addCriterion("bl_name >", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameGreaterThanOrEqualTo(String value) {
            addCriterion("bl_name >=", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameLessThan(String value) {
            addCriterion("bl_name <", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameLessThanOrEqualTo(String value) {
            addCriterion("bl_name <=", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameLike(String value) {
            addCriterion("bl_name like", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameNotLike(String value) {
            addCriterion("bl_name not like", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameIn(List<String> values) {
            addCriterion("bl_name in", values, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameNotIn(List<String> values) {
            addCriterion("bl_name not in", values, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameBetween(String value1, String value2) {
            addCriterion("bl_name between", value1, value2, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameNotBetween(String value1, String value2) {
            addCriterion("bl_name not between", value1, value2, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlIsNull() {
            addCriterion("bl_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlIsNotNull() {
            addCriterion("bl_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlEqualTo(String value) {
            addCriterion("bl_imageurl =", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlNotEqualTo(String value) {
            addCriterion("bl_imageurl <>", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlGreaterThan(String value) {
            addCriterion("bl_imageurl >", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlGreaterThanOrEqualTo(String value) {
            addCriterion("bl_imageurl >=", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlLessThan(String value) {
            addCriterion("bl_imageurl <", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlLessThanOrEqualTo(String value) {
            addCriterion("bl_imageurl <=", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlLike(String value) {
            addCriterion("bl_imageurl like", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlNotLike(String value) {
            addCriterion("bl_imageurl not like", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlIn(List<String> values) {
            addCriterion("bl_imageurl in", values, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlNotIn(List<String> values) {
            addCriterion("bl_imageurl not in", values, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlBetween(String value1, String value2) {
            addCriterion("bl_imageurl between", value1, value2, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlNotBetween(String value1, String value2) {
            addCriterion("bl_imageurl not between", value1, value2, "bl_imageurl");
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