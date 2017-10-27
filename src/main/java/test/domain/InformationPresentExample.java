package test.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InformationPresentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationPresentExample() {
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

        public Criteria andPartyBranchIsNull() {
            addCriterion("party_branch is null");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIsNotNull() {
            addCriterion("party_branch is not null");
            return (Criteria) this;
        }

        public Criteria andPartyBranchEqualTo(String value) {
            addCriterion("party_branch =", value, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNotEqualTo(String value) {
            addCriterion("party_branch <>", value, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andPartyBranchGreaterThan(String value) {
            addCriterion("party_branch >", value, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andPartyBranchGreaterThanOrEqualTo(String value) {
            addCriterion("party_branch >=", value, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andPartyBranchLessThan(String value) {
            addCriterion("party_branch <", value, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andPartyBranchLessThanOrEqualTo(String value) {
            addCriterion("party_branch <=", value, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andPartyBranchLike(String value) {
            addCriterion("party_branch like", value, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNotLike(String value) {
            addCriterion("party_branch not like", value, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIn(List<String> values) {
            addCriterion("party_branch in", values, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNotIn(List<String> values) {
            addCriterion("party_branch not in", values, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andPartyBranchBetween(String value1, String value2) {
            addCriterion("party_branch between", value1, value2, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNotBetween(String value1, String value2) {
            addCriterion("party_branch not between", value1, value2, "partyBranch");
            return (Criteria) this;
        }

        public Criteria andAdministrationIsNull() {
            addCriterion("administration is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationIsNotNull() {
            addCriterion("administration is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationEqualTo(String value) {
            addCriterion("administration =", value, "administration");
            return (Criteria) this;
        }

        public Criteria andAdministrationNotEqualTo(String value) {
            addCriterion("administration <>", value, "administration");
            return (Criteria) this;
        }

        public Criteria andAdministrationGreaterThan(String value) {
            addCriterion("administration >", value, "administration");
            return (Criteria) this;
        }

        public Criteria andAdministrationGreaterThanOrEqualTo(String value) {
            addCriterion("administration >=", value, "administration");
            return (Criteria) this;
        }

        public Criteria andAdministrationLessThan(String value) {
            addCriterion("administration <", value, "administration");
            return (Criteria) this;
        }

        public Criteria andAdministrationLessThanOrEqualTo(String value) {
            addCriterion("administration <=", value, "administration");
            return (Criteria) this;
        }

        public Criteria andAdministrationLike(String value) {
            addCriterion("administration like", value, "administration");
            return (Criteria) this;
        }

        public Criteria andAdministrationNotLike(String value) {
            addCriterion("administration not like", value, "administration");
            return (Criteria) this;
        }

        public Criteria andAdministrationIn(List<String> values) {
            addCriterion("administration in", values, "administration");
            return (Criteria) this;
        }

        public Criteria andAdministrationNotIn(List<String> values) {
            addCriterion("administration not in", values, "administration");
            return (Criteria) this;
        }

        public Criteria andAdministrationBetween(String value1, String value2) {
            addCriterion("administration between", value1, value2, "administration");
            return (Criteria) this;
        }

        public Criteria andAdministrationNotBetween(String value1, String value2) {
            addCriterion("administration not between", value1, value2, "administration");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesIsNull() {
            addCriterion("basicparty_duties is null");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesIsNotNull() {
            addCriterion("basicparty_duties is not null");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesEqualTo(String value) {
            addCriterion("basicparty_duties =", value, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesNotEqualTo(String value) {
            addCriterion("basicparty_duties <>", value, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesGreaterThan(String value) {
            addCriterion("basicparty_duties >", value, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("basicparty_duties >=", value, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesLessThan(String value) {
            addCriterion("basicparty_duties <", value, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesLessThanOrEqualTo(String value) {
            addCriterion("basicparty_duties <=", value, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesLike(String value) {
            addCriterion("basicparty_duties like", value, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesNotLike(String value) {
            addCriterion("basicparty_duties not like", value, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesIn(List<String> values) {
            addCriterion("basicparty_duties in", values, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesNotIn(List<String> values) {
            addCriterion("basicparty_duties not in", values, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesBetween(String value1, String value2) {
            addCriterion("basicparty_duties between", value1, value2, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andBasicpartyDutiesNotBetween(String value1, String value2) {
            addCriterion("basicparty_duties not between", value1, value2, "basicpartyDuties");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyIsNull() {
            addCriterion("time_basicparty is null");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyIsNotNull() {
            addCriterion("time_basicparty is not null");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyEqualTo(Date value) {
            addCriterionForJDBCDate("time_basicparty =", value, "timeBasicparty");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyNotEqualTo(Date value) {
            addCriterionForJDBCDate("time_basicparty <>", value, "timeBasicparty");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyGreaterThan(Date value) {
            addCriterionForJDBCDate("time_basicparty >", value, "timeBasicparty");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_basicparty >=", value, "timeBasicparty");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyLessThan(Date value) {
            addCriterionForJDBCDate("time_basicparty <", value, "timeBasicparty");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_basicparty <=", value, "timeBasicparty");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyIn(List<Date> values) {
            addCriterionForJDBCDate("time_basicparty in", values, "timeBasicparty");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyNotIn(List<Date> values) {
            addCriterionForJDBCDate("time_basicparty not in", values, "timeBasicparty");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_basicparty between", value1, value2, "timeBasicparty");
            return (Criteria) this;
        }

        public Criteria andTimeBasicpartyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_basicparty not between", value1, value2, "timeBasicparty");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyIsNull() {
            addCriterion("endtime_basicparty is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyIsNotNull() {
            addCriterion("endtime_basicparty is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_basicparty =", value, "endtimeBasicparty");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_basicparty <>", value, "endtimeBasicparty");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime_basicparty >", value, "endtimeBasicparty");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_basicparty >=", value, "endtimeBasicparty");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyLessThan(Date value) {
            addCriterionForJDBCDate("endtime_basicparty <", value, "endtimeBasicparty");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_basicparty <=", value, "endtimeBasicparty");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_basicparty in", values, "endtimeBasicparty");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_basicparty not in", values, "endtimeBasicparty");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_basicparty between", value1, value2, "endtimeBasicparty");
            return (Criteria) this;
        }

        public Criteria andEndtimeBasicpartyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_basicparty not between", value1, value2, "endtimeBasicparty");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesIsNull() {
            addCriterion("administration_duties is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesIsNotNull() {
            addCriterion("administration_duties is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesEqualTo(String value) {
            addCriterion("administration_duties =", value, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesNotEqualTo(String value) {
            addCriterion("administration_duties <>", value, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesGreaterThan(String value) {
            addCriterion("administration_duties >", value, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("administration_duties >=", value, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesLessThan(String value) {
            addCriterion("administration_duties <", value, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesLessThanOrEqualTo(String value) {
            addCriterion("administration_duties <=", value, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesLike(String value) {
            addCriterion("administration_duties like", value, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesNotLike(String value) {
            addCriterion("administration_duties not like", value, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesIn(List<String> values) {
            addCriterion("administration_duties in", values, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesNotIn(List<String> values) {
            addCriterion("administration_duties not in", values, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesBetween(String value1, String value2) {
            addCriterion("administration_duties between", value1, value2, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrationDutiesNotBetween(String value1, String value2) {
            addCriterion("administration_duties not between", value1, value2, "administrationDuties");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationIsNull() {
            addCriterion("time_administration is null");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationIsNotNull() {
            addCriterion("time_administration is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationEqualTo(Date value) {
            addCriterionForJDBCDate("time_administration =", value, "timeAdministration");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationNotEqualTo(Date value) {
            addCriterionForJDBCDate("time_administration <>", value, "timeAdministration");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationGreaterThan(Date value) {
            addCriterionForJDBCDate("time_administration >", value, "timeAdministration");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_administration >=", value, "timeAdministration");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationLessThan(Date value) {
            addCriterionForJDBCDate("time_administration <", value, "timeAdministration");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_administration <=", value, "timeAdministration");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationIn(List<Date> values) {
            addCriterionForJDBCDate("time_administration in", values, "timeAdministration");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationNotIn(List<Date> values) {
            addCriterionForJDBCDate("time_administration not in", values, "timeAdministration");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_administration between", value1, value2, "timeAdministration");
            return (Criteria) this;
        }

        public Criteria andTimeAdministrationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_administration not between", value1, value2, "timeAdministration");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationIsNull() {
            addCriterion("endtime_administration is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationIsNotNull() {
            addCriterion("endtime_administration is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_administration =", value, "endtimeAdministration");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_administration <>", value, "endtimeAdministration");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime_administration >", value, "endtimeAdministration");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_administration >=", value, "endtimeAdministration");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationLessThan(Date value) {
            addCriterionForJDBCDate("endtime_administration <", value, "endtimeAdministration");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_administration <=", value, "endtimeAdministration");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_administration in", values, "endtimeAdministration");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_administration not in", values, "endtimeAdministration");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_administration between", value1, value2, "endtimeAdministration");
            return (Criteria) this;
        }

        public Criteria andEndtimeAdministrationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_administration not between", value1, value2, "endtimeAdministration");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesIsNull() {
            addCriterion("committee_duties is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesIsNotNull() {
            addCriterion("committee_duties is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesEqualTo(String value) {
            addCriterion("committee_duties =", value, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesNotEqualTo(String value) {
            addCriterion("committee_duties <>", value, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesGreaterThan(String value) {
            addCriterion("committee_duties >", value, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("committee_duties >=", value, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesLessThan(String value) {
            addCriterion("committee_duties <", value, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesLessThanOrEqualTo(String value) {
            addCriterion("committee_duties <=", value, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesLike(String value) {
            addCriterion("committee_duties like", value, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesNotLike(String value) {
            addCriterion("committee_duties not like", value, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesIn(List<String> values) {
            addCriterion("committee_duties in", values, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesNotIn(List<String> values) {
            addCriterion("committee_duties not in", values, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesBetween(String value1, String value2) {
            addCriterion("committee_duties between", value1, value2, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andCommitteeDutiesNotBetween(String value1, String value2) {
            addCriterion("committee_duties not between", value1, value2, "committeeDuties");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeIsNull() {
            addCriterion("time_committee is null");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeIsNotNull() {
            addCriterion("time_committee is not null");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeEqualTo(Date value) {
            addCriterionForJDBCDate("time_committee =", value, "timeCommittee");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time_committee <>", value, "timeCommittee");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeGreaterThan(Date value) {
            addCriterionForJDBCDate("time_committee >", value, "timeCommittee");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_committee >=", value, "timeCommittee");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeLessThan(Date value) {
            addCriterionForJDBCDate("time_committee <", value, "timeCommittee");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_committee <=", value, "timeCommittee");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeIn(List<Date> values) {
            addCriterionForJDBCDate("time_committee in", values, "timeCommittee");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time_committee not in", values, "timeCommittee");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_committee between", value1, value2, "timeCommittee");
            return (Criteria) this;
        }

        public Criteria andTimeCommitteeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_committee not between", value1, value2, "timeCommittee");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeIsNull() {
            addCriterion("endtime_committee is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeIsNotNull() {
            addCriterion("endtime_committee is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_committee =", value, "endtimeCommittee");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_committee <>", value, "endtimeCommittee");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime_committee >", value, "endtimeCommittee");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_committee >=", value, "endtimeCommittee");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeLessThan(Date value) {
            addCriterionForJDBCDate("endtime_committee <", value, "endtimeCommittee");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_committee <=", value, "endtimeCommittee");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_committee in", values, "endtimeCommittee");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_committee not in", values, "endtimeCommittee");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_committee between", value1, value2, "endtimeCommittee");
            return (Criteria) this;
        }

        public Criteria andEndtimeCommitteeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_committee not between", value1, value2, "endtimeCommittee");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberIsNull() {
            addCriterion("steering_member is null");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberIsNotNull() {
            addCriterion("steering_member is not null");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberEqualTo(String value) {
            addCriterion("steering_member =", value, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberNotEqualTo(String value) {
            addCriterion("steering_member <>", value, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberGreaterThan(String value) {
            addCriterion("steering_member >", value, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberGreaterThanOrEqualTo(String value) {
            addCriterion("steering_member >=", value, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberLessThan(String value) {
            addCriterion("steering_member <", value, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberLessThanOrEqualTo(String value) {
            addCriterion("steering_member <=", value, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberLike(String value) {
            addCriterion("steering_member like", value, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberNotLike(String value) {
            addCriterion("steering_member not like", value, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberIn(List<String> values) {
            addCriterion("steering_member in", values, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberNotIn(List<String> values) {
            addCriterion("steering_member not in", values, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberBetween(String value1, String value2) {
            addCriterion("steering_member between", value1, value2, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andSteeringMemberNotBetween(String value1, String value2) {
            addCriterion("steering_member not between", value1, value2, "steeringMember");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringIsNull() {
            addCriterion("time_steering is null");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringIsNotNull() {
            addCriterion("time_steering is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringEqualTo(Date value) {
            addCriterionForJDBCDate("time_steering =", value, "timeSteering");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringNotEqualTo(Date value) {
            addCriterionForJDBCDate("time_steering <>", value, "timeSteering");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringGreaterThan(Date value) {
            addCriterionForJDBCDate("time_steering >", value, "timeSteering");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_steering >=", value, "timeSteering");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringLessThan(Date value) {
            addCriterionForJDBCDate("time_steering <", value, "timeSteering");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_steering <=", value, "timeSteering");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringIn(List<Date> values) {
            addCriterionForJDBCDate("time_steering in", values, "timeSteering");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringNotIn(List<Date> values) {
            addCriterionForJDBCDate("time_steering not in", values, "timeSteering");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_steering between", value1, value2, "timeSteering");
            return (Criteria) this;
        }

        public Criteria andTimeSteeringNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_steering not between", value1, value2, "timeSteering");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringIsNull() {
            addCriterion("endtime_steering is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringIsNotNull() {
            addCriterion("endtime_steering is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_steering =", value, "endtimeSteering");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_steering <>", value, "endtimeSteering");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime_steering >", value, "endtimeSteering");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_steering >=", value, "endtimeSteering");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringLessThan(Date value) {
            addCriterionForJDBCDate("endtime_steering <", value, "endtimeSteering");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_steering <=", value, "endtimeSteering");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_steering in", values, "endtimeSteering");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_steering not in", values, "endtimeSteering");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_steering between", value1, value2, "endtimeSteering");
            return (Criteria) this;
        }

        public Criteria andEndtimeSteeringNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_steering not between", value1, value2, "endtimeSteering");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberIsNull() {
            addCriterion("organization_member is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberIsNotNull() {
            addCriterion("organization_member is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberEqualTo(String value) {
            addCriterion("organization_member =", value, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberNotEqualTo(String value) {
            addCriterion("organization_member <>", value, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberGreaterThan(String value) {
            addCriterion("organization_member >", value, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberGreaterThanOrEqualTo(String value) {
            addCriterion("organization_member >=", value, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberLessThan(String value) {
            addCriterion("organization_member <", value, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberLessThanOrEqualTo(String value) {
            addCriterion("organization_member <=", value, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberLike(String value) {
            addCriterion("organization_member like", value, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberNotLike(String value) {
            addCriterion("organization_member not like", value, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberIn(List<String> values) {
            addCriterion("organization_member in", values, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberNotIn(List<String> values) {
            addCriterion("organization_member not in", values, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberBetween(String value1, String value2) {
            addCriterion("organization_member between", value1, value2, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andOrganizationMemberNotBetween(String value1, String value2) {
            addCriterion("organization_member not between", value1, value2, "organizationMember");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationIsNull() {
            addCriterion("time_organization is null");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationIsNotNull() {
            addCriterion("time_organization is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationEqualTo(Date value) {
            addCriterionForJDBCDate("time_organization =", value, "timeOrganization");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationNotEqualTo(Date value) {
            addCriterionForJDBCDate("time_organization <>", value, "timeOrganization");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationGreaterThan(Date value) {
            addCriterionForJDBCDate("time_organization >", value, "timeOrganization");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_organization >=", value, "timeOrganization");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationLessThan(Date value) {
            addCriterionForJDBCDate("time_organization <", value, "timeOrganization");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_organization <=", value, "timeOrganization");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationIn(List<Date> values) {
            addCriterionForJDBCDate("time_organization in", values, "timeOrganization");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationNotIn(List<Date> values) {
            addCriterionForJDBCDate("time_organization not in", values, "timeOrganization");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_organization between", value1, value2, "timeOrganization");
            return (Criteria) this;
        }

        public Criteria andTimeOrganizationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_organization not between", value1, value2, "timeOrganization");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationIsNull() {
            addCriterion("endtime_organization is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationIsNotNull() {
            addCriterion("endtime_organization is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_organization =", value, "endtimeOrganization");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_organization <>", value, "endtimeOrganization");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime_organization >", value, "endtimeOrganization");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_organization >=", value, "endtimeOrganization");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationLessThan(Date value) {
            addCriterionForJDBCDate("endtime_organization <", value, "endtimeOrganization");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_organization <=", value, "endtimeOrganization");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_organization in", values, "endtimeOrganization");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_organization not in", values, "endtimeOrganization");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_organization between", value1, value2, "endtimeOrganization");
            return (Criteria) this;
        }

        public Criteria andEndtimeOrganizationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_organization not between", value1, value2, "endtimeOrganization");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesIsNull() {
            addCriterion("corporation_duties is null");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesIsNotNull() {
            addCriterion("corporation_duties is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesEqualTo(String value) {
            addCriterion("corporation_duties =", value, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesNotEqualTo(String value) {
            addCriterion("corporation_duties <>", value, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesGreaterThan(String value) {
            addCriterion("corporation_duties >", value, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("corporation_duties >=", value, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesLessThan(String value) {
            addCriterion("corporation_duties <", value, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesLessThanOrEqualTo(String value) {
            addCriterion("corporation_duties <=", value, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesLike(String value) {
            addCriterion("corporation_duties like", value, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesNotLike(String value) {
            addCriterion("corporation_duties not like", value, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesIn(List<String> values) {
            addCriterion("corporation_duties in", values, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesNotIn(List<String> values) {
            addCriterion("corporation_duties not in", values, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesBetween(String value1, String value2) {
            addCriterion("corporation_duties between", value1, value2, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andCorporationDutiesNotBetween(String value1, String value2) {
            addCriterion("corporation_duties not between", value1, value2, "corporationDuties");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationIsNull() {
            addCriterion("time_corporation is null");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationIsNotNull() {
            addCriterion("time_corporation is not null");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationEqualTo(Date value) {
            addCriterionForJDBCDate("time_corporation =", value, "timeCorporation");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationNotEqualTo(Date value) {
            addCriterionForJDBCDate("time_corporation <>", value, "timeCorporation");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationGreaterThan(Date value) {
            addCriterionForJDBCDate("time_corporation >", value, "timeCorporation");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_corporation >=", value, "timeCorporation");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationLessThan(Date value) {
            addCriterionForJDBCDate("time_corporation <", value, "timeCorporation");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_corporation <=", value, "timeCorporation");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationIn(List<Date> values) {
            addCriterionForJDBCDate("time_corporation in", values, "timeCorporation");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationNotIn(List<Date> values) {
            addCriterionForJDBCDate("time_corporation not in", values, "timeCorporation");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_corporation between", value1, value2, "timeCorporation");
            return (Criteria) this;
        }

        public Criteria andTimeCorporationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_corporation not between", value1, value2, "timeCorporation");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationIsNull() {
            addCriterion("endtime_corporation is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationIsNotNull() {
            addCriterion("endtime_corporation is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_corporation =", value, "endtimeCorporation");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_corporation <>", value, "endtimeCorporation");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime_corporation >", value, "endtimeCorporation");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_corporation >=", value, "endtimeCorporation");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationLessThan(Date value) {
            addCriterionForJDBCDate("endtime_corporation <", value, "endtimeCorporation");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime_corporation <=", value, "endtimeCorporation");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_corporation in", values, "endtimeCorporation");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime_corporation not in", values, "endtimeCorporation");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_corporation between", value1, value2, "endtimeCorporation");
            return (Criteria) this;
        }

        public Criteria andEndtimeCorporationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime_corporation not between", value1, value2, "endtimeCorporation");
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