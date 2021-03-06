package test.domain;

import java.util.ArrayList;
import java.util.List;

public class InformationSupplementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationSupplementExample() {
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

        public Criteria andSpouseIsNull() {
            addCriterion("spouse is null");
            return (Criteria) this;
        }

        public Criteria andSpouseIsNotNull() {
            addCriterion("spouse is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseEqualTo(String value) {
            addCriterion("spouse =", value, "spouse");
            return (Criteria) this;
        }

        public Criteria andSpouseNotEqualTo(String value) {
            addCriterion("spouse <>", value, "spouse");
            return (Criteria) this;
        }

        public Criteria andSpouseGreaterThan(String value) {
            addCriterion("spouse >", value, "spouse");
            return (Criteria) this;
        }

        public Criteria andSpouseGreaterThanOrEqualTo(String value) {
            addCriterion("spouse >=", value, "spouse");
            return (Criteria) this;
        }

        public Criteria andSpouseLessThan(String value) {
            addCriterion("spouse <", value, "spouse");
            return (Criteria) this;
        }

        public Criteria andSpouseLessThanOrEqualTo(String value) {
            addCriterion("spouse <=", value, "spouse");
            return (Criteria) this;
        }

        public Criteria andSpouseLike(String value) {
            addCriterion("spouse like", value, "spouse");
            return (Criteria) this;
        }

        public Criteria andSpouseNotLike(String value) {
            addCriterion("spouse not like", value, "spouse");
            return (Criteria) this;
        }

        public Criteria andSpouseIn(List<String> values) {
            addCriterion("spouse in", values, "spouse");
            return (Criteria) this;
        }

        public Criteria andSpouseNotIn(List<String> values) {
            addCriterion("spouse not in", values, "spouse");
            return (Criteria) this;
        }

        public Criteria andSpouseBetween(String value1, String value2) {
            addCriterion("spouse between", value1, value2, "spouse");
            return (Criteria) this;
        }

        public Criteria andSpouseNotBetween(String value1, String value2) {
            addCriterion("spouse not between", value1, value2, "spouse");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenIsNull() {
            addCriterion("status_children is null");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenIsNotNull() {
            addCriterion("status_children is not null");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenEqualTo(String value) {
            addCriterion("status_children =", value, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenNotEqualTo(String value) {
            addCriterion("status_children <>", value, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenGreaterThan(String value) {
            addCriterion("status_children >", value, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenGreaterThanOrEqualTo(String value) {
            addCriterion("status_children >=", value, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenLessThan(String value) {
            addCriterion("status_children <", value, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenLessThanOrEqualTo(String value) {
            addCriterion("status_children <=", value, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenLike(String value) {
            addCriterion("status_children like", value, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenNotLike(String value) {
            addCriterion("status_children not like", value, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenIn(List<String> values) {
            addCriterion("status_children in", values, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenNotIn(List<String> values) {
            addCriterion("status_children not in", values, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenBetween(String value1, String value2) {
            addCriterion("status_children between", value1, value2, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andStatusChildrenNotBetween(String value1, String value2) {
            addCriterion("status_children not between", value1, value2, "statusChildren");
            return (Criteria) this;
        }

        public Criteria andLivingConditionIsNull() {
            addCriterion("living_condition is null");
            return (Criteria) this;
        }

        public Criteria andLivingConditionIsNotNull() {
            addCriterion("living_condition is not null");
            return (Criteria) this;
        }

        public Criteria andLivingConditionEqualTo(String value) {
            addCriterion("living_condition =", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionNotEqualTo(String value) {
            addCriterion("living_condition <>", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionGreaterThan(String value) {
            addCriterion("living_condition >", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionGreaterThanOrEqualTo(String value) {
            addCriterion("living_condition >=", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionLessThan(String value) {
            addCriterion("living_condition <", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionLessThanOrEqualTo(String value) {
            addCriterion("living_condition <=", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionLike(String value) {
            addCriterion("living_condition like", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionNotLike(String value) {
            addCriterion("living_condition not like", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionIn(List<String> values) {
            addCriterion("living_condition in", values, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionNotIn(List<String> values) {
            addCriterion("living_condition not in", values, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionBetween(String value1, String value2) {
            addCriterion("living_condition between", value1, value2, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionNotBetween(String value1, String value2) {
            addCriterion("living_condition not between", value1, value2, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andStatusOtherIsNull() {
            addCriterion("status_other is null");
            return (Criteria) this;
        }

        public Criteria andStatusOtherIsNotNull() {
            addCriterion("status_other is not null");
            return (Criteria) this;
        }

        public Criteria andStatusOtherEqualTo(String value) {
            addCriterion("status_other =", value, "statusOther");
            return (Criteria) this;
        }

        public Criteria andStatusOtherNotEqualTo(String value) {
            addCriterion("status_other <>", value, "statusOther");
            return (Criteria) this;
        }

        public Criteria andStatusOtherGreaterThan(String value) {
            addCriterion("status_other >", value, "statusOther");
            return (Criteria) this;
        }

        public Criteria andStatusOtherGreaterThanOrEqualTo(String value) {
            addCriterion("status_other >=", value, "statusOther");
            return (Criteria) this;
        }

        public Criteria andStatusOtherLessThan(String value) {
            addCriterion("status_other <", value, "statusOther");
            return (Criteria) this;
        }

        public Criteria andStatusOtherLessThanOrEqualTo(String value) {
            addCriterion("status_other <=", value, "statusOther");
            return (Criteria) this;
        }

        public Criteria andStatusOtherLike(String value) {
            addCriterion("status_other like", value, "statusOther");
            return (Criteria) this;
        }

        public Criteria andStatusOtherNotLike(String value) {
            addCriterion("status_other not like", value, "statusOther");
            return (Criteria) this;
        }

        public Criteria andStatusOtherIn(List<String> values) {
            addCriterion("status_other in", values, "statusOther");
            return (Criteria) this;
        }

        public Criteria andStatusOtherNotIn(List<String> values) {
            addCriterion("status_other not in", values, "statusOther");
            return (Criteria) this;
        }

        public Criteria andStatusOtherBetween(String value1, String value2) {
            addCriterion("status_other between", value1, value2, "statusOther");
            return (Criteria) this;
        }

        public Criteria andStatusOtherNotBetween(String value1, String value2) {
            addCriterion("status_other not between", value1, value2, "statusOther");
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