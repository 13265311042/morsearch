package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsgV_Audit_ListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsgV_Audit_ListExample() {
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

        public Criteria andTypecodeIsNull() {
            addCriterion("typecode is null");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("typecode is not null");
            return (Criteria) this;
        }

        public Criteria andTypecodeEqualTo(String value) {
            addCriterion("typecode =", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotEqualTo(String value) {
            addCriterion("typecode <>", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThan(String value) {
            addCriterion("typecode >", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("typecode >=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThan(String value) {
            addCriterion("typecode <", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(String value) {
            addCriterion("typecode <=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLike(String value) {
            addCriterion("typecode like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotLike(String value) {
            addCriterion("typecode not like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIn(List<String> values) {
            addCriterion("typecode in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotIn(List<String> values) {
            addCriterion("typecode not in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeBetween(String value1, String value2) {
            addCriterion("typecode between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotBetween(String value1, String value2) {
            addCriterion("typecode not between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typename is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typename is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typename =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typename <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typename >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typename >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typename <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typename <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typename like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typename not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typename in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typename not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typename between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typename not between", value1, value2, "typename");
            return (Criteria) this;
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

        public Criteria andSp_titleIsNull() {
            addCriterion("sp_title is null");
            return (Criteria) this;
        }

        public Criteria andSp_titleIsNotNull() {
            addCriterion("sp_title is not null");
            return (Criteria) this;
        }

        public Criteria andSp_titleEqualTo(String value) {
            addCriterion("sp_title =", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleNotEqualTo(String value) {
            addCriterion("sp_title <>", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleGreaterThan(String value) {
            addCriterion("sp_title >", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleGreaterThanOrEqualTo(String value) {
            addCriterion("sp_title >=", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleLessThan(String value) {
            addCriterion("sp_title <", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleLessThanOrEqualTo(String value) {
            addCriterion("sp_title <=", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleLike(String value) {
            addCriterion("sp_title like", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleNotLike(String value) {
            addCriterion("sp_title not like", value, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleIn(List<String> values) {
            addCriterion("sp_title in", values, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleNotIn(List<String> values) {
            addCriterion("sp_title not in", values, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleBetween(String value1, String value2) {
            addCriterion("sp_title between", value1, value2, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_titleNotBetween(String value1, String value2) {
            addCriterion("sp_title not between", value1, value2, "sp_title");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadIsNull() {
            addCriterion("sp_flag_auditread is null");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadIsNotNull() {
            addCriterion("sp_flag_auditread is not null");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadEqualTo(Boolean value) {
            addCriterion("sp_flag_auditread =", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadNotEqualTo(Boolean value) {
            addCriterion("sp_flag_auditread <>", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadGreaterThan(Boolean value) {
            addCriterion("sp_flag_auditread >", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sp_flag_auditread >=", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadLessThan(Boolean value) {
            addCriterion("sp_flag_auditread <", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadLessThanOrEqualTo(Boolean value) {
            addCriterion("sp_flag_auditread <=", value, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadIn(List<Boolean> values) {
            addCriterion("sp_flag_auditread in", values, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadNotIn(List<Boolean> values) {
            addCriterion("sp_flag_auditread not in", values, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flag_auditread between", value1, value2, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_auditreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flag_auditread not between", value1, value2, "sp_flag_auditread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadIsNull() {
            addCriterion("sp_flag_adminread is null");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadIsNotNull() {
            addCriterion("sp_flag_adminread is not null");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadEqualTo(Boolean value) {
            addCriterion("sp_flag_adminread =", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadNotEqualTo(Boolean value) {
            addCriterion("sp_flag_adminread <>", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadGreaterThan(Boolean value) {
            addCriterion("sp_flag_adminread >", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sp_flag_adminread >=", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadLessThan(Boolean value) {
            addCriterion("sp_flag_adminread <", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadLessThanOrEqualTo(Boolean value) {
            addCriterion("sp_flag_adminread <=", value, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadIn(List<Boolean> values) {
            addCriterion("sp_flag_adminread in", values, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadNotIn(List<Boolean> values) {
            addCriterion("sp_flag_adminread not in", values, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flag_adminread between", value1, value2, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_flag_adminreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_flag_adminread not between", value1, value2, "sp_flag_adminread");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkIsNull() {
            addCriterion("sp_adminremark is null");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkIsNotNull() {
            addCriterion("sp_adminremark is not null");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkEqualTo(String value) {
            addCriterion("sp_adminremark =", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkNotEqualTo(String value) {
            addCriterion("sp_adminremark <>", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkGreaterThan(String value) {
            addCriterion("sp_adminremark >", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkGreaterThanOrEqualTo(String value) {
            addCriterion("sp_adminremark >=", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkLessThan(String value) {
            addCriterion("sp_adminremark <", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkLessThanOrEqualTo(String value) {
            addCriterion("sp_adminremark <=", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkLike(String value) {
            addCriterion("sp_adminremark like", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkNotLike(String value) {
            addCriterion("sp_adminremark not like", value, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkIn(List<String> values) {
            addCriterion("sp_adminremark in", values, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkNotIn(List<String> values) {
            addCriterion("sp_adminremark not in", values, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkBetween(String value1, String value2) {
            addCriterion("sp_adminremark between", value1, value2, "sp_adminremark");
            return (Criteria) this;
        }

        public Criteria andSp_adminremarkNotBetween(String value1, String value2) {
            addCriterion("sp_adminremark not between", value1, value2, "sp_adminremark");
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

        public Criteria andSp_confirmidIsNull() {
            addCriterion("sp_confirmid is null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidIsNotNull() {
            addCriterion("sp_confirmid is not null");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidEqualTo(Long value) {
            addCriterion("sp_confirmid =", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidNotEqualTo(Long value) {
            addCriterion("sp_confirmid <>", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidGreaterThan(Long value) {
            addCriterion("sp_confirmid >", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_confirmid >=", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidLessThan(Long value) {
            addCriterion("sp_confirmid <", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidLessThanOrEqualTo(Long value) {
            addCriterion("sp_confirmid <=", value, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidIn(List<Long> values) {
            addCriterion("sp_confirmid in", values, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidNotIn(List<Long> values) {
            addCriterion("sp_confirmid not in", values, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidBetween(Long value1, Long value2) {
            addCriterion("sp_confirmid between", value1, value2, "sp_confirmid");
            return (Criteria) this;
        }

        public Criteria andSp_confirmidNotBetween(Long value1, Long value2) {
            addCriterion("sp_confirmid not between", value1, value2, "sp_confirmid");
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