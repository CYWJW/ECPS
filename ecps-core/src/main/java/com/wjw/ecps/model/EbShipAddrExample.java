package com.wjw.ecps.model;

import java.util.ArrayList;
import java.util.List;

public class EbShipAddrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbShipAddrExample() {
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

        public Criteria andShipAddrIdIsNull() {
            addCriterion("SHIP_ADDR_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipAddrIdIsNotNull() {
            addCriterion("SHIP_ADDR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipAddrIdEqualTo(Long value) {
            addCriterion("SHIP_ADDR_ID =", value, "shipAddrId");
            return (Criteria) this;
        }

        public Criteria andShipAddrIdNotEqualTo(Long value) {
            addCriterion("SHIP_ADDR_ID <>", value, "shipAddrId");
            return (Criteria) this;
        }

        public Criteria andShipAddrIdGreaterThan(Long value) {
            addCriterion("SHIP_ADDR_ID >", value, "shipAddrId");
            return (Criteria) this;
        }

        public Criteria andShipAddrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHIP_ADDR_ID >=", value, "shipAddrId");
            return (Criteria) this;
        }

        public Criteria andShipAddrIdLessThan(Long value) {
            addCriterion("SHIP_ADDR_ID <", value, "shipAddrId");
            return (Criteria) this;
        }

        public Criteria andShipAddrIdLessThanOrEqualTo(Long value) {
            addCriterion("SHIP_ADDR_ID <=", value, "shipAddrId");
            return (Criteria) this;
        }

        public Criteria andShipAddrIdIn(List<Long> values) {
            addCriterion("SHIP_ADDR_ID in", values, "shipAddrId");
            return (Criteria) this;
        }

        public Criteria andShipAddrIdNotIn(List<Long> values) {
            addCriterion("SHIP_ADDR_ID not in", values, "shipAddrId");
            return (Criteria) this;
        }

        public Criteria andShipAddrIdBetween(Long value1, Long value2) {
            addCriterion("SHIP_ADDR_ID between", value1, value2, "shipAddrId");
            return (Criteria) this;
        }

        public Criteria andShipAddrIdNotBetween(Long value1, Long value2) {
            addCriterion("SHIP_ADDR_ID not between", value1, value2, "shipAddrId");
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

        public Criteria andDefaultAddrIsNull() {
            addCriterion("DEFAULT_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andDefaultAddrIsNotNull() {
            addCriterion("DEFAULT_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultAddrEqualTo(Short value) {
            addCriterion("DEFAULT_ADDR =", value, "defaultAddr");
            return (Criteria) this;
        }

        public Criteria andDefaultAddrNotEqualTo(Short value) {
            addCriterion("DEFAULT_ADDR <>", value, "defaultAddr");
            return (Criteria) this;
        }

        public Criteria andDefaultAddrGreaterThan(Short value) {
            addCriterion("DEFAULT_ADDR >", value, "defaultAddr");
            return (Criteria) this;
        }

        public Criteria andDefaultAddrGreaterThanOrEqualTo(Short value) {
            addCriterion("DEFAULT_ADDR >=", value, "defaultAddr");
            return (Criteria) this;
        }

        public Criteria andDefaultAddrLessThan(Short value) {
            addCriterion("DEFAULT_ADDR <", value, "defaultAddr");
            return (Criteria) this;
        }

        public Criteria andDefaultAddrLessThanOrEqualTo(Short value) {
            addCriterion("DEFAULT_ADDR <=", value, "defaultAddr");
            return (Criteria) this;
        }

        public Criteria andDefaultAddrIn(List<Short> values) {
            addCriterion("DEFAULT_ADDR in", values, "defaultAddr");
            return (Criteria) this;
        }

        public Criteria andDefaultAddrNotIn(List<Short> values) {
            addCriterion("DEFAULT_ADDR not in", values, "defaultAddr");
            return (Criteria) this;
        }

        public Criteria andDefaultAddrBetween(Short value1, Short value2) {
            addCriterion("DEFAULT_ADDR between", value1, value2, "defaultAddr");
            return (Criteria) this;
        }

        public Criteria andDefaultAddrNotBetween(Short value1, Short value2) {
            addCriterion("DEFAULT_ADDR not between", value1, value2, "defaultAddr");
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