package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallV_HomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallV_HomeExample() {
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

        public Criteria andMh_idIsNull() {
            addCriterion("mh_id is null");
            return (Criteria) this;
        }

        public Criteria andMh_idIsNotNull() {
            addCriterion("mh_id is not null");
            return (Criteria) this;
        }

        public Criteria andMh_idEqualTo(Long value) {
            addCriterion("mh_id =", value, "mh_id");
            return (Criteria) this;
        }

        public Criteria andMh_idNotEqualTo(Long value) {
            addCriterion("mh_id <>", value, "mh_id");
            return (Criteria) this;
        }

        public Criteria andMh_idGreaterThan(Long value) {
            addCriterion("mh_id >", value, "mh_id");
            return (Criteria) this;
        }

        public Criteria andMh_idGreaterThanOrEqualTo(Long value) {
            addCriterion("mh_id >=", value, "mh_id");
            return (Criteria) this;
        }

        public Criteria andMh_idLessThan(Long value) {
            addCriterion("mh_id <", value, "mh_id");
            return (Criteria) this;
        }

        public Criteria andMh_idLessThanOrEqualTo(Long value) {
            addCriterion("mh_id <=", value, "mh_id");
            return (Criteria) this;
        }

        public Criteria andMh_idIn(List<Long> values) {
            addCriterion("mh_id in", values, "mh_id");
            return (Criteria) this;
        }

        public Criteria andMh_idNotIn(List<Long> values) {
            addCriterion("mh_id not in", values, "mh_id");
            return (Criteria) this;
        }

        public Criteria andMh_idBetween(Long value1, Long value2) {
            addCriterion("mh_id between", value1, value2, "mh_id");
            return (Criteria) this;
        }

        public Criteria andMh_idNotBetween(Long value1, Long value2) {
            addCriterion("mh_id not between", value1, value2, "mh_id");
            return (Criteria) this;
        }

        public Criteria andMh_typeIsNull() {
            addCriterion("mh_type is null");
            return (Criteria) this;
        }

        public Criteria andMh_typeIsNotNull() {
            addCriterion("mh_type is not null");
            return (Criteria) this;
        }

        public Criteria andMh_typeEqualTo(Byte value) {
            addCriterion("mh_type =", value, "mh_type");
            return (Criteria) this;
        }

        public Criteria andMh_typeNotEqualTo(Byte value) {
            addCriterion("mh_type <>", value, "mh_type");
            return (Criteria) this;
        }

        public Criteria andMh_typeGreaterThan(Byte value) {
            addCriterion("mh_type >", value, "mh_type");
            return (Criteria) this;
        }

        public Criteria andMh_typeGreaterThanOrEqualTo(Byte value) {
            addCriterion("mh_type >=", value, "mh_type");
            return (Criteria) this;
        }

        public Criteria andMh_typeLessThan(Byte value) {
            addCriterion("mh_type <", value, "mh_type");
            return (Criteria) this;
        }

        public Criteria andMh_typeLessThanOrEqualTo(Byte value) {
            addCriterion("mh_type <=", value, "mh_type");
            return (Criteria) this;
        }

        public Criteria andMh_typeIn(List<Byte> values) {
            addCriterion("mh_type in", values, "mh_type");
            return (Criteria) this;
        }

        public Criteria andMh_typeNotIn(List<Byte> values) {
            addCriterion("mh_type not in", values, "mh_type");
            return (Criteria) this;
        }

        public Criteria andMh_typeBetween(Byte value1, Byte value2) {
            addCriterion("mh_type between", value1, value2, "mh_type");
            return (Criteria) this;
        }

        public Criteria andMh_typeNotBetween(Byte value1, Byte value2) {
            addCriterion("mh_type not between", value1, value2, "mh_type");
            return (Criteria) this;
        }

        public Criteria andMh_goodidIsNull() {
            addCriterion("mh_goodid is null");
            return (Criteria) this;
        }

        public Criteria andMh_goodidIsNotNull() {
            addCriterion("mh_goodid is not null");
            return (Criteria) this;
        }

        public Criteria andMh_goodidEqualTo(Long value) {
            addCriterion("mh_goodid =", value, "mh_goodid");
            return (Criteria) this;
        }

        public Criteria andMh_goodidNotEqualTo(Long value) {
            addCriterion("mh_goodid <>", value, "mh_goodid");
            return (Criteria) this;
        }

        public Criteria andMh_goodidGreaterThan(Long value) {
            addCriterion("mh_goodid >", value, "mh_goodid");
            return (Criteria) this;
        }

        public Criteria andMh_goodidGreaterThanOrEqualTo(Long value) {
            addCriterion("mh_goodid >=", value, "mh_goodid");
            return (Criteria) this;
        }

        public Criteria andMh_goodidLessThan(Long value) {
            addCriterion("mh_goodid <", value, "mh_goodid");
            return (Criteria) this;
        }

        public Criteria andMh_goodidLessThanOrEqualTo(Long value) {
            addCriterion("mh_goodid <=", value, "mh_goodid");
            return (Criteria) this;
        }

        public Criteria andMh_goodidIn(List<Long> values) {
            addCriterion("mh_goodid in", values, "mh_goodid");
            return (Criteria) this;
        }

        public Criteria andMh_goodidNotIn(List<Long> values) {
            addCriterion("mh_goodid not in", values, "mh_goodid");
            return (Criteria) this;
        }

        public Criteria andMh_goodidBetween(Long value1, Long value2) {
            addCriterion("mh_goodid between", value1, value2, "mh_goodid");
            return (Criteria) this;
        }

        public Criteria andMh_goodidNotBetween(Long value1, Long value2) {
            addCriterion("mh_goodid not between", value1, value2, "mh_goodid");
            return (Criteria) this;
        }

        public Criteria andMh_indexIsNull() {
            addCriterion("mh_index is null");
            return (Criteria) this;
        }

        public Criteria andMh_indexIsNotNull() {
            addCriterion("mh_index is not null");
            return (Criteria) this;
        }

        public Criteria andMh_indexEqualTo(Integer value) {
            addCriterion("mh_index =", value, "mh_index");
            return (Criteria) this;
        }

        public Criteria andMh_indexNotEqualTo(Integer value) {
            addCriterion("mh_index <>", value, "mh_index");
            return (Criteria) this;
        }

        public Criteria andMh_indexGreaterThan(Integer value) {
            addCriterion("mh_index >", value, "mh_index");
            return (Criteria) this;
        }

        public Criteria andMh_indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("mh_index >=", value, "mh_index");
            return (Criteria) this;
        }

        public Criteria andMh_indexLessThan(Integer value) {
            addCriterion("mh_index <", value, "mh_index");
            return (Criteria) this;
        }

        public Criteria andMh_indexLessThanOrEqualTo(Integer value) {
            addCriterion("mh_index <=", value, "mh_index");
            return (Criteria) this;
        }

        public Criteria andMh_indexIn(List<Integer> values) {
            addCriterion("mh_index in", values, "mh_index");
            return (Criteria) this;
        }

        public Criteria andMh_indexNotIn(List<Integer> values) {
            addCriterion("mh_index not in", values, "mh_index");
            return (Criteria) this;
        }

        public Criteria andMh_indexBetween(Integer value1, Integer value2) {
            addCriterion("mh_index between", value1, value2, "mh_index");
            return (Criteria) this;
        }

        public Criteria andMh_indexNotBetween(Integer value1, Integer value2) {
            addCriterion("mh_index not between", value1, value2, "mh_index");
            return (Criteria) this;
        }

        public Criteria andMh_remarkIsNull() {
            addCriterion("mh_remark is null");
            return (Criteria) this;
        }

        public Criteria andMh_remarkIsNotNull() {
            addCriterion("mh_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMh_remarkEqualTo(String value) {
            addCriterion("mh_remark =", value, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_remarkNotEqualTo(String value) {
            addCriterion("mh_remark <>", value, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_remarkGreaterThan(String value) {
            addCriterion("mh_remark >", value, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("mh_remark >=", value, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_remarkLessThan(String value) {
            addCriterion("mh_remark <", value, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_remarkLessThanOrEqualTo(String value) {
            addCriterion("mh_remark <=", value, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_remarkLike(String value) {
            addCriterion("mh_remark like", value, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_remarkNotLike(String value) {
            addCriterion("mh_remark not like", value, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_remarkIn(List<String> values) {
            addCriterion("mh_remark in", values, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_remarkNotIn(List<String> values) {
            addCriterion("mh_remark not in", values, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_remarkBetween(String value1, String value2) {
            addCriterion("mh_remark between", value1, value2, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_remarkNotBetween(String value1, String value2) {
            addCriterion("mh_remark not between", value1, value2, "mh_remark");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagIsNull() {
            addCriterion("mh_stopflag is null");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagIsNotNull() {
            addCriterion("mh_stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagEqualTo(Boolean value) {
            addCriterion("mh_stopflag =", value, "mh_stopflag");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagNotEqualTo(Boolean value) {
            addCriterion("mh_stopflag <>", value, "mh_stopflag");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagGreaterThan(Boolean value) {
            addCriterion("mh_stopflag >", value, "mh_stopflag");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mh_stopflag >=", value, "mh_stopflag");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagLessThan(Boolean value) {
            addCriterion("mh_stopflag <", value, "mh_stopflag");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("mh_stopflag <=", value, "mh_stopflag");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagIn(List<Boolean> values) {
            addCriterion("mh_stopflag in", values, "mh_stopflag");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagNotIn(List<Boolean> values) {
            addCriterion("mh_stopflag not in", values, "mh_stopflag");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("mh_stopflag between", value1, value2, "mh_stopflag");
            return (Criteria) this;
        }

        public Criteria andMh_stopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mh_stopflag not between", value1, value2, "mh_stopflag");
            return (Criteria) this;
        }

        public Criteria andMh_createnoIsNull() {
            addCriterion("mh_createno is null");
            return (Criteria) this;
        }

        public Criteria andMh_createnoIsNotNull() {
            addCriterion("mh_createno is not null");
            return (Criteria) this;
        }

        public Criteria andMh_createnoEqualTo(String value) {
            addCriterion("mh_createno =", value, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createnoNotEqualTo(String value) {
            addCriterion("mh_createno <>", value, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createnoGreaterThan(String value) {
            addCriterion("mh_createno >", value, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("mh_createno >=", value, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createnoLessThan(String value) {
            addCriterion("mh_createno <", value, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createnoLessThanOrEqualTo(String value) {
            addCriterion("mh_createno <=", value, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createnoLike(String value) {
            addCriterion("mh_createno like", value, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createnoNotLike(String value) {
            addCriterion("mh_createno not like", value, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createnoIn(List<String> values) {
            addCriterion("mh_createno in", values, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createnoNotIn(List<String> values) {
            addCriterion("mh_createno not in", values, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createnoBetween(String value1, String value2) {
            addCriterion("mh_createno between", value1, value2, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createnoNotBetween(String value1, String value2) {
            addCriterion("mh_createno not between", value1, value2, "mh_createno");
            return (Criteria) this;
        }

        public Criteria andMh_createdateIsNull() {
            addCriterion("mh_createdate is null");
            return (Criteria) this;
        }

        public Criteria andMh_createdateIsNotNull() {
            addCriterion("mh_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andMh_createdateEqualTo(Date value) {
            addCriterion("mh_createdate =", value, "mh_createdate");
            return (Criteria) this;
        }

        public Criteria andMh_createdateNotEqualTo(Date value) {
            addCriterion("mh_createdate <>", value, "mh_createdate");
            return (Criteria) this;
        }

        public Criteria andMh_createdateGreaterThan(Date value) {
            addCriterion("mh_createdate >", value, "mh_createdate");
            return (Criteria) this;
        }

        public Criteria andMh_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("mh_createdate >=", value, "mh_createdate");
            return (Criteria) this;
        }

        public Criteria andMh_createdateLessThan(Date value) {
            addCriterion("mh_createdate <", value, "mh_createdate");
            return (Criteria) this;
        }

        public Criteria andMh_createdateLessThanOrEqualTo(Date value) {
            addCriterion("mh_createdate <=", value, "mh_createdate");
            return (Criteria) this;
        }

        public Criteria andMh_createdateIn(List<Date> values) {
            addCriterion("mh_createdate in", values, "mh_createdate");
            return (Criteria) this;
        }

        public Criteria andMh_createdateNotIn(List<Date> values) {
            addCriterion("mh_createdate not in", values, "mh_createdate");
            return (Criteria) this;
        }

        public Criteria andMh_createdateBetween(Date value1, Date value2) {
            addCriterion("mh_createdate between", value1, value2, "mh_createdate");
            return (Criteria) this;
        }

        public Criteria andMh_createdateNotBetween(Date value1, Date value2) {
            addCriterion("mh_createdate not between", value1, value2, "mh_createdate");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoIsNull() {
            addCriterion("mh_updateno is null");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoIsNotNull() {
            addCriterion("mh_updateno is not null");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoEqualTo(String value) {
            addCriterion("mh_updateno =", value, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoNotEqualTo(String value) {
            addCriterion("mh_updateno <>", value, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoGreaterThan(String value) {
            addCriterion("mh_updateno >", value, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoGreaterThanOrEqualTo(String value) {
            addCriterion("mh_updateno >=", value, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoLessThan(String value) {
            addCriterion("mh_updateno <", value, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoLessThanOrEqualTo(String value) {
            addCriterion("mh_updateno <=", value, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoLike(String value) {
            addCriterion("mh_updateno like", value, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoNotLike(String value) {
            addCriterion("mh_updateno not like", value, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoIn(List<String> values) {
            addCriterion("mh_updateno in", values, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoNotIn(List<String> values) {
            addCriterion("mh_updateno not in", values, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoBetween(String value1, String value2) {
            addCriterion("mh_updateno between", value1, value2, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatenoNotBetween(String value1, String value2) {
            addCriterion("mh_updateno not between", value1, value2, "mh_updateno");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateIsNull() {
            addCriterion("mh_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateIsNotNull() {
            addCriterion("mh_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateEqualTo(Date value) {
            addCriterion("mh_updatedate =", value, "mh_updatedate");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateNotEqualTo(Date value) {
            addCriterion("mh_updatedate <>", value, "mh_updatedate");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateGreaterThan(Date value) {
            addCriterion("mh_updatedate >", value, "mh_updatedate");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("mh_updatedate >=", value, "mh_updatedate");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateLessThan(Date value) {
            addCriterion("mh_updatedate <", value, "mh_updatedate");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("mh_updatedate <=", value, "mh_updatedate");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateIn(List<Date> values) {
            addCriterion("mh_updatedate in", values, "mh_updatedate");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateNotIn(List<Date> values) {
            addCriterion("mh_updatedate not in", values, "mh_updatedate");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateBetween(Date value1, Date value2) {
            addCriterion("mh_updatedate between", value1, value2, "mh_updatedate");
            return (Criteria) this;
        }

        public Criteria andMh_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("mh_updatedate not between", value1, value2, "mh_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_titleIsNull() {
            addCriterion("mg_title is null");
            return (Criteria) this;
        }

        public Criteria andMg_titleIsNotNull() {
            addCriterion("mg_title is not null");
            return (Criteria) this;
        }

        public Criteria andMg_titleEqualTo(String value) {
            addCriterion("mg_title =", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleNotEqualTo(String value) {
            addCriterion("mg_title <>", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleGreaterThan(String value) {
            addCriterion("mg_title >", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleGreaterThanOrEqualTo(String value) {
            addCriterion("mg_title >=", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleLessThan(String value) {
            addCriterion("mg_title <", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleLessThanOrEqualTo(String value) {
            addCriterion("mg_title <=", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleLike(String value) {
            addCriterion("mg_title like", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleNotLike(String value) {
            addCriterion("mg_title not like", value, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleIn(List<String> values) {
            addCriterion("mg_title in", values, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleNotIn(List<String> values) {
            addCriterion("mg_title not in", values, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleBetween(String value1, String value2) {
            addCriterion("mg_title between", value1, value2, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_titleNotBetween(String value1, String value2) {
            addCriterion("mg_title not between", value1, value2, "mg_title");
            return (Criteria) this;
        }

        public Criteria andMg_subheadIsNull() {
            addCriterion("mg_subhead is null");
            return (Criteria) this;
        }

        public Criteria andMg_subheadIsNotNull() {
            addCriterion("mg_subhead is not null");
            return (Criteria) this;
        }

        public Criteria andMg_subheadEqualTo(String value) {
            addCriterion("mg_subhead =", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadNotEqualTo(String value) {
            addCriterion("mg_subhead <>", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadGreaterThan(String value) {
            addCriterion("mg_subhead >", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadGreaterThanOrEqualTo(String value) {
            addCriterion("mg_subhead >=", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadLessThan(String value) {
            addCriterion("mg_subhead <", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadLessThanOrEqualTo(String value) {
            addCriterion("mg_subhead <=", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadLike(String value) {
            addCriterion("mg_subhead like", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadNotLike(String value) {
            addCriterion("mg_subhead not like", value, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadIn(List<String> values) {
            addCriterion("mg_subhead in", values, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadNotIn(List<String> values) {
            addCriterion("mg_subhead not in", values, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadBetween(String value1, String value2) {
            addCriterion("mg_subhead between", value1, value2, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_subheadNotBetween(String value1, String value2) {
            addCriterion("mg_subhead not between", value1, value2, "mg_subhead");
            return (Criteria) this;
        }

        public Criteria andMg_img1IsNull() {
            addCriterion("mg_img1 is null");
            return (Criteria) this;
        }

        public Criteria andMg_img1IsNotNull() {
            addCriterion("mg_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andMg_img1EqualTo(String value) {
            addCriterion("mg_img1 =", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1NotEqualTo(String value) {
            addCriterion("mg_img1 <>", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1GreaterThan(String value) {
            addCriterion("mg_img1 >", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1GreaterThanOrEqualTo(String value) {
            addCriterion("mg_img1 >=", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1LessThan(String value) {
            addCriterion("mg_img1 <", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1LessThanOrEqualTo(String value) {
            addCriterion("mg_img1 <=", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1Like(String value) {
            addCriterion("mg_img1 like", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1NotLike(String value) {
            addCriterion("mg_img1 not like", value, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1In(List<String> values) {
            addCriterion("mg_img1 in", values, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1NotIn(List<String> values) {
            addCriterion("mg_img1 not in", values, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1Between(String value1, String value2) {
            addCriterion("mg_img1 between", value1, value2, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_img1NotBetween(String value1, String value2) {
            addCriterion("mg_img1 not between", value1, value2, "mg_img1");
            return (Criteria) this;
        }

        public Criteria andMg_priceIsNull() {
            addCriterion("mg_price is null");
            return (Criteria) this;
        }

        public Criteria andMg_priceIsNotNull() {
            addCriterion("mg_price is not null");
            return (Criteria) this;
        }

        public Criteria andMg_priceEqualTo(BigDecimal value) {
            addCriterion("mg_price =", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceNotEqualTo(BigDecimal value) {
            addCriterion("mg_price <>", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceGreaterThan(BigDecimal value) {
            addCriterion("mg_price >", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mg_price >=", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceLessThan(BigDecimal value) {
            addCriterion("mg_price <", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mg_price <=", value, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceIn(List<BigDecimal> values) {
            addCriterion("mg_price in", values, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceNotIn(List<BigDecimal> values) {
            addCriterion("mg_price not in", values, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mg_price between", value1, value2, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mg_price not between", value1, value2, "mg_price");
            return (Criteria) this;
        }

        public Criteria andMg_statusIsNull() {
            addCriterion("mg_status is null");
            return (Criteria) this;
        }

        public Criteria andMg_statusIsNotNull() {
            addCriterion("mg_status is not null");
            return (Criteria) this;
        }

        public Criteria andMg_statusEqualTo(Byte value) {
            addCriterion("mg_status =", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusNotEqualTo(Byte value) {
            addCriterion("mg_status <>", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusGreaterThan(Byte value) {
            addCriterion("mg_status >", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("mg_status >=", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusLessThan(Byte value) {
            addCriterion("mg_status <", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusLessThanOrEqualTo(Byte value) {
            addCriterion("mg_status <=", value, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusIn(List<Byte> values) {
            addCriterion("mg_status in", values, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusNotIn(List<Byte> values) {
            addCriterion("mg_status not in", values, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusBetween(Byte value1, Byte value2) {
            addCriterion("mg_status between", value1, value2, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("mg_status not between", value1, value2, "mg_status");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameIsNull() {
            addCriterion("mg_statusname is null");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameIsNotNull() {
            addCriterion("mg_statusname is not null");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameEqualTo(String value) {
            addCriterion("mg_statusname =", value, "mg_statusname");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameNotEqualTo(String value) {
            addCriterion("mg_statusname <>", value, "mg_statusname");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameGreaterThan(String value) {
            addCriterion("mg_statusname >", value, "mg_statusname");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameGreaterThanOrEqualTo(String value) {
            addCriterion("mg_statusname >=", value, "mg_statusname");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameLessThan(String value) {
            addCriterion("mg_statusname <", value, "mg_statusname");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameLessThanOrEqualTo(String value) {
            addCriterion("mg_statusname <=", value, "mg_statusname");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameLike(String value) {
            addCriterion("mg_statusname like", value, "mg_statusname");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameNotLike(String value) {
            addCriterion("mg_statusname not like", value, "mg_statusname");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameIn(List<String> values) {
            addCriterion("mg_statusname in", values, "mg_statusname");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameNotIn(List<String> values) {
            addCriterion("mg_statusname not in", values, "mg_statusname");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameBetween(String value1, String value2) {
            addCriterion("mg_statusname between", value1, value2, "mg_statusname");
            return (Criteria) this;
        }

        public Criteria andMg_statusnameNotBetween(String value1, String value2) {
            addCriterion("mg_statusname not between", value1, value2, "mg_statusname");
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