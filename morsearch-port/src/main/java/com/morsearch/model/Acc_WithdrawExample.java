package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Acc_WithdrawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Acc_WithdrawExample() {
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

        public Criteria andAw_idIsNull() {
            addCriterion("aw_id is null");
            return (Criteria) this;
        }

        public Criteria andAw_idIsNotNull() {
            addCriterion("aw_id is not null");
            return (Criteria) this;
        }

        public Criteria andAw_idEqualTo(Long value) {
            addCriterion("aw_id =", value, "aw_id");
            return (Criteria) this;
        }

        public Criteria andAw_idNotEqualTo(Long value) {
            addCriterion("aw_id <>", value, "aw_id");
            return (Criteria) this;
        }

        public Criteria andAw_idGreaterThan(Long value) {
            addCriterion("aw_id >", value, "aw_id");
            return (Criteria) this;
        }

        public Criteria andAw_idGreaterThanOrEqualTo(Long value) {
            addCriterion("aw_id >=", value, "aw_id");
            return (Criteria) this;
        }

        public Criteria andAw_idLessThan(Long value) {
            addCriterion("aw_id <", value, "aw_id");
            return (Criteria) this;
        }

        public Criteria andAw_idLessThanOrEqualTo(Long value) {
            addCriterion("aw_id <=", value, "aw_id");
            return (Criteria) this;
        }

        public Criteria andAw_idIn(List<Long> values) {
            addCriterion("aw_id in", values, "aw_id");
            return (Criteria) this;
        }

        public Criteria andAw_idNotIn(List<Long> values) {
            addCriterion("aw_id not in", values, "aw_id");
            return (Criteria) this;
        }

        public Criteria andAw_idBetween(Long value1, Long value2) {
            addCriterion("aw_id between", value1, value2, "aw_id");
            return (Criteria) this;
        }

        public Criteria andAw_idNotBetween(Long value1, Long value2) {
            addCriterion("aw_id not between", value1, value2, "aw_id");
            return (Criteria) this;
        }

        public Criteria andAw_noIsNull() {
            addCriterion("aw_no is null");
            return (Criteria) this;
        }

        public Criteria andAw_noIsNotNull() {
            addCriterion("aw_no is not null");
            return (Criteria) this;
        }

        public Criteria andAw_noEqualTo(String value) {
            addCriterion("aw_no =", value, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_noNotEqualTo(String value) {
            addCriterion("aw_no <>", value, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_noGreaterThan(String value) {
            addCriterion("aw_no >", value, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_noGreaterThanOrEqualTo(String value) {
            addCriterion("aw_no >=", value, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_noLessThan(String value) {
            addCriterion("aw_no <", value, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_noLessThanOrEqualTo(String value) {
            addCriterion("aw_no <=", value, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_noLike(String value) {
            addCriterion("aw_no like", value, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_noNotLike(String value) {
            addCriterion("aw_no not like", value, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_noIn(List<String> values) {
            addCriterion("aw_no in", values, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_noNotIn(List<String> values) {
            addCriterion("aw_no not in", values, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_noBetween(String value1, String value2) {
            addCriterion("aw_no between", value1, value2, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_noNotBetween(String value1, String value2) {
            addCriterion("aw_no not between", value1, value2, "aw_no");
            return (Criteria) this;
        }

        public Criteria andAw_accountIsNull() {
            addCriterion("aw_account is null");
            return (Criteria) this;
        }

        public Criteria andAw_accountIsNotNull() {
            addCriterion("aw_account is not null");
            return (Criteria) this;
        }

        public Criteria andAw_accountEqualTo(BigDecimal value) {
            addCriterion("aw_account =", value, "aw_account");
            return (Criteria) this;
        }

        public Criteria andAw_accountNotEqualTo(BigDecimal value) {
            addCriterion("aw_account <>", value, "aw_account");
            return (Criteria) this;
        }

        public Criteria andAw_accountGreaterThan(BigDecimal value) {
            addCriterion("aw_account >", value, "aw_account");
            return (Criteria) this;
        }

        public Criteria andAw_accountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aw_account >=", value, "aw_account");
            return (Criteria) this;
        }

        public Criteria andAw_accountLessThan(BigDecimal value) {
            addCriterion("aw_account <", value, "aw_account");
            return (Criteria) this;
        }

        public Criteria andAw_accountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("aw_account <=", value, "aw_account");
            return (Criteria) this;
        }

        public Criteria andAw_accountIn(List<BigDecimal> values) {
            addCriterion("aw_account in", values, "aw_account");
            return (Criteria) this;
        }

        public Criteria andAw_accountNotIn(List<BigDecimal> values) {
            addCriterion("aw_account not in", values, "aw_account");
            return (Criteria) this;
        }

        public Criteria andAw_accountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aw_account between", value1, value2, "aw_account");
            return (Criteria) this;
        }

        public Criteria andAw_accountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aw_account not between", value1, value2, "aw_account");
            return (Criteria) this;
        }

        public Criteria andAw_integralIsNull() {
            addCriterion("aw_integral is null");
            return (Criteria) this;
        }

        public Criteria andAw_integralIsNotNull() {
            addCriterion("aw_integral is not null");
            return (Criteria) this;
        }

        public Criteria andAw_integralEqualTo(BigDecimal value) {
            addCriterion("aw_integral =", value, "aw_integral");
            return (Criteria) this;
        }

        public Criteria andAw_integralNotEqualTo(BigDecimal value) {
            addCriterion("aw_integral <>", value, "aw_integral");
            return (Criteria) this;
        }

        public Criteria andAw_integralGreaterThan(BigDecimal value) {
            addCriterion("aw_integral >", value, "aw_integral");
            return (Criteria) this;
        }

        public Criteria andAw_integralGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aw_integral >=", value, "aw_integral");
            return (Criteria) this;
        }

        public Criteria andAw_integralLessThan(BigDecimal value) {
            addCriterion("aw_integral <", value, "aw_integral");
            return (Criteria) this;
        }

        public Criteria andAw_integralLessThanOrEqualTo(BigDecimal value) {
            addCriterion("aw_integral <=", value, "aw_integral");
            return (Criteria) this;
        }

        public Criteria andAw_integralIn(List<BigDecimal> values) {
            addCriterion("aw_integral in", values, "aw_integral");
            return (Criteria) this;
        }

        public Criteria andAw_integralNotIn(List<BigDecimal> values) {
            addCriterion("aw_integral not in", values, "aw_integral");
            return (Criteria) this;
        }

        public Criteria andAw_integralBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aw_integral between", value1, value2, "aw_integral");
            return (Criteria) this;
        }

        public Criteria andAw_integralNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aw_integral not between", value1, value2, "aw_integral");
            return (Criteria) this;
        }

        public Criteria andAw_userfullIsNull() {
            addCriterion("aw_userfull is null");
            return (Criteria) this;
        }

        public Criteria andAw_userfullIsNotNull() {
            addCriterion("aw_userfull is not null");
            return (Criteria) this;
        }

        public Criteria andAw_userfullEqualTo(String value) {
            addCriterion("aw_userfull =", value, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userfullNotEqualTo(String value) {
            addCriterion("aw_userfull <>", value, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userfullGreaterThan(String value) {
            addCriterion("aw_userfull >", value, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userfullGreaterThanOrEqualTo(String value) {
            addCriterion("aw_userfull >=", value, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userfullLessThan(String value) {
            addCriterion("aw_userfull <", value, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userfullLessThanOrEqualTo(String value) {
            addCriterion("aw_userfull <=", value, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userfullLike(String value) {
            addCriterion("aw_userfull like", value, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userfullNotLike(String value) {
            addCriterion("aw_userfull not like", value, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userfullIn(List<String> values) {
            addCriterion("aw_userfull in", values, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userfullNotIn(List<String> values) {
            addCriterion("aw_userfull not in", values, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userfullBetween(String value1, String value2) {
            addCriterion("aw_userfull between", value1, value2, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userfullNotBetween(String value1, String value2) {
            addCriterion("aw_userfull not between", value1, value2, "aw_userfull");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneIsNull() {
            addCriterion("aw_userphone is null");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneIsNotNull() {
            addCriterion("aw_userphone is not null");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneEqualTo(String value) {
            addCriterion("aw_userphone =", value, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneNotEqualTo(String value) {
            addCriterion("aw_userphone <>", value, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneGreaterThan(String value) {
            addCriterion("aw_userphone >", value, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneGreaterThanOrEqualTo(String value) {
            addCriterion("aw_userphone >=", value, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneLessThan(String value) {
            addCriterion("aw_userphone <", value, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneLessThanOrEqualTo(String value) {
            addCriterion("aw_userphone <=", value, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneLike(String value) {
            addCriterion("aw_userphone like", value, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneNotLike(String value) {
            addCriterion("aw_userphone not like", value, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneIn(List<String> values) {
            addCriterion("aw_userphone in", values, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneNotIn(List<String> values) {
            addCriterion("aw_userphone not in", values, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneBetween(String value1, String value2) {
            addCriterion("aw_userphone between", value1, value2, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userphoneNotBetween(String value1, String value2) {
            addCriterion("aw_userphone not between", value1, value2, "aw_userphone");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyIsNull() {
            addCriterion("aw_userverify is null");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyIsNotNull() {
            addCriterion("aw_userverify is not null");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyEqualTo(String value) {
            addCriterion("aw_userverify =", value, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyNotEqualTo(String value) {
            addCriterion("aw_userverify <>", value, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyGreaterThan(String value) {
            addCriterion("aw_userverify >", value, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyGreaterThanOrEqualTo(String value) {
            addCriterion("aw_userverify >=", value, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyLessThan(String value) {
            addCriterion("aw_userverify <", value, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyLessThanOrEqualTo(String value) {
            addCriterion("aw_userverify <=", value, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyLike(String value) {
            addCriterion("aw_userverify like", value, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyNotLike(String value) {
            addCriterion("aw_userverify not like", value, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyIn(List<String> values) {
            addCriterion("aw_userverify in", values, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyNotIn(List<String> values) {
            addCriterion("aw_userverify not in", values, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyBetween(String value1, String value2) {
            addCriterion("aw_userverify between", value1, value2, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_userverifyNotBetween(String value1, String value2) {
            addCriterion("aw_userverify not between", value1, value2, "aw_userverify");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeIsNull() {
            addCriterion("aw_typecode is null");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeIsNotNull() {
            addCriterion("aw_typecode is not null");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeEqualTo(String value) {
            addCriterion("aw_typecode =", value, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeNotEqualTo(String value) {
            addCriterion("aw_typecode <>", value, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeGreaterThan(String value) {
            addCriterion("aw_typecode >", value, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeGreaterThanOrEqualTo(String value) {
            addCriterion("aw_typecode >=", value, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeLessThan(String value) {
            addCriterion("aw_typecode <", value, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeLessThanOrEqualTo(String value) {
            addCriterion("aw_typecode <=", value, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeLike(String value) {
            addCriterion("aw_typecode like", value, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeNotLike(String value) {
            addCriterion("aw_typecode not like", value, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeIn(List<String> values) {
            addCriterion("aw_typecode in", values, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeNotIn(List<String> values) {
            addCriterion("aw_typecode not in", values, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeBetween(String value1, String value2) {
            addCriterion("aw_typecode between", value1, value2, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typecodeNotBetween(String value1, String value2) {
            addCriterion("aw_typecode not between", value1, value2, "aw_typecode");
            return (Criteria) this;
        }

        public Criteria andAw_typenameIsNull() {
            addCriterion("aw_typename is null");
            return (Criteria) this;
        }

        public Criteria andAw_typenameIsNotNull() {
            addCriterion("aw_typename is not null");
            return (Criteria) this;
        }

        public Criteria andAw_typenameEqualTo(String value) {
            addCriterion("aw_typename =", value, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_typenameNotEqualTo(String value) {
            addCriterion("aw_typename <>", value, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_typenameGreaterThan(String value) {
            addCriterion("aw_typename >", value, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_typenameGreaterThanOrEqualTo(String value) {
            addCriterion("aw_typename >=", value, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_typenameLessThan(String value) {
            addCriterion("aw_typename <", value, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_typenameLessThanOrEqualTo(String value) {
            addCriterion("aw_typename <=", value, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_typenameLike(String value) {
            addCriterion("aw_typename like", value, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_typenameNotLike(String value) {
            addCriterion("aw_typename not like", value, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_typenameIn(List<String> values) {
            addCriterion("aw_typename in", values, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_typenameNotIn(List<String> values) {
            addCriterion("aw_typename not in", values, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_typenameBetween(String value1, String value2) {
            addCriterion("aw_typename between", value1, value2, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_typenameNotBetween(String value1, String value2) {
            addCriterion("aw_typename not between", value1, value2, "aw_typename");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeIsNull() {
            addCriterion("aw_acctype is null");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeIsNotNull() {
            addCriterion("aw_acctype is not null");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeEqualTo(Byte value) {
            addCriterion("aw_acctype =", value, "aw_acctype");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeNotEqualTo(Byte value) {
            addCriterion("aw_acctype <>", value, "aw_acctype");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeGreaterThan(Byte value) {
            addCriterion("aw_acctype >", value, "aw_acctype");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("aw_acctype >=", value, "aw_acctype");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeLessThan(Byte value) {
            addCriterion("aw_acctype <", value, "aw_acctype");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeLessThanOrEqualTo(Byte value) {
            addCriterion("aw_acctype <=", value, "aw_acctype");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeIn(List<Byte> values) {
            addCriterion("aw_acctype in", values, "aw_acctype");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeNotIn(List<Byte> values) {
            addCriterion("aw_acctype not in", values, "aw_acctype");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeBetween(Byte value1, Byte value2) {
            addCriterion("aw_acctype between", value1, value2, "aw_acctype");
            return (Criteria) this;
        }

        public Criteria andAw_acctypeNotBetween(Byte value1, Byte value2) {
            addCriterion("aw_acctype not between", value1, value2, "aw_acctype");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinIsNull() {
            addCriterion("aw_accweixin is null");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinIsNotNull() {
            addCriterion("aw_accweixin is not null");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinEqualTo(String value) {
            addCriterion("aw_accweixin =", value, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinNotEqualTo(String value) {
            addCriterion("aw_accweixin <>", value, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinGreaterThan(String value) {
            addCriterion("aw_accweixin >", value, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinGreaterThanOrEqualTo(String value) {
            addCriterion("aw_accweixin >=", value, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinLessThan(String value) {
            addCriterion("aw_accweixin <", value, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinLessThanOrEqualTo(String value) {
            addCriterion("aw_accweixin <=", value, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinLike(String value) {
            addCriterion("aw_accweixin like", value, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinNotLike(String value) {
            addCriterion("aw_accweixin not like", value, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinIn(List<String> values) {
            addCriterion("aw_accweixin in", values, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinNotIn(List<String> values) {
            addCriterion("aw_accweixin not in", values, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinBetween(String value1, String value2) {
            addCriterion("aw_accweixin between", value1, value2, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accweixinNotBetween(String value1, String value2) {
            addCriterion("aw_accweixin not between", value1, value2, "aw_accweixin");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayIsNull() {
            addCriterion("aw_accalipay is null");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayIsNotNull() {
            addCriterion("aw_accalipay is not null");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayEqualTo(String value) {
            addCriterion("aw_accalipay =", value, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayNotEqualTo(String value) {
            addCriterion("aw_accalipay <>", value, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayGreaterThan(String value) {
            addCriterion("aw_accalipay >", value, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayGreaterThanOrEqualTo(String value) {
            addCriterion("aw_accalipay >=", value, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayLessThan(String value) {
            addCriterion("aw_accalipay <", value, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayLessThanOrEqualTo(String value) {
            addCriterion("aw_accalipay <=", value, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayLike(String value) {
            addCriterion("aw_accalipay like", value, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayNotLike(String value) {
            addCriterion("aw_accalipay not like", value, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayIn(List<String> values) {
            addCriterion("aw_accalipay in", values, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayNotIn(List<String> values) {
            addCriterion("aw_accalipay not in", values, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayBetween(String value1, String value2) {
            addCriterion("aw_accalipay between", value1, value2, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accalipayNotBetween(String value1, String value2) {
            addCriterion("aw_accalipay not between", value1, value2, "aw_accalipay");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameIsNull() {
            addCriterion("aw_accbankname is null");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameIsNotNull() {
            addCriterion("aw_accbankname is not null");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameEqualTo(String value) {
            addCriterion("aw_accbankname =", value, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameNotEqualTo(String value) {
            addCriterion("aw_accbankname <>", value, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameGreaterThan(String value) {
            addCriterion("aw_accbankname >", value, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("aw_accbankname >=", value, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameLessThan(String value) {
            addCriterion("aw_accbankname <", value, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameLessThanOrEqualTo(String value) {
            addCriterion("aw_accbankname <=", value, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameLike(String value) {
            addCriterion("aw_accbankname like", value, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameNotLike(String value) {
            addCriterion("aw_accbankname not like", value, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameIn(List<String> values) {
            addCriterion("aw_accbankname in", values, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameNotIn(List<String> values) {
            addCriterion("aw_accbankname not in", values, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameBetween(String value1, String value2) {
            addCriterion("aw_accbankname between", value1, value2, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbanknameNotBetween(String value1, String value2) {
            addCriterion("aw_accbankname not between", value1, value2, "aw_accbankname");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardIsNull() {
            addCriterion("aw_accbankcard is null");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardIsNotNull() {
            addCriterion("aw_accbankcard is not null");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardEqualTo(String value) {
            addCriterion("aw_accbankcard =", value, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardNotEqualTo(String value) {
            addCriterion("aw_accbankcard <>", value, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardGreaterThan(String value) {
            addCriterion("aw_accbankcard >", value, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardGreaterThanOrEqualTo(String value) {
            addCriterion("aw_accbankcard >=", value, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardLessThan(String value) {
            addCriterion("aw_accbankcard <", value, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardLessThanOrEqualTo(String value) {
            addCriterion("aw_accbankcard <=", value, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardLike(String value) {
            addCriterion("aw_accbankcard like", value, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardNotLike(String value) {
            addCriterion("aw_accbankcard not like", value, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardIn(List<String> values) {
            addCriterion("aw_accbankcard in", values, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardNotIn(List<String> values) {
            addCriterion("aw_accbankcard not in", values, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardBetween(String value1, String value2) {
            addCriterion("aw_accbankcard between", value1, value2, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_accbankcardNotBetween(String value1, String value2) {
            addCriterion("aw_accbankcard not between", value1, value2, "aw_accbankcard");
            return (Criteria) this;
        }

        public Criteria andAw_createidIsNull() {
            addCriterion("aw_createid is null");
            return (Criteria) this;
        }

        public Criteria andAw_createidIsNotNull() {
            addCriterion("aw_createid is not null");
            return (Criteria) this;
        }

        public Criteria andAw_createidEqualTo(Long value) {
            addCriterion("aw_createid =", value, "aw_createid");
            return (Criteria) this;
        }

        public Criteria andAw_createidNotEqualTo(Long value) {
            addCriterion("aw_createid <>", value, "aw_createid");
            return (Criteria) this;
        }

        public Criteria andAw_createidGreaterThan(Long value) {
            addCriterion("aw_createid >", value, "aw_createid");
            return (Criteria) this;
        }

        public Criteria andAw_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("aw_createid >=", value, "aw_createid");
            return (Criteria) this;
        }

        public Criteria andAw_createidLessThan(Long value) {
            addCriterion("aw_createid <", value, "aw_createid");
            return (Criteria) this;
        }

        public Criteria andAw_createidLessThanOrEqualTo(Long value) {
            addCriterion("aw_createid <=", value, "aw_createid");
            return (Criteria) this;
        }

        public Criteria andAw_createidIn(List<Long> values) {
            addCriterion("aw_createid in", values, "aw_createid");
            return (Criteria) this;
        }

        public Criteria andAw_createidNotIn(List<Long> values) {
            addCriterion("aw_createid not in", values, "aw_createid");
            return (Criteria) this;
        }

        public Criteria andAw_createidBetween(Long value1, Long value2) {
            addCriterion("aw_createid between", value1, value2, "aw_createid");
            return (Criteria) this;
        }

        public Criteria andAw_createidNotBetween(Long value1, Long value2) {
            addCriterion("aw_createid not between", value1, value2, "aw_createid");
            return (Criteria) this;
        }

        public Criteria andAw_createnoIsNull() {
            addCriterion("aw_createno is null");
            return (Criteria) this;
        }

        public Criteria andAw_createnoIsNotNull() {
            addCriterion("aw_createno is not null");
            return (Criteria) this;
        }

        public Criteria andAw_createnoEqualTo(String value) {
            addCriterion("aw_createno =", value, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createnoNotEqualTo(String value) {
            addCriterion("aw_createno <>", value, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createnoGreaterThan(String value) {
            addCriterion("aw_createno >", value, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("aw_createno >=", value, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createnoLessThan(String value) {
            addCriterion("aw_createno <", value, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createnoLessThanOrEqualTo(String value) {
            addCriterion("aw_createno <=", value, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createnoLike(String value) {
            addCriterion("aw_createno like", value, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createnoNotLike(String value) {
            addCriterion("aw_createno not like", value, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createnoIn(List<String> values) {
            addCriterion("aw_createno in", values, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createnoNotIn(List<String> values) {
            addCriterion("aw_createno not in", values, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createnoBetween(String value1, String value2) {
            addCriterion("aw_createno between", value1, value2, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createnoNotBetween(String value1, String value2) {
            addCriterion("aw_createno not between", value1, value2, "aw_createno");
            return (Criteria) this;
        }

        public Criteria andAw_createdateIsNull() {
            addCriterion("aw_createdate is null");
            return (Criteria) this;
        }

        public Criteria andAw_createdateIsNotNull() {
            addCriterion("aw_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andAw_createdateEqualTo(Date value) {
            addCriterion("aw_createdate =", value, "aw_createdate");
            return (Criteria) this;
        }

        public Criteria andAw_createdateNotEqualTo(Date value) {
            addCriterion("aw_createdate <>", value, "aw_createdate");
            return (Criteria) this;
        }

        public Criteria andAw_createdateGreaterThan(Date value) {
            addCriterion("aw_createdate >", value, "aw_createdate");
            return (Criteria) this;
        }

        public Criteria andAw_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("aw_createdate >=", value, "aw_createdate");
            return (Criteria) this;
        }

        public Criteria andAw_createdateLessThan(Date value) {
            addCriterion("aw_createdate <", value, "aw_createdate");
            return (Criteria) this;
        }

        public Criteria andAw_createdateLessThanOrEqualTo(Date value) {
            addCriterion("aw_createdate <=", value, "aw_createdate");
            return (Criteria) this;
        }

        public Criteria andAw_createdateIn(List<Date> values) {
            addCriterion("aw_createdate in", values, "aw_createdate");
            return (Criteria) this;
        }

        public Criteria andAw_createdateNotIn(List<Date> values) {
            addCriterion("aw_createdate not in", values, "aw_createdate");
            return (Criteria) this;
        }

        public Criteria andAw_createdateBetween(Date value1, Date value2) {
            addCriterion("aw_createdate between", value1, value2, "aw_createdate");
            return (Criteria) this;
        }

        public Criteria andAw_createdateNotBetween(Date value1, Date value2) {
            addCriterion("aw_createdate not between", value1, value2, "aw_createdate");
            return (Criteria) this;
        }

        public Criteria andAw_completedateIsNull() {
            addCriterion("aw_completedate is null");
            return (Criteria) this;
        }

        public Criteria andAw_completedateIsNotNull() {
            addCriterion("aw_completedate is not null");
            return (Criteria) this;
        }

        public Criteria andAw_completedateEqualTo(Date value) {
            addCriterion("aw_completedate =", value, "aw_completedate");
            return (Criteria) this;
        }

        public Criteria andAw_completedateNotEqualTo(Date value) {
            addCriterion("aw_completedate <>", value, "aw_completedate");
            return (Criteria) this;
        }

        public Criteria andAw_completedateGreaterThan(Date value) {
            addCriterion("aw_completedate >", value, "aw_completedate");
            return (Criteria) this;
        }

        public Criteria andAw_completedateGreaterThanOrEqualTo(Date value) {
            addCriterion("aw_completedate >=", value, "aw_completedate");
            return (Criteria) this;
        }

        public Criteria andAw_completedateLessThan(Date value) {
            addCriterion("aw_completedate <", value, "aw_completedate");
            return (Criteria) this;
        }

        public Criteria andAw_completedateLessThanOrEqualTo(Date value) {
            addCriterion("aw_completedate <=", value, "aw_completedate");
            return (Criteria) this;
        }

        public Criteria andAw_completedateIn(List<Date> values) {
            addCriterion("aw_completedate in", values, "aw_completedate");
            return (Criteria) this;
        }

        public Criteria andAw_completedateNotIn(List<Date> values) {
            addCriterion("aw_completedate not in", values, "aw_completedate");
            return (Criteria) this;
        }

        public Criteria andAw_completedateBetween(Date value1, Date value2) {
            addCriterion("aw_completedate between", value1, value2, "aw_completedate");
            return (Criteria) this;
        }

        public Criteria andAw_completedateNotBetween(Date value1, Date value2) {
            addCriterion("aw_completedate not between", value1, value2, "aw_completedate");
            return (Criteria) this;
        }

        public Criteria andAw_statusIsNull() {
            addCriterion("aw_status is null");
            return (Criteria) this;
        }

        public Criteria andAw_statusIsNotNull() {
            addCriterion("aw_status is not null");
            return (Criteria) this;
        }

        public Criteria andAw_statusEqualTo(Byte value) {
            addCriterion("aw_status =", value, "aw_status");
            return (Criteria) this;
        }

        public Criteria andAw_statusNotEqualTo(Byte value) {
            addCriterion("aw_status <>", value, "aw_status");
            return (Criteria) this;
        }

        public Criteria andAw_statusGreaterThan(Byte value) {
            addCriterion("aw_status >", value, "aw_status");
            return (Criteria) this;
        }

        public Criteria andAw_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("aw_status >=", value, "aw_status");
            return (Criteria) this;
        }

        public Criteria andAw_statusLessThan(Byte value) {
            addCriterion("aw_status <", value, "aw_status");
            return (Criteria) this;
        }

        public Criteria andAw_statusLessThanOrEqualTo(Byte value) {
            addCriterion("aw_status <=", value, "aw_status");
            return (Criteria) this;
        }

        public Criteria andAw_statusIn(List<Byte> values) {
            addCriterion("aw_status in", values, "aw_status");
            return (Criteria) this;
        }

        public Criteria andAw_statusNotIn(List<Byte> values) {
            addCriterion("aw_status not in", values, "aw_status");
            return (Criteria) this;
        }

        public Criteria andAw_statusBetween(Byte value1, Byte value2) {
            addCriterion("aw_status between", value1, value2, "aw_status");
            return (Criteria) this;
        }

        public Criteria andAw_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("aw_status not between", value1, value2, "aw_status");
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