package com.wjw.ecps.model;

import java.util.ArrayList;
import java.util.List;

public class EbFeatureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbFeatureExample() {
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

        public Criteria andCatIdIsNull() {
            addCriterion("CAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("CAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(Long value) {
            addCriterion("CAT_ID =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(Long value) {
            addCriterion("CAT_ID <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(Long value) {
            addCriterion("CAT_ID >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CAT_ID >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(Long value) {
            addCriterion("CAT_ID <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(Long value) {
            addCriterion("CAT_ID <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<Long> values) {
            addCriterion("CAT_ID in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<Long> values) {
            addCriterion("CAT_ID not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(Long value1, Long value2) {
            addCriterion("CAT_ID between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(Long value1, Long value2) {
            addCriterion("CAT_ID not between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIsNull() {
            addCriterion("FEATURE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIsNotNull() {
            addCriterion("FEATURE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureNameEqualTo(String value) {
            addCriterion("FEATURE_NAME =", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotEqualTo(String value) {
            addCriterion("FEATURE_NAME <>", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameGreaterThan(String value) {
            addCriterion("FEATURE_NAME >", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameGreaterThanOrEqualTo(String value) {
            addCriterion("FEATURE_NAME >=", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLessThan(String value) {
            addCriterion("FEATURE_NAME <", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLessThanOrEqualTo(String value) {
            addCriterion("FEATURE_NAME <=", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLike(String value) {
            addCriterion("FEATURE_NAME like", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotLike(String value) {
            addCriterion("FEATURE_NAME not like", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIn(List<String> values) {
            addCriterion("FEATURE_NAME in", values, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotIn(List<String> values) {
            addCriterion("FEATURE_NAME not in", values, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameBetween(String value1, String value2) {
            addCriterion("FEATURE_NAME between", value1, value2, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotBetween(String value1, String value2) {
            addCriterion("FEATURE_NAME not between", value1, value2, "featureName");
            return (Criteria) this;
        }

        public Criteria andIsSpecIsNull() {
            addCriterion("IS_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecIsNotNull() {
            addCriterion("IS_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecEqualTo(Short value) {
            addCriterion("IS_SPEC =", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecNotEqualTo(Short value) {
            addCriterion("IS_SPEC <>", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecGreaterThan(Short value) {
            addCriterion("IS_SPEC >", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_SPEC >=", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecLessThan(Short value) {
            addCriterion("IS_SPEC <", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecLessThanOrEqualTo(Short value) {
            addCriterion("IS_SPEC <=", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecIn(List<Short> values) {
            addCriterion("IS_SPEC in", values, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecNotIn(List<Short> values) {
            addCriterion("IS_SPEC not in", values, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecBetween(Short value1, Short value2) {
            addCriterion("IS_SPEC between", value1, value2, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecNotBetween(Short value1, Short value2) {
            addCriterion("IS_SPEC not between", value1, value2, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSelectIsNull() {
            addCriterion("IS_SELECT is null");
            return (Criteria) this;
        }

        public Criteria andIsSelectIsNotNull() {
            addCriterion("IS_SELECT is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelectEqualTo(Short value) {
            addCriterion("IS_SELECT =", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectNotEqualTo(Short value) {
            addCriterion("IS_SELECT <>", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectGreaterThan(Short value) {
            addCriterion("IS_SELECT >", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_SELECT >=", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectLessThan(Short value) {
            addCriterion("IS_SELECT <", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectLessThanOrEqualTo(Short value) {
            addCriterion("IS_SELECT <=", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectIn(List<Short> values) {
            addCriterion("IS_SELECT in", values, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectNotIn(List<Short> values) {
            addCriterion("IS_SELECT not in", values, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectBetween(Short value1, Short value2) {
            addCriterion("IS_SELECT between", value1, value2, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectNotBetween(Short value1, Short value2) {
            addCriterion("IS_SELECT not between", value1, value2, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("IS_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("IS_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Short value) {
            addCriterion("IS_SHOW =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Short value) {
            addCriterion("IS_SHOW <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Short value) {
            addCriterion("IS_SHOW >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_SHOW >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Short value) {
            addCriterion("IS_SHOW <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Short value) {
            addCriterion("IS_SHOW <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Short> values) {
            addCriterion("IS_SHOW in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Short> values) {
            addCriterion("IS_SHOW not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Short value1, Short value2) {
            addCriterion("IS_SHOW between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Short value1, Short value2) {
            addCriterion("IS_SHOW not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andSelectValuesIsNull() {
            addCriterion("SELECT_VALUES is null");
            return (Criteria) this;
        }

        public Criteria andSelectValuesIsNotNull() {
            addCriterion("SELECT_VALUES is not null");
            return (Criteria) this;
        }

        public Criteria andSelectValuesEqualTo(String value) {
            addCriterion("SELECT_VALUES =", value, "selectValues");
            return (Criteria) this;
        }

        public Criteria andSelectValuesNotEqualTo(String value) {
            addCriterion("SELECT_VALUES <>", value, "selectValues");
            return (Criteria) this;
        }

        public Criteria andSelectValuesGreaterThan(String value) {
            addCriterion("SELECT_VALUES >", value, "selectValues");
            return (Criteria) this;
        }

        public Criteria andSelectValuesGreaterThanOrEqualTo(String value) {
            addCriterion("SELECT_VALUES >=", value, "selectValues");
            return (Criteria) this;
        }

        public Criteria andSelectValuesLessThan(String value) {
            addCriterion("SELECT_VALUES <", value, "selectValues");
            return (Criteria) this;
        }

        public Criteria andSelectValuesLessThanOrEqualTo(String value) {
            addCriterion("SELECT_VALUES <=", value, "selectValues");
            return (Criteria) this;
        }

        public Criteria andSelectValuesLike(String value) {
            addCriterion("SELECT_VALUES like", value, "selectValues");
            return (Criteria) this;
        }

        public Criteria andSelectValuesNotLike(String value) {
            addCriterion("SELECT_VALUES not like", value, "selectValues");
            return (Criteria) this;
        }

        public Criteria andSelectValuesIn(List<String> values) {
            addCriterion("SELECT_VALUES in", values, "selectValues");
            return (Criteria) this;
        }

        public Criteria andSelectValuesNotIn(List<String> values) {
            addCriterion("SELECT_VALUES not in", values, "selectValues");
            return (Criteria) this;
        }

        public Criteria andSelectValuesBetween(String value1, String value2) {
            addCriterion("SELECT_VALUES between", value1, value2, "selectValues");
            return (Criteria) this;
        }

        public Criteria andSelectValuesNotBetween(String value1, String value2) {
            addCriterion("SELECT_VALUES not between", value1, value2, "selectValues");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNull() {
            addCriterion("INPUT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNotNull() {
            addCriterion("INPUT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInputTypeEqualTo(Short value) {
            addCriterion("INPUT_TYPE =", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotEqualTo(Short value) {
            addCriterion("INPUT_TYPE <>", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThan(Short value) {
            addCriterion("INPUT_TYPE >", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("INPUT_TYPE >=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThan(Short value) {
            addCriterion("INPUT_TYPE <", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThanOrEqualTo(Short value) {
            addCriterion("INPUT_TYPE <=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeIn(List<Short> values) {
            addCriterion("INPUT_TYPE in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotIn(List<Short> values) {
            addCriterion("INPUT_TYPE not in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeBetween(Short value1, Short value2) {
            addCriterion("INPUT_TYPE between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotBetween(Short value1, Short value2) {
            addCriterion("INPUT_TYPE not between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andFeatureSortIsNull() {
            addCriterion("FEATURE_SORT is null");
            return (Criteria) this;
        }

        public Criteria andFeatureSortIsNotNull() {
            addCriterion("FEATURE_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureSortEqualTo(Integer value) {
            addCriterion("FEATURE_SORT =", value, "featureSort");
            return (Criteria) this;
        }

        public Criteria andFeatureSortNotEqualTo(Integer value) {
            addCriterion("FEATURE_SORT <>", value, "featureSort");
            return (Criteria) this;
        }

        public Criteria andFeatureSortGreaterThan(Integer value) {
            addCriterion("FEATURE_SORT >", value, "featureSort");
            return (Criteria) this;
        }

        public Criteria andFeatureSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("FEATURE_SORT >=", value, "featureSort");
            return (Criteria) this;
        }

        public Criteria andFeatureSortLessThan(Integer value) {
            addCriterion("FEATURE_SORT <", value, "featureSort");
            return (Criteria) this;
        }

        public Criteria andFeatureSortLessThanOrEqualTo(Integer value) {
            addCriterion("FEATURE_SORT <=", value, "featureSort");
            return (Criteria) this;
        }

        public Criteria andFeatureSortIn(List<Integer> values) {
            addCriterion("FEATURE_SORT in", values, "featureSort");
            return (Criteria) this;
        }

        public Criteria andFeatureSortNotIn(List<Integer> values) {
            addCriterion("FEATURE_SORT not in", values, "featureSort");
            return (Criteria) this;
        }

        public Criteria andFeatureSortBetween(Integer value1, Integer value2) {
            addCriterion("FEATURE_SORT between", value1, value2, "featureSort");
            return (Criteria) this;
        }

        public Criteria andFeatureSortNotBetween(Integer value1, Integer value2) {
            addCriterion("FEATURE_SORT not between", value1, value2, "featureSort");
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