package com.wjw.ecps.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TsPtlUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TsPtlUserExample() {
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

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Short value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Short value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Short value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Short value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Short value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Short value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Short> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Short> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Short value1, Short value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Short value1, Short value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NICKNAME like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("REAL_NAME =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("REAL_NAME <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("REAL_NAME >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_NAME >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("REAL_NAME <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("REAL_NAME <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("REAL_NAME like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("REAL_NAME not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("REAL_NAME in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("REAL_NAME not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("REAL_NAME between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("REAL_NAME not between", value1, value2, "realName");
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

        public Criteria andResiProvIsNull() {
            addCriterion("RESI_PROV is null");
            return (Criteria) this;
        }

        public Criteria andResiProvIsNotNull() {
            addCriterion("RESI_PROV is not null");
            return (Criteria) this;
        }

        public Criteria andResiProvEqualTo(String value) {
            addCriterion("RESI_PROV =", value, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiProvNotEqualTo(String value) {
            addCriterion("RESI_PROV <>", value, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiProvGreaterThan(String value) {
            addCriterion("RESI_PROV >", value, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiProvGreaterThanOrEqualTo(String value) {
            addCriterion("RESI_PROV >=", value, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiProvLessThan(String value) {
            addCriterion("RESI_PROV <", value, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiProvLessThanOrEqualTo(String value) {
            addCriterion("RESI_PROV <=", value, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiProvLike(String value) {
            addCriterion("RESI_PROV like", value, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiProvNotLike(String value) {
            addCriterion("RESI_PROV not like", value, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiProvIn(List<String> values) {
            addCriterion("RESI_PROV in", values, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiProvNotIn(List<String> values) {
            addCriterion("RESI_PROV not in", values, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiProvBetween(String value1, String value2) {
            addCriterion("RESI_PROV between", value1, value2, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiProvNotBetween(String value1, String value2) {
            addCriterion("RESI_PROV not between", value1, value2, "resiProv");
            return (Criteria) this;
        }

        public Criteria andResiCityIsNull() {
            addCriterion("RESI_CITY is null");
            return (Criteria) this;
        }

        public Criteria andResiCityIsNotNull() {
            addCriterion("RESI_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andResiCityEqualTo(String value) {
            addCriterion("RESI_CITY =", value, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiCityNotEqualTo(String value) {
            addCriterion("RESI_CITY <>", value, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiCityGreaterThan(String value) {
            addCriterion("RESI_CITY >", value, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiCityGreaterThanOrEqualTo(String value) {
            addCriterion("RESI_CITY >=", value, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiCityLessThan(String value) {
            addCriterion("RESI_CITY <", value, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiCityLessThanOrEqualTo(String value) {
            addCriterion("RESI_CITY <=", value, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiCityLike(String value) {
            addCriterion("RESI_CITY like", value, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiCityNotLike(String value) {
            addCriterion("RESI_CITY not like", value, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiCityIn(List<String> values) {
            addCriterion("RESI_CITY in", values, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiCityNotIn(List<String> values) {
            addCriterion("RESI_CITY not in", values, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiCityBetween(String value1, String value2) {
            addCriterion("RESI_CITY between", value1, value2, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiCityNotBetween(String value1, String value2) {
            addCriterion("RESI_CITY not between", value1, value2, "resiCity");
            return (Criteria) this;
        }

        public Criteria andResiDistIsNull() {
            addCriterion("RESI_DIST is null");
            return (Criteria) this;
        }

        public Criteria andResiDistIsNotNull() {
            addCriterion("RESI_DIST is not null");
            return (Criteria) this;
        }

        public Criteria andResiDistEqualTo(String value) {
            addCriterion("RESI_DIST =", value, "resiDist");
            return (Criteria) this;
        }

        public Criteria andResiDistNotEqualTo(String value) {
            addCriterion("RESI_DIST <>", value, "resiDist");
            return (Criteria) this;
        }

        public Criteria andResiDistGreaterThan(String value) {
            addCriterion("RESI_DIST >", value, "resiDist");
            return (Criteria) this;
        }

        public Criteria andResiDistGreaterThanOrEqualTo(String value) {
            addCriterion("RESI_DIST >=", value, "resiDist");
            return (Criteria) this;
        }

        public Criteria andResiDistLessThan(String value) {
            addCriterion("RESI_DIST <", value, "resiDist");
            return (Criteria) this;
        }

        public Criteria andResiDistLessThanOrEqualTo(String value) {
            addCriterion("RESI_DIST <=", value, "resiDist");
            return (Criteria) this;
        }

        public Criteria andResiDistLike(String value) {
            addCriterion("RESI_DIST like", value, "resiDist");
            return (Criteria) this;
        }

        public Criteria andResiDistNotLike(String value) {
            addCriterion("RESI_DIST not like", value, "resiDist");
            return (Criteria) this;
        }

        public Criteria andResiDistIn(List<String> values) {
            addCriterion("RESI_DIST in", values, "resiDist");
            return (Criteria) this;
        }

        public Criteria andResiDistNotIn(List<String> values) {
            addCriterion("RESI_DIST not in", values, "resiDist");
            return (Criteria) this;
        }

        public Criteria andResiDistBetween(String value1, String value2) {
            addCriterion("RESI_DIST between", value1, value2, "resiDist");
            return (Criteria) this;
        }

        public Criteria andResiDistNotBetween(String value1, String value2) {
            addCriterion("RESI_DIST not between", value1, value2, "resiDist");
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

        public Criteria andZipCodeIsNull() {
            addCriterion("ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(Integer value) {
            addCriterion("ZIP_CODE =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(Integer value) {
            addCriterion("ZIP_CODE <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(Integer value) {
            addCriterion("ZIP_CODE >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZIP_CODE >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(Integer value) {
            addCriterion("ZIP_CODE <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(Integer value) {
            addCriterion("ZIP_CODE <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<Integer> values) {
            addCriterion("ZIP_CODE in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<Integer> values) {
            addCriterion("ZIP_CODE not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(Integer value1, Integer value2) {
            addCriterion("ZIP_CODE between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ZIP_CODE not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("LOGIN_TIME =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("LOGIN_TIME <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("LOGIN_TIME >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGIN_TIME >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("LOGIN_TIME <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOGIN_TIME <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("LOGIN_TIME in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("LOGIN_TIME not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("LOGIN_TIME between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOGIN_TIME not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("GROUP_ID =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("GROUP_ID <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("GROUP_ID >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GROUP_ID >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("GROUP_ID <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("GROUP_ID <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("GROUP_ID in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("GROUP_ID not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("GROUP_ID between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("GROUP_ID not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andQqNumIsNull() {
            addCriterion("QQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andQqNumIsNotNull() {
            addCriterion("QQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andQqNumEqualTo(String value) {
            addCriterion("QQ_NUM =", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumNotEqualTo(String value) {
            addCriterion("QQ_NUM <>", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumGreaterThan(String value) {
            addCriterion("QQ_NUM >", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumGreaterThanOrEqualTo(String value) {
            addCriterion("QQ_NUM >=", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumLessThan(String value) {
            addCriterion("QQ_NUM <", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumLessThanOrEqualTo(String value) {
            addCriterion("QQ_NUM <=", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumLike(String value) {
            addCriterion("QQ_NUM like", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumNotLike(String value) {
            addCriterion("QQ_NUM not like", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumIn(List<String> values) {
            addCriterion("QQ_NUM in", values, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumNotIn(List<String> values) {
            addCriterion("QQ_NUM not in", values, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumBetween(String value1, String value2) {
            addCriterion("QQ_NUM between", value1, value2, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumNotBetween(String value1, String value2) {
            addCriterion("QQ_NUM not between", value1, value2, "qqNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumIsNull() {
            addCriterion("MSN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andMsnNumIsNotNull() {
            addCriterion("MSN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andMsnNumEqualTo(String value) {
            addCriterion("MSN_NUM =", value, "msnNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumNotEqualTo(String value) {
            addCriterion("MSN_NUM <>", value, "msnNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumGreaterThan(String value) {
            addCriterion("MSN_NUM >", value, "msnNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumGreaterThanOrEqualTo(String value) {
            addCriterion("MSN_NUM >=", value, "msnNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumLessThan(String value) {
            addCriterion("MSN_NUM <", value, "msnNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumLessThanOrEqualTo(String value) {
            addCriterion("MSN_NUM <=", value, "msnNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumLike(String value) {
            addCriterion("MSN_NUM like", value, "msnNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumNotLike(String value) {
            addCriterion("MSN_NUM not like", value, "msnNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumIn(List<String> values) {
            addCriterion("MSN_NUM in", values, "msnNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumNotIn(List<String> values) {
            addCriterion("MSN_NUM not in", values, "msnNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumBetween(String value1, String value2) {
            addCriterion("MSN_NUM between", value1, value2, "msnNum");
            return (Criteria) this;
        }

        public Criteria andMsnNumNotBetween(String value1, String value2) {
            addCriterion("MSN_NUM not between", value1, value2, "msnNum");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNull() {
            addCriterion("CELLPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNotNull() {
            addCriterion("CELLPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCellphoneEqualTo(String value) {
            addCriterion("CELLPHONE =", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotEqualTo(String value) {
            addCriterion("CELLPHONE <>", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThan(String value) {
            addCriterion("CELLPHONE >", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CELLPHONE >=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThan(String value) {
            addCriterion("CELLPHONE <", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThanOrEqualTo(String value) {
            addCriterion("CELLPHONE <=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLike(String value) {
            addCriterion("CELLPHONE like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotLike(String value) {
            addCriterion("CELLPHONE not like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneIn(List<String> values) {
            addCriterion("CELLPHONE in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotIn(List<String> values) {
            addCriterion("CELLPHONE not in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneBetween(String value1, String value2) {
            addCriterion("CELLPHONE between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotBetween(String value1, String value2) {
            addCriterion("CELLPHONE not between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andIntroInfoIsNull() {
            addCriterion("INTRO_INFO is null");
            return (Criteria) this;
        }

        public Criteria andIntroInfoIsNotNull() {
            addCriterion("INTRO_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andIntroInfoEqualTo(String value) {
            addCriterion("INTRO_INFO =", value, "introInfo");
            return (Criteria) this;
        }

        public Criteria andIntroInfoNotEqualTo(String value) {
            addCriterion("INTRO_INFO <>", value, "introInfo");
            return (Criteria) this;
        }

        public Criteria andIntroInfoGreaterThan(String value) {
            addCriterion("INTRO_INFO >", value, "introInfo");
            return (Criteria) this;
        }

        public Criteria andIntroInfoGreaterThanOrEqualTo(String value) {
            addCriterion("INTRO_INFO >=", value, "introInfo");
            return (Criteria) this;
        }

        public Criteria andIntroInfoLessThan(String value) {
            addCriterion("INTRO_INFO <", value, "introInfo");
            return (Criteria) this;
        }

        public Criteria andIntroInfoLessThanOrEqualTo(String value) {
            addCriterion("INTRO_INFO <=", value, "introInfo");
            return (Criteria) this;
        }

        public Criteria andIntroInfoLike(String value) {
            addCriterion("INTRO_INFO like", value, "introInfo");
            return (Criteria) this;
        }

        public Criteria andIntroInfoNotLike(String value) {
            addCriterion("INTRO_INFO not like", value, "introInfo");
            return (Criteria) this;
        }

        public Criteria andIntroInfoIn(List<String> values) {
            addCriterion("INTRO_INFO in", values, "introInfo");
            return (Criteria) this;
        }

        public Criteria andIntroInfoNotIn(List<String> values) {
            addCriterion("INTRO_INFO not in", values, "introInfo");
            return (Criteria) this;
        }

        public Criteria andIntroInfoBetween(String value1, String value2) {
            addCriterion("INTRO_INFO between", value1, value2, "introInfo");
            return (Criteria) this;
        }

        public Criteria andIntroInfoNotBetween(String value1, String value2) {
            addCriterion("INTRO_INFO not between", value1, value2, "introInfo");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNull() {
            addCriterion("LOGIN_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("LOGIN_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Long value) {
            addCriterion("LOGIN_COUNT =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Long value) {
            addCriterion("LOGIN_COUNT <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Long value) {
            addCriterion("LOGIN_COUNT >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Long value) {
            addCriterion("LOGIN_COUNT >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Long value) {
            addCriterion("LOGIN_COUNT <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Long value) {
            addCriterion("LOGIN_COUNT <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Long> values) {
            addCriterion("LOGIN_COUNT in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Long> values) {
            addCriterion("LOGIN_COUNT not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Long value1, Long value2) {
            addCriterion("LOGIN_COUNT between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Long value1, Long value2) {
            addCriterion("LOGIN_COUNT not between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("REGISTER_TIME =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("REGISTER_TIME <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("REGISTER_TIME >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTER_TIME >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("REGISTER_TIME <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("REGISTER_TIME <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("REGISTER_TIME in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("REGISTER_TIME not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("REGISTER_TIME between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("REGISTER_TIME not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientIsNull() {
            addCriterion("IS_MOBILE_CLIENT is null");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientIsNotNull() {
            addCriterion("IS_MOBILE_CLIENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientEqualTo(Short value) {
            addCriterion("IS_MOBILE_CLIENT =", value, "isMobileClient");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientNotEqualTo(Short value) {
            addCriterion("IS_MOBILE_CLIENT <>", value, "isMobileClient");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientGreaterThan(Short value) {
            addCriterion("IS_MOBILE_CLIENT >", value, "isMobileClient");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_MOBILE_CLIENT >=", value, "isMobileClient");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientLessThan(Short value) {
            addCriterion("IS_MOBILE_CLIENT <", value, "isMobileClient");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientLessThanOrEqualTo(Short value) {
            addCriterion("IS_MOBILE_CLIENT <=", value, "isMobileClient");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientIn(List<Short> values) {
            addCriterion("IS_MOBILE_CLIENT in", values, "isMobileClient");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientNotIn(List<Short> values) {
            addCriterion("IS_MOBILE_CLIENT not in", values, "isMobileClient");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientBetween(Short value1, Short value2) {
            addCriterion("IS_MOBILE_CLIENT between", value1, value2, "isMobileClient");
            return (Criteria) this;
        }

        public Criteria andIsMobileClientNotBetween(Short value1, Short value2) {
            addCriterion("IS_MOBILE_CLIENT not between", value1, value2, "isMobileClient");
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