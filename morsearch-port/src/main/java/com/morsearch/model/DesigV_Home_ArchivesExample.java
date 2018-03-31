package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesigV_Home_ArchivesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesigV_Home_ArchivesExample() {
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

        public Criteria andDh_idIsNull() {
            addCriterion("dh_id is null");
            return (Criteria) this;
        }

        public Criteria andDh_idIsNotNull() {
            addCriterion("dh_id is not null");
            return (Criteria) this;
        }

        public Criteria andDh_idEqualTo(Long value) {
            addCriterion("dh_id =", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idNotEqualTo(Long value) {
            addCriterion("dh_id <>", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idGreaterThan(Long value) {
            addCriterion("dh_id >", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idGreaterThanOrEqualTo(Long value) {
            addCriterion("dh_id >=", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idLessThan(Long value) {
            addCriterion("dh_id <", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idLessThanOrEqualTo(Long value) {
            addCriterion("dh_id <=", value, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idIn(List<Long> values) {
            addCriterion("dh_id in", values, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idNotIn(List<Long> values) {
            addCriterion("dh_id not in", values, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idBetween(Long value1, Long value2) {
            addCriterion("dh_id between", value1, value2, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_idNotBetween(Long value1, Long value2) {
            addCriterion("dh_id not between", value1, value2, "dh_id");
            return (Criteria) this;
        }

        public Criteria andDh_typeIsNull() {
            addCriterion("dh_type is null");
            return (Criteria) this;
        }

        public Criteria andDh_typeIsNotNull() {
            addCriterion("dh_type is not null");
            return (Criteria) this;
        }

        public Criteria andDh_typeEqualTo(String value) {
            addCriterion("dh_type =", value, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_typeNotEqualTo(String value) {
            addCriterion("dh_type <>", value, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_typeGreaterThan(String value) {
            addCriterion("dh_type >", value, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_typeGreaterThanOrEqualTo(String value) {
            addCriterion("dh_type >=", value, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_typeLessThan(String value) {
            addCriterion("dh_type <", value, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_typeLessThanOrEqualTo(String value) {
            addCriterion("dh_type <=", value, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_typeLike(String value) {
            addCriterion("dh_type like", value, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_typeNotLike(String value) {
            addCriterion("dh_type not like", value, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_typeIn(List<String> values) {
            addCriterion("dh_type in", values, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_typeNotIn(List<String> values) {
            addCriterion("dh_type not in", values, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_typeBetween(String value1, String value2) {
            addCriterion("dh_type between", value1, value2, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_typeNotBetween(String value1, String value2) {
            addCriterion("dh_type not between", value1, value2, "dh_type");
            return (Criteria) this;
        }

        public Criteria andDh_dyidIsNull() {
            addCriterion("dh_dyid is null");
            return (Criteria) this;
        }

        public Criteria andDh_dyidIsNotNull() {
            addCriterion("dh_dyid is not null");
            return (Criteria) this;
        }

        public Criteria andDh_dyidEqualTo(Long value) {
            addCriterion("dh_dyid =", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidNotEqualTo(Long value) {
            addCriterion("dh_dyid <>", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidGreaterThan(Long value) {
            addCriterion("dh_dyid >", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidGreaterThanOrEqualTo(Long value) {
            addCriterion("dh_dyid >=", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidLessThan(Long value) {
            addCriterion("dh_dyid <", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidLessThanOrEqualTo(Long value) {
            addCriterion("dh_dyid <=", value, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidIn(List<Long> values) {
            addCriterion("dh_dyid in", values, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidNotIn(List<Long> values) {
            addCriterion("dh_dyid not in", values, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidBetween(Long value1, Long value2) {
            addCriterion("dh_dyid between", value1, value2, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_dyidNotBetween(Long value1, Long value2) {
            addCriterion("dh_dyid not between", value1, value2, "dh_dyid");
            return (Criteria) this;
        }

        public Criteria andDh_indexIsNull() {
            addCriterion("dh_index is null");
            return (Criteria) this;
        }

        public Criteria andDh_indexIsNotNull() {
            addCriterion("dh_index is not null");
            return (Criteria) this;
        }

        public Criteria andDh_indexEqualTo(Integer value) {
            addCriterion("dh_index =", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexNotEqualTo(Integer value) {
            addCriterion("dh_index <>", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexGreaterThan(Integer value) {
            addCriterion("dh_index >", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("dh_index >=", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexLessThan(Integer value) {
            addCriterion("dh_index <", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexLessThanOrEqualTo(Integer value) {
            addCriterion("dh_index <=", value, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexIn(List<Integer> values) {
            addCriterion("dh_index in", values, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexNotIn(List<Integer> values) {
            addCriterion("dh_index not in", values, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexBetween(Integer value1, Integer value2) {
            addCriterion("dh_index between", value1, value2, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_indexNotBetween(Integer value1, Integer value2) {
            addCriterion("dh_index not between", value1, value2, "dh_index");
            return (Criteria) this;
        }

        public Criteria andDh_remarkIsNull() {
            addCriterion("dh_remark is null");
            return (Criteria) this;
        }

        public Criteria andDh_remarkIsNotNull() {
            addCriterion("dh_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDh_remarkEqualTo(String value) {
            addCriterion("dh_remark =", value, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_remarkNotEqualTo(String value) {
            addCriterion("dh_remark <>", value, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_remarkGreaterThan(String value) {
            addCriterion("dh_remark >", value, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("dh_remark >=", value, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_remarkLessThan(String value) {
            addCriterion("dh_remark <", value, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_remarkLessThanOrEqualTo(String value) {
            addCriterion("dh_remark <=", value, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_remarkLike(String value) {
            addCriterion("dh_remark like", value, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_remarkNotLike(String value) {
            addCriterion("dh_remark not like", value, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_remarkIn(List<String> values) {
            addCriterion("dh_remark in", values, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_remarkNotIn(List<String> values) {
            addCriterion("dh_remark not in", values, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_remarkBetween(String value1, String value2) {
            addCriterion("dh_remark between", value1, value2, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_remarkNotBetween(String value1, String value2) {
            addCriterion("dh_remark not between", value1, value2, "dh_remark");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagIsNull() {
            addCriterion("dh_stopflag is null");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagIsNotNull() {
            addCriterion("dh_stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagEqualTo(Boolean value) {
            addCriterion("dh_stopflag =", value, "dh_stopflag");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagNotEqualTo(Boolean value) {
            addCriterion("dh_stopflag <>", value, "dh_stopflag");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagGreaterThan(Boolean value) {
            addCriterion("dh_stopflag >", value, "dh_stopflag");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dh_stopflag >=", value, "dh_stopflag");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagLessThan(Boolean value) {
            addCriterion("dh_stopflag <", value, "dh_stopflag");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("dh_stopflag <=", value, "dh_stopflag");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagIn(List<Boolean> values) {
            addCriterion("dh_stopflag in", values, "dh_stopflag");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagNotIn(List<Boolean> values) {
            addCriterion("dh_stopflag not in", values, "dh_stopflag");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("dh_stopflag between", value1, value2, "dh_stopflag");
            return (Criteria) this;
        }

        public Criteria andDh_stopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dh_stopflag not between", value1, value2, "dh_stopflag");
            return (Criteria) this;
        }

        public Criteria andDh_createnoIsNull() {
            addCriterion("dh_createno is null");
            return (Criteria) this;
        }

        public Criteria andDh_createnoIsNotNull() {
            addCriterion("dh_createno is not null");
            return (Criteria) this;
        }

        public Criteria andDh_createnoEqualTo(String value) {
            addCriterion("dh_createno =", value, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createnoNotEqualTo(String value) {
            addCriterion("dh_createno <>", value, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createnoGreaterThan(String value) {
            addCriterion("dh_createno >", value, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("dh_createno >=", value, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createnoLessThan(String value) {
            addCriterion("dh_createno <", value, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createnoLessThanOrEqualTo(String value) {
            addCriterion("dh_createno <=", value, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createnoLike(String value) {
            addCriterion("dh_createno like", value, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createnoNotLike(String value) {
            addCriterion("dh_createno not like", value, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createnoIn(List<String> values) {
            addCriterion("dh_createno in", values, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createnoNotIn(List<String> values) {
            addCriterion("dh_createno not in", values, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createnoBetween(String value1, String value2) {
            addCriterion("dh_createno between", value1, value2, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createnoNotBetween(String value1, String value2) {
            addCriterion("dh_createno not between", value1, value2, "dh_createno");
            return (Criteria) this;
        }

        public Criteria andDh_createdateIsNull() {
            addCriterion("dh_createdate is null");
            return (Criteria) this;
        }

        public Criteria andDh_createdateIsNotNull() {
            addCriterion("dh_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andDh_createdateEqualTo(Date value) {
            addCriterion("dh_createdate =", value, "dh_createdate");
            return (Criteria) this;
        }

        public Criteria andDh_createdateNotEqualTo(Date value) {
            addCriterion("dh_createdate <>", value, "dh_createdate");
            return (Criteria) this;
        }

        public Criteria andDh_createdateGreaterThan(Date value) {
            addCriterion("dh_createdate >", value, "dh_createdate");
            return (Criteria) this;
        }

        public Criteria andDh_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("dh_createdate >=", value, "dh_createdate");
            return (Criteria) this;
        }

        public Criteria andDh_createdateLessThan(Date value) {
            addCriterion("dh_createdate <", value, "dh_createdate");
            return (Criteria) this;
        }

        public Criteria andDh_createdateLessThanOrEqualTo(Date value) {
            addCriterion("dh_createdate <=", value, "dh_createdate");
            return (Criteria) this;
        }

        public Criteria andDh_createdateIn(List<Date> values) {
            addCriterion("dh_createdate in", values, "dh_createdate");
            return (Criteria) this;
        }

        public Criteria andDh_createdateNotIn(List<Date> values) {
            addCriterion("dh_createdate not in", values, "dh_createdate");
            return (Criteria) this;
        }

        public Criteria andDh_createdateBetween(Date value1, Date value2) {
            addCriterion("dh_createdate between", value1, value2, "dh_createdate");
            return (Criteria) this;
        }

        public Criteria andDh_createdateNotBetween(Date value1, Date value2) {
            addCriterion("dh_createdate not between", value1, value2, "dh_createdate");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoIsNull() {
            addCriterion("dh_updateno is null");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoIsNotNull() {
            addCriterion("dh_updateno is not null");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoEqualTo(String value) {
            addCriterion("dh_updateno =", value, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoNotEqualTo(String value) {
            addCriterion("dh_updateno <>", value, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoGreaterThan(String value) {
            addCriterion("dh_updateno >", value, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoGreaterThanOrEqualTo(String value) {
            addCriterion("dh_updateno >=", value, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoLessThan(String value) {
            addCriterion("dh_updateno <", value, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoLessThanOrEqualTo(String value) {
            addCriterion("dh_updateno <=", value, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoLike(String value) {
            addCriterion("dh_updateno like", value, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoNotLike(String value) {
            addCriterion("dh_updateno not like", value, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoIn(List<String> values) {
            addCriterion("dh_updateno in", values, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoNotIn(List<String> values) {
            addCriterion("dh_updateno not in", values, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoBetween(String value1, String value2) {
            addCriterion("dh_updateno between", value1, value2, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatenoNotBetween(String value1, String value2) {
            addCriterion("dh_updateno not between", value1, value2, "dh_updateno");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateIsNull() {
            addCriterion("dh_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateIsNotNull() {
            addCriterion("dh_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateEqualTo(Date value) {
            addCriterion("dh_updatedate =", value, "dh_updatedate");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateNotEqualTo(Date value) {
            addCriterion("dh_updatedate <>", value, "dh_updatedate");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateGreaterThan(Date value) {
            addCriterion("dh_updatedate >", value, "dh_updatedate");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("dh_updatedate >=", value, "dh_updatedate");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateLessThan(Date value) {
            addCriterion("dh_updatedate <", value, "dh_updatedate");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("dh_updatedate <=", value, "dh_updatedate");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateIn(List<Date> values) {
            addCriterion("dh_updatedate in", values, "dh_updatedate");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateNotIn(List<Date> values) {
            addCriterion("dh_updatedate not in", values, "dh_updatedate");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateBetween(Date value1, Date value2) {
            addCriterion("dh_updatedate between", value1, value2, "dh_updatedate");
            return (Criteria) this;
        }

        public Criteria andDh_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("dh_updatedate not between", value1, value2, "dh_updatedate");
            return (Criteria) this;
        }

        public Criteria andPa_titleIsNull() {
            addCriterion("pa_title is null");
            return (Criteria) this;
        }

        public Criteria andPa_titleIsNotNull() {
            addCriterion("pa_title is not null");
            return (Criteria) this;
        }

        public Criteria andPa_titleEqualTo(String value) {
            addCriterion("pa_title =", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotEqualTo(String value) {
            addCriterion("pa_title <>", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleGreaterThan(String value) {
            addCriterion("pa_title >", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleGreaterThanOrEqualTo(String value) {
            addCriterion("pa_title >=", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleLessThan(String value) {
            addCriterion("pa_title <", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleLessThanOrEqualTo(String value) {
            addCriterion("pa_title <=", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleLike(String value) {
            addCriterion("pa_title like", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotLike(String value) {
            addCriterion("pa_title not like", value, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleIn(List<String> values) {
            addCriterion("pa_title in", values, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotIn(List<String> values) {
            addCriterion("pa_title not in", values, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleBetween(String value1, String value2) {
            addCriterion("pa_title between", value1, value2, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_titleNotBetween(String value1, String value2) {
            addCriterion("pa_title not between", value1, value2, "pa_title");
            return (Criteria) this;
        }

        public Criteria andPa_majorIsNull() {
            addCriterion("pa_major is null");
            return (Criteria) this;
        }

        public Criteria andPa_majorIsNotNull() {
            addCriterion("pa_major is not null");
            return (Criteria) this;
        }

        public Criteria andPa_majorEqualTo(String value) {
            addCriterion("pa_major =", value, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_majorNotEqualTo(String value) {
            addCriterion("pa_major <>", value, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_majorGreaterThan(String value) {
            addCriterion("pa_major >", value, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_majorGreaterThanOrEqualTo(String value) {
            addCriterion("pa_major >=", value, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_majorLessThan(String value) {
            addCriterion("pa_major <", value, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_majorLessThanOrEqualTo(String value) {
            addCriterion("pa_major <=", value, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_majorLike(String value) {
            addCriterion("pa_major like", value, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_majorNotLike(String value) {
            addCriterion("pa_major not like", value, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_majorIn(List<String> values) {
            addCriterion("pa_major in", values, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_majorNotIn(List<String> values) {
            addCriterion("pa_major not in", values, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_majorBetween(String value1, String value2) {
            addCriterion("pa_major between", value1, value2, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_majorNotBetween(String value1, String value2) {
            addCriterion("pa_major not between", value1, value2, "pa_major");
            return (Criteria) this;
        }

        public Criteria andPa_styleIsNull() {
            addCriterion("pa_style is null");
            return (Criteria) this;
        }

        public Criteria andPa_styleIsNotNull() {
            addCriterion("pa_style is not null");
            return (Criteria) this;
        }

        public Criteria andPa_styleEqualTo(String value) {
            addCriterion("pa_style =", value, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_styleNotEqualTo(String value) {
            addCriterion("pa_style <>", value, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_styleGreaterThan(String value) {
            addCriterion("pa_style >", value, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_styleGreaterThanOrEqualTo(String value) {
            addCriterion("pa_style >=", value, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_styleLessThan(String value) {
            addCriterion("pa_style <", value, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_styleLessThanOrEqualTo(String value) {
            addCriterion("pa_style <=", value, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_styleLike(String value) {
            addCriterion("pa_style like", value, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_styleNotLike(String value) {
            addCriterion("pa_style not like", value, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_styleIn(List<String> values) {
            addCriterion("pa_style in", values, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_styleNotIn(List<String> values) {
            addCriterion("pa_style not in", values, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_styleBetween(String value1, String value2) {
            addCriterion("pa_style between", value1, value2, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_styleNotBetween(String value1, String value2) {
            addCriterion("pa_style not between", value1, value2, "pa_style");
            return (Criteria) this;
        }

        public Criteria andPa_featuresIsNull() {
            addCriterion("pa_features is null");
            return (Criteria) this;
        }

        public Criteria andPa_featuresIsNotNull() {
            addCriterion("pa_features is not null");
            return (Criteria) this;
        }

        public Criteria andPa_featuresEqualTo(String value) {
            addCriterion("pa_features =", value, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_featuresNotEqualTo(String value) {
            addCriterion("pa_features <>", value, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_featuresGreaterThan(String value) {
            addCriterion("pa_features >", value, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_featuresGreaterThanOrEqualTo(String value) {
            addCriterion("pa_features >=", value, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_featuresLessThan(String value) {
            addCriterion("pa_features <", value, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_featuresLessThanOrEqualTo(String value) {
            addCriterion("pa_features <=", value, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_featuresLike(String value) {
            addCriterion("pa_features like", value, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_featuresNotLike(String value) {
            addCriterion("pa_features not like", value, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_featuresIn(List<String> values) {
            addCriterion("pa_features in", values, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_featuresNotIn(List<String> values) {
            addCriterion("pa_features not in", values, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_featuresBetween(String value1, String value2) {
            addCriterion("pa_features between", value1, value2, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_featuresNotBetween(String value1, String value2) {
            addCriterion("pa_features not between", value1, value2, "pa_features");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectIsNull() {
            addCriterion("pa_count_collect is null");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectIsNotNull() {
            addCriterion("pa_count_collect is not null");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectEqualTo(Integer value) {
            addCriterion("pa_count_collect =", value, "pa_count_collect");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectNotEqualTo(Integer value) {
            addCriterion("pa_count_collect <>", value, "pa_count_collect");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectGreaterThan(Integer value) {
            addCriterion("pa_count_collect >", value, "pa_count_collect");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_count_collect >=", value, "pa_count_collect");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectLessThan(Integer value) {
            addCriterion("pa_count_collect <", value, "pa_count_collect");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectLessThanOrEqualTo(Integer value) {
            addCriterion("pa_count_collect <=", value, "pa_count_collect");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectIn(List<Integer> values) {
            addCriterion("pa_count_collect in", values, "pa_count_collect");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectNotIn(List<Integer> values) {
            addCriterion("pa_count_collect not in", values, "pa_count_collect");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectBetween(Integer value1, Integer value2) {
            addCriterion("pa_count_collect between", value1, value2, "pa_count_collect");
            return (Criteria) this;
        }

        public Criteria andPa_count_collectNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_count_collect not between", value1, value2, "pa_count_collect");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseIsNull() {
            addCriterion("pa_count_browse is null");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseIsNotNull() {
            addCriterion("pa_count_browse is not null");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseEqualTo(Integer value) {
            addCriterion("pa_count_browse =", value, "pa_count_browse");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseNotEqualTo(Integer value) {
            addCriterion("pa_count_browse <>", value, "pa_count_browse");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseGreaterThan(Integer value) {
            addCriterion("pa_count_browse >", value, "pa_count_browse");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_count_browse >=", value, "pa_count_browse");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseLessThan(Integer value) {
            addCriterion("pa_count_browse <", value, "pa_count_browse");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseLessThanOrEqualTo(Integer value) {
            addCriterion("pa_count_browse <=", value, "pa_count_browse");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseIn(List<Integer> values) {
            addCriterion("pa_count_browse in", values, "pa_count_browse");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseNotIn(List<Integer> values) {
            addCriterion("pa_count_browse not in", values, "pa_count_browse");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseBetween(Integer value1, Integer value2) {
            addCriterion("pa_count_browse between", value1, value2, "pa_count_browse");
            return (Criteria) this;
        }

        public Criteria andPa_count_browseNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_count_browse not between", value1, value2, "pa_count_browse");
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