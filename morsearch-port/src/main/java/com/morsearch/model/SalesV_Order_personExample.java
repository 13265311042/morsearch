package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesV_Order_personExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesV_Order_personExample() {
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

        public Criteria andOf_idIsNull() {
            addCriterion("of_id is null");
            return (Criteria) this;
        }

        public Criteria andOf_idIsNotNull() {
            addCriterion("of_id is not null");
            return (Criteria) this;
        }

        public Criteria andOf_idEqualTo(Long value) {
            addCriterion("of_id =", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idNotEqualTo(Long value) {
            addCriterion("of_id <>", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idGreaterThan(Long value) {
            addCriterion("of_id >", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idGreaterThanOrEqualTo(Long value) {
            addCriterion("of_id >=", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idLessThan(Long value) {
            addCriterion("of_id <", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idLessThanOrEqualTo(Long value) {
            addCriterion("of_id <=", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idIn(List<Long> values) {
            addCriterion("of_id in", values, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idNotIn(List<Long> values) {
            addCriterion("of_id not in", values, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idBetween(Long value1, Long value2) {
            addCriterion("of_id between", value1, value2, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idNotBetween(Long value1, Long value2) {
            addCriterion("of_id not between", value1, value2, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_noIsNull() {
            addCriterion("of_no is null");
            return (Criteria) this;
        }

        public Criteria andOf_noIsNotNull() {
            addCriterion("of_no is not null");
            return (Criteria) this;
        }

        public Criteria andOf_noEqualTo(String value) {
            addCriterion("of_no =", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noNotEqualTo(String value) {
            addCriterion("of_no <>", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noGreaterThan(String value) {
            addCriterion("of_no >", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noGreaterThanOrEqualTo(String value) {
            addCriterion("of_no >=", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noLessThan(String value) {
            addCriterion("of_no <", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noLessThanOrEqualTo(String value) {
            addCriterion("of_no <=", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noLike(String value) {
            addCriterion("of_no like", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noNotLike(String value) {
            addCriterion("of_no not like", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noIn(List<String> values) {
            addCriterion("of_no in", values, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noNotIn(List<String> values) {
            addCriterion("of_no not in", values, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noBetween(String value1, String value2) {
            addCriterion("of_no between", value1, value2, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noNotBetween(String value1, String value2) {
            addCriterion("of_no not between", value1, value2, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderIsNull() {
            addCriterion("of_dateorder is null");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderIsNotNull() {
            addCriterion("of_dateorder is not null");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderEqualTo(Date value) {
            addCriterion("of_dateorder =", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderNotEqualTo(Date value) {
            addCriterion("of_dateorder <>", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderGreaterThan(Date value) {
            addCriterion("of_dateorder >", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderGreaterThanOrEqualTo(Date value) {
            addCriterion("of_dateorder >=", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderLessThan(Date value) {
            addCriterion("of_dateorder <", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderLessThanOrEqualTo(Date value) {
            addCriterion("of_dateorder <=", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderIn(List<Date> values) {
            addCriterion("of_dateorder in", values, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderNotIn(List<Date> values) {
            addCriterion("of_dateorder not in", values, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderBetween(Date value1, Date value2) {
            addCriterion("of_dateorder between", value1, value2, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderNotBetween(Date value1, Date value2) {
            addCriterion("of_dateorder not between", value1, value2, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetIsNull() {
            addCriterion("of_datemeet is null");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetIsNotNull() {
            addCriterion("of_datemeet is not null");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetEqualTo(Date value) {
            addCriterion("of_datemeet =", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetNotEqualTo(Date value) {
            addCriterion("of_datemeet <>", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetGreaterThan(Date value) {
            addCriterion("of_datemeet >", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetGreaterThanOrEqualTo(Date value) {
            addCriterion("of_datemeet >=", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetLessThan(Date value) {
            addCriterion("of_datemeet <", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetLessThanOrEqualTo(Date value) {
            addCriterion("of_datemeet <=", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetIn(List<Date> values) {
            addCriterion("of_datemeet in", values, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetNotIn(List<Date> values) {
            addCriterion("of_datemeet not in", values, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetBetween(Date value1, Date value2) {
            addCriterion("of_datemeet between", value1, value2, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetNotBetween(Date value1, Date value2) {
            addCriterion("of_datemeet not between", value1, value2, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishIsNull() {
            addCriterion("of_datefinish is null");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishIsNotNull() {
            addCriterion("of_datefinish is not null");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishEqualTo(Date value) {
            addCriterion("of_datefinish =", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishNotEqualTo(Date value) {
            addCriterion("of_datefinish <>", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishGreaterThan(Date value) {
            addCriterion("of_datefinish >", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishGreaterThanOrEqualTo(Date value) {
            addCriterion("of_datefinish >=", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishLessThan(Date value) {
            addCriterion("of_datefinish <", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishLessThanOrEqualTo(Date value) {
            addCriterion("of_datefinish <=", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishIn(List<Date> values) {
            addCriterion("of_datefinish in", values, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishNotIn(List<Date> values) {
            addCriterion("of_datefinish not in", values, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishBetween(Date value1, Date value2) {
            addCriterion("of_datefinish between", value1, value2, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishNotBetween(Date value1, Date value2) {
            addCriterion("of_datefinish not between", value1, value2, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_custidIsNull() {
            addCriterion("of_custid is null");
            return (Criteria) this;
        }

        public Criteria andOf_custidIsNotNull() {
            addCriterion("of_custid is not null");
            return (Criteria) this;
        }

        public Criteria andOf_custidEqualTo(Long value) {
            addCriterion("of_custid =", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidNotEqualTo(Long value) {
            addCriterion("of_custid <>", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidGreaterThan(Long value) {
            addCriterion("of_custid >", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidGreaterThanOrEqualTo(Long value) {
            addCriterion("of_custid >=", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidLessThan(Long value) {
            addCriterion("of_custid <", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidLessThanOrEqualTo(Long value) {
            addCriterion("of_custid <=", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidIn(List<Long> values) {
            addCriterion("of_custid in", values, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidNotIn(List<Long> values) {
            addCriterion("of_custid not in", values, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidBetween(Long value1, Long value2) {
            addCriterion("of_custid between", value1, value2, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidNotBetween(Long value1, Long value2) {
            addCriterion("of_custid not between", value1, value2, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_createidIsNull() {
            addCriterion("of_createid is null");
            return (Criteria) this;
        }

        public Criteria andOf_createidIsNotNull() {
            addCriterion("of_createid is not null");
            return (Criteria) this;
        }

        public Criteria andOf_createidEqualTo(Long value) {
            addCriterion("of_createid =", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidNotEqualTo(Long value) {
            addCriterion("of_createid <>", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidGreaterThan(Long value) {
            addCriterion("of_createid >", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("of_createid >=", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidLessThan(Long value) {
            addCriterion("of_createid <", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidLessThanOrEqualTo(Long value) {
            addCriterion("of_createid <=", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidIn(List<Long> values) {
            addCriterion("of_createid in", values, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidNotIn(List<Long> values) {
            addCriterion("of_createid not in", values, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidBetween(Long value1, Long value2) {
            addCriterion("of_createid between", value1, value2, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidNotBetween(Long value1, Long value2) {
            addCriterion("of_createid not between", value1, value2, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_statusIsNull() {
            addCriterion("of_status is null");
            return (Criteria) this;
        }

        public Criteria andOf_statusIsNotNull() {
            addCriterion("of_status is not null");
            return (Criteria) this;
        }

        public Criteria andOf_statusEqualTo(Byte value) {
            addCriterion("of_status =", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusNotEqualTo(Byte value) {
            addCriterion("of_status <>", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusGreaterThan(Byte value) {
            addCriterion("of_status >", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("of_status >=", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusLessThan(Byte value) {
            addCriterion("of_status <", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusLessThanOrEqualTo(Byte value) {
            addCriterion("of_status <=", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusIn(List<Byte> values) {
            addCriterion("of_status in", values, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusNotIn(List<Byte> values) {
            addCriterion("of_status not in", values, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusBetween(Byte value1, Byte value2) {
            addCriterion("of_status between", value1, value2, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("of_status not between", value1, value2, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessIsNull() {
            addCriterion("of_flagsuccess is null");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessIsNotNull() {
            addCriterion("of_flagsuccess is not null");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessEqualTo(Boolean value) {
            addCriterion("of_flagsuccess =", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessNotEqualTo(Boolean value) {
            addCriterion("of_flagsuccess <>", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessGreaterThan(Boolean value) {
            addCriterion("of_flagsuccess >", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_flagsuccess >=", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessLessThan(Boolean value) {
            addCriterion("of_flagsuccess <", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessLessThanOrEqualTo(Boolean value) {
            addCriterion("of_flagsuccess <=", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessIn(List<Boolean> values) {
            addCriterion("of_flagsuccess in", values, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessNotIn(List<Boolean> values) {
            addCriterion("of_flagsuccess not in", values, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagsuccess between", value1, value2, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagsuccess not between", value1, value2, "of_flagsuccess");
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

        public Criteria andOf_accountidIsNull() {
            addCriterion("of_accountid is null");
            return (Criteria) this;
        }

        public Criteria andOf_accountidIsNotNull() {
            addCriterion("of_accountid is not null");
            return (Criteria) this;
        }

        public Criteria andOf_accountidEqualTo(Long value) {
            addCriterion("of_accountid =", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidNotEqualTo(Long value) {
            addCriterion("of_accountid <>", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidGreaterThan(Long value) {
            addCriterion("of_accountid >", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidGreaterThanOrEqualTo(Long value) {
            addCriterion("of_accountid >=", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidLessThan(Long value) {
            addCriterion("of_accountid <", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidLessThanOrEqualTo(Long value) {
            addCriterion("of_accountid <=", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidIn(List<Long> values) {
            addCriterion("of_accountid in", values, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidNotIn(List<Long> values) {
            addCriterion("of_accountid not in", values, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidBetween(Long value1, Long value2) {
            addCriterion("of_accountid between", value1, value2, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidNotBetween(Long value1, Long value2) {
            addCriterion("of_accountid not between", value1, value2, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeIsNull() {
            addCriterion("of_coincode is null");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeIsNotNull() {
            addCriterion("of_coincode is not null");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeEqualTo(String value) {
            addCriterion("of_coincode =", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeNotEqualTo(String value) {
            addCriterion("of_coincode <>", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeGreaterThan(String value) {
            addCriterion("of_coincode >", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeGreaterThanOrEqualTo(String value) {
            addCriterion("of_coincode >=", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeLessThan(String value) {
            addCriterion("of_coincode <", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeLessThanOrEqualTo(String value) {
            addCriterion("of_coincode <=", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeLike(String value) {
            addCriterion("of_coincode like", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeNotLike(String value) {
            addCriterion("of_coincode not like", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeIn(List<String> values) {
            addCriterion("of_coincode in", values, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeNotIn(List<String> values) {
            addCriterion("of_coincode not in", values, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeBetween(String value1, String value2) {
            addCriterion("of_coincode between", value1, value2, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeNotBetween(String value1, String value2) {
            addCriterion("of_coincode not between", value1, value2, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameIsNull() {
            addCriterion("of_coinname is null");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameIsNotNull() {
            addCriterion("of_coinname is not null");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameEqualTo(String value) {
            addCriterion("of_coinname =", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameNotEqualTo(String value) {
            addCriterion("of_coinname <>", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameGreaterThan(String value) {
            addCriterion("of_coinname >", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameGreaterThanOrEqualTo(String value) {
            addCriterion("of_coinname >=", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameLessThan(String value) {
            addCriterion("of_coinname <", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameLessThanOrEqualTo(String value) {
            addCriterion("of_coinname <=", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameLike(String value) {
            addCriterion("of_coinname like", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameNotLike(String value) {
            addCriterion("of_coinname not like", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameIn(List<String> values) {
            addCriterion("of_coinname in", values, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameNotIn(List<String> values) {
            addCriterion("of_coinname not in", values, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameBetween(String value1, String value2) {
            addCriterion("of_coinname between", value1, value2, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameNotBetween(String value1, String value2) {
            addCriterion("of_coinname not between", value1, value2, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceIsNull() {
            addCriterion("of_coinprice is null");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceIsNotNull() {
            addCriterion("of_coinprice is not null");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceEqualTo(BigDecimal value) {
            addCriterion("of_coinprice =", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceNotEqualTo(BigDecimal value) {
            addCriterion("of_coinprice <>", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceGreaterThan(BigDecimal value) {
            addCriterion("of_coinprice >", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("of_coinprice >=", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceLessThan(BigDecimal value) {
            addCriterion("of_coinprice <", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("of_coinprice <=", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceIn(List<BigDecimal> values) {
            addCriterion("of_coinprice in", values, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceNotIn(List<BigDecimal> values) {
            addCriterion("of_coinprice not in", values, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("of_coinprice between", value1, value2, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("of_coinprice not between", value1, value2, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageIsNull() {
            addCriterion("of_coinimage is null");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageIsNotNull() {
            addCriterion("of_coinimage is not null");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageEqualTo(String value) {
            addCriterion("of_coinimage =", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageNotEqualTo(String value) {
            addCriterion("of_coinimage <>", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageGreaterThan(String value) {
            addCriterion("of_coinimage >", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageGreaterThanOrEqualTo(String value) {
            addCriterion("of_coinimage >=", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageLessThan(String value) {
            addCriterion("of_coinimage <", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageLessThanOrEqualTo(String value) {
            addCriterion("of_coinimage <=", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageLike(String value) {
            addCriterion("of_coinimage like", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageNotLike(String value) {
            addCriterion("of_coinimage not like", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageIn(List<String> values) {
            addCriterion("of_coinimage in", values, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageNotIn(List<String> values) {
            addCriterion("of_coinimage not in", values, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageBetween(String value1, String value2) {
            addCriterion("of_coinimage between", value1, value2, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageNotBetween(String value1, String value2) {
            addCriterion("of_coinimage not between", value1, value2, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andSale_nameIsNull() {
            addCriterion("sale_name is null");
            return (Criteria) this;
        }

        public Criteria andSale_nameIsNotNull() {
            addCriterion("sale_name is not null");
            return (Criteria) this;
        }

        public Criteria andSale_nameEqualTo(String value) {
            addCriterion("sale_name =", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameNotEqualTo(String value) {
            addCriterion("sale_name <>", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameGreaterThan(String value) {
            addCriterion("sale_name >", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sale_name >=", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameLessThan(String value) {
            addCriterion("sale_name <", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameLessThanOrEqualTo(String value) {
            addCriterion("sale_name <=", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameLike(String value) {
            addCriterion("sale_name like", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameNotLike(String value) {
            addCriterion("sale_name not like", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameIn(List<String> values) {
            addCriterion("sale_name in", values, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameNotIn(List<String> values) {
            addCriterion("sale_name not in", values, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameBetween(String value1, String value2) {
            addCriterion("sale_name between", value1, value2, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameNotBetween(String value1, String value2) {
            addCriterion("sale_name not between", value1, value2, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlIsNull() {
            addCriterion("sale_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlIsNotNull() {
            addCriterion("sale_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlEqualTo(String value) {
            addCriterion("sale_imageurl =", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlNotEqualTo(String value) {
            addCriterion("sale_imageurl <>", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlGreaterThan(String value) {
            addCriterion("sale_imageurl >", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlGreaterThanOrEqualTo(String value) {
            addCriterion("sale_imageurl >=", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlLessThan(String value) {
            addCriterion("sale_imageurl <", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlLessThanOrEqualTo(String value) {
            addCriterion("sale_imageurl <=", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlLike(String value) {
            addCriterion("sale_imageurl like", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlNotLike(String value) {
            addCriterion("sale_imageurl not like", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlIn(List<String> values) {
            addCriterion("sale_imageurl in", values, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlNotIn(List<String> values) {
            addCriterion("sale_imageurl not in", values, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlBetween(String value1, String value2) {
            addCriterion("sale_imageurl between", value1, value2, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlNotBetween(String value1, String value2) {
            addCriterion("sale_imageurl not between", value1, value2, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_phoneIsNull() {
            addCriterion("sale_phone is null");
            return (Criteria) this;
        }

        public Criteria andSale_phoneIsNotNull() {
            addCriterion("sale_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSale_phoneEqualTo(String value) {
            addCriterion("sale_phone =", value, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andSale_phoneNotEqualTo(String value) {
            addCriterion("sale_phone <>", value, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andSale_phoneGreaterThan(String value) {
            addCriterion("sale_phone >", value, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andSale_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("sale_phone >=", value, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andSale_phoneLessThan(String value) {
            addCriterion("sale_phone <", value, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andSale_phoneLessThanOrEqualTo(String value) {
            addCriterion("sale_phone <=", value, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andSale_phoneLike(String value) {
            addCriterion("sale_phone like", value, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andSale_phoneNotLike(String value) {
            addCriterion("sale_phone not like", value, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andSale_phoneIn(List<String> values) {
            addCriterion("sale_phone in", values, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andSale_phoneNotIn(List<String> values) {
            addCriterion("sale_phone not in", values, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andSale_phoneBetween(String value1, String value2) {
            addCriterion("sale_phone between", value1, value2, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andSale_phoneNotBetween(String value1, String value2) {
            addCriterion("sale_phone not between", value1, value2, "sale_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_nameIsNull() {
            addCriterion("desig_name is null");
            return (Criteria) this;
        }

        public Criteria andDesig_nameIsNotNull() {
            addCriterion("desig_name is not null");
            return (Criteria) this;
        }

        public Criteria andDesig_nameEqualTo(String value) {
            addCriterion("desig_name =", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameNotEqualTo(String value) {
            addCriterion("desig_name <>", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameGreaterThan(String value) {
            addCriterion("desig_name >", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameGreaterThanOrEqualTo(String value) {
            addCriterion("desig_name >=", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameLessThan(String value) {
            addCriterion("desig_name <", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameLessThanOrEqualTo(String value) {
            addCriterion("desig_name <=", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameLike(String value) {
            addCriterion("desig_name like", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameNotLike(String value) {
            addCriterion("desig_name not like", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameIn(List<String> values) {
            addCriterion("desig_name in", values, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameNotIn(List<String> values) {
            addCriterion("desig_name not in", values, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameBetween(String value1, String value2) {
            addCriterion("desig_name between", value1, value2, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameNotBetween(String value1, String value2) {
            addCriterion("desig_name not between", value1, value2, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlIsNull() {
            addCriterion("desig_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlIsNotNull() {
            addCriterion("desig_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlEqualTo(String value) {
            addCriterion("desig_imageurl =", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlNotEqualTo(String value) {
            addCriterion("desig_imageurl <>", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlGreaterThan(String value) {
            addCriterion("desig_imageurl >", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlGreaterThanOrEqualTo(String value) {
            addCriterion("desig_imageurl >=", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlLessThan(String value) {
            addCriterion("desig_imageurl <", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlLessThanOrEqualTo(String value) {
            addCriterion("desig_imageurl <=", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlLike(String value) {
            addCriterion("desig_imageurl like", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlNotLike(String value) {
            addCriterion("desig_imageurl not like", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlIn(List<String> values) {
            addCriterion("desig_imageurl in", values, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlNotIn(List<String> values) {
            addCriterion("desig_imageurl not in", values, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlBetween(String value1, String value2) {
            addCriterion("desig_imageurl between", value1, value2, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlNotBetween(String value1, String value2) {
            addCriterion("desig_imageurl not between", value1, value2, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneIsNull() {
            addCriterion("desig_phone is null");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneIsNotNull() {
            addCriterion("desig_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneEqualTo(String value) {
            addCriterion("desig_phone =", value, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneNotEqualTo(String value) {
            addCriterion("desig_phone <>", value, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneGreaterThan(String value) {
            addCriterion("desig_phone >", value, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("desig_phone >=", value, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneLessThan(String value) {
            addCriterion("desig_phone <", value, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneLessThanOrEqualTo(String value) {
            addCriterion("desig_phone <=", value, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneLike(String value) {
            addCriterion("desig_phone like", value, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneNotLike(String value) {
            addCriterion("desig_phone not like", value, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneIn(List<String> values) {
            addCriterion("desig_phone in", values, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneNotIn(List<String> values) {
            addCriterion("desig_phone not in", values, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneBetween(String value1, String value2) {
            addCriterion("desig_phone between", value1, value2, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_phoneNotBetween(String value1, String value2) {
            addCriterion("desig_phone not between", value1, value2, "desig_phone");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobIsNull() {
            addCriterion("desig_personjob is null");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobIsNotNull() {
            addCriterion("desig_personjob is not null");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobEqualTo(String value) {
            addCriterion("desig_personjob =", value, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobNotEqualTo(String value) {
            addCriterion("desig_personjob <>", value, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobGreaterThan(String value) {
            addCriterion("desig_personjob >", value, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobGreaterThanOrEqualTo(String value) {
            addCriterion("desig_personjob >=", value, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobLessThan(String value) {
            addCriterion("desig_personjob <", value, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobLessThanOrEqualTo(String value) {
            addCriterion("desig_personjob <=", value, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobLike(String value) {
            addCriterion("desig_personjob like", value, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobNotLike(String value) {
            addCriterion("desig_personjob not like", value, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobIn(List<String> values) {
            addCriterion("desig_personjob in", values, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobNotIn(List<String> values) {
            addCriterion("desig_personjob not in", values, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobBetween(String value1, String value2) {
            addCriterion("desig_personjob between", value1, value2, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personjobNotBetween(String value1, String value2) {
            addCriterion("desig_personjob not between", value1, value2, "desig_personjob");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorIsNull() {
            addCriterion("desig_personmajor is null");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorIsNotNull() {
            addCriterion("desig_personmajor is not null");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorEqualTo(String value) {
            addCriterion("desig_personmajor =", value, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorNotEqualTo(String value) {
            addCriterion("desig_personmajor <>", value, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorGreaterThan(String value) {
            addCriterion("desig_personmajor >", value, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorGreaterThanOrEqualTo(String value) {
            addCriterion("desig_personmajor >=", value, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorLessThan(String value) {
            addCriterion("desig_personmajor <", value, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorLessThanOrEqualTo(String value) {
            addCriterion("desig_personmajor <=", value, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorLike(String value) {
            addCriterion("desig_personmajor like", value, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorNotLike(String value) {
            addCriterion("desig_personmajor not like", value, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorIn(List<String> values) {
            addCriterion("desig_personmajor in", values, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorNotIn(List<String> values) {
            addCriterion("desig_personmajor not in", values, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorBetween(String value1, String value2) {
            addCriterion("desig_personmajor between", value1, value2, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_personmajorNotBetween(String value1, String value2) {
            addCriterion("desig_personmajor not between", value1, value2, "desig_personmajor");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameIsNull() {
            addCriterion("desig_companyname is null");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameIsNotNull() {
            addCriterion("desig_companyname is not null");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameEqualTo(String value) {
            addCriterion("desig_companyname =", value, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameNotEqualTo(String value) {
            addCriterion("desig_companyname <>", value, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameGreaterThan(String value) {
            addCriterion("desig_companyname >", value, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameGreaterThanOrEqualTo(String value) {
            addCriterion("desig_companyname >=", value, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameLessThan(String value) {
            addCriterion("desig_companyname <", value, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameLessThanOrEqualTo(String value) {
            addCriterion("desig_companyname <=", value, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameLike(String value) {
            addCriterion("desig_companyname like", value, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameNotLike(String value) {
            addCriterion("desig_companyname not like", value, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameIn(List<String> values) {
            addCriterion("desig_companyname in", values, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameNotIn(List<String> values) {
            addCriterion("desig_companyname not in", values, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameBetween(String value1, String value2) {
            addCriterion("desig_companyname between", value1, value2, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companynameNotBetween(String value1, String value2) {
            addCriterion("desig_companyname not between", value1, value2, "desig_companyname");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandIsNull() {
            addCriterion("desig_companybrand is null");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandIsNotNull() {
            addCriterion("desig_companybrand is not null");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandEqualTo(String value) {
            addCriterion("desig_companybrand =", value, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandNotEqualTo(String value) {
            addCriterion("desig_companybrand <>", value, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandGreaterThan(String value) {
            addCriterion("desig_companybrand >", value, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandGreaterThanOrEqualTo(String value) {
            addCriterion("desig_companybrand >=", value, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandLessThan(String value) {
            addCriterion("desig_companybrand <", value, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandLessThanOrEqualTo(String value) {
            addCriterion("desig_companybrand <=", value, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandLike(String value) {
            addCriterion("desig_companybrand like", value, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandNotLike(String value) {
            addCriterion("desig_companybrand not like", value, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandIn(List<String> values) {
            addCriterion("desig_companybrand in", values, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandNotIn(List<String> values) {
            addCriterion("desig_companybrand not in", values, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandBetween(String value1, String value2) {
            addCriterion("desig_companybrand between", value1, value2, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companybrandNotBetween(String value1, String value2) {
            addCriterion("desig_companybrand not between", value1, value2, "desig_companybrand");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrIsNull() {
            addCriterion("desig_companyaddr is null");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrIsNotNull() {
            addCriterion("desig_companyaddr is not null");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrEqualTo(String value) {
            addCriterion("desig_companyaddr =", value, "desig_companyaddr");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrNotEqualTo(String value) {
            addCriterion("desig_companyaddr <>", value, "desig_companyaddr");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrGreaterThan(String value) {
            addCriterion("desig_companyaddr >", value, "desig_companyaddr");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("desig_companyaddr >=", value, "desig_companyaddr");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrLessThan(String value) {
            addCriterion("desig_companyaddr <", value, "desig_companyaddr");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrLessThanOrEqualTo(String value) {
            addCriterion("desig_companyaddr <=", value, "desig_companyaddr");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrLike(String value) {
            addCriterion("desig_companyaddr like", value, "desig_companyaddr");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrNotLike(String value) {
            addCriterion("desig_companyaddr not like", value, "desig_companyaddr");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrIn(List<String> values) {
            addCriterion("desig_companyaddr in", values, "desig_companyaddr");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrNotIn(List<String> values) {
            addCriterion("desig_companyaddr not in", values, "desig_companyaddr");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrBetween(String value1, String value2) {
            addCriterion("desig_companyaddr between", value1, value2, "desig_companyaddr");
            return (Criteria) this;
        }

        public Criteria andDesig_companyaddrNotBetween(String value1, String value2) {
            addCriterion("desig_companyaddr not between", value1, value2, "desig_companyaddr");
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