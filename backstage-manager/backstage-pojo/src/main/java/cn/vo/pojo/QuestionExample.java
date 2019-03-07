package cn.vo.pojo;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andOption1IsNull() {
            addCriterion("option1 is null");
            return (Criteria) this;
        }

        public Criteria andOption1IsNotNull() {
            addCriterion("option1 is not null");
            return (Criteria) this;
        }

        public Criteria andOption1EqualTo(String value) {
            addCriterion("option1 =", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotEqualTo(String value) {
            addCriterion("option1 <>", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1GreaterThan(String value) {
            addCriterion("option1 >", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1GreaterThanOrEqualTo(String value) {
            addCriterion("option1 >=", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1LessThan(String value) {
            addCriterion("option1 <", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1LessThanOrEqualTo(String value) {
            addCriterion("option1 <=", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1Like(String value) {
            addCriterion("option1 like", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotLike(String value) {
            addCriterion("option1 not like", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1In(List<String> values) {
            addCriterion("option1 in", values, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotIn(List<String> values) {
            addCriterion("option1 not in", values, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1Between(String value1, String value2) {
            addCriterion("option1 between", value1, value2, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotBetween(String value1, String value2) {
            addCriterion("option1 not between", value1, value2, "option1");
            return (Criteria) this;
        }

        public Criteria andOption2IsNull() {
            addCriterion("option2 is null");
            return (Criteria) this;
        }

        public Criteria andOption2IsNotNull() {
            addCriterion("option2 is not null");
            return (Criteria) this;
        }

        public Criteria andOption2EqualTo(String value) {
            addCriterion("option2 =", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotEqualTo(String value) {
            addCriterion("option2 <>", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2GreaterThan(String value) {
            addCriterion("option2 >", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2GreaterThanOrEqualTo(String value) {
            addCriterion("option2 >=", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2LessThan(String value) {
            addCriterion("option2 <", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2LessThanOrEqualTo(String value) {
            addCriterion("option2 <=", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2Like(String value) {
            addCriterion("option2 like", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotLike(String value) {
            addCriterion("option2 not like", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2In(List<String> values) {
            addCriterion("option2 in", values, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotIn(List<String> values) {
            addCriterion("option2 not in", values, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2Between(String value1, String value2) {
            addCriterion("option2 between", value1, value2, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotBetween(String value1, String value2) {
            addCriterion("option2 not between", value1, value2, "option2");
            return (Criteria) this;
        }

        public Criteria andOption3IsNull() {
            addCriterion("option3 is null");
            return (Criteria) this;
        }

        public Criteria andOption3IsNotNull() {
            addCriterion("option3 is not null");
            return (Criteria) this;
        }

        public Criteria andOption3EqualTo(String value) {
            addCriterion("option3 =", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotEqualTo(String value) {
            addCriterion("option3 <>", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3GreaterThan(String value) {
            addCriterion("option3 >", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3GreaterThanOrEqualTo(String value) {
            addCriterion("option3 >=", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3LessThan(String value) {
            addCriterion("option3 <", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3LessThanOrEqualTo(String value) {
            addCriterion("option3 <=", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3Like(String value) {
            addCriterion("option3 like", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotLike(String value) {
            addCriterion("option3 not like", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3In(List<String> values) {
            addCriterion("option3 in", values, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotIn(List<String> values) {
            addCriterion("option3 not in", values, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3Between(String value1, String value2) {
            addCriterion("option3 between", value1, value2, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotBetween(String value1, String value2) {
            addCriterion("option3 not between", value1, value2, "option3");
            return (Criteria) this;
        }

        public Criteria andOption4IsNull() {
            addCriterion("option4 is null");
            return (Criteria) this;
        }

        public Criteria andOption4IsNotNull() {
            addCriterion("option4 is not null");
            return (Criteria) this;
        }

        public Criteria andOption4EqualTo(String value) {
            addCriterion("option4 =", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotEqualTo(String value) {
            addCriterion("option4 <>", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4GreaterThan(String value) {
            addCriterion("option4 >", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4GreaterThanOrEqualTo(String value) {
            addCriterion("option4 >=", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4LessThan(String value) {
            addCriterion("option4 <", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4LessThanOrEqualTo(String value) {
            addCriterion("option4 <=", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4Like(String value) {
            addCriterion("option4 like", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotLike(String value) {
            addCriterion("option4 not like", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4In(List<String> values) {
            addCriterion("option4 in", values, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotIn(List<String> values) {
            addCriterion("option4 not in", values, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4Between(String value1, String value2) {
            addCriterion("option4 between", value1, value2, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotBetween(String value1, String value2) {
            addCriterion("option4 not between", value1, value2, "option4");
            return (Criteria) this;
        }

        public Criteria andOption5IsNull() {
            addCriterion("option5 is null");
            return (Criteria) this;
        }

        public Criteria andOption5IsNotNull() {
            addCriterion("option5 is not null");
            return (Criteria) this;
        }

        public Criteria andOption5EqualTo(String value) {
            addCriterion("option5 =", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5NotEqualTo(String value) {
            addCriterion("option5 <>", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5GreaterThan(String value) {
            addCriterion("option5 >", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5GreaterThanOrEqualTo(String value) {
            addCriterion("option5 >=", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5LessThan(String value) {
            addCriterion("option5 <", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5LessThanOrEqualTo(String value) {
            addCriterion("option5 <=", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5Like(String value) {
            addCriterion("option5 like", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5NotLike(String value) {
            addCriterion("option5 not like", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5In(List<String> values) {
            addCriterion("option5 in", values, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5NotIn(List<String> values) {
            addCriterion("option5 not in", values, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5Between(String value1, String value2) {
            addCriterion("option5 between", value1, value2, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5NotBetween(String value1, String value2) {
            addCriterion("option5 not between", value1, value2, "option5");
            return (Criteria) this;
        }

        public Criteria andOption6IsNull() {
            addCriterion("option6 is null");
            return (Criteria) this;
        }

        public Criteria andOption6IsNotNull() {
            addCriterion("option6 is not null");
            return (Criteria) this;
        }

        public Criteria andOption6EqualTo(String value) {
            addCriterion("option6 =", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6NotEqualTo(String value) {
            addCriterion("option6 <>", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6GreaterThan(String value) {
            addCriterion("option6 >", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6GreaterThanOrEqualTo(String value) {
            addCriterion("option6 >=", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6LessThan(String value) {
            addCriterion("option6 <", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6LessThanOrEqualTo(String value) {
            addCriterion("option6 <=", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6Like(String value) {
            addCriterion("option6 like", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6NotLike(String value) {
            addCriterion("option6 not like", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6In(List<String> values) {
            addCriterion("option6 in", values, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6NotIn(List<String> values) {
            addCriterion("option6 not in", values, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6Between(String value1, String value2) {
            addCriterion("option6 between", value1, value2, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6NotBetween(String value1, String value2) {
            addCriterion("option6 not between", value1, value2, "option6");
            return (Criteria) this;
        }

        public Criteria andOption7IsNull() {
            addCriterion("option7 is null");
            return (Criteria) this;
        }

        public Criteria andOption7IsNotNull() {
            addCriterion("option7 is not null");
            return (Criteria) this;
        }

        public Criteria andOption7EqualTo(String value) {
            addCriterion("option7 =", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7NotEqualTo(String value) {
            addCriterion("option7 <>", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7GreaterThan(String value) {
            addCriterion("option7 >", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7GreaterThanOrEqualTo(String value) {
            addCriterion("option7 >=", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7LessThan(String value) {
            addCriterion("option7 <", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7LessThanOrEqualTo(String value) {
            addCriterion("option7 <=", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7Like(String value) {
            addCriterion("option7 like", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7NotLike(String value) {
            addCriterion("option7 not like", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7In(List<String> values) {
            addCriterion("option7 in", values, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7NotIn(List<String> values) {
            addCriterion("option7 not in", values, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7Between(String value1, String value2) {
            addCriterion("option7 between", value1, value2, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7NotBetween(String value1, String value2) {
            addCriterion("option7 not between", value1, value2, "option7");
            return (Criteria) this;
        }

        public Criteria andOption8IsNull() {
            addCriterion("option8 is null");
            return (Criteria) this;
        }

        public Criteria andOption8IsNotNull() {
            addCriterion("option8 is not null");
            return (Criteria) this;
        }

        public Criteria andOption8EqualTo(String value) {
            addCriterion("option8 =", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8NotEqualTo(String value) {
            addCriterion("option8 <>", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8GreaterThan(String value) {
            addCriterion("option8 >", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8GreaterThanOrEqualTo(String value) {
            addCriterion("option8 >=", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8LessThan(String value) {
            addCriterion("option8 <", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8LessThanOrEqualTo(String value) {
            addCriterion("option8 <=", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8Like(String value) {
            addCriterion("option8 like", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8NotLike(String value) {
            addCriterion("option8 not like", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8In(List<String> values) {
            addCriterion("option8 in", values, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8NotIn(List<String> values) {
            addCriterion("option8 not in", values, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8Between(String value1, String value2) {
            addCriterion("option8 between", value1, value2, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8NotBetween(String value1, String value2) {
            addCriterion("option8 not between", value1, value2, "option8");
            return (Criteria) this;
        }

        public Criteria andOption9IsNull() {
            addCriterion("option9 is null");
            return (Criteria) this;
        }

        public Criteria andOption9IsNotNull() {
            addCriterion("option9 is not null");
            return (Criteria) this;
        }

        public Criteria andOption9EqualTo(String value) {
            addCriterion("option9 =", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9NotEqualTo(String value) {
            addCriterion("option9 <>", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9GreaterThan(String value) {
            addCriterion("option9 >", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9GreaterThanOrEqualTo(String value) {
            addCriterion("option9 >=", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9LessThan(String value) {
            addCriterion("option9 <", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9LessThanOrEqualTo(String value) {
            addCriterion("option9 <=", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9Like(String value) {
            addCriterion("option9 like", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9NotLike(String value) {
            addCriterion("option9 not like", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9In(List<String> values) {
            addCriterion("option9 in", values, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9NotIn(List<String> values) {
            addCriterion("option9 not in", values, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9Between(String value1, String value2) {
            addCriterion("option9 between", value1, value2, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9NotBetween(String value1, String value2) {
            addCriterion("option9 not between", value1, value2, "option9");
            return (Criteria) this;
        }

        public Criteria andOption10IsNull() {
            addCriterion("option10 is null");
            return (Criteria) this;
        }

        public Criteria andOption10IsNotNull() {
            addCriterion("option10 is not null");
            return (Criteria) this;
        }

        public Criteria andOption10EqualTo(String value) {
            addCriterion("option10 =", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10NotEqualTo(String value) {
            addCriterion("option10 <>", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10GreaterThan(String value) {
            addCriterion("option10 >", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10GreaterThanOrEqualTo(String value) {
            addCriterion("option10 >=", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10LessThan(String value) {
            addCriterion("option10 <", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10LessThanOrEqualTo(String value) {
            addCriterion("option10 <=", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10Like(String value) {
            addCriterion("option10 like", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10NotLike(String value) {
            addCriterion("option10 not like", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10In(List<String> values) {
            addCriterion("option10 in", values, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10NotIn(List<String> values) {
            addCriterion("option10 not in", values, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10Between(String value1, String value2) {
            addCriterion("option10 between", value1, value2, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10NotBetween(String value1, String value2) {
            addCriterion("option10 not between", value1, value2, "option10");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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