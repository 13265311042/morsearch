package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallV_Goods_ListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallV_Goods_ListExample() {
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

        public Criteria andMg_idIsNull() {
            addCriterion("mg_id is null");
            return (Criteria) this;
        }

        public Criteria andMg_idIsNotNull() {
            addCriterion("mg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMg_idEqualTo(Long value) {
            addCriterion("mg_id =", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idNotEqualTo(Long value) {
            addCriterion("mg_id <>", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idGreaterThan(Long value) {
            addCriterion("mg_id >", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idGreaterThanOrEqualTo(Long value) {
            addCriterion("mg_id >=", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idLessThan(Long value) {
            addCriterion("mg_id <", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idLessThanOrEqualTo(Long value) {
            addCriterion("mg_id <=", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idIn(List<Long> values) {
            addCriterion("mg_id in", values, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idNotIn(List<Long> values) {
            addCriterion("mg_id not in", values, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idBetween(Long value1, Long value2) {
            addCriterion("mg_id between", value1, value2, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idNotBetween(Long value1, Long value2) {
            addCriterion("mg_id not between", value1, value2, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_titleIsNull() {
            addCriterion("mg_title is null");
            return (Criteria) this;
        }

        public Criteria andMg_titleIsNotNull() {
            addCriterion("mg_title is not null");
            return (Criteria) this;
        }

        public Criteria andMg_titleEqualTo(String value) {
            addCriterion("mg_title =", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleNotEqualTo(String value) {
            addCriterion("mg_title <>", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleGreaterThan(String value) {
            addCriterion("mg_title >", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleGreaterThanOrEqualTo(String value) {
            addCriterion("mg_title >=", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleLessThan(String value) {
            addCriterion("mg_title <", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleLessThanOrEqualTo(String value) {
            addCriterion("mg_title <=", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleLike(String value) {
            addCriterion("mg_title like", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleNotLike(String value) {
            addCriterion("mg_title not like", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleIn(List<String> values) {
            addCriterion("mg_title in", values, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleNotIn(List<String> values) {
            addCriterion("mg_title not in", values, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleBetween(String value1, String value2) {
            addCriterion("mg_title between", value1, value2, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleNotBetween(String value1, String value2) {
            addCriterion("mg_title not between", value1, value2, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_subheadIsNull() {
            addCriterion("mg_subhead is null");
            return (Criteria) this;
        }

        public Criteria andMg_subheadIsNotNull() {
            addCriterion("mg_subhead is not null");
            return (Criteria) this;
        }

        public Criteria andMg_subheadEqualTo(String value) {
            addCriterion("mg_subhead =", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadNotEqualTo(String value) {
            addCriterion("mg_subhead <>", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadGreaterThan(String value) {
            addCriterion("mg_subhead >", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadGreaterThanOrEqualTo(String value) {
            addCriterion("mg_subhead >=", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadLessThan(String value) {
            addCriterion("mg_subhead <", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadLessThanOrEqualTo(String value) {
            addCriterion("mg_subhead <=", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadLike(String value) {
            addCriterion("mg_subhead like", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadNotLike(String value) {
            addCriterion("mg_subhead not like", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadIn(List<String> values) {
            addCriterion("mg_subhead in", values, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadNotIn(List<String> values) {
            addCriterion("mg_subhead not in", values, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadBetween(String value1, String value2) {
            addCriterion("mg_subhead between", value1, value2, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadNotBetween(String value1, String value2) {
            addCriterion("mg_subhead not between", value1, value2, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_img1IsNull() {
            addCriterion("mg_img1 is null");
            return (Criteria) this;
        }

        public Criteria andMg_img1IsNotNull() {
            addCriterion("mg_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andMg_img1EqualTo(String value) {
            addCriterion("mg_img1 =", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1NotEqualTo(String value) {
            addCriterion("mg_img1 <>", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1GreaterThan(String value) {
            addCriterion("mg_img1 >", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1GreaterThanOrEqualTo(String value) {
            addCriterion("mg_img1 >=", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1LessThan(String value) {
            addCriterion("mg_img1 <", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1LessThanOrEqualTo(String value) {
            addCriterion("mg_img1 <=", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1Like(String value) {
            addCriterion("mg_img1 like", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1NotLike(String value) {
            addCriterion("mg_img1 not like", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1In(List<String> values) {
            addCriterion("mg_img1 in", values, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1NotIn(List<String> values) {
            addCriterion("mg_img1 not in", values, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1Between(String value1, String value2) {
            addCriterion("mg_img1 between", value1, value2, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1NotBetween(String value1, String value2) {
            addCriterion("mg_img1 not between", value1, value2, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_priceIsNull() {
            addCriterion("mg_price is null");
            return (Criteria) this;
        }

        public Criteria andMg_priceIsNotNull() {
            addCriterion("mg_price is not null");
            return (Criteria) this;
        }

        public Criteria andMg_priceEqualTo(BigDecimal value) {
            addCriterion("mg_price =", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceNotEqualTo(BigDecimal value) {
            addCriterion("mg_price <>", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceGreaterThan(BigDecimal value) {
            addCriterion("mg_price >", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mg_price >=", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceLessThan(BigDecimal value) {
            addCriterion("mg_price <", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mg_price <=", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceIn(List<BigDecimal> values) {
            addCriterion("mg_price in", values, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceNotIn(List<BigDecimal> values) {
            addCriterion("mg_price not in", values, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mg_price between", value1, value2, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mg_price not between", value1, value2, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyIsNull() {
            addCriterion("mg_stockqty is null");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyIsNotNull() {
            addCriterion("mg_stockqty is not null");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyEqualTo(BigDecimal value) {
            addCriterion("mg_stockqty =", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyNotEqualTo(BigDecimal value) {
            addCriterion("mg_stockqty <>", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyGreaterThan(BigDecimal value) {
            addCriterion("mg_stockqty >", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mg_stockqty >=", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyLessThan(BigDecimal value) {
            addCriterion("mg_stockqty <", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mg_stockqty <=", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyIn(List<BigDecimal> values) {
            addCriterion("mg_stockqty in", values, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyNotIn(List<BigDecimal> values) {
            addCriterion("mg_stockqty not in", values, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mg_stockqty between", value1, value2, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mg_stockqty not between", value1, value2, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_createidIsNull() {
            addCriterion("mg_createid is null");
            return (Criteria) this;
        }

        public Criteria andMg_createidIsNotNull() {
            addCriterion("mg_createid is not null");
            return (Criteria) this;
        }

        public Criteria andMg_createidEqualTo(Long value) {
            addCriterion("mg_createid =", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidNotEqualTo(Long value) {
            addCriterion("mg_createid <>", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidGreaterThan(Long value) {
            addCriterion("mg_createid >", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("mg_createid >=", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidLessThan(Long value) {
            addCriterion("mg_createid <", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidLessThanOrEqualTo(Long value) {
            addCriterion("mg_createid <=", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidIn(List<Long> values) {
            addCriterion("mg_createid in", values, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidNotIn(List<Long> values) {
            addCriterion("mg_createid not in", values, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidBetween(Long value1, Long value2) {
            addCriterion("mg_createid between", value1, value2, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidNotBetween(Long value1, Long value2) {
            addCriterion("mg_createid not between", value1, value2, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createdateIsNull() {
            addCriterion("mg_createdate is null");
            return (Criteria) this;
        }

        public Criteria andMg_createdateIsNotNull() {
            addCriterion("mg_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andMg_createdateEqualTo(Date value) {
            addCriterion("mg_createdate =", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateNotEqualTo(Date value) {
            addCriterion("mg_createdate <>", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateGreaterThan(Date value) {
            addCriterion("mg_createdate >", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("mg_createdate >=", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateLessThan(Date value) {
            addCriterion("mg_createdate <", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateLessThanOrEqualTo(Date value) {
            addCriterion("mg_createdate <=", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateIn(List<Date> values) {
            addCriterion("mg_createdate in", values, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateNotIn(List<Date> values) {
            addCriterion("mg_createdate not in", values, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateBetween(Date value1, Date value2) {
            addCriterion("mg_createdate between", value1, value2, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateNotBetween(Date value1, Date value2) {
            addCriterion("mg_createdate not between", value1, value2, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateIsNull() {
            addCriterion("mg_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateIsNotNull() {
            addCriterion("mg_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateEqualTo(Date value) {
            addCriterion("mg_updatedate =", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateNotEqualTo(Date value) {
            addCriterion("mg_updatedate <>", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateGreaterThan(Date value) {
            addCriterion("mg_updatedate >", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("mg_updatedate >=", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateLessThan(Date value) {
            addCriterion("mg_updatedate <", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("mg_updatedate <=", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateIn(List<Date> values) {
            addCriterion("mg_updatedate in", values, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateNotIn(List<Date> values) {
            addCriterion("mg_updatedate not in", values, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateBetween(Date value1, Date value2) {
            addCriterion("mg_updatedate between", value1, value2, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("mg_updatedate not between", value1, value2, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_statusIsNull() {
            addCriterion("mg_status is null");
            return (Criteria) this;
        }

        public Criteria andMg_statusIsNotNull() {
            addCriterion("mg_status is not null");
            return (Criteria) this;
        }

        public Criteria andMg_statusEqualTo(Byte value) {
            addCriterion("mg_status =", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusNotEqualTo(Byte value) {
            addCriterion("mg_status <>", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusGreaterThan(Byte value) {
            addCriterion("mg_status >", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("mg_status >=", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusLessThan(Byte value) {
            addCriterion("mg_status <", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusLessThanOrEqualTo(Byte value) {
            addCriterion("mg_status <=", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusIn(List<Byte> values) {
            addCriterion("mg_status in", values, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusNotIn(List<Byte> values) {
            addCriterion("mg_status not in", values, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusBetween(Byte value1, Byte value2) {
            addCriterion("mg_status between", value1, value2, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("mg_status not between", value1, value2, "mg_status");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNull() {
            addCriterion("statusname is null");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNotNull() {
            addCriterion("statusname is not null");
            return (Criteria) this;
        }

        public Criteria andStatusnameEqualTo(String value) {
            addCriterion("statusname =", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotEqualTo(String value) {
            addCriterion("statusname <>", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThan(String value) {
            addCriterion("statusname >", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThanOrEqualTo(String value) {
            addCriterion("statusname >=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThan(String value) {
            addCriterion("statusname <", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThanOrEqualTo(String value) {
            addCriterion("statusname <=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLike(String value) {
            addCriterion("statusname like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotLike(String value) {
            addCriterion("statusname not like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameIn(List<String> values) {
            addCriterion("statusname in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotIn(List<String> values) {
            addCriterion("statusname not in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameBetween(String value1, String value2) {
            addCriterion("statusname between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotBetween(String value1, String value2) {
            addCriterion("statusname not between", value1, value2, "statusname");
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