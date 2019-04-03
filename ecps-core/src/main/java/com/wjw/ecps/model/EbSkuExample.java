package com.wjw.ecps.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EbSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbSkuExample() {
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

        public Criteria andShowStatusIsNull() {
            addCriterion("SHOW_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andShowStatusIsNotNull() {
            addCriterion("SHOW_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andShowStatusEqualTo(Short value) {
            addCriterion("SHOW_STATUS =", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusNotEqualTo(Short value) {
            addCriterion("SHOW_STATUS <>", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusGreaterThan(Short value) {
            addCriterion("SHOW_STATUS >", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("SHOW_STATUS >=", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusLessThan(Short value) {
            addCriterion("SHOW_STATUS <", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusLessThanOrEqualTo(Short value) {
            addCriterion("SHOW_STATUS <=", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusIn(List<Short> values) {
            addCriterion("SHOW_STATUS in", values, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusNotIn(List<Short> values) {
            addCriterion("SHOW_STATUS not in", values, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusBetween(Short value1, Short value2) {
            addCriterion("SHOW_STATUS between", value1, value2, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusNotBetween(Short value1, Short value2) {
            addCriterion("SHOW_STATUS not between", value1, value2, "showStatus");
            return (Criteria) this;
        }

        public Criteria andStockInventoryIsNull() {
            addCriterion("STOCK_INVENTORY is null");
            return (Criteria) this;
        }

        public Criteria andStockInventoryIsNotNull() {
            addCriterion("STOCK_INVENTORY is not null");
            return (Criteria) this;
        }

        public Criteria andStockInventoryEqualTo(Integer value) {
            addCriterion("STOCK_INVENTORY =", value, "stockInventory");
            return (Criteria) this;
        }

        public Criteria andStockInventoryNotEqualTo(Integer value) {
            addCriterion("STOCK_INVENTORY <>", value, "stockInventory");
            return (Criteria) this;
        }

        public Criteria andStockInventoryGreaterThan(Integer value) {
            addCriterion("STOCK_INVENTORY >", value, "stockInventory");
            return (Criteria) this;
        }

        public Criteria andStockInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_INVENTORY >=", value, "stockInventory");
            return (Criteria) this;
        }

        public Criteria andStockInventoryLessThan(Integer value) {
            addCriterion("STOCK_INVENTORY <", value, "stockInventory");
            return (Criteria) this;
        }

        public Criteria andStockInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_INVENTORY <=", value, "stockInventory");
            return (Criteria) this;
        }

        public Criteria andStockInventoryIn(List<Integer> values) {
            addCriterion("STOCK_INVENTORY in", values, "stockInventory");
            return (Criteria) this;
        }

        public Criteria andStockInventoryNotIn(List<Integer> values) {
            addCriterion("STOCK_INVENTORY not in", values, "stockInventory");
            return (Criteria) this;
        }

        public Criteria andStockInventoryBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_INVENTORY between", value1, value2, "stockInventory");
            return (Criteria) this;
        }

        public Criteria andStockInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_INVENTORY not between", value1, value2, "stockInventory");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitIsNull() {
            addCriterion("SKU_UPPER_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitIsNotNull() {
            addCriterion("SKU_UPPER_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitEqualTo(Integer value) {
            addCriterion("SKU_UPPER_LIMIT =", value, "skuUpperLimit");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitNotEqualTo(Integer value) {
            addCriterion("SKU_UPPER_LIMIT <>", value, "skuUpperLimit");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitGreaterThan(Integer value) {
            addCriterion("SKU_UPPER_LIMIT >", value, "skuUpperLimit");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKU_UPPER_LIMIT >=", value, "skuUpperLimit");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitLessThan(Integer value) {
            addCriterion("SKU_UPPER_LIMIT <", value, "skuUpperLimit");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitLessThanOrEqualTo(Integer value) {
            addCriterion("SKU_UPPER_LIMIT <=", value, "skuUpperLimit");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitIn(List<Integer> values) {
            addCriterion("SKU_UPPER_LIMIT in", values, "skuUpperLimit");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitNotIn(List<Integer> values) {
            addCriterion("SKU_UPPER_LIMIT not in", values, "skuUpperLimit");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitBetween(Integer value1, Integer value2) {
            addCriterion("SKU_UPPER_LIMIT between", value1, value2, "skuUpperLimit");
            return (Criteria) this;
        }

        public Criteria andSkuUpperLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("SKU_UPPER_LIMIT not between", value1, value2, "skuUpperLimit");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
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

        public Criteria andSkuSortIsNull() {
            addCriterion("SKU_SORT is null");
            return (Criteria) this;
        }

        public Criteria andSkuSortIsNotNull() {
            addCriterion("SKU_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSortEqualTo(Integer value) {
            addCriterion("SKU_SORT =", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortNotEqualTo(Integer value) {
            addCriterion("SKU_SORT <>", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortGreaterThan(Integer value) {
            addCriterion("SKU_SORT >", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKU_SORT >=", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortLessThan(Integer value) {
            addCriterion("SKU_SORT <", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortLessThanOrEqualTo(Integer value) {
            addCriterion("SKU_SORT <=", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortIn(List<Integer> values) {
            addCriterion("SKU_SORT in", values, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortNotIn(List<Integer> values) {
            addCriterion("SKU_SORT not in", values, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortBetween(Integer value1, Integer value2) {
            addCriterion("SKU_SORT between", value1, value2, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortNotBetween(Integer value1, Integer value2) {
            addCriterion("SKU_SORT not between", value1, value2, "skuSort");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("UPDATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("UPDATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Long value) {
            addCriterion("UPDATE_USER_ID =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Long value) {
            addCriterion("UPDATE_USER_ID <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Long value) {
            addCriterion("UPDATE_USER_ID >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_USER_ID >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Long value) {
            addCriterion("UPDATE_USER_ID <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_USER_ID <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Long> values) {
            addCriterion("UPDATE_USER_ID in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Long> values) {
            addCriterion("UPDATE_USER_ID not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Long value1, Long value2) {
            addCriterion("UPDATE_USER_ID between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_USER_ID not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdIsNull() {
            addCriterion("ORIGINAL_SKU_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdIsNotNull() {
            addCriterion("ORIGINAL_SKU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdEqualTo(Long value) {
            addCriterion("ORIGINAL_SKU_ID =", value, "originalSkuId");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdNotEqualTo(Long value) {
            addCriterion("ORIGINAL_SKU_ID <>", value, "originalSkuId");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdGreaterThan(Long value) {
            addCriterion("ORIGINAL_SKU_ID >", value, "originalSkuId");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORIGINAL_SKU_ID >=", value, "originalSkuId");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdLessThan(Long value) {
            addCriterion("ORIGINAL_SKU_ID <", value, "originalSkuId");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("ORIGINAL_SKU_ID <=", value, "originalSkuId");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdIn(List<Long> values) {
            addCriterion("ORIGINAL_SKU_ID in", values, "originalSkuId");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdNotIn(List<Long> values) {
            addCriterion("ORIGINAL_SKU_ID not in", values, "originalSkuId");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdBetween(Long value1, Long value2) {
            addCriterion("ORIGINAL_SKU_ID between", value1, value2, "originalSkuId");
            return (Criteria) this;
        }

        public Criteria andOriginalSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("ORIGINAL_SKU_ID not between", value1, value2, "originalSkuId");
            return (Criteria) this;
        }

        public Criteria andLastStatusIsNull() {
            addCriterion("LAST_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andLastStatusIsNotNull() {
            addCriterion("LAST_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLastStatusEqualTo(Short value) {
            addCriterion("LAST_STATUS =", value, "lastStatus");
            return (Criteria) this;
        }

        public Criteria andLastStatusNotEqualTo(Short value) {
            addCriterion("LAST_STATUS <>", value, "lastStatus");
            return (Criteria) this;
        }

        public Criteria andLastStatusGreaterThan(Short value) {
            addCriterion("LAST_STATUS >", value, "lastStatus");
            return (Criteria) this;
        }

        public Criteria andLastStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("LAST_STATUS >=", value, "lastStatus");
            return (Criteria) this;
        }

        public Criteria andLastStatusLessThan(Short value) {
            addCriterion("LAST_STATUS <", value, "lastStatus");
            return (Criteria) this;
        }

        public Criteria andLastStatusLessThanOrEqualTo(Short value) {
            addCriterion("LAST_STATUS <=", value, "lastStatus");
            return (Criteria) this;
        }

        public Criteria andLastStatusIn(List<Short> values) {
            addCriterion("LAST_STATUS in", values, "lastStatus");
            return (Criteria) this;
        }

        public Criteria andLastStatusNotIn(List<Short> values) {
            addCriterion("LAST_STATUS not in", values, "lastStatus");
            return (Criteria) this;
        }

        public Criteria andLastStatusBetween(Short value1, Short value2) {
            addCriterion("LAST_STATUS between", value1, value2, "lastStatus");
            return (Criteria) this;
        }

        public Criteria andLastStatusNotBetween(Short value1, Short value2) {
            addCriterion("LAST_STATUS not between", value1, value2, "lastStatus");
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

        public Criteria andSkuTypeIsNull() {
            addCriterion("SKU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSkuTypeIsNotNull() {
            addCriterion("SKU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuTypeEqualTo(Short value) {
            addCriterion("SKU_TYPE =", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeNotEqualTo(Short value) {
            addCriterion("SKU_TYPE <>", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeGreaterThan(Short value) {
            addCriterion("SKU_TYPE >", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("SKU_TYPE >=", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeLessThan(Short value) {
            addCriterion("SKU_TYPE <", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeLessThanOrEqualTo(Short value) {
            addCriterion("SKU_TYPE <=", value, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeIn(List<Short> values) {
            addCriterion("SKU_TYPE in", values, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeNotIn(List<Short> values) {
            addCriterion("SKU_TYPE not in", values, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeBetween(Short value1, Short value2) {
            addCriterion("SKU_TYPE between", value1, value2, "skuType");
            return (Criteria) this;
        }

        public Criteria andSkuTypeNotBetween(Short value1, Short value2) {
            addCriterion("SKU_TYPE not between", value1, value2, "skuType");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("SALES is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("SALES is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Long value) {
            addCriterion("SALES =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Long value) {
            addCriterion("SALES <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Long value) {
            addCriterion("SALES >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Long value) {
            addCriterion("SALES >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Long value) {
            addCriterion("SALES <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Long value) {
            addCriterion("SALES <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Long> values) {
            addCriterion("SALES in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Long> values) {
            addCriterion("SALES not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Long value1, Long value2) {
            addCriterion("SALES between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Long value1, Long value2) {
            addCriterion("SALES not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andResCodeIsNull() {
            addCriterion("RES_CODE is null");
            return (Criteria) this;
        }

        public Criteria andResCodeIsNotNull() {
            addCriterion("RES_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andResCodeEqualTo(String value) {
            addCriterion("RES_CODE =", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotEqualTo(String value) {
            addCriterion("RES_CODE <>", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThan(String value) {
            addCriterion("RES_CODE >", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RES_CODE >=", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLessThan(String value) {
            addCriterion("RES_CODE <", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLessThanOrEqualTo(String value) {
            addCriterion("RES_CODE <=", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLike(String value) {
            addCriterion("RES_CODE like", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotLike(String value) {
            addCriterion("RES_CODE not like", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeIn(List<String> values) {
            addCriterion("RES_CODE in", values, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotIn(List<String> values) {
            addCriterion("RES_CODE not in", values, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeBetween(String value1, String value2) {
            addCriterion("RES_CODE between", value1, value2, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotBetween(String value1, String value2) {
            addCriterion("RES_CODE not between", value1, value2, "resCode");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNull() {
            addCriterion("PACK_ID is null");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNotNull() {
            addCriterion("PACK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPackIdEqualTo(Integer value) {
            addCriterion("PACK_ID =", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotEqualTo(Integer value) {
            addCriterion("PACK_ID <>", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThan(Integer value) {
            addCriterion("PACK_ID >", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PACK_ID >=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThan(Integer value) {
            addCriterion("PACK_ID <", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThanOrEqualTo(Integer value) {
            addCriterion("PACK_ID <=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdIn(List<Integer> values) {
            addCriterion("PACK_ID in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotIn(List<Integer> values) {
            addCriterion("PACK_ID not in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdBetween(Integer value1, Integer value2) {
            addCriterion("PACK_ID between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PACK_ID not between", value1, value2, "packId");
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