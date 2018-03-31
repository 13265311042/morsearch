package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sales_MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sales_MessageExample() {
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

        public Criteria andSm_idIsNull() {
            addCriterion("sm_id is null");
            return (Criteria) this;
        }

        public Criteria andSm_idIsNotNull() {
            addCriterion("sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSm_idEqualTo(Long value) {
            addCriterion("sm_id =", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotEqualTo(Long value) {
            addCriterion("sm_id <>", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idGreaterThan(Long value) {
            addCriterion("sm_id >", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_id >=", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idLessThan(Long value) {
            addCriterion("sm_id <", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idLessThanOrEqualTo(Long value) {
            addCriterion("sm_id <=", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idIn(List<Long> values) {
            addCriterion("sm_id in", values, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotIn(List<Long> values) {
            addCriterion("sm_id not in", values, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idBetween(Long value1, Long value2) {
            addCriterion("sm_id between", value1, value2, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotBetween(Long value1, Long value2) {
            addCriterion("sm_id not between", value1, value2, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoIsNull() {
            addCriterion("sm_orderno is null");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoIsNotNull() {
            addCriterion("sm_orderno is not null");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoEqualTo(String value) {
            addCriterion("sm_orderno =", value, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoNotEqualTo(String value) {
            addCriterion("sm_orderno <>", value, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoGreaterThan(String value) {
            addCriterion("sm_orderno >", value, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoGreaterThanOrEqualTo(String value) {
            addCriterion("sm_orderno >=", value, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoLessThan(String value) {
            addCriterion("sm_orderno <", value, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoLessThanOrEqualTo(String value) {
            addCriterion("sm_orderno <=", value, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoLike(String value) {
            addCriterion("sm_orderno like", value, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoNotLike(String value) {
            addCriterion("sm_orderno not like", value, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoIn(List<String> values) {
            addCriterion("sm_orderno in", values, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoNotIn(List<String> values) {
            addCriterion("sm_orderno not in", values, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoBetween(String value1, String value2) {
            addCriterion("sm_orderno between", value1, value2, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_ordernoNotBetween(String value1, String value2) {
            addCriterion("sm_orderno not between", value1, value2, "sm_orderno");
            return (Criteria) this;
        }

        public Criteria andSm_contentIsNull() {
            addCriterion("sm_content is null");
            return (Criteria) this;
        }

        public Criteria andSm_contentIsNotNull() {
            addCriterion("sm_content is not null");
            return (Criteria) this;
        }

        public Criteria andSm_contentEqualTo(String value) {
            addCriterion("sm_content =", value, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_contentNotEqualTo(String value) {
            addCriterion("sm_content <>", value, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_contentGreaterThan(String value) {
            addCriterion("sm_content >", value, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_contentGreaterThanOrEqualTo(String value) {
            addCriterion("sm_content >=", value, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_contentLessThan(String value) {
            addCriterion("sm_content <", value, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_contentLessThanOrEqualTo(String value) {
            addCriterion("sm_content <=", value, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_contentLike(String value) {
            addCriterion("sm_content like", value, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_contentNotLike(String value) {
            addCriterion("sm_content not like", value, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_contentIn(List<String> values) {
            addCriterion("sm_content in", values, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_contentNotIn(List<String> values) {
            addCriterion("sm_content not in", values, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_contentBetween(String value1, String value2) {
            addCriterion("sm_content between", value1, value2, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_contentNotBetween(String value1, String value2) {
            addCriterion("sm_content not between", value1, value2, "sm_content");
            return (Criteria) this;
        }

        public Criteria andSm_saleridIsNull() {
            addCriterion("sm_salerid is null");
            return (Criteria) this;
        }

        public Criteria andSm_saleridIsNotNull() {
            addCriterion("sm_salerid is not null");
            return (Criteria) this;
        }

        public Criteria andSm_saleridEqualTo(Long value) {
            addCriterion("sm_salerid =", value, "sm_salerid");
            return (Criteria) this;
        }

        public Criteria andSm_saleridNotEqualTo(Long value) {
            addCriterion("sm_salerid <>", value, "sm_salerid");
            return (Criteria) this;
        }

        public Criteria andSm_saleridGreaterThan(Long value) {
            addCriterion("sm_salerid >", value, "sm_salerid");
            return (Criteria) this;
        }

        public Criteria andSm_saleridGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_salerid >=", value, "sm_salerid");
            return (Criteria) this;
        }

        public Criteria andSm_saleridLessThan(Long value) {
            addCriterion("sm_salerid <", value, "sm_salerid");
            return (Criteria) this;
        }

        public Criteria andSm_saleridLessThanOrEqualTo(Long value) {
            addCriterion("sm_salerid <=", value, "sm_salerid");
            return (Criteria) this;
        }

        public Criteria andSm_saleridIn(List<Long> values) {
            addCriterion("sm_salerid in", values, "sm_salerid");
            return (Criteria) this;
        }

        public Criteria andSm_saleridNotIn(List<Long> values) {
            addCriterion("sm_salerid not in", values, "sm_salerid");
            return (Criteria) this;
        }

        public Criteria andSm_saleridBetween(Long value1, Long value2) {
            addCriterion("sm_salerid between", value1, value2, "sm_salerid");
            return (Criteria) this;
        }

        public Criteria andSm_saleridNotBetween(Long value1, Long value2) {
            addCriterion("sm_salerid not between", value1, value2, "sm_salerid");
            return (Criteria) this;
        }

        public Criteria andSm_salernameIsNull() {
            addCriterion("sm_salername is null");
            return (Criteria) this;
        }

        public Criteria andSm_salernameIsNotNull() {
            addCriterion("sm_salername is not null");
            return (Criteria) this;
        }

        public Criteria andSm_salernameEqualTo(String value) {
            addCriterion("sm_salername =", value, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salernameNotEqualTo(String value) {
            addCriterion("sm_salername <>", value, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salernameGreaterThan(String value) {
            addCriterion("sm_salername >", value, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salernameGreaterThanOrEqualTo(String value) {
            addCriterion("sm_salername >=", value, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salernameLessThan(String value) {
            addCriterion("sm_salername <", value, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salernameLessThanOrEqualTo(String value) {
            addCriterion("sm_salername <=", value, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salernameLike(String value) {
            addCriterion("sm_salername like", value, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salernameNotLike(String value) {
            addCriterion("sm_salername not like", value, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salernameIn(List<String> values) {
            addCriterion("sm_salername in", values, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salernameNotIn(List<String> values) {
            addCriterion("sm_salername not in", values, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salernameBetween(String value1, String value2) {
            addCriterion("sm_salername between", value1, value2, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salernameNotBetween(String value1, String value2) {
            addCriterion("sm_salername not between", value1, value2, "sm_salername");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageIsNull() {
            addCriterion("sm_salerimage is null");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageIsNotNull() {
            addCriterion("sm_salerimage is not null");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageEqualTo(String value) {
            addCriterion("sm_salerimage =", value, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageNotEqualTo(String value) {
            addCriterion("sm_salerimage <>", value, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageGreaterThan(String value) {
            addCriterion("sm_salerimage >", value, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageGreaterThanOrEqualTo(String value) {
            addCriterion("sm_salerimage >=", value, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageLessThan(String value) {
            addCriterion("sm_salerimage <", value, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageLessThanOrEqualTo(String value) {
            addCriterion("sm_salerimage <=", value, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageLike(String value) {
            addCriterion("sm_salerimage like", value, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageNotLike(String value) {
            addCriterion("sm_salerimage not like", value, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageIn(List<String> values) {
            addCriterion("sm_salerimage in", values, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageNotIn(List<String> values) {
            addCriterion("sm_salerimage not in", values, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageBetween(String value1, String value2) {
            addCriterion("sm_salerimage between", value1, value2, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerimageNotBetween(String value1, String value2) {
            addCriterion("sm_salerimage not between", value1, value2, "sm_salerimage");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadIsNull() {
            addCriterion("sm_salerisread is null");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadIsNotNull() {
            addCriterion("sm_salerisread is not null");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadEqualTo(Boolean value) {
            addCriterion("sm_salerisread =", value, "sm_salerisread");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadNotEqualTo(Boolean value) {
            addCriterion("sm_salerisread <>", value, "sm_salerisread");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadGreaterThan(Boolean value) {
            addCriterion("sm_salerisread >", value, "sm_salerisread");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sm_salerisread >=", value, "sm_salerisread");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadLessThan(Boolean value) {
            addCriterion("sm_salerisread <", value, "sm_salerisread");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadLessThanOrEqualTo(Boolean value) {
            addCriterion("sm_salerisread <=", value, "sm_salerisread");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadIn(List<Boolean> values) {
            addCriterion("sm_salerisread in", values, "sm_salerisread");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadNotIn(List<Boolean> values) {
            addCriterion("sm_salerisread not in", values, "sm_salerisread");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadBetween(Boolean value1, Boolean value2) {
            addCriterion("sm_salerisread between", value1, value2, "sm_salerisread");
            return (Criteria) this;
        }

        public Criteria andSm_salerisreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sm_salerisread not between", value1, value2, "sm_salerisread");
            return (Criteria) this;
        }

        public Criteria andSm_designeridIsNull() {
            addCriterion("sm_designerid is null");
            return (Criteria) this;
        }

        public Criteria andSm_designeridIsNotNull() {
            addCriterion("sm_designerid is not null");
            return (Criteria) this;
        }

        public Criteria andSm_designeridEqualTo(Long value) {
            addCriterion("sm_designerid =", value, "sm_designerid");
            return (Criteria) this;
        }

        public Criteria andSm_designeridNotEqualTo(Long value) {
            addCriterion("sm_designerid <>", value, "sm_designerid");
            return (Criteria) this;
        }

        public Criteria andSm_designeridGreaterThan(Long value) {
            addCriterion("sm_designerid >", value, "sm_designerid");
            return (Criteria) this;
        }

        public Criteria andSm_designeridGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_designerid >=", value, "sm_designerid");
            return (Criteria) this;
        }

        public Criteria andSm_designeridLessThan(Long value) {
            addCriterion("sm_designerid <", value, "sm_designerid");
            return (Criteria) this;
        }

        public Criteria andSm_designeridLessThanOrEqualTo(Long value) {
            addCriterion("sm_designerid <=", value, "sm_designerid");
            return (Criteria) this;
        }

        public Criteria andSm_designeridIn(List<Long> values) {
            addCriterion("sm_designerid in", values, "sm_designerid");
            return (Criteria) this;
        }

        public Criteria andSm_designeridNotIn(List<Long> values) {
            addCriterion("sm_designerid not in", values, "sm_designerid");
            return (Criteria) this;
        }

        public Criteria andSm_designeridBetween(Long value1, Long value2) {
            addCriterion("sm_designerid between", value1, value2, "sm_designerid");
            return (Criteria) this;
        }

        public Criteria andSm_designeridNotBetween(Long value1, Long value2) {
            addCriterion("sm_designerid not between", value1, value2, "sm_designerid");
            return (Criteria) this;
        }

        public Criteria andSm_designernameIsNull() {
            addCriterion("sm_designername is null");
            return (Criteria) this;
        }

        public Criteria andSm_designernameIsNotNull() {
            addCriterion("sm_designername is not null");
            return (Criteria) this;
        }

        public Criteria andSm_designernameEqualTo(String value) {
            addCriterion("sm_designername =", value, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designernameNotEqualTo(String value) {
            addCriterion("sm_designername <>", value, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designernameGreaterThan(String value) {
            addCriterion("sm_designername >", value, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designernameGreaterThanOrEqualTo(String value) {
            addCriterion("sm_designername >=", value, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designernameLessThan(String value) {
            addCriterion("sm_designername <", value, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designernameLessThanOrEqualTo(String value) {
            addCriterion("sm_designername <=", value, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designernameLike(String value) {
            addCriterion("sm_designername like", value, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designernameNotLike(String value) {
            addCriterion("sm_designername not like", value, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designernameIn(List<String> values) {
            addCriterion("sm_designername in", values, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designernameNotIn(List<String> values) {
            addCriterion("sm_designername not in", values, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designernameBetween(String value1, String value2) {
            addCriterion("sm_designername between", value1, value2, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designernameNotBetween(String value1, String value2) {
            addCriterion("sm_designername not between", value1, value2, "sm_designername");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageIsNull() {
            addCriterion("sm_designerimage is null");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageIsNotNull() {
            addCriterion("sm_designerimage is not null");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageEqualTo(String value) {
            addCriterion("sm_designerimage =", value, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageNotEqualTo(String value) {
            addCriterion("sm_designerimage <>", value, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageGreaterThan(String value) {
            addCriterion("sm_designerimage >", value, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageGreaterThanOrEqualTo(String value) {
            addCriterion("sm_designerimage >=", value, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageLessThan(String value) {
            addCriterion("sm_designerimage <", value, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageLessThanOrEqualTo(String value) {
            addCriterion("sm_designerimage <=", value, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageLike(String value) {
            addCriterion("sm_designerimage like", value, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageNotLike(String value) {
            addCriterion("sm_designerimage not like", value, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageIn(List<String> values) {
            addCriterion("sm_designerimage in", values, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageNotIn(List<String> values) {
            addCriterion("sm_designerimage not in", values, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageBetween(String value1, String value2) {
            addCriterion("sm_designerimage between", value1, value2, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerimageNotBetween(String value1, String value2) {
            addCriterion("sm_designerimage not between", value1, value2, "sm_designerimage");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadIsNull() {
            addCriterion("sm_designerisread is null");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadIsNotNull() {
            addCriterion("sm_designerisread is not null");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadEqualTo(Boolean value) {
            addCriterion("sm_designerisread =", value, "sm_designerisread");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadNotEqualTo(Boolean value) {
            addCriterion("sm_designerisread <>", value, "sm_designerisread");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadGreaterThan(Boolean value) {
            addCriterion("sm_designerisread >", value, "sm_designerisread");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sm_designerisread >=", value, "sm_designerisread");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadLessThan(Boolean value) {
            addCriterion("sm_designerisread <", value, "sm_designerisread");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadLessThanOrEqualTo(Boolean value) {
            addCriterion("sm_designerisread <=", value, "sm_designerisread");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadIn(List<Boolean> values) {
            addCriterion("sm_designerisread in", values, "sm_designerisread");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadNotIn(List<Boolean> values) {
            addCriterion("sm_designerisread not in", values, "sm_designerisread");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadBetween(Boolean value1, Boolean value2) {
            addCriterion("sm_designerisread between", value1, value2, "sm_designerisread");
            return (Criteria) this;
        }

        public Criteria andSm_designerisreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sm_designerisread not between", value1, value2, "sm_designerisread");
            return (Criteria) this;
        }

        public Criteria andSm_typeIsNull() {
            addCriterion("sm_type is null");
            return (Criteria) this;
        }

        public Criteria andSm_typeIsNotNull() {
            addCriterion("sm_type is not null");
            return (Criteria) this;
        }

        public Criteria andSm_typeEqualTo(Byte value) {
            addCriterion("sm_type =", value, "sm_type");
            return (Criteria) this;
        }

        public Criteria andSm_typeNotEqualTo(Byte value) {
            addCriterion("sm_type <>", value, "sm_type");
            return (Criteria) this;
        }

        public Criteria andSm_typeGreaterThan(Byte value) {
            addCriterion("sm_type >", value, "sm_type");
            return (Criteria) this;
        }

        public Criteria andSm_typeGreaterThanOrEqualTo(Byte value) {
            addCriterion("sm_type >=", value, "sm_type");
            return (Criteria) this;
        }

        public Criteria andSm_typeLessThan(Byte value) {
            addCriterion("sm_type <", value, "sm_type");
            return (Criteria) this;
        }

        public Criteria andSm_typeLessThanOrEqualTo(Byte value) {
            addCriterion("sm_type <=", value, "sm_type");
            return (Criteria) this;
        }

        public Criteria andSm_typeIn(List<Byte> values) {
            addCriterion("sm_type in", values, "sm_type");
            return (Criteria) this;
        }

        public Criteria andSm_typeNotIn(List<Byte> values) {
            addCriterion("sm_type not in", values, "sm_type");
            return (Criteria) this;
        }

        public Criteria andSm_typeBetween(Byte value1, Byte value2) {
            addCriterion("sm_type between", value1, value2, "sm_type");
            return (Criteria) this;
        }

        public Criteria andSm_typeNotBetween(Byte value1, Byte value2) {
            addCriterion("sm_type not between", value1, value2, "sm_type");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIsNull() {
            addCriterion("sm_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIsNotNull() {
            addCriterion("sm_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSm_createdateEqualTo(Date value) {
            addCriterion("sm_createdate =", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotEqualTo(Date value) {
            addCriterion("sm_createdate <>", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateGreaterThan(Date value) {
            addCriterion("sm_createdate >", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sm_createdate >=", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateLessThan(Date value) {
            addCriterion("sm_createdate <", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateLessThanOrEqualTo(Date value) {
            addCriterion("sm_createdate <=", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIn(List<Date> values) {
            addCriterion("sm_createdate in", values, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotIn(List<Date> values) {
            addCriterion("sm_createdate not in", values, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateBetween(Date value1, Date value2) {
            addCriterion("sm_createdate between", value1, value2, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotBetween(Date value1, Date value2) {
            addCriterion("sm_createdate not between", value1, value2, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopIsNull() {
            addCriterion("sm_flagstop is null");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopIsNotNull() {
            addCriterion("sm_flagstop is not null");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopEqualTo(Boolean value) {
            addCriterion("sm_flagstop =", value, "sm_flagstop");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopNotEqualTo(Boolean value) {
            addCriterion("sm_flagstop <>", value, "sm_flagstop");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopGreaterThan(Boolean value) {
            addCriterion("sm_flagstop >", value, "sm_flagstop");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sm_flagstop >=", value, "sm_flagstop");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopLessThan(Boolean value) {
            addCriterion("sm_flagstop <", value, "sm_flagstop");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopLessThanOrEqualTo(Boolean value) {
            addCriterion("sm_flagstop <=", value, "sm_flagstop");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopIn(List<Boolean> values) {
            addCriterion("sm_flagstop in", values, "sm_flagstop");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopNotIn(List<Boolean> values) {
            addCriterion("sm_flagstop not in", values, "sm_flagstop");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopBetween(Boolean value1, Boolean value2) {
            addCriterion("sm_flagstop between", value1, value2, "sm_flagstop");
            return (Criteria) this;
        }

        public Criteria andSm_flagstopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sm_flagstop not between", value1, value2, "sm_flagstop");
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