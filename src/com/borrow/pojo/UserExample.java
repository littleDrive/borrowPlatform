package com.borrow.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andWechatIdIsNull() {
            addCriterion("wechat_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatIdIsNotNull() {
            addCriterion("wechat_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatIdEqualTo(String value) {
            addCriterion("wechat_id =", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotEqualTo(String value) {
            addCriterion("wechat_id <>", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThan(String value) {
            addCriterion("wechat_id >", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_id >=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThan(String value) {
            addCriterion("wechat_id <", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_id <=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLike(String value) {
            addCriterion("wechat_id like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotLike(String value) {
            addCriterion("wechat_id not like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdIn(List<String> values) {
            addCriterion("wechat_id in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotIn(List<String> values) {
            addCriterion("wechat_id not in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdBetween(String value1, String value2) {
            addCriterion("wechat_id between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotBetween(String value1, String value2) {
            addCriterion("wechat_id not between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andWgNumIsNull() {
            addCriterion("wg_num is null");
            return (Criteria) this;
        }

        public Criteria andWgNumIsNotNull() {
            addCriterion("wg_num is not null");
            return (Criteria) this;
        }

        public Criteria andWgNumEqualTo(Integer value) {
            addCriterion("wg_num =", value, "wgNum");
            return (Criteria) this;
        }

        public Criteria andWgNumNotEqualTo(Integer value) {
            addCriterion("wg_num <>", value, "wgNum");
            return (Criteria) this;
        }

        public Criteria andWgNumGreaterThan(Integer value) {
            addCriterion("wg_num >", value, "wgNum");
            return (Criteria) this;
        }

        public Criteria andWgNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("wg_num >=", value, "wgNum");
            return (Criteria) this;
        }

        public Criteria andWgNumLessThan(Integer value) {
            addCriterion("wg_num <", value, "wgNum");
            return (Criteria) this;
        }

        public Criteria andWgNumLessThanOrEqualTo(Integer value) {
            addCriterion("wg_num <=", value, "wgNum");
            return (Criteria) this;
        }

        public Criteria andWgNumIn(List<Integer> values) {
            addCriterion("wg_num in", values, "wgNum");
            return (Criteria) this;
        }

        public Criteria andWgNumNotIn(List<Integer> values) {
            addCriterion("wg_num not in", values, "wgNum");
            return (Criteria) this;
        }

        public Criteria andWgNumBetween(Integer value1, Integer value2) {
            addCriterion("wg_num between", value1, value2, "wgNum");
            return (Criteria) this;
        }

        public Criteria andWgNumNotBetween(Integer value1, Integer value2) {
            addCriterion("wg_num not between", value1, value2, "wgNum");
            return (Criteria) this;
        }

        public Criteria andCwgNumIsNull() {
            addCriterion("cwg_num is null");
            return (Criteria) this;
        }

        public Criteria andCwgNumIsNotNull() {
            addCriterion("cwg_num is not null");
            return (Criteria) this;
        }

        public Criteria andCwgNumEqualTo(Integer value) {
            addCriterion("cwg_num =", value, "cwgNum");
            return (Criteria) this;
        }

        public Criteria andCwgNumNotEqualTo(Integer value) {
            addCriterion("cwg_num <>", value, "cwgNum");
            return (Criteria) this;
        }

        public Criteria andCwgNumGreaterThan(Integer value) {
            addCriterion("cwg_num >", value, "cwgNum");
            return (Criteria) this;
        }

        public Criteria andCwgNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cwg_num >=", value, "cwgNum");
            return (Criteria) this;
        }

        public Criteria andCwgNumLessThan(Integer value) {
            addCriterion("cwg_num <", value, "cwgNum");
            return (Criteria) this;
        }

        public Criteria andCwgNumLessThanOrEqualTo(Integer value) {
            addCriterion("cwg_num <=", value, "cwgNum");
            return (Criteria) this;
        }

        public Criteria andCwgNumIn(List<Integer> values) {
            addCriterion("cwg_num in", values, "cwgNum");
            return (Criteria) this;
        }

        public Criteria andCwgNumNotIn(List<Integer> values) {
            addCriterion("cwg_num not in", values, "cwgNum");
            return (Criteria) this;
        }

        public Criteria andCwgNumBetween(Integer value1, Integer value2) {
            addCriterion("cwg_num between", value1, value2, "cwgNum");
            return (Criteria) this;
        }

        public Criteria andCwgNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cwg_num not between", value1, value2, "cwgNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumIsNull() {
            addCriterion("borrow_num is null");
            return (Criteria) this;
        }

        public Criteria andBorrowNumIsNotNull() {
            addCriterion("borrow_num is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowNumEqualTo(Integer value) {
            addCriterion("borrow_num =", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumNotEqualTo(Integer value) {
            addCriterion("borrow_num <>", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumGreaterThan(Integer value) {
            addCriterion("borrow_num >", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_num >=", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumLessThan(Integer value) {
            addCriterion("borrow_num <", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_num <=", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumIn(List<Integer> values) {
            addCriterion("borrow_num in", values, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumNotIn(List<Integer> values) {
            addCriterion("borrow_num not in", values, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumBetween(Integer value1, Integer value2) {
            addCriterion("borrow_num between", value1, value2, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_num not between", value1, value2, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumIsNull() {
            addCriterion("all_borrow_num is null");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumIsNotNull() {
            addCriterion("all_borrow_num is not null");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumEqualTo(Integer value) {
            addCriterion("all_borrow_num =", value, "allBorrowNum");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumNotEqualTo(Integer value) {
            addCriterion("all_borrow_num <>", value, "allBorrowNum");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumGreaterThan(Integer value) {
            addCriterion("all_borrow_num >", value, "allBorrowNum");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_borrow_num >=", value, "allBorrowNum");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumLessThan(Integer value) {
            addCriterion("all_borrow_num <", value, "allBorrowNum");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumLessThanOrEqualTo(Integer value) {
            addCriterion("all_borrow_num <=", value, "allBorrowNum");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumIn(List<Integer> values) {
            addCriterion("all_borrow_num in", values, "allBorrowNum");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumNotIn(List<Integer> values) {
            addCriterion("all_borrow_num not in", values, "allBorrowNum");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumBetween(Integer value1, Integer value2) {
            addCriterion("all_borrow_num between", value1, value2, "allBorrowNum");
            return (Criteria) this;
        }

        public Criteria andAllBorrowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("all_borrow_num not between", value1, value2, "allBorrowNum");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Byte value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Byte value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Byte value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Byte value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Byte value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Byte value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Byte> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Byte> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Byte value1, Byte value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Byte value1, Byte value2) {
            addCriterion("credit not between", value1, value2, "credit");
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