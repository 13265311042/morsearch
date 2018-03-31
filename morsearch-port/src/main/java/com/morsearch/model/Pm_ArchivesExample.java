package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pm_ArchivesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Pm_ArchivesExample() {
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

        public Criteria andPa_idIsNull() {
            addCriterion("pa_id is null");
            return (Criteria) this;
        }

        public Criteria andPa_idIsNotNull() {
            addCriterion("pa_id is not null");
            return (Criteria) this;
        }

        public Criteria andPa_idEqualTo(Long value) {
            addCriterion("pa_id =", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idNotEqualTo(Long value) {
            addCriterion("pa_id <>", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idGreaterThan(Long value) {
            addCriterion("pa_id >", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idGreaterThanOrEqualTo(Long value) {
            addCriterion("pa_id >=", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idLessThan(Long value) {
            addCriterion("pa_id <", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idLessThanOrEqualTo(Long value) {
            addCriterion("pa_id <=", value, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idIn(List<Long> values) {
            addCriterion("pa_id in", values, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idNotIn(List<Long> values) {
            addCriterion("pa_id not in", values, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idBetween(Long value1, Long value2) {
            addCriterion("pa_id between", value1, value2, "pa_id");
            return (Criteria) this;
        }

        public Criteria andPa_idNotBetween(Long value1, Long value2) {
            addCriterion("pa_id not between", value1, value2, "pa_id");
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

        public Criteria andPa_contentIsNull() {
            addCriterion("pa_content is null");
            return (Criteria) this;
        }

        public Criteria andPa_contentIsNotNull() {
            addCriterion("pa_content is not null");
            return (Criteria) this;
        }

        public Criteria andPa_contentEqualTo(String value) {
            addCriterion("pa_content =", value, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_contentNotEqualTo(String value) {
            addCriterion("pa_content <>", value, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_contentGreaterThan(String value) {
            addCriterion("pa_content >", value, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_contentGreaterThanOrEqualTo(String value) {
            addCriterion("pa_content >=", value, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_contentLessThan(String value) {
            addCriterion("pa_content <", value, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_contentLessThanOrEqualTo(String value) {
            addCriterion("pa_content <=", value, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_contentLike(String value) {
            addCriterion("pa_content like", value, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_contentNotLike(String value) {
            addCriterion("pa_content not like", value, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_contentIn(List<String> values) {
            addCriterion("pa_content in", values, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_contentNotIn(List<String> values) {
            addCriterion("pa_content not in", values, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_contentBetween(String value1, String value2) {
            addCriterion("pa_content between", value1, value2, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_contentNotBetween(String value1, String value2) {
            addCriterion("pa_content not between", value1, value2, "pa_content");
            return (Criteria) this;
        }

        public Criteria andPa_companyidIsNull() {
            addCriterion("pa_companyid is null");
            return (Criteria) this;
        }

        public Criteria andPa_companyidIsNotNull() {
            addCriterion("pa_companyid is not null");
            return (Criteria) this;
        }

        public Criteria andPa_companyidEqualTo(Integer value) {
            addCriterion("pa_companyid =", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidNotEqualTo(Integer value) {
            addCriterion("pa_companyid <>", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidGreaterThan(Integer value) {
            addCriterion("pa_companyid >", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_companyid >=", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidLessThan(Integer value) {
            addCriterion("pa_companyid <", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidLessThanOrEqualTo(Integer value) {
            addCriterion("pa_companyid <=", value, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidIn(List<Integer> values) {
            addCriterion("pa_companyid in", values, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidNotIn(List<Integer> values) {
            addCriterion("pa_companyid not in", values, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidBetween(Integer value1, Integer value2) {
            addCriterion("pa_companyid between", value1, value2, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companyidNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_companyid not between", value1, value2, "pa_companyid");
            return (Criteria) this;
        }

        public Criteria andPa_companynameIsNull() {
            addCriterion("pa_companyname is null");
            return (Criteria) this;
        }

        public Criteria andPa_companynameIsNotNull() {
            addCriterion("pa_companyname is not null");
            return (Criteria) this;
        }

        public Criteria andPa_companynameEqualTo(String value) {
            addCriterion("pa_companyname =", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameNotEqualTo(String value) {
            addCriterion("pa_companyname <>", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameGreaterThan(String value) {
            addCriterion("pa_companyname >", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameGreaterThanOrEqualTo(String value) {
            addCriterion("pa_companyname >=", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameLessThan(String value) {
            addCriterion("pa_companyname <", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameLessThanOrEqualTo(String value) {
            addCriterion("pa_companyname <=", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameLike(String value) {
            addCriterion("pa_companyname like", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameNotLike(String value) {
            addCriterion("pa_companyname not like", value, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameIn(List<String> values) {
            addCriterion("pa_companyname in", values, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameNotIn(List<String> values) {
            addCriterion("pa_companyname not in", values, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameBetween(String value1, String value2) {
            addCriterion("pa_companyname between", value1, value2, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_companynameNotBetween(String value1, String value2) {
            addCriterion("pa_companyname not between", value1, value2, "pa_companyname");
            return (Criteria) this;
        }

        public Criteria andPa_filenameIsNull() {
            addCriterion("pa_filename is null");
            return (Criteria) this;
        }

        public Criteria andPa_filenameIsNotNull() {
            addCriterion("pa_filename is not null");
            return (Criteria) this;
        }

        public Criteria andPa_filenameEqualTo(String value) {
            addCriterion("pa_filename =", value, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_filenameNotEqualTo(String value) {
            addCriterion("pa_filename <>", value, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_filenameGreaterThan(String value) {
            addCriterion("pa_filename >", value, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_filenameGreaterThanOrEqualTo(String value) {
            addCriterion("pa_filename >=", value, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_filenameLessThan(String value) {
            addCriterion("pa_filename <", value, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_filenameLessThanOrEqualTo(String value) {
            addCriterion("pa_filename <=", value, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_filenameLike(String value) {
            addCriterion("pa_filename like", value, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_filenameNotLike(String value) {
            addCriterion("pa_filename not like", value, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_filenameIn(List<String> values) {
            addCriterion("pa_filename in", values, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_filenameNotIn(List<String> values) {
            addCriterion("pa_filename not in", values, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_filenameBetween(String value1, String value2) {
            addCriterion("pa_filename between", value1, value2, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_filenameNotBetween(String value1, String value2) {
            addCriterion("pa_filename not between", value1, value2, "pa_filename");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyIsNull() {
            addCriterion("pa_attachqty is null");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyIsNotNull() {
            addCriterion("pa_attachqty is not null");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyEqualTo(Integer value) {
            addCriterion("pa_attachqty =", value, "pa_attachqty");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyNotEqualTo(Integer value) {
            addCriterion("pa_attachqty <>", value, "pa_attachqty");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyGreaterThan(Integer value) {
            addCriterion("pa_attachqty >", value, "pa_attachqty");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_attachqty >=", value, "pa_attachqty");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyLessThan(Integer value) {
            addCriterion("pa_attachqty <", value, "pa_attachqty");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyLessThanOrEqualTo(Integer value) {
            addCriterion("pa_attachqty <=", value, "pa_attachqty");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyIn(List<Integer> values) {
            addCriterion("pa_attachqty in", values, "pa_attachqty");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyNotIn(List<Integer> values) {
            addCriterion("pa_attachqty not in", values, "pa_attachqty");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyBetween(Integer value1, Integer value2) {
            addCriterion("pa_attachqty between", value1, value2, "pa_attachqty");
            return (Criteria) this;
        }

        public Criteria andPa_attachqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_attachqty not between", value1, value2, "pa_attachqty");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountIsNull() {
            addCriterion("pa_pagecount is null");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountIsNotNull() {
            addCriterion("pa_pagecount is not null");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountEqualTo(Integer value) {
            addCriterion("pa_pagecount =", value, "pa_pagecount");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountNotEqualTo(Integer value) {
            addCriterion("pa_pagecount <>", value, "pa_pagecount");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountGreaterThan(Integer value) {
            addCriterion("pa_pagecount >", value, "pa_pagecount");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_pagecount >=", value, "pa_pagecount");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountLessThan(Integer value) {
            addCriterion("pa_pagecount <", value, "pa_pagecount");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountLessThanOrEqualTo(Integer value) {
            addCriterion("pa_pagecount <=", value, "pa_pagecount");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountIn(List<Integer> values) {
            addCriterion("pa_pagecount in", values, "pa_pagecount");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountNotIn(List<Integer> values) {
            addCriterion("pa_pagecount not in", values, "pa_pagecount");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountBetween(Integer value1, Integer value2) {
            addCriterion("pa_pagecount between", value1, value2, "pa_pagecount");
            return (Criteria) this;
        }

        public Criteria andPa_pagecountNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_pagecount not between", value1, value2, "pa_pagecount");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidIsNull() {
            addCriterion("pa_sharepid is null");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidIsNotNull() {
            addCriterion("pa_sharepid is not null");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidEqualTo(Long value) {
            addCriterion("pa_sharepid =", value, "pa_sharepid");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidNotEqualTo(Long value) {
            addCriterion("pa_sharepid <>", value, "pa_sharepid");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidGreaterThan(Long value) {
            addCriterion("pa_sharepid >", value, "pa_sharepid");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidGreaterThanOrEqualTo(Long value) {
            addCriterion("pa_sharepid >=", value, "pa_sharepid");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidLessThan(Long value) {
            addCriterion("pa_sharepid <", value, "pa_sharepid");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidLessThanOrEqualTo(Long value) {
            addCriterion("pa_sharepid <=", value, "pa_sharepid");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidIn(List<Long> values) {
            addCriterion("pa_sharepid in", values, "pa_sharepid");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidNotIn(List<Long> values) {
            addCriterion("pa_sharepid not in", values, "pa_sharepid");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidBetween(Long value1, Long value2) {
            addCriterion("pa_sharepid between", value1, value2, "pa_sharepid");
            return (Criteria) this;
        }

        public Criteria andPa_sharepidNotBetween(Long value1, Long value2) {
            addCriterion("pa_sharepid not between", value1, value2, "pa_sharepid");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareIsNull() {
            addCriterion("pa_flagshare is null");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareIsNotNull() {
            addCriterion("pa_flagshare is not null");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareEqualTo(Boolean value) {
            addCriterion("pa_flagshare =", value, "pa_flagshare");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareNotEqualTo(Boolean value) {
            addCriterion("pa_flagshare <>", value, "pa_flagshare");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareGreaterThan(Boolean value) {
            addCriterion("pa_flagshare >", value, "pa_flagshare");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pa_flagshare >=", value, "pa_flagshare");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareLessThan(Boolean value) {
            addCriterion("pa_flagshare <", value, "pa_flagshare");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareLessThanOrEqualTo(Boolean value) {
            addCriterion("pa_flagshare <=", value, "pa_flagshare");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareIn(List<Boolean> values) {
            addCriterion("pa_flagshare in", values, "pa_flagshare");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareNotIn(List<Boolean> values) {
            addCriterion("pa_flagshare not in", values, "pa_flagshare");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareBetween(Boolean value1, Boolean value2) {
            addCriterion("pa_flagshare between", value1, value2, "pa_flagshare");
            return (Criteria) this;
        }

        public Criteria andPa_flagshareNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pa_flagshare not between", value1, value2, "pa_flagshare");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopIsNull() {
            addCriterion("pa_flagstop is null");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopIsNotNull() {
            addCriterion("pa_flagstop is not null");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopEqualTo(Boolean value) {
            addCriterion("pa_flagstop =", value, "pa_flagstop");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopNotEqualTo(Boolean value) {
            addCriterion("pa_flagstop <>", value, "pa_flagstop");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopGreaterThan(Boolean value) {
            addCriterion("pa_flagstop >", value, "pa_flagstop");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pa_flagstop >=", value, "pa_flagstop");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopLessThan(Boolean value) {
            addCriterion("pa_flagstop <", value, "pa_flagstop");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopLessThanOrEqualTo(Boolean value) {
            addCriterion("pa_flagstop <=", value, "pa_flagstop");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopIn(List<Boolean> values) {
            addCriterion("pa_flagstop in", values, "pa_flagstop");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopNotIn(List<Boolean> values) {
            addCriterion("pa_flagstop not in", values, "pa_flagstop");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopBetween(Boolean value1, Boolean value2) {
            addCriterion("pa_flagstop between", value1, value2, "pa_flagstop");
            return (Criteria) this;
        }

        public Criteria andPa_flagstopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pa_flagstop not between", value1, value2, "pa_flagstop");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectIsNull() {
            addCriterion("pa_flagselect is null");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectIsNotNull() {
            addCriterion("pa_flagselect is not null");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectEqualTo(Boolean value) {
            addCriterion("pa_flagselect =", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectNotEqualTo(Boolean value) {
            addCriterion("pa_flagselect <>", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectGreaterThan(Boolean value) {
            addCriterion("pa_flagselect >", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pa_flagselect >=", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectLessThan(Boolean value) {
            addCriterion("pa_flagselect <", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectLessThanOrEqualTo(Boolean value) {
            addCriterion("pa_flagselect <=", value, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectIn(List<Boolean> values) {
            addCriterion("pa_flagselect in", values, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectNotIn(List<Boolean> values) {
            addCriterion("pa_flagselect not in", values, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectBetween(Boolean value1, Boolean value2) {
            addCriterion("pa_flagselect between", value1, value2, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagselectNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pa_flagselect not between", value1, value2, "pa_flagselect");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsIsNull() {
            addCriterion("pa_flagnews is null");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsIsNotNull() {
            addCriterion("pa_flagnews is not null");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsEqualTo(Boolean value) {
            addCriterion("pa_flagnews =", value, "pa_flagnews");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsNotEqualTo(Boolean value) {
            addCriterion("pa_flagnews <>", value, "pa_flagnews");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsGreaterThan(Boolean value) {
            addCriterion("pa_flagnews >", value, "pa_flagnews");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pa_flagnews >=", value, "pa_flagnews");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsLessThan(Boolean value) {
            addCriterion("pa_flagnews <", value, "pa_flagnews");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsLessThanOrEqualTo(Boolean value) {
            addCriterion("pa_flagnews <=", value, "pa_flagnews");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsIn(List<Boolean> values) {
            addCriterion("pa_flagnews in", values, "pa_flagnews");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsNotIn(List<Boolean> values) {
            addCriterion("pa_flagnews not in", values, "pa_flagnews");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsBetween(Boolean value1, Boolean value2) {
            addCriterion("pa_flagnews between", value1, value2, "pa_flagnews");
            return (Criteria) this;
        }

        public Criteria andPa_flagnewsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pa_flagnews not between", value1, value2, "pa_flagnews");
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

        public Criteria andPa_createidIsNull() {
            addCriterion("pa_createid is null");
            return (Criteria) this;
        }

        public Criteria andPa_createidIsNotNull() {
            addCriterion("pa_createid is not null");
            return (Criteria) this;
        }

        public Criteria andPa_createidEqualTo(Long value) {
            addCriterion("pa_createid =", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidNotEqualTo(Long value) {
            addCriterion("pa_createid <>", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidGreaterThan(Long value) {
            addCriterion("pa_createid >", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("pa_createid >=", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidLessThan(Long value) {
            addCriterion("pa_createid <", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidLessThanOrEqualTo(Long value) {
            addCriterion("pa_createid <=", value, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidIn(List<Long> values) {
            addCriterion("pa_createid in", values, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidNotIn(List<Long> values) {
            addCriterion("pa_createid not in", values, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidBetween(Long value1, Long value2) {
            addCriterion("pa_createid between", value1, value2, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createidNotBetween(Long value1, Long value2) {
            addCriterion("pa_createid not between", value1, value2, "pa_createid");
            return (Criteria) this;
        }

        public Criteria andPa_createnoIsNull() {
            addCriterion("pa_createno is null");
            return (Criteria) this;
        }

        public Criteria andPa_createnoIsNotNull() {
            addCriterion("pa_createno is not null");
            return (Criteria) this;
        }

        public Criteria andPa_createnoEqualTo(String value) {
            addCriterion("pa_createno =", value, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createnoNotEqualTo(String value) {
            addCriterion("pa_createno <>", value, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createnoGreaterThan(String value) {
            addCriterion("pa_createno >", value, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("pa_createno >=", value, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createnoLessThan(String value) {
            addCriterion("pa_createno <", value, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createnoLessThanOrEqualTo(String value) {
            addCriterion("pa_createno <=", value, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createnoLike(String value) {
            addCriterion("pa_createno like", value, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createnoNotLike(String value) {
            addCriterion("pa_createno not like", value, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createnoIn(List<String> values) {
            addCriterion("pa_createno in", values, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createnoNotIn(List<String> values) {
            addCriterion("pa_createno not in", values, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createnoBetween(String value1, String value2) {
            addCriterion("pa_createno between", value1, value2, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createnoNotBetween(String value1, String value2) {
            addCriterion("pa_createno not between", value1, value2, "pa_createno");
            return (Criteria) this;
        }

        public Criteria andPa_createdateIsNull() {
            addCriterion("pa_createdate is null");
            return (Criteria) this;
        }

        public Criteria andPa_createdateIsNotNull() {
            addCriterion("pa_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andPa_createdateEqualTo(Date value) {
            addCriterion("pa_createdate =", value, "pa_createdate");
            return (Criteria) this;
        }

        public Criteria andPa_createdateNotEqualTo(Date value) {
            addCriterion("pa_createdate <>", value, "pa_createdate");
            return (Criteria) this;
        }

        public Criteria andPa_createdateGreaterThan(Date value) {
            addCriterion("pa_createdate >", value, "pa_createdate");
            return (Criteria) this;
        }

        public Criteria andPa_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("pa_createdate >=", value, "pa_createdate");
            return (Criteria) this;
        }

        public Criteria andPa_createdateLessThan(Date value) {
            addCriterion("pa_createdate <", value, "pa_createdate");
            return (Criteria) this;
        }

        public Criteria andPa_createdateLessThanOrEqualTo(Date value) {
            addCriterion("pa_createdate <=", value, "pa_createdate");
            return (Criteria) this;
        }

        public Criteria andPa_createdateIn(List<Date> values) {
            addCriterion("pa_createdate in", values, "pa_createdate");
            return (Criteria) this;
        }

        public Criteria andPa_createdateNotIn(List<Date> values) {
            addCriterion("pa_createdate not in", values, "pa_createdate");
            return (Criteria) this;
        }

        public Criteria andPa_createdateBetween(Date value1, Date value2) {
            addCriterion("pa_createdate between", value1, value2, "pa_createdate");
            return (Criteria) this;
        }

        public Criteria andPa_createdateNotBetween(Date value1, Date value2) {
            addCriterion("pa_createdate not between", value1, value2, "pa_createdate");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidIsNull() {
            addCriterion("pa_confirmid is null");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidIsNotNull() {
            addCriterion("pa_confirmid is not null");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidEqualTo(Long value) {
            addCriterion("pa_confirmid =", value, "pa_confirmid");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidNotEqualTo(Long value) {
            addCriterion("pa_confirmid <>", value, "pa_confirmid");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidGreaterThan(Long value) {
            addCriterion("pa_confirmid >", value, "pa_confirmid");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidGreaterThanOrEqualTo(Long value) {
            addCriterion("pa_confirmid >=", value, "pa_confirmid");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidLessThan(Long value) {
            addCriterion("pa_confirmid <", value, "pa_confirmid");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidLessThanOrEqualTo(Long value) {
            addCriterion("pa_confirmid <=", value, "pa_confirmid");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidIn(List<Long> values) {
            addCriterion("pa_confirmid in", values, "pa_confirmid");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidNotIn(List<Long> values) {
            addCriterion("pa_confirmid not in", values, "pa_confirmid");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidBetween(Long value1, Long value2) {
            addCriterion("pa_confirmid between", value1, value2, "pa_confirmid");
            return (Criteria) this;
        }

        public Criteria andPa_confirmidNotBetween(Long value1, Long value2) {
            addCriterion("pa_confirmid not between", value1, value2, "pa_confirmid");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoIsNull() {
            addCriterion("pa_confirmno is null");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoIsNotNull() {
            addCriterion("pa_confirmno is not null");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoEqualTo(String value) {
            addCriterion("pa_confirmno =", value, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoNotEqualTo(String value) {
            addCriterion("pa_confirmno <>", value, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoGreaterThan(String value) {
            addCriterion("pa_confirmno >", value, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("pa_confirmno >=", value, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoLessThan(String value) {
            addCriterion("pa_confirmno <", value, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoLessThanOrEqualTo(String value) {
            addCriterion("pa_confirmno <=", value, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoLike(String value) {
            addCriterion("pa_confirmno like", value, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoNotLike(String value) {
            addCriterion("pa_confirmno not like", value, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoIn(List<String> values) {
            addCriterion("pa_confirmno in", values, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoNotIn(List<String> values) {
            addCriterion("pa_confirmno not in", values, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoBetween(String value1, String value2) {
            addCriterion("pa_confirmno between", value1, value2, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmnoNotBetween(String value1, String value2) {
            addCriterion("pa_confirmno not between", value1, value2, "pa_confirmno");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateIsNull() {
            addCriterion("pa_confirmdate is null");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateIsNotNull() {
            addCriterion("pa_confirmdate is not null");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateEqualTo(Date value) {
            addCriterion("pa_confirmdate =", value, "pa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateNotEqualTo(Date value) {
            addCriterion("pa_confirmdate <>", value, "pa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateGreaterThan(Date value) {
            addCriterion("pa_confirmdate >", value, "pa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("pa_confirmdate >=", value, "pa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateLessThan(Date value) {
            addCriterion("pa_confirmdate <", value, "pa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateLessThanOrEqualTo(Date value) {
            addCriterion("pa_confirmdate <=", value, "pa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateIn(List<Date> values) {
            addCriterion("pa_confirmdate in", values, "pa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateNotIn(List<Date> values) {
            addCriterion("pa_confirmdate not in", values, "pa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateBetween(Date value1, Date value2) {
            addCriterion("pa_confirmdate between", value1, value2, "pa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andPa_confirmdateNotBetween(Date value1, Date value2) {
            addCriterion("pa_confirmdate not between", value1, value2, "pa_confirmdate");
            return (Criteria) this;
        }

        public Criteria andPa_statusIsNull() {
            addCriterion("pa_status is null");
            return (Criteria) this;
        }

        public Criteria andPa_statusIsNotNull() {
            addCriterion("pa_status is not null");
            return (Criteria) this;
        }

        public Criteria andPa_statusEqualTo(Byte value) {
            addCriterion("pa_status =", value, "pa_status");
            return (Criteria) this;
        }

        public Criteria andPa_statusNotEqualTo(Byte value) {
            addCriterion("pa_status <>", value, "pa_status");
            return (Criteria) this;
        }

        public Criteria andPa_statusGreaterThan(Byte value) {
            addCriterion("pa_status >", value, "pa_status");
            return (Criteria) this;
        }

        public Criteria andPa_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pa_status >=", value, "pa_status");
            return (Criteria) this;
        }

        public Criteria andPa_statusLessThan(Byte value) {
            addCriterion("pa_status <", value, "pa_status");
            return (Criteria) this;
        }

        public Criteria andPa_statusLessThanOrEqualTo(Byte value) {
            addCriterion("pa_status <=", value, "pa_status");
            return (Criteria) this;
        }

        public Criteria andPa_statusIn(List<Byte> values) {
            addCriterion("pa_status in", values, "pa_status");
            return (Criteria) this;
        }

        public Criteria andPa_statusNotIn(List<Byte> values) {
            addCriterion("pa_status not in", values, "pa_status");
            return (Criteria) this;
        }

        public Criteria andPa_statusBetween(Byte value1, Byte value2) {
            addCriterion("pa_status between", value1, value2, "pa_status");
            return (Criteria) this;
        }

        public Criteria andPa_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("pa_status not between", value1, value2, "pa_status");
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