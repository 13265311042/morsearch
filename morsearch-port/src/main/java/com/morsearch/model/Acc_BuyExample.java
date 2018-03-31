package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Acc_BuyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Acc_BuyExample() {
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

        public Criteria andAb_idIsNull() {
            addCriterion("ab_id is null");
            return (Criteria) this;
        }

        public Criteria andAb_idIsNotNull() {
            addCriterion("ab_id is not null");
            return (Criteria) this;
        }

        public Criteria andAb_idEqualTo(Long value) {
            addCriterion("ab_id =", value, "ab_id");
            return (Criteria) this;
        }

        public Criteria andAb_idNotEqualTo(Long value) {
            addCriterion("ab_id <>", value, "ab_id");
            return (Criteria) this;
        }

        public Criteria andAb_idGreaterThan(Long value) {
            addCriterion("ab_id >", value, "ab_id");
            return (Criteria) this;
        }

        public Criteria andAb_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ab_id >=", value, "ab_id");
            return (Criteria) this;
        }

        public Criteria andAb_idLessThan(Long value) {
            addCriterion("ab_id <", value, "ab_id");
            return (Criteria) this;
        }

        public Criteria andAb_idLessThanOrEqualTo(Long value) {
            addCriterion("ab_id <=", value, "ab_id");
            return (Criteria) this;
        }

        public Criteria andAb_idIn(List<Long> values) {
            addCriterion("ab_id in", values, "ab_id");
            return (Criteria) this;
        }

        public Criteria andAb_idNotIn(List<Long> values) {
            addCriterion("ab_id not in", values, "ab_id");
            return (Criteria) this;
        }

        public Criteria andAb_idBetween(Long value1, Long value2) {
            addCriterion("ab_id between", value1, value2, "ab_id");
            return (Criteria) this;
        }

        public Criteria andAb_idNotBetween(Long value1, Long value2) {
            addCriterion("ab_id not between", value1, value2, "ab_id");
            return (Criteria) this;
        }

        public Criteria andAb_noIsNull() {
            addCriterion("ab_no is null");
            return (Criteria) this;
        }

        public Criteria andAb_noIsNotNull() {
            addCriterion("ab_no is not null");
            return (Criteria) this;
        }

        public Criteria andAb_noEqualTo(String value) {
            addCriterion("ab_no =", value, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_noNotEqualTo(String value) {
            addCriterion("ab_no <>", value, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_noGreaterThan(String value) {
            addCriterion("ab_no >", value, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_noGreaterThanOrEqualTo(String value) {
            addCriterion("ab_no >=", value, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_noLessThan(String value) {
            addCriterion("ab_no <", value, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_noLessThanOrEqualTo(String value) {
            addCriterion("ab_no <=", value, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_noLike(String value) {
            addCriterion("ab_no like", value, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_noNotLike(String value) {
            addCriterion("ab_no not like", value, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_noIn(List<String> values) {
            addCriterion("ab_no in", values, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_noNotIn(List<String> values) {
            addCriterion("ab_no not in", values, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_noBetween(String value1, String value2) {
            addCriterion("ab_no between", value1, value2, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_noNotBetween(String value1, String value2) {
            addCriterion("ab_no not between", value1, value2, "ab_no");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeIsNull() {
            addCriterion("ab_coincode is null");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeIsNotNull() {
            addCriterion("ab_coincode is not null");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeEqualTo(String value) {
            addCriterion("ab_coincode =", value, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeNotEqualTo(String value) {
            addCriterion("ab_coincode <>", value, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeGreaterThan(String value) {
            addCriterion("ab_coincode >", value, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeGreaterThanOrEqualTo(String value) {
            addCriterion("ab_coincode >=", value, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeLessThan(String value) {
            addCriterion("ab_coincode <", value, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeLessThanOrEqualTo(String value) {
            addCriterion("ab_coincode <=", value, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeLike(String value) {
            addCriterion("ab_coincode like", value, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeNotLike(String value) {
            addCriterion("ab_coincode not like", value, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeIn(List<String> values) {
            addCriterion("ab_coincode in", values, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeNotIn(List<String> values) {
            addCriterion("ab_coincode not in", values, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeBetween(String value1, String value2) {
            addCriterion("ab_coincode between", value1, value2, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coincodeNotBetween(String value1, String value2) {
            addCriterion("ab_coincode not between", value1, value2, "ab_coincode");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameIsNull() {
            addCriterion("ab_coinname is null");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameIsNotNull() {
            addCriterion("ab_coinname is not null");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameEqualTo(String value) {
            addCriterion("ab_coinname =", value, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameNotEqualTo(String value) {
            addCriterion("ab_coinname <>", value, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameGreaterThan(String value) {
            addCriterion("ab_coinname >", value, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameGreaterThanOrEqualTo(String value) {
            addCriterion("ab_coinname >=", value, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameLessThan(String value) {
            addCriterion("ab_coinname <", value, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameLessThanOrEqualTo(String value) {
            addCriterion("ab_coinname <=", value, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameLike(String value) {
            addCriterion("ab_coinname like", value, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameNotLike(String value) {
            addCriterion("ab_coinname not like", value, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameIn(List<String> values) {
            addCriterion("ab_coinname in", values, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameNotIn(List<String> values) {
            addCriterion("ab_coinname not in", values, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameBetween(String value1, String value2) {
            addCriterion("ab_coinname between", value1, value2, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinnameNotBetween(String value1, String value2) {
            addCriterion("ab_coinname not between", value1, value2, "ab_coinname");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageIsNull() {
            addCriterion("ab_coinimage is null");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageIsNotNull() {
            addCriterion("ab_coinimage is not null");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageEqualTo(String value) {
            addCriterion("ab_coinimage =", value, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageNotEqualTo(String value) {
            addCriterion("ab_coinimage <>", value, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageGreaterThan(String value) {
            addCriterion("ab_coinimage >", value, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageGreaterThanOrEqualTo(String value) {
            addCriterion("ab_coinimage >=", value, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageLessThan(String value) {
            addCriterion("ab_coinimage <", value, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageLessThanOrEqualTo(String value) {
            addCriterion("ab_coinimage <=", value, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageLike(String value) {
            addCriterion("ab_coinimage like", value, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageNotLike(String value) {
            addCriterion("ab_coinimage not like", value, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageIn(List<String> values) {
            addCriterion("ab_coinimage in", values, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageNotIn(List<String> values) {
            addCriterion("ab_coinimage not in", values, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageBetween(String value1, String value2) {
            addCriterion("ab_coinimage between", value1, value2, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinimageNotBetween(String value1, String value2) {
            addCriterion("ab_coinimage not between", value1, value2, "ab_coinimage");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceIsNull() {
            addCriterion("ab_coinprice is null");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceIsNotNull() {
            addCriterion("ab_coinprice is not null");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceEqualTo(BigDecimal value) {
            addCriterion("ab_coinprice =", value, "ab_coinprice");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceNotEqualTo(BigDecimal value) {
            addCriterion("ab_coinprice <>", value, "ab_coinprice");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceGreaterThan(BigDecimal value) {
            addCriterion("ab_coinprice >", value, "ab_coinprice");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_coinprice >=", value, "ab_coinprice");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceLessThan(BigDecimal value) {
            addCriterion("ab_coinprice <", value, "ab_coinprice");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_coinprice <=", value, "ab_coinprice");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceIn(List<BigDecimal> values) {
            addCriterion("ab_coinprice in", values, "ab_coinprice");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceNotIn(List<BigDecimal> values) {
            addCriterion("ab_coinprice not in", values, "ab_coinprice");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_coinprice between", value1, value2, "ab_coinprice");
            return (Criteria) this;
        }

        public Criteria andAb_coinpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_coinprice not between", value1, value2, "ab_coinprice");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyIsNull() {
            addCriterion("ab_coinqty is null");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyIsNotNull() {
            addCriterion("ab_coinqty is not null");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyEqualTo(BigDecimal value) {
            addCriterion("ab_coinqty =", value, "ab_coinqty");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyNotEqualTo(BigDecimal value) {
            addCriterion("ab_coinqty <>", value, "ab_coinqty");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyGreaterThan(BigDecimal value) {
            addCriterion("ab_coinqty >", value, "ab_coinqty");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_coinqty >=", value, "ab_coinqty");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyLessThan(BigDecimal value) {
            addCriterion("ab_coinqty <", value, "ab_coinqty");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_coinqty <=", value, "ab_coinqty");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyIn(List<BigDecimal> values) {
            addCriterion("ab_coinqty in", values, "ab_coinqty");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyNotIn(List<BigDecimal> values) {
            addCriterion("ab_coinqty not in", values, "ab_coinqty");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_coinqty between", value1, value2, "ab_coinqty");
            return (Criteria) this;
        }

        public Criteria andAb_coinqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_coinqty not between", value1, value2, "ab_coinqty");
            return (Criteria) this;
        }

        public Criteria andAb_activityidIsNull() {
            addCriterion("ab_activityid is null");
            return (Criteria) this;
        }

        public Criteria andAb_activityidIsNotNull() {
            addCriterion("ab_activityid is not null");
            return (Criteria) this;
        }

        public Criteria andAb_activityidEqualTo(Long value) {
            addCriterion("ab_activityid =", value, "ab_activityid");
            return (Criteria) this;
        }

        public Criteria andAb_activityidNotEqualTo(Long value) {
            addCriterion("ab_activityid <>", value, "ab_activityid");
            return (Criteria) this;
        }

        public Criteria andAb_activityidGreaterThan(Long value) {
            addCriterion("ab_activityid >", value, "ab_activityid");
            return (Criteria) this;
        }

        public Criteria andAb_activityidGreaterThanOrEqualTo(Long value) {
            addCriterion("ab_activityid >=", value, "ab_activityid");
            return (Criteria) this;
        }

        public Criteria andAb_activityidLessThan(Long value) {
            addCriterion("ab_activityid <", value, "ab_activityid");
            return (Criteria) this;
        }

        public Criteria andAb_activityidLessThanOrEqualTo(Long value) {
            addCriterion("ab_activityid <=", value, "ab_activityid");
            return (Criteria) this;
        }

        public Criteria andAb_activityidIn(List<Long> values) {
            addCriterion("ab_activityid in", values, "ab_activityid");
            return (Criteria) this;
        }

        public Criteria andAb_activityidNotIn(List<Long> values) {
            addCriterion("ab_activityid not in", values, "ab_activityid");
            return (Criteria) this;
        }

        public Criteria andAb_activityidBetween(Long value1, Long value2) {
            addCriterion("ab_activityid between", value1, value2, "ab_activityid");
            return (Criteria) this;
        }

        public Criteria andAb_activityidNotBetween(Long value1, Long value2) {
            addCriterion("ab_activityid not between", value1, value2, "ab_activityid");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameIsNull() {
            addCriterion("ab_activityname is null");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameIsNotNull() {
            addCriterion("ab_activityname is not null");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameEqualTo(String value) {
            addCriterion("ab_activityname =", value, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameNotEqualTo(String value) {
            addCriterion("ab_activityname <>", value, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameGreaterThan(String value) {
            addCriterion("ab_activityname >", value, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameGreaterThanOrEqualTo(String value) {
            addCriterion("ab_activityname >=", value, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameLessThan(String value) {
            addCriterion("ab_activityname <", value, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameLessThanOrEqualTo(String value) {
            addCriterion("ab_activityname <=", value, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameLike(String value) {
            addCriterion("ab_activityname like", value, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameNotLike(String value) {
            addCriterion("ab_activityname not like", value, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameIn(List<String> values) {
            addCriterion("ab_activityname in", values, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameNotIn(List<String> values) {
            addCriterion("ab_activityname not in", values, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameBetween(String value1, String value2) {
            addCriterion("ab_activityname between", value1, value2, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_activitynameNotBetween(String value1, String value2) {
            addCriterion("ab_activityname not between", value1, value2, "ab_activityname");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderIsNull() {
            addCriterion("ab_payamtorder is null");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderIsNotNull() {
            addCriterion("ab_payamtorder is not null");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderEqualTo(BigDecimal value) {
            addCriterion("ab_payamtorder =", value, "ab_payamtorder");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderNotEqualTo(BigDecimal value) {
            addCriterion("ab_payamtorder <>", value, "ab_payamtorder");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderGreaterThan(BigDecimal value) {
            addCriterion("ab_payamtorder >", value, "ab_payamtorder");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_payamtorder >=", value, "ab_payamtorder");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderLessThan(BigDecimal value) {
            addCriterion("ab_payamtorder <", value, "ab_payamtorder");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_payamtorder <=", value, "ab_payamtorder");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderIn(List<BigDecimal> values) {
            addCriterion("ab_payamtorder in", values, "ab_payamtorder");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderNotIn(List<BigDecimal> values) {
            addCriterion("ab_payamtorder not in", values, "ab_payamtorder");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_payamtorder between", value1, value2, "ab_payamtorder");
            return (Criteria) this;
        }

        public Criteria andAb_payamtorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_payamtorder not between", value1, value2, "ab_payamtorder");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualIsNull() {
            addCriterion("ab_payamtactual is null");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualIsNotNull() {
            addCriterion("ab_payamtactual is not null");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualEqualTo(BigDecimal value) {
            addCriterion("ab_payamtactual =", value, "ab_payamtactual");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualNotEqualTo(BigDecimal value) {
            addCriterion("ab_payamtactual <>", value, "ab_payamtactual");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualGreaterThan(BigDecimal value) {
            addCriterion("ab_payamtactual >", value, "ab_payamtactual");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_payamtactual >=", value, "ab_payamtactual");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualLessThan(BigDecimal value) {
            addCriterion("ab_payamtactual <", value, "ab_payamtactual");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_payamtactual <=", value, "ab_payamtactual");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualIn(List<BigDecimal> values) {
            addCriterion("ab_payamtactual in", values, "ab_payamtactual");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualNotIn(List<BigDecimal> values) {
            addCriterion("ab_payamtactual not in", values, "ab_payamtactual");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_payamtactual between", value1, value2, "ab_payamtactual");
            return (Criteria) this;
        }

        public Criteria andAb_payamtactualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_payamtactual not between", value1, value2, "ab_payamtactual");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceIsNull() {
            addCriterion("ab_paybalance is null");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceIsNotNull() {
            addCriterion("ab_paybalance is not null");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceEqualTo(BigDecimal value) {
            addCriterion("ab_paybalance =", value, "ab_paybalance");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceNotEqualTo(BigDecimal value) {
            addCriterion("ab_paybalance <>", value, "ab_paybalance");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceGreaterThan(BigDecimal value) {
            addCriterion("ab_paybalance >", value, "ab_paybalance");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_paybalance >=", value, "ab_paybalance");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceLessThan(BigDecimal value) {
            addCriterion("ab_paybalance <", value, "ab_paybalance");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_paybalance <=", value, "ab_paybalance");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceIn(List<BigDecimal> values) {
            addCriterion("ab_paybalance in", values, "ab_paybalance");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceNotIn(List<BigDecimal> values) {
            addCriterion("ab_paybalance not in", values, "ab_paybalance");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_paybalance between", value1, value2, "ab_paybalance");
            return (Criteria) this;
        }

        public Criteria andAb_paybalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_paybalance not between", value1, value2, "ab_paybalance");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyIsNull() {
            addCriterion("ab_addcoinqty is null");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyIsNotNull() {
            addCriterion("ab_addcoinqty is not null");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyEqualTo(BigDecimal value) {
            addCriterion("ab_addcoinqty =", value, "ab_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyNotEqualTo(BigDecimal value) {
            addCriterion("ab_addcoinqty <>", value, "ab_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyGreaterThan(BigDecimal value) {
            addCriterion("ab_addcoinqty >", value, "ab_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_addcoinqty >=", value, "ab_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyLessThan(BigDecimal value) {
            addCriterion("ab_addcoinqty <", value, "ab_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_addcoinqty <=", value, "ab_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyIn(List<BigDecimal> values) {
            addCriterion("ab_addcoinqty in", values, "ab_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyNotIn(List<BigDecimal> values) {
            addCriterion("ab_addcoinqty not in", values, "ab_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_addcoinqty between", value1, value2, "ab_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_addcoinqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_addcoinqty not between", value1, value2, "ab_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralIsNull() {
            addCriterion("ab_addintegral is null");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralIsNotNull() {
            addCriterion("ab_addintegral is not null");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralEqualTo(BigDecimal value) {
            addCriterion("ab_addintegral =", value, "ab_addintegral");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralNotEqualTo(BigDecimal value) {
            addCriterion("ab_addintegral <>", value, "ab_addintegral");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralGreaterThan(BigDecimal value) {
            addCriterion("ab_addintegral >", value, "ab_addintegral");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_addintegral >=", value, "ab_addintegral");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralLessThan(BigDecimal value) {
            addCriterion("ab_addintegral <", value, "ab_addintegral");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_addintegral <=", value, "ab_addintegral");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralIn(List<BigDecimal> values) {
            addCriterion("ab_addintegral in", values, "ab_addintegral");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralNotIn(List<BigDecimal> values) {
            addCriterion("ab_addintegral not in", values, "ab_addintegral");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_addintegral between", value1, value2, "ab_addintegral");
            return (Criteria) this;
        }

        public Criteria andAb_addintegralNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_addintegral not between", value1, value2, "ab_addintegral");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyIsNull() {
            addCriterion("ab_sumcoinqty is null");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyIsNotNull() {
            addCriterion("ab_sumcoinqty is not null");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyEqualTo(BigDecimal value) {
            addCriterion("ab_sumcoinqty =", value, "ab_sumcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyNotEqualTo(BigDecimal value) {
            addCriterion("ab_sumcoinqty <>", value, "ab_sumcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyGreaterThan(BigDecimal value) {
            addCriterion("ab_sumcoinqty >", value, "ab_sumcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_sumcoinqty >=", value, "ab_sumcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyLessThan(BigDecimal value) {
            addCriterion("ab_sumcoinqty <", value, "ab_sumcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_sumcoinqty <=", value, "ab_sumcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyIn(List<BigDecimal> values) {
            addCriterion("ab_sumcoinqty in", values, "ab_sumcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyNotIn(List<BigDecimal> values) {
            addCriterion("ab_sumcoinqty not in", values, "ab_sumcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_sumcoinqty between", value1, value2, "ab_sumcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_sumcoinqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_sumcoinqty not between", value1, value2, "ab_sumcoinqty");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayIsNull() {
            addCriterion("ab_tradeway is null");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayIsNotNull() {
            addCriterion("ab_tradeway is not null");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayEqualTo(Byte value) {
            addCriterion("ab_tradeway =", value, "ab_tradeway");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayNotEqualTo(Byte value) {
            addCriterion("ab_tradeway <>", value, "ab_tradeway");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayGreaterThan(Byte value) {
            addCriterion("ab_tradeway >", value, "ab_tradeway");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayGreaterThanOrEqualTo(Byte value) {
            addCriterion("ab_tradeway >=", value, "ab_tradeway");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayLessThan(Byte value) {
            addCriterion("ab_tradeway <", value, "ab_tradeway");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayLessThanOrEqualTo(Byte value) {
            addCriterion("ab_tradeway <=", value, "ab_tradeway");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayIn(List<Byte> values) {
            addCriterion("ab_tradeway in", values, "ab_tradeway");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayNotIn(List<Byte> values) {
            addCriterion("ab_tradeway not in", values, "ab_tradeway");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayBetween(Byte value1, Byte value2) {
            addCriterion("ab_tradeway between", value1, value2, "ab_tradeway");
            return (Criteria) this;
        }

        public Criteria andAb_tradewayNotBetween(Byte value1, Byte value2) {
            addCriterion("ab_tradeway not between", value1, value2, "ab_tradeway");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameIsNull() {
            addCriterion("ab_tradename is null");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameIsNotNull() {
            addCriterion("ab_tradename is not null");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameEqualTo(String value) {
            addCriterion("ab_tradename =", value, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameNotEqualTo(String value) {
            addCriterion("ab_tradename <>", value, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameGreaterThan(String value) {
            addCriterion("ab_tradename >", value, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameGreaterThanOrEqualTo(String value) {
            addCriterion("ab_tradename >=", value, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameLessThan(String value) {
            addCriterion("ab_tradename <", value, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameLessThanOrEqualTo(String value) {
            addCriterion("ab_tradename <=", value, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameLike(String value) {
            addCriterion("ab_tradename like", value, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameNotLike(String value) {
            addCriterion("ab_tradename not like", value, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameIn(List<String> values) {
            addCriterion("ab_tradename in", values, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameNotIn(List<String> values) {
            addCriterion("ab_tradename not in", values, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameBetween(String value1, String value2) {
            addCriterion("ab_tradename between", value1, value2, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradenameNotBetween(String value1, String value2) {
            addCriterion("ab_tradename not between", value1, value2, "ab_tradename");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardIsNull() {
            addCriterion("ab_tradecard is null");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardIsNotNull() {
            addCriterion("ab_tradecard is not null");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardEqualTo(String value) {
            addCriterion("ab_tradecard =", value, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardNotEqualTo(String value) {
            addCriterion("ab_tradecard <>", value, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardGreaterThan(String value) {
            addCriterion("ab_tradecard >", value, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardGreaterThanOrEqualTo(String value) {
            addCriterion("ab_tradecard >=", value, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardLessThan(String value) {
            addCriterion("ab_tradecard <", value, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardLessThanOrEqualTo(String value) {
            addCriterion("ab_tradecard <=", value, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardLike(String value) {
            addCriterion("ab_tradecard like", value, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardNotLike(String value) {
            addCriterion("ab_tradecard not like", value, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardIn(List<String> values) {
            addCriterion("ab_tradecard in", values, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardNotIn(List<String> values) {
            addCriterion("ab_tradecard not in", values, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardBetween(String value1, String value2) {
            addCriterion("ab_tradecard between", value1, value2, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradecardNotBetween(String value1, String value2) {
            addCriterion("ab_tradecard not between", value1, value2, "ab_tradecard");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoIsNull() {
            addCriterion("ab_tradeorderno is null");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoIsNotNull() {
            addCriterion("ab_tradeorderno is not null");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoEqualTo(String value) {
            addCriterion("ab_tradeorderno =", value, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoNotEqualTo(String value) {
            addCriterion("ab_tradeorderno <>", value, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoGreaterThan(String value) {
            addCriterion("ab_tradeorderno >", value, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoGreaterThanOrEqualTo(String value) {
            addCriterion("ab_tradeorderno >=", value, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoLessThan(String value) {
            addCriterion("ab_tradeorderno <", value, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoLessThanOrEqualTo(String value) {
            addCriterion("ab_tradeorderno <=", value, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoLike(String value) {
            addCriterion("ab_tradeorderno like", value, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoNotLike(String value) {
            addCriterion("ab_tradeorderno not like", value, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoIn(List<String> values) {
            addCriterion("ab_tradeorderno in", values, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoNotIn(List<String> values) {
            addCriterion("ab_tradeorderno not in", values, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoBetween(String value1, String value2) {
            addCriterion("ab_tradeorderno between", value1, value2, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeordernoNotBetween(String value1, String value2) {
            addCriterion("ab_tradeorderno not between", value1, value2, "ab_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountIsNull() {
            addCriterion("ab_tradeamount is null");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountIsNotNull() {
            addCriterion("ab_tradeamount is not null");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountEqualTo(BigDecimal value) {
            addCriterion("ab_tradeamount =", value, "ab_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountNotEqualTo(BigDecimal value) {
            addCriterion("ab_tradeamount <>", value, "ab_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountGreaterThan(BigDecimal value) {
            addCriterion("ab_tradeamount >", value, "ab_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_tradeamount >=", value, "ab_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountLessThan(BigDecimal value) {
            addCriterion("ab_tradeamount <", value, "ab_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_tradeamount <=", value, "ab_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountIn(List<BigDecimal> values) {
            addCriterion("ab_tradeamount in", values, "ab_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountNotIn(List<BigDecimal> values) {
            addCriterion("ab_tradeamount not in", values, "ab_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_tradeamount between", value1, value2, "ab_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAb_tradeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_tradeamount not between", value1, value2, "ab_tradeamount");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateIsNull() {
            addCriterion("ab_tradeorderdate is null");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateIsNotNull() {
            addCriterion("ab_tradeorderdate is not null");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateEqualTo(Date value) {
            addCriterion("ab_tradeorderdate =", value, "ab_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateNotEqualTo(Date value) {
            addCriterion("ab_tradeorderdate <>", value, "ab_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateGreaterThan(Date value) {
            addCriterion("ab_tradeorderdate >", value, "ab_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ab_tradeorderdate >=", value, "ab_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateLessThan(Date value) {
            addCriterion("ab_tradeorderdate <", value, "ab_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateLessThanOrEqualTo(Date value) {
            addCriterion("ab_tradeorderdate <=", value, "ab_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateIn(List<Date> values) {
            addCriterion("ab_tradeorderdate in", values, "ab_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateNotIn(List<Date> values) {
            addCriterion("ab_tradeorderdate not in", values, "ab_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateBetween(Date value1, Date value2) {
            addCriterion("ab_tradeorderdate between", value1, value2, "ab_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAb_tradeorderdateNotBetween(Date value1, Date value2) {
            addCriterion("ab_tradeorderdate not between", value1, value2, "ab_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoIsNull() {
            addCriterion("ab_traderefundno is null");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoIsNotNull() {
            addCriterion("ab_traderefundno is not null");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoEqualTo(String value) {
            addCriterion("ab_traderefundno =", value, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoNotEqualTo(String value) {
            addCriterion("ab_traderefundno <>", value, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoGreaterThan(String value) {
            addCriterion("ab_traderefundno >", value, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoGreaterThanOrEqualTo(String value) {
            addCriterion("ab_traderefundno >=", value, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoLessThan(String value) {
            addCriterion("ab_traderefundno <", value, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoLessThanOrEqualTo(String value) {
            addCriterion("ab_traderefundno <=", value, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoLike(String value) {
            addCriterion("ab_traderefundno like", value, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoNotLike(String value) {
            addCriterion("ab_traderefundno not like", value, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoIn(List<String> values) {
            addCriterion("ab_traderefundno in", values, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoNotIn(List<String> values) {
            addCriterion("ab_traderefundno not in", values, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoBetween(String value1, String value2) {
            addCriterion("ab_traderefundno between", value1, value2, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundnoNotBetween(String value1, String value2) {
            addCriterion("ab_traderefundno not between", value1, value2, "ab_traderefundno");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateIsNull() {
            addCriterion("ab_traderefunddate is null");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateIsNotNull() {
            addCriterion("ab_traderefunddate is not null");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateEqualTo(Date value) {
            addCriterion("ab_traderefunddate =", value, "ab_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateNotEqualTo(Date value) {
            addCriterion("ab_traderefunddate <>", value, "ab_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateGreaterThan(Date value) {
            addCriterion("ab_traderefunddate >", value, "ab_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ab_traderefunddate >=", value, "ab_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateLessThan(Date value) {
            addCriterion("ab_traderefunddate <", value, "ab_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateLessThanOrEqualTo(Date value) {
            addCriterion("ab_traderefunddate <=", value, "ab_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateIn(List<Date> values) {
            addCriterion("ab_traderefunddate in", values, "ab_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateNotIn(List<Date> values) {
            addCriterion("ab_traderefunddate not in", values, "ab_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateBetween(Date value1, Date value2) {
            addCriterion("ab_traderefunddate between", value1, value2, "ab_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAb_traderefunddateNotBetween(Date value1, Date value2) {
            addCriterion("ab_traderefunddate not between", value1, value2, "ab_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountIsNull() {
            addCriterion("ab_traderefundamount is null");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountIsNotNull() {
            addCriterion("ab_traderefundamount is not null");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountEqualTo(BigDecimal value) {
            addCriterion("ab_traderefundamount =", value, "ab_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountNotEqualTo(BigDecimal value) {
            addCriterion("ab_traderefundamount <>", value, "ab_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountGreaterThan(BigDecimal value) {
            addCriterion("ab_traderefundamount >", value, "ab_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_traderefundamount >=", value, "ab_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountLessThan(BigDecimal value) {
            addCriterion("ab_traderefundamount <", value, "ab_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ab_traderefundamount <=", value, "ab_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountIn(List<BigDecimal> values) {
            addCriterion("ab_traderefundamount in", values, "ab_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountNotIn(List<BigDecimal> values) {
            addCriterion("ab_traderefundamount not in", values, "ab_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_traderefundamount between", value1, value2, "ab_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAb_traderefundamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab_traderefundamount not between", value1, value2, "ab_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameIsNull() {
            addCriterion("ab_sourcename is null");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameIsNotNull() {
            addCriterion("ab_sourcename is not null");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameEqualTo(String value) {
            addCriterion("ab_sourcename =", value, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameNotEqualTo(String value) {
            addCriterion("ab_sourcename <>", value, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameGreaterThan(String value) {
            addCriterion("ab_sourcename >", value, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("ab_sourcename >=", value, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameLessThan(String value) {
            addCriterion("ab_sourcename <", value, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameLessThanOrEqualTo(String value) {
            addCriterion("ab_sourcename <=", value, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameLike(String value) {
            addCriterion("ab_sourcename like", value, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameNotLike(String value) {
            addCriterion("ab_sourcename not like", value, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameIn(List<String> values) {
            addCriterion("ab_sourcename in", values, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameNotIn(List<String> values) {
            addCriterion("ab_sourcename not in", values, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameBetween(String value1, String value2) {
            addCriterion("ab_sourcename between", value1, value2, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourcenameNotBetween(String value1, String value2) {
            addCriterion("ab_sourcename not between", value1, value2, "ab_sourcename");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionIsNull() {
            addCriterion("ab_sourceversion is null");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionIsNotNull() {
            addCriterion("ab_sourceversion is not null");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionEqualTo(String value) {
            addCriterion("ab_sourceversion =", value, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionNotEqualTo(String value) {
            addCriterion("ab_sourceversion <>", value, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionGreaterThan(String value) {
            addCriterion("ab_sourceversion >", value, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionGreaterThanOrEqualTo(String value) {
            addCriterion("ab_sourceversion >=", value, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionLessThan(String value) {
            addCriterion("ab_sourceversion <", value, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionLessThanOrEqualTo(String value) {
            addCriterion("ab_sourceversion <=", value, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionLike(String value) {
            addCriterion("ab_sourceversion like", value, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionNotLike(String value) {
            addCriterion("ab_sourceversion not like", value, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionIn(List<String> values) {
            addCriterion("ab_sourceversion in", values, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionNotIn(List<String> values) {
            addCriterion("ab_sourceversion not in", values, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionBetween(String value1, String value2) {
            addCriterion("ab_sourceversion between", value1, value2, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_sourceversionNotBetween(String value1, String value2) {
            addCriterion("ab_sourceversion not between", value1, value2, "ab_sourceversion");
            return (Criteria) this;
        }

        public Criteria andAb_accountidIsNull() {
            addCriterion("ab_accountid is null");
            return (Criteria) this;
        }

        public Criteria andAb_accountidIsNotNull() {
            addCriterion("ab_accountid is not null");
            return (Criteria) this;
        }

        public Criteria andAb_accountidEqualTo(Long value) {
            addCriterion("ab_accountid =", value, "ab_accountid");
            return (Criteria) this;
        }

        public Criteria andAb_accountidNotEqualTo(Long value) {
            addCriterion("ab_accountid <>", value, "ab_accountid");
            return (Criteria) this;
        }

        public Criteria andAb_accountidGreaterThan(Long value) {
            addCriterion("ab_accountid >", value, "ab_accountid");
            return (Criteria) this;
        }

        public Criteria andAb_accountidGreaterThanOrEqualTo(Long value) {
            addCriterion("ab_accountid >=", value, "ab_accountid");
            return (Criteria) this;
        }

        public Criteria andAb_accountidLessThan(Long value) {
            addCriterion("ab_accountid <", value, "ab_accountid");
            return (Criteria) this;
        }

        public Criteria andAb_accountidLessThanOrEqualTo(Long value) {
            addCriterion("ab_accountid <=", value, "ab_accountid");
            return (Criteria) this;
        }

        public Criteria andAb_accountidIn(List<Long> values) {
            addCriterion("ab_accountid in", values, "ab_accountid");
            return (Criteria) this;
        }

        public Criteria andAb_accountidNotIn(List<Long> values) {
            addCriterion("ab_accountid not in", values, "ab_accountid");
            return (Criteria) this;
        }

        public Criteria andAb_accountidBetween(Long value1, Long value2) {
            addCriterion("ab_accountid between", value1, value2, "ab_accountid");
            return (Criteria) this;
        }

        public Criteria andAb_accountidNotBetween(Long value1, Long value2) {
            addCriterion("ab_accountid not between", value1, value2, "ab_accountid");
            return (Criteria) this;
        }

        public Criteria andAb_createidIsNull() {
            addCriterion("ab_createid is null");
            return (Criteria) this;
        }

        public Criteria andAb_createidIsNotNull() {
            addCriterion("ab_createid is not null");
            return (Criteria) this;
        }

        public Criteria andAb_createidEqualTo(Long value) {
            addCriterion("ab_createid =", value, "ab_createid");
            return (Criteria) this;
        }

        public Criteria andAb_createidNotEqualTo(Long value) {
            addCriterion("ab_createid <>", value, "ab_createid");
            return (Criteria) this;
        }

        public Criteria andAb_createidGreaterThan(Long value) {
            addCriterion("ab_createid >", value, "ab_createid");
            return (Criteria) this;
        }

        public Criteria andAb_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("ab_createid >=", value, "ab_createid");
            return (Criteria) this;
        }

        public Criteria andAb_createidLessThan(Long value) {
            addCriterion("ab_createid <", value, "ab_createid");
            return (Criteria) this;
        }

        public Criteria andAb_createidLessThanOrEqualTo(Long value) {
            addCriterion("ab_createid <=", value, "ab_createid");
            return (Criteria) this;
        }

        public Criteria andAb_createidIn(List<Long> values) {
            addCriterion("ab_createid in", values, "ab_createid");
            return (Criteria) this;
        }

        public Criteria andAb_createidNotIn(List<Long> values) {
            addCriterion("ab_createid not in", values, "ab_createid");
            return (Criteria) this;
        }

        public Criteria andAb_createidBetween(Long value1, Long value2) {
            addCriterion("ab_createid between", value1, value2, "ab_createid");
            return (Criteria) this;
        }

        public Criteria andAb_createidNotBetween(Long value1, Long value2) {
            addCriterion("ab_createid not between", value1, value2, "ab_createid");
            return (Criteria) this;
        }

        public Criteria andAb_createnoIsNull() {
            addCriterion("ab_createno is null");
            return (Criteria) this;
        }

        public Criteria andAb_createnoIsNotNull() {
            addCriterion("ab_createno is not null");
            return (Criteria) this;
        }

        public Criteria andAb_createnoEqualTo(String value) {
            addCriterion("ab_createno =", value, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createnoNotEqualTo(String value) {
            addCriterion("ab_createno <>", value, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createnoGreaterThan(String value) {
            addCriterion("ab_createno >", value, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("ab_createno >=", value, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createnoLessThan(String value) {
            addCriterion("ab_createno <", value, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createnoLessThanOrEqualTo(String value) {
            addCriterion("ab_createno <=", value, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createnoLike(String value) {
            addCriterion("ab_createno like", value, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createnoNotLike(String value) {
            addCriterion("ab_createno not like", value, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createnoIn(List<String> values) {
            addCriterion("ab_createno in", values, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createnoNotIn(List<String> values) {
            addCriterion("ab_createno not in", values, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createnoBetween(String value1, String value2) {
            addCriterion("ab_createno between", value1, value2, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createnoNotBetween(String value1, String value2) {
            addCriterion("ab_createno not between", value1, value2, "ab_createno");
            return (Criteria) this;
        }

        public Criteria andAb_createdateIsNull() {
            addCriterion("ab_createdate is null");
            return (Criteria) this;
        }

        public Criteria andAb_createdateIsNotNull() {
            addCriterion("ab_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andAb_createdateEqualTo(Date value) {
            addCriterion("ab_createdate =", value, "ab_createdate");
            return (Criteria) this;
        }

        public Criteria andAb_createdateNotEqualTo(Date value) {
            addCriterion("ab_createdate <>", value, "ab_createdate");
            return (Criteria) this;
        }

        public Criteria andAb_createdateGreaterThan(Date value) {
            addCriterion("ab_createdate >", value, "ab_createdate");
            return (Criteria) this;
        }

        public Criteria andAb_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ab_createdate >=", value, "ab_createdate");
            return (Criteria) this;
        }

        public Criteria andAb_createdateLessThan(Date value) {
            addCriterion("ab_createdate <", value, "ab_createdate");
            return (Criteria) this;
        }

        public Criteria andAb_createdateLessThanOrEqualTo(Date value) {
            addCriterion("ab_createdate <=", value, "ab_createdate");
            return (Criteria) this;
        }

        public Criteria andAb_createdateIn(List<Date> values) {
            addCriterion("ab_createdate in", values, "ab_createdate");
            return (Criteria) this;
        }

        public Criteria andAb_createdateNotIn(List<Date> values) {
            addCriterion("ab_createdate not in", values, "ab_createdate");
            return (Criteria) this;
        }

        public Criteria andAb_createdateBetween(Date value1, Date value2) {
            addCriterion("ab_createdate between", value1, value2, "ab_createdate");
            return (Criteria) this;
        }

        public Criteria andAb_createdateNotBetween(Date value1, Date value2) {
            addCriterion("ab_createdate not between", value1, value2, "ab_createdate");
            return (Criteria) this;
        }

        public Criteria andAb_statusIsNull() {
            addCriterion("ab_status is null");
            return (Criteria) this;
        }

        public Criteria andAb_statusIsNotNull() {
            addCriterion("ab_status is not null");
            return (Criteria) this;
        }

        public Criteria andAb_statusEqualTo(Byte value) {
            addCriterion("ab_status =", value, "ab_status");
            return (Criteria) this;
        }

        public Criteria andAb_statusNotEqualTo(Byte value) {
            addCriterion("ab_status <>", value, "ab_status");
            return (Criteria) this;
        }

        public Criteria andAb_statusGreaterThan(Byte value) {
            addCriterion("ab_status >", value, "ab_status");
            return (Criteria) this;
        }

        public Criteria andAb_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ab_status >=", value, "ab_status");
            return (Criteria) this;
        }

        public Criteria andAb_statusLessThan(Byte value) {
            addCriterion("ab_status <", value, "ab_status");
            return (Criteria) this;
        }

        public Criteria andAb_statusLessThanOrEqualTo(Byte value) {
            addCriterion("ab_status <=", value, "ab_status");
            return (Criteria) this;
        }

        public Criteria andAb_statusIn(List<Byte> values) {
            addCriterion("ab_status in", values, "ab_status");
            return (Criteria) this;
        }

        public Criteria andAb_statusNotIn(List<Byte> values) {
            addCriterion("ab_status not in", values, "ab_status");
            return (Criteria) this;
        }

        public Criteria andAb_statusBetween(Byte value1, Byte value2) {
            addCriterion("ab_status between", value1, value2, "ab_status");
            return (Criteria) this;
        }

        public Criteria andAb_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("ab_status not between", value1, value2, "ab_status");
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