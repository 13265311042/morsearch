package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesigV_Collect_PsnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesigV_Collect_PsnExample() {
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

        public Criteria andDs_idIsNull() {
            addCriterion("ds_id is null");
            return (Criteria) this;
        }

        public Criteria andDs_idIsNotNull() {
            addCriterion("ds_id is not null");
            return (Criteria) this;
        }

        public Criteria andDs_idEqualTo(Long value) {
            addCriterion("ds_id =", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idNotEqualTo(Long value) {
            addCriterion("ds_id <>", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idGreaterThan(Long value) {
            addCriterion("ds_id >", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ds_id >=", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idLessThan(Long value) {
            addCriterion("ds_id <", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idLessThanOrEqualTo(Long value) {
            addCriterion("ds_id <=", value, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idIn(List<Long> values) {
            addCriterion("ds_id in", values, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idNotIn(List<Long> values) {
            addCriterion("ds_id not in", values, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idBetween(Long value1, Long value2) {
            addCriterion("ds_id between", value1, value2, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_idNotBetween(Long value1, Long value2) {
            addCriterion("ds_id not between", value1, value2, "ds_id");
            return (Criteria) this;
        }

        public Criteria andDs_saleridIsNull() {
            addCriterion("ds_salerid is null");
            return (Criteria) this;
        }

        public Criteria andDs_saleridIsNotNull() {
            addCriterion("ds_salerid is not null");
            return (Criteria) this;
        }

        public Criteria andDs_saleridEqualTo(Long value) {
            addCriterion("ds_salerid =", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridNotEqualTo(Long value) {
            addCriterion("ds_salerid <>", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridGreaterThan(Long value) {
            addCriterion("ds_salerid >", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridGreaterThanOrEqualTo(Long value) {
            addCriterion("ds_salerid >=", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridLessThan(Long value) {
            addCriterion("ds_salerid <", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridLessThanOrEqualTo(Long value) {
            addCriterion("ds_salerid <=", value, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridIn(List<Long> values) {
            addCriterion("ds_salerid in", values, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridNotIn(List<Long> values) {
            addCriterion("ds_salerid not in", values, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridBetween(Long value1, Long value2) {
            addCriterion("ds_salerid between", value1, value2, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_saleridNotBetween(Long value1, Long value2) {
            addCriterion("ds_salerid not between", value1, value2, "ds_salerid");
            return (Criteria) this;
        }

        public Criteria andDs_createidIsNull() {
            addCriterion("ds_createid is null");
            return (Criteria) this;
        }

        public Criteria andDs_createidIsNotNull() {
            addCriterion("ds_createid is not null");
            return (Criteria) this;
        }

        public Criteria andDs_createidEqualTo(Long value) {
            addCriterion("ds_createid =", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidNotEqualTo(Long value) {
            addCriterion("ds_createid <>", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidGreaterThan(Long value) {
            addCriterion("ds_createid >", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("ds_createid >=", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidLessThan(Long value) {
            addCriterion("ds_createid <", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidLessThanOrEqualTo(Long value) {
            addCriterion("ds_createid <=", value, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidIn(List<Long> values) {
            addCriterion("ds_createid in", values, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidNotIn(List<Long> values) {
            addCriterion("ds_createid not in", values, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidBetween(Long value1, Long value2) {
            addCriterion("ds_createid between", value1, value2, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createidNotBetween(Long value1, Long value2) {
            addCriterion("ds_createid not between", value1, value2, "ds_createid");
            return (Criteria) this;
        }

        public Criteria andDs_createnoIsNull() {
            addCriterion("ds_createno is null");
            return (Criteria) this;
        }

        public Criteria andDs_createnoIsNotNull() {
            addCriterion("ds_createno is not null");
            return (Criteria) this;
        }

        public Criteria andDs_createnoEqualTo(String value) {
            addCriterion("ds_createno =", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoNotEqualTo(String value) {
            addCriterion("ds_createno <>", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoGreaterThan(String value) {
            addCriterion("ds_createno >", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("ds_createno >=", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoLessThan(String value) {
            addCriterion("ds_createno <", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoLessThanOrEqualTo(String value) {
            addCriterion("ds_createno <=", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoLike(String value) {
            addCriterion("ds_createno like", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoNotLike(String value) {
            addCriterion("ds_createno not like", value, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoIn(List<String> values) {
            addCriterion("ds_createno in", values, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoNotIn(List<String> values) {
            addCriterion("ds_createno not in", values, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoBetween(String value1, String value2) {
            addCriterion("ds_createno between", value1, value2, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createnoNotBetween(String value1, String value2) {
            addCriterion("ds_createno not between", value1, value2, "ds_createno");
            return (Criteria) this;
        }

        public Criteria andDs_createdateIsNull() {
            addCriterion("ds_createdate is null");
            return (Criteria) this;
        }

        public Criteria andDs_createdateIsNotNull() {
            addCriterion("ds_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andDs_createdateEqualTo(Date value) {
            addCriterion("ds_createdate =", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateNotEqualTo(Date value) {
            addCriterion("ds_createdate <>", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateGreaterThan(Date value) {
            addCriterion("ds_createdate >", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ds_createdate >=", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateLessThan(Date value) {
            addCriterion("ds_createdate <", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateLessThanOrEqualTo(Date value) {
            addCriterion("ds_createdate <=", value, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateIn(List<Date> values) {
            addCriterion("ds_createdate in", values, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateNotIn(List<Date> values) {
            addCriterion("ds_createdate not in", values, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateBetween(Date value1, Date value2) {
            addCriterion("ds_createdate between", value1, value2, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDs_createdateNotBetween(Date value1, Date value2) {
            addCriterion("ds_createdate not between", value1, value2, "ds_createdate");
            return (Criteria) this;
        }

        public Criteria andDateshortIsNull() {
            addCriterion("dateshort is null");
            return (Criteria) this;
        }

        public Criteria andDateshortIsNotNull() {
            addCriterion("dateshort is not null");
            return (Criteria) this;
        }

        public Criteria andDateshortEqualTo(Date value) {
            addCriterion("dateshort =", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotEqualTo(Date value) {
            addCriterion("dateshort <>", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortGreaterThan(Date value) {
            addCriterion("dateshort >", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortGreaterThanOrEqualTo(Date value) {
            addCriterion("dateshort >=", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLessThan(Date value) {
            addCriterion("dateshort <", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLessThanOrEqualTo(Date value) {
            addCriterion("dateshort <=", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortIn(List<Date> values) {
            addCriterion("dateshort in", values, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotIn(List<Date> values) {
            addCriterion("dateshort not in", values, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortBetween(Date value1, Date value2) {
            addCriterion("dateshort between", value1, value2, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotBetween(Date value1, Date value2) {
            addCriterion("dateshort not between", value1, value2, "dateshort");
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