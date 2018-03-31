package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pm_StyleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Pm_StyleExample() {
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

        public Criteria andPs_idIsNull() {
            addCriterion("ps_id is null");
            return (Criteria) this;
        }

        public Criteria andPs_idIsNotNull() {
            addCriterion("ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andPs_idEqualTo(Long value) {
            addCriterion("ps_id =", value, "ps_id");
            return (Criteria) this;
        }

        public Criteria andPs_idNotEqualTo(Long value) {
            addCriterion("ps_id <>", value, "ps_id");
            return (Criteria) this;
        }

        public Criteria andPs_idGreaterThan(Long value) {
            addCriterion("ps_id >", value, "ps_id");
            return (Criteria) this;
        }

        public Criteria andPs_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ps_id >=", value, "ps_id");
            return (Criteria) this;
        }

        public Criteria andPs_idLessThan(Long value) {
            addCriterion("ps_id <", value, "ps_id");
            return (Criteria) this;
        }

        public Criteria andPs_idLessThanOrEqualTo(Long value) {
            addCriterion("ps_id <=", value, "ps_id");
            return (Criteria) this;
        }

        public Criteria andPs_idIn(List<Long> values) {
            addCriterion("ps_id in", values, "ps_id");
            return (Criteria) this;
        }

        public Criteria andPs_idNotIn(List<Long> values) {
            addCriterion("ps_id not in", values, "ps_id");
            return (Criteria) this;
        }

        public Criteria andPs_idBetween(Long value1, Long value2) {
            addCriterion("ps_id between", value1, value2, "ps_id");
            return (Criteria) this;
        }

        public Criteria andPs_idNotBetween(Long value1, Long value2) {
            addCriterion("ps_id not between", value1, value2, "ps_id");
            return (Criteria) this;
        }

        public Criteria andPs_nameIsNull() {
            addCriterion("ps_name is null");
            return (Criteria) this;
        }

        public Criteria andPs_nameIsNotNull() {
            addCriterion("ps_name is not null");
            return (Criteria) this;
        }

        public Criteria andPs_nameEqualTo(String value) {
            addCriterion("ps_name =", value, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_nameNotEqualTo(String value) {
            addCriterion("ps_name <>", value, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_nameGreaterThan(String value) {
            addCriterion("ps_name >", value, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_nameGreaterThanOrEqualTo(String value) {
            addCriterion("ps_name >=", value, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_nameLessThan(String value) {
            addCriterion("ps_name <", value, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_nameLessThanOrEqualTo(String value) {
            addCriterion("ps_name <=", value, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_nameLike(String value) {
            addCriterion("ps_name like", value, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_nameNotLike(String value) {
            addCriterion("ps_name not like", value, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_nameIn(List<String> values) {
            addCriterion("ps_name in", values, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_nameNotIn(List<String> values) {
            addCriterion("ps_name not in", values, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_nameBetween(String value1, String value2) {
            addCriterion("ps_name between", value1, value2, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_nameNotBetween(String value1, String value2) {
            addCriterion("ps_name not between", value1, value2, "ps_name");
            return (Criteria) this;
        }

        public Criteria andPs_majoridIsNull() {
            addCriterion("ps_majorid is null");
            return (Criteria) this;
        }

        public Criteria andPs_majoridIsNotNull() {
            addCriterion("ps_majorid is not null");
            return (Criteria) this;
        }

        public Criteria andPs_majoridEqualTo(Long value) {
            addCriterion("ps_majorid =", value, "ps_majorid");
            return (Criteria) this;
        }

        public Criteria andPs_majoridNotEqualTo(Long value) {
            addCriterion("ps_majorid <>", value, "ps_majorid");
            return (Criteria) this;
        }

        public Criteria andPs_majoridGreaterThan(Long value) {
            addCriterion("ps_majorid >", value, "ps_majorid");
            return (Criteria) this;
        }

        public Criteria andPs_majoridGreaterThanOrEqualTo(Long value) {
            addCriterion("ps_majorid >=", value, "ps_majorid");
            return (Criteria) this;
        }

        public Criteria andPs_majoridLessThan(Long value) {
            addCriterion("ps_majorid <", value, "ps_majorid");
            return (Criteria) this;
        }

        public Criteria andPs_majoridLessThanOrEqualTo(Long value) {
            addCriterion("ps_majorid <=", value, "ps_majorid");
            return (Criteria) this;
        }

        public Criteria andPs_majoridIn(List<Long> values) {
            addCriterion("ps_majorid in", values, "ps_majorid");
            return (Criteria) this;
        }

        public Criteria andPs_majoridNotIn(List<Long> values) {
            addCriterion("ps_majorid not in", values, "ps_majorid");
            return (Criteria) this;
        }

        public Criteria andPs_majoridBetween(Long value1, Long value2) {
            addCriterion("ps_majorid between", value1, value2, "ps_majorid");
            return (Criteria) this;
        }

        public Criteria andPs_majoridNotBetween(Long value1, Long value2) {
            addCriterion("ps_majorid not between", value1, value2, "ps_majorid");
            return (Criteria) this;
        }

        public Criteria andPs_majornameIsNull() {
            addCriterion("ps_majorname is null");
            return (Criteria) this;
        }

        public Criteria andPs_majornameIsNotNull() {
            addCriterion("ps_majorname is not null");
            return (Criteria) this;
        }

        public Criteria andPs_majornameEqualTo(String value) {
            addCriterion("ps_majorname =", value, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_majornameNotEqualTo(String value) {
            addCriterion("ps_majorname <>", value, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_majornameGreaterThan(String value) {
            addCriterion("ps_majorname >", value, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_majornameGreaterThanOrEqualTo(String value) {
            addCriterion("ps_majorname >=", value, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_majornameLessThan(String value) {
            addCriterion("ps_majorname <", value, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_majornameLessThanOrEqualTo(String value) {
            addCriterion("ps_majorname <=", value, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_majornameLike(String value) {
            addCriterion("ps_majorname like", value, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_majornameNotLike(String value) {
            addCriterion("ps_majorname not like", value, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_majornameIn(List<String> values) {
            addCriterion("ps_majorname in", values, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_majornameNotIn(List<String> values) {
            addCriterion("ps_majorname not in", values, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_majornameBetween(String value1, String value2) {
            addCriterion("ps_majorname between", value1, value2, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_majornameNotBetween(String value1, String value2) {
            addCriterion("ps_majorname not between", value1, value2, "ps_majorname");
            return (Criteria) this;
        }

        public Criteria andPs_indexIsNull() {
            addCriterion("ps_index is null");
            return (Criteria) this;
        }

        public Criteria andPs_indexIsNotNull() {
            addCriterion("ps_index is not null");
            return (Criteria) this;
        }

        public Criteria andPs_indexEqualTo(Integer value) {
            addCriterion("ps_index =", value, "ps_index");
            return (Criteria) this;
        }

        public Criteria andPs_indexNotEqualTo(Integer value) {
            addCriterion("ps_index <>", value, "ps_index");
            return (Criteria) this;
        }

        public Criteria andPs_indexGreaterThan(Integer value) {
            addCriterion("ps_index >", value, "ps_index");
            return (Criteria) this;
        }

        public Criteria andPs_indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_index >=", value, "ps_index");
            return (Criteria) this;
        }

        public Criteria andPs_indexLessThan(Integer value) {
            addCriterion("ps_index <", value, "ps_index");
            return (Criteria) this;
        }

        public Criteria andPs_indexLessThanOrEqualTo(Integer value) {
            addCriterion("ps_index <=", value, "ps_index");
            return (Criteria) this;
        }

        public Criteria andPs_indexIn(List<Integer> values) {
            addCriterion("ps_index in", values, "ps_index");
            return (Criteria) this;
        }

        public Criteria andPs_indexNotIn(List<Integer> values) {
            addCriterion("ps_index not in", values, "ps_index");
            return (Criteria) this;
        }

        public Criteria andPs_indexBetween(Integer value1, Integer value2) {
            addCriterion("ps_index between", value1, value2, "ps_index");
            return (Criteria) this;
        }

        public Criteria andPs_indexNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_index not between", value1, value2, "ps_index");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagIsNull() {
            addCriterion("ps_stopflag is null");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagIsNotNull() {
            addCriterion("ps_stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagEqualTo(Boolean value) {
            addCriterion("ps_stopflag =", value, "ps_stopflag");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagNotEqualTo(Boolean value) {
            addCriterion("ps_stopflag <>", value, "ps_stopflag");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagGreaterThan(Boolean value) {
            addCriterion("ps_stopflag >", value, "ps_stopflag");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ps_stopflag >=", value, "ps_stopflag");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagLessThan(Boolean value) {
            addCriterion("ps_stopflag <", value, "ps_stopflag");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("ps_stopflag <=", value, "ps_stopflag");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagIn(List<Boolean> values) {
            addCriterion("ps_stopflag in", values, "ps_stopflag");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagNotIn(List<Boolean> values) {
            addCriterion("ps_stopflag not in", values, "ps_stopflag");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("ps_stopflag between", value1, value2, "ps_stopflag");
            return (Criteria) this;
        }

        public Criteria andPs_stopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ps_stopflag not between", value1, value2, "ps_stopflag");
            return (Criteria) this;
        }

        public Criteria andPs_delflagIsNull() {
            addCriterion("ps_delflag is null");
            return (Criteria) this;
        }

        public Criteria andPs_delflagIsNotNull() {
            addCriterion("ps_delflag is not null");
            return (Criteria) this;
        }

        public Criteria andPs_delflagEqualTo(Boolean value) {
            addCriterion("ps_delflag =", value, "ps_delflag");
            return (Criteria) this;
        }

        public Criteria andPs_delflagNotEqualTo(Boolean value) {
            addCriterion("ps_delflag <>", value, "ps_delflag");
            return (Criteria) this;
        }

        public Criteria andPs_delflagGreaterThan(Boolean value) {
            addCriterion("ps_delflag >", value, "ps_delflag");
            return (Criteria) this;
        }

        public Criteria andPs_delflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ps_delflag >=", value, "ps_delflag");
            return (Criteria) this;
        }

        public Criteria andPs_delflagLessThan(Boolean value) {
            addCriterion("ps_delflag <", value, "ps_delflag");
            return (Criteria) this;
        }

        public Criteria andPs_delflagLessThanOrEqualTo(Boolean value) {
            addCriterion("ps_delflag <=", value, "ps_delflag");
            return (Criteria) this;
        }

        public Criteria andPs_delflagIn(List<Boolean> values) {
            addCriterion("ps_delflag in", values, "ps_delflag");
            return (Criteria) this;
        }

        public Criteria andPs_delflagNotIn(List<Boolean> values) {
            addCriterion("ps_delflag not in", values, "ps_delflag");
            return (Criteria) this;
        }

        public Criteria andPs_delflagBetween(Boolean value1, Boolean value2) {
            addCriterion("ps_delflag between", value1, value2, "ps_delflag");
            return (Criteria) this;
        }

        public Criteria andPs_delflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ps_delflag not between", value1, value2, "ps_delflag");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagIsNull() {
            addCriterion("ps_selectflag is null");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagIsNotNull() {
            addCriterion("ps_selectflag is not null");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagEqualTo(Boolean value) {
            addCriterion("ps_selectflag =", value, "ps_selectflag");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagNotEqualTo(Boolean value) {
            addCriterion("ps_selectflag <>", value, "ps_selectflag");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagGreaterThan(Boolean value) {
            addCriterion("ps_selectflag >", value, "ps_selectflag");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ps_selectflag >=", value, "ps_selectflag");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagLessThan(Boolean value) {
            addCriterion("ps_selectflag <", value, "ps_selectflag");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagLessThanOrEqualTo(Boolean value) {
            addCriterion("ps_selectflag <=", value, "ps_selectflag");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagIn(List<Boolean> values) {
            addCriterion("ps_selectflag in", values, "ps_selectflag");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagNotIn(List<Boolean> values) {
            addCriterion("ps_selectflag not in", values, "ps_selectflag");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagBetween(Boolean value1, Boolean value2) {
            addCriterion("ps_selectflag between", value1, value2, "ps_selectflag");
            return (Criteria) this;
        }

        public Criteria andPs_selectflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ps_selectflag not between", value1, value2, "ps_selectflag");
            return (Criteria) this;
        }

        public Criteria andPs_remarkIsNull() {
            addCriterion("ps_remark is null");
            return (Criteria) this;
        }

        public Criteria andPs_remarkIsNotNull() {
            addCriterion("ps_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPs_remarkEqualTo(String value) {
            addCriterion("ps_remark =", value, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_remarkNotEqualTo(String value) {
            addCriterion("ps_remark <>", value, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_remarkGreaterThan(String value) {
            addCriterion("ps_remark >", value, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("ps_remark >=", value, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_remarkLessThan(String value) {
            addCriterion("ps_remark <", value, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_remarkLessThanOrEqualTo(String value) {
            addCriterion("ps_remark <=", value, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_remarkLike(String value) {
            addCriterion("ps_remark like", value, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_remarkNotLike(String value) {
            addCriterion("ps_remark not like", value, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_remarkIn(List<String> values) {
            addCriterion("ps_remark in", values, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_remarkNotIn(List<String> values) {
            addCriterion("ps_remark not in", values, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_remarkBetween(String value1, String value2) {
            addCriterion("ps_remark between", value1, value2, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_remarkNotBetween(String value1, String value2) {
            addCriterion("ps_remark not between", value1, value2, "ps_remark");
            return (Criteria) this;
        }

        public Criteria andPs_createnoIsNull() {
            addCriterion("ps_createno is null");
            return (Criteria) this;
        }

        public Criteria andPs_createnoIsNotNull() {
            addCriterion("ps_createno is not null");
            return (Criteria) this;
        }

        public Criteria andPs_createnoEqualTo(String value) {
            addCriterion("ps_createno =", value, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createnoNotEqualTo(String value) {
            addCriterion("ps_createno <>", value, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createnoGreaterThan(String value) {
            addCriterion("ps_createno >", value, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("ps_createno >=", value, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createnoLessThan(String value) {
            addCriterion("ps_createno <", value, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createnoLessThanOrEqualTo(String value) {
            addCriterion("ps_createno <=", value, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createnoLike(String value) {
            addCriterion("ps_createno like", value, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createnoNotLike(String value) {
            addCriterion("ps_createno not like", value, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createnoIn(List<String> values) {
            addCriterion("ps_createno in", values, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createnoNotIn(List<String> values) {
            addCriterion("ps_createno not in", values, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createnoBetween(String value1, String value2) {
            addCriterion("ps_createno between", value1, value2, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createnoNotBetween(String value1, String value2) {
            addCriterion("ps_createno not between", value1, value2, "ps_createno");
            return (Criteria) this;
        }

        public Criteria andPs_createdateIsNull() {
            addCriterion("ps_createdate is null");
            return (Criteria) this;
        }

        public Criteria andPs_createdateIsNotNull() {
            addCriterion("ps_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andPs_createdateEqualTo(Date value) {
            addCriterion("ps_createdate =", value, "ps_createdate");
            return (Criteria) this;
        }

        public Criteria andPs_createdateNotEqualTo(Date value) {
            addCriterion("ps_createdate <>", value, "ps_createdate");
            return (Criteria) this;
        }

        public Criteria andPs_createdateGreaterThan(Date value) {
            addCriterion("ps_createdate >", value, "ps_createdate");
            return (Criteria) this;
        }

        public Criteria andPs_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ps_createdate >=", value, "ps_createdate");
            return (Criteria) this;
        }

        public Criteria andPs_createdateLessThan(Date value) {
            addCriterion("ps_createdate <", value, "ps_createdate");
            return (Criteria) this;
        }

        public Criteria andPs_createdateLessThanOrEqualTo(Date value) {
            addCriterion("ps_createdate <=", value, "ps_createdate");
            return (Criteria) this;
        }

        public Criteria andPs_createdateIn(List<Date> values) {
            addCriterion("ps_createdate in", values, "ps_createdate");
            return (Criteria) this;
        }

        public Criteria andPs_createdateNotIn(List<Date> values) {
            addCriterion("ps_createdate not in", values, "ps_createdate");
            return (Criteria) this;
        }

        public Criteria andPs_createdateBetween(Date value1, Date value2) {
            addCriterion("ps_createdate between", value1, value2, "ps_createdate");
            return (Criteria) this;
        }

        public Criteria andPs_createdateNotBetween(Date value1, Date value2) {
            addCriterion("ps_createdate not between", value1, value2, "ps_createdate");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoIsNull() {
            addCriterion("ps_updateno is null");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoIsNotNull() {
            addCriterion("ps_updateno is not null");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoEqualTo(String value) {
            addCriterion("ps_updateno =", value, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoNotEqualTo(String value) {
            addCriterion("ps_updateno <>", value, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoGreaterThan(String value) {
            addCriterion("ps_updateno >", value, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoGreaterThanOrEqualTo(String value) {
            addCriterion("ps_updateno >=", value, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoLessThan(String value) {
            addCriterion("ps_updateno <", value, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoLessThanOrEqualTo(String value) {
            addCriterion("ps_updateno <=", value, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoLike(String value) {
            addCriterion("ps_updateno like", value, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoNotLike(String value) {
            addCriterion("ps_updateno not like", value, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoIn(List<String> values) {
            addCriterion("ps_updateno in", values, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoNotIn(List<String> values) {
            addCriterion("ps_updateno not in", values, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoBetween(String value1, String value2) {
            addCriterion("ps_updateno between", value1, value2, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatenoNotBetween(String value1, String value2) {
            addCriterion("ps_updateno not between", value1, value2, "ps_updateno");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateIsNull() {
            addCriterion("ps_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateIsNotNull() {
            addCriterion("ps_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateEqualTo(Date value) {
            addCriterion("ps_updatedate =", value, "ps_updatedate");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateNotEqualTo(Date value) {
            addCriterion("ps_updatedate <>", value, "ps_updatedate");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateGreaterThan(Date value) {
            addCriterion("ps_updatedate >", value, "ps_updatedate");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ps_updatedate >=", value, "ps_updatedate");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateLessThan(Date value) {
            addCriterion("ps_updatedate <", value, "ps_updatedate");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("ps_updatedate <=", value, "ps_updatedate");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateIn(List<Date> values) {
            addCriterion("ps_updatedate in", values, "ps_updatedate");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateNotIn(List<Date> values) {
            addCriterion("ps_updatedate not in", values, "ps_updatedate");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateBetween(Date value1, Date value2) {
            addCriterion("ps_updatedate between", value1, value2, "ps_updatedate");
            return (Criteria) this;
        }

        public Criteria andPs_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("ps_updatedate not between", value1, value2, "ps_updatedate");
            return (Criteria) this;
        }

        public Criteria andPs_statusIsNull() {
            addCriterion("ps_status is null");
            return (Criteria) this;
        }

        public Criteria andPs_statusIsNotNull() {
            addCriterion("ps_status is not null");
            return (Criteria) this;
        }

        public Criteria andPs_statusEqualTo(Byte value) {
            addCriterion("ps_status =", value, "ps_status");
            return (Criteria) this;
        }

        public Criteria andPs_statusNotEqualTo(Byte value) {
            addCriterion("ps_status <>", value, "ps_status");
            return (Criteria) this;
        }

        public Criteria andPs_statusGreaterThan(Byte value) {
            addCriterion("ps_status >", value, "ps_status");
            return (Criteria) this;
        }

        public Criteria andPs_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ps_status >=", value, "ps_status");
            return (Criteria) this;
        }

        public Criteria andPs_statusLessThan(Byte value) {
            addCriterion("ps_status <", value, "ps_status");
            return (Criteria) this;
        }

        public Criteria andPs_statusLessThanOrEqualTo(Byte value) {
            addCriterion("ps_status <=", value, "ps_status");
            return (Criteria) this;
        }

        public Criteria andPs_statusIn(List<Byte> values) {
            addCriterion("ps_status in", values, "ps_status");
            return (Criteria) this;
        }

        public Criteria andPs_statusNotIn(List<Byte> values) {
            addCriterion("ps_status not in", values, "ps_status");
            return (Criteria) this;
        }

        public Criteria andPs_statusBetween(Byte value1, Byte value2) {
            addCriterion("ps_status between", value1, value2, "ps_status");
            return (Criteria) this;
        }

        public Criteria andPs_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("ps_status not between", value1, value2, "ps_status");
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