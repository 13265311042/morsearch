package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallV_OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallV_OrderExample() {
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

        public Criteria andMo_noIsNull() {
            addCriterion("mo_no is null");
            return (Criteria) this;
        }

        public Criteria andMo_noIsNotNull() {
            addCriterion("mo_no is not null");
            return (Criteria) this;
        }

        public Criteria andMo_noEqualTo(String value) {
            addCriterion("mo_no =", value, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_noNotEqualTo(String value) {
            addCriterion("mo_no <>", value, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_noGreaterThan(String value) {
            addCriterion("mo_no >", value, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_noGreaterThanOrEqualTo(String value) {
            addCriterion("mo_no >=", value, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_noLessThan(String value) {
            addCriterion("mo_no <", value, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_noLessThanOrEqualTo(String value) {
            addCriterion("mo_no <=", value, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_noLike(String value) {
            addCriterion("mo_no like", value, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_noNotLike(String value) {
            addCriterion("mo_no not like", value, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_noIn(List<String> values) {
            addCriterion("mo_no in", values, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_noNotIn(List<String> values) {
            addCriterion("mo_no not in", values, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_noBetween(String value1, String value2) {
            addCriterion("mo_no between", value1, value2, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_noNotBetween(String value1, String value2) {
            addCriterion("mo_no not between", value1, value2, "mo_no");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderIsNull() {
            addCriterion("mo_dateorder is null");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderIsNotNull() {
            addCriterion("mo_dateorder is not null");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderEqualTo(Date value) {
            addCriterion("mo_dateorder =", value, "mo_dateorder");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderNotEqualTo(Date value) {
            addCriterion("mo_dateorder <>", value, "mo_dateorder");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderGreaterThan(Date value) {
            addCriterion("mo_dateorder >", value, "mo_dateorder");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_dateorder >=", value, "mo_dateorder");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderLessThan(Date value) {
            addCriterion("mo_dateorder <", value, "mo_dateorder");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderLessThanOrEqualTo(Date value) {
            addCriterion("mo_dateorder <=", value, "mo_dateorder");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderIn(List<Date> values) {
            addCriterion("mo_dateorder in", values, "mo_dateorder");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderNotIn(List<Date> values) {
            addCriterion("mo_dateorder not in", values, "mo_dateorder");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderBetween(Date value1, Date value2) {
            addCriterion("mo_dateorder between", value1, value2, "mo_dateorder");
            return (Criteria) this;
        }

        public Criteria andMo_dateorderNotBetween(Date value1, Date value2) {
            addCriterion("mo_dateorder not between", value1, value2, "mo_dateorder");
            return (Criteria) this;
        }

        public Criteria andMo_datepayIsNull() {
            addCriterion("mo_datepay is null");
            return (Criteria) this;
        }

        public Criteria andMo_datepayIsNotNull() {
            addCriterion("mo_datepay is not null");
            return (Criteria) this;
        }

        public Criteria andMo_datepayEqualTo(Date value) {
            addCriterion("mo_datepay =", value, "mo_datepay");
            return (Criteria) this;
        }

        public Criteria andMo_datepayNotEqualTo(Date value) {
            addCriterion("mo_datepay <>", value, "mo_datepay");
            return (Criteria) this;
        }

        public Criteria andMo_datepayGreaterThan(Date value) {
            addCriterion("mo_datepay >", value, "mo_datepay");
            return (Criteria) this;
        }

        public Criteria andMo_datepayGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_datepay >=", value, "mo_datepay");
            return (Criteria) this;
        }

        public Criteria andMo_datepayLessThan(Date value) {
            addCriterion("mo_datepay <", value, "mo_datepay");
            return (Criteria) this;
        }

        public Criteria andMo_datepayLessThanOrEqualTo(Date value) {
            addCriterion("mo_datepay <=", value, "mo_datepay");
            return (Criteria) this;
        }

        public Criteria andMo_datepayIn(List<Date> values) {
            addCriterion("mo_datepay in", values, "mo_datepay");
            return (Criteria) this;
        }

        public Criteria andMo_datepayNotIn(List<Date> values) {
            addCriterion("mo_datepay not in", values, "mo_datepay");
            return (Criteria) this;
        }

        public Criteria andMo_datepayBetween(Date value1, Date value2) {
            addCriterion("mo_datepay between", value1, value2, "mo_datepay");
            return (Criteria) this;
        }

        public Criteria andMo_datepayNotBetween(Date value1, Date value2) {
            addCriterion("mo_datepay not between", value1, value2, "mo_datepay");
            return (Criteria) this;
        }

        public Criteria andMo_datesendIsNull() {
            addCriterion("mo_datesend is null");
            return (Criteria) this;
        }

        public Criteria andMo_datesendIsNotNull() {
            addCriterion("mo_datesend is not null");
            return (Criteria) this;
        }

        public Criteria andMo_datesendEqualTo(Date value) {
            addCriterion("mo_datesend =", value, "mo_datesend");
            return (Criteria) this;
        }

        public Criteria andMo_datesendNotEqualTo(Date value) {
            addCriterion("mo_datesend <>", value, "mo_datesend");
            return (Criteria) this;
        }

        public Criteria andMo_datesendGreaterThan(Date value) {
            addCriterion("mo_datesend >", value, "mo_datesend");
            return (Criteria) this;
        }

        public Criteria andMo_datesendGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_datesend >=", value, "mo_datesend");
            return (Criteria) this;
        }

        public Criteria andMo_datesendLessThan(Date value) {
            addCriterion("mo_datesend <", value, "mo_datesend");
            return (Criteria) this;
        }

        public Criteria andMo_datesendLessThanOrEqualTo(Date value) {
            addCriterion("mo_datesend <=", value, "mo_datesend");
            return (Criteria) this;
        }

        public Criteria andMo_datesendIn(List<Date> values) {
            addCriterion("mo_datesend in", values, "mo_datesend");
            return (Criteria) this;
        }

        public Criteria andMo_datesendNotIn(List<Date> values) {
            addCriterion("mo_datesend not in", values, "mo_datesend");
            return (Criteria) this;
        }

        public Criteria andMo_datesendBetween(Date value1, Date value2) {
            addCriterion("mo_datesend between", value1, value2, "mo_datesend");
            return (Criteria) this;
        }

        public Criteria andMo_datesendNotBetween(Date value1, Date value2) {
            addCriterion("mo_datesend not between", value1, value2, "mo_datesend");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryIsNull() {
            addCriterion("mo_datedelivery is null");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryIsNotNull() {
            addCriterion("mo_datedelivery is not null");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryEqualTo(Date value) {
            addCriterion("mo_datedelivery =", value, "mo_datedelivery");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryNotEqualTo(Date value) {
            addCriterion("mo_datedelivery <>", value, "mo_datedelivery");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryGreaterThan(Date value) {
            addCriterion("mo_datedelivery >", value, "mo_datedelivery");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_datedelivery >=", value, "mo_datedelivery");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryLessThan(Date value) {
            addCriterion("mo_datedelivery <", value, "mo_datedelivery");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryLessThanOrEqualTo(Date value) {
            addCriterion("mo_datedelivery <=", value, "mo_datedelivery");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryIn(List<Date> values) {
            addCriterion("mo_datedelivery in", values, "mo_datedelivery");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryNotIn(List<Date> values) {
            addCriterion("mo_datedelivery not in", values, "mo_datedelivery");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryBetween(Date value1, Date value2) {
            addCriterion("mo_datedelivery between", value1, value2, "mo_datedelivery");
            return (Criteria) this;
        }

        public Criteria andMo_datedeliveryNotBetween(Date value1, Date value2) {
            addCriterion("mo_datedelivery not between", value1, value2, "mo_datedelivery");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseIsNull() {
            addCriterion("mo_dateappraise is null");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseIsNotNull() {
            addCriterion("mo_dateappraise is not null");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseEqualTo(Date value) {
            addCriterion("mo_dateappraise =", value, "mo_dateappraise");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseNotEqualTo(Date value) {
            addCriterion("mo_dateappraise <>", value, "mo_dateappraise");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseGreaterThan(Date value) {
            addCriterion("mo_dateappraise >", value, "mo_dateappraise");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_dateappraise >=", value, "mo_dateappraise");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseLessThan(Date value) {
            addCriterion("mo_dateappraise <", value, "mo_dateappraise");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseLessThanOrEqualTo(Date value) {
            addCriterion("mo_dateappraise <=", value, "mo_dateappraise");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseIn(List<Date> values) {
            addCriterion("mo_dateappraise in", values, "mo_dateappraise");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseNotIn(List<Date> values) {
            addCriterion("mo_dateappraise not in", values, "mo_dateappraise");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseBetween(Date value1, Date value2) {
            addCriterion("mo_dateappraise between", value1, value2, "mo_dateappraise");
            return (Criteria) this;
        }

        public Criteria andMo_dateappraiseNotBetween(Date value1, Date value2) {
            addCriterion("mo_dateappraise not between", value1, value2, "mo_dateappraise");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnIsNull() {
            addCriterion("mo_datereturn is null");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnIsNotNull() {
            addCriterion("mo_datereturn is not null");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnEqualTo(Date value) {
            addCriterion("mo_datereturn =", value, "mo_datereturn");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnNotEqualTo(Date value) {
            addCriterion("mo_datereturn <>", value, "mo_datereturn");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnGreaterThan(Date value) {
            addCriterion("mo_datereturn >", value, "mo_datereturn");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_datereturn >=", value, "mo_datereturn");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnLessThan(Date value) {
            addCriterion("mo_datereturn <", value, "mo_datereturn");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnLessThanOrEqualTo(Date value) {
            addCriterion("mo_datereturn <=", value, "mo_datereturn");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnIn(List<Date> values) {
            addCriterion("mo_datereturn in", values, "mo_datereturn");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnNotIn(List<Date> values) {
            addCriterion("mo_datereturn not in", values, "mo_datereturn");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnBetween(Date value1, Date value2) {
            addCriterion("mo_datereturn between", value1, value2, "mo_datereturn");
            return (Criteria) this;
        }

        public Criteria andMo_datereturnNotBetween(Date value1, Date value2) {
            addCriterion("mo_datereturn not between", value1, value2, "mo_datereturn");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishIsNull() {
            addCriterion("mo_datefinish is null");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishIsNotNull() {
            addCriterion("mo_datefinish is not null");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishEqualTo(Date value) {
            addCriterion("mo_datefinish =", value, "mo_datefinish");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishNotEqualTo(Date value) {
            addCriterion("mo_datefinish <>", value, "mo_datefinish");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishGreaterThan(Date value) {
            addCriterion("mo_datefinish >", value, "mo_datefinish");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_datefinish >=", value, "mo_datefinish");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishLessThan(Date value) {
            addCriterion("mo_datefinish <", value, "mo_datefinish");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishLessThanOrEqualTo(Date value) {
            addCriterion("mo_datefinish <=", value, "mo_datefinish");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishIn(List<Date> values) {
            addCriterion("mo_datefinish in", values, "mo_datefinish");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishNotIn(List<Date> values) {
            addCriterion("mo_datefinish not in", values, "mo_datefinish");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishBetween(Date value1, Date value2) {
            addCriterion("mo_datefinish between", value1, value2, "mo_datefinish");
            return (Criteria) this;
        }

        public Criteria andMo_datefinishNotBetween(Date value1, Date value2) {
            addCriterion("mo_datefinish not between", value1, value2, "mo_datefinish");
            return (Criteria) this;
        }

        public Criteria andMo_useridIsNull() {
            addCriterion("mo_userid is null");
            return (Criteria) this;
        }

        public Criteria andMo_useridIsNotNull() {
            addCriterion("mo_userid is not null");
            return (Criteria) this;
        }

        public Criteria andMo_useridEqualTo(Long value) {
            addCriterion("mo_userid =", value, "mo_userid");
            return (Criteria) this;
        }

        public Criteria andMo_useridNotEqualTo(Long value) {
            addCriterion("mo_userid <>", value, "mo_userid");
            return (Criteria) this;
        }

        public Criteria andMo_useridGreaterThan(Long value) {
            addCriterion("mo_userid >", value, "mo_userid");
            return (Criteria) this;
        }

        public Criteria andMo_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("mo_userid >=", value, "mo_userid");
            return (Criteria) this;
        }

        public Criteria andMo_useridLessThan(Long value) {
            addCriterion("mo_userid <", value, "mo_userid");
            return (Criteria) this;
        }

        public Criteria andMo_useridLessThanOrEqualTo(Long value) {
            addCriterion("mo_userid <=", value, "mo_userid");
            return (Criteria) this;
        }

        public Criteria andMo_useridIn(List<Long> values) {
            addCriterion("mo_userid in", values, "mo_userid");
            return (Criteria) this;
        }

        public Criteria andMo_useridNotIn(List<Long> values) {
            addCriterion("mo_userid not in", values, "mo_userid");
            return (Criteria) this;
        }

        public Criteria andMo_useridBetween(Long value1, Long value2) {
            addCriterion("mo_userid between", value1, value2, "mo_userid");
            return (Criteria) this;
        }

        public Criteria andMo_useridNotBetween(Long value1, Long value2) {
            addCriterion("mo_userid not between", value1, value2, "mo_userid");
            return (Criteria) this;
        }

        public Criteria andMo_usernickIsNull() {
            addCriterion("mo_usernick is null");
            return (Criteria) this;
        }

        public Criteria andMo_usernickIsNotNull() {
            addCriterion("mo_usernick is not null");
            return (Criteria) this;
        }

        public Criteria andMo_usernickEqualTo(String value) {
            addCriterion("mo_usernick =", value, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_usernickNotEqualTo(String value) {
            addCriterion("mo_usernick <>", value, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_usernickGreaterThan(String value) {
            addCriterion("mo_usernick >", value, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_usernickGreaterThanOrEqualTo(String value) {
            addCriterion("mo_usernick >=", value, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_usernickLessThan(String value) {
            addCriterion("mo_usernick <", value, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_usernickLessThanOrEqualTo(String value) {
            addCriterion("mo_usernick <=", value, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_usernickLike(String value) {
            addCriterion("mo_usernick like", value, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_usernickNotLike(String value) {
            addCriterion("mo_usernick not like", value, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_usernickIn(List<String> values) {
            addCriterion("mo_usernick in", values, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_usernickNotIn(List<String> values) {
            addCriterion("mo_usernick not in", values, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_usernickBetween(String value1, String value2) {
            addCriterion("mo_usernick between", value1, value2, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_usernickNotBetween(String value1, String value2) {
            addCriterion("mo_usernick not between", value1, value2, "mo_usernick");
            return (Criteria) this;
        }

        public Criteria andMo_userimageIsNull() {
            addCriterion("mo_userimage is null");
            return (Criteria) this;
        }

        public Criteria andMo_userimageIsNotNull() {
            addCriterion("mo_userimage is not null");
            return (Criteria) this;
        }

        public Criteria andMo_userimageEqualTo(String value) {
            addCriterion("mo_userimage =", value, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_userimageNotEqualTo(String value) {
            addCriterion("mo_userimage <>", value, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_userimageGreaterThan(String value) {
            addCriterion("mo_userimage >", value, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_userimageGreaterThanOrEqualTo(String value) {
            addCriterion("mo_userimage >=", value, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_userimageLessThan(String value) {
            addCriterion("mo_userimage <", value, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_userimageLessThanOrEqualTo(String value) {
            addCriterion("mo_userimage <=", value, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_userimageLike(String value) {
            addCriterion("mo_userimage like", value, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_userimageNotLike(String value) {
            addCriterion("mo_userimage not like", value, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_userimageIn(List<String> values) {
            addCriterion("mo_userimage in", values, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_userimageNotIn(List<String> values) {
            addCriterion("mo_userimage not in", values, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_userimageBetween(String value1, String value2) {
            addCriterion("mo_userimage between", value1, value2, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_userimageNotBetween(String value1, String value2) {
            addCriterion("mo_userimage not between", value1, value2, "mo_userimage");
            return (Criteria) this;
        }

        public Criteria andMo_riverIsNull() {
            addCriterion("mo_river is null");
            return (Criteria) this;
        }

        public Criteria andMo_riverIsNotNull() {
            addCriterion("mo_river is not null");
            return (Criteria) this;
        }

        public Criteria andMo_riverEqualTo(String value) {
            addCriterion("mo_river =", value, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_riverNotEqualTo(String value) {
            addCriterion("mo_river <>", value, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_riverGreaterThan(String value) {
            addCriterion("mo_river >", value, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_riverGreaterThanOrEqualTo(String value) {
            addCriterion("mo_river >=", value, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_riverLessThan(String value) {
            addCriterion("mo_river <", value, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_riverLessThanOrEqualTo(String value) {
            addCriterion("mo_river <=", value, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_riverLike(String value) {
            addCriterion("mo_river like", value, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_riverNotLike(String value) {
            addCriterion("mo_river not like", value, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_riverIn(List<String> values) {
            addCriterion("mo_river in", values, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_riverNotIn(List<String> values) {
            addCriterion("mo_river not in", values, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_riverBetween(String value1, String value2) {
            addCriterion("mo_river between", value1, value2, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_riverNotBetween(String value1, String value2) {
            addCriterion("mo_river not between", value1, value2, "mo_river");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneIsNull() {
            addCriterion("mo_rivphone is null");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneIsNotNull() {
            addCriterion("mo_rivphone is not null");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneEqualTo(String value) {
            addCriterion("mo_rivphone =", value, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneNotEqualTo(String value) {
            addCriterion("mo_rivphone <>", value, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneGreaterThan(String value) {
            addCriterion("mo_rivphone >", value, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneGreaterThanOrEqualTo(String value) {
            addCriterion("mo_rivphone >=", value, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneLessThan(String value) {
            addCriterion("mo_rivphone <", value, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneLessThanOrEqualTo(String value) {
            addCriterion("mo_rivphone <=", value, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneLike(String value) {
            addCriterion("mo_rivphone like", value, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneNotLike(String value) {
            addCriterion("mo_rivphone not like", value, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneIn(List<String> values) {
            addCriterion("mo_rivphone in", values, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneNotIn(List<String> values) {
            addCriterion("mo_rivphone not in", values, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneBetween(String value1, String value2) {
            addCriterion("mo_rivphone between", value1, value2, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivphoneNotBetween(String value1, String value2) {
            addCriterion("mo_rivphone not between", value1, value2, "mo_rivphone");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressIsNull() {
            addCriterion("mo_rivaddress is null");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressIsNotNull() {
            addCriterion("mo_rivaddress is not null");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressEqualTo(String value) {
            addCriterion("mo_rivaddress =", value, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressNotEqualTo(String value) {
            addCriterion("mo_rivaddress <>", value, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressGreaterThan(String value) {
            addCriterion("mo_rivaddress >", value, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressGreaterThanOrEqualTo(String value) {
            addCriterion("mo_rivaddress >=", value, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressLessThan(String value) {
            addCriterion("mo_rivaddress <", value, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressLessThanOrEqualTo(String value) {
            addCriterion("mo_rivaddress <=", value, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressLike(String value) {
            addCriterion("mo_rivaddress like", value, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressNotLike(String value) {
            addCriterion("mo_rivaddress not like", value, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressIn(List<String> values) {
            addCriterion("mo_rivaddress in", values, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressNotIn(List<String> values) {
            addCriterion("mo_rivaddress not in", values, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressBetween(String value1, String value2) {
            addCriterion("mo_rivaddress between", value1, value2, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_rivaddressNotBetween(String value1, String value2) {
            addCriterion("mo_rivaddress not between", value1, value2, "mo_rivaddress");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyIsNull() {
            addCriterion("mo_sumqty is null");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyIsNotNull() {
            addCriterion("mo_sumqty is not null");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyEqualTo(Integer value) {
            addCriterion("mo_sumqty =", value, "mo_sumqty");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyNotEqualTo(Integer value) {
            addCriterion("mo_sumqty <>", value, "mo_sumqty");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyGreaterThan(Integer value) {
            addCriterion("mo_sumqty >", value, "mo_sumqty");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("mo_sumqty >=", value, "mo_sumqty");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyLessThan(Integer value) {
            addCriterion("mo_sumqty <", value, "mo_sumqty");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyLessThanOrEqualTo(Integer value) {
            addCriterion("mo_sumqty <=", value, "mo_sumqty");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyIn(List<Integer> values) {
            addCriterion("mo_sumqty in", values, "mo_sumqty");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyNotIn(List<Integer> values) {
            addCriterion("mo_sumqty not in", values, "mo_sumqty");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyBetween(Integer value1, Integer value2) {
            addCriterion("mo_sumqty between", value1, value2, "mo_sumqty");
            return (Criteria) this;
        }

        public Criteria andMo_sumqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("mo_sumqty not between", value1, value2, "mo_sumqty");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsIsNull() {
            addCriterion("mo_payamtgoods is null");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsIsNotNull() {
            addCriterion("mo_payamtgoods is not null");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsEqualTo(BigDecimal value) {
            addCriterion("mo_payamtgoods =", value, "mo_payamtgoods");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsNotEqualTo(BigDecimal value) {
            addCriterion("mo_payamtgoods <>", value, "mo_payamtgoods");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsGreaterThan(BigDecimal value) {
            addCriterion("mo_payamtgoods >", value, "mo_payamtgoods");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mo_payamtgoods >=", value, "mo_payamtgoods");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsLessThan(BigDecimal value) {
            addCriterion("mo_payamtgoods <", value, "mo_payamtgoods");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mo_payamtgoods <=", value, "mo_payamtgoods");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsIn(List<BigDecimal> values) {
            addCriterion("mo_payamtgoods in", values, "mo_payamtgoods");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsNotIn(List<BigDecimal> values) {
            addCriterion("mo_payamtgoods not in", values, "mo_payamtgoods");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mo_payamtgoods between", value1, value2, "mo_payamtgoods");
            return (Criteria) this;
        }

        public Criteria andMo_payamtgoodsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mo_payamtgoods not between", value1, value2, "mo_payamtgoods");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightIsNull() {
            addCriterion("mo_payamtfreight is null");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightIsNotNull() {
            addCriterion("mo_payamtfreight is not null");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightEqualTo(BigDecimal value) {
            addCriterion("mo_payamtfreight =", value, "mo_payamtfreight");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightNotEqualTo(BigDecimal value) {
            addCriterion("mo_payamtfreight <>", value, "mo_payamtfreight");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightGreaterThan(BigDecimal value) {
            addCriterion("mo_payamtfreight >", value, "mo_payamtfreight");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mo_payamtfreight >=", value, "mo_payamtfreight");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightLessThan(BigDecimal value) {
            addCriterion("mo_payamtfreight <", value, "mo_payamtfreight");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mo_payamtfreight <=", value, "mo_payamtfreight");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightIn(List<BigDecimal> values) {
            addCriterion("mo_payamtfreight in", values, "mo_payamtfreight");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightNotIn(List<BigDecimal> values) {
            addCriterion("mo_payamtfreight not in", values, "mo_payamtfreight");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mo_payamtfreight between", value1, value2, "mo_payamtfreight");
            return (Criteria) this;
        }

        public Criteria andMo_payamtfreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mo_payamtfreight not between", value1, value2, "mo_payamtfreight");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderIsNull() {
            addCriterion("mo_payamtorder is null");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderIsNotNull() {
            addCriterion("mo_payamtorder is not null");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderEqualTo(BigDecimal value) {
            addCriterion("mo_payamtorder =", value, "mo_payamtorder");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderNotEqualTo(BigDecimal value) {
            addCriterion("mo_payamtorder <>", value, "mo_payamtorder");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderGreaterThan(BigDecimal value) {
            addCriterion("mo_payamtorder >", value, "mo_payamtorder");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mo_payamtorder >=", value, "mo_payamtorder");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderLessThan(BigDecimal value) {
            addCriterion("mo_payamtorder <", value, "mo_payamtorder");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mo_payamtorder <=", value, "mo_payamtorder");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderIn(List<BigDecimal> values) {
            addCriterion("mo_payamtorder in", values, "mo_payamtorder");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderNotIn(List<BigDecimal> values) {
            addCriterion("mo_payamtorder not in", values, "mo_payamtorder");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mo_payamtorder between", value1, value2, "mo_payamtorder");
            return (Criteria) this;
        }

        public Criteria andMo_payamtorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mo_payamtorder not between", value1, value2, "mo_payamtorder");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualIsNull() {
            addCriterion("mo_payamtactual is null");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualIsNotNull() {
            addCriterion("mo_payamtactual is not null");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualEqualTo(BigDecimal value) {
            addCriterion("mo_payamtactual =", value, "mo_payamtactual");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualNotEqualTo(BigDecimal value) {
            addCriterion("mo_payamtactual <>", value, "mo_payamtactual");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualGreaterThan(BigDecimal value) {
            addCriterion("mo_payamtactual >", value, "mo_payamtactual");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mo_payamtactual >=", value, "mo_payamtactual");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualLessThan(BigDecimal value) {
            addCriterion("mo_payamtactual <", value, "mo_payamtactual");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mo_payamtactual <=", value, "mo_payamtactual");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualIn(List<BigDecimal> values) {
            addCriterion("mo_payamtactual in", values, "mo_payamtactual");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualNotIn(List<BigDecimal> values) {
            addCriterion("mo_payamtactual not in", values, "mo_payamtactual");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mo_payamtactual between", value1, value2, "mo_payamtactual");
            return (Criteria) this;
        }

        public Criteria andMo_payamtactualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mo_payamtactual not between", value1, value2, "mo_payamtactual");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceIsNull() {
            addCriterion("mo_paybalance is null");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceIsNotNull() {
            addCriterion("mo_paybalance is not null");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceEqualTo(BigDecimal value) {
            addCriterion("mo_paybalance =", value, "mo_paybalance");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceNotEqualTo(BigDecimal value) {
            addCriterion("mo_paybalance <>", value, "mo_paybalance");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceGreaterThan(BigDecimal value) {
            addCriterion("mo_paybalance >", value, "mo_paybalance");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mo_paybalance >=", value, "mo_paybalance");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceLessThan(BigDecimal value) {
            addCriterion("mo_paybalance <", value, "mo_paybalance");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mo_paybalance <=", value, "mo_paybalance");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceIn(List<BigDecimal> values) {
            addCriterion("mo_paybalance in", values, "mo_paybalance");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceNotIn(List<BigDecimal> values) {
            addCriterion("mo_paybalance not in", values, "mo_paybalance");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mo_paybalance between", value1, value2, "mo_paybalance");
            return (Criteria) this;
        }

        public Criteria andMo_paybalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mo_paybalance not between", value1, value2, "mo_paybalance");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayIsNull() {
            addCriterion("mo_tradeway is null");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayIsNotNull() {
            addCriterion("mo_tradeway is not null");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayEqualTo(Byte value) {
            addCriterion("mo_tradeway =", value, "mo_tradeway");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayNotEqualTo(Byte value) {
            addCriterion("mo_tradeway <>", value, "mo_tradeway");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayGreaterThan(Byte value) {
            addCriterion("mo_tradeway >", value, "mo_tradeway");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayGreaterThanOrEqualTo(Byte value) {
            addCriterion("mo_tradeway >=", value, "mo_tradeway");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayLessThan(Byte value) {
            addCriterion("mo_tradeway <", value, "mo_tradeway");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayLessThanOrEqualTo(Byte value) {
            addCriterion("mo_tradeway <=", value, "mo_tradeway");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayIn(List<Byte> values) {
            addCriterion("mo_tradeway in", values, "mo_tradeway");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayNotIn(List<Byte> values) {
            addCriterion("mo_tradeway not in", values, "mo_tradeway");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayBetween(Byte value1, Byte value2) {
            addCriterion("mo_tradeway between", value1, value2, "mo_tradeway");
            return (Criteria) this;
        }

        public Criteria andMo_tradewayNotBetween(Byte value1, Byte value2) {
            addCriterion("mo_tradeway not between", value1, value2, "mo_tradeway");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameIsNull() {
            addCriterion("mo_tradename is null");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameIsNotNull() {
            addCriterion("mo_tradename is not null");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameEqualTo(String value) {
            addCriterion("mo_tradename =", value, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameNotEqualTo(String value) {
            addCriterion("mo_tradename <>", value, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameGreaterThan(String value) {
            addCriterion("mo_tradename >", value, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameGreaterThanOrEqualTo(String value) {
            addCriterion("mo_tradename >=", value, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameLessThan(String value) {
            addCriterion("mo_tradename <", value, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameLessThanOrEqualTo(String value) {
            addCriterion("mo_tradename <=", value, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameLike(String value) {
            addCriterion("mo_tradename like", value, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameNotLike(String value) {
            addCriterion("mo_tradename not like", value, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameIn(List<String> values) {
            addCriterion("mo_tradename in", values, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameNotIn(List<String> values) {
            addCriterion("mo_tradename not in", values, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameBetween(String value1, String value2) {
            addCriterion("mo_tradename between", value1, value2, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradenameNotBetween(String value1, String value2) {
            addCriterion("mo_tradename not between", value1, value2, "mo_tradename");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardIsNull() {
            addCriterion("mo_tradecard is null");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardIsNotNull() {
            addCriterion("mo_tradecard is not null");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardEqualTo(String value) {
            addCriterion("mo_tradecard =", value, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardNotEqualTo(String value) {
            addCriterion("mo_tradecard <>", value, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardGreaterThan(String value) {
            addCriterion("mo_tradecard >", value, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardGreaterThanOrEqualTo(String value) {
            addCriterion("mo_tradecard >=", value, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardLessThan(String value) {
            addCriterion("mo_tradecard <", value, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardLessThanOrEqualTo(String value) {
            addCriterion("mo_tradecard <=", value, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardLike(String value) {
            addCriterion("mo_tradecard like", value, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardNotLike(String value) {
            addCriterion("mo_tradecard not like", value, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardIn(List<String> values) {
            addCriterion("mo_tradecard in", values, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardNotIn(List<String> values) {
            addCriterion("mo_tradecard not in", values, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardBetween(String value1, String value2) {
            addCriterion("mo_tradecard between", value1, value2, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradecardNotBetween(String value1, String value2) {
            addCriterion("mo_tradecard not between", value1, value2, "mo_tradecard");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoIsNull() {
            addCriterion("mo_tradeorderno is null");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoIsNotNull() {
            addCriterion("mo_tradeorderno is not null");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoEqualTo(String value) {
            addCriterion("mo_tradeorderno =", value, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoNotEqualTo(String value) {
            addCriterion("mo_tradeorderno <>", value, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoGreaterThan(String value) {
            addCriterion("mo_tradeorderno >", value, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoGreaterThanOrEqualTo(String value) {
            addCriterion("mo_tradeorderno >=", value, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoLessThan(String value) {
            addCriterion("mo_tradeorderno <", value, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoLessThanOrEqualTo(String value) {
            addCriterion("mo_tradeorderno <=", value, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoLike(String value) {
            addCriterion("mo_tradeorderno like", value, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoNotLike(String value) {
            addCriterion("mo_tradeorderno not like", value, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoIn(List<String> values) {
            addCriterion("mo_tradeorderno in", values, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoNotIn(List<String> values) {
            addCriterion("mo_tradeorderno not in", values, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoBetween(String value1, String value2) {
            addCriterion("mo_tradeorderno between", value1, value2, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeordernoNotBetween(String value1, String value2) {
            addCriterion("mo_tradeorderno not between", value1, value2, "mo_tradeorderno");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountIsNull() {
            addCriterion("mo_tradeamount is null");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountIsNotNull() {
            addCriterion("mo_tradeamount is not null");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountEqualTo(Long value) {
            addCriterion("mo_tradeamount =", value, "mo_tradeamount");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountNotEqualTo(Long value) {
            addCriterion("mo_tradeamount <>", value, "mo_tradeamount");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountGreaterThan(Long value) {
            addCriterion("mo_tradeamount >", value, "mo_tradeamount");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountGreaterThanOrEqualTo(Long value) {
            addCriterion("mo_tradeamount >=", value, "mo_tradeamount");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountLessThan(Long value) {
            addCriterion("mo_tradeamount <", value, "mo_tradeamount");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountLessThanOrEqualTo(Long value) {
            addCriterion("mo_tradeamount <=", value, "mo_tradeamount");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountIn(List<Long> values) {
            addCriterion("mo_tradeamount in", values, "mo_tradeamount");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountNotIn(List<Long> values) {
            addCriterion("mo_tradeamount not in", values, "mo_tradeamount");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountBetween(Long value1, Long value2) {
            addCriterion("mo_tradeamount between", value1, value2, "mo_tradeamount");
            return (Criteria) this;
        }

        public Criteria andMo_tradeamountNotBetween(Long value1, Long value2) {
            addCriterion("mo_tradeamount not between", value1, value2, "mo_tradeamount");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateIsNull() {
            addCriterion("mo_tradeorderdate is null");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateIsNotNull() {
            addCriterion("mo_tradeorderdate is not null");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateEqualTo(Date value) {
            addCriterion("mo_tradeorderdate =", value, "mo_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateNotEqualTo(Date value) {
            addCriterion("mo_tradeorderdate <>", value, "mo_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateGreaterThan(Date value) {
            addCriterion("mo_tradeorderdate >", value, "mo_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_tradeorderdate >=", value, "mo_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateLessThan(Date value) {
            addCriterion("mo_tradeorderdate <", value, "mo_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateLessThanOrEqualTo(Date value) {
            addCriterion("mo_tradeorderdate <=", value, "mo_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateIn(List<Date> values) {
            addCriterion("mo_tradeorderdate in", values, "mo_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateNotIn(List<Date> values) {
            addCriterion("mo_tradeorderdate not in", values, "mo_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateBetween(Date value1, Date value2) {
            addCriterion("mo_tradeorderdate between", value1, value2, "mo_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andMo_tradeorderdateNotBetween(Date value1, Date value2) {
            addCriterion("mo_tradeorderdate not between", value1, value2, "mo_tradeorderdate");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoIsNull() {
            addCriterion("mo_traderefundno is null");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoIsNotNull() {
            addCriterion("mo_traderefundno is not null");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoEqualTo(String value) {
            addCriterion("mo_traderefundno =", value, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoNotEqualTo(String value) {
            addCriterion("mo_traderefundno <>", value, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoGreaterThan(String value) {
            addCriterion("mo_traderefundno >", value, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoGreaterThanOrEqualTo(String value) {
            addCriterion("mo_traderefundno >=", value, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoLessThan(String value) {
            addCriterion("mo_traderefundno <", value, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoLessThanOrEqualTo(String value) {
            addCriterion("mo_traderefundno <=", value, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoLike(String value) {
            addCriterion("mo_traderefundno like", value, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoNotLike(String value) {
            addCriterion("mo_traderefundno not like", value, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoIn(List<String> values) {
            addCriterion("mo_traderefundno in", values, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoNotIn(List<String> values) {
            addCriterion("mo_traderefundno not in", values, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoBetween(String value1, String value2) {
            addCriterion("mo_traderefundno between", value1, value2, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundnoNotBetween(String value1, String value2) {
            addCriterion("mo_traderefundno not between", value1, value2, "mo_traderefundno");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountIsNull() {
            addCriterion("mo_traderefundamount is null");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountIsNotNull() {
            addCriterion("mo_traderefundamount is not null");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountEqualTo(Long value) {
            addCriterion("mo_traderefundamount =", value, "mo_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountNotEqualTo(Long value) {
            addCriterion("mo_traderefundamount <>", value, "mo_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountGreaterThan(Long value) {
            addCriterion("mo_traderefundamount >", value, "mo_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountGreaterThanOrEqualTo(Long value) {
            addCriterion("mo_traderefundamount >=", value, "mo_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountLessThan(Long value) {
            addCriterion("mo_traderefundamount <", value, "mo_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountLessThanOrEqualTo(Long value) {
            addCriterion("mo_traderefundamount <=", value, "mo_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountIn(List<Long> values) {
            addCriterion("mo_traderefundamount in", values, "mo_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountNotIn(List<Long> values) {
            addCriterion("mo_traderefundamount not in", values, "mo_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountBetween(Long value1, Long value2) {
            addCriterion("mo_traderefundamount between", value1, value2, "mo_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundamountNotBetween(Long value1, Long value2) {
            addCriterion("mo_traderefundamount not between", value1, value2, "mo_traderefundamount");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateIsNull() {
            addCriterion("mo_traderefunddate is null");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateIsNotNull() {
            addCriterion("mo_traderefunddate is not null");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateEqualTo(Date value) {
            addCriterion("mo_traderefunddate =", value, "mo_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateNotEqualTo(Date value) {
            addCriterion("mo_traderefunddate <>", value, "mo_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateGreaterThan(Date value) {
            addCriterion("mo_traderefunddate >", value, "mo_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_traderefunddate >=", value, "mo_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateLessThan(Date value) {
            addCriterion("mo_traderefunddate <", value, "mo_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateLessThanOrEqualTo(Date value) {
            addCriterion("mo_traderefunddate <=", value, "mo_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateIn(List<Date> values) {
            addCriterion("mo_traderefunddate in", values, "mo_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateNotIn(List<Date> values) {
            addCriterion("mo_traderefunddate not in", values, "mo_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateBetween(Date value1, Date value2) {
            addCriterion("mo_traderefunddate between", value1, value2, "mo_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andMo_traderefunddateNotBetween(Date value1, Date value2) {
            addCriterion("mo_traderefunddate not between", value1, value2, "mo_traderefunddate");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayIsNull() {
            addCriterion("mo_traderefundway is null");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayIsNotNull() {
            addCriterion("mo_traderefundway is not null");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayEqualTo(String value) {
            addCriterion("mo_traderefundway =", value, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayNotEqualTo(String value) {
            addCriterion("mo_traderefundway <>", value, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayGreaterThan(String value) {
            addCriterion("mo_traderefundway >", value, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayGreaterThanOrEqualTo(String value) {
            addCriterion("mo_traderefundway >=", value, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayLessThan(String value) {
            addCriterion("mo_traderefundway <", value, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayLessThanOrEqualTo(String value) {
            addCriterion("mo_traderefundway <=", value, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayLike(String value) {
            addCriterion("mo_traderefundway like", value, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayNotLike(String value) {
            addCriterion("mo_traderefundway not like", value, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayIn(List<String> values) {
            addCriterion("mo_traderefundway in", values, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayNotIn(List<String> values) {
            addCriterion("mo_traderefundway not in", values, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayBetween(String value1, String value2) {
            addCriterion("mo_traderefundway between", value1, value2, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_traderefundwayNotBetween(String value1, String value2) {
            addCriterion("mo_traderefundway not between", value1, value2, "mo_traderefundway");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeIsNull() {
            addCriterion("mo_logisticscode is null");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeIsNotNull() {
            addCriterion("mo_logisticscode is not null");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeEqualTo(String value) {
            addCriterion("mo_logisticscode =", value, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeNotEqualTo(String value) {
            addCriterion("mo_logisticscode <>", value, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeGreaterThan(String value) {
            addCriterion("mo_logisticscode >", value, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeGreaterThanOrEqualTo(String value) {
            addCriterion("mo_logisticscode >=", value, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeLessThan(String value) {
            addCriterion("mo_logisticscode <", value, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeLessThanOrEqualTo(String value) {
            addCriterion("mo_logisticscode <=", value, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeLike(String value) {
            addCriterion("mo_logisticscode like", value, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeNotLike(String value) {
            addCriterion("mo_logisticscode not like", value, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeIn(List<String> values) {
            addCriterion("mo_logisticscode in", values, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeNotIn(List<String> values) {
            addCriterion("mo_logisticscode not in", values, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeBetween(String value1, String value2) {
            addCriterion("mo_logisticscode between", value1, value2, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticscodeNotBetween(String value1, String value2) {
            addCriterion("mo_logisticscode not between", value1, value2, "mo_logisticscode");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameIsNull() {
            addCriterion("mo_logisticsname is null");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameIsNotNull() {
            addCriterion("mo_logisticsname is not null");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameEqualTo(String value) {
            addCriterion("mo_logisticsname =", value, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameNotEqualTo(String value) {
            addCriterion("mo_logisticsname <>", value, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameGreaterThan(String value) {
            addCriterion("mo_logisticsname >", value, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameGreaterThanOrEqualTo(String value) {
            addCriterion("mo_logisticsname >=", value, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameLessThan(String value) {
            addCriterion("mo_logisticsname <", value, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameLessThanOrEqualTo(String value) {
            addCriterion("mo_logisticsname <=", value, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameLike(String value) {
            addCriterion("mo_logisticsname like", value, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameNotLike(String value) {
            addCriterion("mo_logisticsname not like", value, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameIn(List<String> values) {
            addCriterion("mo_logisticsname in", values, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameNotIn(List<String> values) {
            addCriterion("mo_logisticsname not in", values, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameBetween(String value1, String value2) {
            addCriterion("mo_logisticsname between", value1, value2, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsnameNotBetween(String value1, String value2) {
            addCriterion("mo_logisticsname not between", value1, value2, "mo_logisticsname");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsIsNull() {
            addCriterion("mo_logisticstickets is null");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsIsNotNull() {
            addCriterion("mo_logisticstickets is not null");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsEqualTo(String value) {
            addCriterion("mo_logisticstickets =", value, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsNotEqualTo(String value) {
            addCriterion("mo_logisticstickets <>", value, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsGreaterThan(String value) {
            addCriterion("mo_logisticstickets >", value, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsGreaterThanOrEqualTo(String value) {
            addCriterion("mo_logisticstickets >=", value, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsLessThan(String value) {
            addCriterion("mo_logisticstickets <", value, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsLessThanOrEqualTo(String value) {
            addCriterion("mo_logisticstickets <=", value, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsLike(String value) {
            addCriterion("mo_logisticstickets like", value, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsNotLike(String value) {
            addCriterion("mo_logisticstickets not like", value, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsIn(List<String> values) {
            addCriterion("mo_logisticstickets in", values, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsNotIn(List<String> values) {
            addCriterion("mo_logisticstickets not in", values, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsBetween(String value1, String value2) {
            addCriterion("mo_logisticstickets between", value1, value2, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsticketsNotBetween(String value1, String value2) {
            addCriterion("mo_logisticstickets not between", value1, value2, "mo_logisticstickets");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgIsNull() {
            addCriterion("mo_logisticsmsg is null");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgIsNotNull() {
            addCriterion("mo_logisticsmsg is not null");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgEqualTo(String value) {
            addCriterion("mo_logisticsmsg =", value, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgNotEqualTo(String value) {
            addCriterion("mo_logisticsmsg <>", value, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgGreaterThan(String value) {
            addCriterion("mo_logisticsmsg >", value, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgGreaterThanOrEqualTo(String value) {
            addCriterion("mo_logisticsmsg >=", value, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgLessThan(String value) {
            addCriterion("mo_logisticsmsg <", value, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgLessThanOrEqualTo(String value) {
            addCriterion("mo_logisticsmsg <=", value, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgLike(String value) {
            addCriterion("mo_logisticsmsg like", value, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgNotLike(String value) {
            addCriterion("mo_logisticsmsg not like", value, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgIn(List<String> values) {
            addCriterion("mo_logisticsmsg in", values, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgNotIn(List<String> values) {
            addCriterion("mo_logisticsmsg not in", values, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgBetween(String value1, String value2) {
            addCriterion("mo_logisticsmsg between", value1, value2, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_logisticsmsgNotBetween(String value1, String value2) {
            addCriterion("mo_logisticsmsg not between", value1, value2, "mo_logisticsmsg");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseIsNull() {
            addCriterion("mo_flagappraise is null");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseIsNotNull() {
            addCriterion("mo_flagappraise is not null");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseEqualTo(Boolean value) {
            addCriterion("mo_flagappraise =", value, "mo_flagappraise");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseNotEqualTo(Boolean value) {
            addCriterion("mo_flagappraise <>", value, "mo_flagappraise");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseGreaterThan(Boolean value) {
            addCriterion("mo_flagappraise >", value, "mo_flagappraise");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mo_flagappraise >=", value, "mo_flagappraise");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseLessThan(Boolean value) {
            addCriterion("mo_flagappraise <", value, "mo_flagappraise");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseLessThanOrEqualTo(Boolean value) {
            addCriterion("mo_flagappraise <=", value, "mo_flagappraise");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseIn(List<Boolean> values) {
            addCriterion("mo_flagappraise in", values, "mo_flagappraise");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseNotIn(List<Boolean> values) {
            addCriterion("mo_flagappraise not in", values, "mo_flagappraise");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseBetween(Boolean value1, Boolean value2) {
            addCriterion("mo_flagappraise between", value1, value2, "mo_flagappraise");
            return (Criteria) this;
        }

        public Criteria andMo_flagappraiseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mo_flagappraise not between", value1, value2, "mo_flagappraise");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessIsNull() {
            addCriterion("mo_flagsuccess is null");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessIsNotNull() {
            addCriterion("mo_flagsuccess is not null");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessEqualTo(Boolean value) {
            addCriterion("mo_flagsuccess =", value, "mo_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessNotEqualTo(Boolean value) {
            addCriterion("mo_flagsuccess <>", value, "mo_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessGreaterThan(Boolean value) {
            addCriterion("mo_flagsuccess >", value, "mo_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mo_flagsuccess >=", value, "mo_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessLessThan(Boolean value) {
            addCriterion("mo_flagsuccess <", value, "mo_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessLessThanOrEqualTo(Boolean value) {
            addCriterion("mo_flagsuccess <=", value, "mo_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessIn(List<Boolean> values) {
            addCriterion("mo_flagsuccess in", values, "mo_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessNotIn(List<Boolean> values) {
            addCriterion("mo_flagsuccess not in", values, "mo_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessBetween(Boolean value1, Boolean value2) {
            addCriterion("mo_flagsuccess between", value1, value2, "mo_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andMo_flagsuccessNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mo_flagsuccess not between", value1, value2, "mo_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishIsNull() {
            addCriterion("mo_flagfinish is null");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishIsNotNull() {
            addCriterion("mo_flagfinish is not null");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishEqualTo(Boolean value) {
            addCriterion("mo_flagfinish =", value, "mo_flagfinish");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishNotEqualTo(Boolean value) {
            addCriterion("mo_flagfinish <>", value, "mo_flagfinish");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishGreaterThan(Boolean value) {
            addCriterion("mo_flagfinish >", value, "mo_flagfinish");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mo_flagfinish >=", value, "mo_flagfinish");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishLessThan(Boolean value) {
            addCriterion("mo_flagfinish <", value, "mo_flagfinish");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishLessThanOrEqualTo(Boolean value) {
            addCriterion("mo_flagfinish <=", value, "mo_flagfinish");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishIn(List<Boolean> values) {
            addCriterion("mo_flagfinish in", values, "mo_flagfinish");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishNotIn(List<Boolean> values) {
            addCriterion("mo_flagfinish not in", values, "mo_flagfinish");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishBetween(Boolean value1, Boolean value2) {
            addCriterion("mo_flagfinish between", value1, value2, "mo_flagfinish");
            return (Criteria) this;
        }

        public Criteria andMo_flagfinishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mo_flagfinish not between", value1, value2, "mo_flagfinish");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameIsNull() {
            addCriterion("mo_sourcename is null");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameIsNotNull() {
            addCriterion("mo_sourcename is not null");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameEqualTo(String value) {
            addCriterion("mo_sourcename =", value, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameNotEqualTo(String value) {
            addCriterion("mo_sourcename <>", value, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameGreaterThan(String value) {
            addCriterion("mo_sourcename >", value, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("mo_sourcename >=", value, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameLessThan(String value) {
            addCriterion("mo_sourcename <", value, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameLessThanOrEqualTo(String value) {
            addCriterion("mo_sourcename <=", value, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameLike(String value) {
            addCriterion("mo_sourcename like", value, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameNotLike(String value) {
            addCriterion("mo_sourcename not like", value, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameIn(List<String> values) {
            addCriterion("mo_sourcename in", values, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameNotIn(List<String> values) {
            addCriterion("mo_sourcename not in", values, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameBetween(String value1, String value2) {
            addCriterion("mo_sourcename between", value1, value2, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourcenameNotBetween(String value1, String value2) {
            addCriterion("mo_sourcename not between", value1, value2, "mo_sourcename");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionIsNull() {
            addCriterion("mo_sourceversion is null");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionIsNotNull() {
            addCriterion("mo_sourceversion is not null");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionEqualTo(String value) {
            addCriterion("mo_sourceversion =", value, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionNotEqualTo(String value) {
            addCriterion("mo_sourceversion <>", value, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionGreaterThan(String value) {
            addCriterion("mo_sourceversion >", value, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionGreaterThanOrEqualTo(String value) {
            addCriterion("mo_sourceversion >=", value, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionLessThan(String value) {
            addCriterion("mo_sourceversion <", value, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionLessThanOrEqualTo(String value) {
            addCriterion("mo_sourceversion <=", value, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionLike(String value) {
            addCriterion("mo_sourceversion like", value, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionNotLike(String value) {
            addCriterion("mo_sourceversion not like", value, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionIn(List<String> values) {
            addCriterion("mo_sourceversion in", values, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionNotIn(List<String> values) {
            addCriterion("mo_sourceversion not in", values, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionBetween(String value1, String value2) {
            addCriterion("mo_sourceversion between", value1, value2, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_sourceversionNotBetween(String value1, String value2) {
            addCriterion("mo_sourceversion not between", value1, value2, "mo_sourceversion");
            return (Criteria) this;
        }

        public Criteria andMo_createidIsNull() {
            addCriterion("mo_createid is null");
            return (Criteria) this;
        }

        public Criteria andMo_createidIsNotNull() {
            addCriterion("mo_createid is not null");
            return (Criteria) this;
        }

        public Criteria andMo_createidEqualTo(Long value) {
            addCriterion("mo_createid =", value, "mo_createid");
            return (Criteria) this;
        }

        public Criteria andMo_createidNotEqualTo(Long value) {
            addCriterion("mo_createid <>", value, "mo_createid");
            return (Criteria) this;
        }

        public Criteria andMo_createidGreaterThan(Long value) {
            addCriterion("mo_createid >", value, "mo_createid");
            return (Criteria) this;
        }

        public Criteria andMo_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("mo_createid >=", value, "mo_createid");
            return (Criteria) this;
        }

        public Criteria andMo_createidLessThan(Long value) {
            addCriterion("mo_createid <", value, "mo_createid");
            return (Criteria) this;
        }

        public Criteria andMo_createidLessThanOrEqualTo(Long value) {
            addCriterion("mo_createid <=", value, "mo_createid");
            return (Criteria) this;
        }

        public Criteria andMo_createidIn(List<Long> values) {
            addCriterion("mo_createid in", values, "mo_createid");
            return (Criteria) this;
        }

        public Criteria andMo_createidNotIn(List<Long> values) {
            addCriterion("mo_createid not in", values, "mo_createid");
            return (Criteria) this;
        }

        public Criteria andMo_createidBetween(Long value1, Long value2) {
            addCriterion("mo_createid between", value1, value2, "mo_createid");
            return (Criteria) this;
        }

        public Criteria andMo_createidNotBetween(Long value1, Long value2) {
            addCriterion("mo_createid not between", value1, value2, "mo_createid");
            return (Criteria) this;
        }

        public Criteria andMo_createnoIsNull() {
            addCriterion("mo_createno is null");
            return (Criteria) this;
        }

        public Criteria andMo_createnoIsNotNull() {
            addCriterion("mo_createno is not null");
            return (Criteria) this;
        }

        public Criteria andMo_createnoEqualTo(String value) {
            addCriterion("mo_createno =", value, "mo_createno");
            return (Criteria) this;
        }

        public Criteria andMo_createnoNotEqualTo(String value) {
            addCriterion("mo_createno <>", value, "mo_createno");
            return (Criteria) this;
        }

        public Criteria andMo_createnoGreaterThan(String value) {
            addCriterion("mo_createno >", value, "mo_createno");
            return (Criteria) this;
        }

        public Criteria andMo_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("mo_createno >=", value, "mo_createno");
            return (Criteria) this;
        }

        public Criteria andMo_createnoLessThan(String value) {
            addCriterion("mo_createno <", value, "mo_createno");
            return (Criteria) this;
        }

        public Criteria andMo_createnoLessThanOrEqualTo(String value) {
            addCriterion("mo_createno <=", value, "mo_createno");
            return (Criteria) this;
        }

        public Criteria andMo_createnoLike(String value) {
            addCriterion("mo_createno like", value, "mo_createno");
            return (Criteria) this;
        }

        public Criteria andMo_createnoNotLike(String value) {
            addCriterion("mo_createno not like", value, "mo_createno");
            return (Criteria) this;
        }

        public Criteria andMo_createnoIn(List<String> values) {
            addCriterion("mo_createno in", values, "mo_createno");
            return (Criteria) this;
        }

        public Criteria andMo_createnoNotIn(List<String> values) {
            addCriterion("mo_createno not in", values, "mo_createno");
            return (Criteria) this;
        }

        public Criteria andMo_createnoBetween(String value1, String value2) {
            addCriterion("mo_createno between", value1, value2, "mo_createno");
            return (Criteria) this;
        }

        public Criteria andMo_createnoNotBetween(String value1, String value2) {
            addCriterion("mo_createno not between", value1, value2, "mo_createno");
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

        public Criteria andMo_statusIsNull() {
            addCriterion("mo_status is null");
            return (Criteria) this;
        }

        public Criteria andMo_statusIsNotNull() {
            addCriterion("mo_status is not null");
            return (Criteria) this;
        }

        public Criteria andMo_statusEqualTo(Byte value) {
            addCriterion("mo_status =", value, "mo_status");
            return (Criteria) this;
        }

        public Criteria andMo_statusNotEqualTo(Byte value) {
            addCriterion("mo_status <>", value, "mo_status");
            return (Criteria) this;
        }

        public Criteria andMo_statusGreaterThan(Byte value) {
            addCriterion("mo_status >", value, "mo_status");
            return (Criteria) this;
        }

        public Criteria andMo_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("mo_status >=", value, "mo_status");
            return (Criteria) this;
        }

        public Criteria andMo_statusLessThan(Byte value) {
            addCriterion("mo_status <", value, "mo_status");
            return (Criteria) this;
        }

        public Criteria andMo_statusLessThanOrEqualTo(Byte value) {
            addCriterion("mo_status <=", value, "mo_status");
            return (Criteria) this;
        }

        public Criteria andMo_statusIn(List<Byte> values) {
            addCriterion("mo_status in", values, "mo_status");
            return (Criteria) this;
        }

        public Criteria andMo_statusNotIn(List<Byte> values) {
            addCriterion("mo_status not in", values, "mo_status");
            return (Criteria) this;
        }

        public Criteria andMo_statusBetween(Byte value1, Byte value2) {
            addCriterion("mo_status between", value1, value2, "mo_status");
            return (Criteria) this;
        }

        public Criteria andMo_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("mo_status not between", value1, value2, "mo_status");
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