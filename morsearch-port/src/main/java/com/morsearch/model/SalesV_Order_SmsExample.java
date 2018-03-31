package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesV_Order_SmsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesV_Order_SmsExample() {
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

        public Criteria andOf_idIsNull() {
            addCriterion("of_id is null");
            return (Criteria) this;
        }

        public Criteria andOf_idIsNotNull() {
            addCriterion("of_id is not null");
            return (Criteria) this;
        }

        public Criteria andOf_idEqualTo(Long value) {
            addCriterion("of_id =", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idNotEqualTo(Long value) {
            addCriterion("of_id <>", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idGreaterThan(Long value) {
            addCriterion("of_id >", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idGreaterThanOrEqualTo(Long value) {
            addCriterion("of_id >=", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idLessThan(Long value) {
            addCriterion("of_id <", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idLessThanOrEqualTo(Long value) {
            addCriterion("of_id <=", value, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idIn(List<Long> values) {
            addCriterion("of_id in", values, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idNotIn(List<Long> values) {
            addCriterion("of_id not in", values, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idBetween(Long value1, Long value2) {
            addCriterion("of_id between", value1, value2, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_idNotBetween(Long value1, Long value2) {
            addCriterion("of_id not between", value1, value2, "of_id");
            return (Criteria) this;
        }

        public Criteria andOf_noIsNull() {
            addCriterion("of_no is null");
            return (Criteria) this;
        }

        public Criteria andOf_noIsNotNull() {
            addCriterion("of_no is not null");
            return (Criteria) this;
        }

        public Criteria andOf_noEqualTo(String value) {
            addCriterion("of_no =", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noNotEqualTo(String value) {
            addCriterion("of_no <>", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noGreaterThan(String value) {
            addCriterion("of_no >", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noGreaterThanOrEqualTo(String value) {
            addCriterion("of_no >=", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noLessThan(String value) {
            addCriterion("of_no <", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noLessThanOrEqualTo(String value) {
            addCriterion("of_no <=", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noLike(String value) {
            addCriterion("of_no like", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noNotLike(String value) {
            addCriterion("of_no not like", value, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noIn(List<String> values) {
            addCriterion("of_no in", values, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noNotIn(List<String> values) {
            addCriterion("of_no not in", values, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noBetween(String value1, String value2) {
            addCriterion("of_no between", value1, value2, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_noNotBetween(String value1, String value2) {
            addCriterion("of_no not between", value1, value2, "of_no");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetIsNull() {
            addCriterion("of_datemeet is null");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetIsNotNull() {
            addCriterion("of_datemeet is not null");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetEqualTo(Date value) {
            addCriterion("of_datemeet =", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetNotEqualTo(Date value) {
            addCriterion("of_datemeet <>", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetGreaterThan(Date value) {
            addCriterion("of_datemeet >", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetGreaterThanOrEqualTo(Date value) {
            addCriterion("of_datemeet >=", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetLessThan(Date value) {
            addCriterion("of_datemeet <", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetLessThanOrEqualTo(Date value) {
            addCriterion("of_datemeet <=", value, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetIn(List<Date> values) {
            addCriterion("of_datemeet in", values, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetNotIn(List<Date> values) {
            addCriterion("of_datemeet not in", values, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetBetween(Date value1, Date value2) {
            addCriterion("of_datemeet between", value1, value2, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andOf_datemeetNotBetween(Date value1, Date value2) {
            addCriterion("of_datemeet not between", value1, value2, "of_datemeet");
            return (Criteria) this;
        }

        public Criteria andSalenameIsNull() {
            addCriterion("salename is null");
            return (Criteria) this;
        }

        public Criteria andSalenameIsNotNull() {
            addCriterion("salename is not null");
            return (Criteria) this;
        }

        public Criteria andSalenameEqualTo(String value) {
            addCriterion("salename =", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameNotEqualTo(String value) {
            addCriterion("salename <>", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameGreaterThan(String value) {
            addCriterion("salename >", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameGreaterThanOrEqualTo(String value) {
            addCriterion("salename >=", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameLessThan(String value) {
            addCriterion("salename <", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameLessThanOrEqualTo(String value) {
            addCriterion("salename <=", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameLike(String value) {
            addCriterion("salename like", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameNotLike(String value) {
            addCriterion("salename not like", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameIn(List<String> values) {
            addCriterion("salename in", values, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameNotIn(List<String> values) {
            addCriterion("salename not in", values, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameBetween(String value1, String value2) {
            addCriterion("salename between", value1, value2, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameNotBetween(String value1, String value2) {
            addCriterion("salename not between", value1, value2, "salename");
            return (Criteria) this;
        }

        public Criteria andDesignameIsNull() {
            addCriterion("designame is null");
            return (Criteria) this;
        }

        public Criteria andDesignameIsNotNull() {
            addCriterion("designame is not null");
            return (Criteria) this;
        }

        public Criteria andDesignameEqualTo(String value) {
            addCriterion("designame =", value, "designame");
            return (Criteria) this;
        }

        public Criteria andDesignameNotEqualTo(String value) {
            addCriterion("designame <>", value, "designame");
            return (Criteria) this;
        }

        public Criteria andDesignameGreaterThan(String value) {
            addCriterion("designame >", value, "designame");
            return (Criteria) this;
        }

        public Criteria andDesignameGreaterThanOrEqualTo(String value) {
            addCriterion("designame >=", value, "designame");
            return (Criteria) this;
        }

        public Criteria andDesignameLessThan(String value) {
            addCriterion("designame <", value, "designame");
            return (Criteria) this;
        }

        public Criteria andDesignameLessThanOrEqualTo(String value) {
            addCriterion("designame <=", value, "designame");
            return (Criteria) this;
        }

        public Criteria andDesignameLike(String value) {
            addCriterion("designame like", value, "designame");
            return (Criteria) this;
        }

        public Criteria andDesignameNotLike(String value) {
            addCriterion("designame not like", value, "designame");
            return (Criteria) this;
        }

        public Criteria andDesignameIn(List<String> values) {
            addCriterion("designame in", values, "designame");
            return (Criteria) this;
        }

        public Criteria andDesignameNotIn(List<String> values) {
            addCriterion("designame not in", values, "designame");
            return (Criteria) this;
        }

        public Criteria andDesignameBetween(String value1, String value2) {
            addCriterion("designame between", value1, value2, "designame");
            return (Criteria) this;
        }

        public Criteria andDesignameNotBetween(String value1, String value2) {
            addCriterion("designame not between", value1, value2, "designame");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddIsNull() {
            addCriterion("salecompanyadd is null");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddIsNotNull() {
            addCriterion("salecompanyadd is not null");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddEqualTo(String value) {
            addCriterion("salecompanyadd =", value, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddNotEqualTo(String value) {
            addCriterion("salecompanyadd <>", value, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddGreaterThan(String value) {
            addCriterion("salecompanyadd >", value, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddGreaterThanOrEqualTo(String value) {
            addCriterion("salecompanyadd >=", value, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddLessThan(String value) {
            addCriterion("salecompanyadd <", value, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddLessThanOrEqualTo(String value) {
            addCriterion("salecompanyadd <=", value, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddLike(String value) {
            addCriterion("salecompanyadd like", value, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddNotLike(String value) {
            addCriterion("salecompanyadd not like", value, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddIn(List<String> values) {
            addCriterion("salecompanyadd in", values, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddNotIn(List<String> values) {
            addCriterion("salecompanyadd not in", values, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddBetween(String value1, String value2) {
            addCriterion("salecompanyadd between", value1, value2, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalecompanyaddNotBetween(String value1, String value2) {
            addCriterion("salecompanyadd not between", value1, value2, "salecompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddIsNull() {
            addCriterion("desigcompanyadd is null");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddIsNotNull() {
            addCriterion("desigcompanyadd is not null");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddEqualTo(String value) {
            addCriterion("desigcompanyadd =", value, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddNotEqualTo(String value) {
            addCriterion("desigcompanyadd <>", value, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddGreaterThan(String value) {
            addCriterion("desigcompanyadd >", value, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddGreaterThanOrEqualTo(String value) {
            addCriterion("desigcompanyadd >=", value, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddLessThan(String value) {
            addCriterion("desigcompanyadd <", value, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddLessThanOrEqualTo(String value) {
            addCriterion("desigcompanyadd <=", value, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddLike(String value) {
            addCriterion("desigcompanyadd like", value, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddNotLike(String value) {
            addCriterion("desigcompanyadd not like", value, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddIn(List<String> values) {
            addCriterion("desigcompanyadd in", values, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddNotIn(List<String> values) {
            addCriterion("desigcompanyadd not in", values, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddBetween(String value1, String value2) {
            addCriterion("desigcompanyadd between", value1, value2, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andDesigcompanyaddNotBetween(String value1, String value2) {
            addCriterion("desigcompanyadd not between", value1, value2, "desigcompanyadd");
            return (Criteria) this;
        }

        public Criteria andSalephoneIsNull() {
            addCriterion("salephone is null");
            return (Criteria) this;
        }

        public Criteria andSalephoneIsNotNull() {
            addCriterion("salephone is not null");
            return (Criteria) this;
        }

        public Criteria andSalephoneEqualTo(String value) {
            addCriterion("salephone =", value, "salephone");
            return (Criteria) this;
        }

        public Criteria andSalephoneNotEqualTo(String value) {
            addCriterion("salephone <>", value, "salephone");
            return (Criteria) this;
        }

        public Criteria andSalephoneGreaterThan(String value) {
            addCriterion("salephone >", value, "salephone");
            return (Criteria) this;
        }

        public Criteria andSalephoneGreaterThanOrEqualTo(String value) {
            addCriterion("salephone >=", value, "salephone");
            return (Criteria) this;
        }

        public Criteria andSalephoneLessThan(String value) {
            addCriterion("salephone <", value, "salephone");
            return (Criteria) this;
        }

        public Criteria andSalephoneLessThanOrEqualTo(String value) {
            addCriterion("salephone <=", value, "salephone");
            return (Criteria) this;
        }

        public Criteria andSalephoneLike(String value) {
            addCriterion("salephone like", value, "salephone");
            return (Criteria) this;
        }

        public Criteria andSalephoneNotLike(String value) {
            addCriterion("salephone not like", value, "salephone");
            return (Criteria) this;
        }

        public Criteria andSalephoneIn(List<String> values) {
            addCriterion("salephone in", values, "salephone");
            return (Criteria) this;
        }

        public Criteria andSalephoneNotIn(List<String> values) {
            addCriterion("salephone not in", values, "salephone");
            return (Criteria) this;
        }

        public Criteria andSalephoneBetween(String value1, String value2) {
            addCriterion("salephone between", value1, value2, "salephone");
            return (Criteria) this;
        }

        public Criteria andSalephoneNotBetween(String value1, String value2) {
            addCriterion("salephone not between", value1, value2, "salephone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneIsNull() {
            addCriterion("desigphone is null");
            return (Criteria) this;
        }

        public Criteria andDesigphoneIsNotNull() {
            addCriterion("desigphone is not null");
            return (Criteria) this;
        }

        public Criteria andDesigphoneEqualTo(String value) {
            addCriterion("desigphone =", value, "desigphone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneNotEqualTo(String value) {
            addCriterion("desigphone <>", value, "desigphone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneGreaterThan(String value) {
            addCriterion("desigphone >", value, "desigphone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneGreaterThanOrEqualTo(String value) {
            addCriterion("desigphone >=", value, "desigphone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneLessThan(String value) {
            addCriterion("desigphone <", value, "desigphone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneLessThanOrEqualTo(String value) {
            addCriterion("desigphone <=", value, "desigphone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneLike(String value) {
            addCriterion("desigphone like", value, "desigphone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneNotLike(String value) {
            addCriterion("desigphone not like", value, "desigphone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneIn(List<String> values) {
            addCriterion("desigphone in", values, "desigphone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneNotIn(List<String> values) {
            addCriterion("desigphone not in", values, "desigphone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneBetween(String value1, String value2) {
            addCriterion("desigphone between", value1, value2, "desigphone");
            return (Criteria) this;
        }

        public Criteria andDesigphoneNotBetween(String value1, String value2) {
            addCriterion("desigphone not between", value1, value2, "desigphone");
            return (Criteria) this;
        }

        public Criteria andOf_createidIsNull() {
            addCriterion("of_createid is null");
            return (Criteria) this;
        }

        public Criteria andOf_createidIsNotNull() {
            addCriterion("of_createid is not null");
            return (Criteria) this;
        }

        public Criteria andOf_createidEqualTo(Long value) {
            addCriterion("of_createid =", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidNotEqualTo(Long value) {
            addCriterion("of_createid <>", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidGreaterThan(Long value) {
            addCriterion("of_createid >", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("of_createid >=", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidLessThan(Long value) {
            addCriterion("of_createid <", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidLessThanOrEqualTo(Long value) {
            addCriterion("of_createid <=", value, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidIn(List<Long> values) {
            addCriterion("of_createid in", values, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidNotIn(List<Long> values) {
            addCriterion("of_createid not in", values, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidBetween(Long value1, Long value2) {
            addCriterion("of_createid between", value1, value2, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_createidNotBetween(Long value1, Long value2) {
            addCriterion("of_createid not between", value1, value2, "of_createid");
            return (Criteria) this;
        }

        public Criteria andOf_custidIsNull() {
            addCriterion("of_custid is null");
            return (Criteria) this;
        }

        public Criteria andOf_custidIsNotNull() {
            addCriterion("of_custid is not null");
            return (Criteria) this;
        }

        public Criteria andOf_custidEqualTo(Long value) {
            addCriterion("of_custid =", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidNotEqualTo(Long value) {
            addCriterion("of_custid <>", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidGreaterThan(Long value) {
            addCriterion("of_custid >", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidGreaterThanOrEqualTo(Long value) {
            addCriterion("of_custid >=", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidLessThan(Long value) {
            addCriterion("of_custid <", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidLessThanOrEqualTo(Long value) {
            addCriterion("of_custid <=", value, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidIn(List<Long> values) {
            addCriterion("of_custid in", values, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidNotIn(List<Long> values) {
            addCriterion("of_custid not in", values, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidBetween(Long value1, Long value2) {
            addCriterion("of_custid between", value1, value2, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_custidNotBetween(Long value1, Long value2) {
            addCriterion("of_custid not between", value1, value2, "of_custid");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameIsNull() {
            addCriterion("of_coinname is null");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameIsNotNull() {
            addCriterion("of_coinname is not null");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameEqualTo(String value) {
            addCriterion("of_coinname =", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameNotEqualTo(String value) {
            addCriterion("of_coinname <>", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameGreaterThan(String value) {
            addCriterion("of_coinname >", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameGreaterThanOrEqualTo(String value) {
            addCriterion("of_coinname >=", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameLessThan(String value) {
            addCriterion("of_coinname <", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameLessThanOrEqualTo(String value) {
            addCriterion("of_coinname <=", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameLike(String value) {
            addCriterion("of_coinname like", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameNotLike(String value) {
            addCriterion("of_coinname not like", value, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameIn(List<String> values) {
            addCriterion("of_coinname in", values, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameNotIn(List<String> values) {
            addCriterion("of_coinname not in", values, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameBetween(String value1, String value2) {
            addCriterion("of_coinname between", value1, value2, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinnameNotBetween(String value1, String value2) {
            addCriterion("of_coinname not between", value1, value2, "of_coinname");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceIsNull() {
            addCriterion("of_coinprice is null");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceIsNotNull() {
            addCriterion("of_coinprice is not null");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceEqualTo(BigDecimal value) {
            addCriterion("of_coinprice =", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceNotEqualTo(BigDecimal value) {
            addCriterion("of_coinprice <>", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceGreaterThan(BigDecimal value) {
            addCriterion("of_coinprice >", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("of_coinprice >=", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceLessThan(BigDecimal value) {
            addCriterion("of_coinprice <", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("of_coinprice <=", value, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceIn(List<BigDecimal> values) {
            addCriterion("of_coinprice in", values, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceNotIn(List<BigDecimal> values) {
            addCriterion("of_coinprice not in", values, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("of_coinprice between", value1, value2, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_coinpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("of_coinprice not between", value1, value2, "of_coinprice");
            return (Criteria) this;
        }

        public Criteria andOf_statusIsNull() {
            addCriterion("of_status is null");
            return (Criteria) this;
        }

        public Criteria andOf_statusIsNotNull() {
            addCriterion("of_status is not null");
            return (Criteria) this;
        }

        public Criteria andOf_statusEqualTo(Byte value) {
            addCriterion("of_status =", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusNotEqualTo(Byte value) {
            addCriterion("of_status <>", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusGreaterThan(Byte value) {
            addCriterion("of_status >", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("of_status >=", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusLessThan(Byte value) {
            addCriterion("of_status <", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusLessThanOrEqualTo(Byte value) {
            addCriterion("of_status <=", value, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusIn(List<Byte> values) {
            addCriterion("of_status in", values, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusNotIn(List<Byte> values) {
            addCriterion("of_status not in", values, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusBetween(Byte value1, Byte value2) {
            addCriterion("of_status between", value1, value2, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("of_status not between", value1, value2, "of_status");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishIsNull() {
            addCriterion("of_flagfinish is null");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishIsNotNull() {
            addCriterion("of_flagfinish is not null");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishEqualTo(Boolean value) {
            addCriterion("of_flagfinish =", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishNotEqualTo(Boolean value) {
            addCriterion("of_flagfinish <>", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishGreaterThan(Boolean value) {
            addCriterion("of_flagfinish >", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_flagfinish >=", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishLessThan(Boolean value) {
            addCriterion("of_flagfinish <", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishLessThanOrEqualTo(Boolean value) {
            addCriterion("of_flagfinish <=", value, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishIn(List<Boolean> values) {
            addCriterion("of_flagfinish in", values, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishNotIn(List<Boolean> values) {
            addCriterion("of_flagfinish not in", values, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagfinish between", value1, value2, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagfinishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagfinish not between", value1, value2, "of_flagfinish");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessIsNull() {
            addCriterion("of_flagsuccess is null");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessIsNotNull() {
            addCriterion("of_flagsuccess is not null");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessEqualTo(Boolean value) {
            addCriterion("of_flagsuccess =", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessNotEqualTo(Boolean value) {
            addCriterion("of_flagsuccess <>", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessGreaterThan(Boolean value) {
            addCriterion("of_flagsuccess >", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_flagsuccess >=", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessLessThan(Boolean value) {
            addCriterion("of_flagsuccess <", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessLessThanOrEqualTo(Boolean value) {
            addCriterion("of_flagsuccess <=", value, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessIn(List<Boolean> values) {
            addCriterion("of_flagsuccess in", values, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessNotIn(List<Boolean> values) {
            addCriterion("of_flagsuccess not in", values, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagsuccess between", value1, value2, "of_flagsuccess");
            return (Criteria) this;
        }

        public Criteria andOf_flagsuccessNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagsuccess not between", value1, value2, "of_flagsuccess");
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