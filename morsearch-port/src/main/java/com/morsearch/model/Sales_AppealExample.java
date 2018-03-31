package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sales_AppealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sales_AppealExample() {
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

        public Criteria andSp_idIsNull() {
            addCriterion("sp_id is null");
            return (Criteria) this;
        }

        public Criteria andSp_idIsNotNull() {
            addCriterion("sp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSp_idEqualTo(Long value) {
            addCriterion("sp_id =", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idNotEqualTo(Long value) {
            addCriterion("sp_id <>", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idGreaterThan(Long value) {
            addCriterion("sp_id >", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_id >=", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idLessThan(Long value) {
            addCriterion("sp_id <", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idLessThanOrEqualTo(Long value) {
            addCriterion("sp_id <=", value, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idIn(List<Long> values) {
            addCriterion("sp_id in", values, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idNotIn(List<Long> values) {
            addCriterion("sp_id not in", values, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idBetween(Long value1, Long value2) {
            addCriterion("sp_id between", value1, value2, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_idNotBetween(Long value1, Long value2) {
            addCriterion("sp_id not between", value1, value2, "sp_id");
            return (Criteria) this;
        }

        public Criteria andSp_noIsNull() {
            addCriterion("sp_no is null");
            return (Criteria) this;
        }

        public Criteria andSp_noIsNotNull() {
            addCriterion("sp_no is not null");
            return (Criteria) this;
        }

        public Criteria andSp_noEqualTo(String value) {
            addCriterion("sp_no =", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noNotEqualTo(String value) {
            addCriterion("sp_no <>", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noGreaterThan(String value) {
            addCriterion("sp_no >", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noGreaterThanOrEqualTo(String value) {
            addCriterion("sp_no >=", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noLessThan(String value) {
            addCriterion("sp_no <", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noLessThanOrEqualTo(String value) {
            addCriterion("sp_no <=", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noLike(String value) {
            addCriterion("sp_no like", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noNotLike(String value) {
            addCriterion("sp_no not like", value, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noIn(List<String> values) {
            addCriterion("sp_no in", values, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noNotIn(List<String> values) {
            addCriterion("sp_no not in", values, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noBetween(String value1, String value2) {
            addCriterion("sp_no between", value1, value2, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_noNotBetween(String value1, String value2) {
            addCriterion("sp_no not between", value1, value2, "sp_no");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoIsNull() {
            addCriterion("sp_orderno is null");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoIsNotNull() {
            addCriterion("sp_orderno is not null");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoEqualTo(String value) {
            addCriterion("sp_orderno =", value, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoNotEqualTo(String value) {
            addCriterion("sp_orderno <>", value, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoGreaterThan(String value) {
            addCriterion("sp_orderno >", value, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoGreaterThanOrEqualTo(String value) {
            addCriterion("sp_orderno >=", value, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoLessThan(String value) {
            addCriterion("sp_orderno <", value, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoLessThanOrEqualTo(String value) {
            addCriterion("sp_orderno <=", value, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoLike(String value) {
            addCriterion("sp_orderno like", value, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoNotLike(String value) {
            addCriterion("sp_orderno not like", value, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoIn(List<String> values) {
            addCriterion("sp_orderno in", values, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoNotIn(List<String> values) {
            addCriterion("sp_orderno not in", values, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoBetween(String value1, String value2) {
            addCriterion("sp_orderno between", value1, value2, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_ordernoNotBetween(String value1, String value2) {
            addCriterion("sp_orderno not between", value1, value2, "sp_orderno");
            return (Criteria) this;
        }

        public Criteria andSp_designeridIsNull() {
            addCriterion("sp_designerid is null");
            return (Criteria) this;
        }

        public Criteria andSp_designeridIsNotNull() {
            addCriterion("sp_designerid is not null");
            return (Criteria) this;
        }

        public Criteria andSp_designeridEqualTo(Long value) {
            addCriterion("sp_designerid =", value, "sp_designerid");
            return (Criteria) this;
        }

        public Criteria andSp_designeridNotEqualTo(Long value) {
            addCriterion("sp_designerid <>", value, "sp_designerid");
            return (Criteria) this;
        }

        public Criteria andSp_designeridGreaterThan(Long value) {
            addCriterion("sp_designerid >", value, "sp_designerid");
            return (Criteria) this;
        }

        public Criteria andSp_designeridGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_designerid >=", value, "sp_designerid");
            return (Criteria) this;
        }

        public Criteria andSp_designeridLessThan(Long value) {
            addCriterion("sp_designerid <", value, "sp_designerid");
            return (Criteria) this;
        }

        public Criteria andSp_designeridLessThanOrEqualTo(Long value) {
            addCriterion("sp_designerid <=", value, "sp_designerid");
            return (Criteria) this;
        }

        public Criteria andSp_designeridIn(List<Long> values) {
            addCriterion("sp_designerid in", values, "sp_designerid");
            return (Criteria) this;
        }

        public Criteria andSp_designeridNotIn(List<Long> values) {
            addCriterion("sp_designerid not in", values, "sp_designerid");
            return (Criteria) this;
        }

        public Criteria andSp_designeridBetween(Long value1, Long value2) {
            addCriterion("sp_designerid between", value1, value2, "sp_designerid");
            return (Criteria) this;
        }

        public Criteria andSp_designeridNotBetween(Long value1, Long value2) {
            addCriterion("sp_designerid not between", value1, value2, "sp_designerid");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupIsNull() {
            addCriterion("sp_contentgroup is null");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupIsNotNull() {
            addCriterion("sp_contentgroup is not null");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupEqualTo(String value) {
            addCriterion("sp_contentgroup =", value, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupNotEqualTo(String value) {
            addCriterion("sp_contentgroup <>", value, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupGreaterThan(String value) {
            addCriterion("sp_contentgroup >", value, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupGreaterThanOrEqualTo(String value) {
            addCriterion("sp_contentgroup >=", value, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupLessThan(String value) {
            addCriterion("sp_contentgroup <", value, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupLessThanOrEqualTo(String value) {
            addCriterion("sp_contentgroup <=", value, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupLike(String value) {
            addCriterion("sp_contentgroup like", value, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupNotLike(String value) {
            addCriterion("sp_contentgroup not like", value, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupIn(List<String> values) {
            addCriterion("sp_contentgroup in", values, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupNotIn(List<String> values) {
            addCriterion("sp_contentgroup not in", values, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupBetween(String value1, String value2) {
            addCriterion("sp_contentgroup between", value1, value2, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentgroupNotBetween(String value1, String value2) {
            addCriterion("sp_contentgroup not between", value1, value2, "sp_contentgroup");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueIsNull() {
            addCriterion("sp_contentvalue is null");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueIsNotNull() {
            addCriterion("sp_contentvalue is not null");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueEqualTo(String value) {
            addCriterion("sp_contentvalue =", value, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueNotEqualTo(String value) {
            addCriterion("sp_contentvalue <>", value, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueGreaterThan(String value) {
            addCriterion("sp_contentvalue >", value, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueGreaterThanOrEqualTo(String value) {
            addCriterion("sp_contentvalue >=", value, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueLessThan(String value) {
            addCriterion("sp_contentvalue <", value, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueLessThanOrEqualTo(String value) {
            addCriterion("sp_contentvalue <=", value, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueLike(String value) {
            addCriterion("sp_contentvalue like", value, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueNotLike(String value) {
            addCriterion("sp_contentvalue not like", value, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueIn(List<String> values) {
            addCriterion("sp_contentvalue in", values, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueNotIn(List<String> values) {
            addCriterion("sp_contentvalue not in", values, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueBetween(String value1, String value2) {
            addCriterion("sp_contentvalue between", value1, value2, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_contentvalueNotBetween(String value1, String value2) {
            addCriterion("sp_contentvalue not between", value1, value2, "sp_contentvalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueIsNull() {
            addCriterion("sp_disposevalue is null");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueIsNotNull() {
            addCriterion("sp_disposevalue is not null");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueEqualTo(String value) {
            addCriterion("sp_disposevalue =", value, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueNotEqualTo(String value) {
            addCriterion("sp_disposevalue <>", value, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueGreaterThan(String value) {
            addCriterion("sp_disposevalue >", value, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueGreaterThanOrEqualTo(String value) {
            addCriterion("sp_disposevalue >=", value, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueLessThan(String value) {
            addCriterion("sp_disposevalue <", value, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueLessThanOrEqualTo(String value) {
            addCriterion("sp_disposevalue <=", value, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueLike(String value) {
            addCriterion("sp_disposevalue like", value, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueNotLike(String value) {
            addCriterion("sp_disposevalue not like", value, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueIn(List<String> values) {
            addCriterion("sp_disposevalue in", values, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueNotIn(List<String> values) {
            addCriterion("sp_disposevalue not in", values, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueBetween(String value1, String value2) {
            addCriterion("sp_disposevalue between", value1, value2, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposevalueNotBetween(String value1, String value2) {
            addCriterion("sp_disposevalue not between", value1, value2, "sp_disposevalue");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeIsNull() {
            addCriterion("sp_disposemode is null");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeIsNotNull() {
            addCriterion("sp_disposemode is not null");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeEqualTo(Boolean value) {
            addCriterion("sp_disposemode =", value, "sp_disposemode");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeNotEqualTo(Boolean value) {
            addCriterion("sp_disposemode <>", value, "sp_disposemode");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeGreaterThan(Boolean value) {
            addCriterion("sp_disposemode >", value, "sp_disposemode");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sp_disposemode >=", value, "sp_disposemode");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeLessThan(Boolean value) {
            addCriterion("sp_disposemode <", value, "sp_disposemode");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeLessThanOrEqualTo(Boolean value) {
            addCriterion("sp_disposemode <=", value, "sp_disposemode");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeIn(List<Boolean> values) {
            addCriterion("sp_disposemode in", values, "sp_disposemode");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeNotIn(List<Boolean> values) {
            addCriterion("sp_disposemode not in", values, "sp_disposemode");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_disposemode between", value1, value2, "sp_disposemode");
            return (Criteria) this;
        }

        public Criteria andSp_disposemodeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_disposemode not between", value1, value2, "sp_disposemode");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadIsNull() {
            addCriterion("sp_flagdesread is null");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadIsNotNull() {
            addCriterion("sp_flagdesread is not null");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadEqualTo(Boolean value) {
            addCriterion("sp_flagdesread =", value, "sp_flagdesread");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadNotEqualTo(Boolean value) {
            addCriterion("sp_flagdesread <>", value, "sp_flagdesread");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadGreaterThan(Boolean value) {
            addCriterion("sp_flagdesread >", value, "sp_flagdesread");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sp_flagdesread >=", value, "sp_flagdesread");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadLessThan(Boolean value) {
            addCriterion("sp_flagdesread <", value, "sp_flagdesread");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadLessThanOrEqualTo(Boolean value) {
            addCriterion("sp_flagdesread <=", value, "sp_flagdesread");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadIn(List<Boolean> values) {
            addCriterion("sp_flagdesread in", values, "sp_flagdesread");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadNotIn(List<Boolean> values) {
            addCriterion("sp_flagdesread not in", values, "sp_flagdesread");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flagdesread between", value1, value2, "sp_flagdesread");
            return (Criteria) this;
        }

        public Criteria andSp_flagdesreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flagdesread not between", value1, value2, "sp_flagdesread");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadIsNull() {
            addCriterion("sp_flagsaleread is null");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadIsNotNull() {
            addCriterion("sp_flagsaleread is not null");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadEqualTo(Boolean value) {
            addCriterion("sp_flagsaleread =", value, "sp_flagsaleread");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadNotEqualTo(Boolean value) {
            addCriterion("sp_flagsaleread <>", value, "sp_flagsaleread");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadGreaterThan(Boolean value) {
            addCriterion("sp_flagsaleread >", value, "sp_flagsaleread");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sp_flagsaleread >=", value, "sp_flagsaleread");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadLessThan(Boolean value) {
            addCriterion("sp_flagsaleread <", value, "sp_flagsaleread");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadLessThanOrEqualTo(Boolean value) {
            addCriterion("sp_flagsaleread <=", value, "sp_flagsaleread");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadIn(List<Boolean> values) {
            addCriterion("sp_flagsaleread in", values, "sp_flagsaleread");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadNotIn(List<Boolean> values) {
            addCriterion("sp_flagsaleread not in", values, "sp_flagsaleread");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flagsaleread between", value1, value2, "sp_flagsaleread");
            return (Criteria) this;
        }

        public Criteria andSp_flagsalereadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flagsaleread not between", value1, value2, "sp_flagsaleread");
            return (Criteria) this;
        }

        public Criteria andSp_createidIsNull() {
            addCriterion("sp_createid is null");
            return (Criteria) this;
        }

        public Criteria andSp_createidIsNotNull() {
            addCriterion("sp_createid is not null");
            return (Criteria) this;
        }

        public Criteria andSp_createidEqualTo(Long value) {
            addCriterion("sp_createid =", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidNotEqualTo(Long value) {
            addCriterion("sp_createid <>", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidGreaterThan(Long value) {
            addCriterion("sp_createid >", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_createid >=", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidLessThan(Long value) {
            addCriterion("sp_createid <", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidLessThanOrEqualTo(Long value) {
            addCriterion("sp_createid <=", value, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidIn(List<Long> values) {
            addCriterion("sp_createid in", values, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidNotIn(List<Long> values) {
            addCriterion("sp_createid not in", values, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidBetween(Long value1, Long value2) {
            addCriterion("sp_createid between", value1, value2, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createidNotBetween(Long value1, Long value2) {
            addCriterion("sp_createid not between", value1, value2, "sp_createid");
            return (Criteria) this;
        }

        public Criteria andSp_createnoIsNull() {
            addCriterion("sp_createno is null");
            return (Criteria) this;
        }

        public Criteria andSp_createnoIsNotNull() {
            addCriterion("sp_createno is not null");
            return (Criteria) this;
        }

        public Criteria andSp_createnoEqualTo(String value) {
            addCriterion("sp_createno =", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoNotEqualTo(String value) {
            addCriterion("sp_createno <>", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoGreaterThan(String value) {
            addCriterion("sp_createno >", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("sp_createno >=", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoLessThan(String value) {
            addCriterion("sp_createno <", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoLessThanOrEqualTo(String value) {
            addCriterion("sp_createno <=", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoLike(String value) {
            addCriterion("sp_createno like", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoNotLike(String value) {
            addCriterion("sp_createno not like", value, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoIn(List<String> values) {
            addCriterion("sp_createno in", values, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoNotIn(List<String> values) {
            addCriterion("sp_createno not in", values, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoBetween(String value1, String value2) {
            addCriterion("sp_createno between", value1, value2, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createnoNotBetween(String value1, String value2) {
            addCriterion("sp_createno not between", value1, value2, "sp_createno");
            return (Criteria) this;
        }

        public Criteria andSp_createdateIsNull() {
            addCriterion("sp_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSp_createdateIsNotNull() {
            addCriterion("sp_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSp_createdateEqualTo(Date value) {
            addCriterion("sp_createdate =", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateNotEqualTo(Date value) {
            addCriterion("sp_createdate <>", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateGreaterThan(Date value) {
            addCriterion("sp_createdate >", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sp_createdate >=", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateLessThan(Date value) {
            addCriterion("sp_createdate <", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateLessThanOrEqualTo(Date value) {
            addCriterion("sp_createdate <=", value, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateIn(List<Date> values) {
            addCriterion("sp_createdate in", values, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateNotIn(List<Date> values) {
            addCriterion("sp_createdate not in", values, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateBetween(Date value1, Date value2) {
            addCriterion("sp_createdate between", value1, value2, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSp_createdateNotBetween(Date value1, Date value2) {
            addCriterion("sp_createdate not between", value1, value2, "sp_createdate");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidIsNull() {
            addCriterion("se_confirmid is null");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidIsNotNull() {
            addCriterion("se_confirmid is not null");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidEqualTo(Long value) {
            addCriterion("se_confirmid =", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidNotEqualTo(Long value) {
            addCriterion("se_confirmid <>", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidGreaterThan(Long value) {
            addCriterion("se_confirmid >", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidGreaterThanOrEqualTo(Long value) {
            addCriterion("se_confirmid >=", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidLessThan(Long value) {
            addCriterion("se_confirmid <", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidLessThanOrEqualTo(Long value) {
            addCriterion("se_confirmid <=", value, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidIn(List<Long> values) {
            addCriterion("se_confirmid in", values, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidNotIn(List<Long> values) {
            addCriterion("se_confirmid not in", values, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidBetween(Long value1, Long value2) {
            addCriterion("se_confirmid between", value1, value2, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSe_confirmidNotBetween(Long value1, Long value2) {
            addCriterion("se_confirmid not between", value1, value2, "se_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoIsNull() {
            addCriterion("sp_confirmno is null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoIsNotNull() {
            addCriterion("sp_confirmno is not null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoEqualTo(String value) {
            addCriterion("sp_confirmno =", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoNotEqualTo(String value) {
            addCriterion("sp_confirmno <>", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoGreaterThan(String value) {
            addCriterion("sp_confirmno >", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("sp_confirmno >=", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoLessThan(String value) {
            addCriterion("sp_confirmno <", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoLessThanOrEqualTo(String value) {
            addCriterion("sp_confirmno <=", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoLike(String value) {
            addCriterion("sp_confirmno like", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoNotLike(String value) {
            addCriterion("sp_confirmno not like", value, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoIn(List<String> values) {
            addCriterion("sp_confirmno in", values, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoNotIn(List<String> values) {
            addCriterion("sp_confirmno not in", values, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoBetween(String value1, String value2) {
            addCriterion("sp_confirmno between", value1, value2, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmnoNotBetween(String value1, String value2) {
            addCriterion("sp_confirmno not between", value1, value2, "sp_confirmno");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateIsNull() {
            addCriterion("sp_confirmdate is null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateIsNotNull() {
            addCriterion("sp_confirmdate is not null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateEqualTo(Date value) {
            addCriterion("sp_confirmdate =", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateNotEqualTo(Date value) {
            addCriterion("sp_confirmdate <>", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateGreaterThan(Date value) {
            addCriterion("sp_confirmdate >", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sp_confirmdate >=", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateLessThan(Date value) {
            addCriterion("sp_confirmdate <", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateLessThanOrEqualTo(Date value) {
            addCriterion("sp_confirmdate <=", value, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateIn(List<Date> values) {
            addCriterion("sp_confirmdate in", values, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateNotIn(List<Date> values) {
            addCriterion("sp_confirmdate not in", values, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateBetween(Date value1, Date value2) {
            addCriterion("sp_confirmdate between", value1, value2, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_confirmdateNotBetween(Date value1, Date value2) {
            addCriterion("sp_confirmdate not between", value1, value2, "sp_confirmdate");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidIsNull() {
            addCriterion("sp_disposeid is null");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidIsNotNull() {
            addCriterion("sp_disposeid is not null");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidEqualTo(Long value) {
            addCriterion("sp_disposeid =", value, "sp_disposeid");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidNotEqualTo(Long value) {
            addCriterion("sp_disposeid <>", value, "sp_disposeid");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidGreaterThan(Long value) {
            addCriterion("sp_disposeid >", value, "sp_disposeid");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_disposeid >=", value, "sp_disposeid");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidLessThan(Long value) {
            addCriterion("sp_disposeid <", value, "sp_disposeid");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidLessThanOrEqualTo(Long value) {
            addCriterion("sp_disposeid <=", value, "sp_disposeid");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidIn(List<Long> values) {
            addCriterion("sp_disposeid in", values, "sp_disposeid");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidNotIn(List<Long> values) {
            addCriterion("sp_disposeid not in", values, "sp_disposeid");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidBetween(Long value1, Long value2) {
            addCriterion("sp_disposeid between", value1, value2, "sp_disposeid");
            return (Criteria) this;
        }

        public Criteria andSp_disposeidNotBetween(Long value1, Long value2) {
            addCriterion("sp_disposeid not between", value1, value2, "sp_disposeid");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoIsNull() {
            addCriterion("sp_disposeno is null");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoIsNotNull() {
            addCriterion("sp_disposeno is not null");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoEqualTo(String value) {
            addCriterion("sp_disposeno =", value, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoNotEqualTo(String value) {
            addCriterion("sp_disposeno <>", value, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoGreaterThan(String value) {
            addCriterion("sp_disposeno >", value, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoGreaterThanOrEqualTo(String value) {
            addCriterion("sp_disposeno >=", value, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoLessThan(String value) {
            addCriterion("sp_disposeno <", value, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoLessThanOrEqualTo(String value) {
            addCriterion("sp_disposeno <=", value, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoLike(String value) {
            addCriterion("sp_disposeno like", value, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoNotLike(String value) {
            addCriterion("sp_disposeno not like", value, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoIn(List<String> values) {
            addCriterion("sp_disposeno in", values, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoNotIn(List<String> values) {
            addCriterion("sp_disposeno not in", values, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoBetween(String value1, String value2) {
            addCriterion("sp_disposeno between", value1, value2, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposenoNotBetween(String value1, String value2) {
            addCriterion("sp_disposeno not between", value1, value2, "sp_disposeno");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateIsNull() {
            addCriterion("sp_disposedate is null");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateIsNotNull() {
            addCriterion("sp_disposedate is not null");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateEqualTo(Date value) {
            addCriterion("sp_disposedate =", value, "sp_disposedate");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateNotEqualTo(Date value) {
            addCriterion("sp_disposedate <>", value, "sp_disposedate");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateGreaterThan(Date value) {
            addCriterion("sp_disposedate >", value, "sp_disposedate");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateGreaterThanOrEqualTo(Date value) {
            addCriterion("sp_disposedate >=", value, "sp_disposedate");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateLessThan(Date value) {
            addCriterion("sp_disposedate <", value, "sp_disposedate");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateLessThanOrEqualTo(Date value) {
            addCriterion("sp_disposedate <=", value, "sp_disposedate");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateIn(List<Date> values) {
            addCriterion("sp_disposedate in", values, "sp_disposedate");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateNotIn(List<Date> values) {
            addCriterion("sp_disposedate not in", values, "sp_disposedate");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateBetween(Date value1, Date value2) {
            addCriterion("sp_disposedate between", value1, value2, "sp_disposedate");
            return (Criteria) this;
        }

        public Criteria andSp_disposedateNotBetween(Date value1, Date value2) {
            addCriterion("sp_disposedate not between", value1, value2, "sp_disposedate");
            return (Criteria) this;
        }

        public Criteria andSp_statusIsNull() {
            addCriterion("sp_status is null");
            return (Criteria) this;
        }

        public Criteria andSp_statusIsNotNull() {
            addCriterion("sp_status is not null");
            return (Criteria) this;
        }

        public Criteria andSp_statusEqualTo(Byte value) {
            addCriterion("sp_status =", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusNotEqualTo(Byte value) {
            addCriterion("sp_status <>", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusGreaterThan(Byte value) {
            addCriterion("sp_status >", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_status >=", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusLessThan(Byte value) {
            addCriterion("sp_status <", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusLessThanOrEqualTo(Byte value) {
            addCriterion("sp_status <=", value, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusIn(List<Byte> values) {
            addCriterion("sp_status in", values, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusNotIn(List<Byte> values) {
            addCriterion("sp_status not in", values, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusBetween(Byte value1, Byte value2) {
            addCriterion("sp_status between", value1, value2, "sp_status");
            return (Criteria) this;
        }

        public Criteria andSp_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_status not between", value1, value2, "sp_status");
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