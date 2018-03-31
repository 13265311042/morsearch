package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sales_EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sales_EvaluateExample() {
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

        public Criteria andSe_idIsNull() {
            addCriterion("se_id is null");
            return (Criteria) this;
        }

        public Criteria andSe_idIsNotNull() {
            addCriterion("se_id is not null");
            return (Criteria) this;
        }

        public Criteria andSe_idEqualTo(Long value) {
            addCriterion("se_id =", value, "se_id");
            return (Criteria) this;
        }

        public Criteria andSe_idNotEqualTo(Long value) {
            addCriterion("se_id <>", value, "se_id");
            return (Criteria) this;
        }

        public Criteria andSe_idGreaterThan(Long value) {
            addCriterion("se_id >", value, "se_id");
            return (Criteria) this;
        }

        public Criteria andSe_idGreaterThanOrEqualTo(Long value) {
            addCriterion("se_id >=", value, "se_id");
            return (Criteria) this;
        }

        public Criteria andSe_idLessThan(Long value) {
            addCriterion("se_id <", value, "se_id");
            return (Criteria) this;
        }

        public Criteria andSe_idLessThanOrEqualTo(Long value) {
            addCriterion("se_id <=", value, "se_id");
            return (Criteria) this;
        }

        public Criteria andSe_idIn(List<Long> values) {
            addCriterion("se_id in", values, "se_id");
            return (Criteria) this;
        }

        public Criteria andSe_idNotIn(List<Long> values) {
            addCriterion("se_id not in", values, "se_id");
            return (Criteria) this;
        }

        public Criteria andSe_idBetween(Long value1, Long value2) {
            addCriterion("se_id between", value1, value2, "se_id");
            return (Criteria) this;
        }

        public Criteria andSe_idNotBetween(Long value1, Long value2) {
            addCriterion("se_id not between", value1, value2, "se_id");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoIsNull() {
            addCriterion("se_orderno is null");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoIsNotNull() {
            addCriterion("se_orderno is not null");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoEqualTo(String value) {
            addCriterion("se_orderno =", value, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoNotEqualTo(String value) {
            addCriterion("se_orderno <>", value, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoGreaterThan(String value) {
            addCriterion("se_orderno >", value, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoGreaterThanOrEqualTo(String value) {
            addCriterion("se_orderno >=", value, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoLessThan(String value) {
            addCriterion("se_orderno <", value, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoLessThanOrEqualTo(String value) {
            addCriterion("se_orderno <=", value, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoLike(String value) {
            addCriterion("se_orderno like", value, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoNotLike(String value) {
            addCriterion("se_orderno not like", value, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoIn(List<String> values) {
            addCriterion("se_orderno in", values, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoNotIn(List<String> values) {
            addCriterion("se_orderno not in", values, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoBetween(String value1, String value2) {
            addCriterion("se_orderno between", value1, value2, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_ordernoNotBetween(String value1, String value2) {
            addCriterion("se_orderno not between", value1, value2, "se_orderno");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidIsNull() {
            addCriterion("se_salesmanid is null");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidIsNotNull() {
            addCriterion("se_salesmanid is not null");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidEqualTo(Long value) {
            addCriterion("se_salesmanid =", value, "se_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidNotEqualTo(Long value) {
            addCriterion("se_salesmanid <>", value, "se_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidGreaterThan(Long value) {
            addCriterion("se_salesmanid >", value, "se_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidGreaterThanOrEqualTo(Long value) {
            addCriterion("se_salesmanid >=", value, "se_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidLessThan(Long value) {
            addCriterion("se_salesmanid <", value, "se_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidLessThanOrEqualTo(Long value) {
            addCriterion("se_salesmanid <=", value, "se_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidIn(List<Long> values) {
            addCriterion("se_salesmanid in", values, "se_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidNotIn(List<Long> values) {
            addCriterion("se_salesmanid not in", values, "se_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidBetween(Long value1, Long value2) {
            addCriterion("se_salesmanid between", value1, value2, "se_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSe_salesmanidNotBetween(Long value1, Long value2) {
            addCriterion("se_salesmanid not between", value1, value2, "se_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserIsNull() {
            addCriterion("se_appraiser is null");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserIsNotNull() {
            addCriterion("se_appraiser is not null");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserEqualTo(String value) {
            addCriterion("se_appraiser =", value, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserNotEqualTo(String value) {
            addCriterion("se_appraiser <>", value, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserGreaterThan(String value) {
            addCriterion("se_appraiser >", value, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserGreaterThanOrEqualTo(String value) {
            addCriterion("se_appraiser >=", value, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserLessThan(String value) {
            addCriterion("se_appraiser <", value, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserLessThanOrEqualTo(String value) {
            addCriterion("se_appraiser <=", value, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserLike(String value) {
            addCriterion("se_appraiser like", value, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserNotLike(String value) {
            addCriterion("se_appraiser not like", value, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserIn(List<String> values) {
            addCriterion("se_appraiser in", values, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserNotIn(List<String> values) {
            addCriterion("se_appraiser not in", values, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserBetween(String value1, String value2) {
            addCriterion("se_appraiser between", value1, value2, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiserNotBetween(String value1, String value2) {
            addCriterion("se_appraiser not between", value1, value2, "se_appraiser");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageIsNull() {
            addCriterion("se_appraiseimage is null");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageIsNotNull() {
            addCriterion("se_appraiseimage is not null");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageEqualTo(String value) {
            addCriterion("se_appraiseimage =", value, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageNotEqualTo(String value) {
            addCriterion("se_appraiseimage <>", value, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageGreaterThan(String value) {
            addCriterion("se_appraiseimage >", value, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageGreaterThanOrEqualTo(String value) {
            addCriterion("se_appraiseimage >=", value, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageLessThan(String value) {
            addCriterion("se_appraiseimage <", value, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageLessThanOrEqualTo(String value) {
            addCriterion("se_appraiseimage <=", value, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageLike(String value) {
            addCriterion("se_appraiseimage like", value, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageNotLike(String value) {
            addCriterion("se_appraiseimage not like", value, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageIn(List<String> values) {
            addCriterion("se_appraiseimage in", values, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageNotIn(List<String> values) {
            addCriterion("se_appraiseimage not in", values, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageBetween(String value1, String value2) {
            addCriterion("se_appraiseimage between", value1, value2, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_appraiseimageNotBetween(String value1, String value2) {
            addCriterion("se_appraiseimage not between", value1, value2, "se_appraiseimage");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityIsNull() {
            addCriterion("se_anonymity is null");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityIsNotNull() {
            addCriterion("se_anonymity is not null");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityEqualTo(Boolean value) {
            addCriterion("se_anonymity =", value, "se_anonymity");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityNotEqualTo(Boolean value) {
            addCriterion("se_anonymity <>", value, "se_anonymity");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityGreaterThan(Boolean value) {
            addCriterion("se_anonymity >", value, "se_anonymity");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("se_anonymity >=", value, "se_anonymity");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityLessThan(Boolean value) {
            addCriterion("se_anonymity <", value, "se_anonymity");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityLessThanOrEqualTo(Boolean value) {
            addCriterion("se_anonymity <=", value, "se_anonymity");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityIn(List<Boolean> values) {
            addCriterion("se_anonymity in", values, "se_anonymity");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityNotIn(List<Boolean> values) {
            addCriterion("se_anonymity not in", values, "se_anonymity");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityBetween(Boolean value1, Boolean value2) {
            addCriterion("se_anonymity between", value1, value2, "se_anonymity");
            return (Criteria) this;
        }

        public Criteria andSe_anonymityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("se_anonymity not between", value1, value2, "se_anonymity");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupIsNull() {
            addCriterion("se_contentgroup is null");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupIsNotNull() {
            addCriterion("se_contentgroup is not null");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupEqualTo(String value) {
            addCriterion("se_contentgroup =", value, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupNotEqualTo(String value) {
            addCriterion("se_contentgroup <>", value, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupGreaterThan(String value) {
            addCriterion("se_contentgroup >", value, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupGreaterThanOrEqualTo(String value) {
            addCriterion("se_contentgroup >=", value, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupLessThan(String value) {
            addCriterion("se_contentgroup <", value, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupLessThanOrEqualTo(String value) {
            addCriterion("se_contentgroup <=", value, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupLike(String value) {
            addCriterion("se_contentgroup like", value, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupNotLike(String value) {
            addCriterion("se_contentgroup not like", value, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupIn(List<String> values) {
            addCriterion("se_contentgroup in", values, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupNotIn(List<String> values) {
            addCriterion("se_contentgroup not in", values, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupBetween(String value1, String value2) {
            addCriterion("se_contentgroup between", value1, value2, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgroupNotBetween(String value1, String value2) {
            addCriterion("se_contentgroup not between", value1, value2, "se_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeIsNull() {
            addCriterion("se_contentgrade is null");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeIsNotNull() {
            addCriterion("se_contentgrade is not null");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeEqualTo(String value) {
            addCriterion("se_contentgrade =", value, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeNotEqualTo(String value) {
            addCriterion("se_contentgrade <>", value, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeGreaterThan(String value) {
            addCriterion("se_contentgrade >", value, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeGreaterThanOrEqualTo(String value) {
            addCriterion("se_contentgrade >=", value, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeLessThan(String value) {
            addCriterion("se_contentgrade <", value, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeLessThanOrEqualTo(String value) {
            addCriterion("se_contentgrade <=", value, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeLike(String value) {
            addCriterion("se_contentgrade like", value, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeNotLike(String value) {
            addCriterion("se_contentgrade not like", value, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeIn(List<String> values) {
            addCriterion("se_contentgrade in", values, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeNotIn(List<String> values) {
            addCriterion("se_contentgrade not in", values, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeBetween(String value1, String value2) {
            addCriterion("se_contentgrade between", value1, value2, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentgradeNotBetween(String value1, String value2) {
            addCriterion("se_contentgrade not between", value1, value2, "se_contentgrade");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueIsNull() {
            addCriterion("se_contentvalue is null");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueIsNotNull() {
            addCriterion("se_contentvalue is not null");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueEqualTo(String value) {
            addCriterion("se_contentvalue =", value, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueNotEqualTo(String value) {
            addCriterion("se_contentvalue <>", value, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueGreaterThan(String value) {
            addCriterion("se_contentvalue >", value, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueGreaterThanOrEqualTo(String value) {
            addCriterion("se_contentvalue >=", value, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueLessThan(String value) {
            addCriterion("se_contentvalue <", value, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueLessThanOrEqualTo(String value) {
            addCriterion("se_contentvalue <=", value, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueLike(String value) {
            addCriterion("se_contentvalue like", value, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueNotLike(String value) {
            addCriterion("se_contentvalue not like", value, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueIn(List<String> values) {
            addCriterion("se_contentvalue in", values, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueNotIn(List<String> values) {
            addCriterion("se_contentvalue not in", values, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueBetween(String value1, String value2) {
            addCriterion("se_contentvalue between", value1, value2, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_contentvalueNotBetween(String value1, String value2) {
            addCriterion("se_contentvalue not between", value1, value2, "se_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSe_createidIsNull() {
            addCriterion("se_createid is null");
            return (Criteria) this;
        }

        public Criteria andSe_createidIsNotNull() {
            addCriterion("se_createid is not null");
            return (Criteria) this;
        }

        public Criteria andSe_createidEqualTo(Long value) {
            addCriterion("se_createid =", value, "se_createid");
            return (Criteria) this;
        }

        public Criteria andSe_createidNotEqualTo(Long value) {
            addCriterion("se_createid <>", value, "se_createid");
            return (Criteria) this;
        }

        public Criteria andSe_createidGreaterThan(Long value) {
            addCriterion("se_createid >", value, "se_createid");
            return (Criteria) this;
        }

        public Criteria andSe_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("se_createid >=", value, "se_createid");
            return (Criteria) this;
        }

        public Criteria andSe_createidLessThan(Long value) {
            addCriterion("se_createid <", value, "se_createid");
            return (Criteria) this;
        }

        public Criteria andSe_createidLessThanOrEqualTo(Long value) {
            addCriterion("se_createid <=", value, "se_createid");
            return (Criteria) this;
        }

        public Criteria andSe_createidIn(List<Long> values) {
            addCriterion("se_createid in", values, "se_createid");
            return (Criteria) this;
        }

        public Criteria andSe_createidNotIn(List<Long> values) {
            addCriterion("se_createid not in", values, "se_createid");
            return (Criteria) this;
        }

        public Criteria andSe_createidBetween(Long value1, Long value2) {
            addCriterion("se_createid between", value1, value2, "se_createid");
            return (Criteria) this;
        }

        public Criteria andSe_createidNotBetween(Long value1, Long value2) {
            addCriterion("se_createid not between", value1, value2, "se_createid");
            return (Criteria) this;
        }

        public Criteria andSe_createnoIsNull() {
            addCriterion("se_createno is null");
            return (Criteria) this;
        }

        public Criteria andSe_createnoIsNotNull() {
            addCriterion("se_createno is not null");
            return (Criteria) this;
        }

        public Criteria andSe_createnoEqualTo(String value) {
            addCriterion("se_createno =", value, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createnoNotEqualTo(String value) {
            addCriterion("se_createno <>", value, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createnoGreaterThan(String value) {
            addCriterion("se_createno >", value, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("se_createno >=", value, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createnoLessThan(String value) {
            addCriterion("se_createno <", value, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createnoLessThanOrEqualTo(String value) {
            addCriterion("se_createno <=", value, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createnoLike(String value) {
            addCriterion("se_createno like", value, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createnoNotLike(String value) {
            addCriterion("se_createno not like", value, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createnoIn(List<String> values) {
            addCriterion("se_createno in", values, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createnoNotIn(List<String> values) {
            addCriterion("se_createno not in", values, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createnoBetween(String value1, String value2) {
            addCriterion("se_createno between", value1, value2, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createnoNotBetween(String value1, String value2) {
            addCriterion("se_createno not between", value1, value2, "se_createno");
            return (Criteria) this;
        }

        public Criteria andSe_createdateIsNull() {
            addCriterion("se_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSe_createdateIsNotNull() {
            addCriterion("se_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSe_createdateEqualTo(Date value) {
            addCriterion("se_createdate =", value, "se_createdate");
            return (Criteria) this;
        }

        public Criteria andSe_createdateNotEqualTo(Date value) {
            addCriterion("se_createdate <>", value, "se_createdate");
            return (Criteria) this;
        }

        public Criteria andSe_createdateGreaterThan(Date value) {
            addCriterion("se_createdate >", value, "se_createdate");
            return (Criteria) this;
        }

        public Criteria andSe_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("se_createdate >=", value, "se_createdate");
            return (Criteria) this;
        }

        public Criteria andSe_createdateLessThan(Date value) {
            addCriterion("se_createdate <", value, "se_createdate");
            return (Criteria) this;
        }

        public Criteria andSe_createdateLessThanOrEqualTo(Date value) {
            addCriterion("se_createdate <=", value, "se_createdate");
            return (Criteria) this;
        }

        public Criteria andSe_createdateIn(List<Date> values) {
            addCriterion("se_createdate in", values, "se_createdate");
            return (Criteria) this;
        }

        public Criteria andSe_createdateNotIn(List<Date> values) {
            addCriterion("se_createdate not in", values, "se_createdate");
            return (Criteria) this;
        }

        public Criteria andSe_createdateBetween(Date value1, Date value2) {
            addCriterion("se_createdate between", value1, value2, "se_createdate");
            return (Criteria) this;
        }

        public Criteria andSe_createdateNotBetween(Date value1, Date value2) {
            addCriterion("se_createdate not between", value1, value2, "se_createdate");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidIsNull() {
            addCriterion("se_confirmid is null");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidIsNotNull() {
            addCriterion("se_confirmid is not null");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidEqualTo(Long value) {
            addCriterion("se_confirmid =", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidNotEqualTo(Long value) {
            addCriterion("se_confirmid <>", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidGreaterThan(Long value) {
            addCriterion("se_confirmid >", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidGreaterThanOrEqualTo(Long value) {
            addCriterion("se_confirmid >=", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidLessThan(Long value) {
            addCriterion("se_confirmid <", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidLessThanOrEqualTo(Long value) {
            addCriterion("se_confirmid <=", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidIn(List<Long> values) {
            addCriterion("se_confirmid in", values, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidNotIn(List<Long> values) {
            addCriterion("se_confirmid not in", values, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidBetween(Long value1, Long value2) {
            addCriterion("se_confirmid between", value1, value2, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidNotBetween(Long value1, Long value2) {
            addCriterion("se_confirmid not between", value1, value2, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoIsNull() {
            addCriterion("se_confirmno is null");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoIsNotNull() {
            addCriterion("se_confirmno is not null");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoEqualTo(String value) {
            addCriterion("se_confirmno =", value, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoNotEqualTo(String value) {
            addCriterion("se_confirmno <>", value, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoGreaterThan(String value) {
            addCriterion("se_confirmno >", value, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("se_confirmno >=", value, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoLessThan(String value) {
            addCriterion("se_confirmno <", value, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoLessThanOrEqualTo(String value) {
            addCriterion("se_confirmno <=", value, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoLike(String value) {
            addCriterion("se_confirmno like", value, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoNotLike(String value) {
            addCriterion("se_confirmno not like", value, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoIn(List<String> values) {
            addCriterion("se_confirmno in", values, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoNotIn(List<String> values) {
            addCriterion("se_confirmno not in", values, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoBetween(String value1, String value2) {
            addCriterion("se_confirmno between", value1, value2, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmnoNotBetween(String value1, String value2) {
            addCriterion("se_confirmno not between", value1, value2, "se_confirmno");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateIsNull() {
            addCriterion("se_confirmdate is null");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateIsNotNull() {
            addCriterion("se_confirmdate is not null");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateEqualTo(Date value) {
            addCriterion("se_confirmdate =", value, "se_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateNotEqualTo(Date value) {
            addCriterion("se_confirmdate <>", value, "se_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateGreaterThan(Date value) {
            addCriterion("se_confirmdate >", value, "se_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("se_confirmdate >=", value, "se_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateLessThan(Date value) {
            addCriterion("se_confirmdate <", value, "se_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateLessThanOrEqualTo(Date value) {
            addCriterion("se_confirmdate <=", value, "se_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateIn(List<Date> values) {
            addCriterion("se_confirmdate in", values, "se_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateNotIn(List<Date> values) {
            addCriterion("se_confirmdate not in", values, "se_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateBetween(Date value1, Date value2) {
            addCriterion("se_confirmdate between", value1, value2, "se_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSe_confirmdateNotBetween(Date value1, Date value2) {
            addCriterion("se_confirmdate not between", value1, value2, "se_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSe_statusIsNull() {
            addCriterion("se_status is null");
            return (Criteria) this;
        }

        public Criteria andSe_statusIsNotNull() {
            addCriterion("se_status is not null");
            return (Criteria) this;
        }

        public Criteria andSe_statusEqualTo(Byte value) {
            addCriterion("se_status =", value, "se_status");
            return (Criteria) this;
        }

        public Criteria andSe_statusNotEqualTo(Byte value) {
            addCriterion("se_status <>", value, "se_status");
            return (Criteria) this;
        }

        public Criteria andSe_statusGreaterThan(Byte value) {
            addCriterion("se_status >", value, "se_status");
            return (Criteria) this;
        }

        public Criteria andSe_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("se_status >=", value, "se_status");
            return (Criteria) this;
        }

        public Criteria andSe_statusLessThan(Byte value) {
            addCriterion("se_status <", value, "se_status");
            return (Criteria) this;
        }

        public Criteria andSe_statusLessThanOrEqualTo(Byte value) {
            addCriterion("se_status <=", value, "se_status");
            return (Criteria) this;
        }

        public Criteria andSe_statusIn(List<Byte> values) {
            addCriterion("se_status in", values, "se_status");
            return (Criteria) this;
        }

        public Criteria andSe_statusNotIn(List<Byte> values) {
            addCriterion("se_status not in", values, "se_status");
            return (Criteria) this;
        }

        public Criteria andSe_statusBetween(Byte value1, Byte value2) {
            addCriterion("se_status between", value1, value2, "se_status");
            return (Criteria) this;
        }

        public Criteria andSe_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("se_status not between", value1, value2, "se_status");
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