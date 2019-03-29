package cn.vo.pojo.entity;

import java.util.ArrayList;
import java.util.List;

public class TestHansExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestHansExample() {
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

        public Criteria andHansidIsNull() {
            addCriterion("hansId is null");
            return (Criteria) this;
        }

        public Criteria andHansidIsNotNull() {
            addCriterion("hansId is not null");
            return (Criteria) this;
        }

        public Criteria andHansidEqualTo(Integer value) {
            addCriterion("hansId =", value, "hansid");
            return (Criteria) this;
        }

        public Criteria andHansidNotEqualTo(Integer value) {
            addCriterion("hansId <>", value, "hansid");
            return (Criteria) this;
        }

        public Criteria andHansidGreaterThan(Integer value) {
            addCriterion("hansId >", value, "hansid");
            return (Criteria) this;
        }

        public Criteria andHansidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hansId >=", value, "hansid");
            return (Criteria) this;
        }

        public Criteria andHansidLessThan(Integer value) {
            addCriterion("hansId <", value, "hansid");
            return (Criteria) this;
        }

        public Criteria andHansidLessThanOrEqualTo(Integer value) {
            addCriterion("hansId <=", value, "hansid");
            return (Criteria) this;
        }

        public Criteria andHansidIn(List<Integer> values) {
            addCriterion("hansId in", values, "hansid");
            return (Criteria) this;
        }

        public Criteria andHansidNotIn(List<Integer> values) {
            addCriterion("hansId not in", values, "hansid");
            return (Criteria) this;
        }

        public Criteria andHansidBetween(Integer value1, Integer value2) {
            addCriterion("hansId between", value1, value2, "hansid");
            return (Criteria) this;
        }

        public Criteria andHansidNotBetween(Integer value1, Integer value2) {
            addCriterion("hansId not between", value1, value2, "hansid");
            return (Criteria) this;
        }

        public Criteria andTestidIsNull() {
            addCriterion("testId is null");
            return (Criteria) this;
        }

        public Criteria andTestidIsNotNull() {
            addCriterion("testId is not null");
            return (Criteria) this;
        }

        public Criteria andTestidEqualTo(Integer value) {
            addCriterion("testId =", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotEqualTo(Integer value) {
            addCriterion("testId <>", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThan(Integer value) {
            addCriterion("testId >", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThanOrEqualTo(Integer value) {
            addCriterion("testId >=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThan(Integer value) {
            addCriterion("testId <", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThanOrEqualTo(Integer value) {
            addCriterion("testId <=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidIn(List<Integer> values) {
            addCriterion("testId in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotIn(List<Integer> values) {
            addCriterion("testId not in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidBetween(Integer value1, Integer value2) {
            addCriterion("testId between", value1, value2, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotBetween(Integer value1, Integer value2) {
            addCriterion("testId not between", value1, value2, "testid");
            return (Criteria) this;
        }

        public Criteria andTrough4IsNull() {
            addCriterion("trough4 is null");
            return (Criteria) this;
        }

        public Criteria andTrough4IsNotNull() {
            addCriterion("trough4 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough4EqualTo(String value) {
            addCriterion("trough4 =", value, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough4NotEqualTo(String value) {
            addCriterion("trough4 <>", value, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough4GreaterThan(String value) {
            addCriterion("trough4 >", value, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough4GreaterThanOrEqualTo(String value) {
            addCriterion("trough4 >=", value, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough4LessThan(String value) {
            addCriterion("trough4 <", value, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough4LessThanOrEqualTo(String value) {
            addCriterion("trough4 <=", value, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough4Like(String value) {
            addCriterion("trough4 like", value, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough4NotLike(String value) {
            addCriterion("trough4 not like", value, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough4In(List<String> values) {
            addCriterion("trough4 in", values, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough4NotIn(List<String> values) {
            addCriterion("trough4 not in", values, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough4Between(String value1, String value2) {
            addCriterion("trough4 between", value1, value2, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough4NotBetween(String value1, String value2) {
            addCriterion("trough4 not between", value1, value2, "trough4");
            return (Criteria) this;
        }

        public Criteria andTrough5IsNull() {
            addCriterion("trough5 is null");
            return (Criteria) this;
        }

        public Criteria andTrough5IsNotNull() {
            addCriterion("trough5 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough5EqualTo(String value) {
            addCriterion("trough5 =", value, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough5NotEqualTo(String value) {
            addCriterion("trough5 <>", value, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough5GreaterThan(String value) {
            addCriterion("trough5 >", value, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough5GreaterThanOrEqualTo(String value) {
            addCriterion("trough5 >=", value, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough5LessThan(String value) {
            addCriterion("trough5 <", value, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough5LessThanOrEqualTo(String value) {
            addCriterion("trough5 <=", value, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough5Like(String value) {
            addCriterion("trough5 like", value, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough5NotLike(String value) {
            addCriterion("trough5 not like", value, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough5In(List<String> values) {
            addCriterion("trough5 in", values, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough5NotIn(List<String> values) {
            addCriterion("trough5 not in", values, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough5Between(String value1, String value2) {
            addCriterion("trough5 between", value1, value2, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough5NotBetween(String value1, String value2) {
            addCriterion("trough5 not between", value1, value2, "trough5");
            return (Criteria) this;
        }

        public Criteria andTrough6IsNull() {
            addCriterion("trough6 is null");
            return (Criteria) this;
        }

        public Criteria andTrough6IsNotNull() {
            addCriterion("trough6 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough6EqualTo(String value) {
            addCriterion("trough6 =", value, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough6NotEqualTo(String value) {
            addCriterion("trough6 <>", value, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough6GreaterThan(String value) {
            addCriterion("trough6 >", value, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough6GreaterThanOrEqualTo(String value) {
            addCriterion("trough6 >=", value, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough6LessThan(String value) {
            addCriterion("trough6 <", value, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough6LessThanOrEqualTo(String value) {
            addCriterion("trough6 <=", value, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough6Like(String value) {
            addCriterion("trough6 like", value, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough6NotLike(String value) {
            addCriterion("trough6 not like", value, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough6In(List<String> values) {
            addCriterion("trough6 in", values, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough6NotIn(List<String> values) {
            addCriterion("trough6 not in", values, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough6Between(String value1, String value2) {
            addCriterion("trough6 between", value1, value2, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough6NotBetween(String value1, String value2) {
            addCriterion("trough6 not between", value1, value2, "trough6");
            return (Criteria) this;
        }

        public Criteria andTrough7IsNull() {
            addCriterion("trough7 is null");
            return (Criteria) this;
        }

        public Criteria andTrough7IsNotNull() {
            addCriterion("trough7 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough7EqualTo(Integer value) {
            addCriterion("trough7 =", value, "trough7");
            return (Criteria) this;
        }

        public Criteria andTrough7NotEqualTo(Integer value) {
            addCriterion("trough7 <>", value, "trough7");
            return (Criteria) this;
        }

        public Criteria andTrough7GreaterThan(Integer value) {
            addCriterion("trough7 >", value, "trough7");
            return (Criteria) this;
        }

        public Criteria andTrough7GreaterThanOrEqualTo(Integer value) {
            addCriterion("trough7 >=", value, "trough7");
            return (Criteria) this;
        }

        public Criteria andTrough7LessThan(Integer value) {
            addCriterion("trough7 <", value, "trough7");
            return (Criteria) this;
        }

        public Criteria andTrough7LessThanOrEqualTo(Integer value) {
            addCriterion("trough7 <=", value, "trough7");
            return (Criteria) this;
        }

        public Criteria andTrough7In(List<Integer> values) {
            addCriterion("trough7 in", values, "trough7");
            return (Criteria) this;
        }

        public Criteria andTrough7NotIn(List<Integer> values) {
            addCriterion("trough7 not in", values, "trough7");
            return (Criteria) this;
        }

        public Criteria andTrough7Between(Integer value1, Integer value2) {
            addCriterion("trough7 between", value1, value2, "trough7");
            return (Criteria) this;
        }

        public Criteria andTrough7NotBetween(Integer value1, Integer value2) {
            addCriterion("trough7 not between", value1, value2, "trough7");
            return (Criteria) this;
        }

        public Criteria andTrough8IsNull() {
            addCriterion("trough8 is null");
            return (Criteria) this;
        }

        public Criteria andTrough8IsNotNull() {
            addCriterion("trough8 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough8EqualTo(String value) {
            addCriterion("trough8 =", value, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough8NotEqualTo(String value) {
            addCriterion("trough8 <>", value, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough8GreaterThan(String value) {
            addCriterion("trough8 >", value, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough8GreaterThanOrEqualTo(String value) {
            addCriterion("trough8 >=", value, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough8LessThan(String value) {
            addCriterion("trough8 <", value, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough8LessThanOrEqualTo(String value) {
            addCriterion("trough8 <=", value, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough8Like(String value) {
            addCriterion("trough8 like", value, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough8NotLike(String value) {
            addCriterion("trough8 not like", value, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough8In(List<String> values) {
            addCriterion("trough8 in", values, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough8NotIn(List<String> values) {
            addCriterion("trough8 not in", values, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough8Between(String value1, String value2) {
            addCriterion("trough8 between", value1, value2, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough8NotBetween(String value1, String value2) {
            addCriterion("trough8 not between", value1, value2, "trough8");
            return (Criteria) this;
        }

        public Criteria andTrough9IsNull() {
            addCriterion("trough9 is null");
            return (Criteria) this;
        }

        public Criteria andTrough9IsNotNull() {
            addCriterion("trough9 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough9EqualTo(String value) {
            addCriterion("trough9 =", value, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough9NotEqualTo(String value) {
            addCriterion("trough9 <>", value, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough9GreaterThan(String value) {
            addCriterion("trough9 >", value, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough9GreaterThanOrEqualTo(String value) {
            addCriterion("trough9 >=", value, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough9LessThan(String value) {
            addCriterion("trough9 <", value, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough9LessThanOrEqualTo(String value) {
            addCriterion("trough9 <=", value, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough9Like(String value) {
            addCriterion("trough9 like", value, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough9NotLike(String value) {
            addCriterion("trough9 not like", value, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough9In(List<String> values) {
            addCriterion("trough9 in", values, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough9NotIn(List<String> values) {
            addCriterion("trough9 not in", values, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough9Between(String value1, String value2) {
            addCriterion("trough9 between", value1, value2, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough9NotBetween(String value1, String value2) {
            addCriterion("trough9 not between", value1, value2, "trough9");
            return (Criteria) this;
        }

        public Criteria andTrough10IsNull() {
            addCriterion("trough10 is null");
            return (Criteria) this;
        }

        public Criteria andTrough10IsNotNull() {
            addCriterion("trough10 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough10EqualTo(String value) {
            addCriterion("trough10 =", value, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough10NotEqualTo(String value) {
            addCriterion("trough10 <>", value, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough10GreaterThan(String value) {
            addCriterion("trough10 >", value, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough10GreaterThanOrEqualTo(String value) {
            addCriterion("trough10 >=", value, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough10LessThan(String value) {
            addCriterion("trough10 <", value, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough10LessThanOrEqualTo(String value) {
            addCriterion("trough10 <=", value, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough10Like(String value) {
            addCriterion("trough10 like", value, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough10NotLike(String value) {
            addCriterion("trough10 not like", value, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough10In(List<String> values) {
            addCriterion("trough10 in", values, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough10NotIn(List<String> values) {
            addCriterion("trough10 not in", values, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough10Between(String value1, String value2) {
            addCriterion("trough10 between", value1, value2, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough10NotBetween(String value1, String value2) {
            addCriterion("trough10 not between", value1, value2, "trough10");
            return (Criteria) this;
        }

        public Criteria andTrough11IsNull() {
            addCriterion("trough11 is null");
            return (Criteria) this;
        }

        public Criteria andTrough11IsNotNull() {
            addCriterion("trough11 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough11EqualTo(String value) {
            addCriterion("trough11 =", value, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough11NotEqualTo(String value) {
            addCriterion("trough11 <>", value, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough11GreaterThan(String value) {
            addCriterion("trough11 >", value, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough11GreaterThanOrEqualTo(String value) {
            addCriterion("trough11 >=", value, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough11LessThan(String value) {
            addCriterion("trough11 <", value, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough11LessThanOrEqualTo(String value) {
            addCriterion("trough11 <=", value, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough11Like(String value) {
            addCriterion("trough11 like", value, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough11NotLike(String value) {
            addCriterion("trough11 not like", value, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough11In(List<String> values) {
            addCriterion("trough11 in", values, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough11NotIn(List<String> values) {
            addCriterion("trough11 not in", values, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough11Between(String value1, String value2) {
            addCriterion("trough11 between", value1, value2, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough11NotBetween(String value1, String value2) {
            addCriterion("trough11 not between", value1, value2, "trough11");
            return (Criteria) this;
        }

        public Criteria andTrough12IsNull() {
            addCriterion("trough12 is null");
            return (Criteria) this;
        }

        public Criteria andTrough12IsNotNull() {
            addCriterion("trough12 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough12EqualTo(String value) {
            addCriterion("trough12 =", value, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough12NotEqualTo(String value) {
            addCriterion("trough12 <>", value, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough12GreaterThan(String value) {
            addCriterion("trough12 >", value, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough12GreaterThanOrEqualTo(String value) {
            addCriterion("trough12 >=", value, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough12LessThan(String value) {
            addCriterion("trough12 <", value, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough12LessThanOrEqualTo(String value) {
            addCriterion("trough12 <=", value, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough12Like(String value) {
            addCriterion("trough12 like", value, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough12NotLike(String value) {
            addCriterion("trough12 not like", value, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough12In(List<String> values) {
            addCriterion("trough12 in", values, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough12NotIn(List<String> values) {
            addCriterion("trough12 not in", values, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough12Between(String value1, String value2) {
            addCriterion("trough12 between", value1, value2, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough12NotBetween(String value1, String value2) {
            addCriterion("trough12 not between", value1, value2, "trough12");
            return (Criteria) this;
        }

        public Criteria andTrough13IsNull() {
            addCriterion("trough13 is null");
            return (Criteria) this;
        }

        public Criteria andTrough13IsNotNull() {
            addCriterion("trough13 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough13EqualTo(String value) {
            addCriterion("trough13 =", value, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough13NotEqualTo(String value) {
            addCriterion("trough13 <>", value, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough13GreaterThan(String value) {
            addCriterion("trough13 >", value, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough13GreaterThanOrEqualTo(String value) {
            addCriterion("trough13 >=", value, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough13LessThan(String value) {
            addCriterion("trough13 <", value, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough13LessThanOrEqualTo(String value) {
            addCriterion("trough13 <=", value, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough13Like(String value) {
            addCriterion("trough13 like", value, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough13NotLike(String value) {
            addCriterion("trough13 not like", value, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough13In(List<String> values) {
            addCriterion("trough13 in", values, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough13NotIn(List<String> values) {
            addCriterion("trough13 not in", values, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough13Between(String value1, String value2) {
            addCriterion("trough13 between", value1, value2, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough13NotBetween(String value1, String value2) {
            addCriterion("trough13 not between", value1, value2, "trough13");
            return (Criteria) this;
        }

        public Criteria andTrough14IsNull() {
            addCriterion("trough14 is null");
            return (Criteria) this;
        }

        public Criteria andTrough14IsNotNull() {
            addCriterion("trough14 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough14EqualTo(String value) {
            addCriterion("trough14 =", value, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough14NotEqualTo(String value) {
            addCriterion("trough14 <>", value, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough14GreaterThan(String value) {
            addCriterion("trough14 >", value, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough14GreaterThanOrEqualTo(String value) {
            addCriterion("trough14 >=", value, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough14LessThan(String value) {
            addCriterion("trough14 <", value, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough14LessThanOrEqualTo(String value) {
            addCriterion("trough14 <=", value, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough14Like(String value) {
            addCriterion("trough14 like", value, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough14NotLike(String value) {
            addCriterion("trough14 not like", value, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough14In(List<String> values) {
            addCriterion("trough14 in", values, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough14NotIn(List<String> values) {
            addCriterion("trough14 not in", values, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough14Between(String value1, String value2) {
            addCriterion("trough14 between", value1, value2, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough14NotBetween(String value1, String value2) {
            addCriterion("trough14 not between", value1, value2, "trough14");
            return (Criteria) this;
        }

        public Criteria andTrough15IsNull() {
            addCriterion("trough15 is null");
            return (Criteria) this;
        }

        public Criteria andTrough15IsNotNull() {
            addCriterion("trough15 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough15EqualTo(String value) {
            addCriterion("trough15 =", value, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough15NotEqualTo(String value) {
            addCriterion("trough15 <>", value, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough15GreaterThan(String value) {
            addCriterion("trough15 >", value, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough15GreaterThanOrEqualTo(String value) {
            addCriterion("trough15 >=", value, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough15LessThan(String value) {
            addCriterion("trough15 <", value, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough15LessThanOrEqualTo(String value) {
            addCriterion("trough15 <=", value, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough15Like(String value) {
            addCriterion("trough15 like", value, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough15NotLike(String value) {
            addCriterion("trough15 not like", value, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough15In(List<String> values) {
            addCriterion("trough15 in", values, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough15NotIn(List<String> values) {
            addCriterion("trough15 not in", values, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough15Between(String value1, String value2) {
            addCriterion("trough15 between", value1, value2, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough15NotBetween(String value1, String value2) {
            addCriterion("trough15 not between", value1, value2, "trough15");
            return (Criteria) this;
        }

        public Criteria andTrough16IsNull() {
            addCriterion("trough16 is null");
            return (Criteria) this;
        }

        public Criteria andTrough16IsNotNull() {
            addCriterion("trough16 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough16EqualTo(String value) {
            addCriterion("trough16 =", value, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough16NotEqualTo(String value) {
            addCriterion("trough16 <>", value, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough16GreaterThan(String value) {
            addCriterion("trough16 >", value, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough16GreaterThanOrEqualTo(String value) {
            addCriterion("trough16 >=", value, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough16LessThan(String value) {
            addCriterion("trough16 <", value, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough16LessThanOrEqualTo(String value) {
            addCriterion("trough16 <=", value, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough16Like(String value) {
            addCriterion("trough16 like", value, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough16NotLike(String value) {
            addCriterion("trough16 not like", value, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough16In(List<String> values) {
            addCriterion("trough16 in", values, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough16NotIn(List<String> values) {
            addCriterion("trough16 not in", values, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough16Between(String value1, String value2) {
            addCriterion("trough16 between", value1, value2, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough16NotBetween(String value1, String value2) {
            addCriterion("trough16 not between", value1, value2, "trough16");
            return (Criteria) this;
        }

        public Criteria andTrough17IsNull() {
            addCriterion("trough17 is null");
            return (Criteria) this;
        }

        public Criteria andTrough17IsNotNull() {
            addCriterion("trough17 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough17EqualTo(String value) {
            addCriterion("trough17 =", value, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough17NotEqualTo(String value) {
            addCriterion("trough17 <>", value, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough17GreaterThan(String value) {
            addCriterion("trough17 >", value, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough17GreaterThanOrEqualTo(String value) {
            addCriterion("trough17 >=", value, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough17LessThan(String value) {
            addCriterion("trough17 <", value, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough17LessThanOrEqualTo(String value) {
            addCriterion("trough17 <=", value, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough17Like(String value) {
            addCriterion("trough17 like", value, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough17NotLike(String value) {
            addCriterion("trough17 not like", value, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough17In(List<String> values) {
            addCriterion("trough17 in", values, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough17NotIn(List<String> values) {
            addCriterion("trough17 not in", values, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough17Between(String value1, String value2) {
            addCriterion("trough17 between", value1, value2, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough17NotBetween(String value1, String value2) {
            addCriterion("trough17 not between", value1, value2, "trough17");
            return (Criteria) this;
        }

        public Criteria andTrough18IsNull() {
            addCriterion("trough18 is null");
            return (Criteria) this;
        }

        public Criteria andTrough18IsNotNull() {
            addCriterion("trough18 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough18EqualTo(String value) {
            addCriterion("trough18 =", value, "trough18");
            return (Criteria) this;
        }

        public Criteria andTrough18NotEqualTo(String value) {
            addCriterion("trough18 <>", value, "trough18");
            return (Criteria) this;
        }

        public Criteria andTrough18GreaterThan(String value) {
            addCriterion("trough18 >", value, "trough18");
            return (Criteria) this;
        }

        public Criteria andTrough18GreaterThanOrEqualTo(String value) {
            addCriterion("trough18 >=", value, "trough18");
            return (Criteria) this;
        }

        public Criteria andTrough18LessThan(String value) {
            addCriterion("trough18 <", value, "trough18");
            return (Criteria) this;
        }

        public Criteria andTrough18LessThanOrEqualTo(String value) {
            addCriterion("trough18 <=", value, "trough18");
            return (Criteria) this;
        }

        public Criteria andTrough18Like(String value) {
            addCriterion("trough18 like", value, "trough18");
            return (Criteria) this;
        }

        public Criteria andTrough18NotLike(String value) {
            addCriterion("trough18 not like", value, "trough18");
            return (Criteria) this;
        }

        public Criteria andTrough18In(List<String> values) {
            addCriterion("trough18 in", values, "trough18");
            return (Criteria) this;
        }

        public Criteria andTrough18NotIn(List<String> values) {
            addCriterion("trough18 not in", values, "trough18");
            return (Criteria) this;
        }

        public Criteria andTrough18Between(String value1, String value2) {
            addCriterion("trough18 between", value1, value2, "trough18");
            return (Criteria) this;
        }

        public Criteria andTrough18NotBetween(String value1, String value2) {
            addCriterion("trough18 not between", value1, value2, "trough18");
            return (Criteria) this;
        }

        public Criteria andTopic41OneIsNull() {
            addCriterion("topic41_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic41OneIsNotNull() {
            addCriterion("topic41_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic41OneEqualTo(String value) {
            addCriterion("topic41_one =", value, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41OneNotEqualTo(String value) {
            addCriterion("topic41_one <>", value, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41OneGreaterThan(String value) {
            addCriterion("topic41_one >", value, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic41_one >=", value, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41OneLessThan(String value) {
            addCriterion("topic41_one <", value, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41OneLessThanOrEqualTo(String value) {
            addCriterion("topic41_one <=", value, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41OneLike(String value) {
            addCriterion("topic41_one like", value, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41OneNotLike(String value) {
            addCriterion("topic41_one not like", value, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41OneIn(List<String> values) {
            addCriterion("topic41_one in", values, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41OneNotIn(List<String> values) {
            addCriterion("topic41_one not in", values, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41OneBetween(String value1, String value2) {
            addCriterion("topic41_one between", value1, value2, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41OneNotBetween(String value1, String value2) {
            addCriterion("topic41_one not between", value1, value2, "topic41One");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoIsNull() {
            addCriterion("topic41_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoIsNotNull() {
            addCriterion("topic41_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoEqualTo(String value) {
            addCriterion("topic41_two =", value, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoNotEqualTo(String value) {
            addCriterion("topic41_two <>", value, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoGreaterThan(String value) {
            addCriterion("topic41_two >", value, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic41_two >=", value, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoLessThan(String value) {
            addCriterion("topic41_two <", value, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoLessThanOrEqualTo(String value) {
            addCriterion("topic41_two <=", value, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoLike(String value) {
            addCriterion("topic41_two like", value, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoNotLike(String value) {
            addCriterion("topic41_two not like", value, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoIn(List<String> values) {
            addCriterion("topic41_two in", values, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoNotIn(List<String> values) {
            addCriterion("topic41_two not in", values, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoBetween(String value1, String value2) {
            addCriterion("topic41_two between", value1, value2, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41TwoNotBetween(String value1, String value2) {
            addCriterion("topic41_two not between", value1, value2, "topic41Two");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeIsNull() {
            addCriterion("topic41_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeIsNotNull() {
            addCriterion("topic41_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeEqualTo(String value) {
            addCriterion("topic41_three =", value, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeNotEqualTo(String value) {
            addCriterion("topic41_three <>", value, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeGreaterThan(String value) {
            addCriterion("topic41_three >", value, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic41_three >=", value, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeLessThan(String value) {
            addCriterion("topic41_three <", value, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic41_three <=", value, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeLike(String value) {
            addCriterion("topic41_three like", value, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeNotLike(String value) {
            addCriterion("topic41_three not like", value, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeIn(List<String> values) {
            addCriterion("topic41_three in", values, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeNotIn(List<String> values) {
            addCriterion("topic41_three not in", values, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeBetween(String value1, String value2) {
            addCriterion("topic41_three between", value1, value2, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41ThreeNotBetween(String value1, String value2) {
            addCriterion("topic41_three not between", value1, value2, "topic41Three");
            return (Criteria) this;
        }

        public Criteria andTopic41FourIsNull() {
            addCriterion("topic41_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic41FourIsNotNull() {
            addCriterion("topic41_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic41FourEqualTo(String value) {
            addCriterion("topic41_four =", value, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FourNotEqualTo(String value) {
            addCriterion("topic41_four <>", value, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FourGreaterThan(String value) {
            addCriterion("topic41_four >", value, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic41_four >=", value, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FourLessThan(String value) {
            addCriterion("topic41_four <", value, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FourLessThanOrEqualTo(String value) {
            addCriterion("topic41_four <=", value, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FourLike(String value) {
            addCriterion("topic41_four like", value, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FourNotLike(String value) {
            addCriterion("topic41_four not like", value, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FourIn(List<String> values) {
            addCriterion("topic41_four in", values, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FourNotIn(List<String> values) {
            addCriterion("topic41_four not in", values, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FourBetween(String value1, String value2) {
            addCriterion("topic41_four between", value1, value2, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FourNotBetween(String value1, String value2) {
            addCriterion("topic41_four not between", value1, value2, "topic41Four");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionIsNull() {
            addCriterion("topic41_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionIsNotNull() {
            addCriterion("topic41_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionEqualTo(String value) {
            addCriterion("topic41_fraction =", value, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionNotEqualTo(String value) {
            addCriterion("topic41_fraction <>", value, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionGreaterThan(String value) {
            addCriterion("topic41_fraction >", value, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic41_fraction >=", value, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionLessThan(String value) {
            addCriterion("topic41_fraction <", value, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionLessThanOrEqualTo(String value) {
            addCriterion("topic41_fraction <=", value, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionLike(String value) {
            addCriterion("topic41_fraction like", value, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionNotLike(String value) {
            addCriterion("topic41_fraction not like", value, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionIn(List<String> values) {
            addCriterion("topic41_fraction in", values, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionNotIn(List<String> values) {
            addCriterion("topic41_fraction not in", values, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionBetween(String value1, String value2) {
            addCriterion("topic41_fraction between", value1, value2, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41FractionNotBetween(String value1, String value2) {
            addCriterion("topic41_fraction not between", value1, value2, "topic41Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic41SixIsNull() {
            addCriterion("topic41_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic41SixIsNotNull() {
            addCriterion("topic41_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic41SixEqualTo(String value) {
            addCriterion("topic41_six =", value, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic41SixNotEqualTo(String value) {
            addCriterion("topic41_six <>", value, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic41SixGreaterThan(String value) {
            addCriterion("topic41_six >", value, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic41SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic41_six >=", value, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic41SixLessThan(String value) {
            addCriterion("topic41_six <", value, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic41SixLessThanOrEqualTo(String value) {
            addCriterion("topic41_six <=", value, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic41SixLike(String value) {
            addCriterion("topic41_six like", value, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic41SixNotLike(String value) {
            addCriterion("topic41_six not like", value, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic41SixIn(List<String> values) {
            addCriterion("topic41_six in", values, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic41SixNotIn(List<String> values) {
            addCriterion("topic41_six not in", values, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic41SixBetween(String value1, String value2) {
            addCriterion("topic41_six between", value1, value2, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic41SixNotBetween(String value1, String value2) {
            addCriterion("topic41_six not between", value1, value2, "topic41Six");
            return (Criteria) this;
        }

        public Criteria andTopic42OneIsNull() {
            addCriterion("topic42_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic42OneIsNotNull() {
            addCriterion("topic42_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic42OneEqualTo(String value) {
            addCriterion("topic42_one =", value, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42OneNotEqualTo(String value) {
            addCriterion("topic42_one <>", value, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42OneGreaterThan(String value) {
            addCriterion("topic42_one >", value, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic42_one >=", value, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42OneLessThan(String value) {
            addCriterion("topic42_one <", value, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42OneLessThanOrEqualTo(String value) {
            addCriterion("topic42_one <=", value, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42OneLike(String value) {
            addCriterion("topic42_one like", value, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42OneNotLike(String value) {
            addCriterion("topic42_one not like", value, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42OneIn(List<String> values) {
            addCriterion("topic42_one in", values, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42OneNotIn(List<String> values) {
            addCriterion("topic42_one not in", values, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42OneBetween(String value1, String value2) {
            addCriterion("topic42_one between", value1, value2, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42OneNotBetween(String value1, String value2) {
            addCriterion("topic42_one not between", value1, value2, "topic42One");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoIsNull() {
            addCriterion("topic42_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoIsNotNull() {
            addCriterion("topic42_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoEqualTo(String value) {
            addCriterion("topic42_two =", value, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoNotEqualTo(String value) {
            addCriterion("topic42_two <>", value, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoGreaterThan(String value) {
            addCriterion("topic42_two >", value, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic42_two >=", value, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoLessThan(String value) {
            addCriterion("topic42_two <", value, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoLessThanOrEqualTo(String value) {
            addCriterion("topic42_two <=", value, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoLike(String value) {
            addCriterion("topic42_two like", value, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoNotLike(String value) {
            addCriterion("topic42_two not like", value, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoIn(List<String> values) {
            addCriterion("topic42_two in", values, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoNotIn(List<String> values) {
            addCriterion("topic42_two not in", values, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoBetween(String value1, String value2) {
            addCriterion("topic42_two between", value1, value2, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42TwoNotBetween(String value1, String value2) {
            addCriterion("topic42_two not between", value1, value2, "topic42Two");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeIsNull() {
            addCriterion("topic42_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeIsNotNull() {
            addCriterion("topic42_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeEqualTo(String value) {
            addCriterion("topic42_three =", value, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeNotEqualTo(String value) {
            addCriterion("topic42_three <>", value, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeGreaterThan(String value) {
            addCriterion("topic42_three >", value, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic42_three >=", value, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeLessThan(String value) {
            addCriterion("topic42_three <", value, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic42_three <=", value, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeLike(String value) {
            addCriterion("topic42_three like", value, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeNotLike(String value) {
            addCriterion("topic42_three not like", value, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeIn(List<String> values) {
            addCriterion("topic42_three in", values, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeNotIn(List<String> values) {
            addCriterion("topic42_three not in", values, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeBetween(String value1, String value2) {
            addCriterion("topic42_three between", value1, value2, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42ThreeNotBetween(String value1, String value2) {
            addCriterion("topic42_three not between", value1, value2, "topic42Three");
            return (Criteria) this;
        }

        public Criteria andTopic42FourIsNull() {
            addCriterion("topic42_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic42FourIsNotNull() {
            addCriterion("topic42_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic42FourEqualTo(String value) {
            addCriterion("topic42_four =", value, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FourNotEqualTo(String value) {
            addCriterion("topic42_four <>", value, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FourGreaterThan(String value) {
            addCriterion("topic42_four >", value, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic42_four >=", value, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FourLessThan(String value) {
            addCriterion("topic42_four <", value, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FourLessThanOrEqualTo(String value) {
            addCriterion("topic42_four <=", value, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FourLike(String value) {
            addCriterion("topic42_four like", value, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FourNotLike(String value) {
            addCriterion("topic42_four not like", value, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FourIn(List<String> values) {
            addCriterion("topic42_four in", values, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FourNotIn(List<String> values) {
            addCriterion("topic42_four not in", values, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FourBetween(String value1, String value2) {
            addCriterion("topic42_four between", value1, value2, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FourNotBetween(String value1, String value2) {
            addCriterion("topic42_four not between", value1, value2, "topic42Four");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionIsNull() {
            addCriterion("topic42_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionIsNotNull() {
            addCriterion("topic42_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionEqualTo(String value) {
            addCriterion("topic42_fraction =", value, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionNotEqualTo(String value) {
            addCriterion("topic42_fraction <>", value, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionGreaterThan(String value) {
            addCriterion("topic42_fraction >", value, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic42_fraction >=", value, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionLessThan(String value) {
            addCriterion("topic42_fraction <", value, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionLessThanOrEqualTo(String value) {
            addCriterion("topic42_fraction <=", value, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionLike(String value) {
            addCriterion("topic42_fraction like", value, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionNotLike(String value) {
            addCriterion("topic42_fraction not like", value, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionIn(List<String> values) {
            addCriterion("topic42_fraction in", values, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionNotIn(List<String> values) {
            addCriterion("topic42_fraction not in", values, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionBetween(String value1, String value2) {
            addCriterion("topic42_fraction between", value1, value2, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42FractionNotBetween(String value1, String value2) {
            addCriterion("topic42_fraction not between", value1, value2, "topic42Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic42SixIsNull() {
            addCriterion("topic42_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic42SixIsNotNull() {
            addCriterion("topic42_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic42SixEqualTo(String value) {
            addCriterion("topic42_six =", value, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic42SixNotEqualTo(String value) {
            addCriterion("topic42_six <>", value, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic42SixGreaterThan(String value) {
            addCriterion("topic42_six >", value, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic42SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic42_six >=", value, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic42SixLessThan(String value) {
            addCriterion("topic42_six <", value, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic42SixLessThanOrEqualTo(String value) {
            addCriterion("topic42_six <=", value, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic42SixLike(String value) {
            addCriterion("topic42_six like", value, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic42SixNotLike(String value) {
            addCriterion("topic42_six not like", value, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic42SixIn(List<String> values) {
            addCriterion("topic42_six in", values, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic42SixNotIn(List<String> values) {
            addCriterion("topic42_six not in", values, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic42SixBetween(String value1, String value2) {
            addCriterion("topic42_six between", value1, value2, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic42SixNotBetween(String value1, String value2) {
            addCriterion("topic42_six not between", value1, value2, "topic42Six");
            return (Criteria) this;
        }

        public Criteria andTopic43OneIsNull() {
            addCriterion("topic43_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic43OneIsNotNull() {
            addCriterion("topic43_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic43OneEqualTo(String value) {
            addCriterion("topic43_one =", value, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43OneNotEqualTo(String value) {
            addCriterion("topic43_one <>", value, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43OneGreaterThan(String value) {
            addCriterion("topic43_one >", value, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic43_one >=", value, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43OneLessThan(String value) {
            addCriterion("topic43_one <", value, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43OneLessThanOrEqualTo(String value) {
            addCriterion("topic43_one <=", value, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43OneLike(String value) {
            addCriterion("topic43_one like", value, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43OneNotLike(String value) {
            addCriterion("topic43_one not like", value, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43OneIn(List<String> values) {
            addCriterion("topic43_one in", values, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43OneNotIn(List<String> values) {
            addCriterion("topic43_one not in", values, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43OneBetween(String value1, String value2) {
            addCriterion("topic43_one between", value1, value2, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43OneNotBetween(String value1, String value2) {
            addCriterion("topic43_one not between", value1, value2, "topic43One");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoIsNull() {
            addCriterion("topic43_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoIsNotNull() {
            addCriterion("topic43_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoEqualTo(String value) {
            addCriterion("topic43_two =", value, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoNotEqualTo(String value) {
            addCriterion("topic43_two <>", value, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoGreaterThan(String value) {
            addCriterion("topic43_two >", value, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic43_two >=", value, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoLessThan(String value) {
            addCriterion("topic43_two <", value, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoLessThanOrEqualTo(String value) {
            addCriterion("topic43_two <=", value, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoLike(String value) {
            addCriterion("topic43_two like", value, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoNotLike(String value) {
            addCriterion("topic43_two not like", value, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoIn(List<String> values) {
            addCriterion("topic43_two in", values, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoNotIn(List<String> values) {
            addCriterion("topic43_two not in", values, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoBetween(String value1, String value2) {
            addCriterion("topic43_two between", value1, value2, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43TwoNotBetween(String value1, String value2) {
            addCriterion("topic43_two not between", value1, value2, "topic43Two");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeIsNull() {
            addCriterion("topic43_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeIsNotNull() {
            addCriterion("topic43_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeEqualTo(String value) {
            addCriterion("topic43_three =", value, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeNotEqualTo(String value) {
            addCriterion("topic43_three <>", value, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeGreaterThan(String value) {
            addCriterion("topic43_three >", value, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic43_three >=", value, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeLessThan(String value) {
            addCriterion("topic43_three <", value, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic43_three <=", value, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeLike(String value) {
            addCriterion("topic43_three like", value, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeNotLike(String value) {
            addCriterion("topic43_three not like", value, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeIn(List<String> values) {
            addCriterion("topic43_three in", values, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeNotIn(List<String> values) {
            addCriterion("topic43_three not in", values, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeBetween(String value1, String value2) {
            addCriterion("topic43_three between", value1, value2, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43ThreeNotBetween(String value1, String value2) {
            addCriterion("topic43_three not between", value1, value2, "topic43Three");
            return (Criteria) this;
        }

        public Criteria andTopic43FourIsNull() {
            addCriterion("topic43_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic43FourIsNotNull() {
            addCriterion("topic43_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic43FourEqualTo(String value) {
            addCriterion("topic43_four =", value, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FourNotEqualTo(String value) {
            addCriterion("topic43_four <>", value, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FourGreaterThan(String value) {
            addCriterion("topic43_four >", value, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic43_four >=", value, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FourLessThan(String value) {
            addCriterion("topic43_four <", value, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FourLessThanOrEqualTo(String value) {
            addCriterion("topic43_four <=", value, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FourLike(String value) {
            addCriterion("topic43_four like", value, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FourNotLike(String value) {
            addCriterion("topic43_four not like", value, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FourIn(List<String> values) {
            addCriterion("topic43_four in", values, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FourNotIn(List<String> values) {
            addCriterion("topic43_four not in", values, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FourBetween(String value1, String value2) {
            addCriterion("topic43_four between", value1, value2, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FourNotBetween(String value1, String value2) {
            addCriterion("topic43_four not between", value1, value2, "topic43Four");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionIsNull() {
            addCriterion("topic43_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionIsNotNull() {
            addCriterion("topic43_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionEqualTo(String value) {
            addCriterion("topic43_fraction =", value, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionNotEqualTo(String value) {
            addCriterion("topic43_fraction <>", value, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionGreaterThan(String value) {
            addCriterion("topic43_fraction >", value, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic43_fraction >=", value, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionLessThan(String value) {
            addCriterion("topic43_fraction <", value, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionLessThanOrEqualTo(String value) {
            addCriterion("topic43_fraction <=", value, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionLike(String value) {
            addCriterion("topic43_fraction like", value, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionNotLike(String value) {
            addCriterion("topic43_fraction not like", value, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionIn(List<String> values) {
            addCriterion("topic43_fraction in", values, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionNotIn(List<String> values) {
            addCriterion("topic43_fraction not in", values, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionBetween(String value1, String value2) {
            addCriterion("topic43_fraction between", value1, value2, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43FractionNotBetween(String value1, String value2) {
            addCriterion("topic43_fraction not between", value1, value2, "topic43Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic43SixIsNull() {
            addCriterion("topic43_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic43SixIsNotNull() {
            addCriterion("topic43_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic43SixEqualTo(String value) {
            addCriterion("topic43_six =", value, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic43SixNotEqualTo(String value) {
            addCriterion("topic43_six <>", value, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic43SixGreaterThan(String value) {
            addCriterion("topic43_six >", value, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic43SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic43_six >=", value, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic43SixLessThan(String value) {
            addCriterion("topic43_six <", value, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic43SixLessThanOrEqualTo(String value) {
            addCriterion("topic43_six <=", value, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic43SixLike(String value) {
            addCriterion("topic43_six like", value, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic43SixNotLike(String value) {
            addCriterion("topic43_six not like", value, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic43SixIn(List<String> values) {
            addCriterion("topic43_six in", values, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic43SixNotIn(List<String> values) {
            addCriterion("topic43_six not in", values, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic43SixBetween(String value1, String value2) {
            addCriterion("topic43_six between", value1, value2, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic43SixNotBetween(String value1, String value2) {
            addCriterion("topic43_six not between", value1, value2, "topic43Six");
            return (Criteria) this;
        }

        public Criteria andTopic44OneIsNull() {
            addCriterion("topic44_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic44OneIsNotNull() {
            addCriterion("topic44_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic44OneEqualTo(String value) {
            addCriterion("topic44_one =", value, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44OneNotEqualTo(String value) {
            addCriterion("topic44_one <>", value, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44OneGreaterThan(String value) {
            addCriterion("topic44_one >", value, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic44_one >=", value, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44OneLessThan(String value) {
            addCriterion("topic44_one <", value, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44OneLessThanOrEqualTo(String value) {
            addCriterion("topic44_one <=", value, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44OneLike(String value) {
            addCriterion("topic44_one like", value, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44OneNotLike(String value) {
            addCriterion("topic44_one not like", value, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44OneIn(List<String> values) {
            addCriterion("topic44_one in", values, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44OneNotIn(List<String> values) {
            addCriterion("topic44_one not in", values, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44OneBetween(String value1, String value2) {
            addCriterion("topic44_one between", value1, value2, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44OneNotBetween(String value1, String value2) {
            addCriterion("topic44_one not between", value1, value2, "topic44One");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoIsNull() {
            addCriterion("topic44_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoIsNotNull() {
            addCriterion("topic44_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoEqualTo(String value) {
            addCriterion("topic44_two =", value, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoNotEqualTo(String value) {
            addCriterion("topic44_two <>", value, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoGreaterThan(String value) {
            addCriterion("topic44_two >", value, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic44_two >=", value, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoLessThan(String value) {
            addCriterion("topic44_two <", value, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoLessThanOrEqualTo(String value) {
            addCriterion("topic44_two <=", value, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoLike(String value) {
            addCriterion("topic44_two like", value, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoNotLike(String value) {
            addCriterion("topic44_two not like", value, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoIn(List<String> values) {
            addCriterion("topic44_two in", values, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoNotIn(List<String> values) {
            addCriterion("topic44_two not in", values, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoBetween(String value1, String value2) {
            addCriterion("topic44_two between", value1, value2, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44TwoNotBetween(String value1, String value2) {
            addCriterion("topic44_two not between", value1, value2, "topic44Two");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeIsNull() {
            addCriterion("topic44_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeIsNotNull() {
            addCriterion("topic44_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeEqualTo(String value) {
            addCriterion("topic44_three =", value, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeNotEqualTo(String value) {
            addCriterion("topic44_three <>", value, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeGreaterThan(String value) {
            addCriterion("topic44_three >", value, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic44_three >=", value, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeLessThan(String value) {
            addCriterion("topic44_three <", value, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic44_three <=", value, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeLike(String value) {
            addCriterion("topic44_three like", value, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeNotLike(String value) {
            addCriterion("topic44_three not like", value, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeIn(List<String> values) {
            addCriterion("topic44_three in", values, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeNotIn(List<String> values) {
            addCriterion("topic44_three not in", values, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeBetween(String value1, String value2) {
            addCriterion("topic44_three between", value1, value2, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44ThreeNotBetween(String value1, String value2) {
            addCriterion("topic44_three not between", value1, value2, "topic44Three");
            return (Criteria) this;
        }

        public Criteria andTopic44FourIsNull() {
            addCriterion("topic44_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic44FourIsNotNull() {
            addCriterion("topic44_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic44FourEqualTo(String value) {
            addCriterion("topic44_four =", value, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FourNotEqualTo(String value) {
            addCriterion("topic44_four <>", value, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FourGreaterThan(String value) {
            addCriterion("topic44_four >", value, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic44_four >=", value, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FourLessThan(String value) {
            addCriterion("topic44_four <", value, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FourLessThanOrEqualTo(String value) {
            addCriterion("topic44_four <=", value, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FourLike(String value) {
            addCriterion("topic44_four like", value, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FourNotLike(String value) {
            addCriterion("topic44_four not like", value, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FourIn(List<String> values) {
            addCriterion("topic44_four in", values, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FourNotIn(List<String> values) {
            addCriterion("topic44_four not in", values, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FourBetween(String value1, String value2) {
            addCriterion("topic44_four between", value1, value2, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FourNotBetween(String value1, String value2) {
            addCriterion("topic44_four not between", value1, value2, "topic44Four");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionIsNull() {
            addCriterion("topic44_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionIsNotNull() {
            addCriterion("topic44_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionEqualTo(String value) {
            addCriterion("topic44_fraction =", value, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionNotEqualTo(String value) {
            addCriterion("topic44_fraction <>", value, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionGreaterThan(String value) {
            addCriterion("topic44_fraction >", value, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic44_fraction >=", value, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionLessThan(String value) {
            addCriterion("topic44_fraction <", value, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionLessThanOrEqualTo(String value) {
            addCriterion("topic44_fraction <=", value, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionLike(String value) {
            addCriterion("topic44_fraction like", value, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionNotLike(String value) {
            addCriterion("topic44_fraction not like", value, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionIn(List<String> values) {
            addCriterion("topic44_fraction in", values, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionNotIn(List<String> values) {
            addCriterion("topic44_fraction not in", values, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionBetween(String value1, String value2) {
            addCriterion("topic44_fraction between", value1, value2, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44FractionNotBetween(String value1, String value2) {
            addCriterion("topic44_fraction not between", value1, value2, "topic44Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic44SixIsNull() {
            addCriterion("topic44_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic44SixIsNotNull() {
            addCriterion("topic44_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic44SixEqualTo(String value) {
            addCriterion("topic44_six =", value, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic44SixNotEqualTo(String value) {
            addCriterion("topic44_six <>", value, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic44SixGreaterThan(String value) {
            addCriterion("topic44_six >", value, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic44SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic44_six >=", value, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic44SixLessThan(String value) {
            addCriterion("topic44_six <", value, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic44SixLessThanOrEqualTo(String value) {
            addCriterion("topic44_six <=", value, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic44SixLike(String value) {
            addCriterion("topic44_six like", value, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic44SixNotLike(String value) {
            addCriterion("topic44_six not like", value, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic44SixIn(List<String> values) {
            addCriterion("topic44_six in", values, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic44SixNotIn(List<String> values) {
            addCriterion("topic44_six not in", values, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic44SixBetween(String value1, String value2) {
            addCriterion("topic44_six between", value1, value2, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic44SixNotBetween(String value1, String value2) {
            addCriterion("topic44_six not between", value1, value2, "topic44Six");
            return (Criteria) this;
        }

        public Criteria andTopic45OneIsNull() {
            addCriterion("topic45_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic45OneIsNotNull() {
            addCriterion("topic45_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic45OneEqualTo(String value) {
            addCriterion("topic45_one =", value, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45OneNotEqualTo(String value) {
            addCriterion("topic45_one <>", value, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45OneGreaterThan(String value) {
            addCriterion("topic45_one >", value, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic45_one >=", value, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45OneLessThan(String value) {
            addCriterion("topic45_one <", value, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45OneLessThanOrEqualTo(String value) {
            addCriterion("topic45_one <=", value, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45OneLike(String value) {
            addCriterion("topic45_one like", value, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45OneNotLike(String value) {
            addCriterion("topic45_one not like", value, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45OneIn(List<String> values) {
            addCriterion("topic45_one in", values, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45OneNotIn(List<String> values) {
            addCriterion("topic45_one not in", values, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45OneBetween(String value1, String value2) {
            addCriterion("topic45_one between", value1, value2, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45OneNotBetween(String value1, String value2) {
            addCriterion("topic45_one not between", value1, value2, "topic45One");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoIsNull() {
            addCriterion("topic45_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoIsNotNull() {
            addCriterion("topic45_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoEqualTo(String value) {
            addCriterion("topic45_two =", value, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoNotEqualTo(String value) {
            addCriterion("topic45_two <>", value, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoGreaterThan(String value) {
            addCriterion("topic45_two >", value, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic45_two >=", value, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoLessThan(String value) {
            addCriterion("topic45_two <", value, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoLessThanOrEqualTo(String value) {
            addCriterion("topic45_two <=", value, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoLike(String value) {
            addCriterion("topic45_two like", value, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoNotLike(String value) {
            addCriterion("topic45_two not like", value, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoIn(List<String> values) {
            addCriterion("topic45_two in", values, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoNotIn(List<String> values) {
            addCriterion("topic45_two not in", values, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoBetween(String value1, String value2) {
            addCriterion("topic45_two between", value1, value2, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45TwoNotBetween(String value1, String value2) {
            addCriterion("topic45_two not between", value1, value2, "topic45Two");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeIsNull() {
            addCriterion("topic45_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeIsNotNull() {
            addCriterion("topic45_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeEqualTo(String value) {
            addCriterion("topic45_three =", value, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeNotEqualTo(String value) {
            addCriterion("topic45_three <>", value, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeGreaterThan(String value) {
            addCriterion("topic45_three >", value, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic45_three >=", value, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeLessThan(String value) {
            addCriterion("topic45_three <", value, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic45_three <=", value, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeLike(String value) {
            addCriterion("topic45_three like", value, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeNotLike(String value) {
            addCriterion("topic45_three not like", value, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeIn(List<String> values) {
            addCriterion("topic45_three in", values, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeNotIn(List<String> values) {
            addCriterion("topic45_three not in", values, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeBetween(String value1, String value2) {
            addCriterion("topic45_three between", value1, value2, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45ThreeNotBetween(String value1, String value2) {
            addCriterion("topic45_three not between", value1, value2, "topic45Three");
            return (Criteria) this;
        }

        public Criteria andTopic45FourIsNull() {
            addCriterion("topic45_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic45FourIsNotNull() {
            addCriterion("topic45_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic45FourEqualTo(String value) {
            addCriterion("topic45_four =", value, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FourNotEqualTo(String value) {
            addCriterion("topic45_four <>", value, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FourGreaterThan(String value) {
            addCriterion("topic45_four >", value, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic45_four >=", value, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FourLessThan(String value) {
            addCriterion("topic45_four <", value, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FourLessThanOrEqualTo(String value) {
            addCriterion("topic45_four <=", value, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FourLike(String value) {
            addCriterion("topic45_four like", value, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FourNotLike(String value) {
            addCriterion("topic45_four not like", value, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FourIn(List<String> values) {
            addCriterion("topic45_four in", values, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FourNotIn(List<String> values) {
            addCriterion("topic45_four not in", values, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FourBetween(String value1, String value2) {
            addCriterion("topic45_four between", value1, value2, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FourNotBetween(String value1, String value2) {
            addCriterion("topic45_four not between", value1, value2, "topic45Four");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionIsNull() {
            addCriterion("topic45_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionIsNotNull() {
            addCriterion("topic45_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionEqualTo(String value) {
            addCriterion("topic45_fraction =", value, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionNotEqualTo(String value) {
            addCriterion("topic45_fraction <>", value, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionGreaterThan(String value) {
            addCriterion("topic45_fraction >", value, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic45_fraction >=", value, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionLessThan(String value) {
            addCriterion("topic45_fraction <", value, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionLessThanOrEqualTo(String value) {
            addCriterion("topic45_fraction <=", value, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionLike(String value) {
            addCriterion("topic45_fraction like", value, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionNotLike(String value) {
            addCriterion("topic45_fraction not like", value, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionIn(List<String> values) {
            addCriterion("topic45_fraction in", values, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionNotIn(List<String> values) {
            addCriterion("topic45_fraction not in", values, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionBetween(String value1, String value2) {
            addCriterion("topic45_fraction between", value1, value2, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45FractionNotBetween(String value1, String value2) {
            addCriterion("topic45_fraction not between", value1, value2, "topic45Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic45SixIsNull() {
            addCriterion("topic45_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic45SixIsNotNull() {
            addCriterion("topic45_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic45SixEqualTo(String value) {
            addCriterion("topic45_six =", value, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic45SixNotEqualTo(String value) {
            addCriterion("topic45_six <>", value, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic45SixGreaterThan(String value) {
            addCriterion("topic45_six >", value, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic45SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic45_six >=", value, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic45SixLessThan(String value) {
            addCriterion("topic45_six <", value, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic45SixLessThanOrEqualTo(String value) {
            addCriterion("topic45_six <=", value, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic45SixLike(String value) {
            addCriterion("topic45_six like", value, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic45SixNotLike(String value) {
            addCriterion("topic45_six not like", value, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic45SixIn(List<String> values) {
            addCriterion("topic45_six in", values, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic45SixNotIn(List<String> values) {
            addCriterion("topic45_six not in", values, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic45SixBetween(String value1, String value2) {
            addCriterion("topic45_six between", value1, value2, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic45SixNotBetween(String value1, String value2) {
            addCriterion("topic45_six not between", value1, value2, "topic45Six");
            return (Criteria) this;
        }

        public Criteria andTopic46OneIsNull() {
            addCriterion("topic46_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic46OneIsNotNull() {
            addCriterion("topic46_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic46OneEqualTo(String value) {
            addCriterion("topic46_one =", value, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46OneNotEqualTo(String value) {
            addCriterion("topic46_one <>", value, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46OneGreaterThan(String value) {
            addCriterion("topic46_one >", value, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic46_one >=", value, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46OneLessThan(String value) {
            addCriterion("topic46_one <", value, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46OneLessThanOrEqualTo(String value) {
            addCriterion("topic46_one <=", value, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46OneLike(String value) {
            addCriterion("topic46_one like", value, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46OneNotLike(String value) {
            addCriterion("topic46_one not like", value, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46OneIn(List<String> values) {
            addCriterion("topic46_one in", values, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46OneNotIn(List<String> values) {
            addCriterion("topic46_one not in", values, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46OneBetween(String value1, String value2) {
            addCriterion("topic46_one between", value1, value2, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46OneNotBetween(String value1, String value2) {
            addCriterion("topic46_one not between", value1, value2, "topic46One");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoIsNull() {
            addCriterion("topic46_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoIsNotNull() {
            addCriterion("topic46_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoEqualTo(String value) {
            addCriterion("topic46_two =", value, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoNotEqualTo(String value) {
            addCriterion("topic46_two <>", value, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoGreaterThan(String value) {
            addCriterion("topic46_two >", value, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic46_two >=", value, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoLessThan(String value) {
            addCriterion("topic46_two <", value, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoLessThanOrEqualTo(String value) {
            addCriterion("topic46_two <=", value, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoLike(String value) {
            addCriterion("topic46_two like", value, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoNotLike(String value) {
            addCriterion("topic46_two not like", value, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoIn(List<String> values) {
            addCriterion("topic46_two in", values, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoNotIn(List<String> values) {
            addCriterion("topic46_two not in", values, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoBetween(String value1, String value2) {
            addCriterion("topic46_two between", value1, value2, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46TwoNotBetween(String value1, String value2) {
            addCriterion("topic46_two not between", value1, value2, "topic46Two");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeIsNull() {
            addCriterion("topic46_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeIsNotNull() {
            addCriterion("topic46_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeEqualTo(String value) {
            addCriterion("topic46_three =", value, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeNotEqualTo(String value) {
            addCriterion("topic46_three <>", value, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeGreaterThan(String value) {
            addCriterion("topic46_three >", value, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic46_three >=", value, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeLessThan(String value) {
            addCriterion("topic46_three <", value, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic46_three <=", value, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeLike(String value) {
            addCriterion("topic46_three like", value, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeNotLike(String value) {
            addCriterion("topic46_three not like", value, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeIn(List<String> values) {
            addCriterion("topic46_three in", values, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeNotIn(List<String> values) {
            addCriterion("topic46_three not in", values, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeBetween(String value1, String value2) {
            addCriterion("topic46_three between", value1, value2, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46ThreeNotBetween(String value1, String value2) {
            addCriterion("topic46_three not between", value1, value2, "topic46Three");
            return (Criteria) this;
        }

        public Criteria andTopic46FourIsNull() {
            addCriterion("topic46_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic46FourIsNotNull() {
            addCriterion("topic46_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic46FourEqualTo(String value) {
            addCriterion("topic46_four =", value, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FourNotEqualTo(String value) {
            addCriterion("topic46_four <>", value, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FourGreaterThan(String value) {
            addCriterion("topic46_four >", value, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic46_four >=", value, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FourLessThan(String value) {
            addCriterion("topic46_four <", value, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FourLessThanOrEqualTo(String value) {
            addCriterion("topic46_four <=", value, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FourLike(String value) {
            addCriterion("topic46_four like", value, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FourNotLike(String value) {
            addCriterion("topic46_four not like", value, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FourIn(List<String> values) {
            addCriterion("topic46_four in", values, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FourNotIn(List<String> values) {
            addCriterion("topic46_four not in", values, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FourBetween(String value1, String value2) {
            addCriterion("topic46_four between", value1, value2, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FourNotBetween(String value1, String value2) {
            addCriterion("topic46_four not between", value1, value2, "topic46Four");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionIsNull() {
            addCriterion("topic46_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionIsNotNull() {
            addCriterion("topic46_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionEqualTo(String value) {
            addCriterion("topic46_fraction =", value, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionNotEqualTo(String value) {
            addCriterion("topic46_fraction <>", value, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionGreaterThan(String value) {
            addCriterion("topic46_fraction >", value, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic46_fraction >=", value, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionLessThan(String value) {
            addCriterion("topic46_fraction <", value, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionLessThanOrEqualTo(String value) {
            addCriterion("topic46_fraction <=", value, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionLike(String value) {
            addCriterion("topic46_fraction like", value, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionNotLike(String value) {
            addCriterion("topic46_fraction not like", value, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionIn(List<String> values) {
            addCriterion("topic46_fraction in", values, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionNotIn(List<String> values) {
            addCriterion("topic46_fraction not in", values, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionBetween(String value1, String value2) {
            addCriterion("topic46_fraction between", value1, value2, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46FractionNotBetween(String value1, String value2) {
            addCriterion("topic46_fraction not between", value1, value2, "topic46Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic46SixIsNull() {
            addCriterion("topic46_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic46SixIsNotNull() {
            addCriterion("topic46_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic46SixEqualTo(String value) {
            addCriterion("topic46_six =", value, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic46SixNotEqualTo(String value) {
            addCriterion("topic46_six <>", value, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic46SixGreaterThan(String value) {
            addCriterion("topic46_six >", value, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic46SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic46_six >=", value, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic46SixLessThan(String value) {
            addCriterion("topic46_six <", value, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic46SixLessThanOrEqualTo(String value) {
            addCriterion("topic46_six <=", value, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic46SixLike(String value) {
            addCriterion("topic46_six like", value, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic46SixNotLike(String value) {
            addCriterion("topic46_six not like", value, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic46SixIn(List<String> values) {
            addCriterion("topic46_six in", values, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic46SixNotIn(List<String> values) {
            addCriterion("topic46_six not in", values, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic46SixBetween(String value1, String value2) {
            addCriterion("topic46_six between", value1, value2, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic46SixNotBetween(String value1, String value2) {
            addCriterion("topic46_six not between", value1, value2, "topic46Six");
            return (Criteria) this;
        }

        public Criteria andTopic47OneIsNull() {
            addCriterion("topic47_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic47OneIsNotNull() {
            addCriterion("topic47_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic47OneEqualTo(String value) {
            addCriterion("topic47_one =", value, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47OneNotEqualTo(String value) {
            addCriterion("topic47_one <>", value, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47OneGreaterThan(String value) {
            addCriterion("topic47_one >", value, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic47_one >=", value, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47OneLessThan(String value) {
            addCriterion("topic47_one <", value, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47OneLessThanOrEqualTo(String value) {
            addCriterion("topic47_one <=", value, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47OneLike(String value) {
            addCriterion("topic47_one like", value, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47OneNotLike(String value) {
            addCriterion("topic47_one not like", value, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47OneIn(List<String> values) {
            addCriterion("topic47_one in", values, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47OneNotIn(List<String> values) {
            addCriterion("topic47_one not in", values, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47OneBetween(String value1, String value2) {
            addCriterion("topic47_one between", value1, value2, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47OneNotBetween(String value1, String value2) {
            addCriterion("topic47_one not between", value1, value2, "topic47One");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoIsNull() {
            addCriterion("topic47_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoIsNotNull() {
            addCriterion("topic47_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoEqualTo(String value) {
            addCriterion("topic47_two =", value, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoNotEqualTo(String value) {
            addCriterion("topic47_two <>", value, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoGreaterThan(String value) {
            addCriterion("topic47_two >", value, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic47_two >=", value, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoLessThan(String value) {
            addCriterion("topic47_two <", value, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoLessThanOrEqualTo(String value) {
            addCriterion("topic47_two <=", value, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoLike(String value) {
            addCriterion("topic47_two like", value, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoNotLike(String value) {
            addCriterion("topic47_two not like", value, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoIn(List<String> values) {
            addCriterion("topic47_two in", values, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoNotIn(List<String> values) {
            addCriterion("topic47_two not in", values, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoBetween(String value1, String value2) {
            addCriterion("topic47_two between", value1, value2, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47TwoNotBetween(String value1, String value2) {
            addCriterion("topic47_two not between", value1, value2, "topic47Two");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeIsNull() {
            addCriterion("topic47_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeIsNotNull() {
            addCriterion("topic47_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeEqualTo(String value) {
            addCriterion("topic47_three =", value, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeNotEqualTo(String value) {
            addCriterion("topic47_three <>", value, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeGreaterThan(String value) {
            addCriterion("topic47_three >", value, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic47_three >=", value, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeLessThan(String value) {
            addCriterion("topic47_three <", value, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic47_three <=", value, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeLike(String value) {
            addCriterion("topic47_three like", value, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeNotLike(String value) {
            addCriterion("topic47_three not like", value, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeIn(List<String> values) {
            addCriterion("topic47_three in", values, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeNotIn(List<String> values) {
            addCriterion("topic47_three not in", values, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeBetween(String value1, String value2) {
            addCriterion("topic47_three between", value1, value2, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47ThreeNotBetween(String value1, String value2) {
            addCriterion("topic47_three not between", value1, value2, "topic47Three");
            return (Criteria) this;
        }

        public Criteria andTopic47FourIsNull() {
            addCriterion("topic47_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic47FourIsNotNull() {
            addCriterion("topic47_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic47FourEqualTo(String value) {
            addCriterion("topic47_four =", value, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FourNotEqualTo(String value) {
            addCriterion("topic47_four <>", value, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FourGreaterThan(String value) {
            addCriterion("topic47_four >", value, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic47_four >=", value, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FourLessThan(String value) {
            addCriterion("topic47_four <", value, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FourLessThanOrEqualTo(String value) {
            addCriterion("topic47_four <=", value, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FourLike(String value) {
            addCriterion("topic47_four like", value, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FourNotLike(String value) {
            addCriterion("topic47_four not like", value, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FourIn(List<String> values) {
            addCriterion("topic47_four in", values, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FourNotIn(List<String> values) {
            addCriterion("topic47_four not in", values, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FourBetween(String value1, String value2) {
            addCriterion("topic47_four between", value1, value2, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FourNotBetween(String value1, String value2) {
            addCriterion("topic47_four not between", value1, value2, "topic47Four");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionIsNull() {
            addCriterion("topic47_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionIsNotNull() {
            addCriterion("topic47_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionEqualTo(String value) {
            addCriterion("topic47_fraction =", value, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionNotEqualTo(String value) {
            addCriterion("topic47_fraction <>", value, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionGreaterThan(String value) {
            addCriterion("topic47_fraction >", value, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic47_fraction >=", value, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionLessThan(String value) {
            addCriterion("topic47_fraction <", value, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionLessThanOrEqualTo(String value) {
            addCriterion("topic47_fraction <=", value, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionLike(String value) {
            addCriterion("topic47_fraction like", value, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionNotLike(String value) {
            addCriterion("topic47_fraction not like", value, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionIn(List<String> values) {
            addCriterion("topic47_fraction in", values, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionNotIn(List<String> values) {
            addCriterion("topic47_fraction not in", values, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionBetween(String value1, String value2) {
            addCriterion("topic47_fraction between", value1, value2, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47FractionNotBetween(String value1, String value2) {
            addCriterion("topic47_fraction not between", value1, value2, "topic47Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic47SixIsNull() {
            addCriterion("topic47_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic47SixIsNotNull() {
            addCriterion("topic47_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic47SixEqualTo(String value) {
            addCriterion("topic47_six =", value, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic47SixNotEqualTo(String value) {
            addCriterion("topic47_six <>", value, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic47SixGreaterThan(String value) {
            addCriterion("topic47_six >", value, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic47SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic47_six >=", value, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic47SixLessThan(String value) {
            addCriterion("topic47_six <", value, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic47SixLessThanOrEqualTo(String value) {
            addCriterion("topic47_six <=", value, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic47SixLike(String value) {
            addCriterion("topic47_six like", value, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic47SixNotLike(String value) {
            addCriterion("topic47_six not like", value, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic47SixIn(List<String> values) {
            addCriterion("topic47_six in", values, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic47SixNotIn(List<String> values) {
            addCriterion("topic47_six not in", values, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic47SixBetween(String value1, String value2) {
            addCriterion("topic47_six between", value1, value2, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic47SixNotBetween(String value1, String value2) {
            addCriterion("topic47_six not between", value1, value2, "topic47Six");
            return (Criteria) this;
        }

        public Criteria andTopic48OneIsNull() {
            addCriterion("topic48_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic48OneIsNotNull() {
            addCriterion("topic48_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic48OneEqualTo(String value) {
            addCriterion("topic48_one =", value, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48OneNotEqualTo(String value) {
            addCriterion("topic48_one <>", value, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48OneGreaterThan(String value) {
            addCriterion("topic48_one >", value, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic48_one >=", value, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48OneLessThan(String value) {
            addCriterion("topic48_one <", value, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48OneLessThanOrEqualTo(String value) {
            addCriterion("topic48_one <=", value, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48OneLike(String value) {
            addCriterion("topic48_one like", value, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48OneNotLike(String value) {
            addCriterion("topic48_one not like", value, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48OneIn(List<String> values) {
            addCriterion("topic48_one in", values, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48OneNotIn(List<String> values) {
            addCriterion("topic48_one not in", values, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48OneBetween(String value1, String value2) {
            addCriterion("topic48_one between", value1, value2, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48OneNotBetween(String value1, String value2) {
            addCriterion("topic48_one not between", value1, value2, "topic48One");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoIsNull() {
            addCriterion("topic48_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoIsNotNull() {
            addCriterion("topic48_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoEqualTo(String value) {
            addCriterion("topic48_two =", value, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoNotEqualTo(String value) {
            addCriterion("topic48_two <>", value, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoGreaterThan(String value) {
            addCriterion("topic48_two >", value, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic48_two >=", value, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoLessThan(String value) {
            addCriterion("topic48_two <", value, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoLessThanOrEqualTo(String value) {
            addCriterion("topic48_two <=", value, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoLike(String value) {
            addCriterion("topic48_two like", value, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoNotLike(String value) {
            addCriterion("topic48_two not like", value, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoIn(List<String> values) {
            addCriterion("topic48_two in", values, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoNotIn(List<String> values) {
            addCriterion("topic48_two not in", values, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoBetween(String value1, String value2) {
            addCriterion("topic48_two between", value1, value2, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48TwoNotBetween(String value1, String value2) {
            addCriterion("topic48_two not between", value1, value2, "topic48Two");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeIsNull() {
            addCriterion("topic48_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeIsNotNull() {
            addCriterion("topic48_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeEqualTo(String value) {
            addCriterion("topic48_three =", value, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeNotEqualTo(String value) {
            addCriterion("topic48_three <>", value, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeGreaterThan(String value) {
            addCriterion("topic48_three >", value, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic48_three >=", value, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeLessThan(String value) {
            addCriterion("topic48_three <", value, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic48_three <=", value, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeLike(String value) {
            addCriterion("topic48_three like", value, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeNotLike(String value) {
            addCriterion("topic48_three not like", value, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeIn(List<String> values) {
            addCriterion("topic48_three in", values, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeNotIn(List<String> values) {
            addCriterion("topic48_three not in", values, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeBetween(String value1, String value2) {
            addCriterion("topic48_three between", value1, value2, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48ThreeNotBetween(String value1, String value2) {
            addCriterion("topic48_three not between", value1, value2, "topic48Three");
            return (Criteria) this;
        }

        public Criteria andTopic48FourIsNull() {
            addCriterion("topic48_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic48FourIsNotNull() {
            addCriterion("topic48_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic48FourEqualTo(String value) {
            addCriterion("topic48_four =", value, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FourNotEqualTo(String value) {
            addCriterion("topic48_four <>", value, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FourGreaterThan(String value) {
            addCriterion("topic48_four >", value, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic48_four >=", value, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FourLessThan(String value) {
            addCriterion("topic48_four <", value, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FourLessThanOrEqualTo(String value) {
            addCriterion("topic48_four <=", value, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FourLike(String value) {
            addCriterion("topic48_four like", value, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FourNotLike(String value) {
            addCriterion("topic48_four not like", value, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FourIn(List<String> values) {
            addCriterion("topic48_four in", values, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FourNotIn(List<String> values) {
            addCriterion("topic48_four not in", values, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FourBetween(String value1, String value2) {
            addCriterion("topic48_four between", value1, value2, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FourNotBetween(String value1, String value2) {
            addCriterion("topic48_four not between", value1, value2, "topic48Four");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionIsNull() {
            addCriterion("topic48_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionIsNotNull() {
            addCriterion("topic48_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionEqualTo(String value) {
            addCriterion("topic48_fraction =", value, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionNotEqualTo(String value) {
            addCriterion("topic48_fraction <>", value, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionGreaterThan(String value) {
            addCriterion("topic48_fraction >", value, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic48_fraction >=", value, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionLessThan(String value) {
            addCriterion("topic48_fraction <", value, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionLessThanOrEqualTo(String value) {
            addCriterion("topic48_fraction <=", value, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionLike(String value) {
            addCriterion("topic48_fraction like", value, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionNotLike(String value) {
            addCriterion("topic48_fraction not like", value, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionIn(List<String> values) {
            addCriterion("topic48_fraction in", values, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionNotIn(List<String> values) {
            addCriterion("topic48_fraction not in", values, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionBetween(String value1, String value2) {
            addCriterion("topic48_fraction between", value1, value2, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48FractionNotBetween(String value1, String value2) {
            addCriterion("topic48_fraction not between", value1, value2, "topic48Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic48SixIsNull() {
            addCriterion("topic48_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic48SixIsNotNull() {
            addCriterion("topic48_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic48SixEqualTo(String value) {
            addCriterion("topic48_six =", value, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic48SixNotEqualTo(String value) {
            addCriterion("topic48_six <>", value, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic48SixGreaterThan(String value) {
            addCriterion("topic48_six >", value, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic48SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic48_six >=", value, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic48SixLessThan(String value) {
            addCriterion("topic48_six <", value, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic48SixLessThanOrEqualTo(String value) {
            addCriterion("topic48_six <=", value, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic48SixLike(String value) {
            addCriterion("topic48_six like", value, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic48SixNotLike(String value) {
            addCriterion("topic48_six not like", value, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic48SixIn(List<String> values) {
            addCriterion("topic48_six in", values, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic48SixNotIn(List<String> values) {
            addCriterion("topic48_six not in", values, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic48SixBetween(String value1, String value2) {
            addCriterion("topic48_six between", value1, value2, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic48SixNotBetween(String value1, String value2) {
            addCriterion("topic48_six not between", value1, value2, "topic48Six");
            return (Criteria) this;
        }

        public Criteria andTopic49OneIsNull() {
            addCriterion("topic49_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic49OneIsNotNull() {
            addCriterion("topic49_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic49OneEqualTo(String value) {
            addCriterion("topic49_one =", value, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49OneNotEqualTo(String value) {
            addCriterion("topic49_one <>", value, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49OneGreaterThan(String value) {
            addCriterion("topic49_one >", value, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic49_one >=", value, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49OneLessThan(String value) {
            addCriterion("topic49_one <", value, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49OneLessThanOrEqualTo(String value) {
            addCriterion("topic49_one <=", value, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49OneLike(String value) {
            addCriterion("topic49_one like", value, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49OneNotLike(String value) {
            addCriterion("topic49_one not like", value, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49OneIn(List<String> values) {
            addCriterion("topic49_one in", values, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49OneNotIn(List<String> values) {
            addCriterion("topic49_one not in", values, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49OneBetween(String value1, String value2) {
            addCriterion("topic49_one between", value1, value2, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49OneNotBetween(String value1, String value2) {
            addCriterion("topic49_one not between", value1, value2, "topic49One");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoIsNull() {
            addCriterion("topic49_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoIsNotNull() {
            addCriterion("topic49_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoEqualTo(String value) {
            addCriterion("topic49_two =", value, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoNotEqualTo(String value) {
            addCriterion("topic49_two <>", value, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoGreaterThan(String value) {
            addCriterion("topic49_two >", value, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic49_two >=", value, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoLessThan(String value) {
            addCriterion("topic49_two <", value, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoLessThanOrEqualTo(String value) {
            addCriterion("topic49_two <=", value, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoLike(String value) {
            addCriterion("topic49_two like", value, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoNotLike(String value) {
            addCriterion("topic49_two not like", value, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoIn(List<String> values) {
            addCriterion("topic49_two in", values, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoNotIn(List<String> values) {
            addCriterion("topic49_two not in", values, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoBetween(String value1, String value2) {
            addCriterion("topic49_two between", value1, value2, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49TwoNotBetween(String value1, String value2) {
            addCriterion("topic49_two not between", value1, value2, "topic49Two");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeIsNull() {
            addCriterion("topic49_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeIsNotNull() {
            addCriterion("topic49_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeEqualTo(String value) {
            addCriterion("topic49_three =", value, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeNotEqualTo(String value) {
            addCriterion("topic49_three <>", value, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeGreaterThan(String value) {
            addCriterion("topic49_three >", value, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic49_three >=", value, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeLessThan(String value) {
            addCriterion("topic49_three <", value, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic49_three <=", value, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeLike(String value) {
            addCriterion("topic49_three like", value, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeNotLike(String value) {
            addCriterion("topic49_three not like", value, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeIn(List<String> values) {
            addCriterion("topic49_three in", values, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeNotIn(List<String> values) {
            addCriterion("topic49_three not in", values, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeBetween(String value1, String value2) {
            addCriterion("topic49_three between", value1, value2, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49ThreeNotBetween(String value1, String value2) {
            addCriterion("topic49_three not between", value1, value2, "topic49Three");
            return (Criteria) this;
        }

        public Criteria andTopic49FourIsNull() {
            addCriterion("topic49_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic49FourIsNotNull() {
            addCriterion("topic49_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic49FourEqualTo(String value) {
            addCriterion("topic49_four =", value, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FourNotEqualTo(String value) {
            addCriterion("topic49_four <>", value, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FourGreaterThan(String value) {
            addCriterion("topic49_four >", value, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic49_four >=", value, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FourLessThan(String value) {
            addCriterion("topic49_four <", value, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FourLessThanOrEqualTo(String value) {
            addCriterion("topic49_four <=", value, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FourLike(String value) {
            addCriterion("topic49_four like", value, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FourNotLike(String value) {
            addCriterion("topic49_four not like", value, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FourIn(List<String> values) {
            addCriterion("topic49_four in", values, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FourNotIn(List<String> values) {
            addCriterion("topic49_four not in", values, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FourBetween(String value1, String value2) {
            addCriterion("topic49_four between", value1, value2, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FourNotBetween(String value1, String value2) {
            addCriterion("topic49_four not between", value1, value2, "topic49Four");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionIsNull() {
            addCriterion("topic49_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionIsNotNull() {
            addCriterion("topic49_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionEqualTo(String value) {
            addCriterion("topic49_fraction =", value, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionNotEqualTo(String value) {
            addCriterion("topic49_fraction <>", value, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionGreaterThan(String value) {
            addCriterion("topic49_fraction >", value, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic49_fraction >=", value, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionLessThan(String value) {
            addCriterion("topic49_fraction <", value, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionLessThanOrEqualTo(String value) {
            addCriterion("topic49_fraction <=", value, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionLike(String value) {
            addCriterion("topic49_fraction like", value, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionNotLike(String value) {
            addCriterion("topic49_fraction not like", value, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionIn(List<String> values) {
            addCriterion("topic49_fraction in", values, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionNotIn(List<String> values) {
            addCriterion("topic49_fraction not in", values, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionBetween(String value1, String value2) {
            addCriterion("topic49_fraction between", value1, value2, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49FractionNotBetween(String value1, String value2) {
            addCriterion("topic49_fraction not between", value1, value2, "topic49Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic49SixIsNull() {
            addCriterion("topic49_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic49SixIsNotNull() {
            addCriterion("topic49_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic49SixEqualTo(String value) {
            addCriterion("topic49_six =", value, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic49SixNotEqualTo(String value) {
            addCriterion("topic49_six <>", value, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic49SixGreaterThan(String value) {
            addCriterion("topic49_six >", value, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic49SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic49_six >=", value, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic49SixLessThan(String value) {
            addCriterion("topic49_six <", value, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic49SixLessThanOrEqualTo(String value) {
            addCriterion("topic49_six <=", value, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic49SixLike(String value) {
            addCriterion("topic49_six like", value, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic49SixNotLike(String value) {
            addCriterion("topic49_six not like", value, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic49SixIn(List<String> values) {
            addCriterion("topic49_six in", values, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic49SixNotIn(List<String> values) {
            addCriterion("topic49_six not in", values, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic49SixBetween(String value1, String value2) {
            addCriterion("topic49_six between", value1, value2, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic49SixNotBetween(String value1, String value2) {
            addCriterion("topic49_six not between", value1, value2, "topic49Six");
            return (Criteria) this;
        }

        public Criteria andTopic50OneIsNull() {
            addCriterion("topic50_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic50OneIsNotNull() {
            addCriterion("topic50_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic50OneEqualTo(String value) {
            addCriterion("topic50_one =", value, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50OneNotEqualTo(String value) {
            addCriterion("topic50_one <>", value, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50OneGreaterThan(String value) {
            addCriterion("topic50_one >", value, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic50_one >=", value, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50OneLessThan(String value) {
            addCriterion("topic50_one <", value, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50OneLessThanOrEqualTo(String value) {
            addCriterion("topic50_one <=", value, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50OneLike(String value) {
            addCriterion("topic50_one like", value, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50OneNotLike(String value) {
            addCriterion("topic50_one not like", value, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50OneIn(List<String> values) {
            addCriterion("topic50_one in", values, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50OneNotIn(List<String> values) {
            addCriterion("topic50_one not in", values, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50OneBetween(String value1, String value2) {
            addCriterion("topic50_one between", value1, value2, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50OneNotBetween(String value1, String value2) {
            addCriterion("topic50_one not between", value1, value2, "topic50One");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoIsNull() {
            addCriterion("topic50_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoIsNotNull() {
            addCriterion("topic50_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoEqualTo(String value) {
            addCriterion("topic50_two =", value, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoNotEqualTo(String value) {
            addCriterion("topic50_two <>", value, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoGreaterThan(String value) {
            addCriterion("topic50_two >", value, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic50_two >=", value, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoLessThan(String value) {
            addCriterion("topic50_two <", value, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoLessThanOrEqualTo(String value) {
            addCriterion("topic50_two <=", value, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoLike(String value) {
            addCriterion("topic50_two like", value, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoNotLike(String value) {
            addCriterion("topic50_two not like", value, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoIn(List<String> values) {
            addCriterion("topic50_two in", values, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoNotIn(List<String> values) {
            addCriterion("topic50_two not in", values, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoBetween(String value1, String value2) {
            addCriterion("topic50_two between", value1, value2, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50TwoNotBetween(String value1, String value2) {
            addCriterion("topic50_two not between", value1, value2, "topic50Two");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeIsNull() {
            addCriterion("topic50_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeIsNotNull() {
            addCriterion("topic50_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeEqualTo(String value) {
            addCriterion("topic50_three =", value, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeNotEqualTo(String value) {
            addCriterion("topic50_three <>", value, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeGreaterThan(String value) {
            addCriterion("topic50_three >", value, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic50_three >=", value, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeLessThan(String value) {
            addCriterion("topic50_three <", value, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic50_three <=", value, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeLike(String value) {
            addCriterion("topic50_three like", value, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeNotLike(String value) {
            addCriterion("topic50_three not like", value, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeIn(List<String> values) {
            addCriterion("topic50_three in", values, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeNotIn(List<String> values) {
            addCriterion("topic50_three not in", values, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeBetween(String value1, String value2) {
            addCriterion("topic50_three between", value1, value2, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50ThreeNotBetween(String value1, String value2) {
            addCriterion("topic50_three not between", value1, value2, "topic50Three");
            return (Criteria) this;
        }

        public Criteria andTopic50FourIsNull() {
            addCriterion("topic50_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic50FourIsNotNull() {
            addCriterion("topic50_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic50FourEqualTo(String value) {
            addCriterion("topic50_four =", value, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FourNotEqualTo(String value) {
            addCriterion("topic50_four <>", value, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FourGreaterThan(String value) {
            addCriterion("topic50_four >", value, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic50_four >=", value, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FourLessThan(String value) {
            addCriterion("topic50_four <", value, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FourLessThanOrEqualTo(String value) {
            addCriterion("topic50_four <=", value, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FourLike(String value) {
            addCriterion("topic50_four like", value, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FourNotLike(String value) {
            addCriterion("topic50_four not like", value, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FourIn(List<String> values) {
            addCriterion("topic50_four in", values, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FourNotIn(List<String> values) {
            addCriterion("topic50_four not in", values, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FourBetween(String value1, String value2) {
            addCriterion("topic50_four between", value1, value2, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FourNotBetween(String value1, String value2) {
            addCriterion("topic50_four not between", value1, value2, "topic50Four");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionIsNull() {
            addCriterion("topic50_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionIsNotNull() {
            addCriterion("topic50_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionEqualTo(String value) {
            addCriterion("topic50_fraction =", value, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionNotEqualTo(String value) {
            addCriterion("topic50_fraction <>", value, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionGreaterThan(String value) {
            addCriterion("topic50_fraction >", value, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic50_fraction >=", value, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionLessThan(String value) {
            addCriterion("topic50_fraction <", value, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionLessThanOrEqualTo(String value) {
            addCriterion("topic50_fraction <=", value, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionLike(String value) {
            addCriterion("topic50_fraction like", value, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionNotLike(String value) {
            addCriterion("topic50_fraction not like", value, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionIn(List<String> values) {
            addCriterion("topic50_fraction in", values, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionNotIn(List<String> values) {
            addCriterion("topic50_fraction not in", values, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionBetween(String value1, String value2) {
            addCriterion("topic50_fraction between", value1, value2, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50FractionNotBetween(String value1, String value2) {
            addCriterion("topic50_fraction not between", value1, value2, "topic50Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic50SixIsNull() {
            addCriterion("topic50_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic50SixIsNotNull() {
            addCriterion("topic50_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic50SixEqualTo(String value) {
            addCriterion("topic50_six =", value, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic50SixNotEqualTo(String value) {
            addCriterion("topic50_six <>", value, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic50SixGreaterThan(String value) {
            addCriterion("topic50_six >", value, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic50SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic50_six >=", value, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic50SixLessThan(String value) {
            addCriterion("topic50_six <", value, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic50SixLessThanOrEqualTo(String value) {
            addCriterion("topic50_six <=", value, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic50SixLike(String value) {
            addCriterion("topic50_six like", value, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic50SixNotLike(String value) {
            addCriterion("topic50_six not like", value, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic50SixIn(List<String> values) {
            addCriterion("topic50_six in", values, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic50SixNotIn(List<String> values) {
            addCriterion("topic50_six not in", values, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic50SixBetween(String value1, String value2) {
            addCriterion("topic50_six between", value1, value2, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic50SixNotBetween(String value1, String value2) {
            addCriterion("topic50_six not between", value1, value2, "topic50Six");
            return (Criteria) this;
        }

        public Criteria andTopic51OneIsNull() {
            addCriterion("topic51_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic51OneIsNotNull() {
            addCriterion("topic51_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic51OneEqualTo(String value) {
            addCriterion("topic51_one =", value, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51OneNotEqualTo(String value) {
            addCriterion("topic51_one <>", value, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51OneGreaterThan(String value) {
            addCriterion("topic51_one >", value, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic51_one >=", value, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51OneLessThan(String value) {
            addCriterion("topic51_one <", value, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51OneLessThanOrEqualTo(String value) {
            addCriterion("topic51_one <=", value, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51OneLike(String value) {
            addCriterion("topic51_one like", value, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51OneNotLike(String value) {
            addCriterion("topic51_one not like", value, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51OneIn(List<String> values) {
            addCriterion("topic51_one in", values, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51OneNotIn(List<String> values) {
            addCriterion("topic51_one not in", values, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51OneBetween(String value1, String value2) {
            addCriterion("topic51_one between", value1, value2, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51OneNotBetween(String value1, String value2) {
            addCriterion("topic51_one not between", value1, value2, "topic51One");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoIsNull() {
            addCriterion("topic51_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoIsNotNull() {
            addCriterion("topic51_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoEqualTo(String value) {
            addCriterion("topic51_two =", value, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoNotEqualTo(String value) {
            addCriterion("topic51_two <>", value, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoGreaterThan(String value) {
            addCriterion("topic51_two >", value, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic51_two >=", value, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoLessThan(String value) {
            addCriterion("topic51_two <", value, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoLessThanOrEqualTo(String value) {
            addCriterion("topic51_two <=", value, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoLike(String value) {
            addCriterion("topic51_two like", value, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoNotLike(String value) {
            addCriterion("topic51_two not like", value, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoIn(List<String> values) {
            addCriterion("topic51_two in", values, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoNotIn(List<String> values) {
            addCriterion("topic51_two not in", values, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoBetween(String value1, String value2) {
            addCriterion("topic51_two between", value1, value2, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51TwoNotBetween(String value1, String value2) {
            addCriterion("topic51_two not between", value1, value2, "topic51Two");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeIsNull() {
            addCriterion("topic51_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeIsNotNull() {
            addCriterion("topic51_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeEqualTo(String value) {
            addCriterion("topic51_three =", value, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeNotEqualTo(String value) {
            addCriterion("topic51_three <>", value, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeGreaterThan(String value) {
            addCriterion("topic51_three >", value, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic51_three >=", value, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeLessThan(String value) {
            addCriterion("topic51_three <", value, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic51_three <=", value, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeLike(String value) {
            addCriterion("topic51_three like", value, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeNotLike(String value) {
            addCriterion("topic51_three not like", value, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeIn(List<String> values) {
            addCriterion("topic51_three in", values, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeNotIn(List<String> values) {
            addCriterion("topic51_three not in", values, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeBetween(String value1, String value2) {
            addCriterion("topic51_three between", value1, value2, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51ThreeNotBetween(String value1, String value2) {
            addCriterion("topic51_three not between", value1, value2, "topic51Three");
            return (Criteria) this;
        }

        public Criteria andTopic51FourIsNull() {
            addCriterion("topic51_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic51FourIsNotNull() {
            addCriterion("topic51_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic51FourEqualTo(String value) {
            addCriterion("topic51_four =", value, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FourNotEqualTo(String value) {
            addCriterion("topic51_four <>", value, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FourGreaterThan(String value) {
            addCriterion("topic51_four >", value, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic51_four >=", value, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FourLessThan(String value) {
            addCriterion("topic51_four <", value, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FourLessThanOrEqualTo(String value) {
            addCriterion("topic51_four <=", value, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FourLike(String value) {
            addCriterion("topic51_four like", value, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FourNotLike(String value) {
            addCriterion("topic51_four not like", value, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FourIn(List<String> values) {
            addCriterion("topic51_four in", values, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FourNotIn(List<String> values) {
            addCriterion("topic51_four not in", values, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FourBetween(String value1, String value2) {
            addCriterion("topic51_four between", value1, value2, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FourNotBetween(String value1, String value2) {
            addCriterion("topic51_four not between", value1, value2, "topic51Four");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionIsNull() {
            addCriterion("topic51_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionIsNotNull() {
            addCriterion("topic51_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionEqualTo(String value) {
            addCriterion("topic51_fraction =", value, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionNotEqualTo(String value) {
            addCriterion("topic51_fraction <>", value, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionGreaterThan(String value) {
            addCriterion("topic51_fraction >", value, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic51_fraction >=", value, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionLessThan(String value) {
            addCriterion("topic51_fraction <", value, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionLessThanOrEqualTo(String value) {
            addCriterion("topic51_fraction <=", value, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionLike(String value) {
            addCriterion("topic51_fraction like", value, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionNotLike(String value) {
            addCriterion("topic51_fraction not like", value, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionIn(List<String> values) {
            addCriterion("topic51_fraction in", values, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionNotIn(List<String> values) {
            addCriterion("topic51_fraction not in", values, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionBetween(String value1, String value2) {
            addCriterion("topic51_fraction between", value1, value2, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51FractionNotBetween(String value1, String value2) {
            addCriterion("topic51_fraction not between", value1, value2, "topic51Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic51SixIsNull() {
            addCriterion("topic51_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic51SixIsNotNull() {
            addCriterion("topic51_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic51SixEqualTo(String value) {
            addCriterion("topic51_six =", value, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic51SixNotEqualTo(String value) {
            addCriterion("topic51_six <>", value, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic51SixGreaterThan(String value) {
            addCriterion("topic51_six >", value, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic51SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic51_six >=", value, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic51SixLessThan(String value) {
            addCriterion("topic51_six <", value, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic51SixLessThanOrEqualTo(String value) {
            addCriterion("topic51_six <=", value, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic51SixLike(String value) {
            addCriterion("topic51_six like", value, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic51SixNotLike(String value) {
            addCriterion("topic51_six not like", value, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic51SixIn(List<String> values) {
            addCriterion("topic51_six in", values, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic51SixNotIn(List<String> values) {
            addCriterion("topic51_six not in", values, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic51SixBetween(String value1, String value2) {
            addCriterion("topic51_six between", value1, value2, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic51SixNotBetween(String value1, String value2) {
            addCriterion("topic51_six not between", value1, value2, "topic51Six");
            return (Criteria) this;
        }

        public Criteria andTopic52OneIsNull() {
            addCriterion("topic52_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic52OneIsNotNull() {
            addCriterion("topic52_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic52OneEqualTo(String value) {
            addCriterion("topic52_one =", value, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52OneNotEqualTo(String value) {
            addCriterion("topic52_one <>", value, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52OneGreaterThan(String value) {
            addCriterion("topic52_one >", value, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic52_one >=", value, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52OneLessThan(String value) {
            addCriterion("topic52_one <", value, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52OneLessThanOrEqualTo(String value) {
            addCriterion("topic52_one <=", value, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52OneLike(String value) {
            addCriterion("topic52_one like", value, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52OneNotLike(String value) {
            addCriterion("topic52_one not like", value, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52OneIn(List<String> values) {
            addCriterion("topic52_one in", values, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52OneNotIn(List<String> values) {
            addCriterion("topic52_one not in", values, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52OneBetween(String value1, String value2) {
            addCriterion("topic52_one between", value1, value2, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52OneNotBetween(String value1, String value2) {
            addCriterion("topic52_one not between", value1, value2, "topic52One");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoIsNull() {
            addCriterion("topic52_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoIsNotNull() {
            addCriterion("topic52_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoEqualTo(String value) {
            addCriterion("topic52_two =", value, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoNotEqualTo(String value) {
            addCriterion("topic52_two <>", value, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoGreaterThan(String value) {
            addCriterion("topic52_two >", value, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic52_two >=", value, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoLessThan(String value) {
            addCriterion("topic52_two <", value, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoLessThanOrEqualTo(String value) {
            addCriterion("topic52_two <=", value, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoLike(String value) {
            addCriterion("topic52_two like", value, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoNotLike(String value) {
            addCriterion("topic52_two not like", value, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoIn(List<String> values) {
            addCriterion("topic52_two in", values, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoNotIn(List<String> values) {
            addCriterion("topic52_two not in", values, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoBetween(String value1, String value2) {
            addCriterion("topic52_two between", value1, value2, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52TwoNotBetween(String value1, String value2) {
            addCriterion("topic52_two not between", value1, value2, "topic52Two");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeIsNull() {
            addCriterion("topic52_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeIsNotNull() {
            addCriterion("topic52_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeEqualTo(String value) {
            addCriterion("topic52_three =", value, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeNotEqualTo(String value) {
            addCriterion("topic52_three <>", value, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeGreaterThan(String value) {
            addCriterion("topic52_three >", value, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic52_three >=", value, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeLessThan(String value) {
            addCriterion("topic52_three <", value, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic52_three <=", value, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeLike(String value) {
            addCriterion("topic52_three like", value, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeNotLike(String value) {
            addCriterion("topic52_three not like", value, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeIn(List<String> values) {
            addCriterion("topic52_three in", values, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeNotIn(List<String> values) {
            addCriterion("topic52_three not in", values, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeBetween(String value1, String value2) {
            addCriterion("topic52_three between", value1, value2, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52ThreeNotBetween(String value1, String value2) {
            addCriterion("topic52_three not between", value1, value2, "topic52Three");
            return (Criteria) this;
        }

        public Criteria andTopic52FourIsNull() {
            addCriterion("topic52_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic52FourIsNotNull() {
            addCriterion("topic52_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic52FourEqualTo(String value) {
            addCriterion("topic52_four =", value, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FourNotEqualTo(String value) {
            addCriterion("topic52_four <>", value, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FourGreaterThan(String value) {
            addCriterion("topic52_four >", value, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic52_four >=", value, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FourLessThan(String value) {
            addCriterion("topic52_four <", value, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FourLessThanOrEqualTo(String value) {
            addCriterion("topic52_four <=", value, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FourLike(String value) {
            addCriterion("topic52_four like", value, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FourNotLike(String value) {
            addCriterion("topic52_four not like", value, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FourIn(List<String> values) {
            addCriterion("topic52_four in", values, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FourNotIn(List<String> values) {
            addCriterion("topic52_four not in", values, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FourBetween(String value1, String value2) {
            addCriterion("topic52_four between", value1, value2, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FourNotBetween(String value1, String value2) {
            addCriterion("topic52_four not between", value1, value2, "topic52Four");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionIsNull() {
            addCriterion("topic52_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionIsNotNull() {
            addCriterion("topic52_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionEqualTo(String value) {
            addCriterion("topic52_fraction =", value, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionNotEqualTo(String value) {
            addCriterion("topic52_fraction <>", value, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionGreaterThan(String value) {
            addCriterion("topic52_fraction >", value, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic52_fraction >=", value, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionLessThan(String value) {
            addCriterion("topic52_fraction <", value, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionLessThanOrEqualTo(String value) {
            addCriterion("topic52_fraction <=", value, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionLike(String value) {
            addCriterion("topic52_fraction like", value, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionNotLike(String value) {
            addCriterion("topic52_fraction not like", value, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionIn(List<String> values) {
            addCriterion("topic52_fraction in", values, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionNotIn(List<String> values) {
            addCriterion("topic52_fraction not in", values, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionBetween(String value1, String value2) {
            addCriterion("topic52_fraction between", value1, value2, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52FractionNotBetween(String value1, String value2) {
            addCriterion("topic52_fraction not between", value1, value2, "topic52Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic52SixIsNull() {
            addCriterion("topic52_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic52SixIsNotNull() {
            addCriterion("topic52_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic52SixEqualTo(String value) {
            addCriterion("topic52_six =", value, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic52SixNotEqualTo(String value) {
            addCriterion("topic52_six <>", value, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic52SixGreaterThan(String value) {
            addCriterion("topic52_six >", value, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic52SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic52_six >=", value, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic52SixLessThan(String value) {
            addCriterion("topic52_six <", value, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic52SixLessThanOrEqualTo(String value) {
            addCriterion("topic52_six <=", value, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic52SixLike(String value) {
            addCriterion("topic52_six like", value, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic52SixNotLike(String value) {
            addCriterion("topic52_six not like", value, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic52SixIn(List<String> values) {
            addCriterion("topic52_six in", values, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic52SixNotIn(List<String> values) {
            addCriterion("topic52_six not in", values, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic52SixBetween(String value1, String value2) {
            addCriterion("topic52_six between", value1, value2, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic52SixNotBetween(String value1, String value2) {
            addCriterion("topic52_six not between", value1, value2, "topic52Six");
            return (Criteria) this;
        }

        public Criteria andTopic53OneIsNull() {
            addCriterion("topic53_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic53OneIsNotNull() {
            addCriterion("topic53_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic53OneEqualTo(String value) {
            addCriterion("topic53_one =", value, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53OneNotEqualTo(String value) {
            addCriterion("topic53_one <>", value, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53OneGreaterThan(String value) {
            addCriterion("topic53_one >", value, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic53_one >=", value, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53OneLessThan(String value) {
            addCriterion("topic53_one <", value, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53OneLessThanOrEqualTo(String value) {
            addCriterion("topic53_one <=", value, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53OneLike(String value) {
            addCriterion("topic53_one like", value, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53OneNotLike(String value) {
            addCriterion("topic53_one not like", value, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53OneIn(List<String> values) {
            addCriterion("topic53_one in", values, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53OneNotIn(List<String> values) {
            addCriterion("topic53_one not in", values, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53OneBetween(String value1, String value2) {
            addCriterion("topic53_one between", value1, value2, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53OneNotBetween(String value1, String value2) {
            addCriterion("topic53_one not between", value1, value2, "topic53One");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoIsNull() {
            addCriterion("topic53_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoIsNotNull() {
            addCriterion("topic53_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoEqualTo(String value) {
            addCriterion("topic53_two =", value, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoNotEqualTo(String value) {
            addCriterion("topic53_two <>", value, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoGreaterThan(String value) {
            addCriterion("topic53_two >", value, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic53_two >=", value, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoLessThan(String value) {
            addCriterion("topic53_two <", value, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoLessThanOrEqualTo(String value) {
            addCriterion("topic53_two <=", value, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoLike(String value) {
            addCriterion("topic53_two like", value, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoNotLike(String value) {
            addCriterion("topic53_two not like", value, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoIn(List<String> values) {
            addCriterion("topic53_two in", values, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoNotIn(List<String> values) {
            addCriterion("topic53_two not in", values, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoBetween(String value1, String value2) {
            addCriterion("topic53_two between", value1, value2, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53TwoNotBetween(String value1, String value2) {
            addCriterion("topic53_two not between", value1, value2, "topic53Two");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeIsNull() {
            addCriterion("topic53_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeIsNotNull() {
            addCriterion("topic53_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeEqualTo(String value) {
            addCriterion("topic53_three =", value, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeNotEqualTo(String value) {
            addCriterion("topic53_three <>", value, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeGreaterThan(String value) {
            addCriterion("topic53_three >", value, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic53_three >=", value, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeLessThan(String value) {
            addCriterion("topic53_three <", value, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic53_three <=", value, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeLike(String value) {
            addCriterion("topic53_three like", value, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeNotLike(String value) {
            addCriterion("topic53_three not like", value, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeIn(List<String> values) {
            addCriterion("topic53_three in", values, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeNotIn(List<String> values) {
            addCriterion("topic53_three not in", values, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeBetween(String value1, String value2) {
            addCriterion("topic53_three between", value1, value2, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53ThreeNotBetween(String value1, String value2) {
            addCriterion("topic53_three not between", value1, value2, "topic53Three");
            return (Criteria) this;
        }

        public Criteria andTopic53FourIsNull() {
            addCriterion("topic53_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic53FourIsNotNull() {
            addCriterion("topic53_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic53FourEqualTo(String value) {
            addCriterion("topic53_four =", value, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FourNotEqualTo(String value) {
            addCriterion("topic53_four <>", value, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FourGreaterThan(String value) {
            addCriterion("topic53_four >", value, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic53_four >=", value, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FourLessThan(String value) {
            addCriterion("topic53_four <", value, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FourLessThanOrEqualTo(String value) {
            addCriterion("topic53_four <=", value, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FourLike(String value) {
            addCriterion("topic53_four like", value, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FourNotLike(String value) {
            addCriterion("topic53_four not like", value, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FourIn(List<String> values) {
            addCriterion("topic53_four in", values, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FourNotIn(List<String> values) {
            addCriterion("topic53_four not in", values, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FourBetween(String value1, String value2) {
            addCriterion("topic53_four between", value1, value2, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FourNotBetween(String value1, String value2) {
            addCriterion("topic53_four not between", value1, value2, "topic53Four");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionIsNull() {
            addCriterion("topic53_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionIsNotNull() {
            addCriterion("topic53_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionEqualTo(String value) {
            addCriterion("topic53_fraction =", value, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionNotEqualTo(String value) {
            addCriterion("topic53_fraction <>", value, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionGreaterThan(String value) {
            addCriterion("topic53_fraction >", value, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic53_fraction >=", value, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionLessThan(String value) {
            addCriterion("topic53_fraction <", value, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionLessThanOrEqualTo(String value) {
            addCriterion("topic53_fraction <=", value, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionLike(String value) {
            addCriterion("topic53_fraction like", value, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionNotLike(String value) {
            addCriterion("topic53_fraction not like", value, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionIn(List<String> values) {
            addCriterion("topic53_fraction in", values, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionNotIn(List<String> values) {
            addCriterion("topic53_fraction not in", values, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionBetween(String value1, String value2) {
            addCriterion("topic53_fraction between", value1, value2, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53FractionNotBetween(String value1, String value2) {
            addCriterion("topic53_fraction not between", value1, value2, "topic53Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic53SixIsNull() {
            addCriterion("topic53_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic53SixIsNotNull() {
            addCriterion("topic53_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic53SixEqualTo(String value) {
            addCriterion("topic53_six =", value, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic53SixNotEqualTo(String value) {
            addCriterion("topic53_six <>", value, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic53SixGreaterThan(String value) {
            addCriterion("topic53_six >", value, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic53SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic53_six >=", value, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic53SixLessThan(String value) {
            addCriterion("topic53_six <", value, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic53SixLessThanOrEqualTo(String value) {
            addCriterion("topic53_six <=", value, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic53SixLike(String value) {
            addCriterion("topic53_six like", value, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic53SixNotLike(String value) {
            addCriterion("topic53_six not like", value, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic53SixIn(List<String> values) {
            addCriterion("topic53_six in", values, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic53SixNotIn(List<String> values) {
            addCriterion("topic53_six not in", values, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic53SixBetween(String value1, String value2) {
            addCriterion("topic53_six between", value1, value2, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic53SixNotBetween(String value1, String value2) {
            addCriterion("topic53_six not between", value1, value2, "topic53Six");
            return (Criteria) this;
        }

        public Criteria andTopic54OneIsNull() {
            addCriterion("topic54_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic54OneIsNotNull() {
            addCriterion("topic54_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic54OneEqualTo(String value) {
            addCriterion("topic54_one =", value, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54OneNotEqualTo(String value) {
            addCriterion("topic54_one <>", value, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54OneGreaterThan(String value) {
            addCriterion("topic54_one >", value, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic54_one >=", value, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54OneLessThan(String value) {
            addCriterion("topic54_one <", value, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54OneLessThanOrEqualTo(String value) {
            addCriterion("topic54_one <=", value, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54OneLike(String value) {
            addCriterion("topic54_one like", value, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54OneNotLike(String value) {
            addCriterion("topic54_one not like", value, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54OneIn(List<String> values) {
            addCriterion("topic54_one in", values, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54OneNotIn(List<String> values) {
            addCriterion("topic54_one not in", values, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54OneBetween(String value1, String value2) {
            addCriterion("topic54_one between", value1, value2, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54OneNotBetween(String value1, String value2) {
            addCriterion("topic54_one not between", value1, value2, "topic54One");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoIsNull() {
            addCriterion("topic54_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoIsNotNull() {
            addCriterion("topic54_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoEqualTo(String value) {
            addCriterion("topic54_two =", value, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoNotEqualTo(String value) {
            addCriterion("topic54_two <>", value, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoGreaterThan(String value) {
            addCriterion("topic54_two >", value, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic54_two >=", value, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoLessThan(String value) {
            addCriterion("topic54_two <", value, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoLessThanOrEqualTo(String value) {
            addCriterion("topic54_two <=", value, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoLike(String value) {
            addCriterion("topic54_two like", value, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoNotLike(String value) {
            addCriterion("topic54_two not like", value, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoIn(List<String> values) {
            addCriterion("topic54_two in", values, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoNotIn(List<String> values) {
            addCriterion("topic54_two not in", values, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoBetween(String value1, String value2) {
            addCriterion("topic54_two between", value1, value2, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54TwoNotBetween(String value1, String value2) {
            addCriterion("topic54_two not between", value1, value2, "topic54Two");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeIsNull() {
            addCriterion("topic54_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeIsNotNull() {
            addCriterion("topic54_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeEqualTo(String value) {
            addCriterion("topic54_three =", value, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeNotEqualTo(String value) {
            addCriterion("topic54_three <>", value, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeGreaterThan(String value) {
            addCriterion("topic54_three >", value, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic54_three >=", value, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeLessThan(String value) {
            addCriterion("topic54_three <", value, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic54_three <=", value, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeLike(String value) {
            addCriterion("topic54_three like", value, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeNotLike(String value) {
            addCriterion("topic54_three not like", value, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeIn(List<String> values) {
            addCriterion("topic54_three in", values, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeNotIn(List<String> values) {
            addCriterion("topic54_three not in", values, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeBetween(String value1, String value2) {
            addCriterion("topic54_three between", value1, value2, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54ThreeNotBetween(String value1, String value2) {
            addCriterion("topic54_three not between", value1, value2, "topic54Three");
            return (Criteria) this;
        }

        public Criteria andTopic54FourIsNull() {
            addCriterion("topic54_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic54FourIsNotNull() {
            addCriterion("topic54_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic54FourEqualTo(String value) {
            addCriterion("topic54_four =", value, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FourNotEqualTo(String value) {
            addCriterion("topic54_four <>", value, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FourGreaterThan(String value) {
            addCriterion("topic54_four >", value, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic54_four >=", value, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FourLessThan(String value) {
            addCriterion("topic54_four <", value, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FourLessThanOrEqualTo(String value) {
            addCriterion("topic54_four <=", value, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FourLike(String value) {
            addCriterion("topic54_four like", value, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FourNotLike(String value) {
            addCriterion("topic54_four not like", value, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FourIn(List<String> values) {
            addCriterion("topic54_four in", values, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FourNotIn(List<String> values) {
            addCriterion("topic54_four not in", values, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FourBetween(String value1, String value2) {
            addCriterion("topic54_four between", value1, value2, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FourNotBetween(String value1, String value2) {
            addCriterion("topic54_four not between", value1, value2, "topic54Four");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionIsNull() {
            addCriterion("topic54_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionIsNotNull() {
            addCriterion("topic54_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionEqualTo(String value) {
            addCriterion("topic54_fraction =", value, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionNotEqualTo(String value) {
            addCriterion("topic54_fraction <>", value, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionGreaterThan(String value) {
            addCriterion("topic54_fraction >", value, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic54_fraction >=", value, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionLessThan(String value) {
            addCriterion("topic54_fraction <", value, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionLessThanOrEqualTo(String value) {
            addCriterion("topic54_fraction <=", value, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionLike(String value) {
            addCriterion("topic54_fraction like", value, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionNotLike(String value) {
            addCriterion("topic54_fraction not like", value, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionIn(List<String> values) {
            addCriterion("topic54_fraction in", values, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionNotIn(List<String> values) {
            addCriterion("topic54_fraction not in", values, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionBetween(String value1, String value2) {
            addCriterion("topic54_fraction between", value1, value2, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54FractionNotBetween(String value1, String value2) {
            addCriterion("topic54_fraction not between", value1, value2, "topic54Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic54SixIsNull() {
            addCriterion("topic54_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic54SixIsNotNull() {
            addCriterion("topic54_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic54SixEqualTo(String value) {
            addCriterion("topic54_six =", value, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic54SixNotEqualTo(String value) {
            addCriterion("topic54_six <>", value, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic54SixGreaterThan(String value) {
            addCriterion("topic54_six >", value, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic54SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic54_six >=", value, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic54SixLessThan(String value) {
            addCriterion("topic54_six <", value, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic54SixLessThanOrEqualTo(String value) {
            addCriterion("topic54_six <=", value, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic54SixLike(String value) {
            addCriterion("topic54_six like", value, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic54SixNotLike(String value) {
            addCriterion("topic54_six not like", value, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic54SixIn(List<String> values) {
            addCriterion("topic54_six in", values, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic54SixNotIn(List<String> values) {
            addCriterion("topic54_six not in", values, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic54SixBetween(String value1, String value2) {
            addCriterion("topic54_six between", value1, value2, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic54SixNotBetween(String value1, String value2) {
            addCriterion("topic54_six not between", value1, value2, "topic54Six");
            return (Criteria) this;
        }

        public Criteria andTopic55OneIsNull() {
            addCriterion("topic55_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic55OneIsNotNull() {
            addCriterion("topic55_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic55OneEqualTo(String value) {
            addCriterion("topic55_one =", value, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55OneNotEqualTo(String value) {
            addCriterion("topic55_one <>", value, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55OneGreaterThan(String value) {
            addCriterion("topic55_one >", value, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic55_one >=", value, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55OneLessThan(String value) {
            addCriterion("topic55_one <", value, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55OneLessThanOrEqualTo(String value) {
            addCriterion("topic55_one <=", value, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55OneLike(String value) {
            addCriterion("topic55_one like", value, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55OneNotLike(String value) {
            addCriterion("topic55_one not like", value, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55OneIn(List<String> values) {
            addCriterion("topic55_one in", values, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55OneNotIn(List<String> values) {
            addCriterion("topic55_one not in", values, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55OneBetween(String value1, String value2) {
            addCriterion("topic55_one between", value1, value2, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55OneNotBetween(String value1, String value2) {
            addCriterion("topic55_one not between", value1, value2, "topic55One");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoIsNull() {
            addCriterion("topic55_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoIsNotNull() {
            addCriterion("topic55_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoEqualTo(String value) {
            addCriterion("topic55_two =", value, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoNotEqualTo(String value) {
            addCriterion("topic55_two <>", value, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoGreaterThan(String value) {
            addCriterion("topic55_two >", value, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic55_two >=", value, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoLessThan(String value) {
            addCriterion("topic55_two <", value, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoLessThanOrEqualTo(String value) {
            addCriterion("topic55_two <=", value, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoLike(String value) {
            addCriterion("topic55_two like", value, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoNotLike(String value) {
            addCriterion("topic55_two not like", value, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoIn(List<String> values) {
            addCriterion("topic55_two in", values, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoNotIn(List<String> values) {
            addCriterion("topic55_two not in", values, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoBetween(String value1, String value2) {
            addCriterion("topic55_two between", value1, value2, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55TwoNotBetween(String value1, String value2) {
            addCriterion("topic55_two not between", value1, value2, "topic55Two");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeIsNull() {
            addCriterion("topic55_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeIsNotNull() {
            addCriterion("topic55_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeEqualTo(String value) {
            addCriterion("topic55_three =", value, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeNotEqualTo(String value) {
            addCriterion("topic55_three <>", value, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeGreaterThan(String value) {
            addCriterion("topic55_three >", value, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic55_three >=", value, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeLessThan(String value) {
            addCriterion("topic55_three <", value, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic55_three <=", value, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeLike(String value) {
            addCriterion("topic55_three like", value, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeNotLike(String value) {
            addCriterion("topic55_three not like", value, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeIn(List<String> values) {
            addCriterion("topic55_three in", values, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeNotIn(List<String> values) {
            addCriterion("topic55_three not in", values, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeBetween(String value1, String value2) {
            addCriterion("topic55_three between", value1, value2, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55ThreeNotBetween(String value1, String value2) {
            addCriterion("topic55_three not between", value1, value2, "topic55Three");
            return (Criteria) this;
        }

        public Criteria andTopic55FourIsNull() {
            addCriterion("topic55_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic55FourIsNotNull() {
            addCriterion("topic55_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic55FourEqualTo(String value) {
            addCriterion("topic55_four =", value, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FourNotEqualTo(String value) {
            addCriterion("topic55_four <>", value, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FourGreaterThan(String value) {
            addCriterion("topic55_four >", value, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic55_four >=", value, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FourLessThan(String value) {
            addCriterion("topic55_four <", value, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FourLessThanOrEqualTo(String value) {
            addCriterion("topic55_four <=", value, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FourLike(String value) {
            addCriterion("topic55_four like", value, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FourNotLike(String value) {
            addCriterion("topic55_four not like", value, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FourIn(List<String> values) {
            addCriterion("topic55_four in", values, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FourNotIn(List<String> values) {
            addCriterion("topic55_four not in", values, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FourBetween(String value1, String value2) {
            addCriterion("topic55_four between", value1, value2, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FourNotBetween(String value1, String value2) {
            addCriterion("topic55_four not between", value1, value2, "topic55Four");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionIsNull() {
            addCriterion("topic55_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionIsNotNull() {
            addCriterion("topic55_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionEqualTo(String value) {
            addCriterion("topic55_fraction =", value, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionNotEqualTo(String value) {
            addCriterion("topic55_fraction <>", value, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionGreaterThan(String value) {
            addCriterion("topic55_fraction >", value, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic55_fraction >=", value, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionLessThan(String value) {
            addCriterion("topic55_fraction <", value, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionLessThanOrEqualTo(String value) {
            addCriterion("topic55_fraction <=", value, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionLike(String value) {
            addCriterion("topic55_fraction like", value, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionNotLike(String value) {
            addCriterion("topic55_fraction not like", value, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionIn(List<String> values) {
            addCriterion("topic55_fraction in", values, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionNotIn(List<String> values) {
            addCriterion("topic55_fraction not in", values, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionBetween(String value1, String value2) {
            addCriterion("topic55_fraction between", value1, value2, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55FractionNotBetween(String value1, String value2) {
            addCriterion("topic55_fraction not between", value1, value2, "topic55Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic55SixIsNull() {
            addCriterion("topic55_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic55SixIsNotNull() {
            addCriterion("topic55_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic55SixEqualTo(String value) {
            addCriterion("topic55_six =", value, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic55SixNotEqualTo(String value) {
            addCriterion("topic55_six <>", value, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic55SixGreaterThan(String value) {
            addCriterion("topic55_six >", value, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic55SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic55_six >=", value, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic55SixLessThan(String value) {
            addCriterion("topic55_six <", value, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic55SixLessThanOrEqualTo(String value) {
            addCriterion("topic55_six <=", value, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic55SixLike(String value) {
            addCriterion("topic55_six like", value, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic55SixNotLike(String value) {
            addCriterion("topic55_six not like", value, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic55SixIn(List<String> values) {
            addCriterion("topic55_six in", values, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic55SixNotIn(List<String> values) {
            addCriterion("topic55_six not in", values, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic55SixBetween(String value1, String value2) {
            addCriterion("topic55_six between", value1, value2, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic55SixNotBetween(String value1, String value2) {
            addCriterion("topic55_six not between", value1, value2, "topic55Six");
            return (Criteria) this;
        }

        public Criteria andTopic56OneIsNull() {
            addCriterion("topic56_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic56OneIsNotNull() {
            addCriterion("topic56_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic56OneEqualTo(String value) {
            addCriterion("topic56_one =", value, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56OneNotEqualTo(String value) {
            addCriterion("topic56_one <>", value, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56OneGreaterThan(String value) {
            addCriterion("topic56_one >", value, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic56_one >=", value, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56OneLessThan(String value) {
            addCriterion("topic56_one <", value, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56OneLessThanOrEqualTo(String value) {
            addCriterion("topic56_one <=", value, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56OneLike(String value) {
            addCriterion("topic56_one like", value, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56OneNotLike(String value) {
            addCriterion("topic56_one not like", value, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56OneIn(List<String> values) {
            addCriterion("topic56_one in", values, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56OneNotIn(List<String> values) {
            addCriterion("topic56_one not in", values, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56OneBetween(String value1, String value2) {
            addCriterion("topic56_one between", value1, value2, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56OneNotBetween(String value1, String value2) {
            addCriterion("topic56_one not between", value1, value2, "topic56One");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoIsNull() {
            addCriterion("topic56_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoIsNotNull() {
            addCriterion("topic56_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoEqualTo(String value) {
            addCriterion("topic56_two =", value, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoNotEqualTo(String value) {
            addCriterion("topic56_two <>", value, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoGreaterThan(String value) {
            addCriterion("topic56_two >", value, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic56_two >=", value, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoLessThan(String value) {
            addCriterion("topic56_two <", value, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoLessThanOrEqualTo(String value) {
            addCriterion("topic56_two <=", value, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoLike(String value) {
            addCriterion("topic56_two like", value, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoNotLike(String value) {
            addCriterion("topic56_two not like", value, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoIn(List<String> values) {
            addCriterion("topic56_two in", values, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoNotIn(List<String> values) {
            addCriterion("topic56_two not in", values, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoBetween(String value1, String value2) {
            addCriterion("topic56_two between", value1, value2, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56TwoNotBetween(String value1, String value2) {
            addCriterion("topic56_two not between", value1, value2, "topic56Two");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeIsNull() {
            addCriterion("topic56_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeIsNotNull() {
            addCriterion("topic56_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeEqualTo(String value) {
            addCriterion("topic56_three =", value, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeNotEqualTo(String value) {
            addCriterion("topic56_three <>", value, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeGreaterThan(String value) {
            addCriterion("topic56_three >", value, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic56_three >=", value, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeLessThan(String value) {
            addCriterion("topic56_three <", value, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic56_three <=", value, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeLike(String value) {
            addCriterion("topic56_three like", value, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeNotLike(String value) {
            addCriterion("topic56_three not like", value, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeIn(List<String> values) {
            addCriterion("topic56_three in", values, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeNotIn(List<String> values) {
            addCriterion("topic56_three not in", values, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeBetween(String value1, String value2) {
            addCriterion("topic56_three between", value1, value2, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56ThreeNotBetween(String value1, String value2) {
            addCriterion("topic56_three not between", value1, value2, "topic56Three");
            return (Criteria) this;
        }

        public Criteria andTopic56FourIsNull() {
            addCriterion("topic56_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic56FourIsNotNull() {
            addCriterion("topic56_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic56FourEqualTo(String value) {
            addCriterion("topic56_four =", value, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FourNotEqualTo(String value) {
            addCriterion("topic56_four <>", value, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FourGreaterThan(String value) {
            addCriterion("topic56_four >", value, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic56_four >=", value, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FourLessThan(String value) {
            addCriterion("topic56_four <", value, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FourLessThanOrEqualTo(String value) {
            addCriterion("topic56_four <=", value, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FourLike(String value) {
            addCriterion("topic56_four like", value, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FourNotLike(String value) {
            addCriterion("topic56_four not like", value, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FourIn(List<String> values) {
            addCriterion("topic56_four in", values, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FourNotIn(List<String> values) {
            addCriterion("topic56_four not in", values, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FourBetween(String value1, String value2) {
            addCriterion("topic56_four between", value1, value2, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FourNotBetween(String value1, String value2) {
            addCriterion("topic56_four not between", value1, value2, "topic56Four");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionIsNull() {
            addCriterion("topic56_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionIsNotNull() {
            addCriterion("topic56_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionEqualTo(String value) {
            addCriterion("topic56_fraction =", value, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionNotEqualTo(String value) {
            addCriterion("topic56_fraction <>", value, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionGreaterThan(String value) {
            addCriterion("topic56_fraction >", value, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic56_fraction >=", value, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionLessThan(String value) {
            addCriterion("topic56_fraction <", value, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionLessThanOrEqualTo(String value) {
            addCriterion("topic56_fraction <=", value, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionLike(String value) {
            addCriterion("topic56_fraction like", value, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionNotLike(String value) {
            addCriterion("topic56_fraction not like", value, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionIn(List<String> values) {
            addCriterion("topic56_fraction in", values, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionNotIn(List<String> values) {
            addCriterion("topic56_fraction not in", values, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionBetween(String value1, String value2) {
            addCriterion("topic56_fraction between", value1, value2, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56FractionNotBetween(String value1, String value2) {
            addCriterion("topic56_fraction not between", value1, value2, "topic56Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic56SixIsNull() {
            addCriterion("topic56_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic56SixIsNotNull() {
            addCriterion("topic56_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic56SixEqualTo(String value) {
            addCriterion("topic56_six =", value, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic56SixNotEqualTo(String value) {
            addCriterion("topic56_six <>", value, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic56SixGreaterThan(String value) {
            addCriterion("topic56_six >", value, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic56SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic56_six >=", value, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic56SixLessThan(String value) {
            addCriterion("topic56_six <", value, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic56SixLessThanOrEqualTo(String value) {
            addCriterion("topic56_six <=", value, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic56SixLike(String value) {
            addCriterion("topic56_six like", value, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic56SixNotLike(String value) {
            addCriterion("topic56_six not like", value, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic56SixIn(List<String> values) {
            addCriterion("topic56_six in", values, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic56SixNotIn(List<String> values) {
            addCriterion("topic56_six not in", values, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic56SixBetween(String value1, String value2) {
            addCriterion("topic56_six between", value1, value2, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic56SixNotBetween(String value1, String value2) {
            addCriterion("topic56_six not between", value1, value2, "topic56Six");
            return (Criteria) this;
        }

        public Criteria andTopic57OneIsNull() {
            addCriterion("topic57_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic57OneIsNotNull() {
            addCriterion("topic57_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic57OneEqualTo(String value) {
            addCriterion("topic57_one =", value, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57OneNotEqualTo(String value) {
            addCriterion("topic57_one <>", value, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57OneGreaterThan(String value) {
            addCriterion("topic57_one >", value, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic57_one >=", value, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57OneLessThan(String value) {
            addCriterion("topic57_one <", value, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57OneLessThanOrEqualTo(String value) {
            addCriterion("topic57_one <=", value, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57OneLike(String value) {
            addCriterion("topic57_one like", value, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57OneNotLike(String value) {
            addCriterion("topic57_one not like", value, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57OneIn(List<String> values) {
            addCriterion("topic57_one in", values, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57OneNotIn(List<String> values) {
            addCriterion("topic57_one not in", values, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57OneBetween(String value1, String value2) {
            addCriterion("topic57_one between", value1, value2, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57OneNotBetween(String value1, String value2) {
            addCriterion("topic57_one not between", value1, value2, "topic57One");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoIsNull() {
            addCriterion("topic57_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoIsNotNull() {
            addCriterion("topic57_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoEqualTo(String value) {
            addCriterion("topic57_two =", value, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoNotEqualTo(String value) {
            addCriterion("topic57_two <>", value, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoGreaterThan(String value) {
            addCriterion("topic57_two >", value, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic57_two >=", value, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoLessThan(String value) {
            addCriterion("topic57_two <", value, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoLessThanOrEqualTo(String value) {
            addCriterion("topic57_two <=", value, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoLike(String value) {
            addCriterion("topic57_two like", value, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoNotLike(String value) {
            addCriterion("topic57_two not like", value, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoIn(List<String> values) {
            addCriterion("topic57_two in", values, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoNotIn(List<String> values) {
            addCriterion("topic57_two not in", values, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoBetween(String value1, String value2) {
            addCriterion("topic57_two between", value1, value2, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57TwoNotBetween(String value1, String value2) {
            addCriterion("topic57_two not between", value1, value2, "topic57Two");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeIsNull() {
            addCriterion("topic57_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeIsNotNull() {
            addCriterion("topic57_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeEqualTo(String value) {
            addCriterion("topic57_three =", value, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeNotEqualTo(String value) {
            addCriterion("topic57_three <>", value, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeGreaterThan(String value) {
            addCriterion("topic57_three >", value, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic57_three >=", value, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeLessThan(String value) {
            addCriterion("topic57_three <", value, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic57_three <=", value, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeLike(String value) {
            addCriterion("topic57_three like", value, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeNotLike(String value) {
            addCriterion("topic57_three not like", value, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeIn(List<String> values) {
            addCriterion("topic57_three in", values, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeNotIn(List<String> values) {
            addCriterion("topic57_three not in", values, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeBetween(String value1, String value2) {
            addCriterion("topic57_three between", value1, value2, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57ThreeNotBetween(String value1, String value2) {
            addCriterion("topic57_three not between", value1, value2, "topic57Three");
            return (Criteria) this;
        }

        public Criteria andTopic57FourIsNull() {
            addCriterion("topic57_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic57FourIsNotNull() {
            addCriterion("topic57_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic57FourEqualTo(String value) {
            addCriterion("topic57_four =", value, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FourNotEqualTo(String value) {
            addCriterion("topic57_four <>", value, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FourGreaterThan(String value) {
            addCriterion("topic57_four >", value, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic57_four >=", value, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FourLessThan(String value) {
            addCriterion("topic57_four <", value, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FourLessThanOrEqualTo(String value) {
            addCriterion("topic57_four <=", value, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FourLike(String value) {
            addCriterion("topic57_four like", value, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FourNotLike(String value) {
            addCriterion("topic57_four not like", value, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FourIn(List<String> values) {
            addCriterion("topic57_four in", values, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FourNotIn(List<String> values) {
            addCriterion("topic57_four not in", values, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FourBetween(String value1, String value2) {
            addCriterion("topic57_four between", value1, value2, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FourNotBetween(String value1, String value2) {
            addCriterion("topic57_four not between", value1, value2, "topic57Four");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionIsNull() {
            addCriterion("topic57_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionIsNotNull() {
            addCriterion("topic57_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionEqualTo(String value) {
            addCriterion("topic57_fraction =", value, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionNotEqualTo(String value) {
            addCriterion("topic57_fraction <>", value, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionGreaterThan(String value) {
            addCriterion("topic57_fraction >", value, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic57_fraction >=", value, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionLessThan(String value) {
            addCriterion("topic57_fraction <", value, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionLessThanOrEqualTo(String value) {
            addCriterion("topic57_fraction <=", value, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionLike(String value) {
            addCriterion("topic57_fraction like", value, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionNotLike(String value) {
            addCriterion("topic57_fraction not like", value, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionIn(List<String> values) {
            addCriterion("topic57_fraction in", values, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionNotIn(List<String> values) {
            addCriterion("topic57_fraction not in", values, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionBetween(String value1, String value2) {
            addCriterion("topic57_fraction between", value1, value2, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57FractionNotBetween(String value1, String value2) {
            addCriterion("topic57_fraction not between", value1, value2, "topic57Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic57SixIsNull() {
            addCriterion("topic57_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic57SixIsNotNull() {
            addCriterion("topic57_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic57SixEqualTo(String value) {
            addCriterion("topic57_six =", value, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic57SixNotEqualTo(String value) {
            addCriterion("topic57_six <>", value, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic57SixGreaterThan(String value) {
            addCriterion("topic57_six >", value, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic57SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic57_six >=", value, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic57SixLessThan(String value) {
            addCriterion("topic57_six <", value, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic57SixLessThanOrEqualTo(String value) {
            addCriterion("topic57_six <=", value, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic57SixLike(String value) {
            addCriterion("topic57_six like", value, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic57SixNotLike(String value) {
            addCriterion("topic57_six not like", value, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic57SixIn(List<String> values) {
            addCriterion("topic57_six in", values, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic57SixNotIn(List<String> values) {
            addCriterion("topic57_six not in", values, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic57SixBetween(String value1, String value2) {
            addCriterion("topic57_six between", value1, value2, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic57SixNotBetween(String value1, String value2) {
            addCriterion("topic57_six not between", value1, value2, "topic57Six");
            return (Criteria) this;
        }

        public Criteria andTopic58OneIsNull() {
            addCriterion("topic58_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic58OneIsNotNull() {
            addCriterion("topic58_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic58OneEqualTo(String value) {
            addCriterion("topic58_one =", value, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58OneNotEqualTo(String value) {
            addCriterion("topic58_one <>", value, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58OneGreaterThan(String value) {
            addCriterion("topic58_one >", value, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic58_one >=", value, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58OneLessThan(String value) {
            addCriterion("topic58_one <", value, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58OneLessThanOrEqualTo(String value) {
            addCriterion("topic58_one <=", value, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58OneLike(String value) {
            addCriterion("topic58_one like", value, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58OneNotLike(String value) {
            addCriterion("topic58_one not like", value, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58OneIn(List<String> values) {
            addCriterion("topic58_one in", values, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58OneNotIn(List<String> values) {
            addCriterion("topic58_one not in", values, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58OneBetween(String value1, String value2) {
            addCriterion("topic58_one between", value1, value2, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58OneNotBetween(String value1, String value2) {
            addCriterion("topic58_one not between", value1, value2, "topic58One");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoIsNull() {
            addCriterion("topic58_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoIsNotNull() {
            addCriterion("topic58_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoEqualTo(String value) {
            addCriterion("topic58_two =", value, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoNotEqualTo(String value) {
            addCriterion("topic58_two <>", value, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoGreaterThan(String value) {
            addCriterion("topic58_two >", value, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic58_two >=", value, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoLessThan(String value) {
            addCriterion("topic58_two <", value, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoLessThanOrEqualTo(String value) {
            addCriterion("topic58_two <=", value, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoLike(String value) {
            addCriterion("topic58_two like", value, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoNotLike(String value) {
            addCriterion("topic58_two not like", value, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoIn(List<String> values) {
            addCriterion("topic58_two in", values, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoNotIn(List<String> values) {
            addCriterion("topic58_two not in", values, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoBetween(String value1, String value2) {
            addCriterion("topic58_two between", value1, value2, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58TwoNotBetween(String value1, String value2) {
            addCriterion("topic58_two not between", value1, value2, "topic58Two");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeIsNull() {
            addCriterion("topic58_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeIsNotNull() {
            addCriterion("topic58_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeEqualTo(String value) {
            addCriterion("topic58_three =", value, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeNotEqualTo(String value) {
            addCriterion("topic58_three <>", value, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeGreaterThan(String value) {
            addCriterion("topic58_three >", value, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic58_three >=", value, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeLessThan(String value) {
            addCriterion("topic58_three <", value, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic58_three <=", value, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeLike(String value) {
            addCriterion("topic58_three like", value, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeNotLike(String value) {
            addCriterion("topic58_three not like", value, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeIn(List<String> values) {
            addCriterion("topic58_three in", values, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeNotIn(List<String> values) {
            addCriterion("topic58_three not in", values, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeBetween(String value1, String value2) {
            addCriterion("topic58_three between", value1, value2, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58ThreeNotBetween(String value1, String value2) {
            addCriterion("topic58_three not between", value1, value2, "topic58Three");
            return (Criteria) this;
        }

        public Criteria andTopic58FourIsNull() {
            addCriterion("topic58_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic58FourIsNotNull() {
            addCriterion("topic58_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic58FourEqualTo(String value) {
            addCriterion("topic58_four =", value, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FourNotEqualTo(String value) {
            addCriterion("topic58_four <>", value, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FourGreaterThan(String value) {
            addCriterion("topic58_four >", value, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic58_four >=", value, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FourLessThan(String value) {
            addCriterion("topic58_four <", value, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FourLessThanOrEqualTo(String value) {
            addCriterion("topic58_four <=", value, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FourLike(String value) {
            addCriterion("topic58_four like", value, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FourNotLike(String value) {
            addCriterion("topic58_four not like", value, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FourIn(List<String> values) {
            addCriterion("topic58_four in", values, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FourNotIn(List<String> values) {
            addCriterion("topic58_four not in", values, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FourBetween(String value1, String value2) {
            addCriterion("topic58_four between", value1, value2, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FourNotBetween(String value1, String value2) {
            addCriterion("topic58_four not between", value1, value2, "topic58Four");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionIsNull() {
            addCriterion("topic58_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionIsNotNull() {
            addCriterion("topic58_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionEqualTo(String value) {
            addCriterion("topic58_fraction =", value, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionNotEqualTo(String value) {
            addCriterion("topic58_fraction <>", value, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionGreaterThan(String value) {
            addCriterion("topic58_fraction >", value, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic58_fraction >=", value, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionLessThan(String value) {
            addCriterion("topic58_fraction <", value, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionLessThanOrEqualTo(String value) {
            addCriterion("topic58_fraction <=", value, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionLike(String value) {
            addCriterion("topic58_fraction like", value, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionNotLike(String value) {
            addCriterion("topic58_fraction not like", value, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionIn(List<String> values) {
            addCriterion("topic58_fraction in", values, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionNotIn(List<String> values) {
            addCriterion("topic58_fraction not in", values, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionBetween(String value1, String value2) {
            addCriterion("topic58_fraction between", value1, value2, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58FractionNotBetween(String value1, String value2) {
            addCriterion("topic58_fraction not between", value1, value2, "topic58Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic58SixIsNull() {
            addCriterion("topic58_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic58SixIsNotNull() {
            addCriterion("topic58_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic58SixEqualTo(String value) {
            addCriterion("topic58_six =", value, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic58SixNotEqualTo(String value) {
            addCriterion("topic58_six <>", value, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic58SixGreaterThan(String value) {
            addCriterion("topic58_six >", value, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic58SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic58_six >=", value, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic58SixLessThan(String value) {
            addCriterion("topic58_six <", value, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic58SixLessThanOrEqualTo(String value) {
            addCriterion("topic58_six <=", value, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic58SixLike(String value) {
            addCriterion("topic58_six like", value, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic58SixNotLike(String value) {
            addCriterion("topic58_six not like", value, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic58SixIn(List<String> values) {
            addCriterion("topic58_six in", values, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic58SixNotIn(List<String> values) {
            addCriterion("topic58_six not in", values, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic58SixBetween(String value1, String value2) {
            addCriterion("topic58_six between", value1, value2, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic58SixNotBetween(String value1, String value2) {
            addCriterion("topic58_six not between", value1, value2, "topic58Six");
            return (Criteria) this;
        }

        public Criteria andTopic59OneIsNull() {
            addCriterion("topic59_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic59OneIsNotNull() {
            addCriterion("topic59_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic59OneEqualTo(String value) {
            addCriterion("topic59_one =", value, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59OneNotEqualTo(String value) {
            addCriterion("topic59_one <>", value, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59OneGreaterThan(String value) {
            addCriterion("topic59_one >", value, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic59_one >=", value, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59OneLessThan(String value) {
            addCriterion("topic59_one <", value, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59OneLessThanOrEqualTo(String value) {
            addCriterion("topic59_one <=", value, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59OneLike(String value) {
            addCriterion("topic59_one like", value, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59OneNotLike(String value) {
            addCriterion("topic59_one not like", value, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59OneIn(List<String> values) {
            addCriterion("topic59_one in", values, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59OneNotIn(List<String> values) {
            addCriterion("topic59_one not in", values, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59OneBetween(String value1, String value2) {
            addCriterion("topic59_one between", value1, value2, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59OneNotBetween(String value1, String value2) {
            addCriterion("topic59_one not between", value1, value2, "topic59One");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoIsNull() {
            addCriterion("topic59_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoIsNotNull() {
            addCriterion("topic59_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoEqualTo(String value) {
            addCriterion("topic59_two =", value, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoNotEqualTo(String value) {
            addCriterion("topic59_two <>", value, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoGreaterThan(String value) {
            addCriterion("topic59_two >", value, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic59_two >=", value, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoLessThan(String value) {
            addCriterion("topic59_two <", value, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoLessThanOrEqualTo(String value) {
            addCriterion("topic59_two <=", value, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoLike(String value) {
            addCriterion("topic59_two like", value, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoNotLike(String value) {
            addCriterion("topic59_two not like", value, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoIn(List<String> values) {
            addCriterion("topic59_two in", values, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoNotIn(List<String> values) {
            addCriterion("topic59_two not in", values, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoBetween(String value1, String value2) {
            addCriterion("topic59_two between", value1, value2, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59TwoNotBetween(String value1, String value2) {
            addCriterion("topic59_two not between", value1, value2, "topic59Two");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeIsNull() {
            addCriterion("topic59_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeIsNotNull() {
            addCriterion("topic59_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeEqualTo(String value) {
            addCriterion("topic59_three =", value, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeNotEqualTo(String value) {
            addCriterion("topic59_three <>", value, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeGreaterThan(String value) {
            addCriterion("topic59_three >", value, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic59_three >=", value, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeLessThan(String value) {
            addCriterion("topic59_three <", value, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic59_three <=", value, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeLike(String value) {
            addCriterion("topic59_three like", value, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeNotLike(String value) {
            addCriterion("topic59_three not like", value, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeIn(List<String> values) {
            addCriterion("topic59_three in", values, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeNotIn(List<String> values) {
            addCriterion("topic59_three not in", values, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeBetween(String value1, String value2) {
            addCriterion("topic59_three between", value1, value2, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59ThreeNotBetween(String value1, String value2) {
            addCriterion("topic59_three not between", value1, value2, "topic59Three");
            return (Criteria) this;
        }

        public Criteria andTopic59FourIsNull() {
            addCriterion("topic59_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic59FourIsNotNull() {
            addCriterion("topic59_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic59FourEqualTo(String value) {
            addCriterion("topic59_four =", value, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FourNotEqualTo(String value) {
            addCriterion("topic59_four <>", value, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FourGreaterThan(String value) {
            addCriterion("topic59_four >", value, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic59_four >=", value, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FourLessThan(String value) {
            addCriterion("topic59_four <", value, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FourLessThanOrEqualTo(String value) {
            addCriterion("topic59_four <=", value, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FourLike(String value) {
            addCriterion("topic59_four like", value, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FourNotLike(String value) {
            addCriterion("topic59_four not like", value, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FourIn(List<String> values) {
            addCriterion("topic59_four in", values, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FourNotIn(List<String> values) {
            addCriterion("topic59_four not in", values, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FourBetween(String value1, String value2) {
            addCriterion("topic59_four between", value1, value2, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FourNotBetween(String value1, String value2) {
            addCriterion("topic59_four not between", value1, value2, "topic59Four");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionIsNull() {
            addCriterion("topic59_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionIsNotNull() {
            addCriterion("topic59_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionEqualTo(String value) {
            addCriterion("topic59_fraction =", value, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionNotEqualTo(String value) {
            addCriterion("topic59_fraction <>", value, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionGreaterThan(String value) {
            addCriterion("topic59_fraction >", value, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic59_fraction >=", value, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionLessThan(String value) {
            addCriterion("topic59_fraction <", value, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionLessThanOrEqualTo(String value) {
            addCriterion("topic59_fraction <=", value, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionLike(String value) {
            addCriterion("topic59_fraction like", value, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionNotLike(String value) {
            addCriterion("topic59_fraction not like", value, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionIn(List<String> values) {
            addCriterion("topic59_fraction in", values, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionNotIn(List<String> values) {
            addCriterion("topic59_fraction not in", values, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionBetween(String value1, String value2) {
            addCriterion("topic59_fraction between", value1, value2, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59FractionNotBetween(String value1, String value2) {
            addCriterion("topic59_fraction not between", value1, value2, "topic59Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic59SixIsNull() {
            addCriterion("topic59_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic59SixIsNotNull() {
            addCriterion("topic59_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic59SixEqualTo(String value) {
            addCriterion("topic59_six =", value, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic59SixNotEqualTo(String value) {
            addCriterion("topic59_six <>", value, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic59SixGreaterThan(String value) {
            addCriterion("topic59_six >", value, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic59SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic59_six >=", value, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic59SixLessThan(String value) {
            addCriterion("topic59_six <", value, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic59SixLessThanOrEqualTo(String value) {
            addCriterion("topic59_six <=", value, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic59SixLike(String value) {
            addCriterion("topic59_six like", value, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic59SixNotLike(String value) {
            addCriterion("topic59_six not like", value, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic59SixIn(List<String> values) {
            addCriterion("topic59_six in", values, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic59SixNotIn(List<String> values) {
            addCriterion("topic59_six not in", values, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic59SixBetween(String value1, String value2) {
            addCriterion("topic59_six between", value1, value2, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic59SixNotBetween(String value1, String value2) {
            addCriterion("topic59_six not between", value1, value2, "topic59Six");
            return (Criteria) this;
        }

        public Criteria andTopic60OneIsNull() {
            addCriterion("topic60_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic60OneIsNotNull() {
            addCriterion("topic60_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic60OneEqualTo(String value) {
            addCriterion("topic60_one =", value, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60OneNotEqualTo(String value) {
            addCriterion("topic60_one <>", value, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60OneGreaterThan(String value) {
            addCriterion("topic60_one >", value, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic60_one >=", value, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60OneLessThan(String value) {
            addCriterion("topic60_one <", value, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60OneLessThanOrEqualTo(String value) {
            addCriterion("topic60_one <=", value, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60OneLike(String value) {
            addCriterion("topic60_one like", value, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60OneNotLike(String value) {
            addCriterion("topic60_one not like", value, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60OneIn(List<String> values) {
            addCriterion("topic60_one in", values, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60OneNotIn(List<String> values) {
            addCriterion("topic60_one not in", values, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60OneBetween(String value1, String value2) {
            addCriterion("topic60_one between", value1, value2, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60OneNotBetween(String value1, String value2) {
            addCriterion("topic60_one not between", value1, value2, "topic60One");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoIsNull() {
            addCriterion("topic60_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoIsNotNull() {
            addCriterion("topic60_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoEqualTo(String value) {
            addCriterion("topic60_two =", value, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoNotEqualTo(String value) {
            addCriterion("topic60_two <>", value, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoGreaterThan(String value) {
            addCriterion("topic60_two >", value, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic60_two >=", value, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoLessThan(String value) {
            addCriterion("topic60_two <", value, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoLessThanOrEqualTo(String value) {
            addCriterion("topic60_two <=", value, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoLike(String value) {
            addCriterion("topic60_two like", value, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoNotLike(String value) {
            addCriterion("topic60_two not like", value, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoIn(List<String> values) {
            addCriterion("topic60_two in", values, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoNotIn(List<String> values) {
            addCriterion("topic60_two not in", values, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoBetween(String value1, String value2) {
            addCriterion("topic60_two between", value1, value2, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60TwoNotBetween(String value1, String value2) {
            addCriterion("topic60_two not between", value1, value2, "topic60Two");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeIsNull() {
            addCriterion("topic60_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeIsNotNull() {
            addCriterion("topic60_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeEqualTo(String value) {
            addCriterion("topic60_three =", value, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeNotEqualTo(String value) {
            addCriterion("topic60_three <>", value, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeGreaterThan(String value) {
            addCriterion("topic60_three >", value, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic60_three >=", value, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeLessThan(String value) {
            addCriterion("topic60_three <", value, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic60_three <=", value, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeLike(String value) {
            addCriterion("topic60_three like", value, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeNotLike(String value) {
            addCriterion("topic60_three not like", value, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeIn(List<String> values) {
            addCriterion("topic60_three in", values, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeNotIn(List<String> values) {
            addCriterion("topic60_three not in", values, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeBetween(String value1, String value2) {
            addCriterion("topic60_three between", value1, value2, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60ThreeNotBetween(String value1, String value2) {
            addCriterion("topic60_three not between", value1, value2, "topic60Three");
            return (Criteria) this;
        }

        public Criteria andTopic60FourIsNull() {
            addCriterion("topic60_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic60FourIsNotNull() {
            addCriterion("topic60_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic60FourEqualTo(String value) {
            addCriterion("topic60_four =", value, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FourNotEqualTo(String value) {
            addCriterion("topic60_four <>", value, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FourGreaterThan(String value) {
            addCriterion("topic60_four >", value, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic60_four >=", value, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FourLessThan(String value) {
            addCriterion("topic60_four <", value, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FourLessThanOrEqualTo(String value) {
            addCriterion("topic60_four <=", value, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FourLike(String value) {
            addCriterion("topic60_four like", value, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FourNotLike(String value) {
            addCriterion("topic60_four not like", value, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FourIn(List<String> values) {
            addCriterion("topic60_four in", values, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FourNotIn(List<String> values) {
            addCriterion("topic60_four not in", values, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FourBetween(String value1, String value2) {
            addCriterion("topic60_four between", value1, value2, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FourNotBetween(String value1, String value2) {
            addCriterion("topic60_four not between", value1, value2, "topic60Four");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionIsNull() {
            addCriterion("topic60_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionIsNotNull() {
            addCriterion("topic60_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionEqualTo(String value) {
            addCriterion("topic60_fraction =", value, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionNotEqualTo(String value) {
            addCriterion("topic60_fraction <>", value, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionGreaterThan(String value) {
            addCriterion("topic60_fraction >", value, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic60_fraction >=", value, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionLessThan(String value) {
            addCriterion("topic60_fraction <", value, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionLessThanOrEqualTo(String value) {
            addCriterion("topic60_fraction <=", value, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionLike(String value) {
            addCriterion("topic60_fraction like", value, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionNotLike(String value) {
            addCriterion("topic60_fraction not like", value, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionIn(List<String> values) {
            addCriterion("topic60_fraction in", values, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionNotIn(List<String> values) {
            addCriterion("topic60_fraction not in", values, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionBetween(String value1, String value2) {
            addCriterion("topic60_fraction between", value1, value2, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60FractionNotBetween(String value1, String value2) {
            addCriterion("topic60_fraction not between", value1, value2, "topic60Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic60SixIsNull() {
            addCriterion("topic60_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic60SixIsNotNull() {
            addCriterion("topic60_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic60SixEqualTo(String value) {
            addCriterion("topic60_six =", value, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic60SixNotEqualTo(String value) {
            addCriterion("topic60_six <>", value, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic60SixGreaterThan(String value) {
            addCriterion("topic60_six >", value, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic60SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic60_six >=", value, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic60SixLessThan(String value) {
            addCriterion("topic60_six <", value, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic60SixLessThanOrEqualTo(String value) {
            addCriterion("topic60_six <=", value, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic60SixLike(String value) {
            addCriterion("topic60_six like", value, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic60SixNotLike(String value) {
            addCriterion("topic60_six not like", value, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic60SixIn(List<String> values) {
            addCriterion("topic60_six in", values, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic60SixNotIn(List<String> values) {
            addCriterion("topic60_six not in", values, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic60SixBetween(String value1, String value2) {
            addCriterion("topic60_six between", value1, value2, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic60SixNotBetween(String value1, String value2) {
            addCriterion("topic60_six not between", value1, value2, "topic60Six");
            return (Criteria) this;
        }

        public Criteria andTopic61OneIsNull() {
            addCriterion("topic61_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic61OneIsNotNull() {
            addCriterion("topic61_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic61OneEqualTo(String value) {
            addCriterion("topic61_one =", value, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61OneNotEqualTo(String value) {
            addCriterion("topic61_one <>", value, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61OneGreaterThan(String value) {
            addCriterion("topic61_one >", value, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic61_one >=", value, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61OneLessThan(String value) {
            addCriterion("topic61_one <", value, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61OneLessThanOrEqualTo(String value) {
            addCriterion("topic61_one <=", value, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61OneLike(String value) {
            addCriterion("topic61_one like", value, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61OneNotLike(String value) {
            addCriterion("topic61_one not like", value, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61OneIn(List<String> values) {
            addCriterion("topic61_one in", values, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61OneNotIn(List<String> values) {
            addCriterion("topic61_one not in", values, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61OneBetween(String value1, String value2) {
            addCriterion("topic61_one between", value1, value2, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61OneNotBetween(String value1, String value2) {
            addCriterion("topic61_one not between", value1, value2, "topic61One");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoIsNull() {
            addCriterion("topic61_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoIsNotNull() {
            addCriterion("topic61_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoEqualTo(String value) {
            addCriterion("topic61_two =", value, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoNotEqualTo(String value) {
            addCriterion("topic61_two <>", value, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoGreaterThan(String value) {
            addCriterion("topic61_two >", value, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic61_two >=", value, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoLessThan(String value) {
            addCriterion("topic61_two <", value, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoLessThanOrEqualTo(String value) {
            addCriterion("topic61_two <=", value, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoLike(String value) {
            addCriterion("topic61_two like", value, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoNotLike(String value) {
            addCriterion("topic61_two not like", value, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoIn(List<String> values) {
            addCriterion("topic61_two in", values, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoNotIn(List<String> values) {
            addCriterion("topic61_two not in", values, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoBetween(String value1, String value2) {
            addCriterion("topic61_two between", value1, value2, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61TwoNotBetween(String value1, String value2) {
            addCriterion("topic61_two not between", value1, value2, "topic61Two");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeIsNull() {
            addCriterion("topic61_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeIsNotNull() {
            addCriterion("topic61_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeEqualTo(String value) {
            addCriterion("topic61_three =", value, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeNotEqualTo(String value) {
            addCriterion("topic61_three <>", value, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeGreaterThan(String value) {
            addCriterion("topic61_three >", value, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic61_three >=", value, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeLessThan(String value) {
            addCriterion("topic61_three <", value, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic61_three <=", value, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeLike(String value) {
            addCriterion("topic61_three like", value, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeNotLike(String value) {
            addCriterion("topic61_three not like", value, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeIn(List<String> values) {
            addCriterion("topic61_three in", values, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeNotIn(List<String> values) {
            addCriterion("topic61_three not in", values, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeBetween(String value1, String value2) {
            addCriterion("topic61_three between", value1, value2, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61ThreeNotBetween(String value1, String value2) {
            addCriterion("topic61_three not between", value1, value2, "topic61Three");
            return (Criteria) this;
        }

        public Criteria andTopic61FourIsNull() {
            addCriterion("topic61_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic61FourIsNotNull() {
            addCriterion("topic61_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic61FourEqualTo(String value) {
            addCriterion("topic61_four =", value, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FourNotEqualTo(String value) {
            addCriterion("topic61_four <>", value, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FourGreaterThan(String value) {
            addCriterion("topic61_four >", value, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic61_four >=", value, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FourLessThan(String value) {
            addCriterion("topic61_four <", value, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FourLessThanOrEqualTo(String value) {
            addCriterion("topic61_four <=", value, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FourLike(String value) {
            addCriterion("topic61_four like", value, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FourNotLike(String value) {
            addCriterion("topic61_four not like", value, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FourIn(List<String> values) {
            addCriterion("topic61_four in", values, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FourNotIn(List<String> values) {
            addCriterion("topic61_four not in", values, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FourBetween(String value1, String value2) {
            addCriterion("topic61_four between", value1, value2, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FourNotBetween(String value1, String value2) {
            addCriterion("topic61_four not between", value1, value2, "topic61Four");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionIsNull() {
            addCriterion("topic61_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionIsNotNull() {
            addCriterion("topic61_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionEqualTo(String value) {
            addCriterion("topic61_fraction =", value, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionNotEqualTo(String value) {
            addCriterion("topic61_fraction <>", value, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionGreaterThan(String value) {
            addCriterion("topic61_fraction >", value, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic61_fraction >=", value, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionLessThan(String value) {
            addCriterion("topic61_fraction <", value, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionLessThanOrEqualTo(String value) {
            addCriterion("topic61_fraction <=", value, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionLike(String value) {
            addCriterion("topic61_fraction like", value, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionNotLike(String value) {
            addCriterion("topic61_fraction not like", value, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionIn(List<String> values) {
            addCriterion("topic61_fraction in", values, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionNotIn(List<String> values) {
            addCriterion("topic61_fraction not in", values, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionBetween(String value1, String value2) {
            addCriterion("topic61_fraction between", value1, value2, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61FractionNotBetween(String value1, String value2) {
            addCriterion("topic61_fraction not between", value1, value2, "topic61Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic61SixIsNull() {
            addCriterion("topic61_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic61SixIsNotNull() {
            addCriterion("topic61_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic61SixEqualTo(String value) {
            addCriterion("topic61_six =", value, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic61SixNotEqualTo(String value) {
            addCriterion("topic61_six <>", value, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic61SixGreaterThan(String value) {
            addCriterion("topic61_six >", value, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic61SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic61_six >=", value, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic61SixLessThan(String value) {
            addCriterion("topic61_six <", value, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic61SixLessThanOrEqualTo(String value) {
            addCriterion("topic61_six <=", value, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic61SixLike(String value) {
            addCriterion("topic61_six like", value, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic61SixNotLike(String value) {
            addCriterion("topic61_six not like", value, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic61SixIn(List<String> values) {
            addCriterion("topic61_six in", values, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic61SixNotIn(List<String> values) {
            addCriterion("topic61_six not in", values, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic61SixBetween(String value1, String value2) {
            addCriterion("topic61_six between", value1, value2, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic61SixNotBetween(String value1, String value2) {
            addCriterion("topic61_six not between", value1, value2, "topic61Six");
            return (Criteria) this;
        }

        public Criteria andTopic62OneIsNull() {
            addCriterion("topic62_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic62OneIsNotNull() {
            addCriterion("topic62_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic62OneEqualTo(String value) {
            addCriterion("topic62_one =", value, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62OneNotEqualTo(String value) {
            addCriterion("topic62_one <>", value, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62OneGreaterThan(String value) {
            addCriterion("topic62_one >", value, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic62_one >=", value, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62OneLessThan(String value) {
            addCriterion("topic62_one <", value, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62OneLessThanOrEqualTo(String value) {
            addCriterion("topic62_one <=", value, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62OneLike(String value) {
            addCriterion("topic62_one like", value, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62OneNotLike(String value) {
            addCriterion("topic62_one not like", value, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62OneIn(List<String> values) {
            addCriterion("topic62_one in", values, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62OneNotIn(List<String> values) {
            addCriterion("topic62_one not in", values, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62OneBetween(String value1, String value2) {
            addCriterion("topic62_one between", value1, value2, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62OneNotBetween(String value1, String value2) {
            addCriterion("topic62_one not between", value1, value2, "topic62One");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoIsNull() {
            addCriterion("topic62_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoIsNotNull() {
            addCriterion("topic62_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoEqualTo(String value) {
            addCriterion("topic62_two =", value, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoNotEqualTo(String value) {
            addCriterion("topic62_two <>", value, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoGreaterThan(String value) {
            addCriterion("topic62_two >", value, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic62_two >=", value, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoLessThan(String value) {
            addCriterion("topic62_two <", value, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoLessThanOrEqualTo(String value) {
            addCriterion("topic62_two <=", value, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoLike(String value) {
            addCriterion("topic62_two like", value, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoNotLike(String value) {
            addCriterion("topic62_two not like", value, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoIn(List<String> values) {
            addCriterion("topic62_two in", values, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoNotIn(List<String> values) {
            addCriterion("topic62_two not in", values, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoBetween(String value1, String value2) {
            addCriterion("topic62_two between", value1, value2, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62TwoNotBetween(String value1, String value2) {
            addCriterion("topic62_two not between", value1, value2, "topic62Two");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeIsNull() {
            addCriterion("topic62_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeIsNotNull() {
            addCriterion("topic62_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeEqualTo(String value) {
            addCriterion("topic62_three =", value, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeNotEqualTo(String value) {
            addCriterion("topic62_three <>", value, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeGreaterThan(String value) {
            addCriterion("topic62_three >", value, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic62_three >=", value, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeLessThan(String value) {
            addCriterion("topic62_three <", value, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic62_three <=", value, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeLike(String value) {
            addCriterion("topic62_three like", value, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeNotLike(String value) {
            addCriterion("topic62_three not like", value, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeIn(List<String> values) {
            addCriterion("topic62_three in", values, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeNotIn(List<String> values) {
            addCriterion("topic62_three not in", values, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeBetween(String value1, String value2) {
            addCriterion("topic62_three between", value1, value2, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62ThreeNotBetween(String value1, String value2) {
            addCriterion("topic62_three not between", value1, value2, "topic62Three");
            return (Criteria) this;
        }

        public Criteria andTopic62FourIsNull() {
            addCriterion("topic62_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic62FourIsNotNull() {
            addCriterion("topic62_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic62FourEqualTo(String value) {
            addCriterion("topic62_four =", value, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FourNotEqualTo(String value) {
            addCriterion("topic62_four <>", value, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FourGreaterThan(String value) {
            addCriterion("topic62_four >", value, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic62_four >=", value, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FourLessThan(String value) {
            addCriterion("topic62_four <", value, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FourLessThanOrEqualTo(String value) {
            addCriterion("topic62_four <=", value, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FourLike(String value) {
            addCriterion("topic62_four like", value, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FourNotLike(String value) {
            addCriterion("topic62_four not like", value, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FourIn(List<String> values) {
            addCriterion("topic62_four in", values, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FourNotIn(List<String> values) {
            addCriterion("topic62_four not in", values, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FourBetween(String value1, String value2) {
            addCriterion("topic62_four between", value1, value2, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FourNotBetween(String value1, String value2) {
            addCriterion("topic62_four not between", value1, value2, "topic62Four");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionIsNull() {
            addCriterion("topic62_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionIsNotNull() {
            addCriterion("topic62_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionEqualTo(String value) {
            addCriterion("topic62_fraction =", value, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionNotEqualTo(String value) {
            addCriterion("topic62_fraction <>", value, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionGreaterThan(String value) {
            addCriterion("topic62_fraction >", value, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic62_fraction >=", value, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionLessThan(String value) {
            addCriterion("topic62_fraction <", value, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionLessThanOrEqualTo(String value) {
            addCriterion("topic62_fraction <=", value, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionLike(String value) {
            addCriterion("topic62_fraction like", value, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionNotLike(String value) {
            addCriterion("topic62_fraction not like", value, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionIn(List<String> values) {
            addCriterion("topic62_fraction in", values, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionNotIn(List<String> values) {
            addCriterion("topic62_fraction not in", values, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionBetween(String value1, String value2) {
            addCriterion("topic62_fraction between", value1, value2, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62FractionNotBetween(String value1, String value2) {
            addCriterion("topic62_fraction not between", value1, value2, "topic62Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic62SixIsNull() {
            addCriterion("topic62_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic62SixIsNotNull() {
            addCriterion("topic62_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic62SixEqualTo(String value) {
            addCriterion("topic62_six =", value, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic62SixNotEqualTo(String value) {
            addCriterion("topic62_six <>", value, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic62SixGreaterThan(String value) {
            addCriterion("topic62_six >", value, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic62SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic62_six >=", value, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic62SixLessThan(String value) {
            addCriterion("topic62_six <", value, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic62SixLessThanOrEqualTo(String value) {
            addCriterion("topic62_six <=", value, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic62SixLike(String value) {
            addCriterion("topic62_six like", value, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic62SixNotLike(String value) {
            addCriterion("topic62_six not like", value, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic62SixIn(List<String> values) {
            addCriterion("topic62_six in", values, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic62SixNotIn(List<String> values) {
            addCriterion("topic62_six not in", values, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic62SixBetween(String value1, String value2) {
            addCriterion("topic62_six between", value1, value2, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic62SixNotBetween(String value1, String value2) {
            addCriterion("topic62_six not between", value1, value2, "topic62Six");
            return (Criteria) this;
        }

        public Criteria andTopic63OneIsNull() {
            addCriterion("topic63_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic63OneIsNotNull() {
            addCriterion("topic63_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic63OneEqualTo(String value) {
            addCriterion("topic63_one =", value, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63OneNotEqualTo(String value) {
            addCriterion("topic63_one <>", value, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63OneGreaterThan(String value) {
            addCriterion("topic63_one >", value, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic63_one >=", value, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63OneLessThan(String value) {
            addCriterion("topic63_one <", value, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63OneLessThanOrEqualTo(String value) {
            addCriterion("topic63_one <=", value, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63OneLike(String value) {
            addCriterion("topic63_one like", value, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63OneNotLike(String value) {
            addCriterion("topic63_one not like", value, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63OneIn(List<String> values) {
            addCriterion("topic63_one in", values, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63OneNotIn(List<String> values) {
            addCriterion("topic63_one not in", values, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63OneBetween(String value1, String value2) {
            addCriterion("topic63_one between", value1, value2, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63OneNotBetween(String value1, String value2) {
            addCriterion("topic63_one not between", value1, value2, "topic63One");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoIsNull() {
            addCriterion("topic63_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoIsNotNull() {
            addCriterion("topic63_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoEqualTo(String value) {
            addCriterion("topic63_two =", value, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoNotEqualTo(String value) {
            addCriterion("topic63_two <>", value, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoGreaterThan(String value) {
            addCriterion("topic63_two >", value, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic63_two >=", value, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoLessThan(String value) {
            addCriterion("topic63_two <", value, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoLessThanOrEqualTo(String value) {
            addCriterion("topic63_two <=", value, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoLike(String value) {
            addCriterion("topic63_two like", value, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoNotLike(String value) {
            addCriterion("topic63_two not like", value, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoIn(List<String> values) {
            addCriterion("topic63_two in", values, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoNotIn(List<String> values) {
            addCriterion("topic63_two not in", values, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoBetween(String value1, String value2) {
            addCriterion("topic63_two between", value1, value2, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63TwoNotBetween(String value1, String value2) {
            addCriterion("topic63_two not between", value1, value2, "topic63Two");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeIsNull() {
            addCriterion("topic63_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeIsNotNull() {
            addCriterion("topic63_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeEqualTo(String value) {
            addCriterion("topic63_three =", value, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeNotEqualTo(String value) {
            addCriterion("topic63_three <>", value, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeGreaterThan(String value) {
            addCriterion("topic63_three >", value, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic63_three >=", value, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeLessThan(String value) {
            addCriterion("topic63_three <", value, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic63_three <=", value, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeLike(String value) {
            addCriterion("topic63_three like", value, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeNotLike(String value) {
            addCriterion("topic63_three not like", value, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeIn(List<String> values) {
            addCriterion("topic63_three in", values, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeNotIn(List<String> values) {
            addCriterion("topic63_three not in", values, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeBetween(String value1, String value2) {
            addCriterion("topic63_three between", value1, value2, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63ThreeNotBetween(String value1, String value2) {
            addCriterion("topic63_three not between", value1, value2, "topic63Three");
            return (Criteria) this;
        }

        public Criteria andTopic63FourIsNull() {
            addCriterion("topic63_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic63FourIsNotNull() {
            addCriterion("topic63_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic63FourEqualTo(String value) {
            addCriterion("topic63_four =", value, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FourNotEqualTo(String value) {
            addCriterion("topic63_four <>", value, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FourGreaterThan(String value) {
            addCriterion("topic63_four >", value, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic63_four >=", value, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FourLessThan(String value) {
            addCriterion("topic63_four <", value, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FourLessThanOrEqualTo(String value) {
            addCriterion("topic63_four <=", value, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FourLike(String value) {
            addCriterion("topic63_four like", value, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FourNotLike(String value) {
            addCriterion("topic63_four not like", value, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FourIn(List<String> values) {
            addCriterion("topic63_four in", values, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FourNotIn(List<String> values) {
            addCriterion("topic63_four not in", values, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FourBetween(String value1, String value2) {
            addCriterion("topic63_four between", value1, value2, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FourNotBetween(String value1, String value2) {
            addCriterion("topic63_four not between", value1, value2, "topic63Four");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionIsNull() {
            addCriterion("topic63_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionIsNotNull() {
            addCriterion("topic63_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionEqualTo(String value) {
            addCriterion("topic63_fraction =", value, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionNotEqualTo(String value) {
            addCriterion("topic63_fraction <>", value, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionGreaterThan(String value) {
            addCriterion("topic63_fraction >", value, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic63_fraction >=", value, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionLessThan(String value) {
            addCriterion("topic63_fraction <", value, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionLessThanOrEqualTo(String value) {
            addCriterion("topic63_fraction <=", value, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionLike(String value) {
            addCriterion("topic63_fraction like", value, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionNotLike(String value) {
            addCriterion("topic63_fraction not like", value, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionIn(List<String> values) {
            addCriterion("topic63_fraction in", values, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionNotIn(List<String> values) {
            addCriterion("topic63_fraction not in", values, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionBetween(String value1, String value2) {
            addCriterion("topic63_fraction between", value1, value2, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63FractionNotBetween(String value1, String value2) {
            addCriterion("topic63_fraction not between", value1, value2, "topic63Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic63SixIsNull() {
            addCriterion("topic63_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic63SixIsNotNull() {
            addCriterion("topic63_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic63SixEqualTo(String value) {
            addCriterion("topic63_six =", value, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic63SixNotEqualTo(String value) {
            addCriterion("topic63_six <>", value, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic63SixGreaterThan(String value) {
            addCriterion("topic63_six >", value, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic63SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic63_six >=", value, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic63SixLessThan(String value) {
            addCriterion("topic63_six <", value, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic63SixLessThanOrEqualTo(String value) {
            addCriterion("topic63_six <=", value, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic63SixLike(String value) {
            addCriterion("topic63_six like", value, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic63SixNotLike(String value) {
            addCriterion("topic63_six not like", value, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic63SixIn(List<String> values) {
            addCriterion("topic63_six in", values, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic63SixNotIn(List<String> values) {
            addCriterion("topic63_six not in", values, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic63SixBetween(String value1, String value2) {
            addCriterion("topic63_six between", value1, value2, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic63SixNotBetween(String value1, String value2) {
            addCriterion("topic63_six not between", value1, value2, "topic63Six");
            return (Criteria) this;
        }

        public Criteria andTopic64OneIsNull() {
            addCriterion("topic64_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic64OneIsNotNull() {
            addCriterion("topic64_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic64OneEqualTo(String value) {
            addCriterion("topic64_one =", value, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64OneNotEqualTo(String value) {
            addCriterion("topic64_one <>", value, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64OneGreaterThan(String value) {
            addCriterion("topic64_one >", value, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic64_one >=", value, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64OneLessThan(String value) {
            addCriterion("topic64_one <", value, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64OneLessThanOrEqualTo(String value) {
            addCriterion("topic64_one <=", value, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64OneLike(String value) {
            addCriterion("topic64_one like", value, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64OneNotLike(String value) {
            addCriterion("topic64_one not like", value, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64OneIn(List<String> values) {
            addCriterion("topic64_one in", values, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64OneNotIn(List<String> values) {
            addCriterion("topic64_one not in", values, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64OneBetween(String value1, String value2) {
            addCriterion("topic64_one between", value1, value2, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64OneNotBetween(String value1, String value2) {
            addCriterion("topic64_one not between", value1, value2, "topic64One");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoIsNull() {
            addCriterion("topic64_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoIsNotNull() {
            addCriterion("topic64_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoEqualTo(String value) {
            addCriterion("topic64_two =", value, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoNotEqualTo(String value) {
            addCriterion("topic64_two <>", value, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoGreaterThan(String value) {
            addCriterion("topic64_two >", value, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic64_two >=", value, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoLessThan(String value) {
            addCriterion("topic64_two <", value, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoLessThanOrEqualTo(String value) {
            addCriterion("topic64_two <=", value, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoLike(String value) {
            addCriterion("topic64_two like", value, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoNotLike(String value) {
            addCriterion("topic64_two not like", value, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoIn(List<String> values) {
            addCriterion("topic64_two in", values, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoNotIn(List<String> values) {
            addCriterion("topic64_two not in", values, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoBetween(String value1, String value2) {
            addCriterion("topic64_two between", value1, value2, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64TwoNotBetween(String value1, String value2) {
            addCriterion("topic64_two not between", value1, value2, "topic64Two");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeIsNull() {
            addCriterion("topic64_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeIsNotNull() {
            addCriterion("topic64_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeEqualTo(String value) {
            addCriterion("topic64_three =", value, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeNotEqualTo(String value) {
            addCriterion("topic64_three <>", value, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeGreaterThan(String value) {
            addCriterion("topic64_three >", value, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic64_three >=", value, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeLessThan(String value) {
            addCriterion("topic64_three <", value, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic64_three <=", value, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeLike(String value) {
            addCriterion("topic64_three like", value, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeNotLike(String value) {
            addCriterion("topic64_three not like", value, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeIn(List<String> values) {
            addCriterion("topic64_three in", values, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeNotIn(List<String> values) {
            addCriterion("topic64_three not in", values, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeBetween(String value1, String value2) {
            addCriterion("topic64_three between", value1, value2, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64ThreeNotBetween(String value1, String value2) {
            addCriterion("topic64_three not between", value1, value2, "topic64Three");
            return (Criteria) this;
        }

        public Criteria andTopic64FourIsNull() {
            addCriterion("topic64_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic64FourIsNotNull() {
            addCriterion("topic64_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic64FourEqualTo(String value) {
            addCriterion("topic64_four =", value, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FourNotEqualTo(String value) {
            addCriterion("topic64_four <>", value, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FourGreaterThan(String value) {
            addCriterion("topic64_four >", value, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic64_four >=", value, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FourLessThan(String value) {
            addCriterion("topic64_four <", value, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FourLessThanOrEqualTo(String value) {
            addCriterion("topic64_four <=", value, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FourLike(String value) {
            addCriterion("topic64_four like", value, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FourNotLike(String value) {
            addCriterion("topic64_four not like", value, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FourIn(List<String> values) {
            addCriterion("topic64_four in", values, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FourNotIn(List<String> values) {
            addCriterion("topic64_four not in", values, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FourBetween(String value1, String value2) {
            addCriterion("topic64_four between", value1, value2, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FourNotBetween(String value1, String value2) {
            addCriterion("topic64_four not between", value1, value2, "topic64Four");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionIsNull() {
            addCriterion("topic64_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionIsNotNull() {
            addCriterion("topic64_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionEqualTo(String value) {
            addCriterion("topic64_fraction =", value, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionNotEqualTo(String value) {
            addCriterion("topic64_fraction <>", value, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionGreaterThan(String value) {
            addCriterion("topic64_fraction >", value, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic64_fraction >=", value, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionLessThan(String value) {
            addCriterion("topic64_fraction <", value, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionLessThanOrEqualTo(String value) {
            addCriterion("topic64_fraction <=", value, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionLike(String value) {
            addCriterion("topic64_fraction like", value, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionNotLike(String value) {
            addCriterion("topic64_fraction not like", value, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionIn(List<String> values) {
            addCriterion("topic64_fraction in", values, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionNotIn(List<String> values) {
            addCriterion("topic64_fraction not in", values, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionBetween(String value1, String value2) {
            addCriterion("topic64_fraction between", value1, value2, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64FractionNotBetween(String value1, String value2) {
            addCriterion("topic64_fraction not between", value1, value2, "topic64Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic64SixIsNull() {
            addCriterion("topic64_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic64SixIsNotNull() {
            addCriterion("topic64_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic64SixEqualTo(String value) {
            addCriterion("topic64_six =", value, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic64SixNotEqualTo(String value) {
            addCriterion("topic64_six <>", value, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic64SixGreaterThan(String value) {
            addCriterion("topic64_six >", value, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic64SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic64_six >=", value, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic64SixLessThan(String value) {
            addCriterion("topic64_six <", value, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic64SixLessThanOrEqualTo(String value) {
            addCriterion("topic64_six <=", value, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic64SixLike(String value) {
            addCriterion("topic64_six like", value, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic64SixNotLike(String value) {
            addCriterion("topic64_six not like", value, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic64SixIn(List<String> values) {
            addCriterion("topic64_six in", values, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic64SixNotIn(List<String> values) {
            addCriterion("topic64_six not in", values, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic64SixBetween(String value1, String value2) {
            addCriterion("topic64_six between", value1, value2, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic64SixNotBetween(String value1, String value2) {
            addCriterion("topic64_six not between", value1, value2, "topic64Six");
            return (Criteria) this;
        }

        public Criteria andTopic65OneIsNull() {
            addCriterion("topic65_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic65OneIsNotNull() {
            addCriterion("topic65_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic65OneEqualTo(String value) {
            addCriterion("topic65_one =", value, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65OneNotEqualTo(String value) {
            addCriterion("topic65_one <>", value, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65OneGreaterThan(String value) {
            addCriterion("topic65_one >", value, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic65_one >=", value, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65OneLessThan(String value) {
            addCriterion("topic65_one <", value, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65OneLessThanOrEqualTo(String value) {
            addCriterion("topic65_one <=", value, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65OneLike(String value) {
            addCriterion("topic65_one like", value, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65OneNotLike(String value) {
            addCriterion("topic65_one not like", value, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65OneIn(List<String> values) {
            addCriterion("topic65_one in", values, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65OneNotIn(List<String> values) {
            addCriterion("topic65_one not in", values, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65OneBetween(String value1, String value2) {
            addCriterion("topic65_one between", value1, value2, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65OneNotBetween(String value1, String value2) {
            addCriterion("topic65_one not between", value1, value2, "topic65One");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoIsNull() {
            addCriterion("topic65_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoIsNotNull() {
            addCriterion("topic65_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoEqualTo(String value) {
            addCriterion("topic65_two =", value, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoNotEqualTo(String value) {
            addCriterion("topic65_two <>", value, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoGreaterThan(String value) {
            addCriterion("topic65_two >", value, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic65_two >=", value, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoLessThan(String value) {
            addCriterion("topic65_two <", value, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoLessThanOrEqualTo(String value) {
            addCriterion("topic65_two <=", value, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoLike(String value) {
            addCriterion("topic65_two like", value, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoNotLike(String value) {
            addCriterion("topic65_two not like", value, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoIn(List<String> values) {
            addCriterion("topic65_two in", values, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoNotIn(List<String> values) {
            addCriterion("topic65_two not in", values, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoBetween(String value1, String value2) {
            addCriterion("topic65_two between", value1, value2, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65TwoNotBetween(String value1, String value2) {
            addCriterion("topic65_two not between", value1, value2, "topic65Two");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeIsNull() {
            addCriterion("topic65_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeIsNotNull() {
            addCriterion("topic65_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeEqualTo(String value) {
            addCriterion("topic65_three =", value, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeNotEqualTo(String value) {
            addCriterion("topic65_three <>", value, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeGreaterThan(String value) {
            addCriterion("topic65_three >", value, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic65_three >=", value, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeLessThan(String value) {
            addCriterion("topic65_three <", value, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic65_three <=", value, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeLike(String value) {
            addCriterion("topic65_three like", value, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeNotLike(String value) {
            addCriterion("topic65_three not like", value, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeIn(List<String> values) {
            addCriterion("topic65_three in", values, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeNotIn(List<String> values) {
            addCriterion("topic65_three not in", values, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeBetween(String value1, String value2) {
            addCriterion("topic65_three between", value1, value2, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65ThreeNotBetween(String value1, String value2) {
            addCriterion("topic65_three not between", value1, value2, "topic65Three");
            return (Criteria) this;
        }

        public Criteria andTopic65FourIsNull() {
            addCriterion("topic65_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic65FourIsNotNull() {
            addCriterion("topic65_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic65FourEqualTo(String value) {
            addCriterion("topic65_four =", value, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FourNotEqualTo(String value) {
            addCriterion("topic65_four <>", value, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FourGreaterThan(String value) {
            addCriterion("topic65_four >", value, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic65_four >=", value, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FourLessThan(String value) {
            addCriterion("topic65_four <", value, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FourLessThanOrEqualTo(String value) {
            addCriterion("topic65_four <=", value, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FourLike(String value) {
            addCriterion("topic65_four like", value, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FourNotLike(String value) {
            addCriterion("topic65_four not like", value, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FourIn(List<String> values) {
            addCriterion("topic65_four in", values, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FourNotIn(List<String> values) {
            addCriterion("topic65_four not in", values, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FourBetween(String value1, String value2) {
            addCriterion("topic65_four between", value1, value2, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FourNotBetween(String value1, String value2) {
            addCriterion("topic65_four not between", value1, value2, "topic65Four");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionIsNull() {
            addCriterion("topic65_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionIsNotNull() {
            addCriterion("topic65_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionEqualTo(String value) {
            addCriterion("topic65_fraction =", value, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionNotEqualTo(String value) {
            addCriterion("topic65_fraction <>", value, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionGreaterThan(String value) {
            addCriterion("topic65_fraction >", value, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic65_fraction >=", value, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionLessThan(String value) {
            addCriterion("topic65_fraction <", value, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionLessThanOrEqualTo(String value) {
            addCriterion("topic65_fraction <=", value, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionLike(String value) {
            addCriterion("topic65_fraction like", value, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionNotLike(String value) {
            addCriterion("topic65_fraction not like", value, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionIn(List<String> values) {
            addCriterion("topic65_fraction in", values, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionNotIn(List<String> values) {
            addCriterion("topic65_fraction not in", values, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionBetween(String value1, String value2) {
            addCriterion("topic65_fraction between", value1, value2, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65FractionNotBetween(String value1, String value2) {
            addCriterion("topic65_fraction not between", value1, value2, "topic65Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic65SixIsNull() {
            addCriterion("topic65_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic65SixIsNotNull() {
            addCriterion("topic65_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic65SixEqualTo(String value) {
            addCriterion("topic65_six =", value, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic65SixNotEqualTo(String value) {
            addCriterion("topic65_six <>", value, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic65SixGreaterThan(String value) {
            addCriterion("topic65_six >", value, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic65SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic65_six >=", value, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic65SixLessThan(String value) {
            addCriterion("topic65_six <", value, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic65SixLessThanOrEqualTo(String value) {
            addCriterion("topic65_six <=", value, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic65SixLike(String value) {
            addCriterion("topic65_six like", value, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic65SixNotLike(String value) {
            addCriterion("topic65_six not like", value, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic65SixIn(List<String> values) {
            addCriterion("topic65_six in", values, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic65SixNotIn(List<String> values) {
            addCriterion("topic65_six not in", values, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic65SixBetween(String value1, String value2) {
            addCriterion("topic65_six between", value1, value2, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic65SixNotBetween(String value1, String value2) {
            addCriterion("topic65_six not between", value1, value2, "topic65Six");
            return (Criteria) this;
        }

        public Criteria andTopic66OneIsNull() {
            addCriterion("topic66_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic66OneIsNotNull() {
            addCriterion("topic66_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic66OneEqualTo(String value) {
            addCriterion("topic66_one =", value, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66OneNotEqualTo(String value) {
            addCriterion("topic66_one <>", value, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66OneGreaterThan(String value) {
            addCriterion("topic66_one >", value, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic66_one >=", value, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66OneLessThan(String value) {
            addCriterion("topic66_one <", value, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66OneLessThanOrEqualTo(String value) {
            addCriterion("topic66_one <=", value, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66OneLike(String value) {
            addCriterion("topic66_one like", value, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66OneNotLike(String value) {
            addCriterion("topic66_one not like", value, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66OneIn(List<String> values) {
            addCriterion("topic66_one in", values, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66OneNotIn(List<String> values) {
            addCriterion("topic66_one not in", values, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66OneBetween(String value1, String value2) {
            addCriterion("topic66_one between", value1, value2, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66OneNotBetween(String value1, String value2) {
            addCriterion("topic66_one not between", value1, value2, "topic66One");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoIsNull() {
            addCriterion("topic66_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoIsNotNull() {
            addCriterion("topic66_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoEqualTo(String value) {
            addCriterion("topic66_two =", value, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoNotEqualTo(String value) {
            addCriterion("topic66_two <>", value, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoGreaterThan(String value) {
            addCriterion("topic66_two >", value, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic66_two >=", value, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoLessThan(String value) {
            addCriterion("topic66_two <", value, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoLessThanOrEqualTo(String value) {
            addCriterion("topic66_two <=", value, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoLike(String value) {
            addCriterion("topic66_two like", value, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoNotLike(String value) {
            addCriterion("topic66_two not like", value, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoIn(List<String> values) {
            addCriterion("topic66_two in", values, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoNotIn(List<String> values) {
            addCriterion("topic66_two not in", values, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoBetween(String value1, String value2) {
            addCriterion("topic66_two between", value1, value2, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66TwoNotBetween(String value1, String value2) {
            addCriterion("topic66_two not between", value1, value2, "topic66Two");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeIsNull() {
            addCriterion("topic66_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeIsNotNull() {
            addCriterion("topic66_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeEqualTo(String value) {
            addCriterion("topic66_three =", value, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeNotEqualTo(String value) {
            addCriterion("topic66_three <>", value, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeGreaterThan(String value) {
            addCriterion("topic66_three >", value, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic66_three >=", value, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeLessThan(String value) {
            addCriterion("topic66_three <", value, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic66_three <=", value, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeLike(String value) {
            addCriterion("topic66_three like", value, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeNotLike(String value) {
            addCriterion("topic66_three not like", value, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeIn(List<String> values) {
            addCriterion("topic66_three in", values, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeNotIn(List<String> values) {
            addCriterion("topic66_three not in", values, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeBetween(String value1, String value2) {
            addCriterion("topic66_three between", value1, value2, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66ThreeNotBetween(String value1, String value2) {
            addCriterion("topic66_three not between", value1, value2, "topic66Three");
            return (Criteria) this;
        }

        public Criteria andTopic66FourIsNull() {
            addCriterion("topic66_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic66FourIsNotNull() {
            addCriterion("topic66_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic66FourEqualTo(String value) {
            addCriterion("topic66_four =", value, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FourNotEqualTo(String value) {
            addCriterion("topic66_four <>", value, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FourGreaterThan(String value) {
            addCriterion("topic66_four >", value, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic66_four >=", value, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FourLessThan(String value) {
            addCriterion("topic66_four <", value, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FourLessThanOrEqualTo(String value) {
            addCriterion("topic66_four <=", value, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FourLike(String value) {
            addCriterion("topic66_four like", value, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FourNotLike(String value) {
            addCriterion("topic66_four not like", value, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FourIn(List<String> values) {
            addCriterion("topic66_four in", values, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FourNotIn(List<String> values) {
            addCriterion("topic66_four not in", values, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FourBetween(String value1, String value2) {
            addCriterion("topic66_four between", value1, value2, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FourNotBetween(String value1, String value2) {
            addCriterion("topic66_four not between", value1, value2, "topic66Four");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionIsNull() {
            addCriterion("topic66_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionIsNotNull() {
            addCriterion("topic66_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionEqualTo(String value) {
            addCriterion("topic66_fraction =", value, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionNotEqualTo(String value) {
            addCriterion("topic66_fraction <>", value, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionGreaterThan(String value) {
            addCriterion("topic66_fraction >", value, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic66_fraction >=", value, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionLessThan(String value) {
            addCriterion("topic66_fraction <", value, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionLessThanOrEqualTo(String value) {
            addCriterion("topic66_fraction <=", value, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionLike(String value) {
            addCriterion("topic66_fraction like", value, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionNotLike(String value) {
            addCriterion("topic66_fraction not like", value, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionIn(List<String> values) {
            addCriterion("topic66_fraction in", values, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionNotIn(List<String> values) {
            addCriterion("topic66_fraction not in", values, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionBetween(String value1, String value2) {
            addCriterion("topic66_fraction between", value1, value2, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66FractionNotBetween(String value1, String value2) {
            addCriterion("topic66_fraction not between", value1, value2, "topic66Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic66SixIsNull() {
            addCriterion("topic66_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic66SixIsNotNull() {
            addCriterion("topic66_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic66SixEqualTo(String value) {
            addCriterion("topic66_six =", value, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic66SixNotEqualTo(String value) {
            addCriterion("topic66_six <>", value, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic66SixGreaterThan(String value) {
            addCriterion("topic66_six >", value, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic66SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic66_six >=", value, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic66SixLessThan(String value) {
            addCriterion("topic66_six <", value, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic66SixLessThanOrEqualTo(String value) {
            addCriterion("topic66_six <=", value, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic66SixLike(String value) {
            addCriterion("topic66_six like", value, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic66SixNotLike(String value) {
            addCriterion("topic66_six not like", value, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic66SixIn(List<String> values) {
            addCriterion("topic66_six in", values, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic66SixNotIn(List<String> values) {
            addCriterion("topic66_six not in", values, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic66SixBetween(String value1, String value2) {
            addCriterion("topic66_six between", value1, value2, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic66SixNotBetween(String value1, String value2) {
            addCriterion("topic66_six not between", value1, value2, "topic66Six");
            return (Criteria) this;
        }

        public Criteria andTopic67OneIsNull() {
            addCriterion("topic67_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic67OneIsNotNull() {
            addCriterion("topic67_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic67OneEqualTo(String value) {
            addCriterion("topic67_one =", value, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67OneNotEqualTo(String value) {
            addCriterion("topic67_one <>", value, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67OneGreaterThan(String value) {
            addCriterion("topic67_one >", value, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic67_one >=", value, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67OneLessThan(String value) {
            addCriterion("topic67_one <", value, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67OneLessThanOrEqualTo(String value) {
            addCriterion("topic67_one <=", value, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67OneLike(String value) {
            addCriterion("topic67_one like", value, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67OneNotLike(String value) {
            addCriterion("topic67_one not like", value, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67OneIn(List<String> values) {
            addCriterion("topic67_one in", values, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67OneNotIn(List<String> values) {
            addCriterion("topic67_one not in", values, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67OneBetween(String value1, String value2) {
            addCriterion("topic67_one between", value1, value2, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67OneNotBetween(String value1, String value2) {
            addCriterion("topic67_one not between", value1, value2, "topic67One");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoIsNull() {
            addCriterion("topic67_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoIsNotNull() {
            addCriterion("topic67_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoEqualTo(String value) {
            addCriterion("topic67_two =", value, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoNotEqualTo(String value) {
            addCriterion("topic67_two <>", value, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoGreaterThan(String value) {
            addCriterion("topic67_two >", value, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic67_two >=", value, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoLessThan(String value) {
            addCriterion("topic67_two <", value, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoLessThanOrEqualTo(String value) {
            addCriterion("topic67_two <=", value, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoLike(String value) {
            addCriterion("topic67_two like", value, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoNotLike(String value) {
            addCriterion("topic67_two not like", value, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoIn(List<String> values) {
            addCriterion("topic67_two in", values, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoNotIn(List<String> values) {
            addCriterion("topic67_two not in", values, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoBetween(String value1, String value2) {
            addCriterion("topic67_two between", value1, value2, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67TwoNotBetween(String value1, String value2) {
            addCriterion("topic67_two not between", value1, value2, "topic67Two");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeIsNull() {
            addCriterion("topic67_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeIsNotNull() {
            addCriterion("topic67_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeEqualTo(String value) {
            addCriterion("topic67_three =", value, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeNotEqualTo(String value) {
            addCriterion("topic67_three <>", value, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeGreaterThan(String value) {
            addCriterion("topic67_three >", value, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic67_three >=", value, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeLessThan(String value) {
            addCriterion("topic67_three <", value, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic67_three <=", value, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeLike(String value) {
            addCriterion("topic67_three like", value, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeNotLike(String value) {
            addCriterion("topic67_three not like", value, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeIn(List<String> values) {
            addCriterion("topic67_three in", values, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeNotIn(List<String> values) {
            addCriterion("topic67_three not in", values, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeBetween(String value1, String value2) {
            addCriterion("topic67_three between", value1, value2, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67ThreeNotBetween(String value1, String value2) {
            addCriterion("topic67_three not between", value1, value2, "topic67Three");
            return (Criteria) this;
        }

        public Criteria andTopic67FourIsNull() {
            addCriterion("topic67_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic67FourIsNotNull() {
            addCriterion("topic67_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic67FourEqualTo(String value) {
            addCriterion("topic67_four =", value, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FourNotEqualTo(String value) {
            addCriterion("topic67_four <>", value, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FourGreaterThan(String value) {
            addCriterion("topic67_four >", value, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic67_four >=", value, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FourLessThan(String value) {
            addCriterion("topic67_four <", value, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FourLessThanOrEqualTo(String value) {
            addCriterion("topic67_four <=", value, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FourLike(String value) {
            addCriterion("topic67_four like", value, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FourNotLike(String value) {
            addCriterion("topic67_four not like", value, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FourIn(List<String> values) {
            addCriterion("topic67_four in", values, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FourNotIn(List<String> values) {
            addCriterion("topic67_four not in", values, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FourBetween(String value1, String value2) {
            addCriterion("topic67_four between", value1, value2, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FourNotBetween(String value1, String value2) {
            addCriterion("topic67_four not between", value1, value2, "topic67Four");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionIsNull() {
            addCriterion("topic67_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionIsNotNull() {
            addCriterion("topic67_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionEqualTo(String value) {
            addCriterion("topic67_fraction =", value, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionNotEqualTo(String value) {
            addCriterion("topic67_fraction <>", value, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionGreaterThan(String value) {
            addCriterion("topic67_fraction >", value, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic67_fraction >=", value, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionLessThan(String value) {
            addCriterion("topic67_fraction <", value, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionLessThanOrEqualTo(String value) {
            addCriterion("topic67_fraction <=", value, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionLike(String value) {
            addCriterion("topic67_fraction like", value, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionNotLike(String value) {
            addCriterion("topic67_fraction not like", value, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionIn(List<String> values) {
            addCriterion("topic67_fraction in", values, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionNotIn(List<String> values) {
            addCriterion("topic67_fraction not in", values, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionBetween(String value1, String value2) {
            addCriterion("topic67_fraction between", value1, value2, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67FractionNotBetween(String value1, String value2) {
            addCriterion("topic67_fraction not between", value1, value2, "topic67Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic67SixIsNull() {
            addCriterion("topic67_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic67SixIsNotNull() {
            addCriterion("topic67_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic67SixEqualTo(String value) {
            addCriterion("topic67_six =", value, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic67SixNotEqualTo(String value) {
            addCriterion("topic67_six <>", value, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic67SixGreaterThan(String value) {
            addCriterion("topic67_six >", value, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic67SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic67_six >=", value, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic67SixLessThan(String value) {
            addCriterion("topic67_six <", value, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic67SixLessThanOrEqualTo(String value) {
            addCriterion("topic67_six <=", value, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic67SixLike(String value) {
            addCriterion("topic67_six like", value, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic67SixNotLike(String value) {
            addCriterion("topic67_six not like", value, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic67SixIn(List<String> values) {
            addCriterion("topic67_six in", values, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic67SixNotIn(List<String> values) {
            addCriterion("topic67_six not in", values, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic67SixBetween(String value1, String value2) {
            addCriterion("topic67_six between", value1, value2, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic67SixNotBetween(String value1, String value2) {
            addCriterion("topic67_six not between", value1, value2, "topic67Six");
            return (Criteria) this;
        }

        public Criteria andTopic68OneIsNull() {
            addCriterion("topic68_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic68OneIsNotNull() {
            addCriterion("topic68_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic68OneEqualTo(String value) {
            addCriterion("topic68_one =", value, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68OneNotEqualTo(String value) {
            addCriterion("topic68_one <>", value, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68OneGreaterThan(String value) {
            addCriterion("topic68_one >", value, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic68_one >=", value, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68OneLessThan(String value) {
            addCriterion("topic68_one <", value, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68OneLessThanOrEqualTo(String value) {
            addCriterion("topic68_one <=", value, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68OneLike(String value) {
            addCriterion("topic68_one like", value, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68OneNotLike(String value) {
            addCriterion("topic68_one not like", value, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68OneIn(List<String> values) {
            addCriterion("topic68_one in", values, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68OneNotIn(List<String> values) {
            addCriterion("topic68_one not in", values, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68OneBetween(String value1, String value2) {
            addCriterion("topic68_one between", value1, value2, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68OneNotBetween(String value1, String value2) {
            addCriterion("topic68_one not between", value1, value2, "topic68One");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoIsNull() {
            addCriterion("topic68_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoIsNotNull() {
            addCriterion("topic68_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoEqualTo(String value) {
            addCriterion("topic68_two =", value, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoNotEqualTo(String value) {
            addCriterion("topic68_two <>", value, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoGreaterThan(String value) {
            addCriterion("topic68_two >", value, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic68_two >=", value, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoLessThan(String value) {
            addCriterion("topic68_two <", value, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoLessThanOrEqualTo(String value) {
            addCriterion("topic68_two <=", value, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoLike(String value) {
            addCriterion("topic68_two like", value, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoNotLike(String value) {
            addCriterion("topic68_two not like", value, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoIn(List<String> values) {
            addCriterion("topic68_two in", values, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoNotIn(List<String> values) {
            addCriterion("topic68_two not in", values, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoBetween(String value1, String value2) {
            addCriterion("topic68_two between", value1, value2, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68TwoNotBetween(String value1, String value2) {
            addCriterion("topic68_two not between", value1, value2, "topic68Two");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeIsNull() {
            addCriterion("topic68_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeIsNotNull() {
            addCriterion("topic68_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeEqualTo(String value) {
            addCriterion("topic68_three =", value, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeNotEqualTo(String value) {
            addCriterion("topic68_three <>", value, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeGreaterThan(String value) {
            addCriterion("topic68_three >", value, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic68_three >=", value, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeLessThan(String value) {
            addCriterion("topic68_three <", value, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic68_three <=", value, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeLike(String value) {
            addCriterion("topic68_three like", value, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeNotLike(String value) {
            addCriterion("topic68_three not like", value, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeIn(List<String> values) {
            addCriterion("topic68_three in", values, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeNotIn(List<String> values) {
            addCriterion("topic68_three not in", values, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeBetween(String value1, String value2) {
            addCriterion("topic68_three between", value1, value2, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68ThreeNotBetween(String value1, String value2) {
            addCriterion("topic68_three not between", value1, value2, "topic68Three");
            return (Criteria) this;
        }

        public Criteria andTopic68FourIsNull() {
            addCriterion("topic68_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic68FourIsNotNull() {
            addCriterion("topic68_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic68FourEqualTo(String value) {
            addCriterion("topic68_four =", value, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FourNotEqualTo(String value) {
            addCriterion("topic68_four <>", value, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FourGreaterThan(String value) {
            addCriterion("topic68_four >", value, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic68_four >=", value, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FourLessThan(String value) {
            addCriterion("topic68_four <", value, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FourLessThanOrEqualTo(String value) {
            addCriterion("topic68_four <=", value, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FourLike(String value) {
            addCriterion("topic68_four like", value, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FourNotLike(String value) {
            addCriterion("topic68_four not like", value, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FourIn(List<String> values) {
            addCriterion("topic68_four in", values, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FourNotIn(List<String> values) {
            addCriterion("topic68_four not in", values, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FourBetween(String value1, String value2) {
            addCriterion("topic68_four between", value1, value2, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FourNotBetween(String value1, String value2) {
            addCriterion("topic68_four not between", value1, value2, "topic68Four");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionIsNull() {
            addCriterion("topic68_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionIsNotNull() {
            addCriterion("topic68_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionEqualTo(String value) {
            addCriterion("topic68_fraction =", value, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionNotEqualTo(String value) {
            addCriterion("topic68_fraction <>", value, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionGreaterThan(String value) {
            addCriterion("topic68_fraction >", value, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic68_fraction >=", value, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionLessThan(String value) {
            addCriterion("topic68_fraction <", value, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionLessThanOrEqualTo(String value) {
            addCriterion("topic68_fraction <=", value, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionLike(String value) {
            addCriterion("topic68_fraction like", value, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionNotLike(String value) {
            addCriterion("topic68_fraction not like", value, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionIn(List<String> values) {
            addCriterion("topic68_fraction in", values, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionNotIn(List<String> values) {
            addCriterion("topic68_fraction not in", values, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionBetween(String value1, String value2) {
            addCriterion("topic68_fraction between", value1, value2, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68FractionNotBetween(String value1, String value2) {
            addCriterion("topic68_fraction not between", value1, value2, "topic68Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic68SixIsNull() {
            addCriterion("topic68_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic68SixIsNotNull() {
            addCriterion("topic68_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic68SixEqualTo(String value) {
            addCriterion("topic68_six =", value, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic68SixNotEqualTo(String value) {
            addCriterion("topic68_six <>", value, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic68SixGreaterThan(String value) {
            addCriterion("topic68_six >", value, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic68SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic68_six >=", value, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic68SixLessThan(String value) {
            addCriterion("topic68_six <", value, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic68SixLessThanOrEqualTo(String value) {
            addCriterion("topic68_six <=", value, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic68SixLike(String value) {
            addCriterion("topic68_six like", value, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic68SixNotLike(String value) {
            addCriterion("topic68_six not like", value, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic68SixIn(List<String> values) {
            addCriterion("topic68_six in", values, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic68SixNotIn(List<String> values) {
            addCriterion("topic68_six not in", values, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic68SixBetween(String value1, String value2) {
            addCriterion("topic68_six between", value1, value2, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic68SixNotBetween(String value1, String value2) {
            addCriterion("topic68_six not between", value1, value2, "topic68Six");
            return (Criteria) this;
        }

        public Criteria andTopic69OneIsNull() {
            addCriterion("topic69_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic69OneIsNotNull() {
            addCriterion("topic69_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic69OneEqualTo(String value) {
            addCriterion("topic69_one =", value, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69OneNotEqualTo(String value) {
            addCriterion("topic69_one <>", value, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69OneGreaterThan(String value) {
            addCriterion("topic69_one >", value, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic69_one >=", value, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69OneLessThan(String value) {
            addCriterion("topic69_one <", value, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69OneLessThanOrEqualTo(String value) {
            addCriterion("topic69_one <=", value, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69OneLike(String value) {
            addCriterion("topic69_one like", value, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69OneNotLike(String value) {
            addCriterion("topic69_one not like", value, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69OneIn(List<String> values) {
            addCriterion("topic69_one in", values, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69OneNotIn(List<String> values) {
            addCriterion("topic69_one not in", values, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69OneBetween(String value1, String value2) {
            addCriterion("topic69_one between", value1, value2, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69OneNotBetween(String value1, String value2) {
            addCriterion("topic69_one not between", value1, value2, "topic69One");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoIsNull() {
            addCriterion("topic69_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoIsNotNull() {
            addCriterion("topic69_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoEqualTo(String value) {
            addCriterion("topic69_two =", value, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoNotEqualTo(String value) {
            addCriterion("topic69_two <>", value, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoGreaterThan(String value) {
            addCriterion("topic69_two >", value, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic69_two >=", value, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoLessThan(String value) {
            addCriterion("topic69_two <", value, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoLessThanOrEqualTo(String value) {
            addCriterion("topic69_two <=", value, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoLike(String value) {
            addCriterion("topic69_two like", value, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoNotLike(String value) {
            addCriterion("topic69_two not like", value, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoIn(List<String> values) {
            addCriterion("topic69_two in", values, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoNotIn(List<String> values) {
            addCriterion("topic69_two not in", values, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoBetween(String value1, String value2) {
            addCriterion("topic69_two between", value1, value2, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69TwoNotBetween(String value1, String value2) {
            addCriterion("topic69_two not between", value1, value2, "topic69Two");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeIsNull() {
            addCriterion("topic69_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeIsNotNull() {
            addCriterion("topic69_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeEqualTo(String value) {
            addCriterion("topic69_three =", value, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeNotEqualTo(String value) {
            addCriterion("topic69_three <>", value, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeGreaterThan(String value) {
            addCriterion("topic69_three >", value, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic69_three >=", value, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeLessThan(String value) {
            addCriterion("topic69_three <", value, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic69_three <=", value, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeLike(String value) {
            addCriterion("topic69_three like", value, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeNotLike(String value) {
            addCriterion("topic69_three not like", value, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeIn(List<String> values) {
            addCriterion("topic69_three in", values, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeNotIn(List<String> values) {
            addCriterion("topic69_three not in", values, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeBetween(String value1, String value2) {
            addCriterion("topic69_three between", value1, value2, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69ThreeNotBetween(String value1, String value2) {
            addCriterion("topic69_three not between", value1, value2, "topic69Three");
            return (Criteria) this;
        }

        public Criteria andTopic69FourIsNull() {
            addCriterion("topic69_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic69FourIsNotNull() {
            addCriterion("topic69_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic69FourEqualTo(String value) {
            addCriterion("topic69_four =", value, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FourNotEqualTo(String value) {
            addCriterion("topic69_four <>", value, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FourGreaterThan(String value) {
            addCriterion("topic69_four >", value, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic69_four >=", value, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FourLessThan(String value) {
            addCriterion("topic69_four <", value, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FourLessThanOrEqualTo(String value) {
            addCriterion("topic69_four <=", value, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FourLike(String value) {
            addCriterion("topic69_four like", value, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FourNotLike(String value) {
            addCriterion("topic69_four not like", value, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FourIn(List<String> values) {
            addCriterion("topic69_four in", values, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FourNotIn(List<String> values) {
            addCriterion("topic69_four not in", values, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FourBetween(String value1, String value2) {
            addCriterion("topic69_four between", value1, value2, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FourNotBetween(String value1, String value2) {
            addCriterion("topic69_four not between", value1, value2, "topic69Four");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionIsNull() {
            addCriterion("topic69_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionIsNotNull() {
            addCriterion("topic69_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionEqualTo(String value) {
            addCriterion("topic69_fraction =", value, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionNotEqualTo(String value) {
            addCriterion("topic69_fraction <>", value, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionGreaterThan(String value) {
            addCriterion("topic69_fraction >", value, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic69_fraction >=", value, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionLessThan(String value) {
            addCriterion("topic69_fraction <", value, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionLessThanOrEqualTo(String value) {
            addCriterion("topic69_fraction <=", value, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionLike(String value) {
            addCriterion("topic69_fraction like", value, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionNotLike(String value) {
            addCriterion("topic69_fraction not like", value, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionIn(List<String> values) {
            addCriterion("topic69_fraction in", values, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionNotIn(List<String> values) {
            addCriterion("topic69_fraction not in", values, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionBetween(String value1, String value2) {
            addCriterion("topic69_fraction between", value1, value2, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69FractionNotBetween(String value1, String value2) {
            addCriterion("topic69_fraction not between", value1, value2, "topic69Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic69SixIsNull() {
            addCriterion("topic69_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic69SixIsNotNull() {
            addCriterion("topic69_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic69SixEqualTo(String value) {
            addCriterion("topic69_six =", value, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic69SixNotEqualTo(String value) {
            addCriterion("topic69_six <>", value, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic69SixGreaterThan(String value) {
            addCriterion("topic69_six >", value, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic69SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic69_six >=", value, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic69SixLessThan(String value) {
            addCriterion("topic69_six <", value, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic69SixLessThanOrEqualTo(String value) {
            addCriterion("topic69_six <=", value, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic69SixLike(String value) {
            addCriterion("topic69_six like", value, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic69SixNotLike(String value) {
            addCriterion("topic69_six not like", value, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic69SixIn(List<String> values) {
            addCriterion("topic69_six in", values, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic69SixNotIn(List<String> values) {
            addCriterion("topic69_six not in", values, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic69SixBetween(String value1, String value2) {
            addCriterion("topic69_six between", value1, value2, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic69SixNotBetween(String value1, String value2) {
            addCriterion("topic69_six not between", value1, value2, "topic69Six");
            return (Criteria) this;
        }

        public Criteria andTopic70OneIsNull() {
            addCriterion("topic70_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic70OneIsNotNull() {
            addCriterion("topic70_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic70OneEqualTo(String value) {
            addCriterion("topic70_one =", value, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70OneNotEqualTo(String value) {
            addCriterion("topic70_one <>", value, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70OneGreaterThan(String value) {
            addCriterion("topic70_one >", value, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic70_one >=", value, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70OneLessThan(String value) {
            addCriterion("topic70_one <", value, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70OneLessThanOrEqualTo(String value) {
            addCriterion("topic70_one <=", value, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70OneLike(String value) {
            addCriterion("topic70_one like", value, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70OneNotLike(String value) {
            addCriterion("topic70_one not like", value, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70OneIn(List<String> values) {
            addCriterion("topic70_one in", values, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70OneNotIn(List<String> values) {
            addCriterion("topic70_one not in", values, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70OneBetween(String value1, String value2) {
            addCriterion("topic70_one between", value1, value2, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70OneNotBetween(String value1, String value2) {
            addCriterion("topic70_one not between", value1, value2, "topic70One");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoIsNull() {
            addCriterion("topic70_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoIsNotNull() {
            addCriterion("topic70_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoEqualTo(String value) {
            addCriterion("topic70_two =", value, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoNotEqualTo(String value) {
            addCriterion("topic70_two <>", value, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoGreaterThan(String value) {
            addCriterion("topic70_two >", value, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic70_two >=", value, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoLessThan(String value) {
            addCriterion("topic70_two <", value, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoLessThanOrEqualTo(String value) {
            addCriterion("topic70_two <=", value, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoLike(String value) {
            addCriterion("topic70_two like", value, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoNotLike(String value) {
            addCriterion("topic70_two not like", value, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoIn(List<String> values) {
            addCriterion("topic70_two in", values, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoNotIn(List<String> values) {
            addCriterion("topic70_two not in", values, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoBetween(String value1, String value2) {
            addCriterion("topic70_two between", value1, value2, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70TwoNotBetween(String value1, String value2) {
            addCriterion("topic70_two not between", value1, value2, "topic70Two");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeIsNull() {
            addCriterion("topic70_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeIsNotNull() {
            addCriterion("topic70_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeEqualTo(String value) {
            addCriterion("topic70_three =", value, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeNotEqualTo(String value) {
            addCriterion("topic70_three <>", value, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeGreaterThan(String value) {
            addCriterion("topic70_three >", value, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic70_three >=", value, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeLessThan(String value) {
            addCriterion("topic70_three <", value, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic70_three <=", value, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeLike(String value) {
            addCriterion("topic70_three like", value, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeNotLike(String value) {
            addCriterion("topic70_three not like", value, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeIn(List<String> values) {
            addCriterion("topic70_three in", values, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeNotIn(List<String> values) {
            addCriterion("topic70_three not in", values, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeBetween(String value1, String value2) {
            addCriterion("topic70_three between", value1, value2, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70ThreeNotBetween(String value1, String value2) {
            addCriterion("topic70_three not between", value1, value2, "topic70Three");
            return (Criteria) this;
        }

        public Criteria andTopic70FourIsNull() {
            addCriterion("topic70_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic70FourIsNotNull() {
            addCriterion("topic70_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic70FourEqualTo(String value) {
            addCriterion("topic70_four =", value, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FourNotEqualTo(String value) {
            addCriterion("topic70_four <>", value, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FourGreaterThan(String value) {
            addCriterion("topic70_four >", value, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic70_four >=", value, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FourLessThan(String value) {
            addCriterion("topic70_four <", value, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FourLessThanOrEqualTo(String value) {
            addCriterion("topic70_four <=", value, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FourLike(String value) {
            addCriterion("topic70_four like", value, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FourNotLike(String value) {
            addCriterion("topic70_four not like", value, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FourIn(List<String> values) {
            addCriterion("topic70_four in", values, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FourNotIn(List<String> values) {
            addCriterion("topic70_four not in", values, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FourBetween(String value1, String value2) {
            addCriterion("topic70_four between", value1, value2, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FourNotBetween(String value1, String value2) {
            addCriterion("topic70_four not between", value1, value2, "topic70Four");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionIsNull() {
            addCriterion("topic70_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionIsNotNull() {
            addCriterion("topic70_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionEqualTo(String value) {
            addCriterion("topic70_fraction =", value, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionNotEqualTo(String value) {
            addCriterion("topic70_fraction <>", value, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionGreaterThan(String value) {
            addCriterion("topic70_fraction >", value, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic70_fraction >=", value, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionLessThan(String value) {
            addCriterion("topic70_fraction <", value, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionLessThanOrEqualTo(String value) {
            addCriterion("topic70_fraction <=", value, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionLike(String value) {
            addCriterion("topic70_fraction like", value, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionNotLike(String value) {
            addCriterion("topic70_fraction not like", value, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionIn(List<String> values) {
            addCriterion("topic70_fraction in", values, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionNotIn(List<String> values) {
            addCriterion("topic70_fraction not in", values, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionBetween(String value1, String value2) {
            addCriterion("topic70_fraction between", value1, value2, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70FractionNotBetween(String value1, String value2) {
            addCriterion("topic70_fraction not between", value1, value2, "topic70Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic70SixIsNull() {
            addCriterion("topic70_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic70SixIsNotNull() {
            addCriterion("topic70_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic70SixEqualTo(String value) {
            addCriterion("topic70_six =", value, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic70SixNotEqualTo(String value) {
            addCriterion("topic70_six <>", value, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic70SixGreaterThan(String value) {
            addCriterion("topic70_six >", value, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic70SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic70_six >=", value, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic70SixLessThan(String value) {
            addCriterion("topic70_six <", value, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic70SixLessThanOrEqualTo(String value) {
            addCriterion("topic70_six <=", value, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic70SixLike(String value) {
            addCriterion("topic70_six like", value, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic70SixNotLike(String value) {
            addCriterion("topic70_six not like", value, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic70SixIn(List<String> values) {
            addCriterion("topic70_six in", values, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic70SixNotIn(List<String> values) {
            addCriterion("topic70_six not in", values, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic70SixBetween(String value1, String value2) {
            addCriterion("topic70_six between", value1, value2, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic70SixNotBetween(String value1, String value2) {
            addCriterion("topic70_six not between", value1, value2, "topic70Six");
            return (Criteria) this;
        }

        public Criteria andTopic71OneIsNull() {
            addCriterion("topic71_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic71OneIsNotNull() {
            addCriterion("topic71_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic71OneEqualTo(String value) {
            addCriterion("topic71_one =", value, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71OneNotEqualTo(String value) {
            addCriterion("topic71_one <>", value, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71OneGreaterThan(String value) {
            addCriterion("topic71_one >", value, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic71_one >=", value, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71OneLessThan(String value) {
            addCriterion("topic71_one <", value, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71OneLessThanOrEqualTo(String value) {
            addCriterion("topic71_one <=", value, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71OneLike(String value) {
            addCriterion("topic71_one like", value, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71OneNotLike(String value) {
            addCriterion("topic71_one not like", value, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71OneIn(List<String> values) {
            addCriterion("topic71_one in", values, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71OneNotIn(List<String> values) {
            addCriterion("topic71_one not in", values, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71OneBetween(String value1, String value2) {
            addCriterion("topic71_one between", value1, value2, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71OneNotBetween(String value1, String value2) {
            addCriterion("topic71_one not between", value1, value2, "topic71One");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoIsNull() {
            addCriterion("topic71_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoIsNotNull() {
            addCriterion("topic71_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoEqualTo(String value) {
            addCriterion("topic71_two =", value, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoNotEqualTo(String value) {
            addCriterion("topic71_two <>", value, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoGreaterThan(String value) {
            addCriterion("topic71_two >", value, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic71_two >=", value, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoLessThan(String value) {
            addCriterion("topic71_two <", value, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoLessThanOrEqualTo(String value) {
            addCriterion("topic71_two <=", value, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoLike(String value) {
            addCriterion("topic71_two like", value, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoNotLike(String value) {
            addCriterion("topic71_two not like", value, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoIn(List<String> values) {
            addCriterion("topic71_two in", values, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoNotIn(List<String> values) {
            addCriterion("topic71_two not in", values, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoBetween(String value1, String value2) {
            addCriterion("topic71_two between", value1, value2, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71TwoNotBetween(String value1, String value2) {
            addCriterion("topic71_two not between", value1, value2, "topic71Two");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeIsNull() {
            addCriterion("topic71_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeIsNotNull() {
            addCriterion("topic71_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeEqualTo(String value) {
            addCriterion("topic71_three =", value, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeNotEqualTo(String value) {
            addCriterion("topic71_three <>", value, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeGreaterThan(String value) {
            addCriterion("topic71_three >", value, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic71_three >=", value, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeLessThan(String value) {
            addCriterion("topic71_three <", value, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic71_three <=", value, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeLike(String value) {
            addCriterion("topic71_three like", value, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeNotLike(String value) {
            addCriterion("topic71_three not like", value, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeIn(List<String> values) {
            addCriterion("topic71_three in", values, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeNotIn(List<String> values) {
            addCriterion("topic71_three not in", values, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeBetween(String value1, String value2) {
            addCriterion("topic71_three between", value1, value2, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71ThreeNotBetween(String value1, String value2) {
            addCriterion("topic71_three not between", value1, value2, "topic71Three");
            return (Criteria) this;
        }

        public Criteria andTopic71FourIsNull() {
            addCriterion("topic71_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic71FourIsNotNull() {
            addCriterion("topic71_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic71FourEqualTo(String value) {
            addCriterion("topic71_four =", value, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FourNotEqualTo(String value) {
            addCriterion("topic71_four <>", value, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FourGreaterThan(String value) {
            addCriterion("topic71_four >", value, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic71_four >=", value, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FourLessThan(String value) {
            addCriterion("topic71_four <", value, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FourLessThanOrEqualTo(String value) {
            addCriterion("topic71_four <=", value, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FourLike(String value) {
            addCriterion("topic71_four like", value, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FourNotLike(String value) {
            addCriterion("topic71_four not like", value, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FourIn(List<String> values) {
            addCriterion("topic71_four in", values, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FourNotIn(List<String> values) {
            addCriterion("topic71_four not in", values, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FourBetween(String value1, String value2) {
            addCriterion("topic71_four between", value1, value2, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FourNotBetween(String value1, String value2) {
            addCriterion("topic71_four not between", value1, value2, "topic71Four");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionIsNull() {
            addCriterion("topic71_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionIsNotNull() {
            addCriterion("topic71_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionEqualTo(String value) {
            addCriterion("topic71_fraction =", value, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionNotEqualTo(String value) {
            addCriterion("topic71_fraction <>", value, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionGreaterThan(String value) {
            addCriterion("topic71_fraction >", value, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic71_fraction >=", value, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionLessThan(String value) {
            addCriterion("topic71_fraction <", value, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionLessThanOrEqualTo(String value) {
            addCriterion("topic71_fraction <=", value, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionLike(String value) {
            addCriterion("topic71_fraction like", value, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionNotLike(String value) {
            addCriterion("topic71_fraction not like", value, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionIn(List<String> values) {
            addCriterion("topic71_fraction in", values, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionNotIn(List<String> values) {
            addCriterion("topic71_fraction not in", values, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionBetween(String value1, String value2) {
            addCriterion("topic71_fraction between", value1, value2, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71FractionNotBetween(String value1, String value2) {
            addCriterion("topic71_fraction not between", value1, value2, "topic71Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic71SixIsNull() {
            addCriterion("topic71_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic71SixIsNotNull() {
            addCriterion("topic71_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic71SixEqualTo(String value) {
            addCriterion("topic71_six =", value, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic71SixNotEqualTo(String value) {
            addCriterion("topic71_six <>", value, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic71SixGreaterThan(String value) {
            addCriterion("topic71_six >", value, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic71SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic71_six >=", value, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic71SixLessThan(String value) {
            addCriterion("topic71_six <", value, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic71SixLessThanOrEqualTo(String value) {
            addCriterion("topic71_six <=", value, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic71SixLike(String value) {
            addCriterion("topic71_six like", value, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic71SixNotLike(String value) {
            addCriterion("topic71_six not like", value, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic71SixIn(List<String> values) {
            addCriterion("topic71_six in", values, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic71SixNotIn(List<String> values) {
            addCriterion("topic71_six not in", values, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic71SixBetween(String value1, String value2) {
            addCriterion("topic71_six between", value1, value2, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic71SixNotBetween(String value1, String value2) {
            addCriterion("topic71_six not between", value1, value2, "topic71Six");
            return (Criteria) this;
        }

        public Criteria andTopic72OneIsNull() {
            addCriterion("topic72_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic72OneIsNotNull() {
            addCriterion("topic72_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic72OneEqualTo(String value) {
            addCriterion("topic72_one =", value, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72OneNotEqualTo(String value) {
            addCriterion("topic72_one <>", value, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72OneGreaterThan(String value) {
            addCriterion("topic72_one >", value, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic72_one >=", value, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72OneLessThan(String value) {
            addCriterion("topic72_one <", value, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72OneLessThanOrEqualTo(String value) {
            addCriterion("topic72_one <=", value, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72OneLike(String value) {
            addCriterion("topic72_one like", value, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72OneNotLike(String value) {
            addCriterion("topic72_one not like", value, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72OneIn(List<String> values) {
            addCriterion("topic72_one in", values, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72OneNotIn(List<String> values) {
            addCriterion("topic72_one not in", values, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72OneBetween(String value1, String value2) {
            addCriterion("topic72_one between", value1, value2, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72OneNotBetween(String value1, String value2) {
            addCriterion("topic72_one not between", value1, value2, "topic72One");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoIsNull() {
            addCriterion("topic72_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoIsNotNull() {
            addCriterion("topic72_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoEqualTo(String value) {
            addCriterion("topic72_two =", value, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoNotEqualTo(String value) {
            addCriterion("topic72_two <>", value, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoGreaterThan(String value) {
            addCriterion("topic72_two >", value, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic72_two >=", value, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoLessThan(String value) {
            addCriterion("topic72_two <", value, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoLessThanOrEqualTo(String value) {
            addCriterion("topic72_two <=", value, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoLike(String value) {
            addCriterion("topic72_two like", value, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoNotLike(String value) {
            addCriterion("topic72_two not like", value, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoIn(List<String> values) {
            addCriterion("topic72_two in", values, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoNotIn(List<String> values) {
            addCriterion("topic72_two not in", values, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoBetween(String value1, String value2) {
            addCriterion("topic72_two between", value1, value2, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72TwoNotBetween(String value1, String value2) {
            addCriterion("topic72_two not between", value1, value2, "topic72Two");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeIsNull() {
            addCriterion("topic72_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeIsNotNull() {
            addCriterion("topic72_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeEqualTo(String value) {
            addCriterion("topic72_three =", value, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeNotEqualTo(String value) {
            addCriterion("topic72_three <>", value, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeGreaterThan(String value) {
            addCriterion("topic72_three >", value, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic72_three >=", value, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeLessThan(String value) {
            addCriterion("topic72_three <", value, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic72_three <=", value, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeLike(String value) {
            addCriterion("topic72_three like", value, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeNotLike(String value) {
            addCriterion("topic72_three not like", value, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeIn(List<String> values) {
            addCriterion("topic72_three in", values, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeNotIn(List<String> values) {
            addCriterion("topic72_three not in", values, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeBetween(String value1, String value2) {
            addCriterion("topic72_three between", value1, value2, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72ThreeNotBetween(String value1, String value2) {
            addCriterion("topic72_three not between", value1, value2, "topic72Three");
            return (Criteria) this;
        }

        public Criteria andTopic72FourIsNull() {
            addCriterion("topic72_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic72FourIsNotNull() {
            addCriterion("topic72_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic72FourEqualTo(String value) {
            addCriterion("topic72_four =", value, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FourNotEqualTo(String value) {
            addCriterion("topic72_four <>", value, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FourGreaterThan(String value) {
            addCriterion("topic72_four >", value, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic72_four >=", value, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FourLessThan(String value) {
            addCriterion("topic72_four <", value, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FourLessThanOrEqualTo(String value) {
            addCriterion("topic72_four <=", value, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FourLike(String value) {
            addCriterion("topic72_four like", value, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FourNotLike(String value) {
            addCriterion("topic72_four not like", value, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FourIn(List<String> values) {
            addCriterion("topic72_four in", values, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FourNotIn(List<String> values) {
            addCriterion("topic72_four not in", values, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FourBetween(String value1, String value2) {
            addCriterion("topic72_four between", value1, value2, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FourNotBetween(String value1, String value2) {
            addCriterion("topic72_four not between", value1, value2, "topic72Four");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionIsNull() {
            addCriterion("topic72_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionIsNotNull() {
            addCriterion("topic72_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionEqualTo(String value) {
            addCriterion("topic72_fraction =", value, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionNotEqualTo(String value) {
            addCriterion("topic72_fraction <>", value, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionGreaterThan(String value) {
            addCriterion("topic72_fraction >", value, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic72_fraction >=", value, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionLessThan(String value) {
            addCriterion("topic72_fraction <", value, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionLessThanOrEqualTo(String value) {
            addCriterion("topic72_fraction <=", value, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionLike(String value) {
            addCriterion("topic72_fraction like", value, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionNotLike(String value) {
            addCriterion("topic72_fraction not like", value, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionIn(List<String> values) {
            addCriterion("topic72_fraction in", values, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionNotIn(List<String> values) {
            addCriterion("topic72_fraction not in", values, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionBetween(String value1, String value2) {
            addCriterion("topic72_fraction between", value1, value2, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72FractionNotBetween(String value1, String value2) {
            addCriterion("topic72_fraction not between", value1, value2, "topic72Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic72SixIsNull() {
            addCriterion("topic72_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic72SixIsNotNull() {
            addCriterion("topic72_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic72SixEqualTo(String value) {
            addCriterion("topic72_six =", value, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic72SixNotEqualTo(String value) {
            addCriterion("topic72_six <>", value, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic72SixGreaterThan(String value) {
            addCriterion("topic72_six >", value, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic72SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic72_six >=", value, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic72SixLessThan(String value) {
            addCriterion("topic72_six <", value, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic72SixLessThanOrEqualTo(String value) {
            addCriterion("topic72_six <=", value, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic72SixLike(String value) {
            addCriterion("topic72_six like", value, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic72SixNotLike(String value) {
            addCriterion("topic72_six not like", value, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic72SixIn(List<String> values) {
            addCriterion("topic72_six in", values, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic72SixNotIn(List<String> values) {
            addCriterion("topic72_six not in", values, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic72SixBetween(String value1, String value2) {
            addCriterion("topic72_six between", value1, value2, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic72SixNotBetween(String value1, String value2) {
            addCriterion("topic72_six not between", value1, value2, "topic72Six");
            return (Criteria) this;
        }

        public Criteria andTopic73OneIsNull() {
            addCriterion("topic73_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic73OneIsNotNull() {
            addCriterion("topic73_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic73OneEqualTo(String value) {
            addCriterion("topic73_one =", value, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73OneNotEqualTo(String value) {
            addCriterion("topic73_one <>", value, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73OneGreaterThan(String value) {
            addCriterion("topic73_one >", value, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic73_one >=", value, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73OneLessThan(String value) {
            addCriterion("topic73_one <", value, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73OneLessThanOrEqualTo(String value) {
            addCriterion("topic73_one <=", value, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73OneLike(String value) {
            addCriterion("topic73_one like", value, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73OneNotLike(String value) {
            addCriterion("topic73_one not like", value, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73OneIn(List<String> values) {
            addCriterion("topic73_one in", values, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73OneNotIn(List<String> values) {
            addCriterion("topic73_one not in", values, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73OneBetween(String value1, String value2) {
            addCriterion("topic73_one between", value1, value2, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73OneNotBetween(String value1, String value2) {
            addCriterion("topic73_one not between", value1, value2, "topic73One");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoIsNull() {
            addCriterion("topic73_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoIsNotNull() {
            addCriterion("topic73_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoEqualTo(String value) {
            addCriterion("topic73_two =", value, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoNotEqualTo(String value) {
            addCriterion("topic73_two <>", value, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoGreaterThan(String value) {
            addCriterion("topic73_two >", value, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic73_two >=", value, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoLessThan(String value) {
            addCriterion("topic73_two <", value, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoLessThanOrEqualTo(String value) {
            addCriterion("topic73_two <=", value, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoLike(String value) {
            addCriterion("topic73_two like", value, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoNotLike(String value) {
            addCriterion("topic73_two not like", value, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoIn(List<String> values) {
            addCriterion("topic73_two in", values, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoNotIn(List<String> values) {
            addCriterion("topic73_two not in", values, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoBetween(String value1, String value2) {
            addCriterion("topic73_two between", value1, value2, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73TwoNotBetween(String value1, String value2) {
            addCriterion("topic73_two not between", value1, value2, "topic73Two");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeIsNull() {
            addCriterion("topic73_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeIsNotNull() {
            addCriterion("topic73_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeEqualTo(String value) {
            addCriterion("topic73_three =", value, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeNotEqualTo(String value) {
            addCriterion("topic73_three <>", value, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeGreaterThan(String value) {
            addCriterion("topic73_three >", value, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic73_three >=", value, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeLessThan(String value) {
            addCriterion("topic73_three <", value, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic73_three <=", value, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeLike(String value) {
            addCriterion("topic73_three like", value, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeNotLike(String value) {
            addCriterion("topic73_three not like", value, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeIn(List<String> values) {
            addCriterion("topic73_three in", values, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeNotIn(List<String> values) {
            addCriterion("topic73_three not in", values, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeBetween(String value1, String value2) {
            addCriterion("topic73_three between", value1, value2, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73ThreeNotBetween(String value1, String value2) {
            addCriterion("topic73_three not between", value1, value2, "topic73Three");
            return (Criteria) this;
        }

        public Criteria andTopic73FourIsNull() {
            addCriterion("topic73_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic73FourIsNotNull() {
            addCriterion("topic73_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic73FourEqualTo(String value) {
            addCriterion("topic73_four =", value, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FourNotEqualTo(String value) {
            addCriterion("topic73_four <>", value, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FourGreaterThan(String value) {
            addCriterion("topic73_four >", value, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic73_four >=", value, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FourLessThan(String value) {
            addCriterion("topic73_four <", value, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FourLessThanOrEqualTo(String value) {
            addCriterion("topic73_four <=", value, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FourLike(String value) {
            addCriterion("topic73_four like", value, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FourNotLike(String value) {
            addCriterion("topic73_four not like", value, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FourIn(List<String> values) {
            addCriterion("topic73_four in", values, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FourNotIn(List<String> values) {
            addCriterion("topic73_four not in", values, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FourBetween(String value1, String value2) {
            addCriterion("topic73_four between", value1, value2, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FourNotBetween(String value1, String value2) {
            addCriterion("topic73_four not between", value1, value2, "topic73Four");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionIsNull() {
            addCriterion("topic73_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionIsNotNull() {
            addCriterion("topic73_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionEqualTo(String value) {
            addCriterion("topic73_fraction =", value, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionNotEqualTo(String value) {
            addCriterion("topic73_fraction <>", value, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionGreaterThan(String value) {
            addCriterion("topic73_fraction >", value, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic73_fraction >=", value, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionLessThan(String value) {
            addCriterion("topic73_fraction <", value, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionLessThanOrEqualTo(String value) {
            addCriterion("topic73_fraction <=", value, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionLike(String value) {
            addCriterion("topic73_fraction like", value, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionNotLike(String value) {
            addCriterion("topic73_fraction not like", value, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionIn(List<String> values) {
            addCriterion("topic73_fraction in", values, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionNotIn(List<String> values) {
            addCriterion("topic73_fraction not in", values, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionBetween(String value1, String value2) {
            addCriterion("topic73_fraction between", value1, value2, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73FractionNotBetween(String value1, String value2) {
            addCriterion("topic73_fraction not between", value1, value2, "topic73Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic73SixIsNull() {
            addCriterion("topic73_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic73SixIsNotNull() {
            addCriterion("topic73_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic73SixEqualTo(String value) {
            addCriterion("topic73_six =", value, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic73SixNotEqualTo(String value) {
            addCriterion("topic73_six <>", value, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic73SixGreaterThan(String value) {
            addCriterion("topic73_six >", value, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic73SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic73_six >=", value, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic73SixLessThan(String value) {
            addCriterion("topic73_six <", value, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic73SixLessThanOrEqualTo(String value) {
            addCriterion("topic73_six <=", value, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic73SixLike(String value) {
            addCriterion("topic73_six like", value, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic73SixNotLike(String value) {
            addCriterion("topic73_six not like", value, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic73SixIn(List<String> values) {
            addCriterion("topic73_six in", values, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic73SixNotIn(List<String> values) {
            addCriterion("topic73_six not in", values, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic73SixBetween(String value1, String value2) {
            addCriterion("topic73_six between", value1, value2, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic73SixNotBetween(String value1, String value2) {
            addCriterion("topic73_six not between", value1, value2, "topic73Six");
            return (Criteria) this;
        }

        public Criteria andTopic74OneIsNull() {
            addCriterion("topic74_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic74OneIsNotNull() {
            addCriterion("topic74_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic74OneEqualTo(String value) {
            addCriterion("topic74_one =", value, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74OneNotEqualTo(String value) {
            addCriterion("topic74_one <>", value, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74OneGreaterThan(String value) {
            addCriterion("topic74_one >", value, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic74_one >=", value, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74OneLessThan(String value) {
            addCriterion("topic74_one <", value, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74OneLessThanOrEqualTo(String value) {
            addCriterion("topic74_one <=", value, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74OneLike(String value) {
            addCriterion("topic74_one like", value, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74OneNotLike(String value) {
            addCriterion("topic74_one not like", value, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74OneIn(List<String> values) {
            addCriterion("topic74_one in", values, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74OneNotIn(List<String> values) {
            addCriterion("topic74_one not in", values, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74OneBetween(String value1, String value2) {
            addCriterion("topic74_one between", value1, value2, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74OneNotBetween(String value1, String value2) {
            addCriterion("topic74_one not between", value1, value2, "topic74One");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoIsNull() {
            addCriterion("topic74_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoIsNotNull() {
            addCriterion("topic74_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoEqualTo(String value) {
            addCriterion("topic74_two =", value, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoNotEqualTo(String value) {
            addCriterion("topic74_two <>", value, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoGreaterThan(String value) {
            addCriterion("topic74_two >", value, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic74_two >=", value, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoLessThan(String value) {
            addCriterion("topic74_two <", value, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoLessThanOrEqualTo(String value) {
            addCriterion("topic74_two <=", value, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoLike(String value) {
            addCriterion("topic74_two like", value, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoNotLike(String value) {
            addCriterion("topic74_two not like", value, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoIn(List<String> values) {
            addCriterion("topic74_two in", values, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoNotIn(List<String> values) {
            addCriterion("topic74_two not in", values, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoBetween(String value1, String value2) {
            addCriterion("topic74_two between", value1, value2, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74TwoNotBetween(String value1, String value2) {
            addCriterion("topic74_two not between", value1, value2, "topic74Two");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeIsNull() {
            addCriterion("topic74_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeIsNotNull() {
            addCriterion("topic74_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeEqualTo(String value) {
            addCriterion("topic74_three =", value, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeNotEqualTo(String value) {
            addCriterion("topic74_three <>", value, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeGreaterThan(String value) {
            addCriterion("topic74_three >", value, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic74_three >=", value, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeLessThan(String value) {
            addCriterion("topic74_three <", value, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic74_three <=", value, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeLike(String value) {
            addCriterion("topic74_three like", value, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeNotLike(String value) {
            addCriterion("topic74_three not like", value, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeIn(List<String> values) {
            addCriterion("topic74_three in", values, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeNotIn(List<String> values) {
            addCriterion("topic74_three not in", values, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeBetween(String value1, String value2) {
            addCriterion("topic74_three between", value1, value2, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74ThreeNotBetween(String value1, String value2) {
            addCriterion("topic74_three not between", value1, value2, "topic74Three");
            return (Criteria) this;
        }

        public Criteria andTopic74FourIsNull() {
            addCriterion("topic74_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic74FourIsNotNull() {
            addCriterion("topic74_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic74FourEqualTo(String value) {
            addCriterion("topic74_four =", value, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FourNotEqualTo(String value) {
            addCriterion("topic74_four <>", value, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FourGreaterThan(String value) {
            addCriterion("topic74_four >", value, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic74_four >=", value, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FourLessThan(String value) {
            addCriterion("topic74_four <", value, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FourLessThanOrEqualTo(String value) {
            addCriterion("topic74_four <=", value, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FourLike(String value) {
            addCriterion("topic74_four like", value, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FourNotLike(String value) {
            addCriterion("topic74_four not like", value, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FourIn(List<String> values) {
            addCriterion("topic74_four in", values, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FourNotIn(List<String> values) {
            addCriterion("topic74_four not in", values, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FourBetween(String value1, String value2) {
            addCriterion("topic74_four between", value1, value2, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FourNotBetween(String value1, String value2) {
            addCriterion("topic74_four not between", value1, value2, "topic74Four");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionIsNull() {
            addCriterion("topic74_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionIsNotNull() {
            addCriterion("topic74_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionEqualTo(String value) {
            addCriterion("topic74_fraction =", value, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionNotEqualTo(String value) {
            addCriterion("topic74_fraction <>", value, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionGreaterThan(String value) {
            addCriterion("topic74_fraction >", value, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic74_fraction >=", value, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionLessThan(String value) {
            addCriterion("topic74_fraction <", value, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionLessThanOrEqualTo(String value) {
            addCriterion("topic74_fraction <=", value, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionLike(String value) {
            addCriterion("topic74_fraction like", value, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionNotLike(String value) {
            addCriterion("topic74_fraction not like", value, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionIn(List<String> values) {
            addCriterion("topic74_fraction in", values, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionNotIn(List<String> values) {
            addCriterion("topic74_fraction not in", values, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionBetween(String value1, String value2) {
            addCriterion("topic74_fraction between", value1, value2, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74FractionNotBetween(String value1, String value2) {
            addCriterion("topic74_fraction not between", value1, value2, "topic74Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic74SixIsNull() {
            addCriterion("topic74_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic74SixIsNotNull() {
            addCriterion("topic74_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic74SixEqualTo(String value) {
            addCriterion("topic74_six =", value, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic74SixNotEqualTo(String value) {
            addCriterion("topic74_six <>", value, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic74SixGreaterThan(String value) {
            addCriterion("topic74_six >", value, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic74SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic74_six >=", value, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic74SixLessThan(String value) {
            addCriterion("topic74_six <", value, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic74SixLessThanOrEqualTo(String value) {
            addCriterion("topic74_six <=", value, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic74SixLike(String value) {
            addCriterion("topic74_six like", value, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic74SixNotLike(String value) {
            addCriterion("topic74_six not like", value, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic74SixIn(List<String> values) {
            addCriterion("topic74_six in", values, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic74SixNotIn(List<String> values) {
            addCriterion("topic74_six not in", values, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic74SixBetween(String value1, String value2) {
            addCriterion("topic74_six between", value1, value2, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic74SixNotBetween(String value1, String value2) {
            addCriterion("topic74_six not between", value1, value2, "topic74Six");
            return (Criteria) this;
        }

        public Criteria andTopic75OneIsNull() {
            addCriterion("topic75_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic75OneIsNotNull() {
            addCriterion("topic75_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic75OneEqualTo(String value) {
            addCriterion("topic75_one =", value, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75OneNotEqualTo(String value) {
            addCriterion("topic75_one <>", value, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75OneGreaterThan(String value) {
            addCriterion("topic75_one >", value, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic75_one >=", value, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75OneLessThan(String value) {
            addCriterion("topic75_one <", value, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75OneLessThanOrEqualTo(String value) {
            addCriterion("topic75_one <=", value, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75OneLike(String value) {
            addCriterion("topic75_one like", value, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75OneNotLike(String value) {
            addCriterion("topic75_one not like", value, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75OneIn(List<String> values) {
            addCriterion("topic75_one in", values, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75OneNotIn(List<String> values) {
            addCriterion("topic75_one not in", values, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75OneBetween(String value1, String value2) {
            addCriterion("topic75_one between", value1, value2, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75OneNotBetween(String value1, String value2) {
            addCriterion("topic75_one not between", value1, value2, "topic75One");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoIsNull() {
            addCriterion("topic75_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoIsNotNull() {
            addCriterion("topic75_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoEqualTo(String value) {
            addCriterion("topic75_two =", value, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoNotEqualTo(String value) {
            addCriterion("topic75_two <>", value, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoGreaterThan(String value) {
            addCriterion("topic75_two >", value, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic75_two >=", value, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoLessThan(String value) {
            addCriterion("topic75_two <", value, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoLessThanOrEqualTo(String value) {
            addCriterion("topic75_two <=", value, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoLike(String value) {
            addCriterion("topic75_two like", value, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoNotLike(String value) {
            addCriterion("topic75_two not like", value, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoIn(List<String> values) {
            addCriterion("topic75_two in", values, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoNotIn(List<String> values) {
            addCriterion("topic75_two not in", values, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoBetween(String value1, String value2) {
            addCriterion("topic75_two between", value1, value2, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75TwoNotBetween(String value1, String value2) {
            addCriterion("topic75_two not between", value1, value2, "topic75Two");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeIsNull() {
            addCriterion("topic75_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeIsNotNull() {
            addCriterion("topic75_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeEqualTo(String value) {
            addCriterion("topic75_three =", value, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeNotEqualTo(String value) {
            addCriterion("topic75_three <>", value, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeGreaterThan(String value) {
            addCriterion("topic75_three >", value, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic75_three >=", value, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeLessThan(String value) {
            addCriterion("topic75_three <", value, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic75_three <=", value, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeLike(String value) {
            addCriterion("topic75_three like", value, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeNotLike(String value) {
            addCriterion("topic75_three not like", value, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeIn(List<String> values) {
            addCriterion("topic75_three in", values, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeNotIn(List<String> values) {
            addCriterion("topic75_three not in", values, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeBetween(String value1, String value2) {
            addCriterion("topic75_three between", value1, value2, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75ThreeNotBetween(String value1, String value2) {
            addCriterion("topic75_three not between", value1, value2, "topic75Three");
            return (Criteria) this;
        }

        public Criteria andTopic75FourIsNull() {
            addCriterion("topic75_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic75FourIsNotNull() {
            addCriterion("topic75_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic75FourEqualTo(String value) {
            addCriterion("topic75_four =", value, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FourNotEqualTo(String value) {
            addCriterion("topic75_four <>", value, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FourGreaterThan(String value) {
            addCriterion("topic75_four >", value, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic75_four >=", value, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FourLessThan(String value) {
            addCriterion("topic75_four <", value, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FourLessThanOrEqualTo(String value) {
            addCriterion("topic75_four <=", value, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FourLike(String value) {
            addCriterion("topic75_four like", value, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FourNotLike(String value) {
            addCriterion("topic75_four not like", value, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FourIn(List<String> values) {
            addCriterion("topic75_four in", values, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FourNotIn(List<String> values) {
            addCriterion("topic75_four not in", values, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FourBetween(String value1, String value2) {
            addCriterion("topic75_four between", value1, value2, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FourNotBetween(String value1, String value2) {
            addCriterion("topic75_four not between", value1, value2, "topic75Four");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionIsNull() {
            addCriterion("topic75_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionIsNotNull() {
            addCriterion("topic75_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionEqualTo(String value) {
            addCriterion("topic75_fraction =", value, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionNotEqualTo(String value) {
            addCriterion("topic75_fraction <>", value, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionGreaterThan(String value) {
            addCriterion("topic75_fraction >", value, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic75_fraction >=", value, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionLessThan(String value) {
            addCriterion("topic75_fraction <", value, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionLessThanOrEqualTo(String value) {
            addCriterion("topic75_fraction <=", value, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionLike(String value) {
            addCriterion("topic75_fraction like", value, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionNotLike(String value) {
            addCriterion("topic75_fraction not like", value, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionIn(List<String> values) {
            addCriterion("topic75_fraction in", values, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionNotIn(List<String> values) {
            addCriterion("topic75_fraction not in", values, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionBetween(String value1, String value2) {
            addCriterion("topic75_fraction between", value1, value2, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75FractionNotBetween(String value1, String value2) {
            addCriterion("topic75_fraction not between", value1, value2, "topic75Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic75SixIsNull() {
            addCriterion("topic75_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic75SixIsNotNull() {
            addCriterion("topic75_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic75SixEqualTo(String value) {
            addCriterion("topic75_six =", value, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic75SixNotEqualTo(String value) {
            addCriterion("topic75_six <>", value, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic75SixGreaterThan(String value) {
            addCriterion("topic75_six >", value, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic75SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic75_six >=", value, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic75SixLessThan(String value) {
            addCriterion("topic75_six <", value, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic75SixLessThanOrEqualTo(String value) {
            addCriterion("topic75_six <=", value, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic75SixLike(String value) {
            addCriterion("topic75_six like", value, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic75SixNotLike(String value) {
            addCriterion("topic75_six not like", value, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic75SixIn(List<String> values) {
            addCriterion("topic75_six in", values, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic75SixNotIn(List<String> values) {
            addCriterion("topic75_six not in", values, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic75SixBetween(String value1, String value2) {
            addCriterion("topic75_six between", value1, value2, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic75SixNotBetween(String value1, String value2) {
            addCriterion("topic75_six not between", value1, value2, "topic75Six");
            return (Criteria) this;
        }

        public Criteria andTopic76OneIsNull() {
            addCriterion("topic76_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic76OneIsNotNull() {
            addCriterion("topic76_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic76OneEqualTo(String value) {
            addCriterion("topic76_one =", value, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76OneNotEqualTo(String value) {
            addCriterion("topic76_one <>", value, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76OneGreaterThan(String value) {
            addCriterion("topic76_one >", value, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic76_one >=", value, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76OneLessThan(String value) {
            addCriterion("topic76_one <", value, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76OneLessThanOrEqualTo(String value) {
            addCriterion("topic76_one <=", value, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76OneLike(String value) {
            addCriterion("topic76_one like", value, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76OneNotLike(String value) {
            addCriterion("topic76_one not like", value, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76OneIn(List<String> values) {
            addCriterion("topic76_one in", values, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76OneNotIn(List<String> values) {
            addCriterion("topic76_one not in", values, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76OneBetween(String value1, String value2) {
            addCriterion("topic76_one between", value1, value2, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76OneNotBetween(String value1, String value2) {
            addCriterion("topic76_one not between", value1, value2, "topic76One");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoIsNull() {
            addCriterion("topic76_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoIsNotNull() {
            addCriterion("topic76_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoEqualTo(String value) {
            addCriterion("topic76_two =", value, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoNotEqualTo(String value) {
            addCriterion("topic76_two <>", value, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoGreaterThan(String value) {
            addCriterion("topic76_two >", value, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic76_two >=", value, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoLessThan(String value) {
            addCriterion("topic76_two <", value, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoLessThanOrEqualTo(String value) {
            addCriterion("topic76_two <=", value, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoLike(String value) {
            addCriterion("topic76_two like", value, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoNotLike(String value) {
            addCriterion("topic76_two not like", value, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoIn(List<String> values) {
            addCriterion("topic76_two in", values, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoNotIn(List<String> values) {
            addCriterion("topic76_two not in", values, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoBetween(String value1, String value2) {
            addCriterion("topic76_two between", value1, value2, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76TwoNotBetween(String value1, String value2) {
            addCriterion("topic76_two not between", value1, value2, "topic76Two");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeIsNull() {
            addCriterion("topic76_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeIsNotNull() {
            addCriterion("topic76_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeEqualTo(String value) {
            addCriterion("topic76_three =", value, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeNotEqualTo(String value) {
            addCriterion("topic76_three <>", value, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeGreaterThan(String value) {
            addCriterion("topic76_three >", value, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic76_three >=", value, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeLessThan(String value) {
            addCriterion("topic76_three <", value, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic76_three <=", value, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeLike(String value) {
            addCriterion("topic76_three like", value, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeNotLike(String value) {
            addCriterion("topic76_three not like", value, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeIn(List<String> values) {
            addCriterion("topic76_three in", values, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeNotIn(List<String> values) {
            addCriterion("topic76_three not in", values, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeBetween(String value1, String value2) {
            addCriterion("topic76_three between", value1, value2, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76ThreeNotBetween(String value1, String value2) {
            addCriterion("topic76_three not between", value1, value2, "topic76Three");
            return (Criteria) this;
        }

        public Criteria andTopic76FourIsNull() {
            addCriterion("topic76_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic76FourIsNotNull() {
            addCriterion("topic76_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic76FourEqualTo(String value) {
            addCriterion("topic76_four =", value, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FourNotEqualTo(String value) {
            addCriterion("topic76_four <>", value, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FourGreaterThan(String value) {
            addCriterion("topic76_four >", value, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic76_four >=", value, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FourLessThan(String value) {
            addCriterion("topic76_four <", value, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FourLessThanOrEqualTo(String value) {
            addCriterion("topic76_four <=", value, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FourLike(String value) {
            addCriterion("topic76_four like", value, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FourNotLike(String value) {
            addCriterion("topic76_four not like", value, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FourIn(List<String> values) {
            addCriterion("topic76_four in", values, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FourNotIn(List<String> values) {
            addCriterion("topic76_four not in", values, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FourBetween(String value1, String value2) {
            addCriterion("topic76_four between", value1, value2, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FourNotBetween(String value1, String value2) {
            addCriterion("topic76_four not between", value1, value2, "topic76Four");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionIsNull() {
            addCriterion("topic76_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionIsNotNull() {
            addCriterion("topic76_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionEqualTo(String value) {
            addCriterion("topic76_fraction =", value, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionNotEqualTo(String value) {
            addCriterion("topic76_fraction <>", value, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionGreaterThan(String value) {
            addCriterion("topic76_fraction >", value, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic76_fraction >=", value, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionLessThan(String value) {
            addCriterion("topic76_fraction <", value, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionLessThanOrEqualTo(String value) {
            addCriterion("topic76_fraction <=", value, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionLike(String value) {
            addCriterion("topic76_fraction like", value, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionNotLike(String value) {
            addCriterion("topic76_fraction not like", value, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionIn(List<String> values) {
            addCriterion("topic76_fraction in", values, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionNotIn(List<String> values) {
            addCriterion("topic76_fraction not in", values, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionBetween(String value1, String value2) {
            addCriterion("topic76_fraction between", value1, value2, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76FractionNotBetween(String value1, String value2) {
            addCriterion("topic76_fraction not between", value1, value2, "topic76Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic76SixIsNull() {
            addCriterion("topic76_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic76SixIsNotNull() {
            addCriterion("topic76_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic76SixEqualTo(String value) {
            addCriterion("topic76_six =", value, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic76SixNotEqualTo(String value) {
            addCriterion("topic76_six <>", value, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic76SixGreaterThan(String value) {
            addCriterion("topic76_six >", value, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic76SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic76_six >=", value, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic76SixLessThan(String value) {
            addCriterion("topic76_six <", value, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic76SixLessThanOrEqualTo(String value) {
            addCriterion("topic76_six <=", value, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic76SixLike(String value) {
            addCriterion("topic76_six like", value, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic76SixNotLike(String value) {
            addCriterion("topic76_six not like", value, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic76SixIn(List<String> values) {
            addCriterion("topic76_six in", values, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic76SixNotIn(List<String> values) {
            addCriterion("topic76_six not in", values, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic76SixBetween(String value1, String value2) {
            addCriterion("topic76_six between", value1, value2, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic76SixNotBetween(String value1, String value2) {
            addCriterion("topic76_six not between", value1, value2, "topic76Six");
            return (Criteria) this;
        }

        public Criteria andTopic77OneIsNull() {
            addCriterion("topic77_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic77OneIsNotNull() {
            addCriterion("topic77_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic77OneEqualTo(String value) {
            addCriterion("topic77_one =", value, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77OneNotEqualTo(String value) {
            addCriterion("topic77_one <>", value, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77OneGreaterThan(String value) {
            addCriterion("topic77_one >", value, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic77_one >=", value, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77OneLessThan(String value) {
            addCriterion("topic77_one <", value, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77OneLessThanOrEqualTo(String value) {
            addCriterion("topic77_one <=", value, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77OneLike(String value) {
            addCriterion("topic77_one like", value, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77OneNotLike(String value) {
            addCriterion("topic77_one not like", value, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77OneIn(List<String> values) {
            addCriterion("topic77_one in", values, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77OneNotIn(List<String> values) {
            addCriterion("topic77_one not in", values, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77OneBetween(String value1, String value2) {
            addCriterion("topic77_one between", value1, value2, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77OneNotBetween(String value1, String value2) {
            addCriterion("topic77_one not between", value1, value2, "topic77One");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoIsNull() {
            addCriterion("topic77_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoIsNotNull() {
            addCriterion("topic77_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoEqualTo(String value) {
            addCriterion("topic77_two =", value, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoNotEqualTo(String value) {
            addCriterion("topic77_two <>", value, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoGreaterThan(String value) {
            addCriterion("topic77_two >", value, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic77_two >=", value, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoLessThan(String value) {
            addCriterion("topic77_two <", value, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoLessThanOrEqualTo(String value) {
            addCriterion("topic77_two <=", value, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoLike(String value) {
            addCriterion("topic77_two like", value, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoNotLike(String value) {
            addCriterion("topic77_two not like", value, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoIn(List<String> values) {
            addCriterion("topic77_two in", values, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoNotIn(List<String> values) {
            addCriterion("topic77_two not in", values, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoBetween(String value1, String value2) {
            addCriterion("topic77_two between", value1, value2, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77TwoNotBetween(String value1, String value2) {
            addCriterion("topic77_two not between", value1, value2, "topic77Two");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeIsNull() {
            addCriterion("topic77_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeIsNotNull() {
            addCriterion("topic77_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeEqualTo(String value) {
            addCriterion("topic77_three =", value, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeNotEqualTo(String value) {
            addCriterion("topic77_three <>", value, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeGreaterThan(String value) {
            addCriterion("topic77_three >", value, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic77_three >=", value, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeLessThan(String value) {
            addCriterion("topic77_three <", value, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic77_three <=", value, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeLike(String value) {
            addCriterion("topic77_three like", value, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeNotLike(String value) {
            addCriterion("topic77_three not like", value, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeIn(List<String> values) {
            addCriterion("topic77_three in", values, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeNotIn(List<String> values) {
            addCriterion("topic77_three not in", values, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeBetween(String value1, String value2) {
            addCriterion("topic77_three between", value1, value2, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77ThreeNotBetween(String value1, String value2) {
            addCriterion("topic77_three not between", value1, value2, "topic77Three");
            return (Criteria) this;
        }

        public Criteria andTopic77FourIsNull() {
            addCriterion("topic77_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic77FourIsNotNull() {
            addCriterion("topic77_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic77FourEqualTo(String value) {
            addCriterion("topic77_four =", value, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FourNotEqualTo(String value) {
            addCriterion("topic77_four <>", value, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FourGreaterThan(String value) {
            addCriterion("topic77_four >", value, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic77_four >=", value, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FourLessThan(String value) {
            addCriterion("topic77_four <", value, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FourLessThanOrEqualTo(String value) {
            addCriterion("topic77_four <=", value, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FourLike(String value) {
            addCriterion("topic77_four like", value, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FourNotLike(String value) {
            addCriterion("topic77_four not like", value, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FourIn(List<String> values) {
            addCriterion("topic77_four in", values, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FourNotIn(List<String> values) {
            addCriterion("topic77_four not in", values, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FourBetween(String value1, String value2) {
            addCriterion("topic77_four between", value1, value2, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FourNotBetween(String value1, String value2) {
            addCriterion("topic77_four not between", value1, value2, "topic77Four");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionIsNull() {
            addCriterion("topic77_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionIsNotNull() {
            addCriterion("topic77_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionEqualTo(String value) {
            addCriterion("topic77_fraction =", value, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionNotEqualTo(String value) {
            addCriterion("topic77_fraction <>", value, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionGreaterThan(String value) {
            addCriterion("topic77_fraction >", value, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic77_fraction >=", value, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionLessThan(String value) {
            addCriterion("topic77_fraction <", value, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionLessThanOrEqualTo(String value) {
            addCriterion("topic77_fraction <=", value, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionLike(String value) {
            addCriterion("topic77_fraction like", value, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionNotLike(String value) {
            addCriterion("topic77_fraction not like", value, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionIn(List<String> values) {
            addCriterion("topic77_fraction in", values, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionNotIn(List<String> values) {
            addCriterion("topic77_fraction not in", values, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionBetween(String value1, String value2) {
            addCriterion("topic77_fraction between", value1, value2, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77FractionNotBetween(String value1, String value2) {
            addCriterion("topic77_fraction not between", value1, value2, "topic77Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic77SixIsNull() {
            addCriterion("topic77_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic77SixIsNotNull() {
            addCriterion("topic77_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic77SixEqualTo(String value) {
            addCriterion("topic77_six =", value, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic77SixNotEqualTo(String value) {
            addCriterion("topic77_six <>", value, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic77SixGreaterThan(String value) {
            addCriterion("topic77_six >", value, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic77SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic77_six >=", value, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic77SixLessThan(String value) {
            addCriterion("topic77_six <", value, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic77SixLessThanOrEqualTo(String value) {
            addCriterion("topic77_six <=", value, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic77SixLike(String value) {
            addCriterion("topic77_six like", value, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic77SixNotLike(String value) {
            addCriterion("topic77_six not like", value, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic77SixIn(List<String> values) {
            addCriterion("topic77_six in", values, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic77SixNotIn(List<String> values) {
            addCriterion("topic77_six not in", values, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic77SixBetween(String value1, String value2) {
            addCriterion("topic77_six between", value1, value2, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic77SixNotBetween(String value1, String value2) {
            addCriterion("topic77_six not between", value1, value2, "topic77Six");
            return (Criteria) this;
        }

        public Criteria andTopic78OneIsNull() {
            addCriterion("topic78_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic78OneIsNotNull() {
            addCriterion("topic78_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic78OneEqualTo(String value) {
            addCriterion("topic78_one =", value, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78OneNotEqualTo(String value) {
            addCriterion("topic78_one <>", value, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78OneGreaterThan(String value) {
            addCriterion("topic78_one >", value, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic78_one >=", value, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78OneLessThan(String value) {
            addCriterion("topic78_one <", value, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78OneLessThanOrEqualTo(String value) {
            addCriterion("topic78_one <=", value, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78OneLike(String value) {
            addCriterion("topic78_one like", value, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78OneNotLike(String value) {
            addCriterion("topic78_one not like", value, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78OneIn(List<String> values) {
            addCriterion("topic78_one in", values, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78OneNotIn(List<String> values) {
            addCriterion("topic78_one not in", values, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78OneBetween(String value1, String value2) {
            addCriterion("topic78_one between", value1, value2, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78OneNotBetween(String value1, String value2) {
            addCriterion("topic78_one not between", value1, value2, "topic78One");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoIsNull() {
            addCriterion("topic78_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoIsNotNull() {
            addCriterion("topic78_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoEqualTo(String value) {
            addCriterion("topic78_two =", value, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoNotEqualTo(String value) {
            addCriterion("topic78_two <>", value, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoGreaterThan(String value) {
            addCriterion("topic78_two >", value, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic78_two >=", value, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoLessThan(String value) {
            addCriterion("topic78_two <", value, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoLessThanOrEqualTo(String value) {
            addCriterion("topic78_two <=", value, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoLike(String value) {
            addCriterion("topic78_two like", value, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoNotLike(String value) {
            addCriterion("topic78_two not like", value, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoIn(List<String> values) {
            addCriterion("topic78_two in", values, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoNotIn(List<String> values) {
            addCriterion("topic78_two not in", values, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoBetween(String value1, String value2) {
            addCriterion("topic78_two between", value1, value2, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78TwoNotBetween(String value1, String value2) {
            addCriterion("topic78_two not between", value1, value2, "topic78Two");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeIsNull() {
            addCriterion("topic78_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeIsNotNull() {
            addCriterion("topic78_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeEqualTo(String value) {
            addCriterion("topic78_three =", value, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeNotEqualTo(String value) {
            addCriterion("topic78_three <>", value, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeGreaterThan(String value) {
            addCriterion("topic78_three >", value, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic78_three >=", value, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeLessThan(String value) {
            addCriterion("topic78_three <", value, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic78_three <=", value, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeLike(String value) {
            addCriterion("topic78_three like", value, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeNotLike(String value) {
            addCriterion("topic78_three not like", value, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeIn(List<String> values) {
            addCriterion("topic78_three in", values, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeNotIn(List<String> values) {
            addCriterion("topic78_three not in", values, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeBetween(String value1, String value2) {
            addCriterion("topic78_three between", value1, value2, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78ThreeNotBetween(String value1, String value2) {
            addCriterion("topic78_three not between", value1, value2, "topic78Three");
            return (Criteria) this;
        }

        public Criteria andTopic78FourIsNull() {
            addCriterion("topic78_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic78FourIsNotNull() {
            addCriterion("topic78_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic78FourEqualTo(String value) {
            addCriterion("topic78_four =", value, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FourNotEqualTo(String value) {
            addCriterion("topic78_four <>", value, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FourGreaterThan(String value) {
            addCriterion("topic78_four >", value, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic78_four >=", value, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FourLessThan(String value) {
            addCriterion("topic78_four <", value, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FourLessThanOrEqualTo(String value) {
            addCriterion("topic78_four <=", value, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FourLike(String value) {
            addCriterion("topic78_four like", value, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FourNotLike(String value) {
            addCriterion("topic78_four not like", value, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FourIn(List<String> values) {
            addCriterion("topic78_four in", values, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FourNotIn(List<String> values) {
            addCriterion("topic78_four not in", values, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FourBetween(String value1, String value2) {
            addCriterion("topic78_four between", value1, value2, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FourNotBetween(String value1, String value2) {
            addCriterion("topic78_four not between", value1, value2, "topic78Four");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionIsNull() {
            addCriterion("topic78_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionIsNotNull() {
            addCriterion("topic78_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionEqualTo(String value) {
            addCriterion("topic78_fraction =", value, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionNotEqualTo(String value) {
            addCriterion("topic78_fraction <>", value, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionGreaterThan(String value) {
            addCriterion("topic78_fraction >", value, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic78_fraction >=", value, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionLessThan(String value) {
            addCriterion("topic78_fraction <", value, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionLessThanOrEqualTo(String value) {
            addCriterion("topic78_fraction <=", value, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionLike(String value) {
            addCriterion("topic78_fraction like", value, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionNotLike(String value) {
            addCriterion("topic78_fraction not like", value, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionIn(List<String> values) {
            addCriterion("topic78_fraction in", values, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionNotIn(List<String> values) {
            addCriterion("topic78_fraction not in", values, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionBetween(String value1, String value2) {
            addCriterion("topic78_fraction between", value1, value2, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78FractionNotBetween(String value1, String value2) {
            addCriterion("topic78_fraction not between", value1, value2, "topic78Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic78SixIsNull() {
            addCriterion("topic78_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic78SixIsNotNull() {
            addCriterion("topic78_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic78SixEqualTo(String value) {
            addCriterion("topic78_six =", value, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic78SixNotEqualTo(String value) {
            addCriterion("topic78_six <>", value, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic78SixGreaterThan(String value) {
            addCriterion("topic78_six >", value, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic78SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic78_six >=", value, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic78SixLessThan(String value) {
            addCriterion("topic78_six <", value, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic78SixLessThanOrEqualTo(String value) {
            addCriterion("topic78_six <=", value, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic78SixLike(String value) {
            addCriterion("topic78_six like", value, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic78SixNotLike(String value) {
            addCriterion("topic78_six not like", value, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic78SixIn(List<String> values) {
            addCriterion("topic78_six in", values, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic78SixNotIn(List<String> values) {
            addCriterion("topic78_six not in", values, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic78SixBetween(String value1, String value2) {
            addCriterion("topic78_six between", value1, value2, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic78SixNotBetween(String value1, String value2) {
            addCriterion("topic78_six not between", value1, value2, "topic78Six");
            return (Criteria) this;
        }

        public Criteria andTopic79OneIsNull() {
            addCriterion("topic79_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic79OneIsNotNull() {
            addCriterion("topic79_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic79OneEqualTo(String value) {
            addCriterion("topic79_one =", value, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79OneNotEqualTo(String value) {
            addCriterion("topic79_one <>", value, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79OneGreaterThan(String value) {
            addCriterion("topic79_one >", value, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic79_one >=", value, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79OneLessThan(String value) {
            addCriterion("topic79_one <", value, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79OneLessThanOrEqualTo(String value) {
            addCriterion("topic79_one <=", value, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79OneLike(String value) {
            addCriterion("topic79_one like", value, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79OneNotLike(String value) {
            addCriterion("topic79_one not like", value, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79OneIn(List<String> values) {
            addCriterion("topic79_one in", values, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79OneNotIn(List<String> values) {
            addCriterion("topic79_one not in", values, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79OneBetween(String value1, String value2) {
            addCriterion("topic79_one between", value1, value2, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79OneNotBetween(String value1, String value2) {
            addCriterion("topic79_one not between", value1, value2, "topic79One");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoIsNull() {
            addCriterion("topic79_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoIsNotNull() {
            addCriterion("topic79_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoEqualTo(String value) {
            addCriterion("topic79_two =", value, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoNotEqualTo(String value) {
            addCriterion("topic79_two <>", value, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoGreaterThan(String value) {
            addCriterion("topic79_two >", value, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic79_two >=", value, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoLessThan(String value) {
            addCriterion("topic79_two <", value, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoLessThanOrEqualTo(String value) {
            addCriterion("topic79_two <=", value, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoLike(String value) {
            addCriterion("topic79_two like", value, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoNotLike(String value) {
            addCriterion("topic79_two not like", value, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoIn(List<String> values) {
            addCriterion("topic79_two in", values, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoNotIn(List<String> values) {
            addCriterion("topic79_two not in", values, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoBetween(String value1, String value2) {
            addCriterion("topic79_two between", value1, value2, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79TwoNotBetween(String value1, String value2) {
            addCriterion("topic79_two not between", value1, value2, "topic79Two");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeIsNull() {
            addCriterion("topic79_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeIsNotNull() {
            addCriterion("topic79_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeEqualTo(String value) {
            addCriterion("topic79_three =", value, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeNotEqualTo(String value) {
            addCriterion("topic79_three <>", value, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeGreaterThan(String value) {
            addCriterion("topic79_three >", value, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic79_three >=", value, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeLessThan(String value) {
            addCriterion("topic79_three <", value, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic79_three <=", value, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeLike(String value) {
            addCriterion("topic79_three like", value, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeNotLike(String value) {
            addCriterion("topic79_three not like", value, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeIn(List<String> values) {
            addCriterion("topic79_three in", values, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeNotIn(List<String> values) {
            addCriterion("topic79_three not in", values, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeBetween(String value1, String value2) {
            addCriterion("topic79_three between", value1, value2, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79ThreeNotBetween(String value1, String value2) {
            addCriterion("topic79_three not between", value1, value2, "topic79Three");
            return (Criteria) this;
        }

        public Criteria andTopic79FourIsNull() {
            addCriterion("topic79_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic79FourIsNotNull() {
            addCriterion("topic79_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic79FourEqualTo(String value) {
            addCriterion("topic79_four =", value, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FourNotEqualTo(String value) {
            addCriterion("topic79_four <>", value, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FourGreaterThan(String value) {
            addCriterion("topic79_four >", value, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic79_four >=", value, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FourLessThan(String value) {
            addCriterion("topic79_four <", value, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FourLessThanOrEqualTo(String value) {
            addCriterion("topic79_four <=", value, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FourLike(String value) {
            addCriterion("topic79_four like", value, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FourNotLike(String value) {
            addCriterion("topic79_four not like", value, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FourIn(List<String> values) {
            addCriterion("topic79_four in", values, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FourNotIn(List<String> values) {
            addCriterion("topic79_four not in", values, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FourBetween(String value1, String value2) {
            addCriterion("topic79_four between", value1, value2, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FourNotBetween(String value1, String value2) {
            addCriterion("topic79_four not between", value1, value2, "topic79Four");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionIsNull() {
            addCriterion("topic79_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionIsNotNull() {
            addCriterion("topic79_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionEqualTo(String value) {
            addCriterion("topic79_fraction =", value, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionNotEqualTo(String value) {
            addCriterion("topic79_fraction <>", value, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionGreaterThan(String value) {
            addCriterion("topic79_fraction >", value, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic79_fraction >=", value, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionLessThan(String value) {
            addCriterion("topic79_fraction <", value, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionLessThanOrEqualTo(String value) {
            addCriterion("topic79_fraction <=", value, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionLike(String value) {
            addCriterion("topic79_fraction like", value, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionNotLike(String value) {
            addCriterion("topic79_fraction not like", value, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionIn(List<String> values) {
            addCriterion("topic79_fraction in", values, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionNotIn(List<String> values) {
            addCriterion("topic79_fraction not in", values, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionBetween(String value1, String value2) {
            addCriterion("topic79_fraction between", value1, value2, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79FractionNotBetween(String value1, String value2) {
            addCriterion("topic79_fraction not between", value1, value2, "topic79Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic79SixIsNull() {
            addCriterion("topic79_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic79SixIsNotNull() {
            addCriterion("topic79_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic79SixEqualTo(String value) {
            addCriterion("topic79_six =", value, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic79SixNotEqualTo(String value) {
            addCriterion("topic79_six <>", value, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic79SixGreaterThan(String value) {
            addCriterion("topic79_six >", value, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic79SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic79_six >=", value, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic79SixLessThan(String value) {
            addCriterion("topic79_six <", value, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic79SixLessThanOrEqualTo(String value) {
            addCriterion("topic79_six <=", value, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic79SixLike(String value) {
            addCriterion("topic79_six like", value, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic79SixNotLike(String value) {
            addCriterion("topic79_six not like", value, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic79SixIn(List<String> values) {
            addCriterion("topic79_six in", values, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic79SixNotIn(List<String> values) {
            addCriterion("topic79_six not in", values, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic79SixBetween(String value1, String value2) {
            addCriterion("topic79_six between", value1, value2, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic79SixNotBetween(String value1, String value2) {
            addCriterion("topic79_six not between", value1, value2, "topic79Six");
            return (Criteria) this;
        }

        public Criteria andTopic80OneIsNull() {
            addCriterion("topic80_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic80OneIsNotNull() {
            addCriterion("topic80_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic80OneEqualTo(String value) {
            addCriterion("topic80_one =", value, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80OneNotEqualTo(String value) {
            addCriterion("topic80_one <>", value, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80OneGreaterThan(String value) {
            addCriterion("topic80_one >", value, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic80_one >=", value, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80OneLessThan(String value) {
            addCriterion("topic80_one <", value, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80OneLessThanOrEqualTo(String value) {
            addCriterion("topic80_one <=", value, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80OneLike(String value) {
            addCriterion("topic80_one like", value, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80OneNotLike(String value) {
            addCriterion("topic80_one not like", value, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80OneIn(List<String> values) {
            addCriterion("topic80_one in", values, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80OneNotIn(List<String> values) {
            addCriterion("topic80_one not in", values, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80OneBetween(String value1, String value2) {
            addCriterion("topic80_one between", value1, value2, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80OneNotBetween(String value1, String value2) {
            addCriterion("topic80_one not between", value1, value2, "topic80One");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoIsNull() {
            addCriterion("topic80_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoIsNotNull() {
            addCriterion("topic80_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoEqualTo(String value) {
            addCriterion("topic80_two =", value, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoNotEqualTo(String value) {
            addCriterion("topic80_two <>", value, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoGreaterThan(String value) {
            addCriterion("topic80_two >", value, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic80_two >=", value, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoLessThan(String value) {
            addCriterion("topic80_two <", value, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoLessThanOrEqualTo(String value) {
            addCriterion("topic80_two <=", value, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoLike(String value) {
            addCriterion("topic80_two like", value, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoNotLike(String value) {
            addCriterion("topic80_two not like", value, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoIn(List<String> values) {
            addCriterion("topic80_two in", values, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoNotIn(List<String> values) {
            addCriterion("topic80_two not in", values, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoBetween(String value1, String value2) {
            addCriterion("topic80_two between", value1, value2, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80TwoNotBetween(String value1, String value2) {
            addCriterion("topic80_two not between", value1, value2, "topic80Two");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeIsNull() {
            addCriterion("topic80_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeIsNotNull() {
            addCriterion("topic80_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeEqualTo(String value) {
            addCriterion("topic80_three =", value, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeNotEqualTo(String value) {
            addCriterion("topic80_three <>", value, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeGreaterThan(String value) {
            addCriterion("topic80_three >", value, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic80_three >=", value, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeLessThan(String value) {
            addCriterion("topic80_three <", value, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic80_three <=", value, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeLike(String value) {
            addCriterion("topic80_three like", value, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeNotLike(String value) {
            addCriterion("topic80_three not like", value, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeIn(List<String> values) {
            addCriterion("topic80_three in", values, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeNotIn(List<String> values) {
            addCriterion("topic80_three not in", values, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeBetween(String value1, String value2) {
            addCriterion("topic80_three between", value1, value2, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80ThreeNotBetween(String value1, String value2) {
            addCriterion("topic80_three not between", value1, value2, "topic80Three");
            return (Criteria) this;
        }

        public Criteria andTopic80FourIsNull() {
            addCriterion("topic80_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic80FourIsNotNull() {
            addCriterion("topic80_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic80FourEqualTo(String value) {
            addCriterion("topic80_four =", value, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FourNotEqualTo(String value) {
            addCriterion("topic80_four <>", value, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FourGreaterThan(String value) {
            addCriterion("topic80_four >", value, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic80_four >=", value, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FourLessThan(String value) {
            addCriterion("topic80_four <", value, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FourLessThanOrEqualTo(String value) {
            addCriterion("topic80_four <=", value, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FourLike(String value) {
            addCriterion("topic80_four like", value, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FourNotLike(String value) {
            addCriterion("topic80_four not like", value, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FourIn(List<String> values) {
            addCriterion("topic80_four in", values, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FourNotIn(List<String> values) {
            addCriterion("topic80_four not in", values, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FourBetween(String value1, String value2) {
            addCriterion("topic80_four between", value1, value2, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FourNotBetween(String value1, String value2) {
            addCriterion("topic80_four not between", value1, value2, "topic80Four");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionIsNull() {
            addCriterion("topic80_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionIsNotNull() {
            addCriterion("topic80_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionEqualTo(String value) {
            addCriterion("topic80_fraction =", value, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionNotEqualTo(String value) {
            addCriterion("topic80_fraction <>", value, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionGreaterThan(String value) {
            addCriterion("topic80_fraction >", value, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic80_fraction >=", value, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionLessThan(String value) {
            addCriterion("topic80_fraction <", value, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionLessThanOrEqualTo(String value) {
            addCriterion("topic80_fraction <=", value, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionLike(String value) {
            addCriterion("topic80_fraction like", value, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionNotLike(String value) {
            addCriterion("topic80_fraction not like", value, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionIn(List<String> values) {
            addCriterion("topic80_fraction in", values, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionNotIn(List<String> values) {
            addCriterion("topic80_fraction not in", values, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionBetween(String value1, String value2) {
            addCriterion("topic80_fraction between", value1, value2, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80FractionNotBetween(String value1, String value2) {
            addCriterion("topic80_fraction not between", value1, value2, "topic80Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic80SixIsNull() {
            addCriterion("topic80_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic80SixIsNotNull() {
            addCriterion("topic80_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic80SixEqualTo(String value) {
            addCriterion("topic80_six =", value, "topic80Six");
            return (Criteria) this;
        }

        public Criteria andTopic80SixNotEqualTo(String value) {
            addCriterion("topic80_six <>", value, "topic80Six");
            return (Criteria) this;
        }

        public Criteria andTopic80SixGreaterThan(String value) {
            addCriterion("topic80_six >", value, "topic80Six");
            return (Criteria) this;
        }

        public Criteria andTopic80SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic80_six >=", value, "topic80Six");
            return (Criteria) this;
        }

        public Criteria andTopic80SixLessThan(String value) {
            addCriterion("topic80_six <", value, "topic80Six");
            return (Criteria) this;
        }

        public Criteria andTopic80SixLessThanOrEqualTo(String value) {
            addCriterion("topic80_six <=", value, "topic80Six");
            return (Criteria) this;
        }

        public Criteria andTopic80SixLike(String value) {
            addCriterion("topic80_six like", value, "topic80Six");
            return (Criteria) this;
        }

        public Criteria andTopic80SixNotLike(String value) {
            addCriterion("topic80_six not like", value, "topic80Six");
            return (Criteria) this;
        }

        public Criteria andTopic80SixIn(List<String> values) {
            addCriterion("topic80_six in", values, "topic80Six");
            return (Criteria) this;
        }

        public Criteria andTopic80SixNotIn(List<String> values) {
            addCriterion("topic80_six not in", values, "topic80Six");
            return (Criteria) this;
        }

        public Criteria andTopic80SixBetween(String value1, String value2) {
            addCriterion("topic80_six between", value1, value2, "topic80Six");
            return (Criteria) this;
        }

        public Criteria andTopic80SixNotBetween(String value1, String value2) {
            addCriterion("topic80_six not between", value1, value2, "topic80Six");
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