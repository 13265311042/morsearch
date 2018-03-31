package com.morsearch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Mall_Order_DetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Mall_Order_DetailExample() {
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

        public Criteria andMod_idIsNull() {
            addCriterion("mod_id is null");
            return (Criteria) this;
        }

        public Criteria andMod_idIsNotNull() {
            addCriterion("mod_id is not null");
            return (Criteria) this;
        }

        public Criteria andMod_idEqualTo(Long value) {
            addCriterion("mod_id =", value, "mod_id");
            return (Criteria) this;
        }

        public Criteria andMod_idNotEqualTo(Long value) {
            addCriterion("mod_id <>", value, "mod_id");
            return (Criteria) this;
        }

        public Criteria andMod_idGreaterThan(Long value) {
            addCriterion("mod_id >", value, "mod_id");
            return (Criteria) this;
        }

        public Criteria andMod_idGreaterThanOrEqualTo(Long value) {
            addCriterion("mod_id >=", value, "mod_id");
            return (Criteria) this;
        }

        public Criteria andMod_idLessThan(Long value) {
            addCriterion("mod_id <", value, "mod_id");
            return (Criteria) this;
        }

        public Criteria andMod_idLessThanOrEqualTo(Long value) {
            addCriterion("mod_id <=", value, "mod_id");
            return (Criteria) this;
        }

        public Criteria andMod_idIn(List<Long> values) {
            addCriterion("mod_id in", values, "mod_id");
            return (Criteria) this;
        }

        public Criteria andMod_idNotIn(List<Long> values) {
            addCriterion("mod_id not in", values, "mod_id");
            return (Criteria) this;
        }

        public Criteria andMod_idBetween(Long value1, Long value2) {
            addCriterion("mod_id between", value1, value2, "mod_id");
            return (Criteria) this;
        }

        public Criteria andMod_idNotBetween(Long value1, Long value2) {
            addCriterion("mod_id not between", value1, value2, "mod_id");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoIsNull() {
            addCriterion("mod_orderno is null");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoIsNotNull() {
            addCriterion("mod_orderno is not null");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoEqualTo(String value) {
            addCriterion("mod_orderno =", value, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoNotEqualTo(String value) {
            addCriterion("mod_orderno <>", value, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoGreaterThan(String value) {
            addCriterion("mod_orderno >", value, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoGreaterThanOrEqualTo(String value) {
            addCriterion("mod_orderno >=", value, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoLessThan(String value) {
            addCriterion("mod_orderno <", value, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoLessThanOrEqualTo(String value) {
            addCriterion("mod_orderno <=", value, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoLike(String value) {
            addCriterion("mod_orderno like", value, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoNotLike(String value) {
            addCriterion("mod_orderno not like", value, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoIn(List<String> values) {
            addCriterion("mod_orderno in", values, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoNotIn(List<String> values) {
            addCriterion("mod_orderno not in", values, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoBetween(String value1, String value2) {
            addCriterion("mod_orderno between", value1, value2, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_ordernoNotBetween(String value1, String value2) {
            addCriterion("mod_orderno not between", value1, value2, "mod_orderno");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidIsNull() {
            addCriterion("mod_goodsid is null");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidIsNotNull() {
            addCriterion("mod_goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidEqualTo(Long value) {
            addCriterion("mod_goodsid =", value, "mod_goodsid");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidNotEqualTo(Long value) {
            addCriterion("mod_goodsid <>", value, "mod_goodsid");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidGreaterThan(Long value) {
            addCriterion("mod_goodsid >", value, "mod_goodsid");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidGreaterThanOrEqualTo(Long value) {
            addCriterion("mod_goodsid >=", value, "mod_goodsid");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidLessThan(Long value) {
            addCriterion("mod_goodsid <", value, "mod_goodsid");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidLessThanOrEqualTo(Long value) {
            addCriterion("mod_goodsid <=", value, "mod_goodsid");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidIn(List<Long> values) {
            addCriterion("mod_goodsid in", values, "mod_goodsid");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidNotIn(List<Long> values) {
            addCriterion("mod_goodsid not in", values, "mod_goodsid");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidBetween(Long value1, Long value2) {
            addCriterion("mod_goodsid between", value1, value2, "mod_goodsid");
            return (Criteria) this;
        }

        public Criteria andMod_goodsidNotBetween(Long value1, Long value2) {
            addCriterion("mod_goodsid not between", value1, value2, "mod_goodsid");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleIsNull() {
            addCriterion("mod_goodtitle is null");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleIsNotNull() {
            addCriterion("mod_goodtitle is not null");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleEqualTo(String value) {
            addCriterion("mod_goodtitle =", value, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleNotEqualTo(String value) {
            addCriterion("mod_goodtitle <>", value, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleGreaterThan(String value) {
            addCriterion("mod_goodtitle >", value, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleGreaterThanOrEqualTo(String value) {
            addCriterion("mod_goodtitle >=", value, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleLessThan(String value) {
            addCriterion("mod_goodtitle <", value, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleLessThanOrEqualTo(String value) {
            addCriterion("mod_goodtitle <=", value, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleLike(String value) {
            addCriterion("mod_goodtitle like", value, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleNotLike(String value) {
            addCriterion("mod_goodtitle not like", value, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleIn(List<String> values) {
            addCriterion("mod_goodtitle in", values, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleNotIn(List<String> values) {
            addCriterion("mod_goodtitle not in", values, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleBetween(String value1, String value2) {
            addCriterion("mod_goodtitle between", value1, value2, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodtitleNotBetween(String value1, String value2) {
            addCriterion("mod_goodtitle not between", value1, value2, "mod_goodtitle");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageIsNull() {
            addCriterion("mod_goodimage is null");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageIsNotNull() {
            addCriterion("mod_goodimage is not null");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageEqualTo(String value) {
            addCriterion("mod_goodimage =", value, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageNotEqualTo(String value) {
            addCriterion("mod_goodimage <>", value, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageGreaterThan(String value) {
            addCriterion("mod_goodimage >", value, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageGreaterThanOrEqualTo(String value) {
            addCriterion("mod_goodimage >=", value, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageLessThan(String value) {
            addCriterion("mod_goodimage <", value, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageLessThanOrEqualTo(String value) {
            addCriterion("mod_goodimage <=", value, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageLike(String value) {
            addCriterion("mod_goodimage like", value, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageNotLike(String value) {
            addCriterion("mod_goodimage not like", value, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageIn(List<String> values) {
            addCriterion("mod_goodimage in", values, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageNotIn(List<String> values) {
            addCriterion("mod_goodimage not in", values, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageBetween(String value1, String value2) {
            addCriterion("mod_goodimage between", value1, value2, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodimageNotBetween(String value1, String value2) {
            addCriterion("mod_goodimage not between", value1, value2, "mod_goodimage");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorIsNull() {
            addCriterion("mod_goodcolor is null");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorIsNotNull() {
            addCriterion("mod_goodcolor is not null");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorEqualTo(String value) {
            addCriterion("mod_goodcolor =", value, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorNotEqualTo(String value) {
            addCriterion("mod_goodcolor <>", value, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorGreaterThan(String value) {
            addCriterion("mod_goodcolor >", value, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorGreaterThanOrEqualTo(String value) {
            addCriterion("mod_goodcolor >=", value, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorLessThan(String value) {
            addCriterion("mod_goodcolor <", value, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorLessThanOrEqualTo(String value) {
            addCriterion("mod_goodcolor <=", value, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorLike(String value) {
            addCriterion("mod_goodcolor like", value, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorNotLike(String value) {
            addCriterion("mod_goodcolor not like", value, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorIn(List<String> values) {
            addCriterion("mod_goodcolor in", values, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorNotIn(List<String> values) {
            addCriterion("mod_goodcolor not in", values, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorBetween(String value1, String value2) {
            addCriterion("mod_goodcolor between", value1, value2, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodcolorNotBetween(String value1, String value2) {
            addCriterion("mod_goodcolor not between", value1, value2, "mod_goodcolor");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelIsNull() {
            addCriterion("mod_goodmodel is null");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelIsNotNull() {
            addCriterion("mod_goodmodel is not null");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelEqualTo(String value) {
            addCriterion("mod_goodmodel =", value, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelNotEqualTo(String value) {
            addCriterion("mod_goodmodel <>", value, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelGreaterThan(String value) {
            addCriterion("mod_goodmodel >", value, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelGreaterThanOrEqualTo(String value) {
            addCriterion("mod_goodmodel >=", value, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelLessThan(String value) {
            addCriterion("mod_goodmodel <", value, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelLessThanOrEqualTo(String value) {
            addCriterion("mod_goodmodel <=", value, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelLike(String value) {
            addCriterion("mod_goodmodel like", value, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelNotLike(String value) {
            addCriterion("mod_goodmodel not like", value, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelIn(List<String> values) {
            addCriterion("mod_goodmodel in", values, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelNotIn(List<String> values) {
            addCriterion("mod_goodmodel not in", values, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelBetween(String value1, String value2) {
            addCriterion("mod_goodmodel between", value1, value2, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_goodmodelNotBetween(String value1, String value2) {
            addCriterion("mod_goodmodel not between", value1, value2, "mod_goodmodel");
            return (Criteria) this;
        }

        public Criteria andMod_priceIsNull() {
            addCriterion("mod_price is null");
            return (Criteria) this;
        }

        public Criteria andMod_priceIsNotNull() {
            addCriterion("mod_price is not null");
            return (Criteria) this;
        }

        public Criteria andMod_priceEqualTo(BigDecimal value) {
            addCriterion("mod_price =", value, "mod_price");
            return (Criteria) this;
        }

        public Criteria andMod_priceNotEqualTo(BigDecimal value) {
            addCriterion("mod_price <>", value, "mod_price");
            return (Criteria) this;
        }

        public Criteria andMod_priceGreaterThan(BigDecimal value) {
            addCriterion("mod_price >", value, "mod_price");
            return (Criteria) this;
        }

        public Criteria andMod_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mod_price >=", value, "mod_price");
            return (Criteria) this;
        }

        public Criteria andMod_priceLessThan(BigDecimal value) {
            addCriterion("mod_price <", value, "mod_price");
            return (Criteria) this;
        }

        public Criteria andMod_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mod_price <=", value, "mod_price");
            return (Criteria) this;
        }

        public Criteria andMod_priceIn(List<BigDecimal> values) {
            addCriterion("mod_price in", values, "mod_price");
            return (Criteria) this;
        }

        public Criteria andMod_priceNotIn(List<BigDecimal> values) {
            addCriterion("mod_price not in", values, "mod_price");
            return (Criteria) this;
        }

        public Criteria andMod_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mod_price between", value1, value2, "mod_price");
            return (Criteria) this;
        }

        public Criteria andMod_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mod_price not between", value1, value2, "mod_price");
            return (Criteria) this;
        }

        public Criteria andMod_qtyIsNull() {
            addCriterion("mod_qty is null");
            return (Criteria) this;
        }

        public Criteria andMod_qtyIsNotNull() {
            addCriterion("mod_qty is not null");
            return (Criteria) this;
        }

        public Criteria andMod_qtyEqualTo(BigDecimal value) {
            addCriterion("mod_qty =", value, "mod_qty");
            return (Criteria) this;
        }

        public Criteria andMod_qtyNotEqualTo(BigDecimal value) {
            addCriterion("mod_qty <>", value, "mod_qty");
            return (Criteria) this;
        }

        public Criteria andMod_qtyGreaterThan(BigDecimal value) {
            addCriterion("mod_qty >", value, "mod_qty");
            return (Criteria) this;
        }

        public Criteria andMod_qtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mod_qty >=", value, "mod_qty");
            return (Criteria) this;
        }

        public Criteria andMod_qtyLessThan(BigDecimal value) {
            addCriterion("mod_qty <", value, "mod_qty");
            return (Criteria) this;
        }

        public Criteria andMod_qtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mod_qty <=", value, "mod_qty");
            return (Criteria) this;
        }

        public Criteria andMod_qtyIn(List<BigDecimal> values) {
            addCriterion("mod_qty in", values, "mod_qty");
            return (Criteria) this;
        }

        public Criteria andMod_qtyNotIn(List<BigDecimal> values) {
            addCriterion("mod_qty not in", values, "mod_qty");
            return (Criteria) this;
        }

        public Criteria andMod_qtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mod_qty between", value1, value2, "mod_qty");
            return (Criteria) this;
        }

        public Criteria andMod_qtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mod_qty not between", value1, value2, "mod_qty");
            return (Criteria) this;
        }

        public Criteria andMod_amountIsNull() {
            addCriterion("mod_amount is null");
            return (Criteria) this;
        }

        public Criteria andMod_amountIsNotNull() {
            addCriterion("mod_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMod_amountEqualTo(BigDecimal value) {
            addCriterion("mod_amount =", value, "mod_amount");
            return (Criteria) this;
        }

        public Criteria andMod_amountNotEqualTo(BigDecimal value) {
            addCriterion("mod_amount <>", value, "mod_amount");
            return (Criteria) this;
        }

        public Criteria andMod_amountGreaterThan(BigDecimal value) {
            addCriterion("mod_amount >", value, "mod_amount");
            return (Criteria) this;
        }

        public Criteria andMod_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mod_amount >=", value, "mod_amount");
            return (Criteria) this;
        }

        public Criteria andMod_amountLessThan(BigDecimal value) {
            addCriterion("mod_amount <", value, "mod_amount");
            return (Criteria) this;
        }

        public Criteria andMod_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mod_amount <=", value, "mod_amount");
            return (Criteria) this;
        }

        public Criteria andMod_amountIn(List<BigDecimal> values) {
            addCriterion("mod_amount in", values, "mod_amount");
            return (Criteria) this;
        }

        public Criteria andMod_amountNotIn(List<BigDecimal> values) {
            addCriterion("mod_amount not in", values, "mod_amount");
            return (Criteria) this;
        }

        public Criteria andMod_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mod_amount between", value1, value2, "mod_amount");
            return (Criteria) this;
        }

        public Criteria andMod_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mod_amount not between", value1, value2, "mod_amount");
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