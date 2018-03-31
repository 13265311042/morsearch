package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesV_Order_GuestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesV_Order_GuestExample() {
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

        public Criteria andDateupdatestrIsNull() {
            addCriterion("dateupdatestr is null");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrIsNotNull() {
            addCriterion("dateupdatestr is not null");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrEqualTo(String value) {
            addCriterion("dateupdatestr =", value, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrNotEqualTo(String value) {
            addCriterion("dateupdatestr <>", value, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrGreaterThan(String value) {
            addCriterion("dateupdatestr >", value, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrGreaterThanOrEqualTo(String value) {
            addCriterion("dateupdatestr >=", value, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrLessThan(String value) {
            addCriterion("dateupdatestr <", value, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrLessThanOrEqualTo(String value) {
            addCriterion("dateupdatestr <=", value, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrLike(String value) {
            addCriterion("dateupdatestr like", value, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrNotLike(String value) {
            addCriterion("dateupdatestr not like", value, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrIn(List<String> values) {
            addCriterion("dateupdatestr in", values, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrNotIn(List<String> values) {
            addCriterion("dateupdatestr not in", values, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrBetween(String value1, String value2) {
            addCriterion("dateupdatestr between", value1, value2, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andDateupdatestrNotBetween(String value1, String value2) {
            addCriterion("dateupdatestr not between", value1, value2, "dateupdatestr");
            return (Criteria) this;
        }

        public Criteria andSale_nameIsNull() {
            addCriterion("sale_name is null");
            return (Criteria) this;
        }

        public Criteria andSale_nameIsNotNull() {
            addCriterion("sale_name is not null");
            return (Criteria) this;
        }

        public Criteria andSale_nameEqualTo(String value) {
            addCriterion("sale_name =", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameNotEqualTo(String value) {
            addCriterion("sale_name <>", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameGreaterThan(String value) {
            addCriterion("sale_name >", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sale_name >=", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameLessThan(String value) {
            addCriterion("sale_name <", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameLessThanOrEqualTo(String value) {
            addCriterion("sale_name <=", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameLike(String value) {
            addCriterion("sale_name like", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameNotLike(String value) {
            addCriterion("sale_name not like", value, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameIn(List<String> values) {
            addCriterion("sale_name in", values, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameNotIn(List<String> values) {
            addCriterion("sale_name not in", values, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameBetween(String value1, String value2) {
            addCriterion("sale_name between", value1, value2, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_nameNotBetween(String value1, String value2) {
            addCriterion("sale_name not between", value1, value2, "sale_name");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlIsNull() {
            addCriterion("sale_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlIsNotNull() {
            addCriterion("sale_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlEqualTo(String value) {
            addCriterion("sale_imageurl =", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlNotEqualTo(String value) {
            addCriterion("sale_imageurl <>", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlGreaterThan(String value) {
            addCriterion("sale_imageurl >", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlGreaterThanOrEqualTo(String value) {
            addCriterion("sale_imageurl >=", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlLessThan(String value) {
            addCriterion("sale_imageurl <", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlLessThanOrEqualTo(String value) {
            addCriterion("sale_imageurl <=", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlLike(String value) {
            addCriterion("sale_imageurl like", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlNotLike(String value) {
            addCriterion("sale_imageurl not like", value, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlIn(List<String> values) {
            addCriterion("sale_imageurl in", values, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlNotIn(List<String> values) {
            addCriterion("sale_imageurl not in", values, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlBetween(String value1, String value2) {
            addCriterion("sale_imageurl between", value1, value2, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_imageurlNotBetween(String value1, String value2) {
            addCriterion("sale_imageurl not between", value1, value2, "sale_imageurl");
            return (Criteria) this;
        }

        public Criteria andSale_sexIsNull() {
            addCriterion("sale_sex is null");
            return (Criteria) this;
        }

        public Criteria andSale_sexIsNotNull() {
            addCriterion("sale_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSale_sexEqualTo(String value) {
            addCriterion("sale_sex =", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexNotEqualTo(String value) {
            addCriterion("sale_sex <>", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexGreaterThan(String value) {
            addCriterion("sale_sex >", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexGreaterThanOrEqualTo(String value) {
            addCriterion("sale_sex >=", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexLessThan(String value) {
            addCriterion("sale_sex <", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexLessThanOrEqualTo(String value) {
            addCriterion("sale_sex <=", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexLike(String value) {
            addCriterion("sale_sex like", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexNotLike(String value) {
            addCriterion("sale_sex not like", value, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexIn(List<String> values) {
            addCriterion("sale_sex in", values, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexNotIn(List<String> values) {
            addCriterion("sale_sex not in", values, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexBetween(String value1, String value2) {
            addCriterion("sale_sex between", value1, value2, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_sexNotBetween(String value1, String value2) {
            addCriterion("sale_sex not between", value1, value2, "sale_sex");
            return (Criteria) this;
        }

        public Criteria andSale_idIsNull() {
            addCriterion("sale_id is null");
            return (Criteria) this;
        }

        public Criteria andSale_idIsNotNull() {
            addCriterion("sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andSale_idEqualTo(Long value) {
            addCriterion("sale_id =", value, "sale_id");
            return (Criteria) this;
        }

        public Criteria andSale_idNotEqualTo(Long value) {
            addCriterion("sale_id <>", value, "sale_id");
            return (Criteria) this;
        }

        public Criteria andSale_idGreaterThan(Long value) {
            addCriterion("sale_id >", value, "sale_id");
            return (Criteria) this;
        }

        public Criteria andSale_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_id >=", value, "sale_id");
            return (Criteria) this;
        }

        public Criteria andSale_idLessThan(Long value) {
            addCriterion("sale_id <", value, "sale_id");
            return (Criteria) this;
        }

        public Criteria andSale_idLessThanOrEqualTo(Long value) {
            addCriterion("sale_id <=", value, "sale_id");
            return (Criteria) this;
        }

        public Criteria andSale_idIn(List<Long> values) {
            addCriterion("sale_id in", values, "sale_id");
            return (Criteria) this;
        }

        public Criteria andSale_idNotIn(List<Long> values) {
            addCriterion("sale_id not in", values, "sale_id");
            return (Criteria) this;
        }

        public Criteria andSale_idBetween(Long value1, Long value2) {
            addCriterion("sale_id between", value1, value2, "sale_id");
            return (Criteria) this;
        }

        public Criteria andSale_idNotBetween(Long value1, Long value2) {
            addCriterion("sale_id not between", value1, value2, "sale_id");
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

        public Criteria andStatusnameIsNull() {
            addCriterion("statusname is null");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNotNull() {
            addCriterion("statusname is not null");
            return (Criteria) this;
        }

        public Criteria andStatusnameEqualTo(String value) {
            addCriterion("statusname =", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotEqualTo(String value) {
            addCriterion("statusname <>", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThan(String value) {
            addCriterion("statusname >", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThanOrEqualTo(String value) {
            addCriterion("statusname >=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThan(String value) {
            addCriterion("statusname <", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThanOrEqualTo(String value) {
            addCriterion("statusname <=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLike(String value) {
            addCriterion("statusname like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotLike(String value) {
            addCriterion("statusname not like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameIn(List<String> values) {
            addCriterion("statusname in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotIn(List<String> values) {
            addCriterion("statusname not in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameBetween(String value1, String value2) {
            addCriterion("statusname between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotBetween(String value1, String value2) {
            addCriterion("statusname not between", value1, value2, "statusname");
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

        public Criteria andDesig_nameIsNull() {
            addCriterion("desig_name is null");
            return (Criteria) this;
        }

        public Criteria andDesig_nameIsNotNull() {
            addCriterion("desig_name is not null");
            return (Criteria) this;
        }

        public Criteria andDesig_nameEqualTo(String value) {
            addCriterion("desig_name =", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameNotEqualTo(String value) {
            addCriterion("desig_name <>", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameGreaterThan(String value) {
            addCriterion("desig_name >", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameGreaterThanOrEqualTo(String value) {
            addCriterion("desig_name >=", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameLessThan(String value) {
            addCriterion("desig_name <", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameLessThanOrEqualTo(String value) {
            addCriterion("desig_name <=", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameLike(String value) {
            addCriterion("desig_name like", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameNotLike(String value) {
            addCriterion("desig_name not like", value, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameIn(List<String> values) {
            addCriterion("desig_name in", values, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameNotIn(List<String> values) {
            addCriterion("desig_name not in", values, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameBetween(String value1, String value2) {
            addCriterion("desig_name between", value1, value2, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_nameNotBetween(String value1, String value2) {
            addCriterion("desig_name not between", value1, value2, "desig_name");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlIsNull() {
            addCriterion("desig_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlIsNotNull() {
            addCriterion("desig_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlEqualTo(String value) {
            addCriterion("desig_imageurl =", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlNotEqualTo(String value) {
            addCriterion("desig_imageurl <>", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlGreaterThan(String value) {
            addCriterion("desig_imageurl >", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlGreaterThanOrEqualTo(String value) {
            addCriterion("desig_imageurl >=", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlLessThan(String value) {
            addCriterion("desig_imageurl <", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlLessThanOrEqualTo(String value) {
            addCriterion("desig_imageurl <=", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlLike(String value) {
            addCriterion("desig_imageurl like", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlNotLike(String value) {
            addCriterion("desig_imageurl not like", value, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlIn(List<String> values) {
            addCriterion("desig_imageurl in", values, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlNotIn(List<String> values) {
            addCriterion("desig_imageurl not in", values, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlBetween(String value1, String value2) {
            addCriterion("desig_imageurl between", value1, value2, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_imageurlNotBetween(String value1, String value2) {
            addCriterion("desig_imageurl not between", value1, value2, "desig_imageurl");
            return (Criteria) this;
        }

        public Criteria andDesig_sexIsNull() {
            addCriterion("desig_sex is null");
            return (Criteria) this;
        }

        public Criteria andDesig_sexIsNotNull() {
            addCriterion("desig_sex is not null");
            return (Criteria) this;
        }

        public Criteria andDesig_sexEqualTo(String value) {
            addCriterion("desig_sex =", value, "desig_sex");
            return (Criteria) this;
        }

        public Criteria andDesig_sexNotEqualTo(String value) {
            addCriterion("desig_sex <>", value, "desig_sex");
            return (Criteria) this;
        }

        public Criteria andDesig_sexGreaterThan(String value) {
            addCriterion("desig_sex >", value, "desig_sex");
            return (Criteria) this;
        }

        public Criteria andDesig_sexGreaterThanOrEqualTo(String value) {
            addCriterion("desig_sex >=", value, "desig_sex");
            return (Criteria) this;
        }

        public Criteria andDesig_sexLessThan(String value) {
            addCriterion("desig_sex <", value, "desig_sex");
            return (Criteria) this;
        }

        public Criteria andDesig_sexLessThanOrEqualTo(String value) {
            addCriterion("desig_sex <=", value, "desig_sex");
            return (Criteria) this;
        }

        public Criteria andDesig_sexLike(String value) {
            addCriterion("desig_sex like", value, "desig_sex");
            return (Criteria) this;
        }

        public Criteria andDesig_sexNotLike(String value) {
            addCriterion("desig_sex not like", value, "desig_sex");
            return (Criteria) this;
        }

        public Criteria andDesig_sexIn(List<String> values) {
            addCriterion("desig_sex in", values, "desig_sex");
            return (Criteria) this;
        }

        public Criteria andDesig_sexNotIn(List<String> values) {
            addCriterion("desig_sex not in", values, "desig_sex");
            return (Criteria) this;
        }

        public Criteria andDesig_sexBetween(String value1, String value2) {
            addCriterion("desig_sex between", value1, value2, "desig_sex");
            return (Criteria) this;
        }

        public Criteria andDesig_sexNotBetween(String value1, String value2) {
            addCriterion("desig_sex not between", value1, value2, "desig_sex");
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