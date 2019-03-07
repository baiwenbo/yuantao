package cn.vo.pojo.entity;

import java.util.ArrayList;
import java.util.List;

public class TestPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestPaperExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andTopic1OneIsNull() {
            addCriterion("topic1_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic1OneIsNotNull() {
            addCriterion("topic1_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic1OneEqualTo(String value) {
            addCriterion("topic1_one =", value, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1OneNotEqualTo(String value) {
            addCriterion("topic1_one <>", value, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1OneGreaterThan(String value) {
            addCriterion("topic1_one >", value, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic1_one >=", value, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1OneLessThan(String value) {
            addCriterion("topic1_one <", value, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1OneLessThanOrEqualTo(String value) {
            addCriterion("topic1_one <=", value, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1OneLike(String value) {
            addCriterion("topic1_one like", value, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1OneNotLike(String value) {
            addCriterion("topic1_one not like", value, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1OneIn(List<String> values) {
            addCriterion("topic1_one in", values, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1OneNotIn(List<String> values) {
            addCriterion("topic1_one not in", values, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1OneBetween(String value1, String value2) {
            addCriterion("topic1_one between", value1, value2, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1OneNotBetween(String value1, String value2) {
            addCriterion("topic1_one not between", value1, value2, "topic1One");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoIsNull() {
            addCriterion("topic1_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoIsNotNull() {
            addCriterion("topic1_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoEqualTo(String value) {
            addCriterion("topic1_two =", value, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoNotEqualTo(String value) {
            addCriterion("topic1_two <>", value, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoGreaterThan(String value) {
            addCriterion("topic1_two >", value, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic1_two >=", value, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoLessThan(String value) {
            addCriterion("topic1_two <", value, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoLessThanOrEqualTo(String value) {
            addCriterion("topic1_two <=", value, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoLike(String value) {
            addCriterion("topic1_two like", value, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoNotLike(String value) {
            addCriterion("topic1_two not like", value, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoIn(List<String> values) {
            addCriterion("topic1_two in", values, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoNotIn(List<String> values) {
            addCriterion("topic1_two not in", values, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoBetween(String value1, String value2) {
            addCriterion("topic1_two between", value1, value2, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1TwoNotBetween(String value1, String value2) {
            addCriterion("topic1_two not between", value1, value2, "topic1Two");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeIsNull() {
            addCriterion("topic1_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeIsNotNull() {
            addCriterion("topic1_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeEqualTo(String value) {
            addCriterion("topic1_three =", value, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeNotEqualTo(String value) {
            addCriterion("topic1_three <>", value, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeGreaterThan(String value) {
            addCriterion("topic1_three >", value, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic1_three >=", value, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeLessThan(String value) {
            addCriterion("topic1_three <", value, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic1_three <=", value, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeLike(String value) {
            addCriterion("topic1_three like", value, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeNotLike(String value) {
            addCriterion("topic1_three not like", value, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeIn(List<String> values) {
            addCriterion("topic1_three in", values, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeNotIn(List<String> values) {
            addCriterion("topic1_three not in", values, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeBetween(String value1, String value2) {
            addCriterion("topic1_three between", value1, value2, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1ThreeNotBetween(String value1, String value2) {
            addCriterion("topic1_three not between", value1, value2, "topic1Three");
            return (Criteria) this;
        }

        public Criteria andTopic1FourIsNull() {
            addCriterion("topic1_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic1FourIsNotNull() {
            addCriterion("topic1_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic1FourEqualTo(String value) {
            addCriterion("topic1_four =", value, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FourNotEqualTo(String value) {
            addCriterion("topic1_four <>", value, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FourGreaterThan(String value) {
            addCriterion("topic1_four >", value, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic1_four >=", value, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FourLessThan(String value) {
            addCriterion("topic1_four <", value, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FourLessThanOrEqualTo(String value) {
            addCriterion("topic1_four <=", value, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FourLike(String value) {
            addCriterion("topic1_four like", value, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FourNotLike(String value) {
            addCriterion("topic1_four not like", value, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FourIn(List<String> values) {
            addCriterion("topic1_four in", values, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FourNotIn(List<String> values) {
            addCriterion("topic1_four not in", values, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FourBetween(String value1, String value2) {
            addCriterion("topic1_four between", value1, value2, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FourNotBetween(String value1, String value2) {
            addCriterion("topic1_four not between", value1, value2, "topic1Four");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionIsNull() {
            addCriterion("topic1_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionIsNotNull() {
            addCriterion("topic1_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionEqualTo(String value) {
            addCriterion("topic1_fraction =", value, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionNotEqualTo(String value) {
            addCriterion("topic1_fraction <>", value, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionGreaterThan(String value) {
            addCriterion("topic1_fraction >", value, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic1_fraction >=", value, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionLessThan(String value) {
            addCriterion("topic1_fraction <", value, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionLessThanOrEqualTo(String value) {
            addCriterion("topic1_fraction <=", value, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionLike(String value) {
            addCriterion("topic1_fraction like", value, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionNotLike(String value) {
            addCriterion("topic1_fraction not like", value, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionIn(List<String> values) {
            addCriterion("topic1_fraction in", values, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionNotIn(List<String> values) {
            addCriterion("topic1_fraction not in", values, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionBetween(String value1, String value2) {
            addCriterion("topic1_fraction between", value1, value2, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic1FractionNotBetween(String value1, String value2) {
            addCriterion("topic1_fraction not between", value1, value2, "topic1Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2OneIsNull() {
            addCriterion("topic2_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic2OneIsNotNull() {
            addCriterion("topic2_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic2OneEqualTo(String value) {
            addCriterion("topic2_one =", value, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2OneNotEqualTo(String value) {
            addCriterion("topic2_one <>", value, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2OneGreaterThan(String value) {
            addCriterion("topic2_one >", value, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic2_one >=", value, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2OneLessThan(String value) {
            addCriterion("topic2_one <", value, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2OneLessThanOrEqualTo(String value) {
            addCriterion("topic2_one <=", value, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2OneLike(String value) {
            addCriterion("topic2_one like", value, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2OneNotLike(String value) {
            addCriterion("topic2_one not like", value, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2OneIn(List<String> values) {
            addCriterion("topic2_one in", values, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2OneNotIn(List<String> values) {
            addCriterion("topic2_one not in", values, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2OneBetween(String value1, String value2) {
            addCriterion("topic2_one between", value1, value2, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2OneNotBetween(String value1, String value2) {
            addCriterion("topic2_one not between", value1, value2, "topic2One");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoIsNull() {
            addCriterion("topic2_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoIsNotNull() {
            addCriterion("topic2_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoEqualTo(String value) {
            addCriterion("topic2_two =", value, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoNotEqualTo(String value) {
            addCriterion("topic2_two <>", value, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoGreaterThan(String value) {
            addCriterion("topic2_two >", value, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic2_two >=", value, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoLessThan(String value) {
            addCriterion("topic2_two <", value, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoLessThanOrEqualTo(String value) {
            addCriterion("topic2_two <=", value, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoLike(String value) {
            addCriterion("topic2_two like", value, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoNotLike(String value) {
            addCriterion("topic2_two not like", value, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoIn(List<String> values) {
            addCriterion("topic2_two in", values, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoNotIn(List<String> values) {
            addCriterion("topic2_two not in", values, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoBetween(String value1, String value2) {
            addCriterion("topic2_two between", value1, value2, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2TwoNotBetween(String value1, String value2) {
            addCriterion("topic2_two not between", value1, value2, "topic2Two");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeIsNull() {
            addCriterion("topic2_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeIsNotNull() {
            addCriterion("topic2_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeEqualTo(String value) {
            addCriterion("topic2_three =", value, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeNotEqualTo(String value) {
            addCriterion("topic2_three <>", value, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeGreaterThan(String value) {
            addCriterion("topic2_three >", value, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic2_three >=", value, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeLessThan(String value) {
            addCriterion("topic2_three <", value, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic2_three <=", value, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeLike(String value) {
            addCriterion("topic2_three like", value, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeNotLike(String value) {
            addCriterion("topic2_three not like", value, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeIn(List<String> values) {
            addCriterion("topic2_three in", values, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeNotIn(List<String> values) {
            addCriterion("topic2_three not in", values, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeBetween(String value1, String value2) {
            addCriterion("topic2_three between", value1, value2, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2ThreeNotBetween(String value1, String value2) {
            addCriterion("topic2_three not between", value1, value2, "topic2Three");
            return (Criteria) this;
        }

        public Criteria andTopic2FourIsNull() {
            addCriterion("topic2_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic2FourIsNotNull() {
            addCriterion("topic2_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic2FourEqualTo(String value) {
            addCriterion("topic2_four =", value, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FourNotEqualTo(String value) {
            addCriterion("topic2_four <>", value, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FourGreaterThan(String value) {
            addCriterion("topic2_four >", value, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic2_four >=", value, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FourLessThan(String value) {
            addCriterion("topic2_four <", value, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FourLessThanOrEqualTo(String value) {
            addCriterion("topic2_four <=", value, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FourLike(String value) {
            addCriterion("topic2_four like", value, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FourNotLike(String value) {
            addCriterion("topic2_four not like", value, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FourIn(List<String> values) {
            addCriterion("topic2_four in", values, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FourNotIn(List<String> values) {
            addCriterion("topic2_four not in", values, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FourBetween(String value1, String value2) {
            addCriterion("topic2_four between", value1, value2, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FourNotBetween(String value1, String value2) {
            addCriterion("topic2_four not between", value1, value2, "topic2Four");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionIsNull() {
            addCriterion("topic2_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionIsNotNull() {
            addCriterion("topic2_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionEqualTo(String value) {
            addCriterion("topic2_fraction =", value, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionNotEqualTo(String value) {
            addCriterion("topic2_fraction <>", value, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionGreaterThan(String value) {
            addCriterion("topic2_fraction >", value, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic2_fraction >=", value, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionLessThan(String value) {
            addCriterion("topic2_fraction <", value, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionLessThanOrEqualTo(String value) {
            addCriterion("topic2_fraction <=", value, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionLike(String value) {
            addCriterion("topic2_fraction like", value, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionNotLike(String value) {
            addCriterion("topic2_fraction not like", value, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionIn(List<String> values) {
            addCriterion("topic2_fraction in", values, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionNotIn(List<String> values) {
            addCriterion("topic2_fraction not in", values, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionBetween(String value1, String value2) {
            addCriterion("topic2_fraction between", value1, value2, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic2FractionNotBetween(String value1, String value2) {
            addCriterion("topic2_fraction not between", value1, value2, "topic2Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3OneIsNull() {
            addCriterion("topic3_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic3OneIsNotNull() {
            addCriterion("topic3_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic3OneEqualTo(String value) {
            addCriterion("topic3_one =", value, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3OneNotEqualTo(String value) {
            addCriterion("topic3_one <>", value, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3OneGreaterThan(String value) {
            addCriterion("topic3_one >", value, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic3_one >=", value, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3OneLessThan(String value) {
            addCriterion("topic3_one <", value, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3OneLessThanOrEqualTo(String value) {
            addCriterion("topic3_one <=", value, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3OneLike(String value) {
            addCriterion("topic3_one like", value, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3OneNotLike(String value) {
            addCriterion("topic3_one not like", value, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3OneIn(List<String> values) {
            addCriterion("topic3_one in", values, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3OneNotIn(List<String> values) {
            addCriterion("topic3_one not in", values, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3OneBetween(String value1, String value2) {
            addCriterion("topic3_one between", value1, value2, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3OneNotBetween(String value1, String value2) {
            addCriterion("topic3_one not between", value1, value2, "topic3One");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoIsNull() {
            addCriterion("topic3_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoIsNotNull() {
            addCriterion("topic3_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoEqualTo(String value) {
            addCriterion("topic3_two =", value, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoNotEqualTo(String value) {
            addCriterion("topic3_two <>", value, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoGreaterThan(String value) {
            addCriterion("topic3_two >", value, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic3_two >=", value, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoLessThan(String value) {
            addCriterion("topic3_two <", value, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoLessThanOrEqualTo(String value) {
            addCriterion("topic3_two <=", value, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoLike(String value) {
            addCriterion("topic3_two like", value, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoNotLike(String value) {
            addCriterion("topic3_two not like", value, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoIn(List<String> values) {
            addCriterion("topic3_two in", values, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoNotIn(List<String> values) {
            addCriterion("topic3_two not in", values, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoBetween(String value1, String value2) {
            addCriterion("topic3_two between", value1, value2, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3TwoNotBetween(String value1, String value2) {
            addCriterion("topic3_two not between", value1, value2, "topic3Two");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeIsNull() {
            addCriterion("topic3_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeIsNotNull() {
            addCriterion("topic3_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeEqualTo(String value) {
            addCriterion("topic3_three =", value, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeNotEqualTo(String value) {
            addCriterion("topic3_three <>", value, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeGreaterThan(String value) {
            addCriterion("topic3_three >", value, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic3_three >=", value, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeLessThan(String value) {
            addCriterion("topic3_three <", value, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic3_three <=", value, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeLike(String value) {
            addCriterion("topic3_three like", value, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeNotLike(String value) {
            addCriterion("topic3_three not like", value, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeIn(List<String> values) {
            addCriterion("topic3_three in", values, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeNotIn(List<String> values) {
            addCriterion("topic3_three not in", values, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeBetween(String value1, String value2) {
            addCriterion("topic3_three between", value1, value2, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3ThreeNotBetween(String value1, String value2) {
            addCriterion("topic3_three not between", value1, value2, "topic3Three");
            return (Criteria) this;
        }

        public Criteria andTopic3FourIsNull() {
            addCriterion("topic3_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic3FourIsNotNull() {
            addCriterion("topic3_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic3FourEqualTo(String value) {
            addCriterion("topic3_four =", value, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FourNotEqualTo(String value) {
            addCriterion("topic3_four <>", value, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FourGreaterThan(String value) {
            addCriterion("topic3_four >", value, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic3_four >=", value, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FourLessThan(String value) {
            addCriterion("topic3_four <", value, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FourLessThanOrEqualTo(String value) {
            addCriterion("topic3_four <=", value, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FourLike(String value) {
            addCriterion("topic3_four like", value, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FourNotLike(String value) {
            addCriterion("topic3_four not like", value, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FourIn(List<String> values) {
            addCriterion("topic3_four in", values, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FourNotIn(List<String> values) {
            addCriterion("topic3_four not in", values, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FourBetween(String value1, String value2) {
            addCriterion("topic3_four between", value1, value2, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FourNotBetween(String value1, String value2) {
            addCriterion("topic3_four not between", value1, value2, "topic3Four");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionIsNull() {
            addCriterion("topic3_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionIsNotNull() {
            addCriterion("topic3_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionEqualTo(String value) {
            addCriterion("topic3_fraction =", value, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionNotEqualTo(String value) {
            addCriterion("topic3_fraction <>", value, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionGreaterThan(String value) {
            addCriterion("topic3_fraction >", value, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic3_fraction >=", value, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionLessThan(String value) {
            addCriterion("topic3_fraction <", value, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionLessThanOrEqualTo(String value) {
            addCriterion("topic3_fraction <=", value, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionLike(String value) {
            addCriterion("topic3_fraction like", value, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionNotLike(String value) {
            addCriterion("topic3_fraction not like", value, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionIn(List<String> values) {
            addCriterion("topic3_fraction in", values, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionNotIn(List<String> values) {
            addCriterion("topic3_fraction not in", values, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionBetween(String value1, String value2) {
            addCriterion("topic3_fraction between", value1, value2, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic3FractionNotBetween(String value1, String value2) {
            addCriterion("topic3_fraction not between", value1, value2, "topic3Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4OneIsNull() {
            addCriterion("topic4_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic4OneIsNotNull() {
            addCriterion("topic4_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic4OneEqualTo(String value) {
            addCriterion("topic4_one =", value, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4OneNotEqualTo(String value) {
            addCriterion("topic4_one <>", value, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4OneGreaterThan(String value) {
            addCriterion("topic4_one >", value, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic4_one >=", value, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4OneLessThan(String value) {
            addCriterion("topic4_one <", value, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4OneLessThanOrEqualTo(String value) {
            addCriterion("topic4_one <=", value, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4OneLike(String value) {
            addCriterion("topic4_one like", value, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4OneNotLike(String value) {
            addCriterion("topic4_one not like", value, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4OneIn(List<String> values) {
            addCriterion("topic4_one in", values, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4OneNotIn(List<String> values) {
            addCriterion("topic4_one not in", values, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4OneBetween(String value1, String value2) {
            addCriterion("topic4_one between", value1, value2, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4OneNotBetween(String value1, String value2) {
            addCriterion("topic4_one not between", value1, value2, "topic4One");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoIsNull() {
            addCriterion("topic4_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoIsNotNull() {
            addCriterion("topic4_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoEqualTo(String value) {
            addCriterion("topic4_two =", value, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoNotEqualTo(String value) {
            addCriterion("topic4_two <>", value, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoGreaterThan(String value) {
            addCriterion("topic4_two >", value, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic4_two >=", value, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoLessThan(String value) {
            addCriterion("topic4_two <", value, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoLessThanOrEqualTo(String value) {
            addCriterion("topic4_two <=", value, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoLike(String value) {
            addCriterion("topic4_two like", value, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoNotLike(String value) {
            addCriterion("topic4_two not like", value, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoIn(List<String> values) {
            addCriterion("topic4_two in", values, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoNotIn(List<String> values) {
            addCriterion("topic4_two not in", values, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoBetween(String value1, String value2) {
            addCriterion("topic4_two between", value1, value2, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4TwoNotBetween(String value1, String value2) {
            addCriterion("topic4_two not between", value1, value2, "topic4Two");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeIsNull() {
            addCriterion("topic4_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeIsNotNull() {
            addCriterion("topic4_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeEqualTo(String value) {
            addCriterion("topic4_three =", value, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeNotEqualTo(String value) {
            addCriterion("topic4_three <>", value, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeGreaterThan(String value) {
            addCriterion("topic4_three >", value, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic4_three >=", value, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeLessThan(String value) {
            addCriterion("topic4_three <", value, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic4_three <=", value, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeLike(String value) {
            addCriterion("topic4_three like", value, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeNotLike(String value) {
            addCriterion("topic4_three not like", value, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeIn(List<String> values) {
            addCriterion("topic4_three in", values, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeNotIn(List<String> values) {
            addCriterion("topic4_three not in", values, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeBetween(String value1, String value2) {
            addCriterion("topic4_three between", value1, value2, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4ThreeNotBetween(String value1, String value2) {
            addCriterion("topic4_three not between", value1, value2, "topic4Three");
            return (Criteria) this;
        }

        public Criteria andTopic4FourIsNull() {
            addCriterion("topic4_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic4FourIsNotNull() {
            addCriterion("topic4_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic4FourEqualTo(String value) {
            addCriterion("topic4_four =", value, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FourNotEqualTo(String value) {
            addCriterion("topic4_four <>", value, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FourGreaterThan(String value) {
            addCriterion("topic4_four >", value, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic4_four >=", value, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FourLessThan(String value) {
            addCriterion("topic4_four <", value, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FourLessThanOrEqualTo(String value) {
            addCriterion("topic4_four <=", value, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FourLike(String value) {
            addCriterion("topic4_four like", value, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FourNotLike(String value) {
            addCriterion("topic4_four not like", value, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FourIn(List<String> values) {
            addCriterion("topic4_four in", values, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FourNotIn(List<String> values) {
            addCriterion("topic4_four not in", values, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FourBetween(String value1, String value2) {
            addCriterion("topic4_four between", value1, value2, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FourNotBetween(String value1, String value2) {
            addCriterion("topic4_four not between", value1, value2, "topic4Four");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionIsNull() {
            addCriterion("topic4_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionIsNotNull() {
            addCriterion("topic4_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionEqualTo(String value) {
            addCriterion("topic4_fraction =", value, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionNotEqualTo(String value) {
            addCriterion("topic4_fraction <>", value, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionGreaterThan(String value) {
            addCriterion("topic4_fraction >", value, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic4_fraction >=", value, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionLessThan(String value) {
            addCriterion("topic4_fraction <", value, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionLessThanOrEqualTo(String value) {
            addCriterion("topic4_fraction <=", value, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionLike(String value) {
            addCriterion("topic4_fraction like", value, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionNotLike(String value) {
            addCriterion("topic4_fraction not like", value, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionIn(List<String> values) {
            addCriterion("topic4_fraction in", values, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionNotIn(List<String> values) {
            addCriterion("topic4_fraction not in", values, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionBetween(String value1, String value2) {
            addCriterion("topic4_fraction between", value1, value2, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic4FractionNotBetween(String value1, String value2) {
            addCriterion("topic4_fraction not between", value1, value2, "topic4Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5OneIsNull() {
            addCriterion("topic5_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic5OneIsNotNull() {
            addCriterion("topic5_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic5OneEqualTo(String value) {
            addCriterion("topic5_one =", value, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5OneNotEqualTo(String value) {
            addCriterion("topic5_one <>", value, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5OneGreaterThan(String value) {
            addCriterion("topic5_one >", value, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic5_one >=", value, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5OneLessThan(String value) {
            addCriterion("topic5_one <", value, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5OneLessThanOrEqualTo(String value) {
            addCriterion("topic5_one <=", value, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5OneLike(String value) {
            addCriterion("topic5_one like", value, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5OneNotLike(String value) {
            addCriterion("topic5_one not like", value, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5OneIn(List<String> values) {
            addCriterion("topic5_one in", values, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5OneNotIn(List<String> values) {
            addCriterion("topic5_one not in", values, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5OneBetween(String value1, String value2) {
            addCriterion("topic5_one between", value1, value2, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5OneNotBetween(String value1, String value2) {
            addCriterion("topic5_one not between", value1, value2, "topic5One");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoIsNull() {
            addCriterion("topic5_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoIsNotNull() {
            addCriterion("topic5_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoEqualTo(String value) {
            addCriterion("topic5_two =", value, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoNotEqualTo(String value) {
            addCriterion("topic5_two <>", value, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoGreaterThan(String value) {
            addCriterion("topic5_two >", value, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic5_two >=", value, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoLessThan(String value) {
            addCriterion("topic5_two <", value, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoLessThanOrEqualTo(String value) {
            addCriterion("topic5_two <=", value, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoLike(String value) {
            addCriterion("topic5_two like", value, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoNotLike(String value) {
            addCriterion("topic5_two not like", value, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoIn(List<String> values) {
            addCriterion("topic5_two in", values, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoNotIn(List<String> values) {
            addCriterion("topic5_two not in", values, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoBetween(String value1, String value2) {
            addCriterion("topic5_two between", value1, value2, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5TwoNotBetween(String value1, String value2) {
            addCriterion("topic5_two not between", value1, value2, "topic5Two");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeIsNull() {
            addCriterion("topic5_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeIsNotNull() {
            addCriterion("topic5_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeEqualTo(String value) {
            addCriterion("topic5_three =", value, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeNotEqualTo(String value) {
            addCriterion("topic5_three <>", value, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeGreaterThan(String value) {
            addCriterion("topic5_three >", value, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic5_three >=", value, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeLessThan(String value) {
            addCriterion("topic5_three <", value, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic5_three <=", value, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeLike(String value) {
            addCriterion("topic5_three like", value, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeNotLike(String value) {
            addCriterion("topic5_three not like", value, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeIn(List<String> values) {
            addCriterion("topic5_three in", values, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeNotIn(List<String> values) {
            addCriterion("topic5_three not in", values, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeBetween(String value1, String value2) {
            addCriterion("topic5_three between", value1, value2, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5ThreeNotBetween(String value1, String value2) {
            addCriterion("topic5_three not between", value1, value2, "topic5Three");
            return (Criteria) this;
        }

        public Criteria andTopic5FourIsNull() {
            addCriterion("topic5_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic5FourIsNotNull() {
            addCriterion("topic5_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic5FourEqualTo(String value) {
            addCriterion("topic5_four =", value, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FourNotEqualTo(String value) {
            addCriterion("topic5_four <>", value, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FourGreaterThan(String value) {
            addCriterion("topic5_four >", value, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic5_four >=", value, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FourLessThan(String value) {
            addCriterion("topic5_four <", value, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FourLessThanOrEqualTo(String value) {
            addCriterion("topic5_four <=", value, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FourLike(String value) {
            addCriterion("topic5_four like", value, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FourNotLike(String value) {
            addCriterion("topic5_four not like", value, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FourIn(List<String> values) {
            addCriterion("topic5_four in", values, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FourNotIn(List<String> values) {
            addCriterion("topic5_four not in", values, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FourBetween(String value1, String value2) {
            addCriterion("topic5_four between", value1, value2, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FourNotBetween(String value1, String value2) {
            addCriterion("topic5_four not between", value1, value2, "topic5Four");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionIsNull() {
            addCriterion("topic5_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionIsNotNull() {
            addCriterion("topic5_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionEqualTo(String value) {
            addCriterion("topic5_fraction =", value, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionNotEqualTo(String value) {
            addCriterion("topic5_fraction <>", value, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionGreaterThan(String value) {
            addCriterion("topic5_fraction >", value, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic5_fraction >=", value, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionLessThan(String value) {
            addCriterion("topic5_fraction <", value, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionLessThanOrEqualTo(String value) {
            addCriterion("topic5_fraction <=", value, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionLike(String value) {
            addCriterion("topic5_fraction like", value, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionNotLike(String value) {
            addCriterion("topic5_fraction not like", value, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionIn(List<String> values) {
            addCriterion("topic5_fraction in", values, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionNotIn(List<String> values) {
            addCriterion("topic5_fraction not in", values, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionBetween(String value1, String value2) {
            addCriterion("topic5_fraction between", value1, value2, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic5FractionNotBetween(String value1, String value2) {
            addCriterion("topic5_fraction not between", value1, value2, "topic5Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6OneIsNull() {
            addCriterion("topic6_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic6OneIsNotNull() {
            addCriterion("topic6_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic6OneEqualTo(String value) {
            addCriterion("topic6_one =", value, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6OneNotEqualTo(String value) {
            addCriterion("topic6_one <>", value, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6OneGreaterThan(String value) {
            addCriterion("topic6_one >", value, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic6_one >=", value, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6OneLessThan(String value) {
            addCriterion("topic6_one <", value, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6OneLessThanOrEqualTo(String value) {
            addCriterion("topic6_one <=", value, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6OneLike(String value) {
            addCriterion("topic6_one like", value, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6OneNotLike(String value) {
            addCriterion("topic6_one not like", value, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6OneIn(List<String> values) {
            addCriterion("topic6_one in", values, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6OneNotIn(List<String> values) {
            addCriterion("topic6_one not in", values, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6OneBetween(String value1, String value2) {
            addCriterion("topic6_one between", value1, value2, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6OneNotBetween(String value1, String value2) {
            addCriterion("topic6_one not between", value1, value2, "topic6One");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoIsNull() {
            addCriterion("topic6_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoIsNotNull() {
            addCriterion("topic6_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoEqualTo(String value) {
            addCriterion("topic6_two =", value, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoNotEqualTo(String value) {
            addCriterion("topic6_two <>", value, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoGreaterThan(String value) {
            addCriterion("topic6_two >", value, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic6_two >=", value, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoLessThan(String value) {
            addCriterion("topic6_two <", value, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoLessThanOrEqualTo(String value) {
            addCriterion("topic6_two <=", value, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoLike(String value) {
            addCriterion("topic6_two like", value, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoNotLike(String value) {
            addCriterion("topic6_two not like", value, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoIn(List<String> values) {
            addCriterion("topic6_two in", values, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoNotIn(List<String> values) {
            addCriterion("topic6_two not in", values, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoBetween(String value1, String value2) {
            addCriterion("topic6_two between", value1, value2, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6TwoNotBetween(String value1, String value2) {
            addCriterion("topic6_two not between", value1, value2, "topic6Two");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeIsNull() {
            addCriterion("topic6_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeIsNotNull() {
            addCriterion("topic6_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeEqualTo(String value) {
            addCriterion("topic6_three =", value, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeNotEqualTo(String value) {
            addCriterion("topic6_three <>", value, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeGreaterThan(String value) {
            addCriterion("topic6_three >", value, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic6_three >=", value, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeLessThan(String value) {
            addCriterion("topic6_three <", value, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic6_three <=", value, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeLike(String value) {
            addCriterion("topic6_three like", value, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeNotLike(String value) {
            addCriterion("topic6_three not like", value, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeIn(List<String> values) {
            addCriterion("topic6_three in", values, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeNotIn(List<String> values) {
            addCriterion("topic6_three not in", values, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeBetween(String value1, String value2) {
            addCriterion("topic6_three between", value1, value2, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6ThreeNotBetween(String value1, String value2) {
            addCriterion("topic6_three not between", value1, value2, "topic6Three");
            return (Criteria) this;
        }

        public Criteria andTopic6FourIsNull() {
            addCriterion("topic6_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic6FourIsNotNull() {
            addCriterion("topic6_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic6FourEqualTo(String value) {
            addCriterion("topic6_four =", value, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FourNotEqualTo(String value) {
            addCriterion("topic6_four <>", value, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FourGreaterThan(String value) {
            addCriterion("topic6_four >", value, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic6_four >=", value, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FourLessThan(String value) {
            addCriterion("topic6_four <", value, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FourLessThanOrEqualTo(String value) {
            addCriterion("topic6_four <=", value, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FourLike(String value) {
            addCriterion("topic6_four like", value, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FourNotLike(String value) {
            addCriterion("topic6_four not like", value, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FourIn(List<String> values) {
            addCriterion("topic6_four in", values, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FourNotIn(List<String> values) {
            addCriterion("topic6_four not in", values, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FourBetween(String value1, String value2) {
            addCriterion("topic6_four between", value1, value2, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FourNotBetween(String value1, String value2) {
            addCriterion("topic6_four not between", value1, value2, "topic6Four");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionIsNull() {
            addCriterion("topic6_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionIsNotNull() {
            addCriterion("topic6_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionEqualTo(String value) {
            addCriterion("topic6_fraction =", value, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionNotEqualTo(String value) {
            addCriterion("topic6_fraction <>", value, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionGreaterThan(String value) {
            addCriterion("topic6_fraction >", value, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic6_fraction >=", value, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionLessThan(String value) {
            addCriterion("topic6_fraction <", value, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionLessThanOrEqualTo(String value) {
            addCriterion("topic6_fraction <=", value, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionLike(String value) {
            addCriterion("topic6_fraction like", value, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionNotLike(String value) {
            addCriterion("topic6_fraction not like", value, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionIn(List<String> values) {
            addCriterion("topic6_fraction in", values, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionNotIn(List<String> values) {
            addCriterion("topic6_fraction not in", values, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionBetween(String value1, String value2) {
            addCriterion("topic6_fraction between", value1, value2, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic6FractionNotBetween(String value1, String value2) {
            addCriterion("topic6_fraction not between", value1, value2, "topic6Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7OneIsNull() {
            addCriterion("topic7_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic7OneIsNotNull() {
            addCriterion("topic7_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic7OneEqualTo(String value) {
            addCriterion("topic7_one =", value, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7OneNotEqualTo(String value) {
            addCriterion("topic7_one <>", value, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7OneGreaterThan(String value) {
            addCriterion("topic7_one >", value, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic7_one >=", value, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7OneLessThan(String value) {
            addCriterion("topic7_one <", value, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7OneLessThanOrEqualTo(String value) {
            addCriterion("topic7_one <=", value, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7OneLike(String value) {
            addCriterion("topic7_one like", value, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7OneNotLike(String value) {
            addCriterion("topic7_one not like", value, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7OneIn(List<String> values) {
            addCriterion("topic7_one in", values, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7OneNotIn(List<String> values) {
            addCriterion("topic7_one not in", values, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7OneBetween(String value1, String value2) {
            addCriterion("topic7_one between", value1, value2, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7OneNotBetween(String value1, String value2) {
            addCriterion("topic7_one not between", value1, value2, "topic7One");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoIsNull() {
            addCriterion("topic7_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoIsNotNull() {
            addCriterion("topic7_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoEqualTo(String value) {
            addCriterion("topic7_two =", value, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoNotEqualTo(String value) {
            addCriterion("topic7_two <>", value, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoGreaterThan(String value) {
            addCriterion("topic7_two >", value, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic7_two >=", value, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoLessThan(String value) {
            addCriterion("topic7_two <", value, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoLessThanOrEqualTo(String value) {
            addCriterion("topic7_two <=", value, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoLike(String value) {
            addCriterion("topic7_two like", value, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoNotLike(String value) {
            addCriterion("topic7_two not like", value, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoIn(List<String> values) {
            addCriterion("topic7_two in", values, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoNotIn(List<String> values) {
            addCriterion("topic7_two not in", values, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoBetween(String value1, String value2) {
            addCriterion("topic7_two between", value1, value2, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7TwoNotBetween(String value1, String value2) {
            addCriterion("topic7_two not between", value1, value2, "topic7Two");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeIsNull() {
            addCriterion("topic7_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeIsNotNull() {
            addCriterion("topic7_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeEqualTo(String value) {
            addCriterion("topic7_three =", value, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeNotEqualTo(String value) {
            addCriterion("topic7_three <>", value, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeGreaterThan(String value) {
            addCriterion("topic7_three >", value, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic7_three >=", value, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeLessThan(String value) {
            addCriterion("topic7_three <", value, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic7_three <=", value, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeLike(String value) {
            addCriterion("topic7_three like", value, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeNotLike(String value) {
            addCriterion("topic7_three not like", value, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeIn(List<String> values) {
            addCriterion("topic7_three in", values, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeNotIn(List<String> values) {
            addCriterion("topic7_three not in", values, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeBetween(String value1, String value2) {
            addCriterion("topic7_three between", value1, value2, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7ThreeNotBetween(String value1, String value2) {
            addCriterion("topic7_three not between", value1, value2, "topic7Three");
            return (Criteria) this;
        }

        public Criteria andTopic7FourIsNull() {
            addCriterion("topic7_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic7FourIsNotNull() {
            addCriterion("topic7_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic7FourEqualTo(String value) {
            addCriterion("topic7_four =", value, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FourNotEqualTo(String value) {
            addCriterion("topic7_four <>", value, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FourGreaterThan(String value) {
            addCriterion("topic7_four >", value, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic7_four >=", value, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FourLessThan(String value) {
            addCriterion("topic7_four <", value, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FourLessThanOrEqualTo(String value) {
            addCriterion("topic7_four <=", value, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FourLike(String value) {
            addCriterion("topic7_four like", value, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FourNotLike(String value) {
            addCriterion("topic7_four not like", value, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FourIn(List<String> values) {
            addCriterion("topic7_four in", values, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FourNotIn(List<String> values) {
            addCriterion("topic7_four not in", values, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FourBetween(String value1, String value2) {
            addCriterion("topic7_four between", value1, value2, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FourNotBetween(String value1, String value2) {
            addCriterion("topic7_four not between", value1, value2, "topic7Four");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionIsNull() {
            addCriterion("topic7_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionIsNotNull() {
            addCriterion("topic7_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionEqualTo(String value) {
            addCriterion("topic7_fraction =", value, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionNotEqualTo(String value) {
            addCriterion("topic7_fraction <>", value, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionGreaterThan(String value) {
            addCriterion("topic7_fraction >", value, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic7_fraction >=", value, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionLessThan(String value) {
            addCriterion("topic7_fraction <", value, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionLessThanOrEqualTo(String value) {
            addCriterion("topic7_fraction <=", value, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionLike(String value) {
            addCriterion("topic7_fraction like", value, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionNotLike(String value) {
            addCriterion("topic7_fraction not like", value, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionIn(List<String> values) {
            addCriterion("topic7_fraction in", values, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionNotIn(List<String> values) {
            addCriterion("topic7_fraction not in", values, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionBetween(String value1, String value2) {
            addCriterion("topic7_fraction between", value1, value2, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic7FractionNotBetween(String value1, String value2) {
            addCriterion("topic7_fraction not between", value1, value2, "topic7Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8OneIsNull() {
            addCriterion("topic8_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic8OneIsNotNull() {
            addCriterion("topic8_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic8OneEqualTo(String value) {
            addCriterion("topic8_one =", value, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8OneNotEqualTo(String value) {
            addCriterion("topic8_one <>", value, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8OneGreaterThan(String value) {
            addCriterion("topic8_one >", value, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic8_one >=", value, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8OneLessThan(String value) {
            addCriterion("topic8_one <", value, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8OneLessThanOrEqualTo(String value) {
            addCriterion("topic8_one <=", value, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8OneLike(String value) {
            addCriterion("topic8_one like", value, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8OneNotLike(String value) {
            addCriterion("topic8_one not like", value, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8OneIn(List<String> values) {
            addCriterion("topic8_one in", values, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8OneNotIn(List<String> values) {
            addCriterion("topic8_one not in", values, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8OneBetween(String value1, String value2) {
            addCriterion("topic8_one between", value1, value2, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8OneNotBetween(String value1, String value2) {
            addCriterion("topic8_one not between", value1, value2, "topic8One");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoIsNull() {
            addCriterion("topic8_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoIsNotNull() {
            addCriterion("topic8_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoEqualTo(String value) {
            addCriterion("topic8_two =", value, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoNotEqualTo(String value) {
            addCriterion("topic8_two <>", value, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoGreaterThan(String value) {
            addCriterion("topic8_two >", value, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic8_two >=", value, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoLessThan(String value) {
            addCriterion("topic8_two <", value, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoLessThanOrEqualTo(String value) {
            addCriterion("topic8_two <=", value, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoLike(String value) {
            addCriterion("topic8_two like", value, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoNotLike(String value) {
            addCriterion("topic8_two not like", value, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoIn(List<String> values) {
            addCriterion("topic8_two in", values, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoNotIn(List<String> values) {
            addCriterion("topic8_two not in", values, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoBetween(String value1, String value2) {
            addCriterion("topic8_two between", value1, value2, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8TwoNotBetween(String value1, String value2) {
            addCriterion("topic8_two not between", value1, value2, "topic8Two");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeIsNull() {
            addCriterion("topic8_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeIsNotNull() {
            addCriterion("topic8_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeEqualTo(String value) {
            addCriterion("topic8_three =", value, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeNotEqualTo(String value) {
            addCriterion("topic8_three <>", value, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeGreaterThan(String value) {
            addCriterion("topic8_three >", value, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic8_three >=", value, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeLessThan(String value) {
            addCriterion("topic8_three <", value, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic8_three <=", value, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeLike(String value) {
            addCriterion("topic8_three like", value, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeNotLike(String value) {
            addCriterion("topic8_three not like", value, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeIn(List<String> values) {
            addCriterion("topic8_three in", values, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeNotIn(List<String> values) {
            addCriterion("topic8_three not in", values, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeBetween(String value1, String value2) {
            addCriterion("topic8_three between", value1, value2, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8ThreeNotBetween(String value1, String value2) {
            addCriterion("topic8_three not between", value1, value2, "topic8Three");
            return (Criteria) this;
        }

        public Criteria andTopic8FourIsNull() {
            addCriterion("topic8_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic8FourIsNotNull() {
            addCriterion("topic8_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic8FourEqualTo(String value) {
            addCriterion("topic8_four =", value, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FourNotEqualTo(String value) {
            addCriterion("topic8_four <>", value, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FourGreaterThan(String value) {
            addCriterion("topic8_four >", value, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic8_four >=", value, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FourLessThan(String value) {
            addCriterion("topic8_four <", value, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FourLessThanOrEqualTo(String value) {
            addCriterion("topic8_four <=", value, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FourLike(String value) {
            addCriterion("topic8_four like", value, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FourNotLike(String value) {
            addCriterion("topic8_four not like", value, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FourIn(List<String> values) {
            addCriterion("topic8_four in", values, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FourNotIn(List<String> values) {
            addCriterion("topic8_four not in", values, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FourBetween(String value1, String value2) {
            addCriterion("topic8_four between", value1, value2, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FourNotBetween(String value1, String value2) {
            addCriterion("topic8_four not between", value1, value2, "topic8Four");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionIsNull() {
            addCriterion("topic8_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionIsNotNull() {
            addCriterion("topic8_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionEqualTo(String value) {
            addCriterion("topic8_fraction =", value, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionNotEqualTo(String value) {
            addCriterion("topic8_fraction <>", value, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionGreaterThan(String value) {
            addCriterion("topic8_fraction >", value, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic8_fraction >=", value, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionLessThan(String value) {
            addCriterion("topic8_fraction <", value, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionLessThanOrEqualTo(String value) {
            addCriterion("topic8_fraction <=", value, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionLike(String value) {
            addCriterion("topic8_fraction like", value, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionNotLike(String value) {
            addCriterion("topic8_fraction not like", value, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionIn(List<String> values) {
            addCriterion("topic8_fraction in", values, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionNotIn(List<String> values) {
            addCriterion("topic8_fraction not in", values, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionBetween(String value1, String value2) {
            addCriterion("topic8_fraction between", value1, value2, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic8FractionNotBetween(String value1, String value2) {
            addCriterion("topic8_fraction not between", value1, value2, "topic8Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9OneIsNull() {
            addCriterion("topic9_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic9OneIsNotNull() {
            addCriterion("topic9_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic9OneEqualTo(String value) {
            addCriterion("topic9_one =", value, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9OneNotEqualTo(String value) {
            addCriterion("topic9_one <>", value, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9OneGreaterThan(String value) {
            addCriterion("topic9_one >", value, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic9_one >=", value, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9OneLessThan(String value) {
            addCriterion("topic9_one <", value, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9OneLessThanOrEqualTo(String value) {
            addCriterion("topic9_one <=", value, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9OneLike(String value) {
            addCriterion("topic9_one like", value, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9OneNotLike(String value) {
            addCriterion("topic9_one not like", value, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9OneIn(List<String> values) {
            addCriterion("topic9_one in", values, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9OneNotIn(List<String> values) {
            addCriterion("topic9_one not in", values, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9OneBetween(String value1, String value2) {
            addCriterion("topic9_one between", value1, value2, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9OneNotBetween(String value1, String value2) {
            addCriterion("topic9_one not between", value1, value2, "topic9One");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoIsNull() {
            addCriterion("topic9_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoIsNotNull() {
            addCriterion("topic9_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoEqualTo(String value) {
            addCriterion("topic9_two =", value, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoNotEqualTo(String value) {
            addCriterion("topic9_two <>", value, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoGreaterThan(String value) {
            addCriterion("topic9_two >", value, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic9_two >=", value, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoLessThan(String value) {
            addCriterion("topic9_two <", value, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoLessThanOrEqualTo(String value) {
            addCriterion("topic9_two <=", value, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoLike(String value) {
            addCriterion("topic9_two like", value, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoNotLike(String value) {
            addCriterion("topic9_two not like", value, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoIn(List<String> values) {
            addCriterion("topic9_two in", values, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoNotIn(List<String> values) {
            addCriterion("topic9_two not in", values, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoBetween(String value1, String value2) {
            addCriterion("topic9_two between", value1, value2, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9TwoNotBetween(String value1, String value2) {
            addCriterion("topic9_two not between", value1, value2, "topic9Two");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeIsNull() {
            addCriterion("topic9_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeIsNotNull() {
            addCriterion("topic9_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeEqualTo(String value) {
            addCriterion("topic9_three =", value, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeNotEqualTo(String value) {
            addCriterion("topic9_three <>", value, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeGreaterThan(String value) {
            addCriterion("topic9_three >", value, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic9_three >=", value, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeLessThan(String value) {
            addCriterion("topic9_three <", value, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic9_three <=", value, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeLike(String value) {
            addCriterion("topic9_three like", value, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeNotLike(String value) {
            addCriterion("topic9_three not like", value, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeIn(List<String> values) {
            addCriterion("topic9_three in", values, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeNotIn(List<String> values) {
            addCriterion("topic9_three not in", values, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeBetween(String value1, String value2) {
            addCriterion("topic9_three between", value1, value2, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9ThreeNotBetween(String value1, String value2) {
            addCriterion("topic9_three not between", value1, value2, "topic9Three");
            return (Criteria) this;
        }

        public Criteria andTopic9FourIsNull() {
            addCriterion("topic9_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic9FourIsNotNull() {
            addCriterion("topic9_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic9FourEqualTo(String value) {
            addCriterion("topic9_four =", value, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FourNotEqualTo(String value) {
            addCriterion("topic9_four <>", value, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FourGreaterThan(String value) {
            addCriterion("topic9_four >", value, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic9_four >=", value, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FourLessThan(String value) {
            addCriterion("topic9_four <", value, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FourLessThanOrEqualTo(String value) {
            addCriterion("topic9_four <=", value, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FourLike(String value) {
            addCriterion("topic9_four like", value, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FourNotLike(String value) {
            addCriterion("topic9_four not like", value, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FourIn(List<String> values) {
            addCriterion("topic9_four in", values, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FourNotIn(List<String> values) {
            addCriterion("topic9_four not in", values, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FourBetween(String value1, String value2) {
            addCriterion("topic9_four between", value1, value2, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FourNotBetween(String value1, String value2) {
            addCriterion("topic9_four not between", value1, value2, "topic9Four");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionIsNull() {
            addCriterion("topic9_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionIsNotNull() {
            addCriterion("topic9_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionEqualTo(String value) {
            addCriterion("topic9_fraction =", value, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionNotEqualTo(String value) {
            addCriterion("topic9_fraction <>", value, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionGreaterThan(String value) {
            addCriterion("topic9_fraction >", value, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic9_fraction >=", value, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionLessThan(String value) {
            addCriterion("topic9_fraction <", value, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionLessThanOrEqualTo(String value) {
            addCriterion("topic9_fraction <=", value, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionLike(String value) {
            addCriterion("topic9_fraction like", value, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionNotLike(String value) {
            addCriterion("topic9_fraction not like", value, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionIn(List<String> values) {
            addCriterion("topic9_fraction in", values, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionNotIn(List<String> values) {
            addCriterion("topic9_fraction not in", values, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionBetween(String value1, String value2) {
            addCriterion("topic9_fraction between", value1, value2, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic9FractionNotBetween(String value1, String value2) {
            addCriterion("topic9_fraction not between", value1, value2, "topic9Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10OneIsNull() {
            addCriterion("topic10_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic10OneIsNotNull() {
            addCriterion("topic10_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic10OneEqualTo(String value) {
            addCriterion("topic10_one =", value, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10OneNotEqualTo(String value) {
            addCriterion("topic10_one <>", value, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10OneGreaterThan(String value) {
            addCriterion("topic10_one >", value, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic10_one >=", value, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10OneLessThan(String value) {
            addCriterion("topic10_one <", value, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10OneLessThanOrEqualTo(String value) {
            addCriterion("topic10_one <=", value, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10OneLike(String value) {
            addCriterion("topic10_one like", value, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10OneNotLike(String value) {
            addCriterion("topic10_one not like", value, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10OneIn(List<String> values) {
            addCriterion("topic10_one in", values, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10OneNotIn(List<String> values) {
            addCriterion("topic10_one not in", values, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10OneBetween(String value1, String value2) {
            addCriterion("topic10_one between", value1, value2, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10OneNotBetween(String value1, String value2) {
            addCriterion("topic10_one not between", value1, value2, "topic10One");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoIsNull() {
            addCriterion("topic10_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoIsNotNull() {
            addCriterion("topic10_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoEqualTo(String value) {
            addCriterion("topic10_two =", value, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoNotEqualTo(String value) {
            addCriterion("topic10_two <>", value, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoGreaterThan(String value) {
            addCriterion("topic10_two >", value, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic10_two >=", value, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoLessThan(String value) {
            addCriterion("topic10_two <", value, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoLessThanOrEqualTo(String value) {
            addCriterion("topic10_two <=", value, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoLike(String value) {
            addCriterion("topic10_two like", value, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoNotLike(String value) {
            addCriterion("topic10_two not like", value, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoIn(List<String> values) {
            addCriterion("topic10_two in", values, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoNotIn(List<String> values) {
            addCriterion("topic10_two not in", values, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoBetween(String value1, String value2) {
            addCriterion("topic10_two between", value1, value2, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10TwoNotBetween(String value1, String value2) {
            addCriterion("topic10_two not between", value1, value2, "topic10Two");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeIsNull() {
            addCriterion("topic10_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeIsNotNull() {
            addCriterion("topic10_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeEqualTo(String value) {
            addCriterion("topic10_three =", value, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeNotEqualTo(String value) {
            addCriterion("topic10_three <>", value, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeGreaterThan(String value) {
            addCriterion("topic10_three >", value, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic10_three >=", value, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeLessThan(String value) {
            addCriterion("topic10_three <", value, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic10_three <=", value, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeLike(String value) {
            addCriterion("topic10_three like", value, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeNotLike(String value) {
            addCriterion("topic10_three not like", value, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeIn(List<String> values) {
            addCriterion("topic10_three in", values, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeNotIn(List<String> values) {
            addCriterion("topic10_three not in", values, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeBetween(String value1, String value2) {
            addCriterion("topic10_three between", value1, value2, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10ThreeNotBetween(String value1, String value2) {
            addCriterion("topic10_three not between", value1, value2, "topic10Three");
            return (Criteria) this;
        }

        public Criteria andTopic10FourIsNull() {
            addCriterion("topic10_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic10FourIsNotNull() {
            addCriterion("topic10_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic10FourEqualTo(String value) {
            addCriterion("topic10_four =", value, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FourNotEqualTo(String value) {
            addCriterion("topic10_four <>", value, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FourGreaterThan(String value) {
            addCriterion("topic10_four >", value, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic10_four >=", value, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FourLessThan(String value) {
            addCriterion("topic10_four <", value, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FourLessThanOrEqualTo(String value) {
            addCriterion("topic10_four <=", value, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FourLike(String value) {
            addCriterion("topic10_four like", value, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FourNotLike(String value) {
            addCriterion("topic10_four not like", value, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FourIn(List<String> values) {
            addCriterion("topic10_four in", values, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FourNotIn(List<String> values) {
            addCriterion("topic10_four not in", values, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FourBetween(String value1, String value2) {
            addCriterion("topic10_four between", value1, value2, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FourNotBetween(String value1, String value2) {
            addCriterion("topic10_four not between", value1, value2, "topic10Four");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionIsNull() {
            addCriterion("topic10_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionIsNotNull() {
            addCriterion("topic10_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionEqualTo(String value) {
            addCriterion("topic10_fraction =", value, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionNotEqualTo(String value) {
            addCriterion("topic10_fraction <>", value, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionGreaterThan(String value) {
            addCriterion("topic10_fraction >", value, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic10_fraction >=", value, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionLessThan(String value) {
            addCriterion("topic10_fraction <", value, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionLessThanOrEqualTo(String value) {
            addCriterion("topic10_fraction <=", value, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionLike(String value) {
            addCriterion("topic10_fraction like", value, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionNotLike(String value) {
            addCriterion("topic10_fraction not like", value, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionIn(List<String> values) {
            addCriterion("topic10_fraction in", values, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionNotIn(List<String> values) {
            addCriterion("topic10_fraction not in", values, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionBetween(String value1, String value2) {
            addCriterion("topic10_fraction between", value1, value2, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic10FractionNotBetween(String value1, String value2) {
            addCriterion("topic10_fraction not between", value1, value2, "topic10Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11OneIsNull() {
            addCriterion("topic11_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic11OneIsNotNull() {
            addCriterion("topic11_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic11OneEqualTo(String value) {
            addCriterion("topic11_one =", value, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11OneNotEqualTo(String value) {
            addCriterion("topic11_one <>", value, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11OneGreaterThan(String value) {
            addCriterion("topic11_one >", value, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic11_one >=", value, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11OneLessThan(String value) {
            addCriterion("topic11_one <", value, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11OneLessThanOrEqualTo(String value) {
            addCriterion("topic11_one <=", value, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11OneLike(String value) {
            addCriterion("topic11_one like", value, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11OneNotLike(String value) {
            addCriterion("topic11_one not like", value, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11OneIn(List<String> values) {
            addCriterion("topic11_one in", values, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11OneNotIn(List<String> values) {
            addCriterion("topic11_one not in", values, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11OneBetween(String value1, String value2) {
            addCriterion("topic11_one between", value1, value2, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11OneNotBetween(String value1, String value2) {
            addCriterion("topic11_one not between", value1, value2, "topic11One");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoIsNull() {
            addCriterion("topic11_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoIsNotNull() {
            addCriterion("topic11_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoEqualTo(String value) {
            addCriterion("topic11_two =", value, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoNotEqualTo(String value) {
            addCriterion("topic11_two <>", value, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoGreaterThan(String value) {
            addCriterion("topic11_two >", value, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic11_two >=", value, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoLessThan(String value) {
            addCriterion("topic11_two <", value, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoLessThanOrEqualTo(String value) {
            addCriterion("topic11_two <=", value, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoLike(String value) {
            addCriterion("topic11_two like", value, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoNotLike(String value) {
            addCriterion("topic11_two not like", value, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoIn(List<String> values) {
            addCriterion("topic11_two in", values, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoNotIn(List<String> values) {
            addCriterion("topic11_two not in", values, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoBetween(String value1, String value2) {
            addCriterion("topic11_two between", value1, value2, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11TwoNotBetween(String value1, String value2) {
            addCriterion("topic11_two not between", value1, value2, "topic11Two");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeIsNull() {
            addCriterion("topic11_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeIsNotNull() {
            addCriterion("topic11_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeEqualTo(String value) {
            addCriterion("topic11_three =", value, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeNotEqualTo(String value) {
            addCriterion("topic11_three <>", value, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeGreaterThan(String value) {
            addCriterion("topic11_three >", value, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic11_three >=", value, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeLessThan(String value) {
            addCriterion("topic11_three <", value, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic11_three <=", value, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeLike(String value) {
            addCriterion("topic11_three like", value, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeNotLike(String value) {
            addCriterion("topic11_three not like", value, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeIn(List<String> values) {
            addCriterion("topic11_three in", values, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeNotIn(List<String> values) {
            addCriterion("topic11_three not in", values, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeBetween(String value1, String value2) {
            addCriterion("topic11_three between", value1, value2, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11ThreeNotBetween(String value1, String value2) {
            addCriterion("topic11_three not between", value1, value2, "topic11Three");
            return (Criteria) this;
        }

        public Criteria andTopic11FourIsNull() {
            addCriterion("topic11_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic11FourIsNotNull() {
            addCriterion("topic11_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic11FourEqualTo(String value) {
            addCriterion("topic11_four =", value, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FourNotEqualTo(String value) {
            addCriterion("topic11_four <>", value, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FourGreaterThan(String value) {
            addCriterion("topic11_four >", value, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic11_four >=", value, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FourLessThan(String value) {
            addCriterion("topic11_four <", value, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FourLessThanOrEqualTo(String value) {
            addCriterion("topic11_four <=", value, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FourLike(String value) {
            addCriterion("topic11_four like", value, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FourNotLike(String value) {
            addCriterion("topic11_four not like", value, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FourIn(List<String> values) {
            addCriterion("topic11_four in", values, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FourNotIn(List<String> values) {
            addCriterion("topic11_four not in", values, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FourBetween(String value1, String value2) {
            addCriterion("topic11_four between", value1, value2, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FourNotBetween(String value1, String value2) {
            addCriterion("topic11_four not between", value1, value2, "topic11Four");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionIsNull() {
            addCriterion("topic11_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionIsNotNull() {
            addCriterion("topic11_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionEqualTo(String value) {
            addCriterion("topic11_fraction =", value, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionNotEqualTo(String value) {
            addCriterion("topic11_fraction <>", value, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionGreaterThan(String value) {
            addCriterion("topic11_fraction >", value, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic11_fraction >=", value, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionLessThan(String value) {
            addCriterion("topic11_fraction <", value, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionLessThanOrEqualTo(String value) {
            addCriterion("topic11_fraction <=", value, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionLike(String value) {
            addCriterion("topic11_fraction like", value, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionNotLike(String value) {
            addCriterion("topic11_fraction not like", value, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionIn(List<String> values) {
            addCriterion("topic11_fraction in", values, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionNotIn(List<String> values) {
            addCriterion("topic11_fraction not in", values, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionBetween(String value1, String value2) {
            addCriterion("topic11_fraction between", value1, value2, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic11FractionNotBetween(String value1, String value2) {
            addCriterion("topic11_fraction not between", value1, value2, "topic11Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12OneIsNull() {
            addCriterion("topic12_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic12OneIsNotNull() {
            addCriterion("topic12_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic12OneEqualTo(String value) {
            addCriterion("topic12_one =", value, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12OneNotEqualTo(String value) {
            addCriterion("topic12_one <>", value, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12OneGreaterThan(String value) {
            addCriterion("topic12_one >", value, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic12_one >=", value, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12OneLessThan(String value) {
            addCriterion("topic12_one <", value, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12OneLessThanOrEqualTo(String value) {
            addCriterion("topic12_one <=", value, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12OneLike(String value) {
            addCriterion("topic12_one like", value, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12OneNotLike(String value) {
            addCriterion("topic12_one not like", value, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12OneIn(List<String> values) {
            addCriterion("topic12_one in", values, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12OneNotIn(List<String> values) {
            addCriterion("topic12_one not in", values, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12OneBetween(String value1, String value2) {
            addCriterion("topic12_one between", value1, value2, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12OneNotBetween(String value1, String value2) {
            addCriterion("topic12_one not between", value1, value2, "topic12One");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoIsNull() {
            addCriterion("topic12_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoIsNotNull() {
            addCriterion("topic12_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoEqualTo(String value) {
            addCriterion("topic12_two =", value, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoNotEqualTo(String value) {
            addCriterion("topic12_two <>", value, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoGreaterThan(String value) {
            addCriterion("topic12_two >", value, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic12_two >=", value, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoLessThan(String value) {
            addCriterion("topic12_two <", value, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoLessThanOrEqualTo(String value) {
            addCriterion("topic12_two <=", value, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoLike(String value) {
            addCriterion("topic12_two like", value, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoNotLike(String value) {
            addCriterion("topic12_two not like", value, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoIn(List<String> values) {
            addCriterion("topic12_two in", values, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoNotIn(List<String> values) {
            addCriterion("topic12_two not in", values, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoBetween(String value1, String value2) {
            addCriterion("topic12_two between", value1, value2, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12TwoNotBetween(String value1, String value2) {
            addCriterion("topic12_two not between", value1, value2, "topic12Two");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeIsNull() {
            addCriterion("topic12_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeIsNotNull() {
            addCriterion("topic12_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeEqualTo(String value) {
            addCriterion("topic12_three =", value, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeNotEqualTo(String value) {
            addCriterion("topic12_three <>", value, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeGreaterThan(String value) {
            addCriterion("topic12_three >", value, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic12_three >=", value, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeLessThan(String value) {
            addCriterion("topic12_three <", value, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic12_three <=", value, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeLike(String value) {
            addCriterion("topic12_three like", value, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeNotLike(String value) {
            addCriterion("topic12_three not like", value, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeIn(List<String> values) {
            addCriterion("topic12_three in", values, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeNotIn(List<String> values) {
            addCriterion("topic12_three not in", values, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeBetween(String value1, String value2) {
            addCriterion("topic12_three between", value1, value2, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12ThreeNotBetween(String value1, String value2) {
            addCriterion("topic12_three not between", value1, value2, "topic12Three");
            return (Criteria) this;
        }

        public Criteria andTopic12FourIsNull() {
            addCriterion("topic12_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic12FourIsNotNull() {
            addCriterion("topic12_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic12FourEqualTo(String value) {
            addCriterion("topic12_four =", value, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FourNotEqualTo(String value) {
            addCriterion("topic12_four <>", value, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FourGreaterThan(String value) {
            addCriterion("topic12_four >", value, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic12_four >=", value, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FourLessThan(String value) {
            addCriterion("topic12_four <", value, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FourLessThanOrEqualTo(String value) {
            addCriterion("topic12_four <=", value, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FourLike(String value) {
            addCriterion("topic12_four like", value, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FourNotLike(String value) {
            addCriterion("topic12_four not like", value, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FourIn(List<String> values) {
            addCriterion("topic12_four in", values, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FourNotIn(List<String> values) {
            addCriterion("topic12_four not in", values, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FourBetween(String value1, String value2) {
            addCriterion("topic12_four between", value1, value2, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FourNotBetween(String value1, String value2) {
            addCriterion("topic12_four not between", value1, value2, "topic12Four");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionIsNull() {
            addCriterion("topic12_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionIsNotNull() {
            addCriterion("topic12_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionEqualTo(String value) {
            addCriterion("topic12_fraction =", value, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionNotEqualTo(String value) {
            addCriterion("topic12_fraction <>", value, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionGreaterThan(String value) {
            addCriterion("topic12_fraction >", value, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic12_fraction >=", value, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionLessThan(String value) {
            addCriterion("topic12_fraction <", value, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionLessThanOrEqualTo(String value) {
            addCriterion("topic12_fraction <=", value, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionLike(String value) {
            addCriterion("topic12_fraction like", value, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionNotLike(String value) {
            addCriterion("topic12_fraction not like", value, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionIn(List<String> values) {
            addCriterion("topic12_fraction in", values, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionNotIn(List<String> values) {
            addCriterion("topic12_fraction not in", values, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionBetween(String value1, String value2) {
            addCriterion("topic12_fraction between", value1, value2, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic12FractionNotBetween(String value1, String value2) {
            addCriterion("topic12_fraction not between", value1, value2, "topic12Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13OneIsNull() {
            addCriterion("topic13_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic13OneIsNotNull() {
            addCriterion("topic13_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic13OneEqualTo(String value) {
            addCriterion("topic13_one =", value, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13OneNotEqualTo(String value) {
            addCriterion("topic13_one <>", value, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13OneGreaterThan(String value) {
            addCriterion("topic13_one >", value, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic13_one >=", value, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13OneLessThan(String value) {
            addCriterion("topic13_one <", value, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13OneLessThanOrEqualTo(String value) {
            addCriterion("topic13_one <=", value, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13OneLike(String value) {
            addCriterion("topic13_one like", value, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13OneNotLike(String value) {
            addCriterion("topic13_one not like", value, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13OneIn(List<String> values) {
            addCriterion("topic13_one in", values, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13OneNotIn(List<String> values) {
            addCriterion("topic13_one not in", values, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13OneBetween(String value1, String value2) {
            addCriterion("topic13_one between", value1, value2, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13OneNotBetween(String value1, String value2) {
            addCriterion("topic13_one not between", value1, value2, "topic13One");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoIsNull() {
            addCriterion("topic13_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoIsNotNull() {
            addCriterion("topic13_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoEqualTo(String value) {
            addCriterion("topic13_two =", value, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoNotEqualTo(String value) {
            addCriterion("topic13_two <>", value, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoGreaterThan(String value) {
            addCriterion("topic13_two >", value, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic13_two >=", value, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoLessThan(String value) {
            addCriterion("topic13_two <", value, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoLessThanOrEqualTo(String value) {
            addCriterion("topic13_two <=", value, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoLike(String value) {
            addCriterion("topic13_two like", value, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoNotLike(String value) {
            addCriterion("topic13_two not like", value, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoIn(List<String> values) {
            addCriterion("topic13_two in", values, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoNotIn(List<String> values) {
            addCriterion("topic13_two not in", values, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoBetween(String value1, String value2) {
            addCriterion("topic13_two between", value1, value2, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13TwoNotBetween(String value1, String value2) {
            addCriterion("topic13_two not between", value1, value2, "topic13Two");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeIsNull() {
            addCriterion("topic13_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeIsNotNull() {
            addCriterion("topic13_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeEqualTo(String value) {
            addCriterion("topic13_three =", value, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeNotEqualTo(String value) {
            addCriterion("topic13_three <>", value, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeGreaterThan(String value) {
            addCriterion("topic13_three >", value, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic13_three >=", value, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeLessThan(String value) {
            addCriterion("topic13_three <", value, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic13_three <=", value, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeLike(String value) {
            addCriterion("topic13_three like", value, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeNotLike(String value) {
            addCriterion("topic13_three not like", value, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeIn(List<String> values) {
            addCriterion("topic13_three in", values, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeNotIn(List<String> values) {
            addCriterion("topic13_three not in", values, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeBetween(String value1, String value2) {
            addCriterion("topic13_three between", value1, value2, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13ThreeNotBetween(String value1, String value2) {
            addCriterion("topic13_three not between", value1, value2, "topic13Three");
            return (Criteria) this;
        }

        public Criteria andTopic13FourIsNull() {
            addCriterion("topic13_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic13FourIsNotNull() {
            addCriterion("topic13_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic13FourEqualTo(String value) {
            addCriterion("topic13_four =", value, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FourNotEqualTo(String value) {
            addCriterion("topic13_four <>", value, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FourGreaterThan(String value) {
            addCriterion("topic13_four >", value, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic13_four >=", value, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FourLessThan(String value) {
            addCriterion("topic13_four <", value, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FourLessThanOrEqualTo(String value) {
            addCriterion("topic13_four <=", value, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FourLike(String value) {
            addCriterion("topic13_four like", value, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FourNotLike(String value) {
            addCriterion("topic13_four not like", value, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FourIn(List<String> values) {
            addCriterion("topic13_four in", values, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FourNotIn(List<String> values) {
            addCriterion("topic13_four not in", values, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FourBetween(String value1, String value2) {
            addCriterion("topic13_four between", value1, value2, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FourNotBetween(String value1, String value2) {
            addCriterion("topic13_four not between", value1, value2, "topic13Four");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionIsNull() {
            addCriterion("topic13_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionIsNotNull() {
            addCriterion("topic13_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionEqualTo(String value) {
            addCriterion("topic13_fraction =", value, "topic13Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionNotEqualTo(String value) {
            addCriterion("topic13_fraction <>", value, "topic13Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionGreaterThan(String value) {
            addCriterion("topic13_fraction >", value, "topic13Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic13_fraction >=", value, "topic13Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionLessThan(String value) {
            addCriterion("topic13_fraction <", value, "topic13Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionLessThanOrEqualTo(String value) {
            addCriterion("topic13_fraction <=", value, "topic13Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionLike(String value) {
            addCriterion("topic13_fraction like", value, "topic13Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionNotLike(String value) {
            addCriterion("topic13_fraction not like", value, "topic13Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionIn(List<String> values) {
            addCriterion("topic13_fraction in", values, "topic13Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionNotIn(List<String> values) {
            addCriterion("topic13_fraction not in", values, "topic13Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionBetween(String value1, String value2) {
            addCriterion("topic13_fraction between", value1, value2, "topic13Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic13FractionNotBetween(String value1, String value2) {
            addCriterion("topic13_fraction not between", value1, value2, "topic13Fraction");
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