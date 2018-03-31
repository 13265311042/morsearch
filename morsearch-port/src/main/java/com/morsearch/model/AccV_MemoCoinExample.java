package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccV_MemoCoinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccV_MemoCoinExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Long value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Long value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Long value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Long value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Long value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Long value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Long> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Long> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Long value1, Long value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Long value1, Long value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderno is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderno is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderno <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderno >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderno >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderno <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderno <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderno like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderno not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderno in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderno not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderno between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderno not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("orderdate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderdate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterion("orderdate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterion("orderdate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterion("orderdate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("orderdate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterion("orderdate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterion("orderdate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterion("orderdate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterion("orderdate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterion("orderdate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterion("orderdate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNull() {
            addCriterion("ordertype is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNotNull() {
            addCriterion("ordertype is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeEqualTo(String value) {
            addCriterion("ordertype =", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotEqualTo(String value) {
            addCriterion("ordertype <>", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThan(String value) {
            addCriterion("ordertype >", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThanOrEqualTo(String value) {
            addCriterion("ordertype >=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThan(String value) {
            addCriterion("ordertype <", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThanOrEqualTo(String value) {
            addCriterion("ordertype <=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLike(String value) {
            addCriterion("ordertype like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotLike(String value) {
            addCriterion("ordertype not like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIn(List<String> values) {
            addCriterion("ordertype in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotIn(List<String> values) {
            addCriterion("ordertype not in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeBetween(String value1, String value2) {
            addCriterion("ordertype between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotBetween(String value1, String value2) {
            addCriterion("ordertype not between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdersignIsNull() {
            addCriterion("ordersign is null");
            return (Criteria) this;
        }

        public Criteria andOrdersignIsNotNull() {
            addCriterion("ordersign is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersignEqualTo(String value) {
            addCriterion("ordersign =", value, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdersignNotEqualTo(String value) {
            addCriterion("ordersign <>", value, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdersignGreaterThan(String value) {
            addCriterion("ordersign >", value, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdersignGreaterThanOrEqualTo(String value) {
            addCriterion("ordersign >=", value, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdersignLessThan(String value) {
            addCriterion("ordersign <", value, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdersignLessThanOrEqualTo(String value) {
            addCriterion("ordersign <=", value, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdersignLike(String value) {
            addCriterion("ordersign like", value, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdersignNotLike(String value) {
            addCriterion("ordersign not like", value, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdersignIn(List<String> values) {
            addCriterion("ordersign in", values, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdersignNotIn(List<String> values) {
            addCriterion("ordersign not in", values, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdersignBetween(String value1, String value2) {
            addCriterion("ordersign between", value1, value2, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdersignNotBetween(String value1, String value2) {
            addCriterion("ordersign not between", value1, value2, "ordersign");
            return (Criteria) this;
        }

        public Criteria andOrdertitleIsNull() {
            addCriterion("ordertitle is null");
            return (Criteria) this;
        }

        public Criteria andOrdertitleIsNotNull() {
            addCriterion("ordertitle is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertitleEqualTo(String value) {
            addCriterion("ordertitle =", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleNotEqualTo(String value) {
            addCriterion("ordertitle <>", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleGreaterThan(String value) {
            addCriterion("ordertitle >", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleGreaterThanOrEqualTo(String value) {
            addCriterion("ordertitle >=", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleLessThan(String value) {
            addCriterion("ordertitle <", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleLessThanOrEqualTo(String value) {
            addCriterion("ordertitle <=", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleLike(String value) {
            addCriterion("ordertitle like", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleNotLike(String value) {
            addCriterion("ordertitle not like", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleIn(List<String> values) {
            addCriterion("ordertitle in", values, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleNotIn(List<String> values) {
            addCriterion("ordertitle not in", values, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleBetween(String value1, String value2) {
            addCriterion("ordertitle between", value1, value2, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleNotBetween(String value1, String value2) {
            addCriterion("ordertitle not between", value1, value2, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeIsNull() {
            addCriterion("ordercoincode is null");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeIsNotNull() {
            addCriterion("ordercoincode is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeEqualTo(String value) {
            addCriterion("ordercoincode =", value, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeNotEqualTo(String value) {
            addCriterion("ordercoincode <>", value, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeGreaterThan(String value) {
            addCriterion("ordercoincode >", value, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeGreaterThanOrEqualTo(String value) {
            addCriterion("ordercoincode >=", value, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeLessThan(String value) {
            addCriterion("ordercoincode <", value, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeLessThanOrEqualTo(String value) {
            addCriterion("ordercoincode <=", value, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeLike(String value) {
            addCriterion("ordercoincode like", value, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeNotLike(String value) {
            addCriterion("ordercoincode not like", value, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeIn(List<String> values) {
            addCriterion("ordercoincode in", values, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeNotIn(List<String> values) {
            addCriterion("ordercoincode not in", values, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeBetween(String value1, String value2) {
            addCriterion("ordercoincode between", value1, value2, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoincodeNotBetween(String value1, String value2) {
            addCriterion("ordercoincode not between", value1, value2, "ordercoincode");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameIsNull() {
            addCriterion("ordercoinname is null");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameIsNotNull() {
            addCriterion("ordercoinname is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameEqualTo(String value) {
            addCriterion("ordercoinname =", value, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameNotEqualTo(String value) {
            addCriterion("ordercoinname <>", value, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameGreaterThan(String value) {
            addCriterion("ordercoinname >", value, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameGreaterThanOrEqualTo(String value) {
            addCriterion("ordercoinname >=", value, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameLessThan(String value) {
            addCriterion("ordercoinname <", value, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameLessThanOrEqualTo(String value) {
            addCriterion("ordercoinname <=", value, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameLike(String value) {
            addCriterion("ordercoinname like", value, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameNotLike(String value) {
            addCriterion("ordercoinname not like", value, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameIn(List<String> values) {
            addCriterion("ordercoinname in", values, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameNotIn(List<String> values) {
            addCriterion("ordercoinname not in", values, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameBetween(String value1, String value2) {
            addCriterion("ordercoinname between", value1, value2, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinnameNotBetween(String value1, String value2) {
            addCriterion("ordercoinname not between", value1, value2, "ordercoinname");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyIsNull() {
            addCriterion("ordercoinqty is null");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyIsNotNull() {
            addCriterion("ordercoinqty is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyEqualTo(BigDecimal value) {
            addCriterion("ordercoinqty =", value, "ordercoinqty");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyNotEqualTo(BigDecimal value) {
            addCriterion("ordercoinqty <>", value, "ordercoinqty");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyGreaterThan(BigDecimal value) {
            addCriterion("ordercoinqty >", value, "ordercoinqty");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ordercoinqty >=", value, "ordercoinqty");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyLessThan(BigDecimal value) {
            addCriterion("ordercoinqty <", value, "ordercoinqty");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ordercoinqty <=", value, "ordercoinqty");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyIn(List<BigDecimal> values) {
            addCriterion("ordercoinqty in", values, "ordercoinqty");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyNotIn(List<BigDecimal> values) {
            addCriterion("ordercoinqty not in", values, "ordercoinqty");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ordercoinqty between", value1, value2, "ordercoinqty");
            return (Criteria) this;
        }

        public Criteria andOrdercoinqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ordercoinqty not between", value1, value2, "ordercoinqty");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceIsNull() {
            addCriterion("ordercoinprice is null");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceIsNotNull() {
            addCriterion("ordercoinprice is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceEqualTo(BigDecimal value) {
            addCriterion("ordercoinprice =", value, "ordercoinprice");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceNotEqualTo(BigDecimal value) {
            addCriterion("ordercoinprice <>", value, "ordercoinprice");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceGreaterThan(BigDecimal value) {
            addCriterion("ordercoinprice >", value, "ordercoinprice");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ordercoinprice >=", value, "ordercoinprice");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceLessThan(BigDecimal value) {
            addCriterion("ordercoinprice <", value, "ordercoinprice");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ordercoinprice <=", value, "ordercoinprice");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceIn(List<BigDecimal> values) {
            addCriterion("ordercoinprice in", values, "ordercoinprice");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceNotIn(List<BigDecimal> values) {
            addCriterion("ordercoinprice not in", values, "ordercoinprice");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ordercoinprice between", value1, value2, "ordercoinprice");
            return (Criteria) this;
        }

        public Criteria andOrdercoinpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ordercoinprice not between", value1, value2, "ordercoinprice");
            return (Criteria) this;
        }

        public Criteria andOrderaccountIsNull() {
            addCriterion("orderaccount is null");
            return (Criteria) this;
        }

        public Criteria andOrderaccountIsNotNull() {
            addCriterion("orderaccount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderaccountEqualTo(BigDecimal value) {
            addCriterion("orderaccount =", value, "orderaccount");
            return (Criteria) this;
        }

        public Criteria andOrderaccountNotEqualTo(BigDecimal value) {
            addCriterion("orderaccount <>", value, "orderaccount");
            return (Criteria) this;
        }

        public Criteria andOrderaccountGreaterThan(BigDecimal value) {
            addCriterion("orderaccount >", value, "orderaccount");
            return (Criteria) this;
        }

        public Criteria andOrderaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orderaccount >=", value, "orderaccount");
            return (Criteria) this;
        }

        public Criteria andOrderaccountLessThan(BigDecimal value) {
            addCriterion("orderaccount <", value, "orderaccount");
            return (Criteria) this;
        }

        public Criteria andOrderaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orderaccount <=", value, "orderaccount");
            return (Criteria) this;
        }

        public Criteria andOrderaccountIn(List<BigDecimal> values) {
            addCriterion("orderaccount in", values, "orderaccount");
            return (Criteria) this;
        }

        public Criteria andOrderaccountNotIn(List<BigDecimal> values) {
            addCriterion("orderaccount not in", values, "orderaccount");
            return (Criteria) this;
        }

        public Criteria andOrderaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderaccount between", value1, value2, "orderaccount");
            return (Criteria) this;
        }

        public Criteria andOrderaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderaccount not between", value1, value2, "orderaccount");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("accountid is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("accountid is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(Long value) {
            addCriterion("accountid =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(Long value) {
            addCriterion("accountid <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(Long value) {
            addCriterion("accountid >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(Long value) {
            addCriterion("accountid >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(Long value) {
            addCriterion("accountid <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(Long value) {
            addCriterion("accountid <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<Long> values) {
            addCriterion("accountid in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<Long> values) {
            addCriterion("accountid not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(Long value1, Long value2) {
            addCriterion("accountid between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(Long value1, Long value2) {
            addCriterion("accountid not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNull() {
            addCriterion("createid is null");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNotNull() {
            addCriterion("createid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateidEqualTo(Long value) {
            addCriterion("createid =", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotEqualTo(Long value) {
            addCriterion("createid <>", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThan(Long value) {
            addCriterion("createid >", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThanOrEqualTo(Long value) {
            addCriterion("createid >=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThan(Long value) {
            addCriterion("createid <", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThanOrEqualTo(Long value) {
            addCriterion("createid <=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidIn(List<Long> values) {
            addCriterion("createid in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotIn(List<Long> values) {
            addCriterion("createid not in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidBetween(Long value1, Long value2) {
            addCriterion("createid between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotBetween(Long value1, Long value2) {
            addCriterion("createid not between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("accountname is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("accountname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("accountname =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("accountname <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("accountname >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("accountname >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("accountname <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("accountname <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("accountname like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("accountname not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("accountname in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("accountname not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("accountname between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("accountname not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNull() {
            addCriterion("createname is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("createname is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("createname =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("createname <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("createname >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("createname >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("createname <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("createname <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("createname like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("createname not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("createname in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("createname not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("createname between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("createname not between", value1, value2, "createname");
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