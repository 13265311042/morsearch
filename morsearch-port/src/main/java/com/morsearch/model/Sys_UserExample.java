package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sys_UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_UserExample() {
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

        public Criteria andUr_idIsNull() {
            addCriterion("ur_id is null");
            return (Criteria) this;
        }

        public Criteria andUr_idIsNotNull() {
            addCriterion("ur_id is not null");
            return (Criteria) this;
        }

        public Criteria andUr_idEqualTo(Long value) {
            addCriterion("ur_id =", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idNotEqualTo(Long value) {
            addCriterion("ur_id <>", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idGreaterThan(Long value) {
            addCriterion("ur_id >", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ur_id >=", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idLessThan(Long value) {
            addCriterion("ur_id <", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idLessThanOrEqualTo(Long value) {
            addCriterion("ur_id <=", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idIn(List<Long> values) {
            addCriterion("ur_id in", values, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idNotIn(List<Long> values) {
            addCriterion("ur_id not in", values, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idBetween(Long value1, Long value2) {
            addCriterion("ur_id between", value1, value2, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idNotBetween(Long value1, Long value2) {
            addCriterion("ur_id not between", value1, value2, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_noIsNull() {
            addCriterion("ur_no is null");
            return (Criteria) this;
        }

        public Criteria andUr_noIsNotNull() {
            addCriterion("ur_no is not null");
            return (Criteria) this;
        }

        public Criteria andUr_noEqualTo(String value) {
            addCriterion("ur_no =", value, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_noNotEqualTo(String value) {
            addCriterion("ur_no <>", value, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_noGreaterThan(String value) {
            addCriterion("ur_no >", value, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_noGreaterThanOrEqualTo(String value) {
            addCriterion("ur_no >=", value, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_noLessThan(String value) {
            addCriterion("ur_no <", value, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_noLessThanOrEqualTo(String value) {
            addCriterion("ur_no <=", value, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_noLike(String value) {
            addCriterion("ur_no like", value, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_noNotLike(String value) {
            addCriterion("ur_no not like", value, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_noIn(List<String> values) {
            addCriterion("ur_no in", values, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_noNotIn(List<String> values) {
            addCriterion("ur_no not in", values, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_noBetween(String value1, String value2) {
            addCriterion("ur_no between", value1, value2, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_noNotBetween(String value1, String value2) {
            addCriterion("ur_no not between", value1, value2, "ur_no");
            return (Criteria) this;
        }

        public Criteria andUr_phoneIsNull() {
            addCriterion("ur_phone is null");
            return (Criteria) this;
        }

        public Criteria andUr_phoneIsNotNull() {
            addCriterion("ur_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUr_phoneEqualTo(String value) {
            addCriterion("ur_phone =", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneNotEqualTo(String value) {
            addCriterion("ur_phone <>", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneGreaterThan(String value) {
            addCriterion("ur_phone >", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("ur_phone >=", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneLessThan(String value) {
            addCriterion("ur_phone <", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneLessThanOrEqualTo(String value) {
            addCriterion("ur_phone <=", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneLike(String value) {
            addCriterion("ur_phone like", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneNotLike(String value) {
            addCriterion("ur_phone not like", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneIn(List<String> values) {
            addCriterion("ur_phone in", values, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneNotIn(List<String> values) {
            addCriterion("ur_phone not in", values, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneBetween(String value1, String value2) {
            addCriterion("ur_phone between", value1, value2, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneNotBetween(String value1, String value2) {
            addCriterion("ur_phone not between", value1, value2, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_emailIsNull() {
            addCriterion("ur_email is null");
            return (Criteria) this;
        }

        public Criteria andUr_emailIsNotNull() {
            addCriterion("ur_email is not null");
            return (Criteria) this;
        }

        public Criteria andUr_emailEqualTo(String value) {
            addCriterion("ur_email =", value, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_emailNotEqualTo(String value) {
            addCriterion("ur_email <>", value, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_emailGreaterThan(String value) {
            addCriterion("ur_email >", value, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_emailGreaterThanOrEqualTo(String value) {
            addCriterion("ur_email >=", value, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_emailLessThan(String value) {
            addCriterion("ur_email <", value, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_emailLessThanOrEqualTo(String value) {
            addCriterion("ur_email <=", value, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_emailLike(String value) {
            addCriterion("ur_email like", value, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_emailNotLike(String value) {
            addCriterion("ur_email not like", value, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_emailIn(List<String> values) {
            addCriterion("ur_email in", values, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_emailNotIn(List<String> values) {
            addCriterion("ur_email not in", values, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_emailBetween(String value1, String value2) {
            addCriterion("ur_email between", value1, value2, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_emailNotBetween(String value1, String value2) {
            addCriterion("ur_email not between", value1, value2, "ur_email");
            return (Criteria) this;
        }

        public Criteria andUr_tokenIsNull() {
            addCriterion("ur_token is null");
            return (Criteria) this;
        }

        public Criteria andUr_tokenIsNotNull() {
            addCriterion("ur_token is not null");
            return (Criteria) this;
        }

        public Criteria andUr_tokenEqualTo(String value) {
            addCriterion("ur_token =", value, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_tokenNotEqualTo(String value) {
            addCriterion("ur_token <>", value, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_tokenGreaterThan(String value) {
            addCriterion("ur_token >", value, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_tokenGreaterThanOrEqualTo(String value) {
            addCriterion("ur_token >=", value, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_tokenLessThan(String value) {
            addCriterion("ur_token <", value, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_tokenLessThanOrEqualTo(String value) {
            addCriterion("ur_token <=", value, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_tokenLike(String value) {
            addCriterion("ur_token like", value, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_tokenNotLike(String value) {
            addCriterion("ur_token not like", value, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_tokenIn(List<String> values) {
            addCriterion("ur_token in", values, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_tokenNotIn(List<String> values) {
            addCriterion("ur_token not in", values, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_tokenBetween(String value1, String value2) {
            addCriterion("ur_token between", value1, value2, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_tokenNotBetween(String value1, String value2) {
            addCriterion("ur_token not between", value1, value2, "ur_token");
            return (Criteria) this;
        }

        public Criteria andUr_passwordIsNull() {
            addCriterion("ur_password is null");
            return (Criteria) this;
        }

        public Criteria andUr_passwordIsNotNull() {
            addCriterion("ur_password is not null");
            return (Criteria) this;
        }

        public Criteria andUr_passwordEqualTo(String value) {
            addCriterion("ur_password =", value, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_passwordNotEqualTo(String value) {
            addCriterion("ur_password <>", value, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_passwordGreaterThan(String value) {
            addCriterion("ur_password >", value, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("ur_password >=", value, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_passwordLessThan(String value) {
            addCriterion("ur_password <", value, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_passwordLessThanOrEqualTo(String value) {
            addCriterion("ur_password <=", value, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_passwordLike(String value) {
            addCriterion("ur_password like", value, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_passwordNotLike(String value) {
            addCriterion("ur_password not like", value, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_passwordIn(List<String> values) {
            addCriterion("ur_password in", values, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_passwordNotIn(List<String> values) {
            addCriterion("ur_password not in", values, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_passwordBetween(String value1, String value2) {
            addCriterion("ur_password between", value1, value2, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_passwordNotBetween(String value1, String value2) {
            addCriterion("ur_password not between", value1, value2, "ur_password");
            return (Criteria) this;
        }

        public Criteria andUr_namenickIsNull() {
            addCriterion("ur_namenick is null");
            return (Criteria) this;
        }

        public Criteria andUr_namenickIsNotNull() {
            addCriterion("ur_namenick is not null");
            return (Criteria) this;
        }

        public Criteria andUr_namenickEqualTo(String value) {
            addCriterion("ur_namenick =", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickNotEqualTo(String value) {
            addCriterion("ur_namenick <>", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickGreaterThan(String value) {
            addCriterion("ur_namenick >", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickGreaterThanOrEqualTo(String value) {
            addCriterion("ur_namenick >=", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickLessThan(String value) {
            addCriterion("ur_namenick <", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickLessThanOrEqualTo(String value) {
            addCriterion("ur_namenick <=", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickLike(String value) {
            addCriterion("ur_namenick like", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickNotLike(String value) {
            addCriterion("ur_namenick not like", value, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickIn(List<String> values) {
            addCriterion("ur_namenick in", values, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickNotIn(List<String> values) {
            addCriterion("ur_namenick not in", values, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickBetween(String value1, String value2) {
            addCriterion("ur_namenick between", value1, value2, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namenickNotBetween(String value1, String value2) {
            addCriterion("ur_namenick not between", value1, value2, "ur_namenick");
            return (Criteria) this;
        }

        public Criteria andUr_namefullIsNull() {
            addCriterion("ur_namefull is null");
            return (Criteria) this;
        }

        public Criteria andUr_namefullIsNotNull() {
            addCriterion("ur_namefull is not null");
            return (Criteria) this;
        }

        public Criteria andUr_namefullEqualTo(String value) {
            addCriterion("ur_namefull =", value, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefullNotEqualTo(String value) {
            addCriterion("ur_namefull <>", value, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefullGreaterThan(String value) {
            addCriterion("ur_namefull >", value, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefullGreaterThanOrEqualTo(String value) {
            addCriterion("ur_namefull >=", value, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefullLessThan(String value) {
            addCriterion("ur_namefull <", value, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefullLessThanOrEqualTo(String value) {
            addCriterion("ur_namefull <=", value, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefullLike(String value) {
            addCriterion("ur_namefull like", value, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefullNotLike(String value) {
            addCriterion("ur_namefull not like", value, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefullIn(List<String> values) {
            addCriterion("ur_namefull in", values, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefullNotIn(List<String> values) {
            addCriterion("ur_namefull not in", values, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefullBetween(String value1, String value2) {
            addCriterion("ur_namefull between", value1, value2, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefullNotBetween(String value1, String value2) {
            addCriterion("ur_namefull not between", value1, value2, "ur_namefull");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstIsNull() {
            addCriterion("ur_namefirst is null");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstIsNotNull() {
            addCriterion("ur_namefirst is not null");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstEqualTo(String value) {
            addCriterion("ur_namefirst =", value, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstNotEqualTo(String value) {
            addCriterion("ur_namefirst <>", value, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstGreaterThan(String value) {
            addCriterion("ur_namefirst >", value, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstGreaterThanOrEqualTo(String value) {
            addCriterion("ur_namefirst >=", value, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstLessThan(String value) {
            addCriterion("ur_namefirst <", value, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstLessThanOrEqualTo(String value) {
            addCriterion("ur_namefirst <=", value, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstLike(String value) {
            addCriterion("ur_namefirst like", value, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstNotLike(String value) {
            addCriterion("ur_namefirst not like", value, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstIn(List<String> values) {
            addCriterion("ur_namefirst in", values, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstNotIn(List<String> values) {
            addCriterion("ur_namefirst not in", values, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstBetween(String value1, String value2) {
            addCriterion("ur_namefirst between", value1, value2, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namefirstNotBetween(String value1, String value2) {
            addCriterion("ur_namefirst not between", value1, value2, "ur_namefirst");
            return (Criteria) this;
        }

        public Criteria andUr_namesndIsNull() {
            addCriterion("ur_namesnd is null");
            return (Criteria) this;
        }

        public Criteria andUr_namesndIsNotNull() {
            addCriterion("ur_namesnd is not null");
            return (Criteria) this;
        }

        public Criteria andUr_namesndEqualTo(String value) {
            addCriterion("ur_namesnd =", value, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_namesndNotEqualTo(String value) {
            addCriterion("ur_namesnd <>", value, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_namesndGreaterThan(String value) {
            addCriterion("ur_namesnd >", value, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_namesndGreaterThanOrEqualTo(String value) {
            addCriterion("ur_namesnd >=", value, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_namesndLessThan(String value) {
            addCriterion("ur_namesnd <", value, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_namesndLessThanOrEqualTo(String value) {
            addCriterion("ur_namesnd <=", value, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_namesndLike(String value) {
            addCriterion("ur_namesnd like", value, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_namesndNotLike(String value) {
            addCriterion("ur_namesnd not like", value, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_namesndIn(List<String> values) {
            addCriterion("ur_namesnd in", values, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_namesndNotIn(List<String> values) {
            addCriterion("ur_namesnd not in", values, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_namesndBetween(String value1, String value2) {
            addCriterion("ur_namesnd between", value1, value2, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_namesndNotBetween(String value1, String value2) {
            addCriterion("ur_namesnd not between", value1, value2, "ur_namesnd");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayIsNull() {
            addCriterion("ur_pwdpay is null");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayIsNotNull() {
            addCriterion("ur_pwdpay is not null");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayEqualTo(String value) {
            addCriterion("ur_pwdpay =", value, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayNotEqualTo(String value) {
            addCriterion("ur_pwdpay <>", value, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayGreaterThan(String value) {
            addCriterion("ur_pwdpay >", value, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayGreaterThanOrEqualTo(String value) {
            addCriterion("ur_pwdpay >=", value, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayLessThan(String value) {
            addCriterion("ur_pwdpay <", value, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayLessThanOrEqualTo(String value) {
            addCriterion("ur_pwdpay <=", value, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayLike(String value) {
            addCriterion("ur_pwdpay like", value, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayNotLike(String value) {
            addCriterion("ur_pwdpay not like", value, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayIn(List<String> values) {
            addCriterion("ur_pwdpay in", values, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayNotIn(List<String> values) {
            addCriterion("ur_pwdpay not in", values, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayBetween(String value1, String value2) {
            addCriterion("ur_pwdpay between", value1, value2, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_pwdpayNotBetween(String value1, String value2) {
            addCriterion("ur_pwdpay not between", value1, value2, "ur_pwdpay");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayIsNull() {
            addCriterion("ur_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayIsNotNull() {
            addCriterion("ur_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayEqualTo(Date value) {
            addCriterion("ur_birthday =", value, "ur_birthday");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayNotEqualTo(Date value) {
            addCriterion("ur_birthday <>", value, "ur_birthday");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayGreaterThan(Date value) {
            addCriterion("ur_birthday >", value, "ur_birthday");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("ur_birthday >=", value, "ur_birthday");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayLessThan(Date value) {
            addCriterion("ur_birthday <", value, "ur_birthday");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayLessThanOrEqualTo(Date value) {
            addCriterion("ur_birthday <=", value, "ur_birthday");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayIn(List<Date> values) {
            addCriterion("ur_birthday in", values, "ur_birthday");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayNotIn(List<Date> values) {
            addCriterion("ur_birthday not in", values, "ur_birthday");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayBetween(Date value1, Date value2) {
            addCriterion("ur_birthday between", value1, value2, "ur_birthday");
            return (Criteria) this;
        }

        public Criteria andUr_birthdayNotBetween(Date value1, Date value2) {
            addCriterion("ur_birthday not between", value1, value2, "ur_birthday");
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

        public Criteria andUr_personcodeIsNull() {
            addCriterion("ur_personcode is null");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeIsNotNull() {
            addCriterion("ur_personcode is not null");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeEqualTo(String value) {
            addCriterion("ur_personcode =", value, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeNotEqualTo(String value) {
            addCriterion("ur_personcode <>", value, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeGreaterThan(String value) {
            addCriterion("ur_personcode >", value, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ur_personcode >=", value, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeLessThan(String value) {
            addCriterion("ur_personcode <", value, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeLessThanOrEqualTo(String value) {
            addCriterion("ur_personcode <=", value, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeLike(String value) {
            addCriterion("ur_personcode like", value, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeNotLike(String value) {
            addCriterion("ur_personcode not like", value, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeIn(List<String> values) {
            addCriterion("ur_personcode in", values, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeNotIn(List<String> values) {
            addCriterion("ur_personcode not in", values, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeBetween(String value1, String value2) {
            addCriterion("ur_personcode between", value1, value2, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_personcodeNotBetween(String value1, String value2) {
            addCriterion("ur_personcode not between", value1, value2, "ur_personcode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeIsNull() {
            addCriterion("ur_invitecode is null");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeIsNotNull() {
            addCriterion("ur_invitecode is not null");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeEqualTo(String value) {
            addCriterion("ur_invitecode =", value, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeNotEqualTo(String value) {
            addCriterion("ur_invitecode <>", value, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeGreaterThan(String value) {
            addCriterion("ur_invitecode >", value, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ur_invitecode >=", value, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeLessThan(String value) {
            addCriterion("ur_invitecode <", value, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeLessThanOrEqualTo(String value) {
            addCriterion("ur_invitecode <=", value, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeLike(String value) {
            addCriterion("ur_invitecode like", value, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeNotLike(String value) {
            addCriterion("ur_invitecode not like", value, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeIn(List<String> values) {
            addCriterion("ur_invitecode in", values, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeNotIn(List<String> values) {
            addCriterion("ur_invitecode not in", values, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeBetween(String value1, String value2) {
            addCriterion("ur_invitecode between", value1, value2, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_invitecodeNotBetween(String value1, String value2) {
            addCriterion("ur_invitecode not between", value1, value2, "ur_invitecode");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidIsNull() {
            addCriterion("ur_provinceid is null");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidIsNotNull() {
            addCriterion("ur_provinceid is not null");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidEqualTo(Integer value) {
            addCriterion("ur_provinceid =", value, "ur_provinceid");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidNotEqualTo(Integer value) {
            addCriterion("ur_provinceid <>", value, "ur_provinceid");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidGreaterThan(Integer value) {
            addCriterion("ur_provinceid >", value, "ur_provinceid");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ur_provinceid >=", value, "ur_provinceid");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidLessThan(Integer value) {
            addCriterion("ur_provinceid <", value, "ur_provinceid");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidLessThanOrEqualTo(Integer value) {
            addCriterion("ur_provinceid <=", value, "ur_provinceid");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidIn(List<Integer> values) {
            addCriterion("ur_provinceid in", values, "ur_provinceid");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidNotIn(List<Integer> values) {
            addCriterion("ur_provinceid not in", values, "ur_provinceid");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidBetween(Integer value1, Integer value2) {
            addCriterion("ur_provinceid between", value1, value2, "ur_provinceid");
            return (Criteria) this;
        }

        public Criteria andUr_provinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("ur_provinceid not between", value1, value2, "ur_provinceid");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameIsNull() {
            addCriterion("ur_provincename is null");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameIsNotNull() {
            addCriterion("ur_provincename is not null");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameEqualTo(String value) {
            addCriterion("ur_provincename =", value, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameNotEqualTo(String value) {
            addCriterion("ur_provincename <>", value, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameGreaterThan(String value) {
            addCriterion("ur_provincename >", value, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameGreaterThanOrEqualTo(String value) {
            addCriterion("ur_provincename >=", value, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameLessThan(String value) {
            addCriterion("ur_provincename <", value, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameLessThanOrEqualTo(String value) {
            addCriterion("ur_provincename <=", value, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameLike(String value) {
            addCriterion("ur_provincename like", value, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameNotLike(String value) {
            addCriterion("ur_provincename not like", value, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameIn(List<String> values) {
            addCriterion("ur_provincename in", values, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameNotIn(List<String> values) {
            addCriterion("ur_provincename not in", values, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameBetween(String value1, String value2) {
            addCriterion("ur_provincename between", value1, value2, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_provincenameNotBetween(String value1, String value2) {
            addCriterion("ur_provincename not between", value1, value2, "ur_provincename");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeIsNull() {
            addCriterion("ur_citycode is null");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeIsNotNull() {
            addCriterion("ur_citycode is not null");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeEqualTo(String value) {
            addCriterion("ur_citycode =", value, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeNotEqualTo(String value) {
            addCriterion("ur_citycode <>", value, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeGreaterThan(String value) {
            addCriterion("ur_citycode >", value, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeGreaterThanOrEqualTo(String value) {
            addCriterion("ur_citycode >=", value, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeLessThan(String value) {
            addCriterion("ur_citycode <", value, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeLessThanOrEqualTo(String value) {
            addCriterion("ur_citycode <=", value, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeLike(String value) {
            addCriterion("ur_citycode like", value, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeNotLike(String value) {
            addCriterion("ur_citycode not like", value, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeIn(List<String> values) {
            addCriterion("ur_citycode in", values, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeNotIn(List<String> values) {
            addCriterion("ur_citycode not in", values, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeBetween(String value1, String value2) {
            addCriterion("ur_citycode between", value1, value2, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citycodeNotBetween(String value1, String value2) {
            addCriterion("ur_citycode not between", value1, value2, "ur_citycode");
            return (Criteria) this;
        }

        public Criteria andUr_citynameIsNull() {
            addCriterion("ur_cityname is null");
            return (Criteria) this;
        }

        public Criteria andUr_citynameIsNotNull() {
            addCriterion("ur_cityname is not null");
            return (Criteria) this;
        }

        public Criteria andUr_citynameEqualTo(String value) {
            addCriterion("ur_cityname =", value, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_citynameNotEqualTo(String value) {
            addCriterion("ur_cityname <>", value, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_citynameGreaterThan(String value) {
            addCriterion("ur_cityname >", value, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_citynameGreaterThanOrEqualTo(String value) {
            addCriterion("ur_cityname >=", value, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_citynameLessThan(String value) {
            addCriterion("ur_cityname <", value, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_citynameLessThanOrEqualTo(String value) {
            addCriterion("ur_cityname <=", value, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_citynameLike(String value) {
            addCriterion("ur_cityname like", value, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_citynameNotLike(String value) {
            addCriterion("ur_cityname not like", value, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_citynameIn(List<String> values) {
            addCriterion("ur_cityname in", values, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_citynameNotIn(List<String> values) {
            addCriterion("ur_cityname not in", values, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_citynameBetween(String value1, String value2) {
            addCriterion("ur_cityname between", value1, value2, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_citynameNotBetween(String value1, String value2) {
            addCriterion("ur_cityname not between", value1, value2, "ur_cityname");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeIsNull() {
            addCriterion("ur_pos_longitude is null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeIsNotNull() {
            addCriterion("ur_pos_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeEqualTo(String value) {
            addCriterion("ur_pos_longitude =", value, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeNotEqualTo(String value) {
            addCriterion("ur_pos_longitude <>", value, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeGreaterThan(String value) {
            addCriterion("ur_pos_longitude >", value, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ur_pos_longitude >=", value, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeLessThan(String value) {
            addCriterion("ur_pos_longitude <", value, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeLessThanOrEqualTo(String value) {
            addCriterion("ur_pos_longitude <=", value, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeLike(String value) {
            addCriterion("ur_pos_longitude like", value, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeNotLike(String value) {
            addCriterion("ur_pos_longitude not like", value, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeIn(List<String> values) {
            addCriterion("ur_pos_longitude in", values, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeNotIn(List<String> values) {
            addCriterion("ur_pos_longitude not in", values, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeBetween(String value1, String value2) {
            addCriterion("ur_pos_longitude between", value1, value2, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_longitudeNotBetween(String value1, String value2) {
            addCriterion("ur_pos_longitude not between", value1, value2, "ur_pos_longitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeIsNull() {
            addCriterion("ur_pos_latitude is null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeIsNotNull() {
            addCriterion("ur_pos_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeEqualTo(String value) {
            addCriterion("ur_pos_latitude =", value, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeNotEqualTo(String value) {
            addCriterion("ur_pos_latitude <>", value, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeGreaterThan(String value) {
            addCriterion("ur_pos_latitude >", value, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ur_pos_latitude >=", value, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeLessThan(String value) {
            addCriterion("ur_pos_latitude <", value, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeLessThanOrEqualTo(String value) {
            addCriterion("ur_pos_latitude <=", value, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeLike(String value) {
            addCriterion("ur_pos_latitude like", value, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeNotLike(String value) {
            addCriterion("ur_pos_latitude not like", value, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeIn(List<String> values) {
            addCriterion("ur_pos_latitude in", values, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeNotIn(List<String> values) {
            addCriterion("ur_pos_latitude not in", values, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeBetween(String value1, String value2) {
            addCriterion("ur_pos_latitude between", value1, value2, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_latitudeNotBetween(String value1, String value2) {
            addCriterion("ur_pos_latitude not between", value1, value2, "ur_pos_latitude");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressIsNull() {
            addCriterion("ur_pos_address is null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressIsNotNull() {
            addCriterion("ur_pos_address is not null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressEqualTo(String value) {
            addCriterion("ur_pos_address =", value, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressNotEqualTo(String value) {
            addCriterion("ur_pos_address <>", value, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressGreaterThan(String value) {
            addCriterion("ur_pos_address >", value, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressGreaterThanOrEqualTo(String value) {
            addCriterion("ur_pos_address >=", value, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressLessThan(String value) {
            addCriterion("ur_pos_address <", value, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressLessThanOrEqualTo(String value) {
            addCriterion("ur_pos_address <=", value, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressLike(String value) {
            addCriterion("ur_pos_address like", value, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressNotLike(String value) {
            addCriterion("ur_pos_address not like", value, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressIn(List<String> values) {
            addCriterion("ur_pos_address in", values, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressNotIn(List<String> values) {
            addCriterion("ur_pos_address not in", values, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressBetween(String value1, String value2) {
            addCriterion("ur_pos_address between", value1, value2, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_addressNotBetween(String value1, String value2) {
            addCriterion("ur_pos_address not between", value1, value2, "ur_pos_address");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationIsNull() {
            addCriterion("ur_pos_location is null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationIsNotNull() {
            addCriterion("ur_pos_location is not null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationEqualTo(String value) {
            addCriterion("ur_pos_location =", value, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationNotEqualTo(String value) {
            addCriterion("ur_pos_location <>", value, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationGreaterThan(String value) {
            addCriterion("ur_pos_location >", value, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationGreaterThanOrEqualTo(String value) {
            addCriterion("ur_pos_location >=", value, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationLessThan(String value) {
            addCriterion("ur_pos_location <", value, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationLessThanOrEqualTo(String value) {
            addCriterion("ur_pos_location <=", value, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationLike(String value) {
            addCriterion("ur_pos_location like", value, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationNotLike(String value) {
            addCriterion("ur_pos_location not like", value, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationIn(List<String> values) {
            addCriterion("ur_pos_location in", values, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationNotIn(List<String> values) {
            addCriterion("ur_pos_location not in", values, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationBetween(String value1, String value2) {
            addCriterion("ur_pos_location between", value1, value2, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_locationNotBetween(String value1, String value2) {
            addCriterion("ur_pos_location not between", value1, value2, "ur_pos_location");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedIsNull() {
            addCriterion("ur_pos_detailed is null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedIsNotNull() {
            addCriterion("ur_pos_detailed is not null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedEqualTo(String value) {
            addCriterion("ur_pos_detailed =", value, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedNotEqualTo(String value) {
            addCriterion("ur_pos_detailed <>", value, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedGreaterThan(String value) {
            addCriterion("ur_pos_detailed >", value, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedGreaterThanOrEqualTo(String value) {
            addCriterion("ur_pos_detailed >=", value, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedLessThan(String value) {
            addCriterion("ur_pos_detailed <", value, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedLessThanOrEqualTo(String value) {
            addCriterion("ur_pos_detailed <=", value, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedLike(String value) {
            addCriterion("ur_pos_detailed like", value, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedNotLike(String value) {
            addCriterion("ur_pos_detailed not like", value, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedIn(List<String> values) {
            addCriterion("ur_pos_detailed in", values, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedNotIn(List<String> values) {
            addCriterion("ur_pos_detailed not in", values, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedBetween(String value1, String value2) {
            addCriterion("ur_pos_detailed between", value1, value2, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_detailedNotBetween(String value1, String value2) {
            addCriterion("ur_pos_detailed not between", value1, value2, "ur_pos_detailed");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagIsNull() {
            addCriterion("ur_pos_autoflag is null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagIsNotNull() {
            addCriterion("ur_pos_autoflag is not null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagEqualTo(Boolean value) {
            addCriterion("ur_pos_autoflag =", value, "ur_pos_autoflag");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagNotEqualTo(Boolean value) {
            addCriterion("ur_pos_autoflag <>", value, "ur_pos_autoflag");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagGreaterThan(Boolean value) {
            addCriterion("ur_pos_autoflag >", value, "ur_pos_autoflag");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ur_pos_autoflag >=", value, "ur_pos_autoflag");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagLessThan(Boolean value) {
            addCriterion("ur_pos_autoflag <", value, "ur_pos_autoflag");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagLessThanOrEqualTo(Boolean value) {
            addCriterion("ur_pos_autoflag <=", value, "ur_pos_autoflag");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagIn(List<Boolean> values) {
            addCriterion("ur_pos_autoflag in", values, "ur_pos_autoflag");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagNotIn(List<Boolean> values) {
            addCriterion("ur_pos_autoflag not in", values, "ur_pos_autoflag");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagBetween(Boolean value1, Boolean value2) {
            addCriterion("ur_pos_autoflag between", value1, value2, "ur_pos_autoflag");
            return (Criteria) this;
        }

        public Criteria andUr_pos_autoflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ur_pos_autoflag not between", value1, value2, "ur_pos_autoflag");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeIsNull() {
            addCriterion("ur_pos_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeIsNotNull() {
            addCriterion("ur_pos_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeEqualTo(String value) {
            addCriterion("ur_pos_zipcode =", value, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeNotEqualTo(String value) {
            addCriterion("ur_pos_zipcode <>", value, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeGreaterThan(String value) {
            addCriterion("ur_pos_zipcode >", value, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ur_pos_zipcode >=", value, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeLessThan(String value) {
            addCriterion("ur_pos_zipcode <", value, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeLessThanOrEqualTo(String value) {
            addCriterion("ur_pos_zipcode <=", value, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeLike(String value) {
            addCriterion("ur_pos_zipcode like", value, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeNotLike(String value) {
            addCriterion("ur_pos_zipcode not like", value, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeIn(List<String> values) {
            addCriterion("ur_pos_zipcode in", values, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeNotIn(List<String> values) {
            addCriterion("ur_pos_zipcode not in", values, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeBetween(String value1, String value2) {
            addCriterion("ur_pos_zipcode between", value1, value2, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_pos_zipcodeNotBetween(String value1, String value2) {
            addCriterion("ur_pos_zipcode not between", value1, value2, "ur_pos_zipcode");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxIsNull() {
            addCriterion("ur_openid_wx is null");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxIsNotNull() {
            addCriterion("ur_openid_wx is not null");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxEqualTo(String value) {
            addCriterion("ur_openid_wx =", value, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxNotEqualTo(String value) {
            addCriterion("ur_openid_wx <>", value, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxGreaterThan(String value) {
            addCriterion("ur_openid_wx >", value, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxGreaterThanOrEqualTo(String value) {
            addCriterion("ur_openid_wx >=", value, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxLessThan(String value) {
            addCriterion("ur_openid_wx <", value, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxLessThanOrEqualTo(String value) {
            addCriterion("ur_openid_wx <=", value, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxLike(String value) {
            addCriterion("ur_openid_wx like", value, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxNotLike(String value) {
            addCriterion("ur_openid_wx not like", value, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxIn(List<String> values) {
            addCriterion("ur_openid_wx in", values, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxNotIn(List<String> values) {
            addCriterion("ur_openid_wx not in", values, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxBetween(String value1, String value2) {
            addCriterion("ur_openid_wx between", value1, value2, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_wxNotBetween(String value1, String value2) {
            addCriterion("ur_openid_wx not between", value1, value2, "ur_openid_wx");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniIsNull() {
            addCriterion("ur_openid_mini is null");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniIsNotNull() {
            addCriterion("ur_openid_mini is not null");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniEqualTo(String value) {
            addCriterion("ur_openid_mini =", value, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniNotEqualTo(String value) {
            addCriterion("ur_openid_mini <>", value, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniGreaterThan(String value) {
            addCriterion("ur_openid_mini >", value, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniGreaterThanOrEqualTo(String value) {
            addCriterion("ur_openid_mini >=", value, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniLessThan(String value) {
            addCriterion("ur_openid_mini <", value, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniLessThanOrEqualTo(String value) {
            addCriterion("ur_openid_mini <=", value, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniLike(String value) {
            addCriterion("ur_openid_mini like", value, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniNotLike(String value) {
            addCriterion("ur_openid_mini not like", value, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniIn(List<String> values) {
            addCriterion("ur_openid_mini in", values, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniNotIn(List<String> values) {
            addCriterion("ur_openid_mini not in", values, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniBetween(String value1, String value2) {
            addCriterion("ur_openid_mini between", value1, value2, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_miniNotBetween(String value1, String value2) {
            addCriterion("ur_openid_mini not between", value1, value2, "ur_openid_mini");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqIsNull() {
            addCriterion("ur_openid_qq is null");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqIsNotNull() {
            addCriterion("ur_openid_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqEqualTo(String value) {
            addCriterion("ur_openid_qq =", value, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqNotEqualTo(String value) {
            addCriterion("ur_openid_qq <>", value, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqGreaterThan(String value) {
            addCriterion("ur_openid_qq >", value, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqGreaterThanOrEqualTo(String value) {
            addCriterion("ur_openid_qq >=", value, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqLessThan(String value) {
            addCriterion("ur_openid_qq <", value, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqLessThanOrEqualTo(String value) {
            addCriterion("ur_openid_qq <=", value, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqLike(String value) {
            addCriterion("ur_openid_qq like", value, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqNotLike(String value) {
            addCriterion("ur_openid_qq not like", value, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqIn(List<String> values) {
            addCriterion("ur_openid_qq in", values, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqNotIn(List<String> values) {
            addCriterion("ur_openid_qq not in", values, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqBetween(String value1, String value2) {
            addCriterion("ur_openid_qq between", value1, value2, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_openid_qqNotBetween(String value1, String value2) {
            addCriterion("ur_openid_qq not between", value1, value2, "ur_openid_qq");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateIsNull() {
            addCriterion("ur_register_date is null");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateIsNotNull() {
            addCriterion("ur_register_date is not null");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateEqualTo(Date value) {
            addCriterion("ur_register_date =", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateNotEqualTo(Date value) {
            addCriterion("ur_register_date <>", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateGreaterThan(Date value) {
            addCriterion("ur_register_date >", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("ur_register_date >=", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateLessThan(Date value) {
            addCriterion("ur_register_date <", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateLessThanOrEqualTo(Date value) {
            addCriterion("ur_register_date <=", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateIn(List<Date> values) {
            addCriterion("ur_register_date in", values, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateNotIn(List<Date> values) {
            addCriterion("ur_register_date not in", values, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateBetween(Date value1, Date value2) {
            addCriterion("ur_register_date between", value1, value2, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateNotBetween(Date value1, Date value2) {
            addCriterion("ur_register_date not between", value1, value2, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipIsNull() {
            addCriterion("ur_register_ip is null");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipIsNotNull() {
            addCriterion("ur_register_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipEqualTo(String value) {
            addCriterion("ur_register_ip =", value, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipNotEqualTo(String value) {
            addCriterion("ur_register_ip <>", value, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipGreaterThan(String value) {
            addCriterion("ur_register_ip >", value, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipGreaterThanOrEqualTo(String value) {
            addCriterion("ur_register_ip >=", value, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipLessThan(String value) {
            addCriterion("ur_register_ip <", value, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipLessThanOrEqualTo(String value) {
            addCriterion("ur_register_ip <=", value, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipLike(String value) {
            addCriterion("ur_register_ip like", value, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipNotLike(String value) {
            addCriterion("ur_register_ip not like", value, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipIn(List<String> values) {
            addCriterion("ur_register_ip in", values, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipNotIn(List<String> values) {
            addCriterion("ur_register_ip not in", values, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipBetween(String value1, String value2) {
            addCriterion("ur_register_ip between", value1, value2, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_ipNotBetween(String value1, String value2) {
            addCriterion("ur_register_ip not between", value1, value2, "ur_register_ip");
            return (Criteria) this;
        }

        public Criteria andUr_register_portIsNull() {
            addCriterion("ur_register_port is null");
            return (Criteria) this;
        }

        public Criteria andUr_register_portIsNotNull() {
            addCriterion("ur_register_port is not null");
            return (Criteria) this;
        }

        public Criteria andUr_register_portEqualTo(String value) {
            addCriterion("ur_register_port =", value, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_portNotEqualTo(String value) {
            addCriterion("ur_register_port <>", value, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_portGreaterThan(String value) {
            addCriterion("ur_register_port >", value, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_portGreaterThanOrEqualTo(String value) {
            addCriterion("ur_register_port >=", value, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_portLessThan(String value) {
            addCriterion("ur_register_port <", value, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_portLessThanOrEqualTo(String value) {
            addCriterion("ur_register_port <=", value, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_portLike(String value) {
            addCriterion("ur_register_port like", value, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_portNotLike(String value) {
            addCriterion("ur_register_port not like", value, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_portIn(List<String> values) {
            addCriterion("ur_register_port in", values, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_portNotIn(List<String> values) {
            addCriterion("ur_register_port not in", values, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_portBetween(String value1, String value2) {
            addCriterion("ur_register_port between", value1, value2, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_portNotBetween(String value1, String value2) {
            addCriterion("ur_register_port not between", value1, value2, "ur_register_port");
            return (Criteria) this;
        }

        public Criteria andUr_register_verIsNull() {
            addCriterion("ur_register_ver is null");
            return (Criteria) this;
        }

        public Criteria andUr_register_verIsNotNull() {
            addCriterion("ur_register_ver is not null");
            return (Criteria) this;
        }

        public Criteria andUr_register_verEqualTo(String value) {
            addCriterion("ur_register_ver =", value, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_verNotEqualTo(String value) {
            addCriterion("ur_register_ver <>", value, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_verGreaterThan(String value) {
            addCriterion("ur_register_ver >", value, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_verGreaterThanOrEqualTo(String value) {
            addCriterion("ur_register_ver >=", value, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_verLessThan(String value) {
            addCriterion("ur_register_ver <", value, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_verLessThanOrEqualTo(String value) {
            addCriterion("ur_register_ver <=", value, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_verLike(String value) {
            addCriterion("ur_register_ver like", value, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_verNotLike(String value) {
            addCriterion("ur_register_ver not like", value, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_verIn(List<String> values) {
            addCriterion("ur_register_ver in", values, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_verNotIn(List<String> values) {
            addCriterion("ur_register_ver not in", values, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_verBetween(String value1, String value2) {
            addCriterion("ur_register_ver between", value1, value2, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_verNotBetween(String value1, String value2) {
            addCriterion("ur_register_ver not between", value1, value2, "ur_register_ver");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiIsNull() {
            addCriterion("ur_register_imei is null");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiIsNotNull() {
            addCriterion("ur_register_imei is not null");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiEqualTo(String value) {
            addCriterion("ur_register_imei =", value, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiNotEqualTo(String value) {
            addCriterion("ur_register_imei <>", value, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiGreaterThan(String value) {
            addCriterion("ur_register_imei >", value, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiGreaterThanOrEqualTo(String value) {
            addCriterion("ur_register_imei >=", value, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiLessThan(String value) {
            addCriterion("ur_register_imei <", value, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiLessThanOrEqualTo(String value) {
            addCriterion("ur_register_imei <=", value, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiLike(String value) {
            addCriterion("ur_register_imei like", value, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiNotLike(String value) {
            addCriterion("ur_register_imei not like", value, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiIn(List<String> values) {
            addCriterion("ur_register_imei in", values, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiNotIn(List<String> values) {
            addCriterion("ur_register_imei not in", values, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiBetween(String value1, String value2) {
            addCriterion("ur_register_imei between", value1, value2, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_register_imeiNotBetween(String value1, String value2) {
            addCriterion("ur_register_imei not between", value1, value2, "ur_register_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateIsNull() {
            addCriterion("ur_login_date is null");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateIsNotNull() {
            addCriterion("ur_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateEqualTo(Date value) {
            addCriterion("ur_login_date =", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateNotEqualTo(Date value) {
            addCriterion("ur_login_date <>", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateGreaterThan(Date value) {
            addCriterion("ur_login_date >", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("ur_login_date >=", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateLessThan(Date value) {
            addCriterion("ur_login_date <", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateLessThanOrEqualTo(Date value) {
            addCriterion("ur_login_date <=", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateIn(List<Date> values) {
            addCriterion("ur_login_date in", values, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateNotIn(List<Date> values) {
            addCriterion("ur_login_date not in", values, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateBetween(Date value1, Date value2) {
            addCriterion("ur_login_date between", value1, value2, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateNotBetween(Date value1, Date value2) {
            addCriterion("ur_login_date not between", value1, value2, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipIsNull() {
            addCriterion("ur_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipIsNotNull() {
            addCriterion("ur_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipEqualTo(String value) {
            addCriterion("ur_login_ip =", value, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipNotEqualTo(String value) {
            addCriterion("ur_login_ip <>", value, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipGreaterThan(String value) {
            addCriterion("ur_login_ip >", value, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipGreaterThanOrEqualTo(String value) {
            addCriterion("ur_login_ip >=", value, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipLessThan(String value) {
            addCriterion("ur_login_ip <", value, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipLessThanOrEqualTo(String value) {
            addCriterion("ur_login_ip <=", value, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipLike(String value) {
            addCriterion("ur_login_ip like", value, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipNotLike(String value) {
            addCriterion("ur_login_ip not like", value, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipIn(List<String> values) {
            addCriterion("ur_login_ip in", values, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipNotIn(List<String> values) {
            addCriterion("ur_login_ip not in", values, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipBetween(String value1, String value2) {
            addCriterion("ur_login_ip between", value1, value2, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_ipNotBetween(String value1, String value2) {
            addCriterion("ur_login_ip not between", value1, value2, "ur_login_ip");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineIsNull() {
            addCriterion("ur_login_online is null");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineIsNotNull() {
            addCriterion("ur_login_online is not null");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineEqualTo(Boolean value) {
            addCriterion("ur_login_online =", value, "ur_login_online");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineNotEqualTo(Boolean value) {
            addCriterion("ur_login_online <>", value, "ur_login_online");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineGreaterThan(Boolean value) {
            addCriterion("ur_login_online >", value, "ur_login_online");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ur_login_online >=", value, "ur_login_online");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineLessThan(Boolean value) {
            addCriterion("ur_login_online <", value, "ur_login_online");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineLessThanOrEqualTo(Boolean value) {
            addCriterion("ur_login_online <=", value, "ur_login_online");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineIn(List<Boolean> values) {
            addCriterion("ur_login_online in", values, "ur_login_online");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineNotIn(List<Boolean> values) {
            addCriterion("ur_login_online not in", values, "ur_login_online");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineBetween(Boolean value1, Boolean value2) {
            addCriterion("ur_login_online between", value1, value2, "ur_login_online");
            return (Criteria) this;
        }

        public Criteria andUr_login_onlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ur_login_online not between", value1, value2, "ur_login_online");
            return (Criteria) this;
        }

        public Criteria andUr_login_portIsNull() {
            addCriterion("ur_login_port is null");
            return (Criteria) this;
        }

        public Criteria andUr_login_portIsNotNull() {
            addCriterion("ur_login_port is not null");
            return (Criteria) this;
        }

        public Criteria andUr_login_portEqualTo(String value) {
            addCriterion("ur_login_port =", value, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_portNotEqualTo(String value) {
            addCriterion("ur_login_port <>", value, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_portGreaterThan(String value) {
            addCriterion("ur_login_port >", value, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_portGreaterThanOrEqualTo(String value) {
            addCriterion("ur_login_port >=", value, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_portLessThan(String value) {
            addCriterion("ur_login_port <", value, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_portLessThanOrEqualTo(String value) {
            addCriterion("ur_login_port <=", value, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_portLike(String value) {
            addCriterion("ur_login_port like", value, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_portNotLike(String value) {
            addCriterion("ur_login_port not like", value, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_portIn(List<String> values) {
            addCriterion("ur_login_port in", values, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_portNotIn(List<String> values) {
            addCriterion("ur_login_port not in", values, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_portBetween(String value1, String value2) {
            addCriterion("ur_login_port between", value1, value2, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_portNotBetween(String value1, String value2) {
            addCriterion("ur_login_port not between", value1, value2, "ur_login_port");
            return (Criteria) this;
        }

        public Criteria andUr_login_verIsNull() {
            addCriterion("ur_login_ver is null");
            return (Criteria) this;
        }

        public Criteria andUr_login_verIsNotNull() {
            addCriterion("ur_login_ver is not null");
            return (Criteria) this;
        }

        public Criteria andUr_login_verEqualTo(String value) {
            addCriterion("ur_login_ver =", value, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_verNotEqualTo(String value) {
            addCriterion("ur_login_ver <>", value, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_verGreaterThan(String value) {
            addCriterion("ur_login_ver >", value, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_verGreaterThanOrEqualTo(String value) {
            addCriterion("ur_login_ver >=", value, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_verLessThan(String value) {
            addCriterion("ur_login_ver <", value, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_verLessThanOrEqualTo(String value) {
            addCriterion("ur_login_ver <=", value, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_verLike(String value) {
            addCriterion("ur_login_ver like", value, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_verNotLike(String value) {
            addCriterion("ur_login_ver not like", value, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_verIn(List<String> values) {
            addCriterion("ur_login_ver in", values, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_verNotIn(List<String> values) {
            addCriterion("ur_login_ver not in", values, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_verBetween(String value1, String value2) {
            addCriterion("ur_login_ver between", value1, value2, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_verNotBetween(String value1, String value2) {
            addCriterion("ur_login_ver not between", value1, value2, "ur_login_ver");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiIsNull() {
            addCriterion("ur_login_imei is null");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiIsNotNull() {
            addCriterion("ur_login_imei is not null");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiEqualTo(String value) {
            addCriterion("ur_login_imei =", value, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiNotEqualTo(String value) {
            addCriterion("ur_login_imei <>", value, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiGreaterThan(String value) {
            addCriterion("ur_login_imei >", value, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiGreaterThanOrEqualTo(String value) {
            addCriterion("ur_login_imei >=", value, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiLessThan(String value) {
            addCriterion("ur_login_imei <", value, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiLessThanOrEqualTo(String value) {
            addCriterion("ur_login_imei <=", value, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiLike(String value) {
            addCriterion("ur_login_imei like", value, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiNotLike(String value) {
            addCriterion("ur_login_imei not like", value, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiIn(List<String> values) {
            addCriterion("ur_login_imei in", values, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiNotIn(List<String> values) {
            addCriterion("ur_login_imei not in", values, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiBetween(String value1, String value2) {
            addCriterion("ur_login_imei between", value1, value2, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_login_imeiNotBetween(String value1, String value2) {
            addCriterion("ur_login_imei not between", value1, value2, "ur_login_imei");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateIsNull() {
            addCriterion("ur_dateupdate is null");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateIsNotNull() {
            addCriterion("ur_dateupdate is not null");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateEqualTo(Date value) {
            addCriterion("ur_dateupdate =", value, "ur_dateupdate");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateNotEqualTo(Date value) {
            addCriterion("ur_dateupdate <>", value, "ur_dateupdate");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateGreaterThan(Date value) {
            addCriterion("ur_dateupdate >", value, "ur_dateupdate");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ur_dateupdate >=", value, "ur_dateupdate");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateLessThan(Date value) {
            addCriterion("ur_dateupdate <", value, "ur_dateupdate");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateLessThanOrEqualTo(Date value) {
            addCriterion("ur_dateupdate <=", value, "ur_dateupdate");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateIn(List<Date> values) {
            addCriterion("ur_dateupdate in", values, "ur_dateupdate");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateNotIn(List<Date> values) {
            addCriterion("ur_dateupdate not in", values, "ur_dateupdate");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateBetween(Date value1, Date value2) {
            addCriterion("ur_dateupdate between", value1, value2, "ur_dateupdate");
            return (Criteria) this;
        }

        public Criteria andUr_dateupdateNotBetween(Date value1, Date value2) {
            addCriterion("ur_dateupdate not between", value1, value2, "ur_dateupdate");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeIsNull() {
            addCriterion("ur_usertype is null");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeIsNotNull() {
            addCriterion("ur_usertype is not null");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeEqualTo(Byte value) {
            addCriterion("ur_usertype =", value, "ur_usertype");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeNotEqualTo(Byte value) {
            addCriterion("ur_usertype <>", value, "ur_usertype");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeGreaterThan(Byte value) {
            addCriterion("ur_usertype >", value, "ur_usertype");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ur_usertype >=", value, "ur_usertype");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeLessThan(Byte value) {
            addCriterion("ur_usertype <", value, "ur_usertype");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeLessThanOrEqualTo(Byte value) {
            addCriterion("ur_usertype <=", value, "ur_usertype");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeIn(List<Byte> values) {
            addCriterion("ur_usertype in", values, "ur_usertype");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeNotIn(List<Byte> values) {
            addCriterion("ur_usertype not in", values, "ur_usertype");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeBetween(Byte value1, Byte value2) {
            addCriterion("ur_usertype between", value1, value2, "ur_usertype");
            return (Criteria) this;
        }

        public Criteria andUr_usertypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ur_usertype not between", value1, value2, "ur_usertype");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeIsNull() {
            addCriterion("ur_leveltype is null");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeIsNotNull() {
            addCriterion("ur_leveltype is not null");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeEqualTo(Byte value) {
            addCriterion("ur_leveltype =", value, "ur_leveltype");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeNotEqualTo(Byte value) {
            addCriterion("ur_leveltype <>", value, "ur_leveltype");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeGreaterThan(Byte value) {
            addCriterion("ur_leveltype >", value, "ur_leveltype");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ur_leveltype >=", value, "ur_leveltype");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeLessThan(Byte value) {
            addCriterion("ur_leveltype <", value, "ur_leveltype");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeLessThanOrEqualTo(Byte value) {
            addCriterion("ur_leveltype <=", value, "ur_leveltype");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeIn(List<Byte> values) {
            addCriterion("ur_leveltype in", values, "ur_leveltype");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeNotIn(List<Byte> values) {
            addCriterion("ur_leveltype not in", values, "ur_leveltype");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeBetween(Byte value1, Byte value2) {
            addCriterion("ur_leveltype between", value1, value2, "ur_leveltype");
            return (Criteria) this;
        }

        public Criteria andUr_leveltypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ur_leveltype not between", value1, value2, "ur_leveltype");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1IsNull() {
            addCriterion("ur_msgflag1 is null");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1IsNotNull() {
            addCriterion("ur_msgflag1 is not null");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1EqualTo(Boolean value) {
            addCriterion("ur_msgflag1 =", value, "ur_msgflag1");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1NotEqualTo(Boolean value) {
            addCriterion("ur_msgflag1 <>", value, "ur_msgflag1");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1GreaterThan(Boolean value) {
            addCriterion("ur_msgflag1 >", value, "ur_msgflag1");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("ur_msgflag1 >=", value, "ur_msgflag1");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1LessThan(Boolean value) {
            addCriterion("ur_msgflag1 <", value, "ur_msgflag1");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1LessThanOrEqualTo(Boolean value) {
            addCriterion("ur_msgflag1 <=", value, "ur_msgflag1");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1In(List<Boolean> values) {
            addCriterion("ur_msgflag1 in", values, "ur_msgflag1");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1NotIn(List<Boolean> values) {
            addCriterion("ur_msgflag1 not in", values, "ur_msgflag1");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1Between(Boolean value1, Boolean value2) {
            addCriterion("ur_msgflag1 between", value1, value2, "ur_msgflag1");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("ur_msgflag1 not between", value1, value2, "ur_msgflag1");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2IsNull() {
            addCriterion("ur_msgflag2 is null");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2IsNotNull() {
            addCriterion("ur_msgflag2 is not null");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2EqualTo(Boolean value) {
            addCriterion("ur_msgflag2 =", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2NotEqualTo(Boolean value) {
            addCriterion("ur_msgflag2 <>", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2GreaterThan(Boolean value) {
            addCriterion("ur_msgflag2 >", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("ur_msgflag2 >=", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2LessThan(Boolean value) {
            addCriterion("ur_msgflag2 <", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2LessThanOrEqualTo(Boolean value) {
            addCriterion("ur_msgflag2 <=", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2In(List<Boolean> values) {
            addCriterion("ur_msgflag2 in", values, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2NotIn(List<Boolean> values) {
            addCriterion("ur_msgflag2 not in", values, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2Between(Boolean value1, Boolean value2) {
            addCriterion("ur_msgflag2 between", value1, value2, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("ur_msgflag2 not between", value1, value2, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3IsNull() {
            addCriterion("ur_msgflag3 is null");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3IsNotNull() {
            addCriterion("ur_msgflag3 is not null");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3EqualTo(Boolean value) {
            addCriterion("ur_msgflag3 =", value, "ur_msgflag3");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3NotEqualTo(Boolean value) {
            addCriterion("ur_msgflag3 <>", value, "ur_msgflag3");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3GreaterThan(Boolean value) {
            addCriterion("ur_msgflag3 >", value, "ur_msgflag3");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("ur_msgflag3 >=", value, "ur_msgflag3");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3LessThan(Boolean value) {
            addCriterion("ur_msgflag3 <", value, "ur_msgflag3");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3LessThanOrEqualTo(Boolean value) {
            addCriterion("ur_msgflag3 <=", value, "ur_msgflag3");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3In(List<Boolean> values) {
            addCriterion("ur_msgflag3 in", values, "ur_msgflag3");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3NotIn(List<Boolean> values) {
            addCriterion("ur_msgflag3 not in", values, "ur_msgflag3");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3Between(Boolean value1, Boolean value2) {
            addCriterion("ur_msgflag3 between", value1, value2, "ur_msgflag3");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("ur_msgflag3 not between", value1, value2, "ur_msgflag3");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagIsNull() {
            addCriterion("ur_stopflag is null");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagIsNotNull() {
            addCriterion("ur_stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagEqualTo(Boolean value) {
            addCriterion("ur_stopflag =", value, "ur_stopflag");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagNotEqualTo(Boolean value) {
            addCriterion("ur_stopflag <>", value, "ur_stopflag");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagGreaterThan(Boolean value) {
            addCriterion("ur_stopflag >", value, "ur_stopflag");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ur_stopflag >=", value, "ur_stopflag");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagLessThan(Boolean value) {
            addCriterion("ur_stopflag <", value, "ur_stopflag");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("ur_stopflag <=", value, "ur_stopflag");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagIn(List<Boolean> values) {
            addCriterion("ur_stopflag in", values, "ur_stopflag");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagNotIn(List<Boolean> values) {
            addCriterion("ur_stopflag not in", values, "ur_stopflag");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("ur_stopflag between", value1, value2, "ur_stopflag");
            return (Criteria) this;
        }

        public Criteria andUr_stopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ur_stopflag not between", value1, value2, "ur_stopflag");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateIsNull() {
            addCriterion("ur_stopdate is null");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateIsNotNull() {
            addCriterion("ur_stopdate is not null");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateEqualTo(Date value) {
            addCriterion("ur_stopdate =", value, "ur_stopdate");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateNotEqualTo(Date value) {
            addCriterion("ur_stopdate <>", value, "ur_stopdate");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateGreaterThan(Date value) {
            addCriterion("ur_stopdate >", value, "ur_stopdate");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ur_stopdate >=", value, "ur_stopdate");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateLessThan(Date value) {
            addCriterion("ur_stopdate <", value, "ur_stopdate");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateLessThanOrEqualTo(Date value) {
            addCriterion("ur_stopdate <=", value, "ur_stopdate");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateIn(List<Date> values) {
            addCriterion("ur_stopdate in", values, "ur_stopdate");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateNotIn(List<Date> values) {
            addCriterion("ur_stopdate not in", values, "ur_stopdate");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateBetween(Date value1, Date value2) {
            addCriterion("ur_stopdate between", value1, value2, "ur_stopdate");
            return (Criteria) this;
        }

        public Criteria andUr_stopdateNotBetween(Date value1, Date value2) {
            addCriterion("ur_stopdate not between", value1, value2, "ur_stopdate");
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