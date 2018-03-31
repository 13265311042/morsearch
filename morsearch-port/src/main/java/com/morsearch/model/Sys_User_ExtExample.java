package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class Sys_User_ExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_User_ExtExample() {
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

        public Criteria andUe_useridIsNull() {
            addCriterion("ue_userid is null");
            return (Criteria) this;
        }

        public Criteria andUe_useridIsNotNull() {
            addCriterion("ue_userid is not null");
            return (Criteria) this;
        }

        public Criteria andUe_useridEqualTo(Long value) {
            addCriterion("ue_userid =", value, "ue_userid");
            return (Criteria) this;
        }

        public Criteria andUe_useridNotEqualTo(Long value) {
            addCriterion("ue_userid <>", value, "ue_userid");
            return (Criteria) this;
        }

        public Criteria andUe_useridGreaterThan(Long value) {
            addCriterion("ue_userid >", value, "ue_userid");
            return (Criteria) this;
        }

        public Criteria andUe_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("ue_userid >=", value, "ue_userid");
            return (Criteria) this;
        }

        public Criteria andUe_useridLessThan(Long value) {
            addCriterion("ue_userid <", value, "ue_userid");
            return (Criteria) this;
        }

        public Criteria andUe_useridLessThanOrEqualTo(Long value) {
            addCriterion("ue_userid <=", value, "ue_userid");
            return (Criteria) this;
        }

        public Criteria andUe_useridIn(List<Long> values) {
            addCriterion("ue_userid in", values, "ue_userid");
            return (Criteria) this;
        }

        public Criteria andUe_useridNotIn(List<Long> values) {
            addCriterion("ue_userid not in", values, "ue_userid");
            return (Criteria) this;
        }

        public Criteria andUe_useridBetween(Long value1, Long value2) {
            addCriterion("ue_userid between", value1, value2, "ue_userid");
            return (Criteria) this;
        }

        public Criteria andUe_useridNotBetween(Long value1, Long value2) {
            addCriterion("ue_userid not between", value1, value2, "ue_userid");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonIsNull() {
            addCriterion("ue_forbidreason is null");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonIsNotNull() {
            addCriterion("ue_forbidreason is not null");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonEqualTo(String value) {
            addCriterion("ue_forbidreason =", value, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonNotEqualTo(String value) {
            addCriterion("ue_forbidreason <>", value, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonGreaterThan(String value) {
            addCriterion("ue_forbidreason >", value, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonGreaterThanOrEqualTo(String value) {
            addCriterion("ue_forbidreason >=", value, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonLessThan(String value) {
            addCriterion("ue_forbidreason <", value, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonLessThanOrEqualTo(String value) {
            addCriterion("ue_forbidreason <=", value, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonLike(String value) {
            addCriterion("ue_forbidreason like", value, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonNotLike(String value) {
            addCriterion("ue_forbidreason not like", value, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonIn(List<String> values) {
            addCriterion("ue_forbidreason in", values, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonNotIn(List<String> values) {
            addCriterion("ue_forbidreason not in", values, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonBetween(String value1, String value2) {
            addCriterion("ue_forbidreason between", value1, value2, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_forbidreasonNotBetween(String value1, String value2) {
            addCriterion("ue_forbidreason not between", value1, value2, "ue_forbidreason");
            return (Criteria) this;
        }

        public Criteria andUe_messageIsNull() {
            addCriterion("ue_message is null");
            return (Criteria) this;
        }

        public Criteria andUe_messageIsNotNull() {
            addCriterion("ue_message is not null");
            return (Criteria) this;
        }

        public Criteria andUe_messageEqualTo(String value) {
            addCriterion("ue_message =", value, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_messageNotEqualTo(String value) {
            addCriterion("ue_message <>", value, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_messageGreaterThan(String value) {
            addCriterion("ue_message >", value, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_messageGreaterThanOrEqualTo(String value) {
            addCriterion("ue_message >=", value, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_messageLessThan(String value) {
            addCriterion("ue_message <", value, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_messageLessThanOrEqualTo(String value) {
            addCriterion("ue_message <=", value, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_messageLike(String value) {
            addCriterion("ue_message like", value, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_messageNotLike(String value) {
            addCriterion("ue_message not like", value, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_messageIn(List<String> values) {
            addCriterion("ue_message in", values, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_messageNotIn(List<String> values) {
            addCriterion("ue_message not in", values, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_messageBetween(String value1, String value2) {
            addCriterion("ue_message between", value1, value2, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_messageNotBetween(String value1, String value2) {
            addCriterion("ue_message not between", value1, value2, "ue_message");
            return (Criteria) this;
        }

        public Criteria andUe_companyidIsNull() {
            addCriterion("ue_companyid is null");
            return (Criteria) this;
        }

        public Criteria andUe_companyidIsNotNull() {
            addCriterion("ue_companyid is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companyidEqualTo(Integer value) {
            addCriterion("ue_companyid =", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidNotEqualTo(Integer value) {
            addCriterion("ue_companyid <>", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidGreaterThan(Integer value) {
            addCriterion("ue_companyid >", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ue_companyid >=", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidLessThan(Integer value) {
            addCriterion("ue_companyid <", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidLessThanOrEqualTo(Integer value) {
            addCriterion("ue_companyid <=", value, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidIn(List<Integer> values) {
            addCriterion("ue_companyid in", values, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidNotIn(List<Integer> values) {
            addCriterion("ue_companyid not in", values, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidBetween(Integer value1, Integer value2) {
            addCriterion("ue_companyid between", value1, value2, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companyidNotBetween(Integer value1, Integer value2) {
            addCriterion("ue_companyid not between", value1, value2, "ue_companyid");
            return (Criteria) this;
        }

        public Criteria andUe_companynameIsNull() {
            addCriterion("ue_companyname is null");
            return (Criteria) this;
        }

        public Criteria andUe_companynameIsNotNull() {
            addCriterion("ue_companyname is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companynameEqualTo(String value) {
            addCriterion("ue_companyname =", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotEqualTo(String value) {
            addCriterion("ue_companyname <>", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameGreaterThan(String value) {
            addCriterion("ue_companyname >", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companyname >=", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameLessThan(String value) {
            addCriterion("ue_companyname <", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameLessThanOrEqualTo(String value) {
            addCriterion("ue_companyname <=", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameLike(String value) {
            addCriterion("ue_companyname like", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotLike(String value) {
            addCriterion("ue_companyname not like", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameIn(List<String> values) {
            addCriterion("ue_companyname in", values, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotIn(List<String> values) {
            addCriterion("ue_companyname not in", values, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameBetween(String value1, String value2) {
            addCriterion("ue_companyname between", value1, value2, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotBetween(String value1, String value2) {
            addCriterion("ue_companyname not between", value1, value2, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitIsNull() {
            addCriterion("ue_companyunit is null");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitIsNotNull() {
            addCriterion("ue_companyunit is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitEqualTo(String value) {
            addCriterion("ue_companyunit =", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotEqualTo(String value) {
            addCriterion("ue_companyunit <>", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitGreaterThan(String value) {
            addCriterion("ue_companyunit >", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companyunit >=", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitLessThan(String value) {
            addCriterion("ue_companyunit <", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitLessThanOrEqualTo(String value) {
            addCriterion("ue_companyunit <=", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitLike(String value) {
            addCriterion("ue_companyunit like", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotLike(String value) {
            addCriterion("ue_companyunit not like", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitIn(List<String> values) {
            addCriterion("ue_companyunit in", values, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotIn(List<String> values) {
            addCriterion("ue_companyunit not in", values, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitBetween(String value1, String value2) {
            addCriterion("ue_companyunit between", value1, value2, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotBetween(String value1, String value2) {
            addCriterion("ue_companyunit not between", value1, value2, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrIsNull() {
            addCriterion("ue_companyaddr is null");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrIsNotNull() {
            addCriterion("ue_companyaddr is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrEqualTo(String value) {
            addCriterion("ue_companyaddr =", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrNotEqualTo(String value) {
            addCriterion("ue_companyaddr <>", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrGreaterThan(String value) {
            addCriterion("ue_companyaddr >", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companyaddr >=", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrLessThan(String value) {
            addCriterion("ue_companyaddr <", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrLessThanOrEqualTo(String value) {
            addCriterion("ue_companyaddr <=", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrLike(String value) {
            addCriterion("ue_companyaddr like", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrNotLike(String value) {
            addCriterion("ue_companyaddr not like", value, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrIn(List<String> values) {
            addCriterion("ue_companyaddr in", values, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrNotIn(List<String> values) {
            addCriterion("ue_companyaddr not in", values, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrBetween(String value1, String value2) {
            addCriterion("ue_companyaddr between", value1, value2, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrNotBetween(String value1, String value2) {
            addCriterion("ue_companyaddr not between", value1, value2, "ue_companyaddr");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationIsNull() {
            addCriterion("ue_companyaddrlocation is null");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationIsNotNull() {
            addCriterion("ue_companyaddrlocation is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationEqualTo(String value) {
            addCriterion("ue_companyaddrlocation =", value, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationNotEqualTo(String value) {
            addCriterion("ue_companyaddrlocation <>", value, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationGreaterThan(String value) {
            addCriterion("ue_companyaddrlocation >", value, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companyaddrlocation >=", value, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationLessThan(String value) {
            addCriterion("ue_companyaddrlocation <", value, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationLessThanOrEqualTo(String value) {
            addCriterion("ue_companyaddrlocation <=", value, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationLike(String value) {
            addCriterion("ue_companyaddrlocation like", value, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationNotLike(String value) {
            addCriterion("ue_companyaddrlocation not like", value, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationIn(List<String> values) {
            addCriterion("ue_companyaddrlocation in", values, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationNotIn(List<String> values) {
            addCriterion("ue_companyaddrlocation not in", values, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationBetween(String value1, String value2) {
            addCriterion("ue_companyaddrlocation between", value1, value2, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrlocationNotBetween(String value1, String value2) {
            addCriterion("ue_companyaddrlocation not between", value1, value2, "ue_companyaddrlocation");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedIsNull() {
            addCriterion("ue_companyaddrdetailed is null");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedIsNotNull() {
            addCriterion("ue_companyaddrdetailed is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedEqualTo(String value) {
            addCriterion("ue_companyaddrdetailed =", value, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedNotEqualTo(String value) {
            addCriterion("ue_companyaddrdetailed <>", value, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedGreaterThan(String value) {
            addCriterion("ue_companyaddrdetailed >", value, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companyaddrdetailed >=", value, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedLessThan(String value) {
            addCriterion("ue_companyaddrdetailed <", value, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedLessThanOrEqualTo(String value) {
            addCriterion("ue_companyaddrdetailed <=", value, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedLike(String value) {
            addCriterion("ue_companyaddrdetailed like", value, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedNotLike(String value) {
            addCriterion("ue_companyaddrdetailed not like", value, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedIn(List<String> values) {
            addCriterion("ue_companyaddrdetailed in", values, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedNotIn(List<String> values) {
            addCriterion("ue_companyaddrdetailed not in", values, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedBetween(String value1, String value2) {
            addCriterion("ue_companyaddrdetailed between", value1, value2, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companyaddrdetailedNotBetween(String value1, String value2) {
            addCriterion("ue_companyaddrdetailed not between", value1, value2, "ue_companyaddrdetailed");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeIsNull() {
            addCriterion("ue_companylongitude is null");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeIsNotNull() {
            addCriterion("ue_companylongitude is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeEqualTo(String value) {
            addCriterion("ue_companylongitude =", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeNotEqualTo(String value) {
            addCriterion("ue_companylongitude <>", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeGreaterThan(String value) {
            addCriterion("ue_companylongitude >", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companylongitude >=", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeLessThan(String value) {
            addCriterion("ue_companylongitude <", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeLessThanOrEqualTo(String value) {
            addCriterion("ue_companylongitude <=", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeLike(String value) {
            addCriterion("ue_companylongitude like", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeNotLike(String value) {
            addCriterion("ue_companylongitude not like", value, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeIn(List<String> values) {
            addCriterion("ue_companylongitude in", values, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeNotIn(List<String> values) {
            addCriterion("ue_companylongitude not in", values, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeBetween(String value1, String value2) {
            addCriterion("ue_companylongitude between", value1, value2, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylongitudeNotBetween(String value1, String value2) {
            addCriterion("ue_companylongitude not between", value1, value2, "ue_companylongitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeIsNull() {
            addCriterion("ue_companylatitude is null");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeIsNotNull() {
            addCriterion("ue_companylatitude is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeEqualTo(String value) {
            addCriterion("ue_companylatitude =", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeNotEqualTo(String value) {
            addCriterion("ue_companylatitude <>", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeGreaterThan(String value) {
            addCriterion("ue_companylatitude >", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companylatitude >=", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeLessThan(String value) {
            addCriterion("ue_companylatitude <", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeLessThanOrEqualTo(String value) {
            addCriterion("ue_companylatitude <=", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeLike(String value) {
            addCriterion("ue_companylatitude like", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeNotLike(String value) {
            addCriterion("ue_companylatitude not like", value, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeIn(List<String> values) {
            addCriterion("ue_companylatitude in", values, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeNotIn(List<String> values) {
            addCriterion("ue_companylatitude not in", values, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeBetween(String value1, String value2) {
            addCriterion("ue_companylatitude between", value1, value2, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companylatitudeNotBetween(String value1, String value2) {
            addCriterion("ue_companylatitude not between", value1, value2, "ue_companylatitude");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeIsNull() {
            addCriterion("ue_companytype is null");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeIsNotNull() {
            addCriterion("ue_companytype is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeEqualTo(String value) {
            addCriterion("ue_companytype =", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeNotEqualTo(String value) {
            addCriterion("ue_companytype <>", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeGreaterThan(String value) {
            addCriterion("ue_companytype >", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companytype >=", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeLessThan(String value) {
            addCriterion("ue_companytype <", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeLessThanOrEqualTo(String value) {
            addCriterion("ue_companytype <=", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeLike(String value) {
            addCriterion("ue_companytype like", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeNotLike(String value) {
            addCriterion("ue_companytype not like", value, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeIn(List<String> values) {
            addCriterion("ue_companytype in", values, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeNotIn(List<String> values) {
            addCriterion("ue_companytype not in", values, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeBetween(String value1, String value2) {
            addCriterion("ue_companytype between", value1, value2, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companytypeNotBetween(String value1, String value2) {
            addCriterion("ue_companytype not between", value1, value2, "ue_companytype");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandIsNull() {
            addCriterion("ue_companybrand is null");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandIsNotNull() {
            addCriterion("ue_companybrand is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandEqualTo(String value) {
            addCriterion("ue_companybrand =", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandNotEqualTo(String value) {
            addCriterion("ue_companybrand <>", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandGreaterThan(String value) {
            addCriterion("ue_companybrand >", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companybrand >=", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandLessThan(String value) {
            addCriterion("ue_companybrand <", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandLessThanOrEqualTo(String value) {
            addCriterion("ue_companybrand <=", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandLike(String value) {
            addCriterion("ue_companybrand like", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandNotLike(String value) {
            addCriterion("ue_companybrand not like", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandIn(List<String> values) {
            addCriterion("ue_companybrand in", values, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandNotIn(List<String> values) {
            addCriterion("ue_companybrand not in", values, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandBetween(String value1, String value2) {
            addCriterion("ue_companybrand between", value1, value2, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandNotBetween(String value1, String value2) {
            addCriterion("ue_companybrand not between", value1, value2, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeIsNull() {
            addCriterion("ue_teamlongitude is null");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeIsNotNull() {
            addCriterion("ue_teamlongitude is not null");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeEqualTo(String value) {
            addCriterion("ue_teamlongitude =", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeNotEqualTo(String value) {
            addCriterion("ue_teamlongitude <>", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeGreaterThan(String value) {
            addCriterion("ue_teamlongitude >", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_teamlongitude >=", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeLessThan(String value) {
            addCriterion("ue_teamlongitude <", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeLessThanOrEqualTo(String value) {
            addCriterion("ue_teamlongitude <=", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeLike(String value) {
            addCriterion("ue_teamlongitude like", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeNotLike(String value) {
            addCriterion("ue_teamlongitude not like", value, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeIn(List<String> values) {
            addCriterion("ue_teamlongitude in", values, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeNotIn(List<String> values) {
            addCriterion("ue_teamlongitude not in", values, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeBetween(String value1, String value2) {
            addCriterion("ue_teamlongitude between", value1, value2, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlongitudeNotBetween(String value1, String value2) {
            addCriterion("ue_teamlongitude not between", value1, value2, "ue_teamlongitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeIsNull() {
            addCriterion("ue_teamlatitude is null");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeIsNotNull() {
            addCriterion("ue_teamlatitude is not null");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeEqualTo(String value) {
            addCriterion("ue_teamlatitude =", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeNotEqualTo(String value) {
            addCriterion("ue_teamlatitude <>", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeGreaterThan(String value) {
            addCriterion("ue_teamlatitude >", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_teamlatitude >=", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeLessThan(String value) {
            addCriterion("ue_teamlatitude <", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeLessThanOrEqualTo(String value) {
            addCriterion("ue_teamlatitude <=", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeLike(String value) {
            addCriterion("ue_teamlatitude like", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeNotLike(String value) {
            addCriterion("ue_teamlatitude not like", value, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeIn(List<String> values) {
            addCriterion("ue_teamlatitude in", values, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeNotIn(List<String> values) {
            addCriterion("ue_teamlatitude not in", values, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeBetween(String value1, String value2) {
            addCriterion("ue_teamlatitude between", value1, value2, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_teamlatitudeNotBetween(String value1, String value2) {
            addCriterion("ue_teamlatitude not between", value1, value2, "ue_teamlatitude");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorIsNull() {
            addCriterion("ue_personmajor is null");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorIsNotNull() {
            addCriterion("ue_personmajor is not null");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorEqualTo(String value) {
            addCriterion("ue_personmajor =", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotEqualTo(String value) {
            addCriterion("ue_personmajor <>", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorGreaterThan(String value) {
            addCriterion("ue_personmajor >", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorGreaterThanOrEqualTo(String value) {
            addCriterion("ue_personmajor >=", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorLessThan(String value) {
            addCriterion("ue_personmajor <", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorLessThanOrEqualTo(String value) {
            addCriterion("ue_personmajor <=", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorLike(String value) {
            addCriterion("ue_personmajor like", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotLike(String value) {
            addCriterion("ue_personmajor not like", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorIn(List<String> values) {
            addCriterion("ue_personmajor in", values, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotIn(List<String> values) {
            addCriterion("ue_personmajor not in", values, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorBetween(String value1, String value2) {
            addCriterion("ue_personmajor between", value1, value2, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotBetween(String value1, String value2) {
            addCriterion("ue_personmajor not between", value1, value2, "ue_personmajor");
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

        public Criteria andUe_personlevelIsNull() {
            addCriterion("ue_personlevel is null");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelIsNotNull() {
            addCriterion("ue_personlevel is not null");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelEqualTo(String value) {
            addCriterion("ue_personlevel =", value, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelNotEqualTo(String value) {
            addCriterion("ue_personlevel <>", value, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelGreaterThan(String value) {
            addCriterion("ue_personlevel >", value, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelGreaterThanOrEqualTo(String value) {
            addCriterion("ue_personlevel >=", value, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelLessThan(String value) {
            addCriterion("ue_personlevel <", value, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelLessThanOrEqualTo(String value) {
            addCriterion("ue_personlevel <=", value, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelLike(String value) {
            addCriterion("ue_personlevel like", value, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelNotLike(String value) {
            addCriterion("ue_personlevel not like", value, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelIn(List<String> values) {
            addCriterion("ue_personlevel in", values, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelNotIn(List<String> values) {
            addCriterion("ue_personlevel not in", values, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelBetween(String value1, String value2) {
            addCriterion("ue_personlevel between", value1, value2, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personlevelNotBetween(String value1, String value2) {
            addCriterion("ue_personlevel not between", value1, value2, "ue_personlevel");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageIsNull() {
            addCriterion("ue_personworkage is null");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageIsNotNull() {
            addCriterion("ue_personworkage is not null");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageEqualTo(String value) {
            addCriterion("ue_personworkage =", value, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageNotEqualTo(String value) {
            addCriterion("ue_personworkage <>", value, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageGreaterThan(String value) {
            addCriterion("ue_personworkage >", value, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageGreaterThanOrEqualTo(String value) {
            addCriterion("ue_personworkage >=", value, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageLessThan(String value) {
            addCriterion("ue_personworkage <", value, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageLessThanOrEqualTo(String value) {
            addCriterion("ue_personworkage <=", value, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageLike(String value) {
            addCriterion("ue_personworkage like", value, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageNotLike(String value) {
            addCriterion("ue_personworkage not like", value, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageIn(List<String> values) {
            addCriterion("ue_personworkage in", values, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageNotIn(List<String> values) {
            addCriterion("ue_personworkage not in", values, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageBetween(String value1, String value2) {
            addCriterion("ue_personworkage between", value1, value2, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_personworkageNotBetween(String value1, String value2) {
            addCriterion("ue_personworkage not between", value1, value2, "ue_personworkage");
            return (Criteria) this;
        }

        public Criteria andUe_willcityIsNull() {
            addCriterion("ue_willcity is null");
            return (Criteria) this;
        }

        public Criteria andUe_willcityIsNotNull() {
            addCriterion("ue_willcity is not null");
            return (Criteria) this;
        }

        public Criteria andUe_willcityEqualTo(String value) {
            addCriterion("ue_willcity =", value, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willcityNotEqualTo(String value) {
            addCriterion("ue_willcity <>", value, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willcityGreaterThan(String value) {
            addCriterion("ue_willcity >", value, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willcityGreaterThanOrEqualTo(String value) {
            addCriterion("ue_willcity >=", value, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willcityLessThan(String value) {
            addCriterion("ue_willcity <", value, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willcityLessThanOrEqualTo(String value) {
            addCriterion("ue_willcity <=", value, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willcityLike(String value) {
            addCriterion("ue_willcity like", value, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willcityNotLike(String value) {
            addCriterion("ue_willcity not like", value, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willcityIn(List<String> values) {
            addCriterion("ue_willcity in", values, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willcityNotIn(List<String> values) {
            addCriterion("ue_willcity not in", values, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willcityBetween(String value1, String value2) {
            addCriterion("ue_willcity between", value1, value2, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willcityNotBetween(String value1, String value2) {
            addCriterion("ue_willcity not between", value1, value2, "ue_willcity");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeIsNull() {
            addCriterion("ue_willtype is null");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeIsNotNull() {
            addCriterion("ue_willtype is not null");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeEqualTo(String value) {
            addCriterion("ue_willtype =", value, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeNotEqualTo(String value) {
            addCriterion("ue_willtype <>", value, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeGreaterThan(String value) {
            addCriterion("ue_willtype >", value, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_willtype >=", value, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeLessThan(String value) {
            addCriterion("ue_willtype <", value, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeLessThanOrEqualTo(String value) {
            addCriterion("ue_willtype <=", value, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeLike(String value) {
            addCriterion("ue_willtype like", value, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeNotLike(String value) {
            addCriterion("ue_willtype not like", value, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeIn(List<String> values) {
            addCriterion("ue_willtype in", values, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeNotIn(List<String> values) {
            addCriterion("ue_willtype not in", values, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeBetween(String value1, String value2) {
            addCriterion("ue_willtype between", value1, value2, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willtypeNotBetween(String value1, String value2) {
            addCriterion("ue_willtype not between", value1, value2, "ue_willtype");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorIsNull() {
            addCriterion("ue_willmajor is null");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorIsNotNull() {
            addCriterion("ue_willmajor is not null");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorEqualTo(String value) {
            addCriterion("ue_willmajor =", value, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorNotEqualTo(String value) {
            addCriterion("ue_willmajor <>", value, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorGreaterThan(String value) {
            addCriterion("ue_willmajor >", value, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorGreaterThanOrEqualTo(String value) {
            addCriterion("ue_willmajor >=", value, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorLessThan(String value) {
            addCriterion("ue_willmajor <", value, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorLessThanOrEqualTo(String value) {
            addCriterion("ue_willmajor <=", value, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorLike(String value) {
            addCriterion("ue_willmajor like", value, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorNotLike(String value) {
            addCriterion("ue_willmajor not like", value, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorIn(List<String> values) {
            addCriterion("ue_willmajor in", values, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorNotIn(List<String> values) {
            addCriterion("ue_willmajor not in", values, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorBetween(String value1, String value2) {
            addCriterion("ue_willmajor between", value1, value2, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willmajorNotBetween(String value1, String value2) {
            addCriterion("ue_willmajor not between", value1, value2, "ue_willmajor");
            return (Criteria) this;
        }

        public Criteria andUe_willjobIsNull() {
            addCriterion("ue_willjob is null");
            return (Criteria) this;
        }

        public Criteria andUe_willjobIsNotNull() {
            addCriterion("ue_willjob is not null");
            return (Criteria) this;
        }

        public Criteria andUe_willjobEqualTo(String value) {
            addCriterion("ue_willjob =", value, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willjobNotEqualTo(String value) {
            addCriterion("ue_willjob <>", value, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willjobGreaterThan(String value) {
            addCriterion("ue_willjob >", value, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willjobGreaterThanOrEqualTo(String value) {
            addCriterion("ue_willjob >=", value, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willjobLessThan(String value) {
            addCriterion("ue_willjob <", value, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willjobLessThanOrEqualTo(String value) {
            addCriterion("ue_willjob <=", value, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willjobLike(String value) {
            addCriterion("ue_willjob like", value, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willjobNotLike(String value) {
            addCriterion("ue_willjob not like", value, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willjobIn(List<String> values) {
            addCriterion("ue_willjob in", values, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willjobNotIn(List<String> values) {
            addCriterion("ue_willjob not in", values, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willjobBetween(String value1, String value2) {
            addCriterion("ue_willjob between", value1, value2, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willjobNotBetween(String value1, String value2) {
            addCriterion("ue_willjob not between", value1, value2, "ue_willjob");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelIsNull() {
            addCriterion("ue_willlevel is null");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelIsNotNull() {
            addCriterion("ue_willlevel is not null");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelEqualTo(String value) {
            addCriterion("ue_willlevel =", value, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelNotEqualTo(String value) {
            addCriterion("ue_willlevel <>", value, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelGreaterThan(String value) {
            addCriterion("ue_willlevel >", value, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelGreaterThanOrEqualTo(String value) {
            addCriterion("ue_willlevel >=", value, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelLessThan(String value) {
            addCriterion("ue_willlevel <", value, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelLessThanOrEqualTo(String value) {
            addCriterion("ue_willlevel <=", value, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelLike(String value) {
            addCriterion("ue_willlevel like", value, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelNotLike(String value) {
            addCriterion("ue_willlevel not like", value, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelIn(List<String> values) {
            addCriterion("ue_willlevel in", values, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelNotIn(List<String> values) {
            addCriterion("ue_willlevel not in", values, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelBetween(String value1, String value2) {
            addCriterion("ue_willlevel between", value1, value2, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_willlevelNotBetween(String value1, String value2) {
            addCriterion("ue_willlevel not between", value1, value2, "ue_willlevel");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductIsNull() {
            addCriterion("ue_tagproduct is null");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductIsNotNull() {
            addCriterion("ue_tagproduct is not null");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductEqualTo(String value) {
            addCriterion("ue_tagproduct =", value, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductNotEqualTo(String value) {
            addCriterion("ue_tagproduct <>", value, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductGreaterThan(String value) {
            addCriterion("ue_tagproduct >", value, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductGreaterThanOrEqualTo(String value) {
            addCriterion("ue_tagproduct >=", value, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductLessThan(String value) {
            addCriterion("ue_tagproduct <", value, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductLessThanOrEqualTo(String value) {
            addCriterion("ue_tagproduct <=", value, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductLike(String value) {
            addCriterion("ue_tagproduct like", value, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductNotLike(String value) {
            addCriterion("ue_tagproduct not like", value, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductIn(List<String> values) {
            addCriterion("ue_tagproduct in", values, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductNotIn(List<String> values) {
            addCriterion("ue_tagproduct not in", values, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductBetween(String value1, String value2) {
            addCriterion("ue_tagproduct between", value1, value2, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagproductNotBetween(String value1, String value2) {
            addCriterion("ue_tagproduct not between", value1, value2, "ue_tagproduct");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerIsNull() {
            addCriterion("ue_tagcustomer is null");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerIsNotNull() {
            addCriterion("ue_tagcustomer is not null");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerEqualTo(String value) {
            addCriterion("ue_tagcustomer =", value, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerNotEqualTo(String value) {
            addCriterion("ue_tagcustomer <>", value, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerGreaterThan(String value) {
            addCriterion("ue_tagcustomer >", value, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerGreaterThanOrEqualTo(String value) {
            addCriterion("ue_tagcustomer >=", value, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerLessThan(String value) {
            addCriterion("ue_tagcustomer <", value, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerLessThanOrEqualTo(String value) {
            addCriterion("ue_tagcustomer <=", value, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerLike(String value) {
            addCriterion("ue_tagcustomer like", value, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerNotLike(String value) {
            addCriterion("ue_tagcustomer not like", value, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerIn(List<String> values) {
            addCriterion("ue_tagcustomer in", values, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerNotIn(List<String> values) {
            addCriterion("ue_tagcustomer not in", values, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerBetween(String value1, String value2) {
            addCriterion("ue_tagcustomer between", value1, value2, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_tagcustomerNotBetween(String value1, String value2) {
            addCriterion("ue_tagcustomer not between", value1, value2, "ue_tagcustomer");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeIsNull() {
            addCriterion("ue_dynamiccode is null");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeIsNotNull() {
            addCriterion("ue_dynamiccode is not null");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeEqualTo(String value) {
            addCriterion("ue_dynamiccode =", value, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeNotEqualTo(String value) {
            addCriterion("ue_dynamiccode <>", value, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeGreaterThan(String value) {
            addCriterion("ue_dynamiccode >", value, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeGreaterThanOrEqualTo(String value) {
            addCriterion("ue_dynamiccode >=", value, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeLessThan(String value) {
            addCriterion("ue_dynamiccode <", value, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeLessThanOrEqualTo(String value) {
            addCriterion("ue_dynamiccode <=", value, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeLike(String value) {
            addCriterion("ue_dynamiccode like", value, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeNotLike(String value) {
            addCriterion("ue_dynamiccode not like", value, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeIn(List<String> values) {
            addCriterion("ue_dynamiccode in", values, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeNotIn(List<String> values) {
            addCriterion("ue_dynamiccode not in", values, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeBetween(String value1, String value2) {
            addCriterion("ue_dynamiccode between", value1, value2, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_dynamiccodeNotBetween(String value1, String value2) {
            addCriterion("ue_dynamiccode not between", value1, value2, "ue_dynamiccode");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyIsNull() {
            addCriterion("ue_needqty is null");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyIsNotNull() {
            addCriterion("ue_needqty is not null");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyEqualTo(Integer value) {
            addCriterion("ue_needqty =", value, "ue_needqty");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyNotEqualTo(Integer value) {
            addCriterion("ue_needqty <>", value, "ue_needqty");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyGreaterThan(Integer value) {
            addCriterion("ue_needqty >", value, "ue_needqty");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ue_needqty >=", value, "ue_needqty");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyLessThan(Integer value) {
            addCriterion("ue_needqty <", value, "ue_needqty");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyLessThanOrEqualTo(Integer value) {
            addCriterion("ue_needqty <=", value, "ue_needqty");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyIn(List<Integer> values) {
            addCriterion("ue_needqty in", values, "ue_needqty");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyNotIn(List<Integer> values) {
            addCriterion("ue_needqty not in", values, "ue_needqty");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyBetween(Integer value1, Integer value2) {
            addCriterion("ue_needqty between", value1, value2, "ue_needqty");
            return (Criteria) this;
        }

        public Criteria andUe_needqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("ue_needqty not between", value1, value2, "ue_needqty");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowIsNull() {
            addCriterion("ue_flagallow is null");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowIsNotNull() {
            addCriterion("ue_flagallow is not null");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowEqualTo(Byte value) {
            addCriterion("ue_flagallow =", value, "ue_flagallow");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowNotEqualTo(Byte value) {
            addCriterion("ue_flagallow <>", value, "ue_flagallow");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowGreaterThan(Byte value) {
            addCriterion("ue_flagallow >", value, "ue_flagallow");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowGreaterThanOrEqualTo(Byte value) {
            addCriterion("ue_flagallow >=", value, "ue_flagallow");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowLessThan(Byte value) {
            addCriterion("ue_flagallow <", value, "ue_flagallow");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowLessThanOrEqualTo(Byte value) {
            addCriterion("ue_flagallow <=", value, "ue_flagallow");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowIn(List<Byte> values) {
            addCriterion("ue_flagallow in", values, "ue_flagallow");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowNotIn(List<Byte> values) {
            addCriterion("ue_flagallow not in", values, "ue_flagallow");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowBetween(Byte value1, Byte value2) {
            addCriterion("ue_flagallow between", value1, value2, "ue_flagallow");
            return (Criteria) this;
        }

        public Criteria andUe_flagallowNotBetween(Byte value1, Byte value2) {
            addCriterion("ue_flagallow not between", value1, value2, "ue_flagallow");
            return (Criteria) this;
        }

        public Criteria andUe_remarkIsNull() {
            addCriterion("ue_remark is null");
            return (Criteria) this;
        }

        public Criteria andUe_remarkIsNotNull() {
            addCriterion("ue_remark is not null");
            return (Criteria) this;
        }

        public Criteria andUe_remarkEqualTo(String value) {
            addCriterion("ue_remark =", value, "ue_remark");
            return (Criteria) this;
        }

        public Criteria andUe_remarkNotEqualTo(String value) {
            addCriterion("ue_remark <>", value, "ue_remark");
            return (Criteria) this;
        }

        public Criteria andUe_remarkGreaterThan(String value) {
            addCriterion("ue_remark >", value, "ue_remark");
            return (Criteria) this;
        }

        public Criteria andUe_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("ue_remark >=", value, "ue_remark");
            return (Criteria) this;
        }

        public Criteria andUe_remarkLessThan(String value) {
            addCriterion("ue_remark <", value, "ue_remark");
            return (Criteria) this;
        }

        public Criteria andUe_remarkLessThanOrEqualTo(String value) {
            addCriterion("ue_remark <=", value, "ue_remark");
            return (Criteria) this;
        }

        public Criteria andUe_remarkLike(String value) {
            addCriterion("ue_remark like", value, "ue_remark");
            return (Criteria) this;
        }

        public Criteria andUe_remarkNotLike(String value) {
            addCriterion("ue_remark not like", value, "ue_remark");
            return (Criteria) this;
        }

        public Criteria andUe_remarkIn(List<String> values) {
            addCriterion("ue_remark in", values, "ue_remark");
            return (Criteria) this;
        }

        public Criteria andUe_remarkNotIn(List<String> values) {
            addCriterion("ue_remark not in", values, "ue_remark");
            return (Criteria) this;
        }

        public Criteria andUe_remarkBetween(String value1, String value2) {
            addCriterion("ue_remark between", value1, value2, "ue_remark");
            return (Criteria) this;
        }

        public Criteria andUe_remarkNotBetween(String value1, String value2) {
            addCriterion("ue_remark not between", value1, value2, "ue_remark");
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