package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesigV_Search_SalesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesigV_Search_SalesExample() {
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

        public Criteria andUr_idIsNull() {
            addCriterion("ur_id is null");
            return (Criteria) this;
        }

        public Criteria andUr_idIsNotNull() {
            addCriterion("ur_id is not null");
            return (Criteria) this;
        }

        public Criteria andUr_idEqualTo(Long value) {
            addCriterion("ur_id =", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idNotEqualTo(Long value) {
            addCriterion("ur_id <>", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idGreaterThan(Long value) {
            addCriterion("ur_id >", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ur_id >=", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idLessThan(Long value) {
            addCriterion("ur_id <", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idLessThanOrEqualTo(Long value) {
            addCriterion("ur_id <=", value, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idIn(List<Long> values) {
            addCriterion("ur_id in", values, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idNotIn(List<Long> values) {
            addCriterion("ur_id not in", values, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idBetween(Long value1, Long value2) {
            addCriterion("ur_id between", value1, value2, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_idNotBetween(Long value1, Long value2) {
            addCriterion("ur_id not between", value1, value2, "ur_id");
            return (Criteria) this;
        }

        public Criteria andUr_phoneIsNull() {
            addCriterion("ur_phone is null");
            return (Criteria) this;
        }

        public Criteria andUr_phoneIsNotNull() {
            addCriterion("ur_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUr_phoneEqualTo(String value) {
            addCriterion("ur_phone =", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneNotEqualTo(String value) {
            addCriterion("ur_phone <>", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneGreaterThan(String value) {
            addCriterion("ur_phone >", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("ur_phone >=", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneLessThan(String value) {
            addCriterion("ur_phone <", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneLessThanOrEqualTo(String value) {
            addCriterion("ur_phone <=", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneLike(String value) {
            addCriterion("ur_phone like", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneNotLike(String value) {
            addCriterion("ur_phone not like", value, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneIn(List<String> values) {
            addCriterion("ur_phone in", values, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneNotIn(List<String> values) {
            addCriterion("ur_phone not in", values, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneBetween(String value1, String value2) {
            addCriterion("ur_phone between", value1, value2, "ur_phone");
            return (Criteria) this;
        }

        public Criteria andUr_phoneNotBetween(String value1, String value2) {
            addCriterion("ur_phone not between", value1, value2, "ur_phone");
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

        public Criteria andUr_msgflag2IsNull() {
            addCriterion("ur_msgflag2 is null");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2IsNotNull() {
            addCriterion("ur_msgflag2 is not null");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2EqualTo(Boolean value) {
            addCriterion("ur_msgflag2 =", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2NotEqualTo(Boolean value) {
            addCriterion("ur_msgflag2 <>", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2GreaterThan(Boolean value) {
            addCriterion("ur_msgflag2 >", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("ur_msgflag2 >=", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2LessThan(Boolean value) {
            addCriterion("ur_msgflag2 <", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2LessThanOrEqualTo(Boolean value) {
            addCriterion("ur_msgflag2 <=", value, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2In(List<Boolean> values) {
            addCriterion("ur_msgflag2 in", values, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2NotIn(List<Boolean> values) {
            addCriterion("ur_msgflag2 not in", values, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2Between(Boolean value1, Boolean value2) {
            addCriterion("ur_msgflag2 between", value1, value2, "ur_msgflag2");
            return (Criteria) this;
        }

        public Criteria andUr_msgflag2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("ur_msgflag2 not between", value1, value2, "ur_msgflag2");
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

        public Criteria andUe_companynameIsNull() {
            addCriterion("ue_companyname is null");
            return (Criteria) this;
        }

        public Criteria andUe_companynameIsNotNull() {
            addCriterion("ue_companyname is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companynameEqualTo(String value) {
            addCriterion("ue_companyname =", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotEqualTo(String value) {
            addCriterion("ue_companyname <>", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameGreaterThan(String value) {
            addCriterion("ue_companyname >", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companyname >=", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameLessThan(String value) {
            addCriterion("ue_companyname <", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameLessThanOrEqualTo(String value) {
            addCriterion("ue_companyname <=", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameLike(String value) {
            addCriterion("ue_companyname like", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotLike(String value) {
            addCriterion("ue_companyname not like", value, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameIn(List<String> values) {
            addCriterion("ue_companyname in", values, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotIn(List<String> values) {
            addCriterion("ue_companyname not in", values, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameBetween(String value1, String value2) {
            addCriterion("ue_companyname between", value1, value2, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companynameNotBetween(String value1, String value2) {
            addCriterion("ue_companyname not between", value1, value2, "ue_companyname");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitIsNull() {
            addCriterion("ue_companyunit is null");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitIsNotNull() {
            addCriterion("ue_companyunit is not null");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitEqualTo(String value) {
            addCriterion("ue_companyunit =", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotEqualTo(String value) {
            addCriterion("ue_companyunit <>", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitGreaterThan(String value) {
            addCriterion("ue_companyunit >", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitGreaterThanOrEqualTo(String value) {
            addCriterion("ue_companyunit >=", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitLessThan(String value) {
            addCriterion("ue_companyunit <", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitLessThanOrEqualTo(String value) {
            addCriterion("ue_companyunit <=", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitLike(String value) {
            addCriterion("ue_companyunit like", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotLike(String value) {
            addCriterion("ue_companyunit not like", value, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitIn(List<String> values) {
            addCriterion("ue_companyunit in", values, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotIn(List<String> values) {
            addCriterion("ue_companyunit not in", values, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitBetween(String value1, String value2) {
            addCriterion("ue_companyunit between", value1, value2, "ue_companyunit");
            return (Criteria) this;
        }

        public Criteria andUe_companyunitNotBetween(String value1, String value2) {
            addCriterion("ue_companyunit not between", value1, value2, "ue_companyunit");
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

        public Criteria andUm_evaluaterateEqualTo(BigDecimal value) {
            addCriterion("um_evaluaterate =", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateNotEqualTo(BigDecimal value) {
            addCriterion("um_evaluaterate <>", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateGreaterThan(BigDecimal value) {
            addCriterion("um_evaluaterate >", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("um_evaluaterate >=", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateLessThan(BigDecimal value) {
            addCriterion("um_evaluaterate <", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("um_evaluaterate <=", value, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateIn(List<BigDecimal> values) {
            addCriterion("um_evaluaterate in", values, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateNotIn(List<BigDecimal> values) {
            addCriterion("um_evaluaterate not in", values, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("um_evaluaterate between", value1, value2, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUm_evaluaterateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("um_evaluaterate not between", value1, value2, "um_evaluaterate");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateIsNull() {
            addCriterion("ur_register_date is null");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateIsNotNull() {
            addCriterion("ur_register_date is not null");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateEqualTo(Date value) {
            addCriterion("ur_register_date =", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateNotEqualTo(Date value) {
            addCriterion("ur_register_date <>", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateGreaterThan(Date value) {
            addCriterion("ur_register_date >", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("ur_register_date >=", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateLessThan(Date value) {
            addCriterion("ur_register_date <", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateLessThanOrEqualTo(Date value) {
            addCriterion("ur_register_date <=", value, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateIn(List<Date> values) {
            addCriterion("ur_register_date in", values, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateNotIn(List<Date> values) {
            addCriterion("ur_register_date not in", values, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateBetween(Date value1, Date value2) {
            addCriterion("ur_register_date between", value1, value2, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_register_dateNotBetween(Date value1, Date value2) {
            addCriterion("ur_register_date not between", value1, value2, "ur_register_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateIsNull() {
            addCriterion("ur_login_date is null");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateIsNotNull() {
            addCriterion("ur_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateEqualTo(Date value) {
            addCriterion("ur_login_date =", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateNotEqualTo(Date value) {
            addCriterion("ur_login_date <>", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateGreaterThan(Date value) {
            addCriterion("ur_login_date >", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("ur_login_date >=", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateLessThan(Date value) {
            addCriterion("ur_login_date <", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateLessThanOrEqualTo(Date value) {
            addCriterion("ur_login_date <=", value, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateIn(List<Date> values) {
            addCriterion("ur_login_date in", values, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateNotIn(List<Date> values) {
            addCriterion("ur_login_date not in", values, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateBetween(Date value1, Date value2) {
            addCriterion("ur_login_date between", value1, value2, "ur_login_date");
            return (Criteria) this;
        }

        public Criteria andUr_login_dateNotBetween(Date value1, Date value2) {
            addCriterion("ur_login_date not between", value1, value2, "ur_login_date");
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