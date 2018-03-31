package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesV_Order_MsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesV_Order_MsgExample() {
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

        public Criteria andOf_dateupdateIsNull() {
            addCriterion("of_dateupdate is null");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateIsNotNull() {
            addCriterion("of_dateupdate is not null");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateEqualTo(Date value) {
            addCriterion("of_dateupdate =", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateNotEqualTo(Date value) {
            addCriterion("of_dateupdate <>", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateGreaterThan(Date value) {
            addCriterion("of_dateupdate >", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("of_dateupdate >=", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateLessThan(Date value) {
            addCriterion("of_dateupdate <", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateLessThanOrEqualTo(Date value) {
            addCriterion("of_dateupdate <=", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateIn(List<Date> values) {
            addCriterion("of_dateupdate in", values, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateNotIn(List<Date> values) {
            addCriterion("of_dateupdate not in", values, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateBetween(Date value1, Date value2) {
            addCriterion("of_dateupdate between", value1, value2, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateNotBetween(Date value1, Date value2) {
            addCriterion("of_dateupdate not between", value1, value2, "of_dateupdate");
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

        public Criteria andOf_talklastmsgIsNull() {
            addCriterion("of_talklastmsg is null");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgIsNotNull() {
            addCriterion("of_talklastmsg is not null");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgEqualTo(String value) {
            addCriterion("of_talklastmsg =", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgNotEqualTo(String value) {
            addCriterion("of_talklastmsg <>", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgGreaterThan(String value) {
            addCriterion("of_talklastmsg >", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgGreaterThanOrEqualTo(String value) {
            addCriterion("of_talklastmsg >=", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgLessThan(String value) {
            addCriterion("of_talklastmsg <", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgLessThanOrEqualTo(String value) {
            addCriterion("of_talklastmsg <=", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgLike(String value) {
            addCriterion("of_talklastmsg like", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgNotLike(String value) {
            addCriterion("of_talklastmsg not like", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgIn(List<String> values) {
            addCriterion("of_talklastmsg in", values, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgNotIn(List<String> values) {
            addCriterion("of_talklastmsg not in", values, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgBetween(String value1, String value2) {
            addCriterion("of_talklastmsg between", value1, value2, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgNotBetween(String value1, String value2) {
            addCriterion("of_talklastmsg not between", value1, value2, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsIsNull() {
            addCriterion("of_checkmsgs is null");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsIsNotNull() {
            addCriterion("of_checkmsgs is not null");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsEqualTo(Boolean value) {
            addCriterion("of_checkmsgs =", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsNotEqualTo(Boolean value) {
            addCriterion("of_checkmsgs <>", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsGreaterThan(Boolean value) {
            addCriterion("of_checkmsgs >", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_checkmsgs >=", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsLessThan(Boolean value) {
            addCriterion("of_checkmsgs <", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsLessThanOrEqualTo(Boolean value) {
            addCriterion("of_checkmsgs <=", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsIn(List<Boolean> values) {
            addCriterion("of_checkmsgs in", values, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsNotIn(List<Boolean> values) {
            addCriterion("of_checkmsgs not in", values, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsBetween(Boolean value1, Boolean value2) {
            addCriterion("of_checkmsgs between", value1, value2, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_checkmsgs not between", value1, value2, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdIsNull() {
            addCriterion("of_checkmsgd is null");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdIsNotNull() {
            addCriterion("of_checkmsgd is not null");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdEqualTo(Boolean value) {
            addCriterion("of_checkmsgd =", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdNotEqualTo(Boolean value) {
            addCriterion("of_checkmsgd <>", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdGreaterThan(Boolean value) {
            addCriterion("of_checkmsgd >", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_checkmsgd >=", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdLessThan(Boolean value) {
            addCriterion("of_checkmsgd <", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdLessThanOrEqualTo(Boolean value) {
            addCriterion("of_checkmsgd <=", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdIn(List<Boolean> values) {
            addCriterion("of_checkmsgd in", values, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdNotIn(List<Boolean> values) {
            addCriterion("of_checkmsgd not in", values, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdBetween(Boolean value1, Boolean value2) {
            addCriterion("of_checkmsgd between", value1, value2, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_checkmsgd not between", value1, value2, "of_checkmsgd");
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