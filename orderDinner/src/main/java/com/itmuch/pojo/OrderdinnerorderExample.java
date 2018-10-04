package com.itmuch.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderdinnerorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderdinnerorderExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFoodidIsNull() {
            addCriterion("foodId is null");
            return (Criteria) this;
        }

        public Criteria andFoodidIsNotNull() {
            addCriterion("foodId is not null");
            return (Criteria) this;
        }

        public Criteria andFoodidEqualTo(String value) {
            addCriterion("foodId =", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidNotEqualTo(String value) {
            addCriterion("foodId <>", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidGreaterThan(String value) {
            addCriterion("foodId >", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidGreaterThanOrEqualTo(String value) {
            addCriterion("foodId >=", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidLessThan(String value) {
            addCriterion("foodId <", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidLessThanOrEqualTo(String value) {
            addCriterion("foodId <=", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidLike(String value) {
            addCriterion("foodId like", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidNotLike(String value) {
            addCriterion("foodId not like", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidIn(List<String> values) {
            addCriterion("foodId in", values, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidNotIn(List<String> values) {
            addCriterion("foodId not in", values, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidBetween(String value1, String value2) {
            addCriterion("foodId between", value1, value2, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidNotBetween(String value1, String value2) {
            addCriterion("foodId not between", value1, value2, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodnumIsNull() {
            addCriterion("foodNum is null");
            return (Criteria) this;
        }

        public Criteria andFoodnumIsNotNull() {
            addCriterion("foodNum is not null");
            return (Criteria) this;
        }

        public Criteria andFoodnumEqualTo(Integer value) {
            addCriterion("foodNum =", value, "foodnum");
            return (Criteria) this;
        }

        public Criteria andFoodnumNotEqualTo(Integer value) {
            addCriterion("foodNum <>", value, "foodnum");
            return (Criteria) this;
        }

        public Criteria andFoodnumGreaterThan(Integer value) {
            addCriterion("foodNum >", value, "foodnum");
            return (Criteria) this;
        }

        public Criteria andFoodnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodNum >=", value, "foodnum");
            return (Criteria) this;
        }

        public Criteria andFoodnumLessThan(Integer value) {
            addCriterion("foodNum <", value, "foodnum");
            return (Criteria) this;
        }

        public Criteria andFoodnumLessThanOrEqualTo(Integer value) {
            addCriterion("foodNum <=", value, "foodnum");
            return (Criteria) this;
        }

        public Criteria andFoodnumIn(List<Integer> values) {
            addCriterion("foodNum in", values, "foodnum");
            return (Criteria) this;
        }

        public Criteria andFoodnumNotIn(List<Integer> values) {
            addCriterion("foodNum not in", values, "foodnum");
            return (Criteria) this;
        }

        public Criteria andFoodnumBetween(Integer value1, Integer value2) {
            addCriterion("foodNum between", value1, value2, "foodnum");
            return (Criteria) this;
        }

        public Criteria andFoodnumNotBetween(Integer value1, Integer value2) {
            addCriterion("foodNum not between", value1, value2, "foodnum");
            return (Criteria) this;
        }

        public Criteria andAllpriceIsNull() {
            addCriterion("allPrice is null");
            return (Criteria) this;
        }

        public Criteria andAllpriceIsNotNull() {
            addCriterion("allPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAllpriceEqualTo(BigDecimal value) {
            addCriterion("allPrice =", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotEqualTo(BigDecimal value) {
            addCriterion("allPrice <>", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceGreaterThan(BigDecimal value) {
            addCriterion("allPrice >", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("allPrice >=", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceLessThan(BigDecimal value) {
            addCriterion("allPrice <", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("allPrice <=", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceIn(List<BigDecimal> values) {
            addCriterion("allPrice in", values, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotIn(List<BigDecimal> values) {
            addCriterion("allPrice not in", values, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allPrice between", value1, value2, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allPrice not between", value1, value2, "allprice");
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