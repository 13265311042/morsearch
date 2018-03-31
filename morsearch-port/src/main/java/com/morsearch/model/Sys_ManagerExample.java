package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sys_ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys_ManagerExample() {
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

        public Criteria andSm_idIsNull() {
            addCriterion("sm_id is null");
            return (Criteria) this;
        }

        public Criteria andSm_idIsNotNull() {
            addCriterion("sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSm_idEqualTo(Integer value) {
            addCriterion("sm_id =", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotEqualTo(Integer value) {
            addCriterion("sm_id <>", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idGreaterThan(Integer value) {
            addCriterion("sm_id >", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_id >=", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idLessThan(Integer value) {
            addCriterion("sm_id <", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idLessThanOrEqualTo(Integer value) {
            addCriterion("sm_id <=", value, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idIn(List<Integer> values) {
            addCriterion("sm_id in", values, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotIn(List<Integer> values) {
            addCriterion("sm_id not in", values, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idBetween(Integer value1, Integer value2) {
            addCriterion("sm_id between", value1, value2, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_id not between", value1, value2, "sm_id");
            return (Criteria) this;
        }

        public Criteria andSm_noIsNull() {
            addCriterion("sm_no is null");
            return (Criteria) this;
        }

        public Criteria andSm_noIsNotNull() {
            addCriterion("sm_no is not null");
            return (Criteria) this;
        }

        public Criteria andSm_noEqualTo(String value) {
            addCriterion("sm_no =", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noNotEqualTo(String value) {
            addCriterion("sm_no <>", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noGreaterThan(String value) {
            addCriterion("sm_no >", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noGreaterThanOrEqualTo(String value) {
            addCriterion("sm_no >=", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noLessThan(String value) {
            addCriterion("sm_no <", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noLessThanOrEqualTo(String value) {
            addCriterion("sm_no <=", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noLike(String value) {
            addCriterion("sm_no like", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noNotLike(String value) {
            addCriterion("sm_no not like", value, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noIn(List<String> values) {
            addCriterion("sm_no in", values, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noNotIn(List<String> values) {
            addCriterion("sm_no not in", values, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noBetween(String value1, String value2) {
            addCriterion("sm_no between", value1, value2, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_noNotBetween(String value1, String value2) {
            addCriterion("sm_no not between", value1, value2, "sm_no");
            return (Criteria) this;
        }

        public Criteria andSm_passwordIsNull() {
            addCriterion("sm_password is null");
            return (Criteria) this;
        }

        public Criteria andSm_passwordIsNotNull() {
            addCriterion("sm_password is not null");
            return (Criteria) this;
        }

        public Criteria andSm_passwordEqualTo(String value) {
            addCriterion("sm_password =", value, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_passwordNotEqualTo(String value) {
            addCriterion("sm_password <>", value, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_passwordGreaterThan(String value) {
            addCriterion("sm_password >", value, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("sm_password >=", value, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_passwordLessThan(String value) {
            addCriterion("sm_password <", value, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_passwordLessThanOrEqualTo(String value) {
            addCriterion("sm_password <=", value, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_passwordLike(String value) {
            addCriterion("sm_password like", value, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_passwordNotLike(String value) {
            addCriterion("sm_password not like", value, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_passwordIn(List<String> values) {
            addCriterion("sm_password in", values, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_passwordNotIn(List<String> values) {
            addCriterion("sm_password not in", values, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_passwordBetween(String value1, String value2) {
            addCriterion("sm_password between", value1, value2, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_passwordNotBetween(String value1, String value2) {
            addCriterion("sm_password not between", value1, value2, "sm_password");
            return (Criteria) this;
        }

        public Criteria andSm_nameIsNull() {
            addCriterion("sm_name is null");
            return (Criteria) this;
        }

        public Criteria andSm_nameIsNotNull() {
            addCriterion("sm_name is not null");
            return (Criteria) this;
        }

        public Criteria andSm_nameEqualTo(String value) {
            addCriterion("sm_name =", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameNotEqualTo(String value) {
            addCriterion("sm_name <>", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameGreaterThan(String value) {
            addCriterion("sm_name >", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sm_name >=", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameLessThan(String value) {
            addCriterion("sm_name <", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameLessThanOrEqualTo(String value) {
            addCriterion("sm_name <=", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameLike(String value) {
            addCriterion("sm_name like", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameNotLike(String value) {
            addCriterion("sm_name not like", value, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameIn(List<String> values) {
            addCriterion("sm_name in", values, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameNotIn(List<String> values) {
            addCriterion("sm_name not in", values, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameBetween(String value1, String value2) {
            addCriterion("sm_name between", value1, value2, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_nameNotBetween(String value1, String value2) {
            addCriterion("sm_name not between", value1, value2, "sm_name");
            return (Criteria) this;
        }

        public Criteria andSm_phoneIsNull() {
            addCriterion("sm_phone is null");
            return (Criteria) this;
        }

        public Criteria andSm_phoneIsNotNull() {
            addCriterion("sm_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSm_phoneEqualTo(String value) {
            addCriterion("sm_phone =", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneNotEqualTo(String value) {
            addCriterion("sm_phone <>", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneGreaterThan(String value) {
            addCriterion("sm_phone >", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("sm_phone >=", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneLessThan(String value) {
            addCriterion("sm_phone <", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneLessThanOrEqualTo(String value) {
            addCriterion("sm_phone <=", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneLike(String value) {
            addCriterion("sm_phone like", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneNotLike(String value) {
            addCriterion("sm_phone not like", value, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneIn(List<String> values) {
            addCriterion("sm_phone in", values, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneNotIn(List<String> values) {
            addCriterion("sm_phone not in", values, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneBetween(String value1, String value2) {
            addCriterion("sm_phone between", value1, value2, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_phoneNotBetween(String value1, String value2) {
            addCriterion("sm_phone not between", value1, value2, "sm_phone");
            return (Criteria) this;
        }

        public Criteria andSm_emailIsNull() {
            addCriterion("sm_email is null");
            return (Criteria) this;
        }

        public Criteria andSm_emailIsNotNull() {
            addCriterion("sm_email is not null");
            return (Criteria) this;
        }

        public Criteria andSm_emailEqualTo(String value) {
            addCriterion("sm_email =", value, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_emailNotEqualTo(String value) {
            addCriterion("sm_email <>", value, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_emailGreaterThan(String value) {
            addCriterion("sm_email >", value, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_emailGreaterThanOrEqualTo(String value) {
            addCriterion("sm_email >=", value, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_emailLessThan(String value) {
            addCriterion("sm_email <", value, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_emailLessThanOrEqualTo(String value) {
            addCriterion("sm_email <=", value, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_emailLike(String value) {
            addCriterion("sm_email like", value, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_emailNotLike(String value) {
            addCriterion("sm_email not like", value, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_emailIn(List<String> values) {
            addCriterion("sm_email in", values, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_emailNotIn(List<String> values) {
            addCriterion("sm_email not in", values, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_emailBetween(String value1, String value2) {
            addCriterion("sm_email between", value1, value2, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_emailNotBetween(String value1, String value2) {
            addCriterion("sm_email not between", value1, value2, "sm_email");
            return (Criteria) this;
        }

        public Criteria andSm_remarkIsNull() {
            addCriterion("sm_remark is null");
            return (Criteria) this;
        }

        public Criteria andSm_remarkIsNotNull() {
            addCriterion("sm_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSm_remarkEqualTo(String value) {
            addCriterion("sm_remark =", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkNotEqualTo(String value) {
            addCriterion("sm_remark <>", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkGreaterThan(String value) {
            addCriterion("sm_remark >", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("sm_remark >=", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkLessThan(String value) {
            addCriterion("sm_remark <", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkLessThanOrEqualTo(String value) {
            addCriterion("sm_remark <=", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkLike(String value) {
            addCriterion("sm_remark like", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkNotLike(String value) {
            addCriterion("sm_remark not like", value, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkIn(List<String> values) {
            addCriterion("sm_remark in", values, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkNotIn(List<String> values) {
            addCriterion("sm_remark not in", values, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkBetween(String value1, String value2) {
            addCriterion("sm_remark between", value1, value2, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_remarkNotBetween(String value1, String value2) {
            addCriterion("sm_remark not between", value1, value2, "sm_remark");
            return (Criteria) this;
        }

        public Criteria andSm_roleidIsNull() {
            addCriterion("sm_roleid is null");
            return (Criteria) this;
        }

        public Criteria andSm_roleidIsNotNull() {
            addCriterion("sm_roleid is not null");
            return (Criteria) this;
        }

        public Criteria andSm_roleidEqualTo(Integer value) {
            addCriterion("sm_roleid =", value, "sm_roleid");
            return (Criteria) this;
        }

        public Criteria andSm_roleidNotEqualTo(Integer value) {
            addCriterion("sm_roleid <>", value, "sm_roleid");
            return (Criteria) this;
        }

        public Criteria andSm_roleidGreaterThan(Integer value) {
            addCriterion("sm_roleid >", value, "sm_roleid");
            return (Criteria) this;
        }

        public Criteria andSm_roleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_roleid >=", value, "sm_roleid");
            return (Criteria) this;
        }

        public Criteria andSm_roleidLessThan(Integer value) {
            addCriterion("sm_roleid <", value, "sm_roleid");
            return (Criteria) this;
        }

        public Criteria andSm_roleidLessThanOrEqualTo(Integer value) {
            addCriterion("sm_roleid <=", value, "sm_roleid");
            return (Criteria) this;
        }

        public Criteria andSm_roleidIn(List<Integer> values) {
            addCriterion("sm_roleid in", values, "sm_roleid");
            return (Criteria) this;
        }

        public Criteria andSm_roleidNotIn(List<Integer> values) {
            addCriterion("sm_roleid not in", values, "sm_roleid");
            return (Criteria) this;
        }

        public Criteria andSm_roleidBetween(Integer value1, Integer value2) {
            addCriterion("sm_roleid between", value1, value2, "sm_roleid");
            return (Criteria) this;
        }

        public Criteria andSm_roleidNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_roleid not between", value1, value2, "sm_roleid");
            return (Criteria) this;
        }

        public Criteria andSm_deptidIsNull() {
            addCriterion("sm_deptid is null");
            return (Criteria) this;
        }

        public Criteria andSm_deptidIsNotNull() {
            addCriterion("sm_deptid is not null");
            return (Criteria) this;
        }

        public Criteria andSm_deptidEqualTo(Integer value) {
            addCriterion("sm_deptid =", value, "sm_deptid");
            return (Criteria) this;
        }

        public Criteria andSm_deptidNotEqualTo(Integer value) {
            addCriterion("sm_deptid <>", value, "sm_deptid");
            return (Criteria) this;
        }

        public Criteria andSm_deptidGreaterThan(Integer value) {
            addCriterion("sm_deptid >", value, "sm_deptid");
            return (Criteria) this;
        }

        public Criteria andSm_deptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_deptid >=", value, "sm_deptid");
            return (Criteria) this;
        }

        public Criteria andSm_deptidLessThan(Integer value) {
            addCriterion("sm_deptid <", value, "sm_deptid");
            return (Criteria) this;
        }

        public Criteria andSm_deptidLessThanOrEqualTo(Integer value) {
            addCriterion("sm_deptid <=", value, "sm_deptid");
            return (Criteria) this;
        }

        public Criteria andSm_deptidIn(List<Integer> values) {
            addCriterion("sm_deptid in", values, "sm_deptid");
            return (Criteria) this;
        }

        public Criteria andSm_deptidNotIn(List<Integer> values) {
            addCriterion("sm_deptid not in", values, "sm_deptid");
            return (Criteria) this;
        }

        public Criteria andSm_deptidBetween(Integer value1, Integer value2) {
            addCriterion("sm_deptid between", value1, value2, "sm_deptid");
            return (Criteria) this;
        }

        public Criteria andSm_deptidNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_deptid not between", value1, value2, "sm_deptid");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminIsNull() {
            addCriterion("sm_flag_admin is null");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminIsNotNull() {
            addCriterion("sm_flag_admin is not null");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminEqualTo(Boolean value) {
            addCriterion("sm_flag_admin =", value, "sm_flag_admin");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminNotEqualTo(Boolean value) {
            addCriterion("sm_flag_admin <>", value, "sm_flag_admin");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminGreaterThan(Boolean value) {
            addCriterion("sm_flag_admin >", value, "sm_flag_admin");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sm_flag_admin >=", value, "sm_flag_admin");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminLessThan(Boolean value) {
            addCriterion("sm_flag_admin <", value, "sm_flag_admin");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminLessThanOrEqualTo(Boolean value) {
            addCriterion("sm_flag_admin <=", value, "sm_flag_admin");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminIn(List<Boolean> values) {
            addCriterion("sm_flag_admin in", values, "sm_flag_admin");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminNotIn(List<Boolean> values) {
            addCriterion("sm_flag_admin not in", values, "sm_flag_admin");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminBetween(Boolean value1, Boolean value2) {
            addCriterion("sm_flag_admin between", value1, value2, "sm_flag_admin");
            return (Criteria) this;
        }

        public Criteria andSm_flag_adminNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sm_flag_admin not between", value1, value2, "sm_flag_admin");
            return (Criteria) this;
        }

        public Criteria andSm_statusIsNull() {
            addCriterion("sm_status is null");
            return (Criteria) this;
        }

        public Criteria andSm_statusIsNotNull() {
            addCriterion("sm_status is not null");
            return (Criteria) this;
        }

        public Criteria andSm_statusEqualTo(Byte value) {
            addCriterion("sm_status =", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusNotEqualTo(Byte value) {
            addCriterion("sm_status <>", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusGreaterThan(Byte value) {
            addCriterion("sm_status >", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sm_status >=", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusLessThan(Byte value) {
            addCriterion("sm_status <", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusLessThanOrEqualTo(Byte value) {
            addCriterion("sm_status <=", value, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusIn(List<Byte> values) {
            addCriterion("sm_status in", values, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusNotIn(List<Byte> values) {
            addCriterion("sm_status not in", values, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusBetween(Byte value1, Byte value2) {
            addCriterion("sm_status between", value1, value2, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("sm_status not between", value1, value2, "sm_status");
            return (Criteria) this;
        }

        public Criteria andSm_createnoIsNull() {
            addCriterion("sm_createno is null");
            return (Criteria) this;
        }

        public Criteria andSm_createnoIsNotNull() {
            addCriterion("sm_createno is not null");
            return (Criteria) this;
        }

        public Criteria andSm_createnoEqualTo(String value) {
            addCriterion("sm_createno =", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotEqualTo(String value) {
            addCriterion("sm_createno <>", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoGreaterThan(String value) {
            addCriterion("sm_createno >", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("sm_createno >=", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoLessThan(String value) {
            addCriterion("sm_createno <", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoLessThanOrEqualTo(String value) {
            addCriterion("sm_createno <=", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoLike(String value) {
            addCriterion("sm_createno like", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotLike(String value) {
            addCriterion("sm_createno not like", value, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoIn(List<String> values) {
            addCriterion("sm_createno in", values, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotIn(List<String> values) {
            addCriterion("sm_createno not in", values, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoBetween(String value1, String value2) {
            addCriterion("sm_createno between", value1, value2, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createnoNotBetween(String value1, String value2) {
            addCriterion("sm_createno not between", value1, value2, "sm_createno");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIsNull() {
            addCriterion("sm_createdate is null");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIsNotNull() {
            addCriterion("sm_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andSm_createdateEqualTo(Date value) {
            addCriterion("sm_createdate =", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotEqualTo(Date value) {
            addCriterion("sm_createdate <>", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateGreaterThan(Date value) {
            addCriterion("sm_createdate >", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sm_createdate >=", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateLessThan(Date value) {
            addCriterion("sm_createdate <", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateLessThanOrEqualTo(Date value) {
            addCriterion("sm_createdate <=", value, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateIn(List<Date> values) {
            addCriterion("sm_createdate in", values, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotIn(List<Date> values) {
            addCriterion("sm_createdate not in", values, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateBetween(Date value1, Date value2) {
            addCriterion("sm_createdate between", value1, value2, "sm_createdate");
            return (Criteria) this;
        }

        public Criteria andSm_createdateNotBetween(Date value1, Date value2) {
            addCriterion("sm_createdate not between", value1, value2, "sm_createdate");
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