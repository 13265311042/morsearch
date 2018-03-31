package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Base_VersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Base_VersionExample() {
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

        public Criteria andAv_idIsNull() {
            addCriterion("av_id is null");
            return (Criteria) this;
        }

        public Criteria andAv_idIsNotNull() {
            addCriterion("av_id is not null");
            return (Criteria) this;
        }

        public Criteria andAv_idEqualTo(Long value) {
            addCriterion("av_id =", value, "av_id");
            return (Criteria) this;
        }

        public Criteria andAv_idNotEqualTo(Long value) {
            addCriterion("av_id <>", value, "av_id");
            return (Criteria) this;
        }

        public Criteria andAv_idGreaterThan(Long value) {
            addCriterion("av_id >", value, "av_id");
            return (Criteria) this;
        }

        public Criteria andAv_idGreaterThanOrEqualTo(Long value) {
            addCriterion("av_id >=", value, "av_id");
            return (Criteria) this;
        }

        public Criteria andAv_idLessThan(Long value) {
            addCriterion("av_id <", value, "av_id");
            return (Criteria) this;
        }

        public Criteria andAv_idLessThanOrEqualTo(Long value) {
            addCriterion("av_id <=", value, "av_id");
            return (Criteria) this;
        }

        public Criteria andAv_idIn(List<Long> values) {
            addCriterion("av_id in", values, "av_id");
            return (Criteria) this;
        }

        public Criteria andAv_idNotIn(List<Long> values) {
            addCriterion("av_id not in", values, "av_id");
            return (Criteria) this;
        }

        public Criteria andAv_idBetween(Long value1, Long value2) {
            addCriterion("av_id between", value1, value2, "av_id");
            return (Criteria) this;
        }

        public Criteria andAv_idNotBetween(Long value1, Long value2) {
            addCriterion("av_id not between", value1, value2, "av_id");
            return (Criteria) this;
        }

        public Criteria andAv_typeIsNull() {
            addCriterion("av_type is null");
            return (Criteria) this;
        }

        public Criteria andAv_typeIsNotNull() {
            addCriterion("av_type is not null");
            return (Criteria) this;
        }

        public Criteria andAv_typeEqualTo(Byte value) {
            addCriterion("av_type =", value, "av_type");
            return (Criteria) this;
        }

        public Criteria andAv_typeNotEqualTo(Byte value) {
            addCriterion("av_type <>", value, "av_type");
            return (Criteria) this;
        }

        public Criteria andAv_typeGreaterThan(Byte value) {
            addCriterion("av_type >", value, "av_type");
            return (Criteria) this;
        }

        public Criteria andAv_typeGreaterThanOrEqualTo(Byte value) {
            addCriterion("av_type >=", value, "av_type");
            return (Criteria) this;
        }

        public Criteria andAv_typeLessThan(Byte value) {
            addCriterion("av_type <", value, "av_type");
            return (Criteria) this;
        }

        public Criteria andAv_typeLessThanOrEqualTo(Byte value) {
            addCriterion("av_type <=", value, "av_type");
            return (Criteria) this;
        }

        public Criteria andAv_typeIn(List<Byte> values) {
            addCriterion("av_type in", values, "av_type");
            return (Criteria) this;
        }

        public Criteria andAv_typeNotIn(List<Byte> values) {
            addCriterion("av_type not in", values, "av_type");
            return (Criteria) this;
        }

        public Criteria andAv_typeBetween(Byte value1, Byte value2) {
            addCriterion("av_type between", value1, value2, "av_type");
            return (Criteria) this;
        }

        public Criteria andAv_typeNotBetween(Byte value1, Byte value2) {
            addCriterion("av_type not between", value1, value2, "av_type");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeIsNull() {
            addCriterion("av_versioncode is null");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeIsNotNull() {
            addCriterion("av_versioncode is not null");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeEqualTo(Integer value) {
            addCriterion("av_versioncode =", value, "av_versioncode");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeNotEqualTo(Integer value) {
            addCriterion("av_versioncode <>", value, "av_versioncode");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeGreaterThan(Integer value) {
            addCriterion("av_versioncode >", value, "av_versioncode");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("av_versioncode >=", value, "av_versioncode");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeLessThan(Integer value) {
            addCriterion("av_versioncode <", value, "av_versioncode");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeLessThanOrEqualTo(Integer value) {
            addCriterion("av_versioncode <=", value, "av_versioncode");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeIn(List<Integer> values) {
            addCriterion("av_versioncode in", values, "av_versioncode");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeNotIn(List<Integer> values) {
            addCriterion("av_versioncode not in", values, "av_versioncode");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeBetween(Integer value1, Integer value2) {
            addCriterion("av_versioncode between", value1, value2, "av_versioncode");
            return (Criteria) this;
        }

        public Criteria andAv_versioncodeNotBetween(Integer value1, Integer value2) {
            addCriterion("av_versioncode not between", value1, value2, "av_versioncode");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameIsNull() {
            addCriterion("av_versionname is null");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameIsNotNull() {
            addCriterion("av_versionname is not null");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameEqualTo(String value) {
            addCriterion("av_versionname =", value, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameNotEqualTo(String value) {
            addCriterion("av_versionname <>", value, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameGreaterThan(String value) {
            addCriterion("av_versionname >", value, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameGreaterThanOrEqualTo(String value) {
            addCriterion("av_versionname >=", value, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameLessThan(String value) {
            addCriterion("av_versionname <", value, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameLessThanOrEqualTo(String value) {
            addCriterion("av_versionname <=", value, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameLike(String value) {
            addCriterion("av_versionname like", value, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameNotLike(String value) {
            addCriterion("av_versionname not like", value, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameIn(List<String> values) {
            addCriterion("av_versionname in", values, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameNotIn(List<String> values) {
            addCriterion("av_versionname not in", values, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameBetween(String value1, String value2) {
            addCriterion("av_versionname between", value1, value2, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_versionnameNotBetween(String value1, String value2) {
            addCriterion("av_versionname not between", value1, value2, "av_versionname");
            return (Criteria) this;
        }

        public Criteria andAv_actionIsNull() {
            addCriterion("av_action is null");
            return (Criteria) this;
        }

        public Criteria andAv_actionIsNotNull() {
            addCriterion("av_action is not null");
            return (Criteria) this;
        }

        public Criteria andAv_actionEqualTo(Byte value) {
            addCriterion("av_action =", value, "av_action");
            return (Criteria) this;
        }

        public Criteria andAv_actionNotEqualTo(Byte value) {
            addCriterion("av_action <>", value, "av_action");
            return (Criteria) this;
        }

        public Criteria andAv_actionGreaterThan(Byte value) {
            addCriterion("av_action >", value, "av_action");
            return (Criteria) this;
        }

        public Criteria andAv_actionGreaterThanOrEqualTo(Byte value) {
            addCriterion("av_action >=", value, "av_action");
            return (Criteria) this;
        }

        public Criteria andAv_actionLessThan(Byte value) {
            addCriterion("av_action <", value, "av_action");
            return (Criteria) this;
        }

        public Criteria andAv_actionLessThanOrEqualTo(Byte value) {
            addCriterion("av_action <=", value, "av_action");
            return (Criteria) this;
        }

        public Criteria andAv_actionIn(List<Byte> values) {
            addCriterion("av_action in", values, "av_action");
            return (Criteria) this;
        }

        public Criteria andAv_actionNotIn(List<Byte> values) {
            addCriterion("av_action not in", values, "av_action");
            return (Criteria) this;
        }

        public Criteria andAv_actionBetween(Byte value1, Byte value2) {
            addCriterion("av_action between", value1, value2, "av_action");
            return (Criteria) this;
        }

        public Criteria andAv_actionNotBetween(Byte value1, Byte value2) {
            addCriterion("av_action not between", value1, value2, "av_action");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeIsNull() {
            addCriterion("av_baselinecode is null");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeIsNotNull() {
            addCriterion("av_baselinecode is not null");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeEqualTo(Integer value) {
            addCriterion("av_baselinecode =", value, "av_baselinecode");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeNotEqualTo(Integer value) {
            addCriterion("av_baselinecode <>", value, "av_baselinecode");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeGreaterThan(Integer value) {
            addCriterion("av_baselinecode >", value, "av_baselinecode");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("av_baselinecode >=", value, "av_baselinecode");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeLessThan(Integer value) {
            addCriterion("av_baselinecode <", value, "av_baselinecode");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeLessThanOrEqualTo(Integer value) {
            addCriterion("av_baselinecode <=", value, "av_baselinecode");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeIn(List<Integer> values) {
            addCriterion("av_baselinecode in", values, "av_baselinecode");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeNotIn(List<Integer> values) {
            addCriterion("av_baselinecode not in", values, "av_baselinecode");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeBetween(Integer value1, Integer value2) {
            addCriterion("av_baselinecode between", value1, value2, "av_baselinecode");
            return (Criteria) this;
        }

        public Criteria andAv_baselinecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("av_baselinecode not between", value1, value2, "av_baselinecode");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlIsNull() {
            addCriterion("av_down_url is null");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlIsNotNull() {
            addCriterion("av_down_url is not null");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlEqualTo(String value) {
            addCriterion("av_down_url =", value, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlNotEqualTo(String value) {
            addCriterion("av_down_url <>", value, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlGreaterThan(String value) {
            addCriterion("av_down_url >", value, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlGreaterThanOrEqualTo(String value) {
            addCriterion("av_down_url >=", value, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlLessThan(String value) {
            addCriterion("av_down_url <", value, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlLessThanOrEqualTo(String value) {
            addCriterion("av_down_url <=", value, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlLike(String value) {
            addCriterion("av_down_url like", value, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlNotLike(String value) {
            addCriterion("av_down_url not like", value, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlIn(List<String> values) {
            addCriterion("av_down_url in", values, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlNotIn(List<String> values) {
            addCriterion("av_down_url not in", values, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlBetween(String value1, String value2) {
            addCriterion("av_down_url between", value1, value2, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_urlNotBetween(String value1, String value2) {
            addCriterion("av_down_url not between", value1, value2, "av_down_url");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileIsNull() {
            addCriterion("av_down_file is null");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileIsNotNull() {
            addCriterion("av_down_file is not null");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileEqualTo(String value) {
            addCriterion("av_down_file =", value, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileNotEqualTo(String value) {
            addCriterion("av_down_file <>", value, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileGreaterThan(String value) {
            addCriterion("av_down_file >", value, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileGreaterThanOrEqualTo(String value) {
            addCriterion("av_down_file >=", value, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileLessThan(String value) {
            addCriterion("av_down_file <", value, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileLessThanOrEqualTo(String value) {
            addCriterion("av_down_file <=", value, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileLike(String value) {
            addCriterion("av_down_file like", value, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileNotLike(String value) {
            addCriterion("av_down_file not like", value, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileIn(List<String> values) {
            addCriterion("av_down_file in", values, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileNotIn(List<String> values) {
            addCriterion("av_down_file not in", values, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileBetween(String value1, String value2) {
            addCriterion("av_down_file between", value1, value2, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_down_fileNotBetween(String value1, String value2) {
            addCriterion("av_down_file not between", value1, value2, "av_down_file");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeIsNull() {
            addCriterion("av_filesize is null");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeIsNotNull() {
            addCriterion("av_filesize is not null");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeEqualTo(Integer value) {
            addCriterion("av_filesize =", value, "av_filesize");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeNotEqualTo(Integer value) {
            addCriterion("av_filesize <>", value, "av_filesize");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeGreaterThan(Integer value) {
            addCriterion("av_filesize >", value, "av_filesize");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("av_filesize >=", value, "av_filesize");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeLessThan(Integer value) {
            addCriterion("av_filesize <", value, "av_filesize");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeLessThanOrEqualTo(Integer value) {
            addCriterion("av_filesize <=", value, "av_filesize");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeIn(List<Integer> values) {
            addCriterion("av_filesize in", values, "av_filesize");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeNotIn(List<Integer> values) {
            addCriterion("av_filesize not in", values, "av_filesize");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeBetween(Integer value1, Integer value2) {
            addCriterion("av_filesize between", value1, value2, "av_filesize");
            return (Criteria) this;
        }

        public Criteria andAv_filesizeNotBetween(Integer value1, Integer value2) {
            addCriterion("av_filesize not between", value1, value2, "av_filesize");
            return (Criteria) this;
        }

        public Criteria andAv_infoIsNull() {
            addCriterion("av_info is null");
            return (Criteria) this;
        }

        public Criteria andAv_infoIsNotNull() {
            addCriterion("av_info is not null");
            return (Criteria) this;
        }

        public Criteria andAv_infoEqualTo(String value) {
            addCriterion("av_info =", value, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_infoNotEqualTo(String value) {
            addCriterion("av_info <>", value, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_infoGreaterThan(String value) {
            addCriterion("av_info >", value, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_infoGreaterThanOrEqualTo(String value) {
            addCriterion("av_info >=", value, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_infoLessThan(String value) {
            addCriterion("av_info <", value, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_infoLessThanOrEqualTo(String value) {
            addCriterion("av_info <=", value, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_infoLike(String value) {
            addCriterion("av_info like", value, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_infoNotLike(String value) {
            addCriterion("av_info not like", value, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_infoIn(List<String> values) {
            addCriterion("av_info in", values, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_infoNotIn(List<String> values) {
            addCriterion("av_info not in", values, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_infoBetween(String value1, String value2) {
            addCriterion("av_info between", value1, value2, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_infoNotBetween(String value1, String value2) {
            addCriterion("av_info not between", value1, value2, "av_info");
            return (Criteria) this;
        }

        public Criteria andAv_createidIsNull() {
            addCriterion("av_createid is null");
            return (Criteria) this;
        }

        public Criteria andAv_createidIsNotNull() {
            addCriterion("av_createid is not null");
            return (Criteria) this;
        }

        public Criteria andAv_createidEqualTo(Integer value) {
            addCriterion("av_createid =", value, "av_createid");
            return (Criteria) this;
        }

        public Criteria andAv_createidNotEqualTo(Integer value) {
            addCriterion("av_createid <>", value, "av_createid");
            return (Criteria) this;
        }

        public Criteria andAv_createidGreaterThan(Integer value) {
            addCriterion("av_createid >", value, "av_createid");
            return (Criteria) this;
        }

        public Criteria andAv_createidGreaterThanOrEqualTo(Integer value) {
            addCriterion("av_createid >=", value, "av_createid");
            return (Criteria) this;
        }

        public Criteria andAv_createidLessThan(Integer value) {
            addCriterion("av_createid <", value, "av_createid");
            return (Criteria) this;
        }

        public Criteria andAv_createidLessThanOrEqualTo(Integer value) {
            addCriterion("av_createid <=", value, "av_createid");
            return (Criteria) this;
        }

        public Criteria andAv_createidIn(List<Integer> values) {
            addCriterion("av_createid in", values, "av_createid");
            return (Criteria) this;
        }

        public Criteria andAv_createidNotIn(List<Integer> values) {
            addCriterion("av_createid not in", values, "av_createid");
            return (Criteria) this;
        }

        public Criteria andAv_createidBetween(Integer value1, Integer value2) {
            addCriterion("av_createid between", value1, value2, "av_createid");
            return (Criteria) this;
        }

        public Criteria andAv_createidNotBetween(Integer value1, Integer value2) {
            addCriterion("av_createid not between", value1, value2, "av_createid");
            return (Criteria) this;
        }

        public Criteria andAv_createnoIsNull() {
            addCriterion("av_createno is null");
            return (Criteria) this;
        }

        public Criteria andAv_createnoIsNotNull() {
            addCriterion("av_createno is not null");
            return (Criteria) this;
        }

        public Criteria andAv_createnoEqualTo(String value) {
            addCriterion("av_createno =", value, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createnoNotEqualTo(String value) {
            addCriterion("av_createno <>", value, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createnoGreaterThan(String value) {
            addCriterion("av_createno >", value, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createnoGreaterThanOrEqualTo(String value) {
            addCriterion("av_createno >=", value, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createnoLessThan(String value) {
            addCriterion("av_createno <", value, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createnoLessThanOrEqualTo(String value) {
            addCriterion("av_createno <=", value, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createnoLike(String value) {
            addCriterion("av_createno like", value, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createnoNotLike(String value) {
            addCriterion("av_createno not like", value, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createnoIn(List<String> values) {
            addCriterion("av_createno in", values, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createnoNotIn(List<String> values) {
            addCriterion("av_createno not in", values, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createnoBetween(String value1, String value2) {
            addCriterion("av_createno between", value1, value2, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createnoNotBetween(String value1, String value2) {
            addCriterion("av_createno not between", value1, value2, "av_createno");
            return (Criteria) this;
        }

        public Criteria andAv_createdateIsNull() {
            addCriterion("av_createdate is null");
            return (Criteria) this;
        }

        public Criteria andAv_createdateIsNotNull() {
            addCriterion("av_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andAv_createdateEqualTo(Date value) {
            addCriterion("av_createdate =", value, "av_createdate");
            return (Criteria) this;
        }

        public Criteria andAv_createdateNotEqualTo(Date value) {
            addCriterion("av_createdate <>", value, "av_createdate");
            return (Criteria) this;
        }

        public Criteria andAv_createdateGreaterThan(Date value) {
            addCriterion("av_createdate >", value, "av_createdate");
            return (Criteria) this;
        }

        public Criteria andAv_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("av_createdate >=", value, "av_createdate");
            return (Criteria) this;
        }

        public Criteria andAv_createdateLessThan(Date value) {
            addCriterion("av_createdate <", value, "av_createdate");
            return (Criteria) this;
        }

        public Criteria andAv_createdateLessThanOrEqualTo(Date value) {
            addCriterion("av_createdate <=", value, "av_createdate");
            return (Criteria) this;
        }

        public Criteria andAv_createdateIn(List<Date> values) {
            addCriterion("av_createdate in", values, "av_createdate");
            return (Criteria) this;
        }

        public Criteria andAv_createdateNotIn(List<Date> values) {
            addCriterion("av_createdate not in", values, "av_createdate");
            return (Criteria) this;
        }

        public Criteria andAv_createdateBetween(Date value1, Date value2) {
            addCriterion("av_createdate between", value1, value2, "av_createdate");
            return (Criteria) this;
        }

        public Criteria andAv_createdateNotBetween(Date value1, Date value2) {
            addCriterion("av_createdate not between", value1, value2, "av_createdate");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagIsNull() {
            addCriterion("av_stopflag is null");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagIsNotNull() {
            addCriterion("av_stopflag is not null");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagEqualTo(Boolean value) {
            addCriterion("av_stopflag =", value, "av_stopflag");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagNotEqualTo(Boolean value) {
            addCriterion("av_stopflag <>", value, "av_stopflag");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagGreaterThan(Boolean value) {
            addCriterion("av_stopflag >", value, "av_stopflag");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("av_stopflag >=", value, "av_stopflag");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagLessThan(Boolean value) {
            addCriterion("av_stopflag <", value, "av_stopflag");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("av_stopflag <=", value, "av_stopflag");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagIn(List<Boolean> values) {
            addCriterion("av_stopflag in", values, "av_stopflag");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagNotIn(List<Boolean> values) {
            addCriterion("av_stopflag not in", values, "av_stopflag");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("av_stopflag between", value1, value2, "av_stopflag");
            return (Criteria) this;
        }

        public Criteria andAv_stopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("av_stopflag not between", value1, value2, "av_stopflag");
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