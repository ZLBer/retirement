package test.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InformationOriginalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationOriginalExample() {
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

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("identity like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("identity not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIsNull() {
            addCriterion("education_level is null");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIsNotNull() {
            addCriterion("education_level is not null");
            return (Criteria) this;
        }

        public Criteria andEducationLevelEqualTo(String value) {
            addCriterion("education_level =", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotEqualTo(String value) {
            addCriterion("education_level <>", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelGreaterThan(String value) {
            addCriterion("education_level >", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelGreaterThanOrEqualTo(String value) {
            addCriterion("education_level >=", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLessThan(String value) {
            addCriterion("education_level <", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLessThanOrEqualTo(String value) {
            addCriterion("education_level <=", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLike(String value) {
            addCriterion("education_level like", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotLike(String value) {
            addCriterion("education_level not like", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIn(List<String> values) {
            addCriterion("education_level in", values, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotIn(List<String> values) {
            addCriterion("education_level not in", values, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelBetween(String value1, String value2) {
            addCriterion("education_level between", value1, value2, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotBetween(String value1, String value2) {
            addCriterion("education_level not between", value1, value2, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceIsNull() {
            addCriterion("origin_workplace is null");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceIsNotNull() {
            addCriterion("origin_workplace is not null");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceEqualTo(String value) {
            addCriterion("origin_workplace =", value, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceNotEqualTo(String value) {
            addCriterion("origin_workplace <>", value, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceGreaterThan(String value) {
            addCriterion("origin_workplace >", value, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("origin_workplace >=", value, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceLessThan(String value) {
            addCriterion("origin_workplace <", value, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceLessThanOrEqualTo(String value) {
            addCriterion("origin_workplace <=", value, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceLike(String value) {
            addCriterion("origin_workplace like", value, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceNotLike(String value) {
            addCriterion("origin_workplace not like", value, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceIn(List<String> values) {
            addCriterion("origin_workplace in", values, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceNotIn(List<String> values) {
            addCriterion("origin_workplace not in", values, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceBetween(String value1, String value2) {
            addCriterion("origin_workplace between", value1, value2, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginWorkplaceNotBetween(String value1, String value2) {
            addCriterion("origin_workplace not between", value1, value2, "originWorkplace");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesIsNull() {
            addCriterion("origin_duties is null");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesIsNotNull() {
            addCriterion("origin_duties is not null");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesEqualTo(String value) {
            addCriterion("origin_duties =", value, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesNotEqualTo(String value) {
            addCriterion("origin_duties <>", value, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesGreaterThan(String value) {
            addCriterion("origin_duties >", value, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("origin_duties >=", value, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesLessThan(String value) {
            addCriterion("origin_duties <", value, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesLessThanOrEqualTo(String value) {
            addCriterion("origin_duties <=", value, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesLike(String value) {
            addCriterion("origin_duties like", value, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesNotLike(String value) {
            addCriterion("origin_duties not like", value, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesIn(List<String> values) {
            addCriterion("origin_duties in", values, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesNotIn(List<String> values) {
            addCriterion("origin_duties not in", values, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesBetween(String value1, String value2) {
            addCriterion("origin_duties between", value1, value2, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOriginDutiesNotBetween(String value1, String value2) {
            addCriterion("origin_duties not between", value1, value2, "originDuties");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelIsNull() {
            addCriterion("orgin_duties_level is null");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelIsNotNull() {
            addCriterion("orgin_duties_level is not null");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelEqualTo(String value) {
            addCriterion("orgin_duties_level =", value, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelNotEqualTo(String value) {
            addCriterion("orgin_duties_level <>", value, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelGreaterThan(String value) {
            addCriterion("orgin_duties_level >", value, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelGreaterThanOrEqualTo(String value) {
            addCriterion("orgin_duties_level >=", value, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelLessThan(String value) {
            addCriterion("orgin_duties_level <", value, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelLessThanOrEqualTo(String value) {
            addCriterion("orgin_duties_level <=", value, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelLike(String value) {
            addCriterion("orgin_duties_level like", value, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelNotLike(String value) {
            addCriterion("orgin_duties_level not like", value, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelIn(List<String> values) {
            addCriterion("orgin_duties_level in", values, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelNotIn(List<String> values) {
            addCriterion("orgin_duties_level not in", values, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelBetween(String value1, String value2) {
            addCriterion("orgin_duties_level between", value1, value2, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOrginDutiesLevelNotBetween(String value1, String value2) {
            addCriterion("orgin_duties_level not between", value1, value2, "orginDutiesLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalIsNull() {
            addCriterion("origin_professional is null");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalIsNotNull() {
            addCriterion("origin_professional is not null");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalEqualTo(String value) {
            addCriterion("origin_professional =", value, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalNotEqualTo(String value) {
            addCriterion("origin_professional <>", value, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalGreaterThan(String value) {
            addCriterion("origin_professional >", value, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("origin_professional >=", value, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLessThan(String value) {
            addCriterion("origin_professional <", value, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLessThanOrEqualTo(String value) {
            addCriterion("origin_professional <=", value, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLike(String value) {
            addCriterion("origin_professional like", value, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalNotLike(String value) {
            addCriterion("origin_professional not like", value, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalIn(List<String> values) {
            addCriterion("origin_professional in", values, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalNotIn(List<String> values) {
            addCriterion("origin_professional not in", values, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalBetween(String value1, String value2) {
            addCriterion("origin_professional between", value1, value2, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalNotBetween(String value1, String value2) {
            addCriterion("origin_professional not between", value1, value2, "originProfessional");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelIsNull() {
            addCriterion("origin_professional_level is null");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelIsNotNull() {
            addCriterion("origin_professional_level is not null");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelEqualTo(String value) {
            addCriterion("origin_professional_level =", value, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelNotEqualTo(String value) {
            addCriterion("origin_professional_level <>", value, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelGreaterThan(String value) {
            addCriterion("origin_professional_level >", value, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelGreaterThanOrEqualTo(String value) {
            addCriterion("origin_professional_level >=", value, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelLessThan(String value) {
            addCriterion("origin_professional_level <", value, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelLessThanOrEqualTo(String value) {
            addCriterion("origin_professional_level <=", value, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelLike(String value) {
            addCriterion("origin_professional_level like", value, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelNotLike(String value) {
            addCriterion("origin_professional_level not like", value, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelIn(List<String> values) {
            addCriterion("origin_professional_level in", values, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelNotIn(List<String> values) {
            addCriterion("origin_professional_level not in", values, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelBetween(String value1, String value2) {
            addCriterion("origin_professional_level between", value1, value2, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andOriginProfessionalLevelNotBetween(String value1, String value2) {
            addCriterion("origin_professional_level not between", value1, value2, "originProfessionalLevel");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNull() {
            addCriterion("treatment is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNotNull() {
            addCriterion("treatment is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentEqualTo(String value) {
            addCriterion("treatment =", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotEqualTo(String value) {
            addCriterion("treatment <>", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThan(String value) {
            addCriterion("treatment >", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("treatment >=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThan(String value) {
            addCriterion("treatment <", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThanOrEqualTo(String value) {
            addCriterion("treatment <=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLike(String value) {
            addCriterion("treatment like", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotLike(String value) {
            addCriterion("treatment not like", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentIn(List<String> values) {
            addCriterion("treatment in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotIn(List<String> values) {
            addCriterion("treatment not in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentBetween(String value1, String value2) {
            addCriterion("treatment between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotBetween(String value1, String value2) {
            addCriterion("treatment not between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andTimeWorkIsNull() {
            addCriterion("time_work is null");
            return (Criteria) this;
        }

        public Criteria andTimeWorkIsNotNull() {
            addCriterion("time_work is not null");
            return (Criteria) this;
        }

        public Criteria andTimeWorkEqualTo(Date value) {
            addCriterionForJDBCDate("time_work =", value, "timeWork");
            return (Criteria) this;
        }

        public Criteria andTimeWorkNotEqualTo(Date value) {
            addCriterionForJDBCDate("time_work <>", value, "timeWork");
            return (Criteria) this;
        }

        public Criteria andTimeWorkGreaterThan(Date value) {
            addCriterionForJDBCDate("time_work >", value, "timeWork");
            return (Criteria) this;
        }

        public Criteria andTimeWorkGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_work >=", value, "timeWork");
            return (Criteria) this;
        }

        public Criteria andTimeWorkLessThan(Date value) {
            addCriterionForJDBCDate("time_work <", value, "timeWork");
            return (Criteria) this;
        }

        public Criteria andTimeWorkLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_work <=", value, "timeWork");
            return (Criteria) this;
        }

        public Criteria andTimeWorkIn(List<Date> values) {
            addCriterionForJDBCDate("time_work in", values, "timeWork");
            return (Criteria) this;
        }

        public Criteria andTimeWorkNotIn(List<Date> values) {
            addCriterionForJDBCDate("time_work not in", values, "timeWork");
            return (Criteria) this;
        }

        public Criteria andTimeWorkBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_work between", value1, value2, "timeWork");
            return (Criteria) this;
        }

        public Criteria andTimeWorkNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_work not between", value1, value2, "timeWork");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementIsNull() {
            addCriterion("time_retirement is null");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementIsNotNull() {
            addCriterion("time_retirement is not null");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementEqualTo(Date value) {
            addCriterionForJDBCDate("time_retirement =", value, "timeRetirement");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementNotEqualTo(Date value) {
            addCriterionForJDBCDate("time_retirement <>", value, "timeRetirement");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementGreaterThan(Date value) {
            addCriterionForJDBCDate("time_retirement >", value, "timeRetirement");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_retirement >=", value, "timeRetirement");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementLessThan(Date value) {
            addCriterionForJDBCDate("time_retirement <", value, "timeRetirement");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_retirement <=", value, "timeRetirement");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementIn(List<Date> values) {
            addCriterionForJDBCDate("time_retirement in", values, "timeRetirement");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementNotIn(List<Date> values) {
            addCriterionForJDBCDate("time_retirement not in", values, "timeRetirement");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_retirement between", value1, value2, "timeRetirement");
            return (Criteria) this;
        }

        public Criteria andTimeRetirementNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_retirement not between", value1, value2, "timeRetirement");
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