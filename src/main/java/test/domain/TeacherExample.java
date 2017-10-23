package test.domain;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentIsNull() {
            addCriterion("teacher_department is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentIsNotNull() {
            addCriterion("teacher_department is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentEqualTo(Integer value) {
            addCriterion("teacher_department =", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentNotEqualTo(Integer value) {
            addCriterion("teacher_department <>", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentGreaterThan(Integer value) {
            addCriterion("teacher_department >", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_department >=", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentLessThan(Integer value) {
            addCriterion("teacher_department <", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_department <=", value, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentIn(List<Integer> values) {
            addCriterion("teacher_department in", values, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentNotIn(List<Integer> values) {
            addCriterion("teacher_department not in", values, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("teacher_department between", value1, value2, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_department not between", value1, value2, "teacherDepartment");
            return (Criteria) this;
        }

        public Criteria andTeacherTelIsNull() {
            addCriterion("teacher_tel is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTelIsNotNull() {
            addCriterion("teacher_tel is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTelEqualTo(String value) {
            addCriterion("teacher_tel =", value, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherTelNotEqualTo(String value) {
            addCriterion("teacher_tel <>", value, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherTelGreaterThan(String value) {
            addCriterion("teacher_tel >", value, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherTelGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_tel >=", value, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherTelLessThan(String value) {
            addCriterion("teacher_tel <", value, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherTelLessThanOrEqualTo(String value) {
            addCriterion("teacher_tel <=", value, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherTelLike(String value) {
            addCriterion("teacher_tel like", value, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherTelNotLike(String value) {
            addCriterion("teacher_tel not like", value, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherTelIn(List<String> values) {
            addCriterion("teacher_tel in", values, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherTelNotIn(List<String> values) {
            addCriterion("teacher_tel not in", values, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherTelBetween(String value1, String value2) {
            addCriterion("teacher_tel between", value1, value2, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherTelNotBetween(String value1, String value2) {
            addCriterion("teacher_tel not between", value1, value2, "teacherTel");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalIsNull() {
            addCriterion("teacher_professional is null");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalIsNotNull() {
            addCriterion("teacher_professional is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalEqualTo(String value) {
            addCriterion("teacher_professional =", value, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalNotEqualTo(String value) {
            addCriterion("teacher_professional <>", value, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalGreaterThan(String value) {
            addCriterion("teacher_professional >", value, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_professional >=", value, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalLessThan(String value) {
            addCriterion("teacher_professional <", value, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalLessThanOrEqualTo(String value) {
            addCriterion("teacher_professional <=", value, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalLike(String value) {
            addCriterion("teacher_professional like", value, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalNotLike(String value) {
            addCriterion("teacher_professional not like", value, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalIn(List<String> values) {
            addCriterion("teacher_professional in", values, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalNotIn(List<String> values) {
            addCriterion("teacher_professional not in", values, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalBetween(String value1, String value2) {
            addCriterion("teacher_professional between", value1, value2, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherProfessionalNotBetween(String value1, String value2) {
            addCriterion("teacher_professional not between", value1, value2, "teacherProfessional");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberIsNull() {
            addCriterion("teacher_snumber is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberIsNotNull() {
            addCriterion("teacher_snumber is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberEqualTo(Integer value) {
            addCriterion("teacher_snumber =", value, "teacherSnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberNotEqualTo(Integer value) {
            addCriterion("teacher_snumber <>", value, "teacherSnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberGreaterThan(Integer value) {
            addCriterion("teacher_snumber >", value, "teacherSnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_snumber >=", value, "teacherSnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberLessThan(Integer value) {
            addCriterion("teacher_snumber <", value, "teacherSnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_snumber <=", value, "teacherSnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberIn(List<Integer> values) {
            addCriterion("teacher_snumber in", values, "teacherSnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberNotIn(List<Integer> values) {
            addCriterion("teacher_snumber not in", values, "teacherSnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberBetween(Integer value1, Integer value2) {
            addCriterion("teacher_snumber between", value1, value2, "teacherSnumber");
            return (Criteria) this;
        }

        public Criteria andTeacherSnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_snumber not between", value1, value2, "teacherSnumber");
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