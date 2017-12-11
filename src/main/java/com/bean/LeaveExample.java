package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveExample() {
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

        public Criteria andEmpnoIsNull() {
            addCriterion("empno is null");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNotNull() {
            addCriterion("empno is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnoEqualTo(Integer value) {
            addCriterion("empno =", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotEqualTo(Integer value) {
            addCriterion("empno <>", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThan(Integer value) {
            addCriterion("empno >", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("empno >=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThan(Integer value) {
            addCriterion("empno <", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThanOrEqualTo(Integer value) {
            addCriterion("empno <=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoIn(List<Integer> values) {
            addCriterion("empno in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotIn(List<Integer> values) {
            addCriterion("empno not in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoBetween(Integer value1, Integer value2) {
            addCriterion("empno between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotBetween(Integer value1, Integer value2) {
            addCriterion("empno not between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andJobidIsNull() {
            addCriterion("jobid is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobid is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(Integer value) {
            addCriterion("jobid =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(Integer value) {
            addCriterion("jobid <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(Integer value) {
            addCriterion("jobid >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobid >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(Integer value) {
            addCriterion("jobid <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(Integer value) {
            addCriterion("jobid <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<Integer> values) {
            addCriterion("jobid in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<Integer> values) {
            addCriterion("jobid not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(Integer value1, Integer value2) {
            addCriterion("jobid between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("jobid not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andExplanation1IsNull() {
            addCriterion("explanation1 is null");
            return (Criteria) this;
        }

        public Criteria andExplanation1IsNotNull() {
            addCriterion("explanation1 is not null");
            return (Criteria) this;
        }

        public Criteria andExplanation1EqualTo(String value) {
            addCriterion("explanation1 =", value, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation1NotEqualTo(String value) {
            addCriterion("explanation1 <>", value, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation1GreaterThan(String value) {
            addCriterion("explanation1 >", value, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation1GreaterThanOrEqualTo(String value) {
            addCriterion("explanation1 >=", value, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation1LessThan(String value) {
            addCriterion("explanation1 <", value, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation1LessThanOrEqualTo(String value) {
            addCriterion("explanation1 <=", value, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation1Like(String value) {
            addCriterion("explanation1 like", value, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation1NotLike(String value) {
            addCriterion("explanation1 not like", value, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation1In(List<String> values) {
            addCriterion("explanation1 in", values, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation1NotIn(List<String> values) {
            addCriterion("explanation1 not in", values, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation1Between(String value1, String value2) {
            addCriterion("explanation1 between", value1, value2, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation1NotBetween(String value1, String value2) {
            addCriterion("explanation1 not between", value1, value2, "explanation1");
            return (Criteria) this;
        }

        public Criteria andExplanation2IsNull() {
            addCriterion("explanation2 is null");
            return (Criteria) this;
        }

        public Criteria andExplanation2IsNotNull() {
            addCriterion("explanation2 is not null");
            return (Criteria) this;
        }

        public Criteria andExplanation2EqualTo(String value) {
            addCriterion("explanation2 =", value, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation2NotEqualTo(String value) {
            addCriterion("explanation2 <>", value, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation2GreaterThan(String value) {
            addCriterion("explanation2 >", value, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation2GreaterThanOrEqualTo(String value) {
            addCriterion("explanation2 >=", value, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation2LessThan(String value) {
            addCriterion("explanation2 <", value, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation2LessThanOrEqualTo(String value) {
            addCriterion("explanation2 <=", value, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation2Like(String value) {
            addCriterion("explanation2 like", value, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation2NotLike(String value) {
            addCriterion("explanation2 not like", value, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation2In(List<String> values) {
            addCriterion("explanation2 in", values, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation2NotIn(List<String> values) {
            addCriterion("explanation2 not in", values, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation2Between(String value1, String value2) {
            addCriterion("explanation2 between", value1, value2, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation2NotBetween(String value1, String value2) {
            addCriterion("explanation2 not between", value1, value2, "explanation2");
            return (Criteria) this;
        }

        public Criteria andExplanation3IsNull() {
            addCriterion("explanation3 is null");
            return (Criteria) this;
        }

        public Criteria andExplanation3IsNotNull() {
            addCriterion("explanation3 is not null");
            return (Criteria) this;
        }

        public Criteria andExplanation3EqualTo(String value) {
            addCriterion("explanation3 =", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3NotEqualTo(String value) {
            addCriterion("explanation3 <>", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3GreaterThan(String value) {
            addCriterion("explanation3 >", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3GreaterThanOrEqualTo(String value) {
            addCriterion("explanation3 >=", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3LessThan(String value) {
            addCriterion("explanation3 <", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3LessThanOrEqualTo(String value) {
            addCriterion("explanation3 <=", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3Like(String value) {
            addCriterion("explanation3 like", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3NotLike(String value) {
            addCriterion("explanation3 not like", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3In(List<String> values) {
            addCriterion("explanation3 in", values, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3NotIn(List<String> values) {
            addCriterion("explanation3 not in", values, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3Between(String value1, String value2) {
            addCriterion("explanation3 between", value1, value2, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3NotBetween(String value1, String value2) {
            addCriterion("explanation3 not between", value1, value2, "explanation3");
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