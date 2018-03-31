package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sys_SmsMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_SmsMessageExample() {
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

        public Criteria andSm_idIsNull() {
            addCriterion("sm_id is null");
            return (Criteria) this;
        }

        public Criteria andSm_idIsNotNull() {
            addCriterion("sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSm_idEqualTo(Integer value) {
            addCriterion("sm_id =", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotEqualTo(Integer value) {
            addCriterion("sm_id <>", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idGreaterThan(Integer value) {
            addCriterion("sm_id >", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_id >=", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idLessThan(Integer value) {
            addCriterion("sm_id <", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idLessThanOrEqualTo(Integer value) {
            addCriterion("sm_id <=", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idIn(List<Integer> values) {
            addCriterion("sm_id in", values, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotIn(List<Integer> values) {
            addCriterion("sm_id not in", values, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idBetween(Integer value1, Integer value2) {
            addCriterion("sm_id between", value1, value2, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_id not between", value1, value2, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoIsNull() {
            addCriterion("sm_tempno is null");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoIsNotNull() {
            addCriterion("sm_tempno is not null");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoEqualTo(String value) {
            addCriterion("sm_tempno =", value, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoNotEqualTo(String value) {
            addCriterion("sm_tempno <>", value, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoGreaterThan(String value) {
            addCriterion("sm_tempno >", value, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoGreaterThanOrEqualTo(String value) {
            addCriterion("sm_tempno >=", value, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoLessThan(String value) {
            addCriterion("sm_tempno <", value, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoLessThanOrEqualTo(String value) {
            addCriterion("sm_tempno <=", value, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoLike(String value) {
            addCriterion("sm_tempno like", value, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoNotLike(String value) {
            addCriterion("sm_tempno not like", value, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoIn(List<String> values) {
            addCriterion("sm_tempno in", values, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoNotIn(List<String> values) {
            addCriterion("sm_tempno not in", values, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoBetween(String value1, String value2) {
            addCriterion("sm_tempno between", value1, value2, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_tempnoNotBetween(String value1, String value2) {
            addCriterion("sm_tempno not between", value1, value2, "sm_tempno");
            return (Criteria) this;
        }

        public Criteria andSm_useridIsNull() {
            addCriterion("sm_userid is null");
            return (Criteria) this;
        }

        public Criteria andSm_useridIsNotNull() {
            addCriterion("sm_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSm_useridEqualTo(Long value) {
            addCriterion("sm_userid =", value, "sm_userid");
            return (Criteria) this;
        }

        public Criteria andSm_useridNotEqualTo(Long value) {
            addCriterion("sm_userid <>", value, "sm_userid");
            return (Criteria) this;
        }

        public Criteria andSm_useridGreaterThan(Long value) {
            addCriterion("sm_userid >", value, "sm_userid");
            return (Criteria) this;
        }

        public Criteria andSm_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_userid >=", value, "sm_userid");
            return (Criteria) this;
        }

        public Criteria andSm_useridLessThan(Long value) {
            addCriterion("sm_userid <", value, "sm_userid");
            return (Criteria) this;
        }

        public Criteria andSm_useridLessThanOrEqualTo(Long value) {
            addCriterion("sm_userid <=", value, "sm_userid");
            return (Criteria) this;
        }

        public Criteria andSm_useridIn(List<Long> values) {
            addCriterion("sm_userid in", values, "sm_userid");
            return (Criteria) this;
        }

        public Criteria andSm_useridNotIn(List<Long> values) {
            addCriterion("sm_userid not in", values, "sm_userid");
            return (Criteria) this;
        }

        public Criteria andSm_useridBetween(Long value1, Long value2) {
            addCriterion("sm_userid between", value1, value2, "sm_userid");
            return (Criteria) this;
        }

        public Criteria andSm_useridNotBetween(Long value1, Long value2) {
            addCriterion("sm_userid not between", value1, value2, "sm_userid");
            return (Criteria) this;
        }

        public Criteria andSm_phoneIsNull() {
            addCriterion("sm_phone is null");
            return (Criteria) this;
        }

        public Criteria andSm_phoneIsNotNull() {
            addCriterion("sm_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSm_phoneEqualTo(String value) {
            addCriterion("sm_phone =", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneNotEqualTo(String value) {
            addCriterion("sm_phone <>", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneGreaterThan(String value) {
            addCriterion("sm_phone >", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("sm_phone >=", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneLessThan(String value) {
            addCriterion("sm_phone <", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneLessThanOrEqualTo(String value) {
            addCriterion("sm_phone <=", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneLike(String value) {
            addCriterion("sm_phone like", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneNotLike(String value) {
            addCriterion("sm_phone not like", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneIn(List<String> values) {
            addCriterion("sm_phone in", values, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneNotIn(List<String> values) {
            addCriterion("sm_phone not in", values, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneBetween(String value1, String value2) {
            addCriterion("sm_phone between", value1, value2, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneNotBetween(String value1, String value2) {
            addCriterion("sm_phone not between", value1, value2, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_para0IsNull() {
            addCriterion("sm_para0 is null");
            return (Criteria) this;
        }

        public Criteria andSm_para0IsNotNull() {
            addCriterion("sm_para0 is not null");
            return (Criteria) this;
        }

        public Criteria andSm_para0EqualTo(String value) {
            addCriterion("sm_para0 =", value, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para0NotEqualTo(String value) {
            addCriterion("sm_para0 <>", value, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para0GreaterThan(String value) {
            addCriterion("sm_para0 >", value, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para0GreaterThanOrEqualTo(String value) {
            addCriterion("sm_para0 >=", value, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para0LessThan(String value) {
            addCriterion("sm_para0 <", value, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para0LessThanOrEqualTo(String value) {
            addCriterion("sm_para0 <=", value, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para0Like(String value) {
            addCriterion("sm_para0 like", value, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para0NotLike(String value) {
            addCriterion("sm_para0 not like", value, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para0In(List<String> values) {
            addCriterion("sm_para0 in", values, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para0NotIn(List<String> values) {
            addCriterion("sm_para0 not in", values, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para0Between(String value1, String value2) {
            addCriterion("sm_para0 between", value1, value2, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para0NotBetween(String value1, String value2) {
            addCriterion("sm_para0 not between", value1, value2, "sm_para0");
            return (Criteria) this;
        }

        public Criteria andSm_para1IsNull() {
            addCriterion("sm_para1 is null");
            return (Criteria) this;
        }

        public Criteria andSm_para1IsNotNull() {
            addCriterion("sm_para1 is not null");
            return (Criteria) this;
        }

        public Criteria andSm_para1EqualTo(String value) {
            addCriterion("sm_para1 =", value, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para1NotEqualTo(String value) {
            addCriterion("sm_para1 <>", value, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para1GreaterThan(String value) {
            addCriterion("sm_para1 >", value, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para1GreaterThanOrEqualTo(String value) {
            addCriterion("sm_para1 >=", value, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para1LessThan(String value) {
            addCriterion("sm_para1 <", value, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para1LessThanOrEqualTo(String value) {
            addCriterion("sm_para1 <=", value, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para1Like(String value) {
            addCriterion("sm_para1 like", value, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para1NotLike(String value) {
            addCriterion("sm_para1 not like", value, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para1In(List<String> values) {
            addCriterion("sm_para1 in", values, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para1NotIn(List<String> values) {
            addCriterion("sm_para1 not in", values, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para1Between(String value1, String value2) {
            addCriterion("sm_para1 between", value1, value2, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para1NotBetween(String value1, String value2) {
            addCriterion("sm_para1 not between", value1, value2, "sm_para1");
            return (Criteria) this;
        }

        public Criteria andSm_para2IsNull() {
            addCriterion("sm_para2 is null");
            return (Criteria) this;
        }

        public Criteria andSm_para2IsNotNull() {
            addCriterion("sm_para2 is not null");
            return (Criteria) this;
        }

        public Criteria andSm_para2EqualTo(String value) {
            addCriterion("sm_para2 =", value, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para2NotEqualTo(String value) {
            addCriterion("sm_para2 <>", value, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para2GreaterThan(String value) {
            addCriterion("sm_para2 >", value, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para2GreaterThanOrEqualTo(String value) {
            addCriterion("sm_para2 >=", value, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para2LessThan(String value) {
            addCriterion("sm_para2 <", value, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para2LessThanOrEqualTo(String value) {
            addCriterion("sm_para2 <=", value, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para2Like(String value) {
            addCriterion("sm_para2 like", value, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para2NotLike(String value) {
            addCriterion("sm_para2 not like", value, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para2In(List<String> values) {
            addCriterion("sm_para2 in", values, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para2NotIn(List<String> values) {
            addCriterion("sm_para2 not in", values, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para2Between(String value1, String value2) {
            addCriterion("sm_para2 between", value1, value2, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para2NotBetween(String value1, String value2) {
            addCriterion("sm_para2 not between", value1, value2, "sm_para2");
            return (Criteria) this;
        }

        public Criteria andSm_para3IsNull() {
            addCriterion("sm_para3 is null");
            return (Criteria) this;
        }

        public Criteria andSm_para3IsNotNull() {
            addCriterion("sm_para3 is not null");
            return (Criteria) this;
        }

        public Criteria andSm_para3EqualTo(String value) {
            addCriterion("sm_para3 =", value, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para3NotEqualTo(String value) {
            addCriterion("sm_para3 <>", value, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para3GreaterThan(String value) {
            addCriterion("sm_para3 >", value, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para3GreaterThanOrEqualTo(String value) {
            addCriterion("sm_para3 >=", value, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para3LessThan(String value) {
            addCriterion("sm_para3 <", value, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para3LessThanOrEqualTo(String value) {
            addCriterion("sm_para3 <=", value, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para3Like(String value) {
            addCriterion("sm_para3 like", value, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para3NotLike(String value) {
            addCriterion("sm_para3 not like", value, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para3In(List<String> values) {
            addCriterion("sm_para3 in", values, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para3NotIn(List<String> values) {
            addCriterion("sm_para3 not in", values, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para3Between(String value1, String value2) {
            addCriterion("sm_para3 between", value1, value2, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para3NotBetween(String value1, String value2) {
            addCriterion("sm_para3 not between", value1, value2, "sm_para3");
            return (Criteria) this;
        }

        public Criteria andSm_para4IsNull() {
            addCriterion("sm_para4 is null");
            return (Criteria) this;
        }

        public Criteria andSm_para4IsNotNull() {
            addCriterion("sm_para4 is not null");
            return (Criteria) this;
        }

        public Criteria andSm_para4EqualTo(String value) {
            addCriterion("sm_para4 =", value, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para4NotEqualTo(String value) {
            addCriterion("sm_para4 <>", value, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para4GreaterThan(String value) {
            addCriterion("sm_para4 >", value, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para4GreaterThanOrEqualTo(String value) {
            addCriterion("sm_para4 >=", value, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para4LessThan(String value) {
            addCriterion("sm_para4 <", value, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para4LessThanOrEqualTo(String value) {
            addCriterion("sm_para4 <=", value, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para4Like(String value) {
            addCriterion("sm_para4 like", value, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para4NotLike(String value) {
            addCriterion("sm_para4 not like", value, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para4In(List<String> values) {
            addCriterion("sm_para4 in", values, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para4NotIn(List<String> values) {
            addCriterion("sm_para4 not in", values, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para4Between(String value1, String value2) {
            addCriterion("sm_para4 between", value1, value2, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para4NotBetween(String value1, String value2) {
            addCriterion("sm_para4 not between", value1, value2, "sm_para4");
            return (Criteria) this;
        }

        public Criteria andSm_para5IsNull() {
            addCriterion("sm_para5 is null");
            return (Criteria) this;
        }

        public Criteria andSm_para5IsNotNull() {
            addCriterion("sm_para5 is not null");
            return (Criteria) this;
        }

        public Criteria andSm_para5EqualTo(String value) {
            addCriterion("sm_para5 =", value, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para5NotEqualTo(String value) {
            addCriterion("sm_para5 <>", value, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para5GreaterThan(String value) {
            addCriterion("sm_para5 >", value, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para5GreaterThanOrEqualTo(String value) {
            addCriterion("sm_para5 >=", value, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para5LessThan(String value) {
            addCriterion("sm_para5 <", value, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para5LessThanOrEqualTo(String value) {
            addCriterion("sm_para5 <=", value, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para5Like(String value) {
            addCriterion("sm_para5 like", value, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para5NotLike(String value) {
            addCriterion("sm_para5 not like", value, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para5In(List<String> values) {
            addCriterion("sm_para5 in", values, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para5NotIn(List<String> values) {
            addCriterion("sm_para5 not in", values, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para5Between(String value1, String value2) {
            addCriterion("sm_para5 between", value1, value2, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para5NotBetween(String value1, String value2) {
            addCriterion("sm_para5 not between", value1, value2, "sm_para5");
            return (Criteria) this;
        }

        public Criteria andSm_para6IsNull() {
            addCriterion("sm_para6 is null");
            return (Criteria) this;
        }

        public Criteria andSm_para6IsNotNull() {
            addCriterion("sm_para6 is not null");
            return (Criteria) this;
        }

        public Criteria andSm_para6EqualTo(String value) {
            addCriterion("sm_para6 =", value, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para6NotEqualTo(String value) {
            addCriterion("sm_para6 <>", value, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para6GreaterThan(String value) {
            addCriterion("sm_para6 >", value, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para6GreaterThanOrEqualTo(String value) {
            addCriterion("sm_para6 >=", value, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para6LessThan(String value) {
            addCriterion("sm_para6 <", value, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para6LessThanOrEqualTo(String value) {
            addCriterion("sm_para6 <=", value, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para6Like(String value) {
            addCriterion("sm_para6 like", value, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para6NotLike(String value) {
            addCriterion("sm_para6 not like", value, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para6In(List<String> values) {
            addCriterion("sm_para6 in", values, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para6NotIn(List<String> values) {
            addCriterion("sm_para6 not in", values, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para6Between(String value1, String value2) {
            addCriterion("sm_para6 between", value1, value2, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para6NotBetween(String value1, String value2) {
            addCriterion("sm_para6 not between", value1, value2, "sm_para6");
            return (Criteria) this;
        }

        public Criteria andSm_para7IsNull() {
            addCriterion("sm_para7 is null");
            return (Criteria) this;
        }

        public Criteria andSm_para7IsNotNull() {
            addCriterion("sm_para7 is not null");
            return (Criteria) this;
        }

        public Criteria andSm_para7EqualTo(String value) {
            addCriterion("sm_para7 =", value, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para7NotEqualTo(String value) {
            addCriterion("sm_para7 <>", value, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para7GreaterThan(String value) {
            addCriterion("sm_para7 >", value, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para7GreaterThanOrEqualTo(String value) {
            addCriterion("sm_para7 >=", value, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para7LessThan(String value) {
            addCriterion("sm_para7 <", value, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para7LessThanOrEqualTo(String value) {
            addCriterion("sm_para7 <=", value, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para7Like(String value) {
            addCriterion("sm_para7 like", value, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para7NotLike(String value) {
            addCriterion("sm_para7 not like", value, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para7In(List<String> values) {
            addCriterion("sm_para7 in", values, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para7NotIn(List<String> values) {
            addCriterion("sm_para7 not in", values, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para7Between(String value1, String value2) {
            addCriterion("sm_para7 between", value1, value2, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para7NotBetween(String value1, String value2) {
            addCriterion("sm_para7 not between", value1, value2, "sm_para7");
            return (Criteria) this;
        }

        public Criteria andSm_para8IsNull() {
            addCriterion("sm_para8 is null");
            return (Criteria) this;
        }

        public Criteria andSm_para8IsNotNull() {
            addCriterion("sm_para8 is not null");
            return (Criteria) this;
        }

        public Criteria andSm_para8EqualTo(String value) {
            addCriterion("sm_para8 =", value, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_para8NotEqualTo(String value) {
            addCriterion("sm_para8 <>", value, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_para8GreaterThan(String value) {
            addCriterion("sm_para8 >", value, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_para8GreaterThanOrEqualTo(String value) {
            addCriterion("sm_para8 >=", value, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_para8LessThan(String value) {
            addCriterion("sm_para8 <", value, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_para8LessThanOrEqualTo(String value) {
            addCriterion("sm_para8 <=", value, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_para8Like(String value) {
            addCriterion("sm_para8 like", value, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_para8NotLike(String value) {
            addCriterion("sm_para8 not like", value, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_para8In(List<String> values) {
            addCriterion("sm_para8 in", values, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_para8NotIn(List<String> values) {
            addCriterion("sm_para8 not in", values, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_para8Between(String value1, String value2) {
            addCriterion("sm_para8 between", value1, value2, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_para8NotBetween(String value1, String value2) {
            addCriterion("sm_para8 not between", value1, value2, "sm_para8");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeIsNull() {
            addCriterion("sm_sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeIsNotNull() {
            addCriterion("sm_sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeEqualTo(Date value) {
            addCriterion("sm_sendtime =", value, "sm_sendtime");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeNotEqualTo(Date value) {
            addCriterion("sm_sendtime <>", value, "sm_sendtime");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeGreaterThan(Date value) {
            addCriterion("sm_sendtime >", value, "sm_sendtime");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sm_sendtime >=", value, "sm_sendtime");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeLessThan(Date value) {
            addCriterion("sm_sendtime <", value, "sm_sendtime");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sm_sendtime <=", value, "sm_sendtime");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeIn(List<Date> values) {
            addCriterion("sm_sendtime in", values, "sm_sendtime");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeNotIn(List<Date> values) {
            addCriterion("sm_sendtime not in", values, "sm_sendtime");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeBetween(Date value1, Date value2) {
            addCriterion("sm_sendtime between", value1, value2, "sm_sendtime");
            return (Criteria) this;
        }

        public Criteria andSm_sendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sm_sendtime not between", value1, value2, "sm_sendtime");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeIsNull() {
            addCriterion("sm_createtime is null");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeIsNotNull() {
            addCriterion("sm_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeEqualTo(Date value) {
            addCriterion("sm_createtime =", value, "sm_createtime");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeNotEqualTo(Date value) {
            addCriterion("sm_createtime <>", value, "sm_createtime");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeGreaterThan(Date value) {
            addCriterion("sm_createtime >", value, "sm_createtime");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sm_createtime >=", value, "sm_createtime");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeLessThan(Date value) {
            addCriterion("sm_createtime <", value, "sm_createtime");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeLessThanOrEqualTo(Date value) {
            addCriterion("sm_createtime <=", value, "sm_createtime");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeIn(List<Date> values) {
            addCriterion("sm_createtime in", values, "sm_createtime");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeNotIn(List<Date> values) {
            addCriterion("sm_createtime not in", values, "sm_createtime");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeBetween(Date value1, Date value2) {
            addCriterion("sm_createtime between", value1, value2, "sm_createtime");
            return (Criteria) this;
        }

        public Criteria andSm_createtimeNotBetween(Date value1, Date value2) {
            addCriterion("sm_createtime not between", value1, value2, "sm_createtime");
            return (Criteria) this;
        }

        public Criteria andSm_statusIsNull() {
            addCriterion("sm_status is null");
            return (Criteria) this;
        }

        public Criteria andSm_statusIsNotNull() {
            addCriterion("sm_status is not null");
            return (Criteria) this;
        }

        public Criteria andSm_statusEqualTo(Byte value) {
            addCriterion("sm_status =", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusNotEqualTo(Byte value) {
            addCriterion("sm_status <>", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusGreaterThan(Byte value) {
            addCriterion("sm_status >", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sm_status >=", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusLessThan(Byte value) {
            addCriterion("sm_status <", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusLessThanOrEqualTo(Byte value) {
            addCriterion("sm_status <=", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusIn(List<Byte> values) {
            addCriterion("sm_status in", values, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusNotIn(List<Byte> values) {
            addCriterion("sm_status not in", values, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusBetween(Byte value1, Byte value2) {
            addCriterion("sm_status between", value1, value2, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("sm_status not between", value1, value2, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_remarkIsNull() {
            addCriterion("sm_remark is null");
            return (Criteria) this;
        }

        public Criteria andSm_remarkIsNotNull() {
            addCriterion("sm_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSm_remarkEqualTo(String value) {
            addCriterion("sm_remark =", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkNotEqualTo(String value) {
            addCriterion("sm_remark <>", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkGreaterThan(String value) {
            addCriterion("sm_remark >", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("sm_remark >=", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkLessThan(String value) {
            addCriterion("sm_remark <", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkLessThanOrEqualTo(String value) {
            addCriterion("sm_remark <=", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkLike(String value) {
            addCriterion("sm_remark like", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkNotLike(String value) {
            addCriterion("sm_remark not like", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkIn(List<String> values) {
            addCriterion("sm_remark in", values, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkNotIn(List<String> values) {
            addCriterion("sm_remark not in", values, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkBetween(String value1, String value2) {
            addCriterion("sm_remark between", value1, value2, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkNotBetween(String value1, String value2) {
            addCriterion("sm_remark not between", value1, value2, "sm_remark");
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