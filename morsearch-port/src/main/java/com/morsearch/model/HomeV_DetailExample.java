package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class HomeV_DetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeV_DetailExample() {
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

        public Criteria andUr_idIsNull() {
            addCriterion("ur_id is null");
            return (Criteria) this;
        }

        public Criteria andUr_idIsNotNull() {
            addCriterion("ur_id is not null");
            return (Criteria) this;
        }

        public Criteria andUr_idEqualTo(Long value) {
            addCriterion("ur_id =", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idNotEqualTo(Long value) {
            addCriterion("ur_id <>", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idGreaterThan(Long value) {
            addCriterion("ur_id >", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ur_id >=", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idLessThan(Long value) {
            addCriterion("ur_id <", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idLessThanOrEqualTo(Long value) {
            addCriterion("ur_id <=", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idIn(List<Long> values) {
            addCriterion("ur_id in", values, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idNotIn(List<Long> values) {
            addCriterion("ur_id not in", values, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idBetween(Long value1, Long value2) {
            addCriterion("ur_id between", value1, value2, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idNotBetween(Long value1, Long value2) {
            addCriterion("ur_id not between", value1, value2, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_namenickIsNull() {
            addCriterion("ur_namenick is null");
            return (Criteria) this;
        }

        public Criteria andUr_namenickIsNotNull() {
            addCriterion("ur_namenick is not null");
            return (Criteria) this;
        }

        public Criteria andUr_namenickEqualTo(String value) {
            addCriterion("ur_namenick =", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickNotEqualTo(String value) {
            addCriterion("ur_namenick <>", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickGreaterThan(String value) {
            addCriterion("ur_namenick >", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickGreaterThanOrEqualTo(String value) {
            addCriterion("ur_namenick >=", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickLessThan(String value) {
            addCriterion("ur_namenick <", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickLessThanOrEqualTo(String value) {
            addCriterion("ur_namenick <=", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickLike(String value) {
            addCriterion("ur_namenick like", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickNotLike(String value) {
            addCriterion("ur_namenick not like", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickIn(List<String> values) {
            addCriterion("ur_namenick in", values, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickNotIn(List<String> values) {
            addCriterion("ur_namenick not in", values, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickBetween(String value1, String value2) {
            addCriterion("ur_namenick between", value1, value2, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickNotBetween(String value1, String value2) {
            addCriterion("ur_namenick not between", value1, value2, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeIsNull() {
            addCriterion("ue_teamlongitude is null");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeIsNotNull() {
            addCriterion("ue_teamlongitude is not null");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeEqualTo(String value) {
            addCriterion("ue_teamlongitude =", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeNotEqualTo(String value) {
            addCriterion("ue_teamlongitude <>", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeGreaterThan(String value) {
            addCriterion("ue_teamlongitude >", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_teamlongitude >=", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeLessThan(String value) {
            addCriterion("ue_teamlongitude <", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeLessThanOrEqualTo(String value) {
            addCriterion("ue_teamlongitude <=", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeLike(String value) {
            addCriterion("ue_teamlongitude like", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeNotLike(String value) {
            addCriterion("ue_teamlongitude not like", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeIn(List<String> values) {
            addCriterion("ue_teamlongitude in", values, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeNotIn(List<String> values) {
            addCriterion("ue_teamlongitude not in", values, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeBetween(String value1, String value2) {
            addCriterion("ue_teamlongitude between", value1, value2, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeNotBetween(String value1, String value2) {
            addCriterion("ue_teamlongitude not between", value1, value2, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeIsNull() {
            addCriterion("ue_teamlatitude is null");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeIsNotNull() {
            addCriterion("ue_teamlatitude is not null");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeEqualTo(String value) {
            addCriterion("ue_teamlatitude =", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeNotEqualTo(String value) {
            addCriterion("ue_teamlatitude <>", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeGreaterThan(String value) {
            addCriterion("ue_teamlatitude >", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_teamlatitude >=", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeLessThan(String value) {
            addCriterion("ue_teamlatitude <", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeLessThanOrEqualTo(String value) {
            addCriterion("ue_teamlatitude <=", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeLike(String value) {
            addCriterion("ue_teamlatitude like", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeNotLike(String value) {
            addCriterion("ue_teamlatitude not like", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeIn(List<String> values) {
            addCriterion("ue_teamlatitude in", values, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeNotIn(List<String> values) {
            addCriterion("ue_teamlatitude not in", values, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeBetween(String value1, String value2) {
            addCriterion("ue_teamlatitude between", value1, value2, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeNotBetween(String value1, String value2) {
            addCriterion("ue_teamlatitude not between", value1, value2, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeIsNull() {
            addCriterion("ue_companylongitude is null");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeIsNotNull() {
            addCriterion("ue_companylongitude is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeEqualTo(String value) {
            addCriterion("ue_companylongitude =", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeNotEqualTo(String value) {
            addCriterion("ue_companylongitude <>", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeGreaterThan(String value) {
            addCriterion("ue_companylongitude >", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companylongitude >=", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeLessThan(String value) {
            addCriterion("ue_companylongitude <", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeLessThanOrEqualTo(String value) {
            addCriterion("ue_companylongitude <=", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeLike(String value) {
            addCriterion("ue_companylongitude like", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeNotLike(String value) {
            addCriterion("ue_companylongitude not like", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeIn(List<String> values) {
            addCriterion("ue_companylongitude in", values, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeNotIn(List<String> values) {
            addCriterion("ue_companylongitude not in", values, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeBetween(String value1, String value2) {
            addCriterion("ue_companylongitude between", value1, value2, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeNotBetween(String value1, String value2) {
            addCriterion("ue_companylongitude not between", value1, value2, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeIsNull() {
            addCriterion("ue_companylatitude is null");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeIsNotNull() {
            addCriterion("ue_companylatitude is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeEqualTo(String value) {
            addCriterion("ue_companylatitude =", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeNotEqualTo(String value) {
            addCriterion("ue_companylatitude <>", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeGreaterThan(String value) {
            addCriterion("ue_companylatitude >", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companylatitude >=", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeLessThan(String value) {
            addCriterion("ue_companylatitude <", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeLessThanOrEqualTo(String value) {
            addCriterion("ue_companylatitude <=", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeLike(String value) {
            addCriterion("ue_companylatitude like", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeNotLike(String value) {
            addCriterion("ue_companylatitude not like", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeIn(List<String> values) {
            addCriterion("ue_companylatitude in", values, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeNotIn(List<String> values) {
            addCriterion("ue_companylatitude not in", values, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeBetween(String value1, String value2) {
            addCriterion("ue_companylatitude between", value1, value2, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeNotBetween(String value1, String value2) {
            addCriterion("ue_companylatitude not between", value1, value2, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companyidIsNull() {
            addCriterion("ue_companyid is null");
            return (Criteria) this;
        }

        public Criteria andUe_companyidIsNotNull() {
            addCriterion("ue_companyid is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companyidEqualTo(Integer value) {
            addCriterion("ue_companyid =", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidNotEqualTo(Integer value) {
            addCriterion("ue_companyid <>", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidGreaterThan(Integer value) {
            addCriterion("ue_companyid >", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ue_companyid >=", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidLessThan(Integer value) {
            addCriterion("ue_companyid <", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidLessThanOrEqualTo(Integer value) {
            addCriterion("ue_companyid <=", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidIn(List<Integer> values) {
            addCriterion("ue_companyid in", values, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidNotIn(List<Integer> values) {
            addCriterion("ue_companyid not in", values, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidBetween(Integer value1, Integer value2) {
            addCriterion("ue_companyid between", value1, value2, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidNotBetween(Integer value1, Integer value2) {
            addCriterion("ue_companyid not between", value1, value2, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companynameIsNull() {
            addCriterion("ue_companyname is null");
            return (Criteria) this;
        }

        public Criteria andUe_companynameIsNotNull() {
            addCriterion("ue_companyname is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companynameEqualTo(String value) {
            addCriterion("ue_companyname =", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotEqualTo(String value) {
            addCriterion("ue_companyname <>", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameGreaterThan(String value) {
            addCriterion("ue_companyname >", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companyname >=", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameLessThan(String value) {
            addCriterion("ue_companyname <", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameLessThanOrEqualTo(String value) {
            addCriterion("ue_companyname <=", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameLike(String value) {
            addCriterion("ue_companyname like", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotLike(String value) {
            addCriterion("ue_companyname not like", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameIn(List<String> values) {
            addCriterion("ue_companyname in", values, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotIn(List<String> values) {
            addCriterion("ue_companyname not in", values, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameBetween(String value1, String value2) {
            addCriterion("ue_companyname between", value1, value2, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotBetween(String value1, String value2) {
            addCriterion("ue_companyname not between", value1, value2, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitIsNull() {
            addCriterion("ue_companyunit is null");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitIsNotNull() {
            addCriterion("ue_companyunit is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitEqualTo(String value) {
            addCriterion("ue_companyunit =", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotEqualTo(String value) {
            addCriterion("ue_companyunit <>", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitGreaterThan(String value) {
            addCriterion("ue_companyunit >", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companyunit >=", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitLessThan(String value) {
            addCriterion("ue_companyunit <", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitLessThanOrEqualTo(String value) {
            addCriterion("ue_companyunit <=", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitLike(String value) {
            addCriterion("ue_companyunit like", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotLike(String value) {
            addCriterion("ue_companyunit not like", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitIn(List<String> values) {
            addCriterion("ue_companyunit in", values, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotIn(List<String> values) {
            addCriterion("ue_companyunit not in", values, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitBetween(String value1, String value2) {
            addCriterion("ue_companyunit between", value1, value2, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotBetween(String value1, String value2) {
            addCriterion("ue_companyunit not between", value1, value2, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrIsNull() {
            addCriterion("ue_companyaddr is null");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrIsNotNull() {
            addCriterion("ue_companyaddr is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrEqualTo(String value) {
            addCriterion("ue_companyaddr =", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrNotEqualTo(String value) {
            addCriterion("ue_companyaddr <>", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrGreaterThan(String value) {
            addCriterion("ue_companyaddr >", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companyaddr >=", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrLessThan(String value) {
            addCriterion("ue_companyaddr <", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrLessThanOrEqualTo(String value) {
            addCriterion("ue_companyaddr <=", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrLike(String value) {
            addCriterion("ue_companyaddr like", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrNotLike(String value) {
            addCriterion("ue_companyaddr not like", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrIn(List<String> values) {
            addCriterion("ue_companyaddr in", values, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrNotIn(List<String> values) {
            addCriterion("ue_companyaddr not in", values, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrBetween(String value1, String value2) {
            addCriterion("ue_companyaddr between", value1, value2, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrNotBetween(String value1, String value2) {
            addCriterion("ue_companyaddr not between", value1, value2, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeIsNull() {
            addCriterion("ue_companytype is null");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeIsNotNull() {
            addCriterion("ue_companytype is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeEqualTo(String value) {
            addCriterion("ue_companytype =", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeNotEqualTo(String value) {
            addCriterion("ue_companytype <>", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeGreaterThan(String value) {
            addCriterion("ue_companytype >", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companytype >=", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeLessThan(String value) {
            addCriterion("ue_companytype <", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeLessThanOrEqualTo(String value) {
            addCriterion("ue_companytype <=", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeLike(String value) {
            addCriterion("ue_companytype like", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeNotLike(String value) {
            addCriterion("ue_companytype not like", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeIn(List<String> values) {
            addCriterion("ue_companytype in", values, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeNotIn(List<String> values) {
            addCriterion("ue_companytype not in", values, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeBetween(String value1, String value2) {
            addCriterion("ue_companytype between", value1, value2, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeNotBetween(String value1, String value2) {
            addCriterion("ue_companytype not between", value1, value2, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorIsNull() {
            addCriterion("ue_personmajor is null");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorIsNotNull() {
            addCriterion("ue_personmajor is not null");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorEqualTo(String value) {
            addCriterion("ue_personmajor =", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotEqualTo(String value) {
            addCriterion("ue_personmajor <>", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorGreaterThan(String value) {
            addCriterion("ue_personmajor >", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorGreaterThanOrEqualTo(String value) {
            addCriterion("ue_personmajor >=", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorLessThan(String value) {
            addCriterion("ue_personmajor <", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorLessThanOrEqualTo(String value) {
            addCriterion("ue_personmajor <=", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorLike(String value) {
            addCriterion("ue_personmajor like", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotLike(String value) {
            addCriterion("ue_personmajor not like", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorIn(List<String> values) {
            addCriterion("ue_personmajor in", values, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotIn(List<String> values) {
            addCriterion("ue_personmajor not in", values, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorBetween(String value1, String value2) {
            addCriterion("ue_personmajor between", value1, value2, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotBetween(String value1, String value2) {
            addCriterion("ue_personmajor not between", value1, value2, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUm_countneedIsNull() {
            addCriterion("um_countneed is null");
            return (Criteria) this;
        }

        public Criteria andUm_countneedIsNotNull() {
            addCriterion("um_countneed is not null");
            return (Criteria) this;
        }

        public Criteria andUm_countneedEqualTo(Integer value) {
            addCriterion("um_countneed =", value, "um_countneed");
            return (Criteria) this;
        }

        public Criteria andUm_countneedNotEqualTo(Integer value) {
            addCriterion("um_countneed <>", value, "um_countneed");
            return (Criteria) this;
        }

        public Criteria andUm_countneedGreaterThan(Integer value) {
            addCriterion("um_countneed >", value, "um_countneed");
            return (Criteria) this;
        }

        public Criteria andUm_countneedGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_countneed >=", value, "um_countneed");
            return (Criteria) this;
        }

        public Criteria andUm_countneedLessThan(Integer value) {
            addCriterion("um_countneed <", value, "um_countneed");
            return (Criteria) this;
        }

        public Criteria andUm_countneedLessThanOrEqualTo(Integer value) {
            addCriterion("um_countneed <=", value, "um_countneed");
            return (Criteria) this;
        }

        public Criteria andUm_countneedIn(List<Integer> values) {
            addCriterion("um_countneed in", values, "um_countneed");
            return (Criteria) this;
        }

        public Criteria andUm_countneedNotIn(List<Integer> values) {
            addCriterion("um_countneed not in", values, "um_countneed");
            return (Criteria) this;
        }

        public Criteria andUm_countneedBetween(Integer value1, Integer value2) {
            addCriterion("um_countneed between", value1, value2, "um_countneed");
            return (Criteria) this;
        }

        public Criteria andUm_countneedNotBetween(Integer value1, Integer value2) {
            addCriterion("um_countneed not between", value1, value2, "um_countneed");
            return (Criteria) this;
        }

        public Criteria andUm_countorderIsNull() {
            addCriterion("um_countorder is null");
            return (Criteria) this;
        }

        public Criteria andUm_countorderIsNotNull() {
            addCriterion("um_countorder is not null");
            return (Criteria) this;
        }

        public Criteria andUm_countorderEqualTo(Integer value) {
            addCriterion("um_countorder =", value, "um_countorder");
            return (Criteria) this;
        }

        public Criteria andUm_countorderNotEqualTo(Integer value) {
            addCriterion("um_countorder <>", value, "um_countorder");
            return (Criteria) this;
        }

        public Criteria andUm_countorderGreaterThan(Integer value) {
            addCriterion("um_countorder >", value, "um_countorder");
            return (Criteria) this;
        }

        public Criteria andUm_countorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_countorder >=", value, "um_countorder");
            return (Criteria) this;
        }

        public Criteria andUm_countorderLessThan(Integer value) {
            addCriterion("um_countorder <", value, "um_countorder");
            return (Criteria) this;
        }

        public Criteria andUm_countorderLessThanOrEqualTo(Integer value) {
            addCriterion("um_countorder <=", value, "um_countorder");
            return (Criteria) this;
        }

        public Criteria andUm_countorderIn(List<Integer> values) {
            addCriterion("um_countorder in", values, "um_countorder");
            return (Criteria) this;
        }

        public Criteria andUm_countorderNotIn(List<Integer> values) {
            addCriterion("um_countorder not in", values, "um_countorder");
            return (Criteria) this;
        }

        public Criteria andUm_countorderBetween(Integer value1, Integer value2) {
            addCriterion("um_countorder between", value1, value2, "um_countorder");
            return (Criteria) this;
        }

        public Criteria andUm_countorderNotBetween(Integer value1, Integer value2) {
            addCriterion("um_countorder not between", value1, value2, "um_countorder");
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