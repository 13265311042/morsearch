package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AwardV_Share_CountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AwardV_Share_CountExample() {
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

        public Criteria andSc_idIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andSc_idIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSc_idEqualTo(Long value) {
            addCriterion("sc_id =", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotEqualTo(Long value) {
            addCriterion("sc_id <>", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idGreaterThan(Long value) {
            addCriterion("sc_id >", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_id >=", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idLessThan(Long value) {
            addCriterion("sc_id <", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idLessThanOrEqualTo(Long value) {
            addCriterion("sc_id <=", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idIn(List<Long> values) {
            addCriterion("sc_id in", values, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotIn(List<Long> values) {
            addCriterion("sc_id not in", values, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idBetween(Long value1, Long value2) {
            addCriterion("sc_id between", value1, value2, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotBetween(Long value1, Long value2) {
            addCriterion("sc_id not between", value1, value2, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_activityidIsNull() {
            addCriterion("sc_activityid is null");
            return (Criteria) this;
        }

        public Criteria andSc_activityidIsNotNull() {
            addCriterion("sc_activityid is not null");
            return (Criteria) this;
        }

        public Criteria andSc_activityidEqualTo(Long value) {
            addCriterion("sc_activityid =", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidNotEqualTo(Long value) {
            addCriterion("sc_activityid <>", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidGreaterThan(Long value) {
            addCriterion("sc_activityid >", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_activityid >=", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidLessThan(Long value) {
            addCriterion("sc_activityid <", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidLessThanOrEqualTo(Long value) {
            addCriterion("sc_activityid <=", value, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidIn(List<Long> values) {
            addCriterion("sc_activityid in", values, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidNotIn(List<Long> values) {
            addCriterion("sc_activityid not in", values, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidBetween(Long value1, Long value2) {
            addCriterion("sc_activityid between", value1, value2, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_activityidNotBetween(Long value1, Long value2) {
            addCriterion("sc_activityid not between", value1, value2, "sc_activityid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridIsNull() {
            addCriterion("sc_share_userid is null");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridIsNotNull() {
            addCriterion("sc_share_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridEqualTo(Long value) {
            addCriterion("sc_share_userid =", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridNotEqualTo(Long value) {
            addCriterion("sc_share_userid <>", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridGreaterThan(Long value) {
            addCriterion("sc_share_userid >", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_share_userid >=", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridLessThan(Long value) {
            addCriterion("sc_share_userid <", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridLessThanOrEqualTo(Long value) {
            addCriterion("sc_share_userid <=", value, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridIn(List<Long> values) {
            addCriterion("sc_share_userid in", values, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridNotIn(List<Long> values) {
            addCriterion("sc_share_userid not in", values, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridBetween(Long value1, Long value2) {
            addCriterion("sc_share_userid between", value1, value2, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_useridNotBetween(Long value1, Long value2) {
            addCriterion("sc_share_userid not between", value1, value2, "sc_share_userid");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardIsNull() {
            addCriterion("sc_share_award is null");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardIsNotNull() {
            addCriterion("sc_share_award is not null");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardEqualTo(Integer value) {
            addCriterion("sc_share_award =", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardNotEqualTo(Integer value) {
            addCriterion("sc_share_award <>", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardGreaterThan(Integer value) {
            addCriterion("sc_share_award >", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_share_award >=", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardLessThan(Integer value) {
            addCriterion("sc_share_award <", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardLessThanOrEqualTo(Integer value) {
            addCriterion("sc_share_award <=", value, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardIn(List<Integer> values) {
            addCriterion("sc_share_award in", values, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardNotIn(List<Integer> values) {
            addCriterion("sc_share_award not in", values, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardBetween(Integer value1, Integer value2) {
            addCriterion("sc_share_award between", value1, value2, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_share_awardNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_share_award not between", value1, value2, "sc_share_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridIsNull() {
            addCriterion("sc_receive_userid is null");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridIsNotNull() {
            addCriterion("sc_receive_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridEqualTo(Long value) {
            addCriterion("sc_receive_userid =", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridNotEqualTo(Long value) {
            addCriterion("sc_receive_userid <>", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridGreaterThan(Long value) {
            addCriterion("sc_receive_userid >", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_receive_userid >=", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridLessThan(Long value) {
            addCriterion("sc_receive_userid <", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridLessThanOrEqualTo(Long value) {
            addCriterion("sc_receive_userid <=", value, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridIn(List<Long> values) {
            addCriterion("sc_receive_userid in", values, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridNotIn(List<Long> values) {
            addCriterion("sc_receive_userid not in", values, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridBetween(Long value1, Long value2) {
            addCriterion("sc_receive_userid between", value1, value2, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_useridNotBetween(Long value1, Long value2) {
            addCriterion("sc_receive_userid not between", value1, value2, "sc_receive_userid");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardIsNull() {
            addCriterion("sc_receive_award is null");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardIsNotNull() {
            addCriterion("sc_receive_award is not null");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardEqualTo(Integer value) {
            addCriterion("sc_receive_award =", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardNotEqualTo(Integer value) {
            addCriterion("sc_receive_award <>", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardGreaterThan(Integer value) {
            addCriterion("sc_receive_award >", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_receive_award >=", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardLessThan(Integer value) {
            addCriterion("sc_receive_award <", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardLessThanOrEqualTo(Integer value) {
            addCriterion("sc_receive_award <=", value, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardIn(List<Integer> values) {
            addCriterion("sc_receive_award in", values, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardNotIn(List<Integer> values) {
            addCriterion("sc_receive_award not in", values, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardBetween(Integer value1, Integer value2) {
            addCriterion("sc_receive_award between", value1, value2, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_receive_awardNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_receive_award not between", value1, value2, "sc_receive_award");
            return (Criteria) this;
        }

        public Criteria andSc_createdateIsNull() {
            addCriterion("sc_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSc_createdateIsNotNull() {
            addCriterion("sc_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSc_createdateEqualTo(Date value) {
            addCriterion("sc_createdate =", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateNotEqualTo(Date value) {
            addCriterion("sc_createdate <>", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateGreaterThan(Date value) {
            addCriterion("sc_createdate >", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sc_createdate >=", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateLessThan(Date value) {
            addCriterion("sc_createdate <", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateLessThanOrEqualTo(Date value) {
            addCriterion("sc_createdate <=", value, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateIn(List<Date> values) {
            addCriterion("sc_createdate in", values, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateNotIn(List<Date> values) {
            addCriterion("sc_createdate not in", values, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateBetween(Date value1, Date value2) {
            addCriterion("sc_createdate between", value1, value2, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andSc_createdateNotBetween(Date value1, Date value2) {
            addCriterion("sc_createdate not between", value1, value2, "sc_createdate");
            return (Criteria) this;
        }

        public Criteria andShare_nameIsNull() {
            addCriterion("share_name is null");
            return (Criteria) this;
        }

        public Criteria andShare_nameIsNotNull() {
            addCriterion("share_name is not null");
            return (Criteria) this;
        }

        public Criteria andShare_nameEqualTo(String value) {
            addCriterion("share_name =", value, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_nameNotEqualTo(String value) {
            addCriterion("share_name <>", value, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_nameGreaterThan(String value) {
            addCriterion("share_name >", value, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_nameGreaterThanOrEqualTo(String value) {
            addCriterion("share_name >=", value, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_nameLessThan(String value) {
            addCriterion("share_name <", value, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_nameLessThanOrEqualTo(String value) {
            addCriterion("share_name <=", value, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_nameLike(String value) {
            addCriterion("share_name like", value, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_nameNotLike(String value) {
            addCriterion("share_name not like", value, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_nameIn(List<String> values) {
            addCriterion("share_name in", values, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_nameNotIn(List<String> values) {
            addCriterion("share_name not in", values, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_nameBetween(String value1, String value2) {
            addCriterion("share_name between", value1, value2, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_nameNotBetween(String value1, String value2) {
            addCriterion("share_name not between", value1, value2, "share_name");
            return (Criteria) this;
        }

        public Criteria andShare_phoneIsNull() {
            addCriterion("share_phone is null");
            return (Criteria) this;
        }

        public Criteria andShare_phoneIsNotNull() {
            addCriterion("share_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShare_phoneEqualTo(String value) {
            addCriterion("share_phone =", value, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_phoneNotEqualTo(String value) {
            addCriterion("share_phone <>", value, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_phoneGreaterThan(String value) {
            addCriterion("share_phone >", value, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("share_phone >=", value, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_phoneLessThan(String value) {
            addCriterion("share_phone <", value, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_phoneLessThanOrEqualTo(String value) {
            addCriterion("share_phone <=", value, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_phoneLike(String value) {
            addCriterion("share_phone like", value, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_phoneNotLike(String value) {
            addCriterion("share_phone not like", value, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_phoneIn(List<String> values) {
            addCriterion("share_phone in", values, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_phoneNotIn(List<String> values) {
            addCriterion("share_phone not in", values, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_phoneBetween(String value1, String value2) {
            addCriterion("share_phone between", value1, value2, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_phoneNotBetween(String value1, String value2) {
            addCriterion("share_phone not between", value1, value2, "share_phone");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeIsNull() {
            addCriterion("share_invitecode is null");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeIsNotNull() {
            addCriterion("share_invitecode is not null");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeEqualTo(String value) {
            addCriterion("share_invitecode =", value, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeNotEqualTo(String value) {
            addCriterion("share_invitecode <>", value, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeGreaterThan(String value) {
            addCriterion("share_invitecode >", value, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeGreaterThanOrEqualTo(String value) {
            addCriterion("share_invitecode >=", value, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeLessThan(String value) {
            addCriterion("share_invitecode <", value, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeLessThanOrEqualTo(String value) {
            addCriterion("share_invitecode <=", value, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeLike(String value) {
            addCriterion("share_invitecode like", value, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeNotLike(String value) {
            addCriterion("share_invitecode not like", value, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeIn(List<String> values) {
            addCriterion("share_invitecode in", values, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeNotIn(List<String> values) {
            addCriterion("share_invitecode not in", values, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeBetween(String value1, String value2) {
            addCriterion("share_invitecode between", value1, value2, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andShare_invitecodeNotBetween(String value1, String value2) {
            addCriterion("share_invitecode not between", value1, value2, "share_invitecode");
            return (Criteria) this;
        }

        public Criteria andReceive_nameIsNull() {
            addCriterion("receive_name is null");
            return (Criteria) this;
        }

        public Criteria andReceive_nameIsNotNull() {
            addCriterion("receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceive_nameEqualTo(String value) {
            addCriterion("receive_name =", value, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_nameNotEqualTo(String value) {
            addCriterion("receive_name <>", value, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_nameGreaterThan(String value) {
            addCriterion("receive_name >", value, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_nameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_name >=", value, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_nameLessThan(String value) {
            addCriterion("receive_name <", value, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_nameLessThanOrEqualTo(String value) {
            addCriterion("receive_name <=", value, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_nameLike(String value) {
            addCriterion("receive_name like", value, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_nameNotLike(String value) {
            addCriterion("receive_name not like", value, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_nameIn(List<String> values) {
            addCriterion("receive_name in", values, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_nameNotIn(List<String> values) {
            addCriterion("receive_name not in", values, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_nameBetween(String value1, String value2) {
            addCriterion("receive_name between", value1, value2, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_nameNotBetween(String value1, String value2) {
            addCriterion("receive_name not between", value1, value2, "receive_name");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneIsNull() {
            addCriterion("receive_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneIsNotNull() {
            addCriterion("receive_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneEqualTo(String value) {
            addCriterion("receive_phone =", value, "receive_phone");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneNotEqualTo(String value) {
            addCriterion("receive_phone <>", value, "receive_phone");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneGreaterThan(String value) {
            addCriterion("receive_phone >", value, "receive_phone");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("receive_phone >=", value, "receive_phone");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneLessThan(String value) {
            addCriterion("receive_phone <", value, "receive_phone");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneLessThanOrEqualTo(String value) {
            addCriterion("receive_phone <=", value, "receive_phone");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneLike(String value) {
            addCriterion("receive_phone like", value, "receive_phone");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneNotLike(String value) {
            addCriterion("receive_phone not like", value, "receive_phone");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneIn(List<String> values) {
            addCriterion("receive_phone in", values, "receive_phone");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneNotIn(List<String> values) {
            addCriterion("receive_phone not in", values, "receive_phone");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneBetween(String value1, String value2) {
            addCriterion("receive_phone between", value1, value2, "receive_phone");
            return (Criteria) this;
        }

        public Criteria andReceive_phoneNotBetween(String value1, String value2) {
            addCriterion("receive_phone not between", value1, value2, "receive_phone");
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