package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesigV_DemandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesigV_DemandExample() {
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

        public Criteria andDd_idIsNull() {
            addCriterion("dd_id is null");
            return (Criteria) this;
        }

        public Criteria andDd_idIsNotNull() {
            addCriterion("dd_id is not null");
            return (Criteria) this;
        }

        public Criteria andDd_idEqualTo(Long value) {
            addCriterion("dd_id =", value, "dd_id");
            return (Criteria) this;
        }

        public Criteria andDd_idNotEqualTo(Long value) {
            addCriterion("dd_id <>", value, "dd_id");
            return (Criteria) this;
        }

        public Criteria andDd_idGreaterThan(Long value) {
            addCriterion("dd_id >", value, "dd_id");
            return (Criteria) this;
        }

        public Criteria andDd_idGreaterThanOrEqualTo(Long value) {
            addCriterion("dd_id >=", value, "dd_id");
            return (Criteria) this;
        }

        public Criteria andDd_idLessThan(Long value) {
            addCriterion("dd_id <", value, "dd_id");
            return (Criteria) this;
        }

        public Criteria andDd_idLessThanOrEqualTo(Long value) {
            addCriterion("dd_id <=", value, "dd_id");
            return (Criteria) this;
        }

        public Criteria andDd_idIn(List<Long> values) {
            addCriterion("dd_id in", values, "dd_id");
            return (Criteria) this;
        }

        public Criteria andDd_idNotIn(List<Long> values) {
            addCriterion("dd_id not in", values, "dd_id");
            return (Criteria) this;
        }

        public Criteria andDd_idBetween(Long value1, Long value2) {
            addCriterion("dd_id between", value1, value2, "dd_id");
            return (Criteria) this;
        }

        public Criteria andDd_idNotBetween(Long value1, Long value2) {
            addCriterion("dd_id not between", value1, value2, "dd_id");
            return (Criteria) this;
        }

        public Criteria andDd_noIsNull() {
            addCriterion("dd_no is null");
            return (Criteria) this;
        }

        public Criteria andDd_noIsNotNull() {
            addCriterion("dd_no is not null");
            return (Criteria) this;
        }

        public Criteria andDd_noEqualTo(String value) {
            addCriterion("dd_no =", value, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_noNotEqualTo(String value) {
            addCriterion("dd_no <>", value, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_noGreaterThan(String value) {
            addCriterion("dd_no >", value, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_noGreaterThanOrEqualTo(String value) {
            addCriterion("dd_no >=", value, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_noLessThan(String value) {
            addCriterion("dd_no <", value, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_noLessThanOrEqualTo(String value) {
            addCriterion("dd_no <=", value, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_noLike(String value) {
            addCriterion("dd_no like", value, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_noNotLike(String value) {
            addCriterion("dd_no not like", value, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_noIn(List<String> values) {
            addCriterion("dd_no in", values, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_noNotIn(List<String> values) {
            addCriterion("dd_no not in", values, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_noBetween(String value1, String value2) {
            addCriterion("dd_no between", value1, value2, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_noNotBetween(String value1, String value2) {
            addCriterion("dd_no not between", value1, value2, "dd_no");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeIsNull() {
            addCriterion("dd_citycode is null");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeIsNotNull() {
            addCriterion("dd_citycode is not null");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeEqualTo(String value) {
            addCriterion("dd_citycode =", value, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeNotEqualTo(String value) {
            addCriterion("dd_citycode <>", value, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeGreaterThan(String value) {
            addCriterion("dd_citycode >", value, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeGreaterThanOrEqualTo(String value) {
            addCriterion("dd_citycode >=", value, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeLessThan(String value) {
            addCriterion("dd_citycode <", value, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeLessThanOrEqualTo(String value) {
            addCriterion("dd_citycode <=", value, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeLike(String value) {
            addCriterion("dd_citycode like", value, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeNotLike(String value) {
            addCriterion("dd_citycode not like", value, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeIn(List<String> values) {
            addCriterion("dd_citycode in", values, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeNotIn(List<String> values) {
            addCriterion("dd_citycode not in", values, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeBetween(String value1, String value2) {
            addCriterion("dd_citycode between", value1, value2, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citycodeNotBetween(String value1, String value2) {
            addCriterion("dd_citycode not between", value1, value2, "dd_citycode");
            return (Criteria) this;
        }

        public Criteria andDd_citynameIsNull() {
            addCriterion("dd_cityname is null");
            return (Criteria) this;
        }

        public Criteria andDd_citynameIsNotNull() {
            addCriterion("dd_cityname is not null");
            return (Criteria) this;
        }

        public Criteria andDd_citynameEqualTo(String value) {
            addCriterion("dd_cityname =", value, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_citynameNotEqualTo(String value) {
            addCriterion("dd_cityname <>", value, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_citynameGreaterThan(String value) {
            addCriterion("dd_cityname >", value, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_citynameGreaterThanOrEqualTo(String value) {
            addCriterion("dd_cityname >=", value, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_citynameLessThan(String value) {
            addCriterion("dd_cityname <", value, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_citynameLessThanOrEqualTo(String value) {
            addCriterion("dd_cityname <=", value, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_citynameLike(String value) {
            addCriterion("dd_cityname like", value, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_citynameNotLike(String value) {
            addCriterion("dd_cityname not like", value, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_citynameIn(List<String> values) {
            addCriterion("dd_cityname in", values, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_citynameNotIn(List<String> values) {
            addCriterion("dd_cityname not in", values, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_citynameBetween(String value1, String value2) {
            addCriterion("dd_cityname between", value1, value2, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_citynameNotBetween(String value1, String value2) {
            addCriterion("dd_cityname not between", value1, value2, "dd_cityname");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeIsNull() {
            addCriterion("dd_signcode is null");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeIsNotNull() {
            addCriterion("dd_signcode is not null");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeEqualTo(Byte value) {
            addCriterion("dd_signcode =", value, "dd_signcode");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeNotEqualTo(Byte value) {
            addCriterion("dd_signcode <>", value, "dd_signcode");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeGreaterThan(Byte value) {
            addCriterion("dd_signcode >", value, "dd_signcode");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("dd_signcode >=", value, "dd_signcode");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeLessThan(Byte value) {
            addCriterion("dd_signcode <", value, "dd_signcode");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeLessThanOrEqualTo(Byte value) {
            addCriterion("dd_signcode <=", value, "dd_signcode");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeIn(List<Byte> values) {
            addCriterion("dd_signcode in", values, "dd_signcode");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeNotIn(List<Byte> values) {
            addCriterion("dd_signcode not in", values, "dd_signcode");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeBetween(Byte value1, Byte value2) {
            addCriterion("dd_signcode between", value1, value2, "dd_signcode");
            return (Criteria) this;
        }

        public Criteria andDd_signcodeNotBetween(Byte value1, Byte value2) {
            addCriterion("dd_signcode not between", value1, value2, "dd_signcode");
            return (Criteria) this;
        }

        public Criteria andDd_signnameIsNull() {
            addCriterion("dd_signname is null");
            return (Criteria) this;
        }

        public Criteria andDd_signnameIsNotNull() {
            addCriterion("dd_signname is not null");
            return (Criteria) this;
        }

        public Criteria andDd_signnameEqualTo(String value) {
            addCriterion("dd_signname =", value, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_signnameNotEqualTo(String value) {
            addCriterion("dd_signname <>", value, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_signnameGreaterThan(String value) {
            addCriterion("dd_signname >", value, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_signnameGreaterThanOrEqualTo(String value) {
            addCriterion("dd_signname >=", value, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_signnameLessThan(String value) {
            addCriterion("dd_signname <", value, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_signnameLessThanOrEqualTo(String value) {
            addCriterion("dd_signname <=", value, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_signnameLike(String value) {
            addCriterion("dd_signname like", value, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_signnameNotLike(String value) {
            addCriterion("dd_signname not like", value, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_signnameIn(List<String> values) {
            addCriterion("dd_signname in", values, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_signnameNotIn(List<String> values) {
            addCriterion("dd_signname not in", values, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_signnameBetween(String value1, String value2) {
            addCriterion("dd_signname between", value1, value2, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_signnameNotBetween(String value1, String value2) {
            addCriterion("dd_signname not between", value1, value2, "dd_signname");
            return (Criteria) this;
        }

        public Criteria andDd_titleIsNull() {
            addCriterion("dd_title is null");
            return (Criteria) this;
        }

        public Criteria andDd_titleIsNotNull() {
            addCriterion("dd_title is not null");
            return (Criteria) this;
        }

        public Criteria andDd_titleEqualTo(String value) {
            addCriterion("dd_title =", value, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_titleNotEqualTo(String value) {
            addCriterion("dd_title <>", value, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_titleGreaterThan(String value) {
            addCriterion("dd_title >", value, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_titleGreaterThanOrEqualTo(String value) {
            addCriterion("dd_title >=", value, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_titleLessThan(String value) {
            addCriterion("dd_title <", value, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_titleLessThanOrEqualTo(String value) {
            addCriterion("dd_title <=", value, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_titleLike(String value) {
            addCriterion("dd_title like", value, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_titleNotLike(String value) {
            addCriterion("dd_title not like", value, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_titleIn(List<String> values) {
            addCriterion("dd_title in", values, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_titleNotIn(List<String> values) {
            addCriterion("dd_title not in", values, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_titleBetween(String value1, String value2) {
            addCriterion("dd_title between", value1, value2, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_titleNotBetween(String value1, String value2) {
            addCriterion("dd_title not between", value1, value2, "dd_title");
            return (Criteria) this;
        }

        public Criteria andDd_majorIsNull() {
            addCriterion("dd_major is null");
            return (Criteria) this;
        }

        public Criteria andDd_majorIsNotNull() {
            addCriterion("dd_major is not null");
            return (Criteria) this;
        }

        public Criteria andDd_majorEqualTo(String value) {
            addCriterion("dd_major =", value, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_majorNotEqualTo(String value) {
            addCriterion("dd_major <>", value, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_majorGreaterThan(String value) {
            addCriterion("dd_major >", value, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_majorGreaterThanOrEqualTo(String value) {
            addCriterion("dd_major >=", value, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_majorLessThan(String value) {
            addCriterion("dd_major <", value, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_majorLessThanOrEqualTo(String value) {
            addCriterion("dd_major <=", value, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_majorLike(String value) {
            addCriterion("dd_major like", value, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_majorNotLike(String value) {
            addCriterion("dd_major not like", value, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_majorIn(List<String> values) {
            addCriterion("dd_major in", values, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_majorNotIn(List<String> values) {
            addCriterion("dd_major not in", values, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_majorBetween(String value1, String value2) {
            addCriterion("dd_major between", value1, value2, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_majorNotBetween(String value1, String value2) {
            addCriterion("dd_major not between", value1, value2, "dd_major");
            return (Criteria) this;
        }

        public Criteria andDd_styleIsNull() {
            addCriterion("dd_style is null");
            return (Criteria) this;
        }

        public Criteria andDd_styleIsNotNull() {
            addCriterion("dd_style is not null");
            return (Criteria) this;
        }

        public Criteria andDd_styleEqualTo(String value) {
            addCriterion("dd_style =", value, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_styleNotEqualTo(String value) {
            addCriterion("dd_style <>", value, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_styleGreaterThan(String value) {
            addCriterion("dd_style >", value, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_styleGreaterThanOrEqualTo(String value) {
            addCriterion("dd_style >=", value, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_styleLessThan(String value) {
            addCriterion("dd_style <", value, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_styleLessThanOrEqualTo(String value) {
            addCriterion("dd_style <=", value, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_styleLike(String value) {
            addCriterion("dd_style like", value, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_styleNotLike(String value) {
            addCriterion("dd_style not like", value, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_styleIn(List<String> values) {
            addCriterion("dd_style in", values, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_styleNotIn(List<String> values) {
            addCriterion("dd_style not in", values, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_styleBetween(String value1, String value2) {
            addCriterion("dd_style between", value1, value2, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_styleNotBetween(String value1, String value2) {
            addCriterion("dd_style not between", value1, value2, "dd_style");
            return (Criteria) this;
        }

        public Criteria andDd_featuresIsNull() {
            addCriterion("dd_features is null");
            return (Criteria) this;
        }

        public Criteria andDd_featuresIsNotNull() {
            addCriterion("dd_features is not null");
            return (Criteria) this;
        }

        public Criteria andDd_featuresEqualTo(String value) {
            addCriterion("dd_features =", value, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_featuresNotEqualTo(String value) {
            addCriterion("dd_features <>", value, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_featuresGreaterThan(String value) {
            addCriterion("dd_features >", value, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_featuresGreaterThanOrEqualTo(String value) {
            addCriterion("dd_features >=", value, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_featuresLessThan(String value) {
            addCriterion("dd_features <", value, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_featuresLessThanOrEqualTo(String value) {
            addCriterion("dd_features <=", value, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_featuresLike(String value) {
            addCriterion("dd_features like", value, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_featuresNotLike(String value) {
            addCriterion("dd_features not like", value, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_featuresIn(List<String> values) {
            addCriterion("dd_features in", values, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_featuresNotIn(List<String> values) {
            addCriterion("dd_features not in", values, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_featuresBetween(String value1, String value2) {
            addCriterion("dd_features between", value1, value2, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_featuresNotBetween(String value1, String value2) {
            addCriterion("dd_features not between", value1, value2, "dd_features");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectIsNull() {
            addCriterion("dd_count_collect is null");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectIsNotNull() {
            addCriterion("dd_count_collect is not null");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectEqualTo(Integer value) {
            addCriterion("dd_count_collect =", value, "dd_count_collect");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectNotEqualTo(Integer value) {
            addCriterion("dd_count_collect <>", value, "dd_count_collect");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectGreaterThan(Integer value) {
            addCriterion("dd_count_collect >", value, "dd_count_collect");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectGreaterThanOrEqualTo(Integer value) {
            addCriterion("dd_count_collect >=", value, "dd_count_collect");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectLessThan(Integer value) {
            addCriterion("dd_count_collect <", value, "dd_count_collect");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectLessThanOrEqualTo(Integer value) {
            addCriterion("dd_count_collect <=", value, "dd_count_collect");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectIn(List<Integer> values) {
            addCriterion("dd_count_collect in", values, "dd_count_collect");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectNotIn(List<Integer> values) {
            addCriterion("dd_count_collect not in", values, "dd_count_collect");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectBetween(Integer value1, Integer value2) {
            addCriterion("dd_count_collect between", value1, value2, "dd_count_collect");
            return (Criteria) this;
        }

        public Criteria andDd_count_collectNotBetween(Integer value1, Integer value2) {
            addCriterion("dd_count_collect not between", value1, value2, "dd_count_collect");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseIsNull() {
            addCriterion("dd_count_browse is null");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseIsNotNull() {
            addCriterion("dd_count_browse is not null");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseEqualTo(Integer value) {
            addCriterion("dd_count_browse =", value, "dd_count_browse");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseNotEqualTo(Integer value) {
            addCriterion("dd_count_browse <>", value, "dd_count_browse");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseGreaterThan(Integer value) {
            addCriterion("dd_count_browse >", value, "dd_count_browse");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseGreaterThanOrEqualTo(Integer value) {
            addCriterion("dd_count_browse >=", value, "dd_count_browse");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseLessThan(Integer value) {
            addCriterion("dd_count_browse <", value, "dd_count_browse");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseLessThanOrEqualTo(Integer value) {
            addCriterion("dd_count_browse <=", value, "dd_count_browse");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseIn(List<Integer> values) {
            addCriterion("dd_count_browse in", values, "dd_count_browse");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseNotIn(List<Integer> values) {
            addCriterion("dd_count_browse not in", values, "dd_count_browse");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseBetween(Integer value1, Integer value2) {
            addCriterion("dd_count_browse between", value1, value2, "dd_count_browse");
            return (Criteria) this;
        }

        public Criteria andDd_count_browseNotBetween(Integer value1, Integer value2) {
            addCriterion("dd_count_browse not between", value1, value2, "dd_count_browse");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadIsNull() {
            addCriterion("dd_flag_auditread is null");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadIsNotNull() {
            addCriterion("dd_flag_auditread is not null");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadEqualTo(Boolean value) {
            addCriterion("dd_flag_auditread =", value, "dd_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadNotEqualTo(Boolean value) {
            addCriterion("dd_flag_auditread <>", value, "dd_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadGreaterThan(Boolean value) {
            addCriterion("dd_flag_auditread >", value, "dd_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dd_flag_auditread >=", value, "dd_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadLessThan(Boolean value) {
            addCriterion("dd_flag_auditread <", value, "dd_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadLessThanOrEqualTo(Boolean value) {
            addCriterion("dd_flag_auditread <=", value, "dd_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadIn(List<Boolean> values) {
            addCriterion("dd_flag_auditread in", values, "dd_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadNotIn(List<Boolean> values) {
            addCriterion("dd_flag_auditread not in", values, "dd_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadBetween(Boolean value1, Boolean value2) {
            addCriterion("dd_flag_auditread between", value1, value2, "dd_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_auditreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dd_flag_auditread not between", value1, value2, "dd_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadIsNull() {
            addCriterion("dd_flag_adminread is null");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadIsNotNull() {
            addCriterion("dd_flag_adminread is not null");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadEqualTo(Boolean value) {
            addCriterion("dd_flag_adminread =", value, "dd_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadNotEqualTo(Boolean value) {
            addCriterion("dd_flag_adminread <>", value, "dd_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadGreaterThan(Boolean value) {
            addCriterion("dd_flag_adminread >", value, "dd_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dd_flag_adminread >=", value, "dd_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadLessThan(Boolean value) {
            addCriterion("dd_flag_adminread <", value, "dd_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadLessThanOrEqualTo(Boolean value) {
            addCriterion("dd_flag_adminread <=", value, "dd_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadIn(List<Boolean> values) {
            addCriterion("dd_flag_adminread in", values, "dd_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadNotIn(List<Boolean> values) {
            addCriterion("dd_flag_adminread not in", values, "dd_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadBetween(Boolean value1, Boolean value2) {
            addCriterion("dd_flag_adminread between", value1, value2, "dd_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andDd_flag_adminreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dd_flag_adminread not between", value1, value2, "dd_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkIsNull() {
            addCriterion("dd_adminremark is null");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkIsNotNull() {
            addCriterion("dd_adminremark is not null");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkEqualTo(String value) {
            addCriterion("dd_adminremark =", value, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkNotEqualTo(String value) {
            addCriterion("dd_adminremark <>", value, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkGreaterThan(String value) {
            addCriterion("dd_adminremark >", value, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkGreaterThanOrEqualTo(String value) {
            addCriterion("dd_adminremark >=", value, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkLessThan(String value) {
            addCriterion("dd_adminremark <", value, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkLessThanOrEqualTo(String value) {
            addCriterion("dd_adminremark <=", value, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkLike(String value) {
            addCriterion("dd_adminremark like", value, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkNotLike(String value) {
            addCriterion("dd_adminremark not like", value, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkIn(List<String> values) {
            addCriterion("dd_adminremark in", values, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkNotIn(List<String> values) {
            addCriterion("dd_adminremark not in", values, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkBetween(String value1, String value2) {
            addCriterion("dd_adminremark between", value1, value2, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_adminremarkNotBetween(String value1, String value2) {
            addCriterion("dd_adminremark not between", value1, value2, "dd_adminremark");
            return (Criteria) this;
        }

        public Criteria andDd_createidIsNull() {
            addCriterion("dd_createid is null");
            return (Criteria) this;
        }

        public Criteria andDd_createidIsNotNull() {
            addCriterion("dd_createid is not null");
            return (Criteria) this;
        }

        public Criteria andDd_createidEqualTo(Long value) {
            addCriterion("dd_createid =", value, "dd_createid");
            return (Criteria) this;
        }

        public Criteria andDd_createidNotEqualTo(Long value) {
            addCriterion("dd_createid <>", value, "dd_createid");
            return (Criteria) this;
        }

        public Criteria andDd_createidGreaterThan(Long value) {
            addCriterion("dd_createid >", value, "dd_createid");
            return (Criteria) this;
        }

        public Criteria andDd_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("dd_createid >=", value, "dd_createid");
            return (Criteria) this;
        }

        public Criteria andDd_createidLessThan(Long value) {
            addCriterion("dd_createid <", value, "dd_createid");
            return (Criteria) this;
        }

        public Criteria andDd_createidLessThanOrEqualTo(Long value) {
            addCriterion("dd_createid <=", value, "dd_createid");
            return (Criteria) this;
        }

        public Criteria andDd_createidIn(List<Long> values) {
            addCriterion("dd_createid in", values, "dd_createid");
            return (Criteria) this;
        }

        public Criteria andDd_createidNotIn(List<Long> values) {
            addCriterion("dd_createid not in", values, "dd_createid");
            return (Criteria) this;
        }

        public Criteria andDd_createidBetween(Long value1, Long value2) {
            addCriterion("dd_createid between", value1, value2, "dd_createid");
            return (Criteria) this;
        }

        public Criteria andDd_createidNotBetween(Long value1, Long value2) {
            addCriterion("dd_createid not between", value1, value2, "dd_createid");
            return (Criteria) this;
        }

        public Criteria andDd_createnoIsNull() {
            addCriterion("dd_createno is null");
            return (Criteria) this;
        }

        public Criteria andDd_createnoIsNotNull() {
            addCriterion("dd_createno is not null");
            return (Criteria) this;
        }

        public Criteria andDd_createnoEqualTo(String value) {
            addCriterion("dd_createno =", value, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createnoNotEqualTo(String value) {
            addCriterion("dd_createno <>", value, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createnoGreaterThan(String value) {
            addCriterion("dd_createno >", value, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("dd_createno >=", value, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createnoLessThan(String value) {
            addCriterion("dd_createno <", value, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createnoLessThanOrEqualTo(String value) {
            addCriterion("dd_createno <=", value, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createnoLike(String value) {
            addCriterion("dd_createno like", value, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createnoNotLike(String value) {
            addCriterion("dd_createno not like", value, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createnoIn(List<String> values) {
            addCriterion("dd_createno in", values, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createnoNotIn(List<String> values) {
            addCriterion("dd_createno not in", values, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createnoBetween(String value1, String value2) {
            addCriterion("dd_createno between", value1, value2, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createnoNotBetween(String value1, String value2) {
            addCriterion("dd_createno not between", value1, value2, "dd_createno");
            return (Criteria) this;
        }

        public Criteria andDd_createdateIsNull() {
            addCriterion("dd_createdate is null");
            return (Criteria) this;
        }

        public Criteria andDd_createdateIsNotNull() {
            addCriterion("dd_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andDd_createdateEqualTo(Date value) {
            addCriterion("dd_createdate =", value, "dd_createdate");
            return (Criteria) this;
        }

        public Criteria andDd_createdateNotEqualTo(Date value) {
            addCriterion("dd_createdate <>", value, "dd_createdate");
            return (Criteria) this;
        }

        public Criteria andDd_createdateGreaterThan(Date value) {
            addCriterion("dd_createdate >", value, "dd_createdate");
            return (Criteria) this;
        }

        public Criteria andDd_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("dd_createdate >=", value, "dd_createdate");
            return (Criteria) this;
        }

        public Criteria andDd_createdateLessThan(Date value) {
            addCriterion("dd_createdate <", value, "dd_createdate");
            return (Criteria) this;
        }

        public Criteria andDd_createdateLessThanOrEqualTo(Date value) {
            addCriterion("dd_createdate <=", value, "dd_createdate");
            return (Criteria) this;
        }

        public Criteria andDd_createdateIn(List<Date> values) {
            addCriterion("dd_createdate in", values, "dd_createdate");
            return (Criteria) this;
        }

        public Criteria andDd_createdateNotIn(List<Date> values) {
            addCriterion("dd_createdate not in", values, "dd_createdate");
            return (Criteria) this;
        }

        public Criteria andDd_createdateBetween(Date value1, Date value2) {
            addCriterion("dd_createdate between", value1, value2, "dd_createdate");
            return (Criteria) this;
        }

        public Criteria andDd_createdateNotBetween(Date value1, Date value2) {
            addCriterion("dd_createdate not between", value1, value2, "dd_createdate");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidIsNull() {
            addCriterion("dd_confirmid is null");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidIsNotNull() {
            addCriterion("dd_confirmid is not null");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidEqualTo(Long value) {
            addCriterion("dd_confirmid =", value, "dd_confirmid");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidNotEqualTo(Long value) {
            addCriterion("dd_confirmid <>", value, "dd_confirmid");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidGreaterThan(Long value) {
            addCriterion("dd_confirmid >", value, "dd_confirmid");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidGreaterThanOrEqualTo(Long value) {
            addCriterion("dd_confirmid >=", value, "dd_confirmid");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidLessThan(Long value) {
            addCriterion("dd_confirmid <", value, "dd_confirmid");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidLessThanOrEqualTo(Long value) {
            addCriterion("dd_confirmid <=", value, "dd_confirmid");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidIn(List<Long> values) {
            addCriterion("dd_confirmid in", values, "dd_confirmid");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidNotIn(List<Long> values) {
            addCriterion("dd_confirmid not in", values, "dd_confirmid");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidBetween(Long value1, Long value2) {
            addCriterion("dd_confirmid between", value1, value2, "dd_confirmid");
            return (Criteria) this;
        }

        public Criteria andDd_confirmidNotBetween(Long value1, Long value2) {
            addCriterion("dd_confirmid not between", value1, value2, "dd_confirmid");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoIsNull() {
            addCriterion("dd_confirmno is null");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoIsNotNull() {
            addCriterion("dd_confirmno is not null");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoEqualTo(String value) {
            addCriterion("dd_confirmno =", value, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoNotEqualTo(String value) {
            addCriterion("dd_confirmno <>", value, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoGreaterThan(String value) {
            addCriterion("dd_confirmno >", value, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("dd_confirmno >=", value, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoLessThan(String value) {
            addCriterion("dd_confirmno <", value, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoLessThanOrEqualTo(String value) {
            addCriterion("dd_confirmno <=", value, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoLike(String value) {
            addCriterion("dd_confirmno like", value, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoNotLike(String value) {
            addCriterion("dd_confirmno not like", value, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoIn(List<String> values) {
            addCriterion("dd_confirmno in", values, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoNotIn(List<String> values) {
            addCriterion("dd_confirmno not in", values, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoBetween(String value1, String value2) {
            addCriterion("dd_confirmno between", value1, value2, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmnoNotBetween(String value1, String value2) {
            addCriterion("dd_confirmno not between", value1, value2, "dd_confirmno");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateIsNull() {
            addCriterion("dd_confirmdate is null");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateIsNotNull() {
            addCriterion("dd_confirmdate is not null");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateEqualTo(Date value) {
            addCriterion("dd_confirmdate =", value, "dd_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateNotEqualTo(Date value) {
            addCriterion("dd_confirmdate <>", value, "dd_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateGreaterThan(Date value) {
            addCriterion("dd_confirmdate >", value, "dd_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("dd_confirmdate >=", value, "dd_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateLessThan(Date value) {
            addCriterion("dd_confirmdate <", value, "dd_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateLessThanOrEqualTo(Date value) {
            addCriterion("dd_confirmdate <=", value, "dd_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateIn(List<Date> values) {
            addCriterion("dd_confirmdate in", values, "dd_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateNotIn(List<Date> values) {
            addCriterion("dd_confirmdate not in", values, "dd_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateBetween(Date value1, Date value2) {
            addCriterion("dd_confirmdate between", value1, value2, "dd_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDd_confirmdateNotBetween(Date value1, Date value2) {
            addCriterion("dd_confirmdate not between", value1, value2, "dd_confirmdate");
            return (Criteria) this;
        }

        public Criteria andDd_statusIsNull() {
            addCriterion("dd_status is null");
            return (Criteria) this;
        }

        public Criteria andDd_statusIsNotNull() {
            addCriterion("dd_status is not null");
            return (Criteria) this;
        }

        public Criteria andDd_statusEqualTo(Byte value) {
            addCriterion("dd_status =", value, "dd_status");
            return (Criteria) this;
        }

        public Criteria andDd_statusNotEqualTo(Byte value) {
            addCriterion("dd_status <>", value, "dd_status");
            return (Criteria) this;
        }

        public Criteria andDd_statusGreaterThan(Byte value) {
            addCriterion("dd_status >", value, "dd_status");
            return (Criteria) this;
        }

        public Criteria andDd_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("dd_status >=", value, "dd_status");
            return (Criteria) this;
        }

        public Criteria andDd_statusLessThan(Byte value) {
            addCriterion("dd_status <", value, "dd_status");
            return (Criteria) this;
        }

        public Criteria andDd_statusLessThanOrEqualTo(Byte value) {
            addCriterion("dd_status <=", value, "dd_status");
            return (Criteria) this;
        }

        public Criteria andDd_statusIn(List<Byte> values) {
            addCriterion("dd_status in", values, "dd_status");
            return (Criteria) this;
        }

        public Criteria andDd_statusNotIn(List<Byte> values) {
            addCriterion("dd_status not in", values, "dd_status");
            return (Criteria) this;
        }

        public Criteria andDd_statusBetween(Byte value1, Byte value2) {
            addCriterion("dd_status between", value1, value2, "dd_status");
            return (Criteria) this;
        }

        public Criteria andDd_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("dd_status not between", value1, value2, "dd_status");
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