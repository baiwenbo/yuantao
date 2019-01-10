package cn.vo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QizheScpcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QizheScpcExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWcIsNull() {
            addCriterion("wc is null");
            return (Criteria) this;
        }

        public Criteria andWcIsNotNull() {
            addCriterion("wc is not null");
            return (Criteria) this;
        }

        public Criteria andWcEqualTo(String value) {
            addCriterion("wc =", value, "wc");
            return (Criteria) this;
        }

        public Criteria andWcNotEqualTo(String value) {
            addCriterion("wc <>", value, "wc");
            return (Criteria) this;
        }

        public Criteria andWcGreaterThan(String value) {
            addCriterion("wc >", value, "wc");
            return (Criteria) this;
        }

        public Criteria andWcGreaterThanOrEqualTo(String value) {
            addCriterion("wc >=", value, "wc");
            return (Criteria) this;
        }

        public Criteria andWcLessThan(String value) {
            addCriterion("wc <", value, "wc");
            return (Criteria) this;
        }

        public Criteria andWcLessThanOrEqualTo(String value) {
            addCriterion("wc <=", value, "wc");
            return (Criteria) this;
        }

        public Criteria andWcLike(String value) {
            addCriterion("wc like", value, "wc");
            return (Criteria) this;
        }

        public Criteria andWcNotLike(String value) {
            addCriterion("wc not like", value, "wc");
            return (Criteria) this;
        }

        public Criteria andWcIn(List<String> values) {
            addCriterion("wc in", values, "wc");
            return (Criteria) this;
        }

        public Criteria andWcNotIn(List<String> values) {
            addCriterion("wc not in", values, "wc");
            return (Criteria) this;
        }

        public Criteria andWcBetween(String value1, String value2) {
            addCriterion("wc between", value1, value2, "wc");
            return (Criteria) this;
        }

        public Criteria andWcNotBetween(String value1, String value2) {
            addCriterion("wc not between", value1, value2, "wc");
            return (Criteria) this;
        }

        public Criteria andBianliIsNull() {
            addCriterion("bianli is null");
            return (Criteria) this;
        }

        public Criteria andBianliIsNotNull() {
            addCriterion("bianli is not null");
            return (Criteria) this;
        }

        public Criteria andBianliEqualTo(String value) {
            addCriterion("bianli =", value, "bianli");
            return (Criteria) this;
        }

        public Criteria andBianliNotEqualTo(String value) {
            addCriterion("bianli <>", value, "bianli");
            return (Criteria) this;
        }

        public Criteria andBianliGreaterThan(String value) {
            addCriterion("bianli >", value, "bianli");
            return (Criteria) this;
        }

        public Criteria andBianliGreaterThanOrEqualTo(String value) {
            addCriterion("bianli >=", value, "bianli");
            return (Criteria) this;
        }

        public Criteria andBianliLessThan(String value) {
            addCriterion("bianli <", value, "bianli");
            return (Criteria) this;
        }

        public Criteria andBianliLessThanOrEqualTo(String value) {
            addCriterion("bianli <=", value, "bianli");
            return (Criteria) this;
        }

        public Criteria andBianliLike(String value) {
            addCriterion("bianli like", value, "bianli");
            return (Criteria) this;
        }

        public Criteria andBianliNotLike(String value) {
            addCriterion("bianli not like", value, "bianli");
            return (Criteria) this;
        }

        public Criteria andBianliIn(List<String> values) {
            addCriterion("bianli in", values, "bianli");
            return (Criteria) this;
        }

        public Criteria andBianliNotIn(List<String> values) {
            addCriterion("bianli not in", values, "bianli");
            return (Criteria) this;
        }

        public Criteria andBianliBetween(String value1, String value2) {
            addCriterion("bianli between", value1, value2, "bianli");
            return (Criteria) this;
        }

        public Criteria andBianliNotBetween(String value1, String value2) {
            addCriterion("bianli not between", value1, value2, "bianli");
            return (Criteria) this;
        }

        public Criteria andNewdateIsNull() {
            addCriterion("newdate is null");
            return (Criteria) this;
        }

        public Criteria andNewdateIsNotNull() {
            addCriterion("newdate is not null");
            return (Criteria) this;
        }

        public Criteria andNewdateEqualTo(Date value) {
            addCriterion("newdate =", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotEqualTo(Date value) {
            addCriterion("newdate <>", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateGreaterThan(Date value) {
            addCriterion("newdate >", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateGreaterThanOrEqualTo(Date value) {
            addCriterion("newdate >=", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateLessThan(Date value) {
            addCriterion("newdate <", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateLessThanOrEqualTo(Date value) {
            addCriterion("newdate <=", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateIn(List<Date> values) {
            addCriterion("newdate in", values, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotIn(List<Date> values) {
            addCriterion("newdate not in", values, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateBetween(Date value1, Date value2) {
            addCriterion("newdate between", value1, value2, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotBetween(Date value1, Date value2) {
            addCriterion("newdate not between", value1, value2, "newdate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateIsNull() {
            addCriterion("jinzhandate is null");
            return (Criteria) this;
        }

        public Criteria andJinzhandateIsNotNull() {
            addCriterion("jinzhandate is not null");
            return (Criteria) this;
        }

        public Criteria andJinzhandateEqualTo(String value) {
            addCriterion("jinzhandate =", value, "jinzhandate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateNotEqualTo(String value) {
            addCriterion("jinzhandate <>", value, "jinzhandate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateGreaterThan(String value) {
            addCriterion("jinzhandate >", value, "jinzhandate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateGreaterThanOrEqualTo(String value) {
            addCriterion("jinzhandate >=", value, "jinzhandate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateLessThan(String value) {
            addCriterion("jinzhandate <", value, "jinzhandate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateLessThanOrEqualTo(String value) {
            addCriterion("jinzhandate <=", value, "jinzhandate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateLike(String value) {
            addCriterion("jinzhandate like", value, "jinzhandate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateNotLike(String value) {
            addCriterion("jinzhandate not like", value, "jinzhandate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateIn(List<String> values) {
            addCriterion("jinzhandate in", values, "jinzhandate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateNotIn(List<String> values) {
            addCriterion("jinzhandate not in", values, "jinzhandate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateBetween(String value1, String value2) {
            addCriterion("jinzhandate between", value1, value2, "jinzhandate");
            return (Criteria) this;
        }

        public Criteria andJinzhandateNotBetween(String value1, String value2) {
            addCriterion("jinzhandate not between", value1, value2, "jinzhandate");
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

        public Criteria andJinzhanIsNull() {
            addCriterion("jinzhan is null");
            return (Criteria) this;
        }

        public Criteria andJinzhanIsNotNull() {
            addCriterion("jinzhan is not null");
            return (Criteria) this;
        }

        public Criteria andJinzhanEqualTo(String value) {
            addCriterion("jinzhan =", value, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andJinzhanNotEqualTo(String value) {
            addCriterion("jinzhan <>", value, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andJinzhanGreaterThan(String value) {
            addCriterion("jinzhan >", value, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andJinzhanGreaterThanOrEqualTo(String value) {
            addCriterion("jinzhan >=", value, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andJinzhanLessThan(String value) {
            addCriterion("jinzhan <", value, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andJinzhanLessThanOrEqualTo(String value) {
            addCriterion("jinzhan <=", value, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andJinzhanLike(String value) {
            addCriterion("jinzhan like", value, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andJinzhanNotLike(String value) {
            addCriterion("jinzhan not like", value, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andJinzhanIn(List<String> values) {
            addCriterion("jinzhan in", values, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andJinzhanNotIn(List<String> values) {
            addCriterion("jinzhan not in", values, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andJinzhanBetween(String value1, String value2) {
            addCriterion("jinzhan between", value1, value2, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andJinzhanNotBetween(String value1, String value2) {
            addCriterion("jinzhan not between", value1, value2, "jinzhan");
            return (Criteria) this;
        }

        public Criteria andLizhanIsNull() {
            addCriterion("lizhan is null");
            return (Criteria) this;
        }

        public Criteria andLizhanIsNotNull() {
            addCriterion("lizhan is not null");
            return (Criteria) this;
        }

        public Criteria andLizhanEqualTo(String value) {
            addCriterion("lizhan =", value, "lizhan");
            return (Criteria) this;
        }

        public Criteria andLizhanNotEqualTo(String value) {
            addCriterion("lizhan <>", value, "lizhan");
            return (Criteria) this;
        }

        public Criteria andLizhanGreaterThan(String value) {
            addCriterion("lizhan >", value, "lizhan");
            return (Criteria) this;
        }

        public Criteria andLizhanGreaterThanOrEqualTo(String value) {
            addCriterion("lizhan >=", value, "lizhan");
            return (Criteria) this;
        }

        public Criteria andLizhanLessThan(String value) {
            addCriterion("lizhan <", value, "lizhan");
            return (Criteria) this;
        }

        public Criteria andLizhanLessThanOrEqualTo(String value) {
            addCriterion("lizhan <=", value, "lizhan");
            return (Criteria) this;
        }

        public Criteria andLizhanLike(String value) {
            addCriterion("lizhan like", value, "lizhan");
            return (Criteria) this;
        }

        public Criteria andLizhanNotLike(String value) {
            addCriterion("lizhan not like", value, "lizhan");
            return (Criteria) this;
        }

        public Criteria andLizhanIn(List<String> values) {
            addCriterion("lizhan in", values, "lizhan");
            return (Criteria) this;
        }

        public Criteria andLizhanNotIn(List<String> values) {
            addCriterion("lizhan not in", values, "lizhan");
            return (Criteria) this;
        }

        public Criteria andLizhanBetween(String value1, String value2) {
            addCriterion("lizhan between", value1, value2, "lizhan");
            return (Criteria) this;
        }

        public Criteria andLizhanNotBetween(String value1, String value2) {
            addCriterion("lizhan not between", value1, value2, "lizhan");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andQscoreIsNull() {
            addCriterion("qscore is null");
            return (Criteria) this;
        }

        public Criteria andQscoreIsNotNull() {
            addCriterion("qscore is not null");
            return (Criteria) this;
        }

        public Criteria andQscoreEqualTo(String value) {
            addCriterion("qscore =", value, "qscore");
            return (Criteria) this;
        }

        public Criteria andQscoreNotEqualTo(String value) {
            addCriterion("qscore <>", value, "qscore");
            return (Criteria) this;
        }

        public Criteria andQscoreGreaterThan(String value) {
            addCriterion("qscore >", value, "qscore");
            return (Criteria) this;
        }

        public Criteria andQscoreGreaterThanOrEqualTo(String value) {
            addCriterion("qscore >=", value, "qscore");
            return (Criteria) this;
        }

        public Criteria andQscoreLessThan(String value) {
            addCriterion("qscore <", value, "qscore");
            return (Criteria) this;
        }

        public Criteria andQscoreLessThanOrEqualTo(String value) {
            addCriterion("qscore <=", value, "qscore");
            return (Criteria) this;
        }

        public Criteria andQscoreLike(String value) {
            addCriterion("qscore like", value, "qscore");
            return (Criteria) this;
        }

        public Criteria andQscoreNotLike(String value) {
            addCriterion("qscore not like", value, "qscore");
            return (Criteria) this;
        }

        public Criteria andQscoreIn(List<String> values) {
            addCriterion("qscore in", values, "qscore");
            return (Criteria) this;
        }

        public Criteria andQscoreNotIn(List<String> values) {
            addCriterion("qscore not in", values, "qscore");
            return (Criteria) this;
        }

        public Criteria andQscoreBetween(String value1, String value2) {
            addCriterion("qscore between", value1, value2, "qscore");
            return (Criteria) this;
        }

        public Criteria andQscoreNotBetween(String value1, String value2) {
            addCriterion("qscore not between", value1, value2, "qscore");
            return (Criteria) this;
        }

        public Criteria andAfIsNull() {
            addCriterion("af is null");
            return (Criteria) this;
        }

        public Criteria andAfIsNotNull() {
            addCriterion("af is not null");
            return (Criteria) this;
        }

        public Criteria andAfEqualTo(String value) {
            addCriterion("af =", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfNotEqualTo(String value) {
            addCriterion("af <>", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfGreaterThan(String value) {
            addCriterion("af >", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfGreaterThanOrEqualTo(String value) {
            addCriterion("af >=", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfLessThan(String value) {
            addCriterion("af <", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfLessThanOrEqualTo(String value) {
            addCriterion("af <=", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfLike(String value) {
            addCriterion("af like", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfNotLike(String value) {
            addCriterion("af not like", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfIn(List<String> values) {
            addCriterion("af in", values, "af");
            return (Criteria) this;
        }

        public Criteria andAfNotIn(List<String> values) {
            addCriterion("af not in", values, "af");
            return (Criteria) this;
        }

        public Criteria andAfBetween(String value1, String value2) {
            addCriterion("af between", value1, value2, "af");
            return (Criteria) this;
        }

        public Criteria andAfNotBetween(String value1, String value2) {
            addCriterion("af not between", value1, value2, "af");
            return (Criteria) this;
        }

        public Criteria andBfIsNull() {
            addCriterion("bf is null");
            return (Criteria) this;
        }

        public Criteria andBfIsNotNull() {
            addCriterion("bf is not null");
            return (Criteria) this;
        }

        public Criteria andBfEqualTo(String value) {
            addCriterion("bf =", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfNotEqualTo(String value) {
            addCriterion("bf <>", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfGreaterThan(String value) {
            addCriterion("bf >", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfGreaterThanOrEqualTo(String value) {
            addCriterion("bf >=", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfLessThan(String value) {
            addCriterion("bf <", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfLessThanOrEqualTo(String value) {
            addCriterion("bf <=", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfLike(String value) {
            addCriterion("bf like", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfNotLike(String value) {
            addCriterion("bf not like", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfIn(List<String> values) {
            addCriterion("bf in", values, "bf");
            return (Criteria) this;
        }

        public Criteria andBfNotIn(List<String> values) {
            addCriterion("bf not in", values, "bf");
            return (Criteria) this;
        }

        public Criteria andBfBetween(String value1, String value2) {
            addCriterion("bf between", value1, value2, "bf");
            return (Criteria) this;
        }

        public Criteria andBfNotBetween(String value1, String value2) {
            addCriterion("bf not between", value1, value2, "bf");
            return (Criteria) this;
        }

        public Criteria andCfIsNull() {
            addCriterion("cf is null");
            return (Criteria) this;
        }

        public Criteria andCfIsNotNull() {
            addCriterion("cf is not null");
            return (Criteria) this;
        }

        public Criteria andCfEqualTo(String value) {
            addCriterion("cf =", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotEqualTo(String value) {
            addCriterion("cf <>", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfGreaterThan(String value) {
            addCriterion("cf >", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfGreaterThanOrEqualTo(String value) {
            addCriterion("cf >=", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLessThan(String value) {
            addCriterion("cf <", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLessThanOrEqualTo(String value) {
            addCriterion("cf <=", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLike(String value) {
            addCriterion("cf like", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotLike(String value) {
            addCriterion("cf not like", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfIn(List<String> values) {
            addCriterion("cf in", values, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotIn(List<String> values) {
            addCriterion("cf not in", values, "cf");
            return (Criteria) this;
        }

        public Criteria andCfBetween(String value1, String value2) {
            addCriterion("cf between", value1, value2, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotBetween(String value1, String value2) {
            addCriterion("cf not between", value1, value2, "cf");
            return (Criteria) this;
        }

        public Criteria andDfIsNull() {
            addCriterion("df is null");
            return (Criteria) this;
        }

        public Criteria andDfIsNotNull() {
            addCriterion("df is not null");
            return (Criteria) this;
        }

        public Criteria andDfEqualTo(String value) {
            addCriterion("df =", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfNotEqualTo(String value) {
            addCriterion("df <>", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfGreaterThan(String value) {
            addCriterion("df >", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfGreaterThanOrEqualTo(String value) {
            addCriterion("df >=", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfLessThan(String value) {
            addCriterion("df <", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfLessThanOrEqualTo(String value) {
            addCriterion("df <=", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfLike(String value) {
            addCriterion("df like", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfNotLike(String value) {
            addCriterion("df not like", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfIn(List<String> values) {
            addCriterion("df in", values, "df");
            return (Criteria) this;
        }

        public Criteria andDfNotIn(List<String> values) {
            addCriterion("df not in", values, "df");
            return (Criteria) this;
        }

        public Criteria andDfBetween(String value1, String value2) {
            addCriterion("df between", value1, value2, "df");
            return (Criteria) this;
        }

        public Criteria andDfNotBetween(String value1, String value2) {
            addCriterion("df not between", value1, value2, "df");
            return (Criteria) this;
        }

        public Criteria andEfIsNull() {
            addCriterion("ef is null");
            return (Criteria) this;
        }

        public Criteria andEfIsNotNull() {
            addCriterion("ef is not null");
            return (Criteria) this;
        }

        public Criteria andEfEqualTo(String value) {
            addCriterion("ef =", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotEqualTo(String value) {
            addCriterion("ef <>", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfGreaterThan(String value) {
            addCriterion("ef >", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfGreaterThanOrEqualTo(String value) {
            addCriterion("ef >=", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLessThan(String value) {
            addCriterion("ef <", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLessThanOrEqualTo(String value) {
            addCriterion("ef <=", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLike(String value) {
            addCriterion("ef like", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotLike(String value) {
            addCriterion("ef not like", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfIn(List<String> values) {
            addCriterion("ef in", values, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotIn(List<String> values) {
            addCriterion("ef not in", values, "ef");
            return (Criteria) this;
        }

        public Criteria andEfBetween(String value1, String value2) {
            addCriterion("ef between", value1, value2, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotBetween(String value1, String value2) {
            addCriterion("ef not between", value1, value2, "ef");
            return (Criteria) this;
        }

        public Criteria andFfIsNull() {
            addCriterion("ff is null");
            return (Criteria) this;
        }

        public Criteria andFfIsNotNull() {
            addCriterion("ff is not null");
            return (Criteria) this;
        }

        public Criteria andFfEqualTo(String value) {
            addCriterion("ff =", value, "ff");
            return (Criteria) this;
        }

        public Criteria andFfNotEqualTo(String value) {
            addCriterion("ff <>", value, "ff");
            return (Criteria) this;
        }

        public Criteria andFfGreaterThan(String value) {
            addCriterion("ff >", value, "ff");
            return (Criteria) this;
        }

        public Criteria andFfGreaterThanOrEqualTo(String value) {
            addCriterion("ff >=", value, "ff");
            return (Criteria) this;
        }

        public Criteria andFfLessThan(String value) {
            addCriterion("ff <", value, "ff");
            return (Criteria) this;
        }

        public Criteria andFfLessThanOrEqualTo(String value) {
            addCriterion("ff <=", value, "ff");
            return (Criteria) this;
        }

        public Criteria andFfLike(String value) {
            addCriterion("ff like", value, "ff");
            return (Criteria) this;
        }

        public Criteria andFfNotLike(String value) {
            addCriterion("ff not like", value, "ff");
            return (Criteria) this;
        }

        public Criteria andFfIn(List<String> values) {
            addCriterion("ff in", values, "ff");
            return (Criteria) this;
        }

        public Criteria andFfNotIn(List<String> values) {
            addCriterion("ff not in", values, "ff");
            return (Criteria) this;
        }

        public Criteria andFfBetween(String value1, String value2) {
            addCriterion("ff between", value1, value2, "ff");
            return (Criteria) this;
        }

        public Criteria andFfNotBetween(String value1, String value2) {
            addCriterion("ff not between", value1, value2, "ff");
            return (Criteria) this;
        }

        public Criteria andGfIsNull() {
            addCriterion("gf is null");
            return (Criteria) this;
        }

        public Criteria andGfIsNotNull() {
            addCriterion("gf is not null");
            return (Criteria) this;
        }

        public Criteria andGfEqualTo(String value) {
            addCriterion("gf =", value, "gf");
            return (Criteria) this;
        }

        public Criteria andGfNotEqualTo(String value) {
            addCriterion("gf <>", value, "gf");
            return (Criteria) this;
        }

        public Criteria andGfGreaterThan(String value) {
            addCriterion("gf >", value, "gf");
            return (Criteria) this;
        }

        public Criteria andGfGreaterThanOrEqualTo(String value) {
            addCriterion("gf >=", value, "gf");
            return (Criteria) this;
        }

        public Criteria andGfLessThan(String value) {
            addCriterion("gf <", value, "gf");
            return (Criteria) this;
        }

        public Criteria andGfLessThanOrEqualTo(String value) {
            addCriterion("gf <=", value, "gf");
            return (Criteria) this;
        }

        public Criteria andGfLike(String value) {
            addCriterion("gf like", value, "gf");
            return (Criteria) this;
        }

        public Criteria andGfNotLike(String value) {
            addCriterion("gf not like", value, "gf");
            return (Criteria) this;
        }

        public Criteria andGfIn(List<String> values) {
            addCriterion("gf in", values, "gf");
            return (Criteria) this;
        }

        public Criteria andGfNotIn(List<String> values) {
            addCriterion("gf not in", values, "gf");
            return (Criteria) this;
        }

        public Criteria andGfBetween(String value1, String value2) {
            addCriterion("gf between", value1, value2, "gf");
            return (Criteria) this;
        }

        public Criteria andGfNotBetween(String value1, String value2) {
            addCriterion("gf not between", value1, value2, "gf");
            return (Criteria) this;
        }

        public Criteria andBeiyong3IsNull() {
            addCriterion("beiyong3 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong3IsNotNull() {
            addCriterion("beiyong3 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong3EqualTo(String value) {
            addCriterion("beiyong3 =", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3NotEqualTo(String value) {
            addCriterion("beiyong3 <>", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3GreaterThan(String value) {
            addCriterion("beiyong3 >", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong3 >=", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3LessThan(String value) {
            addCriterion("beiyong3 <", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3LessThanOrEqualTo(String value) {
            addCriterion("beiyong3 <=", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3Like(String value) {
            addCriterion("beiyong3 like", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3NotLike(String value) {
            addCriterion("beiyong3 not like", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3In(List<String> values) {
            addCriterion("beiyong3 in", values, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3NotIn(List<String> values) {
            addCriterion("beiyong3 not in", values, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3Between(String value1, String value2) {
            addCriterion("beiyong3 between", value1, value2, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3NotBetween(String value1, String value2) {
            addCriterion("beiyong3 not between", value1, value2, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong4IsNull() {
            addCriterion("beiyong4 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong4IsNotNull() {
            addCriterion("beiyong4 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong4EqualTo(String value) {
            addCriterion("beiyong4 =", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotEqualTo(String value) {
            addCriterion("beiyong4 <>", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4GreaterThan(String value) {
            addCriterion("beiyong4 >", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong4 >=", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4LessThan(String value) {
            addCriterion("beiyong4 <", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4LessThanOrEqualTo(String value) {
            addCriterion("beiyong4 <=", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4Like(String value) {
            addCriterion("beiyong4 like", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotLike(String value) {
            addCriterion("beiyong4 not like", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4In(List<String> values) {
            addCriterion("beiyong4 in", values, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotIn(List<String> values) {
            addCriterion("beiyong4 not in", values, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4Between(String value1, String value2) {
            addCriterion("beiyong4 between", value1, value2, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotBetween(String value1, String value2) {
            addCriterion("beiyong4 not between", value1, value2, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong6IsNull() {
            addCriterion("beiyong6 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong6IsNotNull() {
            addCriterion("beiyong6 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong6EqualTo(String value) {
            addCriterion("beiyong6 =", value, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong6NotEqualTo(String value) {
            addCriterion("beiyong6 <>", value, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong6GreaterThan(String value) {
            addCriterion("beiyong6 >", value, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong6GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong6 >=", value, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong6LessThan(String value) {
            addCriterion("beiyong6 <", value, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong6LessThanOrEqualTo(String value) {
            addCriterion("beiyong6 <=", value, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong6Like(String value) {
            addCriterion("beiyong6 like", value, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong6NotLike(String value) {
            addCriterion("beiyong6 not like", value, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong6In(List<String> values) {
            addCriterion("beiyong6 in", values, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong6NotIn(List<String> values) {
            addCriterion("beiyong6 not in", values, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong6Between(String value1, String value2) {
            addCriterion("beiyong6 between", value1, value2, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong6NotBetween(String value1, String value2) {
            addCriterion("beiyong6 not between", value1, value2, "beiyong6");
            return (Criteria) this;
        }

        public Criteria andBeiyong7IsNull() {
            addCriterion("beiyong7 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong7IsNotNull() {
            addCriterion("beiyong7 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong7EqualTo(String value) {
            addCriterion("beiyong7 =", value, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong7NotEqualTo(String value) {
            addCriterion("beiyong7 <>", value, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong7GreaterThan(String value) {
            addCriterion("beiyong7 >", value, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong7GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong7 >=", value, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong7LessThan(String value) {
            addCriterion("beiyong7 <", value, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong7LessThanOrEqualTo(String value) {
            addCriterion("beiyong7 <=", value, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong7Like(String value) {
            addCriterion("beiyong7 like", value, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong7NotLike(String value) {
            addCriterion("beiyong7 not like", value, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong7In(List<String> values) {
            addCriterion("beiyong7 in", values, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong7NotIn(List<String> values) {
            addCriterion("beiyong7 not in", values, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong7Between(String value1, String value2) {
            addCriterion("beiyong7 between", value1, value2, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong7NotBetween(String value1, String value2) {
            addCriterion("beiyong7 not between", value1, value2, "beiyong7");
            return (Criteria) this;
        }

        public Criteria andBeiyong8IsNull() {
            addCriterion("beiyong8 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong8IsNotNull() {
            addCriterion("beiyong8 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong8EqualTo(String value) {
            addCriterion("beiyong8 =", value, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong8NotEqualTo(String value) {
            addCriterion("beiyong8 <>", value, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong8GreaterThan(String value) {
            addCriterion("beiyong8 >", value, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong8GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong8 >=", value, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong8LessThan(String value) {
            addCriterion("beiyong8 <", value, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong8LessThanOrEqualTo(String value) {
            addCriterion("beiyong8 <=", value, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong8Like(String value) {
            addCriterion("beiyong8 like", value, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong8NotLike(String value) {
            addCriterion("beiyong8 not like", value, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong8In(List<String> values) {
            addCriterion("beiyong8 in", values, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong8NotIn(List<String> values) {
            addCriterion("beiyong8 not in", values, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong8Between(String value1, String value2) {
            addCriterion("beiyong8 between", value1, value2, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong8NotBetween(String value1, String value2) {
            addCriterion("beiyong8 not between", value1, value2, "beiyong8");
            return (Criteria) this;
        }

        public Criteria andBeiyong9IsNull() {
            addCriterion("beiyong9 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong9IsNotNull() {
            addCriterion("beiyong9 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong9EqualTo(String value) {
            addCriterion("beiyong9 =", value, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andBeiyong9NotEqualTo(String value) {
            addCriterion("beiyong9 <>", value, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andBeiyong9GreaterThan(String value) {
            addCriterion("beiyong9 >", value, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andBeiyong9GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong9 >=", value, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andBeiyong9LessThan(String value) {
            addCriterion("beiyong9 <", value, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andBeiyong9LessThanOrEqualTo(String value) {
            addCriterion("beiyong9 <=", value, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andBeiyong9Like(String value) {
            addCriterion("beiyong9 like", value, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andBeiyong9NotLike(String value) {
            addCriterion("beiyong9 not like", value, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andBeiyong9In(List<String> values) {
            addCriterion("beiyong9 in", values, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andBeiyong9NotIn(List<String> values) {
            addCriterion("beiyong9 not in", values, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andBeiyong9Between(String value1, String value2) {
            addCriterion("beiyong9 between", value1, value2, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andBeiyong9NotBetween(String value1, String value2) {
            addCriterion("beiyong9 not between", value1, value2, "beiyong9");
            return (Criteria) this;
        }

        public Criteria andA01IsNull() {
            addCriterion("a01 is null");
            return (Criteria) this;
        }

        public Criteria andA01IsNotNull() {
            addCriterion("a01 is not null");
            return (Criteria) this;
        }

        public Criteria andA01EqualTo(String value) {
            addCriterion("a01 =", value, "a01");
            return (Criteria) this;
        }

        public Criteria andA01NotEqualTo(String value) {
            addCriterion("a01 <>", value, "a01");
            return (Criteria) this;
        }

        public Criteria andA01GreaterThan(String value) {
            addCriterion("a01 >", value, "a01");
            return (Criteria) this;
        }

        public Criteria andA01GreaterThanOrEqualTo(String value) {
            addCriterion("a01 >=", value, "a01");
            return (Criteria) this;
        }

        public Criteria andA01LessThan(String value) {
            addCriterion("a01 <", value, "a01");
            return (Criteria) this;
        }

        public Criteria andA01LessThanOrEqualTo(String value) {
            addCriterion("a01 <=", value, "a01");
            return (Criteria) this;
        }

        public Criteria andA01Like(String value) {
            addCriterion("a01 like", value, "a01");
            return (Criteria) this;
        }

        public Criteria andA01NotLike(String value) {
            addCriterion("a01 not like", value, "a01");
            return (Criteria) this;
        }

        public Criteria andA01In(List<String> values) {
            addCriterion("a01 in", values, "a01");
            return (Criteria) this;
        }

        public Criteria andA01NotIn(List<String> values) {
            addCriterion("a01 not in", values, "a01");
            return (Criteria) this;
        }

        public Criteria andA01Between(String value1, String value2) {
            addCriterion("a01 between", value1, value2, "a01");
            return (Criteria) this;
        }

        public Criteria andA01NotBetween(String value1, String value2) {
            addCriterion("a01 not between", value1, value2, "a01");
            return (Criteria) this;
        }

        public Criteria andA02IsNull() {
            addCriterion("a02 is null");
            return (Criteria) this;
        }

        public Criteria andA02IsNotNull() {
            addCriterion("a02 is not null");
            return (Criteria) this;
        }

        public Criteria andA02EqualTo(String value) {
            addCriterion("a02 =", value, "a02");
            return (Criteria) this;
        }

        public Criteria andA02NotEqualTo(String value) {
            addCriterion("a02 <>", value, "a02");
            return (Criteria) this;
        }

        public Criteria andA02GreaterThan(String value) {
            addCriterion("a02 >", value, "a02");
            return (Criteria) this;
        }

        public Criteria andA02GreaterThanOrEqualTo(String value) {
            addCriterion("a02 >=", value, "a02");
            return (Criteria) this;
        }

        public Criteria andA02LessThan(String value) {
            addCriterion("a02 <", value, "a02");
            return (Criteria) this;
        }

        public Criteria andA02LessThanOrEqualTo(String value) {
            addCriterion("a02 <=", value, "a02");
            return (Criteria) this;
        }

        public Criteria andA02Like(String value) {
            addCriterion("a02 like", value, "a02");
            return (Criteria) this;
        }

        public Criteria andA02NotLike(String value) {
            addCriterion("a02 not like", value, "a02");
            return (Criteria) this;
        }

        public Criteria andA02In(List<String> values) {
            addCriterion("a02 in", values, "a02");
            return (Criteria) this;
        }

        public Criteria andA02NotIn(List<String> values) {
            addCriterion("a02 not in", values, "a02");
            return (Criteria) this;
        }

        public Criteria andA02Between(String value1, String value2) {
            addCriterion("a02 between", value1, value2, "a02");
            return (Criteria) this;
        }

        public Criteria andA02NotBetween(String value1, String value2) {
            addCriterion("a02 not between", value1, value2, "a02");
            return (Criteria) this;
        }

        public Criteria andA03IsNull() {
            addCriterion("a03 is null");
            return (Criteria) this;
        }

        public Criteria andA03IsNotNull() {
            addCriterion("a03 is not null");
            return (Criteria) this;
        }

        public Criteria andA03EqualTo(String value) {
            addCriterion("a03 =", value, "a03");
            return (Criteria) this;
        }

        public Criteria andA03NotEqualTo(String value) {
            addCriterion("a03 <>", value, "a03");
            return (Criteria) this;
        }

        public Criteria andA03GreaterThan(String value) {
            addCriterion("a03 >", value, "a03");
            return (Criteria) this;
        }

        public Criteria andA03GreaterThanOrEqualTo(String value) {
            addCriterion("a03 >=", value, "a03");
            return (Criteria) this;
        }

        public Criteria andA03LessThan(String value) {
            addCriterion("a03 <", value, "a03");
            return (Criteria) this;
        }

        public Criteria andA03LessThanOrEqualTo(String value) {
            addCriterion("a03 <=", value, "a03");
            return (Criteria) this;
        }

        public Criteria andA03Like(String value) {
            addCriterion("a03 like", value, "a03");
            return (Criteria) this;
        }

        public Criteria andA03NotLike(String value) {
            addCriterion("a03 not like", value, "a03");
            return (Criteria) this;
        }

        public Criteria andA03In(List<String> values) {
            addCriterion("a03 in", values, "a03");
            return (Criteria) this;
        }

        public Criteria andA03NotIn(List<String> values) {
            addCriterion("a03 not in", values, "a03");
            return (Criteria) this;
        }

        public Criteria andA03Between(String value1, String value2) {
            addCriterion("a03 between", value1, value2, "a03");
            return (Criteria) this;
        }

        public Criteria andA03NotBetween(String value1, String value2) {
            addCriterion("a03 not between", value1, value2, "a03");
            return (Criteria) this;
        }

        public Criteria andA04IsNull() {
            addCriterion("a04 is null");
            return (Criteria) this;
        }

        public Criteria andA04IsNotNull() {
            addCriterion("a04 is not null");
            return (Criteria) this;
        }

        public Criteria andA04EqualTo(String value) {
            addCriterion("a04 =", value, "a04");
            return (Criteria) this;
        }

        public Criteria andA04NotEqualTo(String value) {
            addCriterion("a04 <>", value, "a04");
            return (Criteria) this;
        }

        public Criteria andA04GreaterThan(String value) {
            addCriterion("a04 >", value, "a04");
            return (Criteria) this;
        }

        public Criteria andA04GreaterThanOrEqualTo(String value) {
            addCriterion("a04 >=", value, "a04");
            return (Criteria) this;
        }

        public Criteria andA04LessThan(String value) {
            addCriterion("a04 <", value, "a04");
            return (Criteria) this;
        }

        public Criteria andA04LessThanOrEqualTo(String value) {
            addCriterion("a04 <=", value, "a04");
            return (Criteria) this;
        }

        public Criteria andA04Like(String value) {
            addCriterion("a04 like", value, "a04");
            return (Criteria) this;
        }

        public Criteria andA04NotLike(String value) {
            addCriterion("a04 not like", value, "a04");
            return (Criteria) this;
        }

        public Criteria andA04In(List<String> values) {
            addCriterion("a04 in", values, "a04");
            return (Criteria) this;
        }

        public Criteria andA04NotIn(List<String> values) {
            addCriterion("a04 not in", values, "a04");
            return (Criteria) this;
        }

        public Criteria andA04Between(String value1, String value2) {
            addCriterion("a04 between", value1, value2, "a04");
            return (Criteria) this;
        }

        public Criteria andA04NotBetween(String value1, String value2) {
            addCriterion("a04 not between", value1, value2, "a04");
            return (Criteria) this;
        }

        public Criteria andA05IsNull() {
            addCriterion("a05 is null");
            return (Criteria) this;
        }

        public Criteria andA05IsNotNull() {
            addCriterion("a05 is not null");
            return (Criteria) this;
        }

        public Criteria andA05EqualTo(String value) {
            addCriterion("a05 =", value, "a05");
            return (Criteria) this;
        }

        public Criteria andA05NotEqualTo(String value) {
            addCriterion("a05 <>", value, "a05");
            return (Criteria) this;
        }

        public Criteria andA05GreaterThan(String value) {
            addCriterion("a05 >", value, "a05");
            return (Criteria) this;
        }

        public Criteria andA05GreaterThanOrEqualTo(String value) {
            addCriterion("a05 >=", value, "a05");
            return (Criteria) this;
        }

        public Criteria andA05LessThan(String value) {
            addCriterion("a05 <", value, "a05");
            return (Criteria) this;
        }

        public Criteria andA05LessThanOrEqualTo(String value) {
            addCriterion("a05 <=", value, "a05");
            return (Criteria) this;
        }

        public Criteria andA05Like(String value) {
            addCriterion("a05 like", value, "a05");
            return (Criteria) this;
        }

        public Criteria andA05NotLike(String value) {
            addCriterion("a05 not like", value, "a05");
            return (Criteria) this;
        }

        public Criteria andA05In(List<String> values) {
            addCriterion("a05 in", values, "a05");
            return (Criteria) this;
        }

        public Criteria andA05NotIn(List<String> values) {
            addCriterion("a05 not in", values, "a05");
            return (Criteria) this;
        }

        public Criteria andA05Between(String value1, String value2) {
            addCriterion("a05 between", value1, value2, "a05");
            return (Criteria) this;
        }

        public Criteria andA05NotBetween(String value1, String value2) {
            addCriterion("a05 not between", value1, value2, "a05");
            return (Criteria) this;
        }

        public Criteria andA06IsNull() {
            addCriterion("a06 is null");
            return (Criteria) this;
        }

        public Criteria andA06IsNotNull() {
            addCriterion("a06 is not null");
            return (Criteria) this;
        }

        public Criteria andA06EqualTo(String value) {
            addCriterion("a06 =", value, "a06");
            return (Criteria) this;
        }

        public Criteria andA06NotEqualTo(String value) {
            addCriterion("a06 <>", value, "a06");
            return (Criteria) this;
        }

        public Criteria andA06GreaterThan(String value) {
            addCriterion("a06 >", value, "a06");
            return (Criteria) this;
        }

        public Criteria andA06GreaterThanOrEqualTo(String value) {
            addCriterion("a06 >=", value, "a06");
            return (Criteria) this;
        }

        public Criteria andA06LessThan(String value) {
            addCriterion("a06 <", value, "a06");
            return (Criteria) this;
        }

        public Criteria andA06LessThanOrEqualTo(String value) {
            addCriterion("a06 <=", value, "a06");
            return (Criteria) this;
        }

        public Criteria andA06Like(String value) {
            addCriterion("a06 like", value, "a06");
            return (Criteria) this;
        }

        public Criteria andA06NotLike(String value) {
            addCriterion("a06 not like", value, "a06");
            return (Criteria) this;
        }

        public Criteria andA06In(List<String> values) {
            addCriterion("a06 in", values, "a06");
            return (Criteria) this;
        }

        public Criteria andA06NotIn(List<String> values) {
            addCriterion("a06 not in", values, "a06");
            return (Criteria) this;
        }

        public Criteria andA06Between(String value1, String value2) {
            addCriterion("a06 between", value1, value2, "a06");
            return (Criteria) this;
        }

        public Criteria andA06NotBetween(String value1, String value2) {
            addCriterion("a06 not between", value1, value2, "a06");
            return (Criteria) this;
        }

        public Criteria andA07IsNull() {
            addCriterion("a07 is null");
            return (Criteria) this;
        }

        public Criteria andA07IsNotNull() {
            addCriterion("a07 is not null");
            return (Criteria) this;
        }

        public Criteria andA07EqualTo(String value) {
            addCriterion("a07 =", value, "a07");
            return (Criteria) this;
        }

        public Criteria andA07NotEqualTo(String value) {
            addCriterion("a07 <>", value, "a07");
            return (Criteria) this;
        }

        public Criteria andA07GreaterThan(String value) {
            addCriterion("a07 >", value, "a07");
            return (Criteria) this;
        }

        public Criteria andA07GreaterThanOrEqualTo(String value) {
            addCriterion("a07 >=", value, "a07");
            return (Criteria) this;
        }

        public Criteria andA07LessThan(String value) {
            addCriterion("a07 <", value, "a07");
            return (Criteria) this;
        }

        public Criteria andA07LessThanOrEqualTo(String value) {
            addCriterion("a07 <=", value, "a07");
            return (Criteria) this;
        }

        public Criteria andA07Like(String value) {
            addCriterion("a07 like", value, "a07");
            return (Criteria) this;
        }

        public Criteria andA07NotLike(String value) {
            addCriterion("a07 not like", value, "a07");
            return (Criteria) this;
        }

        public Criteria andA07In(List<String> values) {
            addCriterion("a07 in", values, "a07");
            return (Criteria) this;
        }

        public Criteria andA07NotIn(List<String> values) {
            addCriterion("a07 not in", values, "a07");
            return (Criteria) this;
        }

        public Criteria andA07Between(String value1, String value2) {
            addCriterion("a07 between", value1, value2, "a07");
            return (Criteria) this;
        }

        public Criteria andA07NotBetween(String value1, String value2) {
            addCriterion("a07 not between", value1, value2, "a07");
            return (Criteria) this;
        }

        public Criteria andA08IsNull() {
            addCriterion("a08 is null");
            return (Criteria) this;
        }

        public Criteria andA08IsNotNull() {
            addCriterion("a08 is not null");
            return (Criteria) this;
        }

        public Criteria andA08EqualTo(String value) {
            addCriterion("a08 =", value, "a08");
            return (Criteria) this;
        }

        public Criteria andA08NotEqualTo(String value) {
            addCriterion("a08 <>", value, "a08");
            return (Criteria) this;
        }

        public Criteria andA08GreaterThan(String value) {
            addCriterion("a08 >", value, "a08");
            return (Criteria) this;
        }

        public Criteria andA08GreaterThanOrEqualTo(String value) {
            addCriterion("a08 >=", value, "a08");
            return (Criteria) this;
        }

        public Criteria andA08LessThan(String value) {
            addCriterion("a08 <", value, "a08");
            return (Criteria) this;
        }

        public Criteria andA08LessThanOrEqualTo(String value) {
            addCriterion("a08 <=", value, "a08");
            return (Criteria) this;
        }

        public Criteria andA08Like(String value) {
            addCriterion("a08 like", value, "a08");
            return (Criteria) this;
        }

        public Criteria andA08NotLike(String value) {
            addCriterion("a08 not like", value, "a08");
            return (Criteria) this;
        }

        public Criteria andA08In(List<String> values) {
            addCriterion("a08 in", values, "a08");
            return (Criteria) this;
        }

        public Criteria andA08NotIn(List<String> values) {
            addCriterion("a08 not in", values, "a08");
            return (Criteria) this;
        }

        public Criteria andA08Between(String value1, String value2) {
            addCriterion("a08 between", value1, value2, "a08");
            return (Criteria) this;
        }

        public Criteria andA08NotBetween(String value1, String value2) {
            addCriterion("a08 not between", value1, value2, "a08");
            return (Criteria) this;
        }

        public Criteria andA09IsNull() {
            addCriterion("a09 is null");
            return (Criteria) this;
        }

        public Criteria andA09IsNotNull() {
            addCriterion("a09 is not null");
            return (Criteria) this;
        }

        public Criteria andA09EqualTo(String value) {
            addCriterion("a09 =", value, "a09");
            return (Criteria) this;
        }

        public Criteria andA09NotEqualTo(String value) {
            addCriterion("a09 <>", value, "a09");
            return (Criteria) this;
        }

        public Criteria andA09GreaterThan(String value) {
            addCriterion("a09 >", value, "a09");
            return (Criteria) this;
        }

        public Criteria andA09GreaterThanOrEqualTo(String value) {
            addCriterion("a09 >=", value, "a09");
            return (Criteria) this;
        }

        public Criteria andA09LessThan(String value) {
            addCriterion("a09 <", value, "a09");
            return (Criteria) this;
        }

        public Criteria andA09LessThanOrEqualTo(String value) {
            addCriterion("a09 <=", value, "a09");
            return (Criteria) this;
        }

        public Criteria andA09Like(String value) {
            addCriterion("a09 like", value, "a09");
            return (Criteria) this;
        }

        public Criteria andA09NotLike(String value) {
            addCriterion("a09 not like", value, "a09");
            return (Criteria) this;
        }

        public Criteria andA09In(List<String> values) {
            addCriterion("a09 in", values, "a09");
            return (Criteria) this;
        }

        public Criteria andA09NotIn(List<String> values) {
            addCriterion("a09 not in", values, "a09");
            return (Criteria) this;
        }

        public Criteria andA09Between(String value1, String value2) {
            addCriterion("a09 between", value1, value2, "a09");
            return (Criteria) this;
        }

        public Criteria andA09NotBetween(String value1, String value2) {
            addCriterion("a09 not between", value1, value2, "a09");
            return (Criteria) this;
        }

        public Criteria andA10IsNull() {
            addCriterion("a10 is null");
            return (Criteria) this;
        }

        public Criteria andA10IsNotNull() {
            addCriterion("a10 is not null");
            return (Criteria) this;
        }

        public Criteria andA10EqualTo(String value) {
            addCriterion("a10 =", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10NotEqualTo(String value) {
            addCriterion("a10 <>", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10GreaterThan(String value) {
            addCriterion("a10 >", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10GreaterThanOrEqualTo(String value) {
            addCriterion("a10 >=", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10LessThan(String value) {
            addCriterion("a10 <", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10LessThanOrEqualTo(String value) {
            addCriterion("a10 <=", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10Like(String value) {
            addCriterion("a10 like", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10NotLike(String value) {
            addCriterion("a10 not like", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10In(List<String> values) {
            addCriterion("a10 in", values, "a10");
            return (Criteria) this;
        }

        public Criteria andA10NotIn(List<String> values) {
            addCriterion("a10 not in", values, "a10");
            return (Criteria) this;
        }

        public Criteria andA10Between(String value1, String value2) {
            addCriterion("a10 between", value1, value2, "a10");
            return (Criteria) this;
        }

        public Criteria andA10NotBetween(String value1, String value2) {
            addCriterion("a10 not between", value1, value2, "a10");
            return (Criteria) this;
        }

        public Criteria andA11IsNull() {
            addCriterion("a11 is null");
            return (Criteria) this;
        }

        public Criteria andA11IsNotNull() {
            addCriterion("a11 is not null");
            return (Criteria) this;
        }

        public Criteria andA11EqualTo(String value) {
            addCriterion("a11 =", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11NotEqualTo(String value) {
            addCriterion("a11 <>", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11GreaterThan(String value) {
            addCriterion("a11 >", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11GreaterThanOrEqualTo(String value) {
            addCriterion("a11 >=", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11LessThan(String value) {
            addCriterion("a11 <", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11LessThanOrEqualTo(String value) {
            addCriterion("a11 <=", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11Like(String value) {
            addCriterion("a11 like", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11NotLike(String value) {
            addCriterion("a11 not like", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11In(List<String> values) {
            addCriterion("a11 in", values, "a11");
            return (Criteria) this;
        }

        public Criteria andA11NotIn(List<String> values) {
            addCriterion("a11 not in", values, "a11");
            return (Criteria) this;
        }

        public Criteria andA11Between(String value1, String value2) {
            addCriterion("a11 between", value1, value2, "a11");
            return (Criteria) this;
        }

        public Criteria andA11NotBetween(String value1, String value2) {
            addCriterion("a11 not between", value1, value2, "a11");
            return (Criteria) this;
        }

        public Criteria andA12IsNull() {
            addCriterion("a12 is null");
            return (Criteria) this;
        }

        public Criteria andA12IsNotNull() {
            addCriterion("a12 is not null");
            return (Criteria) this;
        }

        public Criteria andA12EqualTo(String value) {
            addCriterion("a12 =", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12NotEqualTo(String value) {
            addCriterion("a12 <>", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12GreaterThan(String value) {
            addCriterion("a12 >", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12GreaterThanOrEqualTo(String value) {
            addCriterion("a12 >=", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12LessThan(String value) {
            addCriterion("a12 <", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12LessThanOrEqualTo(String value) {
            addCriterion("a12 <=", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12Like(String value) {
            addCriterion("a12 like", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12NotLike(String value) {
            addCriterion("a12 not like", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12In(List<String> values) {
            addCriterion("a12 in", values, "a12");
            return (Criteria) this;
        }

        public Criteria andA12NotIn(List<String> values) {
            addCriterion("a12 not in", values, "a12");
            return (Criteria) this;
        }

        public Criteria andA12Between(String value1, String value2) {
            addCriterion("a12 between", value1, value2, "a12");
            return (Criteria) this;
        }

        public Criteria andA12NotBetween(String value1, String value2) {
            addCriterion("a12 not between", value1, value2, "a12");
            return (Criteria) this;
        }

        public Criteria andA13IsNull() {
            addCriterion("a13 is null");
            return (Criteria) this;
        }

        public Criteria andA13IsNotNull() {
            addCriterion("a13 is not null");
            return (Criteria) this;
        }

        public Criteria andA13EqualTo(String value) {
            addCriterion("a13 =", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13NotEqualTo(String value) {
            addCriterion("a13 <>", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13GreaterThan(String value) {
            addCriterion("a13 >", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13GreaterThanOrEqualTo(String value) {
            addCriterion("a13 >=", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13LessThan(String value) {
            addCriterion("a13 <", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13LessThanOrEqualTo(String value) {
            addCriterion("a13 <=", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13Like(String value) {
            addCriterion("a13 like", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13NotLike(String value) {
            addCriterion("a13 not like", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13In(List<String> values) {
            addCriterion("a13 in", values, "a13");
            return (Criteria) this;
        }

        public Criteria andA13NotIn(List<String> values) {
            addCriterion("a13 not in", values, "a13");
            return (Criteria) this;
        }

        public Criteria andA13Between(String value1, String value2) {
            addCriterion("a13 between", value1, value2, "a13");
            return (Criteria) this;
        }

        public Criteria andA13NotBetween(String value1, String value2) {
            addCriterion("a13 not between", value1, value2, "a13");
            return (Criteria) this;
        }

        public Criteria andA14IsNull() {
            addCriterion("a14 is null");
            return (Criteria) this;
        }

        public Criteria andA14IsNotNull() {
            addCriterion("a14 is not null");
            return (Criteria) this;
        }

        public Criteria andA14EqualTo(String value) {
            addCriterion("a14 =", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14NotEqualTo(String value) {
            addCriterion("a14 <>", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14GreaterThan(String value) {
            addCriterion("a14 >", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14GreaterThanOrEqualTo(String value) {
            addCriterion("a14 >=", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14LessThan(String value) {
            addCriterion("a14 <", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14LessThanOrEqualTo(String value) {
            addCriterion("a14 <=", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14Like(String value) {
            addCriterion("a14 like", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14NotLike(String value) {
            addCriterion("a14 not like", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14In(List<String> values) {
            addCriterion("a14 in", values, "a14");
            return (Criteria) this;
        }

        public Criteria andA14NotIn(List<String> values) {
            addCriterion("a14 not in", values, "a14");
            return (Criteria) this;
        }

        public Criteria andA14Between(String value1, String value2) {
            addCriterion("a14 between", value1, value2, "a14");
            return (Criteria) this;
        }

        public Criteria andA14NotBetween(String value1, String value2) {
            addCriterion("a14 not between", value1, value2, "a14");
            return (Criteria) this;
        }

        public Criteria andA15IsNull() {
            addCriterion("a15 is null");
            return (Criteria) this;
        }

        public Criteria andA15IsNotNull() {
            addCriterion("a15 is not null");
            return (Criteria) this;
        }

        public Criteria andA15EqualTo(String value) {
            addCriterion("a15 =", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15NotEqualTo(String value) {
            addCriterion("a15 <>", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15GreaterThan(String value) {
            addCriterion("a15 >", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15GreaterThanOrEqualTo(String value) {
            addCriterion("a15 >=", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15LessThan(String value) {
            addCriterion("a15 <", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15LessThanOrEqualTo(String value) {
            addCriterion("a15 <=", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15Like(String value) {
            addCriterion("a15 like", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15NotLike(String value) {
            addCriterion("a15 not like", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15In(List<String> values) {
            addCriterion("a15 in", values, "a15");
            return (Criteria) this;
        }

        public Criteria andA15NotIn(List<String> values) {
            addCriterion("a15 not in", values, "a15");
            return (Criteria) this;
        }

        public Criteria andA15Between(String value1, String value2) {
            addCriterion("a15 between", value1, value2, "a15");
            return (Criteria) this;
        }

        public Criteria andA15NotBetween(String value1, String value2) {
            addCriterion("a15 not between", value1, value2, "a15");
            return (Criteria) this;
        }

        public Criteria andA16IsNull() {
            addCriterion("a16 is null");
            return (Criteria) this;
        }

        public Criteria andA16IsNotNull() {
            addCriterion("a16 is not null");
            return (Criteria) this;
        }

        public Criteria andA16EqualTo(String value) {
            addCriterion("a16 =", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16NotEqualTo(String value) {
            addCriterion("a16 <>", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16GreaterThan(String value) {
            addCriterion("a16 >", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16GreaterThanOrEqualTo(String value) {
            addCriterion("a16 >=", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16LessThan(String value) {
            addCriterion("a16 <", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16LessThanOrEqualTo(String value) {
            addCriterion("a16 <=", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16Like(String value) {
            addCriterion("a16 like", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16NotLike(String value) {
            addCriterion("a16 not like", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16In(List<String> values) {
            addCriterion("a16 in", values, "a16");
            return (Criteria) this;
        }

        public Criteria andA16NotIn(List<String> values) {
            addCriterion("a16 not in", values, "a16");
            return (Criteria) this;
        }

        public Criteria andA16Between(String value1, String value2) {
            addCriterion("a16 between", value1, value2, "a16");
            return (Criteria) this;
        }

        public Criteria andA16NotBetween(String value1, String value2) {
            addCriterion("a16 not between", value1, value2, "a16");
            return (Criteria) this;
        }

        public Criteria andA17IsNull() {
            addCriterion("a17 is null");
            return (Criteria) this;
        }

        public Criteria andA17IsNotNull() {
            addCriterion("a17 is not null");
            return (Criteria) this;
        }

        public Criteria andA17EqualTo(String value) {
            addCriterion("a17 =", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17NotEqualTo(String value) {
            addCriterion("a17 <>", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17GreaterThan(String value) {
            addCriterion("a17 >", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17GreaterThanOrEqualTo(String value) {
            addCriterion("a17 >=", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17LessThan(String value) {
            addCriterion("a17 <", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17LessThanOrEqualTo(String value) {
            addCriterion("a17 <=", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17Like(String value) {
            addCriterion("a17 like", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17NotLike(String value) {
            addCriterion("a17 not like", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17In(List<String> values) {
            addCriterion("a17 in", values, "a17");
            return (Criteria) this;
        }

        public Criteria andA17NotIn(List<String> values) {
            addCriterion("a17 not in", values, "a17");
            return (Criteria) this;
        }

        public Criteria andA17Between(String value1, String value2) {
            addCriterion("a17 between", value1, value2, "a17");
            return (Criteria) this;
        }

        public Criteria andA17NotBetween(String value1, String value2) {
            addCriterion("a17 not between", value1, value2, "a17");
            return (Criteria) this;
        }

        public Criteria andA18IsNull() {
            addCriterion("a18 is null");
            return (Criteria) this;
        }

        public Criteria andA18IsNotNull() {
            addCriterion("a18 is not null");
            return (Criteria) this;
        }

        public Criteria andA18EqualTo(String value) {
            addCriterion("a18 =", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18NotEqualTo(String value) {
            addCriterion("a18 <>", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18GreaterThan(String value) {
            addCriterion("a18 >", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18GreaterThanOrEqualTo(String value) {
            addCriterion("a18 >=", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18LessThan(String value) {
            addCriterion("a18 <", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18LessThanOrEqualTo(String value) {
            addCriterion("a18 <=", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18Like(String value) {
            addCriterion("a18 like", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18NotLike(String value) {
            addCriterion("a18 not like", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18In(List<String> values) {
            addCriterion("a18 in", values, "a18");
            return (Criteria) this;
        }

        public Criteria andA18NotIn(List<String> values) {
            addCriterion("a18 not in", values, "a18");
            return (Criteria) this;
        }

        public Criteria andA18Between(String value1, String value2) {
            addCriterion("a18 between", value1, value2, "a18");
            return (Criteria) this;
        }

        public Criteria andA18NotBetween(String value1, String value2) {
            addCriterion("a18 not between", value1, value2, "a18");
            return (Criteria) this;
        }

        public Criteria andA19IsNull() {
            addCriterion("a19 is null");
            return (Criteria) this;
        }

        public Criteria andA19IsNotNull() {
            addCriterion("a19 is not null");
            return (Criteria) this;
        }

        public Criteria andA19EqualTo(String value) {
            addCriterion("a19 =", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19NotEqualTo(String value) {
            addCriterion("a19 <>", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19GreaterThan(String value) {
            addCriterion("a19 >", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19GreaterThanOrEqualTo(String value) {
            addCriterion("a19 >=", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19LessThan(String value) {
            addCriterion("a19 <", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19LessThanOrEqualTo(String value) {
            addCriterion("a19 <=", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19Like(String value) {
            addCriterion("a19 like", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19NotLike(String value) {
            addCriterion("a19 not like", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19In(List<String> values) {
            addCriterion("a19 in", values, "a19");
            return (Criteria) this;
        }

        public Criteria andA19NotIn(List<String> values) {
            addCriterion("a19 not in", values, "a19");
            return (Criteria) this;
        }

        public Criteria andA19Between(String value1, String value2) {
            addCriterion("a19 between", value1, value2, "a19");
            return (Criteria) this;
        }

        public Criteria andA19NotBetween(String value1, String value2) {
            addCriterion("a19 not between", value1, value2, "a19");
            return (Criteria) this;
        }

        public Criteria andA20IsNull() {
            addCriterion("a20 is null");
            return (Criteria) this;
        }

        public Criteria andA20IsNotNull() {
            addCriterion("a20 is not null");
            return (Criteria) this;
        }

        public Criteria andA20EqualTo(String value) {
            addCriterion("a20 =", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20NotEqualTo(String value) {
            addCriterion("a20 <>", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20GreaterThan(String value) {
            addCriterion("a20 >", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20GreaterThanOrEqualTo(String value) {
            addCriterion("a20 >=", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20LessThan(String value) {
            addCriterion("a20 <", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20LessThanOrEqualTo(String value) {
            addCriterion("a20 <=", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20Like(String value) {
            addCriterion("a20 like", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20NotLike(String value) {
            addCriterion("a20 not like", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20In(List<String> values) {
            addCriterion("a20 in", values, "a20");
            return (Criteria) this;
        }

        public Criteria andA20NotIn(List<String> values) {
            addCriterion("a20 not in", values, "a20");
            return (Criteria) this;
        }

        public Criteria andA20Between(String value1, String value2) {
            addCriterion("a20 between", value1, value2, "a20");
            return (Criteria) this;
        }

        public Criteria andA20NotBetween(String value1, String value2) {
            addCriterion("a20 not between", value1, value2, "a20");
            return (Criteria) this;
        }

        public Criteria andA21IsNull() {
            addCriterion("a21 is null");
            return (Criteria) this;
        }

        public Criteria andA21IsNotNull() {
            addCriterion("a21 is not null");
            return (Criteria) this;
        }

        public Criteria andA21EqualTo(String value) {
            addCriterion("a21 =", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21NotEqualTo(String value) {
            addCriterion("a21 <>", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21GreaterThan(String value) {
            addCriterion("a21 >", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21GreaterThanOrEqualTo(String value) {
            addCriterion("a21 >=", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21LessThan(String value) {
            addCriterion("a21 <", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21LessThanOrEqualTo(String value) {
            addCriterion("a21 <=", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21Like(String value) {
            addCriterion("a21 like", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21NotLike(String value) {
            addCriterion("a21 not like", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21In(List<String> values) {
            addCriterion("a21 in", values, "a21");
            return (Criteria) this;
        }

        public Criteria andA21NotIn(List<String> values) {
            addCriterion("a21 not in", values, "a21");
            return (Criteria) this;
        }

        public Criteria andA21Between(String value1, String value2) {
            addCriterion("a21 between", value1, value2, "a21");
            return (Criteria) this;
        }

        public Criteria andA21NotBetween(String value1, String value2) {
            addCriterion("a21 not between", value1, value2, "a21");
            return (Criteria) this;
        }

        public Criteria andA22IsNull() {
            addCriterion("a22 is null");
            return (Criteria) this;
        }

        public Criteria andA22IsNotNull() {
            addCriterion("a22 is not null");
            return (Criteria) this;
        }

        public Criteria andA22EqualTo(String value) {
            addCriterion("a22 =", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22NotEqualTo(String value) {
            addCriterion("a22 <>", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22GreaterThan(String value) {
            addCriterion("a22 >", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22GreaterThanOrEqualTo(String value) {
            addCriterion("a22 >=", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22LessThan(String value) {
            addCriterion("a22 <", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22LessThanOrEqualTo(String value) {
            addCriterion("a22 <=", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22Like(String value) {
            addCriterion("a22 like", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22NotLike(String value) {
            addCriterion("a22 not like", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22In(List<String> values) {
            addCriterion("a22 in", values, "a22");
            return (Criteria) this;
        }

        public Criteria andA22NotIn(List<String> values) {
            addCriterion("a22 not in", values, "a22");
            return (Criteria) this;
        }

        public Criteria andA22Between(String value1, String value2) {
            addCriterion("a22 between", value1, value2, "a22");
            return (Criteria) this;
        }

        public Criteria andA22NotBetween(String value1, String value2) {
            addCriterion("a22 not between", value1, value2, "a22");
            return (Criteria) this;
        }

        public Criteria andA23IsNull() {
            addCriterion("a23 is null");
            return (Criteria) this;
        }

        public Criteria andA23IsNotNull() {
            addCriterion("a23 is not null");
            return (Criteria) this;
        }

        public Criteria andA23EqualTo(String value) {
            addCriterion("a23 =", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23NotEqualTo(String value) {
            addCriterion("a23 <>", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23GreaterThan(String value) {
            addCriterion("a23 >", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23GreaterThanOrEqualTo(String value) {
            addCriterion("a23 >=", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23LessThan(String value) {
            addCriterion("a23 <", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23LessThanOrEqualTo(String value) {
            addCriterion("a23 <=", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23Like(String value) {
            addCriterion("a23 like", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23NotLike(String value) {
            addCriterion("a23 not like", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23In(List<String> values) {
            addCriterion("a23 in", values, "a23");
            return (Criteria) this;
        }

        public Criteria andA23NotIn(List<String> values) {
            addCriterion("a23 not in", values, "a23");
            return (Criteria) this;
        }

        public Criteria andA23Between(String value1, String value2) {
            addCriterion("a23 between", value1, value2, "a23");
            return (Criteria) this;
        }

        public Criteria andA23NotBetween(String value1, String value2) {
            addCriterion("a23 not between", value1, value2, "a23");
            return (Criteria) this;
        }

        public Criteria andA24IsNull() {
            addCriterion("a24 is null");
            return (Criteria) this;
        }

        public Criteria andA24IsNotNull() {
            addCriterion("a24 is not null");
            return (Criteria) this;
        }

        public Criteria andA24EqualTo(String value) {
            addCriterion("a24 =", value, "a24");
            return (Criteria) this;
        }

        public Criteria andA24NotEqualTo(String value) {
            addCriterion("a24 <>", value, "a24");
            return (Criteria) this;
        }

        public Criteria andA24GreaterThan(String value) {
            addCriterion("a24 >", value, "a24");
            return (Criteria) this;
        }

        public Criteria andA24GreaterThanOrEqualTo(String value) {
            addCriterion("a24 >=", value, "a24");
            return (Criteria) this;
        }

        public Criteria andA24LessThan(String value) {
            addCriterion("a24 <", value, "a24");
            return (Criteria) this;
        }

        public Criteria andA24LessThanOrEqualTo(String value) {
            addCriterion("a24 <=", value, "a24");
            return (Criteria) this;
        }

        public Criteria andA24Like(String value) {
            addCriterion("a24 like", value, "a24");
            return (Criteria) this;
        }

        public Criteria andA24NotLike(String value) {
            addCriterion("a24 not like", value, "a24");
            return (Criteria) this;
        }

        public Criteria andA24In(List<String> values) {
            addCriterion("a24 in", values, "a24");
            return (Criteria) this;
        }

        public Criteria andA24NotIn(List<String> values) {
            addCriterion("a24 not in", values, "a24");
            return (Criteria) this;
        }

        public Criteria andA24Between(String value1, String value2) {
            addCriterion("a24 between", value1, value2, "a24");
            return (Criteria) this;
        }

        public Criteria andA24NotBetween(String value1, String value2) {
            addCriterion("a24 not between", value1, value2, "a24");
            return (Criteria) this;
        }

        public Criteria andA25IsNull() {
            addCriterion("a25 is null");
            return (Criteria) this;
        }

        public Criteria andA25IsNotNull() {
            addCriterion("a25 is not null");
            return (Criteria) this;
        }

        public Criteria andA25EqualTo(String value) {
            addCriterion("a25 =", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25NotEqualTo(String value) {
            addCriterion("a25 <>", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25GreaterThan(String value) {
            addCriterion("a25 >", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25GreaterThanOrEqualTo(String value) {
            addCriterion("a25 >=", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25LessThan(String value) {
            addCriterion("a25 <", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25LessThanOrEqualTo(String value) {
            addCriterion("a25 <=", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25Like(String value) {
            addCriterion("a25 like", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25NotLike(String value) {
            addCriterion("a25 not like", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25In(List<String> values) {
            addCriterion("a25 in", values, "a25");
            return (Criteria) this;
        }

        public Criteria andA25NotIn(List<String> values) {
            addCriterion("a25 not in", values, "a25");
            return (Criteria) this;
        }

        public Criteria andA25Between(String value1, String value2) {
            addCriterion("a25 between", value1, value2, "a25");
            return (Criteria) this;
        }

        public Criteria andA25NotBetween(String value1, String value2) {
            addCriterion("a25 not between", value1, value2, "a25");
            return (Criteria) this;
        }

        public Criteria andA26IsNull() {
            addCriterion("a26 is null");
            return (Criteria) this;
        }

        public Criteria andA26IsNotNull() {
            addCriterion("a26 is not null");
            return (Criteria) this;
        }

        public Criteria andA26EqualTo(String value) {
            addCriterion("a26 =", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26NotEqualTo(String value) {
            addCriterion("a26 <>", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26GreaterThan(String value) {
            addCriterion("a26 >", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26GreaterThanOrEqualTo(String value) {
            addCriterion("a26 >=", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26LessThan(String value) {
            addCriterion("a26 <", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26LessThanOrEqualTo(String value) {
            addCriterion("a26 <=", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26Like(String value) {
            addCriterion("a26 like", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26NotLike(String value) {
            addCriterion("a26 not like", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26In(List<String> values) {
            addCriterion("a26 in", values, "a26");
            return (Criteria) this;
        }

        public Criteria andA26NotIn(List<String> values) {
            addCriterion("a26 not in", values, "a26");
            return (Criteria) this;
        }

        public Criteria andA26Between(String value1, String value2) {
            addCriterion("a26 between", value1, value2, "a26");
            return (Criteria) this;
        }

        public Criteria andA26NotBetween(String value1, String value2) {
            addCriterion("a26 not between", value1, value2, "a26");
            return (Criteria) this;
        }

        public Criteria andA27IsNull() {
            addCriterion("a27 is null");
            return (Criteria) this;
        }

        public Criteria andA27IsNotNull() {
            addCriterion("a27 is not null");
            return (Criteria) this;
        }

        public Criteria andA27EqualTo(String value) {
            addCriterion("a27 =", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27NotEqualTo(String value) {
            addCriterion("a27 <>", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27GreaterThan(String value) {
            addCriterion("a27 >", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27GreaterThanOrEqualTo(String value) {
            addCriterion("a27 >=", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27LessThan(String value) {
            addCriterion("a27 <", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27LessThanOrEqualTo(String value) {
            addCriterion("a27 <=", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27Like(String value) {
            addCriterion("a27 like", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27NotLike(String value) {
            addCriterion("a27 not like", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27In(List<String> values) {
            addCriterion("a27 in", values, "a27");
            return (Criteria) this;
        }

        public Criteria andA27NotIn(List<String> values) {
            addCriterion("a27 not in", values, "a27");
            return (Criteria) this;
        }

        public Criteria andA27Between(String value1, String value2) {
            addCriterion("a27 between", value1, value2, "a27");
            return (Criteria) this;
        }

        public Criteria andA27NotBetween(String value1, String value2) {
            addCriterion("a27 not between", value1, value2, "a27");
            return (Criteria) this;
        }

        public Criteria andA28IsNull() {
            addCriterion("a28 is null");
            return (Criteria) this;
        }

        public Criteria andA28IsNotNull() {
            addCriterion("a28 is not null");
            return (Criteria) this;
        }

        public Criteria andA28EqualTo(String value) {
            addCriterion("a28 =", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28NotEqualTo(String value) {
            addCriterion("a28 <>", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28GreaterThan(String value) {
            addCriterion("a28 >", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28GreaterThanOrEqualTo(String value) {
            addCriterion("a28 >=", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28LessThan(String value) {
            addCriterion("a28 <", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28LessThanOrEqualTo(String value) {
            addCriterion("a28 <=", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28Like(String value) {
            addCriterion("a28 like", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28NotLike(String value) {
            addCriterion("a28 not like", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28In(List<String> values) {
            addCriterion("a28 in", values, "a28");
            return (Criteria) this;
        }

        public Criteria andA28NotIn(List<String> values) {
            addCriterion("a28 not in", values, "a28");
            return (Criteria) this;
        }

        public Criteria andA28Between(String value1, String value2) {
            addCriterion("a28 between", value1, value2, "a28");
            return (Criteria) this;
        }

        public Criteria andA28NotBetween(String value1, String value2) {
            addCriterion("a28 not between", value1, value2, "a28");
            return (Criteria) this;
        }

        public Criteria andA29IsNull() {
            addCriterion("a29 is null");
            return (Criteria) this;
        }

        public Criteria andA29IsNotNull() {
            addCriterion("a29 is not null");
            return (Criteria) this;
        }

        public Criteria andA29EqualTo(String value) {
            addCriterion("a29 =", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29NotEqualTo(String value) {
            addCriterion("a29 <>", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29GreaterThan(String value) {
            addCriterion("a29 >", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29GreaterThanOrEqualTo(String value) {
            addCriterion("a29 >=", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29LessThan(String value) {
            addCriterion("a29 <", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29LessThanOrEqualTo(String value) {
            addCriterion("a29 <=", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29Like(String value) {
            addCriterion("a29 like", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29NotLike(String value) {
            addCriterion("a29 not like", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29In(List<String> values) {
            addCriterion("a29 in", values, "a29");
            return (Criteria) this;
        }

        public Criteria andA29NotIn(List<String> values) {
            addCriterion("a29 not in", values, "a29");
            return (Criteria) this;
        }

        public Criteria andA29Between(String value1, String value2) {
            addCriterion("a29 between", value1, value2, "a29");
            return (Criteria) this;
        }

        public Criteria andA29NotBetween(String value1, String value2) {
            addCriterion("a29 not between", value1, value2, "a29");
            return (Criteria) this;
        }

        public Criteria andA30IsNull() {
            addCriterion("a30 is null");
            return (Criteria) this;
        }

        public Criteria andA30IsNotNull() {
            addCriterion("a30 is not null");
            return (Criteria) this;
        }

        public Criteria andA30EqualTo(String value) {
            addCriterion("a30 =", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30NotEqualTo(String value) {
            addCriterion("a30 <>", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30GreaterThan(String value) {
            addCriterion("a30 >", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30GreaterThanOrEqualTo(String value) {
            addCriterion("a30 >=", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30LessThan(String value) {
            addCriterion("a30 <", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30LessThanOrEqualTo(String value) {
            addCriterion("a30 <=", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30Like(String value) {
            addCriterion("a30 like", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30NotLike(String value) {
            addCriterion("a30 not like", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30In(List<String> values) {
            addCriterion("a30 in", values, "a30");
            return (Criteria) this;
        }

        public Criteria andA30NotIn(List<String> values) {
            addCriterion("a30 not in", values, "a30");
            return (Criteria) this;
        }

        public Criteria andA30Between(String value1, String value2) {
            addCriterion("a30 between", value1, value2, "a30");
            return (Criteria) this;
        }

        public Criteria andA30NotBetween(String value1, String value2) {
            addCriterion("a30 not between", value1, value2, "a30");
            return (Criteria) this;
        }

        public Criteria andA31IsNull() {
            addCriterion("a31 is null");
            return (Criteria) this;
        }

        public Criteria andA31IsNotNull() {
            addCriterion("a31 is not null");
            return (Criteria) this;
        }

        public Criteria andA31EqualTo(String value) {
            addCriterion("a31 =", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31NotEqualTo(String value) {
            addCriterion("a31 <>", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31GreaterThan(String value) {
            addCriterion("a31 >", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31GreaterThanOrEqualTo(String value) {
            addCriterion("a31 >=", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31LessThan(String value) {
            addCriterion("a31 <", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31LessThanOrEqualTo(String value) {
            addCriterion("a31 <=", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31Like(String value) {
            addCriterion("a31 like", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31NotLike(String value) {
            addCriterion("a31 not like", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31In(List<String> values) {
            addCriterion("a31 in", values, "a31");
            return (Criteria) this;
        }

        public Criteria andA31NotIn(List<String> values) {
            addCriterion("a31 not in", values, "a31");
            return (Criteria) this;
        }

        public Criteria andA31Between(String value1, String value2) {
            addCriterion("a31 between", value1, value2, "a31");
            return (Criteria) this;
        }

        public Criteria andA31NotBetween(String value1, String value2) {
            addCriterion("a31 not between", value1, value2, "a31");
            return (Criteria) this;
        }

        public Criteria andA32IsNull() {
            addCriterion("a32 is null");
            return (Criteria) this;
        }

        public Criteria andA32IsNotNull() {
            addCriterion("a32 is not null");
            return (Criteria) this;
        }

        public Criteria andA32EqualTo(String value) {
            addCriterion("a32 =", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32NotEqualTo(String value) {
            addCriterion("a32 <>", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32GreaterThan(String value) {
            addCriterion("a32 >", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32GreaterThanOrEqualTo(String value) {
            addCriterion("a32 >=", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32LessThan(String value) {
            addCriterion("a32 <", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32LessThanOrEqualTo(String value) {
            addCriterion("a32 <=", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32Like(String value) {
            addCriterion("a32 like", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32NotLike(String value) {
            addCriterion("a32 not like", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32In(List<String> values) {
            addCriterion("a32 in", values, "a32");
            return (Criteria) this;
        }

        public Criteria andA32NotIn(List<String> values) {
            addCriterion("a32 not in", values, "a32");
            return (Criteria) this;
        }

        public Criteria andA32Between(String value1, String value2) {
            addCriterion("a32 between", value1, value2, "a32");
            return (Criteria) this;
        }

        public Criteria andA32NotBetween(String value1, String value2) {
            addCriterion("a32 not between", value1, value2, "a32");
            return (Criteria) this;
        }

        public Criteria andB01IsNull() {
            addCriterion("b01 is null");
            return (Criteria) this;
        }

        public Criteria andB01IsNotNull() {
            addCriterion("b01 is not null");
            return (Criteria) this;
        }

        public Criteria andB01EqualTo(String value) {
            addCriterion("b01 =", value, "b01");
            return (Criteria) this;
        }

        public Criteria andB01NotEqualTo(String value) {
            addCriterion("b01 <>", value, "b01");
            return (Criteria) this;
        }

        public Criteria andB01GreaterThan(String value) {
            addCriterion("b01 >", value, "b01");
            return (Criteria) this;
        }

        public Criteria andB01GreaterThanOrEqualTo(String value) {
            addCriterion("b01 >=", value, "b01");
            return (Criteria) this;
        }

        public Criteria andB01LessThan(String value) {
            addCriterion("b01 <", value, "b01");
            return (Criteria) this;
        }

        public Criteria andB01LessThanOrEqualTo(String value) {
            addCriterion("b01 <=", value, "b01");
            return (Criteria) this;
        }

        public Criteria andB01Like(String value) {
            addCriterion("b01 like", value, "b01");
            return (Criteria) this;
        }

        public Criteria andB01NotLike(String value) {
            addCriterion("b01 not like", value, "b01");
            return (Criteria) this;
        }

        public Criteria andB01In(List<String> values) {
            addCriterion("b01 in", values, "b01");
            return (Criteria) this;
        }

        public Criteria andB01NotIn(List<String> values) {
            addCriterion("b01 not in", values, "b01");
            return (Criteria) this;
        }

        public Criteria andB01Between(String value1, String value2) {
            addCriterion("b01 between", value1, value2, "b01");
            return (Criteria) this;
        }

        public Criteria andB01NotBetween(String value1, String value2) {
            addCriterion("b01 not between", value1, value2, "b01");
            return (Criteria) this;
        }

        public Criteria andB02IsNull() {
            addCriterion("b02 is null");
            return (Criteria) this;
        }

        public Criteria andB02IsNotNull() {
            addCriterion("b02 is not null");
            return (Criteria) this;
        }

        public Criteria andB02EqualTo(String value) {
            addCriterion("b02 =", value, "b02");
            return (Criteria) this;
        }

        public Criteria andB02NotEqualTo(String value) {
            addCriterion("b02 <>", value, "b02");
            return (Criteria) this;
        }

        public Criteria andB02GreaterThan(String value) {
            addCriterion("b02 >", value, "b02");
            return (Criteria) this;
        }

        public Criteria andB02GreaterThanOrEqualTo(String value) {
            addCriterion("b02 >=", value, "b02");
            return (Criteria) this;
        }

        public Criteria andB02LessThan(String value) {
            addCriterion("b02 <", value, "b02");
            return (Criteria) this;
        }

        public Criteria andB02LessThanOrEqualTo(String value) {
            addCriterion("b02 <=", value, "b02");
            return (Criteria) this;
        }

        public Criteria andB02Like(String value) {
            addCriterion("b02 like", value, "b02");
            return (Criteria) this;
        }

        public Criteria andB02NotLike(String value) {
            addCriterion("b02 not like", value, "b02");
            return (Criteria) this;
        }

        public Criteria andB02In(List<String> values) {
            addCriterion("b02 in", values, "b02");
            return (Criteria) this;
        }

        public Criteria andB02NotIn(List<String> values) {
            addCriterion("b02 not in", values, "b02");
            return (Criteria) this;
        }

        public Criteria andB02Between(String value1, String value2) {
            addCriterion("b02 between", value1, value2, "b02");
            return (Criteria) this;
        }

        public Criteria andB02NotBetween(String value1, String value2) {
            addCriterion("b02 not between", value1, value2, "b02");
            return (Criteria) this;
        }

        public Criteria andB03IsNull() {
            addCriterion("b03 is null");
            return (Criteria) this;
        }

        public Criteria andB03IsNotNull() {
            addCriterion("b03 is not null");
            return (Criteria) this;
        }

        public Criteria andB03EqualTo(String value) {
            addCriterion("b03 =", value, "b03");
            return (Criteria) this;
        }

        public Criteria andB03NotEqualTo(String value) {
            addCriterion("b03 <>", value, "b03");
            return (Criteria) this;
        }

        public Criteria andB03GreaterThan(String value) {
            addCriterion("b03 >", value, "b03");
            return (Criteria) this;
        }

        public Criteria andB03GreaterThanOrEqualTo(String value) {
            addCriterion("b03 >=", value, "b03");
            return (Criteria) this;
        }

        public Criteria andB03LessThan(String value) {
            addCriterion("b03 <", value, "b03");
            return (Criteria) this;
        }

        public Criteria andB03LessThanOrEqualTo(String value) {
            addCriterion("b03 <=", value, "b03");
            return (Criteria) this;
        }

        public Criteria andB03Like(String value) {
            addCriterion("b03 like", value, "b03");
            return (Criteria) this;
        }

        public Criteria andB03NotLike(String value) {
            addCriterion("b03 not like", value, "b03");
            return (Criteria) this;
        }

        public Criteria andB03In(List<String> values) {
            addCriterion("b03 in", values, "b03");
            return (Criteria) this;
        }

        public Criteria andB03NotIn(List<String> values) {
            addCriterion("b03 not in", values, "b03");
            return (Criteria) this;
        }

        public Criteria andB03Between(String value1, String value2) {
            addCriterion("b03 between", value1, value2, "b03");
            return (Criteria) this;
        }

        public Criteria andB03NotBetween(String value1, String value2) {
            addCriterion("b03 not between", value1, value2, "b03");
            return (Criteria) this;
        }

        public Criteria andB04IsNull() {
            addCriterion("b04 is null");
            return (Criteria) this;
        }

        public Criteria andB04IsNotNull() {
            addCriterion("b04 is not null");
            return (Criteria) this;
        }

        public Criteria andB04EqualTo(String value) {
            addCriterion("b04 =", value, "b04");
            return (Criteria) this;
        }

        public Criteria andB04NotEqualTo(String value) {
            addCriterion("b04 <>", value, "b04");
            return (Criteria) this;
        }

        public Criteria andB04GreaterThan(String value) {
            addCriterion("b04 >", value, "b04");
            return (Criteria) this;
        }

        public Criteria andB04GreaterThanOrEqualTo(String value) {
            addCriterion("b04 >=", value, "b04");
            return (Criteria) this;
        }

        public Criteria andB04LessThan(String value) {
            addCriterion("b04 <", value, "b04");
            return (Criteria) this;
        }

        public Criteria andB04LessThanOrEqualTo(String value) {
            addCriterion("b04 <=", value, "b04");
            return (Criteria) this;
        }

        public Criteria andB04Like(String value) {
            addCriterion("b04 like", value, "b04");
            return (Criteria) this;
        }

        public Criteria andB04NotLike(String value) {
            addCriterion("b04 not like", value, "b04");
            return (Criteria) this;
        }

        public Criteria andB04In(List<String> values) {
            addCriterion("b04 in", values, "b04");
            return (Criteria) this;
        }

        public Criteria andB04NotIn(List<String> values) {
            addCriterion("b04 not in", values, "b04");
            return (Criteria) this;
        }

        public Criteria andB04Between(String value1, String value2) {
            addCriterion("b04 between", value1, value2, "b04");
            return (Criteria) this;
        }

        public Criteria andB04NotBetween(String value1, String value2) {
            addCriterion("b04 not between", value1, value2, "b04");
            return (Criteria) this;
        }

        public Criteria andB05IsNull() {
            addCriterion("b05 is null");
            return (Criteria) this;
        }

        public Criteria andB05IsNotNull() {
            addCriterion("b05 is not null");
            return (Criteria) this;
        }

        public Criteria andB05EqualTo(String value) {
            addCriterion("b05 =", value, "b05");
            return (Criteria) this;
        }

        public Criteria andB05NotEqualTo(String value) {
            addCriterion("b05 <>", value, "b05");
            return (Criteria) this;
        }

        public Criteria andB05GreaterThan(String value) {
            addCriterion("b05 >", value, "b05");
            return (Criteria) this;
        }

        public Criteria andB05GreaterThanOrEqualTo(String value) {
            addCriterion("b05 >=", value, "b05");
            return (Criteria) this;
        }

        public Criteria andB05LessThan(String value) {
            addCriterion("b05 <", value, "b05");
            return (Criteria) this;
        }

        public Criteria andB05LessThanOrEqualTo(String value) {
            addCriterion("b05 <=", value, "b05");
            return (Criteria) this;
        }

        public Criteria andB05Like(String value) {
            addCriterion("b05 like", value, "b05");
            return (Criteria) this;
        }

        public Criteria andB05NotLike(String value) {
            addCriterion("b05 not like", value, "b05");
            return (Criteria) this;
        }

        public Criteria andB05In(List<String> values) {
            addCriterion("b05 in", values, "b05");
            return (Criteria) this;
        }

        public Criteria andB05NotIn(List<String> values) {
            addCriterion("b05 not in", values, "b05");
            return (Criteria) this;
        }

        public Criteria andB05Between(String value1, String value2) {
            addCriterion("b05 between", value1, value2, "b05");
            return (Criteria) this;
        }

        public Criteria andB05NotBetween(String value1, String value2) {
            addCriterion("b05 not between", value1, value2, "b05");
            return (Criteria) this;
        }

        public Criteria andB06IsNull() {
            addCriterion("b06 is null");
            return (Criteria) this;
        }

        public Criteria andB06IsNotNull() {
            addCriterion("b06 is not null");
            return (Criteria) this;
        }

        public Criteria andB06EqualTo(String value) {
            addCriterion("b06 =", value, "b06");
            return (Criteria) this;
        }

        public Criteria andB06NotEqualTo(String value) {
            addCriterion("b06 <>", value, "b06");
            return (Criteria) this;
        }

        public Criteria andB06GreaterThan(String value) {
            addCriterion("b06 >", value, "b06");
            return (Criteria) this;
        }

        public Criteria andB06GreaterThanOrEqualTo(String value) {
            addCriterion("b06 >=", value, "b06");
            return (Criteria) this;
        }

        public Criteria andB06LessThan(String value) {
            addCriterion("b06 <", value, "b06");
            return (Criteria) this;
        }

        public Criteria andB06LessThanOrEqualTo(String value) {
            addCriterion("b06 <=", value, "b06");
            return (Criteria) this;
        }

        public Criteria andB06Like(String value) {
            addCriterion("b06 like", value, "b06");
            return (Criteria) this;
        }

        public Criteria andB06NotLike(String value) {
            addCriterion("b06 not like", value, "b06");
            return (Criteria) this;
        }

        public Criteria andB06In(List<String> values) {
            addCriterion("b06 in", values, "b06");
            return (Criteria) this;
        }

        public Criteria andB06NotIn(List<String> values) {
            addCriterion("b06 not in", values, "b06");
            return (Criteria) this;
        }

        public Criteria andB06Between(String value1, String value2) {
            addCriterion("b06 between", value1, value2, "b06");
            return (Criteria) this;
        }

        public Criteria andB06NotBetween(String value1, String value2) {
            addCriterion("b06 not between", value1, value2, "b06");
            return (Criteria) this;
        }

        public Criteria andB07IsNull() {
            addCriterion("b07 is null");
            return (Criteria) this;
        }

        public Criteria andB07IsNotNull() {
            addCriterion("b07 is not null");
            return (Criteria) this;
        }

        public Criteria andB07EqualTo(String value) {
            addCriterion("b07 =", value, "b07");
            return (Criteria) this;
        }

        public Criteria andB07NotEqualTo(String value) {
            addCriterion("b07 <>", value, "b07");
            return (Criteria) this;
        }

        public Criteria andB07GreaterThan(String value) {
            addCriterion("b07 >", value, "b07");
            return (Criteria) this;
        }

        public Criteria andB07GreaterThanOrEqualTo(String value) {
            addCriterion("b07 >=", value, "b07");
            return (Criteria) this;
        }

        public Criteria andB07LessThan(String value) {
            addCriterion("b07 <", value, "b07");
            return (Criteria) this;
        }

        public Criteria andB07LessThanOrEqualTo(String value) {
            addCriterion("b07 <=", value, "b07");
            return (Criteria) this;
        }

        public Criteria andB07Like(String value) {
            addCriterion("b07 like", value, "b07");
            return (Criteria) this;
        }

        public Criteria andB07NotLike(String value) {
            addCriterion("b07 not like", value, "b07");
            return (Criteria) this;
        }

        public Criteria andB07In(List<String> values) {
            addCriterion("b07 in", values, "b07");
            return (Criteria) this;
        }

        public Criteria andB07NotIn(List<String> values) {
            addCriterion("b07 not in", values, "b07");
            return (Criteria) this;
        }

        public Criteria andB07Between(String value1, String value2) {
            addCriterion("b07 between", value1, value2, "b07");
            return (Criteria) this;
        }

        public Criteria andB07NotBetween(String value1, String value2) {
            addCriterion("b07 not between", value1, value2, "b07");
            return (Criteria) this;
        }

        public Criteria andB08IsNull() {
            addCriterion("b08 is null");
            return (Criteria) this;
        }

        public Criteria andB08IsNotNull() {
            addCriterion("b08 is not null");
            return (Criteria) this;
        }

        public Criteria andB08EqualTo(String value) {
            addCriterion("b08 =", value, "b08");
            return (Criteria) this;
        }

        public Criteria andB08NotEqualTo(String value) {
            addCriterion("b08 <>", value, "b08");
            return (Criteria) this;
        }

        public Criteria andB08GreaterThan(String value) {
            addCriterion("b08 >", value, "b08");
            return (Criteria) this;
        }

        public Criteria andB08GreaterThanOrEqualTo(String value) {
            addCriterion("b08 >=", value, "b08");
            return (Criteria) this;
        }

        public Criteria andB08LessThan(String value) {
            addCriterion("b08 <", value, "b08");
            return (Criteria) this;
        }

        public Criteria andB08LessThanOrEqualTo(String value) {
            addCriterion("b08 <=", value, "b08");
            return (Criteria) this;
        }

        public Criteria andB08Like(String value) {
            addCriterion("b08 like", value, "b08");
            return (Criteria) this;
        }

        public Criteria andB08NotLike(String value) {
            addCriterion("b08 not like", value, "b08");
            return (Criteria) this;
        }

        public Criteria andB08In(List<String> values) {
            addCriterion("b08 in", values, "b08");
            return (Criteria) this;
        }

        public Criteria andB08NotIn(List<String> values) {
            addCriterion("b08 not in", values, "b08");
            return (Criteria) this;
        }

        public Criteria andB08Between(String value1, String value2) {
            addCriterion("b08 between", value1, value2, "b08");
            return (Criteria) this;
        }

        public Criteria andB08NotBetween(String value1, String value2) {
            addCriterion("b08 not between", value1, value2, "b08");
            return (Criteria) this;
        }

        public Criteria andB09IsNull() {
            addCriterion("b09 is null");
            return (Criteria) this;
        }

        public Criteria andB09IsNotNull() {
            addCriterion("b09 is not null");
            return (Criteria) this;
        }

        public Criteria andB09EqualTo(String value) {
            addCriterion("b09 =", value, "b09");
            return (Criteria) this;
        }

        public Criteria andB09NotEqualTo(String value) {
            addCriterion("b09 <>", value, "b09");
            return (Criteria) this;
        }

        public Criteria andB09GreaterThan(String value) {
            addCriterion("b09 >", value, "b09");
            return (Criteria) this;
        }

        public Criteria andB09GreaterThanOrEqualTo(String value) {
            addCriterion("b09 >=", value, "b09");
            return (Criteria) this;
        }

        public Criteria andB09LessThan(String value) {
            addCriterion("b09 <", value, "b09");
            return (Criteria) this;
        }

        public Criteria andB09LessThanOrEqualTo(String value) {
            addCriterion("b09 <=", value, "b09");
            return (Criteria) this;
        }

        public Criteria andB09Like(String value) {
            addCriterion("b09 like", value, "b09");
            return (Criteria) this;
        }

        public Criteria andB09NotLike(String value) {
            addCriterion("b09 not like", value, "b09");
            return (Criteria) this;
        }

        public Criteria andB09In(List<String> values) {
            addCriterion("b09 in", values, "b09");
            return (Criteria) this;
        }

        public Criteria andB09NotIn(List<String> values) {
            addCriterion("b09 not in", values, "b09");
            return (Criteria) this;
        }

        public Criteria andB09Between(String value1, String value2) {
            addCriterion("b09 between", value1, value2, "b09");
            return (Criteria) this;
        }

        public Criteria andB09NotBetween(String value1, String value2) {
            addCriterion("b09 not between", value1, value2, "b09");
            return (Criteria) this;
        }

        public Criteria andB10IsNull() {
            addCriterion("b10 is null");
            return (Criteria) this;
        }

        public Criteria andB10IsNotNull() {
            addCriterion("b10 is not null");
            return (Criteria) this;
        }

        public Criteria andB10EqualTo(String value) {
            addCriterion("b10 =", value, "b10");
            return (Criteria) this;
        }

        public Criteria andB10NotEqualTo(String value) {
            addCriterion("b10 <>", value, "b10");
            return (Criteria) this;
        }

        public Criteria andB10GreaterThan(String value) {
            addCriterion("b10 >", value, "b10");
            return (Criteria) this;
        }

        public Criteria andB10GreaterThanOrEqualTo(String value) {
            addCriterion("b10 >=", value, "b10");
            return (Criteria) this;
        }

        public Criteria andB10LessThan(String value) {
            addCriterion("b10 <", value, "b10");
            return (Criteria) this;
        }

        public Criteria andB10LessThanOrEqualTo(String value) {
            addCriterion("b10 <=", value, "b10");
            return (Criteria) this;
        }

        public Criteria andB10Like(String value) {
            addCriterion("b10 like", value, "b10");
            return (Criteria) this;
        }

        public Criteria andB10NotLike(String value) {
            addCriterion("b10 not like", value, "b10");
            return (Criteria) this;
        }

        public Criteria andB10In(List<String> values) {
            addCriterion("b10 in", values, "b10");
            return (Criteria) this;
        }

        public Criteria andB10NotIn(List<String> values) {
            addCriterion("b10 not in", values, "b10");
            return (Criteria) this;
        }

        public Criteria andB10Between(String value1, String value2) {
            addCriterion("b10 between", value1, value2, "b10");
            return (Criteria) this;
        }

        public Criteria andB10NotBetween(String value1, String value2) {
            addCriterion("b10 not between", value1, value2, "b10");
            return (Criteria) this;
        }

        public Criteria andB11IsNull() {
            addCriterion("b11 is null");
            return (Criteria) this;
        }

        public Criteria andB11IsNotNull() {
            addCriterion("b11 is not null");
            return (Criteria) this;
        }

        public Criteria andB11EqualTo(String value) {
            addCriterion("b11 =", value, "b11");
            return (Criteria) this;
        }

        public Criteria andB11NotEqualTo(String value) {
            addCriterion("b11 <>", value, "b11");
            return (Criteria) this;
        }

        public Criteria andB11GreaterThan(String value) {
            addCriterion("b11 >", value, "b11");
            return (Criteria) this;
        }

        public Criteria andB11GreaterThanOrEqualTo(String value) {
            addCriterion("b11 >=", value, "b11");
            return (Criteria) this;
        }

        public Criteria andB11LessThan(String value) {
            addCriterion("b11 <", value, "b11");
            return (Criteria) this;
        }

        public Criteria andB11LessThanOrEqualTo(String value) {
            addCriterion("b11 <=", value, "b11");
            return (Criteria) this;
        }

        public Criteria andB11Like(String value) {
            addCriterion("b11 like", value, "b11");
            return (Criteria) this;
        }

        public Criteria andB11NotLike(String value) {
            addCriterion("b11 not like", value, "b11");
            return (Criteria) this;
        }

        public Criteria andB11In(List<String> values) {
            addCriterion("b11 in", values, "b11");
            return (Criteria) this;
        }

        public Criteria andB11NotIn(List<String> values) {
            addCriterion("b11 not in", values, "b11");
            return (Criteria) this;
        }

        public Criteria andB11Between(String value1, String value2) {
            addCriterion("b11 between", value1, value2, "b11");
            return (Criteria) this;
        }

        public Criteria andB11NotBetween(String value1, String value2) {
            addCriterion("b11 not between", value1, value2, "b11");
            return (Criteria) this;
        }

        public Criteria andB12IsNull() {
            addCriterion("b12 is null");
            return (Criteria) this;
        }

        public Criteria andB12IsNotNull() {
            addCriterion("b12 is not null");
            return (Criteria) this;
        }

        public Criteria andB12EqualTo(String value) {
            addCriterion("b12 =", value, "b12");
            return (Criteria) this;
        }

        public Criteria andB12NotEqualTo(String value) {
            addCriterion("b12 <>", value, "b12");
            return (Criteria) this;
        }

        public Criteria andB12GreaterThan(String value) {
            addCriterion("b12 >", value, "b12");
            return (Criteria) this;
        }

        public Criteria andB12GreaterThanOrEqualTo(String value) {
            addCriterion("b12 >=", value, "b12");
            return (Criteria) this;
        }

        public Criteria andB12LessThan(String value) {
            addCriterion("b12 <", value, "b12");
            return (Criteria) this;
        }

        public Criteria andB12LessThanOrEqualTo(String value) {
            addCriterion("b12 <=", value, "b12");
            return (Criteria) this;
        }

        public Criteria andB12Like(String value) {
            addCriterion("b12 like", value, "b12");
            return (Criteria) this;
        }

        public Criteria andB12NotLike(String value) {
            addCriterion("b12 not like", value, "b12");
            return (Criteria) this;
        }

        public Criteria andB12In(List<String> values) {
            addCriterion("b12 in", values, "b12");
            return (Criteria) this;
        }

        public Criteria andB12NotIn(List<String> values) {
            addCriterion("b12 not in", values, "b12");
            return (Criteria) this;
        }

        public Criteria andB12Between(String value1, String value2) {
            addCriterion("b12 between", value1, value2, "b12");
            return (Criteria) this;
        }

        public Criteria andB12NotBetween(String value1, String value2) {
            addCriterion("b12 not between", value1, value2, "b12");
            return (Criteria) this;
        }

        public Criteria andB13IsNull() {
            addCriterion("b13 is null");
            return (Criteria) this;
        }

        public Criteria andB13IsNotNull() {
            addCriterion("b13 is not null");
            return (Criteria) this;
        }

        public Criteria andB13EqualTo(String value) {
            addCriterion("b13 =", value, "b13");
            return (Criteria) this;
        }

        public Criteria andB13NotEqualTo(String value) {
            addCriterion("b13 <>", value, "b13");
            return (Criteria) this;
        }

        public Criteria andB13GreaterThan(String value) {
            addCriterion("b13 >", value, "b13");
            return (Criteria) this;
        }

        public Criteria andB13GreaterThanOrEqualTo(String value) {
            addCriterion("b13 >=", value, "b13");
            return (Criteria) this;
        }

        public Criteria andB13LessThan(String value) {
            addCriterion("b13 <", value, "b13");
            return (Criteria) this;
        }

        public Criteria andB13LessThanOrEqualTo(String value) {
            addCriterion("b13 <=", value, "b13");
            return (Criteria) this;
        }

        public Criteria andB13Like(String value) {
            addCriterion("b13 like", value, "b13");
            return (Criteria) this;
        }

        public Criteria andB13NotLike(String value) {
            addCriterion("b13 not like", value, "b13");
            return (Criteria) this;
        }

        public Criteria andB13In(List<String> values) {
            addCriterion("b13 in", values, "b13");
            return (Criteria) this;
        }

        public Criteria andB13NotIn(List<String> values) {
            addCriterion("b13 not in", values, "b13");
            return (Criteria) this;
        }

        public Criteria andB13Between(String value1, String value2) {
            addCriterion("b13 between", value1, value2, "b13");
            return (Criteria) this;
        }

        public Criteria andB13NotBetween(String value1, String value2) {
            addCriterion("b13 not between", value1, value2, "b13");
            return (Criteria) this;
        }

        public Criteria andB14IsNull() {
            addCriterion("b14 is null");
            return (Criteria) this;
        }

        public Criteria andB14IsNotNull() {
            addCriterion("b14 is not null");
            return (Criteria) this;
        }

        public Criteria andB14EqualTo(String value) {
            addCriterion("b14 =", value, "b14");
            return (Criteria) this;
        }

        public Criteria andB14NotEqualTo(String value) {
            addCriterion("b14 <>", value, "b14");
            return (Criteria) this;
        }

        public Criteria andB14GreaterThan(String value) {
            addCriterion("b14 >", value, "b14");
            return (Criteria) this;
        }

        public Criteria andB14GreaterThanOrEqualTo(String value) {
            addCriterion("b14 >=", value, "b14");
            return (Criteria) this;
        }

        public Criteria andB14LessThan(String value) {
            addCriterion("b14 <", value, "b14");
            return (Criteria) this;
        }

        public Criteria andB14LessThanOrEqualTo(String value) {
            addCriterion("b14 <=", value, "b14");
            return (Criteria) this;
        }

        public Criteria andB14Like(String value) {
            addCriterion("b14 like", value, "b14");
            return (Criteria) this;
        }

        public Criteria andB14NotLike(String value) {
            addCriterion("b14 not like", value, "b14");
            return (Criteria) this;
        }

        public Criteria andB14In(List<String> values) {
            addCriterion("b14 in", values, "b14");
            return (Criteria) this;
        }

        public Criteria andB14NotIn(List<String> values) {
            addCriterion("b14 not in", values, "b14");
            return (Criteria) this;
        }

        public Criteria andB14Between(String value1, String value2) {
            addCriterion("b14 between", value1, value2, "b14");
            return (Criteria) this;
        }

        public Criteria andB14NotBetween(String value1, String value2) {
            addCriterion("b14 not between", value1, value2, "b14");
            return (Criteria) this;
        }

        public Criteria andB15IsNull() {
            addCriterion("b15 is null");
            return (Criteria) this;
        }

        public Criteria andB15IsNotNull() {
            addCriterion("b15 is not null");
            return (Criteria) this;
        }

        public Criteria andB15EqualTo(String value) {
            addCriterion("b15 =", value, "b15");
            return (Criteria) this;
        }

        public Criteria andB15NotEqualTo(String value) {
            addCriterion("b15 <>", value, "b15");
            return (Criteria) this;
        }

        public Criteria andB15GreaterThan(String value) {
            addCriterion("b15 >", value, "b15");
            return (Criteria) this;
        }

        public Criteria andB15GreaterThanOrEqualTo(String value) {
            addCriterion("b15 >=", value, "b15");
            return (Criteria) this;
        }

        public Criteria andB15LessThan(String value) {
            addCriterion("b15 <", value, "b15");
            return (Criteria) this;
        }

        public Criteria andB15LessThanOrEqualTo(String value) {
            addCriterion("b15 <=", value, "b15");
            return (Criteria) this;
        }

        public Criteria andB15Like(String value) {
            addCriterion("b15 like", value, "b15");
            return (Criteria) this;
        }

        public Criteria andB15NotLike(String value) {
            addCriterion("b15 not like", value, "b15");
            return (Criteria) this;
        }

        public Criteria andB15In(List<String> values) {
            addCriterion("b15 in", values, "b15");
            return (Criteria) this;
        }

        public Criteria andB15NotIn(List<String> values) {
            addCriterion("b15 not in", values, "b15");
            return (Criteria) this;
        }

        public Criteria andB15Between(String value1, String value2) {
            addCriterion("b15 between", value1, value2, "b15");
            return (Criteria) this;
        }

        public Criteria andB15NotBetween(String value1, String value2) {
            addCriterion("b15 not between", value1, value2, "b15");
            return (Criteria) this;
        }

        public Criteria andB16IsNull() {
            addCriterion("b16 is null");
            return (Criteria) this;
        }

        public Criteria andB16IsNotNull() {
            addCriterion("b16 is not null");
            return (Criteria) this;
        }

        public Criteria andB16EqualTo(String value) {
            addCriterion("b16 =", value, "b16");
            return (Criteria) this;
        }

        public Criteria andB16NotEqualTo(String value) {
            addCriterion("b16 <>", value, "b16");
            return (Criteria) this;
        }

        public Criteria andB16GreaterThan(String value) {
            addCriterion("b16 >", value, "b16");
            return (Criteria) this;
        }

        public Criteria andB16GreaterThanOrEqualTo(String value) {
            addCriterion("b16 >=", value, "b16");
            return (Criteria) this;
        }

        public Criteria andB16LessThan(String value) {
            addCriterion("b16 <", value, "b16");
            return (Criteria) this;
        }

        public Criteria andB16LessThanOrEqualTo(String value) {
            addCriterion("b16 <=", value, "b16");
            return (Criteria) this;
        }

        public Criteria andB16Like(String value) {
            addCriterion("b16 like", value, "b16");
            return (Criteria) this;
        }

        public Criteria andB16NotLike(String value) {
            addCriterion("b16 not like", value, "b16");
            return (Criteria) this;
        }

        public Criteria andB16In(List<String> values) {
            addCriterion("b16 in", values, "b16");
            return (Criteria) this;
        }

        public Criteria andB16NotIn(List<String> values) {
            addCriterion("b16 not in", values, "b16");
            return (Criteria) this;
        }

        public Criteria andB16Between(String value1, String value2) {
            addCriterion("b16 between", value1, value2, "b16");
            return (Criteria) this;
        }

        public Criteria andB16NotBetween(String value1, String value2) {
            addCriterion("b16 not between", value1, value2, "b16");
            return (Criteria) this;
        }

        public Criteria andB17IsNull() {
            addCriterion("b17 is null");
            return (Criteria) this;
        }

        public Criteria andB17IsNotNull() {
            addCriterion("b17 is not null");
            return (Criteria) this;
        }

        public Criteria andB17EqualTo(String value) {
            addCriterion("b17 =", value, "b17");
            return (Criteria) this;
        }

        public Criteria andB17NotEqualTo(String value) {
            addCriterion("b17 <>", value, "b17");
            return (Criteria) this;
        }

        public Criteria andB17GreaterThan(String value) {
            addCriterion("b17 >", value, "b17");
            return (Criteria) this;
        }

        public Criteria andB17GreaterThanOrEqualTo(String value) {
            addCriterion("b17 >=", value, "b17");
            return (Criteria) this;
        }

        public Criteria andB17LessThan(String value) {
            addCriterion("b17 <", value, "b17");
            return (Criteria) this;
        }

        public Criteria andB17LessThanOrEqualTo(String value) {
            addCriterion("b17 <=", value, "b17");
            return (Criteria) this;
        }

        public Criteria andB17Like(String value) {
            addCriterion("b17 like", value, "b17");
            return (Criteria) this;
        }

        public Criteria andB17NotLike(String value) {
            addCriterion("b17 not like", value, "b17");
            return (Criteria) this;
        }

        public Criteria andB17In(List<String> values) {
            addCriterion("b17 in", values, "b17");
            return (Criteria) this;
        }

        public Criteria andB17NotIn(List<String> values) {
            addCriterion("b17 not in", values, "b17");
            return (Criteria) this;
        }

        public Criteria andB17Between(String value1, String value2) {
            addCriterion("b17 between", value1, value2, "b17");
            return (Criteria) this;
        }

        public Criteria andB17NotBetween(String value1, String value2) {
            addCriterion("b17 not between", value1, value2, "b17");
            return (Criteria) this;
        }

        public Criteria andB18IsNull() {
            addCriterion("b18 is null");
            return (Criteria) this;
        }

        public Criteria andB18IsNotNull() {
            addCriterion("b18 is not null");
            return (Criteria) this;
        }

        public Criteria andB18EqualTo(String value) {
            addCriterion("b18 =", value, "b18");
            return (Criteria) this;
        }

        public Criteria andB18NotEqualTo(String value) {
            addCriterion("b18 <>", value, "b18");
            return (Criteria) this;
        }

        public Criteria andB18GreaterThan(String value) {
            addCriterion("b18 >", value, "b18");
            return (Criteria) this;
        }

        public Criteria andB18GreaterThanOrEqualTo(String value) {
            addCriterion("b18 >=", value, "b18");
            return (Criteria) this;
        }

        public Criteria andB18LessThan(String value) {
            addCriterion("b18 <", value, "b18");
            return (Criteria) this;
        }

        public Criteria andB18LessThanOrEqualTo(String value) {
            addCriterion("b18 <=", value, "b18");
            return (Criteria) this;
        }

        public Criteria andB18Like(String value) {
            addCriterion("b18 like", value, "b18");
            return (Criteria) this;
        }

        public Criteria andB18NotLike(String value) {
            addCriterion("b18 not like", value, "b18");
            return (Criteria) this;
        }

        public Criteria andB18In(List<String> values) {
            addCriterion("b18 in", values, "b18");
            return (Criteria) this;
        }

        public Criteria andB18NotIn(List<String> values) {
            addCriterion("b18 not in", values, "b18");
            return (Criteria) this;
        }

        public Criteria andB18Between(String value1, String value2) {
            addCriterion("b18 between", value1, value2, "b18");
            return (Criteria) this;
        }

        public Criteria andB18NotBetween(String value1, String value2) {
            addCriterion("b18 not between", value1, value2, "b18");
            return (Criteria) this;
        }

        public Criteria andB19IsNull() {
            addCriterion("b19 is null");
            return (Criteria) this;
        }

        public Criteria andB19IsNotNull() {
            addCriterion("b19 is not null");
            return (Criteria) this;
        }

        public Criteria andB19EqualTo(String value) {
            addCriterion("b19 =", value, "b19");
            return (Criteria) this;
        }

        public Criteria andB19NotEqualTo(String value) {
            addCriterion("b19 <>", value, "b19");
            return (Criteria) this;
        }

        public Criteria andB19GreaterThan(String value) {
            addCriterion("b19 >", value, "b19");
            return (Criteria) this;
        }

        public Criteria andB19GreaterThanOrEqualTo(String value) {
            addCriterion("b19 >=", value, "b19");
            return (Criteria) this;
        }

        public Criteria andB19LessThan(String value) {
            addCriterion("b19 <", value, "b19");
            return (Criteria) this;
        }

        public Criteria andB19LessThanOrEqualTo(String value) {
            addCriterion("b19 <=", value, "b19");
            return (Criteria) this;
        }

        public Criteria andB19Like(String value) {
            addCriterion("b19 like", value, "b19");
            return (Criteria) this;
        }

        public Criteria andB19NotLike(String value) {
            addCriterion("b19 not like", value, "b19");
            return (Criteria) this;
        }

        public Criteria andB19In(List<String> values) {
            addCriterion("b19 in", values, "b19");
            return (Criteria) this;
        }

        public Criteria andB19NotIn(List<String> values) {
            addCriterion("b19 not in", values, "b19");
            return (Criteria) this;
        }

        public Criteria andB19Between(String value1, String value2) {
            addCriterion("b19 between", value1, value2, "b19");
            return (Criteria) this;
        }

        public Criteria andB19NotBetween(String value1, String value2) {
            addCriterion("b19 not between", value1, value2, "b19");
            return (Criteria) this;
        }

        public Criteria andB20IsNull() {
            addCriterion("b20 is null");
            return (Criteria) this;
        }

        public Criteria andB20IsNotNull() {
            addCriterion("b20 is not null");
            return (Criteria) this;
        }

        public Criteria andB20EqualTo(String value) {
            addCriterion("b20 =", value, "b20");
            return (Criteria) this;
        }

        public Criteria andB20NotEqualTo(String value) {
            addCriterion("b20 <>", value, "b20");
            return (Criteria) this;
        }

        public Criteria andB20GreaterThan(String value) {
            addCriterion("b20 >", value, "b20");
            return (Criteria) this;
        }

        public Criteria andB20GreaterThanOrEqualTo(String value) {
            addCriterion("b20 >=", value, "b20");
            return (Criteria) this;
        }

        public Criteria andB20LessThan(String value) {
            addCriterion("b20 <", value, "b20");
            return (Criteria) this;
        }

        public Criteria andB20LessThanOrEqualTo(String value) {
            addCriterion("b20 <=", value, "b20");
            return (Criteria) this;
        }

        public Criteria andB20Like(String value) {
            addCriterion("b20 like", value, "b20");
            return (Criteria) this;
        }

        public Criteria andB20NotLike(String value) {
            addCriterion("b20 not like", value, "b20");
            return (Criteria) this;
        }

        public Criteria andB20In(List<String> values) {
            addCriterion("b20 in", values, "b20");
            return (Criteria) this;
        }

        public Criteria andB20NotIn(List<String> values) {
            addCriterion("b20 not in", values, "b20");
            return (Criteria) this;
        }

        public Criteria andB20Between(String value1, String value2) {
            addCriterion("b20 between", value1, value2, "b20");
            return (Criteria) this;
        }

        public Criteria andB20NotBetween(String value1, String value2) {
            addCriterion("b20 not between", value1, value2, "b20");
            return (Criteria) this;
        }

        public Criteria andB21IsNull() {
            addCriterion("b21 is null");
            return (Criteria) this;
        }

        public Criteria andB21IsNotNull() {
            addCriterion("b21 is not null");
            return (Criteria) this;
        }

        public Criteria andB21EqualTo(String value) {
            addCriterion("b21 =", value, "b21");
            return (Criteria) this;
        }

        public Criteria andB21NotEqualTo(String value) {
            addCriterion("b21 <>", value, "b21");
            return (Criteria) this;
        }

        public Criteria andB21GreaterThan(String value) {
            addCriterion("b21 >", value, "b21");
            return (Criteria) this;
        }

        public Criteria andB21GreaterThanOrEqualTo(String value) {
            addCriterion("b21 >=", value, "b21");
            return (Criteria) this;
        }

        public Criteria andB21LessThan(String value) {
            addCriterion("b21 <", value, "b21");
            return (Criteria) this;
        }

        public Criteria andB21LessThanOrEqualTo(String value) {
            addCriterion("b21 <=", value, "b21");
            return (Criteria) this;
        }

        public Criteria andB21Like(String value) {
            addCriterion("b21 like", value, "b21");
            return (Criteria) this;
        }

        public Criteria andB21NotLike(String value) {
            addCriterion("b21 not like", value, "b21");
            return (Criteria) this;
        }

        public Criteria andB21In(List<String> values) {
            addCriterion("b21 in", values, "b21");
            return (Criteria) this;
        }

        public Criteria andB21NotIn(List<String> values) {
            addCriterion("b21 not in", values, "b21");
            return (Criteria) this;
        }

        public Criteria andB21Between(String value1, String value2) {
            addCriterion("b21 between", value1, value2, "b21");
            return (Criteria) this;
        }

        public Criteria andB21NotBetween(String value1, String value2) {
            addCriterion("b21 not between", value1, value2, "b21");
            return (Criteria) this;
        }

        public Criteria andB22IsNull() {
            addCriterion("b22 is null");
            return (Criteria) this;
        }

        public Criteria andB22IsNotNull() {
            addCriterion("b22 is not null");
            return (Criteria) this;
        }

        public Criteria andB22EqualTo(String value) {
            addCriterion("b22 =", value, "b22");
            return (Criteria) this;
        }

        public Criteria andB22NotEqualTo(String value) {
            addCriterion("b22 <>", value, "b22");
            return (Criteria) this;
        }

        public Criteria andB22GreaterThan(String value) {
            addCriterion("b22 >", value, "b22");
            return (Criteria) this;
        }

        public Criteria andB22GreaterThanOrEqualTo(String value) {
            addCriterion("b22 >=", value, "b22");
            return (Criteria) this;
        }

        public Criteria andB22LessThan(String value) {
            addCriterion("b22 <", value, "b22");
            return (Criteria) this;
        }

        public Criteria andB22LessThanOrEqualTo(String value) {
            addCriterion("b22 <=", value, "b22");
            return (Criteria) this;
        }

        public Criteria andB22Like(String value) {
            addCriterion("b22 like", value, "b22");
            return (Criteria) this;
        }

        public Criteria andB22NotLike(String value) {
            addCriterion("b22 not like", value, "b22");
            return (Criteria) this;
        }

        public Criteria andB22In(List<String> values) {
            addCriterion("b22 in", values, "b22");
            return (Criteria) this;
        }

        public Criteria andB22NotIn(List<String> values) {
            addCriterion("b22 not in", values, "b22");
            return (Criteria) this;
        }

        public Criteria andB22Between(String value1, String value2) {
            addCriterion("b22 between", value1, value2, "b22");
            return (Criteria) this;
        }

        public Criteria andB22NotBetween(String value1, String value2) {
            addCriterion("b22 not between", value1, value2, "b22");
            return (Criteria) this;
        }

        public Criteria andB23IsNull() {
            addCriterion("b23 is null");
            return (Criteria) this;
        }

        public Criteria andB23IsNotNull() {
            addCriterion("b23 is not null");
            return (Criteria) this;
        }

        public Criteria andB23EqualTo(String value) {
            addCriterion("b23 =", value, "b23");
            return (Criteria) this;
        }

        public Criteria andB23NotEqualTo(String value) {
            addCriterion("b23 <>", value, "b23");
            return (Criteria) this;
        }

        public Criteria andB23GreaterThan(String value) {
            addCriterion("b23 >", value, "b23");
            return (Criteria) this;
        }

        public Criteria andB23GreaterThanOrEqualTo(String value) {
            addCriterion("b23 >=", value, "b23");
            return (Criteria) this;
        }

        public Criteria andB23LessThan(String value) {
            addCriterion("b23 <", value, "b23");
            return (Criteria) this;
        }

        public Criteria andB23LessThanOrEqualTo(String value) {
            addCriterion("b23 <=", value, "b23");
            return (Criteria) this;
        }

        public Criteria andB23Like(String value) {
            addCriterion("b23 like", value, "b23");
            return (Criteria) this;
        }

        public Criteria andB23NotLike(String value) {
            addCriterion("b23 not like", value, "b23");
            return (Criteria) this;
        }

        public Criteria andB23In(List<String> values) {
            addCriterion("b23 in", values, "b23");
            return (Criteria) this;
        }

        public Criteria andB23NotIn(List<String> values) {
            addCriterion("b23 not in", values, "b23");
            return (Criteria) this;
        }

        public Criteria andB23Between(String value1, String value2) {
            addCriterion("b23 between", value1, value2, "b23");
            return (Criteria) this;
        }

        public Criteria andB23NotBetween(String value1, String value2) {
            addCriterion("b23 not between", value1, value2, "b23");
            return (Criteria) this;
        }

        public Criteria andB24IsNull() {
            addCriterion("b24 is null");
            return (Criteria) this;
        }

        public Criteria andB24IsNotNull() {
            addCriterion("b24 is not null");
            return (Criteria) this;
        }

        public Criteria andB24EqualTo(String value) {
            addCriterion("b24 =", value, "b24");
            return (Criteria) this;
        }

        public Criteria andB24NotEqualTo(String value) {
            addCriterion("b24 <>", value, "b24");
            return (Criteria) this;
        }

        public Criteria andB24GreaterThan(String value) {
            addCriterion("b24 >", value, "b24");
            return (Criteria) this;
        }

        public Criteria andB24GreaterThanOrEqualTo(String value) {
            addCriterion("b24 >=", value, "b24");
            return (Criteria) this;
        }

        public Criteria andB24LessThan(String value) {
            addCriterion("b24 <", value, "b24");
            return (Criteria) this;
        }

        public Criteria andB24LessThanOrEqualTo(String value) {
            addCriterion("b24 <=", value, "b24");
            return (Criteria) this;
        }

        public Criteria andB24Like(String value) {
            addCriterion("b24 like", value, "b24");
            return (Criteria) this;
        }

        public Criteria andB24NotLike(String value) {
            addCriterion("b24 not like", value, "b24");
            return (Criteria) this;
        }

        public Criteria andB24In(List<String> values) {
            addCriterion("b24 in", values, "b24");
            return (Criteria) this;
        }

        public Criteria andB24NotIn(List<String> values) {
            addCriterion("b24 not in", values, "b24");
            return (Criteria) this;
        }

        public Criteria andB24Between(String value1, String value2) {
            addCriterion("b24 between", value1, value2, "b24");
            return (Criteria) this;
        }

        public Criteria andB24NotBetween(String value1, String value2) {
            addCriterion("b24 not between", value1, value2, "b24");
            return (Criteria) this;
        }

        public Criteria andC01IsNull() {
            addCriterion("c01 is null");
            return (Criteria) this;
        }

        public Criteria andC01IsNotNull() {
            addCriterion("c01 is not null");
            return (Criteria) this;
        }

        public Criteria andC01EqualTo(String value) {
            addCriterion("c01 =", value, "c01");
            return (Criteria) this;
        }

        public Criteria andC01NotEqualTo(String value) {
            addCriterion("c01 <>", value, "c01");
            return (Criteria) this;
        }

        public Criteria andC01GreaterThan(String value) {
            addCriterion("c01 >", value, "c01");
            return (Criteria) this;
        }

        public Criteria andC01GreaterThanOrEqualTo(String value) {
            addCriterion("c01 >=", value, "c01");
            return (Criteria) this;
        }

        public Criteria andC01LessThan(String value) {
            addCriterion("c01 <", value, "c01");
            return (Criteria) this;
        }

        public Criteria andC01LessThanOrEqualTo(String value) {
            addCriterion("c01 <=", value, "c01");
            return (Criteria) this;
        }

        public Criteria andC01Like(String value) {
            addCriterion("c01 like", value, "c01");
            return (Criteria) this;
        }

        public Criteria andC01NotLike(String value) {
            addCriterion("c01 not like", value, "c01");
            return (Criteria) this;
        }

        public Criteria andC01In(List<String> values) {
            addCriterion("c01 in", values, "c01");
            return (Criteria) this;
        }

        public Criteria andC01NotIn(List<String> values) {
            addCriterion("c01 not in", values, "c01");
            return (Criteria) this;
        }

        public Criteria andC01Between(String value1, String value2) {
            addCriterion("c01 between", value1, value2, "c01");
            return (Criteria) this;
        }

        public Criteria andC01NotBetween(String value1, String value2) {
            addCriterion("c01 not between", value1, value2, "c01");
            return (Criteria) this;
        }

        public Criteria andC02IsNull() {
            addCriterion("c02 is null");
            return (Criteria) this;
        }

        public Criteria andC02IsNotNull() {
            addCriterion("c02 is not null");
            return (Criteria) this;
        }

        public Criteria andC02EqualTo(String value) {
            addCriterion("c02 =", value, "c02");
            return (Criteria) this;
        }

        public Criteria andC02NotEqualTo(String value) {
            addCriterion("c02 <>", value, "c02");
            return (Criteria) this;
        }

        public Criteria andC02GreaterThan(String value) {
            addCriterion("c02 >", value, "c02");
            return (Criteria) this;
        }

        public Criteria andC02GreaterThanOrEqualTo(String value) {
            addCriterion("c02 >=", value, "c02");
            return (Criteria) this;
        }

        public Criteria andC02LessThan(String value) {
            addCriterion("c02 <", value, "c02");
            return (Criteria) this;
        }

        public Criteria andC02LessThanOrEqualTo(String value) {
            addCriterion("c02 <=", value, "c02");
            return (Criteria) this;
        }

        public Criteria andC02Like(String value) {
            addCriterion("c02 like", value, "c02");
            return (Criteria) this;
        }

        public Criteria andC02NotLike(String value) {
            addCriterion("c02 not like", value, "c02");
            return (Criteria) this;
        }

        public Criteria andC02In(List<String> values) {
            addCriterion("c02 in", values, "c02");
            return (Criteria) this;
        }

        public Criteria andC02NotIn(List<String> values) {
            addCriterion("c02 not in", values, "c02");
            return (Criteria) this;
        }

        public Criteria andC02Between(String value1, String value2) {
            addCriterion("c02 between", value1, value2, "c02");
            return (Criteria) this;
        }

        public Criteria andC02NotBetween(String value1, String value2) {
            addCriterion("c02 not between", value1, value2, "c02");
            return (Criteria) this;
        }

        public Criteria andC03IsNull() {
            addCriterion("c03 is null");
            return (Criteria) this;
        }

        public Criteria andC03IsNotNull() {
            addCriterion("c03 is not null");
            return (Criteria) this;
        }

        public Criteria andC03EqualTo(String value) {
            addCriterion("c03 =", value, "c03");
            return (Criteria) this;
        }

        public Criteria andC03NotEqualTo(String value) {
            addCriterion("c03 <>", value, "c03");
            return (Criteria) this;
        }

        public Criteria andC03GreaterThan(String value) {
            addCriterion("c03 >", value, "c03");
            return (Criteria) this;
        }

        public Criteria andC03GreaterThanOrEqualTo(String value) {
            addCriterion("c03 >=", value, "c03");
            return (Criteria) this;
        }

        public Criteria andC03LessThan(String value) {
            addCriterion("c03 <", value, "c03");
            return (Criteria) this;
        }

        public Criteria andC03LessThanOrEqualTo(String value) {
            addCriterion("c03 <=", value, "c03");
            return (Criteria) this;
        }

        public Criteria andC03Like(String value) {
            addCriterion("c03 like", value, "c03");
            return (Criteria) this;
        }

        public Criteria andC03NotLike(String value) {
            addCriterion("c03 not like", value, "c03");
            return (Criteria) this;
        }

        public Criteria andC03In(List<String> values) {
            addCriterion("c03 in", values, "c03");
            return (Criteria) this;
        }

        public Criteria andC03NotIn(List<String> values) {
            addCriterion("c03 not in", values, "c03");
            return (Criteria) this;
        }

        public Criteria andC03Between(String value1, String value2) {
            addCriterion("c03 between", value1, value2, "c03");
            return (Criteria) this;
        }

        public Criteria andC03NotBetween(String value1, String value2) {
            addCriterion("c03 not between", value1, value2, "c03");
            return (Criteria) this;
        }

        public Criteria andC04IsNull() {
            addCriterion("c04 is null");
            return (Criteria) this;
        }

        public Criteria andC04IsNotNull() {
            addCriterion("c04 is not null");
            return (Criteria) this;
        }

        public Criteria andC04EqualTo(String value) {
            addCriterion("c04 =", value, "c04");
            return (Criteria) this;
        }

        public Criteria andC04NotEqualTo(String value) {
            addCriterion("c04 <>", value, "c04");
            return (Criteria) this;
        }

        public Criteria andC04GreaterThan(String value) {
            addCriterion("c04 >", value, "c04");
            return (Criteria) this;
        }

        public Criteria andC04GreaterThanOrEqualTo(String value) {
            addCriterion("c04 >=", value, "c04");
            return (Criteria) this;
        }

        public Criteria andC04LessThan(String value) {
            addCriterion("c04 <", value, "c04");
            return (Criteria) this;
        }

        public Criteria andC04LessThanOrEqualTo(String value) {
            addCriterion("c04 <=", value, "c04");
            return (Criteria) this;
        }

        public Criteria andC04Like(String value) {
            addCriterion("c04 like", value, "c04");
            return (Criteria) this;
        }

        public Criteria andC04NotLike(String value) {
            addCriterion("c04 not like", value, "c04");
            return (Criteria) this;
        }

        public Criteria andC04In(List<String> values) {
            addCriterion("c04 in", values, "c04");
            return (Criteria) this;
        }

        public Criteria andC04NotIn(List<String> values) {
            addCriterion("c04 not in", values, "c04");
            return (Criteria) this;
        }

        public Criteria andC04Between(String value1, String value2) {
            addCriterion("c04 between", value1, value2, "c04");
            return (Criteria) this;
        }

        public Criteria andC04NotBetween(String value1, String value2) {
            addCriterion("c04 not between", value1, value2, "c04");
            return (Criteria) this;
        }

        public Criteria andC05IsNull() {
            addCriterion("c05 is null");
            return (Criteria) this;
        }

        public Criteria andC05IsNotNull() {
            addCriterion("c05 is not null");
            return (Criteria) this;
        }

        public Criteria andC05EqualTo(String value) {
            addCriterion("c05 =", value, "c05");
            return (Criteria) this;
        }

        public Criteria andC05NotEqualTo(String value) {
            addCriterion("c05 <>", value, "c05");
            return (Criteria) this;
        }

        public Criteria andC05GreaterThan(String value) {
            addCriterion("c05 >", value, "c05");
            return (Criteria) this;
        }

        public Criteria andC05GreaterThanOrEqualTo(String value) {
            addCriterion("c05 >=", value, "c05");
            return (Criteria) this;
        }

        public Criteria andC05LessThan(String value) {
            addCriterion("c05 <", value, "c05");
            return (Criteria) this;
        }

        public Criteria andC05LessThanOrEqualTo(String value) {
            addCriterion("c05 <=", value, "c05");
            return (Criteria) this;
        }

        public Criteria andC05Like(String value) {
            addCriterion("c05 like", value, "c05");
            return (Criteria) this;
        }

        public Criteria andC05NotLike(String value) {
            addCriterion("c05 not like", value, "c05");
            return (Criteria) this;
        }

        public Criteria andC05In(List<String> values) {
            addCriterion("c05 in", values, "c05");
            return (Criteria) this;
        }

        public Criteria andC05NotIn(List<String> values) {
            addCriterion("c05 not in", values, "c05");
            return (Criteria) this;
        }

        public Criteria andC05Between(String value1, String value2) {
            addCriterion("c05 between", value1, value2, "c05");
            return (Criteria) this;
        }

        public Criteria andC05NotBetween(String value1, String value2) {
            addCriterion("c05 not between", value1, value2, "c05");
            return (Criteria) this;
        }

        public Criteria andC06IsNull() {
            addCriterion("c06 is null");
            return (Criteria) this;
        }

        public Criteria andC06IsNotNull() {
            addCriterion("c06 is not null");
            return (Criteria) this;
        }

        public Criteria andC06EqualTo(String value) {
            addCriterion("c06 =", value, "c06");
            return (Criteria) this;
        }

        public Criteria andC06NotEqualTo(String value) {
            addCriterion("c06 <>", value, "c06");
            return (Criteria) this;
        }

        public Criteria andC06GreaterThan(String value) {
            addCriterion("c06 >", value, "c06");
            return (Criteria) this;
        }

        public Criteria andC06GreaterThanOrEqualTo(String value) {
            addCriterion("c06 >=", value, "c06");
            return (Criteria) this;
        }

        public Criteria andC06LessThan(String value) {
            addCriterion("c06 <", value, "c06");
            return (Criteria) this;
        }

        public Criteria andC06LessThanOrEqualTo(String value) {
            addCriterion("c06 <=", value, "c06");
            return (Criteria) this;
        }

        public Criteria andC06Like(String value) {
            addCriterion("c06 like", value, "c06");
            return (Criteria) this;
        }

        public Criteria andC06NotLike(String value) {
            addCriterion("c06 not like", value, "c06");
            return (Criteria) this;
        }

        public Criteria andC06In(List<String> values) {
            addCriterion("c06 in", values, "c06");
            return (Criteria) this;
        }

        public Criteria andC06NotIn(List<String> values) {
            addCriterion("c06 not in", values, "c06");
            return (Criteria) this;
        }

        public Criteria andC06Between(String value1, String value2) {
            addCriterion("c06 between", value1, value2, "c06");
            return (Criteria) this;
        }

        public Criteria andC06NotBetween(String value1, String value2) {
            addCriterion("c06 not between", value1, value2, "c06");
            return (Criteria) this;
        }

        public Criteria andC07IsNull() {
            addCriterion("c07 is null");
            return (Criteria) this;
        }

        public Criteria andC07IsNotNull() {
            addCriterion("c07 is not null");
            return (Criteria) this;
        }

        public Criteria andC07EqualTo(String value) {
            addCriterion("c07 =", value, "c07");
            return (Criteria) this;
        }

        public Criteria andC07NotEqualTo(String value) {
            addCriterion("c07 <>", value, "c07");
            return (Criteria) this;
        }

        public Criteria andC07GreaterThan(String value) {
            addCriterion("c07 >", value, "c07");
            return (Criteria) this;
        }

        public Criteria andC07GreaterThanOrEqualTo(String value) {
            addCriterion("c07 >=", value, "c07");
            return (Criteria) this;
        }

        public Criteria andC07LessThan(String value) {
            addCriterion("c07 <", value, "c07");
            return (Criteria) this;
        }

        public Criteria andC07LessThanOrEqualTo(String value) {
            addCriterion("c07 <=", value, "c07");
            return (Criteria) this;
        }

        public Criteria andC07Like(String value) {
            addCriterion("c07 like", value, "c07");
            return (Criteria) this;
        }

        public Criteria andC07NotLike(String value) {
            addCriterion("c07 not like", value, "c07");
            return (Criteria) this;
        }

        public Criteria andC07In(List<String> values) {
            addCriterion("c07 in", values, "c07");
            return (Criteria) this;
        }

        public Criteria andC07NotIn(List<String> values) {
            addCriterion("c07 not in", values, "c07");
            return (Criteria) this;
        }

        public Criteria andC07Between(String value1, String value2) {
            addCriterion("c07 between", value1, value2, "c07");
            return (Criteria) this;
        }

        public Criteria andC07NotBetween(String value1, String value2) {
            addCriterion("c07 not between", value1, value2, "c07");
            return (Criteria) this;
        }

        public Criteria andC08IsNull() {
            addCriterion("c08 is null");
            return (Criteria) this;
        }

        public Criteria andC08IsNotNull() {
            addCriterion("c08 is not null");
            return (Criteria) this;
        }

        public Criteria andC08EqualTo(String value) {
            addCriterion("c08 =", value, "c08");
            return (Criteria) this;
        }

        public Criteria andC08NotEqualTo(String value) {
            addCriterion("c08 <>", value, "c08");
            return (Criteria) this;
        }

        public Criteria andC08GreaterThan(String value) {
            addCriterion("c08 >", value, "c08");
            return (Criteria) this;
        }

        public Criteria andC08GreaterThanOrEqualTo(String value) {
            addCriterion("c08 >=", value, "c08");
            return (Criteria) this;
        }

        public Criteria andC08LessThan(String value) {
            addCriterion("c08 <", value, "c08");
            return (Criteria) this;
        }

        public Criteria andC08LessThanOrEqualTo(String value) {
            addCriterion("c08 <=", value, "c08");
            return (Criteria) this;
        }

        public Criteria andC08Like(String value) {
            addCriterion("c08 like", value, "c08");
            return (Criteria) this;
        }

        public Criteria andC08NotLike(String value) {
            addCriterion("c08 not like", value, "c08");
            return (Criteria) this;
        }

        public Criteria andC08In(List<String> values) {
            addCriterion("c08 in", values, "c08");
            return (Criteria) this;
        }

        public Criteria andC08NotIn(List<String> values) {
            addCriterion("c08 not in", values, "c08");
            return (Criteria) this;
        }

        public Criteria andC08Between(String value1, String value2) {
            addCriterion("c08 between", value1, value2, "c08");
            return (Criteria) this;
        }

        public Criteria andC08NotBetween(String value1, String value2) {
            addCriterion("c08 not between", value1, value2, "c08");
            return (Criteria) this;
        }

        public Criteria andC09IsNull() {
            addCriterion("c09 is null");
            return (Criteria) this;
        }

        public Criteria andC09IsNotNull() {
            addCriterion("c09 is not null");
            return (Criteria) this;
        }

        public Criteria andC09EqualTo(String value) {
            addCriterion("c09 =", value, "c09");
            return (Criteria) this;
        }

        public Criteria andC09NotEqualTo(String value) {
            addCriterion("c09 <>", value, "c09");
            return (Criteria) this;
        }

        public Criteria andC09GreaterThan(String value) {
            addCriterion("c09 >", value, "c09");
            return (Criteria) this;
        }

        public Criteria andC09GreaterThanOrEqualTo(String value) {
            addCriterion("c09 >=", value, "c09");
            return (Criteria) this;
        }

        public Criteria andC09LessThan(String value) {
            addCriterion("c09 <", value, "c09");
            return (Criteria) this;
        }

        public Criteria andC09LessThanOrEqualTo(String value) {
            addCriterion("c09 <=", value, "c09");
            return (Criteria) this;
        }

        public Criteria andC09Like(String value) {
            addCriterion("c09 like", value, "c09");
            return (Criteria) this;
        }

        public Criteria andC09NotLike(String value) {
            addCriterion("c09 not like", value, "c09");
            return (Criteria) this;
        }

        public Criteria andC09In(List<String> values) {
            addCriterion("c09 in", values, "c09");
            return (Criteria) this;
        }

        public Criteria andC09NotIn(List<String> values) {
            addCriterion("c09 not in", values, "c09");
            return (Criteria) this;
        }

        public Criteria andC09Between(String value1, String value2) {
            addCriterion("c09 between", value1, value2, "c09");
            return (Criteria) this;
        }

        public Criteria andC09NotBetween(String value1, String value2) {
            addCriterion("c09 not between", value1, value2, "c09");
            return (Criteria) this;
        }

        public Criteria andC10IsNull() {
            addCriterion("c10 is null");
            return (Criteria) this;
        }

        public Criteria andC10IsNotNull() {
            addCriterion("c10 is not null");
            return (Criteria) this;
        }

        public Criteria andC10EqualTo(String value) {
            addCriterion("c10 =", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10NotEqualTo(String value) {
            addCriterion("c10 <>", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10GreaterThan(String value) {
            addCriterion("c10 >", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10GreaterThanOrEqualTo(String value) {
            addCriterion("c10 >=", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10LessThan(String value) {
            addCriterion("c10 <", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10LessThanOrEqualTo(String value) {
            addCriterion("c10 <=", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10Like(String value) {
            addCriterion("c10 like", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10NotLike(String value) {
            addCriterion("c10 not like", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10In(List<String> values) {
            addCriterion("c10 in", values, "c10");
            return (Criteria) this;
        }

        public Criteria andC10NotIn(List<String> values) {
            addCriterion("c10 not in", values, "c10");
            return (Criteria) this;
        }

        public Criteria andC10Between(String value1, String value2) {
            addCriterion("c10 between", value1, value2, "c10");
            return (Criteria) this;
        }

        public Criteria andC10NotBetween(String value1, String value2) {
            addCriterion("c10 not between", value1, value2, "c10");
            return (Criteria) this;
        }

        public Criteria andC11IsNull() {
            addCriterion("c11 is null");
            return (Criteria) this;
        }

        public Criteria andC11IsNotNull() {
            addCriterion("c11 is not null");
            return (Criteria) this;
        }

        public Criteria andC11EqualTo(String value) {
            addCriterion("c11 =", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotEqualTo(String value) {
            addCriterion("c11 <>", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11GreaterThan(String value) {
            addCriterion("c11 >", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11GreaterThanOrEqualTo(String value) {
            addCriterion("c11 >=", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11LessThan(String value) {
            addCriterion("c11 <", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11LessThanOrEqualTo(String value) {
            addCriterion("c11 <=", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11Like(String value) {
            addCriterion("c11 like", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotLike(String value) {
            addCriterion("c11 not like", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11In(List<String> values) {
            addCriterion("c11 in", values, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotIn(List<String> values) {
            addCriterion("c11 not in", values, "c11");
            return (Criteria) this;
        }

        public Criteria andC11Between(String value1, String value2) {
            addCriterion("c11 between", value1, value2, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotBetween(String value1, String value2) {
            addCriterion("c11 not between", value1, value2, "c11");
            return (Criteria) this;
        }

        public Criteria andC12IsNull() {
            addCriterion("c12 is null");
            return (Criteria) this;
        }

        public Criteria andC12IsNotNull() {
            addCriterion("c12 is not null");
            return (Criteria) this;
        }

        public Criteria andC12EqualTo(String value) {
            addCriterion("c12 =", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12NotEqualTo(String value) {
            addCriterion("c12 <>", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12GreaterThan(String value) {
            addCriterion("c12 >", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12GreaterThanOrEqualTo(String value) {
            addCriterion("c12 >=", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12LessThan(String value) {
            addCriterion("c12 <", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12LessThanOrEqualTo(String value) {
            addCriterion("c12 <=", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12Like(String value) {
            addCriterion("c12 like", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12NotLike(String value) {
            addCriterion("c12 not like", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12In(List<String> values) {
            addCriterion("c12 in", values, "c12");
            return (Criteria) this;
        }

        public Criteria andC12NotIn(List<String> values) {
            addCriterion("c12 not in", values, "c12");
            return (Criteria) this;
        }

        public Criteria andC12Between(String value1, String value2) {
            addCriterion("c12 between", value1, value2, "c12");
            return (Criteria) this;
        }

        public Criteria andC12NotBetween(String value1, String value2) {
            addCriterion("c12 not between", value1, value2, "c12");
            return (Criteria) this;
        }

        public Criteria andC13IsNull() {
            addCriterion("c13 is null");
            return (Criteria) this;
        }

        public Criteria andC13IsNotNull() {
            addCriterion("c13 is not null");
            return (Criteria) this;
        }

        public Criteria andC13EqualTo(String value) {
            addCriterion("c13 =", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13NotEqualTo(String value) {
            addCriterion("c13 <>", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13GreaterThan(String value) {
            addCriterion("c13 >", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13GreaterThanOrEqualTo(String value) {
            addCriterion("c13 >=", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13LessThan(String value) {
            addCriterion("c13 <", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13LessThanOrEqualTo(String value) {
            addCriterion("c13 <=", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13Like(String value) {
            addCriterion("c13 like", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13NotLike(String value) {
            addCriterion("c13 not like", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13In(List<String> values) {
            addCriterion("c13 in", values, "c13");
            return (Criteria) this;
        }

        public Criteria andC13NotIn(List<String> values) {
            addCriterion("c13 not in", values, "c13");
            return (Criteria) this;
        }

        public Criteria andC13Between(String value1, String value2) {
            addCriterion("c13 between", value1, value2, "c13");
            return (Criteria) this;
        }

        public Criteria andC13NotBetween(String value1, String value2) {
            addCriterion("c13 not between", value1, value2, "c13");
            return (Criteria) this;
        }

        public Criteria andC14IsNull() {
            addCriterion("c14 is null");
            return (Criteria) this;
        }

        public Criteria andC14IsNotNull() {
            addCriterion("c14 is not null");
            return (Criteria) this;
        }

        public Criteria andC14EqualTo(String value) {
            addCriterion("c14 =", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14NotEqualTo(String value) {
            addCriterion("c14 <>", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14GreaterThan(String value) {
            addCriterion("c14 >", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14GreaterThanOrEqualTo(String value) {
            addCriterion("c14 >=", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14LessThan(String value) {
            addCriterion("c14 <", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14LessThanOrEqualTo(String value) {
            addCriterion("c14 <=", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14Like(String value) {
            addCriterion("c14 like", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14NotLike(String value) {
            addCriterion("c14 not like", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14In(List<String> values) {
            addCriterion("c14 in", values, "c14");
            return (Criteria) this;
        }

        public Criteria andC14NotIn(List<String> values) {
            addCriterion("c14 not in", values, "c14");
            return (Criteria) this;
        }

        public Criteria andC14Between(String value1, String value2) {
            addCriterion("c14 between", value1, value2, "c14");
            return (Criteria) this;
        }

        public Criteria andC14NotBetween(String value1, String value2) {
            addCriterion("c14 not between", value1, value2, "c14");
            return (Criteria) this;
        }

        public Criteria andC15IsNull() {
            addCriterion("c15 is null");
            return (Criteria) this;
        }

        public Criteria andC15IsNotNull() {
            addCriterion("c15 is not null");
            return (Criteria) this;
        }

        public Criteria andC15EqualTo(String value) {
            addCriterion("c15 =", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotEqualTo(String value) {
            addCriterion("c15 <>", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15GreaterThan(String value) {
            addCriterion("c15 >", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15GreaterThanOrEqualTo(String value) {
            addCriterion("c15 >=", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15LessThan(String value) {
            addCriterion("c15 <", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15LessThanOrEqualTo(String value) {
            addCriterion("c15 <=", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15Like(String value) {
            addCriterion("c15 like", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotLike(String value) {
            addCriterion("c15 not like", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15In(List<String> values) {
            addCriterion("c15 in", values, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotIn(List<String> values) {
            addCriterion("c15 not in", values, "c15");
            return (Criteria) this;
        }

        public Criteria andC15Between(String value1, String value2) {
            addCriterion("c15 between", value1, value2, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotBetween(String value1, String value2) {
            addCriterion("c15 not between", value1, value2, "c15");
            return (Criteria) this;
        }

        public Criteria andC16IsNull() {
            addCriterion("c16 is null");
            return (Criteria) this;
        }

        public Criteria andC16IsNotNull() {
            addCriterion("c16 is not null");
            return (Criteria) this;
        }

        public Criteria andC16EqualTo(String value) {
            addCriterion("c16 =", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotEqualTo(String value) {
            addCriterion("c16 <>", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16GreaterThan(String value) {
            addCriterion("c16 >", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16GreaterThanOrEqualTo(String value) {
            addCriterion("c16 >=", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16LessThan(String value) {
            addCriterion("c16 <", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16LessThanOrEqualTo(String value) {
            addCriterion("c16 <=", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16Like(String value) {
            addCriterion("c16 like", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotLike(String value) {
            addCriterion("c16 not like", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16In(List<String> values) {
            addCriterion("c16 in", values, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotIn(List<String> values) {
            addCriterion("c16 not in", values, "c16");
            return (Criteria) this;
        }

        public Criteria andC16Between(String value1, String value2) {
            addCriterion("c16 between", value1, value2, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotBetween(String value1, String value2) {
            addCriterion("c16 not between", value1, value2, "c16");
            return (Criteria) this;
        }

        public Criteria andC17IsNull() {
            addCriterion("c17 is null");
            return (Criteria) this;
        }

        public Criteria andC17IsNotNull() {
            addCriterion("c17 is not null");
            return (Criteria) this;
        }

        public Criteria andC17EqualTo(String value) {
            addCriterion("c17 =", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotEqualTo(String value) {
            addCriterion("c17 <>", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17GreaterThan(String value) {
            addCriterion("c17 >", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17GreaterThanOrEqualTo(String value) {
            addCriterion("c17 >=", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17LessThan(String value) {
            addCriterion("c17 <", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17LessThanOrEqualTo(String value) {
            addCriterion("c17 <=", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17Like(String value) {
            addCriterion("c17 like", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotLike(String value) {
            addCriterion("c17 not like", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17In(List<String> values) {
            addCriterion("c17 in", values, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotIn(List<String> values) {
            addCriterion("c17 not in", values, "c17");
            return (Criteria) this;
        }

        public Criteria andC17Between(String value1, String value2) {
            addCriterion("c17 between", value1, value2, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotBetween(String value1, String value2) {
            addCriterion("c17 not between", value1, value2, "c17");
            return (Criteria) this;
        }

        public Criteria andC18IsNull() {
            addCriterion("c18 is null");
            return (Criteria) this;
        }

        public Criteria andC18IsNotNull() {
            addCriterion("c18 is not null");
            return (Criteria) this;
        }

        public Criteria andC18EqualTo(String value) {
            addCriterion("c18 =", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotEqualTo(String value) {
            addCriterion("c18 <>", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18GreaterThan(String value) {
            addCriterion("c18 >", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18GreaterThanOrEqualTo(String value) {
            addCriterion("c18 >=", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18LessThan(String value) {
            addCriterion("c18 <", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18LessThanOrEqualTo(String value) {
            addCriterion("c18 <=", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18Like(String value) {
            addCriterion("c18 like", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotLike(String value) {
            addCriterion("c18 not like", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18In(List<String> values) {
            addCriterion("c18 in", values, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotIn(List<String> values) {
            addCriterion("c18 not in", values, "c18");
            return (Criteria) this;
        }

        public Criteria andC18Between(String value1, String value2) {
            addCriterion("c18 between", value1, value2, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotBetween(String value1, String value2) {
            addCriterion("c18 not between", value1, value2, "c18");
            return (Criteria) this;
        }

        public Criteria andC19IsNull() {
            addCriterion("c19 is null");
            return (Criteria) this;
        }

        public Criteria andC19IsNotNull() {
            addCriterion("c19 is not null");
            return (Criteria) this;
        }

        public Criteria andC19EqualTo(String value) {
            addCriterion("c19 =", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotEqualTo(String value) {
            addCriterion("c19 <>", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19GreaterThan(String value) {
            addCriterion("c19 >", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19GreaterThanOrEqualTo(String value) {
            addCriterion("c19 >=", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19LessThan(String value) {
            addCriterion("c19 <", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19LessThanOrEqualTo(String value) {
            addCriterion("c19 <=", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19Like(String value) {
            addCriterion("c19 like", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotLike(String value) {
            addCriterion("c19 not like", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19In(List<String> values) {
            addCriterion("c19 in", values, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotIn(List<String> values) {
            addCriterion("c19 not in", values, "c19");
            return (Criteria) this;
        }

        public Criteria andC19Between(String value1, String value2) {
            addCriterion("c19 between", value1, value2, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotBetween(String value1, String value2) {
            addCriterion("c19 not between", value1, value2, "c19");
            return (Criteria) this;
        }

        public Criteria andC20IsNull() {
            addCriterion("c20 is null");
            return (Criteria) this;
        }

        public Criteria andC20IsNotNull() {
            addCriterion("c20 is not null");
            return (Criteria) this;
        }

        public Criteria andC20EqualTo(String value) {
            addCriterion("c20 =", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotEqualTo(String value) {
            addCriterion("c20 <>", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20GreaterThan(String value) {
            addCriterion("c20 >", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20GreaterThanOrEqualTo(String value) {
            addCriterion("c20 >=", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20LessThan(String value) {
            addCriterion("c20 <", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20LessThanOrEqualTo(String value) {
            addCriterion("c20 <=", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20Like(String value) {
            addCriterion("c20 like", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotLike(String value) {
            addCriterion("c20 not like", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20In(List<String> values) {
            addCriterion("c20 in", values, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotIn(List<String> values) {
            addCriterion("c20 not in", values, "c20");
            return (Criteria) this;
        }

        public Criteria andC20Between(String value1, String value2) {
            addCriterion("c20 between", value1, value2, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotBetween(String value1, String value2) {
            addCriterion("c20 not between", value1, value2, "c20");
            return (Criteria) this;
        }

        public Criteria andC21IsNull() {
            addCriterion("c21 is null");
            return (Criteria) this;
        }

        public Criteria andC21IsNotNull() {
            addCriterion("c21 is not null");
            return (Criteria) this;
        }

        public Criteria andC21EqualTo(String value) {
            addCriterion("c21 =", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotEqualTo(String value) {
            addCriterion("c21 <>", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21GreaterThan(String value) {
            addCriterion("c21 >", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21GreaterThanOrEqualTo(String value) {
            addCriterion("c21 >=", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21LessThan(String value) {
            addCriterion("c21 <", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21LessThanOrEqualTo(String value) {
            addCriterion("c21 <=", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21Like(String value) {
            addCriterion("c21 like", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotLike(String value) {
            addCriterion("c21 not like", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21In(List<String> values) {
            addCriterion("c21 in", values, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotIn(List<String> values) {
            addCriterion("c21 not in", values, "c21");
            return (Criteria) this;
        }

        public Criteria andC21Between(String value1, String value2) {
            addCriterion("c21 between", value1, value2, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotBetween(String value1, String value2) {
            addCriterion("c21 not between", value1, value2, "c21");
            return (Criteria) this;
        }

        public Criteria andC22IsNull() {
            addCriterion("c22 is null");
            return (Criteria) this;
        }

        public Criteria andC22IsNotNull() {
            addCriterion("c22 is not null");
            return (Criteria) this;
        }

        public Criteria andC22EqualTo(String value) {
            addCriterion("c22 =", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotEqualTo(String value) {
            addCriterion("c22 <>", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22GreaterThan(String value) {
            addCriterion("c22 >", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22GreaterThanOrEqualTo(String value) {
            addCriterion("c22 >=", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22LessThan(String value) {
            addCriterion("c22 <", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22LessThanOrEqualTo(String value) {
            addCriterion("c22 <=", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22Like(String value) {
            addCriterion("c22 like", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotLike(String value) {
            addCriterion("c22 not like", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22In(List<String> values) {
            addCriterion("c22 in", values, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotIn(List<String> values) {
            addCriterion("c22 not in", values, "c22");
            return (Criteria) this;
        }

        public Criteria andC22Between(String value1, String value2) {
            addCriterion("c22 between", value1, value2, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotBetween(String value1, String value2) {
            addCriterion("c22 not between", value1, value2, "c22");
            return (Criteria) this;
        }

        public Criteria andC23IsNull() {
            addCriterion("c23 is null");
            return (Criteria) this;
        }

        public Criteria andC23IsNotNull() {
            addCriterion("c23 is not null");
            return (Criteria) this;
        }

        public Criteria andC23EqualTo(String value) {
            addCriterion("c23 =", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotEqualTo(String value) {
            addCriterion("c23 <>", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23GreaterThan(String value) {
            addCriterion("c23 >", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23GreaterThanOrEqualTo(String value) {
            addCriterion("c23 >=", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23LessThan(String value) {
            addCriterion("c23 <", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23LessThanOrEqualTo(String value) {
            addCriterion("c23 <=", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23Like(String value) {
            addCriterion("c23 like", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotLike(String value) {
            addCriterion("c23 not like", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23In(List<String> values) {
            addCriterion("c23 in", values, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotIn(List<String> values) {
            addCriterion("c23 not in", values, "c23");
            return (Criteria) this;
        }

        public Criteria andC23Between(String value1, String value2) {
            addCriterion("c23 between", value1, value2, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotBetween(String value1, String value2) {
            addCriterion("c23 not between", value1, value2, "c23");
            return (Criteria) this;
        }

        public Criteria andC24IsNull() {
            addCriterion("c24 is null");
            return (Criteria) this;
        }

        public Criteria andC24IsNotNull() {
            addCriterion("c24 is not null");
            return (Criteria) this;
        }

        public Criteria andC24EqualTo(String value) {
            addCriterion("c24 =", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotEqualTo(String value) {
            addCriterion("c24 <>", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24GreaterThan(String value) {
            addCriterion("c24 >", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24GreaterThanOrEqualTo(String value) {
            addCriterion("c24 >=", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24LessThan(String value) {
            addCriterion("c24 <", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24LessThanOrEqualTo(String value) {
            addCriterion("c24 <=", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24Like(String value) {
            addCriterion("c24 like", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotLike(String value) {
            addCriterion("c24 not like", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24In(List<String> values) {
            addCriterion("c24 in", values, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotIn(List<String> values) {
            addCriterion("c24 not in", values, "c24");
            return (Criteria) this;
        }

        public Criteria andC24Between(String value1, String value2) {
            addCriterion("c24 between", value1, value2, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotBetween(String value1, String value2) {
            addCriterion("c24 not between", value1, value2, "c24");
            return (Criteria) this;
        }

        public Criteria andC25IsNull() {
            addCriterion("c25 is null");
            return (Criteria) this;
        }

        public Criteria andC25IsNotNull() {
            addCriterion("c25 is not null");
            return (Criteria) this;
        }

        public Criteria andC25EqualTo(String value) {
            addCriterion("c25 =", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotEqualTo(String value) {
            addCriterion("c25 <>", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25GreaterThan(String value) {
            addCriterion("c25 >", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25GreaterThanOrEqualTo(String value) {
            addCriterion("c25 >=", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25LessThan(String value) {
            addCriterion("c25 <", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25LessThanOrEqualTo(String value) {
            addCriterion("c25 <=", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25Like(String value) {
            addCriterion("c25 like", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotLike(String value) {
            addCriterion("c25 not like", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25In(List<String> values) {
            addCriterion("c25 in", values, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotIn(List<String> values) {
            addCriterion("c25 not in", values, "c25");
            return (Criteria) this;
        }

        public Criteria andC25Between(String value1, String value2) {
            addCriterion("c25 between", value1, value2, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotBetween(String value1, String value2) {
            addCriterion("c25 not between", value1, value2, "c25");
            return (Criteria) this;
        }

        public Criteria andC26IsNull() {
            addCriterion("c26 is null");
            return (Criteria) this;
        }

        public Criteria andC26IsNotNull() {
            addCriterion("c26 is not null");
            return (Criteria) this;
        }

        public Criteria andC26EqualTo(String value) {
            addCriterion("c26 =", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotEqualTo(String value) {
            addCriterion("c26 <>", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26GreaterThan(String value) {
            addCriterion("c26 >", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26GreaterThanOrEqualTo(String value) {
            addCriterion("c26 >=", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26LessThan(String value) {
            addCriterion("c26 <", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26LessThanOrEqualTo(String value) {
            addCriterion("c26 <=", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26Like(String value) {
            addCriterion("c26 like", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotLike(String value) {
            addCriterion("c26 not like", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26In(List<String> values) {
            addCriterion("c26 in", values, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotIn(List<String> values) {
            addCriterion("c26 not in", values, "c26");
            return (Criteria) this;
        }

        public Criteria andC26Between(String value1, String value2) {
            addCriterion("c26 between", value1, value2, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotBetween(String value1, String value2) {
            addCriterion("c26 not between", value1, value2, "c26");
            return (Criteria) this;
        }

        public Criteria andC27IsNull() {
            addCriterion("c27 is null");
            return (Criteria) this;
        }

        public Criteria andC27IsNotNull() {
            addCriterion("c27 is not null");
            return (Criteria) this;
        }

        public Criteria andC27EqualTo(String value) {
            addCriterion("c27 =", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotEqualTo(String value) {
            addCriterion("c27 <>", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27GreaterThan(String value) {
            addCriterion("c27 >", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27GreaterThanOrEqualTo(String value) {
            addCriterion("c27 >=", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27LessThan(String value) {
            addCriterion("c27 <", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27LessThanOrEqualTo(String value) {
            addCriterion("c27 <=", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27Like(String value) {
            addCriterion("c27 like", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotLike(String value) {
            addCriterion("c27 not like", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27In(List<String> values) {
            addCriterion("c27 in", values, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotIn(List<String> values) {
            addCriterion("c27 not in", values, "c27");
            return (Criteria) this;
        }

        public Criteria andC27Between(String value1, String value2) {
            addCriterion("c27 between", value1, value2, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotBetween(String value1, String value2) {
            addCriterion("c27 not between", value1, value2, "c27");
            return (Criteria) this;
        }

        public Criteria andC28IsNull() {
            addCriterion("c28 is null");
            return (Criteria) this;
        }

        public Criteria andC28IsNotNull() {
            addCriterion("c28 is not null");
            return (Criteria) this;
        }

        public Criteria andC28EqualTo(String value) {
            addCriterion("c28 =", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotEqualTo(String value) {
            addCriterion("c28 <>", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28GreaterThan(String value) {
            addCriterion("c28 >", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28GreaterThanOrEqualTo(String value) {
            addCriterion("c28 >=", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28LessThan(String value) {
            addCriterion("c28 <", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28LessThanOrEqualTo(String value) {
            addCriterion("c28 <=", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28Like(String value) {
            addCriterion("c28 like", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotLike(String value) {
            addCriterion("c28 not like", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28In(List<String> values) {
            addCriterion("c28 in", values, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotIn(List<String> values) {
            addCriterion("c28 not in", values, "c28");
            return (Criteria) this;
        }

        public Criteria andC28Between(String value1, String value2) {
            addCriterion("c28 between", value1, value2, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotBetween(String value1, String value2) {
            addCriterion("c28 not between", value1, value2, "c28");
            return (Criteria) this;
        }

        public Criteria andC29IsNull() {
            addCriterion("c29 is null");
            return (Criteria) this;
        }

        public Criteria andC29IsNotNull() {
            addCriterion("c29 is not null");
            return (Criteria) this;
        }

        public Criteria andC29EqualTo(String value) {
            addCriterion("c29 =", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotEqualTo(String value) {
            addCriterion("c29 <>", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29GreaterThan(String value) {
            addCriterion("c29 >", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29GreaterThanOrEqualTo(String value) {
            addCriterion("c29 >=", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29LessThan(String value) {
            addCriterion("c29 <", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29LessThanOrEqualTo(String value) {
            addCriterion("c29 <=", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29Like(String value) {
            addCriterion("c29 like", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotLike(String value) {
            addCriterion("c29 not like", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29In(List<String> values) {
            addCriterion("c29 in", values, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotIn(List<String> values) {
            addCriterion("c29 not in", values, "c29");
            return (Criteria) this;
        }

        public Criteria andC29Between(String value1, String value2) {
            addCriterion("c29 between", value1, value2, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotBetween(String value1, String value2) {
            addCriterion("c29 not between", value1, value2, "c29");
            return (Criteria) this;
        }

        public Criteria andC30IsNull() {
            addCriterion("c30 is null");
            return (Criteria) this;
        }

        public Criteria andC30IsNotNull() {
            addCriterion("c30 is not null");
            return (Criteria) this;
        }

        public Criteria andC30EqualTo(String value) {
            addCriterion("c30 =", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotEqualTo(String value) {
            addCriterion("c30 <>", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30GreaterThan(String value) {
            addCriterion("c30 >", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30GreaterThanOrEqualTo(String value) {
            addCriterion("c30 >=", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30LessThan(String value) {
            addCriterion("c30 <", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30LessThanOrEqualTo(String value) {
            addCriterion("c30 <=", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30Like(String value) {
            addCriterion("c30 like", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotLike(String value) {
            addCriterion("c30 not like", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30In(List<String> values) {
            addCriterion("c30 in", values, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotIn(List<String> values) {
            addCriterion("c30 not in", values, "c30");
            return (Criteria) this;
        }

        public Criteria andC30Between(String value1, String value2) {
            addCriterion("c30 between", value1, value2, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotBetween(String value1, String value2) {
            addCriterion("c30 not between", value1, value2, "c30");
            return (Criteria) this;
        }

        public Criteria andC31IsNull() {
            addCriterion("c31 is null");
            return (Criteria) this;
        }

        public Criteria andC31IsNotNull() {
            addCriterion("c31 is not null");
            return (Criteria) this;
        }

        public Criteria andC31EqualTo(String value) {
            addCriterion("c31 =", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotEqualTo(String value) {
            addCriterion("c31 <>", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31GreaterThan(String value) {
            addCriterion("c31 >", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31GreaterThanOrEqualTo(String value) {
            addCriterion("c31 >=", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31LessThan(String value) {
            addCriterion("c31 <", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31LessThanOrEqualTo(String value) {
            addCriterion("c31 <=", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31Like(String value) {
            addCriterion("c31 like", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotLike(String value) {
            addCriterion("c31 not like", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31In(List<String> values) {
            addCriterion("c31 in", values, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotIn(List<String> values) {
            addCriterion("c31 not in", values, "c31");
            return (Criteria) this;
        }

        public Criteria andC31Between(String value1, String value2) {
            addCriterion("c31 between", value1, value2, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotBetween(String value1, String value2) {
            addCriterion("c31 not between", value1, value2, "c31");
            return (Criteria) this;
        }

        public Criteria andD01IsNull() {
            addCriterion("d01 is null");
            return (Criteria) this;
        }

        public Criteria andD01IsNotNull() {
            addCriterion("d01 is not null");
            return (Criteria) this;
        }

        public Criteria andD01EqualTo(String value) {
            addCriterion("d01 =", value, "d01");
            return (Criteria) this;
        }

        public Criteria andD01NotEqualTo(String value) {
            addCriterion("d01 <>", value, "d01");
            return (Criteria) this;
        }

        public Criteria andD01GreaterThan(String value) {
            addCriterion("d01 >", value, "d01");
            return (Criteria) this;
        }

        public Criteria andD01GreaterThanOrEqualTo(String value) {
            addCriterion("d01 >=", value, "d01");
            return (Criteria) this;
        }

        public Criteria andD01LessThan(String value) {
            addCriterion("d01 <", value, "d01");
            return (Criteria) this;
        }

        public Criteria andD01LessThanOrEqualTo(String value) {
            addCriterion("d01 <=", value, "d01");
            return (Criteria) this;
        }

        public Criteria andD01Like(String value) {
            addCriterion("d01 like", value, "d01");
            return (Criteria) this;
        }

        public Criteria andD01NotLike(String value) {
            addCriterion("d01 not like", value, "d01");
            return (Criteria) this;
        }

        public Criteria andD01In(List<String> values) {
            addCriterion("d01 in", values, "d01");
            return (Criteria) this;
        }

        public Criteria andD01NotIn(List<String> values) {
            addCriterion("d01 not in", values, "d01");
            return (Criteria) this;
        }

        public Criteria andD01Between(String value1, String value2) {
            addCriterion("d01 between", value1, value2, "d01");
            return (Criteria) this;
        }

        public Criteria andD01NotBetween(String value1, String value2) {
            addCriterion("d01 not between", value1, value2, "d01");
            return (Criteria) this;
        }

        public Criteria andD02IsNull() {
            addCriterion("d02 is null");
            return (Criteria) this;
        }

        public Criteria andD02IsNotNull() {
            addCriterion("d02 is not null");
            return (Criteria) this;
        }

        public Criteria andD02EqualTo(String value) {
            addCriterion("d02 =", value, "d02");
            return (Criteria) this;
        }

        public Criteria andD02NotEqualTo(String value) {
            addCriterion("d02 <>", value, "d02");
            return (Criteria) this;
        }

        public Criteria andD02GreaterThan(String value) {
            addCriterion("d02 >", value, "d02");
            return (Criteria) this;
        }

        public Criteria andD02GreaterThanOrEqualTo(String value) {
            addCriterion("d02 >=", value, "d02");
            return (Criteria) this;
        }

        public Criteria andD02LessThan(String value) {
            addCriterion("d02 <", value, "d02");
            return (Criteria) this;
        }

        public Criteria andD02LessThanOrEqualTo(String value) {
            addCriterion("d02 <=", value, "d02");
            return (Criteria) this;
        }

        public Criteria andD02Like(String value) {
            addCriterion("d02 like", value, "d02");
            return (Criteria) this;
        }

        public Criteria andD02NotLike(String value) {
            addCriterion("d02 not like", value, "d02");
            return (Criteria) this;
        }

        public Criteria andD02In(List<String> values) {
            addCriterion("d02 in", values, "d02");
            return (Criteria) this;
        }

        public Criteria andD02NotIn(List<String> values) {
            addCriterion("d02 not in", values, "d02");
            return (Criteria) this;
        }

        public Criteria andD02Between(String value1, String value2) {
            addCriterion("d02 between", value1, value2, "d02");
            return (Criteria) this;
        }

        public Criteria andD02NotBetween(String value1, String value2) {
            addCriterion("d02 not between", value1, value2, "d02");
            return (Criteria) this;
        }

        public Criteria andD03IsNull() {
            addCriterion("d03 is null");
            return (Criteria) this;
        }

        public Criteria andD03IsNotNull() {
            addCriterion("d03 is not null");
            return (Criteria) this;
        }

        public Criteria andD03EqualTo(String value) {
            addCriterion("d03 =", value, "d03");
            return (Criteria) this;
        }

        public Criteria andD03NotEqualTo(String value) {
            addCriterion("d03 <>", value, "d03");
            return (Criteria) this;
        }

        public Criteria andD03GreaterThan(String value) {
            addCriterion("d03 >", value, "d03");
            return (Criteria) this;
        }

        public Criteria andD03GreaterThanOrEqualTo(String value) {
            addCriterion("d03 >=", value, "d03");
            return (Criteria) this;
        }

        public Criteria andD03LessThan(String value) {
            addCriterion("d03 <", value, "d03");
            return (Criteria) this;
        }

        public Criteria andD03LessThanOrEqualTo(String value) {
            addCriterion("d03 <=", value, "d03");
            return (Criteria) this;
        }

        public Criteria andD03Like(String value) {
            addCriterion("d03 like", value, "d03");
            return (Criteria) this;
        }

        public Criteria andD03NotLike(String value) {
            addCriterion("d03 not like", value, "d03");
            return (Criteria) this;
        }

        public Criteria andD03In(List<String> values) {
            addCriterion("d03 in", values, "d03");
            return (Criteria) this;
        }

        public Criteria andD03NotIn(List<String> values) {
            addCriterion("d03 not in", values, "d03");
            return (Criteria) this;
        }

        public Criteria andD03Between(String value1, String value2) {
            addCriterion("d03 between", value1, value2, "d03");
            return (Criteria) this;
        }

        public Criteria andD03NotBetween(String value1, String value2) {
            addCriterion("d03 not between", value1, value2, "d03");
            return (Criteria) this;
        }

        public Criteria andD04IsNull() {
            addCriterion("d04 is null");
            return (Criteria) this;
        }

        public Criteria andD04IsNotNull() {
            addCriterion("d04 is not null");
            return (Criteria) this;
        }

        public Criteria andD04EqualTo(String value) {
            addCriterion("d04 =", value, "d04");
            return (Criteria) this;
        }

        public Criteria andD04NotEqualTo(String value) {
            addCriterion("d04 <>", value, "d04");
            return (Criteria) this;
        }

        public Criteria andD04GreaterThan(String value) {
            addCriterion("d04 >", value, "d04");
            return (Criteria) this;
        }

        public Criteria andD04GreaterThanOrEqualTo(String value) {
            addCriterion("d04 >=", value, "d04");
            return (Criteria) this;
        }

        public Criteria andD04LessThan(String value) {
            addCriterion("d04 <", value, "d04");
            return (Criteria) this;
        }

        public Criteria andD04LessThanOrEqualTo(String value) {
            addCriterion("d04 <=", value, "d04");
            return (Criteria) this;
        }

        public Criteria andD04Like(String value) {
            addCriterion("d04 like", value, "d04");
            return (Criteria) this;
        }

        public Criteria andD04NotLike(String value) {
            addCriterion("d04 not like", value, "d04");
            return (Criteria) this;
        }

        public Criteria andD04In(List<String> values) {
            addCriterion("d04 in", values, "d04");
            return (Criteria) this;
        }

        public Criteria andD04NotIn(List<String> values) {
            addCriterion("d04 not in", values, "d04");
            return (Criteria) this;
        }

        public Criteria andD04Between(String value1, String value2) {
            addCriterion("d04 between", value1, value2, "d04");
            return (Criteria) this;
        }

        public Criteria andD04NotBetween(String value1, String value2) {
            addCriterion("d04 not between", value1, value2, "d04");
            return (Criteria) this;
        }

        public Criteria andD05IsNull() {
            addCriterion("d05 is null");
            return (Criteria) this;
        }

        public Criteria andD05IsNotNull() {
            addCriterion("d05 is not null");
            return (Criteria) this;
        }

        public Criteria andD05EqualTo(String value) {
            addCriterion("d05 =", value, "d05");
            return (Criteria) this;
        }

        public Criteria andD05NotEqualTo(String value) {
            addCriterion("d05 <>", value, "d05");
            return (Criteria) this;
        }

        public Criteria andD05GreaterThan(String value) {
            addCriterion("d05 >", value, "d05");
            return (Criteria) this;
        }

        public Criteria andD05GreaterThanOrEqualTo(String value) {
            addCriterion("d05 >=", value, "d05");
            return (Criteria) this;
        }

        public Criteria andD05LessThan(String value) {
            addCriterion("d05 <", value, "d05");
            return (Criteria) this;
        }

        public Criteria andD05LessThanOrEqualTo(String value) {
            addCriterion("d05 <=", value, "d05");
            return (Criteria) this;
        }

        public Criteria andD05Like(String value) {
            addCriterion("d05 like", value, "d05");
            return (Criteria) this;
        }

        public Criteria andD05NotLike(String value) {
            addCriterion("d05 not like", value, "d05");
            return (Criteria) this;
        }

        public Criteria andD05In(List<String> values) {
            addCriterion("d05 in", values, "d05");
            return (Criteria) this;
        }

        public Criteria andD05NotIn(List<String> values) {
            addCriterion("d05 not in", values, "d05");
            return (Criteria) this;
        }

        public Criteria andD05Between(String value1, String value2) {
            addCriterion("d05 between", value1, value2, "d05");
            return (Criteria) this;
        }

        public Criteria andD05NotBetween(String value1, String value2) {
            addCriterion("d05 not between", value1, value2, "d05");
            return (Criteria) this;
        }

        public Criteria andD06IsNull() {
            addCriterion("d06 is null");
            return (Criteria) this;
        }

        public Criteria andD06IsNotNull() {
            addCriterion("d06 is not null");
            return (Criteria) this;
        }

        public Criteria andD06EqualTo(String value) {
            addCriterion("d06 =", value, "d06");
            return (Criteria) this;
        }

        public Criteria andD06NotEqualTo(String value) {
            addCriterion("d06 <>", value, "d06");
            return (Criteria) this;
        }

        public Criteria andD06GreaterThan(String value) {
            addCriterion("d06 >", value, "d06");
            return (Criteria) this;
        }

        public Criteria andD06GreaterThanOrEqualTo(String value) {
            addCriterion("d06 >=", value, "d06");
            return (Criteria) this;
        }

        public Criteria andD06LessThan(String value) {
            addCriterion("d06 <", value, "d06");
            return (Criteria) this;
        }

        public Criteria andD06LessThanOrEqualTo(String value) {
            addCriterion("d06 <=", value, "d06");
            return (Criteria) this;
        }

        public Criteria andD06Like(String value) {
            addCriterion("d06 like", value, "d06");
            return (Criteria) this;
        }

        public Criteria andD06NotLike(String value) {
            addCriterion("d06 not like", value, "d06");
            return (Criteria) this;
        }

        public Criteria andD06In(List<String> values) {
            addCriterion("d06 in", values, "d06");
            return (Criteria) this;
        }

        public Criteria andD06NotIn(List<String> values) {
            addCriterion("d06 not in", values, "d06");
            return (Criteria) this;
        }

        public Criteria andD06Between(String value1, String value2) {
            addCriterion("d06 between", value1, value2, "d06");
            return (Criteria) this;
        }

        public Criteria andD06NotBetween(String value1, String value2) {
            addCriterion("d06 not between", value1, value2, "d06");
            return (Criteria) this;
        }

        public Criteria andD07IsNull() {
            addCriterion("d07 is null");
            return (Criteria) this;
        }

        public Criteria andD07IsNotNull() {
            addCriterion("d07 is not null");
            return (Criteria) this;
        }

        public Criteria andD07EqualTo(String value) {
            addCriterion("d07 =", value, "d07");
            return (Criteria) this;
        }

        public Criteria andD07NotEqualTo(String value) {
            addCriterion("d07 <>", value, "d07");
            return (Criteria) this;
        }

        public Criteria andD07GreaterThan(String value) {
            addCriterion("d07 >", value, "d07");
            return (Criteria) this;
        }

        public Criteria andD07GreaterThanOrEqualTo(String value) {
            addCriterion("d07 >=", value, "d07");
            return (Criteria) this;
        }

        public Criteria andD07LessThan(String value) {
            addCriterion("d07 <", value, "d07");
            return (Criteria) this;
        }

        public Criteria andD07LessThanOrEqualTo(String value) {
            addCriterion("d07 <=", value, "d07");
            return (Criteria) this;
        }

        public Criteria andD07Like(String value) {
            addCriterion("d07 like", value, "d07");
            return (Criteria) this;
        }

        public Criteria andD07NotLike(String value) {
            addCriterion("d07 not like", value, "d07");
            return (Criteria) this;
        }

        public Criteria andD07In(List<String> values) {
            addCriterion("d07 in", values, "d07");
            return (Criteria) this;
        }

        public Criteria andD07NotIn(List<String> values) {
            addCriterion("d07 not in", values, "d07");
            return (Criteria) this;
        }

        public Criteria andD07Between(String value1, String value2) {
            addCriterion("d07 between", value1, value2, "d07");
            return (Criteria) this;
        }

        public Criteria andD07NotBetween(String value1, String value2) {
            addCriterion("d07 not between", value1, value2, "d07");
            return (Criteria) this;
        }

        public Criteria andD08IsNull() {
            addCriterion("d08 is null");
            return (Criteria) this;
        }

        public Criteria andD08IsNotNull() {
            addCriterion("d08 is not null");
            return (Criteria) this;
        }

        public Criteria andD08EqualTo(String value) {
            addCriterion("d08 =", value, "d08");
            return (Criteria) this;
        }

        public Criteria andD08NotEqualTo(String value) {
            addCriterion("d08 <>", value, "d08");
            return (Criteria) this;
        }

        public Criteria andD08GreaterThan(String value) {
            addCriterion("d08 >", value, "d08");
            return (Criteria) this;
        }

        public Criteria andD08GreaterThanOrEqualTo(String value) {
            addCriterion("d08 >=", value, "d08");
            return (Criteria) this;
        }

        public Criteria andD08LessThan(String value) {
            addCriterion("d08 <", value, "d08");
            return (Criteria) this;
        }

        public Criteria andD08LessThanOrEqualTo(String value) {
            addCriterion("d08 <=", value, "d08");
            return (Criteria) this;
        }

        public Criteria andD08Like(String value) {
            addCriterion("d08 like", value, "d08");
            return (Criteria) this;
        }

        public Criteria andD08NotLike(String value) {
            addCriterion("d08 not like", value, "d08");
            return (Criteria) this;
        }

        public Criteria andD08In(List<String> values) {
            addCriterion("d08 in", values, "d08");
            return (Criteria) this;
        }

        public Criteria andD08NotIn(List<String> values) {
            addCriterion("d08 not in", values, "d08");
            return (Criteria) this;
        }

        public Criteria andD08Between(String value1, String value2) {
            addCriterion("d08 between", value1, value2, "d08");
            return (Criteria) this;
        }

        public Criteria andD08NotBetween(String value1, String value2) {
            addCriterion("d08 not between", value1, value2, "d08");
            return (Criteria) this;
        }

        public Criteria andD09IsNull() {
            addCriterion("d09 is null");
            return (Criteria) this;
        }

        public Criteria andD09IsNotNull() {
            addCriterion("d09 is not null");
            return (Criteria) this;
        }

        public Criteria andD09EqualTo(String value) {
            addCriterion("d09 =", value, "d09");
            return (Criteria) this;
        }

        public Criteria andD09NotEqualTo(String value) {
            addCriterion("d09 <>", value, "d09");
            return (Criteria) this;
        }

        public Criteria andD09GreaterThan(String value) {
            addCriterion("d09 >", value, "d09");
            return (Criteria) this;
        }

        public Criteria andD09GreaterThanOrEqualTo(String value) {
            addCriterion("d09 >=", value, "d09");
            return (Criteria) this;
        }

        public Criteria andD09LessThan(String value) {
            addCriterion("d09 <", value, "d09");
            return (Criteria) this;
        }

        public Criteria andD09LessThanOrEqualTo(String value) {
            addCriterion("d09 <=", value, "d09");
            return (Criteria) this;
        }

        public Criteria andD09Like(String value) {
            addCriterion("d09 like", value, "d09");
            return (Criteria) this;
        }

        public Criteria andD09NotLike(String value) {
            addCriterion("d09 not like", value, "d09");
            return (Criteria) this;
        }

        public Criteria andD09In(List<String> values) {
            addCriterion("d09 in", values, "d09");
            return (Criteria) this;
        }

        public Criteria andD09NotIn(List<String> values) {
            addCriterion("d09 not in", values, "d09");
            return (Criteria) this;
        }

        public Criteria andD09Between(String value1, String value2) {
            addCriterion("d09 between", value1, value2, "d09");
            return (Criteria) this;
        }

        public Criteria andD09NotBetween(String value1, String value2) {
            addCriterion("d09 not between", value1, value2, "d09");
            return (Criteria) this;
        }

        public Criteria andD10IsNull() {
            addCriterion("d10 is null");
            return (Criteria) this;
        }

        public Criteria andD10IsNotNull() {
            addCriterion("d10 is not null");
            return (Criteria) this;
        }

        public Criteria andD10EqualTo(String value) {
            addCriterion("d10 =", value, "d10");
            return (Criteria) this;
        }

        public Criteria andD10NotEqualTo(String value) {
            addCriterion("d10 <>", value, "d10");
            return (Criteria) this;
        }

        public Criteria andD10GreaterThan(String value) {
            addCriterion("d10 >", value, "d10");
            return (Criteria) this;
        }

        public Criteria andD10GreaterThanOrEqualTo(String value) {
            addCriterion("d10 >=", value, "d10");
            return (Criteria) this;
        }

        public Criteria andD10LessThan(String value) {
            addCriterion("d10 <", value, "d10");
            return (Criteria) this;
        }

        public Criteria andD10LessThanOrEqualTo(String value) {
            addCriterion("d10 <=", value, "d10");
            return (Criteria) this;
        }

        public Criteria andD10Like(String value) {
            addCriterion("d10 like", value, "d10");
            return (Criteria) this;
        }

        public Criteria andD10NotLike(String value) {
            addCriterion("d10 not like", value, "d10");
            return (Criteria) this;
        }

        public Criteria andD10In(List<String> values) {
            addCriterion("d10 in", values, "d10");
            return (Criteria) this;
        }

        public Criteria andD10NotIn(List<String> values) {
            addCriterion("d10 not in", values, "d10");
            return (Criteria) this;
        }

        public Criteria andD10Between(String value1, String value2) {
            addCriterion("d10 between", value1, value2, "d10");
            return (Criteria) this;
        }

        public Criteria andD10NotBetween(String value1, String value2) {
            addCriterion("d10 not between", value1, value2, "d10");
            return (Criteria) this;
        }

        public Criteria andD11IsNull() {
            addCriterion("d11 is null");
            return (Criteria) this;
        }

        public Criteria andD11IsNotNull() {
            addCriterion("d11 is not null");
            return (Criteria) this;
        }

        public Criteria andD11EqualTo(String value) {
            addCriterion("d11 =", value, "d11");
            return (Criteria) this;
        }

        public Criteria andD11NotEqualTo(String value) {
            addCriterion("d11 <>", value, "d11");
            return (Criteria) this;
        }

        public Criteria andD11GreaterThan(String value) {
            addCriterion("d11 >", value, "d11");
            return (Criteria) this;
        }

        public Criteria andD11GreaterThanOrEqualTo(String value) {
            addCriterion("d11 >=", value, "d11");
            return (Criteria) this;
        }

        public Criteria andD11LessThan(String value) {
            addCriterion("d11 <", value, "d11");
            return (Criteria) this;
        }

        public Criteria andD11LessThanOrEqualTo(String value) {
            addCriterion("d11 <=", value, "d11");
            return (Criteria) this;
        }

        public Criteria andD11Like(String value) {
            addCriterion("d11 like", value, "d11");
            return (Criteria) this;
        }

        public Criteria andD11NotLike(String value) {
            addCriterion("d11 not like", value, "d11");
            return (Criteria) this;
        }

        public Criteria andD11In(List<String> values) {
            addCriterion("d11 in", values, "d11");
            return (Criteria) this;
        }

        public Criteria andD11NotIn(List<String> values) {
            addCriterion("d11 not in", values, "d11");
            return (Criteria) this;
        }

        public Criteria andD11Between(String value1, String value2) {
            addCriterion("d11 between", value1, value2, "d11");
            return (Criteria) this;
        }

        public Criteria andD11NotBetween(String value1, String value2) {
            addCriterion("d11 not between", value1, value2, "d11");
            return (Criteria) this;
        }

        public Criteria andD12IsNull() {
            addCriterion("d12 is null");
            return (Criteria) this;
        }

        public Criteria andD12IsNotNull() {
            addCriterion("d12 is not null");
            return (Criteria) this;
        }

        public Criteria andD12EqualTo(String value) {
            addCriterion("d12 =", value, "d12");
            return (Criteria) this;
        }

        public Criteria andD12NotEqualTo(String value) {
            addCriterion("d12 <>", value, "d12");
            return (Criteria) this;
        }

        public Criteria andD12GreaterThan(String value) {
            addCriterion("d12 >", value, "d12");
            return (Criteria) this;
        }

        public Criteria andD12GreaterThanOrEqualTo(String value) {
            addCriterion("d12 >=", value, "d12");
            return (Criteria) this;
        }

        public Criteria andD12LessThan(String value) {
            addCriterion("d12 <", value, "d12");
            return (Criteria) this;
        }

        public Criteria andD12LessThanOrEqualTo(String value) {
            addCriterion("d12 <=", value, "d12");
            return (Criteria) this;
        }

        public Criteria andD12Like(String value) {
            addCriterion("d12 like", value, "d12");
            return (Criteria) this;
        }

        public Criteria andD12NotLike(String value) {
            addCriterion("d12 not like", value, "d12");
            return (Criteria) this;
        }

        public Criteria andD12In(List<String> values) {
            addCriterion("d12 in", values, "d12");
            return (Criteria) this;
        }

        public Criteria andD12NotIn(List<String> values) {
            addCriterion("d12 not in", values, "d12");
            return (Criteria) this;
        }

        public Criteria andD12Between(String value1, String value2) {
            addCriterion("d12 between", value1, value2, "d12");
            return (Criteria) this;
        }

        public Criteria andD12NotBetween(String value1, String value2) {
            addCriterion("d12 not between", value1, value2, "d12");
            return (Criteria) this;
        }

        public Criteria andD13IsNull() {
            addCriterion("d13 is null");
            return (Criteria) this;
        }

        public Criteria andD13IsNotNull() {
            addCriterion("d13 is not null");
            return (Criteria) this;
        }

        public Criteria andD13EqualTo(String value) {
            addCriterion("d13 =", value, "d13");
            return (Criteria) this;
        }

        public Criteria andD13NotEqualTo(String value) {
            addCriterion("d13 <>", value, "d13");
            return (Criteria) this;
        }

        public Criteria andD13GreaterThan(String value) {
            addCriterion("d13 >", value, "d13");
            return (Criteria) this;
        }

        public Criteria andD13GreaterThanOrEqualTo(String value) {
            addCriterion("d13 >=", value, "d13");
            return (Criteria) this;
        }

        public Criteria andD13LessThan(String value) {
            addCriterion("d13 <", value, "d13");
            return (Criteria) this;
        }

        public Criteria andD13LessThanOrEqualTo(String value) {
            addCriterion("d13 <=", value, "d13");
            return (Criteria) this;
        }

        public Criteria andD13Like(String value) {
            addCriterion("d13 like", value, "d13");
            return (Criteria) this;
        }

        public Criteria andD13NotLike(String value) {
            addCriterion("d13 not like", value, "d13");
            return (Criteria) this;
        }

        public Criteria andD13In(List<String> values) {
            addCriterion("d13 in", values, "d13");
            return (Criteria) this;
        }

        public Criteria andD13NotIn(List<String> values) {
            addCriterion("d13 not in", values, "d13");
            return (Criteria) this;
        }

        public Criteria andD13Between(String value1, String value2) {
            addCriterion("d13 between", value1, value2, "d13");
            return (Criteria) this;
        }

        public Criteria andD13NotBetween(String value1, String value2) {
            addCriterion("d13 not between", value1, value2, "d13");
            return (Criteria) this;
        }

        public Criteria andD14IsNull() {
            addCriterion("d14 is null");
            return (Criteria) this;
        }

        public Criteria andD14IsNotNull() {
            addCriterion("d14 is not null");
            return (Criteria) this;
        }

        public Criteria andD14EqualTo(String value) {
            addCriterion("d14 =", value, "d14");
            return (Criteria) this;
        }

        public Criteria andD14NotEqualTo(String value) {
            addCriterion("d14 <>", value, "d14");
            return (Criteria) this;
        }

        public Criteria andD14GreaterThan(String value) {
            addCriterion("d14 >", value, "d14");
            return (Criteria) this;
        }

        public Criteria andD14GreaterThanOrEqualTo(String value) {
            addCriterion("d14 >=", value, "d14");
            return (Criteria) this;
        }

        public Criteria andD14LessThan(String value) {
            addCriterion("d14 <", value, "d14");
            return (Criteria) this;
        }

        public Criteria andD14LessThanOrEqualTo(String value) {
            addCriterion("d14 <=", value, "d14");
            return (Criteria) this;
        }

        public Criteria andD14Like(String value) {
            addCriterion("d14 like", value, "d14");
            return (Criteria) this;
        }

        public Criteria andD14NotLike(String value) {
            addCriterion("d14 not like", value, "d14");
            return (Criteria) this;
        }

        public Criteria andD14In(List<String> values) {
            addCriterion("d14 in", values, "d14");
            return (Criteria) this;
        }

        public Criteria andD14NotIn(List<String> values) {
            addCriterion("d14 not in", values, "d14");
            return (Criteria) this;
        }

        public Criteria andD14Between(String value1, String value2) {
            addCriterion("d14 between", value1, value2, "d14");
            return (Criteria) this;
        }

        public Criteria andD14NotBetween(String value1, String value2) {
            addCriterion("d14 not between", value1, value2, "d14");
            return (Criteria) this;
        }

        public Criteria andD15IsNull() {
            addCriterion("d15 is null");
            return (Criteria) this;
        }

        public Criteria andD15IsNotNull() {
            addCriterion("d15 is not null");
            return (Criteria) this;
        }

        public Criteria andD15EqualTo(String value) {
            addCriterion("d15 =", value, "d15");
            return (Criteria) this;
        }

        public Criteria andD15NotEqualTo(String value) {
            addCriterion("d15 <>", value, "d15");
            return (Criteria) this;
        }

        public Criteria andD15GreaterThan(String value) {
            addCriterion("d15 >", value, "d15");
            return (Criteria) this;
        }

        public Criteria andD15GreaterThanOrEqualTo(String value) {
            addCriterion("d15 >=", value, "d15");
            return (Criteria) this;
        }

        public Criteria andD15LessThan(String value) {
            addCriterion("d15 <", value, "d15");
            return (Criteria) this;
        }

        public Criteria andD15LessThanOrEqualTo(String value) {
            addCriterion("d15 <=", value, "d15");
            return (Criteria) this;
        }

        public Criteria andD15Like(String value) {
            addCriterion("d15 like", value, "d15");
            return (Criteria) this;
        }

        public Criteria andD15NotLike(String value) {
            addCriterion("d15 not like", value, "d15");
            return (Criteria) this;
        }

        public Criteria andD15In(List<String> values) {
            addCriterion("d15 in", values, "d15");
            return (Criteria) this;
        }

        public Criteria andD15NotIn(List<String> values) {
            addCriterion("d15 not in", values, "d15");
            return (Criteria) this;
        }

        public Criteria andD15Between(String value1, String value2) {
            addCriterion("d15 between", value1, value2, "d15");
            return (Criteria) this;
        }

        public Criteria andD15NotBetween(String value1, String value2) {
            addCriterion("d15 not between", value1, value2, "d15");
            return (Criteria) this;
        }

        public Criteria andD16IsNull() {
            addCriterion("d16 is null");
            return (Criteria) this;
        }

        public Criteria andD16IsNotNull() {
            addCriterion("d16 is not null");
            return (Criteria) this;
        }

        public Criteria andD16EqualTo(String value) {
            addCriterion("d16 =", value, "d16");
            return (Criteria) this;
        }

        public Criteria andD16NotEqualTo(String value) {
            addCriterion("d16 <>", value, "d16");
            return (Criteria) this;
        }

        public Criteria andD16GreaterThan(String value) {
            addCriterion("d16 >", value, "d16");
            return (Criteria) this;
        }

        public Criteria andD16GreaterThanOrEqualTo(String value) {
            addCriterion("d16 >=", value, "d16");
            return (Criteria) this;
        }

        public Criteria andD16LessThan(String value) {
            addCriterion("d16 <", value, "d16");
            return (Criteria) this;
        }

        public Criteria andD16LessThanOrEqualTo(String value) {
            addCriterion("d16 <=", value, "d16");
            return (Criteria) this;
        }

        public Criteria andD16Like(String value) {
            addCriterion("d16 like", value, "d16");
            return (Criteria) this;
        }

        public Criteria andD16NotLike(String value) {
            addCriterion("d16 not like", value, "d16");
            return (Criteria) this;
        }

        public Criteria andD16In(List<String> values) {
            addCriterion("d16 in", values, "d16");
            return (Criteria) this;
        }

        public Criteria andD16NotIn(List<String> values) {
            addCriterion("d16 not in", values, "d16");
            return (Criteria) this;
        }

        public Criteria andD16Between(String value1, String value2) {
            addCriterion("d16 between", value1, value2, "d16");
            return (Criteria) this;
        }

        public Criteria andD16NotBetween(String value1, String value2) {
            addCriterion("d16 not between", value1, value2, "d16");
            return (Criteria) this;
        }

        public Criteria andD17IsNull() {
            addCriterion("d17 is null");
            return (Criteria) this;
        }

        public Criteria andD17IsNotNull() {
            addCriterion("d17 is not null");
            return (Criteria) this;
        }

        public Criteria andD17EqualTo(String value) {
            addCriterion("d17 =", value, "d17");
            return (Criteria) this;
        }

        public Criteria andD17NotEqualTo(String value) {
            addCriterion("d17 <>", value, "d17");
            return (Criteria) this;
        }

        public Criteria andD17GreaterThan(String value) {
            addCriterion("d17 >", value, "d17");
            return (Criteria) this;
        }

        public Criteria andD17GreaterThanOrEqualTo(String value) {
            addCriterion("d17 >=", value, "d17");
            return (Criteria) this;
        }

        public Criteria andD17LessThan(String value) {
            addCriterion("d17 <", value, "d17");
            return (Criteria) this;
        }

        public Criteria andD17LessThanOrEqualTo(String value) {
            addCriterion("d17 <=", value, "d17");
            return (Criteria) this;
        }

        public Criteria andD17Like(String value) {
            addCriterion("d17 like", value, "d17");
            return (Criteria) this;
        }

        public Criteria andD17NotLike(String value) {
            addCriterion("d17 not like", value, "d17");
            return (Criteria) this;
        }

        public Criteria andD17In(List<String> values) {
            addCriterion("d17 in", values, "d17");
            return (Criteria) this;
        }

        public Criteria andD17NotIn(List<String> values) {
            addCriterion("d17 not in", values, "d17");
            return (Criteria) this;
        }

        public Criteria andD17Between(String value1, String value2) {
            addCriterion("d17 between", value1, value2, "d17");
            return (Criteria) this;
        }

        public Criteria andD17NotBetween(String value1, String value2) {
            addCriterion("d17 not between", value1, value2, "d17");
            return (Criteria) this;
        }

        public Criteria andD18IsNull() {
            addCriterion("d18 is null");
            return (Criteria) this;
        }

        public Criteria andD18IsNotNull() {
            addCriterion("d18 is not null");
            return (Criteria) this;
        }

        public Criteria andD18EqualTo(String value) {
            addCriterion("d18 =", value, "d18");
            return (Criteria) this;
        }

        public Criteria andD18NotEqualTo(String value) {
            addCriterion("d18 <>", value, "d18");
            return (Criteria) this;
        }

        public Criteria andD18GreaterThan(String value) {
            addCriterion("d18 >", value, "d18");
            return (Criteria) this;
        }

        public Criteria andD18GreaterThanOrEqualTo(String value) {
            addCriterion("d18 >=", value, "d18");
            return (Criteria) this;
        }

        public Criteria andD18LessThan(String value) {
            addCriterion("d18 <", value, "d18");
            return (Criteria) this;
        }

        public Criteria andD18LessThanOrEqualTo(String value) {
            addCriterion("d18 <=", value, "d18");
            return (Criteria) this;
        }

        public Criteria andD18Like(String value) {
            addCriterion("d18 like", value, "d18");
            return (Criteria) this;
        }

        public Criteria andD18NotLike(String value) {
            addCriterion("d18 not like", value, "d18");
            return (Criteria) this;
        }

        public Criteria andD18In(List<String> values) {
            addCriterion("d18 in", values, "d18");
            return (Criteria) this;
        }

        public Criteria andD18NotIn(List<String> values) {
            addCriterion("d18 not in", values, "d18");
            return (Criteria) this;
        }

        public Criteria andD18Between(String value1, String value2) {
            addCriterion("d18 between", value1, value2, "d18");
            return (Criteria) this;
        }

        public Criteria andD18NotBetween(String value1, String value2) {
            addCriterion("d18 not between", value1, value2, "d18");
            return (Criteria) this;
        }

        public Criteria andD19IsNull() {
            addCriterion("d19 is null");
            return (Criteria) this;
        }

        public Criteria andD19IsNotNull() {
            addCriterion("d19 is not null");
            return (Criteria) this;
        }

        public Criteria andD19EqualTo(String value) {
            addCriterion("d19 =", value, "d19");
            return (Criteria) this;
        }

        public Criteria andD19NotEqualTo(String value) {
            addCriterion("d19 <>", value, "d19");
            return (Criteria) this;
        }

        public Criteria andD19GreaterThan(String value) {
            addCriterion("d19 >", value, "d19");
            return (Criteria) this;
        }

        public Criteria andD19GreaterThanOrEqualTo(String value) {
            addCriterion("d19 >=", value, "d19");
            return (Criteria) this;
        }

        public Criteria andD19LessThan(String value) {
            addCriterion("d19 <", value, "d19");
            return (Criteria) this;
        }

        public Criteria andD19LessThanOrEqualTo(String value) {
            addCriterion("d19 <=", value, "d19");
            return (Criteria) this;
        }

        public Criteria andD19Like(String value) {
            addCriterion("d19 like", value, "d19");
            return (Criteria) this;
        }

        public Criteria andD19NotLike(String value) {
            addCriterion("d19 not like", value, "d19");
            return (Criteria) this;
        }

        public Criteria andD19In(List<String> values) {
            addCriterion("d19 in", values, "d19");
            return (Criteria) this;
        }

        public Criteria andD19NotIn(List<String> values) {
            addCriterion("d19 not in", values, "d19");
            return (Criteria) this;
        }

        public Criteria andD19Between(String value1, String value2) {
            addCriterion("d19 between", value1, value2, "d19");
            return (Criteria) this;
        }

        public Criteria andD19NotBetween(String value1, String value2) {
            addCriterion("d19 not between", value1, value2, "d19");
            return (Criteria) this;
        }

        public Criteria andD20IsNull() {
            addCriterion("d20 is null");
            return (Criteria) this;
        }

        public Criteria andD20IsNotNull() {
            addCriterion("d20 is not null");
            return (Criteria) this;
        }

        public Criteria andD20EqualTo(String value) {
            addCriterion("d20 =", value, "d20");
            return (Criteria) this;
        }

        public Criteria andD20NotEqualTo(String value) {
            addCriterion("d20 <>", value, "d20");
            return (Criteria) this;
        }

        public Criteria andD20GreaterThan(String value) {
            addCriterion("d20 >", value, "d20");
            return (Criteria) this;
        }

        public Criteria andD20GreaterThanOrEqualTo(String value) {
            addCriterion("d20 >=", value, "d20");
            return (Criteria) this;
        }

        public Criteria andD20LessThan(String value) {
            addCriterion("d20 <", value, "d20");
            return (Criteria) this;
        }

        public Criteria andD20LessThanOrEqualTo(String value) {
            addCriterion("d20 <=", value, "d20");
            return (Criteria) this;
        }

        public Criteria andD20Like(String value) {
            addCriterion("d20 like", value, "d20");
            return (Criteria) this;
        }

        public Criteria andD20NotLike(String value) {
            addCriterion("d20 not like", value, "d20");
            return (Criteria) this;
        }

        public Criteria andD20In(List<String> values) {
            addCriterion("d20 in", values, "d20");
            return (Criteria) this;
        }

        public Criteria andD20NotIn(List<String> values) {
            addCriterion("d20 not in", values, "d20");
            return (Criteria) this;
        }

        public Criteria andD20Between(String value1, String value2) {
            addCriterion("d20 between", value1, value2, "d20");
            return (Criteria) this;
        }

        public Criteria andD20NotBetween(String value1, String value2) {
            addCriterion("d20 not between", value1, value2, "d20");
            return (Criteria) this;
        }

        public Criteria andE01IsNull() {
            addCriterion("e01 is null");
            return (Criteria) this;
        }

        public Criteria andE01IsNotNull() {
            addCriterion("e01 is not null");
            return (Criteria) this;
        }

        public Criteria andE01EqualTo(String value) {
            addCriterion("e01 =", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01NotEqualTo(String value) {
            addCriterion("e01 <>", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01GreaterThan(String value) {
            addCriterion("e01 >", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01GreaterThanOrEqualTo(String value) {
            addCriterion("e01 >=", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01LessThan(String value) {
            addCriterion("e01 <", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01LessThanOrEqualTo(String value) {
            addCriterion("e01 <=", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01Like(String value) {
            addCriterion("e01 like", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01NotLike(String value) {
            addCriterion("e01 not like", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01In(List<String> values) {
            addCriterion("e01 in", values, "e01");
            return (Criteria) this;
        }

        public Criteria andE01NotIn(List<String> values) {
            addCriterion("e01 not in", values, "e01");
            return (Criteria) this;
        }

        public Criteria andE01Between(String value1, String value2) {
            addCriterion("e01 between", value1, value2, "e01");
            return (Criteria) this;
        }

        public Criteria andE01NotBetween(String value1, String value2) {
            addCriterion("e01 not between", value1, value2, "e01");
            return (Criteria) this;
        }

        public Criteria andE02IsNull() {
            addCriterion("e02 is null");
            return (Criteria) this;
        }

        public Criteria andE02IsNotNull() {
            addCriterion("e02 is not null");
            return (Criteria) this;
        }

        public Criteria andE02EqualTo(String value) {
            addCriterion("e02 =", value, "e02");
            return (Criteria) this;
        }

        public Criteria andE02NotEqualTo(String value) {
            addCriterion("e02 <>", value, "e02");
            return (Criteria) this;
        }

        public Criteria andE02GreaterThan(String value) {
            addCriterion("e02 >", value, "e02");
            return (Criteria) this;
        }

        public Criteria andE02GreaterThanOrEqualTo(String value) {
            addCriterion("e02 >=", value, "e02");
            return (Criteria) this;
        }

        public Criteria andE02LessThan(String value) {
            addCriterion("e02 <", value, "e02");
            return (Criteria) this;
        }

        public Criteria andE02LessThanOrEqualTo(String value) {
            addCriterion("e02 <=", value, "e02");
            return (Criteria) this;
        }

        public Criteria andE02Like(String value) {
            addCriterion("e02 like", value, "e02");
            return (Criteria) this;
        }

        public Criteria andE02NotLike(String value) {
            addCriterion("e02 not like", value, "e02");
            return (Criteria) this;
        }

        public Criteria andE02In(List<String> values) {
            addCriterion("e02 in", values, "e02");
            return (Criteria) this;
        }

        public Criteria andE02NotIn(List<String> values) {
            addCriterion("e02 not in", values, "e02");
            return (Criteria) this;
        }

        public Criteria andE02Between(String value1, String value2) {
            addCriterion("e02 between", value1, value2, "e02");
            return (Criteria) this;
        }

        public Criteria andE02NotBetween(String value1, String value2) {
            addCriterion("e02 not between", value1, value2, "e02");
            return (Criteria) this;
        }

        public Criteria andE03IsNull() {
            addCriterion("e03 is null");
            return (Criteria) this;
        }

        public Criteria andE03IsNotNull() {
            addCriterion("e03 is not null");
            return (Criteria) this;
        }

        public Criteria andE03EqualTo(String value) {
            addCriterion("e03 =", value, "e03");
            return (Criteria) this;
        }

        public Criteria andE03NotEqualTo(String value) {
            addCriterion("e03 <>", value, "e03");
            return (Criteria) this;
        }

        public Criteria andE03GreaterThan(String value) {
            addCriterion("e03 >", value, "e03");
            return (Criteria) this;
        }

        public Criteria andE03GreaterThanOrEqualTo(String value) {
            addCriterion("e03 >=", value, "e03");
            return (Criteria) this;
        }

        public Criteria andE03LessThan(String value) {
            addCriterion("e03 <", value, "e03");
            return (Criteria) this;
        }

        public Criteria andE03LessThanOrEqualTo(String value) {
            addCriterion("e03 <=", value, "e03");
            return (Criteria) this;
        }

        public Criteria andE03Like(String value) {
            addCriterion("e03 like", value, "e03");
            return (Criteria) this;
        }

        public Criteria andE03NotLike(String value) {
            addCriterion("e03 not like", value, "e03");
            return (Criteria) this;
        }

        public Criteria andE03In(List<String> values) {
            addCriterion("e03 in", values, "e03");
            return (Criteria) this;
        }

        public Criteria andE03NotIn(List<String> values) {
            addCriterion("e03 not in", values, "e03");
            return (Criteria) this;
        }

        public Criteria andE03Between(String value1, String value2) {
            addCriterion("e03 between", value1, value2, "e03");
            return (Criteria) this;
        }

        public Criteria andE03NotBetween(String value1, String value2) {
            addCriterion("e03 not between", value1, value2, "e03");
            return (Criteria) this;
        }

        public Criteria andE04IsNull() {
            addCriterion("e04 is null");
            return (Criteria) this;
        }

        public Criteria andE04IsNotNull() {
            addCriterion("e04 is not null");
            return (Criteria) this;
        }

        public Criteria andE04EqualTo(String value) {
            addCriterion("e04 =", value, "e04");
            return (Criteria) this;
        }

        public Criteria andE04NotEqualTo(String value) {
            addCriterion("e04 <>", value, "e04");
            return (Criteria) this;
        }

        public Criteria andE04GreaterThan(String value) {
            addCriterion("e04 >", value, "e04");
            return (Criteria) this;
        }

        public Criteria andE04GreaterThanOrEqualTo(String value) {
            addCriterion("e04 >=", value, "e04");
            return (Criteria) this;
        }

        public Criteria andE04LessThan(String value) {
            addCriterion("e04 <", value, "e04");
            return (Criteria) this;
        }

        public Criteria andE04LessThanOrEqualTo(String value) {
            addCriterion("e04 <=", value, "e04");
            return (Criteria) this;
        }

        public Criteria andE04Like(String value) {
            addCriterion("e04 like", value, "e04");
            return (Criteria) this;
        }

        public Criteria andE04NotLike(String value) {
            addCriterion("e04 not like", value, "e04");
            return (Criteria) this;
        }

        public Criteria andE04In(List<String> values) {
            addCriterion("e04 in", values, "e04");
            return (Criteria) this;
        }

        public Criteria andE04NotIn(List<String> values) {
            addCriterion("e04 not in", values, "e04");
            return (Criteria) this;
        }

        public Criteria andE04Between(String value1, String value2) {
            addCriterion("e04 between", value1, value2, "e04");
            return (Criteria) this;
        }

        public Criteria andE04NotBetween(String value1, String value2) {
            addCriterion("e04 not between", value1, value2, "e04");
            return (Criteria) this;
        }

        public Criteria andE05IsNull() {
            addCriterion("e05 is null");
            return (Criteria) this;
        }

        public Criteria andE05IsNotNull() {
            addCriterion("e05 is not null");
            return (Criteria) this;
        }

        public Criteria andE05EqualTo(String value) {
            addCriterion("e05 =", value, "e05");
            return (Criteria) this;
        }

        public Criteria andE05NotEqualTo(String value) {
            addCriterion("e05 <>", value, "e05");
            return (Criteria) this;
        }

        public Criteria andE05GreaterThan(String value) {
            addCriterion("e05 >", value, "e05");
            return (Criteria) this;
        }

        public Criteria andE05GreaterThanOrEqualTo(String value) {
            addCriterion("e05 >=", value, "e05");
            return (Criteria) this;
        }

        public Criteria andE05LessThan(String value) {
            addCriterion("e05 <", value, "e05");
            return (Criteria) this;
        }

        public Criteria andE05LessThanOrEqualTo(String value) {
            addCriterion("e05 <=", value, "e05");
            return (Criteria) this;
        }

        public Criteria andE05Like(String value) {
            addCriterion("e05 like", value, "e05");
            return (Criteria) this;
        }

        public Criteria andE05NotLike(String value) {
            addCriterion("e05 not like", value, "e05");
            return (Criteria) this;
        }

        public Criteria andE05In(List<String> values) {
            addCriterion("e05 in", values, "e05");
            return (Criteria) this;
        }

        public Criteria andE05NotIn(List<String> values) {
            addCriterion("e05 not in", values, "e05");
            return (Criteria) this;
        }

        public Criteria andE05Between(String value1, String value2) {
            addCriterion("e05 between", value1, value2, "e05");
            return (Criteria) this;
        }

        public Criteria andE05NotBetween(String value1, String value2) {
            addCriterion("e05 not between", value1, value2, "e05");
            return (Criteria) this;
        }

        public Criteria andE06IsNull() {
            addCriterion("e06 is null");
            return (Criteria) this;
        }

        public Criteria andE06IsNotNull() {
            addCriterion("e06 is not null");
            return (Criteria) this;
        }

        public Criteria andE06EqualTo(String value) {
            addCriterion("e06 =", value, "e06");
            return (Criteria) this;
        }

        public Criteria andE06NotEqualTo(String value) {
            addCriterion("e06 <>", value, "e06");
            return (Criteria) this;
        }

        public Criteria andE06GreaterThan(String value) {
            addCriterion("e06 >", value, "e06");
            return (Criteria) this;
        }

        public Criteria andE06GreaterThanOrEqualTo(String value) {
            addCriterion("e06 >=", value, "e06");
            return (Criteria) this;
        }

        public Criteria andE06LessThan(String value) {
            addCriterion("e06 <", value, "e06");
            return (Criteria) this;
        }

        public Criteria andE06LessThanOrEqualTo(String value) {
            addCriterion("e06 <=", value, "e06");
            return (Criteria) this;
        }

        public Criteria andE06Like(String value) {
            addCriterion("e06 like", value, "e06");
            return (Criteria) this;
        }

        public Criteria andE06NotLike(String value) {
            addCriterion("e06 not like", value, "e06");
            return (Criteria) this;
        }

        public Criteria andE06In(List<String> values) {
            addCriterion("e06 in", values, "e06");
            return (Criteria) this;
        }

        public Criteria andE06NotIn(List<String> values) {
            addCriterion("e06 not in", values, "e06");
            return (Criteria) this;
        }

        public Criteria andE06Between(String value1, String value2) {
            addCriterion("e06 between", value1, value2, "e06");
            return (Criteria) this;
        }

        public Criteria andE06NotBetween(String value1, String value2) {
            addCriterion("e06 not between", value1, value2, "e06");
            return (Criteria) this;
        }

        public Criteria andE07IsNull() {
            addCriterion("e07 is null");
            return (Criteria) this;
        }

        public Criteria andE07IsNotNull() {
            addCriterion("e07 is not null");
            return (Criteria) this;
        }

        public Criteria andE07EqualTo(String value) {
            addCriterion("e07 =", value, "e07");
            return (Criteria) this;
        }

        public Criteria andE07NotEqualTo(String value) {
            addCriterion("e07 <>", value, "e07");
            return (Criteria) this;
        }

        public Criteria andE07GreaterThan(String value) {
            addCriterion("e07 >", value, "e07");
            return (Criteria) this;
        }

        public Criteria andE07GreaterThanOrEqualTo(String value) {
            addCriterion("e07 >=", value, "e07");
            return (Criteria) this;
        }

        public Criteria andE07LessThan(String value) {
            addCriterion("e07 <", value, "e07");
            return (Criteria) this;
        }

        public Criteria andE07LessThanOrEqualTo(String value) {
            addCriterion("e07 <=", value, "e07");
            return (Criteria) this;
        }

        public Criteria andE07Like(String value) {
            addCriterion("e07 like", value, "e07");
            return (Criteria) this;
        }

        public Criteria andE07NotLike(String value) {
            addCriterion("e07 not like", value, "e07");
            return (Criteria) this;
        }

        public Criteria andE07In(List<String> values) {
            addCriterion("e07 in", values, "e07");
            return (Criteria) this;
        }

        public Criteria andE07NotIn(List<String> values) {
            addCriterion("e07 not in", values, "e07");
            return (Criteria) this;
        }

        public Criteria andE07Between(String value1, String value2) {
            addCriterion("e07 between", value1, value2, "e07");
            return (Criteria) this;
        }

        public Criteria andE07NotBetween(String value1, String value2) {
            addCriterion("e07 not between", value1, value2, "e07");
            return (Criteria) this;
        }

        public Criteria andE08IsNull() {
            addCriterion("e08 is null");
            return (Criteria) this;
        }

        public Criteria andE08IsNotNull() {
            addCriterion("e08 is not null");
            return (Criteria) this;
        }

        public Criteria andE08EqualTo(String value) {
            addCriterion("e08 =", value, "e08");
            return (Criteria) this;
        }

        public Criteria andE08NotEqualTo(String value) {
            addCriterion("e08 <>", value, "e08");
            return (Criteria) this;
        }

        public Criteria andE08GreaterThan(String value) {
            addCriterion("e08 >", value, "e08");
            return (Criteria) this;
        }

        public Criteria andE08GreaterThanOrEqualTo(String value) {
            addCriterion("e08 >=", value, "e08");
            return (Criteria) this;
        }

        public Criteria andE08LessThan(String value) {
            addCriterion("e08 <", value, "e08");
            return (Criteria) this;
        }

        public Criteria andE08LessThanOrEqualTo(String value) {
            addCriterion("e08 <=", value, "e08");
            return (Criteria) this;
        }

        public Criteria andE08Like(String value) {
            addCriterion("e08 like", value, "e08");
            return (Criteria) this;
        }

        public Criteria andE08NotLike(String value) {
            addCriterion("e08 not like", value, "e08");
            return (Criteria) this;
        }

        public Criteria andE08In(List<String> values) {
            addCriterion("e08 in", values, "e08");
            return (Criteria) this;
        }

        public Criteria andE08NotIn(List<String> values) {
            addCriterion("e08 not in", values, "e08");
            return (Criteria) this;
        }

        public Criteria andE08Between(String value1, String value2) {
            addCriterion("e08 between", value1, value2, "e08");
            return (Criteria) this;
        }

        public Criteria andE08NotBetween(String value1, String value2) {
            addCriterion("e08 not between", value1, value2, "e08");
            return (Criteria) this;
        }

        public Criteria andE09IsNull() {
            addCriterion("e09 is null");
            return (Criteria) this;
        }

        public Criteria andE09IsNotNull() {
            addCriterion("e09 is not null");
            return (Criteria) this;
        }

        public Criteria andE09EqualTo(String value) {
            addCriterion("e09 =", value, "e09");
            return (Criteria) this;
        }

        public Criteria andE09NotEqualTo(String value) {
            addCriterion("e09 <>", value, "e09");
            return (Criteria) this;
        }

        public Criteria andE09GreaterThan(String value) {
            addCriterion("e09 >", value, "e09");
            return (Criteria) this;
        }

        public Criteria andE09GreaterThanOrEqualTo(String value) {
            addCriterion("e09 >=", value, "e09");
            return (Criteria) this;
        }

        public Criteria andE09LessThan(String value) {
            addCriterion("e09 <", value, "e09");
            return (Criteria) this;
        }

        public Criteria andE09LessThanOrEqualTo(String value) {
            addCriterion("e09 <=", value, "e09");
            return (Criteria) this;
        }

        public Criteria andE09Like(String value) {
            addCriterion("e09 like", value, "e09");
            return (Criteria) this;
        }

        public Criteria andE09NotLike(String value) {
            addCriterion("e09 not like", value, "e09");
            return (Criteria) this;
        }

        public Criteria andE09In(List<String> values) {
            addCriterion("e09 in", values, "e09");
            return (Criteria) this;
        }

        public Criteria andE09NotIn(List<String> values) {
            addCriterion("e09 not in", values, "e09");
            return (Criteria) this;
        }

        public Criteria andE09Between(String value1, String value2) {
            addCriterion("e09 between", value1, value2, "e09");
            return (Criteria) this;
        }

        public Criteria andE09NotBetween(String value1, String value2) {
            addCriterion("e09 not between", value1, value2, "e09");
            return (Criteria) this;
        }

        public Criteria andE10IsNull() {
            addCriterion("e10 is null");
            return (Criteria) this;
        }

        public Criteria andE10IsNotNull() {
            addCriterion("e10 is not null");
            return (Criteria) this;
        }

        public Criteria andE10EqualTo(String value) {
            addCriterion("e10 =", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10NotEqualTo(String value) {
            addCriterion("e10 <>", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10GreaterThan(String value) {
            addCriterion("e10 >", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10GreaterThanOrEqualTo(String value) {
            addCriterion("e10 >=", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10LessThan(String value) {
            addCriterion("e10 <", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10LessThanOrEqualTo(String value) {
            addCriterion("e10 <=", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10Like(String value) {
            addCriterion("e10 like", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10NotLike(String value) {
            addCriterion("e10 not like", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10In(List<String> values) {
            addCriterion("e10 in", values, "e10");
            return (Criteria) this;
        }

        public Criteria andE10NotIn(List<String> values) {
            addCriterion("e10 not in", values, "e10");
            return (Criteria) this;
        }

        public Criteria andE10Between(String value1, String value2) {
            addCriterion("e10 between", value1, value2, "e10");
            return (Criteria) this;
        }

        public Criteria andE10NotBetween(String value1, String value2) {
            addCriterion("e10 not between", value1, value2, "e10");
            return (Criteria) this;
        }

        public Criteria andE11IsNull() {
            addCriterion("e11 is null");
            return (Criteria) this;
        }

        public Criteria andE11IsNotNull() {
            addCriterion("e11 is not null");
            return (Criteria) this;
        }

        public Criteria andE11EqualTo(String value) {
            addCriterion("e11 =", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11NotEqualTo(String value) {
            addCriterion("e11 <>", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11GreaterThan(String value) {
            addCriterion("e11 >", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11GreaterThanOrEqualTo(String value) {
            addCriterion("e11 >=", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11LessThan(String value) {
            addCriterion("e11 <", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11LessThanOrEqualTo(String value) {
            addCriterion("e11 <=", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11Like(String value) {
            addCriterion("e11 like", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11NotLike(String value) {
            addCriterion("e11 not like", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11In(List<String> values) {
            addCriterion("e11 in", values, "e11");
            return (Criteria) this;
        }

        public Criteria andE11NotIn(List<String> values) {
            addCriterion("e11 not in", values, "e11");
            return (Criteria) this;
        }

        public Criteria andE11Between(String value1, String value2) {
            addCriterion("e11 between", value1, value2, "e11");
            return (Criteria) this;
        }

        public Criteria andE11NotBetween(String value1, String value2) {
            addCriterion("e11 not between", value1, value2, "e11");
            return (Criteria) this;
        }

        public Criteria andE12IsNull() {
            addCriterion("e12 is null");
            return (Criteria) this;
        }

        public Criteria andE12IsNotNull() {
            addCriterion("e12 is not null");
            return (Criteria) this;
        }

        public Criteria andE12EqualTo(String value) {
            addCriterion("e12 =", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12NotEqualTo(String value) {
            addCriterion("e12 <>", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12GreaterThan(String value) {
            addCriterion("e12 >", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12GreaterThanOrEqualTo(String value) {
            addCriterion("e12 >=", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12LessThan(String value) {
            addCriterion("e12 <", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12LessThanOrEqualTo(String value) {
            addCriterion("e12 <=", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12Like(String value) {
            addCriterion("e12 like", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12NotLike(String value) {
            addCriterion("e12 not like", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12In(List<String> values) {
            addCriterion("e12 in", values, "e12");
            return (Criteria) this;
        }

        public Criteria andE12NotIn(List<String> values) {
            addCriterion("e12 not in", values, "e12");
            return (Criteria) this;
        }

        public Criteria andE12Between(String value1, String value2) {
            addCriterion("e12 between", value1, value2, "e12");
            return (Criteria) this;
        }

        public Criteria andE12NotBetween(String value1, String value2) {
            addCriterion("e12 not between", value1, value2, "e12");
            return (Criteria) this;
        }

        public Criteria andE13IsNull() {
            addCriterion("e13 is null");
            return (Criteria) this;
        }

        public Criteria andE13IsNotNull() {
            addCriterion("e13 is not null");
            return (Criteria) this;
        }

        public Criteria andE13EqualTo(String value) {
            addCriterion("e13 =", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13NotEqualTo(String value) {
            addCriterion("e13 <>", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13GreaterThan(String value) {
            addCriterion("e13 >", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13GreaterThanOrEqualTo(String value) {
            addCriterion("e13 >=", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13LessThan(String value) {
            addCriterion("e13 <", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13LessThanOrEqualTo(String value) {
            addCriterion("e13 <=", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13Like(String value) {
            addCriterion("e13 like", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13NotLike(String value) {
            addCriterion("e13 not like", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13In(List<String> values) {
            addCriterion("e13 in", values, "e13");
            return (Criteria) this;
        }

        public Criteria andE13NotIn(List<String> values) {
            addCriterion("e13 not in", values, "e13");
            return (Criteria) this;
        }

        public Criteria andE13Between(String value1, String value2) {
            addCriterion("e13 between", value1, value2, "e13");
            return (Criteria) this;
        }

        public Criteria andE13NotBetween(String value1, String value2) {
            addCriterion("e13 not between", value1, value2, "e13");
            return (Criteria) this;
        }

        public Criteria andE14IsNull() {
            addCriterion("e14 is null");
            return (Criteria) this;
        }

        public Criteria andE14IsNotNull() {
            addCriterion("e14 is not null");
            return (Criteria) this;
        }

        public Criteria andE14EqualTo(String value) {
            addCriterion("e14 =", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14NotEqualTo(String value) {
            addCriterion("e14 <>", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14GreaterThan(String value) {
            addCriterion("e14 >", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14GreaterThanOrEqualTo(String value) {
            addCriterion("e14 >=", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14LessThan(String value) {
            addCriterion("e14 <", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14LessThanOrEqualTo(String value) {
            addCriterion("e14 <=", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14Like(String value) {
            addCriterion("e14 like", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14NotLike(String value) {
            addCriterion("e14 not like", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14In(List<String> values) {
            addCriterion("e14 in", values, "e14");
            return (Criteria) this;
        }

        public Criteria andE14NotIn(List<String> values) {
            addCriterion("e14 not in", values, "e14");
            return (Criteria) this;
        }

        public Criteria andE14Between(String value1, String value2) {
            addCriterion("e14 between", value1, value2, "e14");
            return (Criteria) this;
        }

        public Criteria andE14NotBetween(String value1, String value2) {
            addCriterion("e14 not between", value1, value2, "e14");
            return (Criteria) this;
        }

        public Criteria andE15IsNull() {
            addCriterion("e15 is null");
            return (Criteria) this;
        }

        public Criteria andE15IsNotNull() {
            addCriterion("e15 is not null");
            return (Criteria) this;
        }

        public Criteria andE15EqualTo(String value) {
            addCriterion("e15 =", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15NotEqualTo(String value) {
            addCriterion("e15 <>", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15GreaterThan(String value) {
            addCriterion("e15 >", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15GreaterThanOrEqualTo(String value) {
            addCriterion("e15 >=", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15LessThan(String value) {
            addCriterion("e15 <", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15LessThanOrEqualTo(String value) {
            addCriterion("e15 <=", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15Like(String value) {
            addCriterion("e15 like", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15NotLike(String value) {
            addCriterion("e15 not like", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15In(List<String> values) {
            addCriterion("e15 in", values, "e15");
            return (Criteria) this;
        }

        public Criteria andE15NotIn(List<String> values) {
            addCriterion("e15 not in", values, "e15");
            return (Criteria) this;
        }

        public Criteria andE15Between(String value1, String value2) {
            addCriterion("e15 between", value1, value2, "e15");
            return (Criteria) this;
        }

        public Criteria andE15NotBetween(String value1, String value2) {
            addCriterion("e15 not between", value1, value2, "e15");
            return (Criteria) this;
        }

        public Criteria andE16IsNull() {
            addCriterion("e16 is null");
            return (Criteria) this;
        }

        public Criteria andE16IsNotNull() {
            addCriterion("e16 is not null");
            return (Criteria) this;
        }

        public Criteria andE16EqualTo(String value) {
            addCriterion("e16 =", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16NotEqualTo(String value) {
            addCriterion("e16 <>", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16GreaterThan(String value) {
            addCriterion("e16 >", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16GreaterThanOrEqualTo(String value) {
            addCriterion("e16 >=", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16LessThan(String value) {
            addCriterion("e16 <", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16LessThanOrEqualTo(String value) {
            addCriterion("e16 <=", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16Like(String value) {
            addCriterion("e16 like", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16NotLike(String value) {
            addCriterion("e16 not like", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16In(List<String> values) {
            addCriterion("e16 in", values, "e16");
            return (Criteria) this;
        }

        public Criteria andE16NotIn(List<String> values) {
            addCriterion("e16 not in", values, "e16");
            return (Criteria) this;
        }

        public Criteria andE16Between(String value1, String value2) {
            addCriterion("e16 between", value1, value2, "e16");
            return (Criteria) this;
        }

        public Criteria andE16NotBetween(String value1, String value2) {
            addCriterion("e16 not between", value1, value2, "e16");
            return (Criteria) this;
        }

        public Criteria andE17IsNull() {
            addCriterion("e17 is null");
            return (Criteria) this;
        }

        public Criteria andE17IsNotNull() {
            addCriterion("e17 is not null");
            return (Criteria) this;
        }

        public Criteria andE17EqualTo(String value) {
            addCriterion("e17 =", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17NotEqualTo(String value) {
            addCriterion("e17 <>", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17GreaterThan(String value) {
            addCriterion("e17 >", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17GreaterThanOrEqualTo(String value) {
            addCriterion("e17 >=", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17LessThan(String value) {
            addCriterion("e17 <", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17LessThanOrEqualTo(String value) {
            addCriterion("e17 <=", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17Like(String value) {
            addCriterion("e17 like", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17NotLike(String value) {
            addCriterion("e17 not like", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17In(List<String> values) {
            addCriterion("e17 in", values, "e17");
            return (Criteria) this;
        }

        public Criteria andE17NotIn(List<String> values) {
            addCriterion("e17 not in", values, "e17");
            return (Criteria) this;
        }

        public Criteria andE17Between(String value1, String value2) {
            addCriterion("e17 between", value1, value2, "e17");
            return (Criteria) this;
        }

        public Criteria andE17NotBetween(String value1, String value2) {
            addCriterion("e17 not between", value1, value2, "e17");
            return (Criteria) this;
        }

        public Criteria andE18IsNull() {
            addCriterion("e18 is null");
            return (Criteria) this;
        }

        public Criteria andE18IsNotNull() {
            addCriterion("e18 is not null");
            return (Criteria) this;
        }

        public Criteria andE18EqualTo(String value) {
            addCriterion("e18 =", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18NotEqualTo(String value) {
            addCriterion("e18 <>", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18GreaterThan(String value) {
            addCriterion("e18 >", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18GreaterThanOrEqualTo(String value) {
            addCriterion("e18 >=", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18LessThan(String value) {
            addCriterion("e18 <", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18LessThanOrEqualTo(String value) {
            addCriterion("e18 <=", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18Like(String value) {
            addCriterion("e18 like", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18NotLike(String value) {
            addCriterion("e18 not like", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18In(List<String> values) {
            addCriterion("e18 in", values, "e18");
            return (Criteria) this;
        }

        public Criteria andE18NotIn(List<String> values) {
            addCriterion("e18 not in", values, "e18");
            return (Criteria) this;
        }

        public Criteria andE18Between(String value1, String value2) {
            addCriterion("e18 between", value1, value2, "e18");
            return (Criteria) this;
        }

        public Criteria andE18NotBetween(String value1, String value2) {
            addCriterion("e18 not between", value1, value2, "e18");
            return (Criteria) this;
        }

        public Criteria andE19IsNull() {
            addCriterion("e19 is null");
            return (Criteria) this;
        }

        public Criteria andE19IsNotNull() {
            addCriterion("e19 is not null");
            return (Criteria) this;
        }

        public Criteria andE19EqualTo(String value) {
            addCriterion("e19 =", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19NotEqualTo(String value) {
            addCriterion("e19 <>", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19GreaterThan(String value) {
            addCriterion("e19 >", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19GreaterThanOrEqualTo(String value) {
            addCriterion("e19 >=", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19LessThan(String value) {
            addCriterion("e19 <", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19LessThanOrEqualTo(String value) {
            addCriterion("e19 <=", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19Like(String value) {
            addCriterion("e19 like", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19NotLike(String value) {
            addCriterion("e19 not like", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19In(List<String> values) {
            addCriterion("e19 in", values, "e19");
            return (Criteria) this;
        }

        public Criteria andE19NotIn(List<String> values) {
            addCriterion("e19 not in", values, "e19");
            return (Criteria) this;
        }

        public Criteria andE19Between(String value1, String value2) {
            addCriterion("e19 between", value1, value2, "e19");
            return (Criteria) this;
        }

        public Criteria andE19NotBetween(String value1, String value2) {
            addCriterion("e19 not between", value1, value2, "e19");
            return (Criteria) this;
        }

        public Criteria andE20IsNull() {
            addCriterion("e20 is null");
            return (Criteria) this;
        }

        public Criteria andE20IsNotNull() {
            addCriterion("e20 is not null");
            return (Criteria) this;
        }

        public Criteria andE20EqualTo(String value) {
            addCriterion("e20 =", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20NotEqualTo(String value) {
            addCriterion("e20 <>", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20GreaterThan(String value) {
            addCriterion("e20 >", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20GreaterThanOrEqualTo(String value) {
            addCriterion("e20 >=", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20LessThan(String value) {
            addCriterion("e20 <", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20LessThanOrEqualTo(String value) {
            addCriterion("e20 <=", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20Like(String value) {
            addCriterion("e20 like", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20NotLike(String value) {
            addCriterion("e20 not like", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20In(List<String> values) {
            addCriterion("e20 in", values, "e20");
            return (Criteria) this;
        }

        public Criteria andE20NotIn(List<String> values) {
            addCriterion("e20 not in", values, "e20");
            return (Criteria) this;
        }

        public Criteria andE20Between(String value1, String value2) {
            addCriterion("e20 between", value1, value2, "e20");
            return (Criteria) this;
        }

        public Criteria andE20NotBetween(String value1, String value2) {
            addCriterion("e20 not between", value1, value2, "e20");
            return (Criteria) this;
        }

        public Criteria andE21IsNull() {
            addCriterion("e21 is null");
            return (Criteria) this;
        }

        public Criteria andE21IsNotNull() {
            addCriterion("e21 is not null");
            return (Criteria) this;
        }

        public Criteria andE21EqualTo(String value) {
            addCriterion("e21 =", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21NotEqualTo(String value) {
            addCriterion("e21 <>", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21GreaterThan(String value) {
            addCriterion("e21 >", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21GreaterThanOrEqualTo(String value) {
            addCriterion("e21 >=", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21LessThan(String value) {
            addCriterion("e21 <", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21LessThanOrEqualTo(String value) {
            addCriterion("e21 <=", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21Like(String value) {
            addCriterion("e21 like", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21NotLike(String value) {
            addCriterion("e21 not like", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21In(List<String> values) {
            addCriterion("e21 in", values, "e21");
            return (Criteria) this;
        }

        public Criteria andE21NotIn(List<String> values) {
            addCriterion("e21 not in", values, "e21");
            return (Criteria) this;
        }

        public Criteria andE21Between(String value1, String value2) {
            addCriterion("e21 between", value1, value2, "e21");
            return (Criteria) this;
        }

        public Criteria andE21NotBetween(String value1, String value2) {
            addCriterion("e21 not between", value1, value2, "e21");
            return (Criteria) this;
        }

        public Criteria andE22IsNull() {
            addCriterion("e22 is null");
            return (Criteria) this;
        }

        public Criteria andE22IsNotNull() {
            addCriterion("e22 is not null");
            return (Criteria) this;
        }

        public Criteria andE22EqualTo(String value) {
            addCriterion("e22 =", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22NotEqualTo(String value) {
            addCriterion("e22 <>", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22GreaterThan(String value) {
            addCriterion("e22 >", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22GreaterThanOrEqualTo(String value) {
            addCriterion("e22 >=", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22LessThan(String value) {
            addCriterion("e22 <", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22LessThanOrEqualTo(String value) {
            addCriterion("e22 <=", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22Like(String value) {
            addCriterion("e22 like", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22NotLike(String value) {
            addCriterion("e22 not like", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22In(List<String> values) {
            addCriterion("e22 in", values, "e22");
            return (Criteria) this;
        }

        public Criteria andE22NotIn(List<String> values) {
            addCriterion("e22 not in", values, "e22");
            return (Criteria) this;
        }

        public Criteria andE22Between(String value1, String value2) {
            addCriterion("e22 between", value1, value2, "e22");
            return (Criteria) this;
        }

        public Criteria andE22NotBetween(String value1, String value2) {
            addCriterion("e22 not between", value1, value2, "e22");
            return (Criteria) this;
        }

        public Criteria andE23IsNull() {
            addCriterion("e23 is null");
            return (Criteria) this;
        }

        public Criteria andE23IsNotNull() {
            addCriterion("e23 is not null");
            return (Criteria) this;
        }

        public Criteria andE23EqualTo(String value) {
            addCriterion("e23 =", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23NotEqualTo(String value) {
            addCriterion("e23 <>", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23GreaterThan(String value) {
            addCriterion("e23 >", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23GreaterThanOrEqualTo(String value) {
            addCriterion("e23 >=", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23LessThan(String value) {
            addCriterion("e23 <", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23LessThanOrEqualTo(String value) {
            addCriterion("e23 <=", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23Like(String value) {
            addCriterion("e23 like", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23NotLike(String value) {
            addCriterion("e23 not like", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23In(List<String> values) {
            addCriterion("e23 in", values, "e23");
            return (Criteria) this;
        }

        public Criteria andE23NotIn(List<String> values) {
            addCriterion("e23 not in", values, "e23");
            return (Criteria) this;
        }

        public Criteria andE23Between(String value1, String value2) {
            addCriterion("e23 between", value1, value2, "e23");
            return (Criteria) this;
        }

        public Criteria andE23NotBetween(String value1, String value2) {
            addCriterion("e23 not between", value1, value2, "e23");
            return (Criteria) this;
        }

        public Criteria andE24IsNull() {
            addCriterion("e24 is null");
            return (Criteria) this;
        }

        public Criteria andE24IsNotNull() {
            addCriterion("e24 is not null");
            return (Criteria) this;
        }

        public Criteria andE24EqualTo(String value) {
            addCriterion("e24 =", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24NotEqualTo(String value) {
            addCriterion("e24 <>", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24GreaterThan(String value) {
            addCriterion("e24 >", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24GreaterThanOrEqualTo(String value) {
            addCriterion("e24 >=", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24LessThan(String value) {
            addCriterion("e24 <", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24LessThanOrEqualTo(String value) {
            addCriterion("e24 <=", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24Like(String value) {
            addCriterion("e24 like", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24NotLike(String value) {
            addCriterion("e24 not like", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24In(List<String> values) {
            addCriterion("e24 in", values, "e24");
            return (Criteria) this;
        }

        public Criteria andE24NotIn(List<String> values) {
            addCriterion("e24 not in", values, "e24");
            return (Criteria) this;
        }

        public Criteria andE24Between(String value1, String value2) {
            addCriterion("e24 between", value1, value2, "e24");
            return (Criteria) this;
        }

        public Criteria andE24NotBetween(String value1, String value2) {
            addCriterion("e24 not between", value1, value2, "e24");
            return (Criteria) this;
        }

        public Criteria andE25IsNull() {
            addCriterion("e25 is null");
            return (Criteria) this;
        }

        public Criteria andE25IsNotNull() {
            addCriterion("e25 is not null");
            return (Criteria) this;
        }

        public Criteria andE25EqualTo(String value) {
            addCriterion("e25 =", value, "e25");
            return (Criteria) this;
        }

        public Criteria andE25NotEqualTo(String value) {
            addCriterion("e25 <>", value, "e25");
            return (Criteria) this;
        }

        public Criteria andE25GreaterThan(String value) {
            addCriterion("e25 >", value, "e25");
            return (Criteria) this;
        }

        public Criteria andE25GreaterThanOrEqualTo(String value) {
            addCriterion("e25 >=", value, "e25");
            return (Criteria) this;
        }

        public Criteria andE25LessThan(String value) {
            addCriterion("e25 <", value, "e25");
            return (Criteria) this;
        }

        public Criteria andE25LessThanOrEqualTo(String value) {
            addCriterion("e25 <=", value, "e25");
            return (Criteria) this;
        }

        public Criteria andE25Like(String value) {
            addCriterion("e25 like", value, "e25");
            return (Criteria) this;
        }

        public Criteria andE25NotLike(String value) {
            addCriterion("e25 not like", value, "e25");
            return (Criteria) this;
        }

        public Criteria andE25In(List<String> values) {
            addCriterion("e25 in", values, "e25");
            return (Criteria) this;
        }

        public Criteria andE25NotIn(List<String> values) {
            addCriterion("e25 not in", values, "e25");
            return (Criteria) this;
        }

        public Criteria andE25Between(String value1, String value2) {
            addCriterion("e25 between", value1, value2, "e25");
            return (Criteria) this;
        }

        public Criteria andE25NotBetween(String value1, String value2) {
            addCriterion("e25 not between", value1, value2, "e25");
            return (Criteria) this;
        }

        public Criteria andE26IsNull() {
            addCriterion("e26 is null");
            return (Criteria) this;
        }

        public Criteria andE26IsNotNull() {
            addCriterion("e26 is not null");
            return (Criteria) this;
        }

        public Criteria andE26EqualTo(String value) {
            addCriterion("e26 =", value, "e26");
            return (Criteria) this;
        }

        public Criteria andE26NotEqualTo(String value) {
            addCriterion("e26 <>", value, "e26");
            return (Criteria) this;
        }

        public Criteria andE26GreaterThan(String value) {
            addCriterion("e26 >", value, "e26");
            return (Criteria) this;
        }

        public Criteria andE26GreaterThanOrEqualTo(String value) {
            addCriterion("e26 >=", value, "e26");
            return (Criteria) this;
        }

        public Criteria andE26LessThan(String value) {
            addCriterion("e26 <", value, "e26");
            return (Criteria) this;
        }

        public Criteria andE26LessThanOrEqualTo(String value) {
            addCriterion("e26 <=", value, "e26");
            return (Criteria) this;
        }

        public Criteria andE26Like(String value) {
            addCriterion("e26 like", value, "e26");
            return (Criteria) this;
        }

        public Criteria andE26NotLike(String value) {
            addCriterion("e26 not like", value, "e26");
            return (Criteria) this;
        }

        public Criteria andE26In(List<String> values) {
            addCriterion("e26 in", values, "e26");
            return (Criteria) this;
        }

        public Criteria andE26NotIn(List<String> values) {
            addCriterion("e26 not in", values, "e26");
            return (Criteria) this;
        }

        public Criteria andE26Between(String value1, String value2) {
            addCriterion("e26 between", value1, value2, "e26");
            return (Criteria) this;
        }

        public Criteria andE26NotBetween(String value1, String value2) {
            addCriterion("e26 not between", value1, value2, "e26");
            return (Criteria) this;
        }

        public Criteria andE27IsNull() {
            addCriterion("e27 is null");
            return (Criteria) this;
        }

        public Criteria andE27IsNotNull() {
            addCriterion("e27 is not null");
            return (Criteria) this;
        }

        public Criteria andE27EqualTo(String value) {
            addCriterion("e27 =", value, "e27");
            return (Criteria) this;
        }

        public Criteria andE27NotEqualTo(String value) {
            addCriterion("e27 <>", value, "e27");
            return (Criteria) this;
        }

        public Criteria andE27GreaterThan(String value) {
            addCriterion("e27 >", value, "e27");
            return (Criteria) this;
        }

        public Criteria andE27GreaterThanOrEqualTo(String value) {
            addCriterion("e27 >=", value, "e27");
            return (Criteria) this;
        }

        public Criteria andE27LessThan(String value) {
            addCriterion("e27 <", value, "e27");
            return (Criteria) this;
        }

        public Criteria andE27LessThanOrEqualTo(String value) {
            addCriterion("e27 <=", value, "e27");
            return (Criteria) this;
        }

        public Criteria andE27Like(String value) {
            addCriterion("e27 like", value, "e27");
            return (Criteria) this;
        }

        public Criteria andE27NotLike(String value) {
            addCriterion("e27 not like", value, "e27");
            return (Criteria) this;
        }

        public Criteria andE27In(List<String> values) {
            addCriterion("e27 in", values, "e27");
            return (Criteria) this;
        }

        public Criteria andE27NotIn(List<String> values) {
            addCriterion("e27 not in", values, "e27");
            return (Criteria) this;
        }

        public Criteria andE27Between(String value1, String value2) {
            addCriterion("e27 between", value1, value2, "e27");
            return (Criteria) this;
        }

        public Criteria andE27NotBetween(String value1, String value2) {
            addCriterion("e27 not between", value1, value2, "e27");
            return (Criteria) this;
        }

        public Criteria andF01IsNull() {
            addCriterion("f01 is null");
            return (Criteria) this;
        }

        public Criteria andF01IsNotNull() {
            addCriterion("f01 is not null");
            return (Criteria) this;
        }

        public Criteria andF01EqualTo(String value) {
            addCriterion("f01 =", value, "f01");
            return (Criteria) this;
        }

        public Criteria andF01NotEqualTo(String value) {
            addCriterion("f01 <>", value, "f01");
            return (Criteria) this;
        }

        public Criteria andF01GreaterThan(String value) {
            addCriterion("f01 >", value, "f01");
            return (Criteria) this;
        }

        public Criteria andF01GreaterThanOrEqualTo(String value) {
            addCriterion("f01 >=", value, "f01");
            return (Criteria) this;
        }

        public Criteria andF01LessThan(String value) {
            addCriterion("f01 <", value, "f01");
            return (Criteria) this;
        }

        public Criteria andF01LessThanOrEqualTo(String value) {
            addCriterion("f01 <=", value, "f01");
            return (Criteria) this;
        }

        public Criteria andF01Like(String value) {
            addCriterion("f01 like", value, "f01");
            return (Criteria) this;
        }

        public Criteria andF01NotLike(String value) {
            addCriterion("f01 not like", value, "f01");
            return (Criteria) this;
        }

        public Criteria andF01In(List<String> values) {
            addCriterion("f01 in", values, "f01");
            return (Criteria) this;
        }

        public Criteria andF01NotIn(List<String> values) {
            addCriterion("f01 not in", values, "f01");
            return (Criteria) this;
        }

        public Criteria andF01Between(String value1, String value2) {
            addCriterion("f01 between", value1, value2, "f01");
            return (Criteria) this;
        }

        public Criteria andF01NotBetween(String value1, String value2) {
            addCriterion("f01 not between", value1, value2, "f01");
            return (Criteria) this;
        }

        public Criteria andF02IsNull() {
            addCriterion("f02 is null");
            return (Criteria) this;
        }

        public Criteria andF02IsNotNull() {
            addCriterion("f02 is not null");
            return (Criteria) this;
        }

        public Criteria andF02EqualTo(String value) {
            addCriterion("f02 =", value, "f02");
            return (Criteria) this;
        }

        public Criteria andF02NotEqualTo(String value) {
            addCriterion("f02 <>", value, "f02");
            return (Criteria) this;
        }

        public Criteria andF02GreaterThan(String value) {
            addCriterion("f02 >", value, "f02");
            return (Criteria) this;
        }

        public Criteria andF02GreaterThanOrEqualTo(String value) {
            addCriterion("f02 >=", value, "f02");
            return (Criteria) this;
        }

        public Criteria andF02LessThan(String value) {
            addCriterion("f02 <", value, "f02");
            return (Criteria) this;
        }

        public Criteria andF02LessThanOrEqualTo(String value) {
            addCriterion("f02 <=", value, "f02");
            return (Criteria) this;
        }

        public Criteria andF02Like(String value) {
            addCriterion("f02 like", value, "f02");
            return (Criteria) this;
        }

        public Criteria andF02NotLike(String value) {
            addCriterion("f02 not like", value, "f02");
            return (Criteria) this;
        }

        public Criteria andF02In(List<String> values) {
            addCriterion("f02 in", values, "f02");
            return (Criteria) this;
        }

        public Criteria andF02NotIn(List<String> values) {
            addCriterion("f02 not in", values, "f02");
            return (Criteria) this;
        }

        public Criteria andF02Between(String value1, String value2) {
            addCriterion("f02 between", value1, value2, "f02");
            return (Criteria) this;
        }

        public Criteria andF02NotBetween(String value1, String value2) {
            addCriterion("f02 not between", value1, value2, "f02");
            return (Criteria) this;
        }

        public Criteria andF03IsNull() {
            addCriterion("f03 is null");
            return (Criteria) this;
        }

        public Criteria andF03IsNotNull() {
            addCriterion("f03 is not null");
            return (Criteria) this;
        }

        public Criteria andF03EqualTo(String value) {
            addCriterion("f03 =", value, "f03");
            return (Criteria) this;
        }

        public Criteria andF03NotEqualTo(String value) {
            addCriterion("f03 <>", value, "f03");
            return (Criteria) this;
        }

        public Criteria andF03GreaterThan(String value) {
            addCriterion("f03 >", value, "f03");
            return (Criteria) this;
        }

        public Criteria andF03GreaterThanOrEqualTo(String value) {
            addCriterion("f03 >=", value, "f03");
            return (Criteria) this;
        }

        public Criteria andF03LessThan(String value) {
            addCriterion("f03 <", value, "f03");
            return (Criteria) this;
        }

        public Criteria andF03LessThanOrEqualTo(String value) {
            addCriterion("f03 <=", value, "f03");
            return (Criteria) this;
        }

        public Criteria andF03Like(String value) {
            addCriterion("f03 like", value, "f03");
            return (Criteria) this;
        }

        public Criteria andF03NotLike(String value) {
            addCriterion("f03 not like", value, "f03");
            return (Criteria) this;
        }

        public Criteria andF03In(List<String> values) {
            addCriterion("f03 in", values, "f03");
            return (Criteria) this;
        }

        public Criteria andF03NotIn(List<String> values) {
            addCriterion("f03 not in", values, "f03");
            return (Criteria) this;
        }

        public Criteria andF03Between(String value1, String value2) {
            addCriterion("f03 between", value1, value2, "f03");
            return (Criteria) this;
        }

        public Criteria andF03NotBetween(String value1, String value2) {
            addCriterion("f03 not between", value1, value2, "f03");
            return (Criteria) this;
        }

        public Criteria andF04IsNull() {
            addCriterion("f04 is null");
            return (Criteria) this;
        }

        public Criteria andF04IsNotNull() {
            addCriterion("f04 is not null");
            return (Criteria) this;
        }

        public Criteria andF04EqualTo(String value) {
            addCriterion("f04 =", value, "f04");
            return (Criteria) this;
        }

        public Criteria andF04NotEqualTo(String value) {
            addCriterion("f04 <>", value, "f04");
            return (Criteria) this;
        }

        public Criteria andF04GreaterThan(String value) {
            addCriterion("f04 >", value, "f04");
            return (Criteria) this;
        }

        public Criteria andF04GreaterThanOrEqualTo(String value) {
            addCriterion("f04 >=", value, "f04");
            return (Criteria) this;
        }

        public Criteria andF04LessThan(String value) {
            addCriterion("f04 <", value, "f04");
            return (Criteria) this;
        }

        public Criteria andF04LessThanOrEqualTo(String value) {
            addCriterion("f04 <=", value, "f04");
            return (Criteria) this;
        }

        public Criteria andF04Like(String value) {
            addCriterion("f04 like", value, "f04");
            return (Criteria) this;
        }

        public Criteria andF04NotLike(String value) {
            addCriterion("f04 not like", value, "f04");
            return (Criteria) this;
        }

        public Criteria andF04In(List<String> values) {
            addCriterion("f04 in", values, "f04");
            return (Criteria) this;
        }

        public Criteria andF04NotIn(List<String> values) {
            addCriterion("f04 not in", values, "f04");
            return (Criteria) this;
        }

        public Criteria andF04Between(String value1, String value2) {
            addCriterion("f04 between", value1, value2, "f04");
            return (Criteria) this;
        }

        public Criteria andF04NotBetween(String value1, String value2) {
            addCriterion("f04 not between", value1, value2, "f04");
            return (Criteria) this;
        }

        public Criteria andF05IsNull() {
            addCriterion("f05 is null");
            return (Criteria) this;
        }

        public Criteria andF05IsNotNull() {
            addCriterion("f05 is not null");
            return (Criteria) this;
        }

        public Criteria andF05EqualTo(String value) {
            addCriterion("f05 =", value, "f05");
            return (Criteria) this;
        }

        public Criteria andF05NotEqualTo(String value) {
            addCriterion("f05 <>", value, "f05");
            return (Criteria) this;
        }

        public Criteria andF05GreaterThan(String value) {
            addCriterion("f05 >", value, "f05");
            return (Criteria) this;
        }

        public Criteria andF05GreaterThanOrEqualTo(String value) {
            addCriterion("f05 >=", value, "f05");
            return (Criteria) this;
        }

        public Criteria andF05LessThan(String value) {
            addCriterion("f05 <", value, "f05");
            return (Criteria) this;
        }

        public Criteria andF05LessThanOrEqualTo(String value) {
            addCriterion("f05 <=", value, "f05");
            return (Criteria) this;
        }

        public Criteria andF05Like(String value) {
            addCriterion("f05 like", value, "f05");
            return (Criteria) this;
        }

        public Criteria andF05NotLike(String value) {
            addCriterion("f05 not like", value, "f05");
            return (Criteria) this;
        }

        public Criteria andF05In(List<String> values) {
            addCriterion("f05 in", values, "f05");
            return (Criteria) this;
        }

        public Criteria andF05NotIn(List<String> values) {
            addCriterion("f05 not in", values, "f05");
            return (Criteria) this;
        }

        public Criteria andF05Between(String value1, String value2) {
            addCriterion("f05 between", value1, value2, "f05");
            return (Criteria) this;
        }

        public Criteria andF05NotBetween(String value1, String value2) {
            addCriterion("f05 not between", value1, value2, "f05");
            return (Criteria) this;
        }

        public Criteria andF06IsNull() {
            addCriterion("f06 is null");
            return (Criteria) this;
        }

        public Criteria andF06IsNotNull() {
            addCriterion("f06 is not null");
            return (Criteria) this;
        }

        public Criteria andF06EqualTo(String value) {
            addCriterion("f06 =", value, "f06");
            return (Criteria) this;
        }

        public Criteria andF06NotEqualTo(String value) {
            addCriterion("f06 <>", value, "f06");
            return (Criteria) this;
        }

        public Criteria andF06GreaterThan(String value) {
            addCriterion("f06 >", value, "f06");
            return (Criteria) this;
        }

        public Criteria andF06GreaterThanOrEqualTo(String value) {
            addCriterion("f06 >=", value, "f06");
            return (Criteria) this;
        }

        public Criteria andF06LessThan(String value) {
            addCriterion("f06 <", value, "f06");
            return (Criteria) this;
        }

        public Criteria andF06LessThanOrEqualTo(String value) {
            addCriterion("f06 <=", value, "f06");
            return (Criteria) this;
        }

        public Criteria andF06Like(String value) {
            addCriterion("f06 like", value, "f06");
            return (Criteria) this;
        }

        public Criteria andF06NotLike(String value) {
            addCriterion("f06 not like", value, "f06");
            return (Criteria) this;
        }

        public Criteria andF06In(List<String> values) {
            addCriterion("f06 in", values, "f06");
            return (Criteria) this;
        }

        public Criteria andF06NotIn(List<String> values) {
            addCriterion("f06 not in", values, "f06");
            return (Criteria) this;
        }

        public Criteria andF06Between(String value1, String value2) {
            addCriterion("f06 between", value1, value2, "f06");
            return (Criteria) this;
        }

        public Criteria andF06NotBetween(String value1, String value2) {
            addCriterion("f06 not between", value1, value2, "f06");
            return (Criteria) this;
        }

        public Criteria andF07IsNull() {
            addCriterion("f07 is null");
            return (Criteria) this;
        }

        public Criteria andF07IsNotNull() {
            addCriterion("f07 is not null");
            return (Criteria) this;
        }

        public Criteria andF07EqualTo(String value) {
            addCriterion("f07 =", value, "f07");
            return (Criteria) this;
        }

        public Criteria andF07NotEqualTo(String value) {
            addCriterion("f07 <>", value, "f07");
            return (Criteria) this;
        }

        public Criteria andF07GreaterThan(String value) {
            addCriterion("f07 >", value, "f07");
            return (Criteria) this;
        }

        public Criteria andF07GreaterThanOrEqualTo(String value) {
            addCriterion("f07 >=", value, "f07");
            return (Criteria) this;
        }

        public Criteria andF07LessThan(String value) {
            addCriterion("f07 <", value, "f07");
            return (Criteria) this;
        }

        public Criteria andF07LessThanOrEqualTo(String value) {
            addCriterion("f07 <=", value, "f07");
            return (Criteria) this;
        }

        public Criteria andF07Like(String value) {
            addCriterion("f07 like", value, "f07");
            return (Criteria) this;
        }

        public Criteria andF07NotLike(String value) {
            addCriterion("f07 not like", value, "f07");
            return (Criteria) this;
        }

        public Criteria andF07In(List<String> values) {
            addCriterion("f07 in", values, "f07");
            return (Criteria) this;
        }

        public Criteria andF07NotIn(List<String> values) {
            addCriterion("f07 not in", values, "f07");
            return (Criteria) this;
        }

        public Criteria andF07Between(String value1, String value2) {
            addCriterion("f07 between", value1, value2, "f07");
            return (Criteria) this;
        }

        public Criteria andF07NotBetween(String value1, String value2) {
            addCriterion("f07 not between", value1, value2, "f07");
            return (Criteria) this;
        }

        public Criteria andF08IsNull() {
            addCriterion("f08 is null");
            return (Criteria) this;
        }

        public Criteria andF08IsNotNull() {
            addCriterion("f08 is not null");
            return (Criteria) this;
        }

        public Criteria andF08EqualTo(String value) {
            addCriterion("f08 =", value, "f08");
            return (Criteria) this;
        }

        public Criteria andF08NotEqualTo(String value) {
            addCriterion("f08 <>", value, "f08");
            return (Criteria) this;
        }

        public Criteria andF08GreaterThan(String value) {
            addCriterion("f08 >", value, "f08");
            return (Criteria) this;
        }

        public Criteria andF08GreaterThanOrEqualTo(String value) {
            addCriterion("f08 >=", value, "f08");
            return (Criteria) this;
        }

        public Criteria andF08LessThan(String value) {
            addCriterion("f08 <", value, "f08");
            return (Criteria) this;
        }

        public Criteria andF08LessThanOrEqualTo(String value) {
            addCriterion("f08 <=", value, "f08");
            return (Criteria) this;
        }

        public Criteria andF08Like(String value) {
            addCriterion("f08 like", value, "f08");
            return (Criteria) this;
        }

        public Criteria andF08NotLike(String value) {
            addCriterion("f08 not like", value, "f08");
            return (Criteria) this;
        }

        public Criteria andF08In(List<String> values) {
            addCriterion("f08 in", values, "f08");
            return (Criteria) this;
        }

        public Criteria andF08NotIn(List<String> values) {
            addCriterion("f08 not in", values, "f08");
            return (Criteria) this;
        }

        public Criteria andF08Between(String value1, String value2) {
            addCriterion("f08 between", value1, value2, "f08");
            return (Criteria) this;
        }

        public Criteria andF08NotBetween(String value1, String value2) {
            addCriterion("f08 not between", value1, value2, "f08");
            return (Criteria) this;
        }

        public Criteria andF09IsNull() {
            addCriterion("f09 is null");
            return (Criteria) this;
        }

        public Criteria andF09IsNotNull() {
            addCriterion("f09 is not null");
            return (Criteria) this;
        }

        public Criteria andF09EqualTo(String value) {
            addCriterion("f09 =", value, "f09");
            return (Criteria) this;
        }

        public Criteria andF09NotEqualTo(String value) {
            addCriterion("f09 <>", value, "f09");
            return (Criteria) this;
        }

        public Criteria andF09GreaterThan(String value) {
            addCriterion("f09 >", value, "f09");
            return (Criteria) this;
        }

        public Criteria andF09GreaterThanOrEqualTo(String value) {
            addCriterion("f09 >=", value, "f09");
            return (Criteria) this;
        }

        public Criteria andF09LessThan(String value) {
            addCriterion("f09 <", value, "f09");
            return (Criteria) this;
        }

        public Criteria andF09LessThanOrEqualTo(String value) {
            addCriterion("f09 <=", value, "f09");
            return (Criteria) this;
        }

        public Criteria andF09Like(String value) {
            addCriterion("f09 like", value, "f09");
            return (Criteria) this;
        }

        public Criteria andF09NotLike(String value) {
            addCriterion("f09 not like", value, "f09");
            return (Criteria) this;
        }

        public Criteria andF09In(List<String> values) {
            addCriterion("f09 in", values, "f09");
            return (Criteria) this;
        }

        public Criteria andF09NotIn(List<String> values) {
            addCriterion("f09 not in", values, "f09");
            return (Criteria) this;
        }

        public Criteria andF09Between(String value1, String value2) {
            addCriterion("f09 between", value1, value2, "f09");
            return (Criteria) this;
        }

        public Criteria andF09NotBetween(String value1, String value2) {
            addCriterion("f09 not between", value1, value2, "f09");
            return (Criteria) this;
        }

        public Criteria andF10IsNull() {
            addCriterion("f10 is null");
            return (Criteria) this;
        }

        public Criteria andF10IsNotNull() {
            addCriterion("f10 is not null");
            return (Criteria) this;
        }

        public Criteria andF10EqualTo(String value) {
            addCriterion("f10 =", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotEqualTo(String value) {
            addCriterion("f10 <>", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10GreaterThan(String value) {
            addCriterion("f10 >", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10GreaterThanOrEqualTo(String value) {
            addCriterion("f10 >=", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10LessThan(String value) {
            addCriterion("f10 <", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10LessThanOrEqualTo(String value) {
            addCriterion("f10 <=", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10Like(String value) {
            addCriterion("f10 like", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotLike(String value) {
            addCriterion("f10 not like", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10In(List<String> values) {
            addCriterion("f10 in", values, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotIn(List<String> values) {
            addCriterion("f10 not in", values, "f10");
            return (Criteria) this;
        }

        public Criteria andF10Between(String value1, String value2) {
            addCriterion("f10 between", value1, value2, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotBetween(String value1, String value2) {
            addCriterion("f10 not between", value1, value2, "f10");
            return (Criteria) this;
        }

        public Criteria andF11IsNull() {
            addCriterion("f11 is null");
            return (Criteria) this;
        }

        public Criteria andF11IsNotNull() {
            addCriterion("f11 is not null");
            return (Criteria) this;
        }

        public Criteria andF11EqualTo(String value) {
            addCriterion("f11 =", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotEqualTo(String value) {
            addCriterion("f11 <>", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11GreaterThan(String value) {
            addCriterion("f11 >", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11GreaterThanOrEqualTo(String value) {
            addCriterion("f11 >=", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11LessThan(String value) {
            addCriterion("f11 <", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11LessThanOrEqualTo(String value) {
            addCriterion("f11 <=", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11Like(String value) {
            addCriterion("f11 like", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotLike(String value) {
            addCriterion("f11 not like", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11In(List<String> values) {
            addCriterion("f11 in", values, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotIn(List<String> values) {
            addCriterion("f11 not in", values, "f11");
            return (Criteria) this;
        }

        public Criteria andF11Between(String value1, String value2) {
            addCriterion("f11 between", value1, value2, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotBetween(String value1, String value2) {
            addCriterion("f11 not between", value1, value2, "f11");
            return (Criteria) this;
        }

        public Criteria andF12IsNull() {
            addCriterion("f12 is null");
            return (Criteria) this;
        }

        public Criteria andF12IsNotNull() {
            addCriterion("f12 is not null");
            return (Criteria) this;
        }

        public Criteria andF12EqualTo(String value) {
            addCriterion("f12 =", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12NotEqualTo(String value) {
            addCriterion("f12 <>", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12GreaterThan(String value) {
            addCriterion("f12 >", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12GreaterThanOrEqualTo(String value) {
            addCriterion("f12 >=", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12LessThan(String value) {
            addCriterion("f12 <", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12LessThanOrEqualTo(String value) {
            addCriterion("f12 <=", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12Like(String value) {
            addCriterion("f12 like", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12NotLike(String value) {
            addCriterion("f12 not like", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12In(List<String> values) {
            addCriterion("f12 in", values, "f12");
            return (Criteria) this;
        }

        public Criteria andF12NotIn(List<String> values) {
            addCriterion("f12 not in", values, "f12");
            return (Criteria) this;
        }

        public Criteria andF12Between(String value1, String value2) {
            addCriterion("f12 between", value1, value2, "f12");
            return (Criteria) this;
        }

        public Criteria andF12NotBetween(String value1, String value2) {
            addCriterion("f12 not between", value1, value2, "f12");
            return (Criteria) this;
        }

        public Criteria andF13IsNull() {
            addCriterion("f13 is null");
            return (Criteria) this;
        }

        public Criteria andF13IsNotNull() {
            addCriterion("f13 is not null");
            return (Criteria) this;
        }

        public Criteria andF13EqualTo(String value) {
            addCriterion("f13 =", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13NotEqualTo(String value) {
            addCriterion("f13 <>", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13GreaterThan(String value) {
            addCriterion("f13 >", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13GreaterThanOrEqualTo(String value) {
            addCriterion("f13 >=", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13LessThan(String value) {
            addCriterion("f13 <", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13LessThanOrEqualTo(String value) {
            addCriterion("f13 <=", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13Like(String value) {
            addCriterion("f13 like", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13NotLike(String value) {
            addCriterion("f13 not like", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13In(List<String> values) {
            addCriterion("f13 in", values, "f13");
            return (Criteria) this;
        }

        public Criteria andF13NotIn(List<String> values) {
            addCriterion("f13 not in", values, "f13");
            return (Criteria) this;
        }

        public Criteria andF13Between(String value1, String value2) {
            addCriterion("f13 between", value1, value2, "f13");
            return (Criteria) this;
        }

        public Criteria andF13NotBetween(String value1, String value2) {
            addCriterion("f13 not between", value1, value2, "f13");
            return (Criteria) this;
        }

        public Criteria andF14IsNull() {
            addCriterion("f14 is null");
            return (Criteria) this;
        }

        public Criteria andF14IsNotNull() {
            addCriterion("f14 is not null");
            return (Criteria) this;
        }

        public Criteria andF14EqualTo(String value) {
            addCriterion("f14 =", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14NotEqualTo(String value) {
            addCriterion("f14 <>", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14GreaterThan(String value) {
            addCriterion("f14 >", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14GreaterThanOrEqualTo(String value) {
            addCriterion("f14 >=", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14LessThan(String value) {
            addCriterion("f14 <", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14LessThanOrEqualTo(String value) {
            addCriterion("f14 <=", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14Like(String value) {
            addCriterion("f14 like", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14NotLike(String value) {
            addCriterion("f14 not like", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14In(List<String> values) {
            addCriterion("f14 in", values, "f14");
            return (Criteria) this;
        }

        public Criteria andF14NotIn(List<String> values) {
            addCriterion("f14 not in", values, "f14");
            return (Criteria) this;
        }

        public Criteria andF14Between(String value1, String value2) {
            addCriterion("f14 between", value1, value2, "f14");
            return (Criteria) this;
        }

        public Criteria andF14NotBetween(String value1, String value2) {
            addCriterion("f14 not between", value1, value2, "f14");
            return (Criteria) this;
        }

        public Criteria andF15IsNull() {
            addCriterion("f15 is null");
            return (Criteria) this;
        }

        public Criteria andF15IsNotNull() {
            addCriterion("f15 is not null");
            return (Criteria) this;
        }

        public Criteria andF15EqualTo(String value) {
            addCriterion("f15 =", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15NotEqualTo(String value) {
            addCriterion("f15 <>", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15GreaterThan(String value) {
            addCriterion("f15 >", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15GreaterThanOrEqualTo(String value) {
            addCriterion("f15 >=", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15LessThan(String value) {
            addCriterion("f15 <", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15LessThanOrEqualTo(String value) {
            addCriterion("f15 <=", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15Like(String value) {
            addCriterion("f15 like", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15NotLike(String value) {
            addCriterion("f15 not like", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15In(List<String> values) {
            addCriterion("f15 in", values, "f15");
            return (Criteria) this;
        }

        public Criteria andF15NotIn(List<String> values) {
            addCriterion("f15 not in", values, "f15");
            return (Criteria) this;
        }

        public Criteria andF15Between(String value1, String value2) {
            addCriterion("f15 between", value1, value2, "f15");
            return (Criteria) this;
        }

        public Criteria andF15NotBetween(String value1, String value2) {
            addCriterion("f15 not between", value1, value2, "f15");
            return (Criteria) this;
        }

        public Criteria andF16IsNull() {
            addCriterion("f16 is null");
            return (Criteria) this;
        }

        public Criteria andF16IsNotNull() {
            addCriterion("f16 is not null");
            return (Criteria) this;
        }

        public Criteria andF16EqualTo(String value) {
            addCriterion("f16 =", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16NotEqualTo(String value) {
            addCriterion("f16 <>", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16GreaterThan(String value) {
            addCriterion("f16 >", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16GreaterThanOrEqualTo(String value) {
            addCriterion("f16 >=", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16LessThan(String value) {
            addCriterion("f16 <", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16LessThanOrEqualTo(String value) {
            addCriterion("f16 <=", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16Like(String value) {
            addCriterion("f16 like", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16NotLike(String value) {
            addCriterion("f16 not like", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16In(List<String> values) {
            addCriterion("f16 in", values, "f16");
            return (Criteria) this;
        }

        public Criteria andF16NotIn(List<String> values) {
            addCriterion("f16 not in", values, "f16");
            return (Criteria) this;
        }

        public Criteria andF16Between(String value1, String value2) {
            addCriterion("f16 between", value1, value2, "f16");
            return (Criteria) this;
        }

        public Criteria andF16NotBetween(String value1, String value2) {
            addCriterion("f16 not between", value1, value2, "f16");
            return (Criteria) this;
        }

        public Criteria andF17IsNull() {
            addCriterion("f17 is null");
            return (Criteria) this;
        }

        public Criteria andF17IsNotNull() {
            addCriterion("f17 is not null");
            return (Criteria) this;
        }

        public Criteria andF17EqualTo(String value) {
            addCriterion("f17 =", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17NotEqualTo(String value) {
            addCriterion("f17 <>", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17GreaterThan(String value) {
            addCriterion("f17 >", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17GreaterThanOrEqualTo(String value) {
            addCriterion("f17 >=", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17LessThan(String value) {
            addCriterion("f17 <", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17LessThanOrEqualTo(String value) {
            addCriterion("f17 <=", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17Like(String value) {
            addCriterion("f17 like", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17NotLike(String value) {
            addCriterion("f17 not like", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17In(List<String> values) {
            addCriterion("f17 in", values, "f17");
            return (Criteria) this;
        }

        public Criteria andF17NotIn(List<String> values) {
            addCriterion("f17 not in", values, "f17");
            return (Criteria) this;
        }

        public Criteria andF17Between(String value1, String value2) {
            addCriterion("f17 between", value1, value2, "f17");
            return (Criteria) this;
        }

        public Criteria andF17NotBetween(String value1, String value2) {
            addCriterion("f17 not between", value1, value2, "f17");
            return (Criteria) this;
        }

        public Criteria andF18IsNull() {
            addCriterion("f18 is null");
            return (Criteria) this;
        }

        public Criteria andF18IsNotNull() {
            addCriterion("f18 is not null");
            return (Criteria) this;
        }

        public Criteria andF18EqualTo(String value) {
            addCriterion("f18 =", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18NotEqualTo(String value) {
            addCriterion("f18 <>", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18GreaterThan(String value) {
            addCriterion("f18 >", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18GreaterThanOrEqualTo(String value) {
            addCriterion("f18 >=", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18LessThan(String value) {
            addCriterion("f18 <", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18LessThanOrEqualTo(String value) {
            addCriterion("f18 <=", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18Like(String value) {
            addCriterion("f18 like", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18NotLike(String value) {
            addCriterion("f18 not like", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18In(List<String> values) {
            addCriterion("f18 in", values, "f18");
            return (Criteria) this;
        }

        public Criteria andF18NotIn(List<String> values) {
            addCriterion("f18 not in", values, "f18");
            return (Criteria) this;
        }

        public Criteria andF18Between(String value1, String value2) {
            addCriterion("f18 between", value1, value2, "f18");
            return (Criteria) this;
        }

        public Criteria andF18NotBetween(String value1, String value2) {
            addCriterion("f18 not between", value1, value2, "f18");
            return (Criteria) this;
        }

        public Criteria andF19IsNull() {
            addCriterion("f19 is null");
            return (Criteria) this;
        }

        public Criteria andF19IsNotNull() {
            addCriterion("f19 is not null");
            return (Criteria) this;
        }

        public Criteria andF19EqualTo(String value) {
            addCriterion("f19 =", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19NotEqualTo(String value) {
            addCriterion("f19 <>", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19GreaterThan(String value) {
            addCriterion("f19 >", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19GreaterThanOrEqualTo(String value) {
            addCriterion("f19 >=", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19LessThan(String value) {
            addCriterion("f19 <", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19LessThanOrEqualTo(String value) {
            addCriterion("f19 <=", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19Like(String value) {
            addCriterion("f19 like", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19NotLike(String value) {
            addCriterion("f19 not like", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19In(List<String> values) {
            addCriterion("f19 in", values, "f19");
            return (Criteria) this;
        }

        public Criteria andF19NotIn(List<String> values) {
            addCriterion("f19 not in", values, "f19");
            return (Criteria) this;
        }

        public Criteria andF19Between(String value1, String value2) {
            addCriterion("f19 between", value1, value2, "f19");
            return (Criteria) this;
        }

        public Criteria andF19NotBetween(String value1, String value2) {
            addCriterion("f19 not between", value1, value2, "f19");
            return (Criteria) this;
        }

        public Criteria andF20IsNull() {
            addCriterion("f20 is null");
            return (Criteria) this;
        }

        public Criteria andF20IsNotNull() {
            addCriterion("f20 is not null");
            return (Criteria) this;
        }

        public Criteria andF20EqualTo(String value) {
            addCriterion("f20 =", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20NotEqualTo(String value) {
            addCriterion("f20 <>", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20GreaterThan(String value) {
            addCriterion("f20 >", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20GreaterThanOrEqualTo(String value) {
            addCriterion("f20 >=", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20LessThan(String value) {
            addCriterion("f20 <", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20LessThanOrEqualTo(String value) {
            addCriterion("f20 <=", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20Like(String value) {
            addCriterion("f20 like", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20NotLike(String value) {
            addCriterion("f20 not like", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20In(List<String> values) {
            addCriterion("f20 in", values, "f20");
            return (Criteria) this;
        }

        public Criteria andF20NotIn(List<String> values) {
            addCriterion("f20 not in", values, "f20");
            return (Criteria) this;
        }

        public Criteria andF20Between(String value1, String value2) {
            addCriterion("f20 between", value1, value2, "f20");
            return (Criteria) this;
        }

        public Criteria andF20NotBetween(String value1, String value2) {
            addCriterion("f20 not between", value1, value2, "f20");
            return (Criteria) this;
        }

        public Criteria andF21IsNull() {
            addCriterion("f21 is null");
            return (Criteria) this;
        }

        public Criteria andF21IsNotNull() {
            addCriterion("f21 is not null");
            return (Criteria) this;
        }

        public Criteria andF21EqualTo(String value) {
            addCriterion("f21 =", value, "f21");
            return (Criteria) this;
        }

        public Criteria andF21NotEqualTo(String value) {
            addCriterion("f21 <>", value, "f21");
            return (Criteria) this;
        }

        public Criteria andF21GreaterThan(String value) {
            addCriterion("f21 >", value, "f21");
            return (Criteria) this;
        }

        public Criteria andF21GreaterThanOrEqualTo(String value) {
            addCriterion("f21 >=", value, "f21");
            return (Criteria) this;
        }

        public Criteria andF21LessThan(String value) {
            addCriterion("f21 <", value, "f21");
            return (Criteria) this;
        }

        public Criteria andF21LessThanOrEqualTo(String value) {
            addCriterion("f21 <=", value, "f21");
            return (Criteria) this;
        }

        public Criteria andF21Like(String value) {
            addCriterion("f21 like", value, "f21");
            return (Criteria) this;
        }

        public Criteria andF21NotLike(String value) {
            addCriterion("f21 not like", value, "f21");
            return (Criteria) this;
        }

        public Criteria andF21In(List<String> values) {
            addCriterion("f21 in", values, "f21");
            return (Criteria) this;
        }

        public Criteria andF21NotIn(List<String> values) {
            addCriterion("f21 not in", values, "f21");
            return (Criteria) this;
        }

        public Criteria andF21Between(String value1, String value2) {
            addCriterion("f21 between", value1, value2, "f21");
            return (Criteria) this;
        }

        public Criteria andF21NotBetween(String value1, String value2) {
            addCriterion("f21 not between", value1, value2, "f21");
            return (Criteria) this;
        }

        public Criteria andF22IsNull() {
            addCriterion("f22 is null");
            return (Criteria) this;
        }

        public Criteria andF22IsNotNull() {
            addCriterion("f22 is not null");
            return (Criteria) this;
        }

        public Criteria andF22EqualTo(String value) {
            addCriterion("f22 =", value, "f22");
            return (Criteria) this;
        }

        public Criteria andF22NotEqualTo(String value) {
            addCriterion("f22 <>", value, "f22");
            return (Criteria) this;
        }

        public Criteria andF22GreaterThan(String value) {
            addCriterion("f22 >", value, "f22");
            return (Criteria) this;
        }

        public Criteria andF22GreaterThanOrEqualTo(String value) {
            addCriterion("f22 >=", value, "f22");
            return (Criteria) this;
        }

        public Criteria andF22LessThan(String value) {
            addCriterion("f22 <", value, "f22");
            return (Criteria) this;
        }

        public Criteria andF22LessThanOrEqualTo(String value) {
            addCriterion("f22 <=", value, "f22");
            return (Criteria) this;
        }

        public Criteria andF22Like(String value) {
            addCriterion("f22 like", value, "f22");
            return (Criteria) this;
        }

        public Criteria andF22NotLike(String value) {
            addCriterion("f22 not like", value, "f22");
            return (Criteria) this;
        }

        public Criteria andF22In(List<String> values) {
            addCriterion("f22 in", values, "f22");
            return (Criteria) this;
        }

        public Criteria andF22NotIn(List<String> values) {
            addCriterion("f22 not in", values, "f22");
            return (Criteria) this;
        }

        public Criteria andF22Between(String value1, String value2) {
            addCriterion("f22 between", value1, value2, "f22");
            return (Criteria) this;
        }

        public Criteria andF22NotBetween(String value1, String value2) {
            addCriterion("f22 not between", value1, value2, "f22");
            return (Criteria) this;
        }

        public Criteria andF23IsNull() {
            addCriterion("f23 is null");
            return (Criteria) this;
        }

        public Criteria andF23IsNotNull() {
            addCriterion("f23 is not null");
            return (Criteria) this;
        }

        public Criteria andF23EqualTo(String value) {
            addCriterion("f23 =", value, "f23");
            return (Criteria) this;
        }

        public Criteria andF23NotEqualTo(String value) {
            addCriterion("f23 <>", value, "f23");
            return (Criteria) this;
        }

        public Criteria andF23GreaterThan(String value) {
            addCriterion("f23 >", value, "f23");
            return (Criteria) this;
        }

        public Criteria andF23GreaterThanOrEqualTo(String value) {
            addCriterion("f23 >=", value, "f23");
            return (Criteria) this;
        }

        public Criteria andF23LessThan(String value) {
            addCriterion("f23 <", value, "f23");
            return (Criteria) this;
        }

        public Criteria andF23LessThanOrEqualTo(String value) {
            addCriterion("f23 <=", value, "f23");
            return (Criteria) this;
        }

        public Criteria andF23Like(String value) {
            addCriterion("f23 like", value, "f23");
            return (Criteria) this;
        }

        public Criteria andF23NotLike(String value) {
            addCriterion("f23 not like", value, "f23");
            return (Criteria) this;
        }

        public Criteria andF23In(List<String> values) {
            addCriterion("f23 in", values, "f23");
            return (Criteria) this;
        }

        public Criteria andF23NotIn(List<String> values) {
            addCriterion("f23 not in", values, "f23");
            return (Criteria) this;
        }

        public Criteria andF23Between(String value1, String value2) {
            addCriterion("f23 between", value1, value2, "f23");
            return (Criteria) this;
        }

        public Criteria andF23NotBetween(String value1, String value2) {
            addCriterion("f23 not between", value1, value2, "f23");
            return (Criteria) this;
        }

        public Criteria andG01IsNull() {
            addCriterion("g01 is null");
            return (Criteria) this;
        }

        public Criteria andG01IsNotNull() {
            addCriterion("g01 is not null");
            return (Criteria) this;
        }

        public Criteria andG01EqualTo(String value) {
            addCriterion("g01 =", value, "g01");
            return (Criteria) this;
        }

        public Criteria andG01NotEqualTo(String value) {
            addCriterion("g01 <>", value, "g01");
            return (Criteria) this;
        }

        public Criteria andG01GreaterThan(String value) {
            addCriterion("g01 >", value, "g01");
            return (Criteria) this;
        }

        public Criteria andG01GreaterThanOrEqualTo(String value) {
            addCriterion("g01 >=", value, "g01");
            return (Criteria) this;
        }

        public Criteria andG01LessThan(String value) {
            addCriterion("g01 <", value, "g01");
            return (Criteria) this;
        }

        public Criteria andG01LessThanOrEqualTo(String value) {
            addCriterion("g01 <=", value, "g01");
            return (Criteria) this;
        }

        public Criteria andG01Like(String value) {
            addCriterion("g01 like", value, "g01");
            return (Criteria) this;
        }

        public Criteria andG01NotLike(String value) {
            addCriterion("g01 not like", value, "g01");
            return (Criteria) this;
        }

        public Criteria andG01In(List<String> values) {
            addCriterion("g01 in", values, "g01");
            return (Criteria) this;
        }

        public Criteria andG01NotIn(List<String> values) {
            addCriterion("g01 not in", values, "g01");
            return (Criteria) this;
        }

        public Criteria andG01Between(String value1, String value2) {
            addCriterion("g01 between", value1, value2, "g01");
            return (Criteria) this;
        }

        public Criteria andG01NotBetween(String value1, String value2) {
            addCriterion("g01 not between", value1, value2, "g01");
            return (Criteria) this;
        }

        public Criteria andG02IsNull() {
            addCriterion("g02 is null");
            return (Criteria) this;
        }

        public Criteria andG02IsNotNull() {
            addCriterion("g02 is not null");
            return (Criteria) this;
        }

        public Criteria andG02EqualTo(String value) {
            addCriterion("g02 =", value, "g02");
            return (Criteria) this;
        }

        public Criteria andG02NotEqualTo(String value) {
            addCriterion("g02 <>", value, "g02");
            return (Criteria) this;
        }

        public Criteria andG02GreaterThan(String value) {
            addCriterion("g02 >", value, "g02");
            return (Criteria) this;
        }

        public Criteria andG02GreaterThanOrEqualTo(String value) {
            addCriterion("g02 >=", value, "g02");
            return (Criteria) this;
        }

        public Criteria andG02LessThan(String value) {
            addCriterion("g02 <", value, "g02");
            return (Criteria) this;
        }

        public Criteria andG02LessThanOrEqualTo(String value) {
            addCriterion("g02 <=", value, "g02");
            return (Criteria) this;
        }

        public Criteria andG02Like(String value) {
            addCriterion("g02 like", value, "g02");
            return (Criteria) this;
        }

        public Criteria andG02NotLike(String value) {
            addCriterion("g02 not like", value, "g02");
            return (Criteria) this;
        }

        public Criteria andG02In(List<String> values) {
            addCriterion("g02 in", values, "g02");
            return (Criteria) this;
        }

        public Criteria andG02NotIn(List<String> values) {
            addCriterion("g02 not in", values, "g02");
            return (Criteria) this;
        }

        public Criteria andG02Between(String value1, String value2) {
            addCriterion("g02 between", value1, value2, "g02");
            return (Criteria) this;
        }

        public Criteria andG02NotBetween(String value1, String value2) {
            addCriterion("g02 not between", value1, value2, "g02");
            return (Criteria) this;
        }

        public Criteria andG03IsNull() {
            addCriterion("g03 is null");
            return (Criteria) this;
        }

        public Criteria andG03IsNotNull() {
            addCriterion("g03 is not null");
            return (Criteria) this;
        }

        public Criteria andG03EqualTo(String value) {
            addCriterion("g03 =", value, "g03");
            return (Criteria) this;
        }

        public Criteria andG03NotEqualTo(String value) {
            addCriterion("g03 <>", value, "g03");
            return (Criteria) this;
        }

        public Criteria andG03GreaterThan(String value) {
            addCriterion("g03 >", value, "g03");
            return (Criteria) this;
        }

        public Criteria andG03GreaterThanOrEqualTo(String value) {
            addCriterion("g03 >=", value, "g03");
            return (Criteria) this;
        }

        public Criteria andG03LessThan(String value) {
            addCriterion("g03 <", value, "g03");
            return (Criteria) this;
        }

        public Criteria andG03LessThanOrEqualTo(String value) {
            addCriterion("g03 <=", value, "g03");
            return (Criteria) this;
        }

        public Criteria andG03Like(String value) {
            addCriterion("g03 like", value, "g03");
            return (Criteria) this;
        }

        public Criteria andG03NotLike(String value) {
            addCriterion("g03 not like", value, "g03");
            return (Criteria) this;
        }

        public Criteria andG03In(List<String> values) {
            addCriterion("g03 in", values, "g03");
            return (Criteria) this;
        }

        public Criteria andG03NotIn(List<String> values) {
            addCriterion("g03 not in", values, "g03");
            return (Criteria) this;
        }

        public Criteria andG03Between(String value1, String value2) {
            addCriterion("g03 between", value1, value2, "g03");
            return (Criteria) this;
        }

        public Criteria andG03NotBetween(String value1, String value2) {
            addCriterion("g03 not between", value1, value2, "g03");
            return (Criteria) this;
        }

        public Criteria andG04IsNull() {
            addCriterion("g04 is null");
            return (Criteria) this;
        }

        public Criteria andG04IsNotNull() {
            addCriterion("g04 is not null");
            return (Criteria) this;
        }

        public Criteria andG04EqualTo(String value) {
            addCriterion("g04 =", value, "g04");
            return (Criteria) this;
        }

        public Criteria andG04NotEqualTo(String value) {
            addCriterion("g04 <>", value, "g04");
            return (Criteria) this;
        }

        public Criteria andG04GreaterThan(String value) {
            addCriterion("g04 >", value, "g04");
            return (Criteria) this;
        }

        public Criteria andG04GreaterThanOrEqualTo(String value) {
            addCriterion("g04 >=", value, "g04");
            return (Criteria) this;
        }

        public Criteria andG04LessThan(String value) {
            addCriterion("g04 <", value, "g04");
            return (Criteria) this;
        }

        public Criteria andG04LessThanOrEqualTo(String value) {
            addCriterion("g04 <=", value, "g04");
            return (Criteria) this;
        }

        public Criteria andG04Like(String value) {
            addCriterion("g04 like", value, "g04");
            return (Criteria) this;
        }

        public Criteria andG04NotLike(String value) {
            addCriterion("g04 not like", value, "g04");
            return (Criteria) this;
        }

        public Criteria andG04In(List<String> values) {
            addCriterion("g04 in", values, "g04");
            return (Criteria) this;
        }

        public Criteria andG04NotIn(List<String> values) {
            addCriterion("g04 not in", values, "g04");
            return (Criteria) this;
        }

        public Criteria andG04Between(String value1, String value2) {
            addCriterion("g04 between", value1, value2, "g04");
            return (Criteria) this;
        }

        public Criteria andG04NotBetween(String value1, String value2) {
            addCriterion("g04 not between", value1, value2, "g04");
            return (Criteria) this;
        }

        public Criteria andG05IsNull() {
            addCriterion("g05 is null");
            return (Criteria) this;
        }

        public Criteria andG05IsNotNull() {
            addCriterion("g05 is not null");
            return (Criteria) this;
        }

        public Criteria andG05EqualTo(String value) {
            addCriterion("g05 =", value, "g05");
            return (Criteria) this;
        }

        public Criteria andG05NotEqualTo(String value) {
            addCriterion("g05 <>", value, "g05");
            return (Criteria) this;
        }

        public Criteria andG05GreaterThan(String value) {
            addCriterion("g05 >", value, "g05");
            return (Criteria) this;
        }

        public Criteria andG05GreaterThanOrEqualTo(String value) {
            addCriterion("g05 >=", value, "g05");
            return (Criteria) this;
        }

        public Criteria andG05LessThan(String value) {
            addCriterion("g05 <", value, "g05");
            return (Criteria) this;
        }

        public Criteria andG05LessThanOrEqualTo(String value) {
            addCriterion("g05 <=", value, "g05");
            return (Criteria) this;
        }

        public Criteria andG05Like(String value) {
            addCriterion("g05 like", value, "g05");
            return (Criteria) this;
        }

        public Criteria andG05NotLike(String value) {
            addCriterion("g05 not like", value, "g05");
            return (Criteria) this;
        }

        public Criteria andG05In(List<String> values) {
            addCriterion("g05 in", values, "g05");
            return (Criteria) this;
        }

        public Criteria andG05NotIn(List<String> values) {
            addCriterion("g05 not in", values, "g05");
            return (Criteria) this;
        }

        public Criteria andG05Between(String value1, String value2) {
            addCriterion("g05 between", value1, value2, "g05");
            return (Criteria) this;
        }

        public Criteria andG05NotBetween(String value1, String value2) {
            addCriterion("g05 not between", value1, value2, "g05");
            return (Criteria) this;
        }

        public Criteria andG06IsNull() {
            addCriterion("g06 is null");
            return (Criteria) this;
        }

        public Criteria andG06IsNotNull() {
            addCriterion("g06 is not null");
            return (Criteria) this;
        }

        public Criteria andG06EqualTo(String value) {
            addCriterion("g06 =", value, "g06");
            return (Criteria) this;
        }

        public Criteria andG06NotEqualTo(String value) {
            addCriterion("g06 <>", value, "g06");
            return (Criteria) this;
        }

        public Criteria andG06GreaterThan(String value) {
            addCriterion("g06 >", value, "g06");
            return (Criteria) this;
        }

        public Criteria andG06GreaterThanOrEqualTo(String value) {
            addCriterion("g06 >=", value, "g06");
            return (Criteria) this;
        }

        public Criteria andG06LessThan(String value) {
            addCriterion("g06 <", value, "g06");
            return (Criteria) this;
        }

        public Criteria andG06LessThanOrEqualTo(String value) {
            addCriterion("g06 <=", value, "g06");
            return (Criteria) this;
        }

        public Criteria andG06Like(String value) {
            addCriterion("g06 like", value, "g06");
            return (Criteria) this;
        }

        public Criteria andG06NotLike(String value) {
            addCriterion("g06 not like", value, "g06");
            return (Criteria) this;
        }

        public Criteria andG06In(List<String> values) {
            addCriterion("g06 in", values, "g06");
            return (Criteria) this;
        }

        public Criteria andG06NotIn(List<String> values) {
            addCriterion("g06 not in", values, "g06");
            return (Criteria) this;
        }

        public Criteria andG06Between(String value1, String value2) {
            addCriterion("g06 between", value1, value2, "g06");
            return (Criteria) this;
        }

        public Criteria andG06NotBetween(String value1, String value2) {
            addCriterion("g06 not between", value1, value2, "g06");
            return (Criteria) this;
        }

        public Criteria andG07IsNull() {
            addCriterion("g07 is null");
            return (Criteria) this;
        }

        public Criteria andG07IsNotNull() {
            addCriterion("g07 is not null");
            return (Criteria) this;
        }

        public Criteria andG07EqualTo(String value) {
            addCriterion("g07 =", value, "g07");
            return (Criteria) this;
        }

        public Criteria andG07NotEqualTo(String value) {
            addCriterion("g07 <>", value, "g07");
            return (Criteria) this;
        }

        public Criteria andG07GreaterThan(String value) {
            addCriterion("g07 >", value, "g07");
            return (Criteria) this;
        }

        public Criteria andG07GreaterThanOrEqualTo(String value) {
            addCriterion("g07 >=", value, "g07");
            return (Criteria) this;
        }

        public Criteria andG07LessThan(String value) {
            addCriterion("g07 <", value, "g07");
            return (Criteria) this;
        }

        public Criteria andG07LessThanOrEqualTo(String value) {
            addCriterion("g07 <=", value, "g07");
            return (Criteria) this;
        }

        public Criteria andG07Like(String value) {
            addCriterion("g07 like", value, "g07");
            return (Criteria) this;
        }

        public Criteria andG07NotLike(String value) {
            addCriterion("g07 not like", value, "g07");
            return (Criteria) this;
        }

        public Criteria andG07In(List<String> values) {
            addCriterion("g07 in", values, "g07");
            return (Criteria) this;
        }

        public Criteria andG07NotIn(List<String> values) {
            addCriterion("g07 not in", values, "g07");
            return (Criteria) this;
        }

        public Criteria andG07Between(String value1, String value2) {
            addCriterion("g07 between", value1, value2, "g07");
            return (Criteria) this;
        }

        public Criteria andG07NotBetween(String value1, String value2) {
            addCriterion("g07 not between", value1, value2, "g07");
            return (Criteria) this;
        }

        public Criteria andG08IsNull() {
            addCriterion("g08 is null");
            return (Criteria) this;
        }

        public Criteria andG08IsNotNull() {
            addCriterion("g08 is not null");
            return (Criteria) this;
        }

        public Criteria andG08EqualTo(String value) {
            addCriterion("g08 =", value, "g08");
            return (Criteria) this;
        }

        public Criteria andG08NotEqualTo(String value) {
            addCriterion("g08 <>", value, "g08");
            return (Criteria) this;
        }

        public Criteria andG08GreaterThan(String value) {
            addCriterion("g08 >", value, "g08");
            return (Criteria) this;
        }

        public Criteria andG08GreaterThanOrEqualTo(String value) {
            addCriterion("g08 >=", value, "g08");
            return (Criteria) this;
        }

        public Criteria andG08LessThan(String value) {
            addCriterion("g08 <", value, "g08");
            return (Criteria) this;
        }

        public Criteria andG08LessThanOrEqualTo(String value) {
            addCriterion("g08 <=", value, "g08");
            return (Criteria) this;
        }

        public Criteria andG08Like(String value) {
            addCriterion("g08 like", value, "g08");
            return (Criteria) this;
        }

        public Criteria andG08NotLike(String value) {
            addCriterion("g08 not like", value, "g08");
            return (Criteria) this;
        }

        public Criteria andG08In(List<String> values) {
            addCriterion("g08 in", values, "g08");
            return (Criteria) this;
        }

        public Criteria andG08NotIn(List<String> values) {
            addCriterion("g08 not in", values, "g08");
            return (Criteria) this;
        }

        public Criteria andG08Between(String value1, String value2) {
            addCriterion("g08 between", value1, value2, "g08");
            return (Criteria) this;
        }

        public Criteria andG08NotBetween(String value1, String value2) {
            addCriterion("g08 not between", value1, value2, "g08");
            return (Criteria) this;
        }

        public Criteria andG09IsNull() {
            addCriterion("g09 is null");
            return (Criteria) this;
        }

        public Criteria andG09IsNotNull() {
            addCriterion("g09 is not null");
            return (Criteria) this;
        }

        public Criteria andG09EqualTo(String value) {
            addCriterion("g09 =", value, "g09");
            return (Criteria) this;
        }

        public Criteria andG09NotEqualTo(String value) {
            addCriterion("g09 <>", value, "g09");
            return (Criteria) this;
        }

        public Criteria andG09GreaterThan(String value) {
            addCriterion("g09 >", value, "g09");
            return (Criteria) this;
        }

        public Criteria andG09GreaterThanOrEqualTo(String value) {
            addCriterion("g09 >=", value, "g09");
            return (Criteria) this;
        }

        public Criteria andG09LessThan(String value) {
            addCriterion("g09 <", value, "g09");
            return (Criteria) this;
        }

        public Criteria andG09LessThanOrEqualTo(String value) {
            addCriterion("g09 <=", value, "g09");
            return (Criteria) this;
        }

        public Criteria andG09Like(String value) {
            addCriterion("g09 like", value, "g09");
            return (Criteria) this;
        }

        public Criteria andG09NotLike(String value) {
            addCriterion("g09 not like", value, "g09");
            return (Criteria) this;
        }

        public Criteria andG09In(List<String> values) {
            addCriterion("g09 in", values, "g09");
            return (Criteria) this;
        }

        public Criteria andG09NotIn(List<String> values) {
            addCriterion("g09 not in", values, "g09");
            return (Criteria) this;
        }

        public Criteria andG09Between(String value1, String value2) {
            addCriterion("g09 between", value1, value2, "g09");
            return (Criteria) this;
        }

        public Criteria andG09NotBetween(String value1, String value2) {
            addCriterion("g09 not between", value1, value2, "g09");
            return (Criteria) this;
        }

        public Criteria andG10IsNull() {
            addCriterion("g10 is null");
            return (Criteria) this;
        }

        public Criteria andG10IsNotNull() {
            addCriterion("g10 is not null");
            return (Criteria) this;
        }

        public Criteria andG10EqualTo(String value) {
            addCriterion("g10 =", value, "g10");
            return (Criteria) this;
        }

        public Criteria andG10NotEqualTo(String value) {
            addCriterion("g10 <>", value, "g10");
            return (Criteria) this;
        }

        public Criteria andG10GreaterThan(String value) {
            addCriterion("g10 >", value, "g10");
            return (Criteria) this;
        }

        public Criteria andG10GreaterThanOrEqualTo(String value) {
            addCriterion("g10 >=", value, "g10");
            return (Criteria) this;
        }

        public Criteria andG10LessThan(String value) {
            addCriterion("g10 <", value, "g10");
            return (Criteria) this;
        }

        public Criteria andG10LessThanOrEqualTo(String value) {
            addCriterion("g10 <=", value, "g10");
            return (Criteria) this;
        }

        public Criteria andG10Like(String value) {
            addCriterion("g10 like", value, "g10");
            return (Criteria) this;
        }

        public Criteria andG10NotLike(String value) {
            addCriterion("g10 not like", value, "g10");
            return (Criteria) this;
        }

        public Criteria andG10In(List<String> values) {
            addCriterion("g10 in", values, "g10");
            return (Criteria) this;
        }

        public Criteria andG10NotIn(List<String> values) {
            addCriterion("g10 not in", values, "g10");
            return (Criteria) this;
        }

        public Criteria andG10Between(String value1, String value2) {
            addCriterion("g10 between", value1, value2, "g10");
            return (Criteria) this;
        }

        public Criteria andG10NotBetween(String value1, String value2) {
            addCriterion("g10 not between", value1, value2, "g10");
            return (Criteria) this;
        }

        public Criteria andG11IsNull() {
            addCriterion("g11 is null");
            return (Criteria) this;
        }

        public Criteria andG11IsNotNull() {
            addCriterion("g11 is not null");
            return (Criteria) this;
        }

        public Criteria andG11EqualTo(String value) {
            addCriterion("g11 =", value, "g11");
            return (Criteria) this;
        }

        public Criteria andG11NotEqualTo(String value) {
            addCriterion("g11 <>", value, "g11");
            return (Criteria) this;
        }

        public Criteria andG11GreaterThan(String value) {
            addCriterion("g11 >", value, "g11");
            return (Criteria) this;
        }

        public Criteria andG11GreaterThanOrEqualTo(String value) {
            addCriterion("g11 >=", value, "g11");
            return (Criteria) this;
        }

        public Criteria andG11LessThan(String value) {
            addCriterion("g11 <", value, "g11");
            return (Criteria) this;
        }

        public Criteria andG11LessThanOrEqualTo(String value) {
            addCriterion("g11 <=", value, "g11");
            return (Criteria) this;
        }

        public Criteria andG11Like(String value) {
            addCriterion("g11 like", value, "g11");
            return (Criteria) this;
        }

        public Criteria andG11NotLike(String value) {
            addCriterion("g11 not like", value, "g11");
            return (Criteria) this;
        }

        public Criteria andG11In(List<String> values) {
            addCriterion("g11 in", values, "g11");
            return (Criteria) this;
        }

        public Criteria andG11NotIn(List<String> values) {
            addCriterion("g11 not in", values, "g11");
            return (Criteria) this;
        }

        public Criteria andG11Between(String value1, String value2) {
            addCriterion("g11 between", value1, value2, "g11");
            return (Criteria) this;
        }

        public Criteria andG11NotBetween(String value1, String value2) {
            addCriterion("g11 not between", value1, value2, "g11");
            return (Criteria) this;
        }

        public Criteria andG12IsNull() {
            addCriterion("g12 is null");
            return (Criteria) this;
        }

        public Criteria andG12IsNotNull() {
            addCriterion("g12 is not null");
            return (Criteria) this;
        }

        public Criteria andG12EqualTo(String value) {
            addCriterion("g12 =", value, "g12");
            return (Criteria) this;
        }

        public Criteria andG12NotEqualTo(String value) {
            addCriterion("g12 <>", value, "g12");
            return (Criteria) this;
        }

        public Criteria andG12GreaterThan(String value) {
            addCriterion("g12 >", value, "g12");
            return (Criteria) this;
        }

        public Criteria andG12GreaterThanOrEqualTo(String value) {
            addCriterion("g12 >=", value, "g12");
            return (Criteria) this;
        }

        public Criteria andG12LessThan(String value) {
            addCriterion("g12 <", value, "g12");
            return (Criteria) this;
        }

        public Criteria andG12LessThanOrEqualTo(String value) {
            addCriterion("g12 <=", value, "g12");
            return (Criteria) this;
        }

        public Criteria andG12Like(String value) {
            addCriterion("g12 like", value, "g12");
            return (Criteria) this;
        }

        public Criteria andG12NotLike(String value) {
            addCriterion("g12 not like", value, "g12");
            return (Criteria) this;
        }

        public Criteria andG12In(List<String> values) {
            addCriterion("g12 in", values, "g12");
            return (Criteria) this;
        }

        public Criteria andG12NotIn(List<String> values) {
            addCriterion("g12 not in", values, "g12");
            return (Criteria) this;
        }

        public Criteria andG12Between(String value1, String value2) {
            addCriterion("g12 between", value1, value2, "g12");
            return (Criteria) this;
        }

        public Criteria andG12NotBetween(String value1, String value2) {
            addCriterion("g12 not between", value1, value2, "g12");
            return (Criteria) this;
        }

        public Criteria andG13IsNull() {
            addCriterion("g13 is null");
            return (Criteria) this;
        }

        public Criteria andG13IsNotNull() {
            addCriterion("g13 is not null");
            return (Criteria) this;
        }

        public Criteria andG13EqualTo(String value) {
            addCriterion("g13 =", value, "g13");
            return (Criteria) this;
        }

        public Criteria andG13NotEqualTo(String value) {
            addCriterion("g13 <>", value, "g13");
            return (Criteria) this;
        }

        public Criteria andG13GreaterThan(String value) {
            addCriterion("g13 >", value, "g13");
            return (Criteria) this;
        }

        public Criteria andG13GreaterThanOrEqualTo(String value) {
            addCriterion("g13 >=", value, "g13");
            return (Criteria) this;
        }

        public Criteria andG13LessThan(String value) {
            addCriterion("g13 <", value, "g13");
            return (Criteria) this;
        }

        public Criteria andG13LessThanOrEqualTo(String value) {
            addCriterion("g13 <=", value, "g13");
            return (Criteria) this;
        }

        public Criteria andG13Like(String value) {
            addCriterion("g13 like", value, "g13");
            return (Criteria) this;
        }

        public Criteria andG13NotLike(String value) {
            addCriterion("g13 not like", value, "g13");
            return (Criteria) this;
        }

        public Criteria andG13In(List<String> values) {
            addCriterion("g13 in", values, "g13");
            return (Criteria) this;
        }

        public Criteria andG13NotIn(List<String> values) {
            addCriterion("g13 not in", values, "g13");
            return (Criteria) this;
        }

        public Criteria andG13Between(String value1, String value2) {
            addCriterion("g13 between", value1, value2, "g13");
            return (Criteria) this;
        }

        public Criteria andG13NotBetween(String value1, String value2) {
            addCriterion("g13 not between", value1, value2, "g13");
            return (Criteria) this;
        }

        public Criteria andG14IsNull() {
            addCriterion("g14 is null");
            return (Criteria) this;
        }

        public Criteria andG14IsNotNull() {
            addCriterion("g14 is not null");
            return (Criteria) this;
        }

        public Criteria andG14EqualTo(String value) {
            addCriterion("g14 =", value, "g14");
            return (Criteria) this;
        }

        public Criteria andG14NotEqualTo(String value) {
            addCriterion("g14 <>", value, "g14");
            return (Criteria) this;
        }

        public Criteria andG14GreaterThan(String value) {
            addCriterion("g14 >", value, "g14");
            return (Criteria) this;
        }

        public Criteria andG14GreaterThanOrEqualTo(String value) {
            addCriterion("g14 >=", value, "g14");
            return (Criteria) this;
        }

        public Criteria andG14LessThan(String value) {
            addCriterion("g14 <", value, "g14");
            return (Criteria) this;
        }

        public Criteria andG14LessThanOrEqualTo(String value) {
            addCriterion("g14 <=", value, "g14");
            return (Criteria) this;
        }

        public Criteria andG14Like(String value) {
            addCriterion("g14 like", value, "g14");
            return (Criteria) this;
        }

        public Criteria andG14NotLike(String value) {
            addCriterion("g14 not like", value, "g14");
            return (Criteria) this;
        }

        public Criteria andG14In(List<String> values) {
            addCriterion("g14 in", values, "g14");
            return (Criteria) this;
        }

        public Criteria andG14NotIn(List<String> values) {
            addCriterion("g14 not in", values, "g14");
            return (Criteria) this;
        }

        public Criteria andG14Between(String value1, String value2) {
            addCriterion("g14 between", value1, value2, "g14");
            return (Criteria) this;
        }

        public Criteria andG14NotBetween(String value1, String value2) {
            addCriterion("g14 not between", value1, value2, "g14");
            return (Criteria) this;
        }

        public Criteria andG15IsNull() {
            addCriterion("g15 is null");
            return (Criteria) this;
        }

        public Criteria andG15IsNotNull() {
            addCriterion("g15 is not null");
            return (Criteria) this;
        }

        public Criteria andG15EqualTo(String value) {
            addCriterion("g15 =", value, "g15");
            return (Criteria) this;
        }

        public Criteria andG15NotEqualTo(String value) {
            addCriterion("g15 <>", value, "g15");
            return (Criteria) this;
        }

        public Criteria andG15GreaterThan(String value) {
            addCriterion("g15 >", value, "g15");
            return (Criteria) this;
        }

        public Criteria andG15GreaterThanOrEqualTo(String value) {
            addCriterion("g15 >=", value, "g15");
            return (Criteria) this;
        }

        public Criteria andG15LessThan(String value) {
            addCriterion("g15 <", value, "g15");
            return (Criteria) this;
        }

        public Criteria andG15LessThanOrEqualTo(String value) {
            addCriterion("g15 <=", value, "g15");
            return (Criteria) this;
        }

        public Criteria andG15Like(String value) {
            addCriterion("g15 like", value, "g15");
            return (Criteria) this;
        }

        public Criteria andG15NotLike(String value) {
            addCriterion("g15 not like", value, "g15");
            return (Criteria) this;
        }

        public Criteria andG15In(List<String> values) {
            addCriterion("g15 in", values, "g15");
            return (Criteria) this;
        }

        public Criteria andG15NotIn(List<String> values) {
            addCriterion("g15 not in", values, "g15");
            return (Criteria) this;
        }

        public Criteria andG15Between(String value1, String value2) {
            addCriterion("g15 between", value1, value2, "g15");
            return (Criteria) this;
        }

        public Criteria andG15NotBetween(String value1, String value2) {
            addCriterion("g15 not between", value1, value2, "g15");
            return (Criteria) this;
        }

        public Criteria andG16IsNull() {
            addCriterion("g16 is null");
            return (Criteria) this;
        }

        public Criteria andG16IsNotNull() {
            addCriterion("g16 is not null");
            return (Criteria) this;
        }

        public Criteria andG16EqualTo(String value) {
            addCriterion("g16 =", value, "g16");
            return (Criteria) this;
        }

        public Criteria andG16NotEqualTo(String value) {
            addCriterion("g16 <>", value, "g16");
            return (Criteria) this;
        }

        public Criteria andG16GreaterThan(String value) {
            addCriterion("g16 >", value, "g16");
            return (Criteria) this;
        }

        public Criteria andG16GreaterThanOrEqualTo(String value) {
            addCriterion("g16 >=", value, "g16");
            return (Criteria) this;
        }

        public Criteria andG16LessThan(String value) {
            addCriterion("g16 <", value, "g16");
            return (Criteria) this;
        }

        public Criteria andG16LessThanOrEqualTo(String value) {
            addCriterion("g16 <=", value, "g16");
            return (Criteria) this;
        }

        public Criteria andG16Like(String value) {
            addCriterion("g16 like", value, "g16");
            return (Criteria) this;
        }

        public Criteria andG16NotLike(String value) {
            addCriterion("g16 not like", value, "g16");
            return (Criteria) this;
        }

        public Criteria andG16In(List<String> values) {
            addCriterion("g16 in", values, "g16");
            return (Criteria) this;
        }

        public Criteria andG16NotIn(List<String> values) {
            addCriterion("g16 not in", values, "g16");
            return (Criteria) this;
        }

        public Criteria andG16Between(String value1, String value2) {
            addCriterion("g16 between", value1, value2, "g16");
            return (Criteria) this;
        }

        public Criteria andG16NotBetween(String value1, String value2) {
            addCriterion("g16 not between", value1, value2, "g16");
            return (Criteria) this;
        }

        public Criteria andG17IsNull() {
            addCriterion("g17 is null");
            return (Criteria) this;
        }

        public Criteria andG17IsNotNull() {
            addCriterion("g17 is not null");
            return (Criteria) this;
        }

        public Criteria andG17EqualTo(String value) {
            addCriterion("g17 =", value, "g17");
            return (Criteria) this;
        }

        public Criteria andG17NotEqualTo(String value) {
            addCriterion("g17 <>", value, "g17");
            return (Criteria) this;
        }

        public Criteria andG17GreaterThan(String value) {
            addCriterion("g17 >", value, "g17");
            return (Criteria) this;
        }

        public Criteria andG17GreaterThanOrEqualTo(String value) {
            addCriterion("g17 >=", value, "g17");
            return (Criteria) this;
        }

        public Criteria andG17LessThan(String value) {
            addCriterion("g17 <", value, "g17");
            return (Criteria) this;
        }

        public Criteria andG17LessThanOrEqualTo(String value) {
            addCriterion("g17 <=", value, "g17");
            return (Criteria) this;
        }

        public Criteria andG17Like(String value) {
            addCriterion("g17 like", value, "g17");
            return (Criteria) this;
        }

        public Criteria andG17NotLike(String value) {
            addCriterion("g17 not like", value, "g17");
            return (Criteria) this;
        }

        public Criteria andG17In(List<String> values) {
            addCriterion("g17 in", values, "g17");
            return (Criteria) this;
        }

        public Criteria andG17NotIn(List<String> values) {
            addCriterion("g17 not in", values, "g17");
            return (Criteria) this;
        }

        public Criteria andG17Between(String value1, String value2) {
            addCriterion("g17 between", value1, value2, "g17");
            return (Criteria) this;
        }

        public Criteria andG17NotBetween(String value1, String value2) {
            addCriterion("g17 not between", value1, value2, "g17");
            return (Criteria) this;
        }

        public Criteria andG18IsNull() {
            addCriterion("g18 is null");
            return (Criteria) this;
        }

        public Criteria andG18IsNotNull() {
            addCriterion("g18 is not null");
            return (Criteria) this;
        }

        public Criteria andG18EqualTo(String value) {
            addCriterion("g18 =", value, "g18");
            return (Criteria) this;
        }

        public Criteria andG18NotEqualTo(String value) {
            addCriterion("g18 <>", value, "g18");
            return (Criteria) this;
        }

        public Criteria andG18GreaterThan(String value) {
            addCriterion("g18 >", value, "g18");
            return (Criteria) this;
        }

        public Criteria andG18GreaterThanOrEqualTo(String value) {
            addCriterion("g18 >=", value, "g18");
            return (Criteria) this;
        }

        public Criteria andG18LessThan(String value) {
            addCriterion("g18 <", value, "g18");
            return (Criteria) this;
        }

        public Criteria andG18LessThanOrEqualTo(String value) {
            addCriterion("g18 <=", value, "g18");
            return (Criteria) this;
        }

        public Criteria andG18Like(String value) {
            addCriterion("g18 like", value, "g18");
            return (Criteria) this;
        }

        public Criteria andG18NotLike(String value) {
            addCriterion("g18 not like", value, "g18");
            return (Criteria) this;
        }

        public Criteria andG18In(List<String> values) {
            addCriterion("g18 in", values, "g18");
            return (Criteria) this;
        }

        public Criteria andG18NotIn(List<String> values) {
            addCriterion("g18 not in", values, "g18");
            return (Criteria) this;
        }

        public Criteria andG18Between(String value1, String value2) {
            addCriterion("g18 between", value1, value2, "g18");
            return (Criteria) this;
        }

        public Criteria andG18NotBetween(String value1, String value2) {
            addCriterion("g18 not between", value1, value2, "g18");
            return (Criteria) this;
        }

        public Criteria andG19IsNull() {
            addCriterion("g19 is null");
            return (Criteria) this;
        }

        public Criteria andG19IsNotNull() {
            addCriterion("g19 is not null");
            return (Criteria) this;
        }

        public Criteria andG19EqualTo(String value) {
            addCriterion("g19 =", value, "g19");
            return (Criteria) this;
        }

        public Criteria andG19NotEqualTo(String value) {
            addCriterion("g19 <>", value, "g19");
            return (Criteria) this;
        }

        public Criteria andG19GreaterThan(String value) {
            addCriterion("g19 >", value, "g19");
            return (Criteria) this;
        }

        public Criteria andG19GreaterThanOrEqualTo(String value) {
            addCriterion("g19 >=", value, "g19");
            return (Criteria) this;
        }

        public Criteria andG19LessThan(String value) {
            addCriterion("g19 <", value, "g19");
            return (Criteria) this;
        }

        public Criteria andG19LessThanOrEqualTo(String value) {
            addCriterion("g19 <=", value, "g19");
            return (Criteria) this;
        }

        public Criteria andG19Like(String value) {
            addCriterion("g19 like", value, "g19");
            return (Criteria) this;
        }

        public Criteria andG19NotLike(String value) {
            addCriterion("g19 not like", value, "g19");
            return (Criteria) this;
        }

        public Criteria andG19In(List<String> values) {
            addCriterion("g19 in", values, "g19");
            return (Criteria) this;
        }

        public Criteria andG19NotIn(List<String> values) {
            addCriterion("g19 not in", values, "g19");
            return (Criteria) this;
        }

        public Criteria andG19Between(String value1, String value2) {
            addCriterion("g19 between", value1, value2, "g19");
            return (Criteria) this;
        }

        public Criteria andG19NotBetween(String value1, String value2) {
            addCriterion("g19 not between", value1, value2, "g19");
            return (Criteria) this;
        }

        public Criteria andG20IsNull() {
            addCriterion("g20 is null");
            return (Criteria) this;
        }

        public Criteria andG20IsNotNull() {
            addCriterion("g20 is not null");
            return (Criteria) this;
        }

        public Criteria andG20EqualTo(String value) {
            addCriterion("g20 =", value, "g20");
            return (Criteria) this;
        }

        public Criteria andG20NotEqualTo(String value) {
            addCriterion("g20 <>", value, "g20");
            return (Criteria) this;
        }

        public Criteria andG20GreaterThan(String value) {
            addCriterion("g20 >", value, "g20");
            return (Criteria) this;
        }

        public Criteria andG20GreaterThanOrEqualTo(String value) {
            addCriterion("g20 >=", value, "g20");
            return (Criteria) this;
        }

        public Criteria andG20LessThan(String value) {
            addCriterion("g20 <", value, "g20");
            return (Criteria) this;
        }

        public Criteria andG20LessThanOrEqualTo(String value) {
            addCriterion("g20 <=", value, "g20");
            return (Criteria) this;
        }

        public Criteria andG20Like(String value) {
            addCriterion("g20 like", value, "g20");
            return (Criteria) this;
        }

        public Criteria andG20NotLike(String value) {
            addCriterion("g20 not like", value, "g20");
            return (Criteria) this;
        }

        public Criteria andG20In(List<String> values) {
            addCriterion("g20 in", values, "g20");
            return (Criteria) this;
        }

        public Criteria andG20NotIn(List<String> values) {
            addCriterion("g20 not in", values, "g20");
            return (Criteria) this;
        }

        public Criteria andG20Between(String value1, String value2) {
            addCriterion("g20 between", value1, value2, "g20");
            return (Criteria) this;
        }

        public Criteria andG20NotBetween(String value1, String value2) {
            addCriterion("g20 not between", value1, value2, "g20");
            return (Criteria) this;
        }

        public Criteria andH01IsNull() {
            addCriterion("h01 is null");
            return (Criteria) this;
        }

        public Criteria andH01IsNotNull() {
            addCriterion("h01 is not null");
            return (Criteria) this;
        }

        public Criteria andH01EqualTo(String value) {
            addCriterion("h01 =", value, "h01");
            return (Criteria) this;
        }

        public Criteria andH01NotEqualTo(String value) {
            addCriterion("h01 <>", value, "h01");
            return (Criteria) this;
        }

        public Criteria andH01GreaterThan(String value) {
            addCriterion("h01 >", value, "h01");
            return (Criteria) this;
        }

        public Criteria andH01GreaterThanOrEqualTo(String value) {
            addCriterion("h01 >=", value, "h01");
            return (Criteria) this;
        }

        public Criteria andH01LessThan(String value) {
            addCriterion("h01 <", value, "h01");
            return (Criteria) this;
        }

        public Criteria andH01LessThanOrEqualTo(String value) {
            addCriterion("h01 <=", value, "h01");
            return (Criteria) this;
        }

        public Criteria andH01Like(String value) {
            addCriterion("h01 like", value, "h01");
            return (Criteria) this;
        }

        public Criteria andH01NotLike(String value) {
            addCriterion("h01 not like", value, "h01");
            return (Criteria) this;
        }

        public Criteria andH01In(List<String> values) {
            addCriterion("h01 in", values, "h01");
            return (Criteria) this;
        }

        public Criteria andH01NotIn(List<String> values) {
            addCriterion("h01 not in", values, "h01");
            return (Criteria) this;
        }

        public Criteria andH01Between(String value1, String value2) {
            addCriterion("h01 between", value1, value2, "h01");
            return (Criteria) this;
        }

        public Criteria andH01NotBetween(String value1, String value2) {
            addCriterion("h01 not between", value1, value2, "h01");
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

        public Criteria andA11smIsNull() {
            addCriterion("a11sm is null");
            return (Criteria) this;
        }

        public Criteria andA11smIsNotNull() {
            addCriterion("a11sm is not null");
            return (Criteria) this;
        }

        public Criteria andA11smEqualTo(String value) {
            addCriterion("a11sm =", value, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA11smNotEqualTo(String value) {
            addCriterion("a11sm <>", value, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA11smGreaterThan(String value) {
            addCriterion("a11sm >", value, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA11smGreaterThanOrEqualTo(String value) {
            addCriterion("a11sm >=", value, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA11smLessThan(String value) {
            addCriterion("a11sm <", value, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA11smLessThanOrEqualTo(String value) {
            addCriterion("a11sm <=", value, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA11smLike(String value) {
            addCriterion("a11sm like", value, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA11smNotLike(String value) {
            addCriterion("a11sm not like", value, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA11smIn(List<String> values) {
            addCriterion("a11sm in", values, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA11smNotIn(List<String> values) {
            addCriterion("a11sm not in", values, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA11smBetween(String value1, String value2) {
            addCriterion("a11sm between", value1, value2, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA11smNotBetween(String value1, String value2) {
            addCriterion("a11sm not between", value1, value2, "a11sm");
            return (Criteria) this;
        }

        public Criteria andA12smIsNull() {
            addCriterion("a12sm is null");
            return (Criteria) this;
        }

        public Criteria andA12smIsNotNull() {
            addCriterion("a12sm is not null");
            return (Criteria) this;
        }

        public Criteria andA12smEqualTo(String value) {
            addCriterion("a12sm =", value, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA12smNotEqualTo(String value) {
            addCriterion("a12sm <>", value, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA12smGreaterThan(String value) {
            addCriterion("a12sm >", value, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA12smGreaterThanOrEqualTo(String value) {
            addCriterion("a12sm >=", value, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA12smLessThan(String value) {
            addCriterion("a12sm <", value, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA12smLessThanOrEqualTo(String value) {
            addCriterion("a12sm <=", value, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA12smLike(String value) {
            addCriterion("a12sm like", value, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA12smNotLike(String value) {
            addCriterion("a12sm not like", value, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA12smIn(List<String> values) {
            addCriterion("a12sm in", values, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA12smNotIn(List<String> values) {
            addCriterion("a12sm not in", values, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA12smBetween(String value1, String value2) {
            addCriterion("a12sm between", value1, value2, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA12smNotBetween(String value1, String value2) {
            addCriterion("a12sm not between", value1, value2, "a12sm");
            return (Criteria) this;
        }

        public Criteria andA13smIsNull() {
            addCriterion("a13sm is null");
            return (Criteria) this;
        }

        public Criteria andA13smIsNotNull() {
            addCriterion("a13sm is not null");
            return (Criteria) this;
        }

        public Criteria andA13smEqualTo(String value) {
            addCriterion("a13sm =", value, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA13smNotEqualTo(String value) {
            addCriterion("a13sm <>", value, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA13smGreaterThan(String value) {
            addCriterion("a13sm >", value, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA13smGreaterThanOrEqualTo(String value) {
            addCriterion("a13sm >=", value, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA13smLessThan(String value) {
            addCriterion("a13sm <", value, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA13smLessThanOrEqualTo(String value) {
            addCriterion("a13sm <=", value, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA13smLike(String value) {
            addCriterion("a13sm like", value, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA13smNotLike(String value) {
            addCriterion("a13sm not like", value, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA13smIn(List<String> values) {
            addCriterion("a13sm in", values, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA13smNotIn(List<String> values) {
            addCriterion("a13sm not in", values, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA13smBetween(String value1, String value2) {
            addCriterion("a13sm between", value1, value2, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA13smNotBetween(String value1, String value2) {
            addCriterion("a13sm not between", value1, value2, "a13sm");
            return (Criteria) this;
        }

        public Criteria andA14smIsNull() {
            addCriterion("a14sm is null");
            return (Criteria) this;
        }

        public Criteria andA14smIsNotNull() {
            addCriterion("a14sm is not null");
            return (Criteria) this;
        }

        public Criteria andA14smEqualTo(String value) {
            addCriterion("a14sm =", value, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA14smNotEqualTo(String value) {
            addCriterion("a14sm <>", value, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA14smGreaterThan(String value) {
            addCriterion("a14sm >", value, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA14smGreaterThanOrEqualTo(String value) {
            addCriterion("a14sm >=", value, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA14smLessThan(String value) {
            addCriterion("a14sm <", value, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA14smLessThanOrEqualTo(String value) {
            addCriterion("a14sm <=", value, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA14smLike(String value) {
            addCriterion("a14sm like", value, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA14smNotLike(String value) {
            addCriterion("a14sm not like", value, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA14smIn(List<String> values) {
            addCriterion("a14sm in", values, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA14smNotIn(List<String> values) {
            addCriterion("a14sm not in", values, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA14smBetween(String value1, String value2) {
            addCriterion("a14sm between", value1, value2, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA14smNotBetween(String value1, String value2) {
            addCriterion("a14sm not between", value1, value2, "a14sm");
            return (Criteria) this;
        }

        public Criteria andA15smIsNull() {
            addCriterion("a15sm is null");
            return (Criteria) this;
        }

        public Criteria andA15smIsNotNull() {
            addCriterion("a15sm is not null");
            return (Criteria) this;
        }

        public Criteria andA15smEqualTo(String value) {
            addCriterion("a15sm =", value, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA15smNotEqualTo(String value) {
            addCriterion("a15sm <>", value, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA15smGreaterThan(String value) {
            addCriterion("a15sm >", value, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA15smGreaterThanOrEqualTo(String value) {
            addCriterion("a15sm >=", value, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA15smLessThan(String value) {
            addCriterion("a15sm <", value, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA15smLessThanOrEqualTo(String value) {
            addCriterion("a15sm <=", value, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA15smLike(String value) {
            addCriterion("a15sm like", value, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA15smNotLike(String value) {
            addCriterion("a15sm not like", value, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA15smIn(List<String> values) {
            addCriterion("a15sm in", values, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA15smNotIn(List<String> values) {
            addCriterion("a15sm not in", values, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA15smBetween(String value1, String value2) {
            addCriterion("a15sm between", value1, value2, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA15smNotBetween(String value1, String value2) {
            addCriterion("a15sm not between", value1, value2, "a15sm");
            return (Criteria) this;
        }

        public Criteria andA16smIsNull() {
            addCriterion("a16sm is null");
            return (Criteria) this;
        }

        public Criteria andA16smIsNotNull() {
            addCriterion("a16sm is not null");
            return (Criteria) this;
        }

        public Criteria andA16smEqualTo(String value) {
            addCriterion("a16sm =", value, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA16smNotEqualTo(String value) {
            addCriterion("a16sm <>", value, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA16smGreaterThan(String value) {
            addCriterion("a16sm >", value, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA16smGreaterThanOrEqualTo(String value) {
            addCriterion("a16sm >=", value, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA16smLessThan(String value) {
            addCriterion("a16sm <", value, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA16smLessThanOrEqualTo(String value) {
            addCriterion("a16sm <=", value, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA16smLike(String value) {
            addCriterion("a16sm like", value, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA16smNotLike(String value) {
            addCriterion("a16sm not like", value, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA16smIn(List<String> values) {
            addCriterion("a16sm in", values, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA16smNotIn(List<String> values) {
            addCriterion("a16sm not in", values, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA16smBetween(String value1, String value2) {
            addCriterion("a16sm between", value1, value2, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA16smNotBetween(String value1, String value2) {
            addCriterion("a16sm not between", value1, value2, "a16sm");
            return (Criteria) this;
        }

        public Criteria andA17smIsNull() {
            addCriterion("a17sm is null");
            return (Criteria) this;
        }

        public Criteria andA17smIsNotNull() {
            addCriterion("a17sm is not null");
            return (Criteria) this;
        }

        public Criteria andA17smEqualTo(String value) {
            addCriterion("a17sm =", value, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA17smNotEqualTo(String value) {
            addCriterion("a17sm <>", value, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA17smGreaterThan(String value) {
            addCriterion("a17sm >", value, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA17smGreaterThanOrEqualTo(String value) {
            addCriterion("a17sm >=", value, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA17smLessThan(String value) {
            addCriterion("a17sm <", value, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA17smLessThanOrEqualTo(String value) {
            addCriterion("a17sm <=", value, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA17smLike(String value) {
            addCriterion("a17sm like", value, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA17smNotLike(String value) {
            addCriterion("a17sm not like", value, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA17smIn(List<String> values) {
            addCriterion("a17sm in", values, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA17smNotIn(List<String> values) {
            addCriterion("a17sm not in", values, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA17smBetween(String value1, String value2) {
            addCriterion("a17sm between", value1, value2, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA17smNotBetween(String value1, String value2) {
            addCriterion("a17sm not between", value1, value2, "a17sm");
            return (Criteria) this;
        }

        public Criteria andA18smIsNull() {
            addCriterion("a18sm is null");
            return (Criteria) this;
        }

        public Criteria andA18smIsNotNull() {
            addCriterion("a18sm is not null");
            return (Criteria) this;
        }

        public Criteria andA18smEqualTo(String value) {
            addCriterion("a18sm =", value, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA18smNotEqualTo(String value) {
            addCriterion("a18sm <>", value, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA18smGreaterThan(String value) {
            addCriterion("a18sm >", value, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA18smGreaterThanOrEqualTo(String value) {
            addCriterion("a18sm >=", value, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA18smLessThan(String value) {
            addCriterion("a18sm <", value, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA18smLessThanOrEqualTo(String value) {
            addCriterion("a18sm <=", value, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA18smLike(String value) {
            addCriterion("a18sm like", value, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA18smNotLike(String value) {
            addCriterion("a18sm not like", value, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA18smIn(List<String> values) {
            addCriterion("a18sm in", values, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA18smNotIn(List<String> values) {
            addCriterion("a18sm not in", values, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA18smBetween(String value1, String value2) {
            addCriterion("a18sm between", value1, value2, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA18smNotBetween(String value1, String value2) {
            addCriterion("a18sm not between", value1, value2, "a18sm");
            return (Criteria) this;
        }

        public Criteria andA19smIsNull() {
            addCriterion("a19sm is null");
            return (Criteria) this;
        }

        public Criteria andA19smIsNotNull() {
            addCriterion("a19sm is not null");
            return (Criteria) this;
        }

        public Criteria andA19smEqualTo(String value) {
            addCriterion("a19sm =", value, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA19smNotEqualTo(String value) {
            addCriterion("a19sm <>", value, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA19smGreaterThan(String value) {
            addCriterion("a19sm >", value, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA19smGreaterThanOrEqualTo(String value) {
            addCriterion("a19sm >=", value, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA19smLessThan(String value) {
            addCriterion("a19sm <", value, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA19smLessThanOrEqualTo(String value) {
            addCriterion("a19sm <=", value, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA19smLike(String value) {
            addCriterion("a19sm like", value, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA19smNotLike(String value) {
            addCriterion("a19sm not like", value, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA19smIn(List<String> values) {
            addCriterion("a19sm in", values, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA19smNotIn(List<String> values) {
            addCriterion("a19sm not in", values, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA19smBetween(String value1, String value2) {
            addCriterion("a19sm between", value1, value2, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA19smNotBetween(String value1, String value2) {
            addCriterion("a19sm not between", value1, value2, "a19sm");
            return (Criteria) this;
        }

        public Criteria andA20smIsNull() {
            addCriterion("a20sm is null");
            return (Criteria) this;
        }

        public Criteria andA20smIsNotNull() {
            addCriterion("a20sm is not null");
            return (Criteria) this;
        }

        public Criteria andA20smEqualTo(String value) {
            addCriterion("a20sm =", value, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA20smNotEqualTo(String value) {
            addCriterion("a20sm <>", value, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA20smGreaterThan(String value) {
            addCriterion("a20sm >", value, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA20smGreaterThanOrEqualTo(String value) {
            addCriterion("a20sm >=", value, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA20smLessThan(String value) {
            addCriterion("a20sm <", value, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA20smLessThanOrEqualTo(String value) {
            addCriterion("a20sm <=", value, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA20smLike(String value) {
            addCriterion("a20sm like", value, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA20smNotLike(String value) {
            addCriterion("a20sm not like", value, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA20smIn(List<String> values) {
            addCriterion("a20sm in", values, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA20smNotIn(List<String> values) {
            addCriterion("a20sm not in", values, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA20smBetween(String value1, String value2) {
            addCriterion("a20sm between", value1, value2, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA20smNotBetween(String value1, String value2) {
            addCriterion("a20sm not between", value1, value2, "a20sm");
            return (Criteria) this;
        }

        public Criteria andA21smIsNull() {
            addCriterion("a21sm is null");
            return (Criteria) this;
        }

        public Criteria andA21smIsNotNull() {
            addCriterion("a21sm is not null");
            return (Criteria) this;
        }

        public Criteria andA21smEqualTo(String value) {
            addCriterion("a21sm =", value, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA21smNotEqualTo(String value) {
            addCriterion("a21sm <>", value, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA21smGreaterThan(String value) {
            addCriterion("a21sm >", value, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA21smGreaterThanOrEqualTo(String value) {
            addCriterion("a21sm >=", value, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA21smLessThan(String value) {
            addCriterion("a21sm <", value, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA21smLessThanOrEqualTo(String value) {
            addCriterion("a21sm <=", value, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA21smLike(String value) {
            addCriterion("a21sm like", value, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA21smNotLike(String value) {
            addCriterion("a21sm not like", value, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA21smIn(List<String> values) {
            addCriterion("a21sm in", values, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA21smNotIn(List<String> values) {
            addCriterion("a21sm not in", values, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA21smBetween(String value1, String value2) {
            addCriterion("a21sm between", value1, value2, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA21smNotBetween(String value1, String value2) {
            addCriterion("a21sm not between", value1, value2, "a21sm");
            return (Criteria) this;
        }

        public Criteria andA22smIsNull() {
            addCriterion("a22sm is null");
            return (Criteria) this;
        }

        public Criteria andA22smIsNotNull() {
            addCriterion("a22sm is not null");
            return (Criteria) this;
        }

        public Criteria andA22smEqualTo(String value) {
            addCriterion("a22sm =", value, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA22smNotEqualTo(String value) {
            addCriterion("a22sm <>", value, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA22smGreaterThan(String value) {
            addCriterion("a22sm >", value, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA22smGreaterThanOrEqualTo(String value) {
            addCriterion("a22sm >=", value, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA22smLessThan(String value) {
            addCriterion("a22sm <", value, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA22smLessThanOrEqualTo(String value) {
            addCriterion("a22sm <=", value, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA22smLike(String value) {
            addCriterion("a22sm like", value, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA22smNotLike(String value) {
            addCriterion("a22sm not like", value, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA22smIn(List<String> values) {
            addCriterion("a22sm in", values, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA22smNotIn(List<String> values) {
            addCriterion("a22sm not in", values, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA22smBetween(String value1, String value2) {
            addCriterion("a22sm between", value1, value2, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA22smNotBetween(String value1, String value2) {
            addCriterion("a22sm not between", value1, value2, "a22sm");
            return (Criteria) this;
        }

        public Criteria andA23smIsNull() {
            addCriterion("a23sm is null");
            return (Criteria) this;
        }

        public Criteria andA23smIsNotNull() {
            addCriterion("a23sm is not null");
            return (Criteria) this;
        }

        public Criteria andA23smEqualTo(String value) {
            addCriterion("a23sm =", value, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA23smNotEqualTo(String value) {
            addCriterion("a23sm <>", value, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA23smGreaterThan(String value) {
            addCriterion("a23sm >", value, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA23smGreaterThanOrEqualTo(String value) {
            addCriterion("a23sm >=", value, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA23smLessThan(String value) {
            addCriterion("a23sm <", value, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA23smLessThanOrEqualTo(String value) {
            addCriterion("a23sm <=", value, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA23smLike(String value) {
            addCriterion("a23sm like", value, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA23smNotLike(String value) {
            addCriterion("a23sm not like", value, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA23smIn(List<String> values) {
            addCriterion("a23sm in", values, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA23smNotIn(List<String> values) {
            addCriterion("a23sm not in", values, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA23smBetween(String value1, String value2) {
            addCriterion("a23sm between", value1, value2, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA23smNotBetween(String value1, String value2) {
            addCriterion("a23sm not between", value1, value2, "a23sm");
            return (Criteria) this;
        }

        public Criteria andA24smIsNull() {
            addCriterion("a24sm is null");
            return (Criteria) this;
        }

        public Criteria andA24smIsNotNull() {
            addCriterion("a24sm is not null");
            return (Criteria) this;
        }

        public Criteria andA24smEqualTo(String value) {
            addCriterion("a24sm =", value, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA24smNotEqualTo(String value) {
            addCriterion("a24sm <>", value, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA24smGreaterThan(String value) {
            addCriterion("a24sm >", value, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA24smGreaterThanOrEqualTo(String value) {
            addCriterion("a24sm >=", value, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA24smLessThan(String value) {
            addCriterion("a24sm <", value, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA24smLessThanOrEqualTo(String value) {
            addCriterion("a24sm <=", value, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA24smLike(String value) {
            addCriterion("a24sm like", value, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA24smNotLike(String value) {
            addCriterion("a24sm not like", value, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA24smIn(List<String> values) {
            addCriterion("a24sm in", values, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA24smNotIn(List<String> values) {
            addCriterion("a24sm not in", values, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA24smBetween(String value1, String value2) {
            addCriterion("a24sm between", value1, value2, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA24smNotBetween(String value1, String value2) {
            addCriterion("a24sm not between", value1, value2, "a24sm");
            return (Criteria) this;
        }

        public Criteria andA25smIsNull() {
            addCriterion("a25sm is null");
            return (Criteria) this;
        }

        public Criteria andA25smIsNotNull() {
            addCriterion("a25sm is not null");
            return (Criteria) this;
        }

        public Criteria andA25smEqualTo(String value) {
            addCriterion("a25sm =", value, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA25smNotEqualTo(String value) {
            addCriterion("a25sm <>", value, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA25smGreaterThan(String value) {
            addCriterion("a25sm >", value, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA25smGreaterThanOrEqualTo(String value) {
            addCriterion("a25sm >=", value, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA25smLessThan(String value) {
            addCriterion("a25sm <", value, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA25smLessThanOrEqualTo(String value) {
            addCriterion("a25sm <=", value, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA25smLike(String value) {
            addCriterion("a25sm like", value, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA25smNotLike(String value) {
            addCriterion("a25sm not like", value, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA25smIn(List<String> values) {
            addCriterion("a25sm in", values, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA25smNotIn(List<String> values) {
            addCriterion("a25sm not in", values, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA25smBetween(String value1, String value2) {
            addCriterion("a25sm between", value1, value2, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA25smNotBetween(String value1, String value2) {
            addCriterion("a25sm not between", value1, value2, "a25sm");
            return (Criteria) this;
        }

        public Criteria andA26smIsNull() {
            addCriterion("a26sm is null");
            return (Criteria) this;
        }

        public Criteria andA26smIsNotNull() {
            addCriterion("a26sm is not null");
            return (Criteria) this;
        }

        public Criteria andA26smEqualTo(String value) {
            addCriterion("a26sm =", value, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA26smNotEqualTo(String value) {
            addCriterion("a26sm <>", value, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA26smGreaterThan(String value) {
            addCriterion("a26sm >", value, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA26smGreaterThanOrEqualTo(String value) {
            addCriterion("a26sm >=", value, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA26smLessThan(String value) {
            addCriterion("a26sm <", value, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA26smLessThanOrEqualTo(String value) {
            addCriterion("a26sm <=", value, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA26smLike(String value) {
            addCriterion("a26sm like", value, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA26smNotLike(String value) {
            addCriterion("a26sm not like", value, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA26smIn(List<String> values) {
            addCriterion("a26sm in", values, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA26smNotIn(List<String> values) {
            addCriterion("a26sm not in", values, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA26smBetween(String value1, String value2) {
            addCriterion("a26sm between", value1, value2, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA26smNotBetween(String value1, String value2) {
            addCriterion("a26sm not between", value1, value2, "a26sm");
            return (Criteria) this;
        }

        public Criteria andA27smIsNull() {
            addCriterion("a27sm is null");
            return (Criteria) this;
        }

        public Criteria andA27smIsNotNull() {
            addCriterion("a27sm is not null");
            return (Criteria) this;
        }

        public Criteria andA27smEqualTo(String value) {
            addCriterion("a27sm =", value, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA27smNotEqualTo(String value) {
            addCriterion("a27sm <>", value, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA27smGreaterThan(String value) {
            addCriterion("a27sm >", value, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA27smGreaterThanOrEqualTo(String value) {
            addCriterion("a27sm >=", value, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA27smLessThan(String value) {
            addCriterion("a27sm <", value, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA27smLessThanOrEqualTo(String value) {
            addCriterion("a27sm <=", value, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA27smLike(String value) {
            addCriterion("a27sm like", value, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA27smNotLike(String value) {
            addCriterion("a27sm not like", value, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA27smIn(List<String> values) {
            addCriterion("a27sm in", values, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA27smNotIn(List<String> values) {
            addCriterion("a27sm not in", values, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA27smBetween(String value1, String value2) {
            addCriterion("a27sm between", value1, value2, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA27smNotBetween(String value1, String value2) {
            addCriterion("a27sm not between", value1, value2, "a27sm");
            return (Criteria) this;
        }

        public Criteria andA28smIsNull() {
            addCriterion("a28sm is null");
            return (Criteria) this;
        }

        public Criteria andA28smIsNotNull() {
            addCriterion("a28sm is not null");
            return (Criteria) this;
        }

        public Criteria andA28smEqualTo(String value) {
            addCriterion("a28sm =", value, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA28smNotEqualTo(String value) {
            addCriterion("a28sm <>", value, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA28smGreaterThan(String value) {
            addCriterion("a28sm >", value, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA28smGreaterThanOrEqualTo(String value) {
            addCriterion("a28sm >=", value, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA28smLessThan(String value) {
            addCriterion("a28sm <", value, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA28smLessThanOrEqualTo(String value) {
            addCriterion("a28sm <=", value, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA28smLike(String value) {
            addCriterion("a28sm like", value, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA28smNotLike(String value) {
            addCriterion("a28sm not like", value, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA28smIn(List<String> values) {
            addCriterion("a28sm in", values, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA28smNotIn(List<String> values) {
            addCriterion("a28sm not in", values, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA28smBetween(String value1, String value2) {
            addCriterion("a28sm between", value1, value2, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA28smNotBetween(String value1, String value2) {
            addCriterion("a28sm not between", value1, value2, "a28sm");
            return (Criteria) this;
        }

        public Criteria andA29smIsNull() {
            addCriterion("a29sm is null");
            return (Criteria) this;
        }

        public Criteria andA29smIsNotNull() {
            addCriterion("a29sm is not null");
            return (Criteria) this;
        }

        public Criteria andA29smEqualTo(String value) {
            addCriterion("a29sm =", value, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA29smNotEqualTo(String value) {
            addCriterion("a29sm <>", value, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA29smGreaterThan(String value) {
            addCriterion("a29sm >", value, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA29smGreaterThanOrEqualTo(String value) {
            addCriterion("a29sm >=", value, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA29smLessThan(String value) {
            addCriterion("a29sm <", value, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA29smLessThanOrEqualTo(String value) {
            addCriterion("a29sm <=", value, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA29smLike(String value) {
            addCriterion("a29sm like", value, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA29smNotLike(String value) {
            addCriterion("a29sm not like", value, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA29smIn(List<String> values) {
            addCriterion("a29sm in", values, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA29smNotIn(List<String> values) {
            addCriterion("a29sm not in", values, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA29smBetween(String value1, String value2) {
            addCriterion("a29sm between", value1, value2, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA29smNotBetween(String value1, String value2) {
            addCriterion("a29sm not between", value1, value2, "a29sm");
            return (Criteria) this;
        }

        public Criteria andA30smIsNull() {
            addCriterion("a30sm is null");
            return (Criteria) this;
        }

        public Criteria andA30smIsNotNull() {
            addCriterion("a30sm is not null");
            return (Criteria) this;
        }

        public Criteria andA30smEqualTo(String value) {
            addCriterion("a30sm =", value, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA30smNotEqualTo(String value) {
            addCriterion("a30sm <>", value, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA30smGreaterThan(String value) {
            addCriterion("a30sm >", value, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA30smGreaterThanOrEqualTo(String value) {
            addCriterion("a30sm >=", value, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA30smLessThan(String value) {
            addCriterion("a30sm <", value, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA30smLessThanOrEqualTo(String value) {
            addCriterion("a30sm <=", value, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA30smLike(String value) {
            addCriterion("a30sm like", value, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA30smNotLike(String value) {
            addCriterion("a30sm not like", value, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA30smIn(List<String> values) {
            addCriterion("a30sm in", values, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA30smNotIn(List<String> values) {
            addCriterion("a30sm not in", values, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA30smBetween(String value1, String value2) {
            addCriterion("a30sm between", value1, value2, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA30smNotBetween(String value1, String value2) {
            addCriterion("a30sm not between", value1, value2, "a30sm");
            return (Criteria) this;
        }

        public Criteria andA31smIsNull() {
            addCriterion("a31sm is null");
            return (Criteria) this;
        }

        public Criteria andA31smIsNotNull() {
            addCriterion("a31sm is not null");
            return (Criteria) this;
        }

        public Criteria andA31smEqualTo(String value) {
            addCriterion("a31sm =", value, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA31smNotEqualTo(String value) {
            addCriterion("a31sm <>", value, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA31smGreaterThan(String value) {
            addCriterion("a31sm >", value, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA31smGreaterThanOrEqualTo(String value) {
            addCriterion("a31sm >=", value, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA31smLessThan(String value) {
            addCriterion("a31sm <", value, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA31smLessThanOrEqualTo(String value) {
            addCriterion("a31sm <=", value, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA31smLike(String value) {
            addCriterion("a31sm like", value, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA31smNotLike(String value) {
            addCriterion("a31sm not like", value, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA31smIn(List<String> values) {
            addCriterion("a31sm in", values, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA31smNotIn(List<String> values) {
            addCriterion("a31sm not in", values, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA31smBetween(String value1, String value2) {
            addCriterion("a31sm between", value1, value2, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA31smNotBetween(String value1, String value2) {
            addCriterion("a31sm not between", value1, value2, "a31sm");
            return (Criteria) this;
        }

        public Criteria andA32smIsNull() {
            addCriterion("a32sm is null");
            return (Criteria) this;
        }

        public Criteria andA32smIsNotNull() {
            addCriterion("a32sm is not null");
            return (Criteria) this;
        }

        public Criteria andA32smEqualTo(String value) {
            addCriterion("a32sm =", value, "a32sm");
            return (Criteria) this;
        }

        public Criteria andA32smNotEqualTo(String value) {
            addCriterion("a32sm <>", value, "a32sm");
            return (Criteria) this;
        }

        public Criteria andA32smGreaterThan(String value) {
            addCriterion("a32sm >", value, "a32sm");
            return (Criteria) this;
        }

        public Criteria andA32smGreaterThanOrEqualTo(String value) {
            addCriterion("a32sm >=", value, "a32sm");
            return (Criteria) this;
        }

        public Criteria andA32smLessThan(String value) {
            addCriterion("a32sm <", value, "a32sm");
            return (Criteria) this;
        }

        public Criteria andA32smLessThanOrEqualTo(String value) {
            addCriterion("a32sm <=", value, "a32sm");
            return (Criteria) this;
        }

        public Criteria andA32smLike(String value) {
            addCriterion("a32sm like", value, "a32sm");
            return (Criteria) this;
        }

        public Criteria andA32smNotLike(String value) {
            addCriterion("a32sm not like", value, "a32sm");
            return (Criteria) this;
        }

        public Criteria andA32smIn(List<String> values) {
            addCriterion("a32sm in", values, "a32sm");
            return (Criteria) this;
        }

        public Criteria andA32smNotIn(List<String> values) {
            addCriterion("a32sm not in", values, "a32sm");
            return (Criteria) this;
        }

        public Criteria andA32smBetween(String value1, String value2) {
            addCriterion("a32sm between", value1, value2, "a32sm");
            return (Criteria) this;
        }

        public Criteria andA32smNotBetween(String value1, String value2) {
            addCriterion("a32sm not between", value1, value2, "a32sm");
            return (Criteria) this;
        }

        public Criteria andB01smIsNull() {
            addCriterion("b01sm is null");
            return (Criteria) this;
        }

        public Criteria andB01smIsNotNull() {
            addCriterion("b01sm is not null");
            return (Criteria) this;
        }

        public Criteria andB01smEqualTo(String value) {
            addCriterion("b01sm =", value, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB01smNotEqualTo(String value) {
            addCriterion("b01sm <>", value, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB01smGreaterThan(String value) {
            addCriterion("b01sm >", value, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB01smGreaterThanOrEqualTo(String value) {
            addCriterion("b01sm >=", value, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB01smLessThan(String value) {
            addCriterion("b01sm <", value, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB01smLessThanOrEqualTo(String value) {
            addCriterion("b01sm <=", value, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB01smLike(String value) {
            addCriterion("b01sm like", value, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB01smNotLike(String value) {
            addCriterion("b01sm not like", value, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB01smIn(List<String> values) {
            addCriterion("b01sm in", values, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB01smNotIn(List<String> values) {
            addCriterion("b01sm not in", values, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB01smBetween(String value1, String value2) {
            addCriterion("b01sm between", value1, value2, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB01smNotBetween(String value1, String value2) {
            addCriterion("b01sm not between", value1, value2, "b01sm");
            return (Criteria) this;
        }

        public Criteria andB02smIsNull() {
            addCriterion("b02sm is null");
            return (Criteria) this;
        }

        public Criteria andB02smIsNotNull() {
            addCriterion("b02sm is not null");
            return (Criteria) this;
        }

        public Criteria andB02smEqualTo(String value) {
            addCriterion("b02sm =", value, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB02smNotEqualTo(String value) {
            addCriterion("b02sm <>", value, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB02smGreaterThan(String value) {
            addCriterion("b02sm >", value, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB02smGreaterThanOrEqualTo(String value) {
            addCriterion("b02sm >=", value, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB02smLessThan(String value) {
            addCriterion("b02sm <", value, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB02smLessThanOrEqualTo(String value) {
            addCriterion("b02sm <=", value, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB02smLike(String value) {
            addCriterion("b02sm like", value, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB02smNotLike(String value) {
            addCriterion("b02sm not like", value, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB02smIn(List<String> values) {
            addCriterion("b02sm in", values, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB02smNotIn(List<String> values) {
            addCriterion("b02sm not in", values, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB02smBetween(String value1, String value2) {
            addCriterion("b02sm between", value1, value2, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB02smNotBetween(String value1, String value2) {
            addCriterion("b02sm not between", value1, value2, "b02sm");
            return (Criteria) this;
        }

        public Criteria andB03smIsNull() {
            addCriterion("b03sm is null");
            return (Criteria) this;
        }

        public Criteria andB03smIsNotNull() {
            addCriterion("b03sm is not null");
            return (Criteria) this;
        }

        public Criteria andB03smEqualTo(String value) {
            addCriterion("b03sm =", value, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB03smNotEqualTo(String value) {
            addCriterion("b03sm <>", value, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB03smGreaterThan(String value) {
            addCriterion("b03sm >", value, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB03smGreaterThanOrEqualTo(String value) {
            addCriterion("b03sm >=", value, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB03smLessThan(String value) {
            addCriterion("b03sm <", value, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB03smLessThanOrEqualTo(String value) {
            addCriterion("b03sm <=", value, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB03smLike(String value) {
            addCriterion("b03sm like", value, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB03smNotLike(String value) {
            addCriterion("b03sm not like", value, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB03smIn(List<String> values) {
            addCriterion("b03sm in", values, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB03smNotIn(List<String> values) {
            addCriterion("b03sm not in", values, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB03smBetween(String value1, String value2) {
            addCriterion("b03sm between", value1, value2, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB03smNotBetween(String value1, String value2) {
            addCriterion("b03sm not between", value1, value2, "b03sm");
            return (Criteria) this;
        }

        public Criteria andB04smIsNull() {
            addCriterion("b04sm is null");
            return (Criteria) this;
        }

        public Criteria andB04smIsNotNull() {
            addCriterion("b04sm is not null");
            return (Criteria) this;
        }

        public Criteria andB04smEqualTo(String value) {
            addCriterion("b04sm =", value, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB04smNotEqualTo(String value) {
            addCriterion("b04sm <>", value, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB04smGreaterThan(String value) {
            addCriterion("b04sm >", value, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB04smGreaterThanOrEqualTo(String value) {
            addCriterion("b04sm >=", value, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB04smLessThan(String value) {
            addCriterion("b04sm <", value, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB04smLessThanOrEqualTo(String value) {
            addCriterion("b04sm <=", value, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB04smLike(String value) {
            addCriterion("b04sm like", value, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB04smNotLike(String value) {
            addCriterion("b04sm not like", value, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB04smIn(List<String> values) {
            addCriterion("b04sm in", values, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB04smNotIn(List<String> values) {
            addCriterion("b04sm not in", values, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB04smBetween(String value1, String value2) {
            addCriterion("b04sm between", value1, value2, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB04smNotBetween(String value1, String value2) {
            addCriterion("b04sm not between", value1, value2, "b04sm");
            return (Criteria) this;
        }

        public Criteria andB05smIsNull() {
            addCriterion("b05sm is null");
            return (Criteria) this;
        }

        public Criteria andB05smIsNotNull() {
            addCriterion("b05sm is not null");
            return (Criteria) this;
        }

        public Criteria andB05smEqualTo(String value) {
            addCriterion("b05sm =", value, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB05smNotEqualTo(String value) {
            addCriterion("b05sm <>", value, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB05smGreaterThan(String value) {
            addCriterion("b05sm >", value, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB05smGreaterThanOrEqualTo(String value) {
            addCriterion("b05sm >=", value, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB05smLessThan(String value) {
            addCriterion("b05sm <", value, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB05smLessThanOrEqualTo(String value) {
            addCriterion("b05sm <=", value, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB05smLike(String value) {
            addCriterion("b05sm like", value, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB05smNotLike(String value) {
            addCriterion("b05sm not like", value, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB05smIn(List<String> values) {
            addCriterion("b05sm in", values, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB05smNotIn(List<String> values) {
            addCriterion("b05sm not in", values, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB05smBetween(String value1, String value2) {
            addCriterion("b05sm between", value1, value2, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB05smNotBetween(String value1, String value2) {
            addCriterion("b05sm not between", value1, value2, "b05sm");
            return (Criteria) this;
        }

        public Criteria andB06smIsNull() {
            addCriterion("b06sm is null");
            return (Criteria) this;
        }

        public Criteria andB06smIsNotNull() {
            addCriterion("b06sm is not null");
            return (Criteria) this;
        }

        public Criteria andB06smEqualTo(String value) {
            addCriterion("b06sm =", value, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB06smNotEqualTo(String value) {
            addCriterion("b06sm <>", value, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB06smGreaterThan(String value) {
            addCriterion("b06sm >", value, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB06smGreaterThanOrEqualTo(String value) {
            addCriterion("b06sm >=", value, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB06smLessThan(String value) {
            addCriterion("b06sm <", value, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB06smLessThanOrEqualTo(String value) {
            addCriterion("b06sm <=", value, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB06smLike(String value) {
            addCriterion("b06sm like", value, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB06smNotLike(String value) {
            addCriterion("b06sm not like", value, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB06smIn(List<String> values) {
            addCriterion("b06sm in", values, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB06smNotIn(List<String> values) {
            addCriterion("b06sm not in", values, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB06smBetween(String value1, String value2) {
            addCriterion("b06sm between", value1, value2, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB06smNotBetween(String value1, String value2) {
            addCriterion("b06sm not between", value1, value2, "b06sm");
            return (Criteria) this;
        }

        public Criteria andB07smIsNull() {
            addCriterion("b07sm is null");
            return (Criteria) this;
        }

        public Criteria andB07smIsNotNull() {
            addCriterion("b07sm is not null");
            return (Criteria) this;
        }

        public Criteria andB07smEqualTo(String value) {
            addCriterion("b07sm =", value, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB07smNotEqualTo(String value) {
            addCriterion("b07sm <>", value, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB07smGreaterThan(String value) {
            addCriterion("b07sm >", value, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB07smGreaterThanOrEqualTo(String value) {
            addCriterion("b07sm >=", value, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB07smLessThan(String value) {
            addCriterion("b07sm <", value, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB07smLessThanOrEqualTo(String value) {
            addCriterion("b07sm <=", value, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB07smLike(String value) {
            addCriterion("b07sm like", value, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB07smNotLike(String value) {
            addCriterion("b07sm not like", value, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB07smIn(List<String> values) {
            addCriterion("b07sm in", values, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB07smNotIn(List<String> values) {
            addCriterion("b07sm not in", values, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB07smBetween(String value1, String value2) {
            addCriterion("b07sm between", value1, value2, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB07smNotBetween(String value1, String value2) {
            addCriterion("b07sm not between", value1, value2, "b07sm");
            return (Criteria) this;
        }

        public Criteria andB08smIsNull() {
            addCriterion("b08sm is null");
            return (Criteria) this;
        }

        public Criteria andB08smIsNotNull() {
            addCriterion("b08sm is not null");
            return (Criteria) this;
        }

        public Criteria andB08smEqualTo(String value) {
            addCriterion("b08sm =", value, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB08smNotEqualTo(String value) {
            addCriterion("b08sm <>", value, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB08smGreaterThan(String value) {
            addCriterion("b08sm >", value, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB08smGreaterThanOrEqualTo(String value) {
            addCriterion("b08sm >=", value, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB08smLessThan(String value) {
            addCriterion("b08sm <", value, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB08smLessThanOrEqualTo(String value) {
            addCriterion("b08sm <=", value, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB08smLike(String value) {
            addCriterion("b08sm like", value, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB08smNotLike(String value) {
            addCriterion("b08sm not like", value, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB08smIn(List<String> values) {
            addCriterion("b08sm in", values, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB08smNotIn(List<String> values) {
            addCriterion("b08sm not in", values, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB08smBetween(String value1, String value2) {
            addCriterion("b08sm between", value1, value2, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB08smNotBetween(String value1, String value2) {
            addCriterion("b08sm not between", value1, value2, "b08sm");
            return (Criteria) this;
        }

        public Criteria andB09smIsNull() {
            addCriterion("b09sm is null");
            return (Criteria) this;
        }

        public Criteria andB09smIsNotNull() {
            addCriterion("b09sm is not null");
            return (Criteria) this;
        }

        public Criteria andB09smEqualTo(String value) {
            addCriterion("b09sm =", value, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB09smNotEqualTo(String value) {
            addCriterion("b09sm <>", value, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB09smGreaterThan(String value) {
            addCriterion("b09sm >", value, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB09smGreaterThanOrEqualTo(String value) {
            addCriterion("b09sm >=", value, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB09smLessThan(String value) {
            addCriterion("b09sm <", value, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB09smLessThanOrEqualTo(String value) {
            addCriterion("b09sm <=", value, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB09smLike(String value) {
            addCriterion("b09sm like", value, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB09smNotLike(String value) {
            addCriterion("b09sm not like", value, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB09smIn(List<String> values) {
            addCriterion("b09sm in", values, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB09smNotIn(List<String> values) {
            addCriterion("b09sm not in", values, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB09smBetween(String value1, String value2) {
            addCriterion("b09sm between", value1, value2, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB09smNotBetween(String value1, String value2) {
            addCriterion("b09sm not between", value1, value2, "b09sm");
            return (Criteria) this;
        }

        public Criteria andB10smIsNull() {
            addCriterion("b10sm is null");
            return (Criteria) this;
        }

        public Criteria andB10smIsNotNull() {
            addCriterion("b10sm is not null");
            return (Criteria) this;
        }

        public Criteria andB10smEqualTo(String value) {
            addCriterion("b10sm =", value, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB10smNotEqualTo(String value) {
            addCriterion("b10sm <>", value, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB10smGreaterThan(String value) {
            addCriterion("b10sm >", value, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB10smGreaterThanOrEqualTo(String value) {
            addCriterion("b10sm >=", value, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB10smLessThan(String value) {
            addCriterion("b10sm <", value, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB10smLessThanOrEqualTo(String value) {
            addCriterion("b10sm <=", value, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB10smLike(String value) {
            addCriterion("b10sm like", value, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB10smNotLike(String value) {
            addCriterion("b10sm not like", value, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB10smIn(List<String> values) {
            addCriterion("b10sm in", values, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB10smNotIn(List<String> values) {
            addCriterion("b10sm not in", values, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB10smBetween(String value1, String value2) {
            addCriterion("b10sm between", value1, value2, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB10smNotBetween(String value1, String value2) {
            addCriterion("b10sm not between", value1, value2, "b10sm");
            return (Criteria) this;
        }

        public Criteria andB11smIsNull() {
            addCriterion("b11sm is null");
            return (Criteria) this;
        }

        public Criteria andB11smIsNotNull() {
            addCriterion("b11sm is not null");
            return (Criteria) this;
        }

        public Criteria andB11smEqualTo(String value) {
            addCriterion("b11sm =", value, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB11smNotEqualTo(String value) {
            addCriterion("b11sm <>", value, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB11smGreaterThan(String value) {
            addCriterion("b11sm >", value, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB11smGreaterThanOrEqualTo(String value) {
            addCriterion("b11sm >=", value, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB11smLessThan(String value) {
            addCriterion("b11sm <", value, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB11smLessThanOrEqualTo(String value) {
            addCriterion("b11sm <=", value, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB11smLike(String value) {
            addCriterion("b11sm like", value, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB11smNotLike(String value) {
            addCriterion("b11sm not like", value, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB11smIn(List<String> values) {
            addCriterion("b11sm in", values, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB11smNotIn(List<String> values) {
            addCriterion("b11sm not in", values, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB11smBetween(String value1, String value2) {
            addCriterion("b11sm between", value1, value2, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB11smNotBetween(String value1, String value2) {
            addCriterion("b11sm not between", value1, value2, "b11sm");
            return (Criteria) this;
        }

        public Criteria andB12smIsNull() {
            addCriterion("b12sm is null");
            return (Criteria) this;
        }

        public Criteria andB12smIsNotNull() {
            addCriterion("b12sm is not null");
            return (Criteria) this;
        }

        public Criteria andB12smEqualTo(String value) {
            addCriterion("b12sm =", value, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB12smNotEqualTo(String value) {
            addCriterion("b12sm <>", value, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB12smGreaterThan(String value) {
            addCriterion("b12sm >", value, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB12smGreaterThanOrEqualTo(String value) {
            addCriterion("b12sm >=", value, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB12smLessThan(String value) {
            addCriterion("b12sm <", value, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB12smLessThanOrEqualTo(String value) {
            addCriterion("b12sm <=", value, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB12smLike(String value) {
            addCriterion("b12sm like", value, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB12smNotLike(String value) {
            addCriterion("b12sm not like", value, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB12smIn(List<String> values) {
            addCriterion("b12sm in", values, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB12smNotIn(List<String> values) {
            addCriterion("b12sm not in", values, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB12smBetween(String value1, String value2) {
            addCriterion("b12sm between", value1, value2, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB12smNotBetween(String value1, String value2) {
            addCriterion("b12sm not between", value1, value2, "b12sm");
            return (Criteria) this;
        }

        public Criteria andB13smIsNull() {
            addCriterion("b13sm is null");
            return (Criteria) this;
        }

        public Criteria andB13smIsNotNull() {
            addCriterion("b13sm is not null");
            return (Criteria) this;
        }

        public Criteria andB13smEqualTo(String value) {
            addCriterion("b13sm =", value, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB13smNotEqualTo(String value) {
            addCriterion("b13sm <>", value, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB13smGreaterThan(String value) {
            addCriterion("b13sm >", value, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB13smGreaterThanOrEqualTo(String value) {
            addCriterion("b13sm >=", value, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB13smLessThan(String value) {
            addCriterion("b13sm <", value, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB13smLessThanOrEqualTo(String value) {
            addCriterion("b13sm <=", value, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB13smLike(String value) {
            addCriterion("b13sm like", value, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB13smNotLike(String value) {
            addCriterion("b13sm not like", value, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB13smIn(List<String> values) {
            addCriterion("b13sm in", values, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB13smNotIn(List<String> values) {
            addCriterion("b13sm not in", values, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB13smBetween(String value1, String value2) {
            addCriterion("b13sm between", value1, value2, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB13smNotBetween(String value1, String value2) {
            addCriterion("b13sm not between", value1, value2, "b13sm");
            return (Criteria) this;
        }

        public Criteria andB14smIsNull() {
            addCriterion("b14sm is null");
            return (Criteria) this;
        }

        public Criteria andB14smIsNotNull() {
            addCriterion("b14sm is not null");
            return (Criteria) this;
        }

        public Criteria andB14smEqualTo(String value) {
            addCriterion("b14sm =", value, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB14smNotEqualTo(String value) {
            addCriterion("b14sm <>", value, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB14smGreaterThan(String value) {
            addCriterion("b14sm >", value, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB14smGreaterThanOrEqualTo(String value) {
            addCriterion("b14sm >=", value, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB14smLessThan(String value) {
            addCriterion("b14sm <", value, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB14smLessThanOrEqualTo(String value) {
            addCriterion("b14sm <=", value, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB14smLike(String value) {
            addCriterion("b14sm like", value, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB14smNotLike(String value) {
            addCriterion("b14sm not like", value, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB14smIn(List<String> values) {
            addCriterion("b14sm in", values, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB14smNotIn(List<String> values) {
            addCriterion("b14sm not in", values, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB14smBetween(String value1, String value2) {
            addCriterion("b14sm between", value1, value2, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB14smNotBetween(String value1, String value2) {
            addCriterion("b14sm not between", value1, value2, "b14sm");
            return (Criteria) this;
        }

        public Criteria andB15smIsNull() {
            addCriterion("b15sm is null");
            return (Criteria) this;
        }

        public Criteria andB15smIsNotNull() {
            addCriterion("b15sm is not null");
            return (Criteria) this;
        }

        public Criteria andB15smEqualTo(String value) {
            addCriterion("b15sm =", value, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB15smNotEqualTo(String value) {
            addCriterion("b15sm <>", value, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB15smGreaterThan(String value) {
            addCriterion("b15sm >", value, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB15smGreaterThanOrEqualTo(String value) {
            addCriterion("b15sm >=", value, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB15smLessThan(String value) {
            addCriterion("b15sm <", value, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB15smLessThanOrEqualTo(String value) {
            addCriterion("b15sm <=", value, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB15smLike(String value) {
            addCriterion("b15sm like", value, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB15smNotLike(String value) {
            addCriterion("b15sm not like", value, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB15smIn(List<String> values) {
            addCriterion("b15sm in", values, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB15smNotIn(List<String> values) {
            addCriterion("b15sm not in", values, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB15smBetween(String value1, String value2) {
            addCriterion("b15sm between", value1, value2, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB15smNotBetween(String value1, String value2) {
            addCriterion("b15sm not between", value1, value2, "b15sm");
            return (Criteria) this;
        }

        public Criteria andB16smIsNull() {
            addCriterion("b16sm is null");
            return (Criteria) this;
        }

        public Criteria andB16smIsNotNull() {
            addCriterion("b16sm is not null");
            return (Criteria) this;
        }

        public Criteria andB16smEqualTo(String value) {
            addCriterion("b16sm =", value, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB16smNotEqualTo(String value) {
            addCriterion("b16sm <>", value, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB16smGreaterThan(String value) {
            addCriterion("b16sm >", value, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB16smGreaterThanOrEqualTo(String value) {
            addCriterion("b16sm >=", value, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB16smLessThan(String value) {
            addCriterion("b16sm <", value, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB16smLessThanOrEqualTo(String value) {
            addCriterion("b16sm <=", value, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB16smLike(String value) {
            addCriterion("b16sm like", value, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB16smNotLike(String value) {
            addCriterion("b16sm not like", value, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB16smIn(List<String> values) {
            addCriterion("b16sm in", values, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB16smNotIn(List<String> values) {
            addCriterion("b16sm not in", values, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB16smBetween(String value1, String value2) {
            addCriterion("b16sm between", value1, value2, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB16smNotBetween(String value1, String value2) {
            addCriterion("b16sm not between", value1, value2, "b16sm");
            return (Criteria) this;
        }

        public Criteria andB17smIsNull() {
            addCriterion("b17sm is null");
            return (Criteria) this;
        }

        public Criteria andB17smIsNotNull() {
            addCriterion("b17sm is not null");
            return (Criteria) this;
        }

        public Criteria andB17smEqualTo(String value) {
            addCriterion("b17sm =", value, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB17smNotEqualTo(String value) {
            addCriterion("b17sm <>", value, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB17smGreaterThan(String value) {
            addCriterion("b17sm >", value, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB17smGreaterThanOrEqualTo(String value) {
            addCriterion("b17sm >=", value, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB17smLessThan(String value) {
            addCriterion("b17sm <", value, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB17smLessThanOrEqualTo(String value) {
            addCriterion("b17sm <=", value, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB17smLike(String value) {
            addCriterion("b17sm like", value, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB17smNotLike(String value) {
            addCriterion("b17sm not like", value, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB17smIn(List<String> values) {
            addCriterion("b17sm in", values, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB17smNotIn(List<String> values) {
            addCriterion("b17sm not in", values, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB17smBetween(String value1, String value2) {
            addCriterion("b17sm between", value1, value2, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB17smNotBetween(String value1, String value2) {
            addCriterion("b17sm not between", value1, value2, "b17sm");
            return (Criteria) this;
        }

        public Criteria andB18smIsNull() {
            addCriterion("b18sm is null");
            return (Criteria) this;
        }

        public Criteria andB18smIsNotNull() {
            addCriterion("b18sm is not null");
            return (Criteria) this;
        }

        public Criteria andB18smEqualTo(String value) {
            addCriterion("b18sm =", value, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB18smNotEqualTo(String value) {
            addCriterion("b18sm <>", value, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB18smGreaterThan(String value) {
            addCriterion("b18sm >", value, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB18smGreaterThanOrEqualTo(String value) {
            addCriterion("b18sm >=", value, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB18smLessThan(String value) {
            addCriterion("b18sm <", value, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB18smLessThanOrEqualTo(String value) {
            addCriterion("b18sm <=", value, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB18smLike(String value) {
            addCriterion("b18sm like", value, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB18smNotLike(String value) {
            addCriterion("b18sm not like", value, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB18smIn(List<String> values) {
            addCriterion("b18sm in", values, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB18smNotIn(List<String> values) {
            addCriterion("b18sm not in", values, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB18smBetween(String value1, String value2) {
            addCriterion("b18sm between", value1, value2, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB18smNotBetween(String value1, String value2) {
            addCriterion("b18sm not between", value1, value2, "b18sm");
            return (Criteria) this;
        }

        public Criteria andB19smIsNull() {
            addCriterion("b19sm is null");
            return (Criteria) this;
        }

        public Criteria andB19smIsNotNull() {
            addCriterion("b19sm is not null");
            return (Criteria) this;
        }

        public Criteria andB19smEqualTo(String value) {
            addCriterion("b19sm =", value, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB19smNotEqualTo(String value) {
            addCriterion("b19sm <>", value, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB19smGreaterThan(String value) {
            addCriterion("b19sm >", value, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB19smGreaterThanOrEqualTo(String value) {
            addCriterion("b19sm >=", value, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB19smLessThan(String value) {
            addCriterion("b19sm <", value, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB19smLessThanOrEqualTo(String value) {
            addCriterion("b19sm <=", value, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB19smLike(String value) {
            addCriterion("b19sm like", value, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB19smNotLike(String value) {
            addCriterion("b19sm not like", value, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB19smIn(List<String> values) {
            addCriterion("b19sm in", values, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB19smNotIn(List<String> values) {
            addCriterion("b19sm not in", values, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB19smBetween(String value1, String value2) {
            addCriterion("b19sm between", value1, value2, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB19smNotBetween(String value1, String value2) {
            addCriterion("b19sm not between", value1, value2, "b19sm");
            return (Criteria) this;
        }

        public Criteria andB20smIsNull() {
            addCriterion("b20sm is null");
            return (Criteria) this;
        }

        public Criteria andB20smIsNotNull() {
            addCriterion("b20sm is not null");
            return (Criteria) this;
        }

        public Criteria andB20smEqualTo(String value) {
            addCriterion("b20sm =", value, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB20smNotEqualTo(String value) {
            addCriterion("b20sm <>", value, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB20smGreaterThan(String value) {
            addCriterion("b20sm >", value, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB20smGreaterThanOrEqualTo(String value) {
            addCriterion("b20sm >=", value, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB20smLessThan(String value) {
            addCriterion("b20sm <", value, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB20smLessThanOrEqualTo(String value) {
            addCriterion("b20sm <=", value, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB20smLike(String value) {
            addCriterion("b20sm like", value, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB20smNotLike(String value) {
            addCriterion("b20sm not like", value, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB20smIn(List<String> values) {
            addCriterion("b20sm in", values, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB20smNotIn(List<String> values) {
            addCriterion("b20sm not in", values, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB20smBetween(String value1, String value2) {
            addCriterion("b20sm between", value1, value2, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB20smNotBetween(String value1, String value2) {
            addCriterion("b20sm not between", value1, value2, "b20sm");
            return (Criteria) this;
        }

        public Criteria andB21smIsNull() {
            addCriterion("b21sm is null");
            return (Criteria) this;
        }

        public Criteria andB21smIsNotNull() {
            addCriterion("b21sm is not null");
            return (Criteria) this;
        }

        public Criteria andB21smEqualTo(String value) {
            addCriterion("b21sm =", value, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB21smNotEqualTo(String value) {
            addCriterion("b21sm <>", value, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB21smGreaterThan(String value) {
            addCriterion("b21sm >", value, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB21smGreaterThanOrEqualTo(String value) {
            addCriterion("b21sm >=", value, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB21smLessThan(String value) {
            addCriterion("b21sm <", value, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB21smLessThanOrEqualTo(String value) {
            addCriterion("b21sm <=", value, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB21smLike(String value) {
            addCriterion("b21sm like", value, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB21smNotLike(String value) {
            addCriterion("b21sm not like", value, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB21smIn(List<String> values) {
            addCriterion("b21sm in", values, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB21smNotIn(List<String> values) {
            addCriterion("b21sm not in", values, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB21smBetween(String value1, String value2) {
            addCriterion("b21sm between", value1, value2, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB21smNotBetween(String value1, String value2) {
            addCriterion("b21sm not between", value1, value2, "b21sm");
            return (Criteria) this;
        }

        public Criteria andB22smIsNull() {
            addCriterion("b22sm is null");
            return (Criteria) this;
        }

        public Criteria andB22smIsNotNull() {
            addCriterion("b22sm is not null");
            return (Criteria) this;
        }

        public Criteria andB22smEqualTo(String value) {
            addCriterion("b22sm =", value, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB22smNotEqualTo(String value) {
            addCriterion("b22sm <>", value, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB22smGreaterThan(String value) {
            addCriterion("b22sm >", value, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB22smGreaterThanOrEqualTo(String value) {
            addCriterion("b22sm >=", value, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB22smLessThan(String value) {
            addCriterion("b22sm <", value, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB22smLessThanOrEqualTo(String value) {
            addCriterion("b22sm <=", value, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB22smLike(String value) {
            addCriterion("b22sm like", value, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB22smNotLike(String value) {
            addCriterion("b22sm not like", value, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB22smIn(List<String> values) {
            addCriterion("b22sm in", values, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB22smNotIn(List<String> values) {
            addCriterion("b22sm not in", values, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB22smBetween(String value1, String value2) {
            addCriterion("b22sm between", value1, value2, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB22smNotBetween(String value1, String value2) {
            addCriterion("b22sm not between", value1, value2, "b22sm");
            return (Criteria) this;
        }

        public Criteria andB23smIsNull() {
            addCriterion("b23sm is null");
            return (Criteria) this;
        }

        public Criteria andB23smIsNotNull() {
            addCriterion("b23sm is not null");
            return (Criteria) this;
        }

        public Criteria andB23smEqualTo(String value) {
            addCriterion("b23sm =", value, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB23smNotEqualTo(String value) {
            addCriterion("b23sm <>", value, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB23smGreaterThan(String value) {
            addCriterion("b23sm >", value, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB23smGreaterThanOrEqualTo(String value) {
            addCriterion("b23sm >=", value, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB23smLessThan(String value) {
            addCriterion("b23sm <", value, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB23smLessThanOrEqualTo(String value) {
            addCriterion("b23sm <=", value, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB23smLike(String value) {
            addCriterion("b23sm like", value, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB23smNotLike(String value) {
            addCriterion("b23sm not like", value, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB23smIn(List<String> values) {
            addCriterion("b23sm in", values, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB23smNotIn(List<String> values) {
            addCriterion("b23sm not in", values, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB23smBetween(String value1, String value2) {
            addCriterion("b23sm between", value1, value2, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB23smNotBetween(String value1, String value2) {
            addCriterion("b23sm not between", value1, value2, "b23sm");
            return (Criteria) this;
        }

        public Criteria andB24smIsNull() {
            addCriterion("b24sm is null");
            return (Criteria) this;
        }

        public Criteria andB24smIsNotNull() {
            addCriterion("b24sm is not null");
            return (Criteria) this;
        }

        public Criteria andB24smEqualTo(String value) {
            addCriterion("b24sm =", value, "b24sm");
            return (Criteria) this;
        }

        public Criteria andB24smNotEqualTo(String value) {
            addCriterion("b24sm <>", value, "b24sm");
            return (Criteria) this;
        }

        public Criteria andB24smGreaterThan(String value) {
            addCriterion("b24sm >", value, "b24sm");
            return (Criteria) this;
        }

        public Criteria andB24smGreaterThanOrEqualTo(String value) {
            addCriterion("b24sm >=", value, "b24sm");
            return (Criteria) this;
        }

        public Criteria andB24smLessThan(String value) {
            addCriterion("b24sm <", value, "b24sm");
            return (Criteria) this;
        }

        public Criteria andB24smLessThanOrEqualTo(String value) {
            addCriterion("b24sm <=", value, "b24sm");
            return (Criteria) this;
        }

        public Criteria andB24smLike(String value) {
            addCriterion("b24sm like", value, "b24sm");
            return (Criteria) this;
        }

        public Criteria andB24smNotLike(String value) {
            addCriterion("b24sm not like", value, "b24sm");
            return (Criteria) this;
        }

        public Criteria andB24smIn(List<String> values) {
            addCriterion("b24sm in", values, "b24sm");
            return (Criteria) this;
        }

        public Criteria andB24smNotIn(List<String> values) {
            addCriterion("b24sm not in", values, "b24sm");
            return (Criteria) this;
        }

        public Criteria andB24smBetween(String value1, String value2) {
            addCriterion("b24sm between", value1, value2, "b24sm");
            return (Criteria) this;
        }

        public Criteria andB24smNotBetween(String value1, String value2) {
            addCriterion("b24sm not between", value1, value2, "b24sm");
            return (Criteria) this;
        }

        public Criteria andC01smIsNull() {
            addCriterion("c01sm is null");
            return (Criteria) this;
        }

        public Criteria andC01smIsNotNull() {
            addCriterion("c01sm is not null");
            return (Criteria) this;
        }

        public Criteria andC01smEqualTo(String value) {
            addCriterion("c01sm =", value, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC01smNotEqualTo(String value) {
            addCriterion("c01sm <>", value, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC01smGreaterThan(String value) {
            addCriterion("c01sm >", value, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC01smGreaterThanOrEqualTo(String value) {
            addCriterion("c01sm >=", value, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC01smLessThan(String value) {
            addCriterion("c01sm <", value, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC01smLessThanOrEqualTo(String value) {
            addCriterion("c01sm <=", value, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC01smLike(String value) {
            addCriterion("c01sm like", value, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC01smNotLike(String value) {
            addCriterion("c01sm not like", value, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC01smIn(List<String> values) {
            addCriterion("c01sm in", values, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC01smNotIn(List<String> values) {
            addCriterion("c01sm not in", values, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC01smBetween(String value1, String value2) {
            addCriterion("c01sm between", value1, value2, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC01smNotBetween(String value1, String value2) {
            addCriterion("c01sm not between", value1, value2, "c01sm");
            return (Criteria) this;
        }

        public Criteria andC02smIsNull() {
            addCriterion("c02sm is null");
            return (Criteria) this;
        }

        public Criteria andC02smIsNotNull() {
            addCriterion("c02sm is not null");
            return (Criteria) this;
        }

        public Criteria andC02smEqualTo(String value) {
            addCriterion("c02sm =", value, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC02smNotEqualTo(String value) {
            addCriterion("c02sm <>", value, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC02smGreaterThan(String value) {
            addCriterion("c02sm >", value, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC02smGreaterThanOrEqualTo(String value) {
            addCriterion("c02sm >=", value, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC02smLessThan(String value) {
            addCriterion("c02sm <", value, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC02smLessThanOrEqualTo(String value) {
            addCriterion("c02sm <=", value, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC02smLike(String value) {
            addCriterion("c02sm like", value, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC02smNotLike(String value) {
            addCriterion("c02sm not like", value, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC02smIn(List<String> values) {
            addCriterion("c02sm in", values, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC02smNotIn(List<String> values) {
            addCriterion("c02sm not in", values, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC02smBetween(String value1, String value2) {
            addCriterion("c02sm between", value1, value2, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC02smNotBetween(String value1, String value2) {
            addCriterion("c02sm not between", value1, value2, "c02sm");
            return (Criteria) this;
        }

        public Criteria andC03smIsNull() {
            addCriterion("c03sm is null");
            return (Criteria) this;
        }

        public Criteria andC03smIsNotNull() {
            addCriterion("c03sm is not null");
            return (Criteria) this;
        }

        public Criteria andC03smEqualTo(String value) {
            addCriterion("c03sm =", value, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC03smNotEqualTo(String value) {
            addCriterion("c03sm <>", value, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC03smGreaterThan(String value) {
            addCriterion("c03sm >", value, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC03smGreaterThanOrEqualTo(String value) {
            addCriterion("c03sm >=", value, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC03smLessThan(String value) {
            addCriterion("c03sm <", value, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC03smLessThanOrEqualTo(String value) {
            addCriterion("c03sm <=", value, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC03smLike(String value) {
            addCriterion("c03sm like", value, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC03smNotLike(String value) {
            addCriterion("c03sm not like", value, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC03smIn(List<String> values) {
            addCriterion("c03sm in", values, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC03smNotIn(List<String> values) {
            addCriterion("c03sm not in", values, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC03smBetween(String value1, String value2) {
            addCriterion("c03sm between", value1, value2, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC03smNotBetween(String value1, String value2) {
            addCriterion("c03sm not between", value1, value2, "c03sm");
            return (Criteria) this;
        }

        public Criteria andC04smIsNull() {
            addCriterion("c04sm is null");
            return (Criteria) this;
        }

        public Criteria andC04smIsNotNull() {
            addCriterion("c04sm is not null");
            return (Criteria) this;
        }

        public Criteria andC04smEqualTo(String value) {
            addCriterion("c04sm =", value, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC04smNotEqualTo(String value) {
            addCriterion("c04sm <>", value, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC04smGreaterThan(String value) {
            addCriterion("c04sm >", value, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC04smGreaterThanOrEqualTo(String value) {
            addCriterion("c04sm >=", value, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC04smLessThan(String value) {
            addCriterion("c04sm <", value, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC04smLessThanOrEqualTo(String value) {
            addCriterion("c04sm <=", value, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC04smLike(String value) {
            addCriterion("c04sm like", value, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC04smNotLike(String value) {
            addCriterion("c04sm not like", value, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC04smIn(List<String> values) {
            addCriterion("c04sm in", values, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC04smNotIn(List<String> values) {
            addCriterion("c04sm not in", values, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC04smBetween(String value1, String value2) {
            addCriterion("c04sm between", value1, value2, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC04smNotBetween(String value1, String value2) {
            addCriterion("c04sm not between", value1, value2, "c04sm");
            return (Criteria) this;
        }

        public Criteria andC05smIsNull() {
            addCriterion("c05sm is null");
            return (Criteria) this;
        }

        public Criteria andC05smIsNotNull() {
            addCriterion("c05sm is not null");
            return (Criteria) this;
        }

        public Criteria andC05smEqualTo(String value) {
            addCriterion("c05sm =", value, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC05smNotEqualTo(String value) {
            addCriterion("c05sm <>", value, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC05smGreaterThan(String value) {
            addCriterion("c05sm >", value, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC05smGreaterThanOrEqualTo(String value) {
            addCriterion("c05sm >=", value, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC05smLessThan(String value) {
            addCriterion("c05sm <", value, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC05smLessThanOrEqualTo(String value) {
            addCriterion("c05sm <=", value, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC05smLike(String value) {
            addCriterion("c05sm like", value, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC05smNotLike(String value) {
            addCriterion("c05sm not like", value, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC05smIn(List<String> values) {
            addCriterion("c05sm in", values, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC05smNotIn(List<String> values) {
            addCriterion("c05sm not in", values, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC05smBetween(String value1, String value2) {
            addCriterion("c05sm between", value1, value2, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC05smNotBetween(String value1, String value2) {
            addCriterion("c05sm not between", value1, value2, "c05sm");
            return (Criteria) this;
        }

        public Criteria andC06smIsNull() {
            addCriterion("c06sm is null");
            return (Criteria) this;
        }

        public Criteria andC06smIsNotNull() {
            addCriterion("c06sm is not null");
            return (Criteria) this;
        }

        public Criteria andC06smEqualTo(String value) {
            addCriterion("c06sm =", value, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC06smNotEqualTo(String value) {
            addCriterion("c06sm <>", value, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC06smGreaterThan(String value) {
            addCriterion("c06sm >", value, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC06smGreaterThanOrEqualTo(String value) {
            addCriterion("c06sm >=", value, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC06smLessThan(String value) {
            addCriterion("c06sm <", value, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC06smLessThanOrEqualTo(String value) {
            addCriterion("c06sm <=", value, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC06smLike(String value) {
            addCriterion("c06sm like", value, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC06smNotLike(String value) {
            addCriterion("c06sm not like", value, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC06smIn(List<String> values) {
            addCriterion("c06sm in", values, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC06smNotIn(List<String> values) {
            addCriterion("c06sm not in", values, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC06smBetween(String value1, String value2) {
            addCriterion("c06sm between", value1, value2, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC06smNotBetween(String value1, String value2) {
            addCriterion("c06sm not between", value1, value2, "c06sm");
            return (Criteria) this;
        }

        public Criteria andC07smIsNull() {
            addCriterion("c07sm is null");
            return (Criteria) this;
        }

        public Criteria andC07smIsNotNull() {
            addCriterion("c07sm is not null");
            return (Criteria) this;
        }

        public Criteria andC07smEqualTo(String value) {
            addCriterion("c07sm =", value, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC07smNotEqualTo(String value) {
            addCriterion("c07sm <>", value, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC07smGreaterThan(String value) {
            addCriterion("c07sm >", value, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC07smGreaterThanOrEqualTo(String value) {
            addCriterion("c07sm >=", value, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC07smLessThan(String value) {
            addCriterion("c07sm <", value, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC07smLessThanOrEqualTo(String value) {
            addCriterion("c07sm <=", value, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC07smLike(String value) {
            addCriterion("c07sm like", value, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC07smNotLike(String value) {
            addCriterion("c07sm not like", value, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC07smIn(List<String> values) {
            addCriterion("c07sm in", values, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC07smNotIn(List<String> values) {
            addCriterion("c07sm not in", values, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC07smBetween(String value1, String value2) {
            addCriterion("c07sm between", value1, value2, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC07smNotBetween(String value1, String value2) {
            addCriterion("c07sm not between", value1, value2, "c07sm");
            return (Criteria) this;
        }

        public Criteria andC08smIsNull() {
            addCriterion("c08sm is null");
            return (Criteria) this;
        }

        public Criteria andC08smIsNotNull() {
            addCriterion("c08sm is not null");
            return (Criteria) this;
        }

        public Criteria andC08smEqualTo(String value) {
            addCriterion("c08sm =", value, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC08smNotEqualTo(String value) {
            addCriterion("c08sm <>", value, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC08smGreaterThan(String value) {
            addCriterion("c08sm >", value, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC08smGreaterThanOrEqualTo(String value) {
            addCriterion("c08sm >=", value, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC08smLessThan(String value) {
            addCriterion("c08sm <", value, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC08smLessThanOrEqualTo(String value) {
            addCriterion("c08sm <=", value, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC08smLike(String value) {
            addCriterion("c08sm like", value, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC08smNotLike(String value) {
            addCriterion("c08sm not like", value, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC08smIn(List<String> values) {
            addCriterion("c08sm in", values, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC08smNotIn(List<String> values) {
            addCriterion("c08sm not in", values, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC08smBetween(String value1, String value2) {
            addCriterion("c08sm between", value1, value2, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC08smNotBetween(String value1, String value2) {
            addCriterion("c08sm not between", value1, value2, "c08sm");
            return (Criteria) this;
        }

        public Criteria andC09smIsNull() {
            addCriterion("c09sm is null");
            return (Criteria) this;
        }

        public Criteria andC09smIsNotNull() {
            addCriterion("c09sm is not null");
            return (Criteria) this;
        }

        public Criteria andC09smEqualTo(String value) {
            addCriterion("c09sm =", value, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC09smNotEqualTo(String value) {
            addCriterion("c09sm <>", value, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC09smGreaterThan(String value) {
            addCriterion("c09sm >", value, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC09smGreaterThanOrEqualTo(String value) {
            addCriterion("c09sm >=", value, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC09smLessThan(String value) {
            addCriterion("c09sm <", value, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC09smLessThanOrEqualTo(String value) {
            addCriterion("c09sm <=", value, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC09smLike(String value) {
            addCriterion("c09sm like", value, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC09smNotLike(String value) {
            addCriterion("c09sm not like", value, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC09smIn(List<String> values) {
            addCriterion("c09sm in", values, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC09smNotIn(List<String> values) {
            addCriterion("c09sm not in", values, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC09smBetween(String value1, String value2) {
            addCriterion("c09sm between", value1, value2, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC09smNotBetween(String value1, String value2) {
            addCriterion("c09sm not between", value1, value2, "c09sm");
            return (Criteria) this;
        }

        public Criteria andC10smIsNull() {
            addCriterion("c10sm is null");
            return (Criteria) this;
        }

        public Criteria andC10smIsNotNull() {
            addCriterion("c10sm is not null");
            return (Criteria) this;
        }

        public Criteria andC10smEqualTo(String value) {
            addCriterion("c10sm =", value, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC10smNotEqualTo(String value) {
            addCriterion("c10sm <>", value, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC10smGreaterThan(String value) {
            addCriterion("c10sm >", value, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC10smGreaterThanOrEqualTo(String value) {
            addCriterion("c10sm >=", value, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC10smLessThan(String value) {
            addCriterion("c10sm <", value, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC10smLessThanOrEqualTo(String value) {
            addCriterion("c10sm <=", value, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC10smLike(String value) {
            addCriterion("c10sm like", value, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC10smNotLike(String value) {
            addCriterion("c10sm not like", value, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC10smIn(List<String> values) {
            addCriterion("c10sm in", values, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC10smNotIn(List<String> values) {
            addCriterion("c10sm not in", values, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC10smBetween(String value1, String value2) {
            addCriterion("c10sm between", value1, value2, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC10smNotBetween(String value1, String value2) {
            addCriterion("c10sm not between", value1, value2, "c10sm");
            return (Criteria) this;
        }

        public Criteria andC11smIsNull() {
            addCriterion("c11sm is null");
            return (Criteria) this;
        }

        public Criteria andC11smIsNotNull() {
            addCriterion("c11sm is not null");
            return (Criteria) this;
        }

        public Criteria andC11smEqualTo(String value) {
            addCriterion("c11sm =", value, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC11smNotEqualTo(String value) {
            addCriterion("c11sm <>", value, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC11smGreaterThan(String value) {
            addCriterion("c11sm >", value, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC11smGreaterThanOrEqualTo(String value) {
            addCriterion("c11sm >=", value, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC11smLessThan(String value) {
            addCriterion("c11sm <", value, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC11smLessThanOrEqualTo(String value) {
            addCriterion("c11sm <=", value, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC11smLike(String value) {
            addCriterion("c11sm like", value, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC11smNotLike(String value) {
            addCriterion("c11sm not like", value, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC11smIn(List<String> values) {
            addCriterion("c11sm in", values, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC11smNotIn(List<String> values) {
            addCriterion("c11sm not in", values, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC11smBetween(String value1, String value2) {
            addCriterion("c11sm between", value1, value2, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC11smNotBetween(String value1, String value2) {
            addCriterion("c11sm not between", value1, value2, "c11sm");
            return (Criteria) this;
        }

        public Criteria andC12smIsNull() {
            addCriterion("c12sm is null");
            return (Criteria) this;
        }

        public Criteria andC12smIsNotNull() {
            addCriterion("c12sm is not null");
            return (Criteria) this;
        }

        public Criteria andC12smEqualTo(String value) {
            addCriterion("c12sm =", value, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC12smNotEqualTo(String value) {
            addCriterion("c12sm <>", value, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC12smGreaterThan(String value) {
            addCriterion("c12sm >", value, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC12smGreaterThanOrEqualTo(String value) {
            addCriterion("c12sm >=", value, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC12smLessThan(String value) {
            addCriterion("c12sm <", value, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC12smLessThanOrEqualTo(String value) {
            addCriterion("c12sm <=", value, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC12smLike(String value) {
            addCriterion("c12sm like", value, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC12smNotLike(String value) {
            addCriterion("c12sm not like", value, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC12smIn(List<String> values) {
            addCriterion("c12sm in", values, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC12smNotIn(List<String> values) {
            addCriterion("c12sm not in", values, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC12smBetween(String value1, String value2) {
            addCriterion("c12sm between", value1, value2, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC12smNotBetween(String value1, String value2) {
            addCriterion("c12sm not between", value1, value2, "c12sm");
            return (Criteria) this;
        }

        public Criteria andC13smIsNull() {
            addCriterion("c13sm is null");
            return (Criteria) this;
        }

        public Criteria andC13smIsNotNull() {
            addCriterion("c13sm is not null");
            return (Criteria) this;
        }

        public Criteria andC13smEqualTo(String value) {
            addCriterion("c13sm =", value, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC13smNotEqualTo(String value) {
            addCriterion("c13sm <>", value, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC13smGreaterThan(String value) {
            addCriterion("c13sm >", value, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC13smGreaterThanOrEqualTo(String value) {
            addCriterion("c13sm >=", value, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC13smLessThan(String value) {
            addCriterion("c13sm <", value, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC13smLessThanOrEqualTo(String value) {
            addCriterion("c13sm <=", value, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC13smLike(String value) {
            addCriterion("c13sm like", value, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC13smNotLike(String value) {
            addCriterion("c13sm not like", value, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC13smIn(List<String> values) {
            addCriterion("c13sm in", values, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC13smNotIn(List<String> values) {
            addCriterion("c13sm not in", values, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC13smBetween(String value1, String value2) {
            addCriterion("c13sm between", value1, value2, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC13smNotBetween(String value1, String value2) {
            addCriterion("c13sm not between", value1, value2, "c13sm");
            return (Criteria) this;
        }

        public Criteria andC14smIsNull() {
            addCriterion("c14sm is null");
            return (Criteria) this;
        }

        public Criteria andC14smIsNotNull() {
            addCriterion("c14sm is not null");
            return (Criteria) this;
        }

        public Criteria andC14smEqualTo(String value) {
            addCriterion("c14sm =", value, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC14smNotEqualTo(String value) {
            addCriterion("c14sm <>", value, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC14smGreaterThan(String value) {
            addCriterion("c14sm >", value, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC14smGreaterThanOrEqualTo(String value) {
            addCriterion("c14sm >=", value, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC14smLessThan(String value) {
            addCriterion("c14sm <", value, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC14smLessThanOrEqualTo(String value) {
            addCriterion("c14sm <=", value, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC14smLike(String value) {
            addCriterion("c14sm like", value, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC14smNotLike(String value) {
            addCriterion("c14sm not like", value, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC14smIn(List<String> values) {
            addCriterion("c14sm in", values, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC14smNotIn(List<String> values) {
            addCriterion("c14sm not in", values, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC14smBetween(String value1, String value2) {
            addCriterion("c14sm between", value1, value2, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC14smNotBetween(String value1, String value2) {
            addCriterion("c14sm not between", value1, value2, "c14sm");
            return (Criteria) this;
        }

        public Criteria andC15smIsNull() {
            addCriterion("c15sm is null");
            return (Criteria) this;
        }

        public Criteria andC15smIsNotNull() {
            addCriterion("c15sm is not null");
            return (Criteria) this;
        }

        public Criteria andC15smEqualTo(String value) {
            addCriterion("c15sm =", value, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC15smNotEqualTo(String value) {
            addCriterion("c15sm <>", value, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC15smGreaterThan(String value) {
            addCriterion("c15sm >", value, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC15smGreaterThanOrEqualTo(String value) {
            addCriterion("c15sm >=", value, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC15smLessThan(String value) {
            addCriterion("c15sm <", value, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC15smLessThanOrEqualTo(String value) {
            addCriterion("c15sm <=", value, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC15smLike(String value) {
            addCriterion("c15sm like", value, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC15smNotLike(String value) {
            addCriterion("c15sm not like", value, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC15smIn(List<String> values) {
            addCriterion("c15sm in", values, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC15smNotIn(List<String> values) {
            addCriterion("c15sm not in", values, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC15smBetween(String value1, String value2) {
            addCriterion("c15sm between", value1, value2, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC15smNotBetween(String value1, String value2) {
            addCriterion("c15sm not between", value1, value2, "c15sm");
            return (Criteria) this;
        }

        public Criteria andC16smIsNull() {
            addCriterion("c16sm is null");
            return (Criteria) this;
        }

        public Criteria andC16smIsNotNull() {
            addCriterion("c16sm is not null");
            return (Criteria) this;
        }

        public Criteria andC16smEqualTo(String value) {
            addCriterion("c16sm =", value, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC16smNotEqualTo(String value) {
            addCriterion("c16sm <>", value, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC16smGreaterThan(String value) {
            addCriterion("c16sm >", value, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC16smGreaterThanOrEqualTo(String value) {
            addCriterion("c16sm >=", value, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC16smLessThan(String value) {
            addCriterion("c16sm <", value, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC16smLessThanOrEqualTo(String value) {
            addCriterion("c16sm <=", value, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC16smLike(String value) {
            addCriterion("c16sm like", value, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC16smNotLike(String value) {
            addCriterion("c16sm not like", value, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC16smIn(List<String> values) {
            addCriterion("c16sm in", values, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC16smNotIn(List<String> values) {
            addCriterion("c16sm not in", values, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC16smBetween(String value1, String value2) {
            addCriterion("c16sm between", value1, value2, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC16smNotBetween(String value1, String value2) {
            addCriterion("c16sm not between", value1, value2, "c16sm");
            return (Criteria) this;
        }

        public Criteria andC17smIsNull() {
            addCriterion("c17sm is null");
            return (Criteria) this;
        }

        public Criteria andC17smIsNotNull() {
            addCriterion("c17sm is not null");
            return (Criteria) this;
        }

        public Criteria andC17smEqualTo(String value) {
            addCriterion("c17sm =", value, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC17smNotEqualTo(String value) {
            addCriterion("c17sm <>", value, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC17smGreaterThan(String value) {
            addCriterion("c17sm >", value, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC17smGreaterThanOrEqualTo(String value) {
            addCriterion("c17sm >=", value, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC17smLessThan(String value) {
            addCriterion("c17sm <", value, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC17smLessThanOrEqualTo(String value) {
            addCriterion("c17sm <=", value, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC17smLike(String value) {
            addCriterion("c17sm like", value, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC17smNotLike(String value) {
            addCriterion("c17sm not like", value, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC17smIn(List<String> values) {
            addCriterion("c17sm in", values, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC17smNotIn(List<String> values) {
            addCriterion("c17sm not in", values, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC17smBetween(String value1, String value2) {
            addCriterion("c17sm between", value1, value2, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC17smNotBetween(String value1, String value2) {
            addCriterion("c17sm not between", value1, value2, "c17sm");
            return (Criteria) this;
        }

        public Criteria andC18smIsNull() {
            addCriterion("c18sm is null");
            return (Criteria) this;
        }

        public Criteria andC18smIsNotNull() {
            addCriterion("c18sm is not null");
            return (Criteria) this;
        }

        public Criteria andC18smEqualTo(String value) {
            addCriterion("c18sm =", value, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC18smNotEqualTo(String value) {
            addCriterion("c18sm <>", value, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC18smGreaterThan(String value) {
            addCriterion("c18sm >", value, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC18smGreaterThanOrEqualTo(String value) {
            addCriterion("c18sm >=", value, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC18smLessThan(String value) {
            addCriterion("c18sm <", value, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC18smLessThanOrEqualTo(String value) {
            addCriterion("c18sm <=", value, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC18smLike(String value) {
            addCriterion("c18sm like", value, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC18smNotLike(String value) {
            addCriterion("c18sm not like", value, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC18smIn(List<String> values) {
            addCriterion("c18sm in", values, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC18smNotIn(List<String> values) {
            addCriterion("c18sm not in", values, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC18smBetween(String value1, String value2) {
            addCriterion("c18sm between", value1, value2, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC18smNotBetween(String value1, String value2) {
            addCriterion("c18sm not between", value1, value2, "c18sm");
            return (Criteria) this;
        }

        public Criteria andC19smIsNull() {
            addCriterion("c19sm is null");
            return (Criteria) this;
        }

        public Criteria andC19smIsNotNull() {
            addCriterion("c19sm is not null");
            return (Criteria) this;
        }

        public Criteria andC19smEqualTo(String value) {
            addCriterion("c19sm =", value, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC19smNotEqualTo(String value) {
            addCriterion("c19sm <>", value, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC19smGreaterThan(String value) {
            addCriterion("c19sm >", value, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC19smGreaterThanOrEqualTo(String value) {
            addCriterion("c19sm >=", value, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC19smLessThan(String value) {
            addCriterion("c19sm <", value, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC19smLessThanOrEqualTo(String value) {
            addCriterion("c19sm <=", value, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC19smLike(String value) {
            addCriterion("c19sm like", value, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC19smNotLike(String value) {
            addCriterion("c19sm not like", value, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC19smIn(List<String> values) {
            addCriterion("c19sm in", values, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC19smNotIn(List<String> values) {
            addCriterion("c19sm not in", values, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC19smBetween(String value1, String value2) {
            addCriterion("c19sm between", value1, value2, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC19smNotBetween(String value1, String value2) {
            addCriterion("c19sm not between", value1, value2, "c19sm");
            return (Criteria) this;
        }

        public Criteria andC20smIsNull() {
            addCriterion("c20sm is null");
            return (Criteria) this;
        }

        public Criteria andC20smIsNotNull() {
            addCriterion("c20sm is not null");
            return (Criteria) this;
        }

        public Criteria andC20smEqualTo(String value) {
            addCriterion("c20sm =", value, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC20smNotEqualTo(String value) {
            addCriterion("c20sm <>", value, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC20smGreaterThan(String value) {
            addCriterion("c20sm >", value, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC20smGreaterThanOrEqualTo(String value) {
            addCriterion("c20sm >=", value, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC20smLessThan(String value) {
            addCriterion("c20sm <", value, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC20smLessThanOrEqualTo(String value) {
            addCriterion("c20sm <=", value, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC20smLike(String value) {
            addCriterion("c20sm like", value, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC20smNotLike(String value) {
            addCriterion("c20sm not like", value, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC20smIn(List<String> values) {
            addCriterion("c20sm in", values, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC20smNotIn(List<String> values) {
            addCriterion("c20sm not in", values, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC20smBetween(String value1, String value2) {
            addCriterion("c20sm between", value1, value2, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC20smNotBetween(String value1, String value2) {
            addCriterion("c20sm not between", value1, value2, "c20sm");
            return (Criteria) this;
        }

        public Criteria andC21smIsNull() {
            addCriterion("c21sm is null");
            return (Criteria) this;
        }

        public Criteria andC21smIsNotNull() {
            addCriterion("c21sm is not null");
            return (Criteria) this;
        }

        public Criteria andC21smEqualTo(String value) {
            addCriterion("c21sm =", value, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC21smNotEqualTo(String value) {
            addCriterion("c21sm <>", value, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC21smGreaterThan(String value) {
            addCriterion("c21sm >", value, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC21smGreaterThanOrEqualTo(String value) {
            addCriterion("c21sm >=", value, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC21smLessThan(String value) {
            addCriterion("c21sm <", value, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC21smLessThanOrEqualTo(String value) {
            addCriterion("c21sm <=", value, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC21smLike(String value) {
            addCriterion("c21sm like", value, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC21smNotLike(String value) {
            addCriterion("c21sm not like", value, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC21smIn(List<String> values) {
            addCriterion("c21sm in", values, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC21smNotIn(List<String> values) {
            addCriterion("c21sm not in", values, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC21smBetween(String value1, String value2) {
            addCriterion("c21sm between", value1, value2, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC21smNotBetween(String value1, String value2) {
            addCriterion("c21sm not between", value1, value2, "c21sm");
            return (Criteria) this;
        }

        public Criteria andC22smIsNull() {
            addCriterion("c22sm is null");
            return (Criteria) this;
        }

        public Criteria andC22smIsNotNull() {
            addCriterion("c22sm is not null");
            return (Criteria) this;
        }

        public Criteria andC22smEqualTo(String value) {
            addCriterion("c22sm =", value, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC22smNotEqualTo(String value) {
            addCriterion("c22sm <>", value, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC22smGreaterThan(String value) {
            addCriterion("c22sm >", value, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC22smGreaterThanOrEqualTo(String value) {
            addCriterion("c22sm >=", value, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC22smLessThan(String value) {
            addCriterion("c22sm <", value, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC22smLessThanOrEqualTo(String value) {
            addCriterion("c22sm <=", value, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC22smLike(String value) {
            addCriterion("c22sm like", value, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC22smNotLike(String value) {
            addCriterion("c22sm not like", value, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC22smIn(List<String> values) {
            addCriterion("c22sm in", values, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC22smNotIn(List<String> values) {
            addCriterion("c22sm not in", values, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC22smBetween(String value1, String value2) {
            addCriterion("c22sm between", value1, value2, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC22smNotBetween(String value1, String value2) {
            addCriterion("c22sm not between", value1, value2, "c22sm");
            return (Criteria) this;
        }

        public Criteria andC23smIsNull() {
            addCriterion("c23sm is null");
            return (Criteria) this;
        }

        public Criteria andC23smIsNotNull() {
            addCriterion("c23sm is not null");
            return (Criteria) this;
        }

        public Criteria andC23smEqualTo(String value) {
            addCriterion("c23sm =", value, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC23smNotEqualTo(String value) {
            addCriterion("c23sm <>", value, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC23smGreaterThan(String value) {
            addCriterion("c23sm >", value, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC23smGreaterThanOrEqualTo(String value) {
            addCriterion("c23sm >=", value, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC23smLessThan(String value) {
            addCriterion("c23sm <", value, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC23smLessThanOrEqualTo(String value) {
            addCriterion("c23sm <=", value, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC23smLike(String value) {
            addCriterion("c23sm like", value, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC23smNotLike(String value) {
            addCriterion("c23sm not like", value, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC23smIn(List<String> values) {
            addCriterion("c23sm in", values, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC23smNotIn(List<String> values) {
            addCriterion("c23sm not in", values, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC23smBetween(String value1, String value2) {
            addCriterion("c23sm between", value1, value2, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC23smNotBetween(String value1, String value2) {
            addCriterion("c23sm not between", value1, value2, "c23sm");
            return (Criteria) this;
        }

        public Criteria andC24smIsNull() {
            addCriterion("c24sm is null");
            return (Criteria) this;
        }

        public Criteria andC24smIsNotNull() {
            addCriterion("c24sm is not null");
            return (Criteria) this;
        }

        public Criteria andC24smEqualTo(String value) {
            addCriterion("c24sm =", value, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC24smNotEqualTo(String value) {
            addCriterion("c24sm <>", value, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC24smGreaterThan(String value) {
            addCriterion("c24sm >", value, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC24smGreaterThanOrEqualTo(String value) {
            addCriterion("c24sm >=", value, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC24smLessThan(String value) {
            addCriterion("c24sm <", value, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC24smLessThanOrEqualTo(String value) {
            addCriterion("c24sm <=", value, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC24smLike(String value) {
            addCriterion("c24sm like", value, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC24smNotLike(String value) {
            addCriterion("c24sm not like", value, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC24smIn(List<String> values) {
            addCriterion("c24sm in", values, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC24smNotIn(List<String> values) {
            addCriterion("c24sm not in", values, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC24smBetween(String value1, String value2) {
            addCriterion("c24sm between", value1, value2, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC24smNotBetween(String value1, String value2) {
            addCriterion("c24sm not between", value1, value2, "c24sm");
            return (Criteria) this;
        }

        public Criteria andC25smIsNull() {
            addCriterion("c25sm is null");
            return (Criteria) this;
        }

        public Criteria andC25smIsNotNull() {
            addCriterion("c25sm is not null");
            return (Criteria) this;
        }

        public Criteria andC25smEqualTo(String value) {
            addCriterion("c25sm =", value, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC25smNotEqualTo(String value) {
            addCriterion("c25sm <>", value, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC25smGreaterThan(String value) {
            addCriterion("c25sm >", value, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC25smGreaterThanOrEqualTo(String value) {
            addCriterion("c25sm >=", value, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC25smLessThan(String value) {
            addCriterion("c25sm <", value, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC25smLessThanOrEqualTo(String value) {
            addCriterion("c25sm <=", value, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC25smLike(String value) {
            addCriterion("c25sm like", value, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC25smNotLike(String value) {
            addCriterion("c25sm not like", value, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC25smIn(List<String> values) {
            addCriterion("c25sm in", values, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC25smNotIn(List<String> values) {
            addCriterion("c25sm not in", values, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC25smBetween(String value1, String value2) {
            addCriterion("c25sm between", value1, value2, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC25smNotBetween(String value1, String value2) {
            addCriterion("c25sm not between", value1, value2, "c25sm");
            return (Criteria) this;
        }

        public Criteria andC26smIsNull() {
            addCriterion("c26sm is null");
            return (Criteria) this;
        }

        public Criteria andC26smIsNotNull() {
            addCriterion("c26sm is not null");
            return (Criteria) this;
        }

        public Criteria andC26smEqualTo(String value) {
            addCriterion("c26sm =", value, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC26smNotEqualTo(String value) {
            addCriterion("c26sm <>", value, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC26smGreaterThan(String value) {
            addCriterion("c26sm >", value, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC26smGreaterThanOrEqualTo(String value) {
            addCriterion("c26sm >=", value, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC26smLessThan(String value) {
            addCriterion("c26sm <", value, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC26smLessThanOrEqualTo(String value) {
            addCriterion("c26sm <=", value, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC26smLike(String value) {
            addCriterion("c26sm like", value, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC26smNotLike(String value) {
            addCriterion("c26sm not like", value, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC26smIn(List<String> values) {
            addCriterion("c26sm in", values, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC26smNotIn(List<String> values) {
            addCriterion("c26sm not in", values, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC26smBetween(String value1, String value2) {
            addCriterion("c26sm between", value1, value2, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC26smNotBetween(String value1, String value2) {
            addCriterion("c26sm not between", value1, value2, "c26sm");
            return (Criteria) this;
        }

        public Criteria andC27smIsNull() {
            addCriterion("c27sm is null");
            return (Criteria) this;
        }

        public Criteria andC27smIsNotNull() {
            addCriterion("c27sm is not null");
            return (Criteria) this;
        }

        public Criteria andC27smEqualTo(String value) {
            addCriterion("c27sm =", value, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC27smNotEqualTo(String value) {
            addCriterion("c27sm <>", value, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC27smGreaterThan(String value) {
            addCriterion("c27sm >", value, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC27smGreaterThanOrEqualTo(String value) {
            addCriterion("c27sm >=", value, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC27smLessThan(String value) {
            addCriterion("c27sm <", value, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC27smLessThanOrEqualTo(String value) {
            addCriterion("c27sm <=", value, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC27smLike(String value) {
            addCriterion("c27sm like", value, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC27smNotLike(String value) {
            addCriterion("c27sm not like", value, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC27smIn(List<String> values) {
            addCriterion("c27sm in", values, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC27smNotIn(List<String> values) {
            addCriterion("c27sm not in", values, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC27smBetween(String value1, String value2) {
            addCriterion("c27sm between", value1, value2, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC27smNotBetween(String value1, String value2) {
            addCriterion("c27sm not between", value1, value2, "c27sm");
            return (Criteria) this;
        }

        public Criteria andC28smIsNull() {
            addCriterion("c28sm is null");
            return (Criteria) this;
        }

        public Criteria andC28smIsNotNull() {
            addCriterion("c28sm is not null");
            return (Criteria) this;
        }

        public Criteria andC28smEqualTo(String value) {
            addCriterion("c28sm =", value, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC28smNotEqualTo(String value) {
            addCriterion("c28sm <>", value, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC28smGreaterThan(String value) {
            addCriterion("c28sm >", value, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC28smGreaterThanOrEqualTo(String value) {
            addCriterion("c28sm >=", value, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC28smLessThan(String value) {
            addCriterion("c28sm <", value, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC28smLessThanOrEqualTo(String value) {
            addCriterion("c28sm <=", value, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC28smLike(String value) {
            addCriterion("c28sm like", value, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC28smNotLike(String value) {
            addCriterion("c28sm not like", value, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC28smIn(List<String> values) {
            addCriterion("c28sm in", values, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC28smNotIn(List<String> values) {
            addCriterion("c28sm not in", values, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC28smBetween(String value1, String value2) {
            addCriterion("c28sm between", value1, value2, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC28smNotBetween(String value1, String value2) {
            addCriterion("c28sm not between", value1, value2, "c28sm");
            return (Criteria) this;
        }

        public Criteria andC29smIsNull() {
            addCriterion("c29sm is null");
            return (Criteria) this;
        }

        public Criteria andC29smIsNotNull() {
            addCriterion("c29sm is not null");
            return (Criteria) this;
        }

        public Criteria andC29smEqualTo(String value) {
            addCriterion("c29sm =", value, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC29smNotEqualTo(String value) {
            addCriterion("c29sm <>", value, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC29smGreaterThan(String value) {
            addCriterion("c29sm >", value, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC29smGreaterThanOrEqualTo(String value) {
            addCriterion("c29sm >=", value, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC29smLessThan(String value) {
            addCriterion("c29sm <", value, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC29smLessThanOrEqualTo(String value) {
            addCriterion("c29sm <=", value, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC29smLike(String value) {
            addCriterion("c29sm like", value, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC29smNotLike(String value) {
            addCriterion("c29sm not like", value, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC29smIn(List<String> values) {
            addCriterion("c29sm in", values, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC29smNotIn(List<String> values) {
            addCriterion("c29sm not in", values, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC29smBetween(String value1, String value2) {
            addCriterion("c29sm between", value1, value2, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC29smNotBetween(String value1, String value2) {
            addCriterion("c29sm not between", value1, value2, "c29sm");
            return (Criteria) this;
        }

        public Criteria andC30smIsNull() {
            addCriterion("c30sm is null");
            return (Criteria) this;
        }

        public Criteria andC30smIsNotNull() {
            addCriterion("c30sm is not null");
            return (Criteria) this;
        }

        public Criteria andC30smEqualTo(String value) {
            addCriterion("c30sm =", value, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC30smNotEqualTo(String value) {
            addCriterion("c30sm <>", value, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC30smGreaterThan(String value) {
            addCriterion("c30sm >", value, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC30smGreaterThanOrEqualTo(String value) {
            addCriterion("c30sm >=", value, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC30smLessThan(String value) {
            addCriterion("c30sm <", value, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC30smLessThanOrEqualTo(String value) {
            addCriterion("c30sm <=", value, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC30smLike(String value) {
            addCriterion("c30sm like", value, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC30smNotLike(String value) {
            addCriterion("c30sm not like", value, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC30smIn(List<String> values) {
            addCriterion("c30sm in", values, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC30smNotIn(List<String> values) {
            addCriterion("c30sm not in", values, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC30smBetween(String value1, String value2) {
            addCriterion("c30sm between", value1, value2, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC30smNotBetween(String value1, String value2) {
            addCriterion("c30sm not between", value1, value2, "c30sm");
            return (Criteria) this;
        }

        public Criteria andC31smIsNull() {
            addCriterion("c31sm is null");
            return (Criteria) this;
        }

        public Criteria andC31smIsNotNull() {
            addCriterion("c31sm is not null");
            return (Criteria) this;
        }

        public Criteria andC31smEqualTo(String value) {
            addCriterion("c31sm =", value, "c31sm");
            return (Criteria) this;
        }

        public Criteria andC31smNotEqualTo(String value) {
            addCriterion("c31sm <>", value, "c31sm");
            return (Criteria) this;
        }

        public Criteria andC31smGreaterThan(String value) {
            addCriterion("c31sm >", value, "c31sm");
            return (Criteria) this;
        }

        public Criteria andC31smGreaterThanOrEqualTo(String value) {
            addCriterion("c31sm >=", value, "c31sm");
            return (Criteria) this;
        }

        public Criteria andC31smLessThan(String value) {
            addCriterion("c31sm <", value, "c31sm");
            return (Criteria) this;
        }

        public Criteria andC31smLessThanOrEqualTo(String value) {
            addCriterion("c31sm <=", value, "c31sm");
            return (Criteria) this;
        }

        public Criteria andC31smLike(String value) {
            addCriterion("c31sm like", value, "c31sm");
            return (Criteria) this;
        }

        public Criteria andC31smNotLike(String value) {
            addCriterion("c31sm not like", value, "c31sm");
            return (Criteria) this;
        }

        public Criteria andC31smIn(List<String> values) {
            addCriterion("c31sm in", values, "c31sm");
            return (Criteria) this;
        }

        public Criteria andC31smNotIn(List<String> values) {
            addCriterion("c31sm not in", values, "c31sm");
            return (Criteria) this;
        }

        public Criteria andC31smBetween(String value1, String value2) {
            addCriterion("c31sm between", value1, value2, "c31sm");
            return (Criteria) this;
        }

        public Criteria andC31smNotBetween(String value1, String value2) {
            addCriterion("c31sm not between", value1, value2, "c31sm");
            return (Criteria) this;
        }

        public Criteria andD01smIsNull() {
            addCriterion("d01sm is null");
            return (Criteria) this;
        }

        public Criteria andD01smIsNotNull() {
            addCriterion("d01sm is not null");
            return (Criteria) this;
        }

        public Criteria andD01smEqualTo(String value) {
            addCriterion("d01sm =", value, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD01smNotEqualTo(String value) {
            addCriterion("d01sm <>", value, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD01smGreaterThan(String value) {
            addCriterion("d01sm >", value, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD01smGreaterThanOrEqualTo(String value) {
            addCriterion("d01sm >=", value, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD01smLessThan(String value) {
            addCriterion("d01sm <", value, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD01smLessThanOrEqualTo(String value) {
            addCriterion("d01sm <=", value, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD01smLike(String value) {
            addCriterion("d01sm like", value, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD01smNotLike(String value) {
            addCriterion("d01sm not like", value, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD01smIn(List<String> values) {
            addCriterion("d01sm in", values, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD01smNotIn(List<String> values) {
            addCriterion("d01sm not in", values, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD01smBetween(String value1, String value2) {
            addCriterion("d01sm between", value1, value2, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD01smNotBetween(String value1, String value2) {
            addCriterion("d01sm not between", value1, value2, "d01sm");
            return (Criteria) this;
        }

        public Criteria andD02smIsNull() {
            addCriterion("d02sm is null");
            return (Criteria) this;
        }

        public Criteria andD02smIsNotNull() {
            addCriterion("d02sm is not null");
            return (Criteria) this;
        }

        public Criteria andD02smEqualTo(String value) {
            addCriterion("d02sm =", value, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD02smNotEqualTo(String value) {
            addCriterion("d02sm <>", value, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD02smGreaterThan(String value) {
            addCriterion("d02sm >", value, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD02smGreaterThanOrEqualTo(String value) {
            addCriterion("d02sm >=", value, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD02smLessThan(String value) {
            addCriterion("d02sm <", value, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD02smLessThanOrEqualTo(String value) {
            addCriterion("d02sm <=", value, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD02smLike(String value) {
            addCriterion("d02sm like", value, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD02smNotLike(String value) {
            addCriterion("d02sm not like", value, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD02smIn(List<String> values) {
            addCriterion("d02sm in", values, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD02smNotIn(List<String> values) {
            addCriterion("d02sm not in", values, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD02smBetween(String value1, String value2) {
            addCriterion("d02sm between", value1, value2, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD02smNotBetween(String value1, String value2) {
            addCriterion("d02sm not between", value1, value2, "d02sm");
            return (Criteria) this;
        }

        public Criteria andD03smIsNull() {
            addCriterion("d03sm is null");
            return (Criteria) this;
        }

        public Criteria andD03smIsNotNull() {
            addCriterion("d03sm is not null");
            return (Criteria) this;
        }

        public Criteria andD03smEqualTo(String value) {
            addCriterion("d03sm =", value, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD03smNotEqualTo(String value) {
            addCriterion("d03sm <>", value, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD03smGreaterThan(String value) {
            addCriterion("d03sm >", value, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD03smGreaterThanOrEqualTo(String value) {
            addCriterion("d03sm >=", value, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD03smLessThan(String value) {
            addCriterion("d03sm <", value, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD03smLessThanOrEqualTo(String value) {
            addCriterion("d03sm <=", value, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD03smLike(String value) {
            addCriterion("d03sm like", value, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD03smNotLike(String value) {
            addCriterion("d03sm not like", value, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD03smIn(List<String> values) {
            addCriterion("d03sm in", values, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD03smNotIn(List<String> values) {
            addCriterion("d03sm not in", values, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD03smBetween(String value1, String value2) {
            addCriterion("d03sm between", value1, value2, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD03smNotBetween(String value1, String value2) {
            addCriterion("d03sm not between", value1, value2, "d03sm");
            return (Criteria) this;
        }

        public Criteria andD04smIsNull() {
            addCriterion("d04sm is null");
            return (Criteria) this;
        }

        public Criteria andD04smIsNotNull() {
            addCriterion("d04sm is not null");
            return (Criteria) this;
        }

        public Criteria andD04smEqualTo(String value) {
            addCriterion("d04sm =", value, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD04smNotEqualTo(String value) {
            addCriterion("d04sm <>", value, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD04smGreaterThan(String value) {
            addCriterion("d04sm >", value, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD04smGreaterThanOrEqualTo(String value) {
            addCriterion("d04sm >=", value, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD04smLessThan(String value) {
            addCriterion("d04sm <", value, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD04smLessThanOrEqualTo(String value) {
            addCriterion("d04sm <=", value, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD04smLike(String value) {
            addCriterion("d04sm like", value, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD04smNotLike(String value) {
            addCriterion("d04sm not like", value, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD04smIn(List<String> values) {
            addCriterion("d04sm in", values, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD04smNotIn(List<String> values) {
            addCriterion("d04sm not in", values, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD04smBetween(String value1, String value2) {
            addCriterion("d04sm between", value1, value2, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD04smNotBetween(String value1, String value2) {
            addCriterion("d04sm not between", value1, value2, "d04sm");
            return (Criteria) this;
        }

        public Criteria andD05smIsNull() {
            addCriterion("d05sm is null");
            return (Criteria) this;
        }

        public Criteria andD05smIsNotNull() {
            addCriterion("d05sm is not null");
            return (Criteria) this;
        }

        public Criteria andD05smEqualTo(String value) {
            addCriterion("d05sm =", value, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD05smNotEqualTo(String value) {
            addCriterion("d05sm <>", value, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD05smGreaterThan(String value) {
            addCriterion("d05sm >", value, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD05smGreaterThanOrEqualTo(String value) {
            addCriterion("d05sm >=", value, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD05smLessThan(String value) {
            addCriterion("d05sm <", value, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD05smLessThanOrEqualTo(String value) {
            addCriterion("d05sm <=", value, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD05smLike(String value) {
            addCriterion("d05sm like", value, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD05smNotLike(String value) {
            addCriterion("d05sm not like", value, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD05smIn(List<String> values) {
            addCriterion("d05sm in", values, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD05smNotIn(List<String> values) {
            addCriterion("d05sm not in", values, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD05smBetween(String value1, String value2) {
            addCriterion("d05sm between", value1, value2, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD05smNotBetween(String value1, String value2) {
            addCriterion("d05sm not between", value1, value2, "d05sm");
            return (Criteria) this;
        }

        public Criteria andD06smIsNull() {
            addCriterion("d06sm is null");
            return (Criteria) this;
        }

        public Criteria andD06smIsNotNull() {
            addCriterion("d06sm is not null");
            return (Criteria) this;
        }

        public Criteria andD06smEqualTo(String value) {
            addCriterion("d06sm =", value, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD06smNotEqualTo(String value) {
            addCriterion("d06sm <>", value, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD06smGreaterThan(String value) {
            addCriterion("d06sm >", value, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD06smGreaterThanOrEqualTo(String value) {
            addCriterion("d06sm >=", value, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD06smLessThan(String value) {
            addCriterion("d06sm <", value, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD06smLessThanOrEqualTo(String value) {
            addCriterion("d06sm <=", value, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD06smLike(String value) {
            addCriterion("d06sm like", value, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD06smNotLike(String value) {
            addCriterion("d06sm not like", value, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD06smIn(List<String> values) {
            addCriterion("d06sm in", values, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD06smNotIn(List<String> values) {
            addCriterion("d06sm not in", values, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD06smBetween(String value1, String value2) {
            addCriterion("d06sm between", value1, value2, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD06smNotBetween(String value1, String value2) {
            addCriterion("d06sm not between", value1, value2, "d06sm");
            return (Criteria) this;
        }

        public Criteria andD07smIsNull() {
            addCriterion("d07sm is null");
            return (Criteria) this;
        }

        public Criteria andD07smIsNotNull() {
            addCriterion("d07sm is not null");
            return (Criteria) this;
        }

        public Criteria andD07smEqualTo(String value) {
            addCriterion("d07sm =", value, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD07smNotEqualTo(String value) {
            addCriterion("d07sm <>", value, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD07smGreaterThan(String value) {
            addCriterion("d07sm >", value, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD07smGreaterThanOrEqualTo(String value) {
            addCriterion("d07sm >=", value, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD07smLessThan(String value) {
            addCriterion("d07sm <", value, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD07smLessThanOrEqualTo(String value) {
            addCriterion("d07sm <=", value, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD07smLike(String value) {
            addCriterion("d07sm like", value, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD07smNotLike(String value) {
            addCriterion("d07sm not like", value, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD07smIn(List<String> values) {
            addCriterion("d07sm in", values, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD07smNotIn(List<String> values) {
            addCriterion("d07sm not in", values, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD07smBetween(String value1, String value2) {
            addCriterion("d07sm between", value1, value2, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD07smNotBetween(String value1, String value2) {
            addCriterion("d07sm not between", value1, value2, "d07sm");
            return (Criteria) this;
        }

        public Criteria andD08smIsNull() {
            addCriterion("d08sm is null");
            return (Criteria) this;
        }

        public Criteria andD08smIsNotNull() {
            addCriterion("d08sm is not null");
            return (Criteria) this;
        }

        public Criteria andD08smEqualTo(String value) {
            addCriterion("d08sm =", value, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD08smNotEqualTo(String value) {
            addCriterion("d08sm <>", value, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD08smGreaterThan(String value) {
            addCriterion("d08sm >", value, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD08smGreaterThanOrEqualTo(String value) {
            addCriterion("d08sm >=", value, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD08smLessThan(String value) {
            addCriterion("d08sm <", value, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD08smLessThanOrEqualTo(String value) {
            addCriterion("d08sm <=", value, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD08smLike(String value) {
            addCriterion("d08sm like", value, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD08smNotLike(String value) {
            addCriterion("d08sm not like", value, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD08smIn(List<String> values) {
            addCriterion("d08sm in", values, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD08smNotIn(List<String> values) {
            addCriterion("d08sm not in", values, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD08smBetween(String value1, String value2) {
            addCriterion("d08sm between", value1, value2, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD08smNotBetween(String value1, String value2) {
            addCriterion("d08sm not between", value1, value2, "d08sm");
            return (Criteria) this;
        }

        public Criteria andD09smIsNull() {
            addCriterion("d09sm is null");
            return (Criteria) this;
        }

        public Criteria andD09smIsNotNull() {
            addCriterion("d09sm is not null");
            return (Criteria) this;
        }

        public Criteria andD09smEqualTo(String value) {
            addCriterion("d09sm =", value, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD09smNotEqualTo(String value) {
            addCriterion("d09sm <>", value, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD09smGreaterThan(String value) {
            addCriterion("d09sm >", value, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD09smGreaterThanOrEqualTo(String value) {
            addCriterion("d09sm >=", value, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD09smLessThan(String value) {
            addCriterion("d09sm <", value, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD09smLessThanOrEqualTo(String value) {
            addCriterion("d09sm <=", value, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD09smLike(String value) {
            addCriterion("d09sm like", value, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD09smNotLike(String value) {
            addCriterion("d09sm not like", value, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD09smIn(List<String> values) {
            addCriterion("d09sm in", values, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD09smNotIn(List<String> values) {
            addCriterion("d09sm not in", values, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD09smBetween(String value1, String value2) {
            addCriterion("d09sm between", value1, value2, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD09smNotBetween(String value1, String value2) {
            addCriterion("d09sm not between", value1, value2, "d09sm");
            return (Criteria) this;
        }

        public Criteria andD10smIsNull() {
            addCriterion("d10sm is null");
            return (Criteria) this;
        }

        public Criteria andD10smIsNotNull() {
            addCriterion("d10sm is not null");
            return (Criteria) this;
        }

        public Criteria andD10smEqualTo(String value) {
            addCriterion("d10sm =", value, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD10smNotEqualTo(String value) {
            addCriterion("d10sm <>", value, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD10smGreaterThan(String value) {
            addCriterion("d10sm >", value, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD10smGreaterThanOrEqualTo(String value) {
            addCriterion("d10sm >=", value, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD10smLessThan(String value) {
            addCriterion("d10sm <", value, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD10smLessThanOrEqualTo(String value) {
            addCriterion("d10sm <=", value, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD10smLike(String value) {
            addCriterion("d10sm like", value, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD10smNotLike(String value) {
            addCriterion("d10sm not like", value, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD10smIn(List<String> values) {
            addCriterion("d10sm in", values, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD10smNotIn(List<String> values) {
            addCriterion("d10sm not in", values, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD10smBetween(String value1, String value2) {
            addCriterion("d10sm between", value1, value2, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD10smNotBetween(String value1, String value2) {
            addCriterion("d10sm not between", value1, value2, "d10sm");
            return (Criteria) this;
        }

        public Criteria andD11smIsNull() {
            addCriterion("d11sm is null");
            return (Criteria) this;
        }

        public Criteria andD11smIsNotNull() {
            addCriterion("d11sm is not null");
            return (Criteria) this;
        }

        public Criteria andD11smEqualTo(String value) {
            addCriterion("d11sm =", value, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD11smNotEqualTo(String value) {
            addCriterion("d11sm <>", value, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD11smGreaterThan(String value) {
            addCriterion("d11sm >", value, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD11smGreaterThanOrEqualTo(String value) {
            addCriterion("d11sm >=", value, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD11smLessThan(String value) {
            addCriterion("d11sm <", value, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD11smLessThanOrEqualTo(String value) {
            addCriterion("d11sm <=", value, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD11smLike(String value) {
            addCriterion("d11sm like", value, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD11smNotLike(String value) {
            addCriterion("d11sm not like", value, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD11smIn(List<String> values) {
            addCriterion("d11sm in", values, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD11smNotIn(List<String> values) {
            addCriterion("d11sm not in", values, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD11smBetween(String value1, String value2) {
            addCriterion("d11sm between", value1, value2, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD11smNotBetween(String value1, String value2) {
            addCriterion("d11sm not between", value1, value2, "d11sm");
            return (Criteria) this;
        }

        public Criteria andD12smIsNull() {
            addCriterion("d12sm is null");
            return (Criteria) this;
        }

        public Criteria andD12smIsNotNull() {
            addCriterion("d12sm is not null");
            return (Criteria) this;
        }

        public Criteria andD12smEqualTo(String value) {
            addCriterion("d12sm =", value, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD12smNotEqualTo(String value) {
            addCriterion("d12sm <>", value, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD12smGreaterThan(String value) {
            addCriterion("d12sm >", value, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD12smGreaterThanOrEqualTo(String value) {
            addCriterion("d12sm >=", value, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD12smLessThan(String value) {
            addCriterion("d12sm <", value, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD12smLessThanOrEqualTo(String value) {
            addCriterion("d12sm <=", value, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD12smLike(String value) {
            addCriterion("d12sm like", value, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD12smNotLike(String value) {
            addCriterion("d12sm not like", value, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD12smIn(List<String> values) {
            addCriterion("d12sm in", values, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD12smNotIn(List<String> values) {
            addCriterion("d12sm not in", values, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD12smBetween(String value1, String value2) {
            addCriterion("d12sm between", value1, value2, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD12smNotBetween(String value1, String value2) {
            addCriterion("d12sm not between", value1, value2, "d12sm");
            return (Criteria) this;
        }

        public Criteria andD13smIsNull() {
            addCriterion("d13sm is null");
            return (Criteria) this;
        }

        public Criteria andD13smIsNotNull() {
            addCriterion("d13sm is not null");
            return (Criteria) this;
        }

        public Criteria andD13smEqualTo(String value) {
            addCriterion("d13sm =", value, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD13smNotEqualTo(String value) {
            addCriterion("d13sm <>", value, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD13smGreaterThan(String value) {
            addCriterion("d13sm >", value, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD13smGreaterThanOrEqualTo(String value) {
            addCriterion("d13sm >=", value, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD13smLessThan(String value) {
            addCriterion("d13sm <", value, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD13smLessThanOrEqualTo(String value) {
            addCriterion("d13sm <=", value, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD13smLike(String value) {
            addCriterion("d13sm like", value, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD13smNotLike(String value) {
            addCriterion("d13sm not like", value, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD13smIn(List<String> values) {
            addCriterion("d13sm in", values, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD13smNotIn(List<String> values) {
            addCriterion("d13sm not in", values, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD13smBetween(String value1, String value2) {
            addCriterion("d13sm between", value1, value2, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD13smNotBetween(String value1, String value2) {
            addCriterion("d13sm not between", value1, value2, "d13sm");
            return (Criteria) this;
        }

        public Criteria andD14smIsNull() {
            addCriterion("d14sm is null");
            return (Criteria) this;
        }

        public Criteria andD14smIsNotNull() {
            addCriterion("d14sm is not null");
            return (Criteria) this;
        }

        public Criteria andD14smEqualTo(String value) {
            addCriterion("d14sm =", value, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD14smNotEqualTo(String value) {
            addCriterion("d14sm <>", value, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD14smGreaterThan(String value) {
            addCriterion("d14sm >", value, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD14smGreaterThanOrEqualTo(String value) {
            addCriterion("d14sm >=", value, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD14smLessThan(String value) {
            addCriterion("d14sm <", value, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD14smLessThanOrEqualTo(String value) {
            addCriterion("d14sm <=", value, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD14smLike(String value) {
            addCriterion("d14sm like", value, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD14smNotLike(String value) {
            addCriterion("d14sm not like", value, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD14smIn(List<String> values) {
            addCriterion("d14sm in", values, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD14smNotIn(List<String> values) {
            addCriterion("d14sm not in", values, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD14smBetween(String value1, String value2) {
            addCriterion("d14sm between", value1, value2, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD14smNotBetween(String value1, String value2) {
            addCriterion("d14sm not between", value1, value2, "d14sm");
            return (Criteria) this;
        }

        public Criteria andD15smIsNull() {
            addCriterion("d15sm is null");
            return (Criteria) this;
        }

        public Criteria andD15smIsNotNull() {
            addCriterion("d15sm is not null");
            return (Criteria) this;
        }

        public Criteria andD15smEqualTo(String value) {
            addCriterion("d15sm =", value, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD15smNotEqualTo(String value) {
            addCriterion("d15sm <>", value, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD15smGreaterThan(String value) {
            addCriterion("d15sm >", value, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD15smGreaterThanOrEqualTo(String value) {
            addCriterion("d15sm >=", value, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD15smLessThan(String value) {
            addCriterion("d15sm <", value, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD15smLessThanOrEqualTo(String value) {
            addCriterion("d15sm <=", value, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD15smLike(String value) {
            addCriterion("d15sm like", value, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD15smNotLike(String value) {
            addCriterion("d15sm not like", value, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD15smIn(List<String> values) {
            addCriterion("d15sm in", values, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD15smNotIn(List<String> values) {
            addCriterion("d15sm not in", values, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD15smBetween(String value1, String value2) {
            addCriterion("d15sm between", value1, value2, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD15smNotBetween(String value1, String value2) {
            addCriterion("d15sm not between", value1, value2, "d15sm");
            return (Criteria) this;
        }

        public Criteria andD16smIsNull() {
            addCriterion("d16sm is null");
            return (Criteria) this;
        }

        public Criteria andD16smIsNotNull() {
            addCriterion("d16sm is not null");
            return (Criteria) this;
        }

        public Criteria andD16smEqualTo(String value) {
            addCriterion("d16sm =", value, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD16smNotEqualTo(String value) {
            addCriterion("d16sm <>", value, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD16smGreaterThan(String value) {
            addCriterion("d16sm >", value, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD16smGreaterThanOrEqualTo(String value) {
            addCriterion("d16sm >=", value, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD16smLessThan(String value) {
            addCriterion("d16sm <", value, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD16smLessThanOrEqualTo(String value) {
            addCriterion("d16sm <=", value, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD16smLike(String value) {
            addCriterion("d16sm like", value, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD16smNotLike(String value) {
            addCriterion("d16sm not like", value, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD16smIn(List<String> values) {
            addCriterion("d16sm in", values, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD16smNotIn(List<String> values) {
            addCriterion("d16sm not in", values, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD16smBetween(String value1, String value2) {
            addCriterion("d16sm between", value1, value2, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD16smNotBetween(String value1, String value2) {
            addCriterion("d16sm not between", value1, value2, "d16sm");
            return (Criteria) this;
        }

        public Criteria andD17smIsNull() {
            addCriterion("d17sm is null");
            return (Criteria) this;
        }

        public Criteria andD17smIsNotNull() {
            addCriterion("d17sm is not null");
            return (Criteria) this;
        }

        public Criteria andD17smEqualTo(String value) {
            addCriterion("d17sm =", value, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD17smNotEqualTo(String value) {
            addCriterion("d17sm <>", value, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD17smGreaterThan(String value) {
            addCriterion("d17sm >", value, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD17smGreaterThanOrEqualTo(String value) {
            addCriterion("d17sm >=", value, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD17smLessThan(String value) {
            addCriterion("d17sm <", value, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD17smLessThanOrEqualTo(String value) {
            addCriterion("d17sm <=", value, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD17smLike(String value) {
            addCriterion("d17sm like", value, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD17smNotLike(String value) {
            addCriterion("d17sm not like", value, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD17smIn(List<String> values) {
            addCriterion("d17sm in", values, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD17smNotIn(List<String> values) {
            addCriterion("d17sm not in", values, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD17smBetween(String value1, String value2) {
            addCriterion("d17sm between", value1, value2, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD17smNotBetween(String value1, String value2) {
            addCriterion("d17sm not between", value1, value2, "d17sm");
            return (Criteria) this;
        }

        public Criteria andD18smIsNull() {
            addCriterion("d18sm is null");
            return (Criteria) this;
        }

        public Criteria andD18smIsNotNull() {
            addCriterion("d18sm is not null");
            return (Criteria) this;
        }

        public Criteria andD18smEqualTo(String value) {
            addCriterion("d18sm =", value, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD18smNotEqualTo(String value) {
            addCriterion("d18sm <>", value, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD18smGreaterThan(String value) {
            addCriterion("d18sm >", value, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD18smGreaterThanOrEqualTo(String value) {
            addCriterion("d18sm >=", value, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD18smLessThan(String value) {
            addCriterion("d18sm <", value, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD18smLessThanOrEqualTo(String value) {
            addCriterion("d18sm <=", value, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD18smLike(String value) {
            addCriterion("d18sm like", value, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD18smNotLike(String value) {
            addCriterion("d18sm not like", value, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD18smIn(List<String> values) {
            addCriterion("d18sm in", values, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD18smNotIn(List<String> values) {
            addCriterion("d18sm not in", values, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD18smBetween(String value1, String value2) {
            addCriterion("d18sm between", value1, value2, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD18smNotBetween(String value1, String value2) {
            addCriterion("d18sm not between", value1, value2, "d18sm");
            return (Criteria) this;
        }

        public Criteria andD19smIsNull() {
            addCriterion("d19sm is null");
            return (Criteria) this;
        }

        public Criteria andD19smIsNotNull() {
            addCriterion("d19sm is not null");
            return (Criteria) this;
        }

        public Criteria andD19smEqualTo(String value) {
            addCriterion("d19sm =", value, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD19smNotEqualTo(String value) {
            addCriterion("d19sm <>", value, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD19smGreaterThan(String value) {
            addCriterion("d19sm >", value, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD19smGreaterThanOrEqualTo(String value) {
            addCriterion("d19sm >=", value, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD19smLessThan(String value) {
            addCriterion("d19sm <", value, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD19smLessThanOrEqualTo(String value) {
            addCriterion("d19sm <=", value, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD19smLike(String value) {
            addCriterion("d19sm like", value, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD19smNotLike(String value) {
            addCriterion("d19sm not like", value, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD19smIn(List<String> values) {
            addCriterion("d19sm in", values, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD19smNotIn(List<String> values) {
            addCriterion("d19sm not in", values, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD19smBetween(String value1, String value2) {
            addCriterion("d19sm between", value1, value2, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD19smNotBetween(String value1, String value2) {
            addCriterion("d19sm not between", value1, value2, "d19sm");
            return (Criteria) this;
        }

        public Criteria andD20smIsNull() {
            addCriterion("d20sm is null");
            return (Criteria) this;
        }

        public Criteria andD20smIsNotNull() {
            addCriterion("d20sm is not null");
            return (Criteria) this;
        }

        public Criteria andD20smEqualTo(String value) {
            addCriterion("d20sm =", value, "d20sm");
            return (Criteria) this;
        }

        public Criteria andD20smNotEqualTo(String value) {
            addCriterion("d20sm <>", value, "d20sm");
            return (Criteria) this;
        }

        public Criteria andD20smGreaterThan(String value) {
            addCriterion("d20sm >", value, "d20sm");
            return (Criteria) this;
        }

        public Criteria andD20smGreaterThanOrEqualTo(String value) {
            addCriterion("d20sm >=", value, "d20sm");
            return (Criteria) this;
        }

        public Criteria andD20smLessThan(String value) {
            addCriterion("d20sm <", value, "d20sm");
            return (Criteria) this;
        }

        public Criteria andD20smLessThanOrEqualTo(String value) {
            addCriterion("d20sm <=", value, "d20sm");
            return (Criteria) this;
        }

        public Criteria andD20smLike(String value) {
            addCriterion("d20sm like", value, "d20sm");
            return (Criteria) this;
        }

        public Criteria andD20smNotLike(String value) {
            addCriterion("d20sm not like", value, "d20sm");
            return (Criteria) this;
        }

        public Criteria andD20smIn(List<String> values) {
            addCriterion("d20sm in", values, "d20sm");
            return (Criteria) this;
        }

        public Criteria andD20smNotIn(List<String> values) {
            addCriterion("d20sm not in", values, "d20sm");
            return (Criteria) this;
        }

        public Criteria andD20smBetween(String value1, String value2) {
            addCriterion("d20sm between", value1, value2, "d20sm");
            return (Criteria) this;
        }

        public Criteria andD20smNotBetween(String value1, String value2) {
            addCriterion("d20sm not between", value1, value2, "d20sm");
            return (Criteria) this;
        }

        public Criteria andE01smIsNull() {
            addCriterion("e01sm is null");
            return (Criteria) this;
        }

        public Criteria andE01smIsNotNull() {
            addCriterion("e01sm is not null");
            return (Criteria) this;
        }

        public Criteria andE01smEqualTo(String value) {
            addCriterion("e01sm =", value, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE01smNotEqualTo(String value) {
            addCriterion("e01sm <>", value, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE01smGreaterThan(String value) {
            addCriterion("e01sm >", value, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE01smGreaterThanOrEqualTo(String value) {
            addCriterion("e01sm >=", value, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE01smLessThan(String value) {
            addCriterion("e01sm <", value, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE01smLessThanOrEqualTo(String value) {
            addCriterion("e01sm <=", value, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE01smLike(String value) {
            addCriterion("e01sm like", value, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE01smNotLike(String value) {
            addCriterion("e01sm not like", value, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE01smIn(List<String> values) {
            addCriterion("e01sm in", values, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE01smNotIn(List<String> values) {
            addCriterion("e01sm not in", values, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE01smBetween(String value1, String value2) {
            addCriterion("e01sm between", value1, value2, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE01smNotBetween(String value1, String value2) {
            addCriterion("e01sm not between", value1, value2, "e01sm");
            return (Criteria) this;
        }

        public Criteria andE02smIsNull() {
            addCriterion("e02sm is null");
            return (Criteria) this;
        }

        public Criteria andE02smIsNotNull() {
            addCriterion("e02sm is not null");
            return (Criteria) this;
        }

        public Criteria andE02smEqualTo(String value) {
            addCriterion("e02sm =", value, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE02smNotEqualTo(String value) {
            addCriterion("e02sm <>", value, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE02smGreaterThan(String value) {
            addCriterion("e02sm >", value, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE02smGreaterThanOrEqualTo(String value) {
            addCriterion("e02sm >=", value, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE02smLessThan(String value) {
            addCriterion("e02sm <", value, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE02smLessThanOrEqualTo(String value) {
            addCriterion("e02sm <=", value, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE02smLike(String value) {
            addCriterion("e02sm like", value, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE02smNotLike(String value) {
            addCriterion("e02sm not like", value, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE02smIn(List<String> values) {
            addCriterion("e02sm in", values, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE02smNotIn(List<String> values) {
            addCriterion("e02sm not in", values, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE02smBetween(String value1, String value2) {
            addCriterion("e02sm between", value1, value2, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE02smNotBetween(String value1, String value2) {
            addCriterion("e02sm not between", value1, value2, "e02sm");
            return (Criteria) this;
        }

        public Criteria andE03smIsNull() {
            addCriterion("e03sm is null");
            return (Criteria) this;
        }

        public Criteria andE03smIsNotNull() {
            addCriterion("e03sm is not null");
            return (Criteria) this;
        }

        public Criteria andE03smEqualTo(String value) {
            addCriterion("e03sm =", value, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE03smNotEqualTo(String value) {
            addCriterion("e03sm <>", value, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE03smGreaterThan(String value) {
            addCriterion("e03sm >", value, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE03smGreaterThanOrEqualTo(String value) {
            addCriterion("e03sm >=", value, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE03smLessThan(String value) {
            addCriterion("e03sm <", value, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE03smLessThanOrEqualTo(String value) {
            addCriterion("e03sm <=", value, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE03smLike(String value) {
            addCriterion("e03sm like", value, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE03smNotLike(String value) {
            addCriterion("e03sm not like", value, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE03smIn(List<String> values) {
            addCriterion("e03sm in", values, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE03smNotIn(List<String> values) {
            addCriterion("e03sm not in", values, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE03smBetween(String value1, String value2) {
            addCriterion("e03sm between", value1, value2, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE03smNotBetween(String value1, String value2) {
            addCriterion("e03sm not between", value1, value2, "e03sm");
            return (Criteria) this;
        }

        public Criteria andE04smIsNull() {
            addCriterion("e04sm is null");
            return (Criteria) this;
        }

        public Criteria andE04smIsNotNull() {
            addCriterion("e04sm is not null");
            return (Criteria) this;
        }

        public Criteria andE04smEqualTo(String value) {
            addCriterion("e04sm =", value, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE04smNotEqualTo(String value) {
            addCriterion("e04sm <>", value, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE04smGreaterThan(String value) {
            addCriterion("e04sm >", value, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE04smGreaterThanOrEqualTo(String value) {
            addCriterion("e04sm >=", value, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE04smLessThan(String value) {
            addCriterion("e04sm <", value, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE04smLessThanOrEqualTo(String value) {
            addCriterion("e04sm <=", value, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE04smLike(String value) {
            addCriterion("e04sm like", value, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE04smNotLike(String value) {
            addCriterion("e04sm not like", value, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE04smIn(List<String> values) {
            addCriterion("e04sm in", values, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE04smNotIn(List<String> values) {
            addCriterion("e04sm not in", values, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE04smBetween(String value1, String value2) {
            addCriterion("e04sm between", value1, value2, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE04smNotBetween(String value1, String value2) {
            addCriterion("e04sm not between", value1, value2, "e04sm");
            return (Criteria) this;
        }

        public Criteria andE05smIsNull() {
            addCriterion("e05sm is null");
            return (Criteria) this;
        }

        public Criteria andE05smIsNotNull() {
            addCriterion("e05sm is not null");
            return (Criteria) this;
        }

        public Criteria andE05smEqualTo(String value) {
            addCriterion("e05sm =", value, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE05smNotEqualTo(String value) {
            addCriterion("e05sm <>", value, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE05smGreaterThan(String value) {
            addCriterion("e05sm >", value, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE05smGreaterThanOrEqualTo(String value) {
            addCriterion("e05sm >=", value, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE05smLessThan(String value) {
            addCriterion("e05sm <", value, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE05smLessThanOrEqualTo(String value) {
            addCriterion("e05sm <=", value, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE05smLike(String value) {
            addCriterion("e05sm like", value, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE05smNotLike(String value) {
            addCriterion("e05sm not like", value, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE05smIn(List<String> values) {
            addCriterion("e05sm in", values, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE05smNotIn(List<String> values) {
            addCriterion("e05sm not in", values, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE05smBetween(String value1, String value2) {
            addCriterion("e05sm between", value1, value2, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE05smNotBetween(String value1, String value2) {
            addCriterion("e05sm not between", value1, value2, "e05sm");
            return (Criteria) this;
        }

        public Criteria andE06smIsNull() {
            addCriterion("e06sm is null");
            return (Criteria) this;
        }

        public Criteria andE06smIsNotNull() {
            addCriterion("e06sm is not null");
            return (Criteria) this;
        }

        public Criteria andE06smEqualTo(String value) {
            addCriterion("e06sm =", value, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE06smNotEqualTo(String value) {
            addCriterion("e06sm <>", value, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE06smGreaterThan(String value) {
            addCriterion("e06sm >", value, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE06smGreaterThanOrEqualTo(String value) {
            addCriterion("e06sm >=", value, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE06smLessThan(String value) {
            addCriterion("e06sm <", value, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE06smLessThanOrEqualTo(String value) {
            addCriterion("e06sm <=", value, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE06smLike(String value) {
            addCriterion("e06sm like", value, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE06smNotLike(String value) {
            addCriterion("e06sm not like", value, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE06smIn(List<String> values) {
            addCriterion("e06sm in", values, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE06smNotIn(List<String> values) {
            addCriterion("e06sm not in", values, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE06smBetween(String value1, String value2) {
            addCriterion("e06sm between", value1, value2, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE06smNotBetween(String value1, String value2) {
            addCriterion("e06sm not between", value1, value2, "e06sm");
            return (Criteria) this;
        }

        public Criteria andE07smIsNull() {
            addCriterion("e07sm is null");
            return (Criteria) this;
        }

        public Criteria andE07smIsNotNull() {
            addCriterion("e07sm is not null");
            return (Criteria) this;
        }

        public Criteria andE07smEqualTo(String value) {
            addCriterion("e07sm =", value, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE07smNotEqualTo(String value) {
            addCriterion("e07sm <>", value, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE07smGreaterThan(String value) {
            addCriterion("e07sm >", value, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE07smGreaterThanOrEqualTo(String value) {
            addCriterion("e07sm >=", value, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE07smLessThan(String value) {
            addCriterion("e07sm <", value, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE07smLessThanOrEqualTo(String value) {
            addCriterion("e07sm <=", value, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE07smLike(String value) {
            addCriterion("e07sm like", value, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE07smNotLike(String value) {
            addCriterion("e07sm not like", value, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE07smIn(List<String> values) {
            addCriterion("e07sm in", values, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE07smNotIn(List<String> values) {
            addCriterion("e07sm not in", values, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE07smBetween(String value1, String value2) {
            addCriterion("e07sm between", value1, value2, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE07smNotBetween(String value1, String value2) {
            addCriterion("e07sm not between", value1, value2, "e07sm");
            return (Criteria) this;
        }

        public Criteria andE08smIsNull() {
            addCriterion("e08sm is null");
            return (Criteria) this;
        }

        public Criteria andE08smIsNotNull() {
            addCriterion("e08sm is not null");
            return (Criteria) this;
        }

        public Criteria andE08smEqualTo(String value) {
            addCriterion("e08sm =", value, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE08smNotEqualTo(String value) {
            addCriterion("e08sm <>", value, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE08smGreaterThan(String value) {
            addCriterion("e08sm >", value, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE08smGreaterThanOrEqualTo(String value) {
            addCriterion("e08sm >=", value, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE08smLessThan(String value) {
            addCriterion("e08sm <", value, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE08smLessThanOrEqualTo(String value) {
            addCriterion("e08sm <=", value, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE08smLike(String value) {
            addCriterion("e08sm like", value, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE08smNotLike(String value) {
            addCriterion("e08sm not like", value, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE08smIn(List<String> values) {
            addCriterion("e08sm in", values, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE08smNotIn(List<String> values) {
            addCriterion("e08sm not in", values, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE08smBetween(String value1, String value2) {
            addCriterion("e08sm between", value1, value2, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE08smNotBetween(String value1, String value2) {
            addCriterion("e08sm not between", value1, value2, "e08sm");
            return (Criteria) this;
        }

        public Criteria andE09smIsNull() {
            addCriterion("e09sm is null");
            return (Criteria) this;
        }

        public Criteria andE09smIsNotNull() {
            addCriterion("e09sm is not null");
            return (Criteria) this;
        }

        public Criteria andE09smEqualTo(String value) {
            addCriterion("e09sm =", value, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE09smNotEqualTo(String value) {
            addCriterion("e09sm <>", value, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE09smGreaterThan(String value) {
            addCriterion("e09sm >", value, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE09smGreaterThanOrEqualTo(String value) {
            addCriterion("e09sm >=", value, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE09smLessThan(String value) {
            addCriterion("e09sm <", value, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE09smLessThanOrEqualTo(String value) {
            addCriterion("e09sm <=", value, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE09smLike(String value) {
            addCriterion("e09sm like", value, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE09smNotLike(String value) {
            addCriterion("e09sm not like", value, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE09smIn(List<String> values) {
            addCriterion("e09sm in", values, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE09smNotIn(List<String> values) {
            addCriterion("e09sm not in", values, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE09smBetween(String value1, String value2) {
            addCriterion("e09sm between", value1, value2, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE09smNotBetween(String value1, String value2) {
            addCriterion("e09sm not between", value1, value2, "e09sm");
            return (Criteria) this;
        }

        public Criteria andE10smIsNull() {
            addCriterion("e10sm is null");
            return (Criteria) this;
        }

        public Criteria andE10smIsNotNull() {
            addCriterion("e10sm is not null");
            return (Criteria) this;
        }

        public Criteria andE10smEqualTo(String value) {
            addCriterion("e10sm =", value, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE10smNotEqualTo(String value) {
            addCriterion("e10sm <>", value, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE10smGreaterThan(String value) {
            addCriterion("e10sm >", value, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE10smGreaterThanOrEqualTo(String value) {
            addCriterion("e10sm >=", value, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE10smLessThan(String value) {
            addCriterion("e10sm <", value, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE10smLessThanOrEqualTo(String value) {
            addCriterion("e10sm <=", value, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE10smLike(String value) {
            addCriterion("e10sm like", value, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE10smNotLike(String value) {
            addCriterion("e10sm not like", value, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE10smIn(List<String> values) {
            addCriterion("e10sm in", values, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE10smNotIn(List<String> values) {
            addCriterion("e10sm not in", values, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE10smBetween(String value1, String value2) {
            addCriterion("e10sm between", value1, value2, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE10smNotBetween(String value1, String value2) {
            addCriterion("e10sm not between", value1, value2, "e10sm");
            return (Criteria) this;
        }

        public Criteria andE11smIsNull() {
            addCriterion("e11sm is null");
            return (Criteria) this;
        }

        public Criteria andE11smIsNotNull() {
            addCriterion("e11sm is not null");
            return (Criteria) this;
        }

        public Criteria andE11smEqualTo(String value) {
            addCriterion("e11sm =", value, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE11smNotEqualTo(String value) {
            addCriterion("e11sm <>", value, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE11smGreaterThan(String value) {
            addCriterion("e11sm >", value, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE11smGreaterThanOrEqualTo(String value) {
            addCriterion("e11sm >=", value, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE11smLessThan(String value) {
            addCriterion("e11sm <", value, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE11smLessThanOrEqualTo(String value) {
            addCriterion("e11sm <=", value, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE11smLike(String value) {
            addCriterion("e11sm like", value, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE11smNotLike(String value) {
            addCriterion("e11sm not like", value, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE11smIn(List<String> values) {
            addCriterion("e11sm in", values, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE11smNotIn(List<String> values) {
            addCriterion("e11sm not in", values, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE11smBetween(String value1, String value2) {
            addCriterion("e11sm between", value1, value2, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE11smNotBetween(String value1, String value2) {
            addCriterion("e11sm not between", value1, value2, "e11sm");
            return (Criteria) this;
        }

        public Criteria andE12smIsNull() {
            addCriterion("e12sm is null");
            return (Criteria) this;
        }

        public Criteria andE12smIsNotNull() {
            addCriterion("e12sm is not null");
            return (Criteria) this;
        }

        public Criteria andE12smEqualTo(String value) {
            addCriterion("e12sm =", value, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE12smNotEqualTo(String value) {
            addCriterion("e12sm <>", value, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE12smGreaterThan(String value) {
            addCriterion("e12sm >", value, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE12smGreaterThanOrEqualTo(String value) {
            addCriterion("e12sm >=", value, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE12smLessThan(String value) {
            addCriterion("e12sm <", value, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE12smLessThanOrEqualTo(String value) {
            addCriterion("e12sm <=", value, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE12smLike(String value) {
            addCriterion("e12sm like", value, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE12smNotLike(String value) {
            addCriterion("e12sm not like", value, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE12smIn(List<String> values) {
            addCriterion("e12sm in", values, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE12smNotIn(List<String> values) {
            addCriterion("e12sm not in", values, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE12smBetween(String value1, String value2) {
            addCriterion("e12sm between", value1, value2, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE12smNotBetween(String value1, String value2) {
            addCriterion("e12sm not between", value1, value2, "e12sm");
            return (Criteria) this;
        }

        public Criteria andE13smIsNull() {
            addCriterion("e13sm is null");
            return (Criteria) this;
        }

        public Criteria andE13smIsNotNull() {
            addCriterion("e13sm is not null");
            return (Criteria) this;
        }

        public Criteria andE13smEqualTo(String value) {
            addCriterion("e13sm =", value, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE13smNotEqualTo(String value) {
            addCriterion("e13sm <>", value, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE13smGreaterThan(String value) {
            addCriterion("e13sm >", value, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE13smGreaterThanOrEqualTo(String value) {
            addCriterion("e13sm >=", value, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE13smLessThan(String value) {
            addCriterion("e13sm <", value, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE13smLessThanOrEqualTo(String value) {
            addCriterion("e13sm <=", value, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE13smLike(String value) {
            addCriterion("e13sm like", value, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE13smNotLike(String value) {
            addCriterion("e13sm not like", value, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE13smIn(List<String> values) {
            addCriterion("e13sm in", values, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE13smNotIn(List<String> values) {
            addCriterion("e13sm not in", values, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE13smBetween(String value1, String value2) {
            addCriterion("e13sm between", value1, value2, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE13smNotBetween(String value1, String value2) {
            addCriterion("e13sm not between", value1, value2, "e13sm");
            return (Criteria) this;
        }

        public Criteria andE14smIsNull() {
            addCriterion("e14sm is null");
            return (Criteria) this;
        }

        public Criteria andE14smIsNotNull() {
            addCriterion("e14sm is not null");
            return (Criteria) this;
        }

        public Criteria andE14smEqualTo(String value) {
            addCriterion("e14sm =", value, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE14smNotEqualTo(String value) {
            addCriterion("e14sm <>", value, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE14smGreaterThan(String value) {
            addCriterion("e14sm >", value, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE14smGreaterThanOrEqualTo(String value) {
            addCriterion("e14sm >=", value, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE14smLessThan(String value) {
            addCriterion("e14sm <", value, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE14smLessThanOrEqualTo(String value) {
            addCriterion("e14sm <=", value, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE14smLike(String value) {
            addCriterion("e14sm like", value, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE14smNotLike(String value) {
            addCriterion("e14sm not like", value, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE14smIn(List<String> values) {
            addCriterion("e14sm in", values, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE14smNotIn(List<String> values) {
            addCriterion("e14sm not in", values, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE14smBetween(String value1, String value2) {
            addCriterion("e14sm between", value1, value2, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE14smNotBetween(String value1, String value2) {
            addCriterion("e14sm not between", value1, value2, "e14sm");
            return (Criteria) this;
        }

        public Criteria andE15smIsNull() {
            addCriterion("e15sm is null");
            return (Criteria) this;
        }

        public Criteria andE15smIsNotNull() {
            addCriterion("e15sm is not null");
            return (Criteria) this;
        }

        public Criteria andE15smEqualTo(String value) {
            addCriterion("e15sm =", value, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE15smNotEqualTo(String value) {
            addCriterion("e15sm <>", value, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE15smGreaterThan(String value) {
            addCriterion("e15sm >", value, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE15smGreaterThanOrEqualTo(String value) {
            addCriterion("e15sm >=", value, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE15smLessThan(String value) {
            addCriterion("e15sm <", value, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE15smLessThanOrEqualTo(String value) {
            addCriterion("e15sm <=", value, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE15smLike(String value) {
            addCriterion("e15sm like", value, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE15smNotLike(String value) {
            addCriterion("e15sm not like", value, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE15smIn(List<String> values) {
            addCriterion("e15sm in", values, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE15smNotIn(List<String> values) {
            addCriterion("e15sm not in", values, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE15smBetween(String value1, String value2) {
            addCriterion("e15sm between", value1, value2, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE15smNotBetween(String value1, String value2) {
            addCriterion("e15sm not between", value1, value2, "e15sm");
            return (Criteria) this;
        }

        public Criteria andE16smIsNull() {
            addCriterion("e16sm is null");
            return (Criteria) this;
        }

        public Criteria andE16smIsNotNull() {
            addCriterion("e16sm is not null");
            return (Criteria) this;
        }

        public Criteria andE16smEqualTo(String value) {
            addCriterion("e16sm =", value, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE16smNotEqualTo(String value) {
            addCriterion("e16sm <>", value, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE16smGreaterThan(String value) {
            addCriterion("e16sm >", value, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE16smGreaterThanOrEqualTo(String value) {
            addCriterion("e16sm >=", value, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE16smLessThan(String value) {
            addCriterion("e16sm <", value, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE16smLessThanOrEqualTo(String value) {
            addCriterion("e16sm <=", value, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE16smLike(String value) {
            addCriterion("e16sm like", value, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE16smNotLike(String value) {
            addCriterion("e16sm not like", value, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE16smIn(List<String> values) {
            addCriterion("e16sm in", values, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE16smNotIn(List<String> values) {
            addCriterion("e16sm not in", values, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE16smBetween(String value1, String value2) {
            addCriterion("e16sm between", value1, value2, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE16smNotBetween(String value1, String value2) {
            addCriterion("e16sm not between", value1, value2, "e16sm");
            return (Criteria) this;
        }

        public Criteria andE17smIsNull() {
            addCriterion("e17sm is null");
            return (Criteria) this;
        }

        public Criteria andE17smIsNotNull() {
            addCriterion("e17sm is not null");
            return (Criteria) this;
        }

        public Criteria andE17smEqualTo(String value) {
            addCriterion("e17sm =", value, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE17smNotEqualTo(String value) {
            addCriterion("e17sm <>", value, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE17smGreaterThan(String value) {
            addCriterion("e17sm >", value, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE17smGreaterThanOrEqualTo(String value) {
            addCriterion("e17sm >=", value, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE17smLessThan(String value) {
            addCriterion("e17sm <", value, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE17smLessThanOrEqualTo(String value) {
            addCriterion("e17sm <=", value, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE17smLike(String value) {
            addCriterion("e17sm like", value, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE17smNotLike(String value) {
            addCriterion("e17sm not like", value, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE17smIn(List<String> values) {
            addCriterion("e17sm in", values, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE17smNotIn(List<String> values) {
            addCriterion("e17sm not in", values, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE17smBetween(String value1, String value2) {
            addCriterion("e17sm between", value1, value2, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE17smNotBetween(String value1, String value2) {
            addCriterion("e17sm not between", value1, value2, "e17sm");
            return (Criteria) this;
        }

        public Criteria andE18smIsNull() {
            addCriterion("e18sm is null");
            return (Criteria) this;
        }

        public Criteria andE18smIsNotNull() {
            addCriterion("e18sm is not null");
            return (Criteria) this;
        }

        public Criteria andE18smEqualTo(String value) {
            addCriterion("e18sm =", value, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE18smNotEqualTo(String value) {
            addCriterion("e18sm <>", value, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE18smGreaterThan(String value) {
            addCriterion("e18sm >", value, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE18smGreaterThanOrEqualTo(String value) {
            addCriterion("e18sm >=", value, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE18smLessThan(String value) {
            addCriterion("e18sm <", value, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE18smLessThanOrEqualTo(String value) {
            addCriterion("e18sm <=", value, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE18smLike(String value) {
            addCriterion("e18sm like", value, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE18smNotLike(String value) {
            addCriterion("e18sm not like", value, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE18smIn(List<String> values) {
            addCriterion("e18sm in", values, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE18smNotIn(List<String> values) {
            addCriterion("e18sm not in", values, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE18smBetween(String value1, String value2) {
            addCriterion("e18sm between", value1, value2, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE18smNotBetween(String value1, String value2) {
            addCriterion("e18sm not between", value1, value2, "e18sm");
            return (Criteria) this;
        }

        public Criteria andE19smIsNull() {
            addCriterion("e19sm is null");
            return (Criteria) this;
        }

        public Criteria andE19smIsNotNull() {
            addCriterion("e19sm is not null");
            return (Criteria) this;
        }

        public Criteria andE19smEqualTo(String value) {
            addCriterion("e19sm =", value, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE19smNotEqualTo(String value) {
            addCriterion("e19sm <>", value, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE19smGreaterThan(String value) {
            addCriterion("e19sm >", value, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE19smGreaterThanOrEqualTo(String value) {
            addCriterion("e19sm >=", value, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE19smLessThan(String value) {
            addCriterion("e19sm <", value, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE19smLessThanOrEqualTo(String value) {
            addCriterion("e19sm <=", value, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE19smLike(String value) {
            addCriterion("e19sm like", value, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE19smNotLike(String value) {
            addCriterion("e19sm not like", value, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE19smIn(List<String> values) {
            addCriterion("e19sm in", values, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE19smNotIn(List<String> values) {
            addCriterion("e19sm not in", values, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE19smBetween(String value1, String value2) {
            addCriterion("e19sm between", value1, value2, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE19smNotBetween(String value1, String value2) {
            addCriterion("e19sm not between", value1, value2, "e19sm");
            return (Criteria) this;
        }

        public Criteria andE20smIsNull() {
            addCriterion("e20sm is null");
            return (Criteria) this;
        }

        public Criteria andE20smIsNotNull() {
            addCriterion("e20sm is not null");
            return (Criteria) this;
        }

        public Criteria andE20smEqualTo(String value) {
            addCriterion("e20sm =", value, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE20smNotEqualTo(String value) {
            addCriterion("e20sm <>", value, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE20smGreaterThan(String value) {
            addCriterion("e20sm >", value, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE20smGreaterThanOrEqualTo(String value) {
            addCriterion("e20sm >=", value, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE20smLessThan(String value) {
            addCriterion("e20sm <", value, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE20smLessThanOrEqualTo(String value) {
            addCriterion("e20sm <=", value, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE20smLike(String value) {
            addCriterion("e20sm like", value, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE20smNotLike(String value) {
            addCriterion("e20sm not like", value, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE20smIn(List<String> values) {
            addCriterion("e20sm in", values, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE20smNotIn(List<String> values) {
            addCriterion("e20sm not in", values, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE20smBetween(String value1, String value2) {
            addCriterion("e20sm between", value1, value2, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE20smNotBetween(String value1, String value2) {
            addCriterion("e20sm not between", value1, value2, "e20sm");
            return (Criteria) this;
        }

        public Criteria andE21smIsNull() {
            addCriterion("e21sm is null");
            return (Criteria) this;
        }

        public Criteria andE21smIsNotNull() {
            addCriterion("e21sm is not null");
            return (Criteria) this;
        }

        public Criteria andE21smEqualTo(String value) {
            addCriterion("e21sm =", value, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE21smNotEqualTo(String value) {
            addCriterion("e21sm <>", value, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE21smGreaterThan(String value) {
            addCriterion("e21sm >", value, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE21smGreaterThanOrEqualTo(String value) {
            addCriterion("e21sm >=", value, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE21smLessThan(String value) {
            addCriterion("e21sm <", value, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE21smLessThanOrEqualTo(String value) {
            addCriterion("e21sm <=", value, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE21smLike(String value) {
            addCriterion("e21sm like", value, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE21smNotLike(String value) {
            addCriterion("e21sm not like", value, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE21smIn(List<String> values) {
            addCriterion("e21sm in", values, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE21smNotIn(List<String> values) {
            addCriterion("e21sm not in", values, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE21smBetween(String value1, String value2) {
            addCriterion("e21sm between", value1, value2, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE21smNotBetween(String value1, String value2) {
            addCriterion("e21sm not between", value1, value2, "e21sm");
            return (Criteria) this;
        }

        public Criteria andE22smIsNull() {
            addCriterion("e22sm is null");
            return (Criteria) this;
        }

        public Criteria andE22smIsNotNull() {
            addCriterion("e22sm is not null");
            return (Criteria) this;
        }

        public Criteria andE22smEqualTo(String value) {
            addCriterion("e22sm =", value, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE22smNotEqualTo(String value) {
            addCriterion("e22sm <>", value, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE22smGreaterThan(String value) {
            addCriterion("e22sm >", value, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE22smGreaterThanOrEqualTo(String value) {
            addCriterion("e22sm >=", value, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE22smLessThan(String value) {
            addCriterion("e22sm <", value, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE22smLessThanOrEqualTo(String value) {
            addCriterion("e22sm <=", value, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE22smLike(String value) {
            addCriterion("e22sm like", value, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE22smNotLike(String value) {
            addCriterion("e22sm not like", value, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE22smIn(List<String> values) {
            addCriterion("e22sm in", values, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE22smNotIn(List<String> values) {
            addCriterion("e22sm not in", values, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE22smBetween(String value1, String value2) {
            addCriterion("e22sm between", value1, value2, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE22smNotBetween(String value1, String value2) {
            addCriterion("e22sm not between", value1, value2, "e22sm");
            return (Criteria) this;
        }

        public Criteria andE23smIsNull() {
            addCriterion("e23sm is null");
            return (Criteria) this;
        }

        public Criteria andE23smIsNotNull() {
            addCriterion("e23sm is not null");
            return (Criteria) this;
        }

        public Criteria andE23smEqualTo(String value) {
            addCriterion("e23sm =", value, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE23smNotEqualTo(String value) {
            addCriterion("e23sm <>", value, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE23smGreaterThan(String value) {
            addCriterion("e23sm >", value, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE23smGreaterThanOrEqualTo(String value) {
            addCriterion("e23sm >=", value, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE23smLessThan(String value) {
            addCriterion("e23sm <", value, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE23smLessThanOrEqualTo(String value) {
            addCriterion("e23sm <=", value, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE23smLike(String value) {
            addCriterion("e23sm like", value, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE23smNotLike(String value) {
            addCriterion("e23sm not like", value, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE23smIn(List<String> values) {
            addCriterion("e23sm in", values, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE23smNotIn(List<String> values) {
            addCriterion("e23sm not in", values, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE23smBetween(String value1, String value2) {
            addCriterion("e23sm between", value1, value2, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE23smNotBetween(String value1, String value2) {
            addCriterion("e23sm not between", value1, value2, "e23sm");
            return (Criteria) this;
        }

        public Criteria andE24smIsNull() {
            addCriterion("e24sm is null");
            return (Criteria) this;
        }

        public Criteria andE24smIsNotNull() {
            addCriterion("e24sm is not null");
            return (Criteria) this;
        }

        public Criteria andE24smEqualTo(String value) {
            addCriterion("e24sm =", value, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE24smNotEqualTo(String value) {
            addCriterion("e24sm <>", value, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE24smGreaterThan(String value) {
            addCriterion("e24sm >", value, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE24smGreaterThanOrEqualTo(String value) {
            addCriterion("e24sm >=", value, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE24smLessThan(String value) {
            addCriterion("e24sm <", value, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE24smLessThanOrEqualTo(String value) {
            addCriterion("e24sm <=", value, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE24smLike(String value) {
            addCriterion("e24sm like", value, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE24smNotLike(String value) {
            addCriterion("e24sm not like", value, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE24smIn(List<String> values) {
            addCriterion("e24sm in", values, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE24smNotIn(List<String> values) {
            addCriterion("e24sm not in", values, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE24smBetween(String value1, String value2) {
            addCriterion("e24sm between", value1, value2, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE24smNotBetween(String value1, String value2) {
            addCriterion("e24sm not between", value1, value2, "e24sm");
            return (Criteria) this;
        }

        public Criteria andE25smIsNull() {
            addCriterion("e25sm is null");
            return (Criteria) this;
        }

        public Criteria andE25smIsNotNull() {
            addCriterion("e25sm is not null");
            return (Criteria) this;
        }

        public Criteria andE25smEqualTo(String value) {
            addCriterion("e25sm =", value, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE25smNotEqualTo(String value) {
            addCriterion("e25sm <>", value, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE25smGreaterThan(String value) {
            addCriterion("e25sm >", value, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE25smGreaterThanOrEqualTo(String value) {
            addCriterion("e25sm >=", value, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE25smLessThan(String value) {
            addCriterion("e25sm <", value, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE25smLessThanOrEqualTo(String value) {
            addCriterion("e25sm <=", value, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE25smLike(String value) {
            addCriterion("e25sm like", value, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE25smNotLike(String value) {
            addCriterion("e25sm not like", value, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE25smIn(List<String> values) {
            addCriterion("e25sm in", values, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE25smNotIn(List<String> values) {
            addCriterion("e25sm not in", values, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE25smBetween(String value1, String value2) {
            addCriterion("e25sm between", value1, value2, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE25smNotBetween(String value1, String value2) {
            addCriterion("e25sm not between", value1, value2, "e25sm");
            return (Criteria) this;
        }

        public Criteria andE26smIsNull() {
            addCriterion("e26sm is null");
            return (Criteria) this;
        }

        public Criteria andE26smIsNotNull() {
            addCriterion("e26sm is not null");
            return (Criteria) this;
        }

        public Criteria andE26smEqualTo(String value) {
            addCriterion("e26sm =", value, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE26smNotEqualTo(String value) {
            addCriterion("e26sm <>", value, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE26smGreaterThan(String value) {
            addCriterion("e26sm >", value, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE26smGreaterThanOrEqualTo(String value) {
            addCriterion("e26sm >=", value, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE26smLessThan(String value) {
            addCriterion("e26sm <", value, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE26smLessThanOrEqualTo(String value) {
            addCriterion("e26sm <=", value, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE26smLike(String value) {
            addCriterion("e26sm like", value, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE26smNotLike(String value) {
            addCriterion("e26sm not like", value, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE26smIn(List<String> values) {
            addCriterion("e26sm in", values, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE26smNotIn(List<String> values) {
            addCriterion("e26sm not in", values, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE26smBetween(String value1, String value2) {
            addCriterion("e26sm between", value1, value2, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE26smNotBetween(String value1, String value2) {
            addCriterion("e26sm not between", value1, value2, "e26sm");
            return (Criteria) this;
        }

        public Criteria andE27smIsNull() {
            addCriterion("e27sm is null");
            return (Criteria) this;
        }

        public Criteria andE27smIsNotNull() {
            addCriterion("e27sm is not null");
            return (Criteria) this;
        }

        public Criteria andE27smEqualTo(String value) {
            addCriterion("e27sm =", value, "e27sm");
            return (Criteria) this;
        }

        public Criteria andE27smNotEqualTo(String value) {
            addCriterion("e27sm <>", value, "e27sm");
            return (Criteria) this;
        }

        public Criteria andE27smGreaterThan(String value) {
            addCriterion("e27sm >", value, "e27sm");
            return (Criteria) this;
        }

        public Criteria andE27smGreaterThanOrEqualTo(String value) {
            addCriterion("e27sm >=", value, "e27sm");
            return (Criteria) this;
        }

        public Criteria andE27smLessThan(String value) {
            addCriterion("e27sm <", value, "e27sm");
            return (Criteria) this;
        }

        public Criteria andE27smLessThanOrEqualTo(String value) {
            addCriterion("e27sm <=", value, "e27sm");
            return (Criteria) this;
        }

        public Criteria andE27smLike(String value) {
            addCriterion("e27sm like", value, "e27sm");
            return (Criteria) this;
        }

        public Criteria andE27smNotLike(String value) {
            addCriterion("e27sm not like", value, "e27sm");
            return (Criteria) this;
        }

        public Criteria andE27smIn(List<String> values) {
            addCriterion("e27sm in", values, "e27sm");
            return (Criteria) this;
        }

        public Criteria andE27smNotIn(List<String> values) {
            addCriterion("e27sm not in", values, "e27sm");
            return (Criteria) this;
        }

        public Criteria andE27smBetween(String value1, String value2) {
            addCriterion("e27sm between", value1, value2, "e27sm");
            return (Criteria) this;
        }

        public Criteria andE27smNotBetween(String value1, String value2) {
            addCriterion("e27sm not between", value1, value2, "e27sm");
            return (Criteria) this;
        }

        public Criteria andF01smIsNull() {
            addCriterion("f01sm is null");
            return (Criteria) this;
        }

        public Criteria andF01smIsNotNull() {
            addCriterion("f01sm is not null");
            return (Criteria) this;
        }

        public Criteria andF01smEqualTo(String value) {
            addCriterion("f01sm =", value, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF01smNotEqualTo(String value) {
            addCriterion("f01sm <>", value, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF01smGreaterThan(String value) {
            addCriterion("f01sm >", value, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF01smGreaterThanOrEqualTo(String value) {
            addCriterion("f01sm >=", value, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF01smLessThan(String value) {
            addCriterion("f01sm <", value, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF01smLessThanOrEqualTo(String value) {
            addCriterion("f01sm <=", value, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF01smLike(String value) {
            addCriterion("f01sm like", value, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF01smNotLike(String value) {
            addCriterion("f01sm not like", value, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF01smIn(List<String> values) {
            addCriterion("f01sm in", values, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF01smNotIn(List<String> values) {
            addCriterion("f01sm not in", values, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF01smBetween(String value1, String value2) {
            addCriterion("f01sm between", value1, value2, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF01smNotBetween(String value1, String value2) {
            addCriterion("f01sm not between", value1, value2, "f01sm");
            return (Criteria) this;
        }

        public Criteria andF02smIsNull() {
            addCriterion("f02sm is null");
            return (Criteria) this;
        }

        public Criteria andF02smIsNotNull() {
            addCriterion("f02sm is not null");
            return (Criteria) this;
        }

        public Criteria andF02smEqualTo(String value) {
            addCriterion("f02sm =", value, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF02smNotEqualTo(String value) {
            addCriterion("f02sm <>", value, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF02smGreaterThan(String value) {
            addCriterion("f02sm >", value, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF02smGreaterThanOrEqualTo(String value) {
            addCriterion("f02sm >=", value, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF02smLessThan(String value) {
            addCriterion("f02sm <", value, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF02smLessThanOrEqualTo(String value) {
            addCriterion("f02sm <=", value, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF02smLike(String value) {
            addCriterion("f02sm like", value, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF02smNotLike(String value) {
            addCriterion("f02sm not like", value, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF02smIn(List<String> values) {
            addCriterion("f02sm in", values, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF02smNotIn(List<String> values) {
            addCriterion("f02sm not in", values, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF02smBetween(String value1, String value2) {
            addCriterion("f02sm between", value1, value2, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF02smNotBetween(String value1, String value2) {
            addCriterion("f02sm not between", value1, value2, "f02sm");
            return (Criteria) this;
        }

        public Criteria andF03smIsNull() {
            addCriterion("f03sm is null");
            return (Criteria) this;
        }

        public Criteria andF03smIsNotNull() {
            addCriterion("f03sm is not null");
            return (Criteria) this;
        }

        public Criteria andF03smEqualTo(String value) {
            addCriterion("f03sm =", value, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF03smNotEqualTo(String value) {
            addCriterion("f03sm <>", value, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF03smGreaterThan(String value) {
            addCriterion("f03sm >", value, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF03smGreaterThanOrEqualTo(String value) {
            addCriterion("f03sm >=", value, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF03smLessThan(String value) {
            addCriterion("f03sm <", value, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF03smLessThanOrEqualTo(String value) {
            addCriterion("f03sm <=", value, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF03smLike(String value) {
            addCriterion("f03sm like", value, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF03smNotLike(String value) {
            addCriterion("f03sm not like", value, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF03smIn(List<String> values) {
            addCriterion("f03sm in", values, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF03smNotIn(List<String> values) {
            addCriterion("f03sm not in", values, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF03smBetween(String value1, String value2) {
            addCriterion("f03sm between", value1, value2, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF03smNotBetween(String value1, String value2) {
            addCriterion("f03sm not between", value1, value2, "f03sm");
            return (Criteria) this;
        }

        public Criteria andF04smIsNull() {
            addCriterion("f04sm is null");
            return (Criteria) this;
        }

        public Criteria andF04smIsNotNull() {
            addCriterion("f04sm is not null");
            return (Criteria) this;
        }

        public Criteria andF04smEqualTo(String value) {
            addCriterion("f04sm =", value, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF04smNotEqualTo(String value) {
            addCriterion("f04sm <>", value, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF04smGreaterThan(String value) {
            addCriterion("f04sm >", value, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF04smGreaterThanOrEqualTo(String value) {
            addCriterion("f04sm >=", value, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF04smLessThan(String value) {
            addCriterion("f04sm <", value, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF04smLessThanOrEqualTo(String value) {
            addCriterion("f04sm <=", value, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF04smLike(String value) {
            addCriterion("f04sm like", value, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF04smNotLike(String value) {
            addCriterion("f04sm not like", value, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF04smIn(List<String> values) {
            addCriterion("f04sm in", values, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF04smNotIn(List<String> values) {
            addCriterion("f04sm not in", values, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF04smBetween(String value1, String value2) {
            addCriterion("f04sm between", value1, value2, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF04smNotBetween(String value1, String value2) {
            addCriterion("f04sm not between", value1, value2, "f04sm");
            return (Criteria) this;
        }

        public Criteria andF05smIsNull() {
            addCriterion("f05sm is null");
            return (Criteria) this;
        }

        public Criteria andF05smIsNotNull() {
            addCriterion("f05sm is not null");
            return (Criteria) this;
        }

        public Criteria andF05smEqualTo(String value) {
            addCriterion("f05sm =", value, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF05smNotEqualTo(String value) {
            addCriterion("f05sm <>", value, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF05smGreaterThan(String value) {
            addCriterion("f05sm >", value, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF05smGreaterThanOrEqualTo(String value) {
            addCriterion("f05sm >=", value, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF05smLessThan(String value) {
            addCriterion("f05sm <", value, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF05smLessThanOrEqualTo(String value) {
            addCriterion("f05sm <=", value, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF05smLike(String value) {
            addCriterion("f05sm like", value, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF05smNotLike(String value) {
            addCriterion("f05sm not like", value, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF05smIn(List<String> values) {
            addCriterion("f05sm in", values, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF05smNotIn(List<String> values) {
            addCriterion("f05sm not in", values, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF05smBetween(String value1, String value2) {
            addCriterion("f05sm between", value1, value2, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF05smNotBetween(String value1, String value2) {
            addCriterion("f05sm not between", value1, value2, "f05sm");
            return (Criteria) this;
        }

        public Criteria andF06smIsNull() {
            addCriterion("f06sm is null");
            return (Criteria) this;
        }

        public Criteria andF06smIsNotNull() {
            addCriterion("f06sm is not null");
            return (Criteria) this;
        }

        public Criteria andF06smEqualTo(String value) {
            addCriterion("f06sm =", value, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF06smNotEqualTo(String value) {
            addCriterion("f06sm <>", value, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF06smGreaterThan(String value) {
            addCriterion("f06sm >", value, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF06smGreaterThanOrEqualTo(String value) {
            addCriterion("f06sm >=", value, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF06smLessThan(String value) {
            addCriterion("f06sm <", value, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF06smLessThanOrEqualTo(String value) {
            addCriterion("f06sm <=", value, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF06smLike(String value) {
            addCriterion("f06sm like", value, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF06smNotLike(String value) {
            addCriterion("f06sm not like", value, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF06smIn(List<String> values) {
            addCriterion("f06sm in", values, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF06smNotIn(List<String> values) {
            addCriterion("f06sm not in", values, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF06smBetween(String value1, String value2) {
            addCriterion("f06sm between", value1, value2, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF06smNotBetween(String value1, String value2) {
            addCriterion("f06sm not between", value1, value2, "f06sm");
            return (Criteria) this;
        }

        public Criteria andF07smIsNull() {
            addCriterion("f07sm is null");
            return (Criteria) this;
        }

        public Criteria andF07smIsNotNull() {
            addCriterion("f07sm is not null");
            return (Criteria) this;
        }

        public Criteria andF07smEqualTo(String value) {
            addCriterion("f07sm =", value, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF07smNotEqualTo(String value) {
            addCriterion("f07sm <>", value, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF07smGreaterThan(String value) {
            addCriterion("f07sm >", value, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF07smGreaterThanOrEqualTo(String value) {
            addCriterion("f07sm >=", value, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF07smLessThan(String value) {
            addCriterion("f07sm <", value, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF07smLessThanOrEqualTo(String value) {
            addCriterion("f07sm <=", value, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF07smLike(String value) {
            addCriterion("f07sm like", value, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF07smNotLike(String value) {
            addCriterion("f07sm not like", value, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF07smIn(List<String> values) {
            addCriterion("f07sm in", values, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF07smNotIn(List<String> values) {
            addCriterion("f07sm not in", values, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF07smBetween(String value1, String value2) {
            addCriterion("f07sm between", value1, value2, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF07smNotBetween(String value1, String value2) {
            addCriterion("f07sm not between", value1, value2, "f07sm");
            return (Criteria) this;
        }

        public Criteria andF08smIsNull() {
            addCriterion("f08sm is null");
            return (Criteria) this;
        }

        public Criteria andF08smIsNotNull() {
            addCriterion("f08sm is not null");
            return (Criteria) this;
        }

        public Criteria andF08smEqualTo(String value) {
            addCriterion("f08sm =", value, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF08smNotEqualTo(String value) {
            addCriterion("f08sm <>", value, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF08smGreaterThan(String value) {
            addCriterion("f08sm >", value, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF08smGreaterThanOrEqualTo(String value) {
            addCriterion("f08sm >=", value, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF08smLessThan(String value) {
            addCriterion("f08sm <", value, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF08smLessThanOrEqualTo(String value) {
            addCriterion("f08sm <=", value, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF08smLike(String value) {
            addCriterion("f08sm like", value, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF08smNotLike(String value) {
            addCriterion("f08sm not like", value, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF08smIn(List<String> values) {
            addCriterion("f08sm in", values, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF08smNotIn(List<String> values) {
            addCriterion("f08sm not in", values, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF08smBetween(String value1, String value2) {
            addCriterion("f08sm between", value1, value2, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF08smNotBetween(String value1, String value2) {
            addCriterion("f08sm not between", value1, value2, "f08sm");
            return (Criteria) this;
        }

        public Criteria andF09smIsNull() {
            addCriterion("f09sm is null");
            return (Criteria) this;
        }

        public Criteria andF09smIsNotNull() {
            addCriterion("f09sm is not null");
            return (Criteria) this;
        }

        public Criteria andF09smEqualTo(String value) {
            addCriterion("f09sm =", value, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF09smNotEqualTo(String value) {
            addCriterion("f09sm <>", value, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF09smGreaterThan(String value) {
            addCriterion("f09sm >", value, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF09smGreaterThanOrEqualTo(String value) {
            addCriterion("f09sm >=", value, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF09smLessThan(String value) {
            addCriterion("f09sm <", value, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF09smLessThanOrEqualTo(String value) {
            addCriterion("f09sm <=", value, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF09smLike(String value) {
            addCriterion("f09sm like", value, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF09smNotLike(String value) {
            addCriterion("f09sm not like", value, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF09smIn(List<String> values) {
            addCriterion("f09sm in", values, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF09smNotIn(List<String> values) {
            addCriterion("f09sm not in", values, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF09smBetween(String value1, String value2) {
            addCriterion("f09sm between", value1, value2, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF09smNotBetween(String value1, String value2) {
            addCriterion("f09sm not between", value1, value2, "f09sm");
            return (Criteria) this;
        }

        public Criteria andF10smIsNull() {
            addCriterion("f10sm is null");
            return (Criteria) this;
        }

        public Criteria andF10smIsNotNull() {
            addCriterion("f10sm is not null");
            return (Criteria) this;
        }

        public Criteria andF10smEqualTo(String value) {
            addCriterion("f10sm =", value, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF10smNotEqualTo(String value) {
            addCriterion("f10sm <>", value, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF10smGreaterThan(String value) {
            addCriterion("f10sm >", value, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF10smGreaterThanOrEqualTo(String value) {
            addCriterion("f10sm >=", value, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF10smLessThan(String value) {
            addCriterion("f10sm <", value, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF10smLessThanOrEqualTo(String value) {
            addCriterion("f10sm <=", value, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF10smLike(String value) {
            addCriterion("f10sm like", value, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF10smNotLike(String value) {
            addCriterion("f10sm not like", value, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF10smIn(List<String> values) {
            addCriterion("f10sm in", values, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF10smNotIn(List<String> values) {
            addCriterion("f10sm not in", values, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF10smBetween(String value1, String value2) {
            addCriterion("f10sm between", value1, value2, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF10smNotBetween(String value1, String value2) {
            addCriterion("f10sm not between", value1, value2, "f10sm");
            return (Criteria) this;
        }

        public Criteria andF11smIsNull() {
            addCriterion("f11sm is null");
            return (Criteria) this;
        }

        public Criteria andF11smIsNotNull() {
            addCriterion("f11sm is not null");
            return (Criteria) this;
        }

        public Criteria andF11smEqualTo(String value) {
            addCriterion("f11sm =", value, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF11smNotEqualTo(String value) {
            addCriterion("f11sm <>", value, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF11smGreaterThan(String value) {
            addCriterion("f11sm >", value, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF11smGreaterThanOrEqualTo(String value) {
            addCriterion("f11sm >=", value, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF11smLessThan(String value) {
            addCriterion("f11sm <", value, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF11smLessThanOrEqualTo(String value) {
            addCriterion("f11sm <=", value, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF11smLike(String value) {
            addCriterion("f11sm like", value, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF11smNotLike(String value) {
            addCriterion("f11sm not like", value, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF11smIn(List<String> values) {
            addCriterion("f11sm in", values, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF11smNotIn(List<String> values) {
            addCriterion("f11sm not in", values, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF11smBetween(String value1, String value2) {
            addCriterion("f11sm between", value1, value2, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF11smNotBetween(String value1, String value2) {
            addCriterion("f11sm not between", value1, value2, "f11sm");
            return (Criteria) this;
        }

        public Criteria andF12smIsNull() {
            addCriterion("f12sm is null");
            return (Criteria) this;
        }

        public Criteria andF12smIsNotNull() {
            addCriterion("f12sm is not null");
            return (Criteria) this;
        }

        public Criteria andF12smEqualTo(String value) {
            addCriterion("f12sm =", value, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF12smNotEqualTo(String value) {
            addCriterion("f12sm <>", value, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF12smGreaterThan(String value) {
            addCriterion("f12sm >", value, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF12smGreaterThanOrEqualTo(String value) {
            addCriterion("f12sm >=", value, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF12smLessThan(String value) {
            addCriterion("f12sm <", value, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF12smLessThanOrEqualTo(String value) {
            addCriterion("f12sm <=", value, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF12smLike(String value) {
            addCriterion("f12sm like", value, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF12smNotLike(String value) {
            addCriterion("f12sm not like", value, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF12smIn(List<String> values) {
            addCriterion("f12sm in", values, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF12smNotIn(List<String> values) {
            addCriterion("f12sm not in", values, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF12smBetween(String value1, String value2) {
            addCriterion("f12sm between", value1, value2, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF12smNotBetween(String value1, String value2) {
            addCriterion("f12sm not between", value1, value2, "f12sm");
            return (Criteria) this;
        }

        public Criteria andF13smIsNull() {
            addCriterion("f13sm is null");
            return (Criteria) this;
        }

        public Criteria andF13smIsNotNull() {
            addCriterion("f13sm is not null");
            return (Criteria) this;
        }

        public Criteria andF13smEqualTo(String value) {
            addCriterion("f13sm =", value, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF13smNotEqualTo(String value) {
            addCriterion("f13sm <>", value, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF13smGreaterThan(String value) {
            addCriterion("f13sm >", value, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF13smGreaterThanOrEqualTo(String value) {
            addCriterion("f13sm >=", value, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF13smLessThan(String value) {
            addCriterion("f13sm <", value, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF13smLessThanOrEqualTo(String value) {
            addCriterion("f13sm <=", value, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF13smLike(String value) {
            addCriterion("f13sm like", value, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF13smNotLike(String value) {
            addCriterion("f13sm not like", value, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF13smIn(List<String> values) {
            addCriterion("f13sm in", values, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF13smNotIn(List<String> values) {
            addCriterion("f13sm not in", values, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF13smBetween(String value1, String value2) {
            addCriterion("f13sm between", value1, value2, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF13smNotBetween(String value1, String value2) {
            addCriterion("f13sm not between", value1, value2, "f13sm");
            return (Criteria) this;
        }

        public Criteria andF14smIsNull() {
            addCriterion("f14sm is null");
            return (Criteria) this;
        }

        public Criteria andF14smIsNotNull() {
            addCriterion("f14sm is not null");
            return (Criteria) this;
        }

        public Criteria andF14smEqualTo(String value) {
            addCriterion("f14sm =", value, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF14smNotEqualTo(String value) {
            addCriterion("f14sm <>", value, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF14smGreaterThan(String value) {
            addCriterion("f14sm >", value, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF14smGreaterThanOrEqualTo(String value) {
            addCriterion("f14sm >=", value, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF14smLessThan(String value) {
            addCriterion("f14sm <", value, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF14smLessThanOrEqualTo(String value) {
            addCriterion("f14sm <=", value, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF14smLike(String value) {
            addCriterion("f14sm like", value, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF14smNotLike(String value) {
            addCriterion("f14sm not like", value, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF14smIn(List<String> values) {
            addCriterion("f14sm in", values, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF14smNotIn(List<String> values) {
            addCriterion("f14sm not in", values, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF14smBetween(String value1, String value2) {
            addCriterion("f14sm between", value1, value2, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF14smNotBetween(String value1, String value2) {
            addCriterion("f14sm not between", value1, value2, "f14sm");
            return (Criteria) this;
        }

        public Criteria andF15smIsNull() {
            addCriterion("f15sm is null");
            return (Criteria) this;
        }

        public Criteria andF15smIsNotNull() {
            addCriterion("f15sm is not null");
            return (Criteria) this;
        }

        public Criteria andF15smEqualTo(String value) {
            addCriterion("f15sm =", value, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF15smNotEqualTo(String value) {
            addCriterion("f15sm <>", value, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF15smGreaterThan(String value) {
            addCriterion("f15sm >", value, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF15smGreaterThanOrEqualTo(String value) {
            addCriterion("f15sm >=", value, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF15smLessThan(String value) {
            addCriterion("f15sm <", value, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF15smLessThanOrEqualTo(String value) {
            addCriterion("f15sm <=", value, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF15smLike(String value) {
            addCriterion("f15sm like", value, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF15smNotLike(String value) {
            addCriterion("f15sm not like", value, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF15smIn(List<String> values) {
            addCriterion("f15sm in", values, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF15smNotIn(List<String> values) {
            addCriterion("f15sm not in", values, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF15smBetween(String value1, String value2) {
            addCriterion("f15sm between", value1, value2, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF15smNotBetween(String value1, String value2) {
            addCriterion("f15sm not between", value1, value2, "f15sm");
            return (Criteria) this;
        }

        public Criteria andF16smIsNull() {
            addCriterion("f16sm is null");
            return (Criteria) this;
        }

        public Criteria andF16smIsNotNull() {
            addCriterion("f16sm is not null");
            return (Criteria) this;
        }

        public Criteria andF16smEqualTo(String value) {
            addCriterion("f16sm =", value, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF16smNotEqualTo(String value) {
            addCriterion("f16sm <>", value, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF16smGreaterThan(String value) {
            addCriterion("f16sm >", value, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF16smGreaterThanOrEqualTo(String value) {
            addCriterion("f16sm >=", value, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF16smLessThan(String value) {
            addCriterion("f16sm <", value, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF16smLessThanOrEqualTo(String value) {
            addCriterion("f16sm <=", value, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF16smLike(String value) {
            addCriterion("f16sm like", value, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF16smNotLike(String value) {
            addCriterion("f16sm not like", value, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF16smIn(List<String> values) {
            addCriterion("f16sm in", values, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF16smNotIn(List<String> values) {
            addCriterion("f16sm not in", values, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF16smBetween(String value1, String value2) {
            addCriterion("f16sm between", value1, value2, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF16smNotBetween(String value1, String value2) {
            addCriterion("f16sm not between", value1, value2, "f16sm");
            return (Criteria) this;
        }

        public Criteria andF17smIsNull() {
            addCriterion("f17sm is null");
            return (Criteria) this;
        }

        public Criteria andF17smIsNotNull() {
            addCriterion("f17sm is not null");
            return (Criteria) this;
        }

        public Criteria andF17smEqualTo(String value) {
            addCriterion("f17sm =", value, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF17smNotEqualTo(String value) {
            addCriterion("f17sm <>", value, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF17smGreaterThan(String value) {
            addCriterion("f17sm >", value, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF17smGreaterThanOrEqualTo(String value) {
            addCriterion("f17sm >=", value, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF17smLessThan(String value) {
            addCriterion("f17sm <", value, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF17smLessThanOrEqualTo(String value) {
            addCriterion("f17sm <=", value, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF17smLike(String value) {
            addCriterion("f17sm like", value, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF17smNotLike(String value) {
            addCriterion("f17sm not like", value, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF17smIn(List<String> values) {
            addCriterion("f17sm in", values, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF17smNotIn(List<String> values) {
            addCriterion("f17sm not in", values, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF17smBetween(String value1, String value2) {
            addCriterion("f17sm between", value1, value2, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF17smNotBetween(String value1, String value2) {
            addCriterion("f17sm not between", value1, value2, "f17sm");
            return (Criteria) this;
        }

        public Criteria andF18smIsNull() {
            addCriterion("f18sm is null");
            return (Criteria) this;
        }

        public Criteria andF18smIsNotNull() {
            addCriterion("f18sm is not null");
            return (Criteria) this;
        }

        public Criteria andF18smEqualTo(String value) {
            addCriterion("f18sm =", value, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF18smNotEqualTo(String value) {
            addCriterion("f18sm <>", value, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF18smGreaterThan(String value) {
            addCriterion("f18sm >", value, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF18smGreaterThanOrEqualTo(String value) {
            addCriterion("f18sm >=", value, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF18smLessThan(String value) {
            addCriterion("f18sm <", value, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF18smLessThanOrEqualTo(String value) {
            addCriterion("f18sm <=", value, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF18smLike(String value) {
            addCriterion("f18sm like", value, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF18smNotLike(String value) {
            addCriterion("f18sm not like", value, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF18smIn(List<String> values) {
            addCriterion("f18sm in", values, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF18smNotIn(List<String> values) {
            addCriterion("f18sm not in", values, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF18smBetween(String value1, String value2) {
            addCriterion("f18sm between", value1, value2, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF18smNotBetween(String value1, String value2) {
            addCriterion("f18sm not between", value1, value2, "f18sm");
            return (Criteria) this;
        }

        public Criteria andF19smIsNull() {
            addCriterion("f19sm is null");
            return (Criteria) this;
        }

        public Criteria andF19smIsNotNull() {
            addCriterion("f19sm is not null");
            return (Criteria) this;
        }

        public Criteria andF19smEqualTo(String value) {
            addCriterion("f19sm =", value, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF19smNotEqualTo(String value) {
            addCriterion("f19sm <>", value, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF19smGreaterThan(String value) {
            addCriterion("f19sm >", value, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF19smGreaterThanOrEqualTo(String value) {
            addCriterion("f19sm >=", value, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF19smLessThan(String value) {
            addCriterion("f19sm <", value, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF19smLessThanOrEqualTo(String value) {
            addCriterion("f19sm <=", value, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF19smLike(String value) {
            addCriterion("f19sm like", value, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF19smNotLike(String value) {
            addCriterion("f19sm not like", value, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF19smIn(List<String> values) {
            addCriterion("f19sm in", values, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF19smNotIn(List<String> values) {
            addCriterion("f19sm not in", values, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF19smBetween(String value1, String value2) {
            addCriterion("f19sm between", value1, value2, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF19smNotBetween(String value1, String value2) {
            addCriterion("f19sm not between", value1, value2, "f19sm");
            return (Criteria) this;
        }

        public Criteria andF20smIsNull() {
            addCriterion("f20sm is null");
            return (Criteria) this;
        }

        public Criteria andF20smIsNotNull() {
            addCriterion("f20sm is not null");
            return (Criteria) this;
        }

        public Criteria andF20smEqualTo(String value) {
            addCriterion("f20sm =", value, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF20smNotEqualTo(String value) {
            addCriterion("f20sm <>", value, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF20smGreaterThan(String value) {
            addCriterion("f20sm >", value, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF20smGreaterThanOrEqualTo(String value) {
            addCriterion("f20sm >=", value, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF20smLessThan(String value) {
            addCriterion("f20sm <", value, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF20smLessThanOrEqualTo(String value) {
            addCriterion("f20sm <=", value, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF20smLike(String value) {
            addCriterion("f20sm like", value, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF20smNotLike(String value) {
            addCriterion("f20sm not like", value, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF20smIn(List<String> values) {
            addCriterion("f20sm in", values, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF20smNotIn(List<String> values) {
            addCriterion("f20sm not in", values, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF20smBetween(String value1, String value2) {
            addCriterion("f20sm between", value1, value2, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF20smNotBetween(String value1, String value2) {
            addCriterion("f20sm not between", value1, value2, "f20sm");
            return (Criteria) this;
        }

        public Criteria andF21smIsNull() {
            addCriterion("f21sm is null");
            return (Criteria) this;
        }

        public Criteria andF21smIsNotNull() {
            addCriterion("f21sm is not null");
            return (Criteria) this;
        }

        public Criteria andF21smEqualTo(String value) {
            addCriterion("f21sm =", value, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF21smNotEqualTo(String value) {
            addCriterion("f21sm <>", value, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF21smGreaterThan(String value) {
            addCriterion("f21sm >", value, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF21smGreaterThanOrEqualTo(String value) {
            addCriterion("f21sm >=", value, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF21smLessThan(String value) {
            addCriterion("f21sm <", value, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF21smLessThanOrEqualTo(String value) {
            addCriterion("f21sm <=", value, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF21smLike(String value) {
            addCriterion("f21sm like", value, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF21smNotLike(String value) {
            addCriterion("f21sm not like", value, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF21smIn(List<String> values) {
            addCriterion("f21sm in", values, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF21smNotIn(List<String> values) {
            addCriterion("f21sm not in", values, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF21smBetween(String value1, String value2) {
            addCriterion("f21sm between", value1, value2, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF21smNotBetween(String value1, String value2) {
            addCriterion("f21sm not between", value1, value2, "f21sm");
            return (Criteria) this;
        }

        public Criteria andF22smIsNull() {
            addCriterion("f22sm is null");
            return (Criteria) this;
        }

        public Criteria andF22smIsNotNull() {
            addCriterion("f22sm is not null");
            return (Criteria) this;
        }

        public Criteria andF22smEqualTo(String value) {
            addCriterion("f22sm =", value, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF22smNotEqualTo(String value) {
            addCriterion("f22sm <>", value, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF22smGreaterThan(String value) {
            addCriterion("f22sm >", value, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF22smGreaterThanOrEqualTo(String value) {
            addCriterion("f22sm >=", value, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF22smLessThan(String value) {
            addCriterion("f22sm <", value, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF22smLessThanOrEqualTo(String value) {
            addCriterion("f22sm <=", value, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF22smLike(String value) {
            addCriterion("f22sm like", value, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF22smNotLike(String value) {
            addCriterion("f22sm not like", value, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF22smIn(List<String> values) {
            addCriterion("f22sm in", values, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF22smNotIn(List<String> values) {
            addCriterion("f22sm not in", values, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF22smBetween(String value1, String value2) {
            addCriterion("f22sm between", value1, value2, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF22smNotBetween(String value1, String value2) {
            addCriterion("f22sm not between", value1, value2, "f22sm");
            return (Criteria) this;
        }

        public Criteria andF23smIsNull() {
            addCriterion("f23sm is null");
            return (Criteria) this;
        }

        public Criteria andF23smIsNotNull() {
            addCriterion("f23sm is not null");
            return (Criteria) this;
        }

        public Criteria andF23smEqualTo(String value) {
            addCriterion("f23sm =", value, "f23sm");
            return (Criteria) this;
        }

        public Criteria andF23smNotEqualTo(String value) {
            addCriterion("f23sm <>", value, "f23sm");
            return (Criteria) this;
        }

        public Criteria andF23smGreaterThan(String value) {
            addCriterion("f23sm >", value, "f23sm");
            return (Criteria) this;
        }

        public Criteria andF23smGreaterThanOrEqualTo(String value) {
            addCriterion("f23sm >=", value, "f23sm");
            return (Criteria) this;
        }

        public Criteria andF23smLessThan(String value) {
            addCriterion("f23sm <", value, "f23sm");
            return (Criteria) this;
        }

        public Criteria andF23smLessThanOrEqualTo(String value) {
            addCriterion("f23sm <=", value, "f23sm");
            return (Criteria) this;
        }

        public Criteria andF23smLike(String value) {
            addCriterion("f23sm like", value, "f23sm");
            return (Criteria) this;
        }

        public Criteria andF23smNotLike(String value) {
            addCriterion("f23sm not like", value, "f23sm");
            return (Criteria) this;
        }

        public Criteria andF23smIn(List<String> values) {
            addCriterion("f23sm in", values, "f23sm");
            return (Criteria) this;
        }

        public Criteria andF23smNotIn(List<String> values) {
            addCriterion("f23sm not in", values, "f23sm");
            return (Criteria) this;
        }

        public Criteria andF23smBetween(String value1, String value2) {
            addCriterion("f23sm between", value1, value2, "f23sm");
            return (Criteria) this;
        }

        public Criteria andF23smNotBetween(String value1, String value2) {
            addCriterion("f23sm not between", value1, value2, "f23sm");
            return (Criteria) this;
        }

        public Criteria andG01smIsNull() {
            addCriterion("g01sm is null");
            return (Criteria) this;
        }

        public Criteria andG01smIsNotNull() {
            addCriterion("g01sm is not null");
            return (Criteria) this;
        }

        public Criteria andG01smEqualTo(String value) {
            addCriterion("g01sm =", value, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG01smNotEqualTo(String value) {
            addCriterion("g01sm <>", value, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG01smGreaterThan(String value) {
            addCriterion("g01sm >", value, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG01smGreaterThanOrEqualTo(String value) {
            addCriterion("g01sm >=", value, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG01smLessThan(String value) {
            addCriterion("g01sm <", value, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG01smLessThanOrEqualTo(String value) {
            addCriterion("g01sm <=", value, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG01smLike(String value) {
            addCriterion("g01sm like", value, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG01smNotLike(String value) {
            addCriterion("g01sm not like", value, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG01smIn(List<String> values) {
            addCriterion("g01sm in", values, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG01smNotIn(List<String> values) {
            addCriterion("g01sm not in", values, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG01smBetween(String value1, String value2) {
            addCriterion("g01sm between", value1, value2, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG01smNotBetween(String value1, String value2) {
            addCriterion("g01sm not between", value1, value2, "g01sm");
            return (Criteria) this;
        }

        public Criteria andG02smIsNull() {
            addCriterion("g02sm is null");
            return (Criteria) this;
        }

        public Criteria andG02smIsNotNull() {
            addCriterion("g02sm is not null");
            return (Criteria) this;
        }

        public Criteria andG02smEqualTo(String value) {
            addCriterion("g02sm =", value, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG02smNotEqualTo(String value) {
            addCriterion("g02sm <>", value, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG02smGreaterThan(String value) {
            addCriterion("g02sm >", value, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG02smGreaterThanOrEqualTo(String value) {
            addCriterion("g02sm >=", value, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG02smLessThan(String value) {
            addCriterion("g02sm <", value, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG02smLessThanOrEqualTo(String value) {
            addCriterion("g02sm <=", value, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG02smLike(String value) {
            addCriterion("g02sm like", value, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG02smNotLike(String value) {
            addCriterion("g02sm not like", value, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG02smIn(List<String> values) {
            addCriterion("g02sm in", values, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG02smNotIn(List<String> values) {
            addCriterion("g02sm not in", values, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG02smBetween(String value1, String value2) {
            addCriterion("g02sm between", value1, value2, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG02smNotBetween(String value1, String value2) {
            addCriterion("g02sm not between", value1, value2, "g02sm");
            return (Criteria) this;
        }

        public Criteria andG03smIsNull() {
            addCriterion("g03sm is null");
            return (Criteria) this;
        }

        public Criteria andG03smIsNotNull() {
            addCriterion("g03sm is not null");
            return (Criteria) this;
        }

        public Criteria andG03smEqualTo(String value) {
            addCriterion("g03sm =", value, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG03smNotEqualTo(String value) {
            addCriterion("g03sm <>", value, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG03smGreaterThan(String value) {
            addCriterion("g03sm >", value, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG03smGreaterThanOrEqualTo(String value) {
            addCriterion("g03sm >=", value, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG03smLessThan(String value) {
            addCriterion("g03sm <", value, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG03smLessThanOrEqualTo(String value) {
            addCriterion("g03sm <=", value, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG03smLike(String value) {
            addCriterion("g03sm like", value, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG03smNotLike(String value) {
            addCriterion("g03sm not like", value, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG03smIn(List<String> values) {
            addCriterion("g03sm in", values, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG03smNotIn(List<String> values) {
            addCriterion("g03sm not in", values, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG03smBetween(String value1, String value2) {
            addCriterion("g03sm between", value1, value2, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG03smNotBetween(String value1, String value2) {
            addCriterion("g03sm not between", value1, value2, "g03sm");
            return (Criteria) this;
        }

        public Criteria andG04smIsNull() {
            addCriterion("g04sm is null");
            return (Criteria) this;
        }

        public Criteria andG04smIsNotNull() {
            addCriterion("g04sm is not null");
            return (Criteria) this;
        }

        public Criteria andG04smEqualTo(String value) {
            addCriterion("g04sm =", value, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG04smNotEqualTo(String value) {
            addCriterion("g04sm <>", value, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG04smGreaterThan(String value) {
            addCriterion("g04sm >", value, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG04smGreaterThanOrEqualTo(String value) {
            addCriterion("g04sm >=", value, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG04smLessThan(String value) {
            addCriterion("g04sm <", value, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG04smLessThanOrEqualTo(String value) {
            addCriterion("g04sm <=", value, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG04smLike(String value) {
            addCriterion("g04sm like", value, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG04smNotLike(String value) {
            addCriterion("g04sm not like", value, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG04smIn(List<String> values) {
            addCriterion("g04sm in", values, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG04smNotIn(List<String> values) {
            addCriterion("g04sm not in", values, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG04smBetween(String value1, String value2) {
            addCriterion("g04sm between", value1, value2, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG04smNotBetween(String value1, String value2) {
            addCriterion("g04sm not between", value1, value2, "g04sm");
            return (Criteria) this;
        }

        public Criteria andG05smIsNull() {
            addCriterion("g05sm is null");
            return (Criteria) this;
        }

        public Criteria andG05smIsNotNull() {
            addCriterion("g05sm is not null");
            return (Criteria) this;
        }

        public Criteria andG05smEqualTo(String value) {
            addCriterion("g05sm =", value, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG05smNotEqualTo(String value) {
            addCriterion("g05sm <>", value, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG05smGreaterThan(String value) {
            addCriterion("g05sm >", value, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG05smGreaterThanOrEqualTo(String value) {
            addCriterion("g05sm >=", value, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG05smLessThan(String value) {
            addCriterion("g05sm <", value, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG05smLessThanOrEqualTo(String value) {
            addCriterion("g05sm <=", value, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG05smLike(String value) {
            addCriterion("g05sm like", value, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG05smNotLike(String value) {
            addCriterion("g05sm not like", value, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG05smIn(List<String> values) {
            addCriterion("g05sm in", values, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG05smNotIn(List<String> values) {
            addCriterion("g05sm not in", values, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG05smBetween(String value1, String value2) {
            addCriterion("g05sm between", value1, value2, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG05smNotBetween(String value1, String value2) {
            addCriterion("g05sm not between", value1, value2, "g05sm");
            return (Criteria) this;
        }

        public Criteria andG06smIsNull() {
            addCriterion("g06sm is null");
            return (Criteria) this;
        }

        public Criteria andG06smIsNotNull() {
            addCriterion("g06sm is not null");
            return (Criteria) this;
        }

        public Criteria andG06smEqualTo(String value) {
            addCriterion("g06sm =", value, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG06smNotEqualTo(String value) {
            addCriterion("g06sm <>", value, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG06smGreaterThan(String value) {
            addCriterion("g06sm >", value, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG06smGreaterThanOrEqualTo(String value) {
            addCriterion("g06sm >=", value, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG06smLessThan(String value) {
            addCriterion("g06sm <", value, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG06smLessThanOrEqualTo(String value) {
            addCriterion("g06sm <=", value, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG06smLike(String value) {
            addCriterion("g06sm like", value, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG06smNotLike(String value) {
            addCriterion("g06sm not like", value, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG06smIn(List<String> values) {
            addCriterion("g06sm in", values, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG06smNotIn(List<String> values) {
            addCriterion("g06sm not in", values, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG06smBetween(String value1, String value2) {
            addCriterion("g06sm between", value1, value2, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG06smNotBetween(String value1, String value2) {
            addCriterion("g06sm not between", value1, value2, "g06sm");
            return (Criteria) this;
        }

        public Criteria andG07smIsNull() {
            addCriterion("g07sm is null");
            return (Criteria) this;
        }

        public Criteria andG07smIsNotNull() {
            addCriterion("g07sm is not null");
            return (Criteria) this;
        }

        public Criteria andG07smEqualTo(String value) {
            addCriterion("g07sm =", value, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG07smNotEqualTo(String value) {
            addCriterion("g07sm <>", value, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG07smGreaterThan(String value) {
            addCriterion("g07sm >", value, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG07smGreaterThanOrEqualTo(String value) {
            addCriterion("g07sm >=", value, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG07smLessThan(String value) {
            addCriterion("g07sm <", value, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG07smLessThanOrEqualTo(String value) {
            addCriterion("g07sm <=", value, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG07smLike(String value) {
            addCriterion("g07sm like", value, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG07smNotLike(String value) {
            addCriterion("g07sm not like", value, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG07smIn(List<String> values) {
            addCriterion("g07sm in", values, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG07smNotIn(List<String> values) {
            addCriterion("g07sm not in", values, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG07smBetween(String value1, String value2) {
            addCriterion("g07sm between", value1, value2, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG07smNotBetween(String value1, String value2) {
            addCriterion("g07sm not between", value1, value2, "g07sm");
            return (Criteria) this;
        }

        public Criteria andG08smIsNull() {
            addCriterion("g08sm is null");
            return (Criteria) this;
        }

        public Criteria andG08smIsNotNull() {
            addCriterion("g08sm is not null");
            return (Criteria) this;
        }

        public Criteria andG08smEqualTo(String value) {
            addCriterion("g08sm =", value, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG08smNotEqualTo(String value) {
            addCriterion("g08sm <>", value, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG08smGreaterThan(String value) {
            addCriterion("g08sm >", value, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG08smGreaterThanOrEqualTo(String value) {
            addCriterion("g08sm >=", value, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG08smLessThan(String value) {
            addCriterion("g08sm <", value, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG08smLessThanOrEqualTo(String value) {
            addCriterion("g08sm <=", value, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG08smLike(String value) {
            addCriterion("g08sm like", value, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG08smNotLike(String value) {
            addCriterion("g08sm not like", value, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG08smIn(List<String> values) {
            addCriterion("g08sm in", values, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG08smNotIn(List<String> values) {
            addCriterion("g08sm not in", values, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG08smBetween(String value1, String value2) {
            addCriterion("g08sm between", value1, value2, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG08smNotBetween(String value1, String value2) {
            addCriterion("g08sm not between", value1, value2, "g08sm");
            return (Criteria) this;
        }

        public Criteria andG09smIsNull() {
            addCriterion("g09sm is null");
            return (Criteria) this;
        }

        public Criteria andG09smIsNotNull() {
            addCriterion("g09sm is not null");
            return (Criteria) this;
        }

        public Criteria andG09smEqualTo(String value) {
            addCriterion("g09sm =", value, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG09smNotEqualTo(String value) {
            addCriterion("g09sm <>", value, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG09smGreaterThan(String value) {
            addCriterion("g09sm >", value, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG09smGreaterThanOrEqualTo(String value) {
            addCriterion("g09sm >=", value, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG09smLessThan(String value) {
            addCriterion("g09sm <", value, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG09smLessThanOrEqualTo(String value) {
            addCriterion("g09sm <=", value, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG09smLike(String value) {
            addCriterion("g09sm like", value, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG09smNotLike(String value) {
            addCriterion("g09sm not like", value, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG09smIn(List<String> values) {
            addCriterion("g09sm in", values, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG09smNotIn(List<String> values) {
            addCriterion("g09sm not in", values, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG09smBetween(String value1, String value2) {
            addCriterion("g09sm between", value1, value2, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG09smNotBetween(String value1, String value2) {
            addCriterion("g09sm not between", value1, value2, "g09sm");
            return (Criteria) this;
        }

        public Criteria andG10smIsNull() {
            addCriterion("g10sm is null");
            return (Criteria) this;
        }

        public Criteria andG10smIsNotNull() {
            addCriterion("g10sm is not null");
            return (Criteria) this;
        }

        public Criteria andG10smEqualTo(String value) {
            addCriterion("g10sm =", value, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG10smNotEqualTo(String value) {
            addCriterion("g10sm <>", value, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG10smGreaterThan(String value) {
            addCriterion("g10sm >", value, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG10smGreaterThanOrEqualTo(String value) {
            addCriterion("g10sm >=", value, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG10smLessThan(String value) {
            addCriterion("g10sm <", value, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG10smLessThanOrEqualTo(String value) {
            addCriterion("g10sm <=", value, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG10smLike(String value) {
            addCriterion("g10sm like", value, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG10smNotLike(String value) {
            addCriterion("g10sm not like", value, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG10smIn(List<String> values) {
            addCriterion("g10sm in", values, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG10smNotIn(List<String> values) {
            addCriterion("g10sm not in", values, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG10smBetween(String value1, String value2) {
            addCriterion("g10sm between", value1, value2, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG10smNotBetween(String value1, String value2) {
            addCriterion("g10sm not between", value1, value2, "g10sm");
            return (Criteria) this;
        }

        public Criteria andG11smIsNull() {
            addCriterion("g11sm is null");
            return (Criteria) this;
        }

        public Criteria andG11smIsNotNull() {
            addCriterion("g11sm is not null");
            return (Criteria) this;
        }

        public Criteria andG11smEqualTo(String value) {
            addCriterion("g11sm =", value, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG11smNotEqualTo(String value) {
            addCriterion("g11sm <>", value, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG11smGreaterThan(String value) {
            addCriterion("g11sm >", value, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG11smGreaterThanOrEqualTo(String value) {
            addCriterion("g11sm >=", value, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG11smLessThan(String value) {
            addCriterion("g11sm <", value, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG11smLessThanOrEqualTo(String value) {
            addCriterion("g11sm <=", value, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG11smLike(String value) {
            addCriterion("g11sm like", value, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG11smNotLike(String value) {
            addCriterion("g11sm not like", value, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG11smIn(List<String> values) {
            addCriterion("g11sm in", values, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG11smNotIn(List<String> values) {
            addCriterion("g11sm not in", values, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG11smBetween(String value1, String value2) {
            addCriterion("g11sm between", value1, value2, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG11smNotBetween(String value1, String value2) {
            addCriterion("g11sm not between", value1, value2, "g11sm");
            return (Criteria) this;
        }

        public Criteria andG12smIsNull() {
            addCriterion("g12sm is null");
            return (Criteria) this;
        }

        public Criteria andG12smIsNotNull() {
            addCriterion("g12sm is not null");
            return (Criteria) this;
        }

        public Criteria andG12smEqualTo(String value) {
            addCriterion("g12sm =", value, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG12smNotEqualTo(String value) {
            addCriterion("g12sm <>", value, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG12smGreaterThan(String value) {
            addCriterion("g12sm >", value, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG12smGreaterThanOrEqualTo(String value) {
            addCriterion("g12sm >=", value, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG12smLessThan(String value) {
            addCriterion("g12sm <", value, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG12smLessThanOrEqualTo(String value) {
            addCriterion("g12sm <=", value, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG12smLike(String value) {
            addCriterion("g12sm like", value, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG12smNotLike(String value) {
            addCriterion("g12sm not like", value, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG12smIn(List<String> values) {
            addCriterion("g12sm in", values, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG12smNotIn(List<String> values) {
            addCriterion("g12sm not in", values, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG12smBetween(String value1, String value2) {
            addCriterion("g12sm between", value1, value2, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG12smNotBetween(String value1, String value2) {
            addCriterion("g12sm not between", value1, value2, "g12sm");
            return (Criteria) this;
        }

        public Criteria andG13smIsNull() {
            addCriterion("g13sm is null");
            return (Criteria) this;
        }

        public Criteria andG13smIsNotNull() {
            addCriterion("g13sm is not null");
            return (Criteria) this;
        }

        public Criteria andG13smEqualTo(String value) {
            addCriterion("g13sm =", value, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG13smNotEqualTo(String value) {
            addCriterion("g13sm <>", value, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG13smGreaterThan(String value) {
            addCriterion("g13sm >", value, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG13smGreaterThanOrEqualTo(String value) {
            addCriterion("g13sm >=", value, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG13smLessThan(String value) {
            addCriterion("g13sm <", value, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG13smLessThanOrEqualTo(String value) {
            addCriterion("g13sm <=", value, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG13smLike(String value) {
            addCriterion("g13sm like", value, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG13smNotLike(String value) {
            addCriterion("g13sm not like", value, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG13smIn(List<String> values) {
            addCriterion("g13sm in", values, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG13smNotIn(List<String> values) {
            addCriterion("g13sm not in", values, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG13smBetween(String value1, String value2) {
            addCriterion("g13sm between", value1, value2, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG13smNotBetween(String value1, String value2) {
            addCriterion("g13sm not between", value1, value2, "g13sm");
            return (Criteria) this;
        }

        public Criteria andG14smIsNull() {
            addCriterion("g14sm is null");
            return (Criteria) this;
        }

        public Criteria andG14smIsNotNull() {
            addCriterion("g14sm is not null");
            return (Criteria) this;
        }

        public Criteria andG14smEqualTo(String value) {
            addCriterion("g14sm =", value, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG14smNotEqualTo(String value) {
            addCriterion("g14sm <>", value, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG14smGreaterThan(String value) {
            addCriterion("g14sm >", value, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG14smGreaterThanOrEqualTo(String value) {
            addCriterion("g14sm >=", value, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG14smLessThan(String value) {
            addCriterion("g14sm <", value, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG14smLessThanOrEqualTo(String value) {
            addCriterion("g14sm <=", value, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG14smLike(String value) {
            addCriterion("g14sm like", value, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG14smNotLike(String value) {
            addCriterion("g14sm not like", value, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG14smIn(List<String> values) {
            addCriterion("g14sm in", values, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG14smNotIn(List<String> values) {
            addCriterion("g14sm not in", values, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG14smBetween(String value1, String value2) {
            addCriterion("g14sm between", value1, value2, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG14smNotBetween(String value1, String value2) {
            addCriterion("g14sm not between", value1, value2, "g14sm");
            return (Criteria) this;
        }

        public Criteria andG15smIsNull() {
            addCriterion("g15sm is null");
            return (Criteria) this;
        }

        public Criteria andG15smIsNotNull() {
            addCriterion("g15sm is not null");
            return (Criteria) this;
        }

        public Criteria andG15smEqualTo(String value) {
            addCriterion("g15sm =", value, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG15smNotEqualTo(String value) {
            addCriterion("g15sm <>", value, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG15smGreaterThan(String value) {
            addCriterion("g15sm >", value, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG15smGreaterThanOrEqualTo(String value) {
            addCriterion("g15sm >=", value, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG15smLessThan(String value) {
            addCriterion("g15sm <", value, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG15smLessThanOrEqualTo(String value) {
            addCriterion("g15sm <=", value, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG15smLike(String value) {
            addCriterion("g15sm like", value, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG15smNotLike(String value) {
            addCriterion("g15sm not like", value, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG15smIn(List<String> values) {
            addCriterion("g15sm in", values, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG15smNotIn(List<String> values) {
            addCriterion("g15sm not in", values, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG15smBetween(String value1, String value2) {
            addCriterion("g15sm between", value1, value2, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG15smNotBetween(String value1, String value2) {
            addCriterion("g15sm not between", value1, value2, "g15sm");
            return (Criteria) this;
        }

        public Criteria andG16smIsNull() {
            addCriterion("g16sm is null");
            return (Criteria) this;
        }

        public Criteria andG16smIsNotNull() {
            addCriterion("g16sm is not null");
            return (Criteria) this;
        }

        public Criteria andG16smEqualTo(String value) {
            addCriterion("g16sm =", value, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG16smNotEqualTo(String value) {
            addCriterion("g16sm <>", value, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG16smGreaterThan(String value) {
            addCriterion("g16sm >", value, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG16smGreaterThanOrEqualTo(String value) {
            addCriterion("g16sm >=", value, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG16smLessThan(String value) {
            addCriterion("g16sm <", value, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG16smLessThanOrEqualTo(String value) {
            addCriterion("g16sm <=", value, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG16smLike(String value) {
            addCriterion("g16sm like", value, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG16smNotLike(String value) {
            addCriterion("g16sm not like", value, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG16smIn(List<String> values) {
            addCriterion("g16sm in", values, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG16smNotIn(List<String> values) {
            addCriterion("g16sm not in", values, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG16smBetween(String value1, String value2) {
            addCriterion("g16sm between", value1, value2, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG16smNotBetween(String value1, String value2) {
            addCriterion("g16sm not between", value1, value2, "g16sm");
            return (Criteria) this;
        }

        public Criteria andG17smIsNull() {
            addCriterion("g17sm is null");
            return (Criteria) this;
        }

        public Criteria andG17smIsNotNull() {
            addCriterion("g17sm is not null");
            return (Criteria) this;
        }

        public Criteria andG17smEqualTo(String value) {
            addCriterion("g17sm =", value, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG17smNotEqualTo(String value) {
            addCriterion("g17sm <>", value, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG17smGreaterThan(String value) {
            addCriterion("g17sm >", value, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG17smGreaterThanOrEqualTo(String value) {
            addCriterion("g17sm >=", value, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG17smLessThan(String value) {
            addCriterion("g17sm <", value, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG17smLessThanOrEqualTo(String value) {
            addCriterion("g17sm <=", value, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG17smLike(String value) {
            addCriterion("g17sm like", value, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG17smNotLike(String value) {
            addCriterion("g17sm not like", value, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG17smIn(List<String> values) {
            addCriterion("g17sm in", values, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG17smNotIn(List<String> values) {
            addCriterion("g17sm not in", values, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG17smBetween(String value1, String value2) {
            addCriterion("g17sm between", value1, value2, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG17smNotBetween(String value1, String value2) {
            addCriterion("g17sm not between", value1, value2, "g17sm");
            return (Criteria) this;
        }

        public Criteria andG18smIsNull() {
            addCriterion("g18sm is null");
            return (Criteria) this;
        }

        public Criteria andG18smIsNotNull() {
            addCriterion("g18sm is not null");
            return (Criteria) this;
        }

        public Criteria andG18smEqualTo(String value) {
            addCriterion("g18sm =", value, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG18smNotEqualTo(String value) {
            addCriterion("g18sm <>", value, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG18smGreaterThan(String value) {
            addCriterion("g18sm >", value, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG18smGreaterThanOrEqualTo(String value) {
            addCriterion("g18sm >=", value, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG18smLessThan(String value) {
            addCriterion("g18sm <", value, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG18smLessThanOrEqualTo(String value) {
            addCriterion("g18sm <=", value, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG18smLike(String value) {
            addCriterion("g18sm like", value, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG18smNotLike(String value) {
            addCriterion("g18sm not like", value, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG18smIn(List<String> values) {
            addCriterion("g18sm in", values, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG18smNotIn(List<String> values) {
            addCriterion("g18sm not in", values, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG18smBetween(String value1, String value2) {
            addCriterion("g18sm between", value1, value2, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG18smNotBetween(String value1, String value2) {
            addCriterion("g18sm not between", value1, value2, "g18sm");
            return (Criteria) this;
        }

        public Criteria andG19smIsNull() {
            addCriterion("g19sm is null");
            return (Criteria) this;
        }

        public Criteria andG19smIsNotNull() {
            addCriterion("g19sm is not null");
            return (Criteria) this;
        }

        public Criteria andG19smEqualTo(String value) {
            addCriterion("g19sm =", value, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG19smNotEqualTo(String value) {
            addCriterion("g19sm <>", value, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG19smGreaterThan(String value) {
            addCriterion("g19sm >", value, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG19smGreaterThanOrEqualTo(String value) {
            addCriterion("g19sm >=", value, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG19smLessThan(String value) {
            addCriterion("g19sm <", value, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG19smLessThanOrEqualTo(String value) {
            addCriterion("g19sm <=", value, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG19smLike(String value) {
            addCriterion("g19sm like", value, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG19smNotLike(String value) {
            addCriterion("g19sm not like", value, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG19smIn(List<String> values) {
            addCriterion("g19sm in", values, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG19smNotIn(List<String> values) {
            addCriterion("g19sm not in", values, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG19smBetween(String value1, String value2) {
            addCriterion("g19sm between", value1, value2, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG19smNotBetween(String value1, String value2) {
            addCriterion("g19sm not between", value1, value2, "g19sm");
            return (Criteria) this;
        }

        public Criteria andG20smIsNull() {
            addCriterion("g20sm is null");
            return (Criteria) this;
        }

        public Criteria andG20smIsNotNull() {
            addCriterion("g20sm is not null");
            return (Criteria) this;
        }

        public Criteria andG20smEqualTo(String value) {
            addCriterion("g20sm =", value, "g20sm");
            return (Criteria) this;
        }

        public Criteria andG20smNotEqualTo(String value) {
            addCriterion("g20sm <>", value, "g20sm");
            return (Criteria) this;
        }

        public Criteria andG20smGreaterThan(String value) {
            addCriterion("g20sm >", value, "g20sm");
            return (Criteria) this;
        }

        public Criteria andG20smGreaterThanOrEqualTo(String value) {
            addCriterion("g20sm >=", value, "g20sm");
            return (Criteria) this;
        }

        public Criteria andG20smLessThan(String value) {
            addCriterion("g20sm <", value, "g20sm");
            return (Criteria) this;
        }

        public Criteria andG20smLessThanOrEqualTo(String value) {
            addCriterion("g20sm <=", value, "g20sm");
            return (Criteria) this;
        }

        public Criteria andG20smLike(String value) {
            addCriterion("g20sm like", value, "g20sm");
            return (Criteria) this;
        }

        public Criteria andG20smNotLike(String value) {
            addCriterion("g20sm not like", value, "g20sm");
            return (Criteria) this;
        }

        public Criteria andG20smIn(List<String> values) {
            addCriterion("g20sm in", values, "g20sm");
            return (Criteria) this;
        }

        public Criteria andG20smNotIn(List<String> values) {
            addCriterion("g20sm not in", values, "g20sm");
            return (Criteria) this;
        }

        public Criteria andG20smBetween(String value1, String value2) {
            addCriterion("g20sm between", value1, value2, "g20sm");
            return (Criteria) this;
        }

        public Criteria andG20smNotBetween(String value1, String value2) {
            addCriterion("g20sm not between", value1, value2, "g20sm");
            return (Criteria) this;
        }

        public Criteria andH01smIsNull() {
            addCriterion("h01sm is null");
            return (Criteria) this;
        }

        public Criteria andH01smIsNotNull() {
            addCriterion("h01sm is not null");
            return (Criteria) this;
        }

        public Criteria andH01smEqualTo(String value) {
            addCriterion("h01sm =", value, "h01sm");
            return (Criteria) this;
        }

        public Criteria andH01smNotEqualTo(String value) {
            addCriterion("h01sm <>", value, "h01sm");
            return (Criteria) this;
        }

        public Criteria andH01smGreaterThan(String value) {
            addCriterion("h01sm >", value, "h01sm");
            return (Criteria) this;
        }

        public Criteria andH01smGreaterThanOrEqualTo(String value) {
            addCriterion("h01sm >=", value, "h01sm");
            return (Criteria) this;
        }

        public Criteria andH01smLessThan(String value) {
            addCriterion("h01sm <", value, "h01sm");
            return (Criteria) this;
        }

        public Criteria andH01smLessThanOrEqualTo(String value) {
            addCriterion("h01sm <=", value, "h01sm");
            return (Criteria) this;
        }

        public Criteria andH01smLike(String value) {
            addCriterion("h01sm like", value, "h01sm");
            return (Criteria) this;
        }

        public Criteria andH01smNotLike(String value) {
            addCriterion("h01sm not like", value, "h01sm");
            return (Criteria) this;
        }

        public Criteria andH01smIn(List<String> values) {
            addCriterion("h01sm in", values, "h01sm");
            return (Criteria) this;
        }

        public Criteria andH01smNotIn(List<String> values) {
            addCriterion("h01sm not in", values, "h01sm");
            return (Criteria) this;
        }

        public Criteria andH01smBetween(String value1, String value2) {
            addCriterion("h01sm between", value1, value2, "h01sm");
            return (Criteria) this;
        }

        public Criteria andH01smNotBetween(String value1, String value2) {
            addCriterion("h01sm not between", value1, value2, "h01sm");
            return (Criteria) this;
        }

        public Criteria andI01IsNull() {
            addCriterion("i01 is null");
            return (Criteria) this;
        }

        public Criteria andI01IsNotNull() {
            addCriterion("i01 is not null");
            return (Criteria) this;
        }

        public Criteria andI01EqualTo(String value) {
            addCriterion("i01 =", value, "i01");
            return (Criteria) this;
        }

        public Criteria andI01NotEqualTo(String value) {
            addCriterion("i01 <>", value, "i01");
            return (Criteria) this;
        }

        public Criteria andI01GreaterThan(String value) {
            addCriterion("i01 >", value, "i01");
            return (Criteria) this;
        }

        public Criteria andI01GreaterThanOrEqualTo(String value) {
            addCriterion("i01 >=", value, "i01");
            return (Criteria) this;
        }

        public Criteria andI01LessThan(String value) {
            addCriterion("i01 <", value, "i01");
            return (Criteria) this;
        }

        public Criteria andI01LessThanOrEqualTo(String value) {
            addCriterion("i01 <=", value, "i01");
            return (Criteria) this;
        }

        public Criteria andI01Like(String value) {
            addCriterion("i01 like", value, "i01");
            return (Criteria) this;
        }

        public Criteria andI01NotLike(String value) {
            addCriterion("i01 not like", value, "i01");
            return (Criteria) this;
        }

        public Criteria andI01In(List<String> values) {
            addCriterion("i01 in", values, "i01");
            return (Criteria) this;
        }

        public Criteria andI01NotIn(List<String> values) {
            addCriterion("i01 not in", values, "i01");
            return (Criteria) this;
        }

        public Criteria andI01Between(String value1, String value2) {
            addCriterion("i01 between", value1, value2, "i01");
            return (Criteria) this;
        }

        public Criteria andI01NotBetween(String value1, String value2) {
            addCriterion("i01 not between", value1, value2, "i01");
            return (Criteria) this;
        }

        public Criteria andDatemonthIsNull() {
            addCriterion("dateMonth is null");
            return (Criteria) this;
        }

        public Criteria andDatemonthIsNotNull() {
            addCriterion("dateMonth is not null");
            return (Criteria) this;
        }

        public Criteria andDatemonthEqualTo(Date value) {
            addCriterion("dateMonth =", value, "datemonth");
            return (Criteria) this;
        }

        public Criteria andDatemonthNotEqualTo(Date value) {
            addCriterion("dateMonth <>", value, "datemonth");
            return (Criteria) this;
        }

        public Criteria andDatemonthGreaterThan(Date value) {
            addCriterion("dateMonth >", value, "datemonth");
            return (Criteria) this;
        }

        public Criteria andDatemonthGreaterThanOrEqualTo(Date value) {
            addCriterion("dateMonth >=", value, "datemonth");
            return (Criteria) this;
        }

        public Criteria andDatemonthLessThan(Date value) {
            addCriterion("dateMonth <", value, "datemonth");
            return (Criteria) this;
        }

        public Criteria andDatemonthLessThanOrEqualTo(Date value) {
            addCriterion("dateMonth <=", value, "datemonth");
            return (Criteria) this;
        }

        public Criteria andDatemonthIn(List<Date> values) {
            addCriterion("dateMonth in", values, "datemonth");
            return (Criteria) this;
        }

        public Criteria andDatemonthNotIn(List<Date> values) {
            addCriterion("dateMonth not in", values, "datemonth");
            return (Criteria) this;
        }

        public Criteria andDatemonthBetween(Date value1, Date value2) {
            addCriterion("dateMonth between", value1, value2, "datemonth");
            return (Criteria) this;
        }

        public Criteria andDatemonthNotBetween(Date value1, Date value2) {
            addCriterion("dateMonth not between", value1, value2, "datemonth");
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