package com.borrow.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WishGoodsStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WishGoodsStatusExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andImplementorIsNull() {
            addCriterion("implementor is null");
            return (Criteria) this;
        }

        public Criteria andImplementorIsNotNull() {
            addCriterion("implementor is not null");
            return (Criteria) this;
        }

        public Criteria andImplementorEqualTo(String value) {
            addCriterion("implementor =", value, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorNotEqualTo(String value) {
            addCriterion("implementor <>", value, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorGreaterThan(String value) {
            addCriterion("implementor >", value, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorGreaterThanOrEqualTo(String value) {
            addCriterion("implementor >=", value, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorLessThan(String value) {
            addCriterion("implementor <", value, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorLessThanOrEqualTo(String value) {
            addCriterion("implementor <=", value, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorLike(String value) {
            addCriterion("implementor like", value, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorNotLike(String value) {
            addCriterion("implementor not like", value, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorIn(List<String> values) {
            addCriterion("implementor in", values, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorNotIn(List<String> values) {
            addCriterion("implementor not in", values, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorBetween(String value1, String value2) {
            addCriterion("implementor between", value1, value2, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorNotBetween(String value1, String value2) {
            addCriterion("implementor not between", value1, value2, "implementor");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeIsNull() {
            addCriterion("implementor_time is null");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeIsNotNull() {
            addCriterion("implementor_time is not null");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeEqualTo(Date value) {
            addCriterion("implementor_time =", value, "implementorTime");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeNotEqualTo(Date value) {
            addCriterion("implementor_time <>", value, "implementorTime");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeGreaterThan(Date value) {
            addCriterion("implementor_time >", value, "implementorTime");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("implementor_time >=", value, "implementorTime");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeLessThan(Date value) {
            addCriterion("implementor_time <", value, "implementorTime");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeLessThanOrEqualTo(Date value) {
            addCriterion("implementor_time <=", value, "implementorTime");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeIn(List<Date> values) {
            addCriterion("implementor_time in", values, "implementorTime");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeNotIn(List<Date> values) {
            addCriterion("implementor_time not in", values, "implementorTime");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeBetween(Date value1, Date value2) {
            addCriterion("implementor_time between", value1, value2, "implementorTime");
            return (Criteria) this;
        }

        public Criteria andImplementorTimeNotBetween(Date value1, Date value2) {
            addCriterion("implementor_time not between", value1, value2, "implementorTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIsNull() {
            addCriterion("limit_time is null");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIsNotNull() {
            addCriterion("limit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTimeEqualTo(Date value) {
            addCriterion("limit_time =", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotEqualTo(Date value) {
            addCriterion("limit_time <>", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThan(Date value) {
            addCriterion("limit_time >", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("limit_time >=", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThan(Date value) {
            addCriterion("limit_time <", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThanOrEqualTo(Date value) {
            addCriterion("limit_time <=", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIn(List<Date> values) {
            addCriterion("limit_time in", values, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotIn(List<Date> values) {
            addCriterion("limit_time not in", values, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeBetween(Date value1, Date value2) {
            addCriterion("limit_time between", value1, value2, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotBetween(Date value1, Date value2) {
            addCriterion("limit_time not between", value1, value2, "limitTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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