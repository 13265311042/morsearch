package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseV_Company_UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseV_Company_UserExample() {
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

        public Criteria andBcu_idIsNull() {
            addCriterion("bcu_id is null");
            return (Criteria) this;
        }

        public Criteria andBcu_idIsNotNull() {
            addCriterion("bcu_id is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_idEqualTo(Long value) {
            addCriterion("bcu_id =", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idNotEqualTo(Long value) {
            addCriterion("bcu_id <>", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idGreaterThan(Long value) {
            addCriterion("bcu_id >", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idGreaterThanOrEqualTo(Long value) {
            addCriterion("bcu_id >=", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idLessThan(Long value) {
            addCriterion("bcu_id <", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idLessThanOrEqualTo(Long value) {
            addCriterion("bcu_id <=", value, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idIn(List<Long> values) {
            addCriterion("bcu_id in", values, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idNotIn(List<Long> values) {
            addCriterion("bcu_id not in", values, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idBetween(Long value1, Long value2) {
            addCriterion("bcu_id between", value1, value2, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_idNotBetween(Long value1, Long value2) {
            addCriterion("bcu_id not between", value1, value2, "bcu_id");
            return (Criteria) this;
        }

        public Criteria andBcu_useridIsNull() {
            addCriterion("bcu_userid is null");
            return (Criteria) this;
        }

        public Criteria andBcu_useridIsNotNull() {
            addCriterion("bcu_userid is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_useridEqualTo(Long value) {
            addCriterion("bcu_userid =", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridNotEqualTo(Long value) {
            addCriterion("bcu_userid <>", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridGreaterThan(Long value) {
            addCriterion("bcu_userid >", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("bcu_userid >=", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridLessThan(Long value) {
            addCriterion("bcu_userid <", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridLessThanOrEqualTo(Long value) {
            addCriterion("bcu_userid <=", value, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridIn(List<Long> values) {
            addCriterion("bcu_userid in", values, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridNotIn(List<Long> values) {
            addCriterion("bcu_userid not in", values, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridBetween(Long value1, Long value2) {
            addCriterion("bcu_userid between", value1, value2, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_useridNotBetween(Long value1, Long value2) {
            addCriterion("bcu_userid not between", value1, value2, "bcu_userid");
            return (Criteria) this;
        }

        public Criteria andBcu_typeIsNull() {
            addCriterion("bcu_type is null");
            return (Criteria) this;
        }

        public Criteria andBcu_typeIsNotNull() {
            addCriterion("bcu_type is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_typeEqualTo(Byte value) {
            addCriterion("bcu_type =", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeNotEqualTo(Byte value) {
            addCriterion("bcu_type <>", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeGreaterThan(Byte value) {
            addCriterion("bcu_type >", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeGreaterThanOrEqualTo(Byte value) {
            addCriterion("bcu_type >=", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeLessThan(Byte value) {
            addCriterion("bcu_type <", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeLessThanOrEqualTo(Byte value) {
            addCriterion("bcu_type <=", value, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeIn(List<Byte> values) {
            addCriterion("bcu_type in", values, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeNotIn(List<Byte> values) {
            addCriterion("bcu_type not in", values, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeBetween(Byte value1, Byte value2) {
            addCriterion("bcu_type between", value1, value2, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_typeNotBetween(Byte value1, Byte value2) {
            addCriterion("bcu_type not between", value1, value2, "bcu_type");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridIsNull() {
            addCriterion("bcu_listuserid is null");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridIsNotNull() {
            addCriterion("bcu_listuserid is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridEqualTo(Long value) {
            addCriterion("bcu_listuserid =", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridNotEqualTo(Long value) {
            addCriterion("bcu_listuserid <>", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridGreaterThan(Long value) {
            addCriterion("bcu_listuserid >", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("bcu_listuserid >=", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridLessThan(Long value) {
            addCriterion("bcu_listuserid <", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridLessThanOrEqualTo(Long value) {
            addCriterion("bcu_listuserid <=", value, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridIn(List<Long> values) {
            addCriterion("bcu_listuserid in", values, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridNotIn(List<Long> values) {
            addCriterion("bcu_listuserid not in", values, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridBetween(Long value1, Long value2) {
            addCriterion("bcu_listuserid between", value1, value2, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_listuseridNotBetween(Long value1, Long value2) {
            addCriterion("bcu_listuserid not between", value1, value2, "bcu_listuserid");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateIsNull() {
            addCriterion("bcu_createdate is null");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateIsNotNull() {
            addCriterion("bcu_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateEqualTo(Date value) {
            addCriterion("bcu_createdate =", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateNotEqualTo(Date value) {
            addCriterion("bcu_createdate <>", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateGreaterThan(Date value) {
            addCriterion("bcu_createdate >", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("bcu_createdate >=", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateLessThan(Date value) {
            addCriterion("bcu_createdate <", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateLessThanOrEqualTo(Date value) {
            addCriterion("bcu_createdate <=", value, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateIn(List<Date> values) {
            addCriterion("bcu_createdate in", values, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateNotIn(List<Date> values) {
            addCriterion("bcu_createdate not in", values, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateBetween(Date value1, Date value2) {
            addCriterion("bcu_createdate between", value1, value2, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_createdateNotBetween(Date value1, Date value2) {
            addCriterion("bcu_createdate not between", value1, value2, "bcu_createdate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateIsNull() {
            addCriterion("bcu_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateIsNotNull() {
            addCriterion("bcu_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateEqualTo(Date value) {
            addCriterion("bcu_updatedate =", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateNotEqualTo(Date value) {
            addCriterion("bcu_updatedate <>", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateGreaterThan(Date value) {
            addCriterion("bcu_updatedate >", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("bcu_updatedate >=", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateLessThan(Date value) {
            addCriterion("bcu_updatedate <", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("bcu_updatedate <=", value, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateIn(List<Date> values) {
            addCriterion("bcu_updatedate in", values, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateNotIn(List<Date> values) {
            addCriterion("bcu_updatedate not in", values, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateBetween(Date value1, Date value2) {
            addCriterion("bcu_updatedate between", value1, value2, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("bcu_updatedate not between", value1, value2, "bcu_updatedate");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1IsNull() {
            addCriterion("bcu_confirm1 is null");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1IsNotNull() {
            addCriterion("bcu_confirm1 is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1EqualTo(Boolean value) {
            addCriterion("bcu_confirm1 =", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1NotEqualTo(Boolean value) {
            addCriterion("bcu_confirm1 <>", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1GreaterThan(Boolean value) {
            addCriterion("bcu_confirm1 >", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("bcu_confirm1 >=", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1LessThan(Boolean value) {
            addCriterion("bcu_confirm1 <", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1LessThanOrEqualTo(Boolean value) {
            addCriterion("bcu_confirm1 <=", value, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1In(List<Boolean> values) {
            addCriterion("bcu_confirm1 in", values, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1NotIn(List<Boolean> values) {
            addCriterion("bcu_confirm1 not in", values, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1Between(Boolean value1, Boolean value2) {
            addCriterion("bcu_confirm1 between", value1, value2, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("bcu_confirm1 not between", value1, value2, "bcu_confirm1");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2IsNull() {
            addCriterion("bcu_confirm2 is null");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2IsNotNull() {
            addCriterion("bcu_confirm2 is not null");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2EqualTo(Boolean value) {
            addCriterion("bcu_confirm2 =", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2NotEqualTo(Boolean value) {
            addCriterion("bcu_confirm2 <>", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2GreaterThan(Boolean value) {
            addCriterion("bcu_confirm2 >", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("bcu_confirm2 >=", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2LessThan(Boolean value) {
            addCriterion("bcu_confirm2 <", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2LessThanOrEqualTo(Boolean value) {
            addCriterion("bcu_confirm2 <=", value, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2In(List<Boolean> values) {
            addCriterion("bcu_confirm2 in", values, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2NotIn(List<Boolean> values) {
            addCriterion("bcu_confirm2 not in", values, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2Between(Boolean value1, Boolean value2) {
            addCriterion("bcu_confirm2 between", value1, value2, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andBcu_confirm2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("bcu_confirm2 not between", value1, value2, "bcu_confirm2");
            return (Criteria) this;
        }

        public Criteria andListuserphoneIsNull() {
            addCriterion("listuserphone is null");
            return (Criteria) this;
        }

        public Criteria andListuserphoneIsNotNull() {
            addCriterion("listuserphone is not null");
            return (Criteria) this;
        }

        public Criteria andListuserphoneEqualTo(String value) {
            addCriterion("listuserphone =", value, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListuserphoneNotEqualTo(String value) {
            addCriterion("listuserphone <>", value, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListuserphoneGreaterThan(String value) {
            addCriterion("listuserphone >", value, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListuserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("listuserphone >=", value, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListuserphoneLessThan(String value) {
            addCriterion("listuserphone <", value, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListuserphoneLessThanOrEqualTo(String value) {
            addCriterion("listuserphone <=", value, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListuserphoneLike(String value) {
            addCriterion("listuserphone like", value, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListuserphoneNotLike(String value) {
            addCriterion("listuserphone not like", value, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListuserphoneIn(List<String> values) {
            addCriterion("listuserphone in", values, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListuserphoneNotIn(List<String> values) {
            addCriterion("listuserphone not in", values, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListuserphoneBetween(String value1, String value2) {
            addCriterion("listuserphone between", value1, value2, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListuserphoneNotBetween(String value1, String value2) {
            addCriterion("listuserphone not between", value1, value2, "listuserphone");
            return (Criteria) this;
        }

        public Criteria andListusernameIsNull() {
            addCriterion("listusername is null");
            return (Criteria) this;
        }

        public Criteria andListusernameIsNotNull() {
            addCriterion("listusername is not null");
            return (Criteria) this;
        }

        public Criteria andListusernameEqualTo(String value) {
            addCriterion("listusername =", value, "listusername");
            return (Criteria) this;
        }

        public Criteria andListusernameNotEqualTo(String value) {
            addCriterion("listusername <>", value, "listusername");
            return (Criteria) this;
        }

        public Criteria andListusernameGreaterThan(String value) {
            addCriterion("listusername >", value, "listusername");
            return (Criteria) this;
        }

        public Criteria andListusernameGreaterThanOrEqualTo(String value) {
            addCriterion("listusername >=", value, "listusername");
            return (Criteria) this;
        }

        public Criteria andListusernameLessThan(String value) {
            addCriterion("listusername <", value, "listusername");
            return (Criteria) this;
        }

        public Criteria andListusernameLessThanOrEqualTo(String value) {
            addCriterion("listusername <=", value, "listusername");
            return (Criteria) this;
        }

        public Criteria andListusernameLike(String value) {
            addCriterion("listusername like", value, "listusername");
            return (Criteria) this;
        }

        public Criteria andListusernameNotLike(String value) {
            addCriterion("listusername not like", value, "listusername");
            return (Criteria) this;
        }

        public Criteria andListusernameIn(List<String> values) {
            addCriterion("listusername in", values, "listusername");
            return (Criteria) this;
        }

        public Criteria andListusernameNotIn(List<String> values) {
            addCriterion("listusername not in", values, "listusername");
            return (Criteria) this;
        }

        public Criteria andListusernameBetween(String value1, String value2) {
            addCriterion("listusername between", value1, value2, "listusername");
            return (Criteria) this;
        }

        public Criteria andListusernameNotBetween(String value1, String value2) {
            addCriterion("listusername not between", value1, value2, "listusername");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlIsNull() {
            addCriterion("listuserimageurl is null");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlIsNotNull() {
            addCriterion("listuserimageurl is not null");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlEqualTo(String value) {
            addCriterion("listuserimageurl =", value, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlNotEqualTo(String value) {
            addCriterion("listuserimageurl <>", value, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlGreaterThan(String value) {
            addCriterion("listuserimageurl >", value, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlGreaterThanOrEqualTo(String value) {
            addCriterion("listuserimageurl >=", value, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlLessThan(String value) {
            addCriterion("listuserimageurl <", value, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlLessThanOrEqualTo(String value) {
            addCriterion("listuserimageurl <=", value, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlLike(String value) {
            addCriterion("listuserimageurl like", value, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlNotLike(String value) {
            addCriterion("listuserimageurl not like", value, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlIn(List<String> values) {
            addCriterion("listuserimageurl in", values, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlNotIn(List<String> values) {
            addCriterion("listuserimageurl not in", values, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlBetween(String value1, String value2) {
            addCriterion("listuserimageurl between", value1, value2, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListuserimageurlNotBetween(String value1, String value2) {
            addCriterion("listuserimageurl not between", value1, value2, "listuserimageurl");
            return (Criteria) this;
        }

        public Criteria andListusersexIsNull() {
            addCriterion("listusersex is null");
            return (Criteria) this;
        }

        public Criteria andListusersexIsNotNull() {
            addCriterion("listusersex is not null");
            return (Criteria) this;
        }

        public Criteria andListusersexEqualTo(String value) {
            addCriterion("listusersex =", value, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListusersexNotEqualTo(String value) {
            addCriterion("listusersex <>", value, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListusersexGreaterThan(String value) {
            addCriterion("listusersex >", value, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListusersexGreaterThanOrEqualTo(String value) {
            addCriterion("listusersex >=", value, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListusersexLessThan(String value) {
            addCriterion("listusersex <", value, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListusersexLessThanOrEqualTo(String value) {
            addCriterion("listusersex <=", value, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListusersexLike(String value) {
            addCriterion("listusersex like", value, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListusersexNotLike(String value) {
            addCriterion("listusersex not like", value, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListusersexIn(List<String> values) {
            addCriterion("listusersex in", values, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListusersexNotIn(List<String> values) {
            addCriterion("listusersex not in", values, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListusersexBetween(String value1, String value2) {
            addCriterion("listusersex between", value1, value2, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListusersexNotBetween(String value1, String value2) {
            addCriterion("listusersex not between", value1, value2, "listusersex");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobIsNull() {
            addCriterion("listuserpersonjob is null");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobIsNotNull() {
            addCriterion("listuserpersonjob is not null");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobEqualTo(String value) {
            addCriterion("listuserpersonjob =", value, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobNotEqualTo(String value) {
            addCriterion("listuserpersonjob <>", value, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobGreaterThan(String value) {
            addCriterion("listuserpersonjob >", value, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobGreaterThanOrEqualTo(String value) {
            addCriterion("listuserpersonjob >=", value, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobLessThan(String value) {
            addCriterion("listuserpersonjob <", value, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobLessThanOrEqualTo(String value) {
            addCriterion("listuserpersonjob <=", value, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobLike(String value) {
            addCriterion("listuserpersonjob like", value, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobNotLike(String value) {
            addCriterion("listuserpersonjob not like", value, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobIn(List<String> values) {
            addCriterion("listuserpersonjob in", values, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobNotIn(List<String> values) {
            addCriterion("listuserpersonjob not in", values, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobBetween(String value1, String value2) {
            addCriterion("listuserpersonjob between", value1, value2, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonjobNotBetween(String value1, String value2) {
            addCriterion("listuserpersonjob not between", value1, value2, "listuserpersonjob");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorIsNull() {
            addCriterion("listuserpersonmajor is null");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorIsNotNull() {
            addCriterion("listuserpersonmajor is not null");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorEqualTo(String value) {
            addCriterion("listuserpersonmajor =", value, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorNotEqualTo(String value) {
            addCriterion("listuserpersonmajor <>", value, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorGreaterThan(String value) {
            addCriterion("listuserpersonmajor >", value, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorGreaterThanOrEqualTo(String value) {
            addCriterion("listuserpersonmajor >=", value, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorLessThan(String value) {
            addCriterion("listuserpersonmajor <", value, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorLessThanOrEqualTo(String value) {
            addCriterion("listuserpersonmajor <=", value, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorLike(String value) {
            addCriterion("listuserpersonmajor like", value, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorNotLike(String value) {
            addCriterion("listuserpersonmajor not like", value, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorIn(List<String> values) {
            addCriterion("listuserpersonmajor in", values, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorNotIn(List<String> values) {
            addCriterion("listuserpersonmajor not in", values, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorBetween(String value1, String value2) {
            addCriterion("listuserpersonmajor between", value1, value2, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonmajorNotBetween(String value1, String value2) {
            addCriterion("listuserpersonmajor not between", value1, value2, "listuserpersonmajor");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageIsNull() {
            addCriterion("listuserpersonworkage is null");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageIsNotNull() {
            addCriterion("listuserpersonworkage is not null");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageEqualTo(String value) {
            addCriterion("listuserpersonworkage =", value, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageNotEqualTo(String value) {
            addCriterion("listuserpersonworkage <>", value, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageGreaterThan(String value) {
            addCriterion("listuserpersonworkage >", value, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageGreaterThanOrEqualTo(String value) {
            addCriterion("listuserpersonworkage >=", value, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageLessThan(String value) {
            addCriterion("listuserpersonworkage <", value, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageLessThanOrEqualTo(String value) {
            addCriterion("listuserpersonworkage <=", value, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageLike(String value) {
            addCriterion("listuserpersonworkage like", value, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageNotLike(String value) {
            addCriterion("listuserpersonworkage not like", value, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageIn(List<String> values) {
            addCriterion("listuserpersonworkage in", values, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageNotIn(List<String> values) {
            addCriterion("listuserpersonworkage not in", values, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageBetween(String value1, String value2) {
            addCriterion("listuserpersonworkage between", value1, value2, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListuserpersonworkageNotBetween(String value1, String value2) {
            addCriterion("listuserpersonworkage not between", value1, value2, "listuserpersonworkage");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandIsNull() {
            addCriterion("listusercompanybrand is null");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandIsNotNull() {
            addCriterion("listusercompanybrand is not null");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandEqualTo(String value) {
            addCriterion("listusercompanybrand =", value, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandNotEqualTo(String value) {
            addCriterion("listusercompanybrand <>", value, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandGreaterThan(String value) {
            addCriterion("listusercompanybrand >", value, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandGreaterThanOrEqualTo(String value) {
            addCriterion("listusercompanybrand >=", value, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandLessThan(String value) {
            addCriterion("listusercompanybrand <", value, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandLessThanOrEqualTo(String value) {
            addCriterion("listusercompanybrand <=", value, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandLike(String value) {
            addCriterion("listusercompanybrand like", value, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandNotLike(String value) {
            addCriterion("listusercompanybrand not like", value, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandIn(List<String> values) {
            addCriterion("listusercompanybrand in", values, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandNotIn(List<String> values) {
            addCriterion("listusercompanybrand not in", values, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandBetween(String value1, String value2) {
            addCriterion("listusercompanybrand between", value1, value2, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanybrandNotBetween(String value1, String value2) {
            addCriterion("listusercompanybrand not between", value1, value2, "listusercompanybrand");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameIsNull() {
            addCriterion("listusercompanyname is null");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameIsNotNull() {
            addCriterion("listusercompanyname is not null");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameEqualTo(String value) {
            addCriterion("listusercompanyname =", value, "listusercompanyname");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameNotEqualTo(String value) {
            addCriterion("listusercompanyname <>", value, "listusercompanyname");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameGreaterThan(String value) {
            addCriterion("listusercompanyname >", value, "listusercompanyname");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("listusercompanyname >=", value, "listusercompanyname");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameLessThan(String value) {
            addCriterion("listusercompanyname <", value, "listusercompanyname");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameLessThanOrEqualTo(String value) {
            addCriterion("listusercompanyname <=", value, "listusercompanyname");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameLike(String value) {
            addCriterion("listusercompanyname like", value, "listusercompanyname");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameNotLike(String value) {
            addCriterion("listusercompanyname not like", value, "listusercompanyname");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameIn(List<String> values) {
            addCriterion("listusercompanyname in", values, "listusercompanyname");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameNotIn(List<String> values) {
            addCriterion("listusercompanyname not in", values, "listusercompanyname");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameBetween(String value1, String value2) {
            addCriterion("listusercompanyname between", value1, value2, "listusercompanyname");
            return (Criteria) this;
        }

        public Criteria andListusercompanynameNotBetween(String value1, String value2) {
            addCriterion("listusercompanyname not between", value1, value2, "listusercompanyname");
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