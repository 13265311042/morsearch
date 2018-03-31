package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Acc_AdditionalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Acc_AdditionalExample() {
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

        public Criteria andAa_idIsNull() {
            addCriterion("aa_id is null");
            return (Criteria) this;
        }

        public Criteria andAa_idIsNotNull() {
            addCriterion("aa_id is not null");
            return (Criteria) this;
        }

        public Criteria andAa_idEqualTo(Long value) {
            addCriterion("aa_id =", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idNotEqualTo(Long value) {
            addCriterion("aa_id <>", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idGreaterThan(Long value) {
            addCriterion("aa_id >", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idGreaterThanOrEqualTo(Long value) {
            addCriterion("aa_id >=", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idLessThan(Long value) {
            addCriterion("aa_id <", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idLessThanOrEqualTo(Long value) {
            addCriterion("aa_id <=", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idIn(List<Long> values) {
            addCriterion("aa_id in", values, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idNotIn(List<Long> values) {
            addCriterion("aa_id not in", values, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idBetween(Long value1, Long value2) {
            addCriterion("aa_id between", value1, value2, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idNotBetween(Long value1, Long value2) {
            addCriterion("aa_id not between", value1, value2, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_noIsNull() {
            addCriterion("aa_no is null");
            return (Criteria) this;
        }

        public Criteria andAa_noIsNotNull() {
            addCriterion("aa_no is not null");
            return (Criteria) this;
        }

        public Criteria andAa_noEqualTo(String value) {
            addCriterion("aa_no =", value, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_noNotEqualTo(String value) {
            addCriterion("aa_no <>", value, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_noGreaterThan(String value) {
            addCriterion("aa_no >", value, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_noGreaterThanOrEqualTo(String value) {
            addCriterion("aa_no >=", value, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_noLessThan(String value) {
            addCriterion("aa_no <", value, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_noLessThanOrEqualTo(String value) {
            addCriterion("aa_no <=", value, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_noLike(String value) {
            addCriterion("aa_no like", value, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_noNotLike(String value) {
            addCriterion("aa_no not like", value, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_noIn(List<String> values) {
            addCriterion("aa_no in", values, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_noNotIn(List<String> values) {
            addCriterion("aa_no not in", values, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_noBetween(String value1, String value2) {
            addCriterion("aa_no between", value1, value2, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_noNotBetween(String value1, String value2) {
            addCriterion("aa_no not between", value1, value2, "aa_no");
            return (Criteria) this;
        }

        public Criteria andAa_typeIsNull() {
            addCriterion("aa_type is null");
            return (Criteria) this;
        }

        public Criteria andAa_typeIsNotNull() {
            addCriterion("aa_type is not null");
            return (Criteria) this;
        }

        public Criteria andAa_typeEqualTo(Short value) {
            addCriterion("aa_type =", value, "aa_type");
            return (Criteria) this;
        }

        public Criteria andAa_typeNotEqualTo(Short value) {
            addCriterion("aa_type <>", value, "aa_type");
            return (Criteria) this;
        }

        public Criteria andAa_typeGreaterThan(Short value) {
            addCriterion("aa_type >", value, "aa_type");
            return (Criteria) this;
        }

        public Criteria andAa_typeGreaterThanOrEqualTo(Short value) {
            addCriterion("aa_type >=", value, "aa_type");
            return (Criteria) this;
        }

        public Criteria andAa_typeLessThan(Short value) {
            addCriterion("aa_type <", value, "aa_type");
            return (Criteria) this;
        }

        public Criteria andAa_typeLessThanOrEqualTo(Short value) {
            addCriterion("aa_type <=", value, "aa_type");
            return (Criteria) this;
        }

        public Criteria andAa_typeIn(List<Short> values) {
            addCriterion("aa_type in", values, "aa_type");
            return (Criteria) this;
        }

        public Criteria andAa_typeNotIn(List<Short> values) {
            addCriterion("aa_type not in", values, "aa_type");
            return (Criteria) this;
        }

        public Criteria andAa_typeBetween(Short value1, Short value2) {
            addCriterion("aa_type between", value1, value2, "aa_type");
            return (Criteria) this;
        }

        public Criteria andAa_typeNotBetween(Short value1, Short value2) {
            addCriterion("aa_type not between", value1, value2, "aa_type");
            return (Criteria) this;
        }

        public Criteria andAa_useridIsNull() {
            addCriterion("aa_userid is null");
            return (Criteria) this;
        }

        public Criteria andAa_useridIsNotNull() {
            addCriterion("aa_userid is not null");
            return (Criteria) this;
        }

        public Criteria andAa_useridEqualTo(Long value) {
            addCriterion("aa_userid =", value, "aa_userid");
            return (Criteria) this;
        }

        public Criteria andAa_useridNotEqualTo(Long value) {
            addCriterion("aa_userid <>", value, "aa_userid");
            return (Criteria) this;
        }

        public Criteria andAa_useridGreaterThan(Long value) {
            addCriterion("aa_userid >", value, "aa_userid");
            return (Criteria) this;
        }

        public Criteria andAa_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("aa_userid >=", value, "aa_userid");
            return (Criteria) this;
        }

        public Criteria andAa_useridLessThan(Long value) {
            addCriterion("aa_userid <", value, "aa_userid");
            return (Criteria) this;
        }

        public Criteria andAa_useridLessThanOrEqualTo(Long value) {
            addCriterion("aa_userid <=", value, "aa_userid");
            return (Criteria) this;
        }

        public Criteria andAa_useridIn(List<Long> values) {
            addCriterion("aa_userid in", values, "aa_userid");
            return (Criteria) this;
        }

        public Criteria andAa_useridNotIn(List<Long> values) {
            addCriterion("aa_userid not in", values, "aa_userid");
            return (Criteria) this;
        }

        public Criteria andAa_useridBetween(Long value1, Long value2) {
            addCriterion("aa_userid between", value1, value2, "aa_userid");
            return (Criteria) this;
        }

        public Criteria andAa_useridNotBetween(Long value1, Long value2) {
            addCriterion("aa_userid not between", value1, value2, "aa_userid");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountIsNull() {
            addCriterion("aa_useraccount is null");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountIsNotNull() {
            addCriterion("aa_useraccount is not null");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountEqualTo(String value) {
            addCriterion("aa_useraccount =", value, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountNotEqualTo(String value) {
            addCriterion("aa_useraccount <>", value, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountGreaterThan(String value) {
            addCriterion("aa_useraccount >", value, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountGreaterThanOrEqualTo(String value) {
            addCriterion("aa_useraccount >=", value, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountLessThan(String value) {
            addCriterion("aa_useraccount <", value, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountLessThanOrEqualTo(String value) {
            addCriterion("aa_useraccount <=", value, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountLike(String value) {
            addCriterion("aa_useraccount like", value, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountNotLike(String value) {
            addCriterion("aa_useraccount not like", value, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountIn(List<String> values) {
            addCriterion("aa_useraccount in", values, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountNotIn(List<String> values) {
            addCriterion("aa_useraccount not in", values, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountBetween(String value1, String value2) {
            addCriterion("aa_useraccount between", value1, value2, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_useraccountNotBetween(String value1, String value2) {
            addCriterion("aa_useraccount not between", value1, value2, "aa_useraccount");
            return (Criteria) this;
        }

        public Criteria andAa_usernameIsNull() {
            addCriterion("aa_username is null");
            return (Criteria) this;
        }

        public Criteria andAa_usernameIsNotNull() {
            addCriterion("aa_username is not null");
            return (Criteria) this;
        }

        public Criteria andAa_usernameEqualTo(String value) {
            addCriterion("aa_username =", value, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_usernameNotEqualTo(String value) {
            addCriterion("aa_username <>", value, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_usernameGreaterThan(String value) {
            addCriterion("aa_username >", value, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("aa_username >=", value, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_usernameLessThan(String value) {
            addCriterion("aa_username <", value, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_usernameLessThanOrEqualTo(String value) {
            addCriterion("aa_username <=", value, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_usernameLike(String value) {
            addCriterion("aa_username like", value, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_usernameNotLike(String value) {
            addCriterion("aa_username not like", value, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_usernameIn(List<String> values) {
            addCriterion("aa_username in", values, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_usernameNotIn(List<String> values) {
            addCriterion("aa_username not in", values, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_usernameBetween(String value1, String value2) {
            addCriterion("aa_username between", value1, value2, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_usernameNotBetween(String value1, String value2) {
            addCriterion("aa_username not between", value1, value2, "aa_username");
            return (Criteria) this;
        }

        public Criteria andAa_accountIsNull() {
            addCriterion("aa_account is null");
            return (Criteria) this;
        }

        public Criteria andAa_accountIsNotNull() {
            addCriterion("aa_account is not null");
            return (Criteria) this;
        }

        public Criteria andAa_accountEqualTo(BigDecimal value) {
            addCriterion("aa_account =", value, "aa_account");
            return (Criteria) this;
        }

        public Criteria andAa_accountNotEqualTo(BigDecimal value) {
            addCriterion("aa_account <>", value, "aa_account");
            return (Criteria) this;
        }

        public Criteria andAa_accountGreaterThan(BigDecimal value) {
            addCriterion("aa_account >", value, "aa_account");
            return (Criteria) this;
        }

        public Criteria andAa_accountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aa_account >=", value, "aa_account");
            return (Criteria) this;
        }

        public Criteria andAa_accountLessThan(BigDecimal value) {
            addCriterion("aa_account <", value, "aa_account");
            return (Criteria) this;
        }

        public Criteria andAa_accountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("aa_account <=", value, "aa_account");
            return (Criteria) this;
        }

        public Criteria andAa_accountIn(List<BigDecimal> values) {
            addCriterion("aa_account in", values, "aa_account");
            return (Criteria) this;
        }

        public Criteria andAa_accountNotIn(List<BigDecimal> values) {
            addCriterion("aa_account not in", values, "aa_account");
            return (Criteria) this;
        }

        public Criteria andAa_accountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aa_account between", value1, value2, "aa_account");
            return (Criteria) this;
        }

        public Criteria andAa_accountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aa_account not between", value1, value2, "aa_account");
            return (Criteria) this;
        }

        public Criteria andAa_integralIsNull() {
            addCriterion("aa_integral is null");
            return (Criteria) this;
        }

        public Criteria andAa_integralIsNotNull() {
            addCriterion("aa_integral is not null");
            return (Criteria) this;
        }

        public Criteria andAa_integralEqualTo(BigDecimal value) {
            addCriterion("aa_integral =", value, "aa_integral");
            return (Criteria) this;
        }

        public Criteria andAa_integralNotEqualTo(BigDecimal value) {
            addCriterion("aa_integral <>", value, "aa_integral");
            return (Criteria) this;
        }

        public Criteria andAa_integralGreaterThan(BigDecimal value) {
            addCriterion("aa_integral >", value, "aa_integral");
            return (Criteria) this;
        }

        public Criteria andAa_integralGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aa_integral >=", value, "aa_integral");
            return (Criteria) this;
        }

        public Criteria andAa_integralLessThan(BigDecimal value) {
            addCriterion("aa_integral <", value, "aa_integral");
            return (Criteria) this;
        }

        public Criteria andAa_integralLessThanOrEqualTo(BigDecimal value) {
            addCriterion("aa_integral <=", value, "aa_integral");
            return (Criteria) this;
        }

        public Criteria andAa_integralIn(List<BigDecimal> values) {
            addCriterion("aa_integral in", values, "aa_integral");
            return (Criteria) this;
        }

        public Criteria andAa_integralNotIn(List<BigDecimal> values) {
            addCriterion("aa_integral not in", values, "aa_integral");
            return (Criteria) this;
        }

        public Criteria andAa_integralBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aa_integral between", value1, value2, "aa_integral");
            return (Criteria) this;
        }

        public Criteria andAa_integralNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aa_integral not between", value1, value2, "aa_integral");
            return (Criteria) this;
        }

        public Criteria andAa_createnoIsNull() {
            addCriterion("aa_createno is null");
            return (Criteria) this;
        }

        public Criteria andAa_createnoIsNotNull() {
            addCriterion("aa_createno is not null");
            return (Criteria) this;
        }

        public Criteria andAa_createnoEqualTo(String value) {
            addCriterion("aa_createno =", value, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnoNotEqualTo(String value) {
            addCriterion("aa_createno <>", value, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnoGreaterThan(String value) {
            addCriterion("aa_createno >", value, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("aa_createno >=", value, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnoLessThan(String value) {
            addCriterion("aa_createno <", value, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnoLessThanOrEqualTo(String value) {
            addCriterion("aa_createno <=", value, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnoLike(String value) {
            addCriterion("aa_createno like", value, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnoNotLike(String value) {
            addCriterion("aa_createno not like", value, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnoIn(List<String> values) {
            addCriterion("aa_createno in", values, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnoNotIn(List<String> values) {
            addCriterion("aa_createno not in", values, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnoBetween(String value1, String value2) {
            addCriterion("aa_createno between", value1, value2, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnoNotBetween(String value1, String value2) {
            addCriterion("aa_createno not between", value1, value2, "aa_createno");
            return (Criteria) this;
        }

        public Criteria andAa_createnameIsNull() {
            addCriterion("aa_createname is null");
            return (Criteria) this;
        }

        public Criteria andAa_createnameIsNotNull() {
            addCriterion("aa_createname is not null");
            return (Criteria) this;
        }

        public Criteria andAa_createnameEqualTo(String value) {
            addCriterion("aa_createname =", value, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createnameNotEqualTo(String value) {
            addCriterion("aa_createname <>", value, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createnameGreaterThan(String value) {
            addCriterion("aa_createname >", value, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createnameGreaterThanOrEqualTo(String value) {
            addCriterion("aa_createname >=", value, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createnameLessThan(String value) {
            addCriterion("aa_createname <", value, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createnameLessThanOrEqualTo(String value) {
            addCriterion("aa_createname <=", value, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createnameLike(String value) {
            addCriterion("aa_createname like", value, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createnameNotLike(String value) {
            addCriterion("aa_createname not like", value, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createnameIn(List<String> values) {
            addCriterion("aa_createname in", values, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createnameNotIn(List<String> values) {
            addCriterion("aa_createname not in", values, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createnameBetween(String value1, String value2) {
            addCriterion("aa_createname between", value1, value2, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createnameNotBetween(String value1, String value2) {
            addCriterion("aa_createname not between", value1, value2, "aa_createname");
            return (Criteria) this;
        }

        public Criteria andAa_createdateIsNull() {
            addCriterion("aa_createdate is null");
            return (Criteria) this;
        }

        public Criteria andAa_createdateIsNotNull() {
            addCriterion("aa_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andAa_createdateEqualTo(Date value) {
            addCriterion("aa_createdate =", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateNotEqualTo(Date value) {
            addCriterion("aa_createdate <>", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateGreaterThan(Date value) {
            addCriterion("aa_createdate >", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("aa_createdate >=", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateLessThan(Date value) {
            addCriterion("aa_createdate <", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateLessThanOrEqualTo(Date value) {
            addCriterion("aa_createdate <=", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateIn(List<Date> values) {
            addCriterion("aa_createdate in", values, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateNotIn(List<Date> values) {
            addCriterion("aa_createdate not in", values, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateBetween(Date value1, Date value2) {
            addCriterion("aa_createdate between", value1, value2, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateNotBetween(Date value1, Date value2) {
            addCriterion("aa_createdate not between", value1, value2, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoIsNull() {
            addCriterion("aa_confirmno is null");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoIsNotNull() {
            addCriterion("aa_confirmno is not null");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoEqualTo(String value) {
            addCriterion("aa_confirmno =", value, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoNotEqualTo(String value) {
            addCriterion("aa_confirmno <>", value, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoGreaterThan(String value) {
            addCriterion("aa_confirmno >", value, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("aa_confirmno >=", value, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoLessThan(String value) {
            addCriterion("aa_confirmno <", value, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoLessThanOrEqualTo(String value) {
            addCriterion("aa_confirmno <=", value, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoLike(String value) {
            addCriterion("aa_confirmno like", value, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoNotLike(String value) {
            addCriterion("aa_confirmno not like", value, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoIn(List<String> values) {
            addCriterion("aa_confirmno in", values, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoNotIn(List<String> values) {
            addCriterion("aa_confirmno not in", values, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoBetween(String value1, String value2) {
            addCriterion("aa_confirmno between", value1, value2, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnoNotBetween(String value1, String value2) {
            addCriterion("aa_confirmno not between", value1, value2, "aa_confirmno");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameIsNull() {
            addCriterion("aa_confirmname is null");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameIsNotNull() {
            addCriterion("aa_confirmname is not null");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameEqualTo(String value) {
            addCriterion("aa_confirmname =", value, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameNotEqualTo(String value) {
            addCriterion("aa_confirmname <>", value, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameGreaterThan(String value) {
            addCriterion("aa_confirmname >", value, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameGreaterThanOrEqualTo(String value) {
            addCriterion("aa_confirmname >=", value, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameLessThan(String value) {
            addCriterion("aa_confirmname <", value, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameLessThanOrEqualTo(String value) {
            addCriterion("aa_confirmname <=", value, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameLike(String value) {
            addCriterion("aa_confirmname like", value, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameNotLike(String value) {
            addCriterion("aa_confirmname not like", value, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameIn(List<String> values) {
            addCriterion("aa_confirmname in", values, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameNotIn(List<String> values) {
            addCriterion("aa_confirmname not in", values, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameBetween(String value1, String value2) {
            addCriterion("aa_confirmname between", value1, value2, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmnameNotBetween(String value1, String value2) {
            addCriterion("aa_confirmname not between", value1, value2, "aa_confirmname");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateIsNull() {
            addCriterion("aa_confirmdate is null");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateIsNotNull() {
            addCriterion("aa_confirmdate is not null");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateEqualTo(Date value) {
            addCriterion("aa_confirmdate =", value, "aa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateNotEqualTo(Date value) {
            addCriterion("aa_confirmdate <>", value, "aa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateGreaterThan(Date value) {
            addCriterion("aa_confirmdate >", value, "aa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("aa_confirmdate >=", value, "aa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateLessThan(Date value) {
            addCriterion("aa_confirmdate <", value, "aa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateLessThanOrEqualTo(Date value) {
            addCriterion("aa_confirmdate <=", value, "aa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateIn(List<Date> values) {
            addCriterion("aa_confirmdate in", values, "aa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateNotIn(List<Date> values) {
            addCriterion("aa_confirmdate not in", values, "aa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateBetween(Date value1, Date value2) {
            addCriterion("aa_confirmdate between", value1, value2, "aa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andAa_confirmdateNotBetween(Date value1, Date value2) {
            addCriterion("aa_confirmdate not between", value1, value2, "aa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andAa_statusIsNull() {
            addCriterion("aa_status is null");
            return (Criteria) this;
        }

        public Criteria andAa_statusIsNotNull() {
            addCriterion("aa_status is not null");
            return (Criteria) this;
        }

        public Criteria andAa_statusEqualTo(Short value) {
            addCriterion("aa_status =", value, "aa_status");
            return (Criteria) this;
        }

        public Criteria andAa_statusNotEqualTo(Short value) {
            addCriterion("aa_status <>", value, "aa_status");
            return (Criteria) this;
        }

        public Criteria andAa_statusGreaterThan(Short value) {
            addCriterion("aa_status >", value, "aa_status");
            return (Criteria) this;
        }

        public Criteria andAa_statusGreaterThanOrEqualTo(Short value) {
            addCriterion("aa_status >=", value, "aa_status");
            return (Criteria) this;
        }

        public Criteria andAa_statusLessThan(Short value) {
            addCriterion("aa_status <", value, "aa_status");
            return (Criteria) this;
        }

        public Criteria andAa_statusLessThanOrEqualTo(Short value) {
            addCriterion("aa_status <=", value, "aa_status");
            return (Criteria) this;
        }

        public Criteria andAa_statusIn(List<Short> values) {
            addCriterion("aa_status in", values, "aa_status");
            return (Criteria) this;
        }

        public Criteria andAa_statusNotIn(List<Short> values) {
            addCriterion("aa_status not in", values, "aa_status");
            return (Criteria) this;
        }

        public Criteria andAa_statusBetween(Short value1, Short value2) {
            addCriterion("aa_status between", value1, value2, "aa_status");
            return (Criteria) this;
        }

        public Criteria andAa_statusNotBetween(Short value1, Short value2) {
            addCriterion("aa_status not between", value1, value2, "aa_status");
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