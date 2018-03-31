package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseV_RotationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseV_RotationExample() {
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

        public Criteria andRt_idIsNull() {
            addCriterion("rt_id is null");
            return (Criteria) this;
        }

        public Criteria andRt_idIsNotNull() {
            addCriterion("rt_id is not null");
            return (Criteria) this;
        }

        public Criteria andRt_idEqualTo(Long value) {
            addCriterion("rt_id =", value, "rt_id");
            return (Criteria) this;
        }

        public Criteria andRt_idNotEqualTo(Long value) {
            addCriterion("rt_id <>", value, "rt_id");
            return (Criteria) this;
        }

        public Criteria andRt_idGreaterThan(Long value) {
            addCriterion("rt_id >", value, "rt_id");
            return (Criteria) this;
        }

        public Criteria andRt_idGreaterThanOrEqualTo(Long value) {
            addCriterion("rt_id >=", value, "rt_id");
            return (Criteria) this;
        }

        public Criteria andRt_idLessThan(Long value) {
            addCriterion("rt_id <", value, "rt_id");
            return (Criteria) this;
        }

        public Criteria andRt_idLessThanOrEqualTo(Long value) {
            addCriterion("rt_id <=", value, "rt_id");
            return (Criteria) this;
        }

        public Criteria andRt_idIn(List<Long> values) {
            addCriterion("rt_id in", values, "rt_id");
            return (Criteria) this;
        }

        public Criteria andRt_idNotIn(List<Long> values) {
            addCriterion("rt_id not in", values, "rt_id");
            return (Criteria) this;
        }

        public Criteria andRt_idBetween(Long value1, Long value2) {
            addCriterion("rt_id between", value1, value2, "rt_id");
            return (Criteria) this;
        }

        public Criteria andRt_idNotBetween(Long value1, Long value2) {
            addCriterion("rt_id not between", value1, value2, "rt_id");
            return (Criteria) this;
        }

        public Criteria andRt_typeIsNull() {
            addCriterion("rt_type is null");
            return (Criteria) this;
        }

        public Criteria andRt_typeIsNotNull() {
            addCriterion("rt_type is not null");
            return (Criteria) this;
        }

        public Criteria andRt_typeEqualTo(String value) {
            addCriterion("rt_type =", value, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_typeNotEqualTo(String value) {
            addCriterion("rt_type <>", value, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_typeGreaterThan(String value) {
            addCriterion("rt_type >", value, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_typeGreaterThanOrEqualTo(String value) {
            addCriterion("rt_type >=", value, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_typeLessThan(String value) {
            addCriterion("rt_type <", value, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_typeLessThanOrEqualTo(String value) {
            addCriterion("rt_type <=", value, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_typeLike(String value) {
            addCriterion("rt_type like", value, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_typeNotLike(String value) {
            addCriterion("rt_type not like", value, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_typeIn(List<String> values) {
            addCriterion("rt_type in", values, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_typeNotIn(List<String> values) {
            addCriterion("rt_type not in", values, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_typeBetween(String value1, String value2) {
            addCriterion("rt_type between", value1, value2, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_typeNotBetween(String value1, String value2) {
            addCriterion("rt_type not between", value1, value2, "rt_type");
            return (Criteria) this;
        }

        public Criteria andRt_indexIsNull() {
            addCriterion("rt_index is null");
            return (Criteria) this;
        }

        public Criteria andRt_indexIsNotNull() {
            addCriterion("rt_index is not null");
            return (Criteria) this;
        }

        public Criteria andRt_indexEqualTo(Integer value) {
            addCriterion("rt_index =", value, "rt_index");
            return (Criteria) this;
        }

        public Criteria andRt_indexNotEqualTo(Integer value) {
            addCriterion("rt_index <>", value, "rt_index");
            return (Criteria) this;
        }

        public Criteria andRt_indexGreaterThan(Integer value) {
            addCriterion("rt_index >", value, "rt_index");
            return (Criteria) this;
        }

        public Criteria andRt_indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("rt_index >=", value, "rt_index");
            return (Criteria) this;
        }

        public Criteria andRt_indexLessThan(Integer value) {
            addCriterion("rt_index <", value, "rt_index");
            return (Criteria) this;
        }

        public Criteria andRt_indexLessThanOrEqualTo(Integer value) {
            addCriterion("rt_index <=", value, "rt_index");
            return (Criteria) this;
        }

        public Criteria andRt_indexIn(List<Integer> values) {
            addCriterion("rt_index in", values, "rt_index");
            return (Criteria) this;
        }

        public Criteria andRt_indexNotIn(List<Integer> values) {
            addCriterion("rt_index not in", values, "rt_index");
            return (Criteria) this;
        }

        public Criteria andRt_indexBetween(Integer value1, Integer value2) {
            addCriterion("rt_index between", value1, value2, "rt_index");
            return (Criteria) this;
        }

        public Criteria andRt_indexNotBetween(Integer value1, Integer value2) {
            addCriterion("rt_index not between", value1, value2, "rt_index");
            return (Criteria) this;
        }

        public Criteria andRt_titleIsNull() {
            addCriterion("rt_title is null");
            return (Criteria) this;
        }

        public Criteria andRt_titleIsNotNull() {
            addCriterion("rt_title is not null");
            return (Criteria) this;
        }

        public Criteria andRt_titleEqualTo(String value) {
            addCriterion("rt_title =", value, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_titleNotEqualTo(String value) {
            addCriterion("rt_title <>", value, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_titleGreaterThan(String value) {
            addCriterion("rt_title >", value, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_titleGreaterThanOrEqualTo(String value) {
            addCriterion("rt_title >=", value, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_titleLessThan(String value) {
            addCriterion("rt_title <", value, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_titleLessThanOrEqualTo(String value) {
            addCriterion("rt_title <=", value, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_titleLike(String value) {
            addCriterion("rt_title like", value, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_titleNotLike(String value) {
            addCriterion("rt_title not like", value, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_titleIn(List<String> values) {
            addCriterion("rt_title in", values, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_titleNotIn(List<String> values) {
            addCriterion("rt_title not in", values, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_titleBetween(String value1, String value2) {
            addCriterion("rt_title between", value1, value2, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_titleNotBetween(String value1, String value2) {
            addCriterion("rt_title not between", value1, value2, "rt_title");
            return (Criteria) this;
        }

        public Criteria andRt_modeIsNull() {
            addCriterion("rt_mode is null");
            return (Criteria) this;
        }

        public Criteria andRt_modeIsNotNull() {
            addCriterion("rt_mode is not null");
            return (Criteria) this;
        }

        public Criteria andRt_modeEqualTo(Byte value) {
            addCriterion("rt_mode =", value, "rt_mode");
            return (Criteria) this;
        }

        public Criteria andRt_modeNotEqualTo(Byte value) {
            addCriterion("rt_mode <>", value, "rt_mode");
            return (Criteria) this;
        }

        public Criteria andRt_modeGreaterThan(Byte value) {
            addCriterion("rt_mode >", value, "rt_mode");
            return (Criteria) this;
        }

        public Criteria andRt_modeGreaterThanOrEqualTo(Byte value) {
            addCriterion("rt_mode >=", value, "rt_mode");
            return (Criteria) this;
        }

        public Criteria andRt_modeLessThan(Byte value) {
            addCriterion("rt_mode <", value, "rt_mode");
            return (Criteria) this;
        }

        public Criteria andRt_modeLessThanOrEqualTo(Byte value) {
            addCriterion("rt_mode <=", value, "rt_mode");
            return (Criteria) this;
        }

        public Criteria andRt_modeIn(List<Byte> values) {
            addCriterion("rt_mode in", values, "rt_mode");
            return (Criteria) this;
        }

        public Criteria andRt_modeNotIn(List<Byte> values) {
            addCriterion("rt_mode not in", values, "rt_mode");
            return (Criteria) this;
        }

        public Criteria andRt_modeBetween(Byte value1, Byte value2) {
            addCriterion("rt_mode between", value1, value2, "rt_mode");
            return (Criteria) this;
        }

        public Criteria andRt_modeNotBetween(Byte value1, Byte value2) {
            addCriterion("rt_mode not between", value1, value2, "rt_mode");
            return (Criteria) this;
        }

        public Criteria andRt_locationIsNull() {
            addCriterion("rt_location is null");
            return (Criteria) this;
        }

        public Criteria andRt_locationIsNotNull() {
            addCriterion("rt_location is not null");
            return (Criteria) this;
        }

        public Criteria andRt_locationEqualTo(String value) {
            addCriterion("rt_location =", value, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_locationNotEqualTo(String value) {
            addCriterion("rt_location <>", value, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_locationGreaterThan(String value) {
            addCriterion("rt_location >", value, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_locationGreaterThanOrEqualTo(String value) {
            addCriterion("rt_location >=", value, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_locationLessThan(String value) {
            addCriterion("rt_location <", value, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_locationLessThanOrEqualTo(String value) {
            addCriterion("rt_location <=", value, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_locationLike(String value) {
            addCriterion("rt_location like", value, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_locationNotLike(String value) {
            addCriterion("rt_location not like", value, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_locationIn(List<String> values) {
            addCriterion("rt_location in", values, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_locationNotIn(List<String> values) {
            addCriterion("rt_location not in", values, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_locationBetween(String value1, String value2) {
            addCriterion("rt_location between", value1, value2, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_locationNotBetween(String value1, String value2) {
            addCriterion("rt_location not between", value1, value2, "rt_location");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopIsNull() {
            addCriterion("rt_flagstop is null");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopIsNotNull() {
            addCriterion("rt_flagstop is not null");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopEqualTo(Boolean value) {
            addCriterion("rt_flagstop =", value, "rt_flagstop");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopNotEqualTo(Boolean value) {
            addCriterion("rt_flagstop <>", value, "rt_flagstop");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopGreaterThan(Boolean value) {
            addCriterion("rt_flagstop >", value, "rt_flagstop");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rt_flagstop >=", value, "rt_flagstop");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopLessThan(Boolean value) {
            addCriterion("rt_flagstop <", value, "rt_flagstop");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopLessThanOrEqualTo(Boolean value) {
            addCriterion("rt_flagstop <=", value, "rt_flagstop");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopIn(List<Boolean> values) {
            addCriterion("rt_flagstop in", values, "rt_flagstop");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopNotIn(List<Boolean> values) {
            addCriterion("rt_flagstop not in", values, "rt_flagstop");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopBetween(Boolean value1, Boolean value2) {
            addCriterion("rt_flagstop between", value1, value2, "rt_flagstop");
            return (Criteria) this;
        }

        public Criteria andRt_flagstopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rt_flagstop not between", value1, value2, "rt_flagstop");
            return (Criteria) this;
        }

        public Criteria andRt_remarkIsNull() {
            addCriterion("rt_remark is null");
            return (Criteria) this;
        }

        public Criteria andRt_remarkIsNotNull() {
            addCriterion("rt_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRt_remarkEqualTo(String value) {
            addCriterion("rt_remark =", value, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_remarkNotEqualTo(String value) {
            addCriterion("rt_remark <>", value, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_remarkGreaterThan(String value) {
            addCriterion("rt_remark >", value, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("rt_remark >=", value, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_remarkLessThan(String value) {
            addCriterion("rt_remark <", value, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_remarkLessThanOrEqualTo(String value) {
            addCriterion("rt_remark <=", value, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_remarkLike(String value) {
            addCriterion("rt_remark like", value, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_remarkNotLike(String value) {
            addCriterion("rt_remark not like", value, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_remarkIn(List<String> values) {
            addCriterion("rt_remark in", values, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_remarkNotIn(List<String> values) {
            addCriterion("rt_remark not in", values, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_remarkBetween(String value1, String value2) {
            addCriterion("rt_remark between", value1, value2, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_remarkNotBetween(String value1, String value2) {
            addCriterion("rt_remark not between", value1, value2, "rt_remark");
            return (Criteria) this;
        }

        public Criteria andRt_createnoIsNull() {
            addCriterion("rt_createno is null");
            return (Criteria) this;
        }

        public Criteria andRt_createnoIsNotNull() {
            addCriterion("rt_createno is not null");
            return (Criteria) this;
        }

        public Criteria andRt_createnoEqualTo(String value) {
            addCriterion("rt_createno =", value, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createnoNotEqualTo(String value) {
            addCriterion("rt_createno <>", value, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createnoGreaterThan(String value) {
            addCriterion("rt_createno >", value, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("rt_createno >=", value, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createnoLessThan(String value) {
            addCriterion("rt_createno <", value, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createnoLessThanOrEqualTo(String value) {
            addCriterion("rt_createno <=", value, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createnoLike(String value) {
            addCriterion("rt_createno like", value, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createnoNotLike(String value) {
            addCriterion("rt_createno not like", value, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createnoIn(List<String> values) {
            addCriterion("rt_createno in", values, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createnoNotIn(List<String> values) {
            addCriterion("rt_createno not in", values, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createnoBetween(String value1, String value2) {
            addCriterion("rt_createno between", value1, value2, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createnoNotBetween(String value1, String value2) {
            addCriterion("rt_createno not between", value1, value2, "rt_createno");
            return (Criteria) this;
        }

        public Criteria andRt_createdateIsNull() {
            addCriterion("rt_createdate is null");
            return (Criteria) this;
        }

        public Criteria andRt_createdateIsNotNull() {
            addCriterion("rt_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andRt_createdateEqualTo(Date value) {
            addCriterion("rt_createdate =", value, "rt_createdate");
            return (Criteria) this;
        }

        public Criteria andRt_createdateNotEqualTo(Date value) {
            addCriterion("rt_createdate <>", value, "rt_createdate");
            return (Criteria) this;
        }

        public Criteria andRt_createdateGreaterThan(Date value) {
            addCriterion("rt_createdate >", value, "rt_createdate");
            return (Criteria) this;
        }

        public Criteria andRt_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("rt_createdate >=", value, "rt_createdate");
            return (Criteria) this;
        }

        public Criteria andRt_createdateLessThan(Date value) {
            addCriterion("rt_createdate <", value, "rt_createdate");
            return (Criteria) this;
        }

        public Criteria andRt_createdateLessThanOrEqualTo(Date value) {
            addCriterion("rt_createdate <=", value, "rt_createdate");
            return (Criteria) this;
        }

        public Criteria andRt_createdateIn(List<Date> values) {
            addCriterion("rt_createdate in", values, "rt_createdate");
            return (Criteria) this;
        }

        public Criteria andRt_createdateNotIn(List<Date> values) {
            addCriterion("rt_createdate not in", values, "rt_createdate");
            return (Criteria) this;
        }

        public Criteria andRt_createdateBetween(Date value1, Date value2) {
            addCriterion("rt_createdate between", value1, value2, "rt_createdate");
            return (Criteria) this;
        }

        public Criteria andRt_createdateNotBetween(Date value1, Date value2) {
            addCriterion("rt_createdate not between", value1, value2, "rt_createdate");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoIsNull() {
            addCriterion("rt_updateno is null");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoIsNotNull() {
            addCriterion("rt_updateno is not null");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoEqualTo(String value) {
            addCriterion("rt_updateno =", value, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoNotEqualTo(String value) {
            addCriterion("rt_updateno <>", value, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoGreaterThan(String value) {
            addCriterion("rt_updateno >", value, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoGreaterThanOrEqualTo(String value) {
            addCriterion("rt_updateno >=", value, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoLessThan(String value) {
            addCriterion("rt_updateno <", value, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoLessThanOrEqualTo(String value) {
            addCriterion("rt_updateno <=", value, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoLike(String value) {
            addCriterion("rt_updateno like", value, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoNotLike(String value) {
            addCriterion("rt_updateno not like", value, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoIn(List<String> values) {
            addCriterion("rt_updateno in", values, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoNotIn(List<String> values) {
            addCriterion("rt_updateno not in", values, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoBetween(String value1, String value2) {
            addCriterion("rt_updateno between", value1, value2, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatenoNotBetween(String value1, String value2) {
            addCriterion("rt_updateno not between", value1, value2, "rt_updateno");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateIsNull() {
            addCriterion("rt_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateIsNotNull() {
            addCriterion("rt_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateEqualTo(Date value) {
            addCriterion("rt_updatedate =", value, "rt_updatedate");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateNotEqualTo(Date value) {
            addCriterion("rt_updatedate <>", value, "rt_updatedate");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateGreaterThan(Date value) {
            addCriterion("rt_updatedate >", value, "rt_updatedate");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("rt_updatedate >=", value, "rt_updatedate");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateLessThan(Date value) {
            addCriterion("rt_updatedate <", value, "rt_updatedate");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("rt_updatedate <=", value, "rt_updatedate");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateIn(List<Date> values) {
            addCriterion("rt_updatedate in", values, "rt_updatedate");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateNotIn(List<Date> values) {
            addCriterion("rt_updatedate not in", values, "rt_updatedate");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateBetween(Date value1, Date value2) {
            addCriterion("rt_updatedate between", value1, value2, "rt_updatedate");
            return (Criteria) this;
        }

        public Criteria andRt_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("rt_updatedate not between", value1, value2, "rt_updatedate");
            return (Criteria) this;
        }

        public Criteria andModenameIsNull() {
            addCriterion("modename is null");
            return (Criteria) this;
        }

        public Criteria andModenameIsNotNull() {
            addCriterion("modename is not null");
            return (Criteria) this;
        }

        public Criteria andModenameEqualTo(String value) {
            addCriterion("modename =", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotEqualTo(String value) {
            addCriterion("modename <>", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameGreaterThan(String value) {
            addCriterion("modename >", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameGreaterThanOrEqualTo(String value) {
            addCriterion("modename >=", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLessThan(String value) {
            addCriterion("modename <", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLessThanOrEqualTo(String value) {
            addCriterion("modename <=", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLike(String value) {
            addCriterion("modename like", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotLike(String value) {
            addCriterion("modename not like", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameIn(List<String> values) {
            addCriterion("modename in", values, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotIn(List<String> values) {
            addCriterion("modename not in", values, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameBetween(String value1, String value2) {
            addCriterion("modename between", value1, value2, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotBetween(String value1, String value2) {
            addCriterion("modename not between", value1, value2, "modename");
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