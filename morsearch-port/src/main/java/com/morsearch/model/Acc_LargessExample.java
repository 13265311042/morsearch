package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Acc_LargessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Acc_LargessExample() {
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

        public Criteria andAl_idIsNull() {
            addCriterion("al_id is null");
            return (Criteria) this;
        }

        public Criteria andAl_idIsNotNull() {
            addCriterion("al_id is not null");
            return (Criteria) this;
        }

        public Criteria andAl_idEqualTo(Integer value) {
            addCriterion("al_id =", value, "al_id");
            return (Criteria) this;
        }

        public Criteria andAl_idNotEqualTo(Integer value) {
            addCriterion("al_id <>", value, "al_id");
            return (Criteria) this;
        }

        public Criteria andAl_idGreaterThan(Integer value) {
            addCriterion("al_id >", value, "al_id");
            return (Criteria) this;
        }

        public Criteria andAl_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_id >=", value, "al_id");
            return (Criteria) this;
        }

        public Criteria andAl_idLessThan(Integer value) {
            addCriterion("al_id <", value, "al_id");
            return (Criteria) this;
        }

        public Criteria andAl_idLessThanOrEqualTo(Integer value) {
            addCriterion("al_id <=", value, "al_id");
            return (Criteria) this;
        }

        public Criteria andAl_idIn(List<Integer> values) {
            addCriterion("al_id in", values, "al_id");
            return (Criteria) this;
        }

        public Criteria andAl_idNotIn(List<Integer> values) {
            addCriterion("al_id not in", values, "al_id");
            return (Criteria) this;
        }

        public Criteria andAl_idBetween(Integer value1, Integer value2) {
            addCriterion("al_id between", value1, value2, "al_id");
            return (Criteria) this;
        }

        public Criteria andAl_idNotBetween(Integer value1, Integer value2) {
            addCriterion("al_id not between", value1, value2, "al_id");
            return (Criteria) this;
        }

        public Criteria andAl_typeIsNull() {
            addCriterion("al_type is null");
            return (Criteria) this;
        }

        public Criteria andAl_typeIsNotNull() {
            addCriterion("al_type is not null");
            return (Criteria) this;
        }

        public Criteria andAl_typeEqualTo(String value) {
            addCriterion("al_type =", value, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_typeNotEqualTo(String value) {
            addCriterion("al_type <>", value, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_typeGreaterThan(String value) {
            addCriterion("al_type >", value, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_typeGreaterThanOrEqualTo(String value) {
            addCriterion("al_type >=", value, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_typeLessThan(String value) {
            addCriterion("al_type <", value, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_typeLessThanOrEqualTo(String value) {
            addCriterion("al_type <=", value, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_typeLike(String value) {
            addCriterion("al_type like", value, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_typeNotLike(String value) {
            addCriterion("al_type not like", value, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_typeIn(List<String> values) {
            addCriterion("al_type in", values, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_typeNotIn(List<String> values) {
            addCriterion("al_type not in", values, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_typeBetween(String value1, String value2) {
            addCriterion("al_type between", value1, value2, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_typeNotBetween(String value1, String value2) {
            addCriterion("al_type not between", value1, value2, "al_type");
            return (Criteria) this;
        }

        public Criteria andAl_teamIsNull() {
            addCriterion("al_team is null");
            return (Criteria) this;
        }

        public Criteria andAl_teamIsNotNull() {
            addCriterion("al_team is not null");
            return (Criteria) this;
        }

        public Criteria andAl_teamEqualTo(String value) {
            addCriterion("al_team =", value, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_teamNotEqualTo(String value) {
            addCriterion("al_team <>", value, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_teamGreaterThan(String value) {
            addCriterion("al_team >", value, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_teamGreaterThanOrEqualTo(String value) {
            addCriterion("al_team >=", value, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_teamLessThan(String value) {
            addCriterion("al_team <", value, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_teamLessThanOrEqualTo(String value) {
            addCriterion("al_team <=", value, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_teamLike(String value) {
            addCriterion("al_team like", value, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_teamNotLike(String value) {
            addCriterion("al_team not like", value, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_teamIn(List<String> values) {
            addCriterion("al_team in", values, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_teamNotIn(List<String> values) {
            addCriterion("al_team not in", values, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_teamBetween(String value1, String value2) {
            addCriterion("al_team between", value1, value2, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_teamNotBetween(String value1, String value2) {
            addCriterion("al_team not between", value1, value2, "al_team");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginIsNull() {
            addCriterion("al_datebegin is null");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginIsNotNull() {
            addCriterion("al_datebegin is not null");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginEqualTo(String value) {
            addCriterion("al_datebegin =", value, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginNotEqualTo(String value) {
            addCriterion("al_datebegin <>", value, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginGreaterThan(String value) {
            addCriterion("al_datebegin >", value, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginGreaterThanOrEqualTo(String value) {
            addCriterion("al_datebegin >=", value, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginLessThan(String value) {
            addCriterion("al_datebegin <", value, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginLessThanOrEqualTo(String value) {
            addCriterion("al_datebegin <=", value, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginLike(String value) {
            addCriterion("al_datebegin like", value, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginNotLike(String value) {
            addCriterion("al_datebegin not like", value, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginIn(List<String> values) {
            addCriterion("al_datebegin in", values, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginNotIn(List<String> values) {
            addCriterion("al_datebegin not in", values, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginBetween(String value1, String value2) {
            addCriterion("al_datebegin between", value1, value2, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_datebeginNotBetween(String value1, String value2) {
            addCriterion("al_datebegin not between", value1, value2, "al_datebegin");
            return (Criteria) this;
        }

        public Criteria andAl_dateendIsNull() {
            addCriterion("al_dateend is null");
            return (Criteria) this;
        }

        public Criteria andAl_dateendIsNotNull() {
            addCriterion("al_dateend is not null");
            return (Criteria) this;
        }

        public Criteria andAl_dateendEqualTo(String value) {
            addCriterion("al_dateend =", value, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_dateendNotEqualTo(String value) {
            addCriterion("al_dateend <>", value, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_dateendGreaterThan(String value) {
            addCriterion("al_dateend >", value, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_dateendGreaterThanOrEqualTo(String value) {
            addCriterion("al_dateend >=", value, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_dateendLessThan(String value) {
            addCriterion("al_dateend <", value, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_dateendLessThanOrEqualTo(String value) {
            addCriterion("al_dateend <=", value, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_dateendLike(String value) {
            addCriterion("al_dateend like", value, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_dateendNotLike(String value) {
            addCriterion("al_dateend not like", value, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_dateendIn(List<String> values) {
            addCriterion("al_dateend in", values, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_dateendNotIn(List<String> values) {
            addCriterion("al_dateend not in", values, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_dateendBetween(String value1, String value2) {
            addCriterion("al_dateend between", value1, value2, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_dateendNotBetween(String value1, String value2) {
            addCriterion("al_dateend not between", value1, value2, "al_dateend");
            return (Criteria) this;
        }

        public Criteria andAl_valueminIsNull() {
            addCriterion("al_valuemin is null");
            return (Criteria) this;
        }

        public Criteria andAl_valueminIsNotNull() {
            addCriterion("al_valuemin is not null");
            return (Criteria) this;
        }

        public Criteria andAl_valueminEqualTo(Integer value) {
            addCriterion("al_valuemin =", value, "al_valuemin");
            return (Criteria) this;
        }

        public Criteria andAl_valueminNotEqualTo(Integer value) {
            addCriterion("al_valuemin <>", value, "al_valuemin");
            return (Criteria) this;
        }

        public Criteria andAl_valueminGreaterThan(Integer value) {
            addCriterion("al_valuemin >", value, "al_valuemin");
            return (Criteria) this;
        }

        public Criteria andAl_valueminGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_valuemin >=", value, "al_valuemin");
            return (Criteria) this;
        }

        public Criteria andAl_valueminLessThan(Integer value) {
            addCriterion("al_valuemin <", value, "al_valuemin");
            return (Criteria) this;
        }

        public Criteria andAl_valueminLessThanOrEqualTo(Integer value) {
            addCriterion("al_valuemin <=", value, "al_valuemin");
            return (Criteria) this;
        }

        public Criteria andAl_valueminIn(List<Integer> values) {
            addCriterion("al_valuemin in", values, "al_valuemin");
            return (Criteria) this;
        }

        public Criteria andAl_valueminNotIn(List<Integer> values) {
            addCriterion("al_valuemin not in", values, "al_valuemin");
            return (Criteria) this;
        }

        public Criteria andAl_valueminBetween(Integer value1, Integer value2) {
            addCriterion("al_valuemin between", value1, value2, "al_valuemin");
            return (Criteria) this;
        }

        public Criteria andAl_valueminNotBetween(Integer value1, Integer value2) {
            addCriterion("al_valuemin not between", value1, value2, "al_valuemin");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxIsNull() {
            addCriterion("al_valuemax is null");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxIsNotNull() {
            addCriterion("al_valuemax is not null");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxEqualTo(Integer value) {
            addCriterion("al_valuemax =", value, "al_valuemax");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxNotEqualTo(Integer value) {
            addCriterion("al_valuemax <>", value, "al_valuemax");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxGreaterThan(Integer value) {
            addCriterion("al_valuemax >", value, "al_valuemax");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_valuemax >=", value, "al_valuemax");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxLessThan(Integer value) {
            addCriterion("al_valuemax <", value, "al_valuemax");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxLessThanOrEqualTo(Integer value) {
            addCriterion("al_valuemax <=", value, "al_valuemax");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxIn(List<Integer> values) {
            addCriterion("al_valuemax in", values, "al_valuemax");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxNotIn(List<Integer> values) {
            addCriterion("al_valuemax not in", values, "al_valuemax");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxBetween(Integer value1, Integer value2) {
            addCriterion("al_valuemax between", value1, value2, "al_valuemax");
            return (Criteria) this;
        }

        public Criteria andAl_valuemaxNotBetween(Integer value1, Integer value2) {
            addCriterion("al_valuemax not between", value1, value2, "al_valuemax");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeIsNull() {
            addCriterion("al_addmode is null");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeIsNotNull() {
            addCriterion("al_addmode is not null");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeEqualTo(Byte value) {
            addCriterion("al_addmode =", value, "al_addmode");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeNotEqualTo(Byte value) {
            addCriterion("al_addmode <>", value, "al_addmode");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeGreaterThan(Byte value) {
            addCriterion("al_addmode >", value, "al_addmode");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("al_addmode >=", value, "al_addmode");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeLessThan(Byte value) {
            addCriterion("al_addmode <", value, "al_addmode");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeLessThanOrEqualTo(Byte value) {
            addCriterion("al_addmode <=", value, "al_addmode");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeIn(List<Byte> values) {
            addCriterion("al_addmode in", values, "al_addmode");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeNotIn(List<Byte> values) {
            addCriterion("al_addmode not in", values, "al_addmode");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeBetween(Byte value1, Byte value2) {
            addCriterion("al_addmode between", value1, value2, "al_addmode");
            return (Criteria) this;
        }

        public Criteria andAl_addmodeNotBetween(Byte value1, Byte value2) {
            addCriterion("al_addmode not between", value1, value2, "al_addmode");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseIsNull() {
            addCriterion("al_addbase is null");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseIsNotNull() {
            addCriterion("al_addbase is not null");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseEqualTo(Integer value) {
            addCriterion("al_addbase =", value, "al_addbase");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseNotEqualTo(Integer value) {
            addCriterion("al_addbase <>", value, "al_addbase");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseGreaterThan(Integer value) {
            addCriterion("al_addbase >", value, "al_addbase");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_addbase >=", value, "al_addbase");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseLessThan(Integer value) {
            addCriterion("al_addbase <", value, "al_addbase");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseLessThanOrEqualTo(Integer value) {
            addCriterion("al_addbase <=", value, "al_addbase");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseIn(List<Integer> values) {
            addCriterion("al_addbase in", values, "al_addbase");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseNotIn(List<Integer> values) {
            addCriterion("al_addbase not in", values, "al_addbase");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseBetween(Integer value1, Integer value2) {
            addCriterion("al_addbase between", value1, value2, "al_addbase");
            return (Criteria) this;
        }

        public Criteria andAl_addbaseNotBetween(Integer value1, Integer value2) {
            addCriterion("al_addbase not between", value1, value2, "al_addbase");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyIsNull() {
            addCriterion("al_addcoinqty is null");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyIsNotNull() {
            addCriterion("al_addcoinqty is not null");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyEqualTo(Integer value) {
            addCriterion("al_addcoinqty =", value, "al_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyNotEqualTo(Integer value) {
            addCriterion("al_addcoinqty <>", value, "al_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyGreaterThan(Integer value) {
            addCriterion("al_addcoinqty >", value, "al_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_addcoinqty >=", value, "al_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyLessThan(Integer value) {
            addCriterion("al_addcoinqty <", value, "al_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyLessThanOrEqualTo(Integer value) {
            addCriterion("al_addcoinqty <=", value, "al_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyIn(List<Integer> values) {
            addCriterion("al_addcoinqty in", values, "al_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyNotIn(List<Integer> values) {
            addCriterion("al_addcoinqty not in", values, "al_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyBetween(Integer value1, Integer value2) {
            addCriterion("al_addcoinqty between", value1, value2, "al_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAl_addcoinqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("al_addcoinqty not between", value1, value2, "al_addcoinqty");
            return (Criteria) this;
        }

        public Criteria andAl_addamountIsNull() {
            addCriterion("al_addamount is null");
            return (Criteria) this;
        }

        public Criteria andAl_addamountIsNotNull() {
            addCriterion("al_addamount is not null");
            return (Criteria) this;
        }

        public Criteria andAl_addamountEqualTo(Integer value) {
            addCriterion("al_addamount =", value, "al_addamount");
            return (Criteria) this;
        }

        public Criteria andAl_addamountNotEqualTo(Integer value) {
            addCriterion("al_addamount <>", value, "al_addamount");
            return (Criteria) this;
        }

        public Criteria andAl_addamountGreaterThan(Integer value) {
            addCriterion("al_addamount >", value, "al_addamount");
            return (Criteria) this;
        }

        public Criteria andAl_addamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_addamount >=", value, "al_addamount");
            return (Criteria) this;
        }

        public Criteria andAl_addamountLessThan(Integer value) {
            addCriterion("al_addamount <", value, "al_addamount");
            return (Criteria) this;
        }

        public Criteria andAl_addamountLessThanOrEqualTo(Integer value) {
            addCriterion("al_addamount <=", value, "al_addamount");
            return (Criteria) this;
        }

        public Criteria andAl_addamountIn(List<Integer> values) {
            addCriterion("al_addamount in", values, "al_addamount");
            return (Criteria) this;
        }

        public Criteria andAl_addamountNotIn(List<Integer> values) {
            addCriterion("al_addamount not in", values, "al_addamount");
            return (Criteria) this;
        }

        public Criteria andAl_addamountBetween(Integer value1, Integer value2) {
            addCriterion("al_addamount between", value1, value2, "al_addamount");
            return (Criteria) this;
        }

        public Criteria andAl_addamountNotBetween(Integer value1, Integer value2) {
            addCriterion("al_addamount not between", value1, value2, "al_addamount");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralIsNull() {
            addCriterion("al_addintegral is null");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralIsNotNull() {
            addCriterion("al_addintegral is not null");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralEqualTo(Integer value) {
            addCriterion("al_addintegral =", value, "al_addintegral");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralNotEqualTo(Integer value) {
            addCriterion("al_addintegral <>", value, "al_addintegral");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralGreaterThan(Integer value) {
            addCriterion("al_addintegral >", value, "al_addintegral");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_addintegral >=", value, "al_addintegral");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralLessThan(Integer value) {
            addCriterion("al_addintegral <", value, "al_addintegral");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralLessThanOrEqualTo(Integer value) {
            addCriterion("al_addintegral <=", value, "al_addintegral");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralIn(List<Integer> values) {
            addCriterion("al_addintegral in", values, "al_addintegral");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralNotIn(List<Integer> values) {
            addCriterion("al_addintegral not in", values, "al_addintegral");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralBetween(Integer value1, Integer value2) {
            addCriterion("al_addintegral between", value1, value2, "al_addintegral");
            return (Criteria) this;
        }

        public Criteria andAl_addintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("al_addintegral not between", value1, value2, "al_addintegral");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopIsNull() {
            addCriterion("al_flagstop is null");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopIsNotNull() {
            addCriterion("al_flagstop is not null");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopEqualTo(Boolean value) {
            addCriterion("al_flagstop =", value, "al_flagstop");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopNotEqualTo(Boolean value) {
            addCriterion("al_flagstop <>", value, "al_flagstop");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopGreaterThan(Boolean value) {
            addCriterion("al_flagstop >", value, "al_flagstop");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("al_flagstop >=", value, "al_flagstop");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopLessThan(Boolean value) {
            addCriterion("al_flagstop <", value, "al_flagstop");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopLessThanOrEqualTo(Boolean value) {
            addCriterion("al_flagstop <=", value, "al_flagstop");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopIn(List<Boolean> values) {
            addCriterion("al_flagstop in", values, "al_flagstop");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopNotIn(List<Boolean> values) {
            addCriterion("al_flagstop not in", values, "al_flagstop");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopBetween(Boolean value1, Boolean value2) {
            addCriterion("al_flagstop between", value1, value2, "al_flagstop");
            return (Criteria) this;
        }

        public Criteria andAl_flagstopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("al_flagstop not between", value1, value2, "al_flagstop");
            return (Criteria) this;
        }

        public Criteria andAl_remarkIsNull() {
            addCriterion("al_remark is null");
            return (Criteria) this;
        }

        public Criteria andAl_remarkIsNotNull() {
            addCriterion("al_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAl_remarkEqualTo(String value) {
            addCriterion("al_remark =", value, "al_remark");
            return (Criteria) this;
        }

        public Criteria andAl_remarkNotEqualTo(String value) {
            addCriterion("al_remark <>", value, "al_remark");
            return (Criteria) this;
        }

        public Criteria andAl_remarkGreaterThan(String value) {
            addCriterion("al_remark >", value, "al_remark");
            return (Criteria) this;
        }

        public Criteria andAl_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("al_remark >=", value, "al_remark");
            return (Criteria) this;
        }

        public Criteria andAl_remarkLessThan(String value) {
            addCriterion("al_remark <", value, "al_remark");
            return (Criteria) this;
        }

        public Criteria andAl_remarkLessThanOrEqualTo(String value) {
            addCriterion("al_remark <=", value, "al_remark");
            return (Criteria) this;
        }

        public Criteria andAl_remarkLike(String value) {
            addCriterion("al_remark like", value, "al_remark");
            return (Criteria) this;
        }

        public Criteria andAl_remarkNotLike(String value) {
            addCriterion("al_remark not like", value, "al_remark");
            return (Criteria) this;
        }

        public Criteria andAl_remarkIn(List<String> values) {
            addCriterion("al_remark in", values, "al_remark");
            return (Criteria) this;
        }

        public Criteria andAl_remarkNotIn(List<String> values) {
            addCriterion("al_remark not in", values, "al_remark");
            return (Criteria) this;
        }

        public Criteria andAl_remarkBetween(String value1, String value2) {
            addCriterion("al_remark between", value1, value2, "al_remark");
            return (Criteria) this;
        }

        public Criteria andAl_remarkNotBetween(String value1, String value2) {
            addCriterion("al_remark not between", value1, value2, "al_remark");
            return (Criteria) this;
        }

        public Criteria andBa_createidIsNull() {
            addCriterion("ba_createid is null");
            return (Criteria) this;
        }

        public Criteria andBa_createidIsNotNull() {
            addCriterion("ba_createid is not null");
            return (Criteria) this;
        }

        public Criteria andBa_createidEqualTo(Long value) {
            addCriterion("ba_createid =", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidNotEqualTo(Long value) {
            addCriterion("ba_createid <>", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidGreaterThan(Long value) {
            addCriterion("ba_createid >", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("ba_createid >=", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidLessThan(Long value) {
            addCriterion("ba_createid <", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidLessThanOrEqualTo(Long value) {
            addCriterion("ba_createid <=", value, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidIn(List<Long> values) {
            addCriterion("ba_createid in", values, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidNotIn(List<Long> values) {
            addCriterion("ba_createid not in", values, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidBetween(Long value1, Long value2) {
            addCriterion("ba_createid between", value1, value2, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createidNotBetween(Long value1, Long value2) {
            addCriterion("ba_createid not between", value1, value2, "ba_createid");
            return (Criteria) this;
        }

        public Criteria andBa_createnoIsNull() {
            addCriterion("ba_createno is null");
            return (Criteria) this;
        }

        public Criteria andBa_createnoIsNotNull() {
            addCriterion("ba_createno is not null");
            return (Criteria) this;
        }

        public Criteria andBa_createnoEqualTo(String value) {
            addCriterion("ba_createno =", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoNotEqualTo(String value) {
            addCriterion("ba_createno <>", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoGreaterThan(String value) {
            addCriterion("ba_createno >", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("ba_createno >=", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoLessThan(String value) {
            addCriterion("ba_createno <", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoLessThanOrEqualTo(String value) {
            addCriterion("ba_createno <=", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoLike(String value) {
            addCriterion("ba_createno like", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoNotLike(String value) {
            addCriterion("ba_createno not like", value, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoIn(List<String> values) {
            addCriterion("ba_createno in", values, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoNotIn(List<String> values) {
            addCriterion("ba_createno not in", values, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoBetween(String value1, String value2) {
            addCriterion("ba_createno between", value1, value2, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createnoNotBetween(String value1, String value2) {
            addCriterion("ba_createno not between", value1, value2, "ba_createno");
            return (Criteria) this;
        }

        public Criteria andBa_createdateIsNull() {
            addCriterion("ba_createdate is null");
            return (Criteria) this;
        }

        public Criteria andBa_createdateIsNotNull() {
            addCriterion("ba_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andBa_createdateEqualTo(Date value) {
            addCriterion("ba_createdate =", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateNotEqualTo(Date value) {
            addCriterion("ba_createdate <>", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateGreaterThan(Date value) {
            addCriterion("ba_createdate >", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ba_createdate >=", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateLessThan(Date value) {
            addCriterion("ba_createdate <", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateLessThanOrEqualTo(Date value) {
            addCriterion("ba_createdate <=", value, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateIn(List<Date> values) {
            addCriterion("ba_createdate in", values, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateNotIn(List<Date> values) {
            addCriterion("ba_createdate not in", values, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateBetween(Date value1, Date value2) {
            addCriterion("ba_createdate between", value1, value2, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_createdateNotBetween(Date value1, Date value2) {
            addCriterion("ba_createdate not between", value1, value2, "ba_createdate");
            return (Criteria) this;
        }

        public Criteria andBa_updateidIsNull() {
            addCriterion("ba_updateid is null");
            return (Criteria) this;
        }

        public Criteria andBa_updateidIsNotNull() {
            addCriterion("ba_updateid is not null");
            return (Criteria) this;
        }

        public Criteria andBa_updateidEqualTo(Long value) {
            addCriterion("ba_updateid =", value, "ba_updateid");
            return (Criteria) this;
        }

        public Criteria andBa_updateidNotEqualTo(Long value) {
            addCriterion("ba_updateid <>", value, "ba_updateid");
            return (Criteria) this;
        }

        public Criteria andBa_updateidGreaterThan(Long value) {
            addCriterion("ba_updateid >", value, "ba_updateid");
            return (Criteria) this;
        }

        public Criteria andBa_updateidGreaterThanOrEqualTo(Long value) {
            addCriterion("ba_updateid >=", value, "ba_updateid");
            return (Criteria) this;
        }

        public Criteria andBa_updateidLessThan(Long value) {
            addCriterion("ba_updateid <", value, "ba_updateid");
            return (Criteria) this;
        }

        public Criteria andBa_updateidLessThanOrEqualTo(Long value) {
            addCriterion("ba_updateid <=", value, "ba_updateid");
            return (Criteria) this;
        }

        public Criteria andBa_updateidIn(List<Long> values) {
            addCriterion("ba_updateid in", values, "ba_updateid");
            return (Criteria) this;
        }

        public Criteria andBa_updateidNotIn(List<Long> values) {
            addCriterion("ba_updateid not in", values, "ba_updateid");
            return (Criteria) this;
        }

        public Criteria andBa_updateidBetween(Long value1, Long value2) {
            addCriterion("ba_updateid between", value1, value2, "ba_updateid");
            return (Criteria) this;
        }

        public Criteria andBa_updateidNotBetween(Long value1, Long value2) {
            addCriterion("ba_updateid not between", value1, value2, "ba_updateid");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoIsNull() {
            addCriterion("ba_updateno is null");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoIsNotNull() {
            addCriterion("ba_updateno is not null");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoEqualTo(String value) {
            addCriterion("ba_updateno =", value, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoNotEqualTo(String value) {
            addCriterion("ba_updateno <>", value, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoGreaterThan(String value) {
            addCriterion("ba_updateno >", value, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoGreaterThanOrEqualTo(String value) {
            addCriterion("ba_updateno >=", value, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoLessThan(String value) {
            addCriterion("ba_updateno <", value, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoLessThanOrEqualTo(String value) {
            addCriterion("ba_updateno <=", value, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoLike(String value) {
            addCriterion("ba_updateno like", value, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoNotLike(String value) {
            addCriterion("ba_updateno not like", value, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoIn(List<String> values) {
            addCriterion("ba_updateno in", values, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoNotIn(List<String> values) {
            addCriterion("ba_updateno not in", values, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoBetween(String value1, String value2) {
            addCriterion("ba_updateno between", value1, value2, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatenoNotBetween(String value1, String value2) {
            addCriterion("ba_updateno not between", value1, value2, "ba_updateno");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateIsNull() {
            addCriterion("ba_updatedate is null");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateIsNotNull() {
            addCriterion("ba_updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateEqualTo(Date value) {
            addCriterion("ba_updatedate =", value, "ba_updatedate");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateNotEqualTo(Date value) {
            addCriterion("ba_updatedate <>", value, "ba_updatedate");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateGreaterThan(Date value) {
            addCriterion("ba_updatedate >", value, "ba_updatedate");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ba_updatedate >=", value, "ba_updatedate");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateLessThan(Date value) {
            addCriterion("ba_updatedate <", value, "ba_updatedate");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateLessThanOrEqualTo(Date value) {
            addCriterion("ba_updatedate <=", value, "ba_updatedate");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateIn(List<Date> values) {
            addCriterion("ba_updatedate in", values, "ba_updatedate");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateNotIn(List<Date> values) {
            addCriterion("ba_updatedate not in", values, "ba_updatedate");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateBetween(Date value1, Date value2) {
            addCriterion("ba_updatedate between", value1, value2, "ba_updatedate");
            return (Criteria) this;
        }

        public Criteria andBa_updatedateNotBetween(Date value1, Date value2) {
            addCriterion("ba_updatedate not between", value1, value2, "ba_updatedate");
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