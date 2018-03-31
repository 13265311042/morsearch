package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sales_OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sales_OrderExample() {
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

        public Criteria andOf_dateorderIsNull() {
            addCriterion("of_dateorder is null");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderIsNotNull() {
            addCriterion("of_dateorder is not null");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderEqualTo(Date value) {
            addCriterion("of_dateorder =", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderNotEqualTo(Date value) {
            addCriterion("of_dateorder <>", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderGreaterThan(Date value) {
            addCriterion("of_dateorder >", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderGreaterThanOrEqualTo(Date value) {
            addCriterion("of_dateorder >=", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderLessThan(Date value) {
            addCriterion("of_dateorder <", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderLessThanOrEqualTo(Date value) {
            addCriterion("of_dateorder <=", value, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderIn(List<Date> values) {
            addCriterion("of_dateorder in", values, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderNotIn(List<Date> values) {
            addCriterion("of_dateorder not in", values, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderBetween(Date value1, Date value2) {
            addCriterion("of_dateorder between", value1, value2, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_dateorderNotBetween(Date value1, Date value2) {
            addCriterion("of_dateorder not between", value1, value2, "of_dateorder");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveIsNull() {
            addCriterion("of_datereceive is null");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveIsNotNull() {
            addCriterion("of_datereceive is not null");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveEqualTo(Date value) {
            addCriterion("of_datereceive =", value, "of_datereceive");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveNotEqualTo(Date value) {
            addCriterion("of_datereceive <>", value, "of_datereceive");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveGreaterThan(Date value) {
            addCriterion("of_datereceive >", value, "of_datereceive");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveGreaterThanOrEqualTo(Date value) {
            addCriterion("of_datereceive >=", value, "of_datereceive");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveLessThan(Date value) {
            addCriterion("of_datereceive <", value, "of_datereceive");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveLessThanOrEqualTo(Date value) {
            addCriterion("of_datereceive <=", value, "of_datereceive");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveIn(List<Date> values) {
            addCriterion("of_datereceive in", values, "of_datereceive");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveNotIn(List<Date> values) {
            addCriterion("of_datereceive not in", values, "of_datereceive");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveBetween(Date value1, Date value2) {
            addCriterion("of_datereceive between", value1, value2, "of_datereceive");
            return (Criteria) this;
        }

        public Criteria andOf_datereceiveNotBetween(Date value1, Date value2) {
            addCriterion("of_datereceive not between", value1, value2, "of_datereceive");
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

        public Criteria andOf_dateappraisesaleIsNull() {
            addCriterion("of_dateappraisesale is null");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleIsNotNull() {
            addCriterion("of_dateappraisesale is not null");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleEqualTo(Date value) {
            addCriterion("of_dateappraisesale =", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleNotEqualTo(Date value) {
            addCriterion("of_dateappraisesale <>", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleGreaterThan(Date value) {
            addCriterion("of_dateappraisesale >", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleGreaterThanOrEqualTo(Date value) {
            addCriterion("of_dateappraisesale >=", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleLessThan(Date value) {
            addCriterion("of_dateappraisesale <", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleLessThanOrEqualTo(Date value) {
            addCriterion("of_dateappraisesale <=", value, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleIn(List<Date> values) {
            addCriterion("of_dateappraisesale in", values, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleNotIn(List<Date> values) {
            addCriterion("of_dateappraisesale not in", values, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleBetween(Date value1, Date value2) {
            addCriterion("of_dateappraisesale between", value1, value2, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisesaleNotBetween(Date value1, Date value2) {
            addCriterion("of_dateappraisesale not between", value1, value2, "of_dateappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiIsNull() {
            addCriterion("of_dateappraisedesi is null");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiIsNotNull() {
            addCriterion("of_dateappraisedesi is not null");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiEqualTo(Date value) {
            addCriterion("of_dateappraisedesi =", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiNotEqualTo(Date value) {
            addCriterion("of_dateappraisedesi <>", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiGreaterThan(Date value) {
            addCriterion("of_dateappraisedesi >", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiGreaterThanOrEqualTo(Date value) {
            addCriterion("of_dateappraisedesi >=", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiLessThan(Date value) {
            addCriterion("of_dateappraisedesi <", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiLessThanOrEqualTo(Date value) {
            addCriterion("of_dateappraisedesi <=", value, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiIn(List<Date> values) {
            addCriterion("of_dateappraisedesi in", values, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiNotIn(List<Date> values) {
            addCriterion("of_dateappraisedesi not in", values, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiBetween(Date value1, Date value2) {
            addCriterion("of_dateappraisedesi between", value1, value2, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateappraisedesiNotBetween(Date value1, Date value2) {
            addCriterion("of_dateappraisedesi not between", value1, value2, "of_dateappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseIsNull() {
            addCriterion("of_dateplanclose is null");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseIsNotNull() {
            addCriterion("of_dateplanclose is not null");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseEqualTo(Date value) {
            addCriterion("of_dateplanclose =", value, "of_dateplanclose");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseNotEqualTo(Date value) {
            addCriterion("of_dateplanclose <>", value, "of_dateplanclose");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseGreaterThan(Date value) {
            addCriterion("of_dateplanclose >", value, "of_dateplanclose");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseGreaterThanOrEqualTo(Date value) {
            addCriterion("of_dateplanclose >=", value, "of_dateplanclose");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseLessThan(Date value) {
            addCriterion("of_dateplanclose <", value, "of_dateplanclose");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseLessThanOrEqualTo(Date value) {
            addCriterion("of_dateplanclose <=", value, "of_dateplanclose");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseIn(List<Date> values) {
            addCriterion("of_dateplanclose in", values, "of_dateplanclose");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseNotIn(List<Date> values) {
            addCriterion("of_dateplanclose not in", values, "of_dateplanclose");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseBetween(Date value1, Date value2) {
            addCriterion("of_dateplanclose between", value1, value2, "of_dateplanclose");
            return (Criteria) this;
        }

        public Criteria andOf_dateplancloseNotBetween(Date value1, Date value2) {
            addCriterion("of_dateplanclose not between", value1, value2, "of_dateplanclose");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishIsNull() {
            addCriterion("of_datefinish is null");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishIsNotNull() {
            addCriterion("of_datefinish is not null");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishEqualTo(Date value) {
            addCriterion("of_datefinish =", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishNotEqualTo(Date value) {
            addCriterion("of_datefinish <>", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishGreaterThan(Date value) {
            addCriterion("of_datefinish >", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishGreaterThanOrEqualTo(Date value) {
            addCriterion("of_datefinish >=", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishLessThan(Date value) {
            addCriterion("of_datefinish <", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishLessThanOrEqualTo(Date value) {
            addCriterion("of_datefinish <=", value, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishIn(List<Date> values) {
            addCriterion("of_datefinish in", values, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishNotIn(List<Date> values) {
            addCriterion("of_datefinish not in", values, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishBetween(Date value1, Date value2) {
            addCriterion("of_datefinish between", value1, value2, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_datefinishNotBetween(Date value1, Date value2) {
            addCriterion("of_datefinish not between", value1, value2, "of_datefinish");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateIsNull() {
            addCriterion("of_dateupdate is null");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateIsNotNull() {
            addCriterion("of_dateupdate is not null");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateEqualTo(Date value) {
            addCriterion("of_dateupdate =", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateNotEqualTo(Date value) {
            addCriterion("of_dateupdate <>", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateGreaterThan(Date value) {
            addCriterion("of_dateupdate >", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("of_dateupdate >=", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateLessThan(Date value) {
            addCriterion("of_dateupdate <", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateLessThanOrEqualTo(Date value) {
            addCriterion("of_dateupdate <=", value, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateIn(List<Date> values) {
            addCriterion("of_dateupdate in", values, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateNotIn(List<Date> values) {
            addCriterion("of_dateupdate not in", values, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateBetween(Date value1, Date value2) {
            addCriterion("of_dateupdate between", value1, value2, "of_dateupdate");
            return (Criteria) this;
        }

        public Criteria andOf_dateupdateNotBetween(Date value1, Date value2) {
            addCriterion("of_dateupdate not between", value1, value2, "of_dateupdate");
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

        public Criteria andOf_custnameIsNull() {
            addCriterion("of_custname is null");
            return (Criteria) this;
        }

        public Criteria andOf_custnameIsNotNull() {
            addCriterion("of_custname is not null");
            return (Criteria) this;
        }

        public Criteria andOf_custnameEqualTo(String value) {
            addCriterion("of_custname =", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameNotEqualTo(String value) {
            addCriterion("of_custname <>", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameGreaterThan(String value) {
            addCriterion("of_custname >", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameGreaterThanOrEqualTo(String value) {
            addCriterion("of_custname >=", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameLessThan(String value) {
            addCriterion("of_custname <", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameLessThanOrEqualTo(String value) {
            addCriterion("of_custname <=", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameLike(String value) {
            addCriterion("of_custname like", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameNotLike(String value) {
            addCriterion("of_custname not like", value, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameIn(List<String> values) {
            addCriterion("of_custname in", values, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameNotIn(List<String> values) {
            addCriterion("of_custname not in", values, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameBetween(String value1, String value2) {
            addCriterion("of_custname between", value1, value2, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_custnameNotBetween(String value1, String value2) {
            addCriterion("of_custname not between", value1, value2, "of_custname");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeIsNull() {
            addCriterion("of_coincode is null");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeIsNotNull() {
            addCriterion("of_coincode is not null");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeEqualTo(String value) {
            addCriterion("of_coincode =", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeNotEqualTo(String value) {
            addCriterion("of_coincode <>", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeGreaterThan(String value) {
            addCriterion("of_coincode >", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeGreaterThanOrEqualTo(String value) {
            addCriterion("of_coincode >=", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeLessThan(String value) {
            addCriterion("of_coincode <", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeLessThanOrEqualTo(String value) {
            addCriterion("of_coincode <=", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeLike(String value) {
            addCriterion("of_coincode like", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeNotLike(String value) {
            addCriterion("of_coincode not like", value, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeIn(List<String> values) {
            addCriterion("of_coincode in", values, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeNotIn(List<String> values) {
            addCriterion("of_coincode not in", values, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeBetween(String value1, String value2) {
            addCriterion("of_coincode between", value1, value2, "of_coincode");
            return (Criteria) this;
        }

        public Criteria andOf_coincodeNotBetween(String value1, String value2) {
            addCriterion("of_coincode not between", value1, value2, "of_coincode");
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

        public Criteria andOf_coinimageIsNull() {
            addCriterion("of_coinimage is null");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageIsNotNull() {
            addCriterion("of_coinimage is not null");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageEqualTo(String value) {
            addCriterion("of_coinimage =", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageNotEqualTo(String value) {
            addCriterion("of_coinimage <>", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageGreaterThan(String value) {
            addCriterion("of_coinimage >", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageGreaterThanOrEqualTo(String value) {
            addCriterion("of_coinimage >=", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageLessThan(String value) {
            addCriterion("of_coinimage <", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageLessThanOrEqualTo(String value) {
            addCriterion("of_coinimage <=", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageLike(String value) {
            addCriterion("of_coinimage like", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageNotLike(String value) {
            addCriterion("of_coinimage not like", value, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageIn(List<String> values) {
            addCriterion("of_coinimage in", values, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageNotIn(List<String> values) {
            addCriterion("of_coinimage not in", values, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageBetween(String value1, String value2) {
            addCriterion("of_coinimage between", value1, value2, "of_coinimage");
            return (Criteria) this;
        }

        public Criteria andOf_coinimageNotBetween(String value1, String value2) {
            addCriterion("of_coinimage not between", value1, value2, "of_coinimage");
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

        public Criteria andOf_talkheadIsNull() {
            addCriterion("of_talkhead is null");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadIsNotNull() {
            addCriterion("of_talkhead is not null");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadEqualTo(String value) {
            addCriterion("of_talkhead =", value, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadNotEqualTo(String value) {
            addCriterion("of_talkhead <>", value, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadGreaterThan(String value) {
            addCriterion("of_talkhead >", value, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadGreaterThanOrEqualTo(String value) {
            addCriterion("of_talkhead >=", value, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadLessThan(String value) {
            addCriterion("of_talkhead <", value, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadLessThanOrEqualTo(String value) {
            addCriterion("of_talkhead <=", value, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadLike(String value) {
            addCriterion("of_talkhead like", value, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadNotLike(String value) {
            addCriterion("of_talkhead not like", value, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadIn(List<String> values) {
            addCriterion("of_talkhead in", values, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadNotIn(List<String> values) {
            addCriterion("of_talkhead not in", values, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadBetween(String value1, String value2) {
            addCriterion("of_talkhead between", value1, value2, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkheadNotBetween(String value1, String value2) {
            addCriterion("of_talkhead not between", value1, value2, "of_talkhead");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeIsNull() {
            addCriterion("of_talkcode is null");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeIsNotNull() {
            addCriterion("of_talkcode is not null");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeEqualTo(String value) {
            addCriterion("of_talkcode =", value, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeNotEqualTo(String value) {
            addCriterion("of_talkcode <>", value, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeGreaterThan(String value) {
            addCriterion("of_talkcode >", value, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("of_talkcode >=", value, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeLessThan(String value) {
            addCriterion("of_talkcode <", value, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeLessThanOrEqualTo(String value) {
            addCriterion("of_talkcode <=", value, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeLike(String value) {
            addCriterion("of_talkcode like", value, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeNotLike(String value) {
            addCriterion("of_talkcode not like", value, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeIn(List<String> values) {
            addCriterion("of_talkcode in", values, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeNotIn(List<String> values) {
            addCriterion("of_talkcode not in", values, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeBetween(String value1, String value2) {
            addCriterion("of_talkcode between", value1, value2, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcodeNotBetween(String value1, String value2) {
            addCriterion("of_talkcode not between", value1, value2, "of_talkcode");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentIsNull() {
            addCriterion("of_talkcontent is null");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentIsNotNull() {
            addCriterion("of_talkcontent is not null");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentEqualTo(String value) {
            addCriterion("of_talkcontent =", value, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentNotEqualTo(String value) {
            addCriterion("of_talkcontent <>", value, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentGreaterThan(String value) {
            addCriterion("of_talkcontent >", value, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentGreaterThanOrEqualTo(String value) {
            addCriterion("of_talkcontent >=", value, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentLessThan(String value) {
            addCriterion("of_talkcontent <", value, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentLessThanOrEqualTo(String value) {
            addCriterion("of_talkcontent <=", value, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentLike(String value) {
            addCriterion("of_talkcontent like", value, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentNotLike(String value) {
            addCriterion("of_talkcontent not like", value, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentIn(List<String> values) {
            addCriterion("of_talkcontent in", values, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentNotIn(List<String> values) {
            addCriterion("of_talkcontent not in", values, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentBetween(String value1, String value2) {
            addCriterion("of_talkcontent between", value1, value2, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talkcontentNotBetween(String value1, String value2) {
            addCriterion("of_talkcontent not between", value1, value2, "of_talkcontent");
            return (Criteria) this;
        }

        public Criteria andOf_talksignIsNull() {
            addCriterion("of_talksign is null");
            return (Criteria) this;
        }

        public Criteria andOf_talksignIsNotNull() {
            addCriterion("of_talksign is not null");
            return (Criteria) this;
        }

        public Criteria andOf_talksignEqualTo(String value) {
            addCriterion("of_talksign =", value, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talksignNotEqualTo(String value) {
            addCriterion("of_talksign <>", value, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talksignGreaterThan(String value) {
            addCriterion("of_talksign >", value, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talksignGreaterThanOrEqualTo(String value) {
            addCriterion("of_talksign >=", value, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talksignLessThan(String value) {
            addCriterion("of_talksign <", value, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talksignLessThanOrEqualTo(String value) {
            addCriterion("of_talksign <=", value, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talksignLike(String value) {
            addCriterion("of_talksign like", value, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talksignNotLike(String value) {
            addCriterion("of_talksign not like", value, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talksignIn(List<String> values) {
            addCriterion("of_talksign in", values, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talksignNotIn(List<String> values) {
            addCriterion("of_talksign not in", values, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talksignBetween(String value1, String value2) {
            addCriterion("of_talksign between", value1, value2, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talksignNotBetween(String value1, String value2) {
            addCriterion("of_talksign not between", value1, value2, "of_talksign");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgIsNull() {
            addCriterion("of_talklastmsg is null");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgIsNotNull() {
            addCriterion("of_talklastmsg is not null");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgEqualTo(String value) {
            addCriterion("of_talklastmsg =", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgNotEqualTo(String value) {
            addCriterion("of_talklastmsg <>", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgGreaterThan(String value) {
            addCriterion("of_talklastmsg >", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgGreaterThanOrEqualTo(String value) {
            addCriterion("of_talklastmsg >=", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgLessThan(String value) {
            addCriterion("of_talklastmsg <", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgLessThanOrEqualTo(String value) {
            addCriterion("of_talklastmsg <=", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgLike(String value) {
            addCriterion("of_talklastmsg like", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgNotLike(String value) {
            addCriterion("of_talklastmsg not like", value, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgIn(List<String> values) {
            addCriterion("of_talklastmsg in", values, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgNotIn(List<String> values) {
            addCriterion("of_talklastmsg not in", values, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgBetween(String value1, String value2) {
            addCriterion("of_talklastmsg between", value1, value2, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_talklastmsgNotBetween(String value1, String value2) {
            addCriterion("of_talklastmsg not between", value1, value2, "of_talklastmsg");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsIsNull() {
            addCriterion("of_checkmsgs is null");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsIsNotNull() {
            addCriterion("of_checkmsgs is not null");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsEqualTo(Boolean value) {
            addCriterion("of_checkmsgs =", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsNotEqualTo(Boolean value) {
            addCriterion("of_checkmsgs <>", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsGreaterThan(Boolean value) {
            addCriterion("of_checkmsgs >", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_checkmsgs >=", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsLessThan(Boolean value) {
            addCriterion("of_checkmsgs <", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsLessThanOrEqualTo(Boolean value) {
            addCriterion("of_checkmsgs <=", value, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsIn(List<Boolean> values) {
            addCriterion("of_checkmsgs in", values, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsNotIn(List<Boolean> values) {
            addCriterion("of_checkmsgs not in", values, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsBetween(Boolean value1, Boolean value2) {
            addCriterion("of_checkmsgs between", value1, value2, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_checkmsgs not between", value1, value2, "of_checkmsgs");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdIsNull() {
            addCriterion("of_checkmsgd is null");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdIsNotNull() {
            addCriterion("of_checkmsgd is not null");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdEqualTo(Boolean value) {
            addCriterion("of_checkmsgd =", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdNotEqualTo(Boolean value) {
            addCriterion("of_checkmsgd <>", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdGreaterThan(Boolean value) {
            addCriterion("of_checkmsgd >", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_checkmsgd >=", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdLessThan(Boolean value) {
            addCriterion("of_checkmsgd <", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdLessThanOrEqualTo(Boolean value) {
            addCriterion("of_checkmsgd <=", value, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdIn(List<Boolean> values) {
            addCriterion("of_checkmsgd in", values, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdNotIn(List<Boolean> values) {
            addCriterion("of_checkmsgd not in", values, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdBetween(Boolean value1, Boolean value2) {
            addCriterion("of_checkmsgd between", value1, value2, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_checkmsgdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_checkmsgd not between", value1, value2, "of_checkmsgd");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountIsNull() {
            addCriterion("of_msgsalescount is null");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountIsNotNull() {
            addCriterion("of_msgsalescount is not null");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountEqualTo(Integer value) {
            addCriterion("of_msgsalescount =", value, "of_msgsalescount");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountNotEqualTo(Integer value) {
            addCriterion("of_msgsalescount <>", value, "of_msgsalescount");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountGreaterThan(Integer value) {
            addCriterion("of_msgsalescount >", value, "of_msgsalescount");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountGreaterThanOrEqualTo(Integer value) {
            addCriterion("of_msgsalescount >=", value, "of_msgsalescount");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountLessThan(Integer value) {
            addCriterion("of_msgsalescount <", value, "of_msgsalescount");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountLessThanOrEqualTo(Integer value) {
            addCriterion("of_msgsalescount <=", value, "of_msgsalescount");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountIn(List<Integer> values) {
            addCriterion("of_msgsalescount in", values, "of_msgsalescount");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountNotIn(List<Integer> values) {
            addCriterion("of_msgsalescount not in", values, "of_msgsalescount");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountBetween(Integer value1, Integer value2) {
            addCriterion("of_msgsalescount between", value1, value2, "of_msgsalescount");
            return (Criteria) this;
        }

        public Criteria andOf_msgsalescountNotBetween(Integer value1, Integer value2) {
            addCriterion("of_msgsalescount not between", value1, value2, "of_msgsalescount");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountIsNull() {
            addCriterion("of_msgdesigcount is null");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountIsNotNull() {
            addCriterion("of_msgdesigcount is not null");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountEqualTo(Integer value) {
            addCriterion("of_msgdesigcount =", value, "of_msgdesigcount");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountNotEqualTo(Integer value) {
            addCriterion("of_msgdesigcount <>", value, "of_msgdesigcount");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountGreaterThan(Integer value) {
            addCriterion("of_msgdesigcount >", value, "of_msgdesigcount");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("of_msgdesigcount >=", value, "of_msgdesigcount");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountLessThan(Integer value) {
            addCriterion("of_msgdesigcount <", value, "of_msgdesigcount");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountLessThanOrEqualTo(Integer value) {
            addCriterion("of_msgdesigcount <=", value, "of_msgdesigcount");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountIn(List<Integer> values) {
            addCriterion("of_msgdesigcount in", values, "of_msgdesigcount");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountNotIn(List<Integer> values) {
            addCriterion("of_msgdesigcount not in", values, "of_msgdesigcount");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountBetween(Integer value1, Integer value2) {
            addCriterion("of_msgdesigcount between", value1, value2, "of_msgdesigcount");
            return (Criteria) this;
        }

        public Criteria andOf_msgdesigcountNotBetween(Integer value1, Integer value2) {
            addCriterion("of_msgdesigcount not between", value1, value2, "of_msgdesigcount");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgIsNull() {
            addCriterion("of_adjdatemsg is null");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgIsNotNull() {
            addCriterion("of_adjdatemsg is not null");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgEqualTo(String value) {
            addCriterion("of_adjdatemsg =", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgNotEqualTo(String value) {
            addCriterion("of_adjdatemsg <>", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgGreaterThan(String value) {
            addCriterion("of_adjdatemsg >", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgGreaterThanOrEqualTo(String value) {
            addCriterion("of_adjdatemsg >=", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgLessThan(String value) {
            addCriterion("of_adjdatemsg <", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgLessThanOrEqualTo(String value) {
            addCriterion("of_adjdatemsg <=", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgLike(String value) {
            addCriterion("of_adjdatemsg like", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgNotLike(String value) {
            addCriterion("of_adjdatemsg not like", value, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgIn(List<String> values) {
            addCriterion("of_adjdatemsg in", values, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgNotIn(List<String> values) {
            addCriterion("of_adjdatemsg not in", values, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgBetween(String value1, String value2) {
            addCriterion("of_adjdatemsg between", value1, value2, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatemsgNotBetween(String value1, String value2) {
            addCriterion("of_adjdatemsg not between", value1, value2, "of_adjdatemsg");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadIsNull() {
            addCriterion("of_adjdateread is null");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadIsNotNull() {
            addCriterion("of_adjdateread is not null");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadEqualTo(Boolean value) {
            addCriterion("of_adjdateread =", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadNotEqualTo(Boolean value) {
            addCriterion("of_adjdateread <>", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadGreaterThan(Boolean value) {
            addCriterion("of_adjdateread >", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_adjdateread >=", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadLessThan(Boolean value) {
            addCriterion("of_adjdateread <", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadLessThanOrEqualTo(Boolean value) {
            addCriterion("of_adjdateread <=", value, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadIn(List<Boolean> values) {
            addCriterion("of_adjdateread in", values, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadNotIn(List<Boolean> values) {
            addCriterion("of_adjdateread not in", values, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadBetween(Boolean value1, Boolean value2) {
            addCriterion("of_adjdateread between", value1, value2, "of_adjdateread");
            return (Criteria) this;
        }

        public Criteria andOf_adjdatereadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_adjdateread not between", value1, value2, "of_adjdateread");
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

        public Criteria andOf_flagappraisesaleIsNull() {
            addCriterion("of_flagappraisesale is null");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleIsNotNull() {
            addCriterion("of_flagappraisesale is not null");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleEqualTo(Boolean value) {
            addCriterion("of_flagappraisesale =", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleNotEqualTo(Boolean value) {
            addCriterion("of_flagappraisesale <>", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleGreaterThan(Boolean value) {
            addCriterion("of_flagappraisesale >", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_flagappraisesale >=", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleLessThan(Boolean value) {
            addCriterion("of_flagappraisesale <", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleLessThanOrEqualTo(Boolean value) {
            addCriterion("of_flagappraisesale <=", value, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleIn(List<Boolean> values) {
            addCriterion("of_flagappraisesale in", values, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleNotIn(List<Boolean> values) {
            addCriterion("of_flagappraisesale not in", values, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagappraisesale between", value1, value2, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisesaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagappraisesale not between", value1, value2, "of_flagappraisesale");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiIsNull() {
            addCriterion("of_flagappraisedesi is null");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiIsNotNull() {
            addCriterion("of_flagappraisedesi is not null");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiEqualTo(Boolean value) {
            addCriterion("of_flagappraisedesi =", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiNotEqualTo(Boolean value) {
            addCriterion("of_flagappraisedesi <>", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiGreaterThan(Boolean value) {
            addCriterion("of_flagappraisedesi >", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_flagappraisedesi >=", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiLessThan(Boolean value) {
            addCriterion("of_flagappraisedesi <", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiLessThanOrEqualTo(Boolean value) {
            addCriterion("of_flagappraisedesi <=", value, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiIn(List<Boolean> values) {
            addCriterion("of_flagappraisedesi in", values, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiNotIn(List<Boolean> values) {
            addCriterion("of_flagappraisedesi not in", values, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagappraisedesi between", value1, value2, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagappraisedesiNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagappraisedesi not between", value1, value2, "of_flagappraisedesi");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopIsNull() {
            addCriterion("of_flagstop is null");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopIsNotNull() {
            addCriterion("of_flagstop is not null");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopEqualTo(Boolean value) {
            addCriterion("of_flagstop =", value, "of_flagstop");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopNotEqualTo(Boolean value) {
            addCriterion("of_flagstop <>", value, "of_flagstop");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopGreaterThan(Boolean value) {
            addCriterion("of_flagstop >", value, "of_flagstop");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_flagstop >=", value, "of_flagstop");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopLessThan(Boolean value) {
            addCriterion("of_flagstop <", value, "of_flagstop");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopLessThanOrEqualTo(Boolean value) {
            addCriterion("of_flagstop <=", value, "of_flagstop");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopIn(List<Boolean> values) {
            addCriterion("of_flagstop in", values, "of_flagstop");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopNotIn(List<Boolean> values) {
            addCriterion("of_flagstop not in", values, "of_flagstop");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagstop between", value1, value2, "of_flagstop");
            return (Criteria) this;
        }

        public Criteria andOf_flagstopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_flagstop not between", value1, value2, "of_flagstop");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewIsNull() {
            addCriterion("of_noticenew is null");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewIsNotNull() {
            addCriterion("of_noticenew is not null");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewEqualTo(Boolean value) {
            addCriterion("of_noticenew =", value, "of_noticenew");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewNotEqualTo(Boolean value) {
            addCriterion("of_noticenew <>", value, "of_noticenew");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewGreaterThan(Boolean value) {
            addCriterion("of_noticenew >", value, "of_noticenew");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_noticenew >=", value, "of_noticenew");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewLessThan(Boolean value) {
            addCriterion("of_noticenew <", value, "of_noticenew");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewLessThanOrEqualTo(Boolean value) {
            addCriterion("of_noticenew <=", value, "of_noticenew");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewIn(List<Boolean> values) {
            addCriterion("of_noticenew in", values, "of_noticenew");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewNotIn(List<Boolean> values) {
            addCriterion("of_noticenew not in", values, "of_noticenew");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewBetween(Boolean value1, Boolean value2) {
            addCriterion("of_noticenew between", value1, value2, "of_noticenew");
            return (Criteria) this;
        }

        public Criteria andOf_noticenewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_noticenew not between", value1, value2, "of_noticenew");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustIsNull() {
            addCriterion("of_noticeadjust is null");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustIsNotNull() {
            addCriterion("of_noticeadjust is not null");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustEqualTo(Boolean value) {
            addCriterion("of_noticeadjust =", value, "of_noticeadjust");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustNotEqualTo(Boolean value) {
            addCriterion("of_noticeadjust <>", value, "of_noticeadjust");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustGreaterThan(Boolean value) {
            addCriterion("of_noticeadjust >", value, "of_noticeadjust");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_noticeadjust >=", value, "of_noticeadjust");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustLessThan(Boolean value) {
            addCriterion("of_noticeadjust <", value, "of_noticeadjust");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustLessThanOrEqualTo(Boolean value) {
            addCriterion("of_noticeadjust <=", value, "of_noticeadjust");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustIn(List<Boolean> values) {
            addCriterion("of_noticeadjust in", values, "of_noticeadjust");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustNotIn(List<Boolean> values) {
            addCriterion("of_noticeadjust not in", values, "of_noticeadjust");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustBetween(Boolean value1, Boolean value2) {
            addCriterion("of_noticeadjust between", value1, value2, "of_noticeadjust");
            return (Criteria) this;
        }

        public Criteria andOf_noticeadjustNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_noticeadjust not between", value1, value2, "of_noticeadjust");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetIsNull() {
            addCriterion("of_noticemeet is null");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetIsNotNull() {
            addCriterion("of_noticemeet is not null");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetEqualTo(Boolean value) {
            addCriterion("of_noticemeet =", value, "of_noticemeet");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetNotEqualTo(Boolean value) {
            addCriterion("of_noticemeet <>", value, "of_noticemeet");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetGreaterThan(Boolean value) {
            addCriterion("of_noticemeet >", value, "of_noticemeet");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_noticemeet >=", value, "of_noticemeet");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetLessThan(Boolean value) {
            addCriterion("of_noticemeet <", value, "of_noticemeet");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetLessThanOrEqualTo(Boolean value) {
            addCriterion("of_noticemeet <=", value, "of_noticemeet");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetIn(List<Boolean> values) {
            addCriterion("of_noticemeet in", values, "of_noticemeet");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetNotIn(List<Boolean> values) {
            addCriterion("of_noticemeet not in", values, "of_noticemeet");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetBetween(Boolean value1, Boolean value2) {
            addCriterion("of_noticemeet between", value1, value2, "of_noticemeet");
            return (Criteria) this;
        }

        public Criteria andOf_noticemeetNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_noticemeet not between", value1, value2, "of_noticemeet");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseIsNull() {
            addCriterion("of_noticeappraise is null");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseIsNotNull() {
            addCriterion("of_noticeappraise is not null");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseEqualTo(Boolean value) {
            addCriterion("of_noticeappraise =", value, "of_noticeappraise");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseNotEqualTo(Boolean value) {
            addCriterion("of_noticeappraise <>", value, "of_noticeappraise");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseGreaterThan(Boolean value) {
            addCriterion("of_noticeappraise >", value, "of_noticeappraise");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_noticeappraise >=", value, "of_noticeappraise");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseLessThan(Boolean value) {
            addCriterion("of_noticeappraise <", value, "of_noticeappraise");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseLessThanOrEqualTo(Boolean value) {
            addCriterion("of_noticeappraise <=", value, "of_noticeappraise");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseIn(List<Boolean> values) {
            addCriterion("of_noticeappraise in", values, "of_noticeappraise");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseNotIn(List<Boolean> values) {
            addCriterion("of_noticeappraise not in", values, "of_noticeappraise");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseBetween(Boolean value1, Boolean value2) {
            addCriterion("of_noticeappraise between", value1, value2, "of_noticeappraise");
            return (Criteria) this;
        }

        public Criteria andOf_noticeappraiseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_noticeappraise not between", value1, value2, "of_noticeappraise");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishIsNull() {
            addCriterion("of_noticefinish is null");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishIsNotNull() {
            addCriterion("of_noticefinish is not null");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishEqualTo(Boolean value) {
            addCriterion("of_noticefinish =", value, "of_noticefinish");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishNotEqualTo(Boolean value) {
            addCriterion("of_noticefinish <>", value, "of_noticefinish");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishGreaterThan(Boolean value) {
            addCriterion("of_noticefinish >", value, "of_noticefinish");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("of_noticefinish >=", value, "of_noticefinish");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishLessThan(Boolean value) {
            addCriterion("of_noticefinish <", value, "of_noticefinish");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishLessThanOrEqualTo(Boolean value) {
            addCriterion("of_noticefinish <=", value, "of_noticefinish");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishIn(List<Boolean> values) {
            addCriterion("of_noticefinish in", values, "of_noticefinish");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishNotIn(List<Boolean> values) {
            addCriterion("of_noticefinish not in", values, "of_noticefinish");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishBetween(Boolean value1, Boolean value2) {
            addCriterion("of_noticefinish between", value1, value2, "of_noticefinish");
            return (Criteria) this;
        }

        public Criteria andOf_noticefinishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("of_noticefinish not between", value1, value2, "of_noticefinish");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusIsNull() {
            addCriterion("of_appealstatus is null");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusIsNotNull() {
            addCriterion("of_appealstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusEqualTo(Byte value) {
            addCriterion("of_appealstatus =", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusNotEqualTo(Byte value) {
            addCriterion("of_appealstatus <>", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusGreaterThan(Byte value) {
            addCriterion("of_appealstatus >", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("of_appealstatus >=", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusLessThan(Byte value) {
            addCriterion("of_appealstatus <", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusLessThanOrEqualTo(Byte value) {
            addCriterion("of_appealstatus <=", value, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusIn(List<Byte> values) {
            addCriterion("of_appealstatus in", values, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusNotIn(List<Byte> values) {
            addCriterion("of_appealstatus not in", values, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusBetween(Byte value1, Byte value2) {
            addCriterion("of_appealstatus between", value1, value2, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("of_appealstatus not between", value1, value2, "of_appealstatus");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateIsNull() {
            addCriterion("of_appealdate is null");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateIsNotNull() {
            addCriterion("of_appealdate is not null");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateEqualTo(Date value) {
            addCriterion("of_appealdate =", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateNotEqualTo(Date value) {
            addCriterion("of_appealdate <>", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateGreaterThan(Date value) {
            addCriterion("of_appealdate >", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("of_appealdate >=", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateLessThan(Date value) {
            addCriterion("of_appealdate <", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateLessThanOrEqualTo(Date value) {
            addCriterion("of_appealdate <=", value, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateIn(List<Date> values) {
            addCriterion("of_appealdate in", values, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateNotIn(List<Date> values) {
            addCriterion("of_appealdate not in", values, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateBetween(Date value1, Date value2) {
            addCriterion("of_appealdate between", value1, value2, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_appealdateNotBetween(Date value1, Date value2) {
            addCriterion("of_appealdate not between", value1, value2, "of_appealdate");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameIsNull() {
            addCriterion("of_sourcename is null");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameIsNotNull() {
            addCriterion("of_sourcename is not null");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameEqualTo(String value) {
            addCriterion("of_sourcename =", value, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameNotEqualTo(String value) {
            addCriterion("of_sourcename <>", value, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameGreaterThan(String value) {
            addCriterion("of_sourcename >", value, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("of_sourcename >=", value, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameLessThan(String value) {
            addCriterion("of_sourcename <", value, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameLessThanOrEqualTo(String value) {
            addCriterion("of_sourcename <=", value, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameLike(String value) {
            addCriterion("of_sourcename like", value, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameNotLike(String value) {
            addCriterion("of_sourcename not like", value, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameIn(List<String> values) {
            addCriterion("of_sourcename in", values, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameNotIn(List<String> values) {
            addCriterion("of_sourcename not in", values, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameBetween(String value1, String value2) {
            addCriterion("of_sourcename between", value1, value2, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourcenameNotBetween(String value1, String value2) {
            addCriterion("of_sourcename not between", value1, value2, "of_sourcename");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionIsNull() {
            addCriterion("of_sourceversion is null");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionIsNotNull() {
            addCriterion("of_sourceversion is not null");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionEqualTo(String value) {
            addCriterion("of_sourceversion =", value, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionNotEqualTo(String value) {
            addCriterion("of_sourceversion <>", value, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionGreaterThan(String value) {
            addCriterion("of_sourceversion >", value, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionGreaterThanOrEqualTo(String value) {
            addCriterion("of_sourceversion >=", value, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionLessThan(String value) {
            addCriterion("of_sourceversion <", value, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionLessThanOrEqualTo(String value) {
            addCriterion("of_sourceversion <=", value, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionLike(String value) {
            addCriterion("of_sourceversion like", value, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionNotLike(String value) {
            addCriterion("of_sourceversion not like", value, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionIn(List<String> values) {
            addCriterion("of_sourceversion in", values, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionNotIn(List<String> values) {
            addCriterion("of_sourceversion not in", values, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionBetween(String value1, String value2) {
            addCriterion("of_sourceversion between", value1, value2, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_sourceversionNotBetween(String value1, String value2) {
            addCriterion("of_sourceversion not between", value1, value2, "of_sourceversion");
            return (Criteria) this;
        }

        public Criteria andOf_accountidIsNull() {
            addCriterion("of_accountid is null");
            return (Criteria) this;
        }

        public Criteria andOf_accountidIsNotNull() {
            addCriterion("of_accountid is not null");
            return (Criteria) this;
        }

        public Criteria andOf_accountidEqualTo(Long value) {
            addCriterion("of_accountid =", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidNotEqualTo(Long value) {
            addCriterion("of_accountid <>", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidGreaterThan(Long value) {
            addCriterion("of_accountid >", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidGreaterThanOrEqualTo(Long value) {
            addCriterion("of_accountid >=", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidLessThan(Long value) {
            addCriterion("of_accountid <", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidLessThanOrEqualTo(Long value) {
            addCriterion("of_accountid <=", value, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidIn(List<Long> values) {
            addCriterion("of_accountid in", values, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidNotIn(List<Long> values) {
            addCriterion("of_accountid not in", values, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidBetween(Long value1, Long value2) {
            addCriterion("of_accountid between", value1, value2, "of_accountid");
            return (Criteria) this;
        }

        public Criteria andOf_accountidNotBetween(Long value1, Long value2) {
            addCriterion("of_accountid not between", value1, value2, "of_accountid");
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

        public Criteria andOf_createnoIsNull() {
            addCriterion("of_createno is null");
            return (Criteria) this;
        }

        public Criteria andOf_createnoIsNotNull() {
            addCriterion("of_createno is not null");
            return (Criteria) this;
        }

        public Criteria andOf_createnoEqualTo(String value) {
            addCriterion("of_createno =", value, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createnoNotEqualTo(String value) {
            addCriterion("of_createno <>", value, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createnoGreaterThan(String value) {
            addCriterion("of_createno >", value, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("of_createno >=", value, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createnoLessThan(String value) {
            addCriterion("of_createno <", value, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createnoLessThanOrEqualTo(String value) {
            addCriterion("of_createno <=", value, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createnoLike(String value) {
            addCriterion("of_createno like", value, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createnoNotLike(String value) {
            addCriterion("of_createno not like", value, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createnoIn(List<String> values) {
            addCriterion("of_createno in", values, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createnoNotIn(List<String> values) {
            addCriterion("of_createno not in", values, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createnoBetween(String value1, String value2) {
            addCriterion("of_createno between", value1, value2, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createnoNotBetween(String value1, String value2) {
            addCriterion("of_createno not between", value1, value2, "of_createno");
            return (Criteria) this;
        }

        public Criteria andOf_createdateIsNull() {
            addCriterion("of_createdate is null");
            return (Criteria) this;
        }

        public Criteria andOf_createdateIsNotNull() {
            addCriterion("of_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andOf_createdateEqualTo(Date value) {
            addCriterion("of_createdate =", value, "of_createdate");
            return (Criteria) this;
        }

        public Criteria andOf_createdateNotEqualTo(Date value) {
            addCriterion("of_createdate <>", value, "of_createdate");
            return (Criteria) this;
        }

        public Criteria andOf_createdateGreaterThan(Date value) {
            addCriterion("of_createdate >", value, "of_createdate");
            return (Criteria) this;
        }

        public Criteria andOf_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("of_createdate >=", value, "of_createdate");
            return (Criteria) this;
        }

        public Criteria andOf_createdateLessThan(Date value) {
            addCriterion("of_createdate <", value, "of_createdate");
            return (Criteria) this;
        }

        public Criteria andOf_createdateLessThanOrEqualTo(Date value) {
            addCriterion("of_createdate <=", value, "of_createdate");
            return (Criteria) this;
        }

        public Criteria andOf_createdateIn(List<Date> values) {
            addCriterion("of_createdate in", values, "of_createdate");
            return (Criteria) this;
        }

        public Criteria andOf_createdateNotIn(List<Date> values) {
            addCriterion("of_createdate not in", values, "of_createdate");
            return (Criteria) this;
        }

        public Criteria andOf_createdateBetween(Date value1, Date value2) {
            addCriterion("of_createdate between", value1, value2, "of_createdate");
            return (Criteria) this;
        }

        public Criteria andOf_createdateNotBetween(Date value1, Date value2) {
            addCriterion("of_createdate not between", value1, value2, "of_createdate");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidIsNull() {
            addCriterion("of_confirmid is null");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidIsNotNull() {
            addCriterion("of_confirmid is not null");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidEqualTo(Long value) {
            addCriterion("of_confirmid =", value, "of_confirmid");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidNotEqualTo(Long value) {
            addCriterion("of_confirmid <>", value, "of_confirmid");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidGreaterThan(Long value) {
            addCriterion("of_confirmid >", value, "of_confirmid");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidGreaterThanOrEqualTo(Long value) {
            addCriterion("of_confirmid >=", value, "of_confirmid");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidLessThan(Long value) {
            addCriterion("of_confirmid <", value, "of_confirmid");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidLessThanOrEqualTo(Long value) {
            addCriterion("of_confirmid <=", value, "of_confirmid");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidIn(List<Long> values) {
            addCriterion("of_confirmid in", values, "of_confirmid");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidNotIn(List<Long> values) {
            addCriterion("of_confirmid not in", values, "of_confirmid");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidBetween(Long value1, Long value2) {
            addCriterion("of_confirmid between", value1, value2, "of_confirmid");
            return (Criteria) this;
        }

        public Criteria andOf_confirmidNotBetween(Long value1, Long value2) {
            addCriterion("of_confirmid not between", value1, value2, "of_confirmid");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoIsNull() {
            addCriterion("of_confirmno is null");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoIsNotNull() {
            addCriterion("of_confirmno is not null");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoEqualTo(String value) {
            addCriterion("of_confirmno =", value, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoNotEqualTo(String value) {
            addCriterion("of_confirmno <>", value, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoGreaterThan(String value) {
            addCriterion("of_confirmno >", value, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("of_confirmno >=", value, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoLessThan(String value) {
            addCriterion("of_confirmno <", value, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoLessThanOrEqualTo(String value) {
            addCriterion("of_confirmno <=", value, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoLike(String value) {
            addCriterion("of_confirmno like", value, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoNotLike(String value) {
            addCriterion("of_confirmno not like", value, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoIn(List<String> values) {
            addCriterion("of_confirmno in", values, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoNotIn(List<String> values) {
            addCriterion("of_confirmno not in", values, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoBetween(String value1, String value2) {
            addCriterion("of_confirmno between", value1, value2, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmnoNotBetween(String value1, String value2) {
            addCriterion("of_confirmno not between", value1, value2, "of_confirmno");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateIsNull() {
            addCriterion("of_confirmdate is null");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateIsNotNull() {
            addCriterion("of_confirmdate is not null");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateEqualTo(Date value) {
            addCriterion("of_confirmdate =", value, "of_confirmdate");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateNotEqualTo(Date value) {
            addCriterion("of_confirmdate <>", value, "of_confirmdate");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateGreaterThan(Date value) {
            addCriterion("of_confirmdate >", value, "of_confirmdate");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("of_confirmdate >=", value, "of_confirmdate");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateLessThan(Date value) {
            addCriterion("of_confirmdate <", value, "of_confirmdate");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateLessThanOrEqualTo(Date value) {
            addCriterion("of_confirmdate <=", value, "of_confirmdate");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateIn(List<Date> values) {
            addCriterion("of_confirmdate in", values, "of_confirmdate");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateNotIn(List<Date> values) {
            addCriterion("of_confirmdate not in", values, "of_confirmdate");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateBetween(Date value1, Date value2) {
            addCriterion("of_confirmdate between", value1, value2, "of_confirmdate");
            return (Criteria) this;
        }

        public Criteria andOf_confirmdateNotBetween(Date value1, Date value2) {
            addCriterion("of_confirmdate not between", value1, value2, "of_confirmdate");
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