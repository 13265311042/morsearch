package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mall_GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Mall_GoodsExample() {
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

        public Criteria andMg_idIsNull() {
            addCriterion("mg_id is null");
            return (Criteria) this;
        }

        public Criteria andMg_idIsNotNull() {
            addCriterion("mg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMg_idEqualTo(Long value) {
            addCriterion("mg_id =", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idNotEqualTo(Long value) {
            addCriterion("mg_id <>", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idGreaterThan(Long value) {
            addCriterion("mg_id >", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idGreaterThanOrEqualTo(Long value) {
            addCriterion("mg_id >=", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idLessThan(Long value) {
            addCriterion("mg_id <", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idLessThanOrEqualTo(Long value) {
            addCriterion("mg_id <=", value, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idIn(List<Long> values) {
            addCriterion("mg_id in", values, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idNotIn(List<Long> values) {
            addCriterion("mg_id not in", values, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idBetween(Long value1, Long value2) {
            addCriterion("mg_id between", value1, value2, "mg_id");
            return (Criteria) this;
        }

        public Criteria andMg_idNotBetween(Long value1, Long value2) {
            addCriterion("mg_id not between", value1, value2, "mg_id");
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

        public Criteria andMg_img2IsNull() {
            addCriterion("mg_img2 is null");
            return (Criteria) this;
        }

        public Criteria andMg_img2IsNotNull() {
            addCriterion("mg_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andMg_img2EqualTo(String value) {
            addCriterion("mg_img2 =", value, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img2NotEqualTo(String value) {
            addCriterion("mg_img2 <>", value, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img2GreaterThan(String value) {
            addCriterion("mg_img2 >", value, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img2GreaterThanOrEqualTo(String value) {
            addCriterion("mg_img2 >=", value, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img2LessThan(String value) {
            addCriterion("mg_img2 <", value, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img2LessThanOrEqualTo(String value) {
            addCriterion("mg_img2 <=", value, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img2Like(String value) {
            addCriterion("mg_img2 like", value, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img2NotLike(String value) {
            addCriterion("mg_img2 not like", value, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img2In(List<String> values) {
            addCriterion("mg_img2 in", values, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img2NotIn(List<String> values) {
            addCriterion("mg_img2 not in", values, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img2Between(String value1, String value2) {
            addCriterion("mg_img2 between", value1, value2, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img2NotBetween(String value1, String value2) {
            addCriterion("mg_img2 not between", value1, value2, "mg_img2");
            return (Criteria) this;
        }

        public Criteria andMg_img3IsNull() {
            addCriterion("mg_img3 is null");
            return (Criteria) this;
        }

        public Criteria andMg_img3IsNotNull() {
            addCriterion("mg_img3 is not null");
            return (Criteria) this;
        }

        public Criteria andMg_img3EqualTo(String value) {
            addCriterion("mg_img3 =", value, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img3NotEqualTo(String value) {
            addCriterion("mg_img3 <>", value, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img3GreaterThan(String value) {
            addCriterion("mg_img3 >", value, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img3GreaterThanOrEqualTo(String value) {
            addCriterion("mg_img3 >=", value, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img3LessThan(String value) {
            addCriterion("mg_img3 <", value, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img3LessThanOrEqualTo(String value) {
            addCriterion("mg_img3 <=", value, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img3Like(String value) {
            addCriterion("mg_img3 like", value, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img3NotLike(String value) {
            addCriterion("mg_img3 not like", value, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img3In(List<String> values) {
            addCriterion("mg_img3 in", values, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img3NotIn(List<String> values) {
            addCriterion("mg_img3 not in", values, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img3Between(String value1, String value2) {
            addCriterion("mg_img3 between", value1, value2, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img3NotBetween(String value1, String value2) {
            addCriterion("mg_img3 not between", value1, value2, "mg_img3");
            return (Criteria) this;
        }

        public Criteria andMg_img4IsNull() {
            addCriterion("mg_img4 is null");
            return (Criteria) this;
        }

        public Criteria andMg_img4IsNotNull() {
            addCriterion("mg_img4 is not null");
            return (Criteria) this;
        }

        public Criteria andMg_img4EqualTo(String value) {
            addCriterion("mg_img4 =", value, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img4NotEqualTo(String value) {
            addCriterion("mg_img4 <>", value, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img4GreaterThan(String value) {
            addCriterion("mg_img4 >", value, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img4GreaterThanOrEqualTo(String value) {
            addCriterion("mg_img4 >=", value, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img4LessThan(String value) {
            addCriterion("mg_img4 <", value, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img4LessThanOrEqualTo(String value) {
            addCriterion("mg_img4 <=", value, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img4Like(String value) {
            addCriterion("mg_img4 like", value, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img4NotLike(String value) {
            addCriterion("mg_img4 not like", value, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img4In(List<String> values) {
            addCriterion("mg_img4 in", values, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img4NotIn(List<String> values) {
            addCriterion("mg_img4 not in", values, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img4Between(String value1, String value2) {
            addCriterion("mg_img4 between", value1, value2, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img4NotBetween(String value1, String value2) {
            addCriterion("mg_img4 not between", value1, value2, "mg_img4");
            return (Criteria) this;
        }

        public Criteria andMg_img5IsNull() {
            addCriterion("mg_img5 is null");
            return (Criteria) this;
        }

        public Criteria andMg_img5IsNotNull() {
            addCriterion("mg_img5 is not null");
            return (Criteria) this;
        }

        public Criteria andMg_img5EqualTo(String value) {
            addCriterion("mg_img5 =", value, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_img5NotEqualTo(String value) {
            addCriterion("mg_img5 <>", value, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_img5GreaterThan(String value) {
            addCriterion("mg_img5 >", value, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_img5GreaterThanOrEqualTo(String value) {
            addCriterion("mg_img5 >=", value, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_img5LessThan(String value) {
            addCriterion("mg_img5 <", value, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_img5LessThanOrEqualTo(String value) {
            addCriterion("mg_img5 <=", value, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_img5Like(String value) {
            addCriterion("mg_img5 like", value, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_img5NotLike(String value) {
            addCriterion("mg_img5 not like", value, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_img5In(List<String> values) {
            addCriterion("mg_img5 in", values, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_img5NotIn(List<String> values) {
            addCriterion("mg_img5 not in", values, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_img5Between(String value1, String value2) {
            addCriterion("mg_img5 between", value1, value2, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_img5NotBetween(String value1, String value2) {
            addCriterion("mg_img5 not between", value1, value2, "mg_img5");
            return (Criteria) this;
        }

        public Criteria andMg_colorIsNull() {
            addCriterion("mg_color is null");
            return (Criteria) this;
        }

        public Criteria andMg_colorIsNotNull() {
            addCriterion("mg_color is not null");
            return (Criteria) this;
        }

        public Criteria andMg_colorEqualTo(String value) {
            addCriterion("mg_color =", value, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_colorNotEqualTo(String value) {
            addCriterion("mg_color <>", value, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_colorGreaterThan(String value) {
            addCriterion("mg_color >", value, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_colorGreaterThanOrEqualTo(String value) {
            addCriterion("mg_color >=", value, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_colorLessThan(String value) {
            addCriterion("mg_color <", value, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_colorLessThanOrEqualTo(String value) {
            addCriterion("mg_color <=", value, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_colorLike(String value) {
            addCriterion("mg_color like", value, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_colorNotLike(String value) {
            addCriterion("mg_color not like", value, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_colorIn(List<String> values) {
            addCriterion("mg_color in", values, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_colorNotIn(List<String> values) {
            addCriterion("mg_color not in", values, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_colorBetween(String value1, String value2) {
            addCriterion("mg_color between", value1, value2, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_colorNotBetween(String value1, String value2) {
            addCriterion("mg_color not between", value1, value2, "mg_color");
            return (Criteria) this;
        }

        public Criteria andMg_modelIsNull() {
            addCriterion("mg_model is null");
            return (Criteria) this;
        }

        public Criteria andMg_modelIsNotNull() {
            addCriterion("mg_model is not null");
            return (Criteria) this;
        }

        public Criteria andMg_modelEqualTo(String value) {
            addCriterion("mg_model =", value, "mg_model");
            return (Criteria) this;
        }

        public Criteria andMg_modelNotEqualTo(String value) {
            addCriterion("mg_model <>", value, "mg_model");
            return (Criteria) this;
        }

        public Criteria andMg_modelGreaterThan(String value) {
            addCriterion("mg_model >", value, "mg_model");
            return (Criteria) this;
        }

        public Criteria andMg_modelGreaterThanOrEqualTo(String value) {
            addCriterion("mg_model >=", value, "mg_model");
            return (Criteria) this;
        }

        public Criteria andMg_modelLessThan(String value) {
            addCriterion("mg_model <", value, "mg_model");
            return (Criteria) this;
        }

        public Criteria andMg_modelLessThanOrEqualTo(String value) {
            addCriterion("mg_model <=", value, "mg_model");
            return (Criteria) this;
        }

        public Criteria andMg_modelLike(String value) {
            addCriterion("mg_model like", value, "mg_model");
            return (Criteria) this;
        }

        public Criteria andMg_modelNotLike(String value) {
            addCriterion("mg_model not like", value, "mg_model");
            return (Criteria) this;
        }

        public Criteria andMg_modelIn(List<String> values) {
            addCriterion("mg_model in", values, "mg_model");
            return (Criteria) this;
        }

        public Criteria andMg_modelNotIn(List<String> values) {
            addCriterion("mg_model not in", values, "mg_model");
            return (Criteria) this;
        }

        public Criteria andMg_modelBetween(String value1, String value2) {
            addCriterion("mg_model between", value1, value2, "mg_model");
            return (Criteria) this;
        }

        public Criteria andMg_modelNotBetween(String value1, String value2) {
            addCriterion("mg_model not between", value1, value2, "mg_model");
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

        public Criteria andMg_stockqtyIsNull() {
            addCriterion("mg_stockqty is null");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyIsNotNull() {
            addCriterion("mg_stockqty is not null");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyEqualTo(BigDecimal value) {
            addCriterion("mg_stockqty =", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyNotEqualTo(BigDecimal value) {
            addCriterion("mg_stockqty <>", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyGreaterThan(BigDecimal value) {
            addCriterion("mg_stockqty >", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mg_stockqty >=", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyLessThan(BigDecimal value) {
            addCriterion("mg_stockqty <", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mg_stockqty <=", value, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyIn(List<BigDecimal> values) {
            addCriterion("mg_stockqty in", values, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyNotIn(List<BigDecimal> values) {
            addCriterion("mg_stockqty not in", values, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mg_stockqty between", value1, value2, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_stockqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mg_stockqty not between", value1, value2, "mg_stockqty");
            return (Criteria) this;
        }

        public Criteria andMg_periodIsNull() {
            addCriterion("mg_period is null");
            return (Criteria) this;
        }

        public Criteria andMg_periodIsNotNull() {
            addCriterion("mg_period is not null");
            return (Criteria) this;
        }

        public Criteria andMg_periodEqualTo(Integer value) {
            addCriterion("mg_period =", value, "mg_period");
            return (Criteria) this;
        }

        public Criteria andMg_periodNotEqualTo(Integer value) {
            addCriterion("mg_period <>", value, "mg_period");
            return (Criteria) this;
        }

        public Criteria andMg_periodGreaterThan(Integer value) {
            addCriterion("mg_period >", value, "mg_period");
            return (Criteria) this;
        }

        public Criteria andMg_periodGreaterThanOrEqualTo(Integer value) {
            addCriterion("mg_period >=", value, "mg_period");
            return (Criteria) this;
        }

        public Criteria andMg_periodLessThan(Integer value) {
            addCriterion("mg_period <", value, "mg_period");
            return (Criteria) this;
        }

        public Criteria andMg_periodLessThanOrEqualTo(Integer value) {
            addCriterion("mg_period <=", value, "mg_period");
            return (Criteria) this;
        }

        public Criteria andMg_periodIn(List<Integer> values) {
            addCriterion("mg_period in", values, "mg_period");
            return (Criteria) this;
        }

        public Criteria andMg_periodNotIn(List<Integer> values) {
            addCriterion("mg_period not in", values, "mg_period");
            return (Criteria) this;
        }

        public Criteria andMg_periodBetween(Integer value1, Integer value2) {
            addCriterion("mg_period between", value1, value2, "mg_period");
            return (Criteria) this;
        }

        public Criteria andMg_periodNotBetween(Integer value1, Integer value2) {
            addCriterion("mg_period not between", value1, value2, "mg_period");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsIsNull() {
            addCriterion("mg_logistics is null");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsIsNotNull() {
            addCriterion("mg_logistics is not null");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsEqualTo(String value) {
            addCriterion("mg_logistics =", value, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsNotEqualTo(String value) {
            addCriterion("mg_logistics <>", value, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsGreaterThan(String value) {
            addCriterion("mg_logistics >", value, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsGreaterThanOrEqualTo(String value) {
            addCriterion("mg_logistics >=", value, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsLessThan(String value) {
            addCriterion("mg_logistics <", value, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsLessThanOrEqualTo(String value) {
            addCriterion("mg_logistics <=", value, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsLike(String value) {
            addCriterion("mg_logistics like", value, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsNotLike(String value) {
            addCriterion("mg_logistics not like", value, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsIn(List<String> values) {
            addCriterion("mg_logistics in", values, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsNotIn(List<String> values) {
            addCriterion("mg_logistics not in", values, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsBetween(String value1, String value2) {
            addCriterion("mg_logistics between", value1, value2, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_logisticsNotBetween(String value1, String value2) {
            addCriterion("mg_logistics not between", value1, value2, "mg_logistics");
            return (Criteria) this;
        }

        public Criteria andMg_createidIsNull() {
            addCriterion("mg_createid is null");
            return (Criteria) this;
        }

        public Criteria andMg_createidIsNotNull() {
            addCriterion("mg_createid is not null");
            return (Criteria) this;
        }

        public Criteria andMg_createidEqualTo(Long value) {
            addCriterion("mg_createid =", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidNotEqualTo(Long value) {
            addCriterion("mg_createid <>", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidGreaterThan(Long value) {
            addCriterion("mg_createid >", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("mg_createid >=", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidLessThan(Long value) {
            addCriterion("mg_createid <", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidLessThanOrEqualTo(Long value) {
            addCriterion("mg_createid <=", value, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidIn(List<Long> values) {
            addCriterion("mg_createid in", values, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidNotIn(List<Long> values) {
            addCriterion("mg_createid not in", values, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidBetween(Long value1, Long value2) {
            addCriterion("mg_createid between", value1, value2, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createidNotBetween(Long value1, Long value2) {
            addCriterion("mg_createid not between", value1, value2, "mg_createid");
            return (Criteria) this;
        }

        public Criteria andMg_createnoIsNull() {
            addCriterion("mg_createno is null");
            return (Criteria) this;
        }

        public Criteria andMg_createnoIsNotNull() {
            addCriterion("mg_createno is not null");
            return (Criteria) this;
        }

        public Criteria andMg_createnoEqualTo(String value) {
            addCriterion("mg_createno =", value, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createnoNotEqualTo(String value) {
            addCriterion("mg_createno <>", value, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createnoGreaterThan(String value) {
            addCriterion("mg_createno >", value, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("mg_createno >=", value, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createnoLessThan(String value) {
            addCriterion("mg_createno <", value, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createnoLessThanOrEqualTo(String value) {
            addCriterion("mg_createno <=", value, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createnoLike(String value) {
            addCriterion("mg_createno like", value, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createnoNotLike(String value) {
            addCriterion("mg_createno not like", value, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createnoIn(List<String> values) {
            addCriterion("mg_createno in", values, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createnoNotIn(List<String> values) {
            addCriterion("mg_createno not in", values, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createnoBetween(String value1, String value2) {
            addCriterion("mg_createno between", value1, value2, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createnoNotBetween(String value1, String value2) {
            addCriterion("mg_createno not between", value1, value2, "mg_createno");
            return (Criteria) this;
        }

        public Criteria andMg_createdateIsNull() {
            addCriterion("mg_createdate is null");
            return (Criteria) this;
        }

        public Criteria andMg_createdateIsNotNull() {
            addCriterion("mg_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andMg_createdateEqualTo(Date value) {
            addCriterion("mg_createdate =", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateNotEqualTo(Date value) {
            addCriterion("mg_createdate <>", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateGreaterThan(Date value) {
            addCriterion("mg_createdate >", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("mg_createdate >=", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateLessThan(Date value) {
            addCriterion("mg_createdate <", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateLessThanOrEqualTo(Date value) {
            addCriterion("mg_createdate <=", value, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateIn(List<Date> values) {
            addCriterion("mg_createdate in", values, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateNotIn(List<Date> values) {
            addCriterion("mg_createdate not in", values, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateBetween(Date value1, Date value2) {
            addCriterion("mg_createdate between", value1, value2, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_createdateNotBetween(Date value1, Date value2) {
            addCriterion("mg_createdate not between", value1, value2, "mg_createdate");
            return (Criteria) this;
        }

        public Criteria andMg_updateidIsNull() {
            addCriterion("mg_updateid is null");
            return (Criteria) this;
        }

        public Criteria andMg_updateidIsNotNull() {
            addCriterion("mg_updateid is not null");
            return (Criteria) this;
        }

        public Criteria andMg_updateidEqualTo(Long value) {
            addCriterion("mg_updateid =", value, "mg_updateid");
            return (Criteria) this;
        }

        public Criteria andMg_updateidNotEqualTo(Long value) {
            addCriterion("mg_updateid <>", value, "mg_updateid");
            return (Criteria) this;
        }

        public Criteria andMg_updateidGreaterThan(Long value) {
            addCriterion("mg_updateid >", value, "mg_updateid");
            return (Criteria) this;
        }

        public Criteria andMg_updateidGreaterThanOrEqualTo(Long value) {
            addCriterion("mg_updateid >=", value, "mg_updateid");
            return (Criteria) this;
        }

        public Criteria andMg_updateidLessThan(Long value) {
            addCriterion("mg_updateid <", value, "mg_updateid");
            return (Criteria) this;
        }

        public Criteria andMg_updateidLessThanOrEqualTo(Long value) {
            addCriterion("mg_updateid <=", value, "mg_updateid");
            return (Criteria) this;
        }

        public Criteria andMg_updateidIn(List<Long> values) {
            addCriterion("mg_updateid in", values, "mg_updateid");
            return (Criteria) this;
        }

        public Criteria andMg_updateidNotIn(List<Long> values) {
            addCriterion("mg_updateid not in", values, "mg_updateid");
            return (Criteria) this;
        }

        public Criteria andMg_updateidBetween(Long value1, Long value2) {
            addCriterion("mg_updateid between", value1, value2, "mg_updateid");
            return (Criteria) this;
        }

        public Criteria andMg_updateidNotBetween(Long value1, Long value2) {
            addCriterion("mg_updateid not between", value1, value2, "mg_updateid");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoIsNull() {
            addCriterion("mg_updateno is null");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoIsNotNull() {
            addCriterion("mg_updateno is not null");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoEqualTo(String value) {
            addCriterion("mg_updateno =", value, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoNotEqualTo(String value) {
            addCriterion("mg_updateno <>", value, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoGreaterThan(String value) {
            addCriterion("mg_updateno >", value, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoGreaterThanOrEqualTo(String value) {
            addCriterion("mg_updateno >=", value, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoLessThan(String value) {
            addCriterion("mg_updateno <", value, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoLessThanOrEqualTo(String value) {
            addCriterion("mg_updateno <=", value, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoLike(String value) {
            addCriterion("mg_updateno like", value, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoNotLike(String value) {
            addCriterion("mg_updateno not like", value, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoIn(List<String> values) {
            addCriterion("mg_updateno in", values, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoNotIn(List<String> values) {
            addCriterion("mg_updateno not in", values, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoBetween(String value1, String value2) {
            addCriterion("mg_updateno between", value1, value2, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatenoNotBetween(String value1, String value2) {
            addCriterion("mg_updateno not between", value1, value2, "mg_updateno");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateIsNull() {
            addCriterion("mg_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateIsNotNull() {
            addCriterion("mg_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateEqualTo(Date value) {
            addCriterion("mg_updatedate =", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateNotEqualTo(Date value) {
            addCriterion("mg_updatedate <>", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateGreaterThan(Date value) {
            addCriterion("mg_updatedate >", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("mg_updatedate >=", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateLessThan(Date value) {
            addCriterion("mg_updatedate <", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("mg_updatedate <=", value, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateIn(List<Date> values) {
            addCriterion("mg_updatedate in", values, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateNotIn(List<Date> values) {
            addCriterion("mg_updatedate not in", values, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateBetween(Date value1, Date value2) {
            addCriterion("mg_updatedate between", value1, value2, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("mg_updatedate not between", value1, value2, "mg_updatedate");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkIsNull() {
            addCriterion("mg_disposeremark is null");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkIsNotNull() {
            addCriterion("mg_disposeremark is not null");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkEqualTo(String value) {
            addCriterion("mg_disposeremark =", value, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkNotEqualTo(String value) {
            addCriterion("mg_disposeremark <>", value, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkGreaterThan(String value) {
            addCriterion("mg_disposeremark >", value, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkGreaterThanOrEqualTo(String value) {
            addCriterion("mg_disposeremark >=", value, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkLessThan(String value) {
            addCriterion("mg_disposeremark <", value, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkLessThanOrEqualTo(String value) {
            addCriterion("mg_disposeremark <=", value, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkLike(String value) {
            addCriterion("mg_disposeremark like", value, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkNotLike(String value) {
            addCriterion("mg_disposeremark not like", value, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkIn(List<String> values) {
            addCriterion("mg_disposeremark in", values, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkNotIn(List<String> values) {
            addCriterion("mg_disposeremark not in", values, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkBetween(String value1, String value2) {
            addCriterion("mg_disposeremark between", value1, value2, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeremarkNotBetween(String value1, String value2) {
            addCriterion("mg_disposeremark not between", value1, value2, "mg_disposeremark");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidIsNull() {
            addCriterion("mg_disposeid is null");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidIsNotNull() {
            addCriterion("mg_disposeid is not null");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidEqualTo(Long value) {
            addCriterion("mg_disposeid =", value, "mg_disposeid");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidNotEqualTo(Long value) {
            addCriterion("mg_disposeid <>", value, "mg_disposeid");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidGreaterThan(Long value) {
            addCriterion("mg_disposeid >", value, "mg_disposeid");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidGreaterThanOrEqualTo(Long value) {
            addCriterion("mg_disposeid >=", value, "mg_disposeid");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidLessThan(Long value) {
            addCriterion("mg_disposeid <", value, "mg_disposeid");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidLessThanOrEqualTo(Long value) {
            addCriterion("mg_disposeid <=", value, "mg_disposeid");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidIn(List<Long> values) {
            addCriterion("mg_disposeid in", values, "mg_disposeid");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidNotIn(List<Long> values) {
            addCriterion("mg_disposeid not in", values, "mg_disposeid");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidBetween(Long value1, Long value2) {
            addCriterion("mg_disposeid between", value1, value2, "mg_disposeid");
            return (Criteria) this;
        }

        public Criteria andMg_disposeidNotBetween(Long value1, Long value2) {
            addCriterion("mg_disposeid not between", value1, value2, "mg_disposeid");
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