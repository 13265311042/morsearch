package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesV_InterestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesV_InterestExample() {
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

        public Criteria andSi_idIsNull() {
            addCriterion("si_id is null");
            return (Criteria) this;
        }

        public Criteria andSi_idIsNotNull() {
            addCriterion("si_id is not null");
            return (Criteria) this;
        }

        public Criteria andSi_idEqualTo(Long value) {
            addCriterion("si_id =", value, "si_id");
            return (Criteria) this;
        }

        public Criteria andSi_idNotEqualTo(Long value) {
            addCriterion("si_id <>", value, "si_id");
            return (Criteria) this;
        }

        public Criteria andSi_idGreaterThan(Long value) {
            addCriterion("si_id >", value, "si_id");
            return (Criteria) this;
        }

        public Criteria andSi_idGreaterThanOrEqualTo(Long value) {
            addCriterion("si_id >=", value, "si_id");
            return (Criteria) this;
        }

        public Criteria andSi_idLessThan(Long value) {
            addCriterion("si_id <", value, "si_id");
            return (Criteria) this;
        }

        public Criteria andSi_idLessThanOrEqualTo(Long value) {
            addCriterion("si_id <=", value, "si_id");
            return (Criteria) this;
        }

        public Criteria andSi_idIn(List<Long> values) {
            addCriterion("si_id in", values, "si_id");
            return (Criteria) this;
        }

        public Criteria andSi_idNotIn(List<Long> values) {
            addCriterion("si_id not in", values, "si_id");
            return (Criteria) this;
        }

        public Criteria andSi_idBetween(Long value1, Long value2) {
            addCriterion("si_id between", value1, value2, "si_id");
            return (Criteria) this;
        }

        public Criteria andSi_idNotBetween(Long value1, Long value2) {
            addCriterion("si_id not between", value1, value2, "si_id");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidIsNull() {
            addCriterion("si_salesmanid is null");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidIsNotNull() {
            addCriterion("si_salesmanid is not null");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidEqualTo(Long value) {
            addCriterion("si_salesmanid =", value, "si_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidNotEqualTo(Long value) {
            addCriterion("si_salesmanid <>", value, "si_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidGreaterThan(Long value) {
            addCriterion("si_salesmanid >", value, "si_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidGreaterThanOrEqualTo(Long value) {
            addCriterion("si_salesmanid >=", value, "si_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidLessThan(Long value) {
            addCriterion("si_salesmanid <", value, "si_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidLessThanOrEqualTo(Long value) {
            addCriterion("si_salesmanid <=", value, "si_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidIn(List<Long> values) {
            addCriterion("si_salesmanid in", values, "si_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidNotIn(List<Long> values) {
            addCriterion("si_salesmanid not in", values, "si_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidBetween(Long value1, Long value2) {
            addCriterion("si_salesmanid between", value1, value2, "si_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSi_salesmanidNotBetween(Long value1, Long value2) {
            addCriterion("si_salesmanid not between", value1, value2, "si_salesmanid");
            return (Criteria) this;
        }

        public Criteria andSi_pmidIsNull() {
            addCriterion("si_pmid is null");
            return (Criteria) this;
        }

        public Criteria andSi_pmidIsNotNull() {
            addCriterion("si_pmid is not null");
            return (Criteria) this;
        }

        public Criteria andSi_pmidEqualTo(Long value) {
            addCriterion("si_pmid =", value, "si_pmid");
            return (Criteria) this;
        }

        public Criteria andSi_pmidNotEqualTo(Long value) {
            addCriterion("si_pmid <>", value, "si_pmid");
            return (Criteria) this;
        }

        public Criteria andSi_pmidGreaterThan(Long value) {
            addCriterion("si_pmid >", value, "si_pmid");
            return (Criteria) this;
        }

        public Criteria andSi_pmidGreaterThanOrEqualTo(Long value) {
            addCriterion("si_pmid >=", value, "si_pmid");
            return (Criteria) this;
        }

        public Criteria andSi_pmidLessThan(Long value) {
            addCriterion("si_pmid <", value, "si_pmid");
            return (Criteria) this;
        }

        public Criteria andSi_pmidLessThanOrEqualTo(Long value) {
            addCriterion("si_pmid <=", value, "si_pmid");
            return (Criteria) this;
        }

        public Criteria andSi_pmidIn(List<Long> values) {
            addCriterion("si_pmid in", values, "si_pmid");
            return (Criteria) this;
        }

        public Criteria andSi_pmidNotIn(List<Long> values) {
            addCriterion("si_pmid not in", values, "si_pmid");
            return (Criteria) this;
        }

        public Criteria andSi_pmidBetween(Long value1, Long value2) {
            addCriterion("si_pmid between", value1, value2, "si_pmid");
            return (Criteria) this;
        }

        public Criteria andSi_pmidNotBetween(Long value1, Long value2) {
            addCriterion("si_pmid not between", value1, value2, "si_pmid");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleIsNull() {
            addCriterion("si_pmtitle is null");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleIsNotNull() {
            addCriterion("si_pmtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleEqualTo(String value) {
            addCriterion("si_pmtitle =", value, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleNotEqualTo(String value) {
            addCriterion("si_pmtitle <>", value, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleGreaterThan(String value) {
            addCriterion("si_pmtitle >", value, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleGreaterThanOrEqualTo(String value) {
            addCriterion("si_pmtitle >=", value, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleLessThan(String value) {
            addCriterion("si_pmtitle <", value, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleLessThanOrEqualTo(String value) {
            addCriterion("si_pmtitle <=", value, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleLike(String value) {
            addCriterion("si_pmtitle like", value, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleNotLike(String value) {
            addCriterion("si_pmtitle not like", value, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleIn(List<String> values) {
            addCriterion("si_pmtitle in", values, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleNotIn(List<String> values) {
            addCriterion("si_pmtitle not in", values, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleBetween(String value1, String value2) {
            addCriterion("si_pmtitle between", value1, value2, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_pmtitleNotBetween(String value1, String value2) {
            addCriterion("si_pmtitle not between", value1, value2, "si_pmtitle");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridIsNull() {
            addCriterion("si_desginerid is null");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridIsNotNull() {
            addCriterion("si_desginerid is not null");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridEqualTo(Long value) {
            addCriterion("si_desginerid =", value, "si_desginerid");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridNotEqualTo(Long value) {
            addCriterion("si_desginerid <>", value, "si_desginerid");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridGreaterThan(Long value) {
            addCriterion("si_desginerid >", value, "si_desginerid");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridGreaterThanOrEqualTo(Long value) {
            addCriterion("si_desginerid >=", value, "si_desginerid");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridLessThan(Long value) {
            addCriterion("si_desginerid <", value, "si_desginerid");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridLessThanOrEqualTo(Long value) {
            addCriterion("si_desginerid <=", value, "si_desginerid");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridIn(List<Long> values) {
            addCriterion("si_desginerid in", values, "si_desginerid");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridNotIn(List<Long> values) {
            addCriterion("si_desginerid not in", values, "si_desginerid");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridBetween(Long value1, Long value2) {
            addCriterion("si_desginerid between", value1, value2, "si_desginerid");
            return (Criteria) this;
        }

        public Criteria andSi_desgineridNotBetween(Long value1, Long value2) {
            addCriterion("si_desginerid not between", value1, value2, "si_desginerid");
            return (Criteria) this;
        }

        public Criteria andSi_createdateIsNull() {
            addCriterion("si_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSi_createdateIsNotNull() {
            addCriterion("si_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSi_createdateEqualTo(Date value) {
            addCriterion("si_createdate =", value, "si_createdate");
            return (Criteria) this;
        }

        public Criteria andSi_createdateNotEqualTo(Date value) {
            addCriterion("si_createdate <>", value, "si_createdate");
            return (Criteria) this;
        }

        public Criteria andSi_createdateGreaterThan(Date value) {
            addCriterion("si_createdate >", value, "si_createdate");
            return (Criteria) this;
        }

        public Criteria andSi_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("si_createdate >=", value, "si_createdate");
            return (Criteria) this;
        }

        public Criteria andSi_createdateLessThan(Date value) {
            addCriterion("si_createdate <", value, "si_createdate");
            return (Criteria) this;
        }

        public Criteria andSi_createdateLessThanOrEqualTo(Date value) {
            addCriterion("si_createdate <=", value, "si_createdate");
            return (Criteria) this;
        }

        public Criteria andSi_createdateIn(List<Date> values) {
            addCriterion("si_createdate in", values, "si_createdate");
            return (Criteria) this;
        }

        public Criteria andSi_createdateNotIn(List<Date> values) {
            addCriterion("si_createdate not in", values, "si_createdate");
            return (Criteria) this;
        }

        public Criteria andSi_createdateBetween(Date value1, Date value2) {
            addCriterion("si_createdate between", value1, value2, "si_createdate");
            return (Criteria) this;
        }

        public Criteria andSi_createdateNotBetween(Date value1, Date value2) {
            addCriterion("si_createdate not between", value1, value2, "si_createdate");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameIsNull() {
            addCriterion("desginer_name is null");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameIsNotNull() {
            addCriterion("desginer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameEqualTo(String value) {
            addCriterion("desginer_name =", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameNotEqualTo(String value) {
            addCriterion("desginer_name <>", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameGreaterThan(String value) {
            addCriterion("desginer_name >", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameGreaterThanOrEqualTo(String value) {
            addCriterion("desginer_name >=", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameLessThan(String value) {
            addCriterion("desginer_name <", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameLessThanOrEqualTo(String value) {
            addCriterion("desginer_name <=", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameLike(String value) {
            addCriterion("desginer_name like", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameNotLike(String value) {
            addCriterion("desginer_name not like", value, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameIn(List<String> values) {
            addCriterion("desginer_name in", values, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameNotIn(List<String> values) {
            addCriterion("desginer_name not in", values, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameBetween(String value1, String value2) {
            addCriterion("desginer_name between", value1, value2, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_nameNotBetween(String value1, String value2) {
            addCriterion("desginer_name not between", value1, value2, "desginer_name");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobIsNull() {
            addCriterion("desginer_job is null");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobIsNotNull() {
            addCriterion("desginer_job is not null");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobEqualTo(String value) {
            addCriterion("desginer_job =", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobNotEqualTo(String value) {
            addCriterion("desginer_job <>", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobGreaterThan(String value) {
            addCriterion("desginer_job >", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobGreaterThanOrEqualTo(String value) {
            addCriterion("desginer_job >=", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobLessThan(String value) {
            addCriterion("desginer_job <", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobLessThanOrEqualTo(String value) {
            addCriterion("desginer_job <=", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobLike(String value) {
            addCriterion("desginer_job like", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobNotLike(String value) {
            addCriterion("desginer_job not like", value, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobIn(List<String> values) {
            addCriterion("desginer_job in", values, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobNotIn(List<String> values) {
            addCriterion("desginer_job not in", values, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobBetween(String value1, String value2) {
            addCriterion("desginer_job between", value1, value2, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_jobNotBetween(String value1, String value2) {
            addCriterion("desginer_job not between", value1, value2, "desginer_job");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageIsNull() {
            addCriterion("desginer_message is null");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageIsNotNull() {
            addCriterion("desginer_message is not null");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageEqualTo(String value) {
            addCriterion("desginer_message =", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageNotEqualTo(String value) {
            addCriterion("desginer_message <>", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageGreaterThan(String value) {
            addCriterion("desginer_message >", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageGreaterThanOrEqualTo(String value) {
            addCriterion("desginer_message >=", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageLessThan(String value) {
            addCriterion("desginer_message <", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageLessThanOrEqualTo(String value) {
            addCriterion("desginer_message <=", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageLike(String value) {
            addCriterion("desginer_message like", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageNotLike(String value) {
            addCriterion("desginer_message not like", value, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageIn(List<String> values) {
            addCriterion("desginer_message in", values, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageNotIn(List<String> values) {
            addCriterion("desginer_message not in", values, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageBetween(String value1, String value2) {
            addCriterion("desginer_message between", value1, value2, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_messageNotBetween(String value1, String value2) {
            addCriterion("desginer_message not between", value1, value2, "desginer_message");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlIsNull() {
            addCriterion("desginer_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlIsNotNull() {
            addCriterion("desginer_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlEqualTo(String value) {
            addCriterion("desginer_imageurl =", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlNotEqualTo(String value) {
            addCriterion("desginer_imageurl <>", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlGreaterThan(String value) {
            addCriterion("desginer_imageurl >", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlGreaterThanOrEqualTo(String value) {
            addCriterion("desginer_imageurl >=", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlLessThan(String value) {
            addCriterion("desginer_imageurl <", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlLessThanOrEqualTo(String value) {
            addCriterion("desginer_imageurl <=", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlLike(String value) {
            addCriterion("desginer_imageurl like", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlNotLike(String value) {
            addCriterion("desginer_imageurl not like", value, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlIn(List<String> values) {
            addCriterion("desginer_imageurl in", values, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlNotIn(List<String> values) {
            addCriterion("desginer_imageurl not in", values, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlBetween(String value1, String value2) {
            addCriterion("desginer_imageurl between", value1, value2, "desginer_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesginer_imageurlNotBetween(String value1, String value2) {
            addCriterion("desginer_imageurl not between", value1, value2, "desginer_imageurl");
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

        public Criteria andDateshortEqualTo(String value) {
            addCriterion("dateshort =", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotEqualTo(String value) {
            addCriterion("dateshort <>", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortGreaterThan(String value) {
            addCriterion("dateshort >", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortGreaterThanOrEqualTo(String value) {
            addCriterion("dateshort >=", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLessThan(String value) {
            addCriterion("dateshort <", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLessThanOrEqualTo(String value) {
            addCriterion("dateshort <=", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortLike(String value) {
            addCriterion("dateshort like", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotLike(String value) {
            addCriterion("dateshort not like", value, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortIn(List<String> values) {
            addCriterion("dateshort in", values, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotIn(List<String> values) {
            addCriterion("dateshort not in", values, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortBetween(String value1, String value2) {
            addCriterion("dateshort between", value1, value2, "dateshort");
            return (Criteria) this;
        }

        public Criteria andDateshortNotBetween(String value1, String value2) {
            addCriterion("dateshort not between", value1, value2, "dateshort");
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