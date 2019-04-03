package com.wjw.ecps.model;

import java.util.ArrayList;
import java.util.List;

public class EbParaValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbParaValueExample() {
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

        public Criteria andParaIdIsNull() {
            addCriterion("PARA_ID is null");
            return (Criteria) this;
        }

        public Criteria andParaIdIsNotNull() {
            addCriterion("PARA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParaIdEqualTo(Long value) {
            addCriterion("PARA_ID =", value, "paraId");
            return (Criteria) this;
        }

        public Criteria andParaIdNotEqualTo(Long value) {
            addCriterion("PARA_ID <>", value, "paraId");
            return (Criteria) this;
        }

        public Criteria andParaIdGreaterThan(Long value) {
            addCriterion("PARA_ID >", value, "paraId");
            return (Criteria) this;
        }

        public Criteria andParaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARA_ID >=", value, "paraId");
            return (Criteria) this;
        }

        public Criteria andParaIdLessThan(Long value) {
            addCriterion("PARA_ID <", value, "paraId");
            return (Criteria) this;
        }

        public Criteria andParaIdLessThanOrEqualTo(Long value) {
            addCriterion("PARA_ID <=", value, "paraId");
            return (Criteria) this;
        }

        public Criteria andParaIdIn(List<Long> values) {
            addCriterion("PARA_ID in", values, "paraId");
            return (Criteria) this;
        }

        public Criteria andParaIdNotIn(List<Long> values) {
            addCriterion("PARA_ID not in", values, "paraId");
            return (Criteria) this;
        }

        public Criteria andParaIdBetween(Long value1, Long value2) {
            addCriterion("PARA_ID between", value1, value2, "paraId");
            return (Criteria) this;
        }

        public Criteria andParaIdNotBetween(Long value1, Long value2) {
            addCriterion("PARA_ID not between", value1, value2, "paraId");
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

        public Criteria andFeatureIdIsNull() {
            addCriterion("FEATURE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIsNotNull() {
            addCriterion("FEATURE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureIdEqualTo(Long value) {
            addCriterion("FEATURE_ID =", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotEqualTo(Long value) {
            addCriterion("FEATURE_ID <>", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdGreaterThan(Long value) {
            addCriterion("FEATURE_ID >", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FEATURE_ID >=", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdLessThan(Long value) {
            addCriterion("FEATURE_ID <", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdLessThanOrEqualTo(Long value) {
            addCriterion("FEATURE_ID <=", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIn(List<Long> values) {
            addCriterion("FEATURE_ID in", values, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotIn(List<Long> values) {
            addCriterion("FEATURE_ID not in", values, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdBetween(Long value1, Long value2) {
            addCriterion("FEATURE_ID between", value1, value2, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotBetween(Long value1, Long value2) {
            addCriterion("FEATURE_ID not between", value1, value2, "featureId");
            return (Criteria) this;
        }

        public Criteria andParaValueIsNull() {
            addCriterion("PARA_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andParaValueIsNotNull() {
            addCriterion("PARA_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andParaValueEqualTo(String value) {
            addCriterion("PARA_VALUE =", value, "paraValue");
            return (Criteria) this;
        }

        public Criteria andParaValueNotEqualTo(String value) {
            addCriterion("PARA_VALUE <>", value, "paraValue");
            return (Criteria) this;
        }

        public Criteria andParaValueGreaterThan(String value) {
            addCriterion("PARA_VALUE >", value, "paraValue");
            return (Criteria) this;
        }

        public Criteria andParaValueGreaterThanOrEqualTo(String value) {
            addCriterion("PARA_VALUE >=", value, "paraValue");
            return (Criteria) this;
        }

        public Criteria andParaValueLessThan(String value) {
            addCriterion("PARA_VALUE <", value, "paraValue");
            return (Criteria) this;
        }

        public Criteria andParaValueLessThanOrEqualTo(String value) {
            addCriterion("PARA_VALUE <=", value, "paraValue");
            return (Criteria) this;
        }

        public Criteria andParaValueLike(String value) {
            addCriterion("PARA_VALUE like", value, "paraValue");
            return (Criteria) this;
        }

        public Criteria andParaValueNotLike(String value) {
            addCriterion("PARA_VALUE not like", value, "paraValue");
            return (Criteria) this;
        }

        public Criteria andParaValueIn(List<String> values) {
            addCriterion("PARA_VALUE in", values, "paraValue");
            return (Criteria) this;
        }

        public Criteria andParaValueNotIn(List<String> values) {
            addCriterion("PARA_VALUE not in", values, "paraValue");
            return (Criteria) this;
        }

        public Criteria andParaValueBetween(String value1, String value2) {
            addCriterion("PARA_VALUE between", value1, value2, "paraValue");
            return (Criteria) this;
        }

        public Criteria andParaValueNotBetween(String value1, String value2) {
            addCriterion("PARA_VALUE not between", value1, value2, "paraValue");
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