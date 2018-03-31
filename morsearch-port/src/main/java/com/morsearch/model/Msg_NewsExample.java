package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Msg_NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Msg_NewsExample() {
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

        public Criteria andMn_idIsNull() {
            addCriterion("mn_id is null");
            return (Criteria) this;
        }

        public Criteria andMn_idIsNotNull() {
            addCriterion("mn_id is not null");
            return (Criteria) this;
        }

        public Criteria andMn_idEqualTo(Long value) {
            addCriterion("mn_id =", value, "mn_id");
            return (Criteria) this;
        }

        public Criteria andMn_idNotEqualTo(Long value) {
            addCriterion("mn_id <>", value, "mn_id");
            return (Criteria) this;
        }

        public Criteria andMn_idGreaterThan(Long value) {
            addCriterion("mn_id >", value, "mn_id");
            return (Criteria) this;
        }

        public Criteria andMn_idGreaterThanOrEqualTo(Long value) {
            addCriterion("mn_id >=", value, "mn_id");
            return (Criteria) this;
        }

        public Criteria andMn_idLessThan(Long value) {
            addCriterion("mn_id <", value, "mn_id");
            return (Criteria) this;
        }

        public Criteria andMn_idLessThanOrEqualTo(Long value) {
            addCriterion("mn_id <=", value, "mn_id");
            return (Criteria) this;
        }

        public Criteria andMn_idIn(List<Long> values) {
            addCriterion("mn_id in", values, "mn_id");
            return (Criteria) this;
        }

        public Criteria andMn_idNotIn(List<Long> values) {
            addCriterion("mn_id not in", values, "mn_id");
            return (Criteria) this;
        }

        public Criteria andMn_idBetween(Long value1, Long value2) {
            addCriterion("mn_id between", value1, value2, "mn_id");
            return (Criteria) this;
        }

        public Criteria andMn_idNotBetween(Long value1, Long value2) {
            addCriterion("mn_id not between", value1, value2, "mn_id");
            return (Criteria) this;
        }

        public Criteria andMn_indexIsNull() {
            addCriterion("mn_index is null");
            return (Criteria) this;
        }

        public Criteria andMn_indexIsNotNull() {
            addCriterion("mn_index is not null");
            return (Criteria) this;
        }

        public Criteria andMn_indexEqualTo(Integer value) {
            addCriterion("mn_index =", value, "mn_index");
            return (Criteria) this;
        }

        public Criteria andMn_indexNotEqualTo(Integer value) {
            addCriterion("mn_index <>", value, "mn_index");
            return (Criteria) this;
        }

        public Criteria andMn_indexGreaterThan(Integer value) {
            addCriterion("mn_index >", value, "mn_index");
            return (Criteria) this;
        }

        public Criteria andMn_indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("mn_index >=", value, "mn_index");
            return (Criteria) this;
        }

        public Criteria andMn_indexLessThan(Integer value) {
            addCriterion("mn_index <", value, "mn_index");
            return (Criteria) this;
        }

        public Criteria andMn_indexLessThanOrEqualTo(Integer value) {
            addCriterion("mn_index <=", value, "mn_index");
            return (Criteria) this;
        }

        public Criteria andMn_indexIn(List<Integer> values) {
            addCriterion("mn_index in", values, "mn_index");
            return (Criteria) this;
        }

        public Criteria andMn_indexNotIn(List<Integer> values) {
            addCriterion("mn_index not in", values, "mn_index");
            return (Criteria) this;
        }

        public Criteria andMn_indexBetween(Integer value1, Integer value2) {
            addCriterion("mn_index between", value1, value2, "mn_index");
            return (Criteria) this;
        }

        public Criteria andMn_indexNotBetween(Integer value1, Integer value2) {
            addCriterion("mn_index not between", value1, value2, "mn_index");
            return (Criteria) this;
        }

        public Criteria andMn_titleIsNull() {
            addCriterion("mn_title is null");
            return (Criteria) this;
        }

        public Criteria andMn_titleIsNotNull() {
            addCriterion("mn_title is not null");
            return (Criteria) this;
        }

        public Criteria andMn_titleEqualTo(String value) {
            addCriterion("mn_title =", value, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_titleNotEqualTo(String value) {
            addCriterion("mn_title <>", value, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_titleGreaterThan(String value) {
            addCriterion("mn_title >", value, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_titleGreaterThanOrEqualTo(String value) {
            addCriterion("mn_title >=", value, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_titleLessThan(String value) {
            addCriterion("mn_title <", value, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_titleLessThanOrEqualTo(String value) {
            addCriterion("mn_title <=", value, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_titleLike(String value) {
            addCriterion("mn_title like", value, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_titleNotLike(String value) {
            addCriterion("mn_title not like", value, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_titleIn(List<String> values) {
            addCriterion("mn_title in", values, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_titleNotIn(List<String> values) {
            addCriterion("mn_title not in", values, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_titleBetween(String value1, String value2) {
            addCriterion("mn_title between", value1, value2, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_titleNotBetween(String value1, String value2) {
            addCriterion("mn_title not between", value1, value2, "mn_title");
            return (Criteria) this;
        }

        public Criteria andMn_headpicIsNull() {
            addCriterion("mn_headpic is null");
            return (Criteria) this;
        }

        public Criteria andMn_headpicIsNotNull() {
            addCriterion("mn_headpic is not null");
            return (Criteria) this;
        }

        public Criteria andMn_headpicEqualTo(String value) {
            addCriterion("mn_headpic =", value, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headpicNotEqualTo(String value) {
            addCriterion("mn_headpic <>", value, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headpicGreaterThan(String value) {
            addCriterion("mn_headpic >", value, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headpicGreaterThanOrEqualTo(String value) {
            addCriterion("mn_headpic >=", value, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headpicLessThan(String value) {
            addCriterion("mn_headpic <", value, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headpicLessThanOrEqualTo(String value) {
            addCriterion("mn_headpic <=", value, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headpicLike(String value) {
            addCriterion("mn_headpic like", value, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headpicNotLike(String value) {
            addCriterion("mn_headpic not like", value, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headpicIn(List<String> values) {
            addCriterion("mn_headpic in", values, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headpicNotIn(List<String> values) {
            addCriterion("mn_headpic not in", values, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headpicBetween(String value1, String value2) {
            addCriterion("mn_headpic between", value1, value2, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headpicNotBetween(String value1, String value2) {
            addCriterion("mn_headpic not between", value1, value2, "mn_headpic");
            return (Criteria) this;
        }

        public Criteria andMn_headisvIsNull() {
            addCriterion("mn_headisv is null");
            return (Criteria) this;
        }

        public Criteria andMn_headisvIsNotNull() {
            addCriterion("mn_headisv is not null");
            return (Criteria) this;
        }

        public Criteria andMn_headisvEqualTo(Boolean value) {
            addCriterion("mn_headisv =", value, "mn_headisv");
            return (Criteria) this;
        }

        public Criteria andMn_headisvNotEqualTo(Boolean value) {
            addCriterion("mn_headisv <>", value, "mn_headisv");
            return (Criteria) this;
        }

        public Criteria andMn_headisvGreaterThan(Boolean value) {
            addCriterion("mn_headisv >", value, "mn_headisv");
            return (Criteria) this;
        }

        public Criteria andMn_headisvGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mn_headisv >=", value, "mn_headisv");
            return (Criteria) this;
        }

        public Criteria andMn_headisvLessThan(Boolean value) {
            addCriterion("mn_headisv <", value, "mn_headisv");
            return (Criteria) this;
        }

        public Criteria andMn_headisvLessThanOrEqualTo(Boolean value) {
            addCriterion("mn_headisv <=", value, "mn_headisv");
            return (Criteria) this;
        }

        public Criteria andMn_headisvIn(List<Boolean> values) {
            addCriterion("mn_headisv in", values, "mn_headisv");
            return (Criteria) this;
        }

        public Criteria andMn_headisvNotIn(List<Boolean> values) {
            addCriterion("mn_headisv not in", values, "mn_headisv");
            return (Criteria) this;
        }

        public Criteria andMn_headisvBetween(Boolean value1, Boolean value2) {
            addCriterion("mn_headisv between", value1, value2, "mn_headisv");
            return (Criteria) this;
        }

        public Criteria andMn_headisvNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mn_headisv not between", value1, value2, "mn_headisv");
            return (Criteria) this;
        }

        public Criteria andMn_keywordIsNull() {
            addCriterion("mn_keyword is null");
            return (Criteria) this;
        }

        public Criteria andMn_keywordIsNotNull() {
            addCriterion("mn_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andMn_keywordEqualTo(String value) {
            addCriterion("mn_keyword =", value, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_keywordNotEqualTo(String value) {
            addCriterion("mn_keyword <>", value, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_keywordGreaterThan(String value) {
            addCriterion("mn_keyword >", value, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_keywordGreaterThanOrEqualTo(String value) {
            addCriterion("mn_keyword >=", value, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_keywordLessThan(String value) {
            addCriterion("mn_keyword <", value, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_keywordLessThanOrEqualTo(String value) {
            addCriterion("mn_keyword <=", value, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_keywordLike(String value) {
            addCriterion("mn_keyword like", value, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_keywordNotLike(String value) {
            addCriterion("mn_keyword not like", value, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_keywordIn(List<String> values) {
            addCriterion("mn_keyword in", values, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_keywordNotIn(List<String> values) {
            addCriterion("mn_keyword not in", values, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_keywordBetween(String value1, String value2) {
            addCriterion("mn_keyword between", value1, value2, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_keywordNotBetween(String value1, String value2) {
            addCriterion("mn_keyword not between", value1, value2, "mn_keyword");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyIsNull() {
            addCriterion("mn_clickqty is null");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyIsNotNull() {
            addCriterion("mn_clickqty is not null");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyEqualTo(Integer value) {
            addCriterion("mn_clickqty =", value, "mn_clickqty");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyNotEqualTo(Integer value) {
            addCriterion("mn_clickqty <>", value, "mn_clickqty");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyGreaterThan(Integer value) {
            addCriterion("mn_clickqty >", value, "mn_clickqty");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("mn_clickqty >=", value, "mn_clickqty");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyLessThan(Integer value) {
            addCriterion("mn_clickqty <", value, "mn_clickqty");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyLessThanOrEqualTo(Integer value) {
            addCriterion("mn_clickqty <=", value, "mn_clickqty");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyIn(List<Integer> values) {
            addCriterion("mn_clickqty in", values, "mn_clickqty");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyNotIn(List<Integer> values) {
            addCriterion("mn_clickqty not in", values, "mn_clickqty");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyBetween(Integer value1, Integer value2) {
            addCriterion("mn_clickqty between", value1, value2, "mn_clickqty");
            return (Criteria) this;
        }

        public Criteria andMn_clickqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("mn_clickqty not between", value1, value2, "mn_clickqty");
            return (Criteria) this;
        }

        public Criteria andMn_typeIsNull() {
            addCriterion("mn_type is null");
            return (Criteria) this;
        }

        public Criteria andMn_typeIsNotNull() {
            addCriterion("mn_type is not null");
            return (Criteria) this;
        }

        public Criteria andMn_typeEqualTo(Byte value) {
            addCriterion("mn_type =", value, "mn_type");
            return (Criteria) this;
        }

        public Criteria andMn_typeNotEqualTo(Byte value) {
            addCriterion("mn_type <>", value, "mn_type");
            return (Criteria) this;
        }

        public Criteria andMn_typeGreaterThan(Byte value) {
            addCriterion("mn_type >", value, "mn_type");
            return (Criteria) this;
        }

        public Criteria andMn_typeGreaterThanOrEqualTo(Byte value) {
            addCriterion("mn_type >=", value, "mn_type");
            return (Criteria) this;
        }

        public Criteria andMn_typeLessThan(Byte value) {
            addCriterion("mn_type <", value, "mn_type");
            return (Criteria) this;
        }

        public Criteria andMn_typeLessThanOrEqualTo(Byte value) {
            addCriterion("mn_type <=", value, "mn_type");
            return (Criteria) this;
        }

        public Criteria andMn_typeIn(List<Byte> values) {
            addCriterion("mn_type in", values, "mn_type");
            return (Criteria) this;
        }

        public Criteria andMn_typeNotIn(List<Byte> values) {
            addCriterion("mn_type not in", values, "mn_type");
            return (Criteria) this;
        }

        public Criteria andMn_typeBetween(Byte value1, Byte value2) {
            addCriterion("mn_type between", value1, value2, "mn_type");
            return (Criteria) this;
        }

        public Criteria andMn_typeNotBetween(Byte value1, Byte value2) {
            addCriterion("mn_type not between", value1, value2, "mn_type");
            return (Criteria) this;
        }

        public Criteria andMn_createnoIsNull() {
            addCriterion("mn_createno is null");
            return (Criteria) this;
        }

        public Criteria andMn_createnoIsNotNull() {
            addCriterion("mn_createno is not null");
            return (Criteria) this;
        }

        public Criteria andMn_createnoEqualTo(String value) {
            addCriterion("mn_createno =", value, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createnoNotEqualTo(String value) {
            addCriterion("mn_createno <>", value, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createnoGreaterThan(String value) {
            addCriterion("mn_createno >", value, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("mn_createno >=", value, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createnoLessThan(String value) {
            addCriterion("mn_createno <", value, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createnoLessThanOrEqualTo(String value) {
            addCriterion("mn_createno <=", value, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createnoLike(String value) {
            addCriterion("mn_createno like", value, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createnoNotLike(String value) {
            addCriterion("mn_createno not like", value, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createnoIn(List<String> values) {
            addCriterion("mn_createno in", values, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createnoNotIn(List<String> values) {
            addCriterion("mn_createno not in", values, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createnoBetween(String value1, String value2) {
            addCriterion("mn_createno between", value1, value2, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createnoNotBetween(String value1, String value2) {
            addCriterion("mn_createno not between", value1, value2, "mn_createno");
            return (Criteria) this;
        }

        public Criteria andMn_createdateIsNull() {
            addCriterion("mn_createdate is null");
            return (Criteria) this;
        }

        public Criteria andMn_createdateIsNotNull() {
            addCriterion("mn_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andMn_createdateEqualTo(Date value) {
            addCriterion("mn_createdate =", value, "mn_createdate");
            return (Criteria) this;
        }

        public Criteria andMn_createdateNotEqualTo(Date value) {
            addCriterion("mn_createdate <>", value, "mn_createdate");
            return (Criteria) this;
        }

        public Criteria andMn_createdateGreaterThan(Date value) {
            addCriterion("mn_createdate >", value, "mn_createdate");
            return (Criteria) this;
        }

        public Criteria andMn_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("mn_createdate >=", value, "mn_createdate");
            return (Criteria) this;
        }

        public Criteria andMn_createdateLessThan(Date value) {
            addCriterion("mn_createdate <", value, "mn_createdate");
            return (Criteria) this;
        }

        public Criteria andMn_createdateLessThanOrEqualTo(Date value) {
            addCriterion("mn_createdate <=", value, "mn_createdate");
            return (Criteria) this;
        }

        public Criteria andMn_createdateIn(List<Date> values) {
            addCriterion("mn_createdate in", values, "mn_createdate");
            return (Criteria) this;
        }

        public Criteria andMn_createdateNotIn(List<Date> values) {
            addCriterion("mn_createdate not in", values, "mn_createdate");
            return (Criteria) this;
        }

        public Criteria andMn_createdateBetween(Date value1, Date value2) {
            addCriterion("mn_createdate between", value1, value2, "mn_createdate");
            return (Criteria) this;
        }

        public Criteria andMn_createdateNotBetween(Date value1, Date value2) {
            addCriterion("mn_createdate not between", value1, value2, "mn_createdate");
            return (Criteria) this;
        }

        public Criteria andMn_statusIsNull() {
            addCriterion("mn_status is null");
            return (Criteria) this;
        }

        public Criteria andMn_statusIsNotNull() {
            addCriterion("mn_status is not null");
            return (Criteria) this;
        }

        public Criteria andMn_statusEqualTo(Byte value) {
            addCriterion("mn_status =", value, "mn_status");
            return (Criteria) this;
        }

        public Criteria andMn_statusNotEqualTo(Byte value) {
            addCriterion("mn_status <>", value, "mn_status");
            return (Criteria) this;
        }

        public Criteria andMn_statusGreaterThan(Byte value) {
            addCriterion("mn_status >", value, "mn_status");
            return (Criteria) this;
        }

        public Criteria andMn_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("mn_status >=", value, "mn_status");
            return (Criteria) this;
        }

        public Criteria andMn_statusLessThan(Byte value) {
            addCriterion("mn_status <", value, "mn_status");
            return (Criteria) this;
        }

        public Criteria andMn_statusLessThanOrEqualTo(Byte value) {
            addCriterion("mn_status <=", value, "mn_status");
            return (Criteria) this;
        }

        public Criteria andMn_statusIn(List<Byte> values) {
            addCriterion("mn_status in", values, "mn_status");
            return (Criteria) this;
        }

        public Criteria andMn_statusNotIn(List<Byte> values) {
            addCriterion("mn_status not in", values, "mn_status");
            return (Criteria) this;
        }

        public Criteria andMn_statusBetween(Byte value1, Byte value2) {
            addCriterion("mn_status between", value1, value2, "mn_status");
            return (Criteria) this;
        }

        public Criteria andMn_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("mn_status not between", value1, value2, "mn_status");
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