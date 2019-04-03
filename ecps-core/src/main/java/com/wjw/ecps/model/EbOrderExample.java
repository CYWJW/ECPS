package com.wjw.ecps.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbOrderExample() {
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

        public Criteria andPtlUserIdIsNull() {
            addCriterion("PTL_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtlUserIdIsNotNull() {
            addCriterion("PTL_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtlUserIdEqualTo(Long value) {
            addCriterion("PTL_USER_ID =", value, "ptlUserId");
            return (Criteria) this;
        }

        public Criteria andPtlUserIdNotEqualTo(Long value) {
            addCriterion("PTL_USER_ID <>", value, "ptlUserId");
            return (Criteria) this;
        }

        public Criteria andPtlUserIdGreaterThan(Long value) {
            addCriterion("PTL_USER_ID >", value, "ptlUserId");
            return (Criteria) this;
        }

        public Criteria andPtlUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PTL_USER_ID >=", value, "ptlUserId");
            return (Criteria) this;
        }

        public Criteria andPtlUserIdLessThan(Long value) {
            addCriterion("PTL_USER_ID <", value, "ptlUserId");
            return (Criteria) this;
        }

        public Criteria andPtlUserIdLessThanOrEqualTo(Long value) {
            addCriterion("PTL_USER_ID <=", value, "ptlUserId");
            return (Criteria) this;
        }

        public Criteria andPtlUserIdIn(List<Long> values) {
            addCriterion("PTL_USER_ID in", values, "ptlUserId");
            return (Criteria) this;
        }

        public Criteria andPtlUserIdNotIn(List<Long> values) {
            addCriterion("PTL_USER_ID not in", values, "ptlUserId");
            return (Criteria) this;
        }

        public Criteria andPtlUserIdBetween(Long value1, Long value2) {
            addCriterion("PTL_USER_ID between", value1, value2, "ptlUserId");
            return (Criteria) this;
        }

        public Criteria andPtlUserIdNotBetween(Long value1, Long value2) {
            addCriterion("PTL_USER_ID not between", value1, value2, "ptlUserId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("ORDER_NUM =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("ORDER_NUM <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("ORDER_NUM >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NUM >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("ORDER_NUM <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NUM <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("ORDER_NUM like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("ORDER_NUM not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("ORDER_NUM in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("ORDER_NUM not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("ORDER_NUM between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("ORDER_NUM not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Short value) {
            addCriterion("PAYMENT =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Short value) {
            addCriterion("PAYMENT <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Short value) {
            addCriterion("PAYMENT >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYMENT >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Short value) {
            addCriterion("PAYMENT <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Short value) {
            addCriterion("PAYMENT <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Short> values) {
            addCriterion("PAYMENT in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Short> values) {
            addCriterion("PAYMENT not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Short value1, Short value2) {
            addCriterion("PAYMENT between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Short value1, Short value2) {
            addCriterion("PAYMENT not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIsNull() {
            addCriterion("PAY_PLATFORM is null");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIsNotNull() {
            addCriterion("PAY_PLATFORM is not null");
            return (Criteria) this;
        }

        public Criteria andPayPlatformEqualTo(Short value) {
            addCriterion("PAY_PLATFORM =", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformNotEqualTo(Short value) {
            addCriterion("PAY_PLATFORM <>", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformGreaterThan(Short value) {
            addCriterion("PAY_PLATFORM >", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformGreaterThanOrEqualTo(Short value) {
            addCriterion("PAY_PLATFORM >=", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformLessThan(Short value) {
            addCriterion("PAY_PLATFORM <", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformLessThanOrEqualTo(Short value) {
            addCriterion("PAY_PLATFORM <=", value, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIn(List<Short> values) {
            addCriterion("PAY_PLATFORM in", values, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformNotIn(List<Short> values) {
            addCriterion("PAY_PLATFORM not in", values, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformBetween(Short value1, Short value2) {
            addCriterion("PAY_PLATFORM between", value1, value2, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andPayPlatformNotBetween(Short value1, Short value2) {
            addCriterion("PAY_PLATFORM not between", value1, value2, "payPlatform");
            return (Criteria) this;
        }

        public Criteria andDeliveryIsNull() {
            addCriterion("DELIVERY is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIsNotNull() {
            addCriterion("DELIVERY is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryEqualTo(Short value) {
            addCriterion("DELIVERY =", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotEqualTo(Short value) {
            addCriterion("DELIVERY <>", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryGreaterThan(Short value) {
            addCriterion("DELIVERY >", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryGreaterThanOrEqualTo(Short value) {
            addCriterion("DELIVERY >=", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryLessThan(Short value) {
            addCriterion("DELIVERY <", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryLessThanOrEqualTo(Short value) {
            addCriterion("DELIVERY <=", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryIn(List<Short> values) {
            addCriterion("DELIVERY in", values, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotIn(List<Short> values) {
            addCriterion("DELIVERY not in", values, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryBetween(Short value1, Short value2) {
            addCriterion("DELIVERY between", value1, value2, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotBetween(Short value1, Short value2) {
            addCriterion("DELIVERY not between", value1, value2, "delivery");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIsNull() {
            addCriterion("IS_CONFIRM is null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIsNotNull() {
            addCriterion("IS_CONFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmEqualTo(Short value) {
            addCriterion("IS_CONFIRM =", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotEqualTo(Short value) {
            addCriterion("IS_CONFIRM <>", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThan(Short value) {
            addCriterion("IS_CONFIRM >", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_CONFIRM >=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThan(Short value) {
            addCriterion("IS_CONFIRM <", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThanOrEqualTo(Short value) {
            addCriterion("IS_CONFIRM <=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIn(List<Short> values) {
            addCriterion("IS_CONFIRM in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotIn(List<Short> values) {
            addCriterion("IS_CONFIRM not in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmBetween(Short value1, Short value2) {
            addCriterion("IS_CONFIRM between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotBetween(Short value1, Short value2) {
            addCriterion("IS_CONFIRM not between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andOrderSumIsNull() {
            addCriterion("ORDER_SUM is null");
            return (Criteria) this;
        }

        public Criteria andOrderSumIsNotNull() {
            addCriterion("ORDER_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSumEqualTo(BigDecimal value) {
            addCriterion("ORDER_SUM =", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_SUM <>", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumGreaterThan(BigDecimal value) {
            addCriterion("ORDER_SUM >", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_SUM >=", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumLessThan(BigDecimal value) {
            addCriterion("ORDER_SUM <", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_SUM <=", value, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumIn(List<BigDecimal> values) {
            addCriterion("ORDER_SUM in", values, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_SUM not in", values, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_SUM between", value1, value2, "orderSum");
            return (Criteria) this;
        }

        public Criteria andOrderSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_SUM not between", value1, value2, "orderSum");
            return (Criteria) this;
        }

        public Criteria andShipFeeIsNull() {
            addCriterion("SHIP_FEE is null");
            return (Criteria) this;
        }

        public Criteria andShipFeeIsNotNull() {
            addCriterion("SHIP_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andShipFeeEqualTo(BigDecimal value) {
            addCriterion("SHIP_FEE =", value, "shipFee");
            return (Criteria) this;
        }

        public Criteria andShipFeeNotEqualTo(BigDecimal value) {
            addCriterion("SHIP_FEE <>", value, "shipFee");
            return (Criteria) this;
        }

        public Criteria andShipFeeGreaterThan(BigDecimal value) {
            addCriterion("SHIP_FEE >", value, "shipFee");
            return (Criteria) this;
        }

        public Criteria andShipFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIP_FEE >=", value, "shipFee");
            return (Criteria) this;
        }

        public Criteria andShipFeeLessThan(BigDecimal value) {
            addCriterion("SHIP_FEE <", value, "shipFee");
            return (Criteria) this;
        }

        public Criteria andShipFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIP_FEE <=", value, "shipFee");
            return (Criteria) this;
        }

        public Criteria andShipFeeIn(List<BigDecimal> values) {
            addCriterion("SHIP_FEE in", values, "shipFee");
            return (Criteria) this;
        }

        public Criteria andShipFeeNotIn(List<BigDecimal> values) {
            addCriterion("SHIP_FEE not in", values, "shipFee");
            return (Criteria) this;
        }

        public Criteria andShipFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIP_FEE between", value1, value2, "shipFee");
            return (Criteria) this;
        }

        public Criteria andShipFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIP_FEE not between", value1, value2, "shipFee");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNull() {
            addCriterion("IS_PAID is null");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNotNull() {
            addCriterion("IS_PAID is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaidEqualTo(Short value) {
            addCriterion("IS_PAID =", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotEqualTo(Short value) {
            addCriterion("IS_PAID <>", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThan(Short value) {
            addCriterion("IS_PAID >", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_PAID >=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThan(Short value) {
            addCriterion("IS_PAID <", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThanOrEqualTo(Short value) {
            addCriterion("IS_PAID <=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidIn(List<Short> values) {
            addCriterion("IS_PAID in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotIn(List<Short> values) {
            addCriterion("IS_PAID not in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidBetween(Short value1, Short value2) {
            addCriterion("IS_PAID between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotBetween(Short value1, Short value2) {
            addCriterion("IS_PAID not between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("ORDER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("ORDER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Short value) {
            addCriterion("ORDER_STATE =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Short value) {
            addCriterion("ORDER_STATE <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Short value) {
            addCriterion("ORDER_STATE >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_STATE >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Short value) {
            addCriterion("ORDER_STATE <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_STATE <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Short> values) {
            addCriterion("ORDER_STATE in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Short> values) {
            addCriterion("ORDER_STATE not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Short value1, Short value2) {
            addCriterion("ORDER_STATE between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_STATE not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andPaymentCashIsNull() {
            addCriterion("PAYMENT_CASH is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCashIsNotNull() {
            addCriterion("PAYMENT_CASH is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCashEqualTo(Short value) {
            addCriterion("PAYMENT_CASH =", value, "paymentCash");
            return (Criteria) this;
        }

        public Criteria andPaymentCashNotEqualTo(Short value) {
            addCriterion("PAYMENT_CASH <>", value, "paymentCash");
            return (Criteria) this;
        }

        public Criteria andPaymentCashGreaterThan(Short value) {
            addCriterion("PAYMENT_CASH >", value, "paymentCash");
            return (Criteria) this;
        }

        public Criteria andPaymentCashGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYMENT_CASH >=", value, "paymentCash");
            return (Criteria) this;
        }

        public Criteria andPaymentCashLessThan(Short value) {
            addCriterion("PAYMENT_CASH <", value, "paymentCash");
            return (Criteria) this;
        }

        public Criteria andPaymentCashLessThanOrEqualTo(Short value) {
            addCriterion("PAYMENT_CASH <=", value, "paymentCash");
            return (Criteria) this;
        }

        public Criteria andPaymentCashIn(List<Short> values) {
            addCriterion("PAYMENT_CASH in", values, "paymentCash");
            return (Criteria) this;
        }

        public Criteria andPaymentCashNotIn(List<Short> values) {
            addCriterion("PAYMENT_CASH not in", values, "paymentCash");
            return (Criteria) this;
        }

        public Criteria andPaymentCashBetween(Short value1, Short value2) {
            addCriterion("PAYMENT_CASH between", value1, value2, "paymentCash");
            return (Criteria) this;
        }

        public Criteria andPaymentCashNotBetween(Short value1, Short value2) {
            addCriterion("PAYMENT_CASH not between", value1, value2, "paymentCash");
            return (Criteria) this;
        }

        public Criteria andDistriIdIsNull() {
            addCriterion("DISTRI_ID is null");
            return (Criteria) this;
        }

        public Criteria andDistriIdIsNotNull() {
            addCriterion("DISTRI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDistriIdEqualTo(Long value) {
            addCriterion("DISTRI_ID =", value, "distriId");
            return (Criteria) this;
        }

        public Criteria andDistriIdNotEqualTo(Long value) {
            addCriterion("DISTRI_ID <>", value, "distriId");
            return (Criteria) this;
        }

        public Criteria andDistriIdGreaterThan(Long value) {
            addCriterion("DISTRI_ID >", value, "distriId");
            return (Criteria) this;
        }

        public Criteria andDistriIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DISTRI_ID >=", value, "distriId");
            return (Criteria) this;
        }

        public Criteria andDistriIdLessThan(Long value) {
            addCriterion("DISTRI_ID <", value, "distriId");
            return (Criteria) this;
        }

        public Criteria andDistriIdLessThanOrEqualTo(Long value) {
            addCriterion("DISTRI_ID <=", value, "distriId");
            return (Criteria) this;
        }

        public Criteria andDistriIdIn(List<Long> values) {
            addCriterion("DISTRI_ID in", values, "distriId");
            return (Criteria) this;
        }

        public Criteria andDistriIdNotIn(List<Long> values) {
            addCriterion("DISTRI_ID not in", values, "distriId");
            return (Criteria) this;
        }

        public Criteria andDistriIdBetween(Long value1, Long value2) {
            addCriterion("DISTRI_ID between", value1, value2, "distriId");
            return (Criteria) this;
        }

        public Criteria andDistriIdNotBetween(Long value1, Long value2) {
            addCriterion("DISTRI_ID not between", value1, value2, "distriId");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIsNull() {
            addCriterion("DELIVERY_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIsNotNull() {
            addCriterion("DELIVERY_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodEqualTo(Short value) {
            addCriterion("DELIVERY_METHOD =", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodNotEqualTo(Short value) {
            addCriterion("DELIVERY_METHOD <>", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodGreaterThan(Short value) {
            addCriterion("DELIVERY_METHOD >", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodGreaterThanOrEqualTo(Short value) {
            addCriterion("DELIVERY_METHOD >=", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodLessThan(Short value) {
            addCriterion("DELIVERY_METHOD <", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodLessThanOrEqualTo(Short value) {
            addCriterion("DELIVERY_METHOD <=", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIn(List<Short> values) {
            addCriterion("DELIVERY_METHOD in", values, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodNotIn(List<Short> values) {
            addCriterion("DELIVERY_METHOD not in", values, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodBetween(Short value1, Short value2) {
            addCriterion("DELIVERY_METHOD between", value1, value2, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodNotBetween(Short value1, Short value2) {
            addCriterion("DELIVERY_METHOD not between", value1, value2, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNull() {
            addCriterion("PAYMENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNotNull() {
            addCriterion("PAYMENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoEqualTo(String value) {
            addCriterion("PAYMENT_NO =", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotEqualTo(String value) {
            addCriterion("PAYMENT_NO <>", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThan(String value) {
            addCriterion("PAYMENT_NO >", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_NO >=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThan(String value) {
            addCriterion("PAYMENT_NO <", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_NO <=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLike(String value) {
            addCriterion("PAYMENT_NO like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotLike(String value) {
            addCriterion("PAYMENT_NO not like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIn(List<String> values) {
            addCriterion("PAYMENT_NO in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotIn(List<String> values) {
            addCriterion("PAYMENT_NO not in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoBetween(String value1, String value2) {
            addCriterion("PAYMENT_NO between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_NO not between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("PAY_TIME =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("PAY_TIME <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("PAY_TIME >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_TIME >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("PAY_TIME <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAY_TIME <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("PAY_TIME in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("PAY_TIME not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("PAY_TIME between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAY_TIME not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andDepositTimeIsNull() {
            addCriterion("DEPOSIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDepositTimeIsNotNull() {
            addCriterion("DEPOSIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDepositTimeEqualTo(Date value) {
            addCriterion("DEPOSIT_TIME =", value, "depositTime");
            return (Criteria) this;
        }

        public Criteria andDepositTimeNotEqualTo(Date value) {
            addCriterion("DEPOSIT_TIME <>", value, "depositTime");
            return (Criteria) this;
        }

        public Criteria andDepositTimeGreaterThan(Date value) {
            addCriterion("DEPOSIT_TIME >", value, "depositTime");
            return (Criteria) this;
        }

        public Criteria andDepositTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DEPOSIT_TIME >=", value, "depositTime");
            return (Criteria) this;
        }

        public Criteria andDepositTimeLessThan(Date value) {
            addCriterion("DEPOSIT_TIME <", value, "depositTime");
            return (Criteria) this;
        }

        public Criteria andDepositTimeLessThanOrEqualTo(Date value) {
            addCriterion("DEPOSIT_TIME <=", value, "depositTime");
            return (Criteria) this;
        }

        public Criteria andDepositTimeIn(List<Date> values) {
            addCriterion("DEPOSIT_TIME in", values, "depositTime");
            return (Criteria) this;
        }

        public Criteria andDepositTimeNotIn(List<Date> values) {
            addCriterion("DEPOSIT_TIME not in", values, "depositTime");
            return (Criteria) this;
        }

        public Criteria andDepositTimeBetween(Date value1, Date value2) {
            addCriterion("DEPOSIT_TIME between", value1, value2, "depositTime");
            return (Criteria) this;
        }

        public Criteria andDepositTimeNotBetween(Date value1, Date value2) {
            addCriterion("DEPOSIT_TIME not between", value1, value2, "depositTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNull() {
            addCriterion("SUCCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNotNull() {
            addCriterion("SUCCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeEqualTo(Date value) {
            addCriterion("SUCCESS_TIME =", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotEqualTo(Date value) {
            addCriterion("SUCCESS_TIME <>", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThan(Date value) {
            addCriterion("SUCCESS_TIME >", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SUCCESS_TIME >=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThan(Date value) {
            addCriterion("SUCCESS_TIME <", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("SUCCESS_TIME <=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIn(List<Date> values) {
            addCriterion("SUCCESS_TIME in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotIn(List<Date> values) {
            addCriterion("SUCCESS_TIME not in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeBetween(Date value1, Date value2) {
            addCriterion("SUCCESS_TIME between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("SUCCESS_TIME not between", value1, value2, "successTime");
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

        public Criteria andSrvTypeIsNull() {
            addCriterion("SRV_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSrvTypeIsNotNull() {
            addCriterion("SRV_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSrvTypeEqualTo(Short value) {
            addCriterion("SRV_TYPE =", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeNotEqualTo(Short value) {
            addCriterion("SRV_TYPE <>", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeGreaterThan(Short value) {
            addCriterion("SRV_TYPE >", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("SRV_TYPE >=", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeLessThan(Short value) {
            addCriterion("SRV_TYPE <", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeLessThanOrEqualTo(Short value) {
            addCriterion("SRV_TYPE <=", value, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeIn(List<Short> values) {
            addCriterion("SRV_TYPE in", values, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeNotIn(List<Short> values) {
            addCriterion("SRV_TYPE not in", values, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeBetween(Short value1, Short value2) {
            addCriterion("SRV_TYPE between", value1, value2, "srvType");
            return (Criteria) this;
        }

        public Criteria andSrvTypeNotBetween(Short value1, Short value2) {
            addCriterion("SRV_TYPE not between", value1, value2, "srvType");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIsNull() {
            addCriterion("SELF_COLLECT_SITE is null");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIsNotNull() {
            addCriterion("SELF_COLLECT_SITE is not null");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteEqualTo(String value) {
            addCriterion("SELF_COLLECT_SITE =", value, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteNotEqualTo(String value) {
            addCriterion("SELF_COLLECT_SITE <>", value, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteGreaterThan(String value) {
            addCriterion("SELF_COLLECT_SITE >", value, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_COLLECT_SITE >=", value, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteLessThan(String value) {
            addCriterion("SELF_COLLECT_SITE <", value, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteLessThanOrEqualTo(String value) {
            addCriterion("SELF_COLLECT_SITE <=", value, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteLike(String value) {
            addCriterion("SELF_COLLECT_SITE like", value, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteNotLike(String value) {
            addCriterion("SELF_COLLECT_SITE not like", value, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIn(List<String> values) {
            addCriterion("SELF_COLLECT_SITE in", values, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteNotIn(List<String> values) {
            addCriterion("SELF_COLLECT_SITE not in", values, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteBetween(String value1, String value2) {
            addCriterion("SELF_COLLECT_SITE between", value1, value2, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteNotBetween(String value1, String value2) {
            addCriterion("SELF_COLLECT_SITE not between", value1, value2, "selfCollectSite");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdIsNull() {
            addCriterion("SELF_COLLECT_SITE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdIsNotNull() {
            addCriterion("SELF_COLLECT_SITE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdEqualTo(Long value) {
            addCriterion("SELF_COLLECT_SITE_ID =", value, "selfCollectSiteId");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdNotEqualTo(Long value) {
            addCriterion("SELF_COLLECT_SITE_ID <>", value, "selfCollectSiteId");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdGreaterThan(Long value) {
            addCriterion("SELF_COLLECT_SITE_ID >", value, "selfCollectSiteId");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SELF_COLLECT_SITE_ID >=", value, "selfCollectSiteId");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdLessThan(Long value) {
            addCriterion("SELF_COLLECT_SITE_ID <", value, "selfCollectSiteId");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdLessThanOrEqualTo(Long value) {
            addCriterion("SELF_COLLECT_SITE_ID <=", value, "selfCollectSiteId");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdIn(List<Long> values) {
            addCriterion("SELF_COLLECT_SITE_ID in", values, "selfCollectSiteId");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdNotIn(List<Long> values) {
            addCriterion("SELF_COLLECT_SITE_ID not in", values, "selfCollectSiteId");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdBetween(Long value1, Long value2) {
            addCriterion("SELF_COLLECT_SITE_ID between", value1, value2, "selfCollectSiteId");
            return (Criteria) this;
        }

        public Criteria andSelfCollectSiteIdNotBetween(Long value1, Long value2) {
            addCriterion("SELF_COLLECT_SITE_ID not between", value1, value2, "selfCollectSiteId");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Short value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Short value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Short value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Short value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Short value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Short> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Short> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Short value1, Short value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Short value1, Short value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIsNull() {
            addCriterion("IS_DISPLAY is null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIsNotNull() {
            addCriterion("IS_DISPLAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayEqualTo(Short value) {
            addCriterion("IS_DISPLAY =", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotEqualTo(Short value) {
            addCriterion("IS_DISPLAY <>", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayGreaterThan(Short value) {
            addCriterion("IS_DISPLAY >", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_DISPLAY >=", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLessThan(Short value) {
            addCriterion("IS_DISPLAY <", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLessThanOrEqualTo(Short value) {
            addCriterion("IS_DISPLAY <=", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIn(List<Short> values) {
            addCriterion("IS_DISPLAY in", values, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotIn(List<Short> values) {
            addCriterion("IS_DISPLAY not in", values, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayBetween(Short value1, Short value2) {
            addCriterion("IS_DISPLAY between", value1, value2, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotBetween(Short value1, Short value2) {
            addCriterion("IS_DISPLAY not between", value1, value2, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("NOTES is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("NOTES =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("NOTES <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("NOTES >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("NOTES >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("NOTES <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("NOTES <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("NOTES like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("NOTES not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("NOTES in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("NOTES not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("NOTES between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("NOTES not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("SHIP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("SHIP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("SHIP_NAME =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("SHIP_NAME <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("SHIP_NAME >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHIP_NAME >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("SHIP_NAME <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("SHIP_NAME <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("SHIP_NAME like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("SHIP_NAME not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("SHIP_NAME in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("SHIP_NAME not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("SHIP_NAME between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("SHIP_NAME not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("DISTRICT =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("DISTRICT <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("DISTRICT >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("DISTRICT <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("DISTRICT like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("DISTRICT not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("DISTRICT in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("DISTRICT not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("DISTRICT between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("DISTRICT not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("ZIP_CODE =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("ZIP_CODE <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("ZIP_CODE >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("ZIP_CODE <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("ZIP_CODE like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("ZIP_CODE not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("ZIP_CODE in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("ZIP_CODE not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("ZIP_CODE between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("ZIP_CODE not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("ADDR =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("ADDR <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("ADDR >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("ADDR <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("ADDR <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("ADDR like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("ADDR not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("ADDR in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("ADDR not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("ADDR between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("ADDR not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPayableIsNull() {
            addCriterion("PAYABLE is null");
            return (Criteria) this;
        }

        public Criteria andPayableIsNotNull() {
            addCriterion("PAYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andPayableEqualTo(Short value) {
            addCriterion("PAYABLE =", value, "payable");
            return (Criteria) this;
        }

        public Criteria andPayableNotEqualTo(Short value) {
            addCriterion("PAYABLE <>", value, "payable");
            return (Criteria) this;
        }

        public Criteria andPayableGreaterThan(Short value) {
            addCriterion("PAYABLE >", value, "payable");
            return (Criteria) this;
        }

        public Criteria andPayableGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYABLE >=", value, "payable");
            return (Criteria) this;
        }

        public Criteria andPayableLessThan(Short value) {
            addCriterion("PAYABLE <", value, "payable");
            return (Criteria) this;
        }

        public Criteria andPayableLessThanOrEqualTo(Short value) {
            addCriterion("PAYABLE <=", value, "payable");
            return (Criteria) this;
        }

        public Criteria andPayableIn(List<Short> values) {
            addCriterion("PAYABLE in", values, "payable");
            return (Criteria) this;
        }

        public Criteria andPayableNotIn(List<Short> values) {
            addCriterion("PAYABLE not in", values, "payable");
            return (Criteria) this;
        }

        public Criteria andPayableBetween(Short value1, Short value2) {
            addCriterion("PAYABLE between", value1, value2, "payable");
            return (Criteria) this;
        }

        public Criteria andPayableNotBetween(Short value1, Short value2) {
            addCriterion("PAYABLE not between", value1, value2, "payable");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("COMPANY like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("COMPANY not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("COMPANY not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andContentsIsNull() {
            addCriterion("CONTENTS is null");
            return (Criteria) this;
        }

        public Criteria andContentsIsNotNull() {
            addCriterion("CONTENTS is not null");
            return (Criteria) this;
        }

        public Criteria andContentsEqualTo(Short value) {
            addCriterion("CONTENTS =", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotEqualTo(Short value) {
            addCriterion("CONTENTS <>", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThan(Short value) {
            addCriterion("CONTENTS >", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThanOrEqualTo(Short value) {
            addCriterion("CONTENTS >=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThan(Short value) {
            addCriterion("CONTENTS <", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThanOrEqualTo(Short value) {
            addCriterion("CONTENTS <=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsIn(List<Short> values) {
            addCriterion("CONTENTS in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotIn(List<Short> values) {
            addCriterion("CONTENTS not in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsBetween(Short value1, Short value2) {
            addCriterion("CONTENTS between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotBetween(Short value1, Short value2) {
            addCriterion("CONTENTS not between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andIsCallIsNull() {
            addCriterion("IS_CALL is null");
            return (Criteria) this;
        }

        public Criteria andIsCallIsNotNull() {
            addCriterion("IS_CALL is not null");
            return (Criteria) this;
        }

        public Criteria andIsCallEqualTo(Short value) {
            addCriterion("IS_CALL =", value, "isCall");
            return (Criteria) this;
        }

        public Criteria andIsCallNotEqualTo(Short value) {
            addCriterion("IS_CALL <>", value, "isCall");
            return (Criteria) this;
        }

        public Criteria andIsCallGreaterThan(Short value) {
            addCriterion("IS_CALL >", value, "isCall");
            return (Criteria) this;
        }

        public Criteria andIsCallGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_CALL >=", value, "isCall");
            return (Criteria) this;
        }

        public Criteria andIsCallLessThan(Short value) {
            addCriterion("IS_CALL <", value, "isCall");
            return (Criteria) this;
        }

        public Criteria andIsCallLessThanOrEqualTo(Short value) {
            addCriterion("IS_CALL <=", value, "isCall");
            return (Criteria) this;
        }

        public Criteria andIsCallIn(List<Short> values) {
            addCriterion("IS_CALL in", values, "isCall");
            return (Criteria) this;
        }

        public Criteria andIsCallNotIn(List<Short> values) {
            addCriterion("IS_CALL not in", values, "isCall");
            return (Criteria) this;
        }

        public Criteria andIsCallBetween(Short value1, Short value2) {
            addCriterion("IS_CALL between", value1, value2, "isCall");
            return (Criteria) this;
        }

        public Criteria andIsCallNotBetween(Short value1, Short value2) {
            addCriterion("IS_CALL not between", value1, value2, "isCall");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoIsNull() {
            addCriterion("DELIVERY_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoIsNotNull() {
            addCriterion("DELIVERY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoEqualTo(String value) {
            addCriterion("DELIVERY_NO =", value, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoNotEqualTo(String value) {
            addCriterion("DELIVERY_NO <>", value, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoGreaterThan(String value) {
            addCriterion("DELIVERY_NO >", value, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_NO >=", value, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoLessThan(String value) {
            addCriterion("DELIVERY_NO <", value, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_NO <=", value, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoLike(String value) {
            addCriterion("DELIVERY_NO like", value, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoNotLike(String value) {
            addCriterion("DELIVERY_NO not like", value, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoIn(List<String> values) {
            addCriterion("DELIVERY_NO in", values, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoNotIn(List<String> values) {
            addCriterion("DELIVERY_NO not in", values, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoBetween(String value1, String value2) {
            addCriterion("DELIVERY_NO between", value1, value2, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryNoNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_NO not between", value1, value2, "deliveryNo");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("AREA_NAME =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("AREA_NAME <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("AREA_NAME >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NAME >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("AREA_NAME <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("AREA_NAME <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("AREA_NAME like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("AREA_NAME not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("AREA_NAME in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("AREA_NAME not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("AREA_NAME between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("AREA_NAME not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNull() {
            addCriterion("IS_PRINT is null");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNotNull() {
            addCriterion("IS_PRINT is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrintEqualTo(Short value) {
            addCriterion("IS_PRINT =", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotEqualTo(Short value) {
            addCriterion("IS_PRINT <>", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThan(Short value) {
            addCriterion("IS_PRINT >", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_PRINT >=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThan(Short value) {
            addCriterion("IS_PRINT <", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThanOrEqualTo(Short value) {
            addCriterion("IS_PRINT <=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintIn(List<Short> values) {
            addCriterion("IS_PRINT in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotIn(List<Short> values) {
            addCriterion("IS_PRINT not in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintBetween(Short value1, Short value2) {
            addCriterion("IS_PRINT between", value1, value2, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotBetween(Short value1, Short value2) {
            addCriterion("IS_PRINT not between", value1, value2, "isPrint");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeIsNull() {
            addCriterion("CRM_CALLS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeIsNotNull() {
            addCriterion("CRM_CALLS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeEqualTo(Date value) {
            addCriterion("CRM_CALLS_TIME =", value, "crmCallsTime");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeNotEqualTo(Date value) {
            addCriterion("CRM_CALLS_TIME <>", value, "crmCallsTime");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeGreaterThan(Date value) {
            addCriterion("CRM_CALLS_TIME >", value, "crmCallsTime");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRM_CALLS_TIME >=", value, "crmCallsTime");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeLessThan(Date value) {
            addCriterion("CRM_CALLS_TIME <", value, "crmCallsTime");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRM_CALLS_TIME <=", value, "crmCallsTime");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeIn(List<Date> values) {
            addCriterion("CRM_CALLS_TIME in", values, "crmCallsTime");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeNotIn(List<Date> values) {
            addCriterion("CRM_CALLS_TIME not in", values, "crmCallsTime");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeBetween(Date value1, Date value2) {
            addCriterion("CRM_CALLS_TIME between", value1, value2, "crmCallsTime");
            return (Criteria) this;
        }

        public Criteria andCrmCallsTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRM_CALLS_TIME not between", value1, value2, "crmCallsTime");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseIsNull() {
            addCriterion("IS_OFFER_RELEASE is null");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseIsNotNull() {
            addCriterion("IS_OFFER_RELEASE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseEqualTo(Short value) {
            addCriterion("IS_OFFER_RELEASE =", value, "isOfferRelease");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseNotEqualTo(Short value) {
            addCriterion("IS_OFFER_RELEASE <>", value, "isOfferRelease");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseGreaterThan(Short value) {
            addCriterion("IS_OFFER_RELEASE >", value, "isOfferRelease");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_OFFER_RELEASE >=", value, "isOfferRelease");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseLessThan(Short value) {
            addCriterion("IS_OFFER_RELEASE <", value, "isOfferRelease");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseLessThanOrEqualTo(Short value) {
            addCriterion("IS_OFFER_RELEASE <=", value, "isOfferRelease");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseIn(List<Short> values) {
            addCriterion("IS_OFFER_RELEASE in", values, "isOfferRelease");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseNotIn(List<Short> values) {
            addCriterion("IS_OFFER_RELEASE not in", values, "isOfferRelease");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseBetween(Short value1, Short value2) {
            addCriterion("IS_OFFER_RELEASE between", value1, value2, "isOfferRelease");
            return (Criteria) this;
        }

        public Criteria andIsOfferReleaseNotBetween(Short value1, Short value2) {
            addCriterion("IS_OFFER_RELEASE not between", value1, value2, "isOfferRelease");
            return (Criteria) this;
        }

        public Criteria andJobNumIsNull() {
            addCriterion("JOB_NUM is null");
            return (Criteria) this;
        }

        public Criteria andJobNumIsNotNull() {
            addCriterion("JOB_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumEqualTo(String value) {
            addCriterion("JOB_NUM =", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotEqualTo(String value) {
            addCriterion("JOB_NUM <>", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumGreaterThan(String value) {
            addCriterion("JOB_NUM >", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_NUM >=", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLessThan(String value) {
            addCriterion("JOB_NUM <", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLessThanOrEqualTo(String value) {
            addCriterion("JOB_NUM <=", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLike(String value) {
            addCriterion("JOB_NUM like", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotLike(String value) {
            addCriterion("JOB_NUM not like", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumIn(List<String> values) {
            addCriterion("JOB_NUM in", values, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotIn(List<String> values) {
            addCriterion("JOB_NUM not in", values, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumBetween(String value1, String value2) {
            addCriterion("JOB_NUM between", value1, value2, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotBetween(String value1, String value2) {
            addCriterion("JOB_NUM not between", value1, value2, "jobNum");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Short value) {
            addCriterion("ORDER_TYPE =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Short value) {
            addCriterion("ORDER_TYPE <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Short value) {
            addCriterion("ORDER_TYPE >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_TYPE >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Short value) {
            addCriterion("ORDER_TYPE <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_TYPE <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Short> values) {
            addCriterion("ORDER_TYPE in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Short> values) {
            addCriterion("ORDER_TYPE not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Short value1, Short value2) {
            addCriterion("ORDER_TYPE between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_TYPE not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIsNull() {
            addCriterion("FIXED_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIsNotNull() {
            addCriterion("FIXED_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneEqualTo(String value) {
            addCriterion("FIXED_PHONE =", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotEqualTo(String value) {
            addCriterion("FIXED_PHONE <>", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneGreaterThan(String value) {
            addCriterion("FIXED_PHONE >", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("FIXED_PHONE >=", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLessThan(String value) {
            addCriterion("FIXED_PHONE <", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLessThanOrEqualTo(String value) {
            addCriterion("FIXED_PHONE <=", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLike(String value) {
            addCriterion("FIXED_PHONE like", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotLike(String value) {
            addCriterion("FIXED_PHONE not like", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIn(List<String> values) {
            addCriterion("FIXED_PHONE in", values, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotIn(List<String> values) {
            addCriterion("FIXED_PHONE not in", values, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneBetween(String value1, String value2) {
            addCriterion("FIXED_PHONE between", value1, value2, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotBetween(String value1, String value2) {
            addCriterion("FIXED_PHONE not between", value1, value2, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andAttachFileIsNull() {
            addCriterion("ATTACH_FILE is null");
            return (Criteria) this;
        }

        public Criteria andAttachFileIsNotNull() {
            addCriterion("ATTACH_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andAttachFileEqualTo(String value) {
            addCriterion("ATTACH_FILE =", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotEqualTo(String value) {
            addCriterion("ATTACH_FILE <>", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileGreaterThan(String value) {
            addCriterion("ATTACH_FILE >", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH_FILE >=", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileLessThan(String value) {
            addCriterion("ATTACH_FILE <", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileLessThanOrEqualTo(String value) {
            addCriterion("ATTACH_FILE <=", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileLike(String value) {
            addCriterion("ATTACH_FILE like", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotLike(String value) {
            addCriterion("ATTACH_FILE not like", value, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileIn(List<String> values) {
            addCriterion("ATTACH_FILE in", values, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotIn(List<String> values) {
            addCriterion("ATTACH_FILE not in", values, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileBetween(String value1, String value2) {
            addCriterion("ATTACH_FILE between", value1, value2, "attachFile");
            return (Criteria) this;
        }

        public Criteria andAttachFileNotBetween(String value1, String value2) {
            addCriterion("ATTACH_FILE not between", value1, value2, "attachFile");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNull() {
            addCriterion("RETURN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNotNull() {
            addCriterion("RETURN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeEqualTo(Long value) {
            addCriterion("RETURN_TYPE =", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotEqualTo(Long value) {
            addCriterion("RETURN_TYPE <>", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThan(Long value) {
            addCriterion("RETURN_TYPE >", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("RETURN_TYPE >=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThan(Long value) {
            addCriterion("RETURN_TYPE <", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThanOrEqualTo(Long value) {
            addCriterion("RETURN_TYPE <=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIn(List<Long> values) {
            addCriterion("RETURN_TYPE in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotIn(List<Long> values) {
            addCriterion("RETURN_TYPE not in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeBetween(Long value1, Long value2) {
            addCriterion("RETURN_TYPE between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotBetween(Long value1, Long value2) {
            addCriterion("RETURN_TYPE not between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andSeckillIdIsNull() {
            addCriterion("SECKILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeckillIdIsNotNull() {
            addCriterion("SECKILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillIdEqualTo(Long value) {
            addCriterion("SECKILL_ID =", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdNotEqualTo(Long value) {
            addCriterion("SECKILL_ID <>", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdGreaterThan(Long value) {
            addCriterion("SECKILL_ID >", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SECKILL_ID >=", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdLessThan(Long value) {
            addCriterion("SECKILL_ID <", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdLessThanOrEqualTo(Long value) {
            addCriterion("SECKILL_ID <=", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdIn(List<Long> values) {
            addCriterion("SECKILL_ID in", values, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdNotIn(List<Long> values) {
            addCriterion("SECKILL_ID not in", values, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdBetween(Long value1, Long value2) {
            addCriterion("SECKILL_ID between", value1, value2, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdNotBetween(Long value1, Long value2) {
            addCriterion("SECKILL_ID not between", value1, value2, "seckillId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("ORDER_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("ORDER_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(Short value) {
            addCriterion("ORDER_SOURCE =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(Short value) {
            addCriterion("ORDER_SOURCE <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(Short value) {
            addCriterion("ORDER_SOURCE >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_SOURCE >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(Short value) {
            addCriterion("ORDER_SOURCE <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_SOURCE <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<Short> values) {
            addCriterion("ORDER_SOURCE in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<Short> values) {
            addCriterion("ORDER_SOURCE not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(Short value1, Short value2) {
            addCriterion("ORDER_SOURCE between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_SOURCE not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderExt1IsNull() {
            addCriterion("ORDER_EXT1 is null");
            return (Criteria) this;
        }

        public Criteria andOrderExt1IsNotNull() {
            addCriterion("ORDER_EXT1 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExt1EqualTo(String value) {
            addCriterion("ORDER_EXT1 =", value, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt1NotEqualTo(String value) {
            addCriterion("ORDER_EXT1 <>", value, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt1GreaterThan(String value) {
            addCriterion("ORDER_EXT1 >", value, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_EXT1 >=", value, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt1LessThan(String value) {
            addCriterion("ORDER_EXT1 <", value, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt1LessThanOrEqualTo(String value) {
            addCriterion("ORDER_EXT1 <=", value, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt1Like(String value) {
            addCriterion("ORDER_EXT1 like", value, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt1NotLike(String value) {
            addCriterion("ORDER_EXT1 not like", value, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt1In(List<String> values) {
            addCriterion("ORDER_EXT1 in", values, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt1NotIn(List<String> values) {
            addCriterion("ORDER_EXT1 not in", values, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt1Between(String value1, String value2) {
            addCriterion("ORDER_EXT1 between", value1, value2, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt1NotBetween(String value1, String value2) {
            addCriterion("ORDER_EXT1 not between", value1, value2, "orderExt1");
            return (Criteria) this;
        }

        public Criteria andOrderExt2IsNull() {
            addCriterion("ORDER_EXT2 is null");
            return (Criteria) this;
        }

        public Criteria andOrderExt2IsNotNull() {
            addCriterion("ORDER_EXT2 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExt2EqualTo(String value) {
            addCriterion("ORDER_EXT2 =", value, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt2NotEqualTo(String value) {
            addCriterion("ORDER_EXT2 <>", value, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt2GreaterThan(String value) {
            addCriterion("ORDER_EXT2 >", value, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_EXT2 >=", value, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt2LessThan(String value) {
            addCriterion("ORDER_EXT2 <", value, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt2LessThanOrEqualTo(String value) {
            addCriterion("ORDER_EXT2 <=", value, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt2Like(String value) {
            addCriterion("ORDER_EXT2 like", value, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt2NotLike(String value) {
            addCriterion("ORDER_EXT2 not like", value, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt2In(List<String> values) {
            addCriterion("ORDER_EXT2 in", values, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt2NotIn(List<String> values) {
            addCriterion("ORDER_EXT2 not in", values, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt2Between(String value1, String value2) {
            addCriterion("ORDER_EXT2 between", value1, value2, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt2NotBetween(String value1, String value2) {
            addCriterion("ORDER_EXT2 not between", value1, value2, "orderExt2");
            return (Criteria) this;
        }

        public Criteria andOrderExt3IsNull() {
            addCriterion("ORDER_EXT3 is null");
            return (Criteria) this;
        }

        public Criteria andOrderExt3IsNotNull() {
            addCriterion("ORDER_EXT3 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExt3EqualTo(String value) {
            addCriterion("ORDER_EXT3 =", value, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt3NotEqualTo(String value) {
            addCriterion("ORDER_EXT3 <>", value, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt3GreaterThan(String value) {
            addCriterion("ORDER_EXT3 >", value, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_EXT3 >=", value, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt3LessThan(String value) {
            addCriterion("ORDER_EXT3 <", value, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt3LessThanOrEqualTo(String value) {
            addCriterion("ORDER_EXT3 <=", value, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt3Like(String value) {
            addCriterion("ORDER_EXT3 like", value, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt3NotLike(String value) {
            addCriterion("ORDER_EXT3 not like", value, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt3In(List<String> values) {
            addCriterion("ORDER_EXT3 in", values, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt3NotIn(List<String> values) {
            addCriterion("ORDER_EXT3 not in", values, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt3Between(String value1, String value2) {
            addCriterion("ORDER_EXT3 between", value1, value2, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt3NotBetween(String value1, String value2) {
            addCriterion("ORDER_EXT3 not between", value1, value2, "orderExt3");
            return (Criteria) this;
        }

        public Criteria andOrderExt4IsNull() {
            addCriterion("ORDER_EXT4 is null");
            return (Criteria) this;
        }

        public Criteria andOrderExt4IsNotNull() {
            addCriterion("ORDER_EXT4 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExt4EqualTo(String value) {
            addCriterion("ORDER_EXT4 =", value, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt4NotEqualTo(String value) {
            addCriterion("ORDER_EXT4 <>", value, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt4GreaterThan(String value) {
            addCriterion("ORDER_EXT4 >", value, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt4GreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_EXT4 >=", value, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt4LessThan(String value) {
            addCriterion("ORDER_EXT4 <", value, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt4LessThanOrEqualTo(String value) {
            addCriterion("ORDER_EXT4 <=", value, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt4Like(String value) {
            addCriterion("ORDER_EXT4 like", value, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt4NotLike(String value) {
            addCriterion("ORDER_EXT4 not like", value, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt4In(List<String> values) {
            addCriterion("ORDER_EXT4 in", values, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt4NotIn(List<String> values) {
            addCriterion("ORDER_EXT4 not in", values, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt4Between(String value1, String value2) {
            addCriterion("ORDER_EXT4 between", value1, value2, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt4NotBetween(String value1, String value2) {
            addCriterion("ORDER_EXT4 not between", value1, value2, "orderExt4");
            return (Criteria) this;
        }

        public Criteria andOrderExt5IsNull() {
            addCriterion("ORDER_EXT5 is null");
            return (Criteria) this;
        }

        public Criteria andOrderExt5IsNotNull() {
            addCriterion("ORDER_EXT5 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExt5EqualTo(String value) {
            addCriterion("ORDER_EXT5 =", value, "orderExt5");
            return (Criteria) this;
        }

        public Criteria andOrderExt5NotEqualTo(String value) {
            addCriterion("ORDER_EXT5 <>", value, "orderExt5");
            return (Criteria) this;
        }

        public Criteria andOrderExt5GreaterThan(String value) {
            addCriterion("ORDER_EXT5 >", value, "orderExt5");
            return (Criteria) this;
        }

        public Criteria andOrderExt5GreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_EXT5 >=", value, "orderExt5");
            return (Criteria) this;
        }

        public Criteria andOrderExt5LessThan(String value) {
            addCriterion("ORDER_EXT5 <", value, "orderExt5");
            return (Criteria) this;
        }

        public Criteria andOrderExt5LessThanOrEqualTo(String value) {
            addCriterion("ORDER_EXT5 <=", value, "orderExt5");
            return (Criteria) this;
        }

        public Criteria andOrderExt5Like(String value) {
            addCriterion("ORDER_EXT5 like", value, "orderExt5");
            return (Criteria) this;
        }

        public Criteria andOrderExt5NotLike(String value) {
            addCriterion("ORDER_EXT5 not like", value, "orderExt5");
            return (Criteria) this;
        }

        public Criteria andOrderExt5In(List<String> values) {
            addCriterion("ORDER_EXT5 in", values, "orderExt5");
            return (Criteria) this;
        }

        public Criteria andOrderExt5NotIn(List<String> values) {
            addCriterion("ORDER_EXT5 not in", values, "orderExt5");
            return (Criteria) this;
        }

        public Criteria andOrderExt5Between(String value1, String value2) {
            addCriterion("ORDER_EXT5 between", value1, value2, "orderExt5");
            return (Criteria) this;
        }

        public Criteria andOrderExt5NotBetween(String value1, String value2) {
            addCriterion("ORDER_EXT5 not between", value1, value2, "orderExt5");
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