package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("pass like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("pass not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("pass not between", value1, value2, "pass");
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

        public Criteria andExplanation3EqualTo(Date value) {
            addCriterionForJDBCDate("explanation3 =", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3NotEqualTo(Date value) {
            addCriterionForJDBCDate("explanation3 <>", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3GreaterThan(Date value) {
            addCriterionForJDBCDate("explanation3 >", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("explanation3 >=", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3LessThan(Date value) {
            addCriterionForJDBCDate("explanation3 <", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("explanation3 <=", value, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3In(List<Date> values) {
            addCriterionForJDBCDate("explanation3 in", values, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3NotIn(List<Date> values) {
            addCriterionForJDBCDate("explanation3 not in", values, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3Between(Date value1, Date value2) {
            addCriterionForJDBCDate("explanation3 between", value1, value2, "explanation3");
            return (Criteria) this;
        }

        public Criteria andExplanation3NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("explanation3 not between", value1, value2, "explanation3");
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