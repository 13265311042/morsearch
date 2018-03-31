package com.morsearch.model;

import java.util.ArrayList;
import java.util.List;

public class DesigV_Home_Sales_ListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesigV_Home_Sales_ListExample() {
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

        public Criteria andUr_imageurlIsNull() {
            addCriterion("ur_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlIsNotNull() {
            addCriterion("ur_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlEqualTo(String value) {
            addCriterion("ur_imageurl =", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlNotEqualTo(String value) {
            addCriterion("ur_imageurl <>", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlGreaterThan(String value) {
            addCriterion("ur_imageurl >", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlGreaterThanOrEqualTo(String value) {
            addCriterion("ur_imageurl >=", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlLessThan(String value) {
            addCriterion("ur_imageurl <", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlLessThanOrEqualTo(String value) {
            addCriterion("ur_imageurl <=", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlLike(String value) {
            addCriterion("ur_imageurl like", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlNotLike(String value) {
            addCriterion("ur_imageurl not like", value, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlIn(List<String> values) {
            addCriterion("ur_imageurl in", values, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlNotIn(List<String> values) {
            addCriterion("ur_imageurl not in", values, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlBetween(String value1, String value2) {
            addCriterion("ur_imageurl between", value1, value2, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_imageurlNotBetween(String value1, String value2) {
            addCriterion("ur_imageurl not between", value1, value2, "ur_imageurl");
            return (Criteria) this;
        }

        public Criteria andUr_sexIsNull() {
            addCriterion("ur_sex is null");
            return (Criteria) this;
        }

        public Criteria andUr_sexIsNotNull() {
            addCriterion("ur_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUr_sexEqualTo(String value) {
            addCriterion("ur_sex =", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexNotEqualTo(String value) {
            addCriterion("ur_sex <>", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexGreaterThan(String value) {
            addCriterion("ur_sex >", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexGreaterThanOrEqualTo(String value) {
            addCriterion("ur_sex >=", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexLessThan(String value) {
            addCriterion("ur_sex <", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexLessThanOrEqualTo(String value) {
            addCriterion("ur_sex <=", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexLike(String value) {
            addCriterion("ur_sex like", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexNotLike(String value) {
            addCriterion("ur_sex not like", value, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexIn(List<String> values) {
            addCriterion("ur_sex in", values, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexNotIn(List<String> values) {
            addCriterion("ur_sex not in", values, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexBetween(String value1, String value2) {
            addCriterion("ur_sex between", value1, value2, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUr_sexNotBetween(String value1, String value2) {
            addCriterion("ur_sex not between", value1, value2, "ur_sex");
            return (Criteria) this;
        }

        public Criteria andUe_personjobIsNull() {
            addCriterion("ue_personjob is null");
            return (Criteria) this;
        }

        public Criteria andUe_personjobIsNotNull() {
            addCriterion("ue_personjob is not null");
            return (Criteria) this;
        }

        public Criteria andUe_personjobEqualTo(String value) {
            addCriterion("ue_personjob =", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobNotEqualTo(String value) {
            addCriterion("ue_personjob <>", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobGreaterThan(String value) {
            addCriterion("ue_personjob >", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobGreaterThanOrEqualTo(String value) {
            addCriterion("ue_personjob >=", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobLessThan(String value) {
            addCriterion("ue_personjob <", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobLessThanOrEqualTo(String value) {
            addCriterion("ue_personjob <=", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobLike(String value) {
            addCriterion("ue_personjob like", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobNotLike(String value) {
            addCriterion("ue_personjob not like", value, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobIn(List<String> values) {
            addCriterion("ue_personjob in", values, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobNotIn(List<String> values) {
            addCriterion("ue_personjob not in", values, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobBetween(String value1, String value2) {
            addCriterion("ue_personjob between", value1, value2, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personjobNotBetween(String value1, String value2) {
            addCriterion("ue_personjob not between", value1, value2, "ue_personjob");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorIsNull() {
            addCriterion("ue_personmajor is null");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorIsNotNull() {
            addCriterion("ue_personmajor is not null");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorEqualTo(String value) {
            addCriterion("ue_personmajor =", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotEqualTo(String value) {
            addCriterion("ue_personmajor <>", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorGreaterThan(String value) {
            addCriterion("ue_personmajor >", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorGreaterThanOrEqualTo(String value) {
            addCriterion("ue_personmajor >=", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorLessThan(String value) {
            addCriterion("ue_personmajor <", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorLessThanOrEqualTo(String value) {
            addCriterion("ue_personmajor <=", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorLike(String value) {
            addCriterion("ue_personmajor like", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotLike(String value) {
            addCriterion("ue_personmajor not like", value, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorIn(List<String> values) {
            addCriterion("ue_personmajor in", values, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotIn(List<String> values) {
            addCriterion("ue_personmajor not in", values, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorBetween(String value1, String value2) {
            addCriterion("ue_personmajor between", value1, value2, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_personmajorNotBetween(String value1, String value2) {
            addCriterion("ue_personmajor not between", value1, value2, "ue_personmajor");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandIsNull() {
            addCriterion("ue_companybrand is null");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandIsNotNull() {
            addCriterion("ue_companybrand is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandEqualTo(String value) {
            addCriterion("ue_companybrand =", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandNotEqualTo(String value) {
            addCriterion("ue_companybrand <>", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandGreaterThan(String value) {
            addCriterion("ue_companybrand >", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companybrand >=", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandLessThan(String value) {
            addCriterion("ue_companybrand <", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandLessThanOrEqualTo(String value) {
            addCriterion("ue_companybrand <=", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandLike(String value) {
            addCriterion("ue_companybrand like", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandNotLike(String value) {
            addCriterion("ue_companybrand not like", value, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandIn(List<String> values) {
            addCriterion("ue_companybrand in", values, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandNotIn(List<String> values) {
            addCriterion("ue_companybrand not in", values, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandBetween(String value1, String value2) {
            addCriterion("ue_companybrand between", value1, value2, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUe_companybrandNotBetween(String value1, String value2) {
            addCriterion("ue_companybrand not between", value1, value2, "ue_companybrand");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumIsNull() {
            addCriterion("um_evaluatesum is null");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumIsNotNull() {
            addCriterion("um_evaluatesum is not null");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumEqualTo(Integer value) {
            addCriterion("um_evaluatesum =", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumNotEqualTo(Integer value) {
            addCriterion("um_evaluatesum <>", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumGreaterThan(Integer value) {
            addCriterion("um_evaluatesum >", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_evaluatesum >=", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumLessThan(Integer value) {
            addCriterion("um_evaluatesum <", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumLessThanOrEqualTo(Integer value) {
            addCriterion("um_evaluatesum <=", value, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumIn(List<Integer> values) {
            addCriterion("um_evaluatesum in", values, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumNotIn(List<Integer> values) {
            addCriterion("um_evaluatesum not in", values, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumBetween(Integer value1, Integer value2) {
            addCriterion("um_evaluatesum between", value1, value2, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatesumNotBetween(Integer value1, Integer value2) {
            addCriterion("um_evaluatesum not between", value1, value2, "um_evaluatesum");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountIsNull() {
            addCriterion("um_evaluatecount is null");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountIsNotNull() {
            addCriterion("um_evaluatecount is not null");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountEqualTo(Integer value) {
            addCriterion("um_evaluatecount =", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountNotEqualTo(Integer value) {
            addCriterion("um_evaluatecount <>", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountGreaterThan(Integer value) {
            addCriterion("um_evaluatecount >", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("um_evaluatecount >=", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountLessThan(Integer value) {
            addCriterion("um_evaluatecount <", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountLessThanOrEqualTo(Integer value) {
            addCriterion("um_evaluatecount <=", value, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountIn(List<Integer> values) {
            addCriterion("um_evaluatecount in", values, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountNotIn(List<Integer> values) {
            addCriterion("um_evaluatecount not in", values, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountBetween(Integer value1, Integer value2) {
            addCriterion("um_evaluatecount between", value1, value2, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluatecountNotBetween(Integer value1, Integer value2) {
            addCriterion("um_evaluatecount not between", value1, value2, "um_evaluatecount");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateIsNull() {
            addCriterion("um_evaluaterate is null");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateIsNotNull() {
            addCriterion("um_evaluaterate is not null");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateEqualTo(Long value) {
            addCriterion("um_evaluaterate =", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateNotEqualTo(Long value) {
            addCriterion("um_evaluaterate <>", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateGreaterThan(Long value) {
            addCriterion("um_evaluaterate >", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateGreaterThanOrEqualTo(Long value) {
            addCriterion("um_evaluaterate >=", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateLessThan(Long value) {
            addCriterion("um_evaluaterate <", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateLessThanOrEqualTo(Long value) {
            addCriterion("um_evaluaterate <=", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateIn(List<Long> values) {
            addCriterion("um_evaluaterate in", values, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateNotIn(List<Long> values) {
            addCriterion("um_evaluaterate not in", values, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateBetween(Long value1, Long value2) {
            addCriterion("um_evaluaterate between", value1, value2, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateNotBetween(Long value1, Long value2) {
            addCriterion("um_evaluaterate not between", value1, value2, "um_evaluaterate");
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