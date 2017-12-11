package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SkempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkempExample() {
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirIsNull() {
            addCriterion("bir is null");
            return (Criteria) this;
        }

        public Criteria andBirIsNotNull() {
            addCriterion("bir is not null");
            return (Criteria) this;
        }

        public Criteria andBirEqualTo(Date value) {
            addCriterionForJDBCDate("bir =", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirNotEqualTo(Date value) {
            addCriterionForJDBCDate("bir <>", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirGreaterThan(Date value) {
            addCriterionForJDBCDate("bir >", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bir >=", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirLessThan(Date value) {
            addCriterionForJDBCDate("bir <", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bir <=", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirIn(List<Date> values) {
            addCriterionForJDBCDate("bir in", values, "bir");
            return (Criteria) this;
        }

        public Criteria andBirNotIn(List<Date> values) {
            addCriterionForJDBCDate("bir not in", values, "bir");
            return (Criteria) this;
        }

        public Criteria andBirBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bir between", value1, value2, "bir");
            return (Criteria) this;
        }

        public Criteria andBirNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bir not between", value1, value2, "bir");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andToworktimeIsNull() {
            addCriterion("toworktime is null");
            return (Criteria) this;
        }

        public Criteria andToworktimeIsNotNull() {
            addCriterion("toworktime is not null");
            return (Criteria) this;
        }

        public Criteria andToworktimeEqualTo(Date value) {
            addCriterionForJDBCDate("toworktime =", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("toworktime <>", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeGreaterThan(Date value) {
            addCriterionForJDBCDate("toworktime >", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("toworktime >=", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeLessThan(Date value) {
            addCriterionForJDBCDate("toworktime <", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("toworktime <=", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeIn(List<Date> values) {
            addCriterionForJDBCDate("toworktime in", values, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("toworktime not in", values, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("toworktime between", value1, value2, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("toworktime not between", value1, value2, "toworktime");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("zzmm is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(String value) {
            addCriterion("zzmm =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(String value) {
            addCriterion("zzmm <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(String value) {
            addCriterion("zzmm >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("zzmm >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(String value) {
            addCriterion("zzmm <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(String value) {
            addCriterion("zzmm <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLike(String value) {
            addCriterion("zzmm like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotLike(String value) {
            addCriterion("zzmm not like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<String> values) {
            addCriterion("zzmm in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<String> values) {
            addCriterion("zzmm not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(String value1, String value2) {
            addCriterion("zzmm between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(String value1, String value2) {
            addCriterion("zzmm not between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andNationalIsNull() {
            addCriterion("national is null");
            return (Criteria) this;
        }

        public Criteria andNationalIsNotNull() {
            addCriterion("national is not null");
            return (Criteria) this;
        }

        public Criteria andNationalEqualTo(String value) {
            addCriterion("national =", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotEqualTo(String value) {
            addCriterion("national <>", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThan(String value) {
            addCriterion("national >", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThanOrEqualTo(String value) {
            addCriterion("national >=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThan(String value) {
            addCriterion("national <", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThanOrEqualTo(String value) {
            addCriterion("national <=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLike(String value) {
            addCriterion("national like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotLike(String value) {
            addCriterion("national not like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalIn(List<String> values) {
            addCriterion("national in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotIn(List<String> values) {
            addCriterion("national not in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalBetween(String value1, String value2) {
            addCriterion("national between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotBetween(String value1, String value2) {
            addCriterion("national not between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andNativesIsNull() {
            addCriterion("natives is null");
            return (Criteria) this;
        }

        public Criteria andNativesIsNotNull() {
            addCriterion("natives is not null");
            return (Criteria) this;
        }

        public Criteria andNativesEqualTo(String value) {
            addCriterion("natives =", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesNotEqualTo(String value) {
            addCriterion("natives <>", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesGreaterThan(String value) {
            addCriterion("natives >", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesGreaterThanOrEqualTo(String value) {
            addCriterion("natives >=", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesLessThan(String value) {
            addCriterion("natives <", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesLessThanOrEqualTo(String value) {
            addCriterion("natives <=", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesLike(String value) {
            addCriterion("natives like", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesNotLike(String value) {
            addCriterion("natives not like", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesIn(List<String> values) {
            addCriterion("natives in", values, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesNotIn(List<String> values) {
            addCriterion("natives not in", values, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesBetween(String value1, String value2) {
            addCriterion("natives between", value1, value2, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesNotBetween(String value1, String value2) {
            addCriterion("natives not between", value1, value2, "natives");
            return (Criteria) this;
        }

        public Criteria andTeleIsNull() {
            addCriterion("tele is null");
            return (Criteria) this;
        }

        public Criteria andTeleIsNotNull() {
            addCriterion("tele is not null");
            return (Criteria) this;
        }

        public Criteria andTeleEqualTo(String value) {
            addCriterion("tele =", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleNotEqualTo(String value) {
            addCriterion("tele <>", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleGreaterThan(String value) {
            addCriterion("tele >", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleGreaterThanOrEqualTo(String value) {
            addCriterion("tele >=", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleLessThan(String value) {
            addCriterion("tele <", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleLessThanOrEqualTo(String value) {
            addCriterion("tele <=", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleLike(String value) {
            addCriterion("tele like", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleNotLike(String value) {
            addCriterion("tele not like", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleIn(List<String> values) {
            addCriterion("tele in", values, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleNotIn(List<String> values) {
            addCriterion("tele not in", values, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleBetween(String value1, String value2) {
            addCriterion("tele between", value1, value2, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleNotBetween(String value1, String value2) {
            addCriterion("tele not between", value1, value2, "tele");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIsNull() {
            addCriterion("bloodtype is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIsNotNull() {
            addCriterion("bloodtype is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeEqualTo(String value) {
            addCriterion("bloodtype =", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotEqualTo(String value) {
            addCriterion("bloodtype <>", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeGreaterThan(String value) {
            addCriterion("bloodtype >", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeGreaterThanOrEqualTo(String value) {
            addCriterion("bloodtype >=", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLessThan(String value) {
            addCriterion("bloodtype <", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLessThanOrEqualTo(String value) {
            addCriterion("bloodtype <=", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLike(String value) {
            addCriterion("bloodtype like", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotLike(String value) {
            addCriterion("bloodtype not like", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIn(List<String> values) {
            addCriterion("bloodtype in", values, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotIn(List<String> values) {
            addCriterion("bloodtype not in", values, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeBetween(String value1, String value2) {
            addCriterion("bloodtype between", value1, value2, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotBetween(String value1, String value2) {
            addCriterion("bloodtype not between", value1, value2, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNull() {
            addCriterion("birthplace is null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNotNull() {
            addCriterion("birthplace is not null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceEqualTo(String value) {
            addCriterion("birthplace =", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotEqualTo(String value) {
            addCriterion("birthplace <>", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThan(String value) {
            addCriterion("birthplace >", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("birthplace >=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThan(String value) {
            addCriterion("birthplace <", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("birthplace <=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLike(String value) {
            addCriterion("birthplace like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotLike(String value) {
            addCriterion("birthplace not like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIn(List<String> values) {
            addCriterion("birthplace in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotIn(List<String> values) {
            addCriterion("birthplace not in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceBetween(String value1, String value2) {
            addCriterion("birthplace between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotBetween(String value1, String value2) {
            addCriterion("birthplace not between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceIsNull() {
            addCriterion("hkplace is null");
            return (Criteria) this;
        }

        public Criteria andHkplaceIsNotNull() {
            addCriterion("hkplace is not null");
            return (Criteria) this;
        }

        public Criteria andHkplaceEqualTo(String value) {
            addCriterion("hkplace =", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceNotEqualTo(String value) {
            addCriterion("hkplace <>", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceGreaterThan(String value) {
            addCriterion("hkplace >", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("hkplace >=", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceLessThan(String value) {
            addCriterion("hkplace <", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceLessThanOrEqualTo(String value) {
            addCriterion("hkplace <=", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceLike(String value) {
            addCriterion("hkplace like", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceNotLike(String value) {
            addCriterion("hkplace not like", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceIn(List<String> values) {
            addCriterion("hkplace in", values, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceNotIn(List<String> values) {
            addCriterion("hkplace not in", values, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceBetween(String value1, String value2) {
            addCriterion("hkplace between", value1, value2, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceNotBetween(String value1, String value2) {
            addCriterion("hkplace not between", value1, value2, "hkplace");
            return (Criteria) this;
        }

        public Criteria andXlIsNull() {
            addCriterion("xl is null");
            return (Criteria) this;
        }

        public Criteria andXlIsNotNull() {
            addCriterion("xl is not null");
            return (Criteria) this;
        }

        public Criteria andXlEqualTo(String value) {
            addCriterion("xl =", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotEqualTo(String value) {
            addCriterion("xl <>", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThan(String value) {
            addCriterion("xl >", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThanOrEqualTo(String value) {
            addCriterion("xl >=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThan(String value) {
            addCriterion("xl <", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThanOrEqualTo(String value) {
            addCriterion("xl <=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLike(String value) {
            addCriterion("xl like", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotLike(String value) {
            addCriterion("xl not like", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIn(List<String> values) {
            addCriterion("xl in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotIn(List<String> values) {
            addCriterion("xl not in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlBetween(String value1, String value2) {
            addCriterion("xl between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotBetween(String value1, String value2) {
            addCriterion("xl not between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNull() {
            addCriterion("graduateschool is null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNotNull() {
            addCriterion("graduateschool is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolEqualTo(String value) {
            addCriterion("graduateschool =", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotEqualTo(String value) {
            addCriterion("graduateschool <>", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThan(String value) {
            addCriterion("graduateschool >", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduateschool >=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThan(String value) {
            addCriterion("graduateschool <", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThanOrEqualTo(String value) {
            addCriterion("graduateschool <=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLike(String value) {
            addCriterion("graduateschool like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotLike(String value) {
            addCriterion("graduateschool not like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIn(List<String> values) {
            addCriterion("graduateschool in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotIn(List<String> values) {
            addCriterion("graduateschool not in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolBetween(String value1, String value2) {
            addCriterion("graduateschool between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotBetween(String value1, String value2) {
            addCriterion("graduateschool not between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNull() {
            addCriterion("professional is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNotNull() {
            addCriterion("professional is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalEqualTo(String value) {
            addCriterion("professional =", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotEqualTo(String value) {
            addCriterion("professional <>", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThan(String value) {
            addCriterion("professional >", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("professional >=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThan(String value) {
            addCriterion("professional <", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThanOrEqualTo(String value) {
            addCriterion("professional <=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLike(String value) {
            addCriterion("professional like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotLike(String value) {
            addCriterion("professional not like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalIn(List<String> values) {
            addCriterion("professional in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotIn(List<String> values) {
            addCriterion("professional not in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalBetween(String value1, String value2) {
            addCriterion("professional between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotBetween(String value1, String value2) {
            addCriterion("professional not between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIsNull() {
            addCriterion("graduatetime is null");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIsNotNull() {
            addCriterion("graduatetime is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("graduatetime =", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("graduatetime <>", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("graduatetime >", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduatetime >=", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeLessThan(Date value) {
            addCriterionForJDBCDate("graduatetime <", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduatetime <=", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("graduatetime in", values, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("graduatetime not in", values, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduatetime between", value1, value2, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduatetime not between", value1, value2, "graduatetime");
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