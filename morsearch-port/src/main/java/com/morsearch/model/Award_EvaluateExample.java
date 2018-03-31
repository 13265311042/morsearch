package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Award_EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Award_EvaluateExample() {
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

        public Criteria andBa_popupIsNull() {
            addCriterion("ba_popup is null");
            return (Criteria) this;
        }

        public Criteria andBa_popupIsNotNull() {
            addCriterion("ba_popup is not null");
            return (Criteria) this;
        }

        public Criteria andBa_popupEqualTo(Short value) {
            addCriterion("ba_popup =", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupNotEqualTo(Short value) {
            addCriterion("ba_popup <>", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupGreaterThan(Short value) {
            addCriterion("ba_popup >", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupGreaterThanOrEqualTo(Short value) {
            addCriterion("ba_popup >=", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupLessThan(Short value) {
            addCriterion("ba_popup <", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupLessThanOrEqualTo(Short value) {
            addCriterion("ba_popup <=", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupIn(List<Short> values) {
            addCriterion("ba_popup in", values, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupNotIn(List<Short> values) {
            addCriterion("ba_popup not in", values, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupBetween(Short value1, Short value2) {
            addCriterion("ba_popup between", value1, value2, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupNotBetween(Short value1, Short value2) {
            addCriterion("ba_popup not between", value1, value2, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstIsNull() {
            addCriterion("ba_integral_first is null");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstIsNotNull() {
            addCriterion("ba_integral_first is not null");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstEqualTo(Integer value) {
            addCriterion("ba_integral_first =", value, "ba_integral_first");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstNotEqualTo(Integer value) {
            addCriterion("ba_integral_first <>", value, "ba_integral_first");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstGreaterThan(Integer value) {
            addCriterion("ba_integral_first >", value, "ba_integral_first");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstGreaterThanOrEqualTo(Integer value) {
            addCriterion("ba_integral_first >=", value, "ba_integral_first");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstLessThan(Integer value) {
            addCriterion("ba_integral_first <", value, "ba_integral_first");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstLessThanOrEqualTo(Integer value) {
            addCriterion("ba_integral_first <=", value, "ba_integral_first");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstIn(List<Integer> values) {
            addCriterion("ba_integral_first in", values, "ba_integral_first");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstNotIn(List<Integer> values) {
            addCriterion("ba_integral_first not in", values, "ba_integral_first");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstBetween(Integer value1, Integer value2) {
            addCriterion("ba_integral_first between", value1, value2, "ba_integral_first");
            return (Criteria) this;
        }

        public Criteria andBa_integral_firstNotBetween(Integer value1, Integer value2) {
            addCriterion("ba_integral_first not between", value1, value2, "ba_integral_first");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalIsNull() {
            addCriterion("ba_integral_normal is null");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalIsNotNull() {
            addCriterion("ba_integral_normal is not null");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalEqualTo(Integer value) {
            addCriterion("ba_integral_normal =", value, "ba_integral_normal");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalNotEqualTo(Integer value) {
            addCriterion("ba_integral_normal <>", value, "ba_integral_normal");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalGreaterThan(Integer value) {
            addCriterion("ba_integral_normal >", value, "ba_integral_normal");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalGreaterThanOrEqualTo(Integer value) {
            addCriterion("ba_integral_normal >=", value, "ba_integral_normal");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalLessThan(Integer value) {
            addCriterion("ba_integral_normal <", value, "ba_integral_normal");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalLessThanOrEqualTo(Integer value) {
            addCriterion("ba_integral_normal <=", value, "ba_integral_normal");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalIn(List<Integer> values) {
            addCriterion("ba_integral_normal in", values, "ba_integral_normal");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalNotIn(List<Integer> values) {
            addCriterion("ba_integral_normal not in", values, "ba_integral_normal");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalBetween(Integer value1, Integer value2) {
            addCriterion("ba_integral_normal between", value1, value2, "ba_integral_normal");
            return (Criteria) this;
        }

        public Criteria andBa_integral_normalNotBetween(Integer value1, Integer value2) {
            addCriterion("ba_integral_normal not between", value1, value2, "ba_integral_normal");
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

        public Criteria andBa_createnoIsNull() {
            addCriterion("ba_createno is null");
            return (Criteria) this;
        }

        public Criteria andBa_createnoIsNotNull() {
            addCriterion("ba_createno is not null");
            return (Criteria) this;
        }

        public Criteria andBa_createnoEqualTo(String value) {
            addCriterion("ba_createno =", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoNotEqualTo(String value) {
            addCriterion("ba_createno <>", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoGreaterThan(String value) {
            addCriterion("ba_createno >", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("ba_createno >=", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoLessThan(String value) {
            addCriterion("ba_createno <", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoLessThanOrEqualTo(String value) {
            addCriterion("ba_createno <=", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoLike(String value) {
            addCriterion("ba_createno like", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoNotLike(String value) {
            addCriterion("ba_createno not like", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoIn(List<String> values) {
            addCriterion("ba_createno in", values, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoNotIn(List<String> values) {
            addCriterion("ba_createno not in", values, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoBetween(String value1, String value2) {
            addCriterion("ba_createno between", value1, value2, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoNotBetween(String value1, String value2) {
            addCriterion("ba_createno not between", value1, value2, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createdateIsNull() {
            addCriterion("ba_createdate is null");
            return (Criteria) this;
        }

        public Criteria andBa_createdateIsNotNull() {
            addCriterion("ba_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andBa_createdateEqualTo(Date value) {
            addCriterion("ba_createdate =", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateNotEqualTo(Date value) {
            addCriterion("ba_createdate <>", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateGreaterThan(Date value) {
            addCriterion("ba_createdate >", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ba_createdate >=", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateLessThan(Date value) {
            addCriterion("ba_createdate <", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateLessThanOrEqualTo(Date value) {
            addCriterion("ba_createdate <=", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateIn(List<Date> values) {
            addCriterion("ba_createdate in", values, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateNotIn(List<Date> values) {
            addCriterion("ba_createdate not in", values, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateBetween(Date value1, Date value2) {
            addCriterion("ba_createdate between", value1, value2, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateNotBetween(Date value1, Date value2) {
            addCriterion("ba_createdate not between", value1, value2, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidIsNull() {
            addCriterion("ba_confirmid is null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidIsNotNull() {
            addCriterion("ba_confirmid is not null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidEqualTo(Long value) {
            addCriterion("ba_confirmid =", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidNotEqualTo(Long value) {
            addCriterion("ba_confirmid <>", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidGreaterThan(Long value) {
            addCriterion("ba_confirmid >", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidGreaterThanOrEqualTo(Long value) {
            addCriterion("ba_confirmid >=", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidLessThan(Long value) {
            addCriterion("ba_confirmid <", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidLessThanOrEqualTo(Long value) {
            addCriterion("ba_confirmid <=", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidIn(List<Long> values) {
            addCriterion("ba_confirmid in", values, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidNotIn(List<Long> values) {
            addCriterion("ba_confirmid not in", values, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidBetween(Long value1, Long value2) {
            addCriterion("ba_confirmid between", value1, value2, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidNotBetween(Long value1, Long value2) {
            addCriterion("ba_confirmid not between", value1, value2, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoIsNull() {
            addCriterion("ba_confirmno is null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoIsNotNull() {
            addCriterion("ba_confirmno is not null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoEqualTo(String value) {
            addCriterion("ba_confirmno =", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoNotEqualTo(String value) {
            addCriterion("ba_confirmno <>", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoGreaterThan(String value) {
            addCriterion("ba_confirmno >", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("ba_confirmno >=", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoLessThan(String value) {
            addCriterion("ba_confirmno <", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoLessThanOrEqualTo(String value) {
            addCriterion("ba_confirmno <=", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoLike(String value) {
            addCriterion("ba_confirmno like", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoNotLike(String value) {
            addCriterion("ba_confirmno not like", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoIn(List<String> values) {
            addCriterion("ba_confirmno in", values, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoNotIn(List<String> values) {
            addCriterion("ba_confirmno not in", values, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoBetween(String value1, String value2) {
            addCriterion("ba_confirmno between", value1, value2, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoNotBetween(String value1, String value2) {
            addCriterion("ba_confirmno not between", value1, value2, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateIsNull() {
            addCriterion("ba_confirmdate is null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateIsNotNull() {
            addCriterion("ba_confirmdate is not null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateEqualTo(Date value) {
            addCriterion("ba_confirmdate =", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateNotEqualTo(Date value) {
            addCriterion("ba_confirmdate <>", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateGreaterThan(Date value) {
            addCriterion("ba_confirmdate >", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ba_confirmdate >=", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateLessThan(Date value) {
            addCriterion("ba_confirmdate <", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateLessThanOrEqualTo(Date value) {
            addCriterion("ba_confirmdate <=", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateIn(List<Date> values) {
            addCriterion("ba_confirmdate in", values, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateNotIn(List<Date> values) {
            addCriterion("ba_confirmdate not in", values, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateBetween(Date value1, Date value2) {
            addCriterion("ba_confirmdate between", value1, value2, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateNotBetween(Date value1, Date value2) {
            addCriterion("ba_confirmdate not between", value1, value2, "ba_confirmdate");
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