package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sys_User_MsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_User_MsgExample() {
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

        public Criteria andUm_useridIsNull() {
            addCriterion("um_userid is null");
            return (Criteria) this;
        }

        public Criteria andUm_useridIsNotNull() {
            addCriterion("um_userid is not null");
            return (Criteria) this;
        }

        public Criteria andUm_useridEqualTo(Long value) {
            addCriterion("um_userid =", value, "um_userid");
            return (Criteria) this;
        }

        public Criteria andUm_useridNotEqualTo(Long value) {
            addCriterion("um_userid <>", value, "um_userid");
            return (Criteria) this;
        }

        public Criteria andUm_useridGreaterThan(Long value) {
            addCriterion("um_userid >", value, "um_userid");
            return (Criteria) this;
        }

        public Criteria andUm_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("um_userid >=", value, "um_userid");
            return (Criteria) this;
        }

        public Criteria andUm_useridLessThan(Long value) {
            addCriterion("um_userid <", value, "um_userid");
            return (Criteria) this;
        }

        public Criteria andUm_useridLessThanOrEqualTo(Long value) {
            addCriterion("um_userid <=", value, "um_userid");
            return (Criteria) this;
        }

        public Criteria andUm_useridIn(List<Long> values) {
            addCriterion("um_userid in", values, "um_userid");
            return (Criteria) this;
        }

        public Criteria andUm_useridNotIn(List<Long> values) {
            addCriterion("um_userid not in", values, "um_userid");
            return (Criteria) this;
        }

        public Criteria andUm_useridBetween(Long value1, Long value2) {
            addCriterion("um_userid between", value1, value2, "um_userid");
            return (Criteria) this;
        }

        public Criteria andUm_useridNotBetween(Long value1, Long value2) {
            addCriterion("um_userid not between", value1, value2, "um_userid");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeIsNull() {
            addCriterion("um_lookmetime is null");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeIsNotNull() {
            addCriterion("um_lookmetime is not null");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeEqualTo(Integer value) {
            addCriterion("um_lookmetime =", value, "um_lookmetime");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeNotEqualTo(Integer value) {
            addCriterion("um_lookmetime <>", value, "um_lookmetime");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeGreaterThan(Integer value) {
            addCriterion("um_lookmetime >", value, "um_lookmetime");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_lookmetime >=", value, "um_lookmetime");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeLessThan(Integer value) {
            addCriterion("um_lookmetime <", value, "um_lookmetime");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeLessThanOrEqualTo(Integer value) {
            addCriterion("um_lookmetime <=", value, "um_lookmetime");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeIn(List<Integer> values) {
            addCriterion("um_lookmetime in", values, "um_lookmetime");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeNotIn(List<Integer> values) {
            addCriterion("um_lookmetime not in", values, "um_lookmetime");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeBetween(Integer value1, Integer value2) {
            addCriterion("um_lookmetime between", value1, value2, "um_lookmetime");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("um_lookmetime not between", value1, value2, "um_lookmetime");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleIsNull() {
            addCriterion("um_lookmetitle is null");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleIsNotNull() {
            addCriterion("um_lookmetitle is not null");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleEqualTo(String value) {
            addCriterion("um_lookmetitle =", value, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleNotEqualTo(String value) {
            addCriterion("um_lookmetitle <>", value, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleGreaterThan(String value) {
            addCriterion("um_lookmetitle >", value, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleGreaterThanOrEqualTo(String value) {
            addCriterion("um_lookmetitle >=", value, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleLessThan(String value) {
            addCriterion("um_lookmetitle <", value, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleLessThanOrEqualTo(String value) {
            addCriterion("um_lookmetitle <=", value, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleLike(String value) {
            addCriterion("um_lookmetitle like", value, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleNotLike(String value) {
            addCriterion("um_lookmetitle not like", value, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleIn(List<String> values) {
            addCriterion("um_lookmetitle in", values, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleNotIn(List<String> values) {
            addCriterion("um_lookmetitle not in", values, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleBetween(String value1, String value2) {
            addCriterion("um_lookmetitle between", value1, value2, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmetitleNotBetween(String value1, String value2) {
            addCriterion("um_lookmetitle not between", value1, value2, "um_lookmetitle");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateIsNull() {
            addCriterion("um_lookmedate is null");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateIsNotNull() {
            addCriterion("um_lookmedate is not null");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateEqualTo(Date value) {
            addCriterion("um_lookmedate =", value, "um_lookmedate");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateNotEqualTo(Date value) {
            addCriterion("um_lookmedate <>", value, "um_lookmedate");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateGreaterThan(Date value) {
            addCriterion("um_lookmedate >", value, "um_lookmedate");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateGreaterThanOrEqualTo(Date value) {
            addCriterion("um_lookmedate >=", value, "um_lookmedate");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateLessThan(Date value) {
            addCriterion("um_lookmedate <", value, "um_lookmedate");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateLessThanOrEqualTo(Date value) {
            addCriterion("um_lookmedate <=", value, "um_lookmedate");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateIn(List<Date> values) {
            addCriterion("um_lookmedate in", values, "um_lookmedate");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateNotIn(List<Date> values) {
            addCriterion("um_lookmedate not in", values, "um_lookmedate");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateBetween(Date value1, Date value2) {
            addCriterion("um_lookmedate between", value1, value2, "um_lookmedate");
            return (Criteria) this;
        }

        public Criteria andUm_lookmedateNotBetween(Date value1, Date value2) {
            addCriterion("um_lookmedate not between", value1, value2, "um_lookmedate");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeIsNull() {
            addCriterion("um_interesttime is null");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeIsNotNull() {
            addCriterion("um_interesttime is not null");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeEqualTo(Integer value) {
            addCriterion("um_interesttime =", value, "um_interesttime");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeNotEqualTo(Integer value) {
            addCriterion("um_interesttime <>", value, "um_interesttime");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeGreaterThan(Integer value) {
            addCriterion("um_interesttime >", value, "um_interesttime");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_interesttime >=", value, "um_interesttime");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeLessThan(Integer value) {
            addCriterion("um_interesttime <", value, "um_interesttime");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeLessThanOrEqualTo(Integer value) {
            addCriterion("um_interesttime <=", value, "um_interesttime");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeIn(List<Integer> values) {
            addCriterion("um_interesttime in", values, "um_interesttime");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeNotIn(List<Integer> values) {
            addCriterion("um_interesttime not in", values, "um_interesttime");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeBetween(Integer value1, Integer value2) {
            addCriterion("um_interesttime between", value1, value2, "um_interesttime");
            return (Criteria) this;
        }

        public Criteria andUm_interesttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("um_interesttime not between", value1, value2, "um_interesttime");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleIsNull() {
            addCriterion("um_interesttitle is null");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleIsNotNull() {
            addCriterion("um_interesttitle is not null");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleEqualTo(String value) {
            addCriterion("um_interesttitle =", value, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleNotEqualTo(String value) {
            addCriterion("um_interesttitle <>", value, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleGreaterThan(String value) {
            addCriterion("um_interesttitle >", value, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleGreaterThanOrEqualTo(String value) {
            addCriterion("um_interesttitle >=", value, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleLessThan(String value) {
            addCriterion("um_interesttitle <", value, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleLessThanOrEqualTo(String value) {
            addCriterion("um_interesttitle <=", value, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleLike(String value) {
            addCriterion("um_interesttitle like", value, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleNotLike(String value) {
            addCriterion("um_interesttitle not like", value, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleIn(List<String> values) {
            addCriterion("um_interesttitle in", values, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleNotIn(List<String> values) {
            addCriterion("um_interesttitle not in", values, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleBetween(String value1, String value2) {
            addCriterion("um_interesttitle between", value1, value2, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interesttitleNotBetween(String value1, String value2) {
            addCriterion("um_interesttitle not between", value1, value2, "um_interesttitle");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateIsNull() {
            addCriterion("um_interestdate is null");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateIsNotNull() {
            addCriterion("um_interestdate is not null");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateEqualTo(Date value) {
            addCriterion("um_interestdate =", value, "um_interestdate");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateNotEqualTo(Date value) {
            addCriterion("um_interestdate <>", value, "um_interestdate");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateGreaterThan(Date value) {
            addCriterion("um_interestdate >", value, "um_interestdate");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateGreaterThanOrEqualTo(Date value) {
            addCriterion("um_interestdate >=", value, "um_interestdate");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateLessThan(Date value) {
            addCriterion("um_interestdate <", value, "um_interestdate");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateLessThanOrEqualTo(Date value) {
            addCriterion("um_interestdate <=", value, "um_interestdate");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateIn(List<Date> values) {
            addCriterion("um_interestdate in", values, "um_interestdate");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateNotIn(List<Date> values) {
            addCriterion("um_interestdate not in", values, "um_interestdate");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateBetween(Date value1, Date value2) {
            addCriterion("um_interestdate between", value1, value2, "um_interestdate");
            return (Criteria) this;
        }

        public Criteria andUm_interestdateNotBetween(Date value1, Date value2) {
            addCriterion("um_interestdate not between", value1, value2, "um_interestdate");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeIsNull() {
            addCriterion("um_ordermsgtime is null");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeIsNotNull() {
            addCriterion("um_ordermsgtime is not null");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeEqualTo(Integer value) {
            addCriterion("um_ordermsgtime =", value, "um_ordermsgtime");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeNotEqualTo(Integer value) {
            addCriterion("um_ordermsgtime <>", value, "um_ordermsgtime");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeGreaterThan(Integer value) {
            addCriterion("um_ordermsgtime >", value, "um_ordermsgtime");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_ordermsgtime >=", value, "um_ordermsgtime");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeLessThan(Integer value) {
            addCriterion("um_ordermsgtime <", value, "um_ordermsgtime");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeLessThanOrEqualTo(Integer value) {
            addCriterion("um_ordermsgtime <=", value, "um_ordermsgtime");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeIn(List<Integer> values) {
            addCriterion("um_ordermsgtime in", values, "um_ordermsgtime");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeNotIn(List<Integer> values) {
            addCriterion("um_ordermsgtime not in", values, "um_ordermsgtime");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeBetween(Integer value1, Integer value2) {
            addCriterion("um_ordermsgtime between", value1, value2, "um_ordermsgtime");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("um_ordermsgtime not between", value1, value2, "um_ordermsgtime");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateIsNull() {
            addCriterion("um_ordermsgdate is null");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateIsNotNull() {
            addCriterion("um_ordermsgdate is not null");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateEqualTo(Date value) {
            addCriterion("um_ordermsgdate =", value, "um_ordermsgdate");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateNotEqualTo(Date value) {
            addCriterion("um_ordermsgdate <>", value, "um_ordermsgdate");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateGreaterThan(Date value) {
            addCriterion("um_ordermsgdate >", value, "um_ordermsgdate");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateGreaterThanOrEqualTo(Date value) {
            addCriterion("um_ordermsgdate >=", value, "um_ordermsgdate");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateLessThan(Date value) {
            addCriterion("um_ordermsgdate <", value, "um_ordermsgdate");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateLessThanOrEqualTo(Date value) {
            addCriterion("um_ordermsgdate <=", value, "um_ordermsgdate");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateIn(List<Date> values) {
            addCriterion("um_ordermsgdate in", values, "um_ordermsgdate");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateNotIn(List<Date> values) {
            addCriterion("um_ordermsgdate not in", values, "um_ordermsgdate");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateBetween(Date value1, Date value2) {
            addCriterion("um_ordermsgdate between", value1, value2, "um_ordermsgdate");
            return (Criteria) this;
        }

        public Criteria andUm_ordermsgdateNotBetween(Date value1, Date value2) {
            addCriterion("um_ordermsgdate not between", value1, value2, "um_ordermsgdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeIsNull() {
            addCriterion("um_dsg_baitietime is null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeIsNotNull() {
            addCriterion("um_dsg_baitietime is not null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeEqualTo(Integer value) {
            addCriterion("um_dsg_baitietime =", value, "um_dsg_baitietime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeNotEqualTo(Integer value) {
            addCriterion("um_dsg_baitietime <>", value, "um_dsg_baitietime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeGreaterThan(Integer value) {
            addCriterion("um_dsg_baitietime >", value, "um_dsg_baitietime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_dsg_baitietime >=", value, "um_dsg_baitietime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeLessThan(Integer value) {
            addCriterion("um_dsg_baitietime <", value, "um_dsg_baitietime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeLessThanOrEqualTo(Integer value) {
            addCriterion("um_dsg_baitietime <=", value, "um_dsg_baitietime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeIn(List<Integer> values) {
            addCriterion("um_dsg_baitietime in", values, "um_dsg_baitietime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeNotIn(List<Integer> values) {
            addCriterion("um_dsg_baitietime not in", values, "um_dsg_baitietime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeBetween(Integer value1, Integer value2) {
            addCriterion("um_dsg_baitietime between", value1, value2, "um_dsg_baitietime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitietimeNotBetween(Integer value1, Integer value2) {
            addCriterion("um_dsg_baitietime not between", value1, value2, "um_dsg_baitietime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateIsNull() {
            addCriterion("um_dsg_baitiedate is null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateIsNotNull() {
            addCriterion("um_dsg_baitiedate is not null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateEqualTo(Date value) {
            addCriterion("um_dsg_baitiedate =", value, "um_dsg_baitiedate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateNotEqualTo(Date value) {
            addCriterion("um_dsg_baitiedate <>", value, "um_dsg_baitiedate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateGreaterThan(Date value) {
            addCriterion("um_dsg_baitiedate >", value, "um_dsg_baitiedate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateGreaterThanOrEqualTo(Date value) {
            addCriterion("um_dsg_baitiedate >=", value, "um_dsg_baitiedate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateLessThan(Date value) {
            addCriterion("um_dsg_baitiedate <", value, "um_dsg_baitiedate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateLessThanOrEqualTo(Date value) {
            addCriterion("um_dsg_baitiedate <=", value, "um_dsg_baitiedate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateIn(List<Date> values) {
            addCriterion("um_dsg_baitiedate in", values, "um_dsg_baitiedate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateNotIn(List<Date> values) {
            addCriterion("um_dsg_baitiedate not in", values, "um_dsg_baitiedate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateBetween(Date value1, Date value2) {
            addCriterion("um_dsg_baitiedate between", value1, value2, "um_dsg_baitiedate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_baitiedateNotBetween(Date value1, Date value2) {
            addCriterion("um_dsg_baitiedate not between", value1, value2, "um_dsg_baitiedate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeIsNull() {
            addCriterion("um_dsg_audittime is null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeIsNotNull() {
            addCriterion("um_dsg_audittime is not null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeEqualTo(Integer value) {
            addCriterion("um_dsg_audittime =", value, "um_dsg_audittime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeNotEqualTo(Integer value) {
            addCriterion("um_dsg_audittime <>", value, "um_dsg_audittime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeGreaterThan(Integer value) {
            addCriterion("um_dsg_audittime >", value, "um_dsg_audittime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_dsg_audittime >=", value, "um_dsg_audittime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeLessThan(Integer value) {
            addCriterion("um_dsg_audittime <", value, "um_dsg_audittime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeLessThanOrEqualTo(Integer value) {
            addCriterion("um_dsg_audittime <=", value, "um_dsg_audittime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeIn(List<Integer> values) {
            addCriterion("um_dsg_audittime in", values, "um_dsg_audittime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeNotIn(List<Integer> values) {
            addCriterion("um_dsg_audittime not in", values, "um_dsg_audittime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeBetween(Integer value1, Integer value2) {
            addCriterion("um_dsg_audittime between", value1, value2, "um_dsg_audittime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_audittimeNotBetween(Integer value1, Integer value2) {
            addCriterion("um_dsg_audittime not between", value1, value2, "um_dsg_audittime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateIsNull() {
            addCriterion("um_dsg_auditdate is null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateIsNotNull() {
            addCriterion("um_dsg_auditdate is not null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateEqualTo(Date value) {
            addCriterion("um_dsg_auditdate =", value, "um_dsg_auditdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateNotEqualTo(Date value) {
            addCriterion("um_dsg_auditdate <>", value, "um_dsg_auditdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateGreaterThan(Date value) {
            addCriterion("um_dsg_auditdate >", value, "um_dsg_auditdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateGreaterThanOrEqualTo(Date value) {
            addCriterion("um_dsg_auditdate >=", value, "um_dsg_auditdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateLessThan(Date value) {
            addCriterion("um_dsg_auditdate <", value, "um_dsg_auditdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateLessThanOrEqualTo(Date value) {
            addCriterion("um_dsg_auditdate <=", value, "um_dsg_auditdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateIn(List<Date> values) {
            addCriterion("um_dsg_auditdate in", values, "um_dsg_auditdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateNotIn(List<Date> values) {
            addCriterion("um_dsg_auditdate not in", values, "um_dsg_auditdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateBetween(Date value1, Date value2) {
            addCriterion("um_dsg_auditdate between", value1, value2, "um_dsg_auditdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_auditdateNotBetween(Date value1, Date value2) {
            addCriterion("um_dsg_auditdate not between", value1, value2, "um_dsg_auditdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeIsNull() {
            addCriterion("um_dsg_appealtime is null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeIsNotNull() {
            addCriterion("um_dsg_appealtime is not null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeEqualTo(Integer value) {
            addCriterion("um_dsg_appealtime =", value, "um_dsg_appealtime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeNotEqualTo(Integer value) {
            addCriterion("um_dsg_appealtime <>", value, "um_dsg_appealtime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeGreaterThan(Integer value) {
            addCriterion("um_dsg_appealtime >", value, "um_dsg_appealtime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_dsg_appealtime >=", value, "um_dsg_appealtime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeLessThan(Integer value) {
            addCriterion("um_dsg_appealtime <", value, "um_dsg_appealtime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeLessThanOrEqualTo(Integer value) {
            addCriterion("um_dsg_appealtime <=", value, "um_dsg_appealtime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeIn(List<Integer> values) {
            addCriterion("um_dsg_appealtime in", values, "um_dsg_appealtime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeNotIn(List<Integer> values) {
            addCriterion("um_dsg_appealtime not in", values, "um_dsg_appealtime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeBetween(Integer value1, Integer value2) {
            addCriterion("um_dsg_appealtime between", value1, value2, "um_dsg_appealtime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("um_dsg_appealtime not between", value1, value2, "um_dsg_appealtime");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateIsNull() {
            addCriterion("um_dsg_appealdate is null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateIsNotNull() {
            addCriterion("um_dsg_appealdate is not null");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateEqualTo(Date value) {
            addCriterion("um_dsg_appealdate =", value, "um_dsg_appealdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateNotEqualTo(Date value) {
            addCriterion("um_dsg_appealdate <>", value, "um_dsg_appealdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateGreaterThan(Date value) {
            addCriterion("um_dsg_appealdate >", value, "um_dsg_appealdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("um_dsg_appealdate >=", value, "um_dsg_appealdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateLessThan(Date value) {
            addCriterion("um_dsg_appealdate <", value, "um_dsg_appealdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateLessThanOrEqualTo(Date value) {
            addCriterion("um_dsg_appealdate <=", value, "um_dsg_appealdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateIn(List<Date> values) {
            addCriterion("um_dsg_appealdate in", values, "um_dsg_appealdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateNotIn(List<Date> values) {
            addCriterion("um_dsg_appealdate not in", values, "um_dsg_appealdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateBetween(Date value1, Date value2) {
            addCriterion("um_dsg_appealdate between", value1, value2, "um_dsg_appealdate");
            return (Criteria) this;
        }

        public Criteria andUm_dsg_appealdateNotBetween(Date value1, Date value2) {
            addCriterion("um_dsg_appealdate not between", value1, value2, "um_dsg_appealdate");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeIsNull() {
            addCriterion("um_msgsumtime is null");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeIsNotNull() {
            addCriterion("um_msgsumtime is not null");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeEqualTo(Integer value) {
            addCriterion("um_msgsumtime =", value, "um_msgsumtime");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeNotEqualTo(Integer value) {
            addCriterion("um_msgsumtime <>", value, "um_msgsumtime");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeGreaterThan(Integer value) {
            addCriterion("um_msgsumtime >", value, "um_msgsumtime");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_msgsumtime >=", value, "um_msgsumtime");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeLessThan(Integer value) {
            addCriterion("um_msgsumtime <", value, "um_msgsumtime");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeLessThanOrEqualTo(Integer value) {
            addCriterion("um_msgsumtime <=", value, "um_msgsumtime");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeIn(List<Integer> values) {
            addCriterion("um_msgsumtime in", values, "um_msgsumtime");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeNotIn(List<Integer> values) {
            addCriterion("um_msgsumtime not in", values, "um_msgsumtime");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeBetween(Integer value1, Integer value2) {
            addCriterion("um_msgsumtime between", value1, value2, "um_msgsumtime");
            return (Criteria) this;
        }

        public Criteria andUm_msgsumtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("um_msgsumtime not between", value1, value2, "um_msgsumtime");
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

        public Criteria andUm_evaluatesumIsNull() {
            addCriterion("um_evaluatesum is null");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumIsNotNull() {
            addCriterion("um_evaluatesum is not null");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumEqualTo(Integer value) {
            addCriterion("um_evaluatesum =", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumNotEqualTo(Integer value) {
            addCriterion("um_evaluatesum <>", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumGreaterThan(Integer value) {
            addCriterion("um_evaluatesum >", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_evaluatesum >=", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumLessThan(Integer value) {
            addCriterion("um_evaluatesum <", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumLessThanOrEqualTo(Integer value) {
            addCriterion("um_evaluatesum <=", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumIn(List<Integer> values) {
            addCriterion("um_evaluatesum in", values, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumNotIn(List<Integer> values) {
            addCriterion("um_evaluatesum not in", values, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumBetween(Integer value1, Integer value2) {
            addCriterion("um_evaluatesum between", value1, value2, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumNotBetween(Integer value1, Integer value2) {
            addCriterion("um_evaluatesum not between", value1, value2, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountIsNull() {
            addCriterion("um_evaluatecount is null");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountIsNotNull() {
            addCriterion("um_evaluatecount is not null");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountEqualTo(Integer value) {
            addCriterion("um_evaluatecount =", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountNotEqualTo(Integer value) {
            addCriterion("um_evaluatecount <>", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountGreaterThan(Integer value) {
            addCriterion("um_evaluatecount >", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_evaluatecount >=", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountLessThan(Integer value) {
            addCriterion("um_evaluatecount <", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountLessThanOrEqualTo(Integer value) {
            addCriterion("um_evaluatecount <=", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountIn(List<Integer> values) {
            addCriterion("um_evaluatecount in", values, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountNotIn(List<Integer> values) {
            addCriterion("um_evaluatecount not in", values, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountBetween(Integer value1, Integer value2) {
            addCriterion("um_evaluatecount between", value1, value2, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountNotBetween(Integer value1, Integer value2) {
            addCriterion("um_evaluatecount not between", value1, value2, "um_evaluatecount");
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