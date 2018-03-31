package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pm_FeaturesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Pm_FeaturesExample() {
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

        public Criteria andPf_idIsNull() {
            addCriterion("pf_id is null");
            return (Criteria) this;
        }

        public Criteria andPf_idIsNotNull() {
            addCriterion("pf_id is not null");
            return (Criteria) this;
        }

        public Criteria andPf_idEqualTo(Long value) {
            addCriterion("pf_id =", value, "pf_id");
            return (Criteria) this;
        }

        public Criteria andPf_idNotEqualTo(Long value) {
            addCriterion("pf_id <>", value, "pf_id");
            return (Criteria) this;
        }

        public Criteria andPf_idGreaterThan(Long value) {
            addCriterion("pf_id >", value, "pf_id");
            return (Criteria) this;
        }

        public Criteria andPf_idGreaterThanOrEqualTo(Long value) {
            addCriterion("pf_id >=", value, "pf_id");
            return (Criteria) this;
        }

        public Criteria andPf_idLessThan(Long value) {
            addCriterion("pf_id <", value, "pf_id");
            return (Criteria) this;
        }

        public Criteria andPf_idLessThanOrEqualTo(Long value) {
            addCriterion("pf_id <=", value, "pf_id");
            return (Criteria) this;
        }

        public Criteria andPf_idIn(List<Long> values) {
            addCriterion("pf_id in", values, "pf_id");
            return (Criteria) this;
        }

        public Criteria andPf_idNotIn(List<Long> values) {
            addCriterion("pf_id not in", values, "pf_id");
            return (Criteria) this;
        }

        public Criteria andPf_idBetween(Long value1, Long value2) {
            addCriterion("pf_id between", value1, value2, "pf_id");
            return (Criteria) this;
        }

        public Criteria andPf_idNotBetween(Long value1, Long value2) {
            addCriterion("pf_id not between", value1, value2, "pf_id");
            return (Criteria) this;
        }

        public Criteria andPf_nameIsNull() {
            addCriterion("pf_name is null");
            return (Criteria) this;
        }

        public Criteria andPf_nameIsNotNull() {
            addCriterion("pf_name is not null");
            return (Criteria) this;
        }

        public Criteria andPf_nameEqualTo(String value) {
            addCriterion("pf_name =", value, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_nameNotEqualTo(String value) {
            addCriterion("pf_name <>", value, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_nameGreaterThan(String value) {
            addCriterion("pf_name >", value, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_nameGreaterThanOrEqualTo(String value) {
            addCriterion("pf_name >=", value, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_nameLessThan(String value) {
            addCriterion("pf_name <", value, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_nameLessThanOrEqualTo(String value) {
            addCriterion("pf_name <=", value, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_nameLike(String value) {
            addCriterion("pf_name like", value, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_nameNotLike(String value) {
            addCriterion("pf_name not like", value, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_nameIn(List<String> values) {
            addCriterion("pf_name in", values, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_nameNotIn(List<String> values) {
            addCriterion("pf_name not in", values, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_nameBetween(String value1, String value2) {
            addCriterion("pf_name between", value1, value2, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_nameNotBetween(String value1, String value2) {
            addCriterion("pf_name not between", value1, value2, "pf_name");
            return (Criteria) this;
        }

        public Criteria andPf_styleidIsNull() {
            addCriterion("pf_styleid is null");
            return (Criteria) this;
        }

        public Criteria andPf_styleidIsNotNull() {
            addCriterion("pf_styleid is not null");
            return (Criteria) this;
        }

        public Criteria andPf_styleidEqualTo(Long value) {
            addCriterion("pf_styleid =", value, "pf_styleid");
            return (Criteria) this;
        }

        public Criteria andPf_styleidNotEqualTo(Long value) {
            addCriterion("pf_styleid <>", value, "pf_styleid");
            return (Criteria) this;
        }

        public Criteria andPf_styleidGreaterThan(Long value) {
            addCriterion("pf_styleid >", value, "pf_styleid");
            return (Criteria) this;
        }

        public Criteria andPf_styleidGreaterThanOrEqualTo(Long value) {
            addCriterion("pf_styleid >=", value, "pf_styleid");
            return (Criteria) this;
        }

        public Criteria andPf_styleidLessThan(Long value) {
            addCriterion("pf_styleid <", value, "pf_styleid");
            return (Criteria) this;
        }

        public Criteria andPf_styleidLessThanOrEqualTo(Long value) {
            addCriterion("pf_styleid <=", value, "pf_styleid");
            return (Criteria) this;
        }

        public Criteria andPf_styleidIn(List<Long> values) {
            addCriterion("pf_styleid in", values, "pf_styleid");
            return (Criteria) this;
        }

        public Criteria andPf_styleidNotIn(List<Long> values) {
            addCriterion("pf_styleid not in", values, "pf_styleid");
            return (Criteria) this;
        }

        public Criteria andPf_styleidBetween(Long value1, Long value2) {
            addCriterion("pf_styleid between", value1, value2, "pf_styleid");
            return (Criteria) this;
        }

        public Criteria andPf_styleidNotBetween(Long value1, Long value2) {
            addCriterion("pf_styleid not between", value1, value2, "pf_styleid");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameIsNull() {
            addCriterion("pf_stylename is null");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameIsNotNull() {
            addCriterion("pf_stylename is not null");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameEqualTo(String value) {
            addCriterion("pf_stylename =", value, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameNotEqualTo(String value) {
            addCriterion("pf_stylename <>", value, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameGreaterThan(String value) {
            addCriterion("pf_stylename >", value, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameGreaterThanOrEqualTo(String value) {
            addCriterion("pf_stylename >=", value, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameLessThan(String value) {
            addCriterion("pf_stylename <", value, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameLessThanOrEqualTo(String value) {
            addCriterion("pf_stylename <=", value, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameLike(String value) {
            addCriterion("pf_stylename like", value, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameNotLike(String value) {
            addCriterion("pf_stylename not like", value, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameIn(List<String> values) {
            addCriterion("pf_stylename in", values, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameNotIn(List<String> values) {
            addCriterion("pf_stylename not in", values, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameBetween(String value1, String value2) {
            addCriterion("pf_stylename between", value1, value2, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_stylenameNotBetween(String value1, String value2) {
            addCriterion("pf_stylename not between", value1, value2, "pf_stylename");
            return (Criteria) this;
        }

        public Criteria andPf_indexIsNull() {
            addCriterion("pf_index is null");
            return (Criteria) this;
        }

        public Criteria andPf_indexIsNotNull() {
            addCriterion("pf_index is not null");
            return (Criteria) this;
        }

        public Criteria andPf_indexEqualTo(Integer value) {
            addCriterion("pf_index =", value, "pf_index");
            return (Criteria) this;
        }

        public Criteria andPf_indexNotEqualTo(Integer value) {
            addCriterion("pf_index <>", value, "pf_index");
            return (Criteria) this;
        }

        public Criteria andPf_indexGreaterThan(Integer value) {
            addCriterion("pf_index >", value, "pf_index");
            return (Criteria) this;
        }

        public Criteria andPf_indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("pf_index >=", value, "pf_index");
            return (Criteria) this;
        }

        public Criteria andPf_indexLessThan(Integer value) {
            addCriterion("pf_index <", value, "pf_index");
            return (Criteria) this;
        }

        public Criteria andPf_indexLessThanOrEqualTo(Integer value) {
            addCriterion("pf_index <=", value, "pf_index");
            return (Criteria) this;
        }

        public Criteria andPf_indexIn(List<Integer> values) {
            addCriterion("pf_index in", values, "pf_index");
            return (Criteria) this;
        }

        public Criteria andPf_indexNotIn(List<Integer> values) {
            addCriterion("pf_index not in", values, "pf_index");
            return (Criteria) this;
        }

        public Criteria andPf_indexBetween(Integer value1, Integer value2) {
            addCriterion("pf_index between", value1, value2, "pf_index");
            return (Criteria) this;
        }

        public Criteria andPf_indexNotBetween(Integer value1, Integer value2) {
            addCriterion("pf_index not between", value1, value2, "pf_index");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagIsNull() {
            addCriterion("pf_stopflag is null");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagIsNotNull() {
            addCriterion("pf_stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagEqualTo(Boolean value) {
            addCriterion("pf_stopflag =", value, "pf_stopflag");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagNotEqualTo(Boolean value) {
            addCriterion("pf_stopflag <>", value, "pf_stopflag");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagGreaterThan(Boolean value) {
            addCriterion("pf_stopflag >", value, "pf_stopflag");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pf_stopflag >=", value, "pf_stopflag");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagLessThan(Boolean value) {
            addCriterion("pf_stopflag <", value, "pf_stopflag");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("pf_stopflag <=", value, "pf_stopflag");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagIn(List<Boolean> values) {
            addCriterion("pf_stopflag in", values, "pf_stopflag");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagNotIn(List<Boolean> values) {
            addCriterion("pf_stopflag not in", values, "pf_stopflag");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("pf_stopflag between", value1, value2, "pf_stopflag");
            return (Criteria) this;
        }

        public Criteria andPf_stopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pf_stopflag not between", value1, value2, "pf_stopflag");
            return (Criteria) this;
        }

        public Criteria andPf_delflagIsNull() {
            addCriterion("pf_delflag is null");
            return (Criteria) this;
        }

        public Criteria andPf_delflagIsNotNull() {
            addCriterion("pf_delflag is not null");
            return (Criteria) this;
        }

        public Criteria andPf_delflagEqualTo(Boolean value) {
            addCriterion("pf_delflag =", value, "pf_delflag");
            return (Criteria) this;
        }

        public Criteria andPf_delflagNotEqualTo(Boolean value) {
            addCriterion("pf_delflag <>", value, "pf_delflag");
            return (Criteria) this;
        }

        public Criteria andPf_delflagGreaterThan(Boolean value) {
            addCriterion("pf_delflag >", value, "pf_delflag");
            return (Criteria) this;
        }

        public Criteria andPf_delflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pf_delflag >=", value, "pf_delflag");
            return (Criteria) this;
        }

        public Criteria andPf_delflagLessThan(Boolean value) {
            addCriterion("pf_delflag <", value, "pf_delflag");
            return (Criteria) this;
        }

        public Criteria andPf_delflagLessThanOrEqualTo(Boolean value) {
            addCriterion("pf_delflag <=", value, "pf_delflag");
            return (Criteria) this;
        }

        public Criteria andPf_delflagIn(List<Boolean> values) {
            addCriterion("pf_delflag in", values, "pf_delflag");
            return (Criteria) this;
        }

        public Criteria andPf_delflagNotIn(List<Boolean> values) {
            addCriterion("pf_delflag not in", values, "pf_delflag");
            return (Criteria) this;
        }

        public Criteria andPf_delflagBetween(Boolean value1, Boolean value2) {
            addCriterion("pf_delflag between", value1, value2, "pf_delflag");
            return (Criteria) this;
        }

        public Criteria andPf_delflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pf_delflag not between", value1, value2, "pf_delflag");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagIsNull() {
            addCriterion("pf_selectflag is null");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagIsNotNull() {
            addCriterion("pf_selectflag is not null");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagEqualTo(Boolean value) {
            addCriterion("pf_selectflag =", value, "pf_selectflag");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagNotEqualTo(Boolean value) {
            addCriterion("pf_selectflag <>", value, "pf_selectflag");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagGreaterThan(Boolean value) {
            addCriterion("pf_selectflag >", value, "pf_selectflag");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pf_selectflag >=", value, "pf_selectflag");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagLessThan(Boolean value) {
            addCriterion("pf_selectflag <", value, "pf_selectflag");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagLessThanOrEqualTo(Boolean value) {
            addCriterion("pf_selectflag <=", value, "pf_selectflag");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagIn(List<Boolean> values) {
            addCriterion("pf_selectflag in", values, "pf_selectflag");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagNotIn(List<Boolean> values) {
            addCriterion("pf_selectflag not in", values, "pf_selectflag");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagBetween(Boolean value1, Boolean value2) {
            addCriterion("pf_selectflag between", value1, value2, "pf_selectflag");
            return (Criteria) this;
        }

        public Criteria andPf_selectflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pf_selectflag not between", value1, value2, "pf_selectflag");
            return (Criteria) this;
        }

        public Criteria andPf_remarkIsNull() {
            addCriterion("pf_remark is null");
            return (Criteria) this;
        }

        public Criteria andPf_remarkIsNotNull() {
            addCriterion("pf_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPf_remarkEqualTo(String value) {
            addCriterion("pf_remark =", value, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_remarkNotEqualTo(String value) {
            addCriterion("pf_remark <>", value, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_remarkGreaterThan(String value) {
            addCriterion("pf_remark >", value, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("pf_remark >=", value, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_remarkLessThan(String value) {
            addCriterion("pf_remark <", value, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_remarkLessThanOrEqualTo(String value) {
            addCriterion("pf_remark <=", value, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_remarkLike(String value) {
            addCriterion("pf_remark like", value, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_remarkNotLike(String value) {
            addCriterion("pf_remark not like", value, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_remarkIn(List<String> values) {
            addCriterion("pf_remark in", values, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_remarkNotIn(List<String> values) {
            addCriterion("pf_remark not in", values, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_remarkBetween(String value1, String value2) {
            addCriterion("pf_remark between", value1, value2, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_remarkNotBetween(String value1, String value2) {
            addCriterion("pf_remark not between", value1, value2, "pf_remark");
            return (Criteria) this;
        }

        public Criteria andPf_createnoIsNull() {
            addCriterion("pf_createno is null");
            return (Criteria) this;
        }

        public Criteria andPf_createnoIsNotNull() {
            addCriterion("pf_createno is not null");
            return (Criteria) this;
        }

        public Criteria andPf_createnoEqualTo(String value) {
            addCriterion("pf_createno =", value, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createnoNotEqualTo(String value) {
            addCriterion("pf_createno <>", value, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createnoGreaterThan(String value) {
            addCriterion("pf_createno >", value, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("pf_createno >=", value, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createnoLessThan(String value) {
            addCriterion("pf_createno <", value, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createnoLessThanOrEqualTo(String value) {
            addCriterion("pf_createno <=", value, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createnoLike(String value) {
            addCriterion("pf_createno like", value, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createnoNotLike(String value) {
            addCriterion("pf_createno not like", value, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createnoIn(List<String> values) {
            addCriterion("pf_createno in", values, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createnoNotIn(List<String> values) {
            addCriterion("pf_createno not in", values, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createnoBetween(String value1, String value2) {
            addCriterion("pf_createno between", value1, value2, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createnoNotBetween(String value1, String value2) {
            addCriterion("pf_createno not between", value1, value2, "pf_createno");
            return (Criteria) this;
        }

        public Criteria andPf_createdateIsNull() {
            addCriterion("pf_createdate is null");
            return (Criteria) this;
        }

        public Criteria andPf_createdateIsNotNull() {
            addCriterion("pf_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andPf_createdateEqualTo(Date value) {
            addCriterion("pf_createdate =", value, "pf_createdate");
            return (Criteria) this;
        }

        public Criteria andPf_createdateNotEqualTo(Date value) {
            addCriterion("pf_createdate <>", value, "pf_createdate");
            return (Criteria) this;
        }

        public Criteria andPf_createdateGreaterThan(Date value) {
            addCriterion("pf_createdate >", value, "pf_createdate");
            return (Criteria) this;
        }

        public Criteria andPf_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("pf_createdate >=", value, "pf_createdate");
            return (Criteria) this;
        }

        public Criteria andPf_createdateLessThan(Date value) {
            addCriterion("pf_createdate <", value, "pf_createdate");
            return (Criteria) this;
        }

        public Criteria andPf_createdateLessThanOrEqualTo(Date value) {
            addCriterion("pf_createdate <=", value, "pf_createdate");
            return (Criteria) this;
        }

        public Criteria andPf_createdateIn(List<Date> values) {
            addCriterion("pf_createdate in", values, "pf_createdate");
            return (Criteria) this;
        }

        public Criteria andPf_createdateNotIn(List<Date> values) {
            addCriterion("pf_createdate not in", values, "pf_createdate");
            return (Criteria) this;
        }

        public Criteria andPf_createdateBetween(Date value1, Date value2) {
            addCriterion("pf_createdate between", value1, value2, "pf_createdate");
            return (Criteria) this;
        }

        public Criteria andPf_createdateNotBetween(Date value1, Date value2) {
            addCriterion("pf_createdate not between", value1, value2, "pf_createdate");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoIsNull() {
            addCriterion("pf_updateno is null");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoIsNotNull() {
            addCriterion("pf_updateno is not null");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoEqualTo(String value) {
            addCriterion("pf_updateno =", value, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoNotEqualTo(String value) {
            addCriterion("pf_updateno <>", value, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoGreaterThan(String value) {
            addCriterion("pf_updateno >", value, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoGreaterThanOrEqualTo(String value) {
            addCriterion("pf_updateno >=", value, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoLessThan(String value) {
            addCriterion("pf_updateno <", value, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoLessThanOrEqualTo(String value) {
            addCriterion("pf_updateno <=", value, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoLike(String value) {
            addCriterion("pf_updateno like", value, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoNotLike(String value) {
            addCriterion("pf_updateno not like", value, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoIn(List<String> values) {
            addCriterion("pf_updateno in", values, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoNotIn(List<String> values) {
            addCriterion("pf_updateno not in", values, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoBetween(String value1, String value2) {
            addCriterion("pf_updateno between", value1, value2, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatenoNotBetween(String value1, String value2) {
            addCriterion("pf_updateno not between", value1, value2, "pf_updateno");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateIsNull() {
            addCriterion("pf_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateIsNotNull() {
            addCriterion("pf_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateEqualTo(Date value) {
            addCriterion("pf_updatedate =", value, "pf_updatedate");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateNotEqualTo(Date value) {
            addCriterion("pf_updatedate <>", value, "pf_updatedate");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateGreaterThan(Date value) {
            addCriterion("pf_updatedate >", value, "pf_updatedate");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("pf_updatedate >=", value, "pf_updatedate");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateLessThan(Date value) {
            addCriterion("pf_updatedate <", value, "pf_updatedate");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("pf_updatedate <=", value, "pf_updatedate");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateIn(List<Date> values) {
            addCriterion("pf_updatedate in", values, "pf_updatedate");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateNotIn(List<Date> values) {
            addCriterion("pf_updatedate not in", values, "pf_updatedate");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateBetween(Date value1, Date value2) {
            addCriterion("pf_updatedate between", value1, value2, "pf_updatedate");
            return (Criteria) this;
        }

        public Criteria andPf_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("pf_updatedate not between", value1, value2, "pf_updatedate");
            return (Criteria) this;
        }

        public Criteria andPf_statusIsNull() {
            addCriterion("pf_status is null");
            return (Criteria) this;
        }

        public Criteria andPf_statusIsNotNull() {
            addCriterion("pf_status is not null");
            return (Criteria) this;
        }

        public Criteria andPf_statusEqualTo(Byte value) {
            addCriterion("pf_status =", value, "pf_status");
            return (Criteria) this;
        }

        public Criteria andPf_statusNotEqualTo(Byte value) {
            addCriterion("pf_status <>", value, "pf_status");
            return (Criteria) this;
        }

        public Criteria andPf_statusGreaterThan(Byte value) {
            addCriterion("pf_status >", value, "pf_status");
            return (Criteria) this;
        }

        public Criteria andPf_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pf_status >=", value, "pf_status");
            return (Criteria) this;
        }

        public Criteria andPf_statusLessThan(Byte value) {
            addCriterion("pf_status <", value, "pf_status");
            return (Criteria) this;
        }

        public Criteria andPf_statusLessThanOrEqualTo(Byte value) {
            addCriterion("pf_status <=", value, "pf_status");
            return (Criteria) this;
        }

        public Criteria andPf_statusIn(List<Byte> values) {
            addCriterion("pf_status in", values, "pf_status");
            return (Criteria) this;
        }

        public Criteria andPf_statusNotIn(List<Byte> values) {
            addCriterion("pf_status not in", values, "pf_status");
            return (Criteria) this;
        }

        public Criteria andPf_statusBetween(Byte value1, Byte value2) {
            addCriterion("pf_status between", value1, value2, "pf_status");
            return (Criteria) this;
        }

        public Criteria andPf_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("pf_status not between", value1, value2, "pf_status");
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