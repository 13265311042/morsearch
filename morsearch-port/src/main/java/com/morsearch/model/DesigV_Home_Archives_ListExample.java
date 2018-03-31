package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class DesigV_Home_Archives_ListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesigV_Home_Archives_ListExample() {
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

        public Criteria andUr_useridIsNull() {
            addCriterion("ur_userid is null");
            return (Criteria) this;
        }

        public Criteria andUr_useridIsNotNull() {
            addCriterion("ur_userid is not null");
            return (Criteria) this;
        }

        public Criteria andUr_useridEqualTo(Long value) {
            addCriterion("ur_userid =", value, "ur_userid");
            return (Criteria) this;
        }

        public Criteria andUr_useridNotEqualTo(Long value) {
            addCriterion("ur_userid <>", value, "ur_userid");
            return (Criteria) this;
        }

        public Criteria andUr_useridGreaterThan(Long value) {
            addCriterion("ur_userid >", value, "ur_userid");
            return (Criteria) this;
        }

        public Criteria andUr_useridGreaterThanOrEqualTo(Long value) {
            addCriterion("ur_userid >=", value, "ur_userid");
            return (Criteria) this;
        }

        public Criteria andUr_useridLessThan(Long value) {
            addCriterion("ur_userid <", value, "ur_userid");
            return (Criteria) this;
        }

        public Criteria andUr_useridLessThanOrEqualTo(Long value) {
            addCriterion("ur_userid <=", value, "ur_userid");
            return (Criteria) this;
        }

        public Criteria andUr_useridIn(List<Long> values) {
            addCriterion("ur_userid in", values, "ur_userid");
            return (Criteria) this;
        }

        public Criteria andUr_useridNotIn(List<Long> values) {
            addCriterion("ur_userid not in", values, "ur_userid");
            return (Criteria) this;
        }

        public Criteria andUr_useridBetween(Long value1, Long value2) {
            addCriterion("ur_userid between", value1, value2, "ur_userid");
            return (Criteria) this;
        }

        public Criteria andUr_useridNotBetween(Long value1, Long value2) {
            addCriterion("ur_userid not between", value1, value2, "ur_userid");
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