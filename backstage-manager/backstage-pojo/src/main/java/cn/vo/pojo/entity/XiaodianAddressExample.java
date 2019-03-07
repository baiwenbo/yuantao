package cn.vo.pojo.entity;

import java.util.ArrayList;
import java.util.List;

public class XiaodianAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XiaodianAddressExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYetaiIsNull() {
            addCriterion("yetai is null");
            return (Criteria) this;
        }

        public Criteria andYetaiIsNotNull() {
            addCriterion("yetai is not null");
            return (Criteria) this;
        }

        public Criteria andYetaiEqualTo(String value) {
            addCriterion("yetai =", value, "yetai");
            return (Criteria) this;
        }

        public Criteria andYetaiNotEqualTo(String value) {
            addCriterion("yetai <>", value, "yetai");
            return (Criteria) this;
        }

        public Criteria andYetaiGreaterThan(String value) {
            addCriterion("yetai >", value, "yetai");
            return (Criteria) this;
        }

        public Criteria andYetaiGreaterThanOrEqualTo(String value) {
            addCriterion("yetai >=", value, "yetai");
            return (Criteria) this;
        }

        public Criteria andYetaiLessThan(String value) {
            addCriterion("yetai <", value, "yetai");
            return (Criteria) this;
        }

        public Criteria andYetaiLessThanOrEqualTo(String value) {
            addCriterion("yetai <=", value, "yetai");
            return (Criteria) this;
        }

        public Criteria andYetaiLike(String value) {
            addCriterion("yetai like", value, "yetai");
            return (Criteria) this;
        }

        public Criteria andYetaiNotLike(String value) {
            addCriterion("yetai not like", value, "yetai");
            return (Criteria) this;
        }

        public Criteria andYetaiIn(List<String> values) {
            addCriterion("yetai in", values, "yetai");
            return (Criteria) this;
        }

        public Criteria andYetaiNotIn(List<String> values) {
            addCriterion("yetai not in", values, "yetai");
            return (Criteria) this;
        }

        public Criteria andYetaiBetween(String value1, String value2) {
            addCriterion("yetai between", value1, value2, "yetai");
            return (Criteria) this;
        }

        public Criteria andYetaiNotBetween(String value1, String value2) {
            addCriterion("yetai not between", value1, value2, "yetai");
            return (Criteria) this;
        }

        public Criteria andPianquIsNull() {
            addCriterion("pianqu is null");
            return (Criteria) this;
        }

        public Criteria andPianquIsNotNull() {
            addCriterion("pianqu is not null");
            return (Criteria) this;
        }

        public Criteria andPianquEqualTo(String value) {
            addCriterion("pianqu =", value, "pianqu");
            return (Criteria) this;
        }

        public Criteria andPianquNotEqualTo(String value) {
            addCriterion("pianqu <>", value, "pianqu");
            return (Criteria) this;
        }

        public Criteria andPianquGreaterThan(String value) {
            addCriterion("pianqu >", value, "pianqu");
            return (Criteria) this;
        }

        public Criteria andPianquGreaterThanOrEqualTo(String value) {
            addCriterion("pianqu >=", value, "pianqu");
            return (Criteria) this;
        }

        public Criteria andPianquLessThan(String value) {
            addCriterion("pianqu <", value, "pianqu");
            return (Criteria) this;
        }

        public Criteria andPianquLessThanOrEqualTo(String value) {
            addCriterion("pianqu <=", value, "pianqu");
            return (Criteria) this;
        }

        public Criteria andPianquLike(String value) {
            addCriterion("pianqu like", value, "pianqu");
            return (Criteria) this;
        }

        public Criteria andPianquNotLike(String value) {
            addCriterion("pianqu not like", value, "pianqu");
            return (Criteria) this;
        }

        public Criteria andPianquIn(List<String> values) {
            addCriterion("pianqu in", values, "pianqu");
            return (Criteria) this;
        }

        public Criteria andPianquNotIn(List<String> values) {
            addCriterion("pianqu not in", values, "pianqu");
            return (Criteria) this;
        }

        public Criteria andPianquBetween(String value1, String value2) {
            addCriterion("pianqu between", value1, value2, "pianqu");
            return (Criteria) this;
        }

        public Criteria andPianquNotBetween(String value1, String value2) {
            addCriterion("pianqu not between", value1, value2, "pianqu");
            return (Criteria) this;
        }

        public Criteria andDaquIsNull() {
            addCriterion("daqu is null");
            return (Criteria) this;
        }

        public Criteria andDaquIsNotNull() {
            addCriterion("daqu is not null");
            return (Criteria) this;
        }

        public Criteria andDaquEqualTo(String value) {
            addCriterion("daqu =", value, "daqu");
            return (Criteria) this;
        }

        public Criteria andDaquNotEqualTo(String value) {
            addCriterion("daqu <>", value, "daqu");
            return (Criteria) this;
        }

        public Criteria andDaquGreaterThan(String value) {
            addCriterion("daqu >", value, "daqu");
            return (Criteria) this;
        }

        public Criteria andDaquGreaterThanOrEqualTo(String value) {
            addCriterion("daqu >=", value, "daqu");
            return (Criteria) this;
        }

        public Criteria andDaquLessThan(String value) {
            addCriterion("daqu <", value, "daqu");
            return (Criteria) this;
        }

        public Criteria andDaquLessThanOrEqualTo(String value) {
            addCriterion("daqu <=", value, "daqu");
            return (Criteria) this;
        }

        public Criteria andDaquLike(String value) {
            addCriterion("daqu like", value, "daqu");
            return (Criteria) this;
        }

        public Criteria andDaquNotLike(String value) {
            addCriterion("daqu not like", value, "daqu");
            return (Criteria) this;
        }

        public Criteria andDaquIn(List<String> values) {
            addCriterion("daqu in", values, "daqu");
            return (Criteria) this;
        }

        public Criteria andDaquNotIn(List<String> values) {
            addCriterion("daqu not in", values, "daqu");
            return (Criteria) this;
        }

        public Criteria andDaquBetween(String value1, String value2) {
            addCriterion("daqu between", value1, value2, "daqu");
            return (Criteria) this;
        }

        public Criteria andDaquNotBetween(String value1, String value2) {
            addCriterion("daqu not between", value1, value2, "daqu");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andRedundance1IsNull() {
            addCriterion("redundance1 is null");
            return (Criteria) this;
        }

        public Criteria andRedundance1IsNotNull() {
            addCriterion("redundance1 is not null");
            return (Criteria) this;
        }

        public Criteria andRedundance1EqualTo(String value) {
            addCriterion("redundance1 =", value, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance1NotEqualTo(String value) {
            addCriterion("redundance1 <>", value, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance1GreaterThan(String value) {
            addCriterion("redundance1 >", value, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance1GreaterThanOrEqualTo(String value) {
            addCriterion("redundance1 >=", value, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance1LessThan(String value) {
            addCriterion("redundance1 <", value, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance1LessThanOrEqualTo(String value) {
            addCriterion("redundance1 <=", value, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance1Like(String value) {
            addCriterion("redundance1 like", value, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance1NotLike(String value) {
            addCriterion("redundance1 not like", value, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance1In(List<String> values) {
            addCriterion("redundance1 in", values, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance1NotIn(List<String> values) {
            addCriterion("redundance1 not in", values, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance1Between(String value1, String value2) {
            addCriterion("redundance1 between", value1, value2, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance1NotBetween(String value1, String value2) {
            addCriterion("redundance1 not between", value1, value2, "redundance1");
            return (Criteria) this;
        }

        public Criteria andRedundance2IsNull() {
            addCriterion("redundance2 is null");
            return (Criteria) this;
        }

        public Criteria andRedundance2IsNotNull() {
            addCriterion("redundance2 is not null");
            return (Criteria) this;
        }

        public Criteria andRedundance2EqualTo(String value) {
            addCriterion("redundance2 =", value, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance2NotEqualTo(String value) {
            addCriterion("redundance2 <>", value, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance2GreaterThan(String value) {
            addCriterion("redundance2 >", value, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance2GreaterThanOrEqualTo(String value) {
            addCriterion("redundance2 >=", value, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance2LessThan(String value) {
            addCriterion("redundance2 <", value, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance2LessThanOrEqualTo(String value) {
            addCriterion("redundance2 <=", value, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance2Like(String value) {
            addCriterion("redundance2 like", value, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance2NotLike(String value) {
            addCriterion("redundance2 not like", value, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance2In(List<String> values) {
            addCriterion("redundance2 in", values, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance2NotIn(List<String> values) {
            addCriterion("redundance2 not in", values, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance2Between(String value1, String value2) {
            addCriterion("redundance2 between", value1, value2, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance2NotBetween(String value1, String value2) {
            addCriterion("redundance2 not between", value1, value2, "redundance2");
            return (Criteria) this;
        }

        public Criteria andRedundance3IsNull() {
            addCriterion("redundance3 is null");
            return (Criteria) this;
        }

        public Criteria andRedundance3IsNotNull() {
            addCriterion("redundance3 is not null");
            return (Criteria) this;
        }

        public Criteria andRedundance3EqualTo(String value) {
            addCriterion("redundance3 =", value, "redundance3");
            return (Criteria) this;
        }

        public Criteria andRedundance3NotEqualTo(String value) {
            addCriterion("redundance3 <>", value, "redundance3");
            return (Criteria) this;
        }

        public Criteria andRedundance3GreaterThan(String value) {
            addCriterion("redundance3 >", value, "redundance3");
            return (Criteria) this;
        }

        public Criteria andRedundance3GreaterThanOrEqualTo(String value) {
            addCriterion("redundance3 >=", value, "redundance3");
            return (Criteria) this;
        }

        public Criteria andRedundance3LessThan(String value) {
            addCriterion("redundance3 <", value, "redundance3");
            return (Criteria) this;
        }

        public Criteria andRedundance3LessThanOrEqualTo(String value) {
            addCriterion("redundance3 <=", value, "redundance3");
            return (Criteria) this;
        }

        public Criteria andRedundance3Like(String value) {
            addCriterion("redundance3 like", value, "redundance3");
            return (Criteria) this;
        }

        public Criteria andRedundance3NotLike(String value) {
            addCriterion("redundance3 not like", value, "redundance3");
            return (Criteria) this;
        }

        public Criteria andRedundance3In(List<String> values) {
            addCriterion("redundance3 in", values, "redundance3");
            return (Criteria) this;
        }

        public Criteria andRedundance3NotIn(List<String> values) {
            addCriterion("redundance3 not in", values, "redundance3");
            return (Criteria) this;
        }

        public Criteria andRedundance3Between(String value1, String value2) {
            addCriterion("redundance3 between", value1, value2, "redundance3");
            return (Criteria) this;
        }

        public Criteria andRedundance3NotBetween(String value1, String value2) {
            addCriterion("redundance3 not between", value1, value2, "redundance3");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNull() {
            addCriterion("disabled is null");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNotNull() {
            addCriterion("disabled is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledEqualTo(Integer value) {
            addCriterion("disabled =", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotEqualTo(Integer value) {
            addCriterion("disabled <>", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThan(Integer value) {
            addCriterion("disabled >", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("disabled >=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThan(Integer value) {
            addCriterion("disabled <", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThanOrEqualTo(Integer value) {
            addCriterion("disabled <=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledIn(List<Integer> values) {
            addCriterion("disabled in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotIn(List<Integer> values) {
            addCriterion("disabled not in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledBetween(Integer value1, Integer value2) {
            addCriterion("disabled between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotBetween(Integer value1, Integer value2) {
            addCriterion("disabled not between", value1, value2, "disabled");
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