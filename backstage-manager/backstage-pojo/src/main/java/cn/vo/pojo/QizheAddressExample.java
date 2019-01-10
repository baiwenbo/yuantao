package cn.vo.pojo;

import java.util.ArrayList;
import java.util.List;

public class QizheAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QizheAddressExample() {
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

        public Criteria andQgongsiIsNull() {
            addCriterion("qgongsi is null");
            return (Criteria) this;
        }

        public Criteria andQgongsiIsNotNull() {
            addCriterion("qgongsi is not null");
            return (Criteria) this;
        }

        public Criteria andQgongsiEqualTo(String value) {
            addCriterion("qgongsi =", value, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andQgongsiNotEqualTo(String value) {
            addCriterion("qgongsi <>", value, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andQgongsiGreaterThan(String value) {
            addCriterion("qgongsi >", value, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andQgongsiGreaterThanOrEqualTo(String value) {
            addCriterion("qgongsi >=", value, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andQgongsiLessThan(String value) {
            addCriterion("qgongsi <", value, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andQgongsiLessThanOrEqualTo(String value) {
            addCriterion("qgongsi <=", value, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andQgongsiLike(String value) {
            addCriterion("qgongsi like", value, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andQgongsiNotLike(String value) {
            addCriterion("qgongsi not like", value, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andQgongsiIn(List<String> values) {
            addCriterion("qgongsi in", values, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andQgongsiNotIn(List<String> values) {
            addCriterion("qgongsi not in", values, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andQgongsiBetween(String value1, String value2) {
            addCriterion("qgongsi between", value1, value2, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andQgongsiNotBetween(String value1, String value2) {
            addCriterion("qgongsi not between", value1, value2, "qgongsi");
            return (Criteria) this;
        }

        public Criteria andBumenIsNull() {
            addCriterion("bumen is null");
            return (Criteria) this;
        }

        public Criteria andBumenIsNotNull() {
            addCriterion("bumen is not null");
            return (Criteria) this;
        }

        public Criteria andBumenEqualTo(String value) {
            addCriterion("bumen =", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotEqualTo(String value) {
            addCriterion("bumen <>", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThan(String value) {
            addCriterion("bumen >", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThanOrEqualTo(String value) {
            addCriterion("bumen >=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThan(String value) {
            addCriterion("bumen <", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThanOrEqualTo(String value) {
            addCriterion("bumen <=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLike(String value) {
            addCriterion("bumen like", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotLike(String value) {
            addCriterion("bumen not like", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenIn(List<String> values) {
            addCriterion("bumen in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotIn(List<String> values) {
            addCriterion("bumen not in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenBetween(String value1, String value2) {
            addCriterion("bumen between", value1, value2, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotBetween(String value1, String value2) {
            addCriterion("bumen not between", value1, value2, "bumen");
            return (Criteria) this;
        }

        public Criteria andQbianhaoIsNull() {
            addCriterion("qbianhao is null");
            return (Criteria) this;
        }

        public Criteria andQbianhaoIsNotNull() {
            addCriterion("qbianhao is not null");
            return (Criteria) this;
        }

        public Criteria andQbianhaoEqualTo(String value) {
            addCriterion("qbianhao =", value, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQbianhaoNotEqualTo(String value) {
            addCriterion("qbianhao <>", value, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQbianhaoGreaterThan(String value) {
            addCriterion("qbianhao >", value, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQbianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("qbianhao >=", value, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQbianhaoLessThan(String value) {
            addCriterion("qbianhao <", value, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQbianhaoLessThanOrEqualTo(String value) {
            addCriterion("qbianhao <=", value, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQbianhaoLike(String value) {
            addCriterion("qbianhao like", value, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQbianhaoNotLike(String value) {
            addCriterion("qbianhao not like", value, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQbianhaoIn(List<String> values) {
            addCriterion("qbianhao in", values, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQbianhaoNotIn(List<String> values) {
            addCriterion("qbianhao not in", values, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQbianhaoBetween(String value1, String value2) {
            addCriterion("qbianhao between", value1, value2, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQbianhaoNotBetween(String value1, String value2) {
            addCriterion("qbianhao not between", value1, value2, "qbianhao");
            return (Criteria) this;
        }

        public Criteria andQnameIsNull() {
            addCriterion("qname is null");
            return (Criteria) this;
        }

        public Criteria andQnameIsNotNull() {
            addCriterion("qname is not null");
            return (Criteria) this;
        }

        public Criteria andQnameEqualTo(String value) {
            addCriterion("qname =", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotEqualTo(String value) {
            addCriterion("qname <>", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameGreaterThan(String value) {
            addCriterion("qname >", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameGreaterThanOrEqualTo(String value) {
            addCriterion("qname >=", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLessThan(String value) {
            addCriterion("qname <", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLessThanOrEqualTo(String value) {
            addCriterion("qname <=", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLike(String value) {
            addCriterion("qname like", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotLike(String value) {
            addCriterion("qname not like", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameIn(List<String> values) {
            addCriterion("qname in", values, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotIn(List<String> values) {
            addCriterion("qname not in", values, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameBetween(String value1, String value2) {
            addCriterion("qname between", value1, value2, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotBetween(String value1, String value2) {
            addCriterion("qname not between", value1, value2, "qname");
            return (Criteria) this;
        }

        public Criteria andQnamehaoIsNull() {
            addCriterion("qnamehao is null");
            return (Criteria) this;
        }

        public Criteria andQnamehaoIsNotNull() {
            addCriterion("qnamehao is not null");
            return (Criteria) this;
        }

        public Criteria andQnamehaoEqualTo(String value) {
            addCriterion("qnamehao =", value, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andQnamehaoNotEqualTo(String value) {
            addCriterion("qnamehao <>", value, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andQnamehaoGreaterThan(String value) {
            addCriterion("qnamehao >", value, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andQnamehaoGreaterThanOrEqualTo(String value) {
            addCriterion("qnamehao >=", value, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andQnamehaoLessThan(String value) {
            addCriterion("qnamehao <", value, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andQnamehaoLessThanOrEqualTo(String value) {
            addCriterion("qnamehao <=", value, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andQnamehaoLike(String value) {
            addCriterion("qnamehao like", value, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andQnamehaoNotLike(String value) {
            addCriterion("qnamehao not like", value, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andQnamehaoIn(List<String> values) {
            addCriterion("qnamehao in", values, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andQnamehaoNotIn(List<String> values) {
            addCriterion("qnamehao not in", values, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andQnamehaoBetween(String value1, String value2) {
            addCriterion("qnamehao between", value1, value2, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andQnamehaoNotBetween(String value1, String value2) {
            addCriterion("qnamehao not between", value1, value2, "qnamehao");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andA01smIsNull() {
            addCriterion("a01sm is null");
            return (Criteria) this;
        }

        public Criteria andA01smIsNotNull() {
            addCriterion("a01sm is not null");
            return (Criteria) this;
        }

        public Criteria andA01smEqualTo(String value) {
            addCriterion("a01sm =", value, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA01smNotEqualTo(String value) {
            addCriterion("a01sm <>", value, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA01smGreaterThan(String value) {
            addCriterion("a01sm >", value, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA01smGreaterThanOrEqualTo(String value) {
            addCriterion("a01sm >=", value, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA01smLessThan(String value) {
            addCriterion("a01sm <", value, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA01smLessThanOrEqualTo(String value) {
            addCriterion("a01sm <=", value, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA01smLike(String value) {
            addCriterion("a01sm like", value, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA01smNotLike(String value) {
            addCriterion("a01sm not like", value, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA01smIn(List<String> values) {
            addCriterion("a01sm in", values, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA01smNotIn(List<String> values) {
            addCriterion("a01sm not in", values, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA01smBetween(String value1, String value2) {
            addCriterion("a01sm between", value1, value2, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA01smNotBetween(String value1, String value2) {
            addCriterion("a01sm not between", value1, value2, "a01sm");
            return (Criteria) this;
        }

        public Criteria andA02smIsNull() {
            addCriterion("a02sm is null");
            return (Criteria) this;
        }

        public Criteria andA02smIsNotNull() {
            addCriterion("a02sm is not null");
            return (Criteria) this;
        }

        public Criteria andA02smEqualTo(String value) {
            addCriterion("a02sm =", value, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA02smNotEqualTo(String value) {
            addCriterion("a02sm <>", value, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA02smGreaterThan(String value) {
            addCriterion("a02sm >", value, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA02smGreaterThanOrEqualTo(String value) {
            addCriterion("a02sm >=", value, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA02smLessThan(String value) {
            addCriterion("a02sm <", value, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA02smLessThanOrEqualTo(String value) {
            addCriterion("a02sm <=", value, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA02smLike(String value) {
            addCriterion("a02sm like", value, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA02smNotLike(String value) {
            addCriterion("a02sm not like", value, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA02smIn(List<String> values) {
            addCriterion("a02sm in", values, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA02smNotIn(List<String> values) {
            addCriterion("a02sm not in", values, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA02smBetween(String value1, String value2) {
            addCriterion("a02sm between", value1, value2, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA02smNotBetween(String value1, String value2) {
            addCriterion("a02sm not between", value1, value2, "a02sm");
            return (Criteria) this;
        }

        public Criteria andA03smIsNull() {
            addCriterion("a03sm is null");
            return (Criteria) this;
        }

        public Criteria andA03smIsNotNull() {
            addCriterion("a03sm is not null");
            return (Criteria) this;
        }

        public Criteria andA03smEqualTo(String value) {
            addCriterion("a03sm =", value, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA03smNotEqualTo(String value) {
            addCriterion("a03sm <>", value, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA03smGreaterThan(String value) {
            addCriterion("a03sm >", value, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA03smGreaterThanOrEqualTo(String value) {
            addCriterion("a03sm >=", value, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA03smLessThan(String value) {
            addCriterion("a03sm <", value, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA03smLessThanOrEqualTo(String value) {
            addCriterion("a03sm <=", value, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA03smLike(String value) {
            addCriterion("a03sm like", value, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA03smNotLike(String value) {
            addCriterion("a03sm not like", value, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA03smIn(List<String> values) {
            addCriterion("a03sm in", values, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA03smNotIn(List<String> values) {
            addCriterion("a03sm not in", values, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA03smBetween(String value1, String value2) {
            addCriterion("a03sm between", value1, value2, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA03smNotBetween(String value1, String value2) {
            addCriterion("a03sm not between", value1, value2, "a03sm");
            return (Criteria) this;
        }

        public Criteria andA04smIsNull() {
            addCriterion("a04sm is null");
            return (Criteria) this;
        }

        public Criteria andA04smIsNotNull() {
            addCriterion("a04sm is not null");
            return (Criteria) this;
        }

        public Criteria andA04smEqualTo(String value) {
            addCriterion("a04sm =", value, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA04smNotEqualTo(String value) {
            addCriterion("a04sm <>", value, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA04smGreaterThan(String value) {
            addCriterion("a04sm >", value, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA04smGreaterThanOrEqualTo(String value) {
            addCriterion("a04sm >=", value, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA04smLessThan(String value) {
            addCriterion("a04sm <", value, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA04smLessThanOrEqualTo(String value) {
            addCriterion("a04sm <=", value, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA04smLike(String value) {
            addCriterion("a04sm like", value, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA04smNotLike(String value) {
            addCriterion("a04sm not like", value, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA04smIn(List<String> values) {
            addCriterion("a04sm in", values, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA04smNotIn(List<String> values) {
            addCriterion("a04sm not in", values, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA04smBetween(String value1, String value2) {
            addCriterion("a04sm between", value1, value2, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA04smNotBetween(String value1, String value2) {
            addCriterion("a04sm not between", value1, value2, "a04sm");
            return (Criteria) this;
        }

        public Criteria andA05smIsNull() {
            addCriterion("a05sm is null");
            return (Criteria) this;
        }

        public Criteria andA05smIsNotNull() {
            addCriterion("a05sm is not null");
            return (Criteria) this;
        }

        public Criteria andA05smEqualTo(String value) {
            addCriterion("a05sm =", value, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA05smNotEqualTo(String value) {
            addCriterion("a05sm <>", value, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA05smGreaterThan(String value) {
            addCriterion("a05sm >", value, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA05smGreaterThanOrEqualTo(String value) {
            addCriterion("a05sm >=", value, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA05smLessThan(String value) {
            addCriterion("a05sm <", value, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA05smLessThanOrEqualTo(String value) {
            addCriterion("a05sm <=", value, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA05smLike(String value) {
            addCriterion("a05sm like", value, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA05smNotLike(String value) {
            addCriterion("a05sm not like", value, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA05smIn(List<String> values) {
            addCriterion("a05sm in", values, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA05smNotIn(List<String> values) {
            addCriterion("a05sm not in", values, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA05smBetween(String value1, String value2) {
            addCriterion("a05sm between", value1, value2, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA05smNotBetween(String value1, String value2) {
            addCriterion("a05sm not between", value1, value2, "a05sm");
            return (Criteria) this;
        }

        public Criteria andA06smIsNull() {
            addCriterion("a06sm is null");
            return (Criteria) this;
        }

        public Criteria andA06smIsNotNull() {
            addCriterion("a06sm is not null");
            return (Criteria) this;
        }

        public Criteria andA06smEqualTo(String value) {
            addCriterion("a06sm =", value, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA06smNotEqualTo(String value) {
            addCriterion("a06sm <>", value, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA06smGreaterThan(String value) {
            addCriterion("a06sm >", value, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA06smGreaterThanOrEqualTo(String value) {
            addCriterion("a06sm >=", value, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA06smLessThan(String value) {
            addCriterion("a06sm <", value, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA06smLessThanOrEqualTo(String value) {
            addCriterion("a06sm <=", value, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA06smLike(String value) {
            addCriterion("a06sm like", value, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA06smNotLike(String value) {
            addCriterion("a06sm not like", value, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA06smIn(List<String> values) {
            addCriterion("a06sm in", values, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA06smNotIn(List<String> values) {
            addCriterion("a06sm not in", values, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA06smBetween(String value1, String value2) {
            addCriterion("a06sm between", value1, value2, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA06smNotBetween(String value1, String value2) {
            addCriterion("a06sm not between", value1, value2, "a06sm");
            return (Criteria) this;
        }

        public Criteria andA07smIsNull() {
            addCriterion("a07sm is null");
            return (Criteria) this;
        }

        public Criteria andA07smIsNotNull() {
            addCriterion("a07sm is not null");
            return (Criteria) this;
        }

        public Criteria andA07smEqualTo(String value) {
            addCriterion("a07sm =", value, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA07smNotEqualTo(String value) {
            addCriterion("a07sm <>", value, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA07smGreaterThan(String value) {
            addCriterion("a07sm >", value, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA07smGreaterThanOrEqualTo(String value) {
            addCriterion("a07sm >=", value, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA07smLessThan(String value) {
            addCriterion("a07sm <", value, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA07smLessThanOrEqualTo(String value) {
            addCriterion("a07sm <=", value, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA07smLike(String value) {
            addCriterion("a07sm like", value, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA07smNotLike(String value) {
            addCriterion("a07sm not like", value, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA07smIn(List<String> values) {
            addCriterion("a07sm in", values, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA07smNotIn(List<String> values) {
            addCriterion("a07sm not in", values, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA07smBetween(String value1, String value2) {
            addCriterion("a07sm between", value1, value2, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA07smNotBetween(String value1, String value2) {
            addCriterion("a07sm not between", value1, value2, "a07sm");
            return (Criteria) this;
        }

        public Criteria andA08smIsNull() {
            addCriterion("a08sm is null");
            return (Criteria) this;
        }

        public Criteria andA08smIsNotNull() {
            addCriterion("a08sm is not null");
            return (Criteria) this;
        }

        public Criteria andA08smEqualTo(String value) {
            addCriterion("a08sm =", value, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA08smNotEqualTo(String value) {
            addCriterion("a08sm <>", value, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA08smGreaterThan(String value) {
            addCriterion("a08sm >", value, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA08smGreaterThanOrEqualTo(String value) {
            addCriterion("a08sm >=", value, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA08smLessThan(String value) {
            addCriterion("a08sm <", value, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA08smLessThanOrEqualTo(String value) {
            addCriterion("a08sm <=", value, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA08smLike(String value) {
            addCriterion("a08sm like", value, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA08smNotLike(String value) {
            addCriterion("a08sm not like", value, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA08smIn(List<String> values) {
            addCriterion("a08sm in", values, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA08smNotIn(List<String> values) {
            addCriterion("a08sm not in", values, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA08smBetween(String value1, String value2) {
            addCriterion("a08sm between", value1, value2, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA08smNotBetween(String value1, String value2) {
            addCriterion("a08sm not between", value1, value2, "a08sm");
            return (Criteria) this;
        }

        public Criteria andA09smIsNull() {
            addCriterion("a09sm is null");
            return (Criteria) this;
        }

        public Criteria andA09smIsNotNull() {
            addCriterion("a09sm is not null");
            return (Criteria) this;
        }

        public Criteria andA09smEqualTo(String value) {
            addCriterion("a09sm =", value, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA09smNotEqualTo(String value) {
            addCriterion("a09sm <>", value, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA09smGreaterThan(String value) {
            addCriterion("a09sm >", value, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA09smGreaterThanOrEqualTo(String value) {
            addCriterion("a09sm >=", value, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA09smLessThan(String value) {
            addCriterion("a09sm <", value, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA09smLessThanOrEqualTo(String value) {
            addCriterion("a09sm <=", value, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA09smLike(String value) {
            addCriterion("a09sm like", value, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA09smNotLike(String value) {
            addCriterion("a09sm not like", value, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA09smIn(List<String> values) {
            addCriterion("a09sm in", values, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA09smNotIn(List<String> values) {
            addCriterion("a09sm not in", values, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA09smBetween(String value1, String value2) {
            addCriterion("a09sm between", value1, value2, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA09smNotBetween(String value1, String value2) {
            addCriterion("a09sm not between", value1, value2, "a09sm");
            return (Criteria) this;
        }

        public Criteria andA10smIsNull() {
            addCriterion("a10sm is null");
            return (Criteria) this;
        }

        public Criteria andA10smIsNotNull() {
            addCriterion("a10sm is not null");
            return (Criteria) this;
        }

        public Criteria andA10smEqualTo(String value) {
            addCriterion("a10sm =", value, "a10sm");
            return (Criteria) this;
        }

        public Criteria andA10smNotEqualTo(String value) {
            addCriterion("a10sm <>", value, "a10sm");
            return (Criteria) this;
        }

        public Criteria andA10smGreaterThan(String value) {
            addCriterion("a10sm >", value, "a10sm");
            return (Criteria) this;
        }

        public Criteria andA10smGreaterThanOrEqualTo(String value) {
            addCriterion("a10sm >=", value, "a10sm");
            return (Criteria) this;
        }

        public Criteria andA10smLessThan(String value) {
            addCriterion("a10sm <", value, "a10sm");
            return (Criteria) this;
        }

        public Criteria andA10smLessThanOrEqualTo(String value) {
            addCriterion("a10sm <=", value, "a10sm");
            return (Criteria) this;
        }

        public Criteria andA10smLike(String value) {
            addCriterion("a10sm like", value, "a10sm");
            return (Criteria) this;
        }

        public Criteria andA10smNotLike(String value) {
            addCriterion("a10sm not like", value, "a10sm");
            return (Criteria) this;
        }

        public Criteria andA10smIn(List<String> values) {
            addCriterion("a10sm in", values, "a10sm");
            return (Criteria) this;
        }

        public Criteria andA10smNotIn(List<String> values) {
            addCriterion("a10sm not in", values, "a10sm");
            return (Criteria) this;
        }

        public Criteria andA10smBetween(String value1, String value2) {
            addCriterion("a10sm between", value1, value2, "a10sm");
            return (Criteria) this;
        }

        public Criteria andA10smNotBetween(String value1, String value2) {
            addCriterion("a10sm not between", value1, value2, "a10sm");
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