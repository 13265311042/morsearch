package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pm_AttachExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Pm_AttachExample() {
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

        public Criteria andAa_idIsNull() {
            addCriterion("aa_id is null");
            return (Criteria) this;
        }

        public Criteria andAa_idIsNotNull() {
            addCriterion("aa_id is not null");
            return (Criteria) this;
        }

        public Criteria andAa_idEqualTo(Long value) {
            addCriterion("aa_id =", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idNotEqualTo(Long value) {
            addCriterion("aa_id <>", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idGreaterThan(Long value) {
            addCriterion("aa_id >", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idGreaterThanOrEqualTo(Long value) {
            addCriterion("aa_id >=", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idLessThan(Long value) {
            addCriterion("aa_id <", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idLessThanOrEqualTo(Long value) {
            addCriterion("aa_id <=", value, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idIn(List<Long> values) {
            addCriterion("aa_id in", values, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idNotIn(List<Long> values) {
            addCriterion("aa_id not in", values, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idBetween(Long value1, Long value2) {
            addCriterion("aa_id between", value1, value2, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_idNotBetween(Long value1, Long value2) {
            addCriterion("aa_id not between", value1, value2, "aa_id");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidIsNull() {
            addCriterion("aa_archivesid is null");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidIsNotNull() {
            addCriterion("aa_archivesid is not null");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidEqualTo(Long value) {
            addCriterion("aa_archivesid =", value, "aa_archivesid");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidNotEqualTo(Long value) {
            addCriterion("aa_archivesid <>", value, "aa_archivesid");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidGreaterThan(Long value) {
            addCriterion("aa_archivesid >", value, "aa_archivesid");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidGreaterThanOrEqualTo(Long value) {
            addCriterion("aa_archivesid >=", value, "aa_archivesid");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidLessThan(Long value) {
            addCriterion("aa_archivesid <", value, "aa_archivesid");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidLessThanOrEqualTo(Long value) {
            addCriterion("aa_archivesid <=", value, "aa_archivesid");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidIn(List<Long> values) {
            addCriterion("aa_archivesid in", values, "aa_archivesid");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidNotIn(List<Long> values) {
            addCriterion("aa_archivesid not in", values, "aa_archivesid");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidBetween(Long value1, Long value2) {
            addCriterion("aa_archivesid between", value1, value2, "aa_archivesid");
            return (Criteria) this;
        }

        public Criteria andAa_archivesidNotBetween(Long value1, Long value2) {
            addCriterion("aa_archivesid not between", value1, value2, "aa_archivesid");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleIsNull() {
            addCriterion("aa_filetitle is null");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleIsNotNull() {
            addCriterion("aa_filetitle is not null");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleEqualTo(String value) {
            addCriterion("aa_filetitle =", value, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleNotEqualTo(String value) {
            addCriterion("aa_filetitle <>", value, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleGreaterThan(String value) {
            addCriterion("aa_filetitle >", value, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleGreaterThanOrEqualTo(String value) {
            addCriterion("aa_filetitle >=", value, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleLessThan(String value) {
            addCriterion("aa_filetitle <", value, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleLessThanOrEqualTo(String value) {
            addCriterion("aa_filetitle <=", value, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleLike(String value) {
            addCriterion("aa_filetitle like", value, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleNotLike(String value) {
            addCriterion("aa_filetitle not like", value, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleIn(List<String> values) {
            addCriterion("aa_filetitle in", values, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleNotIn(List<String> values) {
            addCriterion("aa_filetitle not in", values, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleBetween(String value1, String value2) {
            addCriterion("aa_filetitle between", value1, value2, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filetitleNotBetween(String value1, String value2) {
            addCriterion("aa_filetitle not between", value1, value2, "aa_filetitle");
            return (Criteria) this;
        }

        public Criteria andAa_filenameIsNull() {
            addCriterion("aa_filename is null");
            return (Criteria) this;
        }

        public Criteria andAa_filenameIsNotNull() {
            addCriterion("aa_filename is not null");
            return (Criteria) this;
        }

        public Criteria andAa_filenameEqualTo(String value) {
            addCriterion("aa_filename =", value, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filenameNotEqualTo(String value) {
            addCriterion("aa_filename <>", value, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filenameGreaterThan(String value) {
            addCriterion("aa_filename >", value, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filenameGreaterThanOrEqualTo(String value) {
            addCriterion("aa_filename >=", value, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filenameLessThan(String value) {
            addCriterion("aa_filename <", value, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filenameLessThanOrEqualTo(String value) {
            addCriterion("aa_filename <=", value, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filenameLike(String value) {
            addCriterion("aa_filename like", value, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filenameNotLike(String value) {
            addCriterion("aa_filename not like", value, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filenameIn(List<String> values) {
            addCriterion("aa_filename in", values, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filenameNotIn(List<String> values) {
            addCriterion("aa_filename not in", values, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filenameBetween(String value1, String value2) {
            addCriterion("aa_filename between", value1, value2, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filenameNotBetween(String value1, String value2) {
            addCriterion("aa_filename not between", value1, value2, "aa_filename");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeIsNull() {
            addCriterion("aa_filetype is null");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeIsNotNull() {
            addCriterion("aa_filetype is not null");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeEqualTo(String value) {
            addCriterion("aa_filetype =", value, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeNotEqualTo(String value) {
            addCriterion("aa_filetype <>", value, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeGreaterThan(String value) {
            addCriterion("aa_filetype >", value, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeGreaterThanOrEqualTo(String value) {
            addCriterion("aa_filetype >=", value, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeLessThan(String value) {
            addCriterion("aa_filetype <", value, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeLessThanOrEqualTo(String value) {
            addCriterion("aa_filetype <=", value, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeLike(String value) {
            addCriterion("aa_filetype like", value, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeNotLike(String value) {
            addCriterion("aa_filetype not like", value, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeIn(List<String> values) {
            addCriterion("aa_filetype in", values, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeNotIn(List<String> values) {
            addCriterion("aa_filetype not in", values, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeBetween(String value1, String value2) {
            addCriterion("aa_filetype between", value1, value2, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_filetypeNotBetween(String value1, String value2) {
            addCriterion("aa_filetype not between", value1, value2, "aa_filetype");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountIsNull() {
            addCriterion("aa_pagecount is null");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountIsNotNull() {
            addCriterion("aa_pagecount is not null");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountEqualTo(Integer value) {
            addCriterion("aa_pagecount =", value, "aa_pagecount");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountNotEqualTo(Integer value) {
            addCriterion("aa_pagecount <>", value, "aa_pagecount");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountGreaterThan(Integer value) {
            addCriterion("aa_pagecount >", value, "aa_pagecount");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("aa_pagecount >=", value, "aa_pagecount");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountLessThan(Integer value) {
            addCriterion("aa_pagecount <", value, "aa_pagecount");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountLessThanOrEqualTo(Integer value) {
            addCriterion("aa_pagecount <=", value, "aa_pagecount");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountIn(List<Integer> values) {
            addCriterion("aa_pagecount in", values, "aa_pagecount");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountNotIn(List<Integer> values) {
            addCriterion("aa_pagecount not in", values, "aa_pagecount");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountBetween(Integer value1, Integer value2) {
            addCriterion("aa_pagecount between", value1, value2, "aa_pagecount");
            return (Criteria) this;
        }

        public Criteria andAa_pagecountNotBetween(Integer value1, Integer value2) {
            addCriterion("aa_pagecount not between", value1, value2, "aa_pagecount");
            return (Criteria) this;
        }

        public Criteria andAa_createdateIsNull() {
            addCriterion("aa_createdate is null");
            return (Criteria) this;
        }

        public Criteria andAa_createdateIsNotNull() {
            addCriterion("aa_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andAa_createdateEqualTo(Date value) {
            addCriterion("aa_createdate =", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateNotEqualTo(Date value) {
            addCriterion("aa_createdate <>", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateGreaterThan(Date value) {
            addCriterion("aa_createdate >", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateGreaterThanOrEqualTo(Date value) {
            addCriterion("aa_createdate >=", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateLessThan(Date value) {
            addCriterion("aa_createdate <", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateLessThanOrEqualTo(Date value) {
            addCriterion("aa_createdate <=", value, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateIn(List<Date> values) {
            addCriterion("aa_createdate in", values, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateNotIn(List<Date> values) {
            addCriterion("aa_createdate not in", values, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateBetween(Date value1, Date value2) {
            addCriterion("aa_createdate between", value1, value2, "aa_createdate");
            return (Criteria) this;
        }

        public Criteria andAa_createdateNotBetween(Date value1, Date value2) {
            addCriterion("aa_createdate not between", value1, value2, "aa_createdate");
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