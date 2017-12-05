package test.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InformationAllExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationAllExample() {
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

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("native_place is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("native_place is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("native_place =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("native_place <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("native_place >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("native_place >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("native_place <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("native_place <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("native_place like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("native_place not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("native_place in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("native_place not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("native_place between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("native_place not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNull() {
            addCriterion("politics_status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNotNull() {
            addCriterion("politics_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusEqualTo(String value) {
            addCriterion("politics_status =", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotEqualTo(String value) {
            addCriterion("politics_status <>", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThan(String value) {
            addCriterion("politics_status >", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("politics_status >=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThan(String value) {
            addCriterion("politics_status <", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThanOrEqualTo(String value) {
            addCriterion("politics_status <=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLike(String value) {
            addCriterion("politics_status like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotLike(String value) {
            addCriterion("politics_status not like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIn(List<String> values) {
            addCriterion("politics_status in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotIn(List<String> values) {
            addCriterion("politics_status not in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusBetween(String value1, String value2) {
            addCriterion("politics_status between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotBetween(String value1, String value2) {
            addCriterion("politics_status not between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeIsNull() {
            addCriterion("joinparty_time is null");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeIsNotNull() {
            addCriterion("joinparty_time is not null");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("joinparty_time =", value, "joinpartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("joinparty_time <>", value, "joinpartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("joinparty_time >", value, "joinpartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joinparty_time >=", value, "joinpartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeLessThan(Date value) {
            addCriterionForJDBCDate("joinparty_time <", value, "joinpartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joinparty_time <=", value, "joinpartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("joinparty_time in", values, "joinpartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("joinparty_time not in", values, "joinpartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joinparty_time between", value1, value2, "joinpartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinpartyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joinparty_time not between", value1, value2, "joinpartyTime");
            return (Criteria) this;
        }

        public Criteria andConversionTimeIsNull() {
            addCriterion("conversion_time is null");
            return (Criteria) this;
        }

        public Criteria andConversionTimeIsNotNull() {
            addCriterion("conversion_time is not null");
            return (Criteria) this;
        }

        public Criteria andConversionTimeEqualTo(Date value) {
            addCriterionForJDBCDate("conversion_time =", value, "conversionTime");
            return (Criteria) this;
        }

        public Criteria andConversionTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("conversion_time <>", value, "conversionTime");
            return (Criteria) this;
        }

        public Criteria andConversionTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("conversion_time >", value, "conversionTime");
            return (Criteria) this;
        }

        public Criteria andConversionTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("conversion_time >=", value, "conversionTime");
            return (Criteria) this;
        }

        public Criteria andConversionTimeLessThan(Date value) {
            addCriterionForJDBCDate("conversion_time <", value, "conversionTime");
            return (Criteria) this;
        }

        public Criteria andConversionTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("conversion_time <=", value, "conversionTime");
            return (Criteria) this;
        }

        public Criteria andConversionTimeIn(List<Date> values) {
            addCriterionForJDBCDate("conversion_time in", values, "conversionTime");
            return (Criteria) this;
        }

        public Criteria andConversionTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("conversion_time not in", values, "conversionTime");
            return (Criteria) this;
        }

        public Criteria andConversionTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("conversion_time between", value1, value2, "conversionTime");
            return (Criteria) this;
        }

        public Criteria andConversionTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("conversion_time not between", value1, value2, "conversionTime");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesIsNull() {
            addCriterion("present_duties is null");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesIsNotNull() {
            addCriterion("present_duties is not null");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesEqualTo(String value) {
            addCriterion("present_duties =", value, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesNotEqualTo(String value) {
            addCriterion("present_duties <>", value, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesGreaterThan(String value) {
            addCriterion("present_duties >", value, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("present_duties >=", value, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesLessThan(String value) {
            addCriterion("present_duties <", value, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesLessThanOrEqualTo(String value) {
            addCriterion("present_duties <=", value, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesLike(String value) {
            addCriterion("present_duties like", value, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesNotLike(String value) {
            addCriterion("present_duties not like", value, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesIn(List<String> values) {
            addCriterion("present_duties in", values, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesNotIn(List<String> values) {
            addCriterion("present_duties not in", values, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesBetween(String value1, String value2) {
            addCriterion("present_duties between", value1, value2, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andPresentDutiesNotBetween(String value1, String value2) {
            addCriterion("present_duties not between", value1, value2, "presentDuties");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIsNull() {
            addCriterion("birth_place is null");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIsNotNull() {
            addCriterion("birth_place is not null");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceEqualTo(String value) {
            addCriterion("birth_place =", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotEqualTo(String value) {
            addCriterion("birth_place <>", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceGreaterThan(String value) {
            addCriterion("birth_place >", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("birth_place >=", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLessThan(String value) {
            addCriterion("birth_place <", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLessThanOrEqualTo(String value) {
            addCriterion("birth_place <=", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLike(String value) {
            addCriterion("birth_place like", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotLike(String value) {
            addCriterion("birth_place not like", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIn(List<String> values) {
            addCriterion("birth_place in", values, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotIn(List<String> values) {
            addCriterion("birth_place not in", values, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceBetween(String value1, String value2) {
            addCriterion("birth_place between", value1, value2, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotBetween(String value1, String value2) {
            addCriterion("birth_place not between", value1, value2, "birthPlace");
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

        public Criteria andAlldIsNull() {
            addCriterion("alld is null");
            return (Criteria) this;
        }

        public Criteria andAlldIsNotNull() {
            addCriterion("alld is not null");
            return (Criteria) this;
        }

        public Criteria andAlldEqualTo(String value) {
            addCriterion("alld =", value, "alld");
            return (Criteria) this;
        }

        public Criteria andAlldNotEqualTo(String value) {
            addCriterion("alld <>", value, "alld");
            return (Criteria) this;
        }

        public Criteria andAlldGreaterThan(String value) {
            addCriterion("alld >", value, "alld");
            return (Criteria) this;
        }

        public Criteria andAlldGreaterThanOrEqualTo(String value) {
            addCriterion("alld >=", value, "alld");
            return (Criteria) this;
        }

        public Criteria andAlldLessThan(String value) {
            addCriterion("alld <", value, "alld");
            return (Criteria) this;
        }

        public Criteria andAlldLessThanOrEqualTo(String value) {
            addCriterion("alld <=", value, "alld");
            return (Criteria) this;
        }

        public Criteria andAlldLike(String value) {
            addCriterion("alld like", value, "alld");
            return (Criteria) this;
        }

        public Criteria andAlldNotLike(String value) {
            addCriterion("alld not like", value, "alld");
            return (Criteria) this;
        }

        public Criteria andAlldIn(List<String> values) {
            addCriterion("alld in", values, "alld");
            return (Criteria) this;
        }

        public Criteria andAlldNotIn(List<String> values) {
            addCriterion("alld not in", values, "alld");
            return (Criteria) this;
        }

        public Criteria andAlldBetween(String value1, String value2) {
            addCriterion("alld between", value1, value2, "alld");
            return (Criteria) this;
        }

        public Criteria andAlldNotBetween(String value1, String value2) {
            addCriterion("alld not between", value1, value2, "alld");
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