package test.domain;

import java.util.ArrayList;
import java.util.List;

public class InformationContactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationContactExample() {
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

        public Criteria andHomeAddressIsNull() {
            addCriterion("home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("home_address not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeIsNull() {
            addCriterion("phone_home is null");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeIsNotNull() {
            addCriterion("phone_home is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeEqualTo(String value) {
            addCriterion("phone_home =", value, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeNotEqualTo(String value) {
            addCriterion("phone_home <>", value, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeGreaterThan(String value) {
            addCriterion("phone_home >", value, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeGreaterThanOrEqualTo(String value) {
            addCriterion("phone_home >=", value, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeLessThan(String value) {
            addCriterion("phone_home <", value, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeLessThanOrEqualTo(String value) {
            addCriterion("phone_home <=", value, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeLike(String value) {
            addCriterion("phone_home like", value, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeNotLike(String value) {
            addCriterion("phone_home not like", value, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeIn(List<String> values) {
            addCriterion("phone_home in", values, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeNotIn(List<String> values) {
            addCriterion("phone_home not in", values, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeBetween(String value1, String value2) {
            addCriterion("phone_home between", value1, value2, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneHomeNotBetween(String value1, String value2) {
            addCriterion("phone_home not between", value1, value2, "phoneHome");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnIsNull() {
            addCriterion("phone_own is null");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnIsNotNull() {
            addCriterion("phone_own is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnEqualTo(String value) {
            addCriterion("phone_own =", value, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnNotEqualTo(String value) {
            addCriterion("phone_own <>", value, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnGreaterThan(String value) {
            addCriterion("phone_own >", value, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnGreaterThanOrEqualTo(String value) {
            addCriterion("phone_own >=", value, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnLessThan(String value) {
            addCriterion("phone_own <", value, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnLessThanOrEqualTo(String value) {
            addCriterion("phone_own <=", value, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnLike(String value) {
            addCriterion("phone_own like", value, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnNotLike(String value) {
            addCriterion("phone_own not like", value, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnIn(List<String> values) {
            addCriterion("phone_own in", values, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnNotIn(List<String> values) {
            addCriterion("phone_own not in", values, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnBetween(String value1, String value2) {
            addCriterion("phone_own between", value1, value2, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneOwnNotBetween(String value1, String value2) {
            addCriterion("phone_own not between", value1, value2, "phoneOwn");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenIsNull() {
            addCriterion("phone_children is null");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenIsNotNull() {
            addCriterion("phone_children is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenEqualTo(String value) {
            addCriterion("phone_children =", value, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenNotEqualTo(String value) {
            addCriterion("phone_children <>", value, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenGreaterThan(String value) {
            addCriterion("phone_children >", value, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenGreaterThanOrEqualTo(String value) {
            addCriterion("phone_children >=", value, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenLessThan(String value) {
            addCriterion("phone_children <", value, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenLessThanOrEqualTo(String value) {
            addCriterion("phone_children <=", value, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenLike(String value) {
            addCriterion("phone_children like", value, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenNotLike(String value) {
            addCriterion("phone_children not like", value, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenIn(List<String> values) {
            addCriterion("phone_children in", values, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenNotIn(List<String> values) {
            addCriterion("phone_children not in", values, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenBetween(String value1, String value2) {
            addCriterion("phone_children between", value1, value2, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneChildrenNotBetween(String value1, String value2) {
            addCriterion("phone_children not between", value1, value2, "phoneChildren");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherIsNull() {
            addCriterion("phone_other is null");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherIsNotNull() {
            addCriterion("phone_other is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherEqualTo(String value) {
            addCriterion("phone_other =", value, "phoneOther");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherNotEqualTo(String value) {
            addCriterion("phone_other <>", value, "phoneOther");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherGreaterThan(String value) {
            addCriterion("phone_other >", value, "phoneOther");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherGreaterThanOrEqualTo(String value) {
            addCriterion("phone_other >=", value, "phoneOther");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherLessThan(String value) {
            addCriterion("phone_other <", value, "phoneOther");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherLessThanOrEqualTo(String value) {
            addCriterion("phone_other <=", value, "phoneOther");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherLike(String value) {
            addCriterion("phone_other like", value, "phoneOther");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherNotLike(String value) {
            addCriterion("phone_other not like", value, "phoneOther");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherIn(List<String> values) {
            addCriterion("phone_other in", values, "phoneOther");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherNotIn(List<String> values) {
            addCriterion("phone_other not in", values, "phoneOther");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherBetween(String value1, String value2) {
            addCriterion("phone_other between", value1, value2, "phoneOther");
            return (Criteria) this;
        }

        public Criteria andPhoneOtherNotBetween(String value1, String value2) {
            addCriterion("phone_other not between", value1, value2, "phoneOther");
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