package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Award_Recharge_RuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Award_Recharge_RuleExample() {
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

        public Criteria andArm_baidIsNull() {
            addCriterion("arm_baid is null");
            return (Criteria) this;
        }

        public Criteria andArm_baidIsNotNull() {
            addCriterion("arm_baid is not null");
            return (Criteria) this;
        }

        public Criteria andArm_baidEqualTo(Long value) {
            addCriterion("arm_baid =", value, "arm_baid");
            return (Criteria) this;
        }

        public Criteria andArm_baidNotEqualTo(Long value) {
            addCriterion("arm_baid <>", value, "arm_baid");
            return (Criteria) this;
        }

        public Criteria andArm_baidGreaterThan(Long value) {
            addCriterion("arm_baid >", value, "arm_baid");
            return (Criteria) this;
        }

        public Criteria andArm_baidGreaterThanOrEqualTo(Long value) {
            addCriterion("arm_baid >=", value, "arm_baid");
            return (Criteria) this;
        }

        public Criteria andArm_baidLessThan(Long value) {
            addCriterion("arm_baid <", value, "arm_baid");
            return (Criteria) this;
        }

        public Criteria andArm_baidLessThanOrEqualTo(Long value) {
            addCriterion("arm_baid <=", value, "arm_baid");
            return (Criteria) this;
        }

        public Criteria andArm_baidIn(List<Long> values) {
            addCriterion("arm_baid in", values, "arm_baid");
            return (Criteria) this;
        }

        public Criteria andArm_baidNotIn(List<Long> values) {
            addCriterion("arm_baid not in", values, "arm_baid");
            return (Criteria) this;
        }

        public Criteria andArm_baidBetween(Long value1, Long value2) {
            addCriterion("arm_baid between", value1, value2, "arm_baid");
            return (Criteria) this;
        }

        public Criteria andArm_baidNotBetween(Long value1, Long value2) {
            addCriterion("arm_baid not between", value1, value2, "arm_baid");
            return (Criteria) this;
        }

        public Criteria andArm_indexIsNull() {
            addCriterion("arm_index is null");
            return (Criteria) this;
        }

        public Criteria andArm_indexIsNotNull() {
            addCriterion("arm_index is not null");
            return (Criteria) this;
        }

        public Criteria andArm_indexEqualTo(String value) {
            addCriterion("arm_index =", value, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_indexNotEqualTo(String value) {
            addCriterion("arm_index <>", value, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_indexGreaterThan(String value) {
            addCriterion("arm_index >", value, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_indexGreaterThanOrEqualTo(String value) {
            addCriterion("arm_index >=", value, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_indexLessThan(String value) {
            addCriterion("arm_index <", value, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_indexLessThanOrEqualTo(String value) {
            addCriterion("arm_index <=", value, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_indexLike(String value) {
            addCriterion("arm_index like", value, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_indexNotLike(String value) {
            addCriterion("arm_index not like", value, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_indexIn(List<String> values) {
            addCriterion("arm_index in", values, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_indexNotIn(List<String> values) {
            addCriterion("arm_index not in", values, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_indexBetween(String value1, String value2) {
            addCriterion("arm_index between", value1, value2, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_indexNotBetween(String value1, String value2) {
            addCriterion("arm_index not between", value1, value2, "arm_index");
            return (Criteria) this;
        }

        public Criteria andArm_valueminIsNull() {
            addCriterion("arm_valuemin is null");
            return (Criteria) this;
        }

        public Criteria andArm_valueminIsNotNull() {
            addCriterion("arm_valuemin is not null");
            return (Criteria) this;
        }

        public Criteria andArm_valueminEqualTo(Integer value) {
            addCriterion("arm_valuemin =", value, "arm_valuemin");
            return (Criteria) this;
        }

        public Criteria andArm_valueminNotEqualTo(Integer value) {
            addCriterion("arm_valuemin <>", value, "arm_valuemin");
            return (Criteria) this;
        }

        public Criteria andArm_valueminGreaterThan(Integer value) {
            addCriterion("arm_valuemin >", value, "arm_valuemin");
            return (Criteria) this;
        }

        public Criteria andArm_valueminGreaterThanOrEqualTo(Integer value) {
            addCriterion("arm_valuemin >=", value, "arm_valuemin");
            return (Criteria) this;
        }

        public Criteria andArm_valueminLessThan(Integer value) {
            addCriterion("arm_valuemin <", value, "arm_valuemin");
            return (Criteria) this;
        }

        public Criteria andArm_valueminLessThanOrEqualTo(Integer value) {
            addCriterion("arm_valuemin <=", value, "arm_valuemin");
            return (Criteria) this;
        }

        public Criteria andArm_valueminIn(List<Integer> values) {
            addCriterion("arm_valuemin in", values, "arm_valuemin");
            return (Criteria) this;
        }

        public Criteria andArm_valueminNotIn(List<Integer> values) {
            addCriterion("arm_valuemin not in", values, "arm_valuemin");
            return (Criteria) this;
        }

        public Criteria andArm_valueminBetween(Integer value1, Integer value2) {
            addCriterion("arm_valuemin between", value1, value2, "arm_valuemin");
            return (Criteria) this;
        }

        public Criteria andArm_valueminNotBetween(Integer value1, Integer value2) {
            addCriterion("arm_valuemin not between", value1, value2, "arm_valuemin");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxIsNull() {
            addCriterion("arm_valuemax is null");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxIsNotNull() {
            addCriterion("arm_valuemax is not null");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxEqualTo(Integer value) {
            addCriterion("arm_valuemax =", value, "arm_valuemax");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxNotEqualTo(Integer value) {
            addCriterion("arm_valuemax <>", value, "arm_valuemax");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxGreaterThan(Integer value) {
            addCriterion("arm_valuemax >", value, "arm_valuemax");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("arm_valuemax >=", value, "arm_valuemax");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxLessThan(Integer value) {
            addCriterion("arm_valuemax <", value, "arm_valuemax");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxLessThanOrEqualTo(Integer value) {
            addCriterion("arm_valuemax <=", value, "arm_valuemax");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxIn(List<Integer> values) {
            addCriterion("arm_valuemax in", values, "arm_valuemax");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxNotIn(List<Integer> values) {
            addCriterion("arm_valuemax not in", values, "arm_valuemax");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxBetween(Integer value1, Integer value2) {
            addCriterion("arm_valuemax between", value1, value2, "arm_valuemax");
            return (Criteria) this;
        }

        public Criteria andArm_valuemaxNotBetween(Integer value1, Integer value2) {
            addCriterion("arm_valuemax not between", value1, value2, "arm_valuemax");
            return (Criteria) this;
        }

        public Criteria andArm_discountIsNull() {
            addCriterion("arm_discount is null");
            return (Criteria) this;
        }

        public Criteria andArm_discountIsNotNull() {
            addCriterion("arm_discount is not null");
            return (Criteria) this;
        }

        public Criteria andArm_discountEqualTo(BigDecimal value) {
            addCriterion("arm_discount =", value, "arm_discount");
            return (Criteria) this;
        }

        public Criteria andArm_discountNotEqualTo(BigDecimal value) {
            addCriterion("arm_discount <>", value, "arm_discount");
            return (Criteria) this;
        }

        public Criteria andArm_discountGreaterThan(BigDecimal value) {
            addCriterion("arm_discount >", value, "arm_discount");
            return (Criteria) this;
        }

        public Criteria andArm_discountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("arm_discount >=", value, "arm_discount");
            return (Criteria) this;
        }

        public Criteria andArm_discountLessThan(BigDecimal value) {
            addCriterion("arm_discount <", value, "arm_discount");
            return (Criteria) this;
        }

        public Criteria andArm_discountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("arm_discount <=", value, "arm_discount");
            return (Criteria) this;
        }

        public Criteria andArm_discountIn(List<BigDecimal> values) {
            addCriterion("arm_discount in", values, "arm_discount");
            return (Criteria) this;
        }

        public Criteria andArm_discountNotIn(List<BigDecimal> values) {
            addCriterion("arm_discount not in", values, "arm_discount");
            return (Criteria) this;
        }

        public Criteria andArm_discountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("arm_discount between", value1, value2, "arm_discount");
            return (Criteria) this;
        }

        public Criteria andArm_discountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("arm_discount not between", value1, value2, "arm_discount");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseIsNull() {
            addCriterion("arm_addbase is null");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseIsNotNull() {
            addCriterion("arm_addbase is not null");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseEqualTo(Integer value) {
            addCriterion("arm_addbase =", value, "arm_addbase");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseNotEqualTo(Integer value) {
            addCriterion("arm_addbase <>", value, "arm_addbase");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseGreaterThan(Integer value) {
            addCriterion("arm_addbase >", value, "arm_addbase");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("arm_addbase >=", value, "arm_addbase");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseLessThan(Integer value) {
            addCriterion("arm_addbase <", value, "arm_addbase");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseLessThanOrEqualTo(Integer value) {
            addCriterion("arm_addbase <=", value, "arm_addbase");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseIn(List<Integer> values) {
            addCriterion("arm_addbase in", values, "arm_addbase");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseNotIn(List<Integer> values) {
            addCriterion("arm_addbase not in", values, "arm_addbase");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseBetween(Integer value1, Integer value2) {
            addCriterion("arm_addbase between", value1, value2, "arm_addbase");
            return (Criteria) this;
        }

        public Criteria andArm_addbaseNotBetween(Integer value1, Integer value2) {
            addCriterion("arm_addbase not between", value1, value2, "arm_addbase");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeIsNull() {
            addCriterion("arm_addmode is null");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeIsNotNull() {
            addCriterion("arm_addmode is not null");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeEqualTo(Byte value) {
            addCriterion("arm_addmode =", value, "arm_addmode");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeNotEqualTo(Byte value) {
            addCriterion("arm_addmode <>", value, "arm_addmode");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeGreaterThan(Byte value) {
            addCriterion("arm_addmode >", value, "arm_addmode");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("arm_addmode >=", value, "arm_addmode");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeLessThan(Byte value) {
            addCriterion("arm_addmode <", value, "arm_addmode");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeLessThanOrEqualTo(Byte value) {
            addCriterion("arm_addmode <=", value, "arm_addmode");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeIn(List<Byte> values) {
            addCriterion("arm_addmode in", values, "arm_addmode");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeNotIn(List<Byte> values) {
            addCriterion("arm_addmode not in", values, "arm_addmode");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeBetween(Byte value1, Byte value2) {
            addCriterion("arm_addmode between", value1, value2, "arm_addmode");
            return (Criteria) this;
        }

        public Criteria andArm_addmodeNotBetween(Byte value1, Byte value2) {
            addCriterion("arm_addmode not between", value1, value2, "arm_addmode");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralIsNull() {
            addCriterion("arm_addintegral is null");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralIsNotNull() {
            addCriterion("arm_addintegral is not null");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralEqualTo(Integer value) {
            addCriterion("arm_addintegral =", value, "arm_addintegral");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralNotEqualTo(Integer value) {
            addCriterion("arm_addintegral <>", value, "arm_addintegral");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralGreaterThan(Integer value) {
            addCriterion("arm_addintegral >", value, "arm_addintegral");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("arm_addintegral >=", value, "arm_addintegral");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralLessThan(Integer value) {
            addCriterion("arm_addintegral <", value, "arm_addintegral");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralLessThanOrEqualTo(Integer value) {
            addCriterion("arm_addintegral <=", value, "arm_addintegral");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralIn(List<Integer> values) {
            addCriterion("arm_addintegral in", values, "arm_addintegral");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralNotIn(List<Integer> values) {
            addCriterion("arm_addintegral not in", values, "arm_addintegral");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralBetween(Integer value1, Integer value2) {
            addCriterion("arm_addintegral between", value1, value2, "arm_addintegral");
            return (Criteria) this;
        }

        public Criteria andArm_addintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("arm_addintegral not between", value1, value2, "arm_addintegral");
            return (Criteria) this;
        }

        public Criteria andArm_addamountIsNull() {
            addCriterion("arm_addamount is null");
            return (Criteria) this;
        }

        public Criteria andArm_addamountIsNotNull() {
            addCriterion("arm_addamount is not null");
            return (Criteria) this;
        }

        public Criteria andArm_addamountEqualTo(Integer value) {
            addCriterion("arm_addamount =", value, "arm_addamount");
            return (Criteria) this;
        }

        public Criteria andArm_addamountNotEqualTo(Integer value) {
            addCriterion("arm_addamount <>", value, "arm_addamount");
            return (Criteria) this;
        }

        public Criteria andArm_addamountGreaterThan(Integer value) {
            addCriterion("arm_addamount >", value, "arm_addamount");
            return (Criteria) this;
        }

        public Criteria andArm_addamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("arm_addamount >=", value, "arm_addamount");
            return (Criteria) this;
        }

        public Criteria andArm_addamountLessThan(Integer value) {
            addCriterion("arm_addamount <", value, "arm_addamount");
            return (Criteria) this;
        }

        public Criteria andArm_addamountLessThanOrEqualTo(Integer value) {
            addCriterion("arm_addamount <=", value, "arm_addamount");
            return (Criteria) this;
        }

        public Criteria andArm_addamountIn(List<Integer> values) {
            addCriterion("arm_addamount in", values, "arm_addamount");
            return (Criteria) this;
        }

        public Criteria andArm_addamountNotIn(List<Integer> values) {
            addCriterion("arm_addamount not in", values, "arm_addamount");
            return (Criteria) this;
        }

        public Criteria andArm_addamountBetween(Integer value1, Integer value2) {
            addCriterion("arm_addamount between", value1, value2, "arm_addamount");
            return (Criteria) this;
        }

        public Criteria andArm_addamountNotBetween(Integer value1, Integer value2) {
            addCriterion("arm_addamount not between", value1, value2, "arm_addamount");
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