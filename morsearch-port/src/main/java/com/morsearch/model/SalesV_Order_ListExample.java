package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesV_Order_ListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesV_Order_ListExample() {
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

        public Criteria andDateshortIsNull() {
            addCriterion("dateshort is null");
            return (Criteria) this;
        }

        public Criteria andDateshortIsNotNull() {
            addCriterion("dateshort is not null");
            return (Criteria) this;
        }

        public Criteria andDateshortEqualTo(String value) {
            addCriterion("dateshort =", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotEqualTo(String value) {
            addCriterion("dateshort <>", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortGreaterThan(String value) {
            addCriterion("dateshort >", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortGreaterThanOrEqualTo(String value) {
            addCriterion("dateshort >=", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLessThan(String value) {
            addCriterion("dateshort <", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLessThanOrEqualTo(String value) {
            addCriterion("dateshort <=", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLike(String value) {
            addCriterion("dateshort like", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotLike(String value) {
            addCriterion("dateshort not like", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortIn(List<String> values) {
            addCriterion("dateshort in", values, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotIn(List<String> values) {
            addCriterion("dateshort not in", values, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortBetween(String value1, String value2) {
            addCriterion("dateshort between", value1, value2, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotBetween(String value1, String value2) {
            addCriterion("dateshort not between", value1, value2, "dateshort");
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

        public Criteria andOf_custnameIsNull() {
            addCriterion("of_custname is null");
            return (Criteria) this;
        }

        public Criteria andOf_custnameIsNotNull() {
            addCriterion("of_custname is not null");
            return (Criteria) this;
        }

        public Criteria andOf_custnameEqualTo(String value) {
            addCriterion("of_custname =", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameNotEqualTo(String value) {
            addCriterion("of_custname <>", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameGreaterThan(String value) {
            addCriterion("of_custname >", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameGreaterThanOrEqualTo(String value) {
            addCriterion("of_custname >=", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameLessThan(String value) {
            addCriterion("of_custname <", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameLessThanOrEqualTo(String value) {
            addCriterion("of_custname <=", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameLike(String value) {
            addCriterion("of_custname like", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameNotLike(String value) {
            addCriterion("of_custname not like", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameIn(List<String> values) {
            addCriterion("of_custname in", values, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameNotIn(List<String> values) {
            addCriterion("of_custname not in", values, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameBetween(String value1, String value2) {
            addCriterion("of_custname between", value1, value2, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameNotBetween(String value1, String value2) {
            addCriterion("of_custname not between", value1, value2, "of_custname");
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

        public Criteria andUe_personjobIsNull() {
            addCriterion("ue_personjob is null");
            return (Criteria) this;
        }

        public Criteria andUe_personjobIsNotNull() {
            addCriterion("ue_personjob is not null");
            return (Criteria) this;
        }

        public Criteria andUe_personjobEqualTo(String value) {
            addCriterion("ue_personjob =", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobNotEqualTo(String value) {
            addCriterion("ue_personjob <>", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobGreaterThan(String value) {
            addCriterion("ue_personjob >", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobGreaterThanOrEqualTo(String value) {
            addCriterion("ue_personjob >=", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobLessThan(String value) {
            addCriterion("ue_personjob <", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobLessThanOrEqualTo(String value) {
            addCriterion("ue_personjob <=", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobLike(String value) {
            addCriterion("ue_personjob like", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobNotLike(String value) {
            addCriterion("ue_personjob not like", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobIn(List<String> values) {
            addCriterion("ue_personjob in", values, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobNotIn(List<String> values) {
            addCriterion("ue_personjob not in", values, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobBetween(String value1, String value2) {
            addCriterion("ue_personjob between", value1, value2, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobNotBetween(String value1, String value2) {
            addCriterion("ue_personjob not between", value1, value2, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlIsNull() {
            addCriterion("ur_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlIsNotNull() {
            addCriterion("ur_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlEqualTo(String value) {
            addCriterion("ur_imageurl =", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlNotEqualTo(String value) {
            addCriterion("ur_imageurl <>", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlGreaterThan(String value) {
            addCriterion("ur_imageurl >", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlGreaterThanOrEqualTo(String value) {
            addCriterion("ur_imageurl >=", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlLessThan(String value) {
            addCriterion("ur_imageurl <", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlLessThanOrEqualTo(String value) {
            addCriterion("ur_imageurl <=", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlLike(String value) {
            addCriterion("ur_imageurl like", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlNotLike(String value) {
            addCriterion("ur_imageurl not like", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlIn(List<String> values) {
            addCriterion("ur_imageurl in", values, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlNotIn(List<String> values) {
            addCriterion("ur_imageurl not in", values, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlBetween(String value1, String value2) {
            addCriterion("ur_imageurl between", value1, value2, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlNotBetween(String value1, String value2) {
            addCriterion("ur_imageurl not between", value1, value2, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_sexIsNull() {
            addCriterion("ur_sex is null");
            return (Criteria) this;
        }

        public Criteria andUr_sexIsNotNull() {
            addCriterion("ur_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUr_sexEqualTo(String value) {
            addCriterion("ur_sex =", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexNotEqualTo(String value) {
            addCriterion("ur_sex <>", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexGreaterThan(String value) {
            addCriterion("ur_sex >", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexGreaterThanOrEqualTo(String value) {
            addCriterion("ur_sex >=", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexLessThan(String value) {
            addCriterion("ur_sex <", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexLessThanOrEqualTo(String value) {
            addCriterion("ur_sex <=", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexLike(String value) {
            addCriterion("ur_sex like", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexNotLike(String value) {
            addCriterion("ur_sex not like", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexIn(List<String> values) {
            addCriterion("ur_sex in", values, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexNotIn(List<String> values) {
            addCriterion("ur_sex not in", values, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexBetween(String value1, String value2) {
            addCriterion("ur_sex between", value1, value2, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexNotBetween(String value1, String value2) {
            addCriterion("ur_sex not between", value1, value2, "ur_sex");
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

        public Criteria andOf_statusEqualTo(Integer value) {
            addCriterion("of_status =", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusNotEqualTo(Integer value) {
            addCriterion("of_status <>", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusGreaterThan(Integer value) {
            addCriterion("of_status >", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("of_status >=", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusLessThan(Integer value) {
            addCriterion("of_status <", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusLessThanOrEqualTo(Integer value) {
            addCriterion("of_status <=", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusIn(List<Integer> values) {
            addCriterion("of_status in", values, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusNotIn(List<Integer> values) {
            addCriterion("of_status not in", values, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusBetween(Integer value1, Integer value2) {
            addCriterion("of_status between", value1, value2, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("of_status not between", value1, value2, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleIsNull() {
            addCriterion("of_flagappraisesale is null");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleIsNotNull() {
            addCriterion("of_flagappraisesale is not null");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleEqualTo(Boolean value) {
            addCriterion("of_flagappraisesale =", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleNotEqualTo(Boolean value) {
            addCriterion("of_flagappraisesale <>", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleGreaterThan(Boolean value) {
            addCriterion("of_flagappraisesale >", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_flagappraisesale >=", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleLessThan(Boolean value) {
            addCriterion("of_flagappraisesale <", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleLessThanOrEqualTo(Boolean value) {
            addCriterion("of_flagappraisesale <=", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleIn(List<Boolean> values) {
            addCriterion("of_flagappraisesale in", values, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleNotIn(List<Boolean> values) {
            addCriterion("of_flagappraisesale not in", values, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagappraisesale between", value1, value2, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagappraisesale not between", value1, value2, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiIsNull() {
            addCriterion("of_flagappraisedesi is null");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiIsNotNull() {
            addCriterion("of_flagappraisedesi is not null");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiEqualTo(Boolean value) {
            addCriterion("of_flagappraisedesi =", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiNotEqualTo(Boolean value) {
            addCriterion("of_flagappraisedesi <>", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiGreaterThan(Boolean value) {
            addCriterion("of_flagappraisedesi >", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_flagappraisedesi >=", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiLessThan(Boolean value) {
            addCriterion("of_flagappraisedesi <", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiLessThanOrEqualTo(Boolean value) {
            addCriterion("of_flagappraisedesi <=", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiIn(List<Boolean> values) {
            addCriterion("of_flagappraisedesi in", values, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiNotIn(List<Boolean> values) {
            addCriterion("of_flagappraisedesi not in", values, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagappraisedesi between", value1, value2, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagappraisedesi not between", value1, value2, "of_flagappraisedesi");
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

        public Criteria andOf_flagfinishIsNull() {
            addCriterion("of_flagfinish is null");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishIsNotNull() {
            addCriterion("of_flagfinish is not null");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishEqualTo(Boolean value) {
            addCriterion("of_flagfinish =", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishNotEqualTo(Boolean value) {
            addCriterion("of_flagfinish <>", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishGreaterThan(Boolean value) {
            addCriterion("of_flagfinish >", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_flagfinish >=", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishLessThan(Boolean value) {
            addCriterion("of_flagfinish <", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishLessThanOrEqualTo(Boolean value) {
            addCriterion("of_flagfinish <=", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishIn(List<Boolean> values) {
            addCriterion("of_flagfinish in", values, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishNotIn(List<Boolean> values) {
            addCriterion("of_flagfinish not in", values, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagfinish between", value1, value2, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagfinish not between", value1, value2, "of_flagfinish");
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

        public Criteria andOf_appealstatusIsNull() {
            addCriterion("of_appealstatus is null");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusIsNotNull() {
            addCriterion("of_appealstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusEqualTo(Integer value) {
            addCriterion("of_appealstatus =", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusNotEqualTo(Integer value) {
            addCriterion("of_appealstatus <>", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusGreaterThan(Integer value) {
            addCriterion("of_appealstatus >", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("of_appealstatus >=", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusLessThan(Integer value) {
            addCriterion("of_appealstatus <", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusLessThanOrEqualTo(Integer value) {
            addCriterion("of_appealstatus <=", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusIn(List<Integer> values) {
            addCriterion("of_appealstatus in", values, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusNotIn(List<Integer> values) {
            addCriterion("of_appealstatus not in", values, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusBetween(Integer value1, Integer value2) {
            addCriterion("of_appealstatus between", value1, value2, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("of_appealstatus not between", value1, value2, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andAppealnameIsNull() {
            addCriterion("appealname is null");
            return (Criteria) this;
        }

        public Criteria andAppealnameIsNotNull() {
            addCriterion("appealname is not null");
            return (Criteria) this;
        }

        public Criteria andAppealnameEqualTo(String value) {
            addCriterion("appealname =", value, "appealname");
            return (Criteria) this;
        }

        public Criteria andAppealnameNotEqualTo(String value) {
            addCriterion("appealname <>", value, "appealname");
            return (Criteria) this;
        }

        public Criteria andAppealnameGreaterThan(String value) {
            addCriterion("appealname >", value, "appealname");
            return (Criteria) this;
        }

        public Criteria andAppealnameGreaterThanOrEqualTo(String value) {
            addCriterion("appealname >=", value, "appealname");
            return (Criteria) this;
        }

        public Criteria andAppealnameLessThan(String value) {
            addCriterion("appealname <", value, "appealname");
            return (Criteria) this;
        }

        public Criteria andAppealnameLessThanOrEqualTo(String value) {
            addCriterion("appealname <=", value, "appealname");
            return (Criteria) this;
        }

        public Criteria andAppealnameLike(String value) {
            addCriterion("appealname like", value, "appealname");
            return (Criteria) this;
        }

        public Criteria andAppealnameNotLike(String value) {
            addCriterion("appealname not like", value, "appealname");
            return (Criteria) this;
        }

        public Criteria andAppealnameIn(List<String> values) {
            addCriterion("appealname in", values, "appealname");
            return (Criteria) this;
        }

        public Criteria andAppealnameNotIn(List<String> values) {
            addCriterion("appealname not in", values, "appealname");
            return (Criteria) this;
        }

        public Criteria andAppealnameBetween(String value1, String value2) {
            addCriterion("appealname between", value1, value2, "appealname");
            return (Criteria) this;
        }

        public Criteria andAppealnameNotBetween(String value1, String value2) {
            addCriterion("appealname not between", value1, value2, "appealname");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateIsNull() {
            addCriterion("of_appealdate is null");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateIsNotNull() {
            addCriterion("of_appealdate is not null");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateEqualTo(Date value) {
            addCriterion("of_appealdate =", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateNotEqualTo(Date value) {
            addCriterion("of_appealdate <>", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateGreaterThan(Date value) {
            addCriterion("of_appealdate >", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("of_appealdate >=", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateLessThan(Date value) {
            addCriterion("of_appealdate <", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateLessThanOrEqualTo(Date value) {
            addCriterion("of_appealdate <=", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateIn(List<Date> values) {
            addCriterion("of_appealdate in", values, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateNotIn(List<Date> values) {
            addCriterion("of_appealdate not in", values, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateBetween(Date value1, Date value2) {
            addCriterion("of_appealdate between", value1, value2, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateNotBetween(Date value1, Date value2) {
            addCriterion("of_appealdate not between", value1, value2, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadIsNull() {
            addCriterion("Of_adjdateread is null");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadIsNotNull() {
            addCriterion("Of_adjdateread is not null");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadEqualTo(Boolean value) {
            addCriterion("Of_adjdateread =", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadNotEqualTo(Boolean value) {
            addCriterion("Of_adjdateread <>", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadGreaterThan(Boolean value) {
            addCriterion("Of_adjdateread >", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Of_adjdateread >=", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadLessThan(Boolean value) {
            addCriterion("Of_adjdateread <", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadLessThanOrEqualTo(Boolean value) {
            addCriterion("Of_adjdateread <=", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadIn(List<Boolean> values) {
            addCriterion("Of_adjdateread in", values, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadNotIn(List<Boolean> values) {
            addCriterion("Of_adjdateread not in", values, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadBetween(Boolean value1, Boolean value2) {
            addCriterion("Of_adjdateread between", value1, value2, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Of_adjdateread not between", value1, value2, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgIsNull() {
            addCriterion("of_adjdatemsg is null");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgIsNotNull() {
            addCriterion("of_adjdatemsg is not null");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgEqualTo(String value) {
            addCriterion("of_adjdatemsg =", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgNotEqualTo(String value) {
            addCriterion("of_adjdatemsg <>", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgGreaterThan(String value) {
            addCriterion("of_adjdatemsg >", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgGreaterThanOrEqualTo(String value) {
            addCriterion("of_adjdatemsg >=", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgLessThan(String value) {
            addCriterion("of_adjdatemsg <", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgLessThanOrEqualTo(String value) {
            addCriterion("of_adjdatemsg <=", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgLike(String value) {
            addCriterion("of_adjdatemsg like", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgNotLike(String value) {
            addCriterion("of_adjdatemsg not like", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgIn(List<String> values) {
            addCriterion("of_adjdatemsg in", values, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgNotIn(List<String> values) {
            addCriterion("of_adjdatemsg not in", values, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgBetween(String value1, String value2) {
            addCriterion("of_adjdatemsg between", value1, value2, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgNotBetween(String value1, String value2) {
            addCriterion("of_adjdatemsg not between", value1, value2, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleIsNull() {
            addCriterion("of_dateappraisesale is null");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleIsNotNull() {
            addCriterion("of_dateappraisesale is not null");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleEqualTo(Date value) {
            addCriterion("of_dateappraisesale =", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleNotEqualTo(Date value) {
            addCriterion("of_dateappraisesale <>", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleGreaterThan(Date value) {
            addCriterion("of_dateappraisesale >", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleGreaterThanOrEqualTo(Date value) {
            addCriterion("of_dateappraisesale >=", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleLessThan(Date value) {
            addCriterion("of_dateappraisesale <", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleLessThanOrEqualTo(Date value) {
            addCriterion("of_dateappraisesale <=", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleIn(List<Date> values) {
            addCriterion("of_dateappraisesale in", values, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleNotIn(List<Date> values) {
            addCriterion("of_dateappraisesale not in", values, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleBetween(Date value1, Date value2) {
            addCriterion("of_dateappraisesale between", value1, value2, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleNotBetween(Date value1, Date value2) {
            addCriterion("of_dateappraisesale not between", value1, value2, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiIsNull() {
            addCriterion("of_dateappraisedesi is null");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiIsNotNull() {
            addCriterion("of_dateappraisedesi is not null");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiEqualTo(Date value) {
            addCriterion("of_dateappraisedesi =", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiNotEqualTo(Date value) {
            addCriterion("of_dateappraisedesi <>", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiGreaterThan(Date value) {
            addCriterion("of_dateappraisedesi >", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiGreaterThanOrEqualTo(Date value) {
            addCriterion("of_dateappraisedesi >=", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiLessThan(Date value) {
            addCriterion("of_dateappraisedesi <", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiLessThanOrEqualTo(Date value) {
            addCriterion("of_dateappraisedesi <=", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiIn(List<Date> values) {
            addCriterion("of_dateappraisedesi in", values, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiNotIn(List<Date> values) {
            addCriterion("of_dateappraisedesi not in", values, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiBetween(Date value1, Date value2) {
            addCriterion("of_dateappraisedesi between", value1, value2, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiNotBetween(Date value1, Date value2) {
            addCriterion("of_dateappraisedesi not between", value1, value2, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andSale_namenickIsNull() {
            addCriterion("sale_namenick is null");
            return (Criteria) this;
        }

        public Criteria andSale_namenickIsNotNull() {
            addCriterion("sale_namenick is not null");
            return (Criteria) this;
        }

        public Criteria andSale_namenickEqualTo(String value) {
            addCriterion("sale_namenick =", value, "sale_namenick");
            return (Criteria) this;
        }

        public Criteria andSale_namenickNotEqualTo(String value) {
            addCriterion("sale_namenick <>", value, "sale_namenick");
            return (Criteria) this;
        }

        public Criteria andSale_namenickGreaterThan(String value) {
            addCriterion("sale_namenick >", value, "sale_namenick");
            return (Criteria) this;
        }

        public Criteria andSale_namenickGreaterThanOrEqualTo(String value) {
            addCriterion("sale_namenick >=", value, "sale_namenick");
            return (Criteria) this;
        }

        public Criteria andSale_namenickLessThan(String value) {
            addCriterion("sale_namenick <", value, "sale_namenick");
            return (Criteria) this;
        }

        public Criteria andSale_namenickLessThanOrEqualTo(String value) {
            addCriterion("sale_namenick <=", value, "sale_namenick");
            return (Criteria) this;
        }

        public Criteria andSale_namenickLike(String value) {
            addCriterion("sale_namenick like", value, "sale_namenick");
            return (Criteria) this;
        }

        public Criteria andSale_namenickNotLike(String value) {
            addCriterion("sale_namenick not like", value, "sale_namenick");
            return (Criteria) this;
        }

        public Criteria andSale_namenickIn(List<String> values) {
            addCriterion("sale_namenick in", values, "sale_namenick");
            return (Criteria) this;
        }

        public Criteria andSale_namenickNotIn(List<String> values) {
            addCriterion("sale_namenick not in", values, "sale_namenick");
            return (Criteria) this;
        }

        public Criteria andSale_namenickBetween(String value1, String value2) {
            addCriterion("sale_namenick between", value1, value2, "sale_namenick");
            return (Criteria) this;
        }

        public Criteria andSale_namenickNotBetween(String value1, String value2) {
            addCriterion("sale_namenick not between", value1, value2, "sale_namenick");
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

        public Criteria andSale_sexIsNull() {
            addCriterion("sale_sex is null");
            return (Criteria) this;
        }

        public Criteria andSale_sexIsNotNull() {
            addCriterion("sale_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSale_sexEqualTo(String value) {
            addCriterion("sale_sex =", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexNotEqualTo(String value) {
            addCriterion("sale_sex <>", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexGreaterThan(String value) {
            addCriterion("sale_sex >", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexGreaterThanOrEqualTo(String value) {
            addCriterion("sale_sex >=", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexLessThan(String value) {
            addCriterion("sale_sex <", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexLessThanOrEqualTo(String value) {
            addCriterion("sale_sex <=", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexLike(String value) {
            addCriterion("sale_sex like", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexNotLike(String value) {
            addCriterion("sale_sex not like", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexIn(List<String> values) {
            addCriterion("sale_sex in", values, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexNotIn(List<String> values) {
            addCriterion("sale_sex not in", values, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexBetween(String value1, String value2) {
            addCriterion("sale_sex between", value1, value2, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexNotBetween(String value1, String value2) {
            addCriterion("sale_sex not between", value1, value2, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_personjobIsNull() {
            addCriterion("sale_personjob is null");
            return (Criteria) this;
        }

        public Criteria andSale_personjobIsNotNull() {
            addCriterion("sale_personjob is not null");
            return (Criteria) this;
        }

        public Criteria andSale_personjobEqualTo(String value) {
            addCriterion("sale_personjob =", value, "sale_personjob");
            return (Criteria) this;
        }

        public Criteria andSale_personjobNotEqualTo(String value) {
            addCriterion("sale_personjob <>", value, "sale_personjob");
            return (Criteria) this;
        }

        public Criteria andSale_personjobGreaterThan(String value) {
            addCriterion("sale_personjob >", value, "sale_personjob");
            return (Criteria) this;
        }

        public Criteria andSale_personjobGreaterThanOrEqualTo(String value) {
            addCriterion("sale_personjob >=", value, "sale_personjob");
            return (Criteria) this;
        }

        public Criteria andSale_personjobLessThan(String value) {
            addCriterion("sale_personjob <", value, "sale_personjob");
            return (Criteria) this;
        }

        public Criteria andSale_personjobLessThanOrEqualTo(String value) {
            addCriterion("sale_personjob <=", value, "sale_personjob");
            return (Criteria) this;
        }

        public Criteria andSale_personjobLike(String value) {
            addCriterion("sale_personjob like", value, "sale_personjob");
            return (Criteria) this;
        }

        public Criteria andSale_personjobNotLike(String value) {
            addCriterion("sale_personjob not like", value, "sale_personjob");
            return (Criteria) this;
        }

        public Criteria andSale_personjobIn(List<String> values) {
            addCriterion("sale_personjob in", values, "sale_personjob");
            return (Criteria) this;
        }

        public Criteria andSale_personjobNotIn(List<String> values) {
            addCriterion("sale_personjob not in", values, "sale_personjob");
            return (Criteria) this;
        }

        public Criteria andSale_personjobBetween(String value1, String value2) {
            addCriterion("sale_personjob between", value1, value2, "sale_personjob");
            return (Criteria) this;
        }

        public Criteria andSale_personjobNotBetween(String value1, String value2) {
            addCriterion("sale_personjob not between", value1, value2, "sale_personjob");
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