package com.itmuch.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderdinnerbusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderdinnerbusinessExample() {
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

        public Criteria andBusinessidIsNull() {
            addCriterion("businessId is null");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNotNull() {
            addCriterion("businessId is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessidEqualTo(String value) {
            addCriterion("businessId =", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotEqualTo(String value) {
            addCriterion("businessId <>", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThan(String value) {
            addCriterion("businessId >", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThanOrEqualTo(String value) {
            addCriterion("businessId >=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThan(String value) {
            addCriterion("businessId <", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThanOrEqualTo(String value) {
            addCriterion("businessId <=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLike(String value) {
            addCriterion("businessId like", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotLike(String value) {
            addCriterion("businessId not like", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidIn(List<String> values) {
            addCriterion("businessId in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotIn(List<String> values) {
            addCriterion("businessId not in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidBetween(String value1, String value2) {
            addCriterion("businessId between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotBetween(String value1, String value2) {
            addCriterion("businessId not between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNull() {
            addCriterion("businessName is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNotNull() {
            addCriterion("businessName is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameEqualTo(String value) {
            addCriterion("businessName =", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotEqualTo(String value) {
            addCriterion("businessName <>", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThan(String value) {
            addCriterion("businessName >", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThanOrEqualTo(String value) {
            addCriterion("businessName >=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThan(String value) {
            addCriterion("businessName <", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThanOrEqualTo(String value) {
            addCriterion("businessName <=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLike(String value) {
            addCriterion("businessName like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotLike(String value) {
            addCriterion("businessName not like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIn(List<String> values) {
            addCriterion("businessName in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotIn(List<String> values) {
            addCriterion("businessName not in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameBetween(String value1, String value2) {
            addCriterion("businessName between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotBetween(String value1, String value2) {
            addCriterion("businessName not between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIsNull() {
            addCriterion("businessAddress is null");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIsNotNull() {
            addCriterion("businessAddress is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressEqualTo(String value) {
            addCriterion("businessAddress =", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotEqualTo(String value) {
            addCriterion("businessAddress <>", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressGreaterThan(String value) {
            addCriterion("businessAddress >", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressGreaterThanOrEqualTo(String value) {
            addCriterion("businessAddress >=", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLessThan(String value) {
            addCriterion("businessAddress <", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLessThanOrEqualTo(String value) {
            addCriterion("businessAddress <=", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLike(String value) {
            addCriterion("businessAddress like", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotLike(String value) {
            addCriterion("businessAddress not like", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIn(List<String> values) {
            addCriterion("businessAddress in", values, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotIn(List<String> values) {
            addCriterion("businessAddress not in", values, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressBetween(String value1, String value2) {
            addCriterion("businessAddress between", value1, value2, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotBetween(String value1, String value2) {
            addCriterion("businessAddress not between", value1, value2, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneIsNull() {
            addCriterion("businessPhone is null");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneIsNotNull() {
            addCriterion("businessPhone is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneEqualTo(String value) {
            addCriterion("businessPhone =", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotEqualTo(String value) {
            addCriterion("businessPhone <>", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneGreaterThan(String value) {
            addCriterion("businessPhone >", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneGreaterThanOrEqualTo(String value) {
            addCriterion("businessPhone >=", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneLessThan(String value) {
            addCriterion("businessPhone <", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneLessThanOrEqualTo(String value) {
            addCriterion("businessPhone <=", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneLike(String value) {
            addCriterion("businessPhone like", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotLike(String value) {
            addCriterion("businessPhone not like", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneIn(List<String> values) {
            addCriterion("businessPhone in", values, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotIn(List<String> values) {
            addCriterion("businessPhone not in", values, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneBetween(String value1, String value2) {
            addCriterion("businessPhone between", value1, value2, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotBetween(String value1, String value2) {
            addCriterion("businessPhone not between", value1, value2, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleIsNull() {
            addCriterion("businessPepole is null");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleIsNotNull() {
            addCriterion("businessPepole is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleEqualTo(String value) {
            addCriterion("businessPepole =", value, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleNotEqualTo(String value) {
            addCriterion("businessPepole <>", value, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleGreaterThan(String value) {
            addCriterion("businessPepole >", value, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleGreaterThanOrEqualTo(String value) {
            addCriterion("businessPepole >=", value, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleLessThan(String value) {
            addCriterion("businessPepole <", value, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleLessThanOrEqualTo(String value) {
            addCriterion("businessPepole <=", value, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleLike(String value) {
            addCriterion("businessPepole like", value, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleNotLike(String value) {
            addCriterion("businessPepole not like", value, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleIn(List<String> values) {
            addCriterion("businessPepole in", values, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleNotIn(List<String> values) {
            addCriterion("businessPepole not in", values, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleBetween(String value1, String value2) {
            addCriterion("businessPepole between", value1, value2, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andBusinesspepoleNotBetween(String value1, String value2) {
            addCriterion("businessPepole not between", value1, value2, "businesspepole");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("cTime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("cTime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("cTime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("cTime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("cTime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cTime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("cTime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("cTime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("cTime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("cTime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("cTime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("cTime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCuserIsNull() {
            addCriterion("cUser is null");
            return (Criteria) this;
        }

        public Criteria andCuserIsNotNull() {
            addCriterion("cUser is not null");
            return (Criteria) this;
        }

        public Criteria andCuserEqualTo(String value) {
            addCriterion("cUser =", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotEqualTo(String value) {
            addCriterion("cUser <>", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserGreaterThan(String value) {
            addCriterion("cUser >", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserGreaterThanOrEqualTo(String value) {
            addCriterion("cUser >=", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserLessThan(String value) {
            addCriterion("cUser <", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserLessThanOrEqualTo(String value) {
            addCriterion("cUser <=", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserLike(String value) {
            addCriterion("cUser like", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotLike(String value) {
            addCriterion("cUser not like", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserIn(List<String> values) {
            addCriterion("cUser in", values, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotIn(List<String> values) {
            addCriterion("cUser not in", values, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserBetween(String value1, String value2) {
            addCriterion("cUser between", value1, value2, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotBetween(String value1, String value2) {
            addCriterion("cUser not between", value1, value2, "cuser");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("uTime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("uTime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion("uTime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion("uTime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion("uTime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uTime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion("uTime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion("uTime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion("uTime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion("uTime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion("uTime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion("uTime not between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUuserIsNull() {
            addCriterion("uUser is null");
            return (Criteria) this;
        }

        public Criteria andUuserIsNotNull() {
            addCriterion("uUser is not null");
            return (Criteria) this;
        }

        public Criteria andUuserEqualTo(String value) {
            addCriterion("uUser =", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserNotEqualTo(String value) {
            addCriterion("uUser <>", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserGreaterThan(String value) {
            addCriterion("uUser >", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserGreaterThanOrEqualTo(String value) {
            addCriterion("uUser >=", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserLessThan(String value) {
            addCriterion("uUser <", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserLessThanOrEqualTo(String value) {
            addCriterion("uUser <=", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserLike(String value) {
            addCriterion("uUser like", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserNotLike(String value) {
            addCriterion("uUser not like", value, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserIn(List<String> values) {
            addCriterion("uUser in", values, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserNotIn(List<String> values) {
            addCriterion("uUser not in", values, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserBetween(String value1, String value2) {
            addCriterion("uUser between", value1, value2, "uuser");
            return (Criteria) this;
        }

        public Criteria andUuserNotBetween(String value1, String value2) {
            addCriterion("uUser not between", value1, value2, "uuser");
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