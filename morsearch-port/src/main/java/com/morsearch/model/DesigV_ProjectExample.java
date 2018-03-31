package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesigV_ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesigV_ProjectExample() {
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

        public Criteria andSp_idIsNull() {
            addCriterion("sp_id is null");
            return (Criteria) this;
        }

        public Criteria andSp_idIsNotNull() {
            addCriterion("sp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSp_idEqualTo(Long value) {
            addCriterion("sp_id =", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idNotEqualTo(Long value) {
            addCriterion("sp_id <>", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idGreaterThan(Long value) {
            addCriterion("sp_id >", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_id >=", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idLessThan(Long value) {
            addCriterion("sp_id <", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idLessThanOrEqualTo(Long value) {
            addCriterion("sp_id <=", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idIn(List<Long> values) {
            addCriterion("sp_id in", values, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idNotIn(List<Long> values) {
            addCriterion("sp_id not in", values, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idBetween(Long value1, Long value2) {
            addCriterion("sp_id between", value1, value2, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idNotBetween(Long value1, Long value2) {
            addCriterion("sp_id not between", value1, value2, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_noIsNull() {
            addCriterion("sp_no is null");
            return (Criteria) this;
        }

        public Criteria andSp_noIsNotNull() {
            addCriterion("sp_no is not null");
            return (Criteria) this;
        }

        public Criteria andSp_noEqualTo(String value) {
            addCriterion("sp_no =", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noNotEqualTo(String value) {
            addCriterion("sp_no <>", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noGreaterThan(String value) {
            addCriterion("sp_no >", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noGreaterThanOrEqualTo(String value) {
            addCriterion("sp_no >=", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noLessThan(String value) {
            addCriterion("sp_no <", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noLessThanOrEqualTo(String value) {
            addCriterion("sp_no <=", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noLike(String value) {
            addCriterion("sp_no like", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noNotLike(String value) {
            addCriterion("sp_no not like", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noIn(List<String> values) {
            addCriterion("sp_no in", values, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noNotIn(List<String> values) {
            addCriterion("sp_no not in", values, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noBetween(String value1, String value2) {
            addCriterion("sp_no between", value1, value2, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noNotBetween(String value1, String value2) {
            addCriterion("sp_no not between", value1, value2, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_titleIsNull() {
            addCriterion("sp_title is null");
            return (Criteria) this;
        }

        public Criteria andSp_titleIsNotNull() {
            addCriterion("sp_title is not null");
            return (Criteria) this;
        }

        public Criteria andSp_titleEqualTo(String value) {
            addCriterion("sp_title =", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleNotEqualTo(String value) {
            addCriterion("sp_title <>", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleGreaterThan(String value) {
            addCriterion("sp_title >", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleGreaterThanOrEqualTo(String value) {
            addCriterion("sp_title >=", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleLessThan(String value) {
            addCriterion("sp_title <", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleLessThanOrEqualTo(String value) {
            addCriterion("sp_title <=", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleLike(String value) {
            addCriterion("sp_title like", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleNotLike(String value) {
            addCriterion("sp_title not like", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleIn(List<String> values) {
            addCriterion("sp_title in", values, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleNotIn(List<String> values) {
            addCriterion("sp_title not in", values, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleBetween(String value1, String value2) {
            addCriterion("sp_title between", value1, value2, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleNotBetween(String value1, String value2) {
            addCriterion("sp_title not between", value1, value2, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeIsNull() {
            addCriterion("sp_citycode is null");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeIsNotNull() {
            addCriterion("sp_citycode is not null");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeEqualTo(String value) {
            addCriterion("sp_citycode =", value, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeNotEqualTo(String value) {
            addCriterion("sp_citycode <>", value, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeGreaterThan(String value) {
            addCriterion("sp_citycode >", value, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeGreaterThanOrEqualTo(String value) {
            addCriterion("sp_citycode >=", value, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeLessThan(String value) {
            addCriterion("sp_citycode <", value, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeLessThanOrEqualTo(String value) {
            addCriterion("sp_citycode <=", value, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeLike(String value) {
            addCriterion("sp_citycode like", value, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeNotLike(String value) {
            addCriterion("sp_citycode not like", value, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeIn(List<String> values) {
            addCriterion("sp_citycode in", values, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeNotIn(List<String> values) {
            addCriterion("sp_citycode not in", values, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeBetween(String value1, String value2) {
            addCriterion("sp_citycode between", value1, value2, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citycodeNotBetween(String value1, String value2) {
            addCriterion("sp_citycode not between", value1, value2, "sp_citycode");
            return (Criteria) this;
        }

        public Criteria andSp_citynameIsNull() {
            addCriterion("sp_cityname is null");
            return (Criteria) this;
        }

        public Criteria andSp_citynameIsNotNull() {
            addCriterion("sp_cityname is not null");
            return (Criteria) this;
        }

        public Criteria andSp_citynameEqualTo(String value) {
            addCriterion("sp_cityname =", value, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_citynameNotEqualTo(String value) {
            addCriterion("sp_cityname <>", value, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_citynameGreaterThan(String value) {
            addCriterion("sp_cityname >", value, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_citynameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_cityname >=", value, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_citynameLessThan(String value) {
            addCriterion("sp_cityname <", value, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_citynameLessThanOrEqualTo(String value) {
            addCriterion("sp_cityname <=", value, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_citynameLike(String value) {
            addCriterion("sp_cityname like", value, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_citynameNotLike(String value) {
            addCriterion("sp_cityname not like", value, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_citynameIn(List<String> values) {
            addCriterion("sp_cityname in", values, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_citynameNotIn(List<String> values) {
            addCriterion("sp_cityname not in", values, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_citynameBetween(String value1, String value2) {
            addCriterion("sp_cityname between", value1, value2, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_citynameNotBetween(String value1, String value2) {
            addCriterion("sp_cityname not between", value1, value2, "sp_cityname");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeIsNull() {
            addCriterion("sp_signcode is null");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeIsNotNull() {
            addCriterion("sp_signcode is not null");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeEqualTo(Byte value) {
            addCriterion("sp_signcode =", value, "sp_signcode");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeNotEqualTo(Byte value) {
            addCriterion("sp_signcode <>", value, "sp_signcode");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeGreaterThan(Byte value) {
            addCriterion("sp_signcode >", value, "sp_signcode");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_signcode >=", value, "sp_signcode");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeLessThan(Byte value) {
            addCriterion("sp_signcode <", value, "sp_signcode");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeLessThanOrEqualTo(Byte value) {
            addCriterion("sp_signcode <=", value, "sp_signcode");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeIn(List<Byte> values) {
            addCriterion("sp_signcode in", values, "sp_signcode");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeNotIn(List<Byte> values) {
            addCriterion("sp_signcode not in", values, "sp_signcode");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeBetween(Byte value1, Byte value2) {
            addCriterion("sp_signcode between", value1, value2, "sp_signcode");
            return (Criteria) this;
        }

        public Criteria andSp_signcodeNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_signcode not between", value1, value2, "sp_signcode");
            return (Criteria) this;
        }

        public Criteria andSp_signnameIsNull() {
            addCriterion("sp_signname is null");
            return (Criteria) this;
        }

        public Criteria andSp_signnameIsNotNull() {
            addCriterion("sp_signname is not null");
            return (Criteria) this;
        }

        public Criteria andSp_signnameEqualTo(String value) {
            addCriterion("sp_signname =", value, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_signnameNotEqualTo(String value) {
            addCriterion("sp_signname <>", value, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_signnameGreaterThan(String value) {
            addCriterion("sp_signname >", value, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_signnameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_signname >=", value, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_signnameLessThan(String value) {
            addCriterion("sp_signname <", value, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_signnameLessThanOrEqualTo(String value) {
            addCriterion("sp_signname <=", value, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_signnameLike(String value) {
            addCriterion("sp_signname like", value, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_signnameNotLike(String value) {
            addCriterion("sp_signname not like", value, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_signnameIn(List<String> values) {
            addCriterion("sp_signname in", values, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_signnameNotIn(List<String> values) {
            addCriterion("sp_signname not in", values, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_signnameBetween(String value1, String value2) {
            addCriterion("sp_signname between", value1, value2, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_signnameNotBetween(String value1, String value2) {
            addCriterion("sp_signname not between", value1, value2, "sp_signname");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectIsNull() {
            addCriterion("sp_count_collect is null");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectIsNotNull() {
            addCriterion("sp_count_collect is not null");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectEqualTo(Integer value) {
            addCriterion("sp_count_collect =", value, "sp_count_collect");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectNotEqualTo(Integer value) {
            addCriterion("sp_count_collect <>", value, "sp_count_collect");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectGreaterThan(Integer value) {
            addCriterion("sp_count_collect >", value, "sp_count_collect");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_count_collect >=", value, "sp_count_collect");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectLessThan(Integer value) {
            addCriterion("sp_count_collect <", value, "sp_count_collect");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectLessThanOrEqualTo(Integer value) {
            addCriterion("sp_count_collect <=", value, "sp_count_collect");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectIn(List<Integer> values) {
            addCriterion("sp_count_collect in", values, "sp_count_collect");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectNotIn(List<Integer> values) {
            addCriterion("sp_count_collect not in", values, "sp_count_collect");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectBetween(Integer value1, Integer value2) {
            addCriterion("sp_count_collect between", value1, value2, "sp_count_collect");
            return (Criteria) this;
        }

        public Criteria andSp_count_collectNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_count_collect not between", value1, value2, "sp_count_collect");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseIsNull() {
            addCriterion("sp_count_browse is null");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseIsNotNull() {
            addCriterion("sp_count_browse is not null");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseEqualTo(Integer value) {
            addCriterion("sp_count_browse =", value, "sp_count_browse");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseNotEqualTo(Integer value) {
            addCriterion("sp_count_browse <>", value, "sp_count_browse");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseGreaterThan(Integer value) {
            addCriterion("sp_count_browse >", value, "sp_count_browse");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_count_browse >=", value, "sp_count_browse");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseLessThan(Integer value) {
            addCriterion("sp_count_browse <", value, "sp_count_browse");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseLessThanOrEqualTo(Integer value) {
            addCriterion("sp_count_browse <=", value, "sp_count_browse");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseIn(List<Integer> values) {
            addCriterion("sp_count_browse in", values, "sp_count_browse");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseNotIn(List<Integer> values) {
            addCriterion("sp_count_browse not in", values, "sp_count_browse");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseBetween(Integer value1, Integer value2) {
            addCriterion("sp_count_browse between", value1, value2, "sp_count_browse");
            return (Criteria) this;
        }

        public Criteria andSp_count_browseNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_count_browse not between", value1, value2, "sp_count_browse");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadIsNull() {
            addCriterion("sp_flag_auditread is null");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadIsNotNull() {
            addCriterion("sp_flag_auditread is not null");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadEqualTo(Boolean value) {
            addCriterion("sp_flag_auditread =", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadNotEqualTo(Boolean value) {
            addCriterion("sp_flag_auditread <>", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadGreaterThan(Boolean value) {
            addCriterion("sp_flag_auditread >", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sp_flag_auditread >=", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadLessThan(Boolean value) {
            addCriterion("sp_flag_auditread <", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadLessThanOrEqualTo(Boolean value) {
            addCriterion("sp_flag_auditread <=", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadIn(List<Boolean> values) {
            addCriterion("sp_flag_auditread in", values, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadNotIn(List<Boolean> values) {
            addCriterion("sp_flag_auditread not in", values, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flag_auditread between", value1, value2, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flag_auditread not between", value1, value2, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadIsNull() {
            addCriterion("sp_flag_adminread is null");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadIsNotNull() {
            addCriterion("sp_flag_adminread is not null");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadEqualTo(Boolean value) {
            addCriterion("sp_flag_adminread =", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadNotEqualTo(Boolean value) {
            addCriterion("sp_flag_adminread <>", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadGreaterThan(Boolean value) {
            addCriterion("sp_flag_adminread >", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sp_flag_adminread >=", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadLessThan(Boolean value) {
            addCriterion("sp_flag_adminread <", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadLessThanOrEqualTo(Boolean value) {
            addCriterion("sp_flag_adminread <=", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadIn(List<Boolean> values) {
            addCriterion("sp_flag_adminread in", values, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadNotIn(List<Boolean> values) {
            addCriterion("sp_flag_adminread not in", values, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flag_adminread between", value1, value2, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flag_adminread not between", value1, value2, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkIsNull() {
            addCriterion("sp_adminremark is null");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkIsNotNull() {
            addCriterion("sp_adminremark is not null");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkEqualTo(String value) {
            addCriterion("sp_adminremark =", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkNotEqualTo(String value) {
            addCriterion("sp_adminremark <>", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkGreaterThan(String value) {
            addCriterion("sp_adminremark >", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkGreaterThanOrEqualTo(String value) {
            addCriterion("sp_adminremark >=", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkLessThan(String value) {
            addCriterion("sp_adminremark <", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkLessThanOrEqualTo(String value) {
            addCriterion("sp_adminremark <=", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkLike(String value) {
            addCriterion("sp_adminremark like", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkNotLike(String value) {
            addCriterion("sp_adminremark not like", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkIn(List<String> values) {
            addCriterion("sp_adminremark in", values, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkNotIn(List<String> values) {
            addCriterion("sp_adminremark not in", values, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkBetween(String value1, String value2) {
            addCriterion("sp_adminremark between", value1, value2, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkNotBetween(String value1, String value2) {
            addCriterion("sp_adminremark not between", value1, value2, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_createidIsNull() {
            addCriterion("sp_createid is null");
            return (Criteria) this;
        }

        public Criteria andSp_createidIsNotNull() {
            addCriterion("sp_createid is not null");
            return (Criteria) this;
        }

        public Criteria andSp_createidEqualTo(Long value) {
            addCriterion("sp_createid =", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidNotEqualTo(Long value) {
            addCriterion("sp_createid <>", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidGreaterThan(Long value) {
            addCriterion("sp_createid >", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_createid >=", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidLessThan(Long value) {
            addCriterion("sp_createid <", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidLessThanOrEqualTo(Long value) {
            addCriterion("sp_createid <=", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidIn(List<Long> values) {
            addCriterion("sp_createid in", values, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidNotIn(List<Long> values) {
            addCriterion("sp_createid not in", values, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidBetween(Long value1, Long value2) {
            addCriterion("sp_createid between", value1, value2, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidNotBetween(Long value1, Long value2) {
            addCriterion("sp_createid not between", value1, value2, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createnoIsNull() {
            addCriterion("sp_createno is null");
            return (Criteria) this;
        }

        public Criteria andSp_createnoIsNotNull() {
            addCriterion("sp_createno is not null");
            return (Criteria) this;
        }

        public Criteria andSp_createnoEqualTo(String value) {
            addCriterion("sp_createno =", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoNotEqualTo(String value) {
            addCriterion("sp_createno <>", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoGreaterThan(String value) {
            addCriterion("sp_createno >", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("sp_createno >=", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoLessThan(String value) {
            addCriterion("sp_createno <", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoLessThanOrEqualTo(String value) {
            addCriterion("sp_createno <=", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoLike(String value) {
            addCriterion("sp_createno like", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoNotLike(String value) {
            addCriterion("sp_createno not like", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoIn(List<String> values) {
            addCriterion("sp_createno in", values, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoNotIn(List<String> values) {
            addCriterion("sp_createno not in", values, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoBetween(String value1, String value2) {
            addCriterion("sp_createno between", value1, value2, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoNotBetween(String value1, String value2) {
            addCriterion("sp_createno not between", value1, value2, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createdateIsNull() {
            addCriterion("sp_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSp_createdateIsNotNull() {
            addCriterion("sp_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSp_createdateEqualTo(Date value) {
            addCriterion("sp_createdate =", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateNotEqualTo(Date value) {
            addCriterion("sp_createdate <>", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateGreaterThan(Date value) {
            addCriterion("sp_createdate >", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sp_createdate >=", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateLessThan(Date value) {
            addCriterion("sp_createdate <", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateLessThanOrEqualTo(Date value) {
            addCriterion("sp_createdate <=", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateIn(List<Date> values) {
            addCriterion("sp_createdate in", values, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateNotIn(List<Date> values) {
            addCriterion("sp_createdate not in", values, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateBetween(Date value1, Date value2) {
            addCriterion("sp_createdate between", value1, value2, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateNotBetween(Date value1, Date value2) {
            addCriterion("sp_createdate not between", value1, value2, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidIsNull() {
            addCriterion("sp_confirmid is null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidIsNotNull() {
            addCriterion("sp_confirmid is not null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidEqualTo(Long value) {
            addCriterion("sp_confirmid =", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidNotEqualTo(Long value) {
            addCriterion("sp_confirmid <>", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidGreaterThan(Long value) {
            addCriterion("sp_confirmid >", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_confirmid >=", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidLessThan(Long value) {
            addCriterion("sp_confirmid <", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidLessThanOrEqualTo(Long value) {
            addCriterion("sp_confirmid <=", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidIn(List<Long> values) {
            addCriterion("sp_confirmid in", values, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidNotIn(List<Long> values) {
            addCriterion("sp_confirmid not in", values, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidBetween(Long value1, Long value2) {
            addCriterion("sp_confirmid between", value1, value2, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidNotBetween(Long value1, Long value2) {
            addCriterion("sp_confirmid not between", value1, value2, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoIsNull() {
            addCriterion("sp_confirmno is null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoIsNotNull() {
            addCriterion("sp_confirmno is not null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoEqualTo(String value) {
            addCriterion("sp_confirmno =", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoNotEqualTo(String value) {
            addCriterion("sp_confirmno <>", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoGreaterThan(String value) {
            addCriterion("sp_confirmno >", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("sp_confirmno >=", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoLessThan(String value) {
            addCriterion("sp_confirmno <", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoLessThanOrEqualTo(String value) {
            addCriterion("sp_confirmno <=", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoLike(String value) {
            addCriterion("sp_confirmno like", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoNotLike(String value) {
            addCriterion("sp_confirmno not like", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoIn(List<String> values) {
            addCriterion("sp_confirmno in", values, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoNotIn(List<String> values) {
            addCriterion("sp_confirmno not in", values, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoBetween(String value1, String value2) {
            addCriterion("sp_confirmno between", value1, value2, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoNotBetween(String value1, String value2) {
            addCriterion("sp_confirmno not between", value1, value2, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateIsNull() {
            addCriterion("sp_confirmdate is null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateIsNotNull() {
            addCriterion("sp_confirmdate is not null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateEqualTo(Date value) {
            addCriterion("sp_confirmdate =", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateNotEqualTo(Date value) {
            addCriterion("sp_confirmdate <>", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateGreaterThan(Date value) {
            addCriterion("sp_confirmdate >", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sp_confirmdate >=", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateLessThan(Date value) {
            addCriterion("sp_confirmdate <", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateLessThanOrEqualTo(Date value) {
            addCriterion("sp_confirmdate <=", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateIn(List<Date> values) {
            addCriterion("sp_confirmdate in", values, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateNotIn(List<Date> values) {
            addCriterion("sp_confirmdate not in", values, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateBetween(Date value1, Date value2) {
            addCriterion("sp_confirmdate between", value1, value2, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateNotBetween(Date value1, Date value2) {
            addCriterion("sp_confirmdate not between", value1, value2, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_statusIsNull() {
            addCriterion("sp_status is null");
            return (Criteria) this;
        }

        public Criteria andSp_statusIsNotNull() {
            addCriterion("sp_status is not null");
            return (Criteria) this;
        }

        public Criteria andSp_statusEqualTo(Byte value) {
            addCriterion("sp_status =", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusNotEqualTo(Byte value) {
            addCriterion("sp_status <>", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusGreaterThan(Byte value) {
            addCriterion("sp_status >", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_status >=", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusLessThan(Byte value) {
            addCriterion("sp_status <", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusLessThanOrEqualTo(Byte value) {
            addCriterion("sp_status <=", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusIn(List<Byte> values) {
            addCriterion("sp_status in", values, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusNotIn(List<Byte> values) {
            addCriterion("sp_status not in", values, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusBetween(Byte value1, Byte value2) {
            addCriterion("sp_status between", value1, value2, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_status not between", value1, value2, "sp_status");
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