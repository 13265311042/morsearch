package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Desig_EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Desig_EvaluateExample() {
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

        public Criteria andDe_idIsNull() {
            addCriterion("de_id is null");
            return (Criteria) this;
        }

        public Criteria andDe_idIsNotNull() {
            addCriterion("de_id is not null");
            return (Criteria) this;
        }

        public Criteria andDe_idEqualTo(Long value) {
            addCriterion("de_id =", value, "de_id");
            return (Criteria) this;
        }

        public Criteria andDe_idNotEqualTo(Long value) {
            addCriterion("de_id <>", value, "de_id");
            return (Criteria) this;
        }

        public Criteria andDe_idGreaterThan(Long value) {
            addCriterion("de_id >", value, "de_id");
            return (Criteria) this;
        }

        public Criteria andDe_idGreaterThanOrEqualTo(Long value) {
            addCriterion("de_id >=", value, "de_id");
            return (Criteria) this;
        }

        public Criteria andDe_idLessThan(Long value) {
            addCriterion("de_id <", value, "de_id");
            return (Criteria) this;
        }

        public Criteria andDe_idLessThanOrEqualTo(Long value) {
            addCriterion("de_id <=", value, "de_id");
            return (Criteria) this;
        }

        public Criteria andDe_idIn(List<Long> values) {
            addCriterion("de_id in", values, "de_id");
            return (Criteria) this;
        }

        public Criteria andDe_idNotIn(List<Long> values) {
            addCriterion("de_id not in", values, "de_id");
            return (Criteria) this;
        }

        public Criteria andDe_idBetween(Long value1, Long value2) {
            addCriterion("de_id between", value1, value2, "de_id");
            return (Criteria) this;
        }

        public Criteria andDe_idNotBetween(Long value1, Long value2) {
            addCriterion("de_id not between", value1, value2, "de_id");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoIsNull() {
            addCriterion("de_orderno is null");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoIsNotNull() {
            addCriterion("de_orderno is not null");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoEqualTo(String value) {
            addCriterion("de_orderno =", value, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoNotEqualTo(String value) {
            addCriterion("de_orderno <>", value, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoGreaterThan(String value) {
            addCriterion("de_orderno >", value, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoGreaterThanOrEqualTo(String value) {
            addCriterion("de_orderno >=", value, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoLessThan(String value) {
            addCriterion("de_orderno <", value, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoLessThanOrEqualTo(String value) {
            addCriterion("de_orderno <=", value, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoLike(String value) {
            addCriterion("de_orderno like", value, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoNotLike(String value) {
            addCriterion("de_orderno not like", value, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoIn(List<String> values) {
            addCriterion("de_orderno in", values, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoNotIn(List<String> values) {
            addCriterion("de_orderno not in", values, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoBetween(String value1, String value2) {
            addCriterion("de_orderno between", value1, value2, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_ordernoNotBetween(String value1, String value2) {
            addCriterion("de_orderno not between", value1, value2, "de_orderno");
            return (Criteria) this;
        }

        public Criteria andDe_designeridIsNull() {
            addCriterion("de_designerid is null");
            return (Criteria) this;
        }

        public Criteria andDe_designeridIsNotNull() {
            addCriterion("de_designerid is not null");
            return (Criteria) this;
        }

        public Criteria andDe_designeridEqualTo(Long value) {
            addCriterion("de_designerid =", value, "de_designerid");
            return (Criteria) this;
        }

        public Criteria andDe_designeridNotEqualTo(Long value) {
            addCriterion("de_designerid <>", value, "de_designerid");
            return (Criteria) this;
        }

        public Criteria andDe_designeridGreaterThan(Long value) {
            addCriterion("de_designerid >", value, "de_designerid");
            return (Criteria) this;
        }

        public Criteria andDe_designeridGreaterThanOrEqualTo(Long value) {
            addCriterion("de_designerid >=", value, "de_designerid");
            return (Criteria) this;
        }

        public Criteria andDe_designeridLessThan(Long value) {
            addCriterion("de_designerid <", value, "de_designerid");
            return (Criteria) this;
        }

        public Criteria andDe_designeridLessThanOrEqualTo(Long value) {
            addCriterion("de_designerid <=", value, "de_designerid");
            return (Criteria) this;
        }

        public Criteria andDe_designeridIn(List<Long> values) {
            addCriterion("de_designerid in", values, "de_designerid");
            return (Criteria) this;
        }

        public Criteria andDe_designeridNotIn(List<Long> values) {
            addCriterion("de_designerid not in", values, "de_designerid");
            return (Criteria) this;
        }

        public Criteria andDe_designeridBetween(Long value1, Long value2) {
            addCriterion("de_designerid between", value1, value2, "de_designerid");
            return (Criteria) this;
        }

        public Criteria andDe_designeridNotBetween(Long value1, Long value2) {
            addCriterion("de_designerid not between", value1, value2, "de_designerid");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserIsNull() {
            addCriterion("de_appraiser is null");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserIsNotNull() {
            addCriterion("de_appraiser is not null");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserEqualTo(String value) {
            addCriterion("de_appraiser =", value, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserNotEqualTo(String value) {
            addCriterion("de_appraiser <>", value, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserGreaterThan(String value) {
            addCriterion("de_appraiser >", value, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserGreaterThanOrEqualTo(String value) {
            addCriterion("de_appraiser >=", value, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserLessThan(String value) {
            addCriterion("de_appraiser <", value, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserLessThanOrEqualTo(String value) {
            addCriterion("de_appraiser <=", value, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserLike(String value) {
            addCriterion("de_appraiser like", value, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserNotLike(String value) {
            addCriterion("de_appraiser not like", value, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserIn(List<String> values) {
            addCriterion("de_appraiser in", values, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserNotIn(List<String> values) {
            addCriterion("de_appraiser not in", values, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserBetween(String value1, String value2) {
            addCriterion("de_appraiser between", value1, value2, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiserNotBetween(String value1, String value2) {
            addCriterion("de_appraiser not between", value1, value2, "de_appraiser");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageIsNull() {
            addCriterion("de_appraiseimage is null");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageIsNotNull() {
            addCriterion("de_appraiseimage is not null");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageEqualTo(String value) {
            addCriterion("de_appraiseimage =", value, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageNotEqualTo(String value) {
            addCriterion("de_appraiseimage <>", value, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageGreaterThan(String value) {
            addCriterion("de_appraiseimage >", value, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageGreaterThanOrEqualTo(String value) {
            addCriterion("de_appraiseimage >=", value, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageLessThan(String value) {
            addCriterion("de_appraiseimage <", value, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageLessThanOrEqualTo(String value) {
            addCriterion("de_appraiseimage <=", value, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageLike(String value) {
            addCriterion("de_appraiseimage like", value, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageNotLike(String value) {
            addCriterion("de_appraiseimage not like", value, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageIn(List<String> values) {
            addCriterion("de_appraiseimage in", values, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageNotIn(List<String> values) {
            addCriterion("de_appraiseimage not in", values, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageBetween(String value1, String value2) {
            addCriterion("de_appraiseimage between", value1, value2, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_appraiseimageNotBetween(String value1, String value2) {
            addCriterion("de_appraiseimage not between", value1, value2, "de_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityIsNull() {
            addCriterion("de_anonymity is null");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityIsNotNull() {
            addCriterion("de_anonymity is not null");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityEqualTo(Boolean value) {
            addCriterion("de_anonymity =", value, "de_anonymity");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityNotEqualTo(Boolean value) {
            addCriterion("de_anonymity <>", value, "de_anonymity");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityGreaterThan(Boolean value) {
            addCriterion("de_anonymity >", value, "de_anonymity");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("de_anonymity >=", value, "de_anonymity");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityLessThan(Boolean value) {
            addCriterion("de_anonymity <", value, "de_anonymity");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityLessThanOrEqualTo(Boolean value) {
            addCriterion("de_anonymity <=", value, "de_anonymity");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityIn(List<Boolean> values) {
            addCriterion("de_anonymity in", values, "de_anonymity");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityNotIn(List<Boolean> values) {
            addCriterion("de_anonymity not in", values, "de_anonymity");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityBetween(Boolean value1, Boolean value2) {
            addCriterion("de_anonymity between", value1, value2, "de_anonymity");
            return (Criteria) this;
        }

        public Criteria andDe_anonymityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("de_anonymity not between", value1, value2, "de_anonymity");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupIsNull() {
            addCriterion("de_contentgroup is null");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupIsNotNull() {
            addCriterion("de_contentgroup is not null");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupEqualTo(String value) {
            addCriterion("de_contentgroup =", value, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupNotEqualTo(String value) {
            addCriterion("de_contentgroup <>", value, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupGreaterThan(String value) {
            addCriterion("de_contentgroup >", value, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupGreaterThanOrEqualTo(String value) {
            addCriterion("de_contentgroup >=", value, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupLessThan(String value) {
            addCriterion("de_contentgroup <", value, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupLessThanOrEqualTo(String value) {
            addCriterion("de_contentgroup <=", value, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupLike(String value) {
            addCriterion("de_contentgroup like", value, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupNotLike(String value) {
            addCriterion("de_contentgroup not like", value, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupIn(List<String> values) {
            addCriterion("de_contentgroup in", values, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupNotIn(List<String> values) {
            addCriterion("de_contentgroup not in", values, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupBetween(String value1, String value2) {
            addCriterion("de_contentgroup between", value1, value2, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgroupNotBetween(String value1, String value2) {
            addCriterion("de_contentgroup not between", value1, value2, "de_contentgroup");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeIsNull() {
            addCriterion("de_contentgrade is null");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeIsNotNull() {
            addCriterion("de_contentgrade is not null");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeEqualTo(String value) {
            addCriterion("de_contentgrade =", value, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeNotEqualTo(String value) {
            addCriterion("de_contentgrade <>", value, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeGreaterThan(String value) {
            addCriterion("de_contentgrade >", value, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeGreaterThanOrEqualTo(String value) {
            addCriterion("de_contentgrade >=", value, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeLessThan(String value) {
            addCriterion("de_contentgrade <", value, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeLessThanOrEqualTo(String value) {
            addCriterion("de_contentgrade <=", value, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeLike(String value) {
            addCriterion("de_contentgrade like", value, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeNotLike(String value) {
            addCriterion("de_contentgrade not like", value, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeIn(List<String> values) {
            addCriterion("de_contentgrade in", values, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeNotIn(List<String> values) {
            addCriterion("de_contentgrade not in", values, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeBetween(String value1, String value2) {
            addCriterion("de_contentgrade between", value1, value2, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentgradeNotBetween(String value1, String value2) {
            addCriterion("de_contentgrade not between", value1, value2, "de_contentgrade");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueIsNull() {
            addCriterion("de_contentvalue is null");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueIsNotNull() {
            addCriterion("de_contentvalue is not null");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueEqualTo(String value) {
            addCriterion("de_contentvalue =", value, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueNotEqualTo(String value) {
            addCriterion("de_contentvalue <>", value, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueGreaterThan(String value) {
            addCriterion("de_contentvalue >", value, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueGreaterThanOrEqualTo(String value) {
            addCriterion("de_contentvalue >=", value, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueLessThan(String value) {
            addCriterion("de_contentvalue <", value, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueLessThanOrEqualTo(String value) {
            addCriterion("de_contentvalue <=", value, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueLike(String value) {
            addCriterion("de_contentvalue like", value, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueNotLike(String value) {
            addCriterion("de_contentvalue not like", value, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueIn(List<String> values) {
            addCriterion("de_contentvalue in", values, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueNotIn(List<String> values) {
            addCriterion("de_contentvalue not in", values, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueBetween(String value1, String value2) {
            addCriterion("de_contentvalue between", value1, value2, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_contentvalueNotBetween(String value1, String value2) {
            addCriterion("de_contentvalue not between", value1, value2, "de_contentvalue");
            return (Criteria) this;
        }

        public Criteria andDe_createidIsNull() {
            addCriterion("de_createid is null");
            return (Criteria) this;
        }

        public Criteria andDe_createidIsNotNull() {
            addCriterion("de_createid is not null");
            return (Criteria) this;
        }

        public Criteria andDe_createidEqualTo(Long value) {
            addCriterion("de_createid =", value, "de_createid");
            return (Criteria) this;
        }

        public Criteria andDe_createidNotEqualTo(Long value) {
            addCriterion("de_createid <>", value, "de_createid");
            return (Criteria) this;
        }

        public Criteria andDe_createidGreaterThan(Long value) {
            addCriterion("de_createid >", value, "de_createid");
            return (Criteria) this;
        }

        public Criteria andDe_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("de_createid >=", value, "de_createid");
            return (Criteria) this;
        }

        public Criteria andDe_createidLessThan(Long value) {
            addCriterion("de_createid <", value, "de_createid");
            return (Criteria) this;
        }

        public Criteria andDe_createidLessThanOrEqualTo(Long value) {
            addCriterion("de_createid <=", value, "de_createid");
            return (Criteria) this;
        }

        public Criteria andDe_createidIn(List<Long> values) {
            addCriterion("de_createid in", values, "de_createid");
            return (Criteria) this;
        }

        public Criteria andDe_createidNotIn(List<Long> values) {
            addCriterion("de_createid not in", values, "de_createid");
            return (Criteria) this;
        }

        public Criteria andDe_createidBetween(Long value1, Long value2) {
            addCriterion("de_createid between", value1, value2, "de_createid");
            return (Criteria) this;
        }

        public Criteria andDe_createidNotBetween(Long value1, Long value2) {
            addCriterion("de_createid not between", value1, value2, "de_createid");
            return (Criteria) this;
        }

        public Criteria andDe_createnoIsNull() {
            addCriterion("de_createno is null");
            return (Criteria) this;
        }

        public Criteria andDe_createnoIsNotNull() {
            addCriterion("de_createno is not null");
            return (Criteria) this;
        }

        public Criteria andDe_createnoEqualTo(String value) {
            addCriterion("de_createno =", value, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createnoNotEqualTo(String value) {
            addCriterion("de_createno <>", value, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createnoGreaterThan(String value) {
            addCriterion("de_createno >", value, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("de_createno >=", value, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createnoLessThan(String value) {
            addCriterion("de_createno <", value, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createnoLessThanOrEqualTo(String value) {
            addCriterion("de_createno <=", value, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createnoLike(String value) {
            addCriterion("de_createno like", value, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createnoNotLike(String value) {
            addCriterion("de_createno not like", value, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createnoIn(List<String> values) {
            addCriterion("de_createno in", values, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createnoNotIn(List<String> values) {
            addCriterion("de_createno not in", values, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createnoBetween(String value1, String value2) {
            addCriterion("de_createno between", value1, value2, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createnoNotBetween(String value1, String value2) {
            addCriterion("de_createno not between", value1, value2, "de_createno");
            return (Criteria) this;
        }

        public Criteria andDe_createdateIsNull() {
            addCriterion("de_createdate is null");
            return (Criteria) this;
        }

        public Criteria andDe_createdateIsNotNull() {
            addCriterion("de_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andDe_createdateEqualTo(Date value) {
            addCriterion("de_createdate =", value, "de_createdate");
            return (Criteria) this;
        }

        public Criteria andDe_createdateNotEqualTo(Date value) {
            addCriterion("de_createdate <>", value, "de_createdate");
            return (Criteria) this;
        }

        public Criteria andDe_createdateGreaterThan(Date value) {
            addCriterion("de_createdate >", value, "de_createdate");
            return (Criteria) this;
        }

        public Criteria andDe_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("de_createdate >=", value, "de_createdate");
            return (Criteria) this;
        }

        public Criteria andDe_createdateLessThan(Date value) {
            addCriterion("de_createdate <", value, "de_createdate");
            return (Criteria) this;
        }

        public Criteria andDe_createdateLessThanOrEqualTo(Date value) {
            addCriterion("de_createdate <=", value, "de_createdate");
            return (Criteria) this;
        }

        public Criteria andDe_createdateIn(List<Date> values) {
            addCriterion("de_createdate in", values, "de_createdate");
            return (Criteria) this;
        }

        public Criteria andDe_createdateNotIn(List<Date> values) {
            addCriterion("de_createdate not in", values, "de_createdate");
            return (Criteria) this;
        }

        public Criteria andDe_createdateBetween(Date value1, Date value2) {
            addCriterion("de_createdate between", value1, value2, "de_createdate");
            return (Criteria) this;
        }

        public Criteria andDe_createdateNotBetween(Date value1, Date value2) {
            addCriterion("de_createdate not between", value1, value2, "de_createdate");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidIsNull() {
            addCriterion("de_confirmid is null");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidIsNotNull() {
            addCriterion("de_confirmid is not null");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidEqualTo(Long value) {
            addCriterion("de_confirmid =", value, "de_confirmid");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidNotEqualTo(Long value) {
            addCriterion("de_confirmid <>", value, "de_confirmid");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidGreaterThan(Long value) {
            addCriterion("de_confirmid >", value, "de_confirmid");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidGreaterThanOrEqualTo(Long value) {
            addCriterion("de_confirmid >=", value, "de_confirmid");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidLessThan(Long value) {
            addCriterion("de_confirmid <", value, "de_confirmid");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidLessThanOrEqualTo(Long value) {
            addCriterion("de_confirmid <=", value, "de_confirmid");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidIn(List<Long> values) {
            addCriterion("de_confirmid in", values, "de_confirmid");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidNotIn(List<Long> values) {
            addCriterion("de_confirmid not in", values, "de_confirmid");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidBetween(Long value1, Long value2) {
            addCriterion("de_confirmid between", value1, value2, "de_confirmid");
            return (Criteria) this;
        }

        public Criteria andDe_confirmidNotBetween(Long value1, Long value2) {
            addCriterion("de_confirmid not between", value1, value2, "de_confirmid");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoIsNull() {
            addCriterion("de_confirmno is null");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoIsNotNull() {
            addCriterion("de_confirmno is not null");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoEqualTo(String value) {
            addCriterion("de_confirmno =", value, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoNotEqualTo(String value) {
            addCriterion("de_confirmno <>", value, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoGreaterThan(String value) {
            addCriterion("de_confirmno >", value, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("de_confirmno >=", value, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoLessThan(String value) {
            addCriterion("de_confirmno <", value, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoLessThanOrEqualTo(String value) {
            addCriterion("de_confirmno <=", value, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoLike(String value) {
            addCriterion("de_confirmno like", value, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoNotLike(String value) {
            addCriterion("de_confirmno not like", value, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoIn(List<String> values) {
            addCriterion("de_confirmno in", values, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoNotIn(List<String> values) {
            addCriterion("de_confirmno not in", values, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoBetween(String value1, String value2) {
            addCriterion("de_confirmno between", value1, value2, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmnoNotBetween(String value1, String value2) {
            addCriterion("de_confirmno not between", value1, value2, "de_confirmno");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateIsNull() {
            addCriterion("de_confirmdate is null");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateIsNotNull() {
            addCriterion("de_confirmdate is not null");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateEqualTo(Date value) {
            addCriterion("de_confirmdate =", value, "de_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateNotEqualTo(Date value) {
            addCriterion("de_confirmdate <>", value, "de_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateGreaterThan(Date value) {
            addCriterion("de_confirmdate >", value, "de_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("de_confirmdate >=", value, "de_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateLessThan(Date value) {
            addCriterion("de_confirmdate <", value, "de_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateLessThanOrEqualTo(Date value) {
            addCriterion("de_confirmdate <=", value, "de_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateIn(List<Date> values) {
            addCriterion("de_confirmdate in", values, "de_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateNotIn(List<Date> values) {
            addCriterion("de_confirmdate not in", values, "de_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateBetween(Date value1, Date value2) {
            addCriterion("de_confirmdate between", value1, value2, "de_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDe_confirmdateNotBetween(Date value1, Date value2) {
            addCriterion("de_confirmdate not between", value1, value2, "de_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDe_statusIsNull() {
            addCriterion("de_status is null");
            return (Criteria) this;
        }

        public Criteria andDe_statusIsNotNull() {
            addCriterion("de_status is not null");
            return (Criteria) this;
        }

        public Criteria andDe_statusEqualTo(Byte value) {
            addCriterion("de_status =", value, "de_status");
            return (Criteria) this;
        }

        public Criteria andDe_statusNotEqualTo(Byte value) {
            addCriterion("de_status <>", value, "de_status");
            return (Criteria) this;
        }

        public Criteria andDe_statusGreaterThan(Byte value) {
            addCriterion("de_status >", value, "de_status");
            return (Criteria) this;
        }

        public Criteria andDe_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("de_status >=", value, "de_status");
            return (Criteria) this;
        }

        public Criteria andDe_statusLessThan(Byte value) {
            addCriterion("de_status <", value, "de_status");
            return (Criteria) this;
        }

        public Criteria andDe_statusLessThanOrEqualTo(Byte value) {
            addCriterion("de_status <=", value, "de_status");
            return (Criteria) this;
        }

        public Criteria andDe_statusIn(List<Byte> values) {
            addCriterion("de_status in", values, "de_status");
            return (Criteria) this;
        }

        public Criteria andDe_statusNotIn(List<Byte> values) {
            addCriterion("de_status not in", values, "de_status");
            return (Criteria) this;
        }

        public Criteria andDe_statusBetween(Byte value1, Byte value2) {
            addCriterion("de_status between", value1, value2, "de_status");
            return (Criteria) this;
        }

        public Criteria andDe_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("de_status not between", value1, value2, "de_status");
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