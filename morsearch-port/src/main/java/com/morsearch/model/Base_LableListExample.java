package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Base_LableListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Base_LableListExample() {
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

        public Criteria andBl_idIsNull() {
            addCriterion("bl_id is null");
            return (Criteria) this;
        }

        public Criteria andBl_idIsNotNull() {
            addCriterion("bl_id is not null");
            return (Criteria) this;
        }

        public Criteria andBl_idEqualTo(Long value) {
            addCriterion("bl_id =", value, "bl_id");
            return (Criteria) this;
        }

        public Criteria andBl_idNotEqualTo(Long value) {
            addCriterion("bl_id <>", value, "bl_id");
            return (Criteria) this;
        }

        public Criteria andBl_idGreaterThan(Long value) {
            addCriterion("bl_id >", value, "bl_id");
            return (Criteria) this;
        }

        public Criteria andBl_idGreaterThanOrEqualTo(Long value) {
            addCriterion("bl_id >=", value, "bl_id");
            return (Criteria) this;
        }

        public Criteria andBl_idLessThan(Long value) {
            addCriterion("bl_id <", value, "bl_id");
            return (Criteria) this;
        }

        public Criteria andBl_idLessThanOrEqualTo(Long value) {
            addCriterion("bl_id <=", value, "bl_id");
            return (Criteria) this;
        }

        public Criteria andBl_idIn(List<Long> values) {
            addCriterion("bl_id in", values, "bl_id");
            return (Criteria) this;
        }

        public Criteria andBl_idNotIn(List<Long> values) {
            addCriterion("bl_id not in", values, "bl_id");
            return (Criteria) this;
        }

        public Criteria andBl_idBetween(Long value1, Long value2) {
            addCriterion("bl_id between", value1, value2, "bl_id");
            return (Criteria) this;
        }

        public Criteria andBl_idNotBetween(Long value1, Long value2) {
            addCriterion("bl_id not between", value1, value2, "bl_id");
            return (Criteria) this;
        }

        public Criteria andBl_typeIsNull() {
            addCriterion("bl_type is null");
            return (Criteria) this;
        }

        public Criteria andBl_typeIsNotNull() {
            addCriterion("bl_type is not null");
            return (Criteria) this;
        }

        public Criteria andBl_typeEqualTo(String value) {
            addCriterion("bl_type =", value, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_typeNotEqualTo(String value) {
            addCriterion("bl_type <>", value, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_typeGreaterThan(String value) {
            addCriterion("bl_type >", value, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_typeGreaterThanOrEqualTo(String value) {
            addCriterion("bl_type >=", value, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_typeLessThan(String value) {
            addCriterion("bl_type <", value, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_typeLessThanOrEqualTo(String value) {
            addCriterion("bl_type <=", value, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_typeLike(String value) {
            addCriterion("bl_type like", value, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_typeNotLike(String value) {
            addCriterion("bl_type not like", value, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_typeIn(List<String> values) {
            addCriterion("bl_type in", values, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_typeNotIn(List<String> values) {
            addCriterion("bl_type not in", values, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_typeBetween(String value1, String value2) {
            addCriterion("bl_type between", value1, value2, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_typeNotBetween(String value1, String value2) {
            addCriterion("bl_type not between", value1, value2, "bl_type");
            return (Criteria) this;
        }

        public Criteria andBl_nameIsNull() {
            addCriterion("bl_name is null");
            return (Criteria) this;
        }

        public Criteria andBl_nameIsNotNull() {
            addCriterion("bl_name is not null");
            return (Criteria) this;
        }

        public Criteria andBl_nameEqualTo(String value) {
            addCriterion("bl_name =", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameNotEqualTo(String value) {
            addCriterion("bl_name <>", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameGreaterThan(String value) {
            addCriterion("bl_name >", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameGreaterThanOrEqualTo(String value) {
            addCriterion("bl_name >=", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameLessThan(String value) {
            addCriterion("bl_name <", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameLessThanOrEqualTo(String value) {
            addCriterion("bl_name <=", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameLike(String value) {
            addCriterion("bl_name like", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameNotLike(String value) {
            addCriterion("bl_name not like", value, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameIn(List<String> values) {
            addCriterion("bl_name in", values, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameNotIn(List<String> values) {
            addCriterion("bl_name not in", values, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameBetween(String value1, String value2) {
            addCriterion("bl_name between", value1, value2, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_nameNotBetween(String value1, String value2) {
            addCriterion("bl_name not between", value1, value2, "bl_name");
            return (Criteria) this;
        }

        public Criteria andBl_indexIsNull() {
            addCriterion("bl_index is null");
            return (Criteria) this;
        }

        public Criteria andBl_indexIsNotNull() {
            addCriterion("bl_index is not null");
            return (Criteria) this;
        }

        public Criteria andBl_indexEqualTo(Integer value) {
            addCriterion("bl_index =", value, "bl_index");
            return (Criteria) this;
        }

        public Criteria andBl_indexNotEqualTo(Integer value) {
            addCriterion("bl_index <>", value, "bl_index");
            return (Criteria) this;
        }

        public Criteria andBl_indexGreaterThan(Integer value) {
            addCriterion("bl_index >", value, "bl_index");
            return (Criteria) this;
        }

        public Criteria andBl_indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("bl_index >=", value, "bl_index");
            return (Criteria) this;
        }

        public Criteria andBl_indexLessThan(Integer value) {
            addCriterion("bl_index <", value, "bl_index");
            return (Criteria) this;
        }

        public Criteria andBl_indexLessThanOrEqualTo(Integer value) {
            addCriterion("bl_index <=", value, "bl_index");
            return (Criteria) this;
        }

        public Criteria andBl_indexIn(List<Integer> values) {
            addCriterion("bl_index in", values, "bl_index");
            return (Criteria) this;
        }

        public Criteria andBl_indexNotIn(List<Integer> values) {
            addCriterion("bl_index not in", values, "bl_index");
            return (Criteria) this;
        }

        public Criteria andBl_indexBetween(Integer value1, Integer value2) {
            addCriterion("bl_index between", value1, value2, "bl_index");
            return (Criteria) this;
        }

        public Criteria andBl_indexNotBetween(Integer value1, Integer value2) {
            addCriterion("bl_index not between", value1, value2, "bl_index");
            return (Criteria) this;
        }

        public Criteria andBl_codeIsNull() {
            addCriterion("bl_code is null");
            return (Criteria) this;
        }

        public Criteria andBl_codeIsNotNull() {
            addCriterion("bl_code is not null");
            return (Criteria) this;
        }

        public Criteria andBl_codeEqualTo(String value) {
            addCriterion("bl_code =", value, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_codeNotEqualTo(String value) {
            addCriterion("bl_code <>", value, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_codeGreaterThan(String value) {
            addCriterion("bl_code >", value, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_codeGreaterThanOrEqualTo(String value) {
            addCriterion("bl_code >=", value, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_codeLessThan(String value) {
            addCriterion("bl_code <", value, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_codeLessThanOrEqualTo(String value) {
            addCriterion("bl_code <=", value, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_codeLike(String value) {
            addCriterion("bl_code like", value, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_codeNotLike(String value) {
            addCriterion("bl_code not like", value, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_codeIn(List<String> values) {
            addCriterion("bl_code in", values, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_codeNotIn(List<String> values) {
            addCriterion("bl_code not in", values, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_codeBetween(String value1, String value2) {
            addCriterion("bl_code between", value1, value2, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_codeNotBetween(String value1, String value2) {
            addCriterion("bl_code not between", value1, value2, "bl_code");
            return (Criteria) this;
        }

        public Criteria andBl_valueIsNull() {
            addCriterion("bl_value is null");
            return (Criteria) this;
        }

        public Criteria andBl_valueIsNotNull() {
            addCriterion("bl_value is not null");
            return (Criteria) this;
        }

        public Criteria andBl_valueEqualTo(String value) {
            addCriterion("bl_value =", value, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_valueNotEqualTo(String value) {
            addCriterion("bl_value <>", value, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_valueGreaterThan(String value) {
            addCriterion("bl_value >", value, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_valueGreaterThanOrEqualTo(String value) {
            addCriterion("bl_value >=", value, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_valueLessThan(String value) {
            addCriterion("bl_value <", value, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_valueLessThanOrEqualTo(String value) {
            addCriterion("bl_value <=", value, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_valueLike(String value) {
            addCriterion("bl_value like", value, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_valueNotLike(String value) {
            addCriterion("bl_value not like", value, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_valueIn(List<String> values) {
            addCriterion("bl_value in", values, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_valueNotIn(List<String> values) {
            addCriterion("bl_value not in", values, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_valueBetween(String value1, String value2) {
            addCriterion("bl_value between", value1, value2, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_valueNotBetween(String value1, String value2) {
            addCriterion("bl_value not between", value1, value2, "bl_value");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlIsNull() {
            addCriterion("bl_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlIsNotNull() {
            addCriterion("bl_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlEqualTo(String value) {
            addCriterion("bl_imageurl =", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlNotEqualTo(String value) {
            addCriterion("bl_imageurl <>", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlGreaterThan(String value) {
            addCriterion("bl_imageurl >", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlGreaterThanOrEqualTo(String value) {
            addCriterion("bl_imageurl >=", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlLessThan(String value) {
            addCriterion("bl_imageurl <", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlLessThanOrEqualTo(String value) {
            addCriterion("bl_imageurl <=", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlLike(String value) {
            addCriterion("bl_imageurl like", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlNotLike(String value) {
            addCriterion("bl_imageurl not like", value, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlIn(List<String> values) {
            addCriterion("bl_imageurl in", values, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlNotIn(List<String> values) {
            addCriterion("bl_imageurl not in", values, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlBetween(String value1, String value2) {
            addCriterion("bl_imageurl between", value1, value2, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_imageurlNotBetween(String value1, String value2) {
            addCriterion("bl_imageurl not between", value1, value2, "bl_imageurl");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagIsNull() {
            addCriterion("bl_stopflag is null");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagIsNotNull() {
            addCriterion("bl_stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagEqualTo(Boolean value) {
            addCriterion("bl_stopflag =", value, "bl_stopflag");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagNotEqualTo(Boolean value) {
            addCriterion("bl_stopflag <>", value, "bl_stopflag");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagGreaterThan(Boolean value) {
            addCriterion("bl_stopflag >", value, "bl_stopflag");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bl_stopflag >=", value, "bl_stopflag");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagLessThan(Boolean value) {
            addCriterion("bl_stopflag <", value, "bl_stopflag");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("bl_stopflag <=", value, "bl_stopflag");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagIn(List<Boolean> values) {
            addCriterion("bl_stopflag in", values, "bl_stopflag");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagNotIn(List<Boolean> values) {
            addCriterion("bl_stopflag not in", values, "bl_stopflag");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("bl_stopflag between", value1, value2, "bl_stopflag");
            return (Criteria) this;
        }

        public Criteria andBl_stopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bl_stopflag not between", value1, value2, "bl_stopflag");
            return (Criteria) this;
        }

        public Criteria andBl_delflagIsNull() {
            addCriterion("bl_delflag is null");
            return (Criteria) this;
        }

        public Criteria andBl_delflagIsNotNull() {
            addCriterion("bl_delflag is not null");
            return (Criteria) this;
        }

        public Criteria andBl_delflagEqualTo(Boolean value) {
            addCriterion("bl_delflag =", value, "bl_delflag");
            return (Criteria) this;
        }

        public Criteria andBl_delflagNotEqualTo(Boolean value) {
            addCriterion("bl_delflag <>", value, "bl_delflag");
            return (Criteria) this;
        }

        public Criteria andBl_delflagGreaterThan(Boolean value) {
            addCriterion("bl_delflag >", value, "bl_delflag");
            return (Criteria) this;
        }

        public Criteria andBl_delflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bl_delflag >=", value, "bl_delflag");
            return (Criteria) this;
        }

        public Criteria andBl_delflagLessThan(Boolean value) {
            addCriterion("bl_delflag <", value, "bl_delflag");
            return (Criteria) this;
        }

        public Criteria andBl_delflagLessThanOrEqualTo(Boolean value) {
            addCriterion("bl_delflag <=", value, "bl_delflag");
            return (Criteria) this;
        }

        public Criteria andBl_delflagIn(List<Boolean> values) {
            addCriterion("bl_delflag in", values, "bl_delflag");
            return (Criteria) this;
        }

        public Criteria andBl_delflagNotIn(List<Boolean> values) {
            addCriterion("bl_delflag not in", values, "bl_delflag");
            return (Criteria) this;
        }

        public Criteria andBl_delflagBetween(Boolean value1, Boolean value2) {
            addCriterion("bl_delflag between", value1, value2, "bl_delflag");
            return (Criteria) this;
        }

        public Criteria andBl_delflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bl_delflag not between", value1, value2, "bl_delflag");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagIsNull() {
            addCriterion("bl_selectflag is null");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagIsNotNull() {
            addCriterion("bl_selectflag is not null");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagEqualTo(Boolean value) {
            addCriterion("bl_selectflag =", value, "bl_selectflag");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagNotEqualTo(Boolean value) {
            addCriterion("bl_selectflag <>", value, "bl_selectflag");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagGreaterThan(Boolean value) {
            addCriterion("bl_selectflag >", value, "bl_selectflag");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bl_selectflag >=", value, "bl_selectflag");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagLessThan(Boolean value) {
            addCriterion("bl_selectflag <", value, "bl_selectflag");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagLessThanOrEqualTo(Boolean value) {
            addCriterion("bl_selectflag <=", value, "bl_selectflag");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagIn(List<Boolean> values) {
            addCriterion("bl_selectflag in", values, "bl_selectflag");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagNotIn(List<Boolean> values) {
            addCriterion("bl_selectflag not in", values, "bl_selectflag");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagBetween(Boolean value1, Boolean value2) {
            addCriterion("bl_selectflag between", value1, value2, "bl_selectflag");
            return (Criteria) this;
        }

        public Criteria andBl_selectflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bl_selectflag not between", value1, value2, "bl_selectflag");
            return (Criteria) this;
        }

        public Criteria andBl_remarkIsNull() {
            addCriterion("bl_remark is null");
            return (Criteria) this;
        }

        public Criteria andBl_remarkIsNotNull() {
            addCriterion("bl_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBl_remarkEqualTo(String value) {
            addCriterion("bl_remark =", value, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_remarkNotEqualTo(String value) {
            addCriterion("bl_remark <>", value, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_remarkGreaterThan(String value) {
            addCriterion("bl_remark >", value, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("bl_remark >=", value, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_remarkLessThan(String value) {
            addCriterion("bl_remark <", value, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_remarkLessThanOrEqualTo(String value) {
            addCriterion("bl_remark <=", value, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_remarkLike(String value) {
            addCriterion("bl_remark like", value, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_remarkNotLike(String value) {
            addCriterion("bl_remark not like", value, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_remarkIn(List<String> values) {
            addCriterion("bl_remark in", values, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_remarkNotIn(List<String> values) {
            addCriterion("bl_remark not in", values, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_remarkBetween(String value1, String value2) {
            addCriterion("bl_remark between", value1, value2, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_remarkNotBetween(String value1, String value2) {
            addCriterion("bl_remark not between", value1, value2, "bl_remark");
            return (Criteria) this;
        }

        public Criteria andBl_createnoIsNull() {
            addCriterion("bl_createno is null");
            return (Criteria) this;
        }

        public Criteria andBl_createnoIsNotNull() {
            addCriterion("bl_createno is not null");
            return (Criteria) this;
        }

        public Criteria andBl_createnoEqualTo(String value) {
            addCriterion("bl_createno =", value, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createnoNotEqualTo(String value) {
            addCriterion("bl_createno <>", value, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createnoGreaterThan(String value) {
            addCriterion("bl_createno >", value, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("bl_createno >=", value, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createnoLessThan(String value) {
            addCriterion("bl_createno <", value, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createnoLessThanOrEqualTo(String value) {
            addCriterion("bl_createno <=", value, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createnoLike(String value) {
            addCriterion("bl_createno like", value, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createnoNotLike(String value) {
            addCriterion("bl_createno not like", value, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createnoIn(List<String> values) {
            addCriterion("bl_createno in", values, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createnoNotIn(List<String> values) {
            addCriterion("bl_createno not in", values, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createnoBetween(String value1, String value2) {
            addCriterion("bl_createno between", value1, value2, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createnoNotBetween(String value1, String value2) {
            addCriterion("bl_createno not between", value1, value2, "bl_createno");
            return (Criteria) this;
        }

        public Criteria andBl_createdateIsNull() {
            addCriterion("bl_createdate is null");
            return (Criteria) this;
        }

        public Criteria andBl_createdateIsNotNull() {
            addCriterion("bl_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andBl_createdateEqualTo(Date value) {
            addCriterion("bl_createdate =", value, "bl_createdate");
            return (Criteria) this;
        }

        public Criteria andBl_createdateNotEqualTo(Date value) {
            addCriterion("bl_createdate <>", value, "bl_createdate");
            return (Criteria) this;
        }

        public Criteria andBl_createdateGreaterThan(Date value) {
            addCriterion("bl_createdate >", value, "bl_createdate");
            return (Criteria) this;
        }

        public Criteria andBl_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("bl_createdate >=", value, "bl_createdate");
            return (Criteria) this;
        }

        public Criteria andBl_createdateLessThan(Date value) {
            addCriterion("bl_createdate <", value, "bl_createdate");
            return (Criteria) this;
        }

        public Criteria andBl_createdateLessThanOrEqualTo(Date value) {
            addCriterion("bl_createdate <=", value, "bl_createdate");
            return (Criteria) this;
        }

        public Criteria andBl_createdateIn(List<Date> values) {
            addCriterion("bl_createdate in", values, "bl_createdate");
            return (Criteria) this;
        }

        public Criteria andBl_createdateNotIn(List<Date> values) {
            addCriterion("bl_createdate not in", values, "bl_createdate");
            return (Criteria) this;
        }

        public Criteria andBl_createdateBetween(Date value1, Date value2) {
            addCriterion("bl_createdate between", value1, value2, "bl_createdate");
            return (Criteria) this;
        }

        public Criteria andBl_createdateNotBetween(Date value1, Date value2) {
            addCriterion("bl_createdate not between", value1, value2, "bl_createdate");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoIsNull() {
            addCriterion("bl_updateno is null");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoIsNotNull() {
            addCriterion("bl_updateno is not null");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoEqualTo(String value) {
            addCriterion("bl_updateno =", value, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoNotEqualTo(String value) {
            addCriterion("bl_updateno <>", value, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoGreaterThan(String value) {
            addCriterion("bl_updateno >", value, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoGreaterThanOrEqualTo(String value) {
            addCriterion("bl_updateno >=", value, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoLessThan(String value) {
            addCriterion("bl_updateno <", value, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoLessThanOrEqualTo(String value) {
            addCriterion("bl_updateno <=", value, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoLike(String value) {
            addCriterion("bl_updateno like", value, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoNotLike(String value) {
            addCriterion("bl_updateno not like", value, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoIn(List<String> values) {
            addCriterion("bl_updateno in", values, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoNotIn(List<String> values) {
            addCriterion("bl_updateno not in", values, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoBetween(String value1, String value2) {
            addCriterion("bl_updateno between", value1, value2, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatenoNotBetween(String value1, String value2) {
            addCriterion("bl_updateno not between", value1, value2, "bl_updateno");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateIsNull() {
            addCriterion("bl_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateIsNotNull() {
            addCriterion("bl_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateEqualTo(Date value) {
            addCriterion("bl_updatedate =", value, "bl_updatedate");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateNotEqualTo(Date value) {
            addCriterion("bl_updatedate <>", value, "bl_updatedate");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateGreaterThan(Date value) {
            addCriterion("bl_updatedate >", value, "bl_updatedate");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("bl_updatedate >=", value, "bl_updatedate");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateLessThan(Date value) {
            addCriterion("bl_updatedate <", value, "bl_updatedate");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("bl_updatedate <=", value, "bl_updatedate");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateIn(List<Date> values) {
            addCriterion("bl_updatedate in", values, "bl_updatedate");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateNotIn(List<Date> values) {
            addCriterion("bl_updatedate not in", values, "bl_updatedate");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateBetween(Date value1, Date value2) {
            addCriterion("bl_updatedate between", value1, value2, "bl_updatedate");
            return (Criteria) this;
        }

        public Criteria andBl_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("bl_updatedate not between", value1, value2, "bl_updatedate");
            return (Criteria) this;
        }

        public Criteria andBl_statusIsNull() {
            addCriterion("bl_status is null");
            return (Criteria) this;
        }

        public Criteria andBl_statusIsNotNull() {
            addCriterion("bl_status is not null");
            return (Criteria) this;
        }

        public Criteria andBl_statusEqualTo(Byte value) {
            addCriterion("bl_status =", value, "bl_status");
            return (Criteria) this;
        }

        public Criteria andBl_statusNotEqualTo(Byte value) {
            addCriterion("bl_status <>", value, "bl_status");
            return (Criteria) this;
        }

        public Criteria andBl_statusGreaterThan(Byte value) {
            addCriterion("bl_status >", value, "bl_status");
            return (Criteria) this;
        }

        public Criteria andBl_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("bl_status >=", value, "bl_status");
            return (Criteria) this;
        }

        public Criteria andBl_statusLessThan(Byte value) {
            addCriterion("bl_status <", value, "bl_status");
            return (Criteria) this;
        }

        public Criteria andBl_statusLessThanOrEqualTo(Byte value) {
            addCriterion("bl_status <=", value, "bl_status");
            return (Criteria) this;
        }

        public Criteria andBl_statusIn(List<Byte> values) {
            addCriterion("bl_status in", values, "bl_status");
            return (Criteria) this;
        }

        public Criteria andBl_statusNotIn(List<Byte> values) {
            addCriterion("bl_status not in", values, "bl_status");
            return (Criteria) this;
        }

        public Criteria andBl_statusBetween(Byte value1, Byte value2) {
            addCriterion("bl_status between", value1, value2, "bl_status");
            return (Criteria) this;
        }

        public Criteria andBl_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("bl_status not between", value1, value2, "bl_status");
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