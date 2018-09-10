package com.zzuli.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MoneyInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneyInExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andInIdIsNull() {
            addCriterion("in_id is null");
            return (Criteria) this;
        }

        public Criteria andInIdIsNotNull() {
            addCriterion("in_id is not null");
            return (Criteria) this;
        }

        public Criteria andInIdEqualTo(Integer value) {
            addCriterion("in_id =", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotEqualTo(Integer value) {
            addCriterion("in_id <>", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdGreaterThan(Integer value) {
            addCriterion("in_id >", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_id >=", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdLessThan(Integer value) {
            addCriterion("in_id <", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdLessThanOrEqualTo(Integer value) {
            addCriterion("in_id <=", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdIn(List<Integer> values) {
            addCriterion("in_id in", values, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotIn(List<Integer> values) {
            addCriterion("in_id not in", values, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdBetween(Integer value1, Integer value2) {
            addCriterion("in_id between", value1, value2, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotBetween(Integer value1, Integer value2) {
            addCriterion("in_id not between", value1, value2, "inId");
            return (Criteria) this;
        }

        public Criteria andInMoneyIsNull() {
            addCriterion("in_money is null");
            return (Criteria) this;
        }

        public Criteria andInMoneyIsNotNull() {
            addCriterion("in_money is not null");
            return (Criteria) this;
        }

        public Criteria andInMoneyEqualTo(String value) {
            addCriterion("in_money =", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyNotEqualTo(String value) {
            addCriterion("in_money <>", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyGreaterThan(String value) {
            addCriterion("in_money >", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("in_money >=", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyLessThan(String value) {
            addCriterion("in_money <", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyLessThanOrEqualTo(String value) {
            addCriterion("in_money <=", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyLike(String value) {
            addCriterion("in_money like", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyNotLike(String value) {
            addCriterion("in_money not like", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyIn(List<String> values) {
            addCriterion("in_money in", values, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyNotIn(List<String> values) {
            addCriterion("in_money not in", values, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyBetween(String value1, String value2) {
            addCriterion("in_money between", value1, value2, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyNotBetween(String value1, String value2) {
            addCriterion("in_money not between", value1, value2, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNull() {
            addCriterion("in_time is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("in_time is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(Date value) {
            addCriterionForJDBCDate("in_time =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("in_time <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("in_time >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("in_time >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(Date value) {
            addCriterionForJDBCDate("in_time <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("in_time <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<Date> values) {
            addCriterionForJDBCDate("in_time in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("in_time not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("in_time between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("in_time not between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInMemoIsNull() {
            addCriterion("in_memo is null");
            return (Criteria) this;
        }

        public Criteria andInMemoIsNotNull() {
            addCriterion("in_memo is not null");
            return (Criteria) this;
        }

        public Criteria andInMemoEqualTo(String value) {
            addCriterion("in_memo =", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoNotEqualTo(String value) {
            addCriterion("in_memo <>", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoGreaterThan(String value) {
            addCriterion("in_memo >", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoGreaterThanOrEqualTo(String value) {
            addCriterion("in_memo >=", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoLessThan(String value) {
            addCriterion("in_memo <", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoLessThanOrEqualTo(String value) {
            addCriterion("in_memo <=", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoLike(String value) {
            addCriterion("in_memo like", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoNotLike(String value) {
            addCriterion("in_memo not like", value, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoIn(List<String> values) {
            addCriterion("in_memo in", values, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoNotIn(List<String> values) {
            addCriterion("in_memo not in", values, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoBetween(String value1, String value2) {
            addCriterion("in_memo between", value1, value2, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInMemoNotBetween(String value1, String value2) {
            addCriterion("in_memo not between", value1, value2, "inMemo");
            return (Criteria) this;
        }

        public Criteria andInKindIsNull() {
            addCriterion("in_kind is null");
            return (Criteria) this;
        }

        public Criteria andInKindIsNotNull() {
            addCriterion("in_kind is not null");
            return (Criteria) this;
        }

        public Criteria andInKindEqualTo(String value) {
            addCriterion("in_kind =", value, "inKind");
            return (Criteria) this;
        }

        public Criteria andInKindNotEqualTo(String value) {
            addCriterion("in_kind <>", value, "inKind");
            return (Criteria) this;
        }

        public Criteria andInKindGreaterThan(String value) {
            addCriterion("in_kind >", value, "inKind");
            return (Criteria) this;
        }

        public Criteria andInKindGreaterThanOrEqualTo(String value) {
            addCriterion("in_kind >=", value, "inKind");
            return (Criteria) this;
        }

        public Criteria andInKindLessThan(String value) {
            addCriterion("in_kind <", value, "inKind");
            return (Criteria) this;
        }

        public Criteria andInKindLessThanOrEqualTo(String value) {
            addCriterion("in_kind <=", value, "inKind");
            return (Criteria) this;
        }

        public Criteria andInKindLike(String value) {
            addCriterion("in_kind like", value, "inKind");
            return (Criteria) this;
        }

        public Criteria andInKindNotLike(String value) {
            addCriterion("in_kind not like", value, "inKind");
            return (Criteria) this;
        }

        public Criteria andInKindIn(List<String> values) {
            addCriterion("in_kind in", values, "inKind");
            return (Criteria) this;
        }

        public Criteria andInKindNotIn(List<String> values) {
            addCriterion("in_kind not in", values, "inKind");
            return (Criteria) this;
        }

        public Criteria andInKindBetween(String value1, String value2) {
            addCriterion("in_kind between", value1, value2, "inKind");
            return (Criteria) this;
        }

        public Criteria andInKindNotBetween(String value1, String value2) {
            addCriterion("in_kind not between", value1, value2, "inKind");
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