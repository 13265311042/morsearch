package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sys_SmsVerifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_SmsVerifyExample() {
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

        public Criteria andSv_idIsNull() {
            addCriterion("sv_id is null");
            return (Criteria) this;
        }

        public Criteria andSv_idIsNotNull() {
            addCriterion("sv_id is not null");
            return (Criteria) this;
        }

        public Criteria andSv_idEqualTo(Integer value) {
            addCriterion("sv_id =", value, "sv_id");
            return (Criteria) this;
        }

        public Criteria andSv_idNotEqualTo(Integer value) {
            addCriterion("sv_id <>", value, "sv_id");
            return (Criteria) this;
        }

        public Criteria andSv_idGreaterThan(Integer value) {
            addCriterion("sv_id >", value, "sv_id");
            return (Criteria) this;
        }

        public Criteria andSv_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sv_id >=", value, "sv_id");
            return (Criteria) this;
        }

        public Criteria andSv_idLessThan(Integer value) {
            addCriterion("sv_id <", value, "sv_id");
            return (Criteria) this;
        }

        public Criteria andSv_idLessThanOrEqualTo(Integer value) {
            addCriterion("sv_id <=", value, "sv_id");
            return (Criteria) this;
        }

        public Criteria andSv_idIn(List<Integer> values) {
            addCriterion("sv_id in", values, "sv_id");
            return (Criteria) this;
        }

        public Criteria andSv_idNotIn(List<Integer> values) {
            addCriterion("sv_id not in", values, "sv_id");
            return (Criteria) this;
        }

        public Criteria andSv_idBetween(Integer value1, Integer value2) {
            addCriterion("sv_id between", value1, value2, "sv_id");
            return (Criteria) this;
        }

        public Criteria andSv_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sv_id not between", value1, value2, "sv_id");
            return (Criteria) this;
        }

        public Criteria andSv_phoneIsNull() {
            addCriterion("sv_phone is null");
            return (Criteria) this;
        }

        public Criteria andSv_phoneIsNotNull() {
            addCriterion("sv_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSv_phoneEqualTo(String value) {
            addCriterion("sv_phone =", value, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_phoneNotEqualTo(String value) {
            addCriterion("sv_phone <>", value, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_phoneGreaterThan(String value) {
            addCriterion("sv_phone >", value, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("sv_phone >=", value, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_phoneLessThan(String value) {
            addCriterion("sv_phone <", value, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_phoneLessThanOrEqualTo(String value) {
            addCriterion("sv_phone <=", value, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_phoneLike(String value) {
            addCriterion("sv_phone like", value, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_phoneNotLike(String value) {
            addCriterion("sv_phone not like", value, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_phoneIn(List<String> values) {
            addCriterion("sv_phone in", values, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_phoneNotIn(List<String> values) {
            addCriterion("sv_phone not in", values, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_phoneBetween(String value1, String value2) {
            addCriterion("sv_phone between", value1, value2, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_phoneNotBetween(String value1, String value2) {
            addCriterion("sv_phone not between", value1, value2, "sv_phone");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexIsNull() {
            addCriterion("sv_typeindex is null");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexIsNotNull() {
            addCriterion("sv_typeindex is not null");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexEqualTo(Byte value) {
            addCriterion("sv_typeindex =", value, "sv_typeindex");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexNotEqualTo(Byte value) {
            addCriterion("sv_typeindex <>", value, "sv_typeindex");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexGreaterThan(Byte value) {
            addCriterion("sv_typeindex >", value, "sv_typeindex");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sv_typeindex >=", value, "sv_typeindex");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexLessThan(Byte value) {
            addCriterion("sv_typeindex <", value, "sv_typeindex");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexLessThanOrEqualTo(Byte value) {
            addCriterion("sv_typeindex <=", value, "sv_typeindex");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexIn(List<Byte> values) {
            addCriterion("sv_typeindex in", values, "sv_typeindex");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexNotIn(List<Byte> values) {
            addCriterion("sv_typeindex not in", values, "sv_typeindex");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexBetween(Byte value1, Byte value2) {
            addCriterion("sv_typeindex between", value1, value2, "sv_typeindex");
            return (Criteria) this;
        }

        public Criteria andSv_typeindexNotBetween(Byte value1, Byte value2) {
            addCriterion("sv_typeindex not between", value1, value2, "sv_typeindex");
            return (Criteria) this;
        }

        public Criteria andSv_typenameIsNull() {
            addCriterion("sv_typename is null");
            return (Criteria) this;
        }

        public Criteria andSv_typenameIsNotNull() {
            addCriterion("sv_typename is not null");
            return (Criteria) this;
        }

        public Criteria andSv_typenameEqualTo(String value) {
            addCriterion("sv_typename =", value, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_typenameNotEqualTo(String value) {
            addCriterion("sv_typename <>", value, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_typenameGreaterThan(String value) {
            addCriterion("sv_typename >", value, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_typenameGreaterThanOrEqualTo(String value) {
            addCriterion("sv_typename >=", value, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_typenameLessThan(String value) {
            addCriterion("sv_typename <", value, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_typenameLessThanOrEqualTo(String value) {
            addCriterion("sv_typename <=", value, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_typenameLike(String value) {
            addCriterion("sv_typename like", value, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_typenameNotLike(String value) {
            addCriterion("sv_typename not like", value, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_typenameIn(List<String> values) {
            addCriterion("sv_typename in", values, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_typenameNotIn(List<String> values) {
            addCriterion("sv_typename not in", values, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_typenameBetween(String value1, String value2) {
            addCriterion("sv_typename between", value1, value2, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_typenameNotBetween(String value1, String value2) {
            addCriterion("sv_typename not between", value1, value2, "sv_typename");
            return (Criteria) this;
        }

        public Criteria andSv_useridIsNull() {
            addCriterion("sv_userid is null");
            return (Criteria) this;
        }

        public Criteria andSv_useridIsNotNull() {
            addCriterion("sv_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSv_useridEqualTo(Long value) {
            addCriterion("sv_userid =", value, "sv_userid");
            return (Criteria) this;
        }

        public Criteria andSv_useridNotEqualTo(Long value) {
            addCriterion("sv_userid <>", value, "sv_userid");
            return (Criteria) this;
        }

        public Criteria andSv_useridGreaterThan(Long value) {
            addCriterion("sv_userid >", value, "sv_userid");
            return (Criteria) this;
        }

        public Criteria andSv_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("sv_userid >=", value, "sv_userid");
            return (Criteria) this;
        }

        public Criteria andSv_useridLessThan(Long value) {
            addCriterion("sv_userid <", value, "sv_userid");
            return (Criteria) this;
        }

        public Criteria andSv_useridLessThanOrEqualTo(Long value) {
            addCriterion("sv_userid <=", value, "sv_userid");
            return (Criteria) this;
        }

        public Criteria andSv_useridIn(List<Long> values) {
            addCriterion("sv_userid in", values, "sv_userid");
            return (Criteria) this;
        }

        public Criteria andSv_useridNotIn(List<Long> values) {
            addCriterion("sv_userid not in", values, "sv_userid");
            return (Criteria) this;
        }

        public Criteria andSv_useridBetween(Long value1, Long value2) {
            addCriterion("sv_userid between", value1, value2, "sv_userid");
            return (Criteria) this;
        }

        public Criteria andSv_useridNotBetween(Long value1, Long value2) {
            addCriterion("sv_userid not between", value1, value2, "sv_userid");
            return (Criteria) this;
        }

        public Criteria andSv_ipIsNull() {
            addCriterion("sv_ip is null");
            return (Criteria) this;
        }

        public Criteria andSv_ipIsNotNull() {
            addCriterion("sv_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSv_ipEqualTo(String value) {
            addCriterion("sv_ip =", value, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_ipNotEqualTo(String value) {
            addCriterion("sv_ip <>", value, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_ipGreaterThan(String value) {
            addCriterion("sv_ip >", value, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_ipGreaterThanOrEqualTo(String value) {
            addCriterion("sv_ip >=", value, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_ipLessThan(String value) {
            addCriterion("sv_ip <", value, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_ipLessThanOrEqualTo(String value) {
            addCriterion("sv_ip <=", value, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_ipLike(String value) {
            addCriterion("sv_ip like", value, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_ipNotLike(String value) {
            addCriterion("sv_ip not like", value, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_ipIn(List<String> values) {
            addCriterion("sv_ip in", values, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_ipNotIn(List<String> values) {
            addCriterion("sv_ip not in", values, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_ipBetween(String value1, String value2) {
            addCriterion("sv_ip between", value1, value2, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_ipNotBetween(String value1, String value2) {
            addCriterion("sv_ip not between", value1, value2, "sv_ip");
            return (Criteria) this;
        }

        public Criteria andSv_repeatIsNull() {
            addCriterion("sv_repeat is null");
            return (Criteria) this;
        }

        public Criteria andSv_repeatIsNotNull() {
            addCriterion("sv_repeat is not null");
            return (Criteria) this;
        }

        public Criteria andSv_repeatEqualTo(Byte value) {
            addCriterion("sv_repeat =", value, "sv_repeat");
            return (Criteria) this;
        }

        public Criteria andSv_repeatNotEqualTo(Byte value) {
            addCriterion("sv_repeat <>", value, "sv_repeat");
            return (Criteria) this;
        }

        public Criteria andSv_repeatGreaterThan(Byte value) {
            addCriterion("sv_repeat >", value, "sv_repeat");
            return (Criteria) this;
        }

        public Criteria andSv_repeatGreaterThanOrEqualTo(Byte value) {
            addCriterion("sv_repeat >=", value, "sv_repeat");
            return (Criteria) this;
        }

        public Criteria andSv_repeatLessThan(Byte value) {
            addCriterion("sv_repeat <", value, "sv_repeat");
            return (Criteria) this;
        }

        public Criteria andSv_repeatLessThanOrEqualTo(Byte value) {
            addCriterion("sv_repeat <=", value, "sv_repeat");
            return (Criteria) this;
        }

        public Criteria andSv_repeatIn(List<Byte> values) {
            addCriterion("sv_repeat in", values, "sv_repeat");
            return (Criteria) this;
        }

        public Criteria andSv_repeatNotIn(List<Byte> values) {
            addCriterion("sv_repeat not in", values, "sv_repeat");
            return (Criteria) this;
        }

        public Criteria andSv_repeatBetween(Byte value1, Byte value2) {
            addCriterion("sv_repeat between", value1, value2, "sv_repeat");
            return (Criteria) this;
        }

        public Criteria andSv_repeatNotBetween(Byte value1, Byte value2) {
            addCriterion("sv_repeat not between", value1, value2, "sv_repeat");
            return (Criteria) this;
        }

        public Criteria andSv_codeIsNull() {
            addCriterion("sv_code is null");
            return (Criteria) this;
        }

        public Criteria andSv_codeIsNotNull() {
            addCriterion("sv_code is not null");
            return (Criteria) this;
        }

        public Criteria andSv_codeEqualTo(String value) {
            addCriterion("sv_code =", value, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_codeNotEqualTo(String value) {
            addCriterion("sv_code <>", value, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_codeGreaterThan(String value) {
            addCriterion("sv_code >", value, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_codeGreaterThanOrEqualTo(String value) {
            addCriterion("sv_code >=", value, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_codeLessThan(String value) {
            addCriterion("sv_code <", value, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_codeLessThanOrEqualTo(String value) {
            addCriterion("sv_code <=", value, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_codeLike(String value) {
            addCriterion("sv_code like", value, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_codeNotLike(String value) {
            addCriterion("sv_code not like", value, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_codeIn(List<String> values) {
            addCriterion("sv_code in", values, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_codeNotIn(List<String> values) {
            addCriterion("sv_code not in", values, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_codeBetween(String value1, String value2) {
            addCriterion("sv_code between", value1, value2, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_codeNotBetween(String value1, String value2) {
            addCriterion("sv_code not between", value1, value2, "sv_code");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeIsNull() {
            addCriterion("sv_sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeIsNotNull() {
            addCriterion("sv_sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeEqualTo(Date value) {
            addCriterion("sv_sendtime =", value, "sv_sendtime");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeNotEqualTo(Date value) {
            addCriterion("sv_sendtime <>", value, "sv_sendtime");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeGreaterThan(Date value) {
            addCriterion("sv_sendtime >", value, "sv_sendtime");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sv_sendtime >=", value, "sv_sendtime");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeLessThan(Date value) {
            addCriterion("sv_sendtime <", value, "sv_sendtime");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sv_sendtime <=", value, "sv_sendtime");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeIn(List<Date> values) {
            addCriterion("sv_sendtime in", values, "sv_sendtime");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeNotIn(List<Date> values) {
            addCriterion("sv_sendtime not in", values, "sv_sendtime");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeBetween(Date value1, Date value2) {
            addCriterion("sv_sendtime between", value1, value2, "sv_sendtime");
            return (Criteria) this;
        }

        public Criteria andSv_sendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sv_sendtime not between", value1, value2, "sv_sendtime");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeIsNull() {
            addCriterion("sv_verifytime is null");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeIsNotNull() {
            addCriterion("sv_verifytime is not null");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeEqualTo(Date value) {
            addCriterion("sv_verifytime =", value, "sv_verifytime");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeNotEqualTo(Date value) {
            addCriterion("sv_verifytime <>", value, "sv_verifytime");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeGreaterThan(Date value) {
            addCriterion("sv_verifytime >", value, "sv_verifytime");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sv_verifytime >=", value, "sv_verifytime");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeLessThan(Date value) {
            addCriterion("sv_verifytime <", value, "sv_verifytime");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeLessThanOrEqualTo(Date value) {
            addCriterion("sv_verifytime <=", value, "sv_verifytime");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeIn(List<Date> values) {
            addCriterion("sv_verifytime in", values, "sv_verifytime");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeNotIn(List<Date> values) {
            addCriterion("sv_verifytime not in", values, "sv_verifytime");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeBetween(Date value1, Date value2) {
            addCriterion("sv_verifytime between", value1, value2, "sv_verifytime");
            return (Criteria) this;
        }

        public Criteria andSv_verifytimeNotBetween(Date value1, Date value2) {
            addCriterion("sv_verifytime not between", value1, value2, "sv_verifytime");
            return (Criteria) this;
        }

        public Criteria andSv_statusIsNull() {
            addCriterion("sv_status is null");
            return (Criteria) this;
        }

        public Criteria andSv_statusIsNotNull() {
            addCriterion("sv_status is not null");
            return (Criteria) this;
        }

        public Criteria andSv_statusEqualTo(Byte value) {
            addCriterion("sv_status =", value, "sv_status");
            return (Criteria) this;
        }

        public Criteria andSv_statusNotEqualTo(Byte value) {
            addCriterion("sv_status <>", value, "sv_status");
            return (Criteria) this;
        }

        public Criteria andSv_statusGreaterThan(Byte value) {
            addCriterion("sv_status >", value, "sv_status");
            return (Criteria) this;
        }

        public Criteria andSv_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sv_status >=", value, "sv_status");
            return (Criteria) this;
        }

        public Criteria andSv_statusLessThan(Byte value) {
            addCriterion("sv_status <", value, "sv_status");
            return (Criteria) this;
        }

        public Criteria andSv_statusLessThanOrEqualTo(Byte value) {
            addCriterion("sv_status <=", value, "sv_status");
            return (Criteria) this;
        }

        public Criteria andSv_statusIn(List<Byte> values) {
            addCriterion("sv_status in", values, "sv_status");
            return (Criteria) this;
        }

        public Criteria andSv_statusNotIn(List<Byte> values) {
            addCriterion("sv_status not in", values, "sv_status");
            return (Criteria) this;
        }

        public Criteria andSv_statusBetween(Byte value1, Byte value2) {
            addCriterion("sv_status between", value1, value2, "sv_status");
            return (Criteria) this;
        }

        public Criteria andSv_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("sv_status not between", value1, value2, "sv_status");
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