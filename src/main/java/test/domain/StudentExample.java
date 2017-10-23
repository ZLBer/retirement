package test.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {



    protected Integer startRow;

    protected Integer pageSize;
    public Integer getStartRow() {
        return startRow;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("student_sex is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(String value) {
            addCriterion("student_sex =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(String value) {
            addCriterion("student_sex <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(String value) {
            addCriterion("student_sex >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(String value) {
            addCriterion("student_sex >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(String value) {
            addCriterion("student_sex <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(String value) {
            addCriterion("student_sex <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLike(String value) {
            addCriterion("student_sex like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotLike(String value) {
            addCriterion("student_sex not like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<String> values) {
            addCriterion("student_sex in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<String> values) {
            addCriterion("student_sex not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(String value1, String value2) {
            addCriterion("student_sex between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(String value1, String value2) {
            addCriterion("student_sex not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeIsNull() {
            addCriterion("student_college is null");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeIsNotNull() {
            addCriterion("student_college is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeEqualTo(Integer value) {
            addCriterion("student_college =", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeNotEqualTo(Integer value) {
            addCriterion("student_college <>", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeGreaterThan(Integer value) {
            addCriterion("student_college >", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_college >=", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeLessThan(Integer value) {
            addCriterion("student_college <", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeLessThanOrEqualTo(Integer value) {
            addCriterion("student_college <=", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeIn(List<Integer> values) {
            addCriterion("student_college in", values, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeNotIn(List<Integer> values) {
            addCriterion("student_college not in", values, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeBetween(Integer value1, Integer value2) {
            addCriterion("student_college between", value1, value2, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_college not between", value1, value2, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIsNull() {
            addCriterion("student_major is null");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIsNotNull() {
            addCriterion("student_major is not null");
            return (Criteria) this;
        }

        public Criteria andStudentMajorEqualTo(Integer value) {
            addCriterion("student_major =", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotEqualTo(Integer value) {
            addCriterion("student_major <>", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorGreaterThan(Integer value) {
            addCriterion("student_major >", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_major >=", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLessThan(Integer value) {
            addCriterion("student_major <", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLessThanOrEqualTo(Integer value) {
            addCriterion("student_major <=", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIn(List<Integer> values) {
            addCriterion("student_major in", values, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotIn(List<Integer> values) {
            addCriterion("student_major not in", values, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorBetween(Integer value1, Integer value2) {
            addCriterion("student_major between", value1, value2, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotBetween(Integer value1, Integer value2) {
            addCriterion("student_major not between", value1, value2, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentTelIsNull() {
            addCriterion("student_tel is null");
            return (Criteria) this;
        }

        public Criteria andStudentTelIsNotNull() {
            addCriterion("student_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTelEqualTo(String value) {
            addCriterion("student_tel =", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelNotEqualTo(String value) {
            addCriterion("student_tel <>", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelGreaterThan(String value) {
            addCriterion("student_tel >", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelGreaterThanOrEqualTo(String value) {
            addCriterion("student_tel >=", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelLessThan(String value) {
            addCriterion("student_tel <", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelLessThanOrEqualTo(String value) {
            addCriterion("student_tel <=", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelLike(String value) {
            addCriterion("student_tel like", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelNotLike(String value) {
            addCriterion("student_tel not like", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelIn(List<String> values) {
            addCriterion("student_tel in", values, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelNotIn(List<String> values) {
            addCriterion("student_tel not in", values, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelBetween(String value1, String value2) {
            addCriterion("student_tel between", value1, value2, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelNotBetween(String value1, String value2) {
            addCriterion("student_tel not between", value1, value2, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNull() {
            addCriterion("student_email is null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNotNull() {
            addCriterion("student_email is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailEqualTo(String value) {
            addCriterion("student_email =", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotEqualTo(String value) {
            addCriterion("student_email <>", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThan(String value) {
            addCriterion("student_email >", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("student_email >=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThan(String value) {
            addCriterion("student_email <", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("student_email <=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLike(String value) {
            addCriterion("student_email like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotLike(String value) {
            addCriterion("student_email not like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIn(List<String> values) {
            addCriterion("student_email in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotIn(List<String> values) {
            addCriterion("student_email not in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailBetween(String value1, String value2) {
            addCriterion("student_email between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotBetween(String value1, String value2) {
            addCriterion("student_email not between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNull() {
            addCriterion("student_qq is null");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNotNull() {
            addCriterion("student_qq is not null");
            return (Criteria) this;
        }

        public Criteria andStudentQqEqualTo(String value) {
            addCriterion("student_qq =", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotEqualTo(String value) {
            addCriterion("student_qq <>", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThan(String value) {
            addCriterion("student_qq >", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThanOrEqualTo(String value) {
            addCriterion("student_qq >=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThan(String value) {
            addCriterion("student_qq <", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThanOrEqualTo(String value) {
            addCriterion("student_qq <=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLike(String value) {
            addCriterion("student_qq like", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotLike(String value) {
            addCriterion("student_qq not like", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqIn(List<String> values) {
            addCriterion("student_qq in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotIn(List<String> values) {
            addCriterion("student_qq not in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqBetween(String value1, String value2) {
            addCriterion("student_qq between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotBetween(String value1, String value2) {
            addCriterion("student_qq not between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentStateIsNull() {
            addCriterion("student_state is null");
            return (Criteria) this;
        }

        public Criteria andStudentStateIsNotNull() {
            addCriterion("student_state is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStateEqualTo(Integer value) {
            addCriterion("student_state =", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateNotEqualTo(Integer value) {
            addCriterion("student_state <>", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateGreaterThan(Integer value) {
            addCriterion("student_state >", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_state >=", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateLessThan(Integer value) {
            addCriterion("student_state <", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateLessThanOrEqualTo(Integer value) {
            addCriterion("student_state <=", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateIn(List<Integer> values) {
            addCriterion("student_state in", values, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateNotIn(List<Integer> values) {
            addCriterion("student_state not in", values, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateBetween(Integer value1, Integer value2) {
            addCriterion("student_state between", value1, value2, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("student_state not between", value1, value2, "studentState");
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