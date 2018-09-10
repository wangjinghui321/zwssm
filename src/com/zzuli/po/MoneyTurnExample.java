package com.zzuli.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MoneyTurnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneyTurnExample() {
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

        public Criteria andTurnIdIsNull() {
            addCriterion("turn_id is null");
            return (Criteria) this;
        }

        public Criteria andTurnIdIsNotNull() {
            addCriterion("turn_id is not null");
            return (Criteria) this;
        }

        public Criteria andTurnIdEqualTo(Integer value) {
            addCriterion("turn_id =", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdNotEqualTo(Integer value) {
            addCriterion("turn_id <>", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdGreaterThan(Integer value) {
            addCriterion("turn_id >", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("turn_id >=", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdLessThan(Integer value) {
            addCriterion("turn_id <", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdLessThanOrEqualTo(Integer value) {
            addCriterion("turn_id <=", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdIn(List<Integer> values) {
            addCriterion("turn_id in", values, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdNotIn(List<Integer> values) {
            addCriterion("turn_id not in", values, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdBetween(Integer value1, Integer value2) {
            addCriterion("turn_id between", value1, value2, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("turn_id not between", value1, value2, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyIsNull() {
            addCriterion("turn_money is null");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyIsNotNull() {
            addCriterion("turn_money is not null");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyEqualTo(String value) {
            addCriterion("turn_money =", value, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyNotEqualTo(String value) {
            addCriterion("turn_money <>", value, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyGreaterThan(String value) {
            addCriterion("turn_money >", value, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("turn_money >=", value, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyLessThan(String value) {
            addCriterion("turn_money <", value, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyLessThanOrEqualTo(String value) {
            addCriterion("turn_money <=", value, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyLike(String value) {
            addCriterion("turn_money like", value, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyNotLike(String value) {
            addCriterion("turn_money not like", value, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyIn(List<String> values) {
            addCriterion("turn_money in", values, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyNotIn(List<String> values) {
            addCriterion("turn_money not in", values, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyBetween(String value1, String value2) {
            addCriterion("turn_money between", value1, value2, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnMoneyNotBetween(String value1, String value2) {
            addCriterion("turn_money not between", value1, value2, "turnMoney");
            return (Criteria) this;
        }

        public Criteria andTurnTimeIsNull() {
            addCriterion("turn_time is null");
            return (Criteria) this;
        }

        public Criteria andTurnTimeIsNotNull() {
            addCriterion("turn_time is not null");
            return (Criteria) this;
        }

        public Criteria andTurnTimeEqualTo(Date value) {
            addCriterionForJDBCDate("turn_time =", value, "turnTime");
            return (Criteria) this;
        }

        public Criteria andTurnTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("turn_time <>", value, "turnTime");
            return (Criteria) this;
        }

        public Criteria andTurnTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("turn_time >", value, "turnTime");
            return (Criteria) this;
        }

        public Criteria andTurnTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("turn_time >=", value, "turnTime");
            return (Criteria) this;
        }

        public Criteria andTurnTimeLessThan(Date value) {
            addCriterionForJDBCDate("turn_time <", value, "turnTime");
            return (Criteria) this;
        }

        public Criteria andTurnTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("turn_time <=", value, "turnTime");
            return (Criteria) this;
        }

        public Criteria andTurnTimeIn(List<Date> values) {
            addCriterionForJDBCDate("turn_time in", values, "turnTime");
            return (Criteria) this;
        }

        public Criteria andTurnTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("turn_time not in", values, "turnTime");
            return (Criteria) this;
        }

        public Criteria andTurnTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("turn_time between", value1, value2, "turnTime");
            return (Criteria) this;
        }

        public Criteria andTurnTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("turn_time not between", value1, value2, "turnTime");
            return (Criteria) this;
        }

        public Criteria andTurnMemoIsNull() {
            addCriterion("turn_memo is null");
            return (Criteria) this;
        }

        public Criteria andTurnMemoIsNotNull() {
            addCriterion("turn_memo is not null");
            return (Criteria) this;
        }

        public Criteria andTurnMemoEqualTo(String value) {
            addCriterion("turn_memo =", value, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnMemoNotEqualTo(String value) {
            addCriterion("turn_memo <>", value, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnMemoGreaterThan(String value) {
            addCriterion("turn_memo >", value, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnMemoGreaterThanOrEqualTo(String value) {
            addCriterion("turn_memo >=", value, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnMemoLessThan(String value) {
            addCriterion("turn_memo <", value, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnMemoLessThanOrEqualTo(String value) {
            addCriterion("turn_memo <=", value, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnMemoLike(String value) {
            addCriterion("turn_memo like", value, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnMemoNotLike(String value) {
            addCriterion("turn_memo not like", value, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnMemoIn(List<String> values) {
            addCriterion("turn_memo in", values, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnMemoNotIn(List<String> values) {
            addCriterion("turn_memo not in", values, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnMemoBetween(String value1, String value2) {
            addCriterion("turn_memo between", value1, value2, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnMemoNotBetween(String value1, String value2) {
            addCriterion("turn_memo not between", value1, value2, "turnMemo");
            return (Criteria) this;
        }

        public Criteria andTurnKindIsNull() {
            addCriterion("turn_kind is null");
            return (Criteria) this;
        }

        public Criteria andTurnKindIsNotNull() {
            addCriterion("turn_kind is not null");
            return (Criteria) this;
        }

        public Criteria andTurnKindEqualTo(String value) {
            addCriterion("turn_kind =", value, "turnKind");
            return (Criteria) this;
        }

        public Criteria andTurnKindNotEqualTo(String value) {
            addCriterion("turn_kind <>", value, "turnKind");
            return (Criteria) this;
        }

        public Criteria andTurnKindGreaterThan(String value) {
            addCriterion("turn_kind >", value, "turnKind");
            return (Criteria) this;
        }

        public Criteria andTurnKindGreaterThanOrEqualTo(String value) {
            addCriterion("turn_kind >=", value, "turnKind");
            return (Criteria) this;
        }

        public Criteria andTurnKindLessThan(String value) {
            addCriterion("turn_kind <", value, "turnKind");
            return (Criteria) this;
        }

        public Criteria andTurnKindLessThanOrEqualTo(String value) {
            addCriterion("turn_kind <=", value, "turnKind");
            return (Criteria) this;
        }

        public Criteria andTurnKindLike(String value) {
            addCriterion("turn_kind like", value, "turnKind");
            return (Criteria) this;
        }

        public Criteria andTurnKindNotLike(String value) {
            addCriterion("turn_kind not like", value, "turnKind");
            return (Criteria) this;
        }

        public Criteria andTurnKindIn(List<String> values) {
            addCriterion("turn_kind in", values, "turnKind");
            return (Criteria) this;
        }

        public Criteria andTurnKindNotIn(List<String> values) {
            addCriterion("turn_kind not in", values, "turnKind");
            return (Criteria) this;
        }

        public Criteria andTurnKindBetween(String value1, String value2) {
            addCriterion("turn_kind between", value1, value2, "turnKind");
            return (Criteria) this;
        }

        public Criteria andTurnKindNotBetween(String value1, String value2) {
            addCriterion("turn_kind not between", value1, value2, "turnKind");
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