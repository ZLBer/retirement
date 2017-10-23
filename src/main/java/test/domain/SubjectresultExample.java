package test.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubjectresultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectresultExample() {
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

        public Criteria andResultIdIsNull() {
            addCriterion("result_id is null");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNotNull() {
            addCriterion("result_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultIdEqualTo(Integer value) {
            addCriterion("result_id =", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotEqualTo(Integer value) {
            addCriterion("result_id <>", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThan(Integer value) {
            addCriterion("result_id >", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_id >=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThan(Integer value) {
            addCriterion("result_id <", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThanOrEqualTo(Integer value) {
            addCriterion("result_id <=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdIn(List<Integer> values) {
            addCriterion("result_id in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotIn(List<Integer> values) {
            addCriterion("result_id not in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdBetween(Integer value1, Integer value2) {
            addCriterion("result_id between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("result_id not between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultStudentIsNull() {
            addCriterion("result_student is null");
            return (Criteria) this;
        }

        public Criteria andResultStudentIsNotNull() {
            addCriterion("result_student is not null");
            return (Criteria) this;
        }

        public Criteria andResultStudentEqualTo(Integer value) {
            addCriterion("result_student =", value, "resultStudent");
            return (Criteria) this;
        }

        public Criteria andResultStudentNotEqualTo(Integer value) {
            addCriterion("result_student <>", value, "resultStudent");
            return (Criteria) this;
        }

        public Criteria andResultStudentGreaterThan(Integer value) {
            addCriterion("result_student >", value, "resultStudent");
            return (Criteria) this;
        }

        public Criteria andResultStudentGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_student >=", value, "resultStudent");
            return (Criteria) this;
        }

        public Criteria andResultStudentLessThan(Integer value) {
            addCriterion("result_student <", value, "resultStudent");
            return (Criteria) this;
        }

        public Criteria andResultStudentLessThanOrEqualTo(Integer value) {
            addCriterion("result_student <=", value, "resultStudent");
            return (Criteria) this;
        }

        public Criteria andResultStudentIn(List<Integer> values) {
            addCriterion("result_student in", values, "resultStudent");
            return (Criteria) this;
        }

        public Criteria andResultStudentNotIn(List<Integer> values) {
            addCriterion("result_student not in", values, "resultStudent");
            return (Criteria) this;
        }

        public Criteria andResultStudentBetween(Integer value1, Integer value2) {
            addCriterion("result_student between", value1, value2, "resultStudent");
            return (Criteria) this;
        }

        public Criteria andResultStudentNotBetween(Integer value1, Integer value2) {
            addCriterion("result_student not between", value1, value2, "resultStudent");
            return (Criteria) this;
        }

        public Criteria andResultSubjectIsNull() {
            addCriterion("result_subject is null");
            return (Criteria) this;
        }

        public Criteria andResultSubjectIsNotNull() {
            addCriterion("result_subject is not null");
            return (Criteria) this;
        }

        public Criteria andResultSubjectEqualTo(Integer value) {
            addCriterion("result_subject =", value, "resultSubject");
            return (Criteria) this;
        }

        public Criteria andResultSubjectNotEqualTo(Integer value) {
            addCriterion("result_subject <>", value, "resultSubject");
            return (Criteria) this;
        }

        public Criteria andResultSubjectGreaterThan(Integer value) {
            addCriterion("result_subject >", value, "resultSubject");
            return (Criteria) this;
        }

        public Criteria andResultSubjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_subject >=", value, "resultSubject");
            return (Criteria) this;
        }

        public Criteria andResultSubjectLessThan(Integer value) {
            addCriterion("result_subject <", value, "resultSubject");
            return (Criteria) this;
        }

        public Criteria andResultSubjectLessThanOrEqualTo(Integer value) {
            addCriterion("result_subject <=", value, "resultSubject");
            return (Criteria) this;
        }

        public Criteria andResultSubjectIn(List<Integer> values) {
            addCriterion("result_subject in", values, "resultSubject");
            return (Criteria) this;
        }

        public Criteria andResultSubjectNotIn(List<Integer> values) {
            addCriterion("result_subject not in", values, "resultSubject");
            return (Criteria) this;
        }

        public Criteria andResultSubjectBetween(Integer value1, Integer value2) {
            addCriterion("result_subject between", value1, value2, "resultSubject");
            return (Criteria) this;
        }

        public Criteria andResultSubjectNotBetween(Integer value1, Integer value2) {
            addCriterion("result_subject not between", value1, value2, "resultSubject");
            return (Criteria) this;
        }

        public Criteria andResultTimeIsNull() {
            addCriterion("result_time is null");
            return (Criteria) this;
        }

        public Criteria andResultTimeIsNotNull() {
            addCriterion("result_time is not null");
            return (Criteria) this;
        }

        public Criteria andResultTimeEqualTo(Date value) {
            addCriterion("result_time =", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeNotEqualTo(Date value) {
            addCriterion("result_time <>", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeGreaterThan(Date value) {
            addCriterion("result_time >", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("result_time >=", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeLessThan(Date value) {
            addCriterion("result_time <", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeLessThanOrEqualTo(Date value) {
            addCriterion("result_time <=", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeIn(List<Date> values) {
            addCriterion("result_time in", values, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeNotIn(List<Date> values) {
            addCriterion("result_time not in", values, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeBetween(Date value1, Date value2) {
            addCriterion("result_time between", value1, value2, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeNotBetween(Date value1, Date value2) {
            addCriterion("result_time not between", value1, value2, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultStateIsNull() {
            addCriterion("result_state is null");
            return (Criteria) this;
        }

        public Criteria andResultStateIsNotNull() {
            addCriterion("result_state is not null");
            return (Criteria) this;
        }

        public Criteria andResultStateEqualTo(Integer value) {
            addCriterion("result_state =", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotEqualTo(Integer value) {
            addCriterion("result_state <>", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateGreaterThan(Integer value) {
            addCriterion("result_state >", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_state >=", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateLessThan(Integer value) {
            addCriterion("result_state <", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateLessThanOrEqualTo(Integer value) {
            addCriterion("result_state <=", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateIn(List<Integer> values) {
            addCriterion("result_state in", values, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotIn(List<Integer> values) {
            addCriterion("result_state not in", values, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateBetween(Integer value1, Integer value2) {
            addCriterion("result_state between", value1, value2, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotBetween(Integer value1, Integer value2) {
            addCriterion("result_state not between", value1, value2, "resultState");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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