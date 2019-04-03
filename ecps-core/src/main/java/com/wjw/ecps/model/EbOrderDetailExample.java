package com.wjw.ecps.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EbOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbOrderDetailExample() {
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

        public Criteria andOrderDetailIdIsNull() {
            addCriterion("ORDER_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIsNotNull() {
            addCriterion("ORDER_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdEqualTo(Long value) {
            addCriterion("ORDER_DETAIL_ID =", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotEqualTo(Long value) {
            addCriterion("ORDER_DETAIL_ID <>", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThan(Long value) {
            addCriterion("ORDER_DETAIL_ID >", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_DETAIL_ID >=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThan(Long value) {
            addCriterion("ORDER_DETAIL_ID <", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_DETAIL_ID <=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIn(List<Long> values) {
            addCriterion("ORDER_DETAIL_ID in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotIn(List<Long> values) {
            addCriterion("ORDER_DETAIL_ID not in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_DETAIL_ID between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_DETAIL_ID not between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNull() {
            addCriterion("ITEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNotNull() {
            addCriterion("ITEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andItemNoEqualTo(String value) {
            addCriterion("ITEM_NO =", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotEqualTo(String value) {
            addCriterion("ITEM_NO <>", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThan(String value) {
            addCriterion("ITEM_NO >", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NO >=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThan(String value) {
            addCriterion("ITEM_NO <", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NO <=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLike(String value) {
            addCriterion("ITEM_NO like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotLike(String value) {
            addCriterion("ITEM_NO not like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoIn(List<String> values) {
            addCriterion("ITEM_NO in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotIn(List<String> values) {
            addCriterion("ITEM_NO not in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoBetween(String value1, String value2) {
            addCriterion("ITEM_NO between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotBetween(String value1, String value2) {
            addCriterion("ITEM_NO not between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("SKU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("SKU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("SKU_ID =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("SKU_ID <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("SKU_ID >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SKU_ID >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("SKU_ID <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("SKU_ID <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("SKU_ID in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("SKU_ID not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("SKU_ID between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("SKU_ID not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIsNull() {
            addCriterion("SKU is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("SKU is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("SKU =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("SKU <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("SKU >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("SKU >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("SKU <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("SKU <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("SKU like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("SKU not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("SKU in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("SKU not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("SKU between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("SKU not between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuImgIsNull() {
            addCriterion("SKU_IMG is null");
            return (Criteria) this;
        }

        public Criteria andSkuImgIsNotNull() {
            addCriterion("SKU_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andSkuImgEqualTo(String value) {
            addCriterion("SKU_IMG =", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotEqualTo(String value) {
            addCriterion("SKU_IMG <>", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgGreaterThan(String value) {
            addCriterion("SKU_IMG >", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_IMG >=", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLessThan(String value) {
            addCriterion("SKU_IMG <", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLessThanOrEqualTo(String value) {
            addCriterion("SKU_IMG <=", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLike(String value) {
            addCriterion("SKU_IMG like", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotLike(String value) {
            addCriterion("SKU_IMG not like", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgIn(List<String> values) {
            addCriterion("SKU_IMG in", values, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotIn(List<String> values) {
            addCriterion("SKU_IMG not in", values, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgBetween(String value1, String value2) {
            addCriterion("SKU_IMG between", value1, value2, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotBetween(String value1, String value2) {
            addCriterion("SKU_IMG not between", value1, value2, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("SKU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("SKU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("SKU_NAME =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("SKU_NAME <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("SKU_NAME >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_NAME >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("SKU_NAME <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("SKU_NAME <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("SKU_NAME like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("SKU_NAME not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("SKU_NAME in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("SKU_NAME not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("SKU_NAME between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("SKU_NAME not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeIsNull() {
            addCriterion("SKU_CAT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeIsNotNull() {
            addCriterion("SKU_CAT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeEqualTo(Integer value) {
            addCriterion("SKU_CAT_TYPE =", value, "skuCatType");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeNotEqualTo(Integer value) {
            addCriterion("SKU_CAT_TYPE <>", value, "skuCatType");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeGreaterThan(Integer value) {
            addCriterion("SKU_CAT_TYPE >", value, "skuCatType");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKU_CAT_TYPE >=", value, "skuCatType");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeLessThan(Integer value) {
            addCriterion("SKU_CAT_TYPE <", value, "skuCatType");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeLessThanOrEqualTo(Integer value) {
            addCriterion("SKU_CAT_TYPE <=", value, "skuCatType");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeIn(List<Integer> values) {
            addCriterion("SKU_CAT_TYPE in", values, "skuCatType");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeNotIn(List<Integer> values) {
            addCriterion("SKU_CAT_TYPE not in", values, "skuCatType");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeBetween(Integer value1, Integer value2) {
            addCriterion("SKU_CAT_TYPE between", value1, value2, "skuCatType");
            return (Criteria) this;
        }

        public Criteria andSkuCatTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SKU_CAT_TYPE not between", value1, value2, "skuCatType");
            return (Criteria) this;
        }

        public Criteria andSkuSpecIsNull() {
            addCriterion("SKU_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andSkuSpecIsNotNull() {
            addCriterion("SKU_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSpecEqualTo(String value) {
            addCriterion("SKU_SPEC =", value, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andSkuSpecNotEqualTo(String value) {
            addCriterion("SKU_SPEC <>", value, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andSkuSpecGreaterThan(String value) {
            addCriterion("SKU_SPEC >", value, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andSkuSpecGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_SPEC >=", value, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andSkuSpecLessThan(String value) {
            addCriterion("SKU_SPEC <", value, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andSkuSpecLessThanOrEqualTo(String value) {
            addCriterion("SKU_SPEC <=", value, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andSkuSpecLike(String value) {
            addCriterion("SKU_SPEC like", value, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andSkuSpecNotLike(String value) {
            addCriterion("SKU_SPEC not like", value, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andSkuSpecIn(List<String> values) {
            addCriterion("SKU_SPEC in", values, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andSkuSpecNotIn(List<String> values) {
            addCriterion("SKU_SPEC not in", values, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andSkuSpecBetween(String value1, String value2) {
            addCriterion("SKU_SPEC between", value1, value2, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andSkuSpecNotBetween(String value1, String value2) {
            addCriterion("SKU_SPEC not between", value1, value2, "skuSpec");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("MARKET_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("MARKET_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("MARKET_PRICE =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("MARKET_PRICE <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("MARKET_PRICE >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MARKET_PRICE >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("MARKET_PRICE <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MARKET_PRICE <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("MARKET_PRICE in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("MARKET_PRICE not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARKET_PRICE between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARKET_PRICE not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountIsNull() {
            addCriterion("SKU_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountIsNotNull() {
            addCriterion("SKU_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountEqualTo(BigDecimal value) {
            addCriterion("SKU_DISCOUNT =", value, "skuDiscount");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountNotEqualTo(BigDecimal value) {
            addCriterion("SKU_DISCOUNT <>", value, "skuDiscount");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountGreaterThan(BigDecimal value) {
            addCriterion("SKU_DISCOUNT >", value, "skuDiscount");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SKU_DISCOUNT >=", value, "skuDiscount");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountLessThan(BigDecimal value) {
            addCriterion("SKU_DISCOUNT <", value, "skuDiscount");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SKU_DISCOUNT <=", value, "skuDiscount");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountIn(List<BigDecimal> values) {
            addCriterion("SKU_DISCOUNT in", values, "skuDiscount");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountNotIn(List<BigDecimal> values) {
            addCriterion("SKU_DISCOUNT not in", values, "skuDiscount");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKU_DISCOUNT between", value1, value2, "skuDiscount");
            return (Criteria) this;
        }

        public Criteria andSkuDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKU_DISCOUNT not between", value1, value2, "skuDiscount");
            return (Criteria) this;
        }

        public Criteria andSkuPriceIsNull() {
            addCriterion("SKU_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSkuPriceIsNotNull() {
            addCriterion("SKU_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuPriceEqualTo(BigDecimal value) {
            addCriterion("SKU_PRICE =", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceNotEqualTo(BigDecimal value) {
            addCriterion("SKU_PRICE <>", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceGreaterThan(BigDecimal value) {
            addCriterion("SKU_PRICE >", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SKU_PRICE >=", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceLessThan(BigDecimal value) {
            addCriterion("SKU_PRICE <", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SKU_PRICE <=", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceIn(List<BigDecimal> values) {
            addCriterion("SKU_PRICE in", values, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceNotIn(List<BigDecimal> values) {
            addCriterion("SKU_PRICE not in", values, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKU_PRICE between", value1, value2, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKU_PRICE not between", value1, value2, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdIsNull() {
            addCriterion("OFFER_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdIsNotNull() {
            addCriterion("OFFER_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdEqualTo(Long value) {
            addCriterion("OFFER_GROUP_ID =", value, "offerGroupId");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdNotEqualTo(Long value) {
            addCriterion("OFFER_GROUP_ID <>", value, "offerGroupId");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdGreaterThan(Long value) {
            addCriterion("OFFER_GROUP_ID >", value, "offerGroupId");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OFFER_GROUP_ID >=", value, "offerGroupId");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdLessThan(Long value) {
            addCriterion("OFFER_GROUP_ID <", value, "offerGroupId");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("OFFER_GROUP_ID <=", value, "offerGroupId");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdIn(List<Long> values) {
            addCriterion("OFFER_GROUP_ID in", values, "offerGroupId");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdNotIn(List<Long> values) {
            addCriterion("OFFER_GROUP_ID not in", values, "offerGroupId");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdBetween(Long value1, Long value2) {
            addCriterion("OFFER_GROUP_ID between", value1, value2, "offerGroupId");
            return (Criteria) this;
        }

        public Criteria andOfferGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("OFFER_GROUP_ID not between", value1, value2, "offerGroupId");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameIsNull() {
            addCriterion("OFFER_GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameIsNotNull() {
            addCriterion("OFFER_GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameEqualTo(String value) {
            addCriterion("OFFER_GROUP_NAME =", value, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameNotEqualTo(String value) {
            addCriterion("OFFER_GROUP_NAME <>", value, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameGreaterThan(String value) {
            addCriterion("OFFER_GROUP_NAME >", value, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("OFFER_GROUP_NAME >=", value, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameLessThan(String value) {
            addCriterion("OFFER_GROUP_NAME <", value, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameLessThanOrEqualTo(String value) {
            addCriterion("OFFER_GROUP_NAME <=", value, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameLike(String value) {
            addCriterion("OFFER_GROUP_NAME like", value, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameNotLike(String value) {
            addCriterion("OFFER_GROUP_NAME not like", value, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameIn(List<String> values) {
            addCriterion("OFFER_GROUP_NAME in", values, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameNotIn(List<String> values) {
            addCriterion("OFFER_GROUP_NAME not in", values, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameBetween(String value1, String value2) {
            addCriterion("OFFER_GROUP_NAME between", value1, value2, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNameNotBetween(String value1, String value2) {
            addCriterion("OFFER_GROUP_NAME not between", value1, value2, "offerGroupName");
            return (Criteria) this;
        }

        public Criteria andOfferTypeIsNull() {
            addCriterion("OFFER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOfferTypeIsNotNull() {
            addCriterion("OFFER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOfferTypeEqualTo(Short value) {
            addCriterion("OFFER_TYPE =", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeNotEqualTo(Short value) {
            addCriterion("OFFER_TYPE <>", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeGreaterThan(Short value) {
            addCriterion("OFFER_TYPE >", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("OFFER_TYPE >=", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeLessThan(Short value) {
            addCriterion("OFFER_TYPE <", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeLessThanOrEqualTo(Short value) {
            addCriterion("OFFER_TYPE <=", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeIn(List<Short> values) {
            addCriterion("OFFER_TYPE in", values, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeNotIn(List<Short> values) {
            addCriterion("OFFER_TYPE not in", values, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeBetween(Short value1, Short value2) {
            addCriterion("OFFER_TYPE between", value1, value2, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeNotBetween(Short value1, Short value2) {
            addCriterion("OFFER_TYPE not between", value1, value2, "offerType");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("SHORT_NAME =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("SHORT_NAME <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("SHORT_NAME >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("SHORT_NAME <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("SHORT_NAME like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("SHORT_NAME not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("SHORT_NAME in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("SHORT_NAME not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("SHORT_NAME between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("SHORT_NAME not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andOfferIdIsNull() {
            addCriterion("OFFER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOfferIdIsNotNull() {
            addCriterion("OFFER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOfferIdEqualTo(Long value) {
            addCriterion("OFFER_ID =", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotEqualTo(Long value) {
            addCriterion("OFFER_ID <>", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdGreaterThan(Long value) {
            addCriterion("OFFER_ID >", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OFFER_ID >=", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdLessThan(Long value) {
            addCriterion("OFFER_ID <", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdLessThanOrEqualTo(Long value) {
            addCriterion("OFFER_ID <=", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdIn(List<Long> values) {
            addCriterion("OFFER_ID in", values, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotIn(List<Long> values) {
            addCriterion("OFFER_ID not in", values, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdBetween(Long value1, Long value2) {
            addCriterion("OFFER_ID between", value1, value2, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotBetween(Long value1, Long value2) {
            addCriterion("OFFER_ID not between", value1, value2, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferNameIsNull() {
            addCriterion("OFFER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOfferNameIsNotNull() {
            addCriterion("OFFER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOfferNameEqualTo(String value) {
            addCriterion("OFFER_NAME =", value, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNameNotEqualTo(String value) {
            addCriterion("OFFER_NAME <>", value, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNameGreaterThan(String value) {
            addCriterion("OFFER_NAME >", value, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNameGreaterThanOrEqualTo(String value) {
            addCriterion("OFFER_NAME >=", value, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNameLessThan(String value) {
            addCriterion("OFFER_NAME <", value, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNameLessThanOrEqualTo(String value) {
            addCriterion("OFFER_NAME <=", value, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNameLike(String value) {
            addCriterion("OFFER_NAME like", value, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNameNotLike(String value) {
            addCriterion("OFFER_NAME not like", value, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNameIn(List<String> values) {
            addCriterion("OFFER_NAME in", values, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNameNotIn(List<String> values) {
            addCriterion("OFFER_NAME not in", values, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNameBetween(String value1, String value2) {
            addCriterion("OFFER_NAME between", value1, value2, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNameNotBetween(String value1, String value2) {
            addCriterion("OFFER_NAME not between", value1, value2, "offerName");
            return (Criteria) this;
        }

        public Criteria andOfferNoIsNull() {
            addCriterion("OFFER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOfferNoIsNotNull() {
            addCriterion("OFFER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOfferNoEqualTo(String value) {
            addCriterion("OFFER_NO =", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoNotEqualTo(String value) {
            addCriterion("OFFER_NO <>", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoGreaterThan(String value) {
            addCriterion("OFFER_NO >", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoGreaterThanOrEqualTo(String value) {
            addCriterion("OFFER_NO >=", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoLessThan(String value) {
            addCriterion("OFFER_NO <", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoLessThanOrEqualTo(String value) {
            addCriterion("OFFER_NO <=", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoLike(String value) {
            addCriterion("OFFER_NO like", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoNotLike(String value) {
            addCriterion("OFFER_NO not like", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoIn(List<String> values) {
            addCriterion("OFFER_NO in", values, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoNotIn(List<String> values) {
            addCriterion("OFFER_NO not in", values, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoBetween(String value1, String value2) {
            addCriterion("OFFER_NO between", value1, value2, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoNotBetween(String value1, String value2) {
            addCriterion("OFFER_NO not between", value1, value2, "offerNo");
            return (Criteria) this;
        }

        public Criteria andShortName2IsNull() {
            addCriterion("SHORT_NAME2 is null");
            return (Criteria) this;
        }

        public Criteria andShortName2IsNotNull() {
            addCriterion("SHORT_NAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andShortName2EqualTo(String value) {
            addCriterion("SHORT_NAME2 =", value, "shortName2");
            return (Criteria) this;
        }

        public Criteria andShortName2NotEqualTo(String value) {
            addCriterion("SHORT_NAME2 <>", value, "shortName2");
            return (Criteria) this;
        }

        public Criteria andShortName2GreaterThan(String value) {
            addCriterion("SHORT_NAME2 >", value, "shortName2");
            return (Criteria) this;
        }

        public Criteria andShortName2GreaterThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME2 >=", value, "shortName2");
            return (Criteria) this;
        }

        public Criteria andShortName2LessThan(String value) {
            addCriterion("SHORT_NAME2 <", value, "shortName2");
            return (Criteria) this;
        }

        public Criteria andShortName2LessThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME2 <=", value, "shortName2");
            return (Criteria) this;
        }

        public Criteria andShortName2Like(String value) {
            addCriterion("SHORT_NAME2 like", value, "shortName2");
            return (Criteria) this;
        }

        public Criteria andShortName2NotLike(String value) {
            addCriterion("SHORT_NAME2 not like", value, "shortName2");
            return (Criteria) this;
        }

        public Criteria andShortName2In(List<String> values) {
            addCriterion("SHORT_NAME2 in", values, "shortName2");
            return (Criteria) this;
        }

        public Criteria andShortName2NotIn(List<String> values) {
            addCriterion("SHORT_NAME2 not in", values, "shortName2");
            return (Criteria) this;
        }

        public Criteria andShortName2Between(String value1, String value2) {
            addCriterion("SHORT_NAME2 between", value1, value2, "shortName2");
            return (Criteria) this;
        }

        public Criteria andShortName2NotBetween(String value1, String value2) {
            addCriterion("SHORT_NAME2 not between", value1, value2, "shortName2");
            return (Criteria) this;
        }

        public Criteria andOfferTermIsNull() {
            addCriterion("OFFER_TERM is null");
            return (Criteria) this;
        }

        public Criteria andOfferTermIsNotNull() {
            addCriterion("OFFER_TERM is not null");
            return (Criteria) this;
        }

        public Criteria andOfferTermEqualTo(Short value) {
            addCriterion("OFFER_TERM =", value, "offerTerm");
            return (Criteria) this;
        }

        public Criteria andOfferTermNotEqualTo(Short value) {
            addCriterion("OFFER_TERM <>", value, "offerTerm");
            return (Criteria) this;
        }

        public Criteria andOfferTermGreaterThan(Short value) {
            addCriterion("OFFER_TERM >", value, "offerTerm");
            return (Criteria) this;
        }

        public Criteria andOfferTermGreaterThanOrEqualTo(Short value) {
            addCriterion("OFFER_TERM >=", value, "offerTerm");
            return (Criteria) this;
        }

        public Criteria andOfferTermLessThan(Short value) {
            addCriterion("OFFER_TERM <", value, "offerTerm");
            return (Criteria) this;
        }

        public Criteria andOfferTermLessThanOrEqualTo(Short value) {
            addCriterion("OFFER_TERM <=", value, "offerTerm");
            return (Criteria) this;
        }

        public Criteria andOfferTermIn(List<Short> values) {
            addCriterion("OFFER_TERM in", values, "offerTerm");
            return (Criteria) this;
        }

        public Criteria andOfferTermNotIn(List<Short> values) {
            addCriterion("OFFER_TERM not in", values, "offerTerm");
            return (Criteria) this;
        }

        public Criteria andOfferTermBetween(Short value1, Short value2) {
            addCriterion("OFFER_TERM between", value1, value2, "offerTerm");
            return (Criteria) this;
        }

        public Criteria andOfferTermNotBetween(Short value1, Short value2) {
            addCriterion("OFFER_TERM not between", value1, value2, "offerTerm");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyIsNull() {
            addCriterion("COMMIT_MONTHLY is null");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyIsNotNull() {
            addCriterion("COMMIT_MONTHLY is not null");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyEqualTo(BigDecimal value) {
            addCriterion("COMMIT_MONTHLY =", value, "commitMonthly");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyNotEqualTo(BigDecimal value) {
            addCriterion("COMMIT_MONTHLY <>", value, "commitMonthly");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyGreaterThan(BigDecimal value) {
            addCriterion("COMMIT_MONTHLY >", value, "commitMonthly");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMIT_MONTHLY >=", value, "commitMonthly");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyLessThan(BigDecimal value) {
            addCriterion("COMMIT_MONTHLY <", value, "commitMonthly");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMIT_MONTHLY <=", value, "commitMonthly");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyIn(List<BigDecimal> values) {
            addCriterion("COMMIT_MONTHLY in", values, "commitMonthly");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyNotIn(List<BigDecimal> values) {
            addCriterion("COMMIT_MONTHLY not in", values, "commitMonthly");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMIT_MONTHLY between", value1, value2, "commitMonthly");
            return (Criteria) this;
        }

        public Criteria andCommitMonthlyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMIT_MONTHLY not between", value1, value2, "commitMonthly");
            return (Criteria) this;
        }

        public Criteria andPrepaidIsNull() {
            addCriterion("PREPAID is null");
            return (Criteria) this;
        }

        public Criteria andPrepaidIsNotNull() {
            addCriterion("PREPAID is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaidEqualTo(BigDecimal value) {
            addCriterion("PREPAID =", value, "prepaid");
            return (Criteria) this;
        }

        public Criteria andPrepaidNotEqualTo(BigDecimal value) {
            addCriterion("PREPAID <>", value, "prepaid");
            return (Criteria) this;
        }

        public Criteria andPrepaidGreaterThan(BigDecimal value) {
            addCriterion("PREPAID >", value, "prepaid");
            return (Criteria) this;
        }

        public Criteria andPrepaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PREPAID >=", value, "prepaid");
            return (Criteria) this;
        }

        public Criteria andPrepaidLessThan(BigDecimal value) {
            addCriterion("PREPAID <", value, "prepaid");
            return (Criteria) this;
        }

        public Criteria andPrepaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PREPAID <=", value, "prepaid");
            return (Criteria) this;
        }

        public Criteria andPrepaidIn(List<BigDecimal> values) {
            addCriterion("PREPAID in", values, "prepaid");
            return (Criteria) this;
        }

        public Criteria andPrepaidNotIn(List<BigDecimal> values) {
            addCriterion("PREPAID not in", values, "prepaid");
            return (Criteria) this;
        }

        public Criteria andPrepaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREPAID between", value1, value2, "prepaid");
            return (Criteria) this;
        }

        public Criteria andPrepaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREPAID not between", value1, value2, "prepaid");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Short value) {
            addCriterion("PERIOD =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Short value) {
            addCriterion("PERIOD <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Short value) {
            addCriterion("PERIOD >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Short value) {
            addCriterion("PERIOD >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Short value) {
            addCriterion("PERIOD <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Short value) {
            addCriterion("PERIOD <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Short> values) {
            addCriterion("PERIOD in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Short> values) {
            addCriterion("PERIOD not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Short value1, Short value2) {
            addCriterion("PERIOD between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Short value1, Short value2) {
            addCriterion("PERIOD not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyIsNull() {
            addCriterion("REFUND_MONTHLY is null");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyIsNotNull() {
            addCriterion("REFUND_MONTHLY is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyEqualTo(BigDecimal value) {
            addCriterion("REFUND_MONTHLY =", value, "refundMonthly");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyNotEqualTo(BigDecimal value) {
            addCriterion("REFUND_MONTHLY <>", value, "refundMonthly");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyGreaterThan(BigDecimal value) {
            addCriterion("REFUND_MONTHLY >", value, "refundMonthly");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_MONTHLY >=", value, "refundMonthly");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyLessThan(BigDecimal value) {
            addCriterion("REFUND_MONTHLY <", value, "refundMonthly");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_MONTHLY <=", value, "refundMonthly");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyIn(List<BigDecimal> values) {
            addCriterion("REFUND_MONTHLY in", values, "refundMonthly");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyNotIn(List<BigDecimal> values) {
            addCriterion("REFUND_MONTHLY not in", values, "refundMonthly");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_MONTHLY between", value1, value2, "refundMonthly");
            return (Criteria) this;
        }

        public Criteria andRefundMonthlyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_MONTHLY not between", value1, value2, "refundMonthly");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthIsNull() {
            addCriterion("REFUND_1ST_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthIsNotNull() {
            addCriterion("REFUND_1ST_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthEqualTo(BigDecimal value) {
            addCriterion("REFUND_1ST_MONTH =", value, "refund1stMonth");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthNotEqualTo(BigDecimal value) {
            addCriterion("REFUND_1ST_MONTH <>", value, "refund1stMonth");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthGreaterThan(BigDecimal value) {
            addCriterion("REFUND_1ST_MONTH >", value, "refund1stMonth");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_1ST_MONTH >=", value, "refund1stMonth");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthLessThan(BigDecimal value) {
            addCriterion("REFUND_1ST_MONTH <", value, "refund1stMonth");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_1ST_MONTH <=", value, "refund1stMonth");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthIn(List<BigDecimal> values) {
            addCriterion("REFUND_1ST_MONTH in", values, "refund1stMonth");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthNotIn(List<BigDecimal> values) {
            addCriterion("REFUND_1ST_MONTH not in", values, "refund1stMonth");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_1ST_MONTH between", value1, value2, "refund1stMonth");
            return (Criteria) this;
        }

        public Criteria andRefund1stMonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_1ST_MONTH not between", value1, value2, "refund1stMonth");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthIsNull() {
            addCriterion("REFUND_LAST_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthIsNotNull() {
            addCriterion("REFUND_LAST_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthEqualTo(BigDecimal value) {
            addCriterion("REFUND_LAST_MONTH =", value, "refundLastMonth");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthNotEqualTo(BigDecimal value) {
            addCriterion("REFUND_LAST_MONTH <>", value, "refundLastMonth");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthGreaterThan(BigDecimal value) {
            addCriterion("REFUND_LAST_MONTH >", value, "refundLastMonth");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_LAST_MONTH >=", value, "refundLastMonth");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthLessThan(BigDecimal value) {
            addCriterion("REFUND_LAST_MONTH <", value, "refundLastMonth");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_LAST_MONTH <=", value, "refundLastMonth");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthIn(List<BigDecimal> values) {
            addCriterion("REFUND_LAST_MONTH in", values, "refundLastMonth");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthNotIn(List<BigDecimal> values) {
            addCriterion("REFUND_LAST_MONTH not in", values, "refundLastMonth");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_LAST_MONTH between", value1, value2, "refundLastMonth");
            return (Criteria) this;
        }

        public Criteria andRefundLastMonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_LAST_MONTH not between", value1, value2, "refundLastMonth");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeIsNull() {
            addCriterion("ORDER_DETAIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeIsNotNull() {
            addCriterion("ORDER_DETAIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeEqualTo(Short value) {
            addCriterion("ORDER_DETAIL_TYPE =", value, "orderDetailType");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeNotEqualTo(Short value) {
            addCriterion("ORDER_DETAIL_TYPE <>", value, "orderDetailType");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeGreaterThan(Short value) {
            addCriterion("ORDER_DETAIL_TYPE >", value, "orderDetailType");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_DETAIL_TYPE >=", value, "orderDetailType");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeLessThan(Short value) {
            addCriterion("ORDER_DETAIL_TYPE <", value, "orderDetailType");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_DETAIL_TYPE <=", value, "orderDetailType");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeIn(List<Short> values) {
            addCriterion("ORDER_DETAIL_TYPE in", values, "orderDetailType");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeNotIn(List<Short> values) {
            addCriterion("ORDER_DETAIL_TYPE not in", values, "orderDetailType");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeBetween(Short value1, Short value2) {
            addCriterion("ORDER_DETAIL_TYPE between", value1, value2, "orderDetailType");
            return (Criteria) this;
        }

        public Criteria andOrderDetailTypeNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_DETAIL_TYPE not between", value1, value2, "orderDetailType");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("MERCHANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("MERCHANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(Long value) {
            addCriterion("MERCHANT_ID =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(Long value) {
            addCriterion("MERCHANT_ID <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(Long value) {
            addCriterion("MERCHANT_ID >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MERCHANT_ID >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(Long value) {
            addCriterion("MERCHANT_ID <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(Long value) {
            addCriterion("MERCHANT_ID <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<Long> values) {
            addCriterion("MERCHANT_ID in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<Long> values) {
            addCriterion("MERCHANT_ID not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(Long value1, Long value2) {
            addCriterion("MERCHANT_ID between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(Long value1, Long value2) {
            addCriterion("MERCHANT_ID not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSeriescodeIsNull() {
            addCriterion("SERIESCODE is null");
            return (Criteria) this;
        }

        public Criteria andSeriescodeIsNotNull() {
            addCriterion("SERIESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSeriescodeEqualTo(String value) {
            addCriterion("SERIESCODE =", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotEqualTo(String value) {
            addCriterion("SERIESCODE <>", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeGreaterThan(String value) {
            addCriterion("SERIESCODE >", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeGreaterThanOrEqualTo(String value) {
            addCriterion("SERIESCODE >=", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeLessThan(String value) {
            addCriterion("SERIESCODE <", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeLessThanOrEqualTo(String value) {
            addCriterion("SERIESCODE <=", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeLike(String value) {
            addCriterion("SERIESCODE like", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotLike(String value) {
            addCriterion("SERIESCODE not like", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeIn(List<String> values) {
            addCriterion("SERIESCODE in", values, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotIn(List<String> values) {
            addCriterion("SERIESCODE not in", values, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeBetween(String value1, String value2) {
            addCriterion("SERIESCODE between", value1, value2, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotBetween(String value1, String value2) {
            addCriterion("SERIESCODE not between", value1, value2, "seriescode");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoIsNull() {
            addCriterion("OFFER_GROUP_NO is null");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoIsNotNull() {
            addCriterion("OFFER_GROUP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoEqualTo(String value) {
            addCriterion("OFFER_GROUP_NO =", value, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoNotEqualTo(String value) {
            addCriterion("OFFER_GROUP_NO <>", value, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoGreaterThan(String value) {
            addCriterion("OFFER_GROUP_NO >", value, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoGreaterThanOrEqualTo(String value) {
            addCriterion("OFFER_GROUP_NO >=", value, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoLessThan(String value) {
            addCriterion("OFFER_GROUP_NO <", value, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoLessThanOrEqualTo(String value) {
            addCriterion("OFFER_GROUP_NO <=", value, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoLike(String value) {
            addCriterion("OFFER_GROUP_NO like", value, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoNotLike(String value) {
            addCriterion("OFFER_GROUP_NO not like", value, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoIn(List<String> values) {
            addCriterion("OFFER_GROUP_NO in", values, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoNotIn(List<String> values) {
            addCriterion("OFFER_GROUP_NO not in", values, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoBetween(String value1, String value2) {
            addCriterion("OFFER_GROUP_NO between", value1, value2, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andOfferGroupNoNotBetween(String value1, String value2) {
            addCriterion("OFFER_GROUP_NO not between", value1, value2, "offerGroupNo");
            return (Criteria) this;
        }

        public Criteria andPromoTypeIsNull() {
            addCriterion("PROMO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPromoTypeIsNotNull() {
            addCriterion("PROMO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPromoTypeEqualTo(Short value) {
            addCriterion("PROMO_TYPE =", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeNotEqualTo(Short value) {
            addCriterion("PROMO_TYPE <>", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeGreaterThan(Short value) {
            addCriterion("PROMO_TYPE >", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PROMO_TYPE >=", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeLessThan(Short value) {
            addCriterion("PROMO_TYPE <", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeLessThanOrEqualTo(Short value) {
            addCriterion("PROMO_TYPE <=", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeIn(List<Short> values) {
            addCriterion("PROMO_TYPE in", values, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeNotIn(List<Short> values) {
            addCriterion("PROMO_TYPE not in", values, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeBetween(Short value1, Short value2) {
            addCriterion("PROMO_TYPE between", value1, value2, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeNotBetween(Short value1, Short value2) {
            addCriterion("PROMO_TYPE not between", value1, value2, "promoType");
            return (Criteria) this;
        }

        public Criteria andCondIdIsNull() {
            addCriterion("COND_ID is null");
            return (Criteria) this;
        }

        public Criteria andCondIdIsNotNull() {
            addCriterion("COND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCondIdEqualTo(String value) {
            addCriterion("COND_ID =", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdNotEqualTo(String value) {
            addCriterion("COND_ID <>", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdGreaterThan(String value) {
            addCriterion("COND_ID >", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdGreaterThanOrEqualTo(String value) {
            addCriterion("COND_ID >=", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdLessThan(String value) {
            addCriterion("COND_ID <", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdLessThanOrEqualTo(String value) {
            addCriterion("COND_ID <=", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdLike(String value) {
            addCriterion("COND_ID like", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdNotLike(String value) {
            addCriterion("COND_ID not like", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdIn(List<String> values) {
            addCriterion("COND_ID in", values, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdNotIn(List<String> values) {
            addCriterion("COND_ID not in", values, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdBetween(String value1, String value2) {
            addCriterion("COND_ID between", value1, value2, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdNotBetween(String value1, String value2) {
            addCriterion("COND_ID not between", value1, value2, "condId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceIsNull() {
            addCriterion("PAYMENT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceIsNotNull() {
            addCriterion("PAYMENT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_PRICE =", value, "paymentPrice");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_PRICE <>", value, "paymentPrice");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceGreaterThan(BigDecimal value) {
            addCriterion("PAYMENT_PRICE >", value, "paymentPrice");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_PRICE >=", value, "paymentPrice");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceLessThan(BigDecimal value) {
            addCriterion("PAYMENT_PRICE <", value, "paymentPrice");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_PRICE <=", value, "paymentPrice");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_PRICE in", values, "paymentPrice");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_PRICE not in", values, "paymentPrice");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_PRICE between", value1, value2, "paymentPrice");
            return (Criteria) this;
        }

        public Criteria andPaymentPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_PRICE not between", value1, value2, "paymentPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNull() {
            addCriterion("PURCHASE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNotNull() {
            addCriterion("PURCHASE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_PRICE =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_PRICE <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(BigDecimal value) {
            addCriterion("PURCHASE_PRICE >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_PRICE >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(BigDecimal value) {
            addCriterion("PURCHASE_PRICE <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_PRICE <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_PRICE in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_PRICE not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_PRICE between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_PRICE not between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdIsNull() {
            addCriterion("SIMCARD_SUIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdIsNotNull() {
            addCriterion("SIMCARD_SUIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdEqualTo(Long value) {
            addCriterion("SIMCARD_SUIT_ID =", value, "simcardSuitId");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdNotEqualTo(Long value) {
            addCriterion("SIMCARD_SUIT_ID <>", value, "simcardSuitId");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdGreaterThan(Long value) {
            addCriterion("SIMCARD_SUIT_ID >", value, "simcardSuitId");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SIMCARD_SUIT_ID >=", value, "simcardSuitId");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdLessThan(Long value) {
            addCriterion("SIMCARD_SUIT_ID <", value, "simcardSuitId");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdLessThanOrEqualTo(Long value) {
            addCriterion("SIMCARD_SUIT_ID <=", value, "simcardSuitId");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdIn(List<Long> values) {
            addCriterion("SIMCARD_SUIT_ID in", values, "simcardSuitId");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdNotIn(List<Long> values) {
            addCriterion("SIMCARD_SUIT_ID not in", values, "simcardSuitId");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdBetween(Long value1, Long value2) {
            addCriterion("SIMCARD_SUIT_ID between", value1, value2, "simcardSuitId");
            return (Criteria) this;
        }

        public Criteria andSimcardSuitIdNotBetween(Long value1, Long value2) {
            addCriterion("SIMCARD_SUIT_ID not between", value1, value2, "simcardSuitId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdIsNull() {
            addCriterion("SIMCARD_PACKAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdIsNotNull() {
            addCriterion("SIMCARD_PACKAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdEqualTo(String value) {
            addCriterion("SIMCARD_PACKAGE_ID =", value, "simcardPackageId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdNotEqualTo(String value) {
            addCriterion("SIMCARD_PACKAGE_ID <>", value, "simcardPackageId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdGreaterThan(String value) {
            addCriterion("SIMCARD_PACKAGE_ID >", value, "simcardPackageId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdGreaterThanOrEqualTo(String value) {
            addCriterion("SIMCARD_PACKAGE_ID >=", value, "simcardPackageId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdLessThan(String value) {
            addCriterion("SIMCARD_PACKAGE_ID <", value, "simcardPackageId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdLessThanOrEqualTo(String value) {
            addCriterion("SIMCARD_PACKAGE_ID <=", value, "simcardPackageId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdLike(String value) {
            addCriterion("SIMCARD_PACKAGE_ID like", value, "simcardPackageId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdNotLike(String value) {
            addCriterion("SIMCARD_PACKAGE_ID not like", value, "simcardPackageId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdIn(List<String> values) {
            addCriterion("SIMCARD_PACKAGE_ID in", values, "simcardPackageId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdNotIn(List<String> values) {
            addCriterion("SIMCARD_PACKAGE_ID not in", values, "simcardPackageId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdBetween(String value1, String value2) {
            addCriterion("SIMCARD_PACKAGE_ID between", value1, value2, "simcardPackageId");
            return (Criteria) this;
        }

        public Criteria andSimcardPackageIdNotBetween(String value1, String value2) {
            addCriterion("SIMCARD_PACKAGE_ID not between", value1, value2, "simcardPackageId");
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