package com.morsearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Award_ShareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Award_ShareExample() {
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

        public Criteria andBa_idIsNull() {
            addCriterion("ba_id is null");
            return (Criteria) this;
        }

        public Criteria andBa_idIsNotNull() {
            addCriterion("ba_id is not null");
            return (Criteria) this;
        }

        public Criteria andBa_idEqualTo(Long value) {
            addCriterion("ba_id =", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idNotEqualTo(Long value) {
            addCriterion("ba_id <>", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idGreaterThan(Long value) {
            addCriterion("ba_id >", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ba_id >=", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idLessThan(Long value) {
            addCriterion("ba_id <", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idLessThanOrEqualTo(Long value) {
            addCriterion("ba_id <=", value, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idIn(List<Long> values) {
            addCriterion("ba_id in", values, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idNotIn(List<Long> values) {
            addCriterion("ba_id not in", values, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idBetween(Long value1, Long value2) {
            addCriterion("ba_id between", value1, value2, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_idNotBetween(Long value1, Long value2) {
            addCriterion("ba_id not between", value1, value2, "ba_id");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeIsNull() {
            addCriterion("ba_tasktype is null");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeIsNotNull() {
            addCriterion("ba_tasktype is not null");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeEqualTo(String value) {
            addCriterion("ba_tasktype =", value, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeNotEqualTo(String value) {
            addCriterion("ba_tasktype <>", value, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeGreaterThan(String value) {
            addCriterion("ba_tasktype >", value, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeGreaterThanOrEqualTo(String value) {
            addCriterion("ba_tasktype >=", value, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeLessThan(String value) {
            addCriterion("ba_tasktype <", value, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeLessThanOrEqualTo(String value) {
            addCriterion("ba_tasktype <=", value, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeLike(String value) {
            addCriterion("ba_tasktype like", value, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeNotLike(String value) {
            addCriterion("ba_tasktype not like", value, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeIn(List<String> values) {
            addCriterion("ba_tasktype in", values, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeNotIn(List<String> values) {
            addCriterion("ba_tasktype not in", values, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeBetween(String value1, String value2) {
            addCriterion("ba_tasktype between", value1, value2, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_tasktypeNotBetween(String value1, String value2) {
            addCriterion("ba_tasktype not between", value1, value2, "ba_tasktype");
            return (Criteria) this;
        }

        public Criteria andBa_nameIsNull() {
            addCriterion("ba_name is null");
            return (Criteria) this;
        }

        public Criteria andBa_nameIsNotNull() {
            addCriterion("ba_name is not null");
            return (Criteria) this;
        }

        public Criteria andBa_nameEqualTo(String value) {
            addCriterion("ba_name =", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameNotEqualTo(String value) {
            addCriterion("ba_name <>", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameGreaterThan(String value) {
            addCriterion("ba_name >", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameGreaterThanOrEqualTo(String value) {
            addCriterion("ba_name >=", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameLessThan(String value) {
            addCriterion("ba_name <", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameLessThanOrEqualTo(String value) {
            addCriterion("ba_name <=", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameLike(String value) {
            addCriterion("ba_name like", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameNotLike(String value) {
            addCriterion("ba_name not like", value, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameIn(List<String> values) {
            addCriterion("ba_name in", values, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameNotIn(List<String> values) {
            addCriterion("ba_name not in", values, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameBetween(String value1, String value2) {
            addCriterion("ba_name between", value1, value2, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_nameNotBetween(String value1, String value2) {
            addCriterion("ba_name not between", value1, value2, "ba_name");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginIsNull() {
            addCriterion("ba_datebegin is null");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginIsNotNull() {
            addCriterion("ba_datebegin is not null");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginEqualTo(String value) {
            addCriterion("ba_datebegin =", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginNotEqualTo(String value) {
            addCriterion("ba_datebegin <>", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginGreaterThan(String value) {
            addCriterion("ba_datebegin >", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginGreaterThanOrEqualTo(String value) {
            addCriterion("ba_datebegin >=", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginLessThan(String value) {
            addCriterion("ba_datebegin <", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginLessThanOrEqualTo(String value) {
            addCriterion("ba_datebegin <=", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginLike(String value) {
            addCriterion("ba_datebegin like", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginNotLike(String value) {
            addCriterion("ba_datebegin not like", value, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginIn(List<String> values) {
            addCriterion("ba_datebegin in", values, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginNotIn(List<String> values) {
            addCriterion("ba_datebegin not in", values, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginBetween(String value1, String value2) {
            addCriterion("ba_datebegin between", value1, value2, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_datebeginNotBetween(String value1, String value2) {
            addCriterion("ba_datebegin not between", value1, value2, "ba_datebegin");
            return (Criteria) this;
        }

        public Criteria andBa_dateendIsNull() {
            addCriterion("ba_dateend is null");
            return (Criteria) this;
        }

        public Criteria andBa_dateendIsNotNull() {
            addCriterion("ba_dateend is not null");
            return (Criteria) this;
        }

        public Criteria andBa_dateendEqualTo(String value) {
            addCriterion("ba_dateend =", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendNotEqualTo(String value) {
            addCriterion("ba_dateend <>", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendGreaterThan(String value) {
            addCriterion("ba_dateend >", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendGreaterThanOrEqualTo(String value) {
            addCriterion("ba_dateend >=", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendLessThan(String value) {
            addCriterion("ba_dateend <", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendLessThanOrEqualTo(String value) {
            addCriterion("ba_dateend <=", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendLike(String value) {
            addCriterion("ba_dateend like", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendNotLike(String value) {
            addCriterion("ba_dateend not like", value, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendIn(List<String> values) {
            addCriterion("ba_dateend in", values, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendNotIn(List<String> values) {
            addCriterion("ba_dateend not in", values, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendBetween(String value1, String value2) {
            addCriterion("ba_dateend between", value1, value2, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_dateendNotBetween(String value1, String value2) {
            addCriterion("ba_dateend not between", value1, value2, "ba_dateend");
            return (Criteria) this;
        }

        public Criteria andBa_popupIsNull() {
            addCriterion("ba_popup is null");
            return (Criteria) this;
        }

        public Criteria andBa_popupIsNotNull() {
            addCriterion("ba_popup is not null");
            return (Criteria) this;
        }

        public Criteria andBa_popupEqualTo(Short value) {
            addCriterion("ba_popup =", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupNotEqualTo(Short value) {
            addCriterion("ba_popup <>", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupGreaterThan(Short value) {
            addCriterion("ba_popup >", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupGreaterThanOrEqualTo(Short value) {
            addCriterion("ba_popup >=", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupLessThan(Short value) {
            addCriterion("ba_popup <", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupLessThanOrEqualTo(Short value) {
            addCriterion("ba_popup <=", value, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupIn(List<Short> values) {
            addCriterion("ba_popup in", values, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupNotIn(List<Short> values) {
            addCriterion("ba_popup not in", values, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupBetween(Short value1, Short value2) {
            addCriterion("ba_popup between", value1, value2, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_popupNotBetween(Short value1, Short value2) {
            addCriterion("ba_popup not between", value1, value2, "ba_popup");
            return (Criteria) this;
        }

        public Criteria andBa_titleIsNull() {
            addCriterion("ba_title is null");
            return (Criteria) this;
        }

        public Criteria andBa_titleIsNotNull() {
            addCriterion("ba_title is not null");
            return (Criteria) this;
        }

        public Criteria andBa_titleEqualTo(String value) {
            addCriterion("ba_title =", value, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_titleNotEqualTo(String value) {
            addCriterion("ba_title <>", value, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_titleGreaterThan(String value) {
            addCriterion("ba_title >", value, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_titleGreaterThanOrEqualTo(String value) {
            addCriterion("ba_title >=", value, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_titleLessThan(String value) {
            addCriterion("ba_title <", value, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_titleLessThanOrEqualTo(String value) {
            addCriterion("ba_title <=", value, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_titleLike(String value) {
            addCriterion("ba_title like", value, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_titleNotLike(String value) {
            addCriterion("ba_title not like", value, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_titleIn(List<String> values) {
            addCriterion("ba_title in", values, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_titleNotIn(List<String> values) {
            addCriterion("ba_title not in", values, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_titleBetween(String value1, String value2) {
            addCriterion("ba_title between", value1, value2, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_titleNotBetween(String value1, String value2) {
            addCriterion("ba_title not between", value1, value2, "ba_title");
            return (Criteria) this;
        }

        public Criteria andBa_linkIsNull() {
            addCriterion("ba_link is null");
            return (Criteria) this;
        }

        public Criteria andBa_linkIsNotNull() {
            addCriterion("ba_link is not null");
            return (Criteria) this;
        }

        public Criteria andBa_linkEqualTo(String value) {
            addCriterion("ba_link =", value, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_linkNotEqualTo(String value) {
            addCriterion("ba_link <>", value, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_linkGreaterThan(String value) {
            addCriterion("ba_link >", value, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_linkGreaterThanOrEqualTo(String value) {
            addCriterion("ba_link >=", value, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_linkLessThan(String value) {
            addCriterion("ba_link <", value, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_linkLessThanOrEqualTo(String value) {
            addCriterion("ba_link <=", value, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_linkLike(String value) {
            addCriterion("ba_link like", value, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_linkNotLike(String value) {
            addCriterion("ba_link not like", value, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_linkIn(List<String> values) {
            addCriterion("ba_link in", values, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_linkNotIn(List<String> values) {
            addCriterion("ba_link not in", values, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_linkBetween(String value1, String value2) {
            addCriterion("ba_link between", value1, value2, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_linkNotBetween(String value1, String value2) {
            addCriterion("ba_link not between", value1, value2, "ba_link");
            return (Criteria) this;
        }

        public Criteria andBa_ruleIsNull() {
            addCriterion("ba_rule is null");
            return (Criteria) this;
        }

        public Criteria andBa_ruleIsNotNull() {
            addCriterion("ba_rule is not null");
            return (Criteria) this;
        }

        public Criteria andBa_ruleEqualTo(String value) {
            addCriterion("ba_rule =", value, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_ruleNotEqualTo(String value) {
            addCriterion("ba_rule <>", value, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_ruleGreaterThan(String value) {
            addCriterion("ba_rule >", value, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_ruleGreaterThanOrEqualTo(String value) {
            addCriterion("ba_rule >=", value, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_ruleLessThan(String value) {
            addCriterion("ba_rule <", value, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_ruleLessThanOrEqualTo(String value) {
            addCriterion("ba_rule <=", value, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_ruleLike(String value) {
            addCriterion("ba_rule like", value, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_ruleNotLike(String value) {
            addCriterion("ba_rule not like", value, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_ruleIn(List<String> values) {
            addCriterion("ba_rule in", values, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_ruleNotIn(List<String> values) {
            addCriterion("ba_rule not in", values, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_ruleBetween(String value1, String value2) {
            addCriterion("ba_rule between", value1, value2, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_ruleNotBetween(String value1, String value2) {
            addCriterion("ba_rule not between", value1, value2, "ba_rule");
            return (Criteria) this;
        }

        public Criteria andBa_imageIsNull() {
            addCriterion("ba_image is null");
            return (Criteria) this;
        }

        public Criteria andBa_imageIsNotNull() {
            addCriterion("ba_image is not null");
            return (Criteria) this;
        }

        public Criteria andBa_imageEqualTo(String value) {
            addCriterion("ba_image =", value, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_imageNotEqualTo(String value) {
            addCriterion("ba_image <>", value, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_imageGreaterThan(String value) {
            addCriterion("ba_image >", value, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_imageGreaterThanOrEqualTo(String value) {
            addCriterion("ba_image >=", value, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_imageLessThan(String value) {
            addCriterion("ba_image <", value, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_imageLessThanOrEqualTo(String value) {
            addCriterion("ba_image <=", value, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_imageLike(String value) {
            addCriterion("ba_image like", value, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_imageNotLike(String value) {
            addCriterion("ba_image not like", value, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_imageIn(List<String> values) {
            addCriterion("ba_image in", values, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_imageNotIn(List<String> values) {
            addCriterion("ba_image not in", values, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_imageBetween(String value1, String value2) {
            addCriterion("ba_image between", value1, value2, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_imageNotBetween(String value1, String value2) {
            addCriterion("ba_image not between", value1, value2, "ba_image");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftIsNull() {
            addCriterion("ba_share_gift is null");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftIsNotNull() {
            addCriterion("ba_share_gift is not null");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftEqualTo(Integer value) {
            addCriterion("ba_share_gift =", value, "ba_share_gift");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftNotEqualTo(Integer value) {
            addCriterion("ba_share_gift <>", value, "ba_share_gift");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftGreaterThan(Integer value) {
            addCriterion("ba_share_gift >", value, "ba_share_gift");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftGreaterThanOrEqualTo(Integer value) {
            addCriterion("ba_share_gift >=", value, "ba_share_gift");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftLessThan(Integer value) {
            addCriterion("ba_share_gift <", value, "ba_share_gift");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftLessThanOrEqualTo(Integer value) {
            addCriterion("ba_share_gift <=", value, "ba_share_gift");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftIn(List<Integer> values) {
            addCriterion("ba_share_gift in", values, "ba_share_gift");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftNotIn(List<Integer> values) {
            addCriterion("ba_share_gift not in", values, "ba_share_gift");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftBetween(Integer value1, Integer value2) {
            addCriterion("ba_share_gift between", value1, value2, "ba_share_gift");
            return (Criteria) this;
        }

        public Criteria andBa_share_giftNotBetween(Integer value1, Integer value2) {
            addCriterion("ba_share_gift not between", value1, value2, "ba_share_gift");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictIsNull() {
            addCriterion("ba_share_astrict is null");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictIsNotNull() {
            addCriterion("ba_share_astrict is not null");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictEqualTo(Boolean value) {
            addCriterion("ba_share_astrict =", value, "ba_share_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictNotEqualTo(Boolean value) {
            addCriterion("ba_share_astrict <>", value, "ba_share_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictGreaterThan(Boolean value) {
            addCriterion("ba_share_astrict >", value, "ba_share_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ba_share_astrict >=", value, "ba_share_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictLessThan(Boolean value) {
            addCriterion("ba_share_astrict <", value, "ba_share_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictLessThanOrEqualTo(Boolean value) {
            addCriterion("ba_share_astrict <=", value, "ba_share_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictIn(List<Boolean> values) {
            addCriterion("ba_share_astrict in", values, "ba_share_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictNotIn(List<Boolean> values) {
            addCriterion("ba_share_astrict not in", values, "ba_share_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictBetween(Boolean value1, Boolean value2) {
            addCriterion("ba_share_astrict between", value1, value2, "ba_share_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_share_astrictNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ba_share_astrict not between", value1, value2, "ba_share_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_share_countIsNull() {
            addCriterion("ba_share_count is null");
            return (Criteria) this;
        }

        public Criteria andBa_share_countIsNotNull() {
            addCriterion("ba_share_count is not null");
            return (Criteria) this;
        }

        public Criteria andBa_share_countEqualTo(Integer value) {
            addCriterion("ba_share_count =", value, "ba_share_count");
            return (Criteria) this;
        }

        public Criteria andBa_share_countNotEqualTo(Integer value) {
            addCriterion("ba_share_count <>", value, "ba_share_count");
            return (Criteria) this;
        }

        public Criteria andBa_share_countGreaterThan(Integer value) {
            addCriterion("ba_share_count >", value, "ba_share_count");
            return (Criteria) this;
        }

        public Criteria andBa_share_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("ba_share_count >=", value, "ba_share_count");
            return (Criteria) this;
        }

        public Criteria andBa_share_countLessThan(Integer value) {
            addCriterion("ba_share_count <", value, "ba_share_count");
            return (Criteria) this;
        }

        public Criteria andBa_share_countLessThanOrEqualTo(Integer value) {
            addCriterion("ba_share_count <=", value, "ba_share_count");
            return (Criteria) this;
        }

        public Criteria andBa_share_countIn(List<Integer> values) {
            addCriterion("ba_share_count in", values, "ba_share_count");
            return (Criteria) this;
        }

        public Criteria andBa_share_countNotIn(List<Integer> values) {
            addCriterion("ba_share_count not in", values, "ba_share_count");
            return (Criteria) this;
        }

        public Criteria andBa_share_countBetween(Integer value1, Integer value2) {
            addCriterion("ba_share_count between", value1, value2, "ba_share_count");
            return (Criteria) this;
        }

        public Criteria andBa_share_countNotBetween(Integer value1, Integer value2) {
            addCriterion("ba_share_count not between", value1, value2, "ba_share_count");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftIsNull() {
            addCriterion("ba_receive_gift is null");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftIsNotNull() {
            addCriterion("ba_receive_gift is not null");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftEqualTo(Integer value) {
            addCriterion("ba_receive_gift =", value, "ba_receive_gift");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftNotEqualTo(Integer value) {
            addCriterion("ba_receive_gift <>", value, "ba_receive_gift");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftGreaterThan(Integer value) {
            addCriterion("ba_receive_gift >", value, "ba_receive_gift");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftGreaterThanOrEqualTo(Integer value) {
            addCriterion("ba_receive_gift >=", value, "ba_receive_gift");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftLessThan(Integer value) {
            addCriterion("ba_receive_gift <", value, "ba_receive_gift");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftLessThanOrEqualTo(Integer value) {
            addCriterion("ba_receive_gift <=", value, "ba_receive_gift");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftIn(List<Integer> values) {
            addCriterion("ba_receive_gift in", values, "ba_receive_gift");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftNotIn(List<Integer> values) {
            addCriterion("ba_receive_gift not in", values, "ba_receive_gift");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftBetween(Integer value1, Integer value2) {
            addCriterion("ba_receive_gift between", value1, value2, "ba_receive_gift");
            return (Criteria) this;
        }

        public Criteria andBa_receive_giftNotBetween(Integer value1, Integer value2) {
            addCriterion("ba_receive_gift not between", value1, value2, "ba_receive_gift");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictIsNull() {
            addCriterion("ba_receive_astrict is null");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictIsNotNull() {
            addCriterion("ba_receive_astrict is not null");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictEqualTo(Boolean value) {
            addCriterion("ba_receive_astrict =", value, "ba_receive_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictNotEqualTo(Boolean value) {
            addCriterion("ba_receive_astrict <>", value, "ba_receive_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictGreaterThan(Boolean value) {
            addCriterion("ba_receive_astrict >", value, "ba_receive_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ba_receive_astrict >=", value, "ba_receive_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictLessThan(Boolean value) {
            addCriterion("ba_receive_astrict <", value, "ba_receive_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictLessThanOrEqualTo(Boolean value) {
            addCriterion("ba_receive_astrict <=", value, "ba_receive_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictIn(List<Boolean> values) {
            addCriterion("ba_receive_astrict in", values, "ba_receive_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictNotIn(List<Boolean> values) {
            addCriterion("ba_receive_astrict not in", values, "ba_receive_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictBetween(Boolean value1, Boolean value2) {
            addCriterion("ba_receive_astrict between", value1, value2, "ba_receive_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_receive_astrictNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ba_receive_astrict not between", value1, value2, "ba_receive_astrict");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countIsNull() {
            addCriterion("ba_receive_count is null");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countIsNotNull() {
            addCriterion("ba_receive_count is not null");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countEqualTo(Integer value) {
            addCriterion("ba_receive_count =", value, "ba_receive_count");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countNotEqualTo(Integer value) {
            addCriterion("ba_receive_count <>", value, "ba_receive_count");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countGreaterThan(Integer value) {
            addCriterion("ba_receive_count >", value, "ba_receive_count");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("ba_receive_count >=", value, "ba_receive_count");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countLessThan(Integer value) {
            addCriterion("ba_receive_count <", value, "ba_receive_count");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countLessThanOrEqualTo(Integer value) {
            addCriterion("ba_receive_count <=", value, "ba_receive_count");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countIn(List<Integer> values) {
            addCriterion("ba_receive_count in", values, "ba_receive_count");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countNotIn(List<Integer> values) {
            addCriterion("ba_receive_count not in", values, "ba_receive_count");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countBetween(Integer value1, Integer value2) {
            addCriterion("ba_receive_count between", value1, value2, "ba_receive_count");
            return (Criteria) this;
        }

        public Criteria andBa_receive_countNotBetween(Integer value1, Integer value2) {
            addCriterion("ba_receive_count not between", value1, value2, "ba_receive_count");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesIsNull() {
            addCriterion("ba_record_activities is null");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesIsNotNull() {
            addCriterion("ba_record_activities is not null");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesEqualTo(String value) {
            addCriterion("ba_record_activities =", value, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesNotEqualTo(String value) {
            addCriterion("ba_record_activities <>", value, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesGreaterThan(String value) {
            addCriterion("ba_record_activities >", value, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesGreaterThanOrEqualTo(String value) {
            addCriterion("ba_record_activities >=", value, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesLessThan(String value) {
            addCriterion("ba_record_activities <", value, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesLessThanOrEqualTo(String value) {
            addCriterion("ba_record_activities <=", value, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesLike(String value) {
            addCriterion("ba_record_activities like", value, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesNotLike(String value) {
            addCriterion("ba_record_activities not like", value, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesIn(List<String> values) {
            addCriterion("ba_record_activities in", values, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesNotIn(List<String> values) {
            addCriterion("ba_record_activities not in", values, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesBetween(String value1, String value2) {
            addCriterion("ba_record_activities between", value1, value2, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_record_activitiesNotBetween(String value1, String value2) {
            addCriterion("ba_record_activities not between", value1, value2, "ba_record_activities");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeIsNull() {
            addCriterion("ba_award_type is null");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeIsNotNull() {
            addCriterion("ba_award_type is not null");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeEqualTo(Byte value) {
            addCriterion("ba_award_type =", value, "ba_award_type");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeNotEqualTo(Byte value) {
            addCriterion("ba_award_type <>", value, "ba_award_type");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeGreaterThan(Byte value) {
            addCriterion("ba_award_type >", value, "ba_award_type");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ba_award_type >=", value, "ba_award_type");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeLessThan(Byte value) {
            addCriterion("ba_award_type <", value, "ba_award_type");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeLessThanOrEqualTo(Byte value) {
            addCriterion("ba_award_type <=", value, "ba_award_type");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeIn(List<Byte> values) {
            addCriterion("ba_award_type in", values, "ba_award_type");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeNotIn(List<Byte> values) {
            addCriterion("ba_award_type not in", values, "ba_award_type");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeBetween(Byte value1, Byte value2) {
            addCriterion("ba_award_type between", value1, value2, "ba_award_type");
            return (Criteria) this;
        }

        public Criteria andBa_award_typeNotBetween(Byte value1, Byte value2) {
            addCriterion("ba_award_type not between", value1, value2, "ba_award_type");
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

        public Criteria andBa_confirmidIsNull() {
            addCriterion("ba_confirmid is null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidIsNotNull() {
            addCriterion("ba_confirmid is not null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidEqualTo(Long value) {
            addCriterion("ba_confirmid =", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidNotEqualTo(Long value) {
            addCriterion("ba_confirmid <>", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidGreaterThan(Long value) {
            addCriterion("ba_confirmid >", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidGreaterThanOrEqualTo(Long value) {
            addCriterion("ba_confirmid >=", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidLessThan(Long value) {
            addCriterion("ba_confirmid <", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidLessThanOrEqualTo(Long value) {
            addCriterion("ba_confirmid <=", value, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidIn(List<Long> values) {
            addCriterion("ba_confirmid in", values, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidNotIn(List<Long> values) {
            addCriterion("ba_confirmid not in", values, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidBetween(Long value1, Long value2) {
            addCriterion("ba_confirmid between", value1, value2, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmidNotBetween(Long value1, Long value2) {
            addCriterion("ba_confirmid not between", value1, value2, "ba_confirmid");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoIsNull() {
            addCriterion("ba_confirmno is null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoIsNotNull() {
            addCriterion("ba_confirmno is not null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoEqualTo(String value) {
            addCriterion("ba_confirmno =", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoNotEqualTo(String value) {
            addCriterion("ba_confirmno <>", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoGreaterThan(String value) {
            addCriterion("ba_confirmno >", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoGreaterThanOrEqualTo(String value) {
            addCriterion("ba_confirmno >=", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoLessThan(String value) {
            addCriterion("ba_confirmno <", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoLessThanOrEqualTo(String value) {
            addCriterion("ba_confirmno <=", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoLike(String value) {
            addCriterion("ba_confirmno like", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoNotLike(String value) {
            addCriterion("ba_confirmno not like", value, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoIn(List<String> values) {
            addCriterion("ba_confirmno in", values, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoNotIn(List<String> values) {
            addCriterion("ba_confirmno not in", values, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoBetween(String value1, String value2) {
            addCriterion("ba_confirmno between", value1, value2, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmnoNotBetween(String value1, String value2) {
            addCriterion("ba_confirmno not between", value1, value2, "ba_confirmno");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateIsNull() {
            addCriterion("ba_confirmdate is null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateIsNotNull() {
            addCriterion("ba_confirmdate is not null");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateEqualTo(Date value) {
            addCriterion("ba_confirmdate =", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateNotEqualTo(Date value) {
            addCriterion("ba_confirmdate <>", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateGreaterThan(Date value) {
            addCriterion("ba_confirmdate >", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ba_confirmdate >=", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateLessThan(Date value) {
            addCriterion("ba_confirmdate <", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateLessThanOrEqualTo(Date value) {
            addCriterion("ba_confirmdate <=", value, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateIn(List<Date> values) {
            addCriterion("ba_confirmdate in", values, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateNotIn(List<Date> values) {
            addCriterion("ba_confirmdate not in", values, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateBetween(Date value1, Date value2) {
            addCriterion("ba_confirmdate between", value1, value2, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_confirmdateNotBetween(Date value1, Date value2) {
            addCriterion("ba_confirmdate not between", value1, value2, "ba_confirmdate");
            return (Criteria) this;
        }

        public Criteria andBa_statusIsNull() {
            addCriterion("ba_status is null");
            return (Criteria) this;
        }

        public Criteria andBa_statusIsNotNull() {
            addCriterion("ba_status is not null");
            return (Criteria) this;
        }

        public Criteria andBa_statusEqualTo(Byte value) {
            addCriterion("ba_status =", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusNotEqualTo(Byte value) {
            addCriterion("ba_status <>", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusGreaterThan(Byte value) {
            addCriterion("ba_status >", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ba_status >=", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusLessThan(Byte value) {
            addCriterion("ba_status <", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusLessThanOrEqualTo(Byte value) {
            addCriterion("ba_status <=", value, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusIn(List<Byte> values) {
            addCriterion("ba_status in", values, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusNotIn(List<Byte> values) {
            addCriterion("ba_status not in", values, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusBetween(Byte value1, Byte value2) {
            addCriterion("ba_status between", value1, value2, "ba_status");
            return (Criteria) this;
        }

        public Criteria andBa_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("ba_status not between", value1, value2, "ba_status");
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