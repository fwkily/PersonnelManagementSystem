package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChangeExample() {
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

        public Criteria andOlddeptIsNull() {
            addCriterion("olddept is null");
            return (Criteria) this;
        }

        public Criteria andOlddeptIsNotNull() {
            addCriterion("olddept is not null");
            return (Criteria) this;
        }

        public Criteria andOlddeptEqualTo(String value) {
            addCriterion("olddept =", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotEqualTo(String value) {
            addCriterion("olddept <>", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptGreaterThan(String value) {
            addCriterion("olddept >", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptGreaterThanOrEqualTo(String value) {
            addCriterion("olddept >=", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLessThan(String value) {
            addCriterion("olddept <", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLessThanOrEqualTo(String value) {
            addCriterion("olddept <=", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLike(String value) {
            addCriterion("olddept like", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotLike(String value) {
            addCriterion("olddept not like", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptIn(List<String> values) {
            addCriterion("olddept in", values, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotIn(List<String> values) {
            addCriterion("olddept not in", values, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptBetween(String value1, String value2) {
            addCriterion("olddept between", value1, value2, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotBetween(String value1, String value2) {
            addCriterion("olddept not between", value1, value2, "olddept");
            return (Criteria) this;
        }

        public Criteria andNewdeptIsNull() {
            addCriterion("newdept is null");
            return (Criteria) this;
        }

        public Criteria andNewdeptIsNotNull() {
            addCriterion("newdept is not null");
            return (Criteria) this;
        }

        public Criteria andNewdeptEqualTo(String value) {
            addCriterion("newdept =", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotEqualTo(String value) {
            addCriterion("newdept <>", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptGreaterThan(String value) {
            addCriterion("newdept >", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptGreaterThanOrEqualTo(String value) {
            addCriterion("newdept >=", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptLessThan(String value) {
            addCriterion("newdept <", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptLessThanOrEqualTo(String value) {
            addCriterion("newdept <=", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptLike(String value) {
            addCriterion("newdept like", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotLike(String value) {
            addCriterion("newdept not like", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptIn(List<String> values) {
            addCriterion("newdept in", values, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotIn(List<String> values) {
            addCriterion("newdept not in", values, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptBetween(String value1, String value2) {
            addCriterion("newdept between", value1, value2, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotBetween(String value1, String value2) {
            addCriterion("newdept not between", value1, value2, "newdept");
            return (Criteria) this;
        }

        public Criteria andDeptypeIsNull() {
            addCriterion("deptype is null");
            return (Criteria) this;
        }

        public Criteria andDeptypeIsNotNull() {
            addCriterion("deptype is not null");
            return (Criteria) this;
        }

        public Criteria andDeptypeEqualTo(String value) {
            addCriterion("deptype =", value, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptypeNotEqualTo(String value) {
            addCriterion("deptype <>", value, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptypeGreaterThan(String value) {
            addCriterion("deptype >", value, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptypeGreaterThanOrEqualTo(String value) {
            addCriterion("deptype >=", value, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptypeLessThan(String value) {
            addCriterion("deptype <", value, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptypeLessThanOrEqualTo(String value) {
            addCriterion("deptype <=", value, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptypeLike(String value) {
            addCriterion("deptype like", value, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptypeNotLike(String value) {
            addCriterion("deptype not like", value, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptypeIn(List<String> values) {
            addCriterion("deptype in", values, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptypeNotIn(List<String> values) {
            addCriterion("deptype not in", values, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptypeBetween(String value1, String value2) {
            addCriterion("deptype between", value1, value2, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptypeNotBetween(String value1, String value2) {
            addCriterion("deptype not between", value1, value2, "deptype");
            return (Criteria) this;
        }

        public Criteria andDeptreasonIsNull() {
            addCriterion("deptreason is null");
            return (Criteria) this;
        }

        public Criteria andDeptreasonIsNotNull() {
            addCriterion("deptreason is not null");
            return (Criteria) this;
        }

        public Criteria andDeptreasonEqualTo(String value) {
            addCriterion("deptreason =", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonNotEqualTo(String value) {
            addCriterion("deptreason <>", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonGreaterThan(String value) {
            addCriterion("deptreason >", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonGreaterThanOrEqualTo(String value) {
            addCriterion("deptreason >=", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonLessThan(String value) {
            addCriterion("deptreason <", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonLessThanOrEqualTo(String value) {
            addCriterion("deptreason <=", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonLike(String value) {
            addCriterion("deptreason like", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonNotLike(String value) {
            addCriterion("deptreason not like", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonIn(List<String> values) {
            addCriterion("deptreason in", values, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonNotIn(List<String> values) {
            addCriterion("deptreason not in", values, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonBetween(String value1, String value2) {
            addCriterion("deptreason between", value1, value2, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonNotBetween(String value1, String value2) {
            addCriterion("deptreason not between", value1, value2, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDepttimeIsNull() {
            addCriterion("depttime is null");
            return (Criteria) this;
        }

        public Criteria andDepttimeIsNotNull() {
            addCriterion("depttime is not null");
            return (Criteria) this;
        }

        public Criteria andDepttimeEqualTo(Date value) {
            addCriterionForJDBCDate("depttime =", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("depttime <>", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("depttime >", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("depttime >=", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeLessThan(Date value) {
            addCriterionForJDBCDate("depttime <", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("depttime <=", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeIn(List<Date> values) {
            addCriterionForJDBCDate("depttime in", values, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("depttime not in", values, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("depttime between", value1, value2, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("depttime not between", value1, value2, "depttime");
            return (Criteria) this;
        }

        public Criteria andOldjobIsNull() {
            addCriterion("oldjob is null");
            return (Criteria) this;
        }

        public Criteria andOldjobIsNotNull() {
            addCriterion("oldjob is not null");
            return (Criteria) this;
        }

        public Criteria andOldjobEqualTo(String value) {
            addCriterion("oldjob =", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobNotEqualTo(String value) {
            addCriterion("oldjob <>", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobGreaterThan(String value) {
            addCriterion("oldjob >", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobGreaterThanOrEqualTo(String value) {
            addCriterion("oldjob >=", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobLessThan(String value) {
            addCriterion("oldjob <", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobLessThanOrEqualTo(String value) {
            addCriterion("oldjob <=", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobLike(String value) {
            addCriterion("oldjob like", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobNotLike(String value) {
            addCriterion("oldjob not like", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobIn(List<String> values) {
            addCriterion("oldjob in", values, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobNotIn(List<String> values) {
            addCriterion("oldjob not in", values, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobBetween(String value1, String value2) {
            addCriterion("oldjob between", value1, value2, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobNotBetween(String value1, String value2) {
            addCriterion("oldjob not between", value1, value2, "oldjob");
            return (Criteria) this;
        }

        public Criteria andNewjobIsNull() {
            addCriterion("newjob is null");
            return (Criteria) this;
        }

        public Criteria andNewjobIsNotNull() {
            addCriterion("newjob is not null");
            return (Criteria) this;
        }

        public Criteria andNewjobEqualTo(String value) {
            addCriterion("newjob =", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotEqualTo(String value) {
            addCriterion("newjob <>", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobGreaterThan(String value) {
            addCriterion("newjob >", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobGreaterThanOrEqualTo(String value) {
            addCriterion("newjob >=", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobLessThan(String value) {
            addCriterion("newjob <", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobLessThanOrEqualTo(String value) {
            addCriterion("newjob <=", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobLike(String value) {
            addCriterion("newjob like", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotLike(String value) {
            addCriterion("newjob not like", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobIn(List<String> values) {
            addCriterion("newjob in", values, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotIn(List<String> values) {
            addCriterion("newjob not in", values, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobBetween(String value1, String value2) {
            addCriterion("newjob between", value1, value2, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotBetween(String value1, String value2) {
            addCriterion("newjob not between", value1, value2, "newjob");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andJobtimeIsNull() {
            addCriterion("jobtime is null");
            return (Criteria) this;
        }

        public Criteria andJobtimeIsNotNull() {
            addCriterion("jobtime is not null");
            return (Criteria) this;
        }

        public Criteria andJobtimeEqualTo(Date value) {
            addCriterionForJDBCDate("jobtime =", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("jobtime <>", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("jobtime >", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jobtime >=", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeLessThan(Date value) {
            addCriterionForJDBCDate("jobtime <", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jobtime <=", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeIn(List<Date> values) {
            addCriterionForJDBCDate("jobtime in", values, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("jobtime not in", values, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jobtime between", value1, value2, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jobtime not between", value1, value2, "jobtime");
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